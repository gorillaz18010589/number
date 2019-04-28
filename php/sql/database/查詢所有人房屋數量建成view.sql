create view vw_housenumber as 
select userinfo.uid as'身分證字號' ,  ifnull(n,0) as '房屋數量'
from(
select uid,count(*) as n
from live 
group by uid   -- group by去掉相同資料
)  as a right join userinfo on 
	a.uid = userinfo.uid;