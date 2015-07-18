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
</style>
</head>

<body>
<form id="FrmSPPrintingAwal" runat="server">
<div align="center">
  <table style="width: 100%">
	<tr>
		<td class="style5">&nbsp;&nbsp;&nbsp; <font color="red"><i>*)&nbsp;&nbsp; required field</i></font></td>
	</tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">SP PRINTING</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr>
      <td width="25%" class="style2">Branch</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbBranch" CssClass="inptype">
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
		&nbsp; <span class="style4">*)</span></td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Collector Name</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbCollector" CssClass="inptype">
	        <asp:ListItem>Select One</asp:ListItem>						
	        <asp:ListItem>xxxxxxxx50xxxxxxxx</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
    <tr> 
      <td width="25%" class="style2">SP Date</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbdSpDate" CssClass="inptype"></asp:TextBox>
&nbsp;
		<asp:ImageButton runat="server" id="IcoCalendar" ImageUrl="../../images/iconcalendar.gif" /></td>
    </tr>
    <tr> 
      <td width="25%" class="style2">SP Type</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbSpType" CssClass="inptype">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem>SP 1</asp:ListItem>
			<asp:ListItem>SP 2</asp:ListItem>			
			<asp:ListItem>SP 3</asp:ListItem>			
		</asp:DropDownList>
&nbsp;
		&nbsp;<span class="style4">*)</span></td>
    </tr>
  	<tr>
      <td width="25%" class="style2">Search By</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbSearch" CssClass="inptype">
			<asp:ListItem>Agreement No.</asp:ListItem>
			<asp:ListItem>Customer Name</asp:ListItem>						
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
		<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" PostBackUrl="SPPrinting.aspx" />&nbsp; 
        <asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" PostBackUrl="SPPrinting.aspx" />&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
