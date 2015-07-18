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
<form id="FrmAssetMasterListing" runat="server">
<div align="center">
  <div align="center">
    <div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET MASTER</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Search By</td>
      <td class="tdganjil">
		<asp:DropDownList runat="server" id="CmbSearch" CssClass="inptype">
			<asp:ListItem>Asset Code</asp:ListItem>
			<asp:ListItem>Description</asp:ListItem>
		</asp:DropDownList>
&nbsp;
		<asp:TextBox runat="server" id="TbsSearch" CssClass="inptype"></asp:TextBox>
&nbsp;</td>
    </tr>
    <tr> 
      <td class="tdgenap">Asset Type</td>
      <td class="tdganjil">
		<asp:DropDownList runat="server" id="CmbSearchAssetType" CssClass="inptype">
		<asp:ListItem>Motorcycle</asp:ListItem>
		<asp:ListItem>xxxxxxxx50xxxxxxxx</asp:ListItem>
		</asp:DropDownList>
        </td>
    </tr>
  </table>
      <table width="95%" border="0" cellspacing="0" cellpadding="0">
        <tr> 
          <td height="30">&nbsp;</td>
          <td align="right">&nbsp;
          <asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" PostBackUrl="AssetMasterListing.aspx" />&nbsp; 
          <asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" PostBackUrl="AssetMasterListing.aspx" />&nbsp;</td>
        </tr>
      </table>
  <br>
  <table border="0" cellspacing="0" cellpadding="0" style="width: 95%">
    <tr class="trtopiabu"> 
      <td width="10" class="tdtopihijaukiri" style="height: 19px"></td>
      <td align="center" class="tdtopihijau" style="height: 19px">ASSET MASTER LISTING</td>
      <td width="10" class="tdtopihijaukanan" style="height: 19px"></td>
    </tr>
  </table>
      <asp:GridView runat="server" id="GrdViewAssetMasterListing" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
		<Columns>
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
			</asp:boundfield>
			<asp:boundfield DataField="valid" SortExpression="valid" HeaderText="ASSET LEVEL">
				<ItemStyle Width="15%" />
				<HeaderStyle Width="15%" />
			</asp:boundfield>
			<asp:templatefield HeaderText="ADD DETAIL">
				<EditItemTemplate>
					&nbsp;
				</EditItemTemplate>
				<AlternatingItemTemplate>
					<div class="style2">
						<asp:HyperLink runat="server" id="LinkAddDetail2" ToolTip="Example. Asset Level : TYPE" NavigateUrl="AssetMasterAddDetail2.aspx" Target="_self">Add Detail
						</asp:HyperLink>
					</div>
				</AlternatingItemTemplate>
				<FooterTemplate>
					&nbsp;
				</FooterTemplate>
				<ItemTemplate>
					<div class="style2">
						<asp:HyperLink runat="server" id="LinkAddDetail1" ToolTip="Example. Asset Level : BRAND" NavigateUrl="AssetMasterAddDetail1.aspx">Add Detail
						</asp:HyperLink>
					</div>
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="EDIT">
				<AlternatingItemTemplate>
					<div class="style2">
						<asp:ImageButton runat="server" id="BtnIcoEdit2" ImageUrl="../../images/IconEdit.gif" Width="17px" ToolTip="Example. Asset Level : MODEL" PostBackUrl="AssetMasterEdit2.aspx" />
					</div>
				</AlternatingItemTemplate>
				<ItemStyle Width="10%" />
				<HeaderStyle Width="10%" />
				<ItemTemplate>
					<div class="style2">
						<asp:ImageButton runat="server" id="BtnIcoEdit1" ImageUrl="../../images/IconEdit.gif" Height="16px" PostBackUrl="AssetMasterEdit.aspx" ToolTip="Example. Asset Level : BRAND or TYPE" />
					</div>
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="DELETE">
				<AlternatingItemTemplate>
					<div class="style2">
						<asp:ImageButton runat="server" id="BtnIcoDelete" ImageUrl="../../images/IconDelete.gif" />
					</div>
				</AlternatingItemTemplate>
				<ItemStyle Width="10%" />
				<HeaderStyle Width="10%" />
				<ItemTemplate>
					<div class="style2">
						<asp:ImageButton runat="server" id="BtnIcoDelete" ImageUrl="../../images/IconDelete.gif" />
					</div>
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
&nbsp;&nbsp; 
        <asp:ImageButton runat="server" id="BtnGo" ImageUrl="../../images/buttonGO.gif" /></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">
		<asp:ImageButton runat="server" id="BtnPrint" ImageUrl="../../images/ButtonPrint.gif" PostBackUrl="ReportAssetMaster.aspx" /></td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnAdd" ImageUrl="../../images/ButtonAdd.gif" PostBackUrl="AssetMasterAdd.aspx" /></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>