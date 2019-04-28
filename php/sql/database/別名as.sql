use addressbook;
select a.uid as'身分證字號',cname as '姓名', address as'住址'
from userinfo as a, live as b,house as c
where a.uid = b.uid  and  b.hid = c.hid;

select count(*) as n
from userinfo;