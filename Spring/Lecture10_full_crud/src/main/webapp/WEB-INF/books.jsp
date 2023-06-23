<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   <div class="container">
   <h1>All Books 📚</h1>
   <hr />
   <table class="table">
   <thead class= "thead-dark">
   <tr>
   <td>ID</td>
   <td>Title</td>
   <td>Author</td>
   <td># of pages</td>
   <td>Actions</td>
   </tr>
   </thead>
   
   <tbody>
   <c:forEach items="${bookList }" var="oneBook">
   <tr>
   <td>${oneBook.id}</td>
   <td>${oneBook.title}</td>
   <td>${oneBook.author}</td>
   <td>${oneBook.pages}</td>
   <td><a href="/edit/${oneBook.id }">edit</a> |
   
   <form action="/books/${oneBook.id}" method="post">
	<input type="hidden" name="_method" value="delete"> 
	<input type="submit" value="Delete">
	</form>
	</td>
   </tr>
   </c:forEach>
   </tbody>
   </table>
   
   <hr />
   <h1>New Book</h1>
   
   
   <form:form action="/books" method="post" modelAttribute="book">
   <form:errors path="*"/>
    <p>
    
     Title: <form:input path="title"/>

    </p>
     <p>
    
     Author: <form:input path="author"/>
     

    </p>
    <p>
        
        # of pages: <form:input type="number" path="pages"/>
    </p>    
    
    <button>Create</button>
</form:form>    
   
   </div>
</body>
</html>