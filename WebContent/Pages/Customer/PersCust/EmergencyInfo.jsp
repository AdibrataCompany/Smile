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

		<s:form action="perscustemergencyinfo.action" theme="simple">
			<center>
				<h2>Personal Customer - Add</h2>
				<input type="text" name="mode" id="mode" style="visibility: hidden;" />
				<br>
				<s:label name="message" />
				<br>
				<s:textfield name="customerid" />
				<table width="100%" border="1">
					<tr>
						<th colspan="4">EMERGENCY CONTACT</th>
					</tr>
					<tr>
						<td>Name</td>
						<td><s:textfield name="contactname" />
						<td>Relationship</td>
						<td><s:select name="relationship" headerKey=""
								headerValue="Select One" list="#{'sibling':'sibling'}"></s:select></td>
					</tr>
					<tr>
						<td>Address</td>
						<td colspan="3"><s:textarea name="address" /></td>
					</tr>
					<tr>
						<td>RT / RW</td>
						<td><s:textfield name="rt" /> / <s:textfield name="rw" /></td>
						<td>Zip Code</td>
						<td><s:textfield name="zipcode" /></td>
					</tr>
					<tr>
						<td>Kelurahan</td>
						<td><s:textfield name="kelurahan" /></td>
						<td>Phone 1</td>
						<td><s:textfield name="areaphone1" /> - <s:textfield
								name="phoneno1" /></td>
					</tr>
					<tr>
						<td>Kecamatan</td>
						<td><s:textfield name="kecamatan" /></td>
						<td>Phone 2</td>
						<td><s:textfield name="areaphone2" /> - <s:textfield
								name="phoneno2" /></td>
					</tr>
					<tr>
						<td>City</td>
						<td><s:textfield name="city" /></td>
						<td>Fax</td>
						<td><s:textfield name="areafax" /> - <s:textfield
								name="faxno" /></td>
					</tr>
				</table>
				<br>
				<table width="100%">
					<tr>
						<td><a href="customer.action"><button type="button">CANCEL</button></a></td>
						<td align="right"><button type="submit" onclick="save()">SAVE</button></td>
					</tr>
				</table>
			</center>
		</s:form>
	</div>
</body>
<script type="text/javascript">
	function save() {
		document.getElementById("mode").value = "save";
	}
</script>
</html>