<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
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
			<th>CreditCardNumber</th>
			<th>Valid From</th>
			<th>Valid To</th>
			<th>User Id</th>
			<th>Balance</th>
			<th>Payment</th>
		</tr>
		<c:forEach var="r" items="${list1}">
			<tr>
				<td>${r.creditCardNumber }</td>
				<td>${r.validFrom }</td>
				<td>${r.validTo }</td>
				<td>${r.userId }</td>
				<td>${r.balance }</td>
				<td><a href="payt/${r.creditCardNumber }">Make Payment</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="Customer.jsp" style="color:cyan;"><b>Customer Page</b></a>
</body>
</html>