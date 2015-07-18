<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>COLLECTION</title>
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
<form id="FrmRptCollectibilityInputParameter" runat="server">
<div align="center">
  <table style="width: 95%">
	<tr>
		<td class="style5">&nbsp;*) <font color="red"><i>&nbsp;required field</i></font></td>
	</tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">ACCOUNT ANALIZER REPORT</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style2" style="width: 28%">Collection Group</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbBranch" CssClass="inptype">
	        <asp:ListItem>Select One</asp:ListItem>					
		</asp:DropDownList>
		&nbsp;<span class="style4">*)</span></td>
    </tr>
    <tr> 
      <td class="style2" style="width: 28%">Period</td>
      <td class="style1">
		<span class="style4">
		<asp:DropDownList runat="server" id="CmbPeriodMonth" CssClass="inptype">
	        <asp:ListItem>Select One</asp:ListItem>							
	        <asp:ListItem>January</asp:ListItem>
	        <asp:ListItem>February</asp:ListItem>
	        <asp:ListItem>March</asp:ListItem>
	        <asp:ListItem>April</asp:ListItem>
	        <asp:ListItem>May</asp:ListItem>
	        <asp:ListItem>June</asp:ListItem>
	        <asp:ListItem>July</asp:ListItem>
	        <asp:ListItem>August</asp:ListItem>
	        <asp:ListItem>September</asp:ListItem>
	        <asp:ListItem>October</asp:ListItem>
	        <asp:ListItem>November</asp:ListItem>
	        <asp:ListItem>December</asp:ListItem>
		</asp:DropDownList>
		&nbsp;&nbsp; </span><span class="style7">Year</span><span class="style4">
&nbsp;
		<asp:TextBox runat="server" id="TbnPeriodYear" Width="79px" CssClass="inptype">
		</asp:TextBox>
&nbsp;&nbsp; *)</span></td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		&nbsp;&nbsp;&nbsp; 
        <asp:ImageButton runat="server" id="BtnViewReport" ImageUrl="../../images/ButtonViewReport.gif" PostBackUrl="ReportAccountAnalizer.aspx" />&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
