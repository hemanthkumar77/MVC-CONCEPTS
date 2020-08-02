<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registeration_page</title>
<style>
.error
{
color : red;
}
</style>
</head>
<body>

<form:form action="/mvc-completeformsvalidations/save" modelAttribute="stud" method="post">
  <table>

			<tr>
				<td>employee_id</td>
				<td><form:input path="emp_id" placeholder="302"/></td>
				<td><form:errors path="emp_id" cssClass="error"/></td>
			</tr>

			<tr>
				<td>employee_name</td>
				<td><form:input path="emp_name" placeholder="patrick"/></td>
				<td><form:errors path="emp_name" cssClass="error"/></td>
			</tr>


			<tr>
				<td>department_id</td>
				<td><form:input path="dept_id" placeholder="5"/></td>
				<td><form:errors path="dept_id" cssClass="error"/></td>
			</tr>

			<tr>
				<td>DOB</td>
				<td><form:input path="DOB" placeholder="mm-dd-yyyy"/></td>
				<td><form:errors path="DOB" cssClass="error"/></td>
			</tr>
             
             <tr>
				<td>EMAIL</td>
				<td><form:input path="email" placeholder="guru@gamil.com"/></td>
				<td><form:errors path="email" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td>DATE-OF-JOINING</td>
				<td><form:input path="joining" placeholder="mm-dd-yyyy"/></td>
				<td><form:errors path="joining" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td>Department_name</td>
				<td><form:input path="dept_name" placeholder="java"/></td>
				<td><form:errors path="dept_name" cssClass="error"/></td>
			</tr>
			
			
			<tr>
			 <td>Sex:</td>
    <td>
        Male:
        <form:radiobutton path="gender" value="M" /> <br/> Female:
        <form:radiobutton path="gender" value="FE" />
        <td><form:errors path="dept_name" cssClass="error"/></td>
    </td>
    </tr>
    
		  <tr>
    <td>Skills:</td>
    <td>
        <select name="position">
            <option value="DBA">DBA</option>
            <option value="TESTER" > </option>
            <option value="BACKEND-DEVELOPER">back-end</option>
            <option value="front-end-developer">front-end</option>
            <option value="full-stack">fullstack</option>
            <option value="INFRASTRUCTURE">cloud-services</option>
        </select>
    </td>
</tr>


			<tr>
				<td>Salary</td>
				<td><form:input path="salary" step="0.01"/></td>
				<td><form:errors path="salary" cssClass="error"/></td>
			</tr>
  
  	       <tr>
				<td>Street_name</td>
				<td><form:input path="add.street_name"  /></td>
				<td><form:errors path="add.street_name" cssClass="error"/></td>
			</tr>
  
           <tr>
				<td>City</td>
				<td><form:input path="add.city"/></td>
				<td><form:errors path="add.city" cssClass="error"/></td>
			</tr>
		
		   <tr>
				<td>Country</td>
				<td><form:input path="add.country"/></td>
				<td><form:errors path="add.country" cssClass="error"/></td>
			</tr>
			
			  <tr>
				<td>Pincode</td>
				<td><form:input path="add.pincode"/></td>
				<td><form:errors path="add.pincode" cssClass="error"/></td>
			</tr>	
			
           <tr>
				<td><input type="submit" value="Register"></td>
			</tr>
    </table>
  </form:form>

</body>
</html>