<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>*</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<style type="text/css">
.style1 {
	background-color: #F4FAFF;
	text-align: left;
}
.style3 {
	background-color: #FFFFFF;
	text-align: left;
}
.style4 {
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmSupplierBadStatus" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3" class="style4">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER BAD STATUS</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style1" style="width: 25%">Supplier Group</td>
      <td class="style3">
		Group</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 25%">Supplier Name</td>
      <td class="style3">
        XXXXX</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 25%">Short Name</td>
      <td class="style3">
        XXXXX</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 25%">Initial Name</td>
      <td class="style3">
        XXXXX</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 25%">NPWP</td>
      <td class="style3">
        XXXXX</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 25%">TDP</td>
      <td class="style3">
        XXXXX</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 25%">SIUP</td>
      <td class="style3">
        XXXXX</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 25%">Supplier Type</td>
      <td class="style3">
        Company</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 25%">Is Active</td>
      <td class="style3">
        Yes</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 25%">Bad Status</td>
      <td class="style3">
			<asp:RadioButton runat="server" id="RdBtnNormal" Text="Normal" Checked="True" />&nbsp;&nbsp;&nbsp;
			<asp:RadioButton runat="server" id="RdBtnBad" Text="Bad" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<asp:RadioButton runat="server" id="RdBtnWarning" Text="Warning" /> </td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="Supplier.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="Supplier.aspx" />&nbsp; 
      </td>
    </tr>
  </table>
</div>
</form>
</body>

</html>
