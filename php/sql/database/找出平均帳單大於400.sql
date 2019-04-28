use addressbook;
select * from bill;
select *
from(
select tel, round(avg(fee),0) as i
from bill
group by tel
) as a
where a.i >= 400;

select tel,round(avg(fee),0)as i
from bill
group by tel
having i >= 400;