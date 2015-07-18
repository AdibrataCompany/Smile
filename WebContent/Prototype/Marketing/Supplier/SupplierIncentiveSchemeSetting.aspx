<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>MARKETING</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<style type="text/css">
.style1 {
	background-color: #F4FAFF;
	text-align: left;
}
.style2 {
	background-color: #FFFFFF;
	text-align: left;
}
.style3 {
	text-align: left;
}
.style4 {
	color: #000000;
}
</style>
</head>

<body>
<form id="FrmSupplierBranchEdit" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3" class="style3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">INCENTIVE SCHEME</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style1" style="width: 169px">Supplier Name</td>
      <td class="style2">PT. XXXXX</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 169px">Branch</td>
      <td class="style2">GRAND WIJAYA</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 169px">Maximal Refund To Supplier</td>
      <td class="style2">
		<font color="red">
		<asp:TextBox runat="server" id="TbnMaximalRefund" CssClass="inptype">
		</asp:TextBox>
&nbsp; </font><span class="style4">Per Agreement</span><font color="red">&nbsp; 
		*)</font> </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="SupplierBranch.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="SupplierBranch.aspx" /> 
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
