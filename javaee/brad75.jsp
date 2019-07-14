<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ page import="org.json.*" %>
 <%
 //農委會opendata
 //<c:import var="data" uel=""/> ://import 別人網頁
 //灌入json後  小吃名稱,電話,HostWords
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:import var="data" url="http://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelFood.aspx"/>
<%
	//上面的import已經把所有的url灌到 var= data裡了
		String strData = (String)pageContext.getAttribute("data");
		out.print(strData);
%>
</body>
</html>