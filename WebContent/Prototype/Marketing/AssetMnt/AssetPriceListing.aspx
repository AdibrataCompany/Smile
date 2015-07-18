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
.style2 {
	text-align: center;
}
</style>
</head>

<body>
<form id="FrmAssetPriceListing" runat="server">
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
			<asp:ListItem>Description</asp:ListItem>
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
     <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET PRICE LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div class="style2"> 
      <div class="style2">
		<asp:GridView runat="server" id="GrdViewAssetTypeListing" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" Width="95%" CellPadding="2">
			<Columns>
				<asp:templatefield HeaderText="BRANCH ID" >
					<AlternatingItemTemplate>
					<div class="style2">
						<asp:HyperLink runat="server" id="LinkID" Target="_blank" NavigateUrl="AssetTypeView.aspx" >xx3xx
						</asp:HyperLink>
					</div>
					</AlternatingItemTemplate>
					<ItemStyle Width="13%" />
					<HeaderStyle Width="13%" />
					<ItemTemplate>
					<div class="style2">
						<asp:HyperLink runat="server" id="LinkID" Target="_blank" NavigateUrl="AssetTypeView.aspx" >xx3xx
						</asp:HyperLink>
						</div>
					</ItemTemplate>
				</asp:templatefield>
				<asp:templatefield HeaderText="ASSET CODE">
				<AlternatingItemTemplate>
					<div class="style3">
						<asp:HyperLink runat="server" id="LinkAssetCode" NavigateUrl="AssetMasterView.aspx" Target="_blank" ToolTip="Example. Asset Code : Honda, Honda. Supra, Honda. Supra. Fit  Description : Honda, Honda. Supra, Honda. Supra. Fit  and Asset Level : BRAND, TYPE, MODEL">xxxxxxxx50xxxxxxxx
						</asp:HyperLink>
					</div>
				</AlternatingItemTemplate>
				<ItemStyle Width="15%" />
				<HeaderStyle Width="15%" />
				<ItemTemplate>
					<div class="style3">
						<asp:HyperLink runat="server" id="LinkAssetCode" NavigateUrl="AssetMasterView.aspx" Target="_blank" ToolTip="Example. Asset Code : Honda, Honda. Supra, Honda. Supra. Fit  Description : Honda, Honda. Supra, Honda. Supra. Fit  and Asset Level : BRAND, TYPE, MODEL">xxxxxxxx50xxxxxxxx
						</asp:HyperLink>
					</div>
				</ItemTemplate>
				</asp:templatefield>

				<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="DESCRIPTION">
					<ItemStyle Width="20%" />
					<HeaderStyle Width="20%" />
				</asp:boundfield>
				<asp:boundfield DataField="vyear" SortExpression="vyear" HeaderText="YEAR" >
					<ItemStyle Width="20%" HorizontalAlign="Center" />
					<HeaderStyle Width="20%" />
				</asp:boundfield>
				<asp:boundfield DataField="vusednew" SortExpression="vusednew" HeaderText="USED/NEW" >
					<ItemStyle Width="20%" HorizontalAlign="Center" />
					<HeaderStyle Width="20%" />
				</asp:boundfield>
				<asp:boundfield DataField="valdate" SortExpression="valdate" HeaderText="DATE" >
					<ItemStyle Width="20%" HorizontalAlign="Center" />
					<HeaderStyle Width="20%" />
				</asp:boundfield>
				<asp:boundfield DataField="valamount" SortExpression="valamount" HeaderText="PRICE">
					<ItemStyle Width="20%" HorizontalAlign="Right"/>
					<HeaderStyle Width="20%" />
				</asp:boundfield>	
				<asp:templatefield HeaderText="EDIT">
				<AlternatingItemTemplate>
					<div class="style2">
						<asp:ImageButton runat="server" id="BtnIcoEdit2" ImageUrl="../../images/IconEdit.gif" Width="17px" PostBackUrl="AssetPriceListEdit.aspx" />
					</div>
				</AlternatingItemTemplate>
				<ItemStyle Width="10%" />
				<HeaderStyle Width="10%" />
				<ItemTemplate>
					<div class="style2">
						<asp:ImageButton runat="server" id="BtnIcoEdit1" ImageUrl="../../images/IconEdit.gif" Height="16px" PostBackUrl="AssetPriceListEdit.aspx" />
					</div>
				</ItemTemplate>
			</asp:templatefield>
				
			</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
		</asp:GridView>
		</div>
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
    </div>
    
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
      <td width="130" align="center">Page&nbsp;
		<asp:TextBox runat="server" id="TbnPage" Width="20px" CssClass="inptype">
		</asp:TextBox>
&nbsp;&nbsp;&nbsp;
		<asp:ImageButton runat="server" id="BtnGo" ImageUrl="../../images/buttonGO.gif" />&nbsp; 
        </td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30"><a></a>
		<asp:ImageButton runat="server" id="BtnPrint" ImageUrl="../../images/ButtonPrint.gif" PostBackUrl="ReportAssetPrice.aspx" /></td>     
    </tr>
  </table>
    </div>
    
  </div>
</form>
</body>
</html>