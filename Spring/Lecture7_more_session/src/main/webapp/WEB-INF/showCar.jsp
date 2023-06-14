<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Le JAVA</title>
</head>
<body>
<div class="container">
<h1>Display Info</h1>
<p style="color:green">${success }</p>
<br />
make: ${keyMake } <br>
model : ${keyModel }<br>

<c:if test="${keyYear > 2023 }">
<p>This is not in production yet !!</p>
</c:if>

c:

year: ${keyYear }<br>
color: ${keyColor }<br>
</div>
</body>
</html>