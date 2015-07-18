<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html xmlns:m="http://schemas.microsoft.com/office/2004/12/omml" xmlns:v="urn:schemas-microsoft-com:vml" xmlns:o="urn:schemas-microsoft-com:office:office">
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
<form runat="Server" id="frmCompanyCustomerMarketingMemoLS">
<div align="center">
   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">MARKETING MEMO - OTHER DATA</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap" >Application ID</td>
      <td class="tdganjil" ><asp:Hyperlink ID="hypApplicationID" runat="server"  Text="ApplicationID00001" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank"></asp:Hyperlink></td>
      <td width="20%" class="tdgenap" >Customer Name</td>
      <td class="tdganjil" ><asp:Hyperlink ID="hypCustomerName" runat="server"  Text="ApplicationID00001" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank"></asp:Hyperlink></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Product</td>
      <td class="tdganjil" colspan="3"><asp:Hyperlink ID="hypProductOffering" runat="server"  Text="ProductOffering001" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank"></asp:Hyperlink></td>
    </tr>
    </table>
<br>
	<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">PURPOSED UNIT & LOCATION</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
		<table align="center" width="95%">
 	<tr> 
      <td width="20%" class="tdgenap">Finance Purpose</td>
      <td class="tdganjil"><asp:DropDownList ID="ddlFinancePurpose" runat="server">
      <asp:ListItem Text="Investing asset for New Projects" Value="IN"></asp:ListItem>
      <asp:ListItem Text="Investing asset for Existing Projects" Value="IE"></asp:ListItem>
      <asp:ListItem Text="Replacing asset for Existing Projects" Value="RE"></asp:ListItem>
      <asp:ListItem Text="Sales and Leasedback" Value="SL"></asp:ListItem>
	  </asp:DropDownList>
		<asp:TextBox ID="txtDescriptionFinancePurpose" runat="server" textmode="MultiLine" CssClass="inptype" Width="263px" Height="41px"></asp:textbox></td>
		</tr>
	  </table>
    <br>
     <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">CUSTOMER EXPOSURE DATA</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="50%" align="center" class="tdjudulhijau"><div align="left">MAXIMUM 
          AMOUNT</div></td>
      <td align="center" class="tdjudulhijau"><div align="left">OUTSTANDING AMOUNT</div></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Max Outstanding Balance</td>
      <td width="25%" align="right" class="tdganjil"><asp:Label runat="server" ID="lblMaxOutstandingBalance" Text="999,999,999.99"></asp:Label></td>
      <td width="25%" class="tdgenap">Outstanding Balance</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblOutstandingBalance" Text="999,999,999.99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap">Max Installment Amount</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblMaxInstallmentAmount" Text="999,999,999.99"></asp:Label></td>
      <td class="tdgenap">Outstanding Installment </td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblOutstandingInstallment" Text="999,999,999.99"></asp:Label></td>
    </tr>
    <tr> 
      <td width="24%" class="tdgenap">Max Overdue Amount </td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblMaxOverdueAmount" Text="999,999,999.99"></asp:Label></td>
      <td class="tdgenap">Outstanding Principal</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblOutstandingPrincipal" Text="999,999,999.99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap"> Max Overdue Days</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblMaxOverdueDays" Text="999"></asp:Label></td>
      <td class="tdgenap">Outstanding Interest</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblOutstandingInterest" Text="999,999,999.99"></asp:Label></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td align="center" class="tdjudulhijau"><div align="left">NUMBER OF</div>
        <div align="left"></div></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Active Agreement</td>
      <td width="25%" align="right" class="tdganjil"><asp:Label runat="server" ID="lblActiveAgreement" Text="99"></asp:Label></td>
      <td width="25%" class="tdgenap">Repossed Asset</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblRepossedAsset" Text="99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap">In Process Agreement</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblInProcessAgreement" Text="99"></asp:Label></td>
      <td class="tdgenap">Inventoried Asset</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblInventoriedAsset" Text="99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap">Asset in Financing</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblAssetinFinancing" Text="99"></asp:Label></td>
      <td class="tdgenap">Written Off Agreement</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblWrittenOffAgreement" Text="99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap"> Rejected Agreement</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblRejectedAgreement" Text="99"></asp:Label></td>
      <td class="tdgenap">Non Accrual Agreement</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblNonAccrualAgreement" Text="99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap"> Cancelled Agreement</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCancelledAgreement" Text="99"></asp:Label></td>
      <td class="tdgenap">Bounce Cheque</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblBounceCheque" Text="99"></asp:Label></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdjudulhijau"> 
      <td width="25%">BUCKET</td>
      <td width="25%" align="right"><div align="center">TOTAL PAST DUE</div></td>
      <td width="25%">BUCKET</td>
      <td align="right"><div align="center">TOTAL PAST DUE</div></td>
    </tr>
    <tr> 
      <td class="tdgenap">Bucket 1</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblBucket1" Text="999,999,999.99"></asp:Label></td>
      <td class="tdgenap">Bucket 6</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblBucket6" Text="999,999,999.99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap">Bucket 2</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblBucket2" Text="999,999,999.99"></asp:Label></td>
      <td class="tdgenap">Bucket 7</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblBucket7" Text="999,999,999.99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap"> Bucket 3</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblBucket3" Text="999,999,999.99"></asp:Label></td>
      <td class="tdgenap"> Bucket 8</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblBucket8" Text="999,999,999.99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap"> Bucket 4</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblBucket4" Text="999,999,999.99"></asp:Label></td>
      <td class="tdgenap"> Bucket 9</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblBucket9" Text="999,999,999.99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap"> Bucket 5</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblBucket5" Text="999,999,999.99"></asp:Label></td>
      <td class="tdgenap"> Bucket 10</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblBucket10" Text="999,999,999.99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap">&nbsp;</td>
      <td align="right" class="tdganjil">&nbsp;</td>
      <td class="tdgenap"><strong>TOTAL</strong></td>
      <td align="right" class="tdganjil">999,999,999.99</td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">CUSTOMER GROUP EXPOSURE DATA</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdjudulhijau">MEMBER'S</td>
    </tr>
  </table>

   <asp:GridView runat="server" id="grdCustomerGroupExposure" AllowSorting="true" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
    <asp:templatefield HeaderText="NO">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblNo">x2x</asp:label >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblNo">x2x</asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="CUSTOMER NAME">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblCustomerName">xxxxx50xxxxx</asp:label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblCustomerName">xxxxx50xxxxx</asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="NUM OF ACTIVE AGREEMENT">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblNumOfActiveAgreement">99</asp:label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblNumOfActiveAgreement">99</asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" width="5%"/>
		</asp:templatefield>
		<asp:templatefield HeaderText="OUTSTANDING PRINCIPAL">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblOutstandingPrincipal">999,999,999,999.99
				</asp:label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblOutstandingPrincipal">999,999,999,999.99
				</asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="CUSTOMER GROUP LEVEL">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblCustomerGroupLevel" >99
				</asp:label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblCustomerGroupLevel" >99
				</asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" width="5%"/>
		</asp:templatefield>
		<asp:templatefield HeaderText="CUSTOMER GROUP CODE">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblCustomerGroupCode" >9999
				</asp:label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblCustomerGroupCode" >9999
				</asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" width="5%"/>
		</asp:templatefield>
	
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>

  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="50%" align="center" class="tdjudulhijau"><div align="left">MAXIMUM 
          AMOUNT</div></td>
      <td align="center" class="tdjudulhijau"><div align="left">OUTSTANDING AMOUNT</div></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Max Outstanding Balance</td>
      <td width="25%" align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGMaxOutstandingBalance" Text="999,999,999.99"></asp:Label></td>
      <td width="25%" class="tdgenap">Outstanding Balance</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGOutstandingBalance" Text="999,999,999.99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap">Max Installment Amount</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGMaxInstallmentAmount" Text="999,999,999.99"></asp:Label></td>
      <td class="tdgenap">Outstanding Installment </td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGOutstandingInstallment" Text="999,999,999.99"></asp:Label></td>
    </tr>
    <tr> 
      <td width="24%" class="tdgenap">Max Overdue Amount </td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGMaxOverdueAmount" Text="999,999,999.99"></asp:Label></td>
      <td class="tdgenap">Outstanding Principal</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGOutstandingPrincipal" Text="999,999,999.99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap"> Max Overdue Days</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGMaxOverdueDays" Text="999"></asp:Label></td>
      <td class="tdgenap">Outstanding Interest</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGOutstandingInterest" Text="999,999,999.99"></asp:Label></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td align="center" class="tdjudulhijau"><div align="left">NUMBER OF</div>
        <div align="left"></div></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Active Agreement</td>
      <td width="25%" align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGActiveAgreement" Text="99"></asp:Label></td>
      <td width="25%" class="tdgenap">Repossed Asset</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGRepossedAsset" Text="99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap">In Process Agreement</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGInProcessAgreement" Text="99"></asp:Label></td>
      <td class="tdgenap">Inventoried Asset</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGInventoriedAsset" Text="99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap">Asset in Financing</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGAssetinFinancing" Text="99"></asp:Label></td>
      <td class="tdgenap">Written Off Agreement</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGWrittenOffAgreement" Text="99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap"> Rejected Agreement</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGRejectedAgreement" Text="99"></asp:Label></td>
      <td class="tdgenap">Non Accrual Agreement</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGNonAccrualAgreement" Text="99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap"> Cancelled Agreement</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGCancelledAgreement" Text="99"></asp:Label></td>
      <td class="tdgenap">Bounce Cheque</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGBounceCheque" Text="99"></asp:Label></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdjudulhijau"> 
      <td width="25%">BUCKET</td>
      <td width="25%" align="right"><div align="center">TOTAL PAST DUE</div></td>
      <td width="25%">BUCKET</td>
      <td align="right"><div align="center">TOTAL PAST DUE</div></td>
    </tr>
    <tr> 
      <td class="tdgenap">Bucket 1</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGBucket1" Text="999,999,999.99"></asp:Label></td>
      <td class="tdgenap">Bucket 6</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGBucket6" Text="999,999,999.99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap">Bucket 2</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGBucket2" Text="999,999,999.99"></asp:Label></td>
      <td class="tdgenap">Bucket 7</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGBucket7" Text="999,999,999.99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap"> Bucket 3</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGBucket3" Text="999,999,999.99"></asp:Label></td>
      <td class="tdgenap"> Bucket 8</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGBucket8" Text="999,999,999.99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap"> Bucket 4</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGBucket4" Text="999,999,999.99"></asp:Label></td>
      <td class="tdgenap"> Bucket 9</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGBucket9" Text="999,999,999.99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap"> Bucket 5</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGBucket5" Text="999,999,999.99"></asp:Label></td>
      <td class="tdgenap"> Bucket 10</td>
      <td align="right" class="tdganjil"><asp:Label runat="server" ID="lblCGBucket10" Text="999,999,999.99"></asp:Label></td>
    </tr>
    <tr> 
      <td class="tdgenap">&nbsp;</td>
      <td align="right" class="tdganjil">&nbsp;</td>
      <td class="tdgenap"><strong>TOTAL</strong></td>
      <td align="right" class="tdganjil">999,999,999.99</td>
    </tr>
  </table>

  <br>
 
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">COLLATERAL COVERAGE</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
 </table>
 <asp:GridView runat="server" id="grdCollateralCoverage" AllowSorting="true" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
    <asp:templatefield HeaderText="AGREEMENT NO">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblAgreementNo"></asp:label >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblAgreementNo"></asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="ASSET DESCRIPTION">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblAssetDescription"></asp:label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblAssetDescription"></asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="O/S EXPOSURE">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblOSExposure"></asp:label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblOSExposure"></asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="PRICE LIST">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblPriceList">
				</asp:label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblPriceList">
				</asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="TENOR">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblTenor" CssClass="inptype">
				</asp:label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblTenor" CssClass="inptype">
				</asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="LEFT TENOR">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblLeftTenor" CssClass="inptype">
				</asp:label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblLeftTenor" CssClass="inptype">
				</asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	<asp:templatefield HeaderText="INSTALLMENT AMOUNT">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblInstallmentAmount">
				</asp:label >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblInstallmentAmount">
				</asp:label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	<asp:templatefield HeaderText="CUSTOMER STATUS">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblCustomerStatus">
				</asp:label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblCustomerStatus">
				</asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>

	
	<table width="95%">
	 <tr> 
	      <td colspan="4" class="tdjudulhijau">BANK STATEMENT</td>
	    </tr>
	</table>
		 <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
  	<tr> 
      <td width="20%" class="tdgenap">Financial Data Type</td>
      <td class="tdganjil"><asp:DropDownList ID="ddlFinancialDataType" runat="server" AutoPostBack="True" CssClass="inptype">
      <asp:ListItem Text="Ijin Usaha" Value="IJINUSAHA"></asp:ListItem>
      <asp:listitem text="TDP/SIUP/Akte" Value="TDP"></asp:ListItem>
      <asp:ListItem Text="SPK Exp" Value="SPKEXP"></asp:ListItem>
      <asp:ListItem Text="SPK Aktif" Value="SPKACT"></asp:ListItem>
      <asp:ListItem Text="Bon/Nota Tagihan" Value="BON"></asp:ListItem>
      <asp:ListItem Text="Buku Tabungan" Value="REK"></asp:ListItem>
      <asp:ListItem Text="RK" Value="RK"></asp:ListItem>
      <asp:ListItem Text="Slip Gaji/SK Gaji" Value="SLIP"></asp:ListItem>
      <asp:ListItem Text="Bukti Kepemilikan unit lain" Value="OTHER"></asp:ListItem>
      <asp:ListItem Text="Foto Usaha" Value="USAHA"></asp:ListItem>
      <asp:ListItem Text="Lain-lain" Value="OTHERS"></asp:ListItem>
      </asp:DropDownList ></td>
      <td width="20%" class="tdgenap">Amount Financial</td>
      <td class="tdganjil"><asp:TextBox ID="txtAmountFinancial" runat="server"  CssClass="inptype"></asp:textbox></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Notes</td>
      <td class="tdganjil" colspan="3">
		<asp:textBox ID="txtNotesFinancial" textmode="MultiLine" runat="server" CssClass="inptype" Width="326px"></asp:textbox></td>
    </tr>
    <% if ddlFinancialDataType.SelectedValue = "REK" Or ddlFinancialDataType.SelectedValue = "RK" Then %>
    <tr>
      <td class="tdgenap" style="width: 28%">Bank Name</td>
      <td colspan="3" class="tdganjil">
      <asp:DropDownList ID="ddlBankStatementBankName" runat="server">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="BCA" Value="BCA"></asp:ListItem>
      </asp:DropDownList></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Bank Branch</td>
      <td colspan="3" class="tdganjil"><asp:TextBox ID="txtBankStatementBankBranch" runat="server" CssClass="inptype"></asp:TextBox></td>
    </tr>
      <tr> 
      <td class="tdgenap" style="width: 28%">Account Name</td>
      <td colspan="3" class="tdganjil">
		<asp:TextBox ID="txtBankStatementAccountName" runat="server" CssClass="inptype"></asp:TextBox></td>    </tr>
	  <tr> 
      <td class="tdgenap" style="width: 28%">Account No</td>
      <td colspan="3" class="tdganjil">
		<asp:TextBox ID="txtBankStatementccountNo" runat="server" CssClass="inptype"></asp:TextBox>
		</td>  
	  </tr>
	   <tr> 
      <td class="tdgenap" style="width: 28%">Plafond</td>
      <td colspan="3" class="tdganjil">
		<asp:TextBox ID="txtBankStatementPlafond" runat="server" CssClass="inptype"></asp:TextBox>
		</td>  
	  </tr>

	  </table>
 <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbAddBankStatment" imageurl="../../Images/ButtonAdd.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <table align="center" width="95%">
  <tr>
  <td colspan="4">
  
  <asp:GridView runat="server" id="grdBankStatement" AllowSorting="true" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="100%" >
    <Columns>
    <asp:templatefield HeaderText="MONTH">
			<AlternatingItemTemplate>
				<asp:textbox runat="server" id="txtBankStatementMonth"  CssClass="inptype">
				</asp:textbox>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:textbox runat="server" id="txtBankStatementMonth"  CssClass="inptype">
				</asp:textbox>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="DEBIT">
			<AlternatingItemTemplate>
				<asp:textbox runat="server" id="txtCustomerName" CssClass="inptype">
				</asp:textbox>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:textbox runat="server" id="txtCustomerName" CssClass="inptype">
				</asp:textbox>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="CREDIT">
			<AlternatingItemTemplate>
				<asp:TextBox runat="server" id="txtBankStatementCredit" CssClass="inptype">
				</asp:TextBox >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtBankStatementCredit" CssClass="inptype">
				</asp:TextBox>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
			<asp:templatefield HeaderText="SALDO">
			<AlternatingItemTemplate>
				<asp:textBox  runat="server" id="txtBankStatementSaldo" CssClass="inptype">
				</asp:textBox>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:textBox  runat="server" id="txtBankStatementSaldo" CssClass="inptype">
				</asp:textBox>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="DELETE">
			<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="lnkDelCapitalDetail" ImageUrl="../../Images/IconDelete.gif">
				</asp:ImageButton >

			</AlternatingItemTemplate>
			<ItemTemplate>
					<asp:ImageButton runat="server" id="lnkDelCapitalDetail" ImageUrl="../../Images/IconDelete.gif" ></asp:ImageButton >

			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>

  </td>
  </tr>
  <tr> 
      <td class="tdgenap" style="width: 20%">Total Debit</td>
      <td class="tdganjil">
		<asp:label ID="lblBankStatementTotalDebit" runat="server" Text="999,999,999,999.99"></asp:label ></td>   
	<td class="tdgenap" style="width: 20%">Total Credit</td>
      <td class="tdganjil">
		<asp:label ID="lblBankStatementTotalCredit" runat="server" Text="999,999,999,999.99"></asp:label></td>   
 	</tr>
 	<tr>
 	<td class="tdgenap" style="width: 28%">Total Saldo</td>
      <td colspan="3" class="tdganjil">
		<asp:label ID="lblBankStatementTotalSaldo" runat="server" Text="999,999,999,999.99"></asp:label></td>
	</tr>
	<tr>
		<td class="tdgenap" style="width: 20%">Average Debit</td>
      <td class="tdganjil">
		<asp:label ID="lblBankStatementAvarageDebit" runat="server" Text="999,999,999,999.99"></asp:label></td>
	<td class="tdgenap" style="width: 20%">Average Credit</td>
      <td class="tdganjil">
		<asp:label ID="lblBankStatementAvarageCredit" runat="server" Text="999,999,999,999.99"></asp:label></td>
		</tr>
		<tr>
	<td class="tdgenap" style="width: 28%">Average Saldo</td>
      <td class="tdganjil">
		<asp:label ID="lblBankStatementAvarageSaldo" runat="server" Text="999,999,999,999.99"></asp:label></td>
	  </tr> 
	  <tr>
	<td class="tdgenap" style="width: 28%">Average Usage on Plafond</td>
      <td class="tdganjil">
		<asp:label ID="lblBankStatementAvarageUsageOnPlafond" runat="server" Text="999,999,999,999.99"></asp:label></td>
	  </tr> 

  <% End If%>
  </table>
  <br>
	<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">FINANCIAL SIMULATION MONTHLY</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%">
	 <tr> 
	      <td colspan="4" class="tdjudulhijau">INCOME ESTIMATION</td>
	    </tr>
	</table>
	
	<table align="center" width="95%">
	 <tr>
      <td class="tdgenap" style="width: 20%">Estimation Income By Salary / Bank</td>
      <td  class="tdganjil">
      <asp:label ID="lblEstimationIncomeByBank" runat="server">999,999,999,999.99</asp:label ></td>
      <td class="tdgenap">Estimation Income By Capacity Estimation</td>
      <td  class="tdganjil">
      <asp:label ID="lblCapacityEstimationIncomeByBank" runat="server">999,999,999,999.99</asp:label ></td>
      
    </tr>
    <tr>
  	<td class="tdgenap" style="width: 28%">Margin Profit Estimation</td>
      <td  class="tdganjil">
      <asp:textBox ID="txtMarginProfitEstimation" runat="server" CssClass="inptype"></asp:textBox></td>
      <td class="tdgenap" style="width: 28%">Margin Profit by Capacity Estimation</td>
      <td  class="tdganjil">
      <asp:label ID="txtEstimationIncomeByBank" runat="server" CssClass="inptype"></asp:label ></td>
    </tr>
</table>
<table width="95%">
	 <tr> 
	      <td colspan="4" class="tdjudulhijau">EXPENSE LIST</td>
	    </tr>
	</table>
	<table align="center" width="95%">
	 <tr>
      <td class="tdgenap" style="width: 20%">Family Expense</td>
      <td  class="tdganjil" >
      <asp:textbox ID="txtFamilyExpsense" runat="server" CssClass="inptype">999,999,999,999.99</asp:textbox></td>
      <td class="tdgenap">Family Expense By Estimation</td>
      <td  class="tdganjil">
      <asp:textBox ID="txtFamilyExpsenseByEstimation" runat="server" CssClass="inptype">999,999,999,999.99</asp:textBox></td>
    </tr>
    <tr>
  	<td class="tdgenap" style="width: 20%">Unit Operation Expense</td>
      <td  class="tdganjil">
      <asp:textBox ID="txtUnitOperationExpense" runat="server" CssClass="inptype">999,999,999,999.99</asp:textBox></td>
      <td class="tdgenap">Unit Operation Expense by Capacity Estimation</td>
      <td  class="tdganjil">
      <asp:textBox ID="txtUnitOperationExpenseByEstimation" runat="server" CssClass="inptype">999,999,999,999.99</asp:textBox></td>
    </tr>
    <tr>
  	<td class="tdgenap">Other Operation Expense</td>
      <td  class="tdganjil">
      <asp:textBox ID="txtOtherOperationExpense" runat="server" CssClass="inptype">999,999,999,999.99</asp:textBox></td>
      <td class="tdgenap">Other Operation Expense by Capacity Estimation</td>
      <td  class="tdganjil">
      <asp:textBox ID="txtOtherOperationExpenseByEstimation" runat="server" CssClass="inptype">999,999,999,999.99</asp:textBox></td>
    </tr>
 	<tr>
  	<td class="tdgenap" width="20%">Third Part Allowance Expense</td>
      <td  class="tdganjil">
      <asp:textBox ID="txtThirdPartAllowanceExpense" runat="server" CssClass="inptype">999,999,999,999.99</asp:textBox></td>
      <td class="tdgenap" >Third Part Allowance Expense by Capacity Estimation</td>
      <td  class="tdganjil">
      <asp:textBox ID="txtThirdPartAllowanceExpenseByEstimation" runat="server" CssClass="inptype">999,999,999,999.99</asp:textBox></td>
    </tr>
	<tr>
  	<td class="tdgenap" style="width: 20%">Monthly Installment at Company</td>
      <td  class="tdganjil">
      <asp:textBox ID="txtMonthlyInstallmentExpense" runat="server" CssClass="inptype">999,999,999,999.99</asp:textBox></td>
      <td class="tdgenap" style="width: 20%">Monthly Installment at Company by Estimation</td>
      <td  class="tdganjil">
      <asp:textBox ID="txtMonthlyInstallmentExpenseByEstimation" runat="server" CssClass="inptype">999,999,999,999.99</asp:textBox></td>
    </tr>
</table>
	<table width="95%">
	 <tr> 
	      <td colspan="4" class="tdjudulhijau">OTHER EXPENSE</td>
	    </tr>
	</table>
	  <table align="center" width="95%">
  <tr>
  <td colspan="4">
  
  <asp:GridView runat="server" id="grdOtherExpense" AllowSorting="true" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="100%" >
    <Columns>
    <asp:templatefield HeaderText="EXPENSE DESCRIPTION">
			<AlternatingItemTemplate>
				<asp:textbox runat="server" id="txtBankStatementMonth"  CssClass="inptype">
				</asp:textbox>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:textbox runat="server" id="txtBankStatementMonth"  CssClass="inptype">
				</asp:textbox>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="AMOUNT">
			<AlternatingItemTemplate>
				<asp:textbox runat="server" id="txtCustomerName" CssClass="inptype">
				</asp:textbox>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:textbox runat="server" id="txtCustomerName" CssClass="inptype">
				</asp:textbox>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="AMOUNT BY CAPACITY ESTIMATION">
			<AlternatingItemTemplate>
				<asp:TextBox runat="server" id="txtBankStatementCredit" CssClass="inptype">
				</asp:TextBox >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtBankStatementCredit" CssClass="inptype">
				</asp:TextBox>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="DELETE">
			<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="lnkDelCapitalDetail" ImageUrl="../../Images/IconDelete.gif">
				</asp:ImageButton >

			</AlternatingItemTemplate>
			<ItemTemplate>
					<asp:ImageButton runat="server" id="lnkDelCapitalDetail" ImageUrl="../../Images/IconDelete.gif" ></asp:ImageButton >

			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
  </td>
  </tr>
</table>

<table align="center" width="95%">
	 <tr>
      <td class="tdgenap" style="width: 20%">Total Other Expense</td>
      <td  class="tdganjil">
      <asp:label ID="lblTotalOtherExpense" runat="server">999,999,999,999.99</asp:label></td>
      <td class="tdgenap" style="width: 20%">Total Other Expense By Estimation</td>
      <td  class="tdganjil">
      <asp:label ID="lblTotalOtherExpenseByEstimation" runat="server">999,999,999,999.99</asp:label></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 20%">Ending Balance Income </td>
      <td  class="tdganjil">
      <asp:label ID="lblEndingBalanceIncome" runat="server">999,999,999,999.99</asp:label></td>
      <td class="tdgenap" style="width: 20%">Ending Balance Income By Estimation</td>
      <td  class="tdganjil">
      <asp:label ID="lblEndingBalanceIncomeByEstimation" runat="server">999,999,999,999.99</asp:label></td>
    </tr>
</table>
 
<br>   
<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbSearch" imageurl="../../Images/ButtonSave.gif" runat="server" PostBackUrl="MarketingMemoLSApplicationData.aspx"></asp:ImageButton>
		<asp:ImageButton id="imbReset" postbackurl="MarketingMemoLS.aspx" imageurl="../../Images/ButtonReset.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
