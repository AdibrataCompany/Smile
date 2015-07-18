<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>FINANCE</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<style type="text/css">
.style1 {
	background-color: #FFFFFF;
	text-align: left;
}
.style2 {
	background-color: #F4FAFF;
	text-align: left;
}
.style4 {
	color: #FF0000;
}
.style5 {
	text-align: left;
	color: #FF0000;
}
</style>
</head>

<body>
<form id="FrmPaymentListingToBank" runat="server">
<div align="center">
  <table style="width: 100%">
	<tr>
		<td class="style5">&nbsp;&nbsp;&nbsp; <font color="red"><i>*)&nbsp;&nbsp; required field</i></font></td>
	</tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijau2kiri">&nbsp;</td>
      <td align="center" class="tdtopihijau2">PAYMENT LISTING TO BANK</td>
      <td width="10" class="tdtopihijau2kanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style2" style="width: 30%">AP Type</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbApType" CssClass="inptype">
	        <asp:ListItem>Select One</asp:ListItem>	
			<asp:ListItem>AP Fiducia To Notary</asp:ListItem>
			<asp:ListItem>AP To Executor</asp:ListItem>
			<asp:ListItem>AP To Third Party</asp:ListItem>
			<asp:ListItem>Commission Supplier Employee & Referantor</asp:ListItem>
			<asp:ListItem>Commission To Supplier</asp:ListItem>
			<asp:ListItem>Insurance</asp:ListItem>
			<asp:ListItem>Life Insurance</asp:ListItem>
			<asp:ListItem>Refund Customer</asp:ListItem>
			<asp:ListItem>PO Supplier</asp:ListItem>
			<asp:ListItem>KTA</asp:ListItem>
			<asp:ListItem>AP Tax To Company</asp:ListItem>
			<asp:ListItem>AP Tax To Executor</asp:ListItem>
			<asp:ListItem>AP Tax To Personal</asp:ListItem>
			<asp:ListItem>AP Tax To Third Party</asp:ListItem>

		</asp:DropDownList>
&nbsp; <span class="style4">*)</span></td>
    </tr>
    <tr> 
      <td class="style2" style="width: 30%">Bank Destination</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbBankDestination" CssClass="inptype">
		    <asp:ListItem>All</asp:ListItem>
			<asp:ListItem>BCA</asp:ListItem>
			<asp:ListItem>BRI</asp:ListItem>
		</asp:DropDownList>
&nbsp;
		&nbsp; <span class="style4">*)</span></td>
    </tr>
    <tr> 
      <td class="style2" style="width: 30%">Payment Voucher Date &lt;=</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbdPaymentVoucherDate" CssClass="inptype"></asp:TextBox>
		&nbsp;
		<asp:ImageButton runat="server" id="BtnCalendar" ImageUrl="../../images/iconcalendar.gif" />
		</td>
    </tr>
    <tr> 
      <td class="style2" style="width: 30%">Printed Status</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbPrintedStatus" CssClass="inptype">
		    <asp:ListItem>No</asp:ListItem>
			<asp:ListItem>Yes</asp:ListItem>			
		</asp:DropDownList>
		</td>
    </tr>
    <tr> 
      <td class="style2" style="width: 30%">Search By</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbSearch" CssClass="inptype">
			<asp:ListItem>Payment Voucher No.</asp:ListItem>
			<asp:ListItem>Payment Voucher Date</asp:ListItem>
			<asp:ListItem>Supplier Name</asp:ListItem>			
			<asp:ListItem>Order Of Transfer No.</asp:ListItem>			
		</asp:DropDownList>
&nbsp;
		<asp:TextBox runat="server" id="TbsSearch" CssClass="inptype"></asp:TextBox>
&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" PostBackUrl="PaymentListingToBank.aspx" />&nbsp; 
        <asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" PostBackUrl="PaymentListingToBank.aspx" />&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
