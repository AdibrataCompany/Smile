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
		<s:form action="assetdoc.action" theme="simple">
			<center>
				<div class="col-md-4"></div>
				<div class="col-md-4">

					<h2>Asset Document Master</h2>
					<input type="text" name="mode" id="mode"
						style="visibility: hidden;"></input>
					<table class="table table-striped">
						<tr>
							<td>Kode</td>
							<td><input type="text" name="documentCode" /></td>
						</tr>
						<tr>
							<td>Nama</td>
							<td><input type="text" name="documentName" /></td>
						</tr>
						<tr>
							<td>Tipe</td>
							<td><input type="text" name="assetType" /></td>
						</tr>
					</table>
					<br>
					<table width="100%">
						<tr>
							<td><button class="btn btn-sm btn-primary" type="submit"
									onclick="end()">Kembali</button></td>
							<td colspan="2" align="right">
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