<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Supplier</title>
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
<form id="FrmSupplier" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ADMIN FEE</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
  <tr> 
      <td width="25%" class="style2">Branch</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="ddlBranch">
			<asp:ListItem>All</asp:ListItem>
			<asp:ListItem>Jakarta</asp:ListItem>
			<asp:ListItem>Bandung</asp:ListItem>
			<asp:ListItem>Surabaya</asp:ListItem>
			<asp:ListItem>xxxxx50xxxxx</asp:ListItem>
		</asp:DropDownList>
	</td>
   </tr>

  <tr> 
      <td width="25%" class="style2">Product Type</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="ddlProductType">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem>CF</asp:ListItem>
			<asp:ListItem>LS</asp:ListItem>
			<asp:ListItem>DE Mobil</asp:ListItem>
			<asp:ListItem>DE Motor</asp:ListItem>
		</asp:DropDownList>
		<font color="red">*)</font>
</td>
    </tr>
 	<tr> 
      <td width="25%" class="style2">Search By</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbSearch">
			<asp:ListItem>Asset Category</asp:ListItem>
			<asp:ListItem>Tenor</asp:ListItem>
		</asp:DropDownList>
		<asp:TextBox runat="server" id="TbsSearch" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" PostBackUrl="AdminFee.aspx" />&nbsp; 
        <asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" PostBackUrl="AdminFee.aspx" />&nbsp;</td>
    </tr>
  </table>
  <br />
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ADMIN FEE LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <asp:GridView runat="server" id="GrdViewSupplierListing" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
		<Columns>
			<asp:templatefield HeaderText="BRANCH">
				<AlternatingItemTemplate>
					<asp:HyperLink runat="server" id="LinkName" NavigateUrl="Branch.aspx" Target="_blank">xxxxxxxx50xxxxxxxx
					</asp:HyperLink>
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:HyperLink runat="server" id="LinkName" NavigateUrl="Branch.aspx" Target="_blank">xxxxxxxx50xxxxxxxx
					</asp:HyperLink>
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Left"></ItemStyle>
			</asp:templatefield>
			<asp:boundfield DataField="valproducttype" SortExpression="valproducttype" HeaderText="PRODUCT TYPE">
			<ItemStyle HorizontalAlign="Center"></ItemStyle>
			</asp:boundfield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="ASSET CATEGORY">
			<ItemStyle HorizontalAlign="Left"></ItemStyle>
			</asp:boundfield>
			<asp:boundfield DataField="valid" SortExpression="valid" HeaderText="TENOR">
			</asp:boundfield>
			<asp:templatefield HeaderText="ADMIN FEE TYPE">
				<AlternatingItemTemplate>
					<asp:Label runat="server" id="lblAdminFeeType" Text="Percentage">
					</asp:Label >
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:Label runat="server" id="lblAdminFeeType" Text="Amount">
					</asp:Label >
				</ItemTemplate>
			</asp:templatefield>

			<asp:templatefield HeaderText="ADMIN FEE VALUE">
				<AlternatingItemTemplate>
					<asp:Label runat="server" id="lblAdminFeeValue" Text="99.99 (%)">
					</asp:Label >
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:Label runat="server" id="lblAdminFeeValue" Text="999,999,999">
					</asp:Label >
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Right"></ItemStyle>
			</asp:templatefield>
			<asp:templatefield HeaderText="EDIT">
				<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="AdminFeeEdit.aspx" />
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="AdminFeeEdit.aspx" />
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="DELETE">
				<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../images/IconDelete.gif" />
				</AlternatingItemTemplate>
				<ItemStyle Width="5%" />
				<HeaderStyle Width="5%" />
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../images/IconDelete.gif" />
				</ItemTemplate>
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
		<asp:ImageButton runat="server" id="BtnFirstPrev" ImageUrl="../../images/butkiri1.gif" Width="20px" /></td>
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
		<asp:ImageButton runat="server" id="BtnPrint" ImageUrl="../../images/ButtonPrint.gif" /></td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnAdd" ImageUrl="../../images/ButtonAdd.gif" PostBackUrl="AdminFeeAdd.aspx" />&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
