<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>ZIP CODE</title>
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
</style>
</head>

<body>
<form id="FrmZipCodeLookUp" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ZIP CODE</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="style1">Search By</td>
      <td class="style2">
		<asp:DropDownList runat="server" id="CmbSearch">
			<asp:ListItem>Kelurahan</asp:ListItem>
			<asp:ListItem>Kecamatan</asp:ListItem>
			<asp:ListItem>City</asp:ListItem>
			<asp:ListItem>Zip Code</asp:ListItem>
		</asp:DropDownList>
&nbsp;
		<asp:TextBox runat="server" id="TbsSearch" CssClass="inptype"></asp:TextBox>
        </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">&nbsp;
        <asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" /> &nbsp;
		<asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" /> 
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ZIP CODE LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr align="center" class="tdjudulhijau"> 
      <td width="5%">SELECT</td>
      <td>KELURAHAN</td>
      <td>KECAMATAN</td>
      <td>CITY</td>
      <td>ZIP CODE</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><input type="radio" name="radiobutton" value="radiobutton"></td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>99999</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><input type="radio" name="radiobutton" value="radiobutton"></td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>99999</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><input type="radio" name="radiobutton" value="radiobutton"></td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>99999</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><input type="radio" name="radiobutton" value="radiobutton"></td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>99999</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><input type="radio" name="radiobutton" value="radiobutton"></td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>99999</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><input type="radio" name="radiobutton" value="radiobutton"></td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>99999</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><input type="radio" name="radiobutton" value="radiobutton"></td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>99999</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><input type="radio" name="radiobutton" value="radiobutton"></td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>99999</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><input type="radio" name="radiobutton" value="radiobutton"></td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>99999</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><input type="radio" name="radiobutton" value="radiobutton"></td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxx50xxxxxxxxx</td>
      <td>99999</td>
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
		<asp:ImageButton runat="server" id="BtnClose" ImageUrl="../../images/ButtonSelect.gif" onclientclick="myClose();"/>&nbsp;
		<asp:ImageButton runat="server" id="BtnClose0" ImageUrl="../../images/ButtonExit.gif" onclientclick="myClose();"/></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
