<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>PRODUCT BRANCH</title>
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
.style3 {
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmProductBranchByBranch" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">PRODUCT BRANCH&nbsp;</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="style1">Search By</td>
      <td class="style2">
		<asp:DropDownList runat="server" id="CmbSearch">
			<asp:ListItem>Product ID</asp:ListItem>
			<asp:ListItem>Description</asp:ListItem>
		</asp:DropDownList>
&nbsp;
		<asp:TextBox runat="server" id="TbsSearch" CssClass="inptype"></asp:TextBox>
&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" PostBackUrl="ProductBranchByBranch.aspx" />&nbsp; 
        <asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" PostBackUrl="ProductBranchByBranch.aspx" />&nbsp;</td>
    </tr>
  </table>
  
  <br />
  
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">PRODUCT BRANCH</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <asp:GridView runat="server" id="GrdViewProductBranchByBranchListing" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
		<Columns>
			<asp:templatefield HeaderText="PRODUCT ID">
				<AlternatingItemTemplate>
					<asp:HyperLink runat="server" id="LinkProductId" NavigateUrl="ProductBranchView.aspx" Target="_blank">xxxxx10xxxxx
					</asp:HyperLink>
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:HyperLink runat="server" id="LinkProductId" NavigateUrl="ProductBranchView.aspx" Target="_blank">xxxxx10xxxxx
					</asp:HyperLink>
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Left" />
			</asp:templatefield>
			<asp:boundfield DataField="valstring50" HeaderText="DESCRIPTION" SortExpression="valstring50">
				<ItemStyle HorizontalAlign="Left" />
			</asp:boundfield>
			<asp:boundfield DataField="valBool" HeaderText="ACTIVE" SortExpression="valBool">
			</asp:boundfield>
			<asp:templatefield HeaderText="PRODUCT BRANCH DETAIL">
				<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="btnBranchDtl" ImageUrl="../../images/IconDocument.gif" PostBackUrl="ProductBranchDetail.aspx" />
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:ImageButton runat="server" id="btnBranchDtl" ImageUrl="../../images/IconDocument.gif" PostBackUrl="ProductBranchDetail.aspx" />
				</ItemTemplate>
				<HeaderStyle Width="10%" />
				<ItemStyle Width="10%" />
			</asp:templatefield>
			<asp:templatefield HeaderText="PRODUCT OFFERING">
				<AlternatingItemTemplate>
					<asp:HyperLink runat="server" id="LinkProductOffering" NavigateUrl="ProductOffering.aspx" Target="_self">Product Offering
					</asp:HyperLink>
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:HyperLink runat="server" id="LinkProductOffering" NavigateUrl="ProductOffering.aspx" Target="_self">Product Offering
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="EDIT">
				<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="BtnIcoEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="ProductBranchEdit.aspx" />
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnIcoEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="ProductBranchEdit.aspx" />
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
		<asp:ImageButton runat="server" id="BtnFirstPrev" ImageUrl="../../images/butkiri1.gif" Width="20px" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnPrev" ImageUrl="../../images/butkiri.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnNext" ImageUrl="../../images/butkanan.gif" Width="20px" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnLastNext" ImageUrl="../../images/butkanan1.gif" /></td>
      <td width="130" align="center">Page 
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
		<asp:ImageButton runat="server" id="BtnPrint" ImageUrl="../../images/ButtonPrint.gif" PostBackUrl="ReportProductBranchByBranch.aspx" /></td>
      <td width="50%" align="right">&nbsp; </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
