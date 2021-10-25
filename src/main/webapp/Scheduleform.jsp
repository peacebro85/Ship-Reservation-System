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
		<h1>Add Schedule details</h1>
		<form:form method="post" action="adds">
			<table>
				<tr>
					<td>ShipId</td>
					<td><form:input path="ShipId" type="number" required="required" min="1"
							oninvalid="this.setCustomValidity('ShipId Should not be 0')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>
				<tr>
					<td>RouteId:</td>
					<td><form:input path="RouteId" type="number" required="required" min="1"
							oninvalid="this.setCustomValidity('RouteId Should not be 0')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>
				<tr>
					<td>StartDate :</td>
					<td><form:input path="StartDate" required="required"
							oninvalid="this.setCustomValidity('Enter StartDate Here')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Save" required="required" /></td>
				</tr>
			</table>
		</form:form>
		<a href="Admin.jsp" style="color:cyan;"><b>Admin page</b></a>
	</body>
</center>