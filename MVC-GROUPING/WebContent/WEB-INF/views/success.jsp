<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<a href="/MVC-GROUPING/">Back</a>

	<table align="center">
		<tr>
			<td>employee_name</td>
			<td>${empl.name}</td>
		</tr>

		<tr>
			<td>employee_id</td>
			<td>${empl.id}</td>
		</tr>

        <tr>
			<td>phone_number</td>
			<td>${empl.phone_num}</td>
		</tr>
		
		<tr>
			<td>courses</td>
			<td>${empl.courses}</td>
		</tr>

		<tr>
			<td>gender</td>
			<td>${empl.gender}</td>
		</tr>
		
		
	</table>
</body>
</html>