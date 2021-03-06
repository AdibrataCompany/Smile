<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>SMILE - Smart Leasing And Consumer Finance System</title>

</head>

<body>
	<%@include file="/Pages/Menu.jsp"%>
	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Pages/Header.jsp"%>

		<s:form action="perscust.action" theme="simple">
			<center>
				<h2>Check Customer Data</h2>
				<s:hidden name="mode" id="mode" />
				<s:hidden name="id" />
				<s:label name="message" id="message" />
				<s:hidden name="customerid" />
				<s:hidden name="name" />
				<s:hidden name="birthplace" />
				<s:hidden name="birthdate" />
				<s:hidden name="idtype" />
				<s:hidden name="idnumber" />
				<s:hidden name="personalnpwp" />
				<s:hidden name="legalname" />
				<s:hidden name="biologicalmothersname" />
				<s:hidden name="idexpdate" />
				<s:hidden name="gender" />
				<s:hidden name="idtype" />

				<table width="100%" class="table-hover table-responsive" >
					<tr>
						<td width="20%">Full Name</td>
						<td width="30%"><s:label name="name" /></td>
						<td width="20%">Birth Place/ Date</td>
						<td width="30%"><s:label name="birthplace" /> / <s:label
								name="birthdate" /></td>
					</tr>
					<tr>
						<td>ID Type</td>
						<td><s:label name="idtype" /></td>
					</tr>
					<tr>
						<td>ID Number</td>
						<td><s:label name="idnumber" /></td>
						<td>Personal NPWP</td>
						<td><s:label name="personalnpwp" /></td>
					</tr>
					<tr>
						<td>Biological Mother's Name</td>
						<td><s:label name="biologicalmothersname" /></td>
					</tr>
				</table>
				<br>
				<h3>Duplicate Costumer Data</h3>
				<div class="table-responsive">
					<table border="1" width="100%">
						<tr>
							<th>Name</th>
							<th>ID Type</th>
							<th>ID Number</th>
							<th>Birth Date</th>
							<th>Biological Mother's Name</th>
							<th>Type</th>
						</tr>
						<s:iterator>
							<tr>
								<td>${name}</td>
								<td>${idtype}</td>
								<td>${idnumber}</td>
								<td>${birthdate}</td>
								<td>${biologicalmothersname}</td>
								<td>${type}</td>
							</tr>
						</s:iterator>
					</table>
				</div>
				<br>
				<h3>Negative List</h3>
				<div class="table-responsive">
					<table border="1" width="100%">
						<tr>
							<th>Name</th>
							<th>ID Type</th>
							<th>ID Number</th>
							<th>Birth Date</th>

						</tr>
						<s:iterator>
							<tr>
								<td>${name}</td>
								<td>${idtype}</td>
								<td>${idnumber}</td>
								<td>${birthdate}</td>

							</tr>
						</s:iterator>
					</table>
				</div>
				<br>
				<table width="100%">
					<tr>
						<td><button type="submit" onclick="start()">BACK</button></td>
						<td align="right"><button type="submit" onclick="entry()">NEXT</button>
							<button type="submit" onclick="start()">CANCEL</button></td>
					</tr>
				</table>
			</center>
		</s:form>
	</div>
	<%@include file="/Pages/Footer.jsp"%>
</body>
<script type="text/javascript">
	function start() {
		document.getElementById("mode").value = "start";
	}
	function entry() {
		document.getElementById("mode").value = "entry";
	}
	function start() {
		document.getElementById("mode").value = "start";
	}
</script>
</html>