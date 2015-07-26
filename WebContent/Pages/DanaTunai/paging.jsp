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

<title>SMIILE - Smart Lesing And Consumer Finance Leasing</title>
</head>

<body>
	<%@include file="/Demo/Menu.jsp"%>
	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Demo/Header.jsp"%>
		<h1>Dana Tunai</h1>
		<table width="100%">
			<tr>
				<td width="50%">
					<table>
						<tr>
							<td width="50%">No. Faktur <input name="" />
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="search()">Cari</button>
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
									onclick="save()">Simpan</button>
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="del()">Hapus</button>
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="add()">Tambah</button>
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="print()">Cetak</button>
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="quit()">Keluar</button>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
		<br>
		<table width="100%" border="1">
			<tr>
				<td width="50%">
					<table>
						<tr>
							<th colspan="2">Pembeli/Penjual</th>
						</tr>
						<tr>
							<td width="95%"><input type="text" /></td>
							<td align="right">
								<button class="btn btn-sm btn-primary" type="submit">Cari</button>
							</td>
						</tr>
						<tr>
							<td colspan="2"><input type="text" /></td>
						</tr>
						<tr>
							<th>Leasing</th>
						</tr>
						<tr>
							<td><input type="text" /></td>
							<td align="right">
								<button class="btn btn-sm btn-primary" type="submit">Cari</button>
							</td>
						</tr>
					</table>
				</td>
				<td>
					<table>
						<tr>
							<th colspan="4">Nilai</th>
						</tr>
						<tr>
							<td width="25%">Harga</td>
							<td width="25%"><input type="text" />
							<td width="25%">DP Gross</td>
							<td width="25%"><input type="text" />
						</tr>
						<tr>
							<td>PPN</td>
							<td colspan="3"><input type="text" />%<input type="text" /></td>
						</tr>
						<tr>
							<td>Total</td>
							<td><input type="text" /></td>
							<td>Sisa Kredit</td>
							<td width="25%"><input type="text" />
						</tr>
					</table>
				</td>
				<td>
					<table>
						<tr>
							<td>
								<button class="btn btn-sm btn-primary" type="submit">DP
									Gross</button>
							</td>
						</tr>
						<tr>
							<td>
								<button class="btn btn-sm btn-primary" type="submit">Pelunasan</button>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
		<br>
		<div class="table-container" align="center">
			<center>
				<table border="1" width="100%" align="left">
					<tr>
						<th>Sepeda Motor</th>
					</tr>
					<tr>
						<td>No.Polisi</td>
						<td><input type="text" /></td>
						<td>No.BPKB</td>
						<td><input type="text" />
						<td>STNK</td>
						<td><select>
								<option>hh/bb/tttt</option>
						</select></td>
					</tr>
					<tr>
						<td>Merk</td>
						<td><input type="text" /></td>
						<td>Nama BPKB</td>
						<td><input type="text" />
					</tr>
					<tr>
						<td>Model</td>
						<td><input type="text" /></td>
						<td>Alamat BPKB</td>
						<td><input type="text" />
					</tr>
					<tr>
						<td>Isi Silinder</td>
						<td><input type="text" /></td>
						<td>Tahun</td>
						<td><input type="text" />
						<td>No. Rangka</td>
						<td><input type="text" />
					</tr>
					<tr>
						<td>Warna</td>
						<td colspan="4"><input type="text" /></td>
						<td>No. Mesin</td>
						<td><input type="text" />
					</tr>
					<tr>
						<td>Keterangan</td>
						<td colspan="4"><input type="text" /></td>
						<td>Tanda Tangan</td>
						<td><input type="text" />
					</tr>
				</table>
			</center>
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
