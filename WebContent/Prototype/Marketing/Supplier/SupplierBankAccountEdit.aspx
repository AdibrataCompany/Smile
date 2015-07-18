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
<form id="FrmSupplierBankAccountAdd" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3" class="style4"><font color="red"><i>*)&nbsp;&nbsp;&nbsp; required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER BANK ACCOUNT - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style1" style="width: 25%">Bank Name</td>
      <td class="style3">
		<asp:TextBox runat="server" id="TbsBankName" Width="150px" CssClass="inptype">BCA</asp:TextBox>
&nbsp;
		<asp:HyperLink runat="server" id="LinkDetail" ImageUrl="../../images/IconDetail.gif" NavigateUrl="../../Setting/General/BankMasterLookUp.aspx" Target="_blank">
		</asp:HyperLink>
		&nbsp; <span class="style5">*)</span></td>
    </tr>
    <tr> 
      <td class="style1" style="width: 25%">Bank Branch</td>
      <td class="style3">
        <asp:TextBox runat="server" id="TbsBankBranch" Width="200px" CssClass="inptype">Kebon Jeruk</asp:TextBox>
&nbsp;&nbsp; <span class="style5">*)</span></td>
    </tr>
    <tr> 
      <td class="style1" style="width: 25%">Account No</td>
      <td class="style3">
        <asp:TextBox runat="server" id="TbsAccountNo" Width="200px" CssClass="inptype">2213027158</asp:TextBox>
		&nbsp; <span class="style5">&nbsp;*)</span></td>
    </tr>
    <tr> 
      <td class="style1" style="width: 25%">Account Name</td>
      <td class="style3">
        <asp:TextBox runat="server" id="TbsAccountName" Width="200px" CssClass="inptype">PT. XXXXX</asp:TextBox>
		&nbsp;&nbsp; <span class="style5">*)</span></td>
    </tr>
    <tr>
      <td class="style1" style="width: 25%">Is Active</td>
      <td class="style3">
        <asp:CheckBox runat="server" id="CbIsActive" Checked="True" />
		</td>
    </tr>
	<tr>
      <td class="style1" style="width: 25%">Is Main</td>
      <td class="style3">
        <asp:CheckBox runat="server" id="CbIsMain" Checked="True" />
		</td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="SupplierBankAccount.aspx" />&nbsp; 
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="SupplierBankAccount.aspx" />&nbsp; 
      </td>
    </tr>
  </table>
</div>
</form>
</body>

</html>
