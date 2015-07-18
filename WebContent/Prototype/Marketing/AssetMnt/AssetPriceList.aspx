<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="../../Confins.css">
</head>

<body>
<form id="FrmAssetPrice" runat="server">
<div align="center">
  <div align="center">
    <div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET PRICE</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
  <tr> 
      <td class="tdgenap">Branch</td>
      <td class="tdganjil"><asp:DropDownList runat="server" id="CmbBranch">
		<asp:ListItem>All</asp:ListItem>
		<asp:ListItem>Jakarta</asp:ListItem>
		<asp:ListItem>xxxxxxxxxx50xxxxxxxxxx</asp:ListItem>
		</asp:DropDownList>
        </td>
    </tr>

  <tr> 
      <td class="tdgenap">Asset Type</td>
      <td class="tdganjil"><asp:DropDownList runat="server" id="CmbAssetType">
		<asp:ListItem>Automotive</asp:ListItem>
		<asp:ListItem>xxxxxxxx50xxxxxxxx</asp:ListItem>
		</asp:DropDownList>
        </td>
    </tr>
    <tr> 
      <td class="tdgenap">Asset Category</td>
      <td class="tdganjil"><asp:DropDownList runat="server" id="CmbAssetCategory">
		<asp:ListItem>All</asp:ListItem>
		<asp:ListItem>Bus</asp:ListItem>
		<asp:ListItem>xxxxxxxx50xxxxxxxx</asp:ListItem>
		</asp:DropDownList> <font color="red">*) depend on selected asset type</font> 
        </td>
    </tr>

    <tr> 
      <td width="25%" class="tdgenap">Search By</td>
      <td class="tdganjil">
		<asp:DropDownList runat="server" id="CmbSearch">
			<asp:ListItem>Asset Code</asp:ListItem>
			<asp:ListItem>Legal Description</asp:ListItem>
			<asp:ListItem>Commercial Description</asp:ListItem>
			<asp:ListItem>Year</asp:ListItem>
		</asp:DropDownList>
&nbsp;
		<asp:TextBox runat="server" id="TbsSearch" CssClass="inptype"></asp:TextBox>
&nbsp;</td>
    </tr>
    
  </table>
  <table border="0" cellspacing="0" cellpadding="0" style="width: 95%">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
          <td width="50%" align="right">
			<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" PostBackUrl="AssetPriceListing.aspx" />&nbsp;
			<asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" PostBackUrl="AssetPriceList.aspx" /></td>
    </tr>
  </table>
    </div>
  </div>
</div>
</form>
</body>
</html>