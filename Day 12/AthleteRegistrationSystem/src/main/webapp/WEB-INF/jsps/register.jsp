<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Athlete Registration System</title>
</head>
<body>
	<form action="addAthlete" method="post">
		Athlete Name : <input type="text" name="athleteName" /> <br />
		Gender: <input type="radio" id="male" name="athleteGender" value="male">
		<label for="male">Male</label> <input type="radio" id="female"
			name="athleteGender" value="female"> <label for="female">Female</label><br />
		<label for="cars">Category:</label> <select id="cars" name="category">
			<option value="Running">Running</option>
			<option value="High Jump">High Jump</option>
			<option value="Hurdles">Hurdles</option>
			<option value="Relay">Relay</option>
			<option value="JavelinThrow">Javelin Throw</option>
			<option value="ShotPut">Shot put</option>
		</select><br /> Email: <input type="text" name="athleteEmail" /> <br />
		Mobile: <input type="number" name="athleteMobile" /> <br/>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>