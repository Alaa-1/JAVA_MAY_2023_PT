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
<h1>Create Book</h1>
<hr />
		
		<form action="/processForm" method="POST">
			title: <input name="title" /> <br />
			description: <input name="description" /> <br />
			language: <input name="language" /> <br />
			numberOfPages: <input type="number" name="numberOfPages" /> <br />
			
			<button>sumbit</button>
		</form>

</div>
</body>
</html>