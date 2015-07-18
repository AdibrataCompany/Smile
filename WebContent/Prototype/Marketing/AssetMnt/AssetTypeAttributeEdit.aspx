<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
<link rel="stylesheet" type="text/css" href="../../Confins.css">
<style type="text/css">
.style1 {
	background-color: #FFFFFF;
	text-align: left;
}
</style>
</head>

<body>
<form id="form1" runat="server">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET ATTRIBUTE</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Asset Type ID</td>
      <td class="tdganjil">
			<asp:HyperLink runat="server" id="LinkAssetTypeId" NavigateUrl="AssetTypeView.aspx" Target="_blank">MOTORCYCLE
			</asp:HyperLink>
		</td>
    </tr>
    <tr> 
      <td class="tdgenap">Description</td>
      <td class="tdganjil">Motorcycle</td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET ATTRIBUTE - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="25%" class="tdgenap">Attribute ID</td>
          <td class="tdganjil">COLOR</td>
        </tr>
        <tr> 
          <td class="tdgenap">Attribute Name</td>
          <td class="tdganjil">
			<asp:TextBox runat="server" id="TbsAttributeName" Width="315px" CssClass="inptype">Color</asp:TextBox>
&nbsp;<font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="tdgenap">Attribute Type</td>
          <td class="tdganjil">
			<asp:DropDownList runat="server" id="CmbAttributeType" CssClass="inptype">
				<asp:ListItem Value="C">Character</asp:ListItem>
				<asp:ListItem Value="N">Numeric</asp:ListItem>
			</asp:DropDownList>
&nbsp;<font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="tdgenap">Atribute Length</td>
          <td class="style1">
			<asp:TextBox runat="server" id="TbnAttributeLength" CssClass="inptype">20</asp:TextBox>
&nbsp;<font color="red">*)</font> </td>
        </tr>
        </table>
    </div>
    
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="AssetTypeAttribute.aspx" Height="20px" />&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="AssetTypeAttribute.aspx" /></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
