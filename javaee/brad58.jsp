<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!-- 
 	JSTL => jsp tag(標籤)
 	directive.page => @page的意思 (就是@)
 	<jsp:dclaration> => <括弧內式宣告區域>
 	就是不要讓你寫%
  -->   
  
 <jsp:directive.page import="tw.brad.beans.Member"/>
 
<jsp:useBean id="member" class="tw.brad.beans.Member"></jsp:useBean> 
<jsp:setProperty property="id" value="011" name="member"/> 
<jsp:setProperty property="name" value="Brad" name="member"/>
<jsp:declaration>
	int a;
	String name;
</jsp:declaration>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


Member = <jsp:expression>member</jsp:expression>>
</body>
</html>