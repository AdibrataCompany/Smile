<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>ASSETDOCUMENT</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
<style type="text/css">
.style1 {
	text-align: center;
}
.style3 {
	text-align: left;
}
</style>
</head>
<body>
<form id="FrmAssetDocumentRelease" runat="server">
<div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopimerahkiri">&nbsp;</td>
      <td align="center" class="tdtopimerah">ASSET DOCUMENT COLLATERAL</td>
      <td width="10" class="tdtopimerahkanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Branch Agreement</td>
      <td class="tdganjil"> 
		<asp:DropDownList runat="server" id="CmbBranchAgreement">
	        <asp:ListItem>Select One</asp:ListItem>	
			<asp:ListItem>MEDAN</asp:ListItem>
			<asp:ListItem>JAMBI</asp:ListItem>
			<asp:ListItem>PEKANBARU</asp:ListItem>
			<asp:ListItem>BATAM</asp:ListItem>
			<asp:ListItem>GRAND WIJAYA</asp:ListItem>
			<asp:ListItem>BEKASI</asp:ListItem>
			<asp:ListItem>TANGERANG</asp:ListItem>
			<asp:ListItem>BANDUNG</asp:ListItem>
			<asp:ListItem>SEMARANG</asp:ListItem>			
			<asp:ListItem>xxxxx50xxxxx</asp:ListItem>	
		</asp:DropDownList>
		</td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Search By</td>
      <td class="tdganjil"> 
		<asp:DropDownList runat="server" id="CmbSearch">
	        <asp:ListItem>Select One</asp:ListItem>	
	        <asp:ListItem>Application ID</asp:ListItem>
	        <asp:ListItem>Agreement No.</asp:ListItem>
	        <asp:ListItem>Customer Name</asp:ListItem>
			<asp:ListItem>Asset Description</asp:ListItem>
			<asp:ListItem>License Plate</asp:ListItem>
			<asp:ListItem>Engine No.</asp:ListItem>						
		</asp:DropDownList>
		&nbsp;
		<asp:TextBox runat="server" id="TbsSearch" Width="203px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">&nbsp;<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../images/ButtonSearch.gif" PostBackUrl="AssetDocumentCollateral.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnReset" ImageUrl="../images/ButtonReset.gif" PostBackUrl="AssetDocumentCollateral.aspx" />&nbsp;</td>
    </tr>
  </table>
  
  
</div>
<div align="center"> 
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopimerahkiri">&nbsp;</td>
      <td align="center" class="tdtopimerah">ASSET LISTING</td>
      <td width="10" class="tdtopimerahkanan">&nbsp;</td>
    </tr>
  </table>
  <asp:GridView runat="server" id="GrdViewSpBpkbToDealer" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
	<Columns>
		<asp:boundfield DataField="valstring2" SortExpression="valstring2" HeaderText="ASSET NO">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>

		<asp:boundfield DataField="valstring20" SortExpression="valstring20" HeaderText="APPLICATION ID">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring20" SortExpression="valstring20" HeaderText="AGREEMENT NO">
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="CUSTOMER NAME">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="ASSET DESCRIPTION">
		<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring30" SortExpression="valstring30" HeaderText="LICENSE PLATE">
		<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="STATUS">
		<ItemStyle HorizontalAlign="Center" />

		</asp:boundfield>
		<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="DOCUMENT STATUS" >
		<ItemStyle HorizontalAlign="Center" />

		</asp:boundfield>

		<asp:templatefield HeaderText="ACTION">
			<AlternatingItemTemplate>
				<div class="style1">
					<asp:HyperLink runat="server" id="LinkAction" ImageUrl="../images/IconDocument.gif" NavigateUrl="AssetDocumentCollateralList.aspx" Target="_self">
					</asp:HyperLink>
				</div>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<div class="style1">
					<asp:HyperLink runat="server" id="LinkAction" ImageUrl="../images/IconDocument.gif" NavigateUrl="AssetDocumentCollateralList.aspx" Target="_self">
					</asp:HyperLink>
				</div>
			</ItemTemplate>
		</asp:templatefield>
	</Columns>
	<HeaderStyle CssClass="tdjudulmerah" />
	<AlternatingRowStyle CssClass="tdgenap" />
	</asp:GridView>
	<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
	</asp:XmlDataSource>
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnFirstPrev" ImageUrl="../images/butkiri1.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnPrev" ImageUrl="../images/butkiri.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnNext" ImageUrl="../images/butkanan.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnLastNext" ImageUrl="../images/butkanan1.gif" /></td>
      <td width="130" align="center">Page&nbsp;
		<asp:TextBox runat="server" id="TbnPage" Width="20px" CssClass="inptype">
		</asp:TextBox>
&nbsp;&nbsp; 
        <asp:ImageButton runat="server" id="BtnGo" ImageUrl="../images/butgo.gif" /></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  
  
</div>
</form>
</body>
</html>
