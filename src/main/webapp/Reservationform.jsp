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
		<h1>Book Your Tickets Here</h1>
		<form:form method="post" action="added">
			<c:set var="now" value="<%=new java.util.Date()%>" />
			<table>
				<tr>
					<td>ScheduleId :</td>
					<td><form:input path="ScheduleId" type="number" required="required" min="1"
							oninvalid="this.setCustomValidity('ScheduleId Should not be 0')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>
				<tr>
					<td>UserId :</td>
					<td><form:input path="UserId" type="number" required="required" min="1"
							oninvalid="this.setCustomValidity('UserId Should not be 0')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>
				<tr>
					<td>BookingDate :</td>
					<td><form:input type="date" path="BookingDate"
							required="required"
							oninvalid="this.setCustomValidity('Enter BookingDate Here')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>
				<tr>
					<td>JourneyDate :</td>
					<td><form:input type="date" path="JourneyDate"
							required="required"
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

				<td></td>
				<tr>
					<td><input type="submit" value="Save" /></td>
				</tr>
			</table>
		</form:form>
		<br>
		<a href="Customer.jsp" style="color:cyan;"><b>Customer Page</b></a>
	</body>
</center>