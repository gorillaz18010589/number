<%@page import="java.util.Date"%>
<%@page import="java.util.Locale"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%

//多國語系人稱i18n =>代表區域化跟,
//不同國家,語言,數字,時間的不同
//java.util.Locale =>api
//在WEB-INF底下創一個資料夾一定要叫classes
//在classes底下創res_en_US.properties :res(自訂)_en(英文)_us(國家)

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Locale locale = request.getLocale(); //由用戶端的地區得到一個國家區域物件實體
	
%>
Country:<%= locale.getCountry() %> <%--取得國家簡稱 --%><br>
Country:<%= locale.getDisplayCountry() %><%--取得國家名稱 --%><br>
Language:<%= locale.getLanguage() %><%--取得語言簡稱 --%>
<hr>
<fmt:setLocale value="zh_TW"/>   <%--設定中文語系 --%>
<fmt:setBundle basename="res"/>
<h1><fmt:message key="companyName"/></h1>
<fmt:message key="hello"/>, <fmt:message key="world"/> 
<hr>
<fmt:setLocale value="en_US"/>  <%--設定英文語系 --%>
<fmt:setBundle basename="res"/>
<h1><fmt:message key="companyName"/></h1>
<fmt:message key="hello"/>, <fmt:message key="world"/> 

<%-- 日期時間 --%>
<%
	 Date now = new Date();
	 out.print(now + "<hr>"); //顯示台灣時間
	 pageContext.setAttribute("now", now);
%>
	<%-- 日本東京時間 --%>
	日本東京時間:
<fmt:setTimeZone value="Asia/Tokyo"/>
<fmt:formatDate value="${now }" pattern="yyyy-MM-dd HH:mm:ss"
	type="both" dateStyle="default"/>
<hr>

	<%-- 德國柏林時間 --%>
	德國柏林時間:
<fmt:setTimeZone value="Europe/Berlin"/>
<fmt:formatDate value="${now }" pattern="yyyy-MM-dd HH:mm:ss"
	type="both" dateStyle="default"/>
<hr>


	<%-- 美國洛杉磯時間 --%>
	美國洛杉磯時間:
<fmt:setTimeZone value="America/Los Angeles"/>
<fmt:formatDate value="${now }" pattern="yyyy-MM-dd HH:mm:ss"
	type="both" dateStyle="default"/>
<hr>

	<%-- 貨幣--%>
<fmt:formatNumber value="12346789.123456789" 
	/>


</body>
</html>