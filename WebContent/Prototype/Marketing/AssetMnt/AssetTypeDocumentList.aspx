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
.style1 {
	text-align: center;
}
</style>
</head>

<body>
<form id="FrmDocumentList" runat="server">
<div align="center">
  <div align="center">
    <div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET DOCUMENT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Asset Type ID</td>
          <td class="tdganjil">
			<asp:HyperLink runat="server" id="LinkAssetTypeId" NavigateUrl="AssetTypeView.aspx" Target="_blank">MOTORCYCLE
			</asp:HyperLink>
		</td>
    </tr>
    <tr> 
      <td class="tdgenap">Description</td>
          <td class="tdganjil">Motorcycle</td>
    </tr>
    <tr> 
      <td class="tdgenap">Search By</td>
      <td class="tdganjil">
		<asp:DropDownList runat="server" id="CmbSearch">
			<asp:ListItem>Document ID</asp:ListItem>
			<asp:ListItem>Document Name</asp:ListItem>
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
		<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" PostBackUrl="AssetTypeDocumentList.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" PostBackUrl="AssetTypeDocumentList.aspx" /> 
      &nbsp; 
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET DOCUMENT LIST</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
      <asp:GridView runat="server" id="GrdViewAssetDocumentList" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" Width="95%">
		<Columns>
			<asp:templatefield HeaderText="DOCUMENT ID">
				<AlternatingItemTemplate>
					<div class="style1">
						<asp:HyperLink runat="server" id="LinkDocumentId" NavigateUrl="AssetTypeDocumentListView.aspx" Target="_blank">xxxxx10xxxxx
						</asp:HyperLink>
					</div>
				</AlternatingItemTemplate>
				<ItemStyle HorizontalAlign="Left" />
				<ItemTemplate>
					<div class="style1">
						<asp:HyperLink runat="server" id="LinkDocumentId" NavigateUrl="AssetTypeDocumentListView.aspx" Target="_blank">xxxxx10xxxxx
						</asp:HyperLink>
					</div>
				</ItemTemplate>
			</asp:templatefield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="DOCUMENT NAME">
				<ItemStyle Width="15%" />
				<HeaderStyle Width="15%" />
			</asp:boundfield>
			<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="VALUE NEEDED">
				<ItemStyle Width="8%" HorizontalAlign="Center" />
				<HeaderStyle Width="8%" HorizontalAlign="Center" />
			</asp:boundfield>
			<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="MAND. NEW ASSET">
				<ItemStyle Width="8%" HorizontalAlign="Center" />
				<HeaderStyle Width="8%" HorizontalAlign="Center" />
			</asp:boundfield>
			<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="MAND. USED ASSET">
				<ItemStyle Width="8%" HorizontalAlign="Center" />
				<HeaderStyle Width="8%" HorizontalAlign="Center" />
			</asp:boundfield>
			<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="MAND. ex CBU ASSET">
				<ItemStyle Width="8%" HorizontalAlign="Center" />
				<HeaderStyle Width="8%" HorizontalAlign="Center" />
			</asp:boundfield>
			<asp:boundfield DataField="valstring10" SortExpression="valstring10" HeaderText="DOCUMENT TYPE">
			</asp:boundfield>
			<asp:templatefield HeaderText="EDIT">
				<AlternatingItemTemplate>
					<div class="style1">
						<asp:ImageButton runat="server" id="BtnIcoEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="AssetTypeDocumentListEdit.aspx" />
					</div>
				</AlternatingItemTemplate>
				<ItemStyle Width="10%" />
				<HeaderStyle Width="10%" />
				<ItemTemplate>
					<div class="style1">
						<asp:ImageButton runat="server" id="BtnIcoEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="AssetTypeDocumentListEdit.aspx" />
					</div>
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="DELETE">
				<AlternatingItemTemplate>
					<div class="style1">
						<asp:ImageButton runat="server" id="BtnIcoDelete" ImageUrl="../../images/IconDelete.gif" />
					</div>
				</AlternatingItemTemplate>
				<ItemStyle Width="10%" />
				<HeaderStyle Width="10%" />
				<ItemTemplate>
					<div class="style1">
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
		<asp:ImageButton runat="server" id="BtnNext" ImageUrl="../../images/butkanan.gif" Height="20px" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnLastNext" ImageUrl="../../images/butkanan1.gif" Width="20px" /></td>
      <td width="130" align="center">Page 
        <asp:TextBox runat="server" id="TbnPage" Width="20px" CssClass="inptype">
		</asp:TextBox>
&nbsp;&nbsp; 
        <asp:ImageButton runat="server" id="BtnGo" ImageUrl="../../images/buttonGO.gif" /></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="50%" height="30">
		<asp:ImageButton runat="server" id="BtnPrint" ImageUrl="../../images/ButtonPrint.gif" PostBackUrl="ReportAssetDocumentList.aspx" /></td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnAdd" ImageUrl="../../images/ButtonAdd.gif" PostBackUrl="AssetTypeDocumentListAdd.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnBack" ImageUrl="../../images/ButtonBack.gif" PostBackUrl="AssetType.aspx" />&nbsp; 
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
