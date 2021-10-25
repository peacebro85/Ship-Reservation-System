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
<center>
	<body>
		<h1>Edit Schedule details</h1>
		<form:form method="POST" action="/SReser/edsave">
			<table>
				<tr>
					<td></td>
					<td><form:hidden path="ScheduleId" required="required" /></td>
				</tr>
				<tr>
					<td>ShipId</td>
					<td><form:input path="ShipId" type="number" required="required" min="1"
							oninvalid="this.setCustomValidity('ShipId Should not be 0')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>
				<tr>
					<td>RouteId :</td>
					<td><form:input path="RouteId" type="number" required="required" min="1"
							oninvalid="this.setCustomValidity('RouteId Should not be 0')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>
				<tr>
					<td>StartDate :</td>
					<td><form:input path="StartDate" required="required"
							oninvalid="this.setCustomValidity('Enter StartDateShipId Here')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="Edit Save" /></td>
				</tr>
			</table>
		</form:form>
		<a href="Admin.jsp" style="color:cyan;"><b>Admin Page</b></a>
	</body>
</center>
