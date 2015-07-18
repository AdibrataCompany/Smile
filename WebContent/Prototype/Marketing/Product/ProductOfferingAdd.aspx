<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>*</title>
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
.style4 {
	background-color: #F4F4DF;
	font-weight: bold;
	font-size: 10px;
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmProductOfferingAdd" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3" class="style1"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">PRODUCT OFFERING - ADD</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td class="style3" style="width: 40%">Copy Data from Other Product 
			Offering</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbCopyData" Width="180px" CssClass="inptype">
				<asp:ListItem>Select One</asp:ListItem>
			</asp:DropDownList>
			&nbsp;
			<asp:ImageButton runat="server" id="BtnCopy" ImageUrl="../../images/ButtonCopy.gif" /></td>
        </tr>
        <tr> 
          <td class="style3" style="width: 40%">Branch</td>
          <td class="style2">Grand Wijaya</td>
        </tr>
        <tr> 
          <td class="style3" style="width: 40%">Product</td>
          <td class="style2"><a href="ProductBranchView.aspx" target="_blank">PRODUCT CONSUMER FINANCE NEW HONDA</a></td>
        </tr>
        <tr> 
          <td class="style3" style="width: 40%">Product Offering ID</td>
          <td class="style2"> <font color="red">
			<asp:TextBox runat="server" id="TbsProductOfferingId" Width="150px" CssClass="inptype">
			</asp:TextBox>
			&nbsp;*)</font> </td>
        </tr>
        <tr> 
          <td class="style3" style="width: 40%">Description</td>
          <td class="style2"><font color="red">
			<asp:TextBox runat="server" id="TbsDescription" Width="300px" CssClass="inptype">
			</asp:TextBox>
			*)</font> </td>
        </tr>
        <tr> 
          <td colspan="2" class="style4">PAKET DATA</td>
        </tr>
        <tr> 
          <td class="style3" style="width: 40%">Period</td>
          <td class="style2">
			<asp:TextBox runat="server" id="TbdPeriodFrom" CssClass="inptype">dd/mm/yyyy</asp:TextBox>
			&nbsp;<asp:ImageButton runat="server" id="BtnCalenderFrom" ImageUrl="../../images/iconcalendar.gif" />To
			<asp:TextBox runat="server" id="TbdPeriodTo" CssClass="inptype">dd/mm/yyyy</asp:TextBox>
			&nbsp;&nbsp; 
			<asp:ImageButton runat="server" id="BtnCalenderFrom0" ImageUrl="../../images/iconcalendar.gif" /></td>
        </tr>
        <tr> 
          <td class="style3" style="width: 40%">Active</td>
          <td class="style2"> 
			<asp:RadioButton runat="server" id="RdBtnYes" Text="Yes" Checked="True" />&nbsp;&nbsp;
			<asp:RadioButton runat="server" id="RdBtnNo" Text="No" /></td>
        </tr>
      </table>
</div>      
  <div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" style="height: 30px"></td>
      <td width="50%" align="right" style="height: 30px">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="ProductOffering.aspx" Height="20px" />&nbsp;&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="ProductOffering.aspx" /></td>
    </tr>
  </table>
  </div>
</form>
</body>
</html>
