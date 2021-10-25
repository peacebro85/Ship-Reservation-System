<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<style>
body {
	background-image:
		url('https://www.marineinsight.com/wp-content/uploads/2019/08/Cruise-ships-1.png');
	height: 100%;
	background-repeat: no-repeat;
	background-size: 1366px 625px;
}
</style>
<script>
	function mul(value) {
		var x;
		x = 1500 * value;
		document.getElementById('fare').value = x;
	}
</script>
<center>
	<body>
		<h1>Edit Reservation Details</h1>
		<form:form method="POST" action="/SReser/esave">
			<table>
				<tr>
					<td></td>
					<td><form:hidden path="ReservationId" required="required" /></td>
				</tr>
				<tr>
					<td>ScheduleId:</td>
					<td><form:input path="ScheduleId" type="number" required="required" min="1"
							oninvalid="this.setCustomValidity('ScheduleId Should not be 0')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>
				<tr>
					<td>JourneyDate :</td>
					<td><form:input path="JourneyDate" required="required"
							oninvalid="this.setCustomValidity('Enter JourneyDate Here')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>
				<tr>
					<td>NoOfSeats :</td>
					<td><form:input path="NoOfSeats" type="number" required="required" min="1"
							oninvalid="this.setCustomValidity('NoOfSeats Should not be 0')"
							oninput="this.setCustomValidity('')" onkeyup="mul(this.value);"/></td>
				</tr>
				<tr>
					<td>TotalFare :</td>
					<td><form:input path="TotalFare" id="fare" readonly="true" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Edit Save" /></td>
				</tr>
			</table>
		</form:form>
		<br>
		<a href="Customer.jsp" style="color:cyan;"><b>Customer</b></a>
	</body>
</center>