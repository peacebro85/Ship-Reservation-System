<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign up</title>
</head>

<form action="saved" method="post">
	<style>
input[type="text"]:-ms-input-placeholder {
	text-align: center;
}

input[type="password"]:-ms-input-placeholder {
	text-align: center;
}

.img {
	background-image:
		url('https://www.cruiseindustrynews.com/images/stories/wire/2020/dec/world_europa1.jpg');
	height: 100%;
	background-repeat: no-repeat;
	background-size: 1366px 625px;
}

.topnav {
	overflow: hidden;
	background-color: #333;
}

.topnav a {
	float: left;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}
</style>
	<div class="img">
		<div class="topnav">

			<a href="Aboutus">About us</a> <a href="Contactus">Contact us</a>
		</div>
		<table bgcolor="white" align="left">
			<tr>
				<th colspan="5" bgcolor=#D3D3D3 align="left" style="font-size: 30">Register</th>
			</tr>
			<tr>
				<td><b>Firstname :</b></td>

				<td><input type="text" name="Firstname" placeholder="Firstname"
					required style="width: 200; height: 30"
					oninvalid="this.setCustomValidity('Enter FirstName Here')"
					oninput="this.setCustomValidity('')" /></td>

			</tr>
			<tr>
				<td><b>Lastname :</b></td>

				<td><input type="text" name="Lastname" placeholder="Lastname"
					required style="width: 200; height: 30"
					oninvalid="this.setCustomValidity('Enter LastName Here')"
					oninput="this.setCustomValidity('')" /></td>


			</tr>
			<td><b>Password :</b></td>

			<td><input type="password" name="password"
				placeholder="Enter Password" required style="width: 200; height: 30"
				pattern="/^[a-zA-Z0-9!@#\$%\^\&*_=+-]{8,12}"
				oninvalid="this.setCustomValidity('Enter Password Here')"
				oninput="this.setCustomValidity('')" /></td>
			</tr>

			<tr>
				<td><b>Date Of Birth : </b></td>

				<td><input type="date" id="birthday" name="dob" required
					style="width: 200; height: 30"
					oninvalid="this.setCustomValidity('Enter Date Of Birth Here')"
					oninput="this.setCustomValidity('')" /></td>


			</tr>
			<tr>
				<td><b>Gender:</b></td>
				<td>Male <input type="radio" name="gender" value="male"
					checked="checked" /></br> Female <input type="radio" name="gender"
					value="female" />
				</td>

			</tr>

			<tr>

				<td><b>Street: </b></td>

				<td><input type="text" name="street" placeholder="Street"
					required style="width: 200; height: 30"
					oninvalid="this.setCustomValidity('Enter Street Here')"
					oninput="this.setCustomValidity('')" /></td>


			</tr>

			<tr>
				<td><b>Location: </b></td>

				<td><input type="text" name="loc" placeholder="Location"
					required style="width: 200; height: 30"
					oninvalid="this.setCustomValidity('Enter Location Here')"
					oninput="this.setCustomValidity('')" /></td>


			</tr>

			<tr>

				<td><b>City:</b></td>

				<td><input type="text" name="city" placeholder="City" required
					style="width: 200; height: 30"
					oninvalid="this.setCustomValidity('Enter City Here')"
					oninput="this.setCustomValidity('')" /></td>


			</tr>

			<tr>
				<td><b>State:</b></td>

				<td><input type="text" name="state" placeholder="State"
					required style="width: 200; height: 30"
					oninvalid="this.setCustomValidity('Enter State Here')"
					oninput="this.setCustomValidity('')" /></td>


			</tr>

			<tr>
				<td><b>PinCode: </b></td>

				<td><input type="number" name="pin" placeholder="Pincode"
					maxlength="6" required style="width: 200; height: 30"
					oninvalid="this.setCustomValidity('Enter PinCode Here')"
					oninput="this.setCustomValidity('')" /></td>

			</tr>


			<tr>
				<td><b>MobileNo: </b></td>

				<td><input type="tel" maxlength="10" name="mob"
					placeholder="MobileNo" required style="width: 200; height: 30"
					oninvalid="this.setCustomValidity('Enter MobileNo Here')"
					oninput="this.setCustomValidity('')" /></td>
			</tr>

			<tr>
				<td><b>EmailId:</b></td>

				<td><input type="email" name="mail" placeholder="EmailId"
					required style="width: 200; height: 30"
					oninvalid="this.setCustomValidity('Enter EmailId Here')"
					oninput="this.setCustomValidity('')" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Sign Up" required
					style="width: 200; height: 30; text-align: center;"></td>
			</tr>
		</table>
	</div>
</form>


</body>

</html>