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
<form id="FrmRptRepoAsseByAsOfAgingtInputParameter" runat="server">
<div align="center">
  <table style="width: 95%">
	<tr>
		<td class="style5">&nbsp;*) <font color="red"><i>&nbsp;required field<br />
		**) Will be disable if&nbsp; Type = &#39; Summary &#39;</i></font></td>
	</tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">REPOSSESS ASSET BY AS OF AGING REPORT</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style2" style="width: 28%">Branch</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbBranch">
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
		&nbsp;<span class="style4">*)</span></td>
    </tr>
    <tr> 
      <td class="style2" style="width: 28%">Asset Type</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbAssetType">
	        <asp:ListItem>Select One</asp:ListItem>						
		</asp:DropDownList>
		&nbsp;<span class="style4">*)</span></td>
    </tr>
    <tr> 
      <td class="style2" style="width: 28%">Type</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbType">
	        <asp:ListItem>Select One</asp:ListItem>	
			<asp:ListItem>Summary</asp:ListItem>
			<asp:ListItem>Detail</asp:ListItem>									
		</asp:DropDownList>
		&nbsp;<span class="style4">*)</span></td>
    </tr>
    <tr> 
      <td class="style2" style="width: 28%">As Of Aging Date</td>
      <td class="style1">
		<span class="style4">
		<asp:TextBox runat="server" id="TbdAging" Height="18px" Width="143px">
		</asp:TextBox>
		&nbsp;<asp:ImageButton runat="server" id="IcoCalender0" ImageUrl="../../images/iconcalendar.gif" /></span></td>
    </tr>
    <tr>
      <td class="style2" style="width: 28%">Is FPD</td>
      <td class="style1">
		<asp:CheckBox runat="server" id="CbFpd" Text="Yes" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
		FPD <span class="style4">&nbsp;</span><span class="style7">&lt;=</span><span class="style4">&nbsp;
		<asp:TextBox runat="server" id="TbnFpd" Height="18px" Width="79px">
		</asp:TextBox>
		&nbsp; </span><span class="style7">days&nbsp; <span class="style4">**)</span></span></td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		&nbsp;&nbsp;&nbsp; 
        <asp:ImageButton runat="server" id="BtnViewReport" ImageUrl="../../images/ButtonViewReport.gif" PostBackUrl="ReportRepossedAssetAsOfAging.aspx" />&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
