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
<form:form action="/MVC-CRUD//update_val" method="post" modelAttribute="emp">
		<h2 align="center">edit form</h2>
		<table align="center">
			<tr>
				<td>ID</td>
				<td><form:input path="id" disabled="true" /></td>
				<td><form:errors path="id" cssClass="error"/></td>
			</tr>

			<tr>
				<td>NAME</td>
				<td><form:input path="name" disabled="true" /></td>
				<td><form:errors path="name" cssClass="error"/></td>
			</tr>

             <tr>
				<td>DEPARTMENT_ID:</td>
				<td><form:select path="dept_id">
						<form:options items="${dep_id}" />
					</form:select></td>
					<td><form:errors path="dept_id" cssClass="error"/></td>
                 </td>
			</tr>
			
			 <tr>
				<td>DEPARTMENT_NAME:</td>
				<td><form:select path="dept_name">
						<form:options items="${dep_name}" />
					</form:select></td>
					<td><form:errors path="dept_name" cssClass="error"/></td>
                 </td>
			</tr>
			
			<tr>
				<td>SALARY</td>
				<td><form:input path="salary" step="0.01" /></td>
				<td><form:errors path="salary" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td>TAXES</td>
				<td><form:input path="taxes" step="0.01" /></td>
				<td><form:errors path="taxes" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>

	</form:form>
	</div>
</body>
</html>