<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/files/css/style.css">
</head>
<body>
<h4 align="center">Add User Info</h4>
<hr/>
<form:form action="addUser" modelAttribute="user">
Name: <form:input path="username"/><p/>
	  <form:errors path="username" cssStyle="color:red"/><p/>
Password: <form:password path="password"/><p/>
First Name: <form:input path="first_name"/><p/>
Last Name: <form:input path="last_name"/><p/>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>