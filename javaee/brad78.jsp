<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/mytags.tld" prefix="iii" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Brad Big Company</h1>
<iii:HelloBrad/>
<hr>
<iii:tag2>
abcdefg<br>
Abcdefg<br>
1234567
</iii:tag2>
<br>
<iii:tag3 name="item1" price="100">
配合屬性跟body
</iii:tag3>
<br>
<iii:tag3 name="apple" price="2000">
</iii:tag3>

</body>
</html>