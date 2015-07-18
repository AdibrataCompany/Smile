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
      <td align="center" class="tdtopihijau">PRODUCT DETAIL - VIEW</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="style2" style="height: 18px">Product ID</td>
      <td class="style1" style="height: 18px">
		CFMOHND001</td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Description</td>
      <td class="style1">
		PRODUCT CONSUMER FINANCE NEW HONDA</td>
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
			<asp:templatefield HeaderText="DETAIL">
				<AlternatingItemTemplate>
					<asp:HyperLink runat="server" id="lnkDetail" NavigateUrl="ProductDetailView2.aspx">Detail
					</asp:HyperLink>
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:HyperLink runat="server" id="lnkDetail" NavigateUrl="ProductDetailView2.aspx">Detail
					</asp:HyperLink>
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
		<asp:ImageButton runat="server" id="BtnBack" ImageUrl="../../images/ButtonBack.gif" PostBackUrl="ProductView.aspx" /></td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnClose" ImageUrl="../../images/ButtonClose.gif" PostBackUrl="javascript:window.close();"/>
		&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
