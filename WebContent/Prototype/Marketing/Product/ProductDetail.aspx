<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>PRODUCT</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<style type="text/css">
.style1 {
	background-color: #FFFFFF;
	text-align: left;
}
.style2 {
	background-color: #F4FAFF;
	text-align: left;
}
.style3 {
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmProductPerTenorListing" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">PRODUCT DETAIL</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="style2">Product ID</td>
      <td class="style1" colspan="3">
		CFMOHND001</td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Description</td>
      <td class="style1" colspan="3">
		PRODUCT CONSUMER FINANCE NEW HONDA</td>
    </tr>
    <tr>
      <td width="25%" class="style2">Product Type</td>
      <td class="style1" colspan="3">
			KCM</td>
    </tr>
    <tr>
      <td width="25%" class="style2">Asset Type</td>
      <td class="style1" colspan="3">
			AUTOMOTIVE</td>
    </tr>
	<tr>
      <td width="25%" class="style2">Asset Category</td>
      <td class="style1" colspan="3">
			Non Truck</td>
    </tr>
	<tr>
      <td width="25%" class="style2">Asset Usage</td>
      <td class="style1">
			Commercial</td>
      <td width="25%" class="style2">New / Used</td>
      <td class="style1">
			New</td>
    </tr>
	<tr>
      <td width="25%" class="style2">Finance Type</td>
      <td class="style1">
			Consumer Finance</td>
      <td width="25%" class="style2">Conventional Type</td>
      <td class="style1">
			Conventional</td>
    </tr>
	<tr>
      <td width="25%" class="style2">Lease Back Type</td>
      <td class="style1">
			Direct Financing</td>
      <td class="style2">
						Floor Financing</td>
      <td class="style1">
			Yes</td>
    </tr>
	<tr>
      <td width="25%" class="style2">Asset Origination</td>
      <td class="style1">
			<asp:DropDownList runat="server" id="ddlAssetOrig" CssClass="inptype">
				<asp:ListItem Selected="True">All</asp:ListItem>
				<asp:ListItem>CKD</asp:ListItem>
				<asp:ListItem>CBU</asp:ListItem>
				<asp:ListItem>Karoseri</asp:ListItem>
			</asp:DropDownList>
		</td>
      <td class="style2">
			Customer Rating</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="ddlCustRating" Width="103px" CssClass="inptype">
				<asp:ListItem Selected="True">All</asp:ListItem>
				<asp:ListItem Value="1">1 - Excellent</asp:ListItem>
				<asp:ListItem Value="2">2 - Good</asp:ListItem>
				<asp:ListItem Value="3">3 - Regular</asp:ListItem>
				<asp:ListItem Value="4">4 - Warning</asp:ListItem>
				<asp:ListItem Value="5">5 - Bad</asp:ListItem>
			</asp:DropDownList>
		</td>
    </tr>
	<tr>
      <td width="25%" class="style2">Asset Group</td>
      <td class="style1">
			<asp:DropDownList runat="server" id="ddlAssetGroup" Width="103px" CssClass="inptype">
				<asp:ListItem Selected="True">All</asp:ListItem>
				<asp:ListItem Value="A">Group A</asp:ListItem>
				<asp:ListItem Value="B">Group B</asp:ListItem>
			</asp:DropDownList>
		</td>
      <td class="style2">
		Year &gt;=</td>
      <td class="style1">
		<asp:TextBox runat="server" id="txtYear0" CssClass="inptype" Width="66px">
		</asp:TextBox>
		</td>
    </tr>
	<tr>
      <td width="25%" class="style2">Tenor</td>
      <td class="style1" colspan="3">
		<asp:TextBox runat="server" id="txtTenorStart0" CssClass="inptype" Width="36px">
		</asp:TextBox>
&nbsp;To
		<asp:TextBox runat="server" id="txtTenorEnd0" CssClass="inptype" Width="36px">
		</asp:TextBox>
		</td>
    </tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" />&nbsp; 
        <asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" />&nbsp;</td>
    </tr>
  </table>
  <br />
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">PRODUCT DETAIL LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <asp:GridView runat="server" id="GrdViewProductDetailListing" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
		<Columns>
			<asp:boundfield DataField="valstring3" HeaderText="ASSET ORIG" SortExpression="valstring3">
			</asp:boundfield>
			<asp:templatefield HeaderText="GROUP">
				<AlternatingItemTemplate>
					<asp:Label runat="server" Text="A"></asp:Label>
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:Label runat="server" Text="B"></asp:Label>
				</ItemTemplate>
			</asp:templatefield>
			<asp:boundfield DataField="valstring2" HeaderText="CUST RATING" SortExpression="valstring2">
			</asp:boundfield>
			<asp:boundfield DataField="valstringyear" HeaderText="YEAR" SortExpression="valstringyear">
			</asp:boundfield>
			<asp:boundfield DataField="valstring2" HeaderText="TENOR" SortExpression="valstring2">
			</asp:boundfield>
			<asp:boundfield DataField="valyesno" HeaderText="ACTIVE" SortExpression="valyesno">
			</asp:boundfield>
			<asp:templatefield HeaderText="EDIT">
				<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="BtnIcoEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="ProductDetailEdit.aspx" />
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnIcoEdit0" ImageUrl="../../images/IconEdit.gif" PostBackUrl="ProductDetailEdit.aspx" />
				</ItemTemplate>
				<HeaderStyle Width="10%" />
				<ItemStyle Width="10%" />
			</asp:templatefield>
		</Columns>
		<HeaderStyle CssClass="tdjudulhijau" />
		<AlternatingRowStyle CssClass="tdgenap" />
		</asp:GridView>
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
    </div>
    
  </div>
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnFirstPrev" ImageUrl="../../images/butkiri1.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnPrev" ImageUrl="../../images/butkiri.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnNext" ImageUrl="../../images/butkanan.gif" Width="20px" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnLastNext" ImageUrl="../../images/butkanan1.gif" /></td>
      <td width="130" align="center">Page&nbsp;
		<asp:TextBox runat="server" id="TbnPage" Width="20px" CssClass="inptype">
		</asp:TextBox>
&nbsp;&nbsp; 
        <asp:ImageButton runat="server" id="BtnGo" ImageUrl="../../images/buttonGO.gif" /></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30" class="style3">
		<asp:ImageButton runat="server" id="BtnBack" ImageUrl="../../images/ButtonBack.gif" PostBackUrl="Product.aspx" /></td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnAdd" ImageUrl="../../images/ButtonAdd.gif" PostBackUrl="ProductDetailAdd.aspx" />&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
