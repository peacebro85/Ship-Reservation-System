<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<style>
body 
{
	background-image:
		url('https://www.marineinsight.com/wp-content/uploads/2019/08/Cruise-ships-1.png');
	height: 100%;
	background-repeat: no-repeat;
	background-size: 1366px 625px;
}
</style>
<center>
	<body>
		<h1>Edit Route Details</h1>
		<form:form method="POST" action="/SReser/edtsave">
			<table>
				<tr>
					<td></td>
					<td><form:hidden path="RouteId" required="required" /></td>
				</tr>
				<tr>
					<td>Source:</td>
					<td><form:input path="Source" required="required"
							oninvalid="this.setCustomValidity('Enter Source Here')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>
				<tr>
					<td>Destination :</td>
					<td><form:input path="Destination" required="required"
							oninvalid="this.setCustomValidity('Enter Destination Here')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>
				<tr>
					<td>TravelDuration :</td>
					<td><form:input path="TravelDuration" type="number" required="required" min="1"
							oninvalid="this.setCustomValidity('TravelDuration Should not be 0')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>
				<tr>
					<td>Fare :</td>
					<td><form:input path="Faree" type="number" required="required" min="1"
							oninvalid="this.setCustomValidity('Fare Should not be 0')"
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