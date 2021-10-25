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
		<h1>Edit Passenger Details</h1>
		<form:form method="POST" action="/SReser/edttsave">
			<table>
				<tr>
					<td></td>
					<td><form:hidden path="PassengerId" required="required" /></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><form:input path="Name" required="required"
							oninvalid="this.setCustomValidity('Enter Name Here')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>
				<tr>
					<td>Age :</td>
					<td><form:input path="Age" type="number" required="required" min="1"
							oninvalid="this.setCustomValidity('Age Should not be 0')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>
				<tr>
					<td>Gender :</td>
					<td><form:input path="Gender" required="required"
							oninvalid="this.setCustomValidity('Enter Gender Here')"
							oninput="this.setCustomValidity('')" /></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="Edit Save" /></td>
				</tr>
			</table>
		</form:form>
	</body>
</center>