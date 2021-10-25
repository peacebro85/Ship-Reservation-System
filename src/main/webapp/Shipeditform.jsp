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
	<h1>Edit Ship Details</h1>
</center>
<body>
	<center>
		<form:form method="POST" action="/SReser/editsave">
			<table>
				<tr>
					<td></td>
					<td><form:hidden path="ShipId" required="required" /></td>
				</tr>
				<tr>
					<td>Name :</td>
					<td><form:input path="ShipName" required="required"
							oninvalid="this.setCustomValidity('Enter ShipName Here')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>
				<tr>
					<td>SeatingCapacity :</td>
					<td><form:input path="SeatingCapacity" type="number" required="required" min="1"
							oninvalid="this.setCustomValidity('SeatingCapacity Should not be 0')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>
				<tr>
					<td>ReservationCapacity :</td>
					<td><form:input path="ReservationCapacity" type="number" required="required" min="1"
							oninvalid="this.setCustomValidity('ReservationCapacity Should not be 0')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="Edit Save" /></td>
				</tr>
			</table>
		</form:form>
		<br> <a href="Admin.jsp" style="color:cyan;"><b>Admin Page</b></a>
	</center>
</body>
