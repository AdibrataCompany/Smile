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

<body>
	<%@include file="/Demo/Menu.jsp"%>
	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Demo/Header.jsp"%>
		<h1>Perbaikan</h1>
		<table width="100%">
			<tr>
				<td width="50%">
					<table>
						<tr>
							<td width="50%">No. Faktur <input name="" />
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="search()" class="btn btn-sm btn-primary">Cari</button>
							</td>
							<td width="50%" style="text-align: right">Tanggal <select>
									<option value="">hh/bb/tttt</option>
							</select>
							</td>
						</tr>
					</table>
				</td>
				<td>
					<table>
						<tr>
							<td>
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="save()" class="btn btn-sm btn-primary">Simpan</button>
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="del()" class="btn btn-sm btn-primary">Hapus</button>
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="add()" class="btn btn-sm btn-primary">Tambah</button>
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="print()" class="btn btn-sm btn-primary">Cetak</button>
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="quit()" class="btn btn-sm btn-primary">Keluar</button>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
		<br>
		<table width="100%"
			class="table table-striped table-bordered table-hover">
			<tr>
				<th>Motor<br>No.</th>
				<th>No. Polisi</th>
				<th></th>
				<th>Merk</th>
				<th>Model</th>
				<th>Isi Silinder</th>
				<th>Tahun Pembuatan</th>
				<th>Warna</th>
				<th></th>
			</tr>
			<tr id="row_<s:property value="id"/>">
				<td><s:property value="noMotor" /></td>
				<td><input name="licensePlate"/></td>
				<td><button class="btn btn-sm btn-primary" type="submit"
						onclick="searchlicense()" class="btn btn-sm btn-primary">Cari</button></td>
				<td><s:property value="assetBrand" /></td>
				<td><s:property value="assetModel" /></td>
				<td><s:property value="cylinder" /></td>
				<td><s:property value="manufacturingYear" /></td>
				<td><s:property value="colour" /></td>
				<td align="center"><button class="btn btn-sm btn-primary" type="submit"
						onclick="delete()" class="btn btn-sm btn-primary">X</button></td></td>
			</tr>
		</table>
		<br>
		<div class="table-container" align="center">
			<center>
				<table border="1" width="100%" align="left">
					<tr>
						<th width="50%">Daftar Motor</th>
						<th>Rincian Biaya Sepeda Motor</th>
					</tr>
					<tr>
						<td><textarea rows="10" cols="70"></textarea></td>
						<td><textarea rows="10" cols="70"></textarea></td>
					</tr>
					<tr>
						<td align="right">Total Faktur<input type="text"/></td>
						<td align="right">Total Sepeda Motor<input type="text"/></td>
					</tr>
				</table>
		</div>
		<!-- 	</div> -->
	</div>
	</center>
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
