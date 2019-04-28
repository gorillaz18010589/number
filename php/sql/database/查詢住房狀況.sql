
use addressbook
select house.hid,address,ifnull(n,0)as '住房狀況'
from(
	select hid,count(*)as n
    from live
    group by hid
    )as a right join house on a.hid = house.hid
    order by n desc
    
    
