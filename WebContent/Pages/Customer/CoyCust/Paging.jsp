<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>DMS-Dealer Management System</title>

</head>

<body>
	<%@include file="/Pages/Menu.jsp"%>
	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Pages/Header.jsp"%>

		<s:form action="coycust.action" theme="simple">
			<center>
				<h2>Company Customer - Add</h2>
				<input type="text" name="mode" id="mode" style="visibility: hidden;" />
				<br>
				<s:label name="message" />
				<br>
				<table border="1" width="100%">
					<tr>
						<td width="20%">Name</td>
						<td width="30%"><s:textfield name="name" placeholder="Name" /></td>
						<td width="20%">NPWP</td>
						<td width="30%"><s:textfield name="npwp" placeholder="NPWP" /></td>
					</tr>
					<tr>
						<th colspan="4">ADDRESS</th>
					</tr>
					<tr>
						<td>Address</td>
						<td colspan="3"><s:textarea name="address"
								placeholder="Address" /></td>
					</tr>
					<tr>
						<td>RT/RW</td>
						<td><s:textfield name="rt" placeholder="RT" /> / <s:textfield
								name="rw" placeholder="RW" /></td>
						<td>Zip Code</td>
						<td><s:textfield name="zipcode" placeholder="Zip Code" /></td>
					</tr>
					<tr>
						<td>Kelurahan</td>
						<td><s:textfield name="kelurahan" placeholder="Kelurahan" /></td>
						<td>Phone 1</td>
						<td><s:textfield name="areaphone1" placeholder="Area" /> - <s:textfield
								name="phoneno1" placeholder="Phone 1" /></td>
					</tr>
					<tr>
						<td>Kecamatan</td>
						<td><s:textfield name="kecamatan" placeholder="Kecamatan" /></td>
						<td>Phone 2</td>
						<td><s:textfield name="areaphone2" placeholder="Area" /> - <s:textfield
								name="phoneno2" placeholder="Phone 2" /></td>
					</tr>
					<tr>
						<td>City</td>
						<td><s:textfield name="city" placeholder="City" /></td>
						<td>Fax</td>
						<td><s:textfield name="areafax" placeholder="Area" /> - <s:textfield
								name="faxno" placeholder="Fax" /></td>
					</tr>
				</table>
				<br>
				<table width="100%">
					<tr>
						<td><a href="customer.action"><button type="button">CANCEL</button></a></td>
						<td align="right"><button type="submit" onclick="check()">NEXT</button></td>
					</tr>
				</table>
			</center>
		</s:form>
	</div>
</body>
<script type="text/javascript">
	function check() {
		document.getElementById("mode").value = "check";
	}
</script>
</html>