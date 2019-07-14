<%@page import="java.util.Properties"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@page import="java.sql.*" %>
<%@page import="com.berry.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:catch var="errMesg">
<%
	String passwd2=BCrypt.hashpw("123456", BCrypt.gensalt()); 
	
	//傳統式jsp載入資料
	Class.forName("com.mysql.cj.jdbc.Driver");
	Properties prop = new Properties();
	prop.put("user", "root"); //輸入帳號
	prop.put("password", "root");
	prop.put("serverTimezone", "Asia/Taipei");
	
	Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3307/iii", prop);
	
	String sql = 
			"INSERT INTO member (account,passwd,realname) VALUES (?,?,?)";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, "AMY");
	pstmt.setString(2,passwd2);
	pstmt.setString(3, "AMY Chao");
	int count = pstmt.executeUpdate();
%>
</c:catch>
<c:if test="${errMesg != null}">錯誤</c:if>
</body>
</html>