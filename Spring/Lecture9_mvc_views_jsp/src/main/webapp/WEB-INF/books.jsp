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
<h1>List of Books</h1>
<a href="/books/create" class="btn btn-primary">Create a Book</a>
<table class="table">
<thead>
<tr>
<td>#</td>
<td>Title</td>
<td>Language</td>
<td># Pages</td>
<td>Description</td>
<td>Actions</td>
</tr>
</thead>
<tbody>
<c:forEach items="${bookList}" var="oneBook">

<tr>
<td>${oneBook.id}</td>
<td><a href="/books/${oneBook.id }">${oneBook.title}</a></td>
<td>${oneBook.language}</td>
<td>${oneBook.numberOfPages}</td>
<td>${oneBook.description}</td>
<td><a href="/books/${oneBook.id }/edit">Edit</a>| 
<form action="/books/${oneBook.id}/delete" method="post">
<input type="hidden" name="_method" value="delete">
<button>Delete</button>
</form>
</td>
</tr>

</c:forEach>
</tbody>
</table>
</div>
</body>
</html>