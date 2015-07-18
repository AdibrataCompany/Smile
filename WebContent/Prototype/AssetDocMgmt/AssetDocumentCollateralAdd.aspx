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
	<tr> 
       <td colspan="4" class="tdjudulmerah">REGISTRATION</td>
    </tr>
	<tr> 
      <td width="20%" class="tdgenap">Document Name</td>
      <td width="30%" class="tdganjil" colspan="3" ><asp:TextBox runat="server" ID="txtDocumentName" Text="xxxxx50xxxxx" CssClass="inptype"></asp:TextBox >     
      		<asp:Hyperlink  ImageUrl="../Images/IconDetail.gif" ID="ucAssetDocumentCollateral" runat="server" NavigateUrl="../Lookup/AssetDocumentCollateral.aspx" Target="_blank"></asp:Hyperlink>
      	</td>
    </tr>
   
    <tr> 
      <td width="20%" class="tdgenap">Document Notes</td>
      <td width="30%" class="tdganjil" colspan="3" >
      		<asp:TextBox runat="server" id="txtDocumentNotes" CssClass="inptype" Height="75px" Width="206px" Rows="10" Columns="50" TextMode="MultiLine" ></asp:TextBox>

      	</td>
    </tr>

  </table>
 
 <table width="95%" border="0" cellspacing="0" cellpadding="0">
   <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbAddCollateral" imageurl="../Images/ButtonSave.gif" postbackurl="AssetDocumentCollateralList.aspx" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbCancelCollateral" runat="Server" postbackurl="AssetDocumentCollateralList.aspx" imageurl="../Images/ButtonCancel.gif" ></asp:ImageButton>
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
