<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>SUPPLIER</title>
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
	background-color: #FFFFFF;
	text-align: left;
}
.style3 {
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmSupplierAssignBranch" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="style1">Name</td>
      <td class="style2">
		PT. XXXXX&nbsp;
		</td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER ASSIGN BRANCH</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr align="center" class="tdjudulhijau"> 
      <td width="5%">
		<asp:CheckBox runat="server" id="CbSelect" /></td>
      <td>BRANCH</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center">
		<asp:CheckBox runat="server" id="CbSelect0" /></td>
      <td class="style3">xxxxxxxx50xxxxxxxxx</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center">
		<asp:CheckBox runat="server" id="CbSelect1" /></td>
      <td class="style3">xxxxxxxx50xxxxxxxxx</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center">
		<asp:CheckBox runat="server" id="CbSelect2" Width="96px" Height="20px" /></td>
      <td class="style3">xxxxxxxx50xxxxxxxxx</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center">
		<asp:CheckBox runat="server" id="CbSelect3" /></td>
      <td class="style3">xxxxxxxx50xxxxxxxxx</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center">
		<asp:CheckBox runat="server" id="CbSelect4" /></td>
      <td class="style3">xxxxxxxx50xxxxxxxxx</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center">
		<asp:CheckBox runat="server" id="CbSelect5" /></td>
      <td class="style3">xxxxxxxx50xxxxxxxxx</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center">
		<asp:CheckBox runat="server" id="CbSelect6" /></td>
      <td class="style3">xxxxxxxx50xxxxxxxxx</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center">
		<asp:CheckBox runat="server" id="CbSelect7" /></td>
      <td class="style3">xxxxxxxx50xxxxxxxxx</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center">
		<asp:CheckBox runat="server" id="CbSelect8" /></td>
      <td class="style3">xxxxxxxx50xxxxxxxxx</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center">
		<asp:CheckBox runat="server" id="CbSelect9" /></td>
      <td class="style3">xxxxxxxx50xxxxxxxxx</td>
    </tr>
  </table>
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnFirstPrev" ImageUrl="../../images/butkiri1.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnPrev" ImageUrl="../../images/butkiri.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnNext" ImageUrl="../../images/butkanan.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnLastNext" ImageUrl="../../images/butkanan1.gif" /></td>
      <td width="130" align="center">Page&nbsp;
		<asp:TextBox runat="server" id="TbnPage" Width="20px" Height="18px" CssClass="inptype">
		</asp:TextBox>
&nbsp;&nbsp; 
        <asp:ImageButton runat="server" id="BtnGo" ImageUrl="../../images/buttonGO.gif" /></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  
  
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		&nbsp;<asp:ImageButton runat="server" id="BtnOk" ImageUrl="../../images/ButtonOK.gif" PostBackUrl="Supplier.aspx"/></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
