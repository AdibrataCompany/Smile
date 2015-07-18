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
      <td width="20%" class="tdgenap">Application ID</td>
      <td width="30%" class="tdganjil"><asp:Hyperlink runat="server" ID="lblApplicationID" Text="xxxxx20xxxxx" NavigateUrl=""></asp:Hyperlink ></td>
      <td width="20%" class="tdgenap">(Asset No) Asset Description</td>
      <td width="30%" class="tdganjil"><asp:Label runat="server" ID="lblAssetDescription" Text="(x2x) xxxxx50xxxxx"></asp:Label></td>
      

    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Agreement No</td>
      <td width="30%" class="tdganjil"><asp:Hyperlink runat="server" ID="lblAgreementNo" Text="xxxxx20xxxxx"  NavigateUrl=""></asp:Hyperlink ></td>
      <td width="20%" class="tdgenap">License Plate</td>
      <td width="30%" class="tdganjil"><asp:Label runat="server" ID="lblLicensePlate" Text="xxxxx50xxxxx"></asp:Label></td>
    </tr>
     <tr> 
      <td width="20%" class="tdgenap">Customer Name</td>
      <td width="30%" class="tdganjil" ><asp:Hyperlink runat="server" ID="lblCustomerName" Text="xxxxx50xxxxx"  NavigateUrl=""></asp:Hyperlink >     
      <td width="20%" class="tdgenap">Engine No</td>
      <td width="30%" class="tdganjil"><asp:Label runat="server" ID="lblEngineNo" Text="xxxxx50xxxxx"></asp:Label></td>
    </tr>
     <tr> 
      <td width="20%" class="tdgenap">Supplier Name</td>
      <td width="30%" class="tdganjil" ><asp:Hyperlink runat="server" ID="lblSupplierName" Text="xxxxx50xxxxx"  NavigateUrl=""></asp:Hyperlink >     
      <td width="20%" class="tdgenap">Chassis No</td>
      <td width="30%" class="tdganjil"><asp:Label runat="server" ID="lblChassisNo" Text="xxxxx50xxxxx"></asp:Label></td>
    </tr>

  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">&nbsp;&nbsp;
		&nbsp;</td>
    </tr>
  </table>
  
  
</div>
<div align="center"> 
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopimerahkiri">&nbsp;</td>
      <td align="center" class="tdtopimerah">ASSET DOCUMENT COLLATERAL LISTING</td>
      <td width="10" class="tdtopimerahkanan">&nbsp;</td>
    </tr>
  </table>
  <asp:GridView runat="server" id="GrdViewSpBpkbToDealer" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
	<Columns>
		<asp:boundfield DataField="valstring20" SortExpression="valstring20" HeaderText="DOCUMENT NAME">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring20" SortExpression="valstring20" HeaderText="DOCUMENT NO">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valdate" SortExpression="valstring50" HeaderText="DOCUMENT DATE">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="NAME">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valdate" SortExpression="valstring30" HeaderText="DATE">
		<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="DOCUMENT STATUS">
		<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valdate" SortExpression="valstring30" HeaderText="STATUS DATE">
		<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valid" SortExpression="valid" HeaderText="AGING DAYS">
		<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:templatefield HeaderText="EDIT">
				<AlternatingItemTemplate>
						<asp:ImageButton runat="server" id="BtnIcoEdit2" ImageUrl="../images/IconEdit.gif" PostBackUrl="AssetDocumentCollateralEdit.aspx" />
				</AlternatingItemTemplate>
				<ItemStyle Width="5%" HorizontalAlign="Center"/>
				<HeaderStyle Width="5%" />
				<ItemTemplate>
						<asp:ImageButton runat="server" id="BtnIcoEdit1" ImageUrl="../images/IconEdit.gif" PostBackUrl="AssetDocumentCollateralEdit.aspx" />
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="DELETE">
				<AlternatingItemTemplate>
						<asp:ImageButton runat="server" id="BtnIcoDelete" ImageUrl="../images/IconDelete.gif" />
				</AlternatingItemTemplate>
				<ItemStyle Width="5%" HorizontalAlign="Center"/>
				<HeaderStyle Width="5%" />
				<ItemTemplate>
						<asp:ImageButton runat="server" id="BtnIcoDelete" ImageUrl="../images/IconDelete.gif" />
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
  
  

 <table width="95%" border="0" cellspacing="0" cellpadding="0">
   <tr> 
      <td width="50%" align="left" height="30"><asp:ImageButton id="imbPrintCollateral" imageurl="../Images/ButtonPrint.gif" postbackurl="AssetDocumentCollateralPrint.aspx" runat="server"></asp:ImageButton></td>
      <td width="50%" align="right"><asp:ImageButton id="imbAddCollateral" imageurl="../Images/ButtonAdd.gif" postbackurl="AssetDocumentCollateralAdd.aspx" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbCancelCollateral" runat="Server" postbackurl="AssetDocumentCollateral.aspx" imageurl="../Images/ButtonCancel.gif" ></asp:ImageButton>
      </td>
    </tr>
  </table>
  </div>
</form>
</body>
</html>
