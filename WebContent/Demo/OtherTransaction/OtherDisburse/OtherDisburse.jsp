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
		<h1>Pembayaran Bukan Hutang</h1>
		<table width="95%" border="0" cellpadding="2" cellspacing="1"
			class="tablegrid">
			<tr>
				<td colspan="5">&nbsp;</td>
			</tr>
			<tr>
				<td width="150" >Tujuan Pembayaran</td>
				<td width="220" class="tdganjil"><input name="textfield32"
					type="text" class="inptype" size="25"></td>
				<td width="150" >Reference No</td>
				<td colspan="2" class="tdganjil"><input name="textfield3222"
					type="text" class="inptype" size="20"></td>
			</tr>
			<tr>
				<td >Cara Bayar</td>
				<td class="tdganjil"><select name="select2">
						<option>Cash</option>
						<option selected>Bank</option>
						<option>Prepaid</option>
				</select></td>
				<td >Tanggal Transaksi</td>
				<td colspan="2" class="tdganjil"><input name="textfield322"
					type="text" class="inptype" size="15"> <img
					src="../Images/iconcalendar.gif" width="20" height="20"
					align="absmiddle"></td>
			</tr>
			<tr>
				<td >Rekening Bank</td>
				<td class="tdganjil"><select name="select3">
						<option selected>Select One</option>
						<option>Citi Bank Escrow</option>
						<option>BCA Escrow</option>
				</select></td>
				<td >Jumlah Pengeluaran </td>
				<td class="tdganjil">IDR</td>
				<td class="tdganjil"><div align="right">
						<input name="textfield32232" type="text" class="inptype" size="20">
					</div></td>
			</tr>
			
			<tr>
				<td valign="top" >Catatan</td>
				<td colspan="4" class="tdganjil"><textarea
						name="textfield3232332" cols="80" rows="2" class="inptype"></textarea></td>
			</tr>
			<tr>
				<td colspan="5">Transaksi</td>
			</tr>
			<tr>
				<td >Transaction</td>
				<td class="tdganjil"><input name="textfield32242" type="text"
					class="inptype" size="25"> <a href="javascript:;"
					onClick="MM_openBrWindow('../Lookup/OtherPaymentAllocationLookUp.htm','LookUp','width=700,height=500')"><img
						src="../Images/IconDetail.gif" width="15" height="15" border="0"
						align="absmiddle"></a></td>
				<td >Amount</td>
				<td colspan="2" class="tdganjil"><input name="textfield323232"
					type="text" class="inptype" size="20"></td>
			</tr>
			<tr>
				<td valign="top" >Description</td>
				<td colspan="4" class="tdganjil"><input name="textfield324"
					type="text" class="inptype" size="40"></td>
			</tr>
		</table>
		<table width="95%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="50%" height="30">&nbsp;</td>
				<td width="50%" align="right"><button type="button"
						class="btn btn-sm btn-primary">Add</button></td>
			</tr>
		</table>
		<br>
		<table width="95%" border="0" cellspacing="0" cellpadding="0">
			<tr class="trtopikuning">
				<td width="10" height="20" class="tdtopihijau2kiri">&nbsp;</td>
				<td align="center" class="tdtopihijau2">TRANSACTION DETAIL</td>
				<td width="10" class="tdtopihijau2kanan">&nbsp;</td>
			</tr>
		</table>
		<table width="95%" border="0" cellpadding="3" cellspacing="1"
			class="tablegrid">
			<tr>
				<td width="25%" align="center">TRANSKSI</td>
				<td width="50%" align="center">KETERANGAN</td>
				<td width="15%" align="center">JUMLAH</td>
				<td width="10%" align="center">DELETE</td>
			</tr>
			<tr class="tdganjil">
				<td>xxxxxxxxxx25xxxxxxxxxx</td>
				<td>xxxxxxxxxxxxxx50xxxxxxxxxxxxxx</td>
				<td align="right">10,000.00</td>
				<td align="center"><img src="../Images/IconDelete.gif"
					width="16" height="16"></td>
			</tr>
			<tr >
				<td>xxxxxxxxxx25xxxxxxxxxx</td>
				<td>xxxxxxxxxxxxxx50xxxxxxxxxxxxxx</td>
				<td align="right">120,000.00</td>
				<td align="center"><img src="../Images/IconDelete.gif"
					width="16" height="16"></td>
			</tr>
			<tr>
				<td colspan="2"><div align="right">Total</div></td>
				<td align="right">130,000.00</td>
				<td align="center">&nbsp;</td>
			</tr>
		</table>
		<table width="95%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="50%" height="30">&nbsp;</td>
				<td width="50%" align="right"><a
					href="javascript:history.go(-1);" class="btn btn-sm btn-primary">Save</a>
					<a
					href="javascript:history.go(-1);" class="btn btn-sm btn-primary">Back</a>
				</td>
			</tr>
		</table>
	</div>
	<!-- 	</div> -->
	</div>
	<!-- /container -->
</body>
</html>