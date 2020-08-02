<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registeration-page</title>
</head>
<body>
<marquee>Form Registeration</marquee>
<form action="/MVC-MAPPINGREQUESTPARAM/store_data" method="post">
<table>
<tr>
<th>FULL_NAME</th>
<td><input type="text" name="FN"></td>
</tr>
<tr>
<th>age</th>
<td><input type="number" name="age"></td>
</tr>
<tr>
<th>type</th>
<td>
<select name="dropdown">
  	<option value="villain1">jigsaw</option>
    <option value="villain2">fredy-kreguor</option>
  	<option value="villain3" selected>joker</option>  
</select>
</td>
</tr>

</table>
<input type="submit" value="register">
</form>
</body>
</html>