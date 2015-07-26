<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>SMIILE - Smart Lesing And Consumer Finance Leasing</title>

</head>

<body>
	<%@include file="/Pages/Menu.jsp"%>
	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Pages/Header.jsp"%>

		<s:form action="customer.action" theme="simple">
			<center>
				<h2>Personal Customer - Add</h2>
				<input type="text" name="mode" id="mode" style="visibility: hidden;" />
				<table border="1">
					<tr>
						<td>Legal Name</td>
						<td><input type="text" name="legalName" /></td>
					</tr>
					<tr>
						<td>Full Name</td>
						<td><input type="text" name="fullName" /></td>
					</tr>
					<tr>
						<td>Type</td>
						<td><input type="radio" name="type" value="Employee">Employee
							<input type="radio" name="type" value="Professional">Professional
							<input type="radio" name="type" value="Enterpreneur">Entrepreneur
						</td>
					</tr>
					<tr>
						<td>ID Type</td>
						<td><select name="idtype">
								<option value="">Select One</option>
								<option value="KTP">KTP</option>
						</select></td>
					</tr>
					<tr>
						<td>ID Number</td>
						<td><input type="text" name="idnumber"></td>
					</tr>
					<tr>
						<td>Expired Date</td>
						<td><input type="text" name="idexpDate"></td>
					</tr>
					<tr>
						<td>Gender</td>
						<td><input type="radio" name="gender" value="Male">Male <input
							type="radio" name="gender" value="Female">Female</td>
					</tr>
					<tr>
						<td>Birth Place/Date</td>
						<td><input type="text" name="birthPlace">/<input type="text"
							name="birthDate"></td>
					</tr>
					<tr>
						<td>Personal NPWP</td>
						<td><input type="text" name="personalNpwp"></td>
					</tr>
					<tr>
						<td>Mother Maiden Name</td>
						<td><input type="text" name="biologicalMothersName"></td>
					</tr>
				</table>
			</center>
		</s:form>
	</div>
</body>
</html>