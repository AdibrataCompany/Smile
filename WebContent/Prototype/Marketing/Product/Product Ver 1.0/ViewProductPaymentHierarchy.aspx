<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>PRODUCT - VIEW</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<script language="JavaScript" type="text/JavaScript">

function myClose() {
    close();}

</script >

<style type="text/css">
.style1 {
	background-color: #F4FAFF;
	text-align: left;
}
.style3 {
	background-color: #FFFFFF;
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmProductView" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">PRODUCT PAYMENT HIERARCHY - VIEW</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="40%" class="style1">Product ID</td>
          <td class="style3"> CFMOHND001</td>
        </tr>
        <tr> 
          <td class="style1">Description</td>
          <td class="style3">PRODUCT CONSUMER FINANCE NEW HONDA</td>
        </tr>
        </table>
    </div>
    <br />
    <table width="95%" border="0" cellspacing="0" cellpadding="0">
    	<tr class="trtopiabu"> 
      		<td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
     	 	<td align="center" class="tdtopihijau">PRODUCT PAYMENT HIERARCHY 
			LISTING</td>
    	  	<td width="10" class="tdtopihijaukanan">&nbsp;</td>
    	</tr>
  	</table>
     <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="40%" class="style1">Payment Hierarchy - 1</td>
          <td class="style3">Installment Receive</td>
        </tr>
        <tr> 
          <td width="40%" class="style1" style="height: 18px">Payment Hierarchy 
			- 2</td>
          <td class="style3" style="height: 18px">
			Insurance Receive</td>
        </tr>
        <tr> 
          <td class="style1">Payment Hierarchy - 3</td>
          <td class="style3">
			Late Charge - Installment</td>
        </tr>
        <tr> 
          <td class="style1">Payment Hierarchy - 4</td>
          <td class="style3">
			<span class="tdganjil">Late Charge - Insurance</span></td>
        </tr>
        </table>
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnClose" ImageUrl="../../images/ButtonBack.gif" PostBackUrl="ProductView.aspx"/></td>
    </tr>
    </table>
</div>
</form>
</body>
</html>
