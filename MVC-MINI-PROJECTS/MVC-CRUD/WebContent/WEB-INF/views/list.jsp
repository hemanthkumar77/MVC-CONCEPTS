<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">User Management Application</h2>
	<input type="button" onclick="window.location.href='';return false;" value="ADD" >
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h3>List of Users</h3></caption>
            <tr>
                <th>NAME</th>
                <th>DEPT_ID</th>
                <th>DEPT_NAME</th>
                 <th>SALARY</th>
                 <th>TAXES</th>
                 <th>update|delete</th>
            </tr>
            <c:forEach var="user" items="${object}">
            <c:url var="data" value="/updateform">
            <c:param name="set_id" value="${user.id}"></c:param>
            </c:url>
            
            <c:url var="eliminate" value="/delete">
            <c:param name="del_id" value="${user.id}"></c:param>
            </c:url>
            
                <tr>
                    <!--<td><c:out value="${user.id}" /></td> -->
                    <td><c:out value="${user.name}" /></td>
                    <td><c:out value="${user.dept_id}" /></td>
                    <td><c:out value="${user.dept_name}" /></td>
                     <td><c:out value="${user.salary}" /></td>
                      <td><c:out value="${user.taxes}" /></td>
                     <td>
                     <a href="${data}">update</a>
                     |
                     <a href="${eliminate}">delete</a>
                     </td>
                </tr>
            </c:forEach>
        </table>
    </div>	
</table>
</body>
</html>