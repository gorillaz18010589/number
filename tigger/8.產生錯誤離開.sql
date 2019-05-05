drop procedure p_name;

delimiter $$
create procedure p_adduser(uid varchar(20),cname nvarchar(40))
begin
	declare exit handler for sqlexception select 'ERROR';
	insert into userinfo (uid, cname)values(uid,cname);
end $$
delimiter ;

call p_adduser('A01','OOXX');
select*from userinfo;