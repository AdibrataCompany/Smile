<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>PRODUCT TERM &amp; CONDITION</title>
<link rel="stylesheet" type="text/css" href="Confins.css" />
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
<form id="FrmProductTermConditionAdd" runat="server">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td class="style3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">PRODUCT TERM & CONDITION</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="style1">Product ID</td>
      <td class="style2">
		<asp:HyperLink runat="server" id="LinkProduct" NavigateUrl="ProductView.aspx" Target="_blank">CFMOHND001
		</asp:HyperLink>
		</td>
    </tr>
    <tr> 
      <td class="style1">Description</td>
      <td class="style2">PRODUCT CONSUMER FINANCE NEW HONDA</td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">PRODUCT TERM &amp; CONDITION - ADD</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="25%" class="style1">Term &amp; Condition</td>
          <td class="style2"><font color="red">
			<asp:DropDownList runat="server" id="CmbTermCondition" Width="315px" CssClass="inptype">
			<asp:ListItem>Select One</asp:ListItem>
			</asp:DropDownList>
&nbsp;*)</font> </td>
        </tr>
        <tr> 
          <td class="style1">Prior To</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbPriorTo" CssClass="inptype">
				<asp:ListItem>New Application</asp:ListItem>
				<asp:ListItem>Approval</asp:ListItem>
				<asp:ListItem>Purchase Order</asp:ListItem>
				<asp:ListItem>Delivery Order</asp:ListItem>
				<asp:ListItem>Go Live</asp:ListItem>
			</asp:DropDownList>
			</td>
        </tr>
        <tr> 
          <td class="style1">Mandatory</td>
          <td class="style2">
			<asp:RadioButton runat="server" id="RdBtnYes" Text="Yes" Checked="True" />&nbsp;<asp:RadioButton runat="server" id="RdBtnNo" Text="No" /></td>
        </tr>
      </table>
    </div>
    
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="ProductTermCondition.aspx" Height="20px" />&nbsp; 
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="ProductTermCondition.aspx" />&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
