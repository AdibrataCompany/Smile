<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>*</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
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
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmSupplierAdd" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3" class="style4"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ADMIN FEE - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style1" width="20%">Branch</td>
      <td colspan="3" class="style3"> 
		<asp:DropDownList runat="server" id="CmbBranch" CssClass="inptype" Enabled="false">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem Selected="True">Jakarta </asp:ListItem>
			<asp:ListItem>Bandung</asp:ListItem>
			<asp:ListItem>xxxxx50xxxxx</asp:ListItem>
		</asp:DropDownList><font color="red">*)</font>
		</td>
    </tr>
    <tr> 
      <td class="style1" width="20%">Product Type</td>
      <td colspan="3" class="style3"> 
		<asp:DropDownList runat="server" id="ddlProdutType" CssClass="inptype" Enabled="false">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem Selected="True">CF</asp:ListItem>
			<asp:ListItem>LS</asp:ListItem>
			<asp:ListItem>DE Mobil</asp:ListItem>
			<asp:ListItem>DE Motorl</asp:ListItem>
		</asp:DropDownList><font color="red">*)</font>
		</td>
    </tr>
     <tr> 
      <td class="style1" width="20%">Asset Category</td>
      <td colspan="3" class="style3">
		<asp:TextBox runat="server" id="txtAssetCategory" Width="150px" CssClass="inptype" Enabled="false" Text="xxxxx20xxxxxx"></asp:TextBox>
&nbsp;<asp:HyperLink runat="server" id="UcAssetCategory" ImageUrl="../../images/IconDetail.gif" NavigateUrl="../../LookUp/AssetCategory.aspx" Target="_blank" >
		</asp:HyperLink>
&nbsp;<font color="red">*) If Product Type DE Mobil, DE Motor, CF</font></td>
    </tr>
    

    <tr> 
      <td class="style1" width="20%">Tenor</td>
      <td colspan="3" class="style3"> 
		<asp:TextBox runat="server" id="txtTenor" Width="200px" CssClass="inptype" Enabled="false" Text="99">
		</asp:TextBox><font color="red">*) in month</font>
		</td>
    </tr>
     <tr> 
      <td class="style1" width="20%">Sum Insured Based</td>
      <td colspan="3" class="style3">
		
			<asp:RadioButtonList runat="server" id="rdbtnSumInsuredBased" RepeatDirection="Horizontal" Enabled="false">
			<asp:ListItem Text="NTF" Value="NTF" Selected="True"></asp:ListItem>
			<asp:ListItem Text="OTR" Value="OTR"></asp:ListItem></asp:RadioButtonList>
			<font color="red">*) If ProductType = DE Mobil</font></td>
    </tr>
	<tr> 
      <td class="style1" width="20%">Admin Fee Type</td>
      <td colspan="3" class="style3"> 
		<asp:DropDownList runat="server" id="ddlAdminFeeType" CssClass="inptype" Enabled="False">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem Selected="True">Percentage</asp:ListItem>
			<asp:ListItem>Amount</asp:ListItem>
		</asp:DropDownList><font color="red">*)</font>
		</td>
    </tr>
	<tr> 
      <td class="style1" >Amount Funding From</td>
      <td colspan="3" class="style3">
		<asp:TextBox runat="server" id="txtAmountFundingFrom" Width="200px" CssClass="inptype" Enabled="false" Text="999,999,999">
		</asp:TextBox><font color="red">*) If ProductType = DE Motor</font>
		</td>
		

    </tr>
<tr>
 <td class="style1" >Amount Funding To</td>
      <td colspan="3" class="style3">
		<asp:TextBox runat="server" id="txtAmountFundingTo" Width="200px" CssClass="inptype" Enabled="false" Text="999,999,999">
		</asp:TextBox><font color="red">*) If ProductType = DE Motor</font>
		</td>
		</tr>
    <tr> 
      <td class="style1" width="20%">Admin Fee Value</td>
      <td colspan="3" class="style3">
		<asp:TextBox runat="server" id="txtAdminFeeValue" Width="200px" CssClass="inptype" Text="99.99">
		</asp:TextBox>
		</td>
    </tr>
   
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="AdminFee.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="AdminFee.aspx" />&nbsp; 
      </td>
    </tr>
  </table>
</div>
</form>
</body>

</html>
