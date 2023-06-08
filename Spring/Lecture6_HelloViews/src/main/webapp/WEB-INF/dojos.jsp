<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Le JAVA</title>
</head>
<body>
<h1>DOJOS</h1>
<hr />

<%-- <t:out value="${dojosList }"/> --%>

<ul>
<t:forEach items="${dojosList}" var="one_dojo">
<li> <t:out value="${one_dojo }"/> </li>
</t:forEach>

${ dojosList}

</ul>

</body>
</html>