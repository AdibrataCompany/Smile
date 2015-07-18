<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>MARKETING</title>
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
.style7 {
	font-family: Verdana;
}
</style>
</head>

<body>
<form id="FrmRptSupplierIncentiveInputParameter" runat="server">
<div align="center">
  <table style="width: 100%">
	<tr>
		<td class="style5">&nbsp;&nbsp;&nbsp; <font color="red"><i>*)&nbsp;&nbsp; required field</i></font></td>
	</tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">SUPPLIER INCENTIVE REPORT</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style2" style="width: 28%">Branch</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbBranch">
	        <asp:ListItem>Select One</asp:ListItem>	
			<asp:ListItem>MEDAN</asp:ListItem>
			<asp:ListItem>JAMBI</asp:ListItem>
			<asp:ListItem>PEKANBARU</asp:ListItem>
			<asp:ListItem>BATAM</asp:ListItem>
			<asp:ListItem>GRAND WIJAYA</asp:ListItem>
			<asp:ListItem>BEKASI</asp:ListItem>
			<asp:ListItem>TANGERANG</asp:ListItem>
			<asp:ListItem>BANDUNG</asp:ListItem>
			<asp:ListItem>SEMARANG</asp:ListItem>			
		</asp:DropDownList>
		&nbsp;<span class="style4">*)</span></td>
    </tr>
    <tr>
      <td class="style2" style="width: 28%">Period</td>
      <td class="style1">
		<span class="style4">
		<asp:TextBox runat="server" id="TbdPeriodeFrom" Height="18px" Width="120px">
		</asp:TextBox>
		</span>&nbsp;<span class="style4"><asp:ImageButton runat="server" id="IcoCalender" ImageUrl="../../images/iconcalendar.gif" />&nbsp; </span>
		<span class="style7">To</span><span class="style4">&nbsp;
		<asp:TextBox runat="server" id="TbdPeriodeTo" Height="18px" Width="120px">
		</asp:TextBox>
		&nbsp;<asp:ImageButton runat="server" id="IcoCalender0" ImageUrl="../../images/iconcalendar.gif" />&nbsp; *)</span></td>
    </tr>
    <tr>
      <td class="style2" style="width: 28%">Divisi</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbOption">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem>Accounting</asp:ListItem>
			<asp:ListItem>Marketing</asp:ListItem>			
		</asp:DropDownList>
		</td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		&nbsp;&nbsp;&nbsp; 
        <asp:ImageButton runat="server" id="BtnViewReport" ImageUrl="../../images/ButtonViewReport.gif" PostBackUrl="ReportSupplierIncentiveAcc.aspx" />&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>