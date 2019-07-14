<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//10.0.105.82
	int a = 10;
%>
<%!
	int b =10 ; //<%! =>static方法
%>

b = <%= b++ %><br> <!-- 已經變成該類別的所以會一值增加 -->
a = <%= a++ %><br> <!-- 區域變數 -->
</body>
</html>