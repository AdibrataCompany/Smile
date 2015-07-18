<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>SUPPLIER</title>
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
</style>
</head>

<body>
<form id="FrmSupplierBranchAdd" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="style2">Supplier Name</td>
      <td class="style1">
		<asp:HyperLink runat="server" id="LinkSupplierView" NavigateUrl="SupplierView.aspx" Target="_blank">PT. XXXXX
		</asp:HyperLink>
		</td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER - ASSIGN BRANCH</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center"> 
    <div align="center"> 
      <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
        <tr align="center" class="tdjudulhijau"> 
          <td width="20%">ASSIGN</td>
          <td><div align="left">BRANCH</div></td>
        </tr>
        <tr class="tdganjil"> 
          <td align="center">
			<asp:CheckBox runat="server" id="CbSelectSupplier" Checked="True" /></td>
          <td align="center"><div align="left">MEDAN</div></td>
        </tr>
        <tr class="tdgenap"> 
          <td class="tdgenap">
			<asp:CheckBox runat="server" id="CbSelectSupplier0" Checked="True" /></td>
          <td align="center"><div align="left">JAMBI</div></td>
        </tr>
        <tr class="tdganjil"> 
          <td align="center">
			<asp:CheckBox runat="server" id="CbSelectSupplier1" Checked="True" /></td>
          <td align="center"><div align="left">PEKANBARU</div></td>
        </tr>
        <tr class="tdgenap"> 
          <td align="center" class="tdgenap">
			<asp:CheckBox runat="server" id="CbSelectSupplier2" Checked="True" /></td>
          <td align="center"><div align="left">BATAM</div></td>
        </tr>
        <tr class="tdganjil"> 
          <td align="center">
			<asp:CheckBox runat="server" id="CbSelectSupplier3" Checked="True" /></td>
          <td align="center"><div align="left">GRAND WIJAYA</div></td>
        </tr>
      </table>
    </div>
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnAdd" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="SupplierBranch.aspx" />
		&nbsp;
		<asp:ImageButton runat="server" id="BtnAdd0" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="SupplierBranch.aspx" />&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
