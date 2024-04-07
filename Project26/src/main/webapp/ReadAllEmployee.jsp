<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.utility.EmployeeDao" %>
<%@ page import="com.model.Employee" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Employee</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<%
		EmployeeDao dao = new EmployeeDao();
		List<Employee> list = dao.getAllEmployee();
		request.setAttribute("list" ,list);
		
	%>
	<button><a href="index.html">Add Employee</a></button>
	<table class="content-table">
	<thead>
	<tr>
		<th>Employee id</th>
		<th>Employee name</th>
		<th>Employee salary</th>
		<th>Employee email</th>
		<th>Employee phone</th>
		<th>Employee password</th>
		<th>Delete</th>
		<th>Update</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="employee" items="${requestScope.list}">
		<tr>
			<td><c:out value="${employee.empid}"></c:out></td>
			<td><c:out value="${employee.empName}"></c:out></td>
			<td><c:out value="${employee.empSalary}"></c:out></td>
			<td><c:out value="${employee.empEmail}"></c:out></td>
			<td><c:out value="${employee.empPhoneNumber}"></c:out></td>
			<td><c:out value="${employee.empPassword}"></c:out></td>
			<td><button><a href='DeleteEmployee?eid=<c:out value="${ employee.empid }"></c:out>'>Delete</a></button></td>
			<td><button><a href='Update.jsp?eid=<c:out value="${ employee.empid }"></c:out>'>Update</a></button></td>
		</tr>
	</c:forEach>
	</tbody>
	</table>
</body>
</html>