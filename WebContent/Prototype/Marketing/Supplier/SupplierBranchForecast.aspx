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
<form id="FrmSupplierBranchForecast" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER FORECAST</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style2" style="width: 20%">Supplier Name</td>
      <td class="style1" colspan="5">
		PT. XXXXX</td>
    </tr>
    <tr> 
      <td class="style2" style="width: 20%">Year</td>
      <td class="style1" style="width: 79px">
		<asp:TextBox runat="server" id="TbnYear" Height="18px" Width="60px"></asp:TextBox>
		</td>
      <td class="tdgenap" style="width: 81px">
		Month</td>
      <td class="style1" style="width: 89px">
		<asp:DropDownList runat="server" id="CmbMonth" CssClass="inptype">
			<asp:ListItem>All</asp:ListItem>
			<asp:ListItem>January</asp:ListItem>
			<asp:ListItem>February</asp:ListItem>
			<asp:ListItem>March</asp:ListItem>
			<asp:ListItem>April</asp:ListItem>
			<asp:ListItem>May</asp:ListItem>
			<asp:ListItem>June</asp:ListItem>
			<asp:ListItem>July</asp:ListItem>
			<asp:ListItem>August</asp:ListItem>
			<asp:ListItem>September</asp:ListItem>
			<asp:ListItem>October</asp:ListItem>
			<asp:ListItem>November</asp:ListItem>
			<asp:ListItem>December</asp:ListItem>
		</asp:DropDownList>
		</td>
      <td class="tdgenap" style="width: 76px">
		Asset Status</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbAssetStatus" CssClass="inptype">
			<asp:ListItem>All</asp:ListItem>
			<asp:ListItem>New</asp:ListItem>
			<asp:ListItem>Used</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" PostBackUrl="SupplierBranchForecast.aspx" />&nbsp; 
        <asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" PostBackUrl="SupplierBranchForecast.aspx" />&nbsp;</td>
    </tr>
  </table>
  <br />
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER FORECAST LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <asp:GridView runat="server" id="GrdViewSupplierBudgetListing" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
		<Columns>
			<asp:templatefield HeaderText="YEAR">
				<AlternatingItemTemplate>
					YYYY
				</AlternatingItemTemplate>
				<ItemTemplate>
					YYYY
				</ItemTemplate>
			</asp:templatefield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="MONTH">
			</asp:boundfield>
			<asp:templatefield HeaderText="ASSET STATUS">
				<AlternatingItemTemplate>
					Used
				</AlternatingItemTemplate>
				<ItemTemplate>
					New
				</ItemTemplate>
			</asp:templatefield>
			<asp:boundfield DataField="valunit" SortExpression="valunit" HeaderText="UNIT">
			</asp:boundfield>
			<asp:boundfield DataField="valamount" SortExpression="valamount" HeaderText="AMOUNT">
			</asp:boundfield>
			<asp:templatefield HeaderText="EDIT">
				<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="SupplierBudgetEdit.aspx" />
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="SupplierBudgetEdit.aspx" />
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="DELETE">
				<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../images/IconDelete.gif" />
				</AlternatingItemTemplate>
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
		<asp:TextBox runat="server" id="TbnPage" Width="20px" Height="18px">
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
		<asp:ImageButton runat="server" id="BtnAdd" ImageUrl="../../images/ButtonAdd.gif" PostBackUrl="SupplierForecastAdd.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnBack" ImageUrl="../../images/ButtonBack.gif" PostBackUrl="SupplierBranch.aspx" />&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
