<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id=form1 align="center">
<form:form action="/MVC-CRUD/validate" method="post" modelAttribute="val">
		<h2 align="center">LOGIN</h2>
		<table align="center">
			<tr>
				<td>ID</td>
				<td><form:input path="id"  /></td>
				<td><form:errors path="id" cssClass="error"/></td>
			</tr>

			<tr>
				<td>NAME</td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssClass="error"/></td>
			</tr>
          
          	<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>

	</form:form>
	</div>
	
</body>
</html>