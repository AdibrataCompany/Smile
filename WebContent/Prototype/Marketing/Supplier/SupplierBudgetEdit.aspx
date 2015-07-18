<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>SUPPLIER - ADD</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<style type="text/css">
.style2 {
	background-color: #F4FAFF;
	text-align: left;
}
.style1 {
	background-color: #FFFFFF;
	text-align: left;
}
.style4 {
	background-color: #FFFFFF;
	text-align: center;
}
.style5 {
	text-align: right;
}
</style>
</head>

<body>
<form id="FrmSupplierBudgetEdit" runat="server">
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER BUDGET - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>


  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style2" style="width: 156px">Supplier ID</td>
      <td class="style1">
		XXXXXXXXXX</td>
    </tr>
    <tr> 
      <td class="style2" style="width: 156px">Supplier Name</td>
      <td class="style1">
		PT. XXXXX</td>
    </tr>
    <tr> 
      <td class="style2" style="width: 156px">Year</td>
      <td class="style1">
		2007&nbsp;</td>
    </tr>
    <tr> 
      <td class="style2" style="width: 156px">Month</td>
      <td class="style1">
		January</td>
    </tr>
    <tr> 
      <td class="style2" style="width: 156px">Asset Status</td>
      <td class="style1">
		New</td>
    </tr>
    <tr> 
      <td class="style2" style="width: 156px">Unit</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbnUnit" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="style2" style="width: 156px">Amount</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbnAmount" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdganjil"> 
      <td class="style4" style="width: 104px">&nbsp;</td>
      <td class="tdganjil" style="width: 203px">&nbsp;</td>
      <td class="tdganjil">&nbsp; </td>
    </tr>
  </table>
  <table style="width: 95%">
	<tr>
		<td>&nbsp;</td>
		<td class="style5">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="SupplierBranchBudget.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnBack" ImageUrl="../../images/ButtonBack.gif" PostBackUrl="SupplierBranchBudget.aspx" />
		</td>
	</tr>
	</table>
<br />
</form>
</body>

</html>
