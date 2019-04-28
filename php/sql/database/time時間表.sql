select now();  -- 現在時間
select adddate(now(),5); -- 現在時間在(增加5天)
select adddate(now(),interval 1 hour); -- 現在時間(加1小時)
select datediff(now(),"2019/1/1 0:0:0");  -- 現在時間跟2019/1/1 0:0:0差了117天
select date_format(now(), '%Y年%c月%e日');  -- 日期方式排列
select date_format(now(),'%a');   -- %a =sun
select utc_time(); -- 格林威治時間
select utc_timestamp(); -- 格林威治日期時間
select unix_timestamp(); -- 1970格林威治的秒數 全國通用 =epoch time 資料庫不開時間日期開int 放epoch time 時間一制
-- base64編碼 專門把mp3,jpg,影片用nopade++開出來亂碼的 叫2進位檔案轉成一個字串放進資料庫放入text屬性
SELECT from_unixtime(unix_timestamp());  -- 把epotime的檔案轉成現在時間

select *,unix_timestamp(dd)from bill; -- 把bill裡面的(dd)改成格林威治時間
select * from bill where dd between '2019/2/1' and  now(); -- beteen接日期 (2月1號到現在的時間日期印出來)