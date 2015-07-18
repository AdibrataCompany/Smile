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
          <td class="style1">Asset Type</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbAssetType" Width="250px" CssClass="inptype">
				<asp:ListItem>Select One</asp:ListItem>
			</asp:DropDownList>
&nbsp;<font color="red">*)</font></td>
        </tr>
        <tr> 
          <td class="style1" style="height: 13px">Asset Category</td>
          <td class="style2" style="height: 13px">
			<asp:DropDownList runat="server" id="ddlAssetCategory" Width="250px" CssClass="inptype">
				<asp:ListItem>Select One</asp:ListItem>
			</asp:DropDownList>
			<font color="red">&nbsp;*)</font></td>
        </tr>
        <tr> 
          <td class="style1" style="height: 13px">Asset Origination</td>
          <td class="style2" style="height: 13px">
			<asp:DropDownList runat="server" id="ddlAssetOrig" CssClass="inptype">
				<asp:ListItem Selected="True">All</asp:ListItem>
				<asp:ListItem>CKD</asp:ListItem>
				<asp:ListItem>CBU</asp:ListItem>
				<asp:ListItem>Karoseri</asp:ListItem>
			</asp:DropDownList>
			<font color="red">&nbsp;*)</font></td>
        </tr>
        <tr> 
          <td class="style1" style="height: 13px">Finance Type</td>
          <td class="style2" style="height: 13px">
			<asp:RadioButtonList runat="server" id="RadioButtonList1" RepeatDirection="Horizontal">
				<asp:ListItem Selected="True" Value="CF">Consumer Finance
				</asp:ListItem>
				<asp:ListItem Value="LS">Finance Lease</asp:ListItem>
			</asp:RadioButtonList>
			</td>
        </tr>
        <tr> 
          <td class="style1">Lease Back Type</td>
          <td class="style2">
				<asp:RadioButtonList runat="server" id="rdoExpressFundType" RepeatDirection="Horizontal">
				<asp:ListItem Selected="True" Value="N">Direct Financing
				</asp:ListItem>
				<asp:ListItem Value="Y">Lease Back</asp:ListItem>
			</asp:RadioButtonList>
			</td>
        </tr>
			<tr>
          <td class="style1" style="height: 31px">New / Used&nbsp; Type</td>
          <td class="style2" style="height: 31px"> 
			<asp:RadioButtonList runat="server" id="RadioButtonList2" RepeatDirection="Horizontal">
				<asp:ListItem Value="N" Selected="True">New</asp:ListItem>
				<asp:ListItem Value="U">Used</asp:ListItem>
			</asp:RadioButtonList>
			</td>
        	</tr>
		<tr>
          <td class="style1">Conventional Type</td>
          <td class="style2"> 
			<asp:RadioButtonList runat="server" id="RadioButtonList3" RepeatDirection="Horizontal">
				<asp:ListItem Selected="True" Value="C">Conventional
				</asp:ListItem>
				<asp:ListItem Value="S">Syariah</asp:ListItem>
			</asp:RadioButtonList>
			</td>
        	</tr>
		<tr>
          <td class="style1">Vehicle Type</td>
          <td class="style2"> 
			<asp:RadioButtonList runat="server" id="rdlVehType" RepeatDirection="Horizontal">
				<asp:ListItem Selected="True" Value="P">Public</asp:ListItem>
				<asp:ListItem Value="NP">Non Public</asp:ListItem>
			</asp:RadioButtonList>
			</td>
        	</tr>
			<tr>
          <td class="style1">Floor Financing</td>
          <td class="style2">
				<asp:RadioButtonList runat="server" id="rdoFloorFinancing" RepeatDirection="Horizontal">
				<asp:ListItem Value="Y">Yes</asp:ListItem>
				<asp:ListItem Selected="True" Value="N">No</asp:ListItem>
			</asp:RadioButtonList>
				</td>
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
		<asp:TextBox runat="server" id="txtYear" CssClass="inptype" Width="60px">
		</asp:TextBox>
			<font color="red">&nbsp;*)</font></td>
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
          <td class="style1" rowspan="2">Admin Fee</td>
          <td class="style2"> 
				<asp:RadioButtonList runat="server" id="rdlAdminFeeCalcType" RepeatDirection="Horizontal">
					<asp:ListItem Value="A" Selected="True">Amount</asp:ListItem>
					<asp:ListItem Value="P">Percentage</asp:ListItem>
				</asp:RadioButtonList>
			</td>
        </tr>
        <tr> 
          <td class="style2"> 
				<asp:TextBox runat="server" id="txtAdminFee" CssClass="inptype"></asp:TextBox>
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
		<asp:ImageButton runat="server" id="BtnExit" ImageUrl="../../images/ButtonExit.gif" PostBackUrl="ProductDetail.aspx" /></td>
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
