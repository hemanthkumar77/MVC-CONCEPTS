<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/mvc-modelattributes/display" method="post" modelAttribute="stud">
  <table>

			<tr>
				<td>student_id</td>
				<td><form:input path="id"/></td>
			</tr>

			<tr>
				<td>Name</td>
				<td><form:input path="name"/></td>
			</tr>


			<tr>
				<td>dept_id</td>
				<td><form:input path="depar_is"/></td>
			</tr>

			<tr>
				<td>Department_name</td>
				<td>
				<form:select path="dept_name">
				<form:option value="csc">CSC</form:option>
				<form:option value="cvil">CIVIL</form:option>
				<form:option value="ECE">ECE</form:option>
				</form:select>
				</td>
			</tr>

			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
    </table>
  </form:form>
</body>
</html>