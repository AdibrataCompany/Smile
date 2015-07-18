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
.style5 {
	text-align: left;
	color: #FF0000;
}
.style4 {
	color: #FF0000;
}
.style6 {
	font-family: Verdana;
}
</style>
</head>

<body>
<form id="FrmStatusAPPaymentToDealerDownloadData" runat="server">
<div align="center">
  <table style="width: 100%">
	<tr>
		<td class="style5">&nbsp;&nbsp;&nbsp; <font color="red"><i>*)&nbsp;&nbsp; required field</i></font></td>
	</tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijau2kiri">&nbsp;</td>
      <td align="center" class="tdtopihijau2">STATUS AP PAYMENT TO DEALER 
		DOWNLOAD 
		DATA</td>
      <td width="10" class="tdtopihijau2kanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="style2">Supplier Name</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbsSearch" Width="323px" CssClass="inptype"></asp:TextBox>
&nbsp;&nbsp;
		<asp:HyperLink runat="server" id="LinkSupplierLookUp" ImageUrl="../../images/IconDetail.gif" NavigateUrl="../../LookUp/SupplierLookUp.aspx" Target="_blank">
		</asp:HyperLink>
		<font color="red"><i>&nbsp;&nbsp; *)</i></font></td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Sales Date Period</td>
      <td class="style1">
		<span class="style4">
		<asp:TextBox runat="server" id="TbdAgingDatePeriodFrom" CssClass="inptype">
		</asp:TextBox>
&nbsp;
		<asp:ImageButton runat="server" id="IcoGoLiveFrom" ImageUrl="../../images/iconcalendar.gif" />&nbsp;&nbsp; </span>
		<span class="style6">To</span><span class="style4">&nbsp;&nbsp;&nbsp;
		<asp:TextBox runat="server" id="TbdAgingDatePeriodTo" CssClass="inptype">
		</asp:TextBox>
&nbsp;&nbsp;
		<asp:ImageButton runat="server" id="IcoGoLiveTo" ImageUrl="../../images/iconcalendar.gif" />&nbsp;<font color="red"><i>*)</i></font></span></td>
    </tr>
    <tr> 
      <td width="25%" class="style2">File Name</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbsFileName" Width="323px" CssClass="inptype"></asp:TextBox>
&nbsp;<font color="red"><i>*)</i></font></td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Path</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbsPath" Width="290px" CssClass="inptype"></asp:TextBox>
&nbsp;
		<asp:Button runat="server" Text="Browse ..." id="BtnBrowse" />&nbsp;<font color="red"><i>*)</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		&nbsp; 
        <asp:ImageButton runat="server" id="BtnExecution" ImageUrl="../../images/ButtonExecution.gif" />&nbsp;</td>
    </tr>
  </table>
  <br />
</div>
</form>
</body>
</html>
