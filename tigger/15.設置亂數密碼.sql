-- drop procedure p_initpwd;
delimiter $$
create procedure p_initpwd() -- 創建一個資料夾 
begin
	declare done bool default false;
    declare tmp_pwd varchar(20);
    declare tmp_uid varchar(20);
    declare curs cursor for select uid, pwd from userinfo where pwd ='' or pwd is null; -- 當你的pwd是空的或是null開始執行
    declare continue handler for not found set done = true; 
    
    open curs;
    fetch curs into tmp_uid, tmp_pwd;
    while not done do  -- 等於false代表執行
		set tmp_pwd = right(cast(rand()as char),4); -- rand算出亂數 cast轉成字串 別名char 抓出亂碼右邊的4個字
        update userinfo set pwd = tmp_pwd where uid = tmp_uid; -- 修改 舊密碼等於新密碼
        fetch curs into tmp_uid,tmp_pwd; -- 到此行在重抓第二項再重複抓直到結束
	end while;
    close curs;
end $$
delimiter ;

call p_initpwd();
select *from userinfo;

