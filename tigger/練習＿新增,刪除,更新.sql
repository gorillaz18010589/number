use addressbook;
select * from userinfo;
select * from log;

insert into userinfo (uid, cname,PWD) values ('T04','王力宏','Addd3a');
delete from userinfo 
where uid='T03';
update userinfo set 
	cname = '梁朝偉'
where uid = 'T04';
