<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%-- 本來82號因該出樂透,但因為某種邏輯直接forwad 83,但url是看到82 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Brad Big Company</h1>
<%
	int test1 = (int)(Math.random()*49+1); //產生樂透號碼
	out.print(test1 + "<br>");
	
	request.setAttribute("test1", test1);//把這招出樂透用屬性方式掛上request,這樣別的頁面也能用
		
//	response.sendRedirect("brad83.jsp"); //已經response 做完,才過去83
	request.getRequestDispatcher("brad83.jsp").forward(request, response); //拿到要求交給他繼續處理
//	request.getRequestDispatcher("brad83.jsp").include(request, response); //inclde加進來,再跑自己頁面
%>


</body>
</html>