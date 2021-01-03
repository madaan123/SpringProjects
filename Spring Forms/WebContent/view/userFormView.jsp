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
<h4 align="center">Submit Your Info</h4>
<hr/>
<form:form action="displayUserInfo" modelAttribute="user">
Name: <form:input path="name"/><br/><br/>
Gender: Male<form:radiobutton path="gender" value="Male"/>
		Female <form:radiobutton path="gender" value="Female"/>
<br/><br/>
Country: <form:select path="country">
		 <form:option value="India"/>
		 <form:option value="USA"/>
		 <form:option value="Russia"/>
		 <form:option value="Germany"/>
	     </form:select> <br/><br/>
Introduction: <form:textarea path="introduction"/> <br/><br/>
Countries Visited: 
China <form:checkbox path="countryVisited" value="China"/>
Italy <form:checkbox path="countryVisited" value="Italy"/>
Spain <form:checkbox path="countryVisited" value="Spain"/> <br/><br/>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>