<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

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
<body>
	<%@include file="/Demo/Menu.jsp"%>
	<div class="container">

		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Demo/Header.jsp"%>
		<s:form action="sales_order.action" theme="simple">
			
				<h1>Penjualan</h1>
				<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
				<table width="100%" align="left">
					<tr>
						<td width="25%">Name</td>
						<td width="25%">xxxxxx50xxxxxx</td>
						<td width="25%">Address</td>
						<td width="25%">xxxxxx100xxxxxx</td>
					</tr>

					<tr>
						<td>RT/RW</td>
						<td>x3x / x4x</td>
						<td>Kecamatan</td>
						<td>xxxxxx50xxxxxx</td>
					</tr>

					<tr>
						<td>Kelurahan</td>
						<td>xxxxxx50xxxxxx</td>
						<td>City</td>
						<td>xxxxxx50xxxxxx</td>
					</tr>
					<tr>
						<td>City</td>
						<td colspan=3>xxxxxx50xxxxxx</td>
					</tr>
					<tr>
						<td>Phone 1</td>
						<td>(999) - (999999999)</td>
					</tr>
					<tr>
						<td>Phone 2</td>
						<td>(999) - (999999999)</td>
					</tr>
					<tr>
						<td>Fax</td>
						<td>(999) - (999999999)</td>
					</tr>
				</table>

				<table width="100%" align="center">
					<tr>
						<td width="25%">Asset Code</td>
						<td width="25%"><select>
								<option value="Select One"></option>
								<option value="Yamaha Jupiter"></option>
						</select></td>

					</tr>
					<tr>
						<td width="25%">Brand</td>
						<td width="25%">xxxx50xxxx</td>
						<td width="25%">Type</td>
						<td width="25%">xxxx50xxxx</td>
					</tr>
					<tr>
						<td>Model</td>
						<td colspan=3>xxxx50xxxx</td>

					</tr>
					<tr>
						<td>No Mesin</td>
						<td>xxxx50xxxx</td>
						<td>No. Rangka</td>
						<td>xxxx50xxxx</td>
					</tr>
					<tr>
						<td>Warna</td>
						<td>xxxx50xxxx</td>
						<td>No Polisi</td>
						<td>B 1000 RL</td>
					</tr>
					<tr>
						<td>Bulan Pembuatan</td>
						<td>xxx15xxx</td>
						<td>Tahun Pembuatan</td>
						<td>2015</td>

					</tr>
					<tr>
						<td>Harga Jual</td>
						<td><input></td>
						<td>Pajak</td>
						<td><input></td>
					</tr>
					<tr>
						<td colspan="5" align="right">
							<button class="btn btn-sm btn-primary" type="submit" class="btn btn-sm btn-primary" onclick="tambah()">Add</button>
						</td>
					</tr>
				</table>

				<table border="1" width="100%" align="center">
					<tr>
						<th>Asset Code</th>
						<th>Asset<br>Description
						</th>
						<th>Warna</th>
						<th>No Polisi</th>
						<th>No Rangka</th>
						<th>No Mesin</th>
						<th>Bulan Pembuatan
						</th>
						<th>Tahun Pembuatan
						</th>
						<th>Umur<br>(month)
						</th>
						<th>Harga Jual
						</th>
						<th>Pajak</th>
						<th>Total Harga
						</th>
						<th><button class="btn btn-sm btn-primary" type="submit" class="btn btn-sm btn-primary" onclick="del()">Del</button></th>
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
						<td align="center"><input type="radio" checked /></td>
					</tr>
				</table>

				<table width="95%" align="center">
					<tr>
						<td width="95%">Total Unit</td>
						<td width="95%" align="right">99</td>
					</tr>
					<tr>
						<td>Total Penjualan</td>
						<td align="right">999,999,999</td>
					</tr>
					<tr>
						<td>Total Tax</td>
						<td align="right">999,999,999</td>
					</tr>
					<tr>
						<td>Grand Total</td>
						<td align="right">999,999,999</td>
					</tr>
					<tr>
						<td colspan="4" align="right">
							<a href="paging.jsp" class="btn btn-sm btn-primary" >Save</a>
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

</html>