<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INDEX</title>
<style>
h1
{
  width:650px;
   height:50px;
   background: green;
   color:blue;
}
input[type=button]
{
background-color:blue;
border-color:red;
color:yellow;
}
</style>
</head>
<body>
<h1>EMPLOYEE_DETAILS_HR_OPERATIONS</h1>
<input type="button" onclick="window.location.href='create';return false;" value="ADD" >
<input type="button" onclick="window.location.href='customer-update';return false;" value="EDIT" >
<input type="button" onclick="location.href='/DELETE'" value="REMOVE" >
<input type="button" onclick="location.href='/FECTH'" value="SELECT" >
</body>
</html>