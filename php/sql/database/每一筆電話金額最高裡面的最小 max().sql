use addressbook;

select a.tel,max_fee,dd
from(
	select tel,max(fee)as max_fee
	from bill
	group by tel
) as a, bill
where a.tel =bill.tel and a.max_fee = bill.fee  
order by max_fee
limit 1




