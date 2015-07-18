<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="../../Confins.css">
<style type="text/css">
.style1 {
	font-family: Verdana;
	color: #FF0000;
}
</style>
</head>

<body>
<form id="FrmProductBudgetBranchListing" runat="server">
<div align="center">
  <div align="center">
    <div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopiorangekiri">&nbsp;</td>
      <td align="center" class="tdtopiorange">BRANCH BUDGET</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Branch ID</td>
      <td class="tdganjil" >
		<asp:HyperLink runat="server" id="LinkBranchId" NavigateUrl="BranchView.aspx" Target="_blank">A03
		</asp:HyperLink>
		</td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Branch Name</td>
      <td class="tdganjil">
		Grand Wijaya</td>
    </tr>
     <tr> 
      <td width="25%" class="tdgenap">Asset Type</td>
      <td class="tdganjil">
		Mobil</td>
    </tr>
  
 
	<tr>
      <td width="25%" class="tdgenap">Asset Category</td>
      <td class="tdganjil" >
			Non Truck</td>
    </tr>
	<tr>
      <td width="25%" class="tdgenap">Asset Usage</td>
      <td class="tdganjil">
			Commercial</td>
     
    </tr>
	<tr>
      <td width="25%" class="tdgenap">Finance Type</td>
      <td class="tdganjil">
			Consumer Finance</td>
     
    </tr>
	<tr>
      <td width="25%" class="tdgenap">Lease Back Type</td>
      <td class="tdganjil">
			Direct Financing</td>
 
    </tr>
    <tr>
      <td width="25%" class="tdgenap" style="height: 18px">New / Used</td>
      <td class="tdganjil" style="height: 18px">
			New</td>
	</tr>
	<tr>
	<td class="tdgenap">Conventional Type</td>
          <td class="tdganjil" colspan="2"> 
			Conventional
			</td>
        	</tr>
		<tr>
          <td class="tdgenap">Floor Financing</td>
          <td class="tdganjil" colspan="2">
				Yes
		 </td>
        </tr>

	<tr> 
      <td class="tdgenap" width="25%">Year</td>
      <td class="tdganjil">
		<asp:TextBox runat="server" id="TbnYear" Width="60px" CssClass="inptype"></asp:TextBox>
		</td>
      
    </tr>

    </table>
  <table border="0" cellspacing="0" cellpadding="0" style="width: 95%">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
          <td width="50%" align="right">
			<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" PostBackUrl="ProductBudgetBranchListing.aspx" />&nbsp;&nbsp;
			<asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" PostBackUrl="ProductBudgetBranchListing.aspx" /></td>
    </tr>
  </table>
    <br> 
    
      <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td height="20" class="tdtopiorangekiri" style="width: 10px">&nbsp;</td>
      <td align="center" class="tdtopiorange">BRANCH BUDGET LISTING</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <asp:GridView runat="server" id="GrdViewBranch" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
		<Columns>
			<asp:boundfield DataField="vyear" SortExpression="vyear" HeaderText="YEAR">
			</asp:boundfield>
			<asp:boundfield DataField="valunit" SortExpression="valunit" HeaderText="UNIT">
				<ItemStyle HorizontalAlign="Right" />
			</asp:boundfield>
			<asp:boundfield DataField="valamount" SortExpression="valamount" HeaderText="AMOUNT">
				<ItemStyle HorizontalAlign="Right" />
			</asp:boundfield>
			<asp:templatefield HeaderText="EDIT">
				
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="ProductBudgetBranchEdit.aspx" />
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="DELETE">
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../images/IconDelete.gif" />
				</ItemTemplate>
			</asp:templatefield>
		</Columns>
		<HeaderStyle CssClass="tdjudulorange" />
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
		<asp:ImageButton runat="server" id="BtnNext" ImageUrl="../../images/butkanan.gif" /></td>
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
		&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnAdd" ImageUrl="../../images/ButtonAdd.gif" PostBackUrl="ProductBudgetBranchAdd.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnBack" ImageUrl="../../images/ButtonBack.gif" PostBackUrl="ProductBudgetlisting.aspx" />&nbsp;</td>
    </tr>
  </table>

    </div>
  </div>
</div>
</form>
</body>
</html>