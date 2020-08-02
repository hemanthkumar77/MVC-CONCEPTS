<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
color: red;
}
</style>
</head>
<body>
<form:form action="/MVC-BEAN/confirmation" method="post" modelAttribute="stud">
  <table>

			<tr>
				<td>student_id</td>
				<td><form:input path="id"/></td>
				<td><form:errors path="id" cssclass="error"/></td>
			</tr>

			<tr>
				<td>Name</td>
				<td><form:input path="name"/></td>
				<td><form:errors path="name" cssclass="error"/></td>
			</tr>


			<tr>
				<td>AGE</td>
				<td><form:input path="age"/></td>
				<td><form:errors path="age" cssclass="error"/></td>
			</tr>

			<tr>
				<td>EMAIL</td>
				<td><form:input path="email"/></td>
				<td><form:errors path="email" cssclass="error"/></td>
			</tr>

			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
    </table>
  </form:form>
</body>

</html>