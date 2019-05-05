-- drop procedure pro_test;
delimiter $$

create procedure pro_test()
begin
	declare done int default false;   -- 宣告一個 done為false
    declare tmp_fee int;              -- 宣告 tmp_fee 為int屬性
    declare total int default 0;	  -- 宣告total 屬性為int 為0
    declare curs cursor for select fee from bill;  -- 宣告一個curs從bill資料夾 裡的fee指向某個查詢
    declare continue handler for not found set done = true;  -- 宣告上面的帳單找不到的set done為true時停止
    
    open curs; -- 開始動作
    fetch curs into tmp_fee; -- 開始抓資料
    
    while not done do  -- 一開始not done為false 代表還有項目開始工作
		set total = total +tmp_fee; -- 第一筆的 total為0 +上第一筆的 tmp_fee 250 = total
        fetch curs into tmp_fee;  -- 抓第二筆的資料進去裡面跑 等於 300
	end while;
    
    close curs;
    select total;
end $$
    
delimiter ;

call pro_test();
select *from bill;