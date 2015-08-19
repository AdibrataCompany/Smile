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
				<table width="100%">
					<tr>
						<td width="20%">Name</td>
						<td width="30%"><s:textfield name="name" /></td>
						<td width="20%">NPWP</td>
						<td width="30%"><s:textfield name="npwp" /></td>
					</tr>
				</table>
				<br>
				<h3>Match/Similar Costumer Data</h3>
				<div class="table-responsive">
					<table border="1" width="100%">
						<tr>
							<th>Name</th>
							<th>NPWP</th>
							<th>Type</th>
						</tr>
						<s:iterator>
							<tr>
								<td>${name}</td>
								<td>${npwp}</td>
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
							<th>NPWP</th>
							<th>Type</th>
						</tr>
						<s:iterator>
							<tr>
								<td>${name}</td>
								<td>${npwp}</td>
								<td>${type}</td>
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