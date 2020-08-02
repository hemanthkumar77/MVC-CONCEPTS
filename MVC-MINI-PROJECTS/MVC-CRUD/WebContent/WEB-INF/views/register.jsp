<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registeration</title>
<style type="text/css">
       #form1
       {
       border: 3px ridge blue;
	   border-radius: 20px 30px 20px 30px;
	   font-style: italic;
	   font-weight: lighter;
	   font-size: 20px;
	   font-family: "Times New Roman", Times, serif;
	   background-color: grey;
	   width:600px;
	   height:600px;
	   margin:200px;
       }
       .error
      {
     color : red;
       }
</style>
</head>
<body>
<div id=form1 align="center">
<form:form action="/MVC-CRUD/save" method="post" modelAttribute="emp">
		<h2 align="center">Student Registration form</h2>
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