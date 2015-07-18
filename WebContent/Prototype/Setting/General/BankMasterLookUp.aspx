<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>*</title>
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
<form id="FrmBankMasterLookUp" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopikuningkiri">&nbsp;</td>
      <td align="center" class="tdtopikuning">BANK MASTER</td>
      <td width="10" class="tdtopikuningkanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="style1">Search By</td>
      <td class="style2">
		<asp:DropDownList runat="server" id="CmbSearch" CssClass="inptype">
			<asp:ListItem>Bank Master Name</asp:ListItem>
		</asp:DropDownList>
&nbsp; &nbsp;
		<asp:TextBox runat="server" id="TbsSearch" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopikuningkiri">&nbsp;</td>
      <td align="center" class="tdtopikuning">BANK MASTER LISTING</td>
      <td width="10" class="tdtopikuningkanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr align="center" class="tdjudulkuning"> 
      <td width="5%">
		<asp:RadioButton runat="server" id="RdBtnSelect" Width="20px" /></td>
      <td>BANK MASTER NAME</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center">
		<asp:RadioButton runat="server" id="RdBtnSelect0" /></td>
      <td class="style3">xxxxxxxx50xxxxxxxxx</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center">
		<asp:RadioButton runat="server" id="RdBtnSelect1" /></td>
      <td class="style3">xxxxxxxx50xxxxxxxxx</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center">
		<asp:RadioButton runat="server" id="RdBtnSelect2" /></td>
      <td class="style3">xxxxxxxx50xxxxxxxxx</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center">
		<asp:RadioButton runat="server" id="RdBtnSelect3" /></td>
      <td class="style3">xxxxxxxx50xxxxxxxxx</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center">
		<asp:RadioButton runat="server" id="RdBtnSelect4" /></td>
      <td class="style3">xxxxxxxx50xxxxxxxxx</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center">
		<asp:RadioButton runat="server" id="RdBtnSelect5" /></td>
      <td class="style3">xxxxxxxx50xxxxxxxxx</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center">
		<asp:RadioButton runat="server" id="RdBtnSelect6" /></td>
      <td class="style3">xxxxxxxx50xxxxxxxxx</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center">
		<asp:RadioButton runat="server" id="RdBtnSelect7" /></td>
      <td class="style3">xxxxxxxx50xxxxxxxxx</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center">
		<asp:RadioButton runat="server" id="RdBtnSelect8" /></td>
      <td class="style3">xxxxxxxx50xxxxxxxxx</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center">
		<asp:RadioButton runat="server" id="RdBtnSelect9" /></td>
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
		<asp:TextBox runat="server" id="TbnPage" Width="20px" CssClass="inptype">
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
		&nbsp;<asp:ImageButton runat="server" id="BtnSelect" ImageUrl="../../images/ButtonSelect.gif" onclientclick="myClose();"/>&nbsp;
		<asp:ImageButton runat="server" id="BtnExit" ImageUrl="../../images/ButtonExit.gif" onclientclick="myClose();" Height="20px"/></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
