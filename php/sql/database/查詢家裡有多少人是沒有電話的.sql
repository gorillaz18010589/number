use addressbook;

select * from userinfo;
select * from live;




select  count(*)  -- 列出裡面的筆數
from 
userinfo left join live on   -- userinfo資料加入到live
	userinfo.uid = live.uid  -- 因為live =house =phone
left join phone on
	live.hid = phone.hid      -- 所以直接從live接到phone
		 where tel is null     -- 查詢所有連接裡面電話是空的人
		


