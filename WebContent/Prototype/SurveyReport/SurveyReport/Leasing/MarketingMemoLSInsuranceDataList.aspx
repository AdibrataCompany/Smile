<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head>
<body>
<form runat="Server" id="frmPersonalCustomerSurveyReportMobilCF">
<div align="center"> 
<div align="center">
 <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">MARKETING MEMO - ENTRY INSURANCE DATA</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
 
 <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Customer Name</td>
      <td class="tdganjil"><asp:HyperLink ID="hypCustomerName" runat="server" NavigateUrl="../../Credit/ViewCompanyCustomer.htm" Target="_blank" Text="CompanyCustomer0001"></asp:HyperLink>
    </tr>
    <tr> 
      <td class="tdgenap">Application ID</td>
      <td class="tdganjil">
      <asp:HyperLink ID="hypApplicationID" runat="server" NavigateUrl="../../Credit/ViewCompanyCustomer.htm" Target="_blank" Text="Application001"></asp:HyperLink></td>
    </tr>
    <tr>
      <td class="tdjudulmerah" colspan="2">&nbsp;</td>
    </tr>
    <tr>
      <td class="tdgenap">Asset Unit</td>
      <td class="tdganjil">999</td>
    </tr>
  </table>
<br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau"> ASSET LIST</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
      <div align="center">
     
    <asp:GridView runat="server" id="GrdListCustomer" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield HeaderText="NO">
			<ItemTemplate>
				<asp:Label runat="server" id="lblNo">x1x
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="ASSET TYPE">
			<ItemTemplate>
				<asp:Label runat="server" id="lblAssetType" Text="xxxxxxxx20xxxxxxxx">
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>

		<asp:templatefield HeaderText="ASSET DESCRIPTION">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAssetDescription" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>

		<asp:boundfield DataField="valstring20" HeaderText="ASSET USAGE" SortExpression="valstring20">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring20" HeaderText="NEW / USED" SortExpression="valstring20">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		
	
		<asp:templatefield HeaderText="INSURANCE" HeaderStyle-HorizontalAlign="Center">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="hypInputInsurance" NavigateUrl="MarketingMemoLSInsuranceData.aspx" Target="_self">Insurance
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
      
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
    </div>
   <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><img src="../../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../../images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>

  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="20%" height="30">&nbsp;</td>
      <td width="50%" align="right">
      &nbsp;</td>
    </tr>
   
  </table>
</div>
<br>
</div>
</form>
</body>
</html>
