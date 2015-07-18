<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>BRANCH EMPLOYEE - VIEW</title>
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}

function myClose() {
    close();}



//-->
</script>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<style type="text/css">
.style1 {
	background-color: #FEE8E0;
	font-weight: bold;
	font-size: 10px;
	text-align: left;
}
.style2 {
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
<form id="FrmBranchEmployeeView" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiorangekiri">&nbsp;</td>
      <td align="center" class="tdtopiorange">BRANCH EMPLOYEE - VIEW</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="25%" class="style2">Employee ID</td>
          <td class="style3">001 </td>
        </tr>
        <tr> 
          <td width="25%" class="style2">Employee Name</td>
          <td class="style3">Hanny</td>
        </tr>
        <tr> 
          <td class="style2">Position</td>
          <td class="style3">Marketing</td>
        </tr>
        <tr> 
          <td class="style2">Level</td>
          <td class="style3">Senior</td>
        </tr>
        <tr> 
          <td class="style2">Status</td>
          <td class="style3">Karyawan</td>
        </tr>
        <tr>
          <td class="style2">Marketing Group</td>
          <td class="style3">Motorcycle</td>
        </tr>
        <tr> 
          <td class="style2">Marketing Assistant</td>
          <td class="style3">xxxxxxxx50xxxxxxxx</td>
        </tr>
        <tr> 
          <td class="style2">Marketing Supervisor</td>
          <td class="style3">xxxxxxxx50xxxxxxxx</td>
        </tr>
        <tr> 
          <td class="style2">Marketing Sales</td>
          <td class="style3">Direct</td>
        </tr>
        <tr> 
          <td class="style2">Join Date</td>
          <td class="style3">dd/mm/yyyy</td>
        </tr>
        <tr> 
          <td class="style2">CA Supervisor</td>
          <td class="style3">xxxxxxxx50xxxxxxxx</td>
        </tr>
        <tr> 
          <td colspan="2" class="style1" style="height: 17px"><strong>Address</strong></td>
        </tr>
        <tr> 
          <td class="style2">Address</td>
          <td class="style3">xxxxxxxx100xxxxxxxx</td>
        </tr>
        <tr> 
          <td class="style2">RT / RW</td>
          <td class="style3">999 / 999</td>
        </tr>
        <tr> 
          <td class="style2">Kelurahan</td>
          <td class="style3">xxxxxxxx30xxxxxxxx</td>
        </tr>
        <tr> 
          <td class="style2">Kecamatan</td>
          <td class="style3">xxxxxxxx30xxxxxxxx</td>
        </tr>
        <tr> 
          <td class="style2">City</td>
          <td class="style3">xxxxxxxx30xxxxxxxx</td>
        </tr>
        <tr> 
          <td class="style2">Zip Code</td>
          <td class="style3">99999</td>
        </tr>
        <tr> 
          <td class="style2">Phone 1</td>
          <td class="style3">999 - 99999999</td>
        </tr>
        <tr> 
          <td class="style2">Phone 2</td>
          <td class="style3">999 - 99999999</td>
        </tr>
        <tr> 
          <td class="style2">Fax</td>
          <td class="style3">999 - 99999999</td>
        </tr>
        <tr> 
          <td class="style2">Email</td>
          <td class="style3">xxxxxxxx100xxxxxxxx</td>
        </tr>
        <tr> 
          <td class="style2">Mobile Phone</td>
          <td class="style3">9999 - 99999999</td>
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
