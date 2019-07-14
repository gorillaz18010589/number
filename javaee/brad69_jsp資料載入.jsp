<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage ="error.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%
	//1.設置這個sql<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" 
	//2.sql:setDataSource => 設定登入設定
	//3.var = "conn" =>取得這次的連線,宣告為conn
	//4.<sql:update >=> 增刪修sql指令
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:catch var="erroe">

<sql:setDataSource
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3307/iii?serverTimezone=Asia/Taipei"
	user="root"
	password="root"
/>

<sql:update >

insert into member(account,passwd,realname) values('kidd','888','kidd')

</sql:update>
</c:catch>
</body>
</html>