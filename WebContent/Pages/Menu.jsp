<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>



</head>

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<body>
	<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<!-- <a class="navbar-brand">DMS</a> -->
		</div>

		<div id="navbar" class="navbar-collapse collapse">
			
				<ul class="nav navbar-nav">
					<li><a href="home.action">Depan</a></li>
					<li class="dropdown"><a href="" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Pembelian </a>
						<ul class="dropdown-menu">
							<li><a href="purchaseorder.action">Pembelian</a></li>
							<li><a href="purchaseretur.action">Retur
							</a></li>
							<li><a href="purchaseinvoice.action">Tagihan
							</a></li>
							<li role="separator" class="divider"></li>
							<li class="dropdown-header">Laporan</li>
							<li><a href="/Smile/Pages/Report/Purchase/Order/report.jsp">Laporan
									Pembelian</a></li>
							<li><a href="/Smile/Pages/Report/Purchase/Titip/report.jsp">Laporan
									Konsinyasi</a></li>
							<li><a href="/Smile/Pages/Report/Purchase/Retur/report.jsp">Laporan
									Retur Pembelian</a></li>
						</ul></li>
					<li class="dropdown"><a href="" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Penjualan </a>
						<ul class="dropdown-menu">
							<li><a href="/Smile/Pages/Sales/Order/paging.jsp">Penjualan</a></li>
							<li><a href="/Smile/Pages/Entrust/paging.jsp">Titipan
							</a></li>
							<li><a href="/Smile/Pages/Sales/Retur/paging.jsp">Retur
							</a></li>
							<li><a href="/Smile/Pages/Sales/Invoice/paging.jsp">Tagihan</a></li>
							<li role="separator" class="divider"></li>
							<li class="dropdown-header">Laporan</li>
							<li><a href="/Smile/Pages/Report/Purchase/Order/paging.jsp">Laporan
									Penjualan</a></li>
							<li><a href="/Smile/Pages/Report/Purchase/Order/paging.jsp">Laporan
									Konsinyasi</a></li>
							<li><a href="/Smile/Pages/Report/Purchase/Order/paging.jsp">Laporan
									Retur Penjualan</a></li>
						</ul></li>
					<li class="dropdown"><a href="" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Perbaikan</a>
						<ul class="dropdown-menu">
							<li><a href="repair.action">Perbaikan</a></li>

							<li role="separator" class="divider"></li>
							<li class="dropdown-header">Laporan</li>
							<li><a href="/Smile/Pages/Report/Purchase/Order/paging.jsp">Laporan
									Perbaikan</a></li>
						</ul></li>
					<li class="dropdown"><a href="" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Stock</a>
						<ul class="dropdown-menu">
							<li><a href="">Stock</a></li>

							<li role="separator" class="divider"></li>
							<li class="dropdown-header">Laporan</li>
							<li><a href="/Smile/Pages/Report/Purchase/Order/paging.jsp">Laporan
									Stock</a></li>
						</ul></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Karyawan</a>
						<ul class="dropdown-menu">
							<li><a
								href="/Smile/Pages/CashTransaction/PettyCash/PettyCash.jsp">Pengeluaran
									Karyawan</a></li>

							<li role="separator" class="divider"></li>
							<li class="dropdown-header">Laporan</li>
							<li><a href="/Smile/Pages/Report/Purchase/Order/paging.jsp">Laporan
									Pengeluaran Karyawan</a></li>
						</ul></li>
					<li class="dropdown"><a href="" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Dana Tunai</a>
						<ul class="dropdown-menu">
							<li><a href="pettycash.action">Dana Tunai</a></li>

							<li role="separator" class="divider"></li>
							<li class="dropdown-header">Laporan</li>
							<li><a href="/Smile/Pages/Report/Purchase/Order/paging.jsp">Laporan
									Dana Tunain</a></li>
						</ul></li>
					<li class="dropdown"><a href="" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Keuangan</a>
						<ul class="dropdown-menu">
							<li><a
								href="/Smile/Pages/AccPay/Selection/ApSelection.jsp">Pembayaran
									Hutang</a></li>
							<li><a
								href="/Smile/otherdisburse.action">Pembayaran
									Bukan Hutang</a></li>
							<li><a
								href="/Smile/otherreceive.action">Penerimaan
									Bukan Piutang</a></li>

							<li role="separator" class="divider"></li>
							<li class="dropdown-header">Laporan</li>
							<li><a href="/Smile/Pages/Report/Purchase/Order/paging.jsp">Laporan
									Hutang</a></li>
							<li><a href="/Smile/Pages/Report/Purchase/Order/paging.jsp">Laporan
									Piutang</a></li>
							<li><a href="/Smile/Pages/Report/Purchase/Order/paging.jsp">Laporan
									Pembayaran Bukan Hutang</a></li>
							<li><a href="/Smile/Pages/Report/Purchase/Order/paging.jsp">Laporan
									Penerimaan Bukan Piutang</a></li>

						</ul></li>
					<li class="dropdown"><a href="" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Akuntansi</a>
						<ul class="dropdown-menu">
							<li><a href="/Smile/Pages/Purchase/Order/paging.jsp">Posting
									To GL</a></li>
							<li><a href="/Smile/Pages/Purchase/Order/paging.jsp">Pembayaran
									Piutang</a></li>


							<li role="separator" class="divider"></li>
							<li class="dropdown-header">Laporan</li>
							<li><a href="/Smile/Pages/Report/Purchase/Order/paging.jsp">Laporan
									Neraca</a></li>
							<li><a href="/Smile/Pages/Report/Purchase/Order/paging.jsp">Laporan
									Rugi Laba</a></li>
							<li><a href="/Smile/Pages/Report/Purchase/Order/paging.jsp">Laporan
									Saldo</a></li>
						</ul></li>
					<li class="dropdown"><a href="" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Setting</a>
						<ul class="dropdown-menu">
							<li><a href="setting/office.action">Kantor</a></li>
							<li><a href="setting/employee.action">Karyawan</a></li>
							<li><a href="setting.role.action">Jabatan</a></li>
							<li><a href="setting/taksasi.action">Taksasi</a></li>
							<li><a href="setting/master.action">Master</a></li>
							<li><a href="setting/bankaccount.action">Rekening Bank</a></li>

							<li><a href="setting/dealer.action">Dealer</a></li>
							<li><a href="setting/workshop.action">Bengkel</a></li>
							<li><a href="setting/userregister.action">User Login</a></li>

						</ul></li>
					<li><a href="login.action">Keluar</a></li>
				</ul>
		
		</div>

		<!--/.nav-collapse -->
	</div>
	</nav>
</body>

</html>