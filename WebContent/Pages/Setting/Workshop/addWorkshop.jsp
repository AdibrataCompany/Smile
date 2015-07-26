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
		<s:form action="workshop.action" theme="simple">
			<center>
				<div class="col-md-2"></div>
				<div class="col-md-8">

					<h2>Workshop</h2>
					<input type="text" name="mode" id="mode"
						style="visibility: hidden;"></input>
					<table class="table table-striped">
						<tr>
							<td>Name</td>
							<td><input type="text" name="name" /></td>
							<td>Phone1 Area</td>
							<td><input type="text" name="areaPhone1" /></td>
						</tr>
						<tr>
							<td>Address</td>
							<td><input type="text" name="address" /></td>
							<td>Phone1 No.</td>
							<td><input type="text" name="phoneNo1" /></td>
						</tr>
						<tr>
							<td>RT</td>
							<td><input type="text" name="rt" /></td>
							<td>Phone2 Area</td>
							<td><input type="text" name="areaPhone2" /></td>
						</tr>
						<tr>
							<td>RW</td>
							<td><input type="text" name="rw" /></td>
							<td>Phone2 No.</td>
							<td><input type="text" name="phoneNo2" /></td>
						</tr>
						<tr>
							<td>Kelurahan</td>
							<td><input type="text" name="kelurahan" /></td>
							<td>Fax Area</td>
							<td><input type="text" name="type" /></td>
						</tr>
						<tr>
							<td>City</td>
							<td><input type="text" name="city" /></td>
							<td>Fax No.</td>
							<td><input type="text" name="faxNo" /></td>
						</tr>
						<tr>
							<td>Zip Code</td>
							<td><input type="text" name="zipcode" /></td>
							<td>Handphone</td>
							<td><input type="text" name="handphone" /></td>
						</tr>
						<tr>
							<td>Type</td>
							<td><input type="text" name="type" /></td>
						</tr>
					</table>
					<br>
					<table width="100%">
						<tr>
							<td>
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="end()">Kembali</button>
							</td>
							<td align="right">
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="saveadd()">Simpan</button>
							</td>
						</tr>
					</table>
				</div>
			</center>
		</s:form>
	</div>

</body>
<script type="text/javascript">
	function saveadd() {
		document.getElementById("mode").value = "saveadd";
	}
	function end() {
		document.getElementById("mode").value = "end";
	}
</script>
</html>