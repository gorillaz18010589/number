<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="tw.brad.beans.BradAPIs" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test='${param.num =="100" }' var="result"><!-- test="放判斷式", ,true/false值存到result裡-->
Hello,world <br>
</c:if>  <!-- c:if內的html如果成立會出現hello,world -->

${result }<hr><!-- 顯示true false -->
<c:set var="score">${BradAPIs.toIntString(Math.random()*101) }</c:set><!-- 複雜邏輯交給api處理 -->
Score:${score }<br>
<%
 //choose 裡面放多重選擇判斷事
%>
<c:choose> 
	<c:when test='${score >=90 }'>A</c:when> 
	<c:when test='${score >=80 }'>B</c:when>
	<c:when test='${score >=70 }'>C</c:when>
	<c:when test='${score >=60 }'>D</c:when>
	<c:otherwise>E</c:otherwise>
</c:choose>






</body>
</html>