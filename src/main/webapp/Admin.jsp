<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	margin: 0;
}

.navbar {
	overflow: hidden;
	background-color: #333;
}

.navbar a {
	float: left;
	font-size: 16px;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

.subnav {
	float: left;
	overflow: hidden;
}

.subnav .subnavbtn {
	font-size: 16px;
	border: none;
	outline: none;
	color: white;
	padding: 14px 16px;
	background-color: inherit;
	font-family: inherit;
	margin: 0;
}

body {
	background-image:
		url('https://www.marineinsight.com/wp-content/uploads/2019/08/Cruise-ships-1.png');
	height: 100%;
	background-repeat: no-repeat;
	background-size: 1366px 625px;
}

.navbar a:hover, .subnav:hover .subnavbtn {
	background-color: black;
}

.subnav-content {
	display: none;
	position: absolute;
	left: 0;
	background-color: green;
	width: 100%;
	z-index: 1;
}

.subnav-content a {
	float: left;
	color: white;
	text-decoration: none;
}

.subnav-content a:hover {
	background-color: #eee;
	color: black;
}

.subnav:hover .subnav-content {
	display: block;
}
</style>
</head>
<body>
	<div class="navbar">
		<a href="#Admin">Admin</a>
		<div class="subnav">
			<button class="subnavbtn">
				Ship Details<i class="fa fa-caret-down"></i>
			</button>
			<div class="subnav-content">
				<a href="Shipform">Add Ship</a> <a href="viewShip">View ship</a>

			</div>
		</div>

		<div class="subnav">
			<button class="subnavbtn">
				Route Details <i class="fa fa-caret-down"></i>
			</button>
			<div class="subnav-content">
				<a href="Routeform">Add Route</a> <a href="viewRoute">View Route</a>
			</div>

		</div>

		<div class="subnav">
			<button class="subnavbtn">
				Schedule Details <i class="fa fa-caret-down"></i>
			</button>
			<div class="subnav-content">
				<a href="Scheduleform">Add Schedule</a> <a href="viewSchedule">View
					Schedule</a>
			</div>
		</div>

		<a href="viewPassenger">View Passengers</a> <a href=Contactus.jsp">Contact</a>
		<a href="logout.jsp">Logout</a>
	</div>

	<div style="padding: 0 16px">
		<h1 style="color:cyan">Welcome Admin: ${username}</h1>
	</div>

</body>
</html>
