<%@ page import="com.srs.controllers.*" %>
<%@ page import="com.srs.bean.*" %>
<%@ page import="com.srs.dao.*" %>
<%@ page import="com.srs.util.*" %>
<%@ page import="com.srs.service.*" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
		url('https://i.insider.com/5cbf50dfd1a2f8074406a8b2?width=700');
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
  background-color:green;
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
  <a href="#Customer">Customer</a>
  <div class="subnav">
    <button class="subnavbtn">Book ticket<i class="fa fa-caret-down"></i></button>
    <div class="subnav-content">
      <a href="Reservationform">book ticket</a>
      <a href="viewReservation">View ticket</a>
      <a href="paymentwindow">Make Payment</a>
    </div>
  </div> 
 
  
 <div class="subnav">
    <button class="subnavbtn">View<i class="fa fa-caret-down"></i></button>
    <div class="subnav-content">
      <a href="viewShipCust">view ship details</a>
      <a href="viewScheduleCust">View Schedule details</a>
      <a href="viewRouteCust">View Route details</a>
     
    </div>
  </div> 
  <a href="chpass">change password</a>
    <a href="logout2.jsp">Logout</a>
</div>

<div style="padding:0 16px">
<h1 style="color:cyan">Welcome User: ${username}</h1>
</div>
</body>
</html>
