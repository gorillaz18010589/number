delete from tmp where uid = 'CO1';  -- 刪除單獨資料
select * from tmp;

truncate table tmp ;   -- 一次刪掉整個資料夾 速度比較快

select * from tmp;