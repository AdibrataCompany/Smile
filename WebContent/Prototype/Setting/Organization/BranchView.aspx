<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>BRANCH - VIEW</title>
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
	background-color: #F4FAFF;
	text-align: left;
}
.style2 {
	background-color: #FEE8E0;
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

<form id="FrmBranchView" runat="server">

<body>
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiorangekiri">&nbsp;</td>
      <td align="center" class="tdtopiorange">BRANCH - VIEW</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="25%" class="style1">Branch ID</td>
          <td class="style3">A03</td>
        </tr>
        <tr> 
          <td class="style1">Branch Name</td>
          <td class="style3">Grand Wijaya</td>
        </tr>
        <tr> 
          <td class="style1">Branch Initial Name</td>
          <td class="style3">GRW</td>
        </tr>
        <tr> 
          <td class="style1">Company</td>
          <td class="style3">PT. XXXXX</td>
        </tr>
        <tr> 
          <td class="style1">Area</td>
          <td class="style3">Jawa</td>
        </tr>
        <tr> 
          <td colspan="2" class="style2"><strong>Address</strong></td>
        </tr>
        <tr> 
          <td class="style1">Address</td>
          <td class="style3">Wijaya Graha Puri Blok F3,&nbsp; Jl. Wijaya 3</td>
        </tr>
        <tr> 
          <td class="style1">RT/RW</td>
          <td class="style3">07/010</td>
        </tr>
        <tr> 
          <td class="style1">Kelurahan</td>
          <td class="style3">Melawai</td>
        </tr>
        <tr> 
          <td class="style1">Kecamatan</td>
          <td class="style3">Kebayoran Baru</td>
        </tr>
        <tr> 
          <td class="style1">City</td>
          <td class="style3">Jakarta Selatan</td>
        </tr>
        <tr> 
          <td class="style1">Zip Code</td>
          <td class="style3">12160</td>
        </tr>
        <tr> 
          <td class="style1">Phone 1</td>
          <td class="style3">021 - 7250667</td>
        </tr>
        <tr> 
          <td class="style1">Phone 2</td>
          <td class="style3"> &nbsp;</td>
        </tr>
        <tr> 
          <td class="style1">Fax</td>
          <td class="style3">021 - 7202958</td>
        </tr>
        <tr> 
          <td colspan="2" class="style2"><strong>Contact Person</strong></td>
        </tr>
        <tr> 
          <td class="style1">Name</td>
          <td class="style3">Isabel Lay</td>
        </tr>
        <tr> 
          <td class="style1">Job Title</td>
          <td class="style3">Business Relation</td>
        </tr>
        <tr> 
          <td class="style1">Email</td>
          <td class="style3">Isabel@yahoo.com</td>
        </tr>
        <tr> 
          <td class="style1">Mobile Phone</td>
          <td class="style3">0811 - 101010</td>
        </tr>
        <tr> 
          <td colspan="2" class="style2">Branch Data</td>
        </tr>
        <tr> 
          <td class="style1">Branch Manager</td>
          <td class="style3">Guntur Gozali</td>
        </tr>
        <tr> 
          <td class="style1">ADH</td>
          <td class="style3">Kastoto</td>
        </tr>
        <tr> 
          <td class="style1">PIC for Legal Dept</td>
          <td class="style3">Ivan Gozali</td>
        </tr>
        <tr> 
          <td class="style1">AR Control Name</td>
          <td class="style3">Chandra Kirana</td>
        </tr>
        <tr> 
          <td class="style1">Asset Doc Custodian Name</td>
          <td class="style3">Maria Karmelinda Asten</td>
        </tr>
        <tr> 
          <td class="style1">Branch Status</td>
          <td class="style3">Medium</td>
        </tr>
        <tr> 
          <td class="style1">Productivity Value</td>
          <td class="style3">200 Target Unit/AO/Bulan</td>
        </tr>
        <tr> 
          <td class="style1">Productivity Collection</td>
          <td class="style3">100</td>
        </tr>
        <tr> 
          <td class="style1">#of employee</td>
          <td class="style3">50</td>
        </tr>
        <tr> 
          <td class="style2" colspan="2">Branch Bank Account</td>
        </tr>
        <tr> 
          <td class="style1">Bank Name</td>
          <td class="style3">BCA</td>
        </tr>
        <tr> 
          <td class="style1">Account Name</td>
          <td class="style3">Guntur Gozali</td>
        </tr>
        <tr> 
          <td class="style1">Account No</td>
          <td class="style3">0353123456</td>
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
</body>
</form>
</html>
