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

<title>DMS-Dealer Management System</title>
</head>

<body>
	<%@include file="/Demo/Menu.jsp"%>
	<div class="container">

		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Demo/Header.jsp"%>
		<s:form action="sales_retur.action" theme="simple">

			<h1>Retur Pembelian</h1>
			<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
			<table width="95%" align="center">
				<tr>
					<td>Unit Selection</td>
					<td><input></input></td>

				</tr>
				<tr>
					<td>No Pembelian</td>
					<td>xxxx50xxx</td>
					<td>Nama Dealer</td>
					<td>xxxx20xxxxx</td>
				</tr>
				<tr>
					<td width="25%">Tanggal Pembelian</td>
					<td width="25%">10/07/2015</td>
					<td width="25%">Tanggal Penerimaan</td>
					<td width="25%">10/07/2015</td>
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
				<table width="100%"> 
					<tr>
						<td align="right">
							<button class="btn btn-sm btn-primary" type="submit"
								class="btn btn-sm btn-primary" onclick="tambah()">Add</button>
						</td>
					</tr>
				</table>

				<table border="1" width="100%" align="center">
					<tr>
						<th>Merek</th>
						<th>Tipe</th>
						<th>Model</th>
						<th>Warna</th>
						<th>No Polisi</th>
						<th>No. Rangka</th>
						<th>No. Mesin</th>
						<th>Bulan Pembuatan</th>
						<th>Tahun Pembuatan</th>
						<th>Umur<br>(month)
						</th>
						<th>Harga Unit</th>
						<th>Pajak</th>
						<th>Harga Total</th>
						<th><button class="btn btn-sm btn-primary" type="submit"
								class="btn btn-sm btn-primary" onclick="del()">Del</button></th>

					</tr>
					<tr>
						<td><s:property value="" /></td>
						<td><s:property value="" /></td>
						<td><s:property value="" /></td>
						<td><s:property value="" /></td>
						<td><s:property value="" /></td>
						<td><s:property value="" /></td>
						<td><s:property value="" /></td>
						<td><s:property value="" /></td>
						<td><s:property value="" /></td>
						<td><s:property value="" /></td>
						<td><s:property value="" /></td>
						<td><s:property value="" /></td>
						<td><s:property value="" /></td>
						<td align="center"><input type="radio" checked /></td>

					</tr>
					<table width="100%"> 
				<tr>
					<td align="right"><a href="paging.jsp"
						class="btn btn-sm btn-primary">Save</a> <a href="paging.jsp"
						class="btn btn-sm btn-primary">Back</a></td>
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