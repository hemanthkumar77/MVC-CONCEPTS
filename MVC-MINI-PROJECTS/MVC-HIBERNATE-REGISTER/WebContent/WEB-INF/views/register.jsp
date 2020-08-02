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
	<form:form action="/MVC-HIBERNATE-REGISTER/save" method="post" modelAttribute="user">
		<h2 align="center">Student Registration form</h2>
		<table align="center">
			<tr>
				<td>ID</td>
				<td><form:input path="id" /></td>
			</tr>

			<tr>
				<td>NAME</td>
				<td><form:input path="name" /></td>
			</tr>

             <tr>
				<td>DEPARTMENT</td>
				<td><form:input path="department_name" /></td>
			</tr>
			 <tr>
				<td>GPA</td>
				<td><form:input path="gpa"  step="0.01" /></td>
			</tr>
			<tr>
				<td>Courses:</td>
				<td><form:select path="courses">
						<form:options items="${subjects}" />
					</form:select></td>
                 </td>
			</tr>
			
			 <tr>
              <td>gender:</td>
             <td><form:radiobuttons path="gender" items="${genders}" /></td>
               
            </tr>
             	
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>

	</form:form>
</body>
</body>
</html>