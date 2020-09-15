<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Athlete Registration System</title>
</head>
<body>

	<table border="1">
	<tr>
		<th>athlete Id</th>
		<th>athlete Name</th>
		<th>athlete Gender</th>
		<th>athlete Category</th>
		<th>athlete Email</th>
		<th>athlete Mobile</th>
	</tr>
	<c:forEach var="athlete" items="${athleteList}">
	<tr>
		<td>${athlete.athleteId}</td>
		<td>${athlete.athleteName}</td>
		<td>${athlete.athleteGender}</td>
		<td>${athlete.category}</td>
		<td>${athlete.athleteEmail}</td>
		<td>${athlete.athleteMobile}</td>
	</tr>	

	</c:forEach>
</table>

</body>
</html>