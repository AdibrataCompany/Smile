<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="">

<title>SMILE - Smart Leasing And Consumer Finance System</title>
</head>

<body>
	<%@include file="/Demo/Menu.jsp"%>
	<div class="container">

		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Demo/Header.jsp"%>
		<s:form action="sales_retur.action" theme="simple">

			<h1>Retur Penjualan</h1>
			<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
			<table width="95%" align="center">

				<tr>
					<td>No Penjualan</td>
					<td>xxxx20xxxxx</td>
					<td>Nama Pelanggan</td>
					<td>xxxx20xxxxx</td>
				</tr>
				<tr>
					<td width="25%">Sales Date</td>
					<td width="25%">1/07/2015</td>
					<td width="25%">Delivery Date</td>
					<td width="25%">xxxx50xxxxx</td>
				</tr>

				<tr>
					<td>Merek</td>
					<td>xxxx50xxxxx</td>
					<td>Tipe</td>
					<td>xxxx50xxxxx</td>
				</tr>
				<tr>
					<td>Model</td>
					<td colspan=3>xxxx50xxxxx</td>
				</tr>

				<tr>
					<td>Warna</td>
					<td>xxxx50xxxxx</td>
					<td>No Polisi</td>
					<td>xxxx50xxxxx</td>
				</tr>
				<tr>
					<td>Bulan Pembuatan</td>
					<td>Januari</td>
					<td>Tahun Pembuatan</td>
					<td>2015</td>
				</tr>
				<tr>

				</tr>
				<tr>
					<td>Chasis No.</td>
					<td>xxxx50xxxxx</td>
					<td>Engine No.</td>
					<td>xxxx50xxxxx</td>
				</tr>


				<tr>
					<td colspan="4" align="right">
					<a href="paging.jsp" class="btn btn-sm btn-primary">Save</a>
					<a href="paging.jsp" class="btn btn-sm btn-primary">Back</a>
					
					</td>
				</tr>
			</table>
		</s:form>
	</div>
	<!-- 	</div> -->
	</div>
	<!-- /container -->
</body>


<!-- Bootstrap core JavaScript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<!-- 	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script> -->
<script src="style/js/jquery.min.js"></script>
<script src="style/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="js/ie10-viewport-bug-workaround.js"></script>
<script type="text/javascript">
	function tambah() {
		document.getElementById("mode").value = "tambah";
	}
	function del() {
		document.getElementById("mode").value = "del";
	}
	function simpan() {
		document.getElementById("mode").value = "simpan";
	}
	function kembali() {
		document.getElementById("mode").value = "kembali";
	}
</script>
</html>