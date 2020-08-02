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
<form:form action=" /MVC-HIBERNATE-REGISTER/update_value" method="post" modelAttribute="stud">
		<h2 align="center">Student Registration form</h2>
		<table align="center">
			<tr>
				<td>ID</td>
				<td><form:input path="id" readOnly="true"/></td>
			</tr>

			<tr>
				<td>NAME</td>
				<td><form:input path="name" readOnly="true"/></td>
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
			<td><form:input path="courses" /></td>
                 </td>
			</tr>
			
			 <tr>
              <td>gender:</td>
             <td><form:input path="gender" /></td>
               
            </tr>
             	
			<tr>
				<td><input type="submit" value="update"></td>
			</tr>
		</table>

	</form:form>
</body>
</html>