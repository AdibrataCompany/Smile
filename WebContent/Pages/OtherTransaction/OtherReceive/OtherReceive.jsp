<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>SMIILE - Smart Lesing And Consumer Finance Leasing</title>


</head>
<body>
	<%@include file="/Pages/Menu.jsp"%>
	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Pages/Header.jsp"%>
		<s:form action="otherreceive.action" theme="simple">
			<center>
				<h1>Penerimaan Bukan Hutang</h1>
				<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
				<table width="100%">
					<tr>
						<td width="20%">Terima Dari</td>
						<td width="30%"><s:textfield name="rcvFrom" /></td>
						<td width="20%">Cara Bayar</td>
						<td width="30%">
							<select name="payment">
									<option value="">Select Payment</option>
									<option value="cash">Cash</option>
									<option value="bank">Bank</option>
							</select> - 
							
							<%-- <select name="type">
							<option value="">Select Type</option>
							<option value="1">Citi Bank Escrow</option>
							<option value="2">BCA Escrow</option>
							</select> --%>
							
							<s:select list="bankAccountList" name="bankAccountType"
							headerKey="" key="bankAccount.id" headerValue="Select Type"  />
						
						</td>
					</tr>
					<tr>
						<td>Reference No</td>
						<td><s:textfield name="reffNo" /></td>
						<td>Rekening Bank</td>
						<td><s:textfield name="bankAccountId" type="text" /></td>
					</tr>
					<tr>
						<td>Tanggal Transaksi</td>
						<%@include file="/Pages/DatePicker.jsp"%>
						<td>Jumlah Penerimaan</td>
						<td>IDR <s:textfield name="rcvAmount" /></td>
					</tr>
					<tr>
						<td valign="top">Notes</td>
						<td colspan="3"><s:textarea name="notes" /></td>
					</tr>
				</table>
				<br>
				<s:label name="message" />
				<table class="table table-stripped">
					<tr>
						<th colspan="4">TRANSACTION</th>
					</tr>
					<tr>
						<td width="20%">COA Name</td>
						<td width="30%"><input name="coaName" type="text">
							<button type="submit" onclick="lookup()">
								<span class="glyphicon glyphicon-search"></span>
							</button> <s:hidden name="coaCode" /></td>
					</tr>
					<tr>
						<td width="25%">Amount</td>
						<td width="25%"><input name="amount" type="text"></td>
					</tr>
					<tr>
						<td valign="top">Description</td>
						<td><textarea rows="5" cols="30" name="description"></textarea></td>
					</tr>
				</table>
				<br>
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td><button type="submit" class="btn btn-sm btn-primary"
								onclick="savedel()">Hapus</button></td>
						<th align="center">TRANSACTION DETAIL</th>
						<td align="right"><button type="submit"
								class="btn btn-sm btn-primary" onclick="saveadd()">Tambah</button>
					</tr>
				</table>
				<br>
				<table width="100%" border="1" cellpadding="3" cellspacing="1"
					class="tablegrid">
					<tr>
						<th width="5%" style="text-align: center;">Pilih</th>
						<th style="text-align: center;">COA Name</th>
						<th style="text-align: center;">COA Code</th>
						<th style="text-align: center;">Keterangan</th>
						<th style="text-align: center;">Jumlah</th>
					</tr>
					<s:iterator value="lstOtherRcvDtl" status="stat">
						<tr>

							<td style="text-align: center;"><input type="radio"
								name="SeqNo" id="SeqNo"
								value="<s:property value="#stat.count"/>" checked /></td>
							<td>${coaName}</td>
							<td>${coaCode}</td>
							<td>${description}</td>
							<td style="text-align: right;">${amount}</td>
						</tr>
					</s:iterator>
					<tr>
						<th colspan="4" style="text-align: right;">Total :</th>
						<td align="right">${totalAmount}</td>
					</tr>
				</table>
				<br>
				<table width="100%">
					<tr>
						<td align="right"><button type="submit" onclick="save()"
								class="btn btn-sm btn-primary">Simpan</button></td>
					</tr>
				</table>
			</center>
		</s:form>
	</div>
	<!-- /container -->
</body>
<script type="text/javascript">
	function lookup() {
		document.getElementById("mode").value = "lookup";
	}
	function savedel() {
		document.getElementById("mode").value = "savedel";
	}
	function saveadd() {
		document.getElementById("mode").value = "saveadd";
	}
	function save() {
		document.getElementById("mode").value = "save";
	}
</script>
</html>