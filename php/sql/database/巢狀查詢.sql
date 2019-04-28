use addressbook;   -- 巢狀查詢

-- select * from userinfo;
select lastname,count(*) as n    -- 把lastname變資料 查詢此資料印出幾筆別名叫n
from(
	select  left(cname,1)as lastname  -- 從裡面往外寫
	from userinfo
	where cname is not null and cname<>''  -- 查詢cname不是null的而且cname不是空字串的
	) as  a
	group by lastname     -- 結果是王的有2筆 