<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${user.name}
<br/>
${user.gender}
<br/>
${user.country }
<br/>
${user.introduction }
<br/>
<c:forEach var="item" items="${user.countryVisited}">
${item}
</c:forEach>
</body>
</html>