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

		<s:form action="perscustaddressdata.action" theme="simple">
			<center>
				<h2>Personal Customer - Address</h2>
				<s:hidden name="mode" id="mode" />
				<s:hidden name="id" />
				<s:label name="message" id="message" />
				<s:hidden name="customerid" />
				<table width="100%" border="1">
					<tr>
						<th colspan="2">LEGAL ADDRESS</th>
						<th colspan="2">RESIDENCE ADDRESS
							<button type="button" onclick="copy()">=Legal Address</button>
						</th>
					</tr>
					<tr>
						<td width="20%">Address</td>
						<td width="30%"><s:textarea name="legaladdress"
								id="legaladdress" /></td>
						<td width="20%">Address</td>
						<td width="30%"><s:textarea name="address" id="address" /></td>
					</tr>
					<tr>
						<td>RT / RW</td>
						<td><s:textfield name="legalrt" id="legalrt" /> / <s:textfield
								name="legalrw" id="legalrw" /></td>
						<td>RT / RW</td>
						<td><s:textfield name="rt" id="rt" /> / <s:textfield
								name="rw" id="rw" /></td>
					</tr>
					<tr>
						<td>Kelurahan</td>
						<td><s:textfield name="legalkelurahan" id="legalkelurahan" /></td>
						<td>Kelurahan</td>
						<td><s:textfield name="kelurahan" id="kelurahan" /></td>
					</tr>
					<tr>
						<td>Kecamatan</td>
						<td><s:textfield name="legalkecamatan" id="legalkecamatan" /></td>
						<td>Kecamatan</td>
						<td><s:textfield name="kecamatan" id="kecamatan" /></td>
					</tr>
					<tr>
						<td>City</td>
						<td><s:textfield name="legalcity" id="legalcity" /></td>
						<td>City</td>
						<td><s:textfield name="city" id="city" /></td>
					</tr>
					<tr>
						<td>Zip Code</td>
						<td><s:textfield name="legalzipcode" id="legalzipcode" /></td>
						<td>Zip Code</td>
						<td><s:textfield name="zipcode" id="zipcode" /></td>
					</tr>
					<tr>
						<td>Phone 1</td>
						<td colspan="3"><s:textfield name="areaphone1" /> - <s:textfield
								name="phoneno1" /></td>
					</tr>
					<tr>
						<td>Phone 2</td>
						<td colspan="3"><s:textfield name="areaphone2" /> - <s:textfield
								name="phoneno2" /></td>
					</tr>
					<tr>
						<td>Fax</td>
						<td colspan="3"><s:textfield name="areafax" /> - <s:textfield
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
	<%@include file="/Pages/Footer.jsp"%>
</body>
<script type="text/javascript">
	function save() {
		document.getElementById("mode").value = "save";
	}
	function copy() {
		document.getElementById("address").value = document
				.getElementById("legaladdress").value;
		document.getElementById("rt").value = document
				.getElementById("legalrt").value;
		document.getElementById("rw").value = document
				.getElementById("legalrw").value;
		document.getElementById("kelurahan").value = document
				.getElementById("legalkelurahan").value;
		document.getElementById("kecamatan").value = document
				.getElementById("legalkecamatan").value;
		document.getElementById("city").value = document
				.getElementById("legalcity").value;
		document.getElementById("zipcode").value = document
				.getElementById("legalzipcode").value;
	}
</script>
</html>