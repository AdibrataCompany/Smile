<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml" xmlns:v="urn:schemas-microsoft-com:vml" xmlns:o="urn:schemas-microsoft-com:office:office">

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
.style3 {
	background-color: #FFFFFF;
	text-align: left;
}
.style4 {
	text-align: center;
}
.style5 {
	background-color: #F4FAFF;
	text-align: right;
}
.style6 {
	background-color: #FFFFFF;
	text-align: right;
}
</style>
</head>

<body>
<form id="FrmSupplierBudgetView" runat="server">
<div class="style4">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER BUDGET - VIEW</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td class="style1" style="width: 29%">Supplier Id</td>
          <td class="style3" colspan="3"> xxxxx10xxxxx</td>
        </tr>
        <tr> 
          <td class="style1" style="width: 29%">Supplier Name</td>
          <td class="style3" colspan="3">xxxxxxxx50xxxxxxxx</td>
        </tr>
        <tr> 
          <td class="style1" style="width: 29%">Search By</td>
          <td class="style3" style="width: 218px">
			<asp:DropDownList runat="server" id="CmbSearch" CssClass="inptype">
				<asp:ListItem>Year</asp:ListItem>
				<asp:ListItem>Month</asp:ListItem>
			</asp:DropDownList>
&nbsp;
			<asp:TextBox runat="server" id="TbsSearch" CssClass="inptype">
			</asp:TextBox>
			</td>
          <td class="style1" style="width: 95px">
			Asset Status</td>
          <td class="style3">
			<asp:DropDownList runat="server" id="CmbAssetStatus" CssClass="inptype">
			    <asp:ListItem>All</asp:ListItem>
				<asp:ListItem>New</asp:ListItem>
				<asp:ListItem>Used</asp:ListItem>
			</asp:DropDownList>
			</td>
        </tr>
        </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" PostBackUrl="SupplierBudgetView.aspx"/>&nbsp;
		<asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" PostBackUrl="SupplierBudgetView.aspx"/></td>
    </tr>
    </table>
		<br />
		<br />
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER BUDGET LISTING - VIEW</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr class="tdjudulhijau2"> 
          <td class="tdjudulhijau" style="width: 84px">YEAR</td>
          <td class="tdjudulhijau" style="width: 109px">MONTH</td>
          <td class="tdjudulhijau" style="width: 119px">ASSET STATUS</td>
          <td class="tdjudulhijau" style="width: 113px">UNIT</td>
          <td class="tdjudulhijau">AMOUNT</td>
        </tr>
        <tr> 
          <td class="tdganjil" style="width: 84px; height: 18px;">YYYY</td>
          <td class="style3" style="width: 109px; height: 18px;">January</td>
          <td class="style3" style="width: 119px; height: 18px;">New</td>
          <td class="style6" style="width: 113px; height: 18px;">9,999</td>
          <td class="style6" style="height: 18px;">9,999,999,999</td>
        </tr>
        <tr> 
          <td class="tdgenap" style="width: 84px">YYYY</td>
          <td class="style1" style="width: 109px">January</td>
          <td class="style1" style="width: 119px">Used</td>
          <td class="style5" style="width: 113px">9,999</td>
          <td class="style5">9,999,999,999</td>
        </tr>
        <tr> 
          <td class="tdganjil" style="width: 84px">YYYY</td>
          <td class="style3" style="width: 109px">February</td>
          <td class="style3" style="width: 119px">New</td>
          <td class="style6" style="width: 113px">9,999</td>
          <td class="style6">9,999,999,999</td>
        </tr>
        <tr> 
          <td class="tdgenap" style="width: 84px">YYYY</td>
          <td class="style1" style="width: 109px">February</td>
          <td class="style1" style="width: 119px">Used</td>
          <td class="style5" style="width: 113px">9,999</td>
          <td class="style5">9,999,999,999</td>
        </tr>
        <tr> 
          <td class="tdganjil" style="width: 84px">YYYY</td>
          <td class="style3" style="width: 109px">March</td>
          <td class="style3" style="width: 119px">New</td>
          <td class="style6" style="width: 113px">9,999</td>
          <td class="style6">9,999,999,999</td>
        </tr>
        <tr> 
          <td class="tdgenap" style="width: 84px">YYYY</td>
          <td class="style1" style="width: 109px">March</td>
          <td class="style1" style="width: 119px">Used</td>
          <td class="style5" style="width: 113px">9,999</td>
          <td class="style5">9,999,999,999</td>
        </tr>
        <tr> 
          <td class="tdganjil" style="width: 84px">YYYY</td>
          <td class="style3" style="width: 109px">April</td>
          <td class="style3" style="width: 119px">New</td>
          <td class="style6" style="width: 113px">9,999</td>
          <td class="style6">9,999,999,999</td>
        </tr>
        <tr> 
          <td class="tdgenap" style="width: 84px">YYYY</td>
          <td class="style1" style="width: 109px">April</td>
          <td class="style1" style="width: 119px">Used</td>
          <td class="style5" style="width: 113px">9,999</td>
          <td class="style5">9,999,999,999</td>
        </tr>
        <tr> 
          <td class="tdganjil" style="width: 84px">YYYY</td>
          <td class="style3" style="width: 109px">May</td>
          <td class="style3" style="width: 119px">New</td>
          <td class="style6" style="width: 113px">9,999</td>
          <td class="style6">9,999,999,999</td>
        </tr>
        <tr> 
          <td class="tdgenap" style="width: 84px">YYYY</td>
          <td class="style1" style="width: 109px">May</td>
          <td class="style1" style="width: 119px">Used</td>
          <td class="style5" style="width: 113px">9,999</td>
          <td class="style5">9,999,999,999</td>
        </tr>
        <tr> 
          <td class="tdganjil" style="width: 84px">YYYY</td>
          <td class="style3" style="width: 109px">June</td>
          <td class="style3" style="width: 119px">New</td>
          <td class="style6" style="width: 113px">9,999</td>
          <td class="style6">9,999,999,999</td>
        </tr>
        <tr> 
          <td class="tdgenap" style="width: 84px">YYYY</td>
          <td class="style1" style="width: 109px">June</td>
          <td class="style1" style="width: 119px">Used</td>
          <td class="style5" style="width: 113px">9,999</td>
          <td class="style5">9,999,999,999</td>
        </tr>
        </table>
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnFirstPrev" ImageUrl="../../images/butkiri1.gif" Width="20px" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnPrev" ImageUrl="../../images/butkiri.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnNext" ImageUrl="../../images/butkanan.gif" Width="20px" /></td>
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
    </div>
    
  </div>
    </div>
    
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnClose" ImageUrl="../../images/ButtonClose.gif" onclientclick="myClose();"/>&nbsp;
		<asp:ImageButton runat="server" id="BtnBack" ImageUrl="../../images/ButtonBack.gif" PostBackUrl="SupplierView.aspx"/></td>
    </tr>
    </table>
</div>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </div>
</form>
</body>
</html>
