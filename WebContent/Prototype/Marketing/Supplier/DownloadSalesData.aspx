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
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">DOWNLOAD 
		SALES DATA</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="style2">Branch</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbBranch" CssClass="inptype">
	        <asp:ListItem>All</asp:ListItem>	
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
		&nbsp;
		<font color="red"><i>*)</i></font></td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Marketing Group</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbMarketingGroup" CssClass="inptype">
	        <asp:ListItem>Electronic</asp:ListItem>	
			<asp:ListItem>Motorcycle</asp:ListItem>
			<asp:ListItem>KTA</asp:ListItem>						
		</asp:DropDownList>
&nbsp;&nbsp;
		<font color="red"><i>&nbsp;&nbsp; *)</i></font></td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Sales Date Period</td>
      <td class="style1">
		<span class="style4">
		<asp:TextBox runat="server" id="TbdSalesDatePeriodFrom" CssClass="inptype">
		</asp:TextBox>
&nbsp;
		<asp:ImageButton runat="server" id="IcoGoLiveFrom" ImageUrl="../../images/iconcalendar.gif" />&nbsp;&nbsp; </span>
		<span class="style6">To</span><span class="style4">&nbsp;&nbsp;&nbsp;
		<asp:TextBox runat="server" id="TbdSalesDatePeriodTo" CssClass="inptype">
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
