delimiter $$
create procedure p_add(v1 int, v2 int, out ans int)
begin
	set ans = v1 +v2;
end $$
delimiter ;

set @ans = null;
call p_add(4,6,@ans);
select @ans;