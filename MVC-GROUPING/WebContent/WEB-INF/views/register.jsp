<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form:errors path="stu.*"></form:errors>
	<form:form action="/MVC-GROUPING/save" method="post" commandName="stu">
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
				<td>mobile_number</td>
				<td><form:input path="phone_num" /></td>
			</tr>
			<tr>
				<td>Courses:</td>
				<td><form:select path="courses">
						<form:options items="${courseslist}" />
					</form:select></td>
                 </td>
			</tr>
			
			 <tr>
              <td>gender:</td>
             <td><form:radiobuttons path="gender" items="${genderlist}" /></td>
               
            </tr>
             	
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>

	</form:form>
</body>
</html>