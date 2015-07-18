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
.style2 {
	background-color: #FFFFFF;
	text-align: left;
}
.style5 {
	text-align: left;
}
.style3 {
	background-color: #FFFFFF;
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmProductAdd" runat="server">
<div class="style5">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3" class="style5"><font color="red"><i>*)&nbsp;&nbsp;&nbsp;&nbsp; required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">PRODUCT DETAIL - ADD</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="40%" class="style1" style="height: 18px">Product ID</td>
          <td class="style2" style="height: 18px"><a href="ProductView.aspx" target="_blank">xxxxx20xxxxx</a></td>
        </tr>
        <tr> 
          <td class="style1">Description</td>
          <td class="style2">
		PRODUCT CONSUMER FINANCE NEW HONDA</td>
        </tr>
        <tr>
          <td class="style1">Product Type</td>
          <td class="style3">KCM</td>
        </tr>
        <tr>
          <td class="style1">Asset Type</td>
          <td class="style3">AUTOMOTIVE</td>
        </tr>
		<tr>
          <td class="style1">Asset Category</td>
          <td class="style3">Truck</td>
        </tr>
		<tr>
          <td class="style1">Asset Usage</td>
          <td class="style3">Commercial</td>
        </tr>
		<tr>
          <td class="style1">Finance Type</td>
          <td class="style3">Consumer Finance</td>
        </tr>
		<tr>
          <td class="style1">Lease Back Type</td>
          <td class="style3">Direct Financing</td>
        </tr>
		<tr>
          <td class="style1">New / Used&nbsp; Type</td>
          <td class="style3">New</td>
        </tr>
		<tr>
          <td class="style1">Conventional Type</td>
          <td class="style3">Syariah</td>
        	</tr>
			<tr>
          <td class="style1">Floor Financing</td>
          <td class="style3">No</td>
        	</tr>
        <tr> 
          <td class="style1" style="height: 13px">Asset Origination</td>
          <td class="style2" style="height: 13px">
			<asp:DropDownList runat="server" id="ddlAssetOrig" CssClass="inptype">
				<asp:ListItem>CKD</asp:ListItem>
				<asp:ListItem>CBU</asp:ListItem>
				<asp:ListItem>Karoseri</asp:ListItem>
			</asp:DropDownList>
			<font color="red">&nbsp;*)</font></td>
        </tr>
		<tr>
          <td class="style1">Asset Group</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="ddlAssetGroup" CssClass="inptype">
				<asp:ListItem Value="A">Group A</asp:ListItem>
				<asp:ListItem Value="B">Group B</asp:ListItem>
			</asp:DropDownList>
			<font color="red">&nbsp;*)</font></td>
        </tr>
		<tr>
          <td class="style1">Customer Rating</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="ddlCustRating" CssClass="inptype">
				<asp:ListItem Value="1">1 - Excellent</asp:ListItem>
				<asp:ListItem Value="2">2 - Good</asp:ListItem>
				<asp:ListItem Value="3">3 - Regular</asp:ListItem>
				<asp:ListItem Value="4">4 - Warning</asp:ListItem>
				<asp:ListItem Value="5">5 - Bad</asp:ListItem>
			</asp:DropDownList>
			&nbsp;<font color="red">*)</font></td>
        </tr>
        <tr> 
          <td class="style1">Asset Year</td>
          <td class="style2"> 
		From 
		<asp:TextBox runat="server" id="txtYearStart" CssClass="inptype" Width="60px">2008
		</asp:TextBox> &nbsp;To <font color="red"> 
		<asp:TextBox runat="server" id="txtYearEnd" CssClass="inptype" Width="60px">2008
		</asp:TextBox> &nbsp; *)</font></td>
        </tr>
        <tr> 
          <td class="style1">Tenor</td>
          <td class="style2"> 
		<asp:TextBox runat="server" id="txtTenor" CssClass="inptype" Width="60px">12
		</asp:TextBox>
			<font color="red">&nbsp;*)</font></td>
        </tr>
        <tr> 
          <td class="style1" style="height: 19px">Minimum Gross Yield</td>
          <td class="style2" style="height: 19px"> 
		<asp:TextBox runat="server" id="txtGrossYield" CssClass="inptype" Width="60px" Height="16px">10
		</asp:TextBox>
			&nbsp;% pa</td>
        </tr>
        <tr> 
          <td class="style1">Minimum Effective Rate</td>
          <td class="style2"> 
		<asp:TextBox runat="server" id="txtMinEffRate" CssClass="inptype" Width="60px" Height="16px">11
		</asp:TextBox>
			&nbsp;% pa</td>
        </tr>
        <tr> 
          <td class="style1">Minimum DP Percentage - Branch Category A</td>
          <td class="style2"> 
		<asp:TextBox runat="server" id="txtMinDPCategA" CssClass="inptype" Height="16px">
		</asp:TextBox>
			&nbsp;%</td>
        </tr>
        <tr> 
          <td class="style1">Minimum DP Percentage - Branch Category B</td>
          <td class="style2"> 
		<asp:TextBox runat="server" id="txtMinDPCategB" CssClass="inptype" Height="16px">
		</asp:TextBox>
			&nbsp;%</td>
        </tr>
        <tr>
          <td class="style1">Minimum Interest Income to be Warned</td>
          <td class="style2"> 
		<asp:TextBox runat="server" id="txtMinIntIncWarn" CssClass="inptype" Height="16px">
		</asp:TextBox>
			</td>
        	</tr>
        <tr> 
          <td class="style1">Minimum Interest Income to be Rejected</td>
          <td class="style2"> 
		<asp:TextBox runat="server" id="txtMinIntIncRej" CssClass="inptype" Height="16px">
		</asp:TextBox>
			</td>
        </tr>
        <tr> 
          <td class="style1">Maximum Amount Finance</td>
          <td class="style2"> 
		<asp:TextBox runat="server" id="txtMaxNTF" CssClass="inptype" Height="16px">
		</asp:TextBox>
			</td>
        </tr>
        <tr> 
          <td class="style1">Active</td>
          <td class="style2"> 
				<asp:RadioButtonList runat="server" id="rdoIsActive" RepeatDirection="Horizontal">
				<asp:ListItem Value="Y" Selected="True">Yes</asp:ListItem>
				<asp:ListItem Value="N">No</asp:ListItem>
			</asp:RadioButtonList>
			</td>
        </tr>
      </table>
  <div align="center">
    <div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="ProductDetail.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="ProductDetail.aspx" /></td>
    </tr>
  </table>
    </div>
    
  </div>

    </div>
    
  </div>
</div>
</div>
</form>
</body>
</html>
