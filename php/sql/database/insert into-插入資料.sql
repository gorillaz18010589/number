insert into userinfo values ('C03',null);  
select*from userinfo;    

insert into house (address) values ('屏東市中山路1號');
select * from house;

insert into tmp (uid,cname)
select uid, cname from userinfo;   -- 複製到tmp

select * from tmp;