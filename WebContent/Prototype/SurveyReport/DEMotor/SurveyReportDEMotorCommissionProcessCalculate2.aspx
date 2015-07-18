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
      <td align="center" class="tdtopihijau">MARKETING MEMO - ENTRY COMMISSION 
		DATA</td>
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
      <td class="tdgenap" width="20%"></td>
      <td class="tdganjil" width="30%"></td>
   </tr>
   <tr>
      <td class="tdgenap" width="20%">Insurance Premium Income</td>
      <td class="tdganjil" width="30%"><asp:Label ID="lblInsurancePremiumIncome" runat="server" Text="999,999,999,999"></asp:Label ></td>
       <td class="tdgenap" width="20%"></td>
      <td class="tdganjil" width="30%"></td>

   </tr>

   <tr>
      <td class="tdgenap" width="20%">Interest Rate Upping</td>
      <td class="tdganjil" width="30%"><asp:Label ID="lblInterestRateUpping" runat="server" Text="999,999,999,999"></asp:Label ></td>
	 <td class="tdgenap" width="20%"></td>
      <td class="tdganjil" width="30%"></td>
    </tr>
    <tr>
      <td class="tdgenap" width="20%">Gross Yield</td>
      <td class="tdganjil" width="30%"><asp:Label ID="lblGrossYield" runat="server" Text="99.99 %"></asp:Label ></td>
	 <td class="tdgenap" width="20%"></td>
      <td class="tdganjil" width="30%"></td>
    </tr>

 </table>
  <asp:GridView runat="server" id="GrdCommissionData" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield HeaderText="TO">
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblTo" Text="xxxxx20xxxxx">
				</asp:Label>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:Label runat="server" id="lblTo" Text="xxxxx20xxxxx">
				</asp:Label>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="INSURANCE PREMIUM INCOME">
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblInsurancePremiumIncome" Text="999,999,999,999">
				</asp:Label>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Right" />
			<ItemTemplate>
				<asp:Label runat="server" id="lblInsurancePremiumIncome" Text="999,999,999,999">
				</asp:Label>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="INSURANCE PREMIUM INCOME (%)">
			<ItemStyle Width="10%" HorizontalAlign="Right" />
			<ItemTemplate>
				<asp:Label runat="server" id="lblInsurancePremiumIncomePercentage" Text="99.99" >
				</asp:Label>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="INTEREST RATE UPPING">
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblInterestRateUpping" Text="999,999,999,999">
				</asp:Label>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Right" />
			<ItemTemplate>
				<asp:Label runat="server" id="lblInterestRateUpping" Text="999,999,999,999">
				</asp:Label>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="INTEREST RATE UPPING (%)">
			<ItemStyle Width="5%" HorizontalAlign="Right" />
			<ItemTemplate>
				<asp:Label runat="server" id="lblInterestRateUppingPercentage" Text="99.99">
				</asp:Label>
			</ItemTemplate>
		</asp:templatefield>

		<asp:templatefield HeaderText="OTHER">
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblOther" Text="999,999,999,999">
				</asp:Label>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Right" />
			<ItemTemplate>
				<asp:Label runat="server" id="lblOther" Text="999,999,999,999">
				</asp:Label>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="OTHER (%)">
			<ItemStyle  HorizontalAlign="Right" />
			<ItemTemplate>
				<asp:Label runat="server" id="lblOtherPercentage" Text="99.99">
				</asp:Label>
			</ItemTemplate>
		</asp:templatefield>

		<asp:templatefield HeaderText="TAX">
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblTax" Text="99.99 %">
				</asp:Label>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Right" />
			<ItemTemplate>
				<asp:Label runat="server" id="lblTax" Text="99.99 %">
				</asp:Label>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="BANK ACCOUNT">
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblBankAccount" Text="xxxxx50xxxxx">
				</asp:Label>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:Label runat="server" id="lblBankAccount" Text="xxxxx50xxxxx">
				</asp:Label>
			</ItemTemplate>
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
    <BR>
 <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">COMMISSION FOR OTHER SUPPLIER</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
    <asp:GridView runat="server" id="GrdCommissionDataForOtherSupplier" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
    <asp:templatefield HeaderText="SUPPLIER" >
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblSupplier" Text ="xxxxx20xxxxx"  MaxLength="20">
				</asp:Label > 				
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lblSupplier" Text ="xxxxx20xxxxx"  MaxLength="20" >
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left"  Width="15%" />
		</asp:templatefield>

		<asp:templatefield HeaderText="INSURANCE PREMIUM INCOME" >
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblInsurancePremiumIncome" Text ="999,999,999,999"  MaxLength="15" >
				</asp:Label >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lblInsurancePremiumIncome" Text ="999,999,999,999"  MaxLength="15" >
				</asp:Label >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" Width="7%"/>
		</asp:templatefield>
		<asp:templatefield HeaderText="INSURANCE PREMIUM INCOME (%)" >
			<ItemTemplate>
				<asp:Label runat="server" id="lblInsurancePremiumIncomePercentage" Text ="99.99"  >
				</asp:Label >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" Width="10%"/>
		</asp:templatefield>

		<asp:templatefield HeaderText="INTEREST RATE UPPING">
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblInterestRateUpping" Text ="999,999,999,999" >
				</asp:Label >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lblInterestRateUpping" Text ="999,999,999,999" >
				</asp:Label >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  Width="7%" />
		</asp:templatefield>
		<asp:templatefield HeaderText="INTEREST RATE UPPING (%)">
			<ItemTemplate>
				<asp:Label runat="server" id="lblInterestRateUppingPercentage" Text ="99.99" >
				</asp:Label >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  Width="10%" />
		</asp:templatefield>

		<asp:templatefield HeaderText="OTHER" >
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblOther" Text ="999,999,999,999" >
				</asp:Label >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lblOther" Text ="999,999,999,999" >
				</asp:Label >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  Width="7%"/>
		</asp:templatefield>
		<asp:templatefield HeaderText="OTHER (%)" >
			<ItemTemplate>
				<asp:Label runat="server" id="lblOther" Text ="99.99" >
				</asp:Label >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  Width="5%"/>
		</asp:templatefield>

		<asp:templatefield HeaderText="TOTAL" >
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblTotal" Text ="999,999,999,999"  Enabled="false">
				</asp:Label >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lblTotal" Text ="999,999,999,999"  Enabled="false">
				</asp:Label >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" Width="7%"/>
		</asp:templatefield>

		<asp:templatefield HeaderText="TAX" >
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblTax" Text ="99.99 %" >
				</asp:Label >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lblTax" Text ="99.99 %" >
				</asp:Label >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  />
		</asp:templatefield>
		<asp:templatefield HeaderText="BANK ACCOUNT" >
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblBankAccount" Text ="xxxxx50xxxxx"   MaxLength="50" >
				</asp:Label >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lblBankAccount" Text ="xxxxx50xxxxx"  MaxLength="50" >
				</asp:Label >	
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
 <br>
 <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">COMMISSION FOR OTHER SUPPLIER'S EMPLOYEES</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <asp:GridView runat="server" id="GrdCommissionDataForOtherSupplierEmployees" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
    <asp:templatefield HeaderText="SUPPLIER" >
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblSupplier" Text ="xxxxx20xxxxx"  MaxLength="20">
				</asp:Label > 
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lblSupplier" Text ="xxxxx20xxxxx"  MaxLength="20" >
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left"  Width="15%" />
		</asp:templatefield>
		<asp:templatefield HeaderText="EMPLOYEES" >
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblEmployees" Text ="xxxxx20xxxxx"  MaxLength="20">
				</asp:Label > 
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lblEmployees" Text ="xxxxx20xxxxx"  MaxLength="20" >
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left"  Width="15%" />
		</asp:templatefield>

		<asp:templatefield HeaderText="INSURANCE PREMIUM INCOME" >
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblInsurancePremiumIncome" Text ="999,999,999,999"  MaxLength="15" >
				</asp:Label >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lblInsurancePremiumIncome" Text ="999,999,999,999"  MaxLength="15" >
				</asp:Label >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" Width="7%"/>
		</asp:templatefield>
		<asp:templatefield HeaderText="INSURANCE PREMIUM INCOME (%)" >
			<ItemTemplate>
				<asp:Label runat="server" id="lblInsurancePremiumIncomePercentage" Text ="99.99" >
				</asp:Label >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" Width="10%"/>
		</asp:templatefield>

		<asp:templatefield HeaderText="INTEREST RATE UPPING">
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblInterestRateUpping" Text ="999,999,999,999" >
				</asp:Label >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lblInterestRateUpping" Text ="999,999,999,999" >
				</asp:Label >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  Width="7%" />
		</asp:templatefield>
	  	<asp:templatefield HeaderText="INTEREST RATE UPPING (%)">
			<ItemTemplate>
				<asp:Label runat="server" id="lblInterestRateUppingPercentage" Text ="99.99" >
				</asp:Label >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  Width="10%" />
		</asp:templatefield>

		<asp:templatefield HeaderText="OTHER" >
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblOther" Text ="999,999,999,999" >
				</asp:Label >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lblOther" Text ="999,999,999,999" >
				</asp:Label >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  Width="7%"/>
		</asp:templatefield>
		<asp:templatefield HeaderText="OTHER (%)" >
			<ItemTemplate>
				<asp:Label runat="server" id="lblOtherPercentage" Text ="99.99" >
				</asp:Label >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  Width="7%"/>
		</asp:templatefield>

		<asp:templatefield HeaderText="TOTAL" >
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblTotal" Text ="999,999,999,999"  Enabled="false">
				</asp:Label >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lblTotal" Text ="999,999,999,999"  Enabled="false">
				</asp:Label >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" Width="7%"/>
		</asp:templatefield>

		<asp:templatefield HeaderText="TAX" >
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblTax" Text ="99.99 %" >
				</asp:Label >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lblTax" Text ="99.99 %" >
				</asp:Label >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" Width="100%" />
		</asp:templatefield>
		<asp:templatefield HeaderText="BANK ACCOUNT" >
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblBankAccount" Text ="xxxxx50xxxxx"   MaxLength="50" >
				</asp:Label >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lblBankAccount" Text ="xxxxx50xxxxx"  MaxLength="50" >
				</asp:Label >	
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>

<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
<br>
  <table width="95%" border="0" cellpadding="0" cellspacing="0" class="tablegrid">
    <tr> 
	      <td class="tdjudulhijau">INSURANCE PREMIUM INCOME TOTAL</td>
    	  <td class="tdjudulhijau">INTEREST RATE UPPING TOTAL</td>
    	  <td class="tdjudulhijau">OTHER TOTAL</td>
	</tr>
	 <tr> 
	      <td class="tdgenap" width="33.33%" align="right"><asp:Label runat="server" id="lblInsurancePremiumIncomeTotal" Text ="999,999,999,999"  >
				</asp:Label ></td>
    	  <td class="tdgenap" width="33.33%" align="right"><asp:Label runat="server" id="lblInteresetRateUppingTotal" Text ="999,999,999,999" > 
				</asp:Label ></td>
		  <td class="tdgenap" width="33.33%" align="right"><asp:Label runat="server" id="lblOtherTotal" Text ="999,999,999,999"  >
				</asp:Label ></td>
	</tr>

	</table>
	<br>
 <table width="95%" border="0" cellpadding="0" cellspacing="0" >

    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right" class="tdganjil">
      <asp:ImageButton id="imbSaveEntryCommission" imageurl="../../Images/ButtonSave.gif" postbackurl="SurveyReportDEMotorOtherData.aspx" runat="server"></asp:ImageButton>
        <asp:ImageButton ID="imbCancelEntryCommission" runat="server" PostBackUrl="SurveyReportDEMotorOtherDataList.aspx" ImageUrl="../../Images/ButtonCancel.gif"></asp:ImageButton>
        
      </td>
    </tr>
  </table>
</div>

</form>
</body>
</html>
