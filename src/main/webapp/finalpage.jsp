<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	background-image:
		url('https://www.marineinsight.com/wp-content/uploads/2019/08/Cruise-ships-1.png');
	height: 100%;
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
</head>
<body style="text-align:center;">
	<h2>Payment successfull!!!!!!!!!!!!!!</h2>
	Enter the PassengerId to print the ticket
	<form action="print">
		<input type="text" name="ReservationId" required
			oninvalid="this.setCustomValidity('Enter ReservationId Here')"
			oninput="this.setCustomValidity('')" /> <input type="submit" />
	</form>
	<br>
	<a href="Customer.jsp">Customer Page</a>
</body>
</html>