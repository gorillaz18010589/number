delimiter $$
create procedure p_login (u varchar(20),p varchar(40),out isOK bool) -- is OK bool回傳值
begin
	select count(*)into isOk from userinfo where uid = u and pwd =p;
end $$
delimiter ;

set @isOk =false;
call p_login('A01','1234',@isOK);
select@isOK;