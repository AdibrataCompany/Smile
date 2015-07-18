<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>*</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<style type="text/css">
.style1 {
	text-align: left;
}
.style2 {
	background-color: #FFFFFF;
	text-align: left;
}
.style3 {
	background-color: #F4FAFF;
	text-align: left;
}
.style4 {
	background-color: #F4F4DF;
	font-weight: bold;
	font-size: 10px;
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmProductOfferingAdd" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3" class="style1"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">PRODUCT OFFERING - VIEW</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td class="style3" style="width: 40%">Branch</td>
          <td class="style2">Grand Wijaya</td>
        </tr>
        <tr> 
          <td class="style3" style="width: 40%">Product</td>
          <td class="style2"><a href="ProductBranchView.aspx" target="_blank">PRODUCT CONSUMER FINANCE NEW HONDA</a></td>
        </tr>
        <tr> 
          <td class="style3" style="width: 40%">Product Offering ID</td>
          <td class="style2"> xxxxx20xxxxx</td>
        </tr>
        <tr> 
          <td class="style3" style="width: 40%">Description</td>
          <td class="style2">xxxxxxxxxx50xxxxxxxxx</td>
        </tr>
        <tr> 
          <td colspan="2" class="style4">PAKET DATA</td>
        </tr>
        <tr> 
          <td class="style3" style="width: 40%">Period</td>
          <td class="style2">
			01/08/2008 To
			31/08/2008</td>
        </tr>
        <tr> 
          <td class="style3" style="width: 40%">Active</td>
          <td class="style2"> 
			Yes&nbsp;&nbsp;
			</td>
        </tr>
      </table>
  </div>
  <p align="center"><font face="Arial, Helvetica, sans-serif">| <a href="ProductOfferingSupplierView.aspx" target="_self">Product Offering Suppliers</a> | <a href="ProductOfferingAssetView.aspx" target="_self">Product Offering Assets</a> | <a href="ProductOfferingDetailView.aspx" target="_self">Product Offering Detail</a> |</font></p>
  <div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" style="height: 30px"></td>
      <td width="50%" align="right" style="height: 30px">
		&nbsp;&nbsp;
		<asp:ImageButton runat="server" id="BtnClose" ImageUrl="../../images/ButtonClose.gif" PostBackUrl="javascript:window.close();" /></td>
    </tr>
  </table>
  </div>
</form>
</body>
</html>
