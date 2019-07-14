
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
 //只要是用戶端的任何要求就是request
 	String method = request.getMethod();
	out.println(method + "<hr>");
	
	HttpServletRequest req =(HttpServletRequest) pageContext.getRequest();
	out.print(req == request);
	out.print("<br>");
	
	String remo = request.getRemoteAddr();
	out.print(remo +"<hr>");

	%>

</body>
</html>