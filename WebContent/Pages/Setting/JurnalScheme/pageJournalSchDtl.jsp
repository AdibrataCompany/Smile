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

		<s:form action="journalscheme.action" theme="simple">
			<center>
				<h2>Journal Scheme</h2>
				<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
				<s:hidden name="id"></s:hidden>
			</center>
			<table width="100%">
				<tr>
					<td width="10%">COA Description</td>
					<td><s:label name="coaSchmCode" /></td>
				</tr>
				<tr>
					<td>COA Code</td>
					<td><s:label name="coaSchmDesc" /></td>
				</tr>
				<tr>
					<td>Active</td>
					<td><s:label name="isActive" /></td>
				</tr>
			</table>
			<br>
			<table class="table table-bordered">
				<tr>
					<th style="text-align: center;">COA Scheme Code</th>
					<th style="text-align: center;">COA Scheme<br>Description
					</th>
					<th style="text-align: center;">Active</th>
				</tr>
				<s:iterator value="lstCoaSchmDtl">
					<tr id="row_${id}">
						<td></td>
						<td></td>
						<td></td>
					</tr>
				</s:iterator>
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
							onclick="savedetail()">Simpan</button>
					</td>
				</tr>
			</table>


		</s:form>
	</div>

</body>
<script type="text/javascript">
	function savedetail() {
		document.getElementById("mode").value = "savedetail";
	}
	function end() {
		document.getElementById("mode").value = "end";
	}
</script>
</html>