<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String[] names = {"Brad","Amy","Perter","Tony","Kevic","AAA","BBB","CCC"};
	pageContext.setAttribute("names",names);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1" width="100%">
		<tr>
			<th>Name</th>
		</tr>
		<c:forEach items="${names  }" var="name" varStatus="status">
			<tr bgcolor="
			<c:choose>
			<c:when test="${status.count %2 ==0 }">yellow</c:when>
			<c:otherwise>pink</c:otherwise>
			</c:choose>
			">
				<td>${status.index}</td>
				<td>${name}</td>
				<td>${status.count}</td>
				<td>${status.first }</td>
				<td>${status.last }</td>
			
			</tr>
		</c:forEach>
</table>
<% 
// begin="1"  end="6" step="2" 從1開始,結束在6,一次跳2個
//<c:forEach: items="尋訪的物件"   var="尋訪後的物件存放位置"

	//頭宏偉黃 中間恢
	//	<c:when test="${status.first }">yellow</c:when>
	//	<c:when test="${status.last }">pink</c:when>
	//<c:otherwise>Lightgray</c:otherwise>
%>

</body>
</html>