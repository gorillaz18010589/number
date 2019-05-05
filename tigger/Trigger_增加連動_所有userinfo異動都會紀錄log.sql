use addressbook;

-- 完整移除 drop
drop trigger tr_userinfo_insert;
drop trigger tr_userinfo_delete;
drop trigger tr_userinfo_update;

delimiter $$
create trigger tr_userinfo_insert
after insert
on userinfo for each row
begin 
	set @uid = new.uid;
    -- 在mysql裡面，用set去設定變數，變數前面必須有@符號
    set @cname = new.cname;
    
    -- 在mysql裡面要把兩個字串連在一起，需要用 concat(參數：要連在一起的字串) 將字串用 ，符號分開。 與JS用+號把字串連接方式不同
    set @s = concat('Userinfo插入了一筆 ',@uid,' ',@cname,' ',' 的資料');
	insert into log (body) values (@s);
end $$

delimiter $$
create trigger tr_userinfo_delete
after delete
on userinfo for each row
begin 
	set @uid = old.uid;
    set @cname = old.cname;
    set @s = concat('Userinfo刪除了一筆 ',@uid,' ',@cname,' ',' 的資料');
	insert into log (body) values (@s);
end $$

delimiter $$
create trigger tr_userinfo_update
after update
on userinfo for each row
begin 
	set @uidn = new.uid;
    set @cnamen = new.cname;
	set @uido = old.uid;
    set @cnameo = old.cname;
    set @s = concat('Userinfo修改資料 ',@uido,' TO ',@uidn,' ',@cnameo,' TO ',@cnamen);
	insert into log (body) values (@s);
end $$

delimiter ;