<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<style>
* {
	box-sizing: border-box;
}

input[type=text], select, textarea {
	width: 60%;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	resize: vertical;
}

label {
	padding: 12px 12px 12px 0;
	display: inline-block;
}

input[type=submit] {
	background-color: #04AA6D;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	float: right;
}

input[type=submit]:hover {
	background-color: #45a049;
}

.container {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}

.col-25 {
	float: left;
	width: 25%;
	margin-top: 6px;
}

.col-75 {
	float: left;
	width: 75%;
	margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
	content: "";
	display: table;
	clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
	.col-25, .col-75, input[type=submit] {
		width: 100%;
		margin-top: 0;
	}
}
</style>
</head>
<body>
	<div>
		<center>
			<h1>Payment Details</h1>
			<h3>MAKE YOUR PAYMENT HERE</h3>
			<br>
			<form action="payview" method="post">
				Enter User id: <input type="text" name="uid"
					placeholder="enter UserId" required
					oninvalid="this.setCustomValidity('Enter UserId Here')"
					oninput="this.setCustomValidity('')" /><br>
				<br> Enter Route id: <input type="text" name="route"
					placeholder="enter RouteId" required
					oninvalid="this.setCustomValidity('Enter RouteId Here')"
					oninput="this.setCustomValidity('')" /><br>
				<br> CreditCardNum: <input type="text" name="CreditCardNumber"
					placeholder="enter CreditCardNumber" required
					oninvalid="this.setCustomValidity('Enter CreditCardNumber Here')"
					oninput="this.setCustomValidity('')" /><br>
				<br> <input type="submit" value="search">
			</form>
		</center>
	</div>
</body>
</html>