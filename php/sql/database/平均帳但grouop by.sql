use addressbook;

select bill.tel, round(avg(fee),0) as '平均帳單金額'  ,address  -- 因為tel 跟平均帳但是算出來 新增的,address也要算出來不然無法對應
from bill,phone,house
where bill.tel = phone.tel and phone.hid =house.hid
group by bill.tel,address  -- group by也要加address 兩方都是算出來