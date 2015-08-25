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

<title>SMIILE - Smart Lesing And Consumer Finance Leasing</title>
</head>

<body>
	<%@include file="/Demo/Menu.jsp"%>
	<div class="container">

		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Demo/Header.jsp"%>
		<h1>Pembayaran Hutang</h1>

		<table width="95%" border="0" cellpadding="2" cellspacing="1"
			class="tablegrid">
			<tr>
				<td width="25%" class="tdgenap">Way of Payment</td>
				<td width="25%" class="tdganjil"><select name="select2">
						<option>Cash</option>
						<option selected>Bank</option>
				</select></td>
				<td width="25%" class="tdgenap">Bank Account</td>
				<td width="25%" class="tdganjil"><select name="select">
						<option selected>Select One</option>
						<option>Panin Bank</option>
				</select></td>
			</tr>
			<tr>
				<td class="tdgenap">AP Type</td>
				<td class="tdganjil">PO Supplier</td>
				<td class="tdgenap">AP Branch</td>
				<td class="tdganjil">KPO Jakarta</td>
			</tr>
			<tr>
				<td class="tdgenap">Currency</td>
				<td class="tdganjil">IDR</td>
				<td class="tdgenap">&nbsp;</td>
				<td class="tdganjil">&nbsp;</td>
			</tr>
		</table>
		<table width="95%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="50%" height="30">&nbsp;</td>
				<td width="50%" align="right"><a
					href="javascript:history.go(-1);"><img
						src="../Images/ButtonRequestForApproval.gif" width="180"
						height="20" border="0"> <img
						src="../Images/ButtonCancel.gif" width="100" height="20"
						border="0"></a></td>
			</tr>
		</table>
		<br>
		<table width="95%" border="0" cellspacing="0" cellpadding="0">
			<tr class="trtopikuning">
				<td width="10" height="20" class="tdtopihijau2kiri">&nbsp;</td>
				<td align="center" class="tdtopihijau2"><table width="100%"
						border="0" cellspacing="0" cellpadding="0">
						<tr class="tdtopihijau2">
							<td>AP Destination : PT. XYZ</td>
							<td align="right">&nbsp;</td>
						</tr>
					</table></td>
				<td width="10" class="tdtopihijau2kanan">&nbsp;</td>
			</tr>
		</table>
		<table width="95%" border="0" cellpadding="3" cellspacing="1"
			class="tablegrid">
			<tr align="center" class="tdjudulhijau2">
				<td>AP DETAIL</td>
				<td>AP BALANCE</td>
				<td>PAYMENT AMOUNT</td>
				<td>DUE DATE</td>
				<td>INVOICE NO.</td>
				<td>INVOICE DATE</td>
			</tr>
			<tr class="tdganjil">
				<td><a href="javascript:;"
					onClick="MM_openBrWindow('../Finance/ViewAPSupplier.htm','APSupplier','scrollbars=yes,width=900,height=350,Top=1,Left=1')">xxxx50xxxx</a></td>
				<td align="right">999,999,999,999.99</td>
				<td align="right"><div align="center">
						<input name="textfield32" type="text" class="inptype"
							value="9,999,999,999.99" size="18">
					</div></td>
				<td align="center">dd/mm/yyyy</td>
				<td align="center"><div align="left">xxxx20xxxx</div></td>
				<td align="center">dd/mm/yyyy</td>
			</tr>
			<tr class="tdgenap">
				<td><a href="javascript:;"
					onClick="MM_openBrWindow('../Finance/ViewAPSupplier.htm','APSupplier','scrollbars=yes,width=900,height=350')">xxxx50xxxx</a></td>
				<td align="right">999,999,999,999.99</td>
				<td align="right"><div align="center">
						<input name="textfield324" type="text" class="inptype"
							value="9,999,999,999.99" size="18">
					</div></td>
				<td align="center">dd/mm/yyyy</td>
				<td align="center"><div align="left">xxxx20xxxx</div></td>
				<td align="center">dd/mm/yyyy</td>
			</tr>
			<tr class="tdganjil">
				<td><a href="javascript:;"
					onClick="MM_openBrWindow('../Finance/ViewAPSupplier.htm','APSupplier','scrollbars=yes,width=900,height=350')">xxxx50xxxx</a></td>
				<td align="right">999,999,999,999.99</td>
				<td align="right"><div align="center">
						<input name="textfield325" type="text" class="inptype"
							value="9,999,999,999.99" size="18">
					</div></td>
				<td align="center">dd/mm/yyyy</td>
				<td align="center"><div align="left">xxxx20xxxx</div></td>
				<td align="center">dd/mm/yyyy</td>
			</tr>
			<tr align="center" class="tdjudulhijau2">
				<td><strong>Total</strong><strong> </strong></td>
				<td><strong>999,999,999,999.99</strong></td>
				<td><strong>999,999,999,999.99</strong></td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
		</table>
		<table width="95%" border="0" cellpadding="2" cellspacing="1"
			class="tablegrid">
			<tr align="center" class="tdjudulhijau2">
				<td colspan="4"><div align="left">BENEFICIARY INFORMATION</div></td>
			</tr>
			<tr>
				<td width="20%" class="tdgenap">Account Name</td>
				<td width="30%" class="tdganjil">PT. ABC</td>
				<td width="20%" class="tdgenap">Account No.</td>
				<td width="30%" class="tdganjil">99-999-12345</td>
			</tr>
			<tr>
				<td class="tdgenap">Bank Name</td>
				<td class="tdganjil">Citi Bank</td>
				<td class="tdgenap">Bank Branch</td>
				<td class="tdganjil">xxxxxxxxxxxxxxxxxxxx</td>
			</tr>
		</table>
		<br>
		<table width="95%" border="0" cellspacing="0" cellpadding="0">
			<tr class="trtopikuning">
				<td width="10" height="20" class="tdtopihijau2kiri">&nbsp;</td>
				<td align="center" class="tdtopihijau2"><table width="100%"
						border="0" cellspacing="0" cellpadding="0">
						<tr class="tdtopihijau2">
							<td>AP Destination : PT. ABC</td>
							<td align="right">&nbsp;</td>
						</tr>
					</table></td>
				<td width="10" class="tdtopihijau2kanan">&nbsp;</td>
			</tr>
		</table>
		<table width="95%" border="0" cellpadding="3" cellspacing="1"
			class="tablegrid">
			<tr align="center" class="tdjudulhijau2">
				<td>AP DETAIL</td>
				<td>AP BALANCE</td>
				<td>PAYMENT AMOUNT</td>
				<td>DUE DATE</td>
				<td>INVOICE NO.</td>
				<td>INVOICE DATE</td>
			</tr>
			<tr class="tdganjil">
				<td><a href="javascript:;"
					onClick="MM_openBrWindow('../Finance/ViewAPSupplier.htm','APSupplier','scrollbars=yes,width=900,height=350')">xxxx50xxxx</a></td>
				<td align="right">999,999,999,999.99</td>
				<td align="right"><div align="center">
						<input name="textfield322" type="text" class="inptype"
							value="9,999,999,999.99" size="18">
					</div></td>
				<td align="center">dd/mm/yyyy</td>
				<td align="center"><div align="left">xxxx20xxxx</div></td>
				<td align="center">dd/mm/yyyy</td>
			</tr>
			<tr class="tdgenap">
				<td><a href="javascript:;"
					onClick="MM_openBrWindow('../Finance/ViewAPSupplier.htm','APSupplier','scrollbars=yes,width=900,height=350')">xxxx50xxxx</a></td>
				<td align="right">999,999,999,999.99</td>
				<td align="right"><div align="center">
						<input name="textfield3242" type="text" class="inptype"
							value="9,999,999,999.99" size="18">
					</div></td>
				<td align="center">dd/mm/yyyy</td>
				<td align="center"><div align="left">xxxx20xxxx</div></td>
				<td align="center">dd/mm/yyyy</td>
			</tr>
			<tr class="tdganjil">
				<td><a href="javascript:;"
					onClick="MM_openBrWindow('../Finance/ViewAPSupplier.htm','APSupplier','scrollbars=yes,width=900,height=350')">xxxx50xxxx</a></td>
				<td align="right">999,999,999,999.99</td>
				<td align="right"><div align="center">
						<input name="textfield3252" type="text" class="inptype"
							value="9,999,999,999.99" size="18">
					</div></td>
				<td align="center">dd/mm/yyyy</td>
				<td align="center"><div align="left">xxxx20xxxx</div></td>
				<td align="center">dd/mm/yyyy</td>
			</tr>
			<tr align="center" class="tdjudulhijau2">
				<td><strong>Total</strong><strong> </strong></td>
				<td><strong>999,999,999,999.99</strong></td>
				<td><strong>999,999,999,999.99</strong></td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
		</table>
		<table width="95%" border="0" cellpadding="2" cellspacing="1"
			class="tablegrid">
			<tr align="center" class="tdjudulhijau2">
				<td colspan="4"><div align="left">BENEFICIARY INFORMATION</div></td>
			</tr>
			<tr>
				<td width="20%" class="tdgenap">Account Name</td>
				<td width="30%" class="tdganjil">PT. ABC</td>
				<td width="20%" class="tdgenap">Account No.</td>
				<td width="30%" class="tdganjil">99-999-12345</td>
			</tr>
			<tr>
				<td class="tdgenap">Bank Name</td>
				<td class="tdganjil">Citi Bank</td>
				<td class="tdgenap">Bank Branch</td>
				<td class="tdganjil">xxxxxxxxxxxxxxxxxxxx</td>
			</tr>
		</table>
		<table width="95%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="50%" height="30">&nbsp;</td>
				<td width="50%" align="right"><a href="APSelectionNext.htm"><img
						src="../Images/ButtonNext.gif" width="100" height="20" border="0"></a></td>
			</tr>
		</table>
	</div>
	<!-- 	</div> -->
	</div>
	<!-- /container -->
</body>
</html>