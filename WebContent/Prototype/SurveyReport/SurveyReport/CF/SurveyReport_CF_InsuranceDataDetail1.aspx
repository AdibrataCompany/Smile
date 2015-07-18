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
      <td align="center" class="tdtopihijau">SURVEY REPORT CF - ENTRY INSURANCE DATA 
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
      <td class="tdganjil">Company</td>
      <td class="tdgenap">Insurance Company</td>
      <td class="tdganjil">PT. ACB</td>
    </tr>
	<tr> 
	  <td class="tdgenap">Paid By</td>
      <td class="tdganjil">Customer</td>
       <td class="tdgenap">Application Type</td>
      <td class="tdganjil">Non Group</td>
    </tr>
	<tr> 
	<td class="tdgenap">Cover Period</td>
      <td class="tdganjil">Full Tenor</td>
	  <td class="tdgenap">Insurance Length</td>
      <td class="tdganjil">36</td>
     
    </tr>
    <tr> 
	<td class="tdgenap">Amount Coverage</td>
      <td class="tdganjil"><asp:textbox id="txtAmountCoverage" runat="server" CssClass="inptype" width="150" ></asp:textbox><font color="red" >&nbsp;*)</font></td>
	  <td class="tdgenap">Selling Rate</td>
      <td class="tdganjil"><asp:textbox id="txtSellingRate" runat="server" CssClass="inptype" width="50" ></asp:textbox><font color="red" >&nbsp;*)</font></td>
     
    </tr>

    <tr>
    <td class="tdgenap">Copy From Asset</td>
      <td class="tdganjil" colspan="3"><asp:dropdownlist id="ddlCopyFromAsset" runat="server" cssclass="inptype" width="50">
      <asp:ListItem Text="" Value="0"></asp:ListItem>
      <asp:ListItem Text="1" Value="1"></asp:ListItem>
      <asp:ListItem Text="2" Value="2"></asp:ListItem>
      </asp:dropdownlist >
<img src="../../Images/ButtonCopy.gif" border="0" align="absmiddle"></td>
	 
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
      <div align="center">
     
    <asp:GridView runat="server" id="GrdListCustomer" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield HeaderText="# OF MONTHS">
			<ItemTemplate>
				<asp:Label runat="server" id="lblMonths">12
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="COVERAGE TYPE">
			<ItemTemplate>
				<asp:dropdownlist id="ddlCoverageType" runat="server" cssclass="inptype" width="100">
			      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
			      <asp:ListItem Text="Total Loss" Value="TL"></asp:ListItem>
			      <asp:ListItem Text="All Risk" Value="AR"></asp:ListItem>
      			</asp:dropdownlist >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="% INSURED">
			<ItemTemplate>
				<asp:Label runat="server" id="lblPercentageInsured" Text="199">
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" />
		</asp:templatefield>
		<asp:templatefield HeaderText="RATE (%)">
			<ItemTemplate>
				<asp:Label runat="server" id="lblAssetType" Text="199">
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" />
		</asp:templatefield>

		<asp:templatefield HeaderText="PREMIUM">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAssetDescription" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>

		<asp:templatefield HeaderText="SRCC">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAssetDescription" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>


		<asp:templatefield HeaderText="SRCC PREMIUM">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAssetDescription" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>

		<asp:templatefield HeaderText="TPL AMOUNT">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAssetDescription" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		
		<asp:templatefield HeaderText="TPL PREMIUM">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAssetDescription" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		
		<asp:templatefield HeaderText="FLOOD">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAssetDescription" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>

		<asp:templatefield HeaderText="FLOOD PREMIUM">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAssetDescription" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>

		<asp:templatefield HeaderText="TOTAL">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAssetDescription" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
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
      <asp:ImageButton id="imbNextMarketingMemo" imageurl="../../Images/ButtonNext.gif" postbackurl="SurveyReport_CF_FinancialData.aspx" runat="server"></asp:ImageButton>
        <asp:ImageButton ID="imbCancelEntryInsurance" runat="server" PostBackUrl="MarketingMemoLS3.aspx" ImageUrl="../../Images/ButtonCancel.gif"></asp:ImageButton>
        
      </td>
    </tr>
  </table>
</div>

</form>
</body>
</html>
