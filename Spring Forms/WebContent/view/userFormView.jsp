<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User form</title>
</head>
<body>
<form:form action="displayUserInfo" modelAttribute="user">
Name: <form:input path="name"/><br/>
Gender: <form:radiobuttons path="gender" items="${genderMap}"/><br/>
Country: <form:select path="country">
		 <form:options items="${countryMap}"/>
	     </form:select> <br/>
Introduction: <form:textarea path="introduction"/> <br/>
Countries Visited: 
China <form:checkbox path="countryVisited" value="China"/>
Italy <form:checkbox path="countryVisited" value="Italy"/>
Spain <form:checkbox path="countryVisited" value="Spain"/> <br/>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>