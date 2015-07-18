<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>FINANCE</title>
<link rel="stylesheet" type="text/css" href="../../../Confins.css" />
<script language="JavaScript" type="text/JavaScript">

function myClose() {
    close();}

</script >

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
      <td align="center" class="tdtopihijau2">USER VALIDASI</td>
      <td width="10" class="tdtopihijau2kanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style2" style="width: 28%">User Name</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbUserName">
	        <asp:ListItem>Select One</asp:ListItem>	
		</asp:DropDownList>
&nbsp; <span class="style4">*)</span></td>
    </tr>
    <tr> 
      <td class="style2" style="width: 28%">Password</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbsPassword"></asp:TextBox>
		&nbsp;<span class="style4">*)</span></td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		&nbsp;&nbsp;&nbsp; 
          <asp:ImageButton runat="server" id="BtnNext" ImageUrl="../../../images/ButtonNext.gif" PostBackUrl="ReportPaymentListingToBankInputParameter.aspx" /></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
