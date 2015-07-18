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
}.style3 {
	background-color: #F4F4DF;
	font-weight: bold;
	font-size: 10px;
	text-align: left;
}
.style5 {
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
      <td align="center" class="tdtopihijau">PRODUCT BRANCH DETAIL - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="40%" class="style1" style="height: 18px">Product ID</td>
          <td class="style2" style="height: 18px" colspan="2"><a href="ProductBranchView.aspx" target="_blank">xxxxx20xxxxx</a></td>
        </tr>
        <tr> 
          <td class="style1">Description</td>
          <td class="style2" colspan="2">
		PRODUCT CONSUMER FINANCE NEW HONDA</td>
        </tr>
        <tr>
          <td class="style1">Product Type</td>
          <td class="style2" colspan="2">
			DE Mobil</td>
        </tr>
        <tr>
          <td class="style1">Asset Type</td>
          <td class="style2" colspan="2">
			AUTOMOTIVE</td>
        </tr>
		<tr>
          <td class="style1">Asset Category</td>
          <td class="style2" colspan="2">
			NON TRUCK</td>
        </tr>
		<tr>
          <td class="style1">Asset Origination</td>
          <td class="style2" colspan="2">
			CBU</td>
        </tr>
		<tr>
          <td class="style1">Finance Type</td>
          <td class="style2" colspan="2">
			Consumer Finance</td>
        </tr>
		<tr>
          <td class="style1">Lease Back Type</td>
          <td class="style2" colspan="2">
				Lease Back</td>
        </tr>
		<tr>
          <td class="style1">New / Used&nbsp; Type</td>
          <td class="style2" colspan="2"> 
			Used</td>
        	</tr>
		<tr>
          <td class="style1">Conventional Type</td>
          <td class="style2" colspan="2"> 
			Conventional</td>
        	</tr>
		<tr>
          <td class="style1">Vehicle Type</td>
          <td class="style2" colspan="2"> 
			Non Public</td>
        	</tr>
		<tr>
          <td class="style1">Floor Financing</td>
          <td class="style2" colspan="2">
				No</td>
        </tr>
		<tr>
          <td class="style1">Asset Origination</td>
          <td class="style2" colspan="2">
			CKD</td>
        </tr>
		<tr>
          <td class="style1">Asset Group</td>
          <td class="style2" colspan="2">
			Group A&nbsp;</td>
        </tr>
		<tr>
          <td class="style1">Customer Rating</td>
          <td class="style2" colspan="2">
			1 - Excellent</td>
        </tr>
		<tr>
          <td class="style1">Asset Year</td>
          <td class="style2" colspan="2"> 
		2008</td>
        </tr>
		<tr>
          <td class="style1">Tenor</td>
          <td class="style2" colspan="2"> 
		12</td>
        </tr>
        <tr class="style3"> 
          <td>&nbsp;</td>
          <td> 
		From HO</td>
          <td width="30%"> 
		Branch (Spread from HO)</td>
        </tr>
        <tr> 
          <td class="style1" style="height: 19px">Minimum Gross Yield</td>
          <td class="style2" style="height: 19px"> 
		10 % pa</td>
          <td class="style2" style="height: 19px"> 
		+ 
		<asp:TextBox runat="server" id="txtGrossYield" CssClass="inptype" Width="60px" Height="16px">2
		</asp:TextBox>
			&nbsp;% pa</td>
        </tr>
        <tr> 
          <td class="style1">Minimum Effective Rate</td>
          <td class="style2"> 
		11 % pa</td>
          <td class="style2"> 
		+ 
		<asp:TextBox runat="server" id="txtMinEffRate" CssClass="inptype" Width="60px" Height="16px">3
		</asp:TextBox>
			&nbsp;% pa</td>
        </tr>
        <tr> 
          <td class="style1">Minimum DP Percentage - Branch Category A</td>
          <td class="style2"> 
		10 %</td>
          <td class="style2"> 
		+ 
		<asp:TextBox runat="server" id="txtMinDPCategA" CssClass="inptype" Height="16px" Width="60px">0
		</asp:TextBox>
			&nbsp;%</td>
        </tr>
        <tr> 
          <td class="style1">Minimum DP Percentage - Branch Category B</td>
          <td class="style2"> 
		15 %</td>
          <td class="style2"> 
		+ 
		<asp:TextBox runat="server" id="txtMinDPCategB" CssClass="inptype" Height="16px" Width="60px">0
		</asp:TextBox>
			&nbsp;%</td>
        </tr>
        <tr>
          <td class="style1">Minimum Interest Income to be Warned</td>
          <td class="style2"> 
		2,000,000.00</td>
          <td class="style2"> 
		+ 
		<asp:TextBox runat="server" id="txtMinIntIncWarn" CssClass="inptype" Height="16px">500,000.00
		</asp:TextBox>
			</td>
        	</tr>
        <tr> 
          <td class="style1">Minimum Interest Income to be Rejected</td>
          <td class="style2"> 
		1,000,000.00</td>
          <td class="style2"> 
		+ 
		<asp:TextBox runat="server" id="txtMinIntIncRej" CssClass="inptype" Height="16px">500,000.00
		</asp:TextBox>
			</td>
        </tr>
        <tr> 
          <td class="style1">Maximum Amount Finance</td>
          <td class="style2"> 
		300,000,000.00</td>
          <td class="style2"> 
		+ 
		<asp:TextBox runat="server" id="txtMaxNTF" CssClass="inptype" Height="16px">500,000.00
		</asp:TextBox>
			</td>
        </tr>
        <tr> 
          <td class="style1">Active</td>
          <td class="style2" colspan="2"> 
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
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="ProductBranchDetail.aspx" Height="20px" />&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="ProductBranchDetail.aspx" /></td>
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
