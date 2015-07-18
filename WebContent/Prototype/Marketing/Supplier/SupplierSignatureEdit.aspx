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
.style5 {
	color: #FF0000;
}
</style>
</head>

<body>
<form id="FrmSupplierSignatureAdd" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3" class="style4"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER SIGNATURE - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style1" style="width: 25%">Name</td>
      <td class="style3">
		Silvia Tjandra&nbsp;
		&nbsp;<span class="style5">*)</span></td>
    </tr>
    <tr> 
      <td class="style1" style="width: 25%">Job Title</td>
      <td class="style3">
        <asp:TextBox runat="server" id="TbsJobTitle" Width="200px" CssClass="inptype">Direktur Pemasaran</asp:TextBox>
&nbsp; <span class="style5">*)</span></td>
    </tr>
    <tr> 
      <td class="style1" style="width: 25%">Signature</td>
      <td class="style3">
        <asp:TextBox runat="server" id="TbsSignature" Width="246px" CssClass="inptype">C:\Documents and Settings\pictures\ttdPakCahyo1.jpg</asp:TextBox>
		&nbsp; <span class="style5">
		<asp:Button runat="server" Text="Browse ..." id="BtnBrowse" Height="20px" />&nbsp; *)</span></td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="SupplierSignature.aspx" />&nbsp; 
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="SupplierSignature.aspx" />&nbsp; 
      </td>
    </tr>
  </table>
</div>
</form>
</body>

</html>
