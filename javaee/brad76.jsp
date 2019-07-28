<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%--
Jsp_function:https://docs.oracle.com/javaee/5/jstl/1.1/docs/tlddocs/fn/tld-summary.html
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="var1" value="Hello,World"/> <%-- 宣告變數 --%>
<c:if test='${fn:contains(var1,old) }'> <%-- 叫出api var1是否包含old字串有的話印出有 --%>
var1裡面含有old字串
</c:if>
<hr>
<%
	String var1 = (String) pageContext.getAttribute("var1");
	if(var1.contains("orl")){
		out.println("這是java方式,有包含");
	}
%>
</body>
</html>