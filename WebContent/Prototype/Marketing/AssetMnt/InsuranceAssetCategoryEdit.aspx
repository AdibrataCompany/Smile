<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled 1</title>
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
</style>
</head>

<body>

<form id="FrmInsuranceAssetCategoryEdit" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3" class="style1"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">INSURANCE ASSET CATEGORY - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="25%" class="style3">Insurance Asset Category ID</td>
          <td class="style2">1&nbsp;</td>
        </tr>
        <tr> 
          <td class="style3">Description</td>
          <td class="style2"> 
			<asp:TextBox runat="server" id="TbsDescription" Width="315px" CssClass="inptype">MOTOR &lt; 150 CC</asp:TextBox>
&nbsp;<font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="style3">Asset Type</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbAssetType" CssClass="inptype">
				<asp:ListItem>Motorcycle</asp:ListItem>
				<asp:ListItem>xxxxxxxx50xxxxxxxx</asp:ListItem>
			</asp:DropDownList>
			</td>
        </tr>
        <tr> 
          <td class="style3">Insurance Rate Type</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbRatePremiInsurance" CssClass="inptype">
				<asp:ListItem>Year</asp:ListItem>
				<asp:ListItem>Month</asp:ListItem>
			</asp:DropDownList>
			</td>
        </tr>
      </table>
    </div>
    
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="InsuranceAssetCategory.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="InsuranceAssetCategory.aspx" />&nbsp;</td>
    </tr>
  </table>
</div>

</form>

</body>

</html>
