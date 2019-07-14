    
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<% 
//1.建立使用者登錄表格
//2.連接資料庫
//3.新增mysql
//
//<sql:param>${param.cname }</sql:param> 搭配sql的?,?,?避開明碼攻擊
		
%>
	<!--連接資料庫 -->
<c:if test ="${!empty param.cname}">
	<sql:setDataSource
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3307/cust?serverTimezone=Asia/Taipei"
	user="root"
	password="root"
/>
<!-- 新增MYSQL -->
<sql:update var="count">
	INSERT INTO cust (cname,tel,birthday) VALUES (?,?,?)
	<sql:param>${param.cname }</sql:param>
	<sql:param>${param.tel }</sql:param>
	<sql:param>${param.birthday }</sql:param>
</sql:update>	


<c:redirect url="brad71.jsp"/>

</c:if>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增分頁</title>
<title>Insert title here</title>
</head>
<body>
<h2>Add new Customer</h2>
<hr>
<form action="brad72.jsp">
	Name: <input name="cname"><br>
	Phone: <input name="tel"><br>
	Birthday: <input name="birthday"><br>
	<input type="submit" value="Add" />
</form>

</body>
</html>