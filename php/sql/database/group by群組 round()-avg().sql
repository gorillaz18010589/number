use addressbook;

select tel, round(avg(fee),0) as '平均帳單金額'   -- round() (去小數點)  avg(參數) (算平均)
from bill
group by tel    -- 把電話號碼相同資料圈一圈