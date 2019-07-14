<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
	<sql:setDataSource
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3307/cust?serverTimezone=Asia/Taipei"
	user="root"
	password="root"
/>

<c:if test="${!empty param.delid }">
	<sql:update>
		DELETE FROM cust WHERE id = ?
		<sql:param>${param.delid }</sql:param>
	</sql:update>
</c:if>	

<!-- mysql查詢 -->
<sql:query var="result">
select * from cust
</sql:query>
<%
//1.設置html主畫面
//2.<a href="brad72.jsp">Add New</a> =>連接到brad72帳號登入畫面
//3.連結資料庫
//4.查詢資料
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>主畫面</title>
<title>Insert title here</title>
</head>
<body>
<h1>Brad Big Company</h1>
<hr>
<a href="brad72.jsp">Add New</a>
<hr>
<table border="1" width="100%">
	<tr>
		<th>id</th>
		<th>Name</th>
		<th>Phone</th>
		<th>Birthday</th>
		<th>Delete</th>
		<th>Edit</th>
	</tr>
	<c:forEach items="${result.rows }" var="row">
		<tr>
			<td>${row.id }</td>
			<td>${row.cname }</td>
			<td>${row.tel }</td>
			<td>${row.birthday }</td>
			<script>
				function confirmDelete(cname){
					return confirm("Delete " + cname + "?");
				}
			</script>
			<td>
				<a href='?delid=${row.id }' onclick="return confirmDelete('${row.cname }');">
					<button>Del</button>
				</a>
			</td>
			<td>
				<a href='brad73.jsp?editid=${row.id }'>
					<button>Edit</button>
				</a>
			</td>
		</tr>
	</c:forEach>
	
	
</table>


</body>
</html>