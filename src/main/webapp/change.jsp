<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<style>
body 
{
	background-image:
		url('https://www.marineinsight.com/wp-content/uploads/2019/08/Cruise-ships-1.png');
	height: 100%;
	background-repeat: no-repeat;
	background-size: 1366px 625px;
}
</style>
<body style="text-align: center">
	<h1>Change Your Password</h1>
	<h3>ENTER YOUR CREDENTIALS HERE</h3>
	<br>
	<form action="paw" method="post">
		Enter User id: <input type="text" name="uid"
			placeholder="enter UserId" required /><br> <br> Enter
		Password: <input id="password" name="password" type="password"
			pattern="^\S{6,}$"
			onchange="this.setCustomValidity(this.validity.patternMismatch ? 'Must have at least 6 characters' : ''); if(this.checkValidity()) form.password_two.pattern = this.value;"
			placeholder="Password" required /><br> <br> Confirm
		Password: <input id="password_two" name="password_two" type="password"
			pattern="^\S{6,}$"
			onchange="this.setCustomValidity(this.validity.patternMismatch ? 'Please enter the same Password as above' : '');"
			placeholder="Verify Password" required /><br> <br> <input
			type="submit" value="Change">
	</form>
</body>
</html>