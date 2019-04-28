use addressbook;

select * from userinfo;
select * from live;
select * from live;

select *
from userinfo left join live on
userinfo.uid = live.uid 
left join house on
live.hid = house.hid;


