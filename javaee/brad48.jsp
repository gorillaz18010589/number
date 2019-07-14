<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("var1", "kevin");
	request.setAttribute("who","Brad");  //request是兩頁之間
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>官網</h1>
<hr>
<%@ include file="brad49.jsp"%> <!-- include 48,49是同一頁 -->
</hr>
</body>
</html>