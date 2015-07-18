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

<title>DMS-Dealer Management System</title>
</head>

<body>
	<%@include file="/Demo/Menu.jsp"%>
	<div class="container">

		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Demo/Header.jsp"%>
		<h1>Pengeluaran Karyawan</h1>

		<table width="95%" border="0" cellpadding="2" cellspacing="1"
			class="tablegrid">
			<tr>
				<td class="tdgenap">Employee Name</td>
				<td class="tdganjil"><input name="textfield3224" type="text"
					class="inptype" size="25"> <a href="javascript:;"
					onClick="MM_openBrWindow('../Lookup/EmployeeLookUp.htm','LookUp','width=700,height=420')"><img
						src="../Images/IconDetail.gif" width="15" height="15" border="0"
						align="absmiddle"></a></td>
				<td class="tdgenap">Date</td>
				<td class="tdganjil">dd/mm/yyyy</td>
			</tr>
			<tr>
				<td width="20%" class="tdgenap">Bank Account</td>
				<td width="30%" class="tdganjil"><select name="select">
						<option selected>Select One</option>
						<option>Petty Cash On Hand</option>
						<option>BCA Petty Cash</option>
				</select></td>
				<td class="tdgenap">Amount<br> IDR
				</td>
				<td class="tdganjil">
					<div align="left">
						<input name="textfield32232" type="text" class="inptype" size="20">
					</div>
				</td>
			</tr>
			<tr>
				<td width="20%" class="tdgenap">Currency</td>
				<td width="30%" class="tdganjil">IDR</td>
				<td class="tdgenap">&nbsp;</td>
				<td class="tdganjil">&nbsp;</td>
			</tr>
			<tr>
				<td class="tdgenap">Department</td>
				<td colspan="3" class="tdganjil"><select name="select2">
						<option selected>Select One</option>
						<option>Marketing Departement</option>
						<option>General Administration</option>
				</select></td>
			</tr>
			<tr>
				<td class="tdgenap">Description</td>
				<td colspan="3" class="tdganjil"><input name="textfield3223"
					type="text" class="inptype" size="50"></td>
			</tr>
		</table>
		<table width="95%" border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td width="50%" height="30">&nbsp;</td>
				<td width="50%" align="right"><a href="PettyCashAddDetail.jsp"
					class="btn btn-sm btn-primary">Tambah</a> <a
					href="PettyCashAddDetail.jsp" class="btn btn-sm btn-primary">Ulang</a>

				</td>
			</tr>
		</table>
	</div>
	<!-- 	</div> -->
	</div>
	<!-- /container -->
</body>
</html>