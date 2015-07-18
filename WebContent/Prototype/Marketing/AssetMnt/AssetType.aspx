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

function OpenWindow(theURL)
{
  location.href = theURL;
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
<form id="FrmAssetTypeListing" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET TYPE</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Search By</td>
      <td class="tdganjil">&nbsp;<asp:DropDownList runat="server" id="CmbSearch">
		<asp:ListItem Value="Asset Type ID">Asset Type ID</asp:ListItem>
		<asp:ListItem>Description</asp:ListItem>
		</asp:DropDownList>
&nbsp;
		<asp:TextBox runat="server" id="TbsSearch" CssClass="inptype"></asp:TextBox>
        </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" PostBackUrl="AssetType.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" PostBackUrl="AssetType.aspx" /></td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET TYPE LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div class="style2"> 
      <div class="style2">
		<asp:GridView runat="server" id="GrdViewAssetTypeListing" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" Width="95%" CellPadding="2">
			<Columns>
				<asp:templatefield HeaderText="ID">
					<EditItemTemplate>
						&nbsp;
					</EditItemTemplate>
					<HeaderTemplate>
						ID
					</HeaderTemplate>
					<AlternatingItemTemplate>
						<asp:HyperLink runat="server" id="LinkID" Target="_blank" NavigateUrl="AssetTypeView.aspx" ToolTip="Example.  Id : MOTORCYCLE and Description : Motorcycle">xxxxx10xxxxx
						</asp:HyperLink>
					</AlternatingItemTemplate>
					<ItemStyle Width="13%" />
					<HeaderStyle Width="13%" />
					<ItemTemplate>
						<asp:HyperLink runat="server" id="LinkID" Target="_blank" NavigateUrl="AssetTypeView.aspx" ToolTip="Example.  Id : MOTORCYCLE and Description : Motorcycle">xxxxx10xxxxx
						</asp:HyperLink>
					</ItemTemplate>
				</asp:templatefield>
				<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="Description">
					<ItemStyle Width="20%" />
					<HeaderStyle Width="20%" />
				</asp:boundfield>
				<asp:templatefield HeaderText="Scheme">
					<AlternatingItemTemplate>
						<div class="style2">
							<asp:HyperLink runat="server" id="LinkScheme" Target="_self" NavigateUrl="AssetTypeScheme.aspx">Scheme
							</asp:HyperLink>
						</div>
					</AlternatingItemTemplate>
					<ItemTemplate>
						<div class="style2">
							<asp:HyperLink runat="server" id="LinkScheme" Target="_self" NavigateUrl="AssetTypeScheme.aspx">Scheme
							</asp:HyperLink>
						</div>
					</ItemTemplate>
				</asp:templatefield>
				<asp:templatefield HeaderText="Category">
					<AlternatingItemTemplate>
						<div class="style2">
							<asp:HyperLink runat="server" id="LinkCategory" NavigateUrl="AssetTypeCategory.aspx" Target="_self">Category
							</asp:HyperLink>
						</div>
					</AlternatingItemTemplate>
					<ItemTemplate>
						<div class="style2">
							<asp:HyperLink runat="server" id="LinkCategory" NavigateUrl="AssetTypeCategory.aspx" Target="_self">Category
							</asp:HyperLink>
						</div>
					</ItemTemplate>
				</asp:templatefield>
				<asp:templatefield HeaderText="Origination">
					<AlternatingItemTemplate>
						<div class="style2">
							<asp:HyperLink runat="server" id="LinkOrigination" NavigateUrl="AssetTypeOrigination.aspx" Target="_self">Origination
							</asp:HyperLink>
						</div>
					</AlternatingItemTemplate>
					<ItemTemplate>
						<div class="style2">
							<asp:HyperLink runat="server" id="LinkOrigination" NavigateUrl="AssetTypeOrigination.aspx" Target="_self">Origination
							</asp:HyperLink>
						</div>
					</ItemTemplate>
				</asp:templatefield>
				<asp:templatefield HeaderText="Attribute">
					<AlternatingItemTemplate>
						<div class="style2">
							<asp:HyperLink runat="server" id="LinkAttribute" NavigateUrl="AssetTypeAttribute.aspx" Target="_self">Attribute
							</asp:HyperLink>
						</div>
					</AlternatingItemTemplate>
					<ItemTemplate>
						<div class="style2">
							<asp:HyperLink runat="server" id="LinkAttribute" NavigateUrl="AssetTypeAttribute.aspx" Target="_self">Attribute
							</asp:HyperLink>
						</div>
					</ItemTemplate>
				</asp:templatefield>
				<asp:templatefield HeaderText="Document List">
					<AlternatingItemTemplate>
						<div class="style2">
							<asp:HyperLink runat="server" id="LinkDocumentList" NavigateUrl="AssetTypeDocumentList.aspx" Target="_self">Document List
							</asp:HyperLink>
						</div>
					</AlternatingItemTemplate>
					<ItemTemplate>
						<div class="style2">
							<asp:HyperLink runat="server" id="LinkDocumentList" NavigateUrl="AssetTypeDocumentList.aspx" Target="_self">Document List
							</asp:HyperLink>
						</div>
					</ItemTemplate>
				</asp:templatefield>
				<asp:templatefield HeaderText="Edit">
					<AlternatingItemTemplate>
						<div class="style2">
							<asp:ImageButton runat="server" ID="BtnIcoEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="AssetTypeEdit.aspx" />
						</div>
					</AlternatingItemTemplate>
					<ItemStyle Width="6%" />
					<HeaderStyle Width="6%" />
					<ItemTemplate>
						<div class="style2">
							<asp:ImageButton runat="server" ID="BtnIcoEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="AssetTypeEdit.aspx" />
						</div>
					</ItemTemplate>
				</asp:templatefield>
				<asp:templatefield HeaderText="Delete">
					<AlternatingItemTemplate>
						<div class="style2">
							<asp:ImageButton runat="server" id="BtnIcoDelete" ImageUrl="../../images/IconDelete.gif" Width="16px" />
						</div>
					</AlternatingItemTemplate>
					<ItemStyle Width="5%" />
					<HeaderStyle Width="5%" />
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
		</div>
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
&nbsp;&nbsp;&nbsp;
		<asp:ImageButton runat="server" id="BtnGo" ImageUrl="../../images/buttonGO.gif" />&nbsp; 
        </td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30"><a></a>
		<asp:ImageButton runat="server" id="BtnPrint" ImageUrl="../../images/ButtonPrint.gif" PostBackUrl="ReportAssetType.aspx" /></td>
      <td width="50%" align="right">&nbsp;<asp:ImageButton runat="server" id="BtnAdd" ImageUrl="../../images/ButtonAdd.gif" PostBackUrl="AssetTypeAdd.aspx" /></td>
      
    </tr>
  </table>
</div>
</form>
</body>
</html>
