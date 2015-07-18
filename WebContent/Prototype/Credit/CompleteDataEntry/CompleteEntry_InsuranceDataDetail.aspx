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
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SURVEY REPORT - ENTRY INSURANCE DATA 
		999 OF 999</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
     <tr> 
      <td class="tdgenap" width="20%">Application ID</td>
      <td class="tdganjil" width="30%"><asp:HyperLink ID="hypApplicationID" NavigateUrl="../../ViewApplication.htm" runat="server" Target="_blank" Text="Application0001"></asp:HyperLink>
      <td class="tdgenap" width="20%">Customer Name</td>
      <td class="tdganjil" width="30%"><asp:HyperLink ID="hypCustomerName" text="CompanyCustomer0001" runat="server" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target= _blank></asp:HyperLink>
	</td>
    </tr>
    <tr>
      <td class="tdgenap" width="20%">Currency</td>
      <td class="tdganjil" width="30%">IDR</td>
      <td class="tdgenap" width="20%">Tenor</td>
      <td class="tdganjil" width="30%"><asp:Label ID="lblTenor" runat="server" Text="36"></asp:Label >	</td>
   </tr>
   <tr>
      <td class="tdgenap" width="20%">Application Type</td>
      <td class="tdganjil" width="30%"><asp:Label ID="lblApplicationType" runat="server" Text="Non Group"></asp:Label >	</td>
       <td class="tdgenap" width="20%"></td>
      <td class="tdganjil" width="30%"></td>

   </tr>

   <tr>
      <td class="tdgenap" width="20%">Asset Type</td>
      <td class="tdganjil" width="30%"><asp:Label ID="lblAssetType" runat="server" Text="Automotive"></asp:Label >	</td>
	 <td class="tdgenap" width="20%">Asset Usage</td>
      <td class="tdganjil" width="30%"><asp:Label ID="lblAssetUsage" runat="server" Text="Non Commercial"></asp:Label >	</td>
    </tr>
    <tr>
      <td class="tdgenap" width="20%" >Asset Description</td>
      <td class="tdganjil" width="30%"><asp:Label ID="lblAssetDescription" runat="server" Text="BMW-SERIES-M 6"></asp:Label >
       <td class="tdgenap"width="20%" >Used / New </td>
      <td class="tdganjil" width="30%"><asp:Label ID="lblUsedNew" runat="server" Text="New"></asp:Label >	</td>
    </tr>
	<tr> 
	      <td colspan="4" class="tdjudulhijau">INSURANCE DATA</td>
	</tr>
	<tr> 
	  <td class="tdgenap">Insured By</td>
      <td class="tdganjil"><asp:Label ID="lblInsuredBy" runat="server" Text="Company"></asp:Label ></td>
      <td class="tdgenap">Insurance Company</td>
      <td class="tdganjil"><asp:Label ID="lblInsuranceCompany" runat="server" Text="PT. ABC"></asp:Label> </td>
    </tr>
	<tr> 
	  <td class="tdgenap">Paid By</td>
      <td class="tdganjil"><asp:Label ID="lblPaidBy" runat="server" Text="Customer"></asp:Label></td>
       <td class="tdgenap"></td>
      <td class="tdganjil"></td>
    </tr>
	<tr> 
	<td class="tdgenap">Cover Period</td>
      <td class="tdganjil"><asp:Label ID="lblCoverPeriod" runat="server" Text="Full Tenor"></asp:Label></td>
	  <td class="tdgenap">Insurance Length</td>
      <td class="tdganjil"><asp:Label ID="lblInsuranceLength" runat="server" Text="36"></asp:Label></td>
     
    </tr>
    <tr> 
	<td class="tdgenap">Amount Coverage</td>
      <td class="tdganjil">
		<asp:Label ID="lblAmountCoverage" runat="server" Text="999,999,999,999.99"></asp:Label></td>
	  <td class="tdgenap">Selling Rate</td>
      <td class="tdganjil">
		<asp:Label ID="lblSellingRate" runat="server" Text="99,999"></asp:Label></td>
     
    </tr>
	<tr> 
	  <td class="tdgenap">All Risk Rate (%)</td>
      <td class="tdganjil">
		<asp:Label ID="lblAllRiskRate" runat="server" Text="99.999"></asp:Label></td>
	  <td class="tdgenap">Total Loss Rate (%)</td>
      <td class="tdganjil">
		<asp:Label ID="lblTLORate" runat="server" Text="99.999"></asp:Label></td>
     
    </tr>
    <tr> 
	<td class="tdgenap">Fire Rate(%)</td>
      <td class="tdganjil">
		<asp:Label ID="lblFireRate" runat="server" Text="99.999"></asp:Label></td>
	  <td class="tdgenap">Discount (%)</td>
      <td class="tdganjil">
		<asp:Label ID="lblDiscountRate" runat="server" Text="99.999"></asp:Label></td>
     
    </tr>
    </table>
    <br>
    <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">RATE TO CUSTOMER</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  </div>
      <div align="center">
     
    <asp:GridView runat="server" id="GrdListCustomer" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
    	<asp:templatefield HeaderText="YEAR NUM">
			<ItemTemplate>
				<asp:Label runat="server" id="lblYearNum">9
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>

		<asp:templatefield HeaderText="# OF MONTHS">
			<ItemTemplate>
				<asp:Label runat="server" id="lblMonths">12
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="COVERAGE TYPE">
			<ItemTemplate>
				<asp:Label runat="server" id="lblCoverageType">TLO
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="INSURED (%)">
			<ItemTemplate>
				<asp:label runat="server" id="txtPercentageInsured"  Text="99.99">
				</asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="RATE (%)">
			<ItemTemplate>
				<asp:Label runat="server" id="lblAssetType" Text="99.99">
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" />
		</asp:templatefield>

		<asp:templatefield HeaderText="PREMIUM">
			<ItemTemplate>
				<asp:Label runat="server" id="lblPremium" Text="9,999,999,999">
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" />
		</asp:templatefield>

		<asp:templatefield HeaderText="TOTAL PREMIUM">
			<ItemTemplate>
				<asp:Label runat="server" id="lblTotalPremium" Text="9,999,999,999">
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" />
		</asp:templatefield>

	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>

<br>
<br>

<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ADDITIONAL RATE</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  </div>
      <div align="center">
     
    <asp:GridView runat="server" id="GrdAdditionalRate" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield HeaderText="YEAR NUM">
			<ItemTemplate>
				<asp:Label runat="server" id="lblYearNum">9
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" Width=5% />
		</asp:templatefield>

		<asp:templatefield HeaderText="# OF MONTHS">
			<ItemTemplate>
				<asp:Label runat="server" id="lblMonths">12
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" Width=5% />
		</asp:templatefield>
		<asp:templatefield HeaderText="SRCC">
			<ItemTemplate>
				<asp:Label runat="server" id="lblSRCC">Yes</asp:Label>
				
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="TS">
			<ItemTemplate>
				<asp:Label runat="server" id="lblTS">Yes</asp:Label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="SRCCTS">
			<ItemTemplate>
				<asp:Label runat="server" id="lblSRCCTS">Yes</asp:Label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="RSMD">
			<ItemTemplate>
				<asp:Label runat="server" id="lblRSMD">Yes</asp:Label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
        <asp:templatefield HeaderText="TPL">
			<ItemTemplate><asp:Label runat="server" id="lblTPL">0</asp:Label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="AOG">
			<ItemTemplate>
							<asp:Label runat="server" id="lblAOG">Yes</asp:Label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="EARTHQUAKE">
			<ItemTemplate><asp:Label runat="server" id="lblEarthQuake">Yes</asp:Label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="FLOOD">
			<ItemTemplate>
			<asp:Label runat="server" id="lblFlood">Yes</asp:Label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>

		<asp:templatefield HeaderText="TOTAL ADDITIONAL PREMIUM">
			<ItemTemplate>
				<asp:Label runat="server" id="lblTotalAdditionalPremium" Text="9,999,999,999">
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>

<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
 <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right" class="tdganjil">
      &nbsp;</td>
    </tr>
  </table>
  <br>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">PREMIUM TO CUSTOMER</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      
      <td width="25%" class="tdgenap">SRCC Premium</td>
      <td width="25%" class="tdganjil"><asp:Label runat="server" id="lblSRCCPremium" Text="9,999,999,999"></asp:Label ></td>
       <td class="tdgenap">TS Premium</td>
      <td class="tdganjil"><asp:Label runat="server" id="lblTSPremium" Text="9,999,999,999"></asp:Label ></td>
    </tr>
    <tr> 
     
      <td class="tdgenap">SRCCTS Premium</td>
      <td class="tdganjil"><asp:Label runat="server" id="lblSRCCTSPremium" Text="9,999,999,999"></asp:Label ></td>
       <td class="tdgenap">RSMD</td>
      <td class="tdganjil"><asp:Label runat="server" id="lblRSMDPremium" Text="9,999,999,999"></asp:Label ></td>
    </tr>
    <tr> 
      
      <td class="tdgenap">TPL Premium</td>
      <td class="tdganjil"><asp:Label runat="server" id="lblTPLPremium" Text="9,999,999,999"></asp:Label ></td>
      <td class="tdgenap">AOG Premium</td>
      <td class="tdganjil"><asp:Label runat="server" id="lblAOGPremium" Text="9,999,999,999"></asp:Label ></td>
    </tr>

    <tr> 
      
      <td class="tdgenap">Earthquake Premium</td>
      <td class="tdganjil"><asp:Label runat="server" id="lblEarthquakePremium" Text="9,999,999,999"></asp:Label ></td>
      <td class="tdgenap">Flood Premium</td>
      <td class="tdganjil"><asp:Label runat="server" id="lblFlodPremium" Text="9,999,999,999"></asp:Label ></td>
    </tr>
    <tr>
      <td width="25%" class="tdgenap"><B>Main Premium</B></td>
      <td width="25%" class="tdganjil"><asp:Label runat="server" id="lblMainPremium" Text="9,999,999,999"></asp:Label ></td>
       <td class="tdgenap"><B>Total Additional Premium</B></td>
      <td class="tdganjil"><asp:Label runat="server" id="lblTotalAdditionalPremium" Text="9,999,999,999"></asp:Label ></td>
 	 </tr>
	<tr> 
	  <td class="tdgenap"><B>Discount</B></td>
      <td class="tdganjil"><asp:Label runat="server" id="lblDiscount" Text="9,999,999,999"></asp:Label ></td>
      <td class="tdgenap"><B>Total Premium To Customer</B></td>
      <td class="tdganjil"><asp:Label runat="server" id="lblTotalPremiumToCust" Text="9,999,999,999"></asp:Label ></td>   
    </tr>
  </table>

  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right" class="tdganjil">
      <asp:ImageButton id="imbNextCompleteDataInsurance" imageurl="../../Images/ButtonNext.gif" postbackurl="CompleteEntry_InsuranceDataSummary.aspx" runat="server"></asp:ImageButton>
        <asp:ImageButton ID="imbCancelEntryInsurance" runat="server" PostBackUrl="CompleteDataEntryList.aspx" ImageUrl="../../Images/ButtonCancel.gif"></asp:ImageButton>
        
      </td>
    </tr>
  </table>
</div>

</form>
</body>
</html>

