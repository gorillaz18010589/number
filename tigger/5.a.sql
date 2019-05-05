-- drop procedure p_name;

delimiter $$
create procedure p_name(location nvarchar(20), out n int)
begin
	select count(*) into n  from vw_user where address like concat( '',location,'%');
	create temporary table tmp_aaa select * from vw_user where address like concat( '',location,'%');
end $$
delimiter ;


call p_name('台中市',@count);
select * from tmp_aaa;
drop temporary table tmp_aaa;
