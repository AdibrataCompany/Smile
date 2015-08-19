<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/Smile/Pages/style/css/datepicker.css">
<link rel="stylesheet" href="/Smile/Pages/style/css/bootstrap.css">
<link rel="stylesheet" href="/Smile/Pages/style/css/alert.css">
<script src="/Smile/Pages/style/js/jquery-1.9.1.min.js"></script>
<script src="/Smile/Pages/style/js/bootstrap-datepicker.js"></script>
<title>DMS-Dealer Management System</title>

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
				<h2>Personal Customer - Add</h2>
				<input type="text" name="mode" id="mode" style="visibility: hidden;" />
				<br>
				<s:label name="message" />
				<br>
				<table border="1" width="100%">
					<tr>
						<td width="50%">Legal Name</td>
						<td width="50%"><s:textfield name="legalname"
								placeholder="Legal Name" /></td>
					</tr>
					<tr>
						<td>Full Name</td>
						<td><s:textfield name="name" placeholder="Full Name" /></td>
					</tr>
					<tr>
						<td>Type</td>
						<td><s:radio name="personalcustomertype"
								list="#{'Employee': 'Employee','Professional':'Professional','Enterpreneur':'Enterpreneur'}" />
						</td>
					</tr>
					<tr>
						<td>ID Type</td>
						<td><s:select name="idtype" headerKey=""
								headerValue="Select ID Type" list="#{'KTP':'KTP','SIM':'SIM'}" /></td>
					</tr>
					<tr>
						<td>ID Number</td>
						<td><s:textfield name="idnumber" placeholder="ID Number" /></td>
					</tr>
					<tr>
						<td>Expired Date</td>
						<td><%@include
								file="/Pages/Customer/DatePicker/IDExpDate.jsp"%></td>
					</tr>
					<tr>
						<td>Gender</td>
						<td><s:radio name="gender"
								list="#{'Pria':'Pria','Wanita':'Wanita'}" /></td>
					</tr>
					<tr>
						<td>Birth Place/Date</td>
						<td><s:textfield id="birth" name="birth" class="input-sm"
								placeholder="DD/MM/YYYY" /></td>
					</tr>
					<tr>
						<td>Personal NPWP</td>
						<td><s:textfield name="personalnpwp"
								placeholder="Personal NPWP" /></td>
					</tr>
					<tr>
						<td>Biological Mother's Name</td>
						<td><s:textfield name="biologicalmothersname"
								placeholder="Biological Mother's Name" /></td>
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
	// When the document is ready
	$(document).ready(function() {
		$('#birth').datepicker({
			format : "dd/mm/yyyy"
		});
	});
</script>
<script type="text/javascript">
	function start() {
		document.getElementById("mode").value = "start";
	}
	function check() {
		document.getElementById("mode").value = "check";
	}
</script>
</html>