select now();  -- 現在時間
select adddate(now(),5); -- 現在時間在(增加5天)
select adddate(now(),interval 1 hour); -- 現在時間(加1小時)
select datediff(now(),"2019/1/1 0:0:0");  -- 現在時間跟2019/1/1 0:0:0差了117天
select date_format(now(), '%Y年%c月%e日');  -- 日期方式排列
select date_format(now(),'%a');   -- %a =sun
select utc_time(); -- 格林威治時間