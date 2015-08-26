<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>SMILE - Smart Leasing And Consumer Finance </title>
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
				<s:hidden name="mode" id="mode" />
				<s:hidden name="id" />
				<s:label name="message" id="message" />
				<s:hidden name="customerid" />
				<table border="0" width="100%" class="table-hover table-responsive">
					<tr>
						<td width="20%">Name</td>
						<td width="30%"><s:textfield name="name" placeholder="Name"
								class="form-control" /></td>

					</tr>
					<tr>
						<td width="20%">NPWP</td>
						<td width="30%"><s:textfield name="npwp" placeholder="NPWP" style="width:150px" 
								class="form-control" /></td>
					</tr>
					<tr>
						<th colspan="4">ADDRESS</th>
					</tr>
					<tr>
						<td>Address</td>
						<td colspan="3"><s:textarea name="address"
								class="form-control" placeholder="Address"  /></td>
					</tr>
					<tr>
						<td>RT/RW</td>
						<td><div align="left" class="form-inline"><s:textfield name="rt" placeholder="RT" style="width:60px" 
								class="form-control" /> / <s:textfield name="rw"
								style="width:60px" placeholder="RW" class="form-control" /></div></td>

					</tr>
					<tr>
						<td>Kelurahan</td>
						<td colspan=3><s:textfield name="kelurahan"  style="width:120px" 
								placeholder="Kelurahan" class="form-control" /></td>
					</tr>
					<tr>
						<td>Kecamatan</td>
						<td colspan=3><s:textfield name="kecamatan"  style="width:120px" 
								placeholder="Kecamatan" class="form-control" /></td>
					</tr>
					<tr>
						<td>City</td>
						<td colspan=3><s:textfield name="city" placeholder="City"  style="width:120px" 
								class="form-control" /></td>
					</tr>
					<tr>
						<td>Zip Code</td>
						<td colspan=3><s:textfield name="zipcode"
								placeholder="Zip Code" style="width:100px" /></td>
					</tr>
					<tr>
					<tr>
						<td>Phone 1</td>
						<td><div align="left" class="form-inline">
								<s:textfield name="areaphone1" placeholder="Area"
									style="width:60px" class="form-control" />
								-
								<s:textfield name="phoneno1" placeholder="Phone 1"
									style="width:100px" class="form-control" />
							</div></td>
						<td>Phone 2</td>
						<td colspan=3><div align="left" class="form-inline">
								<s:textfield name="areaphone2" placeholder="Area"
									class="form-control" style="width:60px" />
								-
								<s:textfield name="phoneno2" placeholder="Phone 2"
									style="width:100px" />
							</div></td>

					</tr>
					<tr>
						<td>Fax</td>
						<td colspan=3><div align="left" class="form-inline">
								<s:textfield name="areafax" placeholder="Area"
									style="width:60px" class="form-control" />
								-
								<s:textfield name="faxno" placeholder="Fax" style="width:100px" />
							</div></td>
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
	<%@include file="/Pages/Footer.jsp"%>
</body>
<script type="text/javascript">
	function check() {
		document.getElementById("mode").value = "check";
	}
</script>
</html>