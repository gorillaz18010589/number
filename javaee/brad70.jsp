<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage ="error.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<sql:setDataSource
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3307/cust?serverTimezone=Asia/Taipei"
	user="root"
	password="root"
/>
<%
//1.<<sql:query var="result">:裡面放查詢sql指令, var
//.result.rowCount= 查詢這個result物件實體的總比數
//select*from gift order by pname limit 10
%>


<sql:query var="rs1">
select * from gift
</sql:query>
<c:set var="page" value="${param.page == null ? 1 : param.page }" />
<c:set var="start" value="${(page - 1) * 10 }" />
<sql:query var="result">
select * from gift order by id limit ${start },10
</sql:query>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Count:${result.rowCount }<br>
<table border="1" width="100%">
	
	<tr>
		<th>id</th>
		<th>gid</th>
		<th>pname</th>
		<th>feature</th>
		<th>url</th>
	</tr>
	
	<c:forEach items="${result.rows }" var="row">
		<tr>
			<td>${row.gid }</td>
			<td>${row.pname }</td>
			<td>${row.feature }</td>
			<td>${row.url }</td>
			<td><img src='${row.url }' width='128px' height'128px'/></td>
		</tr>
	</c:forEach>
</table>


</body>
</html>