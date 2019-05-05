-- drop procedure f_add;

delimiter $$
create function f_add(v1 int, v2 int) returns int
begin
	return v1 +v2;
end$$
delimiter ;

select f_add(5,3);

set global log_bin_trust_function_creators=1;  -- 安全機制