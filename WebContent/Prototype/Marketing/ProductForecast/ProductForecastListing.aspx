<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="../../Confins.css">
</head>

<body>
<form id="FrmProductFORECASTListing" runat="server">
<div align="center">
  <div align="center">
    <div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopiorangekiri">&nbsp;</td>
      <td align="center" class="tdtopiorange">PRODUCT FORECAST</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap">Branch</td>
      <td class="tdganjil" >
		<asp:DropDownList runat="server" id="DDLBranch" CssClass="inptype" Width="143px" Height="16px">
			<asp:ListItem>All</asp:ListItem>
			<asp:ListItem>Bandung</asp:ListItem>
			<asp:ListItem>Jakarta</asp:ListItem>
		</asp:DropDownList>
		</td>
		
    </tr>
          <tr>
          <td class="tdgenap" width="20%">Asset Type</td>
          <td class="tdganjil" width="80%">
		  <asp:DropDownList runat="server" id="ddlAssetType" Width="250px" CssClass="inptype">
				<asp:ListItem Text="All"></asp:ListItem>
				<asp:ListItem Text="Mobil"></asp:ListItem>
				<asp:ListItem  Text="Motor"></asp:ListItem>
			</asp:DropDownList>

        </tr>
	
	<tr> 
      <td width="20%" class="tdgenap">Asset Category</td>
      <td class="tdganjil" >
			<asp:DropDownList runat="server" id="ddlAssetCategory" Width="250px" CssClass="inptype">
				<asp:ListItem Text="All"></asp:ListItem>
				<asp:ListItem Value="N" Text="Non Truck"></asp:ListItem>
				<asp:ListItem Value="T" Text="Truck"></asp:ListItem>
			</asp:DropDownList>

		</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Asset Usage</td>
      <td class="tdganjil" >
			<asp:DropDownList runat="server" id="CmbVehicleType" CssClass="inptype">
				<asp:ListItem Text="All"></asp:ListItem>
				<asp:ListItem Value="C" Text="Commercial"></asp:ListItem>
				<asp:ListItem Value="N" Text="Non Commercial"></asp:ListItem>
			</asp:DropDownList>

		</td>
    </tr>

	<tr> 
      <td width="20%" class="tdgenap">Finance Type</td>
      <td class="tdganjil" >
			<asp:RadioButtonlist runat="server" id="RdBtnFinanceType" RepeatDirection="Horizontal">
			<asp:ListItem Text="Consumer Finance"></asp:ListItem>
			<asp:ListItem Text="Finance Lease"></asp:ListItem>
			<asp:ListItem Text="Both" Selected="True"></asp:ListItem>
			</asp:RadioButtonList>
		</td>
    </tr>
	<tr> 
      <td width="20%" class="tdgenap">Leaseback Type</td>
      <td class="tdganjil">
			<asp:RadioButtonlist runat="server" id="RdBtnLeaseBack" RepeatDirection="Horizontal">
			<asp:ListItem Text="Direct Finance"></asp:ListItem>
			<asp:ListItem Text="Leaseback"></asp:ListItem>
			<asp:ListItem Text="Both" Selected="True"></asp:ListItem>
			</asp:RadioButtonList>

		</td>
    </tr>
	<tr> 
      <td width="20%" class="tdgenap">New / Used Type</td>
      <td class="tdganjil" >
			<asp:RadioButtonlist runat="server" id="RdBtnNew" RepeatDirection="Horizontal">
			<asp:ListItem Text="New"></asp:ListItem>
			<asp:ListItem Text="Used"></asp:ListItem>
			<asp:ListItem Text="Both" Selected="True"></asp:ListItem>
			</asp:RadioButtonList>
    </tr>
   	<tr>
          <td class="tdgenap">Conventional Type</td>
          <td class="tdganjil" colspan="2"> 
			<asp:RadioButtonList runat="server" id="rdlConventionalType" RepeatDirection="Horizontal">
				<asp:ListItem  Value="C" Text="Conventional"></asp:ListItem>
				<asp:ListItem Value="S" Text="Syariah"></asp:ListItem>
				<asp:ListItem  Text="Both" Selected="True"></asp:ListItem>				
			</asp:RadioButtonList>
			</td>
        	</tr>
		<tr>
          <td class="tdgenap">Floor Financing</td>
          <td class="tdganjil" colspan="2">
				<asp:RadioButtonList runat="server" id="rdoFloorFinancing" RepeatDirection="Horizontal">
				<asp:ListItem Value="Y" Text="Yes"></asp:ListItem>
				<asp:ListItem Value="N" Text="No"></asp:ListItem>
				<asp:ListItem Text="Both" Selected="True"></asp:ListItem>
				
			</asp:RadioButtonList>
				</td>
        </tr>

    </table>
  <table border="0" cellspacing="0" cellpadding="0" style="width: 95%">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
          <td width="50%" align="right">
			<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" PostBackUrl="ProductFORECASTListing.aspx" />&nbsp;&nbsp;
			<asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" PostBackUrl="productFORECASTListing.aspx" /></td>
    </tr>
  </table>
    <br> 
    
      <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td height="20" class="tdtopiorangekiri" style="width: 10px">&nbsp;</td>
      <td align="center" class="tdtopiorange">PRODUCT FORECAST LISTING</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <asp:GridView runat="server" id="GrdViewBranch" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
		<Columns>
			<asp:boundfield DataField="valstring3" HeaderText="BRANCH ID">
			</asp:boundfield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="ASSET TYPE">
			</asp:boundfield>
			<asp:boundfield DataField="valstring50" HeaderText="ASSET CATEGORY">
			</asp:boundfield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="ASSET USSAGE">
			</asp:boundfield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="FINANCE TYPE">
			</asp:boundfield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="LEASEBACK TYPE">
			</asp:boundfield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="NEW / USED TYPE">
			</asp:boundfield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="CONVENTIONAL TYPE">
			</asp:boundfield>
			<asp:boundfield DataField="valyesno" HeaderText="FLOOR FINANCING">
				<ItemStyle HorizontalAlign="Center" />
			</asp:boundfield>
			<asp:templatefield HeaderText="EDIT">
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="ProductFORECASTBranchListing.aspx" />
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
		<asp:ImageButton runat="server" id="BtnAdd" ImageUrl="../../images/ButtonAdd.gif" PostBackUrl="ProductFORECASTAdd.aspx" />&nbsp;
	
    </tr>
  </table>



    </div>
  </div>
</div>
</form>
</body>
</html>