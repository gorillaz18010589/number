<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>我是標題</title>
</head>
<body>

<h1>Brad Big Compnay</h1>
<hr>
<%  
	//<% 內寫的java其實已經把你編譯成severse了,所以直接值重新整理網頁就好,不用重開server
	int a =10, b =3;
	out.print(a / b + "<br>"); //out你早就有了,直接叫,因為當你來到這頁面resqpne早就輸出了,這個頁面早就設定好了
	
	//出樂透
	int lottery = (int)(Math.random()*49+1); //樂透49個號碼
	
	//顯示時間
	int year = Calendar.getInstance().get(Calendar.YEAR);
	int month = Calendar.getInstance().get(Calendar.MONTH)+1;
	int day= Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	String newDate = year +":" + month +":" + day;
%>
顯示時間:<%= newDate%><br>
這期要出幾號:<% out.print(lottery); %><br> <!-- html+java -->
這期要出:<%= lottery %> <br> <!-- html+java簡單寫法 -->
</body>
</html>