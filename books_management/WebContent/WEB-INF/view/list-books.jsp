<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
			<table>
				<tr>
					<th> Title </th>
					<th> Author </th>
					<th> Year of release </th>
				</tr>
				
				<c:forEach var="book" items="${books}">
					<tr>
						<td> ${book.title} </td>
						<td> ${book.author} </td>
						<td> ${book.year} </td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>