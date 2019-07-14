<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
//參數的東西隱含物件
//連接43號html

	String name = request.getParameter("name"); //取得name的參數
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
歡迎,<%= name %>
</body>
</html>