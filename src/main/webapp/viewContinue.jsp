<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Passenger details</h1>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 10px;
}

table#alter tr:nth-child(even) {
	background-color: #eee;
}

table#alter tr:nth-child(odd) {
	background-color: #fff;
}

table#alter th {
	color: white;
	background-color: gray;
}

body {
	background-image:
		url('https://www.marineinsight.com/wp-content/uploads/2019/08/Cruise-ships-1.png');
	height: 100%;
	background-repeat: no-repeat;
	background-size: 1366px 625px;
}
</style>
<body>
	<table border="1" id="alter" width="100%" cellpadding="2">

		<tr>
			<th>ReservationId</th>
			<th>ScheduleId</th>
			<th>Name</th>
			<th>Age</th>
			<th>Gender</th>
			<th>PassengerId</th>
			<th>Edit</th>
			<th>Delete</th>
			<th>Payment</th>
		</tr>
		<c:forEach var="route" items="${list}">
			<tr>
				<td>${route.reservationId }</td>
				<td>${route.scheduleId }</td>
				<td>${route.name}</td>
				<td>${route.age }</td>
				<td>${route.gender }</td>
				<td>${route.passengerId }</td>
				<td><a href="editPassenger/${route.passengerId }">Edit</a></td>
				<td><a href="deletePassenger/${route.passengerId }">Delete</a></td>
				<td><a href="pay">Make Payment</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="Continueform" style="color:cyan;"><b>Add Passenger Details</b></a><br><br>
    <a href="Customer.jsp" style="color:cyan;"><b>Customer Page</b></a>
</body>

   
