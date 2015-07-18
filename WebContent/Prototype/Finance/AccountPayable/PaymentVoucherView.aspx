<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>FINANCE</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<script language="JavaScript" type="text/JavaScript">

function myClose() {
    close();}

</script >

<style type="text/css">
.style4 {
	text-align: left;
}
.style6 {
	background-color: #B7E39F;
	font-weight: bold;
	text-align: left;
}
.style7 {
	font-weight: normal;
}
.style8 {
	text-align: right;
}
.style9 {
	background-color: #EAF9DF;
	font-weight: bold;
	font-size: 10px;
	text-align: left;
}
.style10 {
	background-color: #F4FAFF;
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmPaymentVoucherView" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijau2">&nbsp;</td>
      <td class="style6">AP Destination : <span class="style7">
		xxxxxxxx50xxxxxxxx&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<strong>Due Date : </strong>dd/mm/yyyy</span></td>
      <td width="10" class="tdtopihijau2kanan">&nbsp;</td>
    </tr>
  </table>
  <table style="width: 95%" class="tablegrid">
	<tr class="tdjudulhijau2">
		<td class="tdjudulhijau2" style="width: 127px">
		<strong class="tdjudulhijau2">AP DETAIL</strong></td>
		<td style="width: 121px"><strong>AP BALANCE</strong></td>
		<td style="width: 149px"><strong>PAYMENT AMOUNT</strong></td>
		<td style="width: 104px"><strong>INVOICE NO</strong></td>
		<td><strong>INVOICE DATE</strong></td>
	</tr>
	<tr class="tdganjil">
		<td style="width: 127px" class="style4">xxxxx20xxxxx - 
		xxxxxxxx50xxxxxxxx</td>
		<td style="width: 121px" class="style8">999,999,999</td>
		<td style="width: 149px" class="style8">999,999,999</td>
		<td style="width: 104px" class="style4">xxxxx20xxxxx</td>
		<td class="style4">dd/mm/yyyy</td>
	</tr>
	<tr class="tdjudulhijau2">
		<td style="width: 127px">TOTAL</td>
		<td style="width: 121px" class="style8">999,999,999</td>
		<td style="width: 149px" class="style8">999,999,999</td>
		<td style="width: 104px">&nbsp;</td>
		<td>&nbsp;</td>
	</tr>
	</table>
	<br />
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="40%" class="style9">BENEFICIARY INFORMATION </td>
        </tr>
        </table>
    	<table style="width: 95%" class="tablegrid">
			<tr class="tdganjil">
				<td class="style10" style="width: 137px">Account Name&nbsp;</td>
				<td style="width: 145px" class="style4">xxxxxxxx50xxxxxxxx</td>
				<td style="width: 154px" class="style10">Account No&nbsp;</td>
				<td class="style4">xxxxxxxx50xxxxxxxx</td>
			</tr>
			<tr class="tdganjil">
				<td style="height: 17px; width: 137px" class="style10">Bank Name</td>
				<td style="height: 17px; width: 145px" class="style4">
				xxxxxxxx50xxxxxxxx</td>
				<td style="height: 17px; width: 154px" class="style10">Bank 
				Branch</td>
				<td style="height: 17px" class="style4">xxxxxxxx50xxxxxxxx</td>
			</tr>
			<tr class="tdganjil">
				<td colspan="4" class="style9">PAYMENT VOUCHER DETAIL&nbsp;</td>
			</tr>
			<tr class="tdganjil">
				<td style="width: 137px" class="style10">Branch&nbsp;</td>
				<td style="width: 145px" class="style4">xxxxxxxx50xxxxxxxx</td>
				<td style="width: 154px" class="style10">AP Type</td>
				<td class="style4">xxxxx20xxxxx</td>
			</tr>
			<tr class="tdganjil">
				<td style="width: 137px" class="style10">PV No&nbsp;</td>
				<td style="width: 145px" class="style4">xxxxx20xxxxx</td>
				<td style="width: 154px" class="style10">PV Date</td>
				<td class="style4">dd/mm/yyyy</td>
			</tr>
			<tr class="tdganjil">
				<td style="width: 137px" class="style10">Way Of Payment&nbsp;</td>
				<td style="width: 145px" class="style4">Bank/Cash</td>
				<td style="width: 154px" class="style10">Bank Account&nbsp;</td>
				<td class="style4">xxxxxxxx50xxxxxxxx</td>
			</tr>
			<tr class="tdganjil">
				<td style="width: 137px" class="style10">BG No.&nbsp;</td>
				<td style="width: 145px" class="style4">-</td>
				<td style="width: 154px" class="style10">BG Due Date&nbsp;</td>
				<td class="style4">-</td>
			</tr>
			<tr class="tdganjil">
				<td style="width: 137px" class="style10">Receipt Name&nbsp;</td>
				<td colspan="3" class="style4">-</td>
			</tr>
			<tr class="tdganjil">
				<td style="width: 137px" class="style10">Payment Notes&nbsp;</td>
				<td colspan="3" class="style4">-</td>
			</tr>
			<tr class="tdganjil">
				<td colspan="4" class="style9">STATUS &nbsp;</td>
			</tr>
			<tr class="tdganjil">
				<td style="width: 137px" class="style10">Status&nbsp;</td>
				<td style="width: 145px" class="style4">Approved</td>
				<td style="width: 154px" class="style10">Status Date&nbsp;</td>
				<td class="style4">dd/mm/yyyy</td>
			</tr>
			<tr class="tdganjil">
				<td style="width: 137px" class="style10">Request By&nbsp;</td>
				<td style="width: 145px" class="style4">xxxxx20xxxxx</td>
				<td style="width: 154px" class="style10">&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr class="tdganjil">
				<td style="width: 137px" class="style10">Approval By&nbsp;</td>
				<td style="width: 145px" class="style4">-</td>
				<td style="width: 154px" class="style10">Approval Date&nbsp;</td>
				<td class="style4">-</td>
			</tr>
			<tr class="tdganjil">
				<td style="width: 137px" class="style10">Approval Notes&nbsp;</td>
				<td colspan="3" class="style4">-</td>
			</tr>
		</table>
    </div>
    
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30" class="style4">
		<asp:ImageButton runat="server" id="BtnClose0" ImageUrl="../../images/ButtonViewReport.gif" PostBackUrl="ReportPaymentVoucherRequestView.aspx"/>&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnClose" ImageUrl="../../images/ButtonExit.gif" onclientclick="myClose();"/></td>
    </tr>
    <tr> 
      <td width="50%" height="30" class="style4">
		&nbsp;</td>
      <td width="50%" align="right">
		&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
