-- drop procedure p_name;

delimiter $$
create procedure p_name(location nvarchar(20), out n int)
begin
	select count(*) into n  from vw_user where address like concat( '',location,'%');
	select * from vw_user where address like concat( '',location,'%');
end $$
delimiter ;

set @count = -1; -- 區別錯誤結果不是0
call p_name('台中市',@count);
select @count;

