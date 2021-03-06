-- drop procedure p_adduser;

delimiter $$
create procedure p_adduser(uid varchar(20),cname nvarchar(40))
begin
	declare _rollback bool default false;   -- 一個rollback不林值為錯誤
	declare continue handler for sqlexception set _rollback = true; --  continue遇到錯誤繼續 
    start transaction;
		insert into userinfo (uid) values(uid1);
		insert into userinfo (uid) values(uid2);
        if _rollback then         
			select 'ERRORL rollback';
            rollback;
		else 
			select 'SUCCESS: commit';
            commit;
		end if;
end $$
delimiter ;

call p_adduser('L01','A01');
select*from userinfo;