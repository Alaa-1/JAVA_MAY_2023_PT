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
<h1>Form - CARS</h1>
<form action="/processCar" method="POST">
		make: <br />
		<input name="make" /> <br />
		<br />
		
		model: <br />
		<input name="model" /> <br />
		<br />
		
		year: <br />
		<input type="number" name="year" /> <br />
		<p style="color: red">${YearError }</p> 
		<br />
		
		color: <br />
		<input type="color" name="color" />
		
		<button>create car</button>

</form>
</body>
</html>