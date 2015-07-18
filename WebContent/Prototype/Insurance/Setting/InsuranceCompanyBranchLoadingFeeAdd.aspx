<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
</head>

<body>
<form id="form1" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">INSURANCE COMPANY LOADING FEE - ADD</td>
      <td width="10"><img src="../../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Insurance Co. Branch Id</td>
      <td class="tdganjil">PANIN-JKT</td>
    </tr>
    <tr> 
      <td class="tdgenap">Insurance Co. Branch Name</td>
      <td class="tdganjil">Panin Insurance Jakarta</td>
    </tr>
    <tr> 
      <td class="tdgenap">Company Branch </td>
      <td class="tdganjil">Palmerah</td>
    </tr>
    <tr> 
      <td class="tdgenap">Currency</td>
      <td class="tdganjil"> 
        	<asp:DropDownList runat="server" id="ddlCurrency">
			<asp:ListItem>IDR</asp:ListItem>
			<asp:ListItem>USD</asp:ListItem>
		</asp:DropDownList>
      </td>
    </tr>
    <tr>
      <td class="tdgenap">Asset Type</td>
      <td class="tdganjil"> 
		<asp:DropDownList runat="server" id="ddlAssetType">
			<asp:ListItem Value="Select One">Select One</asp:ListItem>
			<asp:ListItem Value="Automotive">Automotive</asp:ListItem>
			<asp:ListItem Value="Motorcycle">Motorcycle</asp:ListItem>
		</asp:DropDownList>
		</td>
    	</tr>
    <tr>
      <td class="tdgenap">Coverage Type</td>
      <td class="tdganjil"> 
		<asp:DropDownList runat="server" id="ddlCoverageType">
			<asp:ListItem Value="ARK">All Risk</asp:ListItem>
			<asp:ListItem>TLO</asp:ListItem>
			<asp:ListItem Value="FIRE">Fire</asp:ListItem>
		</asp:DropDownList>
		</td>
    	</tr>
		<tr>
      <td class="tdgenap">Maximum Asset Age</td>
      <td class="tdganjil"> 
		<asp:TextBox runat="server" id="txtAssetAge" CssClass="inptype" Width="60px">
		</asp:TextBox>
&nbsp;year(s)</td>
    	</tr>
    <tr> 
      <td class="tdgenap">Loading Fee Rate</td>
      <td class="tdganjil"> <font size="1"> 
        <asp:TextBox runat="server" id="txtLoadingFee" CssClass="inptype" Width="60px">
		</asp:TextBox>
&nbsp;</font><font color="red">*)</font> </td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="imbSave" Imageurl="../Images/ButtonSave.gif" PostBackUrl="InsuranceCompanyBranchLoadingFee.aspx"/>
		<asp:ImageButton runat="server" id="imbCancel" ImageUrl="../Images/ButtonCancel.gif" PostBackUrl="InsuranceCompanyBranchLoadingFee.aspx"/>
    </tr>
  </table>
</div>
</form>
</body>
</html>
