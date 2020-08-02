<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>User Store Application</title>
</head>
<body>
		<h2 align="center">User Management Application</h2>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h3>List of Users</h3></caption>
            <tr>
                <th>employee_id</th>
                <th>employee_name</th>
                <th>department_id</th>
                <th>department_name</th>
                 <th>salary</th>
            </tr>
            <c:forEach var="user" items="${users}">
                <tr>
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.name}" /></td>
                    <td><c:out value="${user.department_id}" /></td>
                    <td><c:out value="${user.department}" /></td>
                     <td><c:out value="${user.salary}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>	
</body>
</html>