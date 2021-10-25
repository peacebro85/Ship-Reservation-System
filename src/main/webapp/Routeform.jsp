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
	<h1>Add Route Details</h1>
	<body>
		<form:form method="post" action="add">
			<table>
				<tr>
					<h1>
						<td>Source :</td>
					</h1>
					<td><form:input path="Source" required="required"
							oninvalid="this.setCustomValidity('Enter Source Here')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>
				<tr>
					<h2>
						<td>Destination :</td>
					</h2>
					<td><form:input path="Destination" required="required"
							oninvalid="this.setCustomValidity('Enter Destination Here')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>
				<tr>
					<h2>
						<td>TravelDuration :</td>
					</h2>
					<td><form:input path="TravelDuration" type="number" required="required" min="1"
							oninvalid="this.setCustomValidity('TravelDuration Should not be 0')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>
				<tr>
					<h2>
						<td>Fare :</td>
					</h2>
					<td><form:input path="Faree" type="number" required="required" min="1"
							oninvalid="this.setCustomValidity('Fare Should not be 0')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>

				<td></td>
				<tr>
					<h2>
						<td><input type="submit" value="Save" /></td>
					</h2>
				</tr>
			</table>
		</form:form>
		<a href="Admin.jsp" style="color:cyan;"><b>Admin Page</b></a>
	</body>
</center>