<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>SUPPLIER</title>
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
.style2 {
	background-color: #F4F4DF;
	font-weight: bold;
	font-size: 10px;
	text-align: left;
}
.style3 {
	background-color: #FFFFFF;
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmSupplierEmployee" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER EMPLOYEE - VIEW</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td class="style1" style="width: 29%">Employee Name</td>
          <td class="style3"> 
			<asp:HyperLink runat="server" id="LinkName">xxxxxxxx50xxxxxxxx
			</asp:HyperLink>
			</td>
        </tr>
        <tr> 
          <td class="style1" style="width: 29%">Position</td>
          <td class="style3">Marketing</td>
        </tr>
        <tr> 
          <td colspan="2" class="style2">BANK ACCOUNT</td>
        </tr>
        <tr> 
          <td class="style1" style="width: 29%; height: 18px;">Bank Name</td>
          <td class="style3" style="height: 18px">XXXXX</td>
        </tr>
        <tr> 
          <td class="style1" style="width: 29%">Bank Branch</td>
          <td class="style3">xxxxxxxx50xxxxxxxx</td>
        </tr>
        <tr> 
          <td class="style1" style="width: 29%">Account No</td>
          <td class="style3">xxxxxxxx20xxxxxxxx</td>
        </tr>
        <tr> 
          <td class="style1" style="width: 29%">Account Name</td>
          <td class="style3">xxxxxxxx50xxxxxxxx</td>
        </tr>
        </table>
    </div>
    
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnClose" ImageUrl="../../images/ButtonClose.gif" onclientclick="myClose();"/></td>
    </tr>
    </table>
</div>
</form>
</body>
</html>
