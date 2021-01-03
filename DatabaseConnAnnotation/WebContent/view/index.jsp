<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User form</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/files/css/style.css">
</head>
<body>
<h3>Hello</h3>
<table border="1">
<tr>
<th>User ID</th>
<th>Username</th>
<th>Password</th>
<th>First name</th>
<th>Last name</th>
</tr>
<c:forEach items="${users}" var="user">
<tr>
<td>${user.user_id}</td>
<td>${user.username}</td>
<td>${user.password}</td>
<td>${user.first_name}</td>
<td>${user.last_name}</td>
</tr>
</c:forEach>
</table>
</body>
</html>