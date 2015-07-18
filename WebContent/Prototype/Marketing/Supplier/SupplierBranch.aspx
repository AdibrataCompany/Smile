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
<form id="FrmSupplierBranch" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER BRANCH</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="style2">Supplier Name</td>
      <td class="style1">
		PT. XXXXX</td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Search By</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbSearch">
			<asp:ListItem>Branch ID</asp:ListItem>
			<asp:ListItem>Branch Name</asp:ListItem>
			<asp:ListItem>MO Name</asp:ListItem>
		</asp:DropDownList>
&nbsp;
		<asp:TextBox runat="server" id="TbsSearch" Height="18px" CssClass="inptype"></asp:TextBox>
&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" PostBackUrl="SupplierBranch.aspx" />&nbsp; 
        <asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" PostBackUrl="SupplierBranch.aspx" />&nbsp;</td>
    </tr>
  </table>
  <br />
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER BRANCH LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <asp:GridView runat="server" id="GrdViewSupplierBranchListing" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
		<Columns>
			<asp:boundfield DataField="valstring10" SortExpression="valstring10" HeaderText="BRANCH ID">
				<ItemStyle HorizontalAlign="Left" />
			</asp:boundfield>
			<asp:templatefield HeaderText="BRANCH NAME">
				<AlternatingItemTemplate>
					<asp:HyperLink runat="server" id="LinkBranchName" NavigateUrl="../../Setting/Organization/BranchView.aspx" Target="_blank">xxxxxxxx50xxxxxxxx
					</asp:HyperLink>
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:HyperLink runat="server" id="LinkBranchName" NavigateUrl="../../Setting/Organization/BranchView.aspx" Target="_blank">xxxxxxxx50xxxxxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="MO NAME">
				<AlternatingItemTemplate>
					<asp:HyperLink runat="server" id="LinkMoName" NavigateUrl="../../Setting/Organization/BranchEmployeeView.aspx" Target="_blank">xxxxxxxx50xxxxxxxx
					</asp:HyperLink>
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:HyperLink runat="server" id="LinkMoName" NavigateUrl="../../Setting/Organization/BranchEmployeeView.aspx" Target="_blank">xxxxxxxx50xxxxxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="BUDGET">
				<AlternatingItemTemplate>
					<asp:HyperLink runat="server" id="LinkBudget" NavigateUrl="SupplierBranchBudget.aspx" Target="_self">Budget
					</asp:HyperLink>
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:HyperLink runat="server" id="LinkBudget" NavigateUrl="SupplierBranchBudget.aspx" Target="_self">Budget
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="FORECAST">
				<AlternatingItemTemplate>
					<asp:HyperLink runat="server" id="LinkForecast" NavigateUrl="SupplierBranchForecast.aspx" Target="_self">Forecast
					</asp:HyperLink>
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:HyperLink runat="server" id="LinkForecast" NavigateUrl="SupplierBranchForecast.aspx" Target="_self">Forecast
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="STATEMENT OF SUPPLIER">
				<AlternatingItemTemplate>
					<asp:HyperLink runat="server" id="LinkStatementOfSupplier" NavigateUrl="ReportStatementSupplier.aspx" Target="_self">Statement Of Supplier
					</asp:HyperLink>
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:HyperLink runat="server" id="LinkStatementOfSupplier" NavigateUrl="ReportStatementSupplier.aspx" Target="_self">Statement Of Supplier
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="INCENTIVE SCHEME">
				<AlternatingItemTemplate>
					<asp:HyperLink runat="server" id="LinkIncentiveScheme" NavigateUrl="SupplierIncentiveSchemeSetting.aspx" Target="_self">Incentive Scheme
					</asp:HyperLink>
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:HyperLink runat="server" id="LinkIncentiveScheme" NavigateUrl="SupplierIncentiveSchemeSetting.aspx" Target="_self">Incentive Scheme
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>

			<asp:templatefield HeaderText="EDIT">
				<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="SupplierBranchEdit.aspx" />
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="SupplierBranchEdit.aspx" />
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
		<asp:TextBox runat="server" id="TbnPage" Width="20px" Height="18px" CssClass="inptype">
		</asp:TextBox>
&nbsp;&nbsp; 
        <asp:ImageButton runat="server" id="BtnGo" ImageUrl="../../images/buttonGO.gif" /></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30" class="style3">
		&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnAdd" ImageUrl="../../images/ButtonAdd.gif" PostBackUrl="SupplierBranchAdd.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnAdd0" ImageUrl="../../images/ButtonBack.gif" PostBackUrl="Supplier.aspx" />&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
