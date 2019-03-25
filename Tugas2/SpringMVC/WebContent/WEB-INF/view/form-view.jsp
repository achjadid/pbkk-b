<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/style.css" rel="stylesheet">
<title>Legends</title>
</head>
<body>
<div class="wrapper">
<div class="form">
	<h2>Submitted Legends Information</h2>
    <table>
    	<tr>
            <td>Legends ID</td>
            <td>: ${id}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>: ${name}</td>
        </tr>
        <tr>
            <td>Role</td>
            <td>: ${role}</td>
        </tr>
        <tr>
            <td>Gender: </td>
            <td>: ${gender}</td>
        </tr>
    </table>
</div>
</div>
</body>
</html>