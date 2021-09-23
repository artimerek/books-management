<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adding new book</title>
	<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css" />
		
	<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/add-book-style.css" />
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Your book's manager</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Add Book</h3>
		<form:form action="addBook" modelAttribute="book" method="POST">
			
			<table>
				<tbody>
					<tr>
						<td><label>Title:</label></td>
						<td><form:input path="title"/> </td>
					</tr>
					<tr>
						<td><label>Author:</label></td>
						<td><form:input path="author"/> </td>
					</tr>
					<tr>
						<td><label>Release year:</label></td>
						<td><form:input path="year"/> </td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>
		
		<div style="clear; both;"> </div>
		<p>
			<a href="${pageContext.request.contextPath}/book/list"> Back to list </a>	
		</p>
	</div>
</body>
</html>