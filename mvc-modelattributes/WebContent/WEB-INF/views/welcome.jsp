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
<a href="/mvc-modelattributes/">register_page</a>
<table>
<tr>
<td>student_id</td>
<td>${stud.id}</td>
</tr>

<tr>
<td>student_name</td>
<td>${stud.name}</td>
</tr>

<tr>
<td>department_id</td>
<td>${stud.depar_is}</td>
</tr>

<tr>
<td>department_name</td>
<td>${stud.dept_name}</td>
</tr>

</table>
</body>
</html>