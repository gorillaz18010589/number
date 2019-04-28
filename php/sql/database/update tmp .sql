update tmp set cname ='王小毛';

-- 顯示安全機制 show variables like "%safe%"; 
--  關掉安全機制 set sql_safe_updates=0; 
select * from tmp;