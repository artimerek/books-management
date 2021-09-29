<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>List of books</title>
	

		 		  
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
		  
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h3>Your book's manager</h3>
	</div>
	</div>
	
	<div id="container">
		<div id="content">
			<table class="list">
				<tr>
					<th> Title </th>
					<th> Author </th>
					<th> Year of release </th>
					<th> <th>
				</tr>
				
				<c:forEach var="book" items="${books}">
					<c:url var ="updateLink" value ="/book/showUpdateForm">
						<c:param name="bookId" value="${book.id}" />
					</c:url>
					<c:url var ="deleteLink" value ="/book/delete">
						<c:param name="bookId" value="${book.id}" />
					</c:url>
					
					<tr>
						<td> ${book.title} </td>
						<td> ${book.author} </td>
						<td> ${book.year} </td>
						<td><a href="${updateLink}">Update</a></td>
						<td><a href="${deleteLink}" onclick="if (!(confirm('Delete that book?'))) return false">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
			<br>
			<input type="button" value="Add Book" onclick="window.location.href='showAddBookForm'; return false;"
			class="add-button" />
		</div>
		<form:form action="${pageContext.request.contextPath}/logout" method="post">
			<input type="submit" value="Logout" class="add-button">
		</form:form>
	</div>
</body>
</html>