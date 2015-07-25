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
		<s:form action="assetmaster.action" theme="simple">
			<center>

				<div class="col-md-4"></div>
				<div class="col-md-4">

					<h2>Asset Master</h2>
					<input type="text" name="mode" id="mode"
						style="visibility: hidden;"></input>
					<s:hidden name="id" />


					<table class="table table-striped">
						<tr>
							<td>Merk</td>
							<td><s:textfield name="assetBrand" /></td>
						</tr>
						<tr>
							<td>Type</td>
							<td><s:textfield name="assetType" /></td>
						</tr>
						<tr>
							<td>Model</td>
							<td><s:textfield name="assetModel" /></td>
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
									onclick="saveedit()">Simpan</button>
							</td>
						</tr>
					</table>

				</div>
			</center>
		</s:form>
	</div>

</body>
<script type="text/javascript">
	function saveedit() {
		document.getElementById("mode").value = "saveedit";
	}
	function end() {
		document.getElementById("mode").value = "end";
	}
</script>
</html>