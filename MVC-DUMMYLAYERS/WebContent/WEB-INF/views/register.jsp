<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register_page</title>
</head>
<body>
<div id="table1" align="center">
<form action="/MVC-DUMMYLAYERS/save" method="post">
<table>
<tr>
<td>Id</td>
<td><input type="text" name="id"></td>
</tr>

<tr>
<td>name</td>
<td><input type="text" name="name"></td>
</tr>

<tr>
<td>department_id</td>
<td><input type="number" name="dept_id"></td>
</tr>

<tr>
<td>department_name</td>
<td><input type="text" name="dept_name"></td>
</tr>

<tr>
<td>salary</td>
<td><input type="text" name="sal"></td>
</tr>

</table>
<input type="submit" value="register">
</form>
</div>
</body>
</html>