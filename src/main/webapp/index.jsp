<html>
<center>
	<h1>Ship Reservation System</h1>
</center>
<body>
<form method="post" action="login">

<style>
input[type="text"]:-ms-input-placeholder {
	text-align: center;
}

input[type="password"]:-ms-input-placeholder {
	text-align: center;
}

div {
	background-image:
		url('https://image.cnbcfm.com/api/v1/image/106042801-1564151441390cruiseshot.png?v=1564168367');
	height: 86%;
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
		<div>

			<br>
			<br>

			<table cellpadding="10" cellspacing="8" bgcolor="LightGray"
				align="center">
				<tr>
					<th colspan="5" bgcolor=#b2ace6 align="center" font-size=>Login
						Here</th>
				</tr>
				<tbody>
					<tr>
						<td><input type="text" name="username" placeholder="UserId"
							required style="width: 300; height: 30"
							oninvalid="this.setCustomValidity('Enter UserId Here')"
							oninput="this.setCustomValidity('')" /></td>
					</tr>
					<tr>
						<td><input type="password" name="password"
							placeholder="Password" required style="width: 300; height: 30"
							oninvalid="this.setCustomValidity('Enter Password Here')"
							oninput="this.setCustomValidity('')" /></td>
					</tr>
					<tr>
						<td><input type="submit" value="Login" bgcolor=#008080 /></td>
					</tr>
					<tr>
						<td>New User? <a href="NewUserSignup"> Click here to
								register</a>
						</td>
					</tr>
					<tr>
						<td>Forgot your password? <a href="chpass">Click here to
								reset it</a></td>
					</tr>
				</tbody>

			</table>

		</div>
		<a href="Aboutus">About us</a> <a href="Contactus">Contact us</a>
	</form>
</body>
</html>
