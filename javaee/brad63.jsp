<%@page import="java.util.HashMap"%>
<%@page import="java.util.LinkedList"%>
<%@page import="tw.brad.beans.BradAPIs"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//$就是er
	//page=>reqest=>session=>appiction
	//一樣都叫usernames 卻顯示var1,因為 page比較靠近所以先用,其他隱藏
	String[] var1 = {"value1","value2","value3","value4","value5","value6"};
//	pageContext.setAttribute("var1", var1);
	pageContext.setAttribute("usernames", var1);
	String[] names ={"brad","kevin","perter","eric","andy","jeff"};
	request.setAttribute("usernames", names); //把這names陣列塞入usernames
	
	LinkedList<String> list = new LinkedList<>(); //有順序化的泛型
	list.add("AAA"); list.add("BBB"); list.add("CCC");
	request.setAttribute("list", list);
	
	HashMap<String,String> map = new HashMap<>();
	map.put("key1", "value1");
	map.put("key2", "value2");
	map.put("key3", "value3");
	request.setAttribute("map",map);
%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Username1: ${usernames[0]} <br>
Username2: ${usernames[4]} <br>
Var1:${var1[0]}<br>
Var2:${var1[4]}<br>
List1:${list[0]}<br>
List2:${param.i}<br>
Map1:${map.key1}<br>
Map2:${map["key3"]}<br>
Username:page:${pageScope.usernames[0]}<br>  <!-- 用page表現 -->
Username:reqest:${requestScope.usernames[0]}<br> <!-- 用request表現 -->
Lottery:<%=BradAPIs.createLottery()%><br>
Lottrty:${BradAPIs.createLottery()}<br>
${BradAPIs.sayYa(param.who) }<br>
${10+3 }<br>
${param.x} > ${param.y}=> ${param.x >param.y } <br><!-- x>Y 是否正確比較字串大小 -->
${(param.x == "10" ?"yes":"no") }<br> <!-- 參數使否等於10,等於10yes不是no -->
</body>
</html>