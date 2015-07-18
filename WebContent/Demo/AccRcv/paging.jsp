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
		<h1>Penerimaan Piutang</h1>
	<table width="95%" border="0" cellpadding="2" cellspacing="1"
		class="tablegrid">
		<tr>
			<td width="25%" class="tdgenap">Tipe Hutang</td>
			<td width="25%" class="tdganjil"><select name="select4">
					<option selected>Select One</option>
					<option>Pembelian</option>
					<option>Perbaikan</option>
					<option>Retur Penjualan</option>
			</select> <input name="textfield3" type="text" class="inptype" size="15">
			</td>
			<td width="25%" class="tdgenap">Tanggal Jatuh Tempo &lt;=</td>
			<td width="25%" class="tdganjil"><input name="textfield32"
				type="text" class="inptype" size="15"> <img
				src="../Images/iconcalendar.gif" width="20" height="20"
				align="absmiddle"></td>
		</tr>
		<tr>
			<td class="tdgenap">Search By</td>
			<td class="tdganjil"><select name="select">
					<option selected>Select One</option>
					<option>Invoice No.</option>
					<option>AP Detail</option>
			</select> <input name="textfield33" type="text" class="inptype" size="15"></td>
			<td class="tdgenap">Tanggal Tagihan</td>
			<td class="tdganjil"><input name="textfield32" type="text"
				class="inptype" size="15"> <img
				src="../Images/iconcalendar.gif" width="20" height="20"
				align="absmiddle"></td>
		</tr>
		<tr>
			<td class="tdgenap">Kantor</td>
			<td class="tdganjil"><select name="select3">
					<option selected>Head Office</option>
					<option>KPO Jakarta</option>
					<option>Branch Bandung</option>
			</select></td>
			<td class="tdgenap"></td>
			<td class="tdganjil">
			</select></td>
		</tr>
	</table>
	<table width="95%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td width="50%" height="30">&nbsp;</td>
			<td width="50%" align="right"><a href="ApSelectionEntry.jsp" class="btn btn-sm btn-primary">Cari</a>
				<a href="ApSelectionEntry.jsp" class="btn btn-sm btn-primary">Ulang</a></td>
		</tr>
	</table>
	<br>
	
	<table width="95%" border="0" cellpadding="3" cellspacing="1"
		class="tablegrid">
		<tr align="center" class="tdjudulhijau2">
			<td><a href="APSelectionList.htm">TUJUAN</a></td>
			<td><a href="APSelectionList.htm">DETIL</a></td>
			<td><a href="APSelectionList.htm">JUMLAH</a></td>
			<td><a href="APSelectionList.htm">JATUH TEMPO</a></td>
			<td><a href="APSelectionList.htm">NO TAGIHAN</a></td>
			<td><a href="APSelectionList.htm">TAGIHAN JATUH TEMPO</a></td>
			<td><a href="APSelectionList.htm">STATUS</a></td>
			<td width="5%"><input name="checkbox22" type="checkbox"
				value="checkbox"></td>
		</tr>
		<tr class="tdganjil">
			<td><a href="javascript:;"
				onClick="MM_openBrWindow('../Marketing/SuplierView.htm','ViewSupplier','scrollbars=yes,width=900,height=700,Top=1,Left=1')">xxxx50xxxx</a></td>
			<td><a href="javascript:;"
				onClick="MM_openBrWindow('../Finance/ViewAPSupplier.htm','APSupplier','scrollbars=yes,left=1,top=1,width=900,height=350')">AP
					PO Supplier</a></td>
			<td align="right">99,999,999,999.99</td>
			<td align="center">dd/mm/yyyy</td>
			<td align="center">xxxx50xxxx</td>
			<td align="center">dd/mm/yyyy</td>
			<td align="center">Yes</td>
			<td align="center"><input name="checkbox" type="checkbox"
				value="checkbox"></td>
		</tr>
		<tr class="tdgenap">
			<td><a href="javascript:;"
				onClick="MM_openBrWindow('../Marketing/SuplierView.htm','ViewSupplier','scrollbars=yes,width=900,height=700')">xxxx50xxxx</a></td>
			<td>xxxx50xxxx</td>
			<td align="right">99,999,999,999.99</td>
			<td align="center">dd/mm/yyyy</td>
			<td align="center">xxxx50xxxx</td>
			<td align="center">dd/mm/yyyy</td>
			<td align="center">No</td>
			<td align="center"><input name="checkbox2" type="checkbox"
				value="checkbox"></td>
		</tr>
		<tr class="tdganjil">
			<td><a href="javascript:;"
				onClick="MM_openBrWindow('../Marketing/SuplierView.htm','ViewSupplier','scrollbars=yes,width=900,height=700')">xxxx50xxxx</a></td>
			<td>xxxx50xxxx</td>
			<td align="right">99,999,999,999.99</td>
			<td align="center">dd/mm/yyyy</td>
			<td align="center">xxxx50xxxx</td>
			<td align="center">dd/mm/yyyy</td>
			<td align="center">Yes</td>
			<td align="center"><input name="checkbox" type="checkbox"
				value="checkbox"></td>
		</tr>
		<tr class="tdgenap">
			<td><a href="javascript:;"
				onClick="MM_openBrWindow('../Marketing/SuplierView.htm','ViewSupplier','scrollbars=yes,width=900,height=700')">xxxx50xxxx</a></td>
			<td>xxxx50xxxx</td>
			<td align="right">99,999,999,999.99</td>
			<td align="center">dd/mm/yyyy</td>
			<td align="center">xxxx50xxxx</td>
			<td align="center">dd/mm/yyyy</td>
			<td align="center">No</td>
			<td align="center"><input name="checkbox2" type="checkbox"
				value="checkbox"></td>
		</tr>
		<tr class="tdganjil">
			<td><a href="javascript:;"
				onClick="MM_openBrWindow('../Marketing/SuplierView.htm','ViewSupplier','scrollbars=yes,width=900,height=700')">xxxx50xxxx</a></td>
			<td><a href="javascript:;"
				onClick="MM_openBrWindow('../Finance/ViewAPRefundCustomer.htm','APRefundCustomer','scrollbars=yes,left=1,top=1,width=800,height=300')">AP
					Refund To Customer</a></td>
			<td align="right">99,999,999,999.99</td>
			<td align="center">dd/mm/yyyy</td>
			<td align="center">xxxx50xxxx</td>
			<td align="center">dd/mm/yyyy</td>
			<td align="center">Yes</td>
			<td align="center"><input name="checkbox" type="checkbox"
				value="checkbox"></td>
		</tr>
		<tr class="tdgenap">
			<td><a href="javascript:;"
				onClick="MM_openBrWindow('../Marketing/SuplierView.htm','ViewSupplier','scrollbars=yes,width=900,height=700')">xxxx50xxxx</a></td>
			<td>xxxx50xxxx</td>
			<td align="right">99,999,999,999.99</td>
			<td align="center">dd/mm/yyyy</td>
			<td align="center">xxxx50xxxx</td>
			<td align="center">dd/mm/yyyy</td>
			<td align="center">No</td>
			<td align="center"><input name="checkbox2" type="checkbox"
				value="checkbox"></td>
		</tr>
		<tr class="tdganjil">
			<td><a href="javascript:;"
				onClick="MM_openBrWindow('../Marketing/SuplierView.htm','ViewSupplier','scrollbars=yes,width=900,height=700')">xxxx50xxxx</a></td>
			<td>xxxx50xxxx</td>
			<td align="right">99,999,999,999.99</td>
			<td align="center">dd/mm/yyyy</td>
			<td align="center">xxxx50xxxx</td>
			<td align="center">dd/mm/yyyy</td>
			<td align="center">Yes</td>
			<td align="center"><input name="checkbox" type="checkbox"
				value="checkbox"></td>
		</tr>
		<tr class="tdgenap">
			<td><a href="javascript:;"
				onClick="MM_openBrWindow('../Marketing/SuplierView.htm','ViewSupplier','scrollbars=yes,width=900,height=700')">xxxx50xxxx</a></td>
			<td>xxxx50xxxx</td>
			<td align="right">99,999,999,999.99</td>
			<td align="center">dd/mm/yyyy</td>
			<td align="center">xxxx50xxxx</td>
			<td align="center">dd/mm/yyyy</td>
			<td align="center">No</td>
			<td align="center"><input name="checkbox2" type="checkbox"
				value="checkbox"></td>
		</tr>
		<tr class="tdganjil">
			<td><a href="javascript:;"
				onClick="MM_openBrWindow('../Marketing/SuplierView.htm','ViewSupplier','scrollbars=yes,width=900,height=700')">xxxx50xxxx</a></td>
			<td>xxxx50xxxx</td>
			<td align="right">99,999,999,999.99</td>
			<td align="center">dd/mm/yyyy</td>
			<td align="center">xxxx50xxxx</td>
			<td align="center">dd/mm/yyyy</td>
			<td align="center">Yes</td>
			<td align="center"><input name="checkbox" type="checkbox"
				value="checkbox"></td>
		</tr>
		<tr class="tdgenap">
			<td><a href="javascript:;"
				onClick="MM_openBrWindow('../Marketing/SuplierView.htm','ViewSupplier','scrollbars=yes,width=900,height=700')">xxxx50xxxx</a></td>
			<td>xxxx50xxxx</td>
			<td align="right">99,999,999,999.99</td>
			<td align="center">dd/mm/yyyy</td>
			<td align="center">xxxx50xxxx</td>
			<td align="center">dd/mm/yyyy</td>
			<td align="center">No</td>
			<td align="center"><input name="checkbox2" type="checkbox"
				value="checkbox"></td>
		</tr>
		<tr class="tdjudulhijau2">
			<td><strong>Total</strong></td>
			<td>&nbsp;</td>
			<td align="right"><strong>99,999,999,999.99</strong></td>
			<td align="center">&nbsp;</td>
			<td align="center">&nbsp;</td>
			<td align="center">&nbsp;</td>
			<td align="center">&nbsp;</td>
			<td align="center">&nbsp;</td>
		</tr>
	</table>
	<table width="95%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td width="50%" height="30">&nbsp;</td>
			<td width="50%" align="right"><a href="ApSelectionEntry.jsp" class="btn btn-sm btn-primary">Lanjut</a></td>
		</tr>
	</table>
	</div>
	<!-- 	</div> -->
	</div>
	<!-- /container -->
</body>
</html>