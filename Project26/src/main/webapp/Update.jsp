<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<%
		request.setAttribute("id",Integer.parseInt(request.getParameter("eid")));
	%>
	<form action="UpdateEmployee" method="post">
		<label>Emloyee id :</label><br>
		<input type="text" name ="eid" placeholder="Enter employee id" value="${ requestScope.id }"><br><br>
		<label>Hire date :</label><br>
		<input type="date" name="date"><br><br> 
		<label>Employee name :</label><br>
		<input type="text" name="ename" placeholder="Enter employee name"><br><br>
		<label>Employee salary : </label><br>
		<input type="text" name="salary" placeholder="Enter employee salary"><br><br>
		<label>Email : </label><br>
		<input type="email" name="email" placeholder="Enter employee email"><br><br>
		<label>Phone number : </label><br>
		<input type="text" name="phone" placeholder="Enter employee phone number"><br><br>
		<label>Password : </label><br>
		<input type="password" name = "pass" placeholder="Enter employee password"><br><br>
		<input type="submit" value="submit">
	</form>
</body>
</html>