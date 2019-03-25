<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<style>
 @import url("/resources/css/style.css");
</style>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Legends</title>
</head>
<body>
<div class="wrapper">
<div class="form">
<h3>Welcome, Enter The Legends Details</h3>
        <form:form method="POST"
          action="/SpringMVC/result" modelAttribute="legends">
             <table>
             	<tr>
                    <td><form:label path="id">Id</form:label></td>
                    <td><form:input path="id"/></td>
                </tr>
                <tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td><form:label path="role">Role</form:label></td>
                    <td><form:input path="role"/></td>
                </tr>
                 <tr>
                    <td><form:label path="gender">Gender</form:label></td>
                    <td><form:input path="gender"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
</div>
</div>
</body>
</html>