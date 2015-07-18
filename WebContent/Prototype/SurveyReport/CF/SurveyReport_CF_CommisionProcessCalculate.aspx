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
      <td align="center" class="tdtopihijau">SURVEY REPORT - ENTRY COMMISSION 
		DATA</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
     <tr> 
      <td class="tdgenap" width="20%">Application ID</td>
      <td class="tdganjil" width="30%"><asp:HyperLink ID="hypApplicationID" NavigateUrl="../../ViewApplication.htm" runat="server" Target="_blank" Text="Application0001"></asp:HyperLink>
      <td class="tdgenap" width="20%">Customer Name</td>
      <td class="tdganjil" width="30%"><asp:HyperLink ID="hypCustomerName" text="Customer0001" runat="server" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target= _blank></asp:HyperLink>
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
 </table>
  <asp:GridView runat="server" id="GrdCommissionData" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
    <asp:templatefield HeaderText="TO">
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblTo" Text ="xxxxxxxx20xxxxxxxx">
				</asp:Label >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lblTo" Text ="xxxxxxxx20xxxxxxxx">
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>

		<asp:templatefield HeaderText="INSURANCE PREMIUM INCOME" >
			<AlternatingItemTemplate>
				<asp:TextBox runat="server" id="txtInsurancePremiumIncome" Text ="999,999,999,999" CssClass="inptype">
				</asp:TextBox >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtInsurancePremiumIncome" Text ="999,999,999,999" CssClass="inptype">
				</asp:TextBox >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" />
		</asp:templatefield>
		<asp:templatefield HeaderText="INSURANCE PREMIUM INCOME (%)" >
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtInsurancePremiumIncomePercentage" Text ="99.99" CssClass="inptype" Width="100%">
				</asp:TextBox >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" Width="10%"/>
		</asp:templatefield>

		<asp:templatefield HeaderText="INTEREST RATE UPPING">
			<AlternatingItemTemplate>
				<asp:TextBox runat="server" id="txtInterestRateUpping" Text ="999,999,999,999" CssClass="inptype">
				</asp:TextBox >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtInterestRateUpping" Text ="999,999,999,999" CssClass="inptype">
				</asp:TextBox >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" />
		</asp:templatefield>
		<asp:templatefield HeaderText="INTEREST RATE UPPING (%)">
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtInterestRateUppingPercentage" Text ="99.99" CssClass="inptype" Width="100%">
				</asp:TextBox >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" />
		</asp:templatefield>

		<asp:templatefield HeaderText="OTHER" >
			<AlternatingItemTemplate>
				<asp:TextBox runat="server" id="txtOther" Text ="999,999,999,999" CssClass="inptype">
				</asp:TextBox >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtOther" Text ="999,999,999,999" CssClass="inptype">
				</asp:TextBox >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" />
		</asp:templatefield>
		<asp:templatefield HeaderText="OTHER (%)" >
			
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtOtherPercentage" Text ="99.99" CssClass="inptype" Width="100%">
				</asp:TextBox >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  />
		</asp:templatefield>

		<asp:templatefield HeaderText="TAX"  >
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblTax" Text ="99.99 %">
				</asp:Label >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lblTax" Text ="99.99 %">
				</asp:Label >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"   />
		</asp:templatefield>
		<asp:templatefield HeaderText="BANK ACCOUNT" >
			<AlternatingItemTemplate>
				<asp:DropDownList runat="server" id="ddlBankAccount">
				<asp:ListItem Text="PT ABC-JKT-999.999.9999-DR. ABC" Value="JKT"></asp:ListItem>
				<asp:ListItem Text="PT ABC-BDG-999.999.9999-DR. ABC" Value="BDG"></asp:ListItem>
				</asp:DropDownList >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:DropDownList runat="server" id="ddlBankAccount" >
				<asp:ListItem Text="PT ABC-JKT-999.999.9999-DR. ABC" Value="JKT"></asp:ListItem>
				<asp:ListItem Text="PT ABC-BDG-999.999.9999-DR. ABC" Value="BDG"></asp:ListItem>
				</asp:DropDownList >		
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" />
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
				<asp:TextBox runat="server" id="txtSupplier" Text ="xxxxx20xxxxx" CssClass="inptype" MaxLength="20">
				</asp:TextBox > 
				<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucSupplier" runat="server" NavigateUrl="Lookup/SupplierLookup.htm" Target="_blank"></asp:Hyperlink>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtSupplier" Text ="xxxxx20xxxxx" CssClass="inptype" MaxLength="20" >
				</asp:TextBox >
				<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucSupplier" runat="server" NavigateUrl="Lookup/SupplierLookup.htm" Target="_blank"></asp:Hyperlink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  Width="15%" />
		</asp:templatefield>

		<asp:templatefield HeaderText="INSURANCE PREMIUM INCOME" >
			<AlternatingItemTemplate>
				<asp:TextBox runat="server" id="txtInsurancePremiumIncome" Text ="999,999,999,999" CssClass="inptype" MaxLength="15" >
				</asp:TextBox >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtInsurancePremiumIncome" Text ="999,999,999,999" CssClass="inptype" MaxLength="15" >
				</asp:TextBox >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" Width="7%"/>
		</asp:templatefield>
		<asp:templatefield HeaderText="INSURANCE PREMIUM INCOME (%)" >
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtInsurancePremiumIncomePercentage" Text ="99.99" CssClass="inptype" MaxLength="5"  Width="100%">
				</asp:TextBox >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" Width="7%"/>
		</asp:templatefield>

		<asp:templatefield HeaderText="INTEREST RATE UPPING">
			<AlternatingItemTemplate>
				<asp:TextBox runat="server" id="txtInterestRateUpping" Text ="999,999,999,999" CssClass="inptype">
				</asp:TextBox >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtInterestRateUpping" Text ="999,999,999,999" CssClass="inptype">
				</asp:TextBox >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  Width="7%" />
		</asp:templatefield>
		<asp:templatefield HeaderText="INTEREST RATE UPPING (%)">
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtInterestRateUppingPercentage" Text ="99.99" CssClass="inptype" Width="100%">
				</asp:TextBox >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  Width="7%" />
		</asp:templatefield>

		<asp:templatefield HeaderText="OTHER" >
			<AlternatingItemTemplate>
				<asp:TextBox runat="server" id="txtOther" Text ="999,999,999,999" CssClass="inptype">
				</asp:TextBox >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtOther" Text ="999,999,999,999" CssClass="inptype">
				</asp:TextBox >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  Width="7%"/>
		</asp:templatefield>
		<asp:templatefield HeaderText="OTHER (%)" >
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtOtherPercentage" Text ="99.99" CssClass="inptype" Width="100%">
				</asp:TextBox >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  Width="7%"/>
		</asp:templatefield>
		<asp:templatefield HeaderText="TOTAL" >
			<AlternatingItemTemplate>
				<asp:TextBox runat="server" id="txtTotal" Text ="999,999,999,999" CssClass="inptype" Enabled="false">
				</asp:TextBox >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtTotal" Text ="999,999,999,999" CssClass="inptype" Enabled="false">
				</asp:TextBox >			
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
			<ItemStyle HorizontalAlign="Right" Width="8%" />
		</asp:templatefield>
		<asp:templatefield HeaderText="BANK ACCOUNT" >
			<AlternatingItemTemplate>
				<asp:TextBox runat="server" id="txtBankAccount" Text ="xxxxx50xxxxx" CssClass="inptype"  MaxLength="50" >
				</asp:TextBox >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtBankAccount" Text ="xxxxx50xxxxx" CssClass="inptype" MaxLength="50" >
				</asp:TextBox >	
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
			<asp:templatefield HeaderText="ACTION">
			<AlternatingItemTemplate>
				<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../images/IconDelete.gif" />
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../images/IconDelete.gif" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" Width="1%"/>
		</asp:templatefield>

	</Columns>

			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
 <table width="95%" border="0" cellpadding="0" cellspacing="0">
    	<TR>
			<TD align="left"><asp:imagebutton id="imbAddSupplier" runat="server" ImageUrl="../../images/buttonadd.gif" CausesValidation="False"
					ALT="Add"></asp:imagebutton></TD>
		</TR>
</table>
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
				<asp:TextBox runat="server" id="txtSupplier" Text ="xxxxx20xxxxx" CssClass="inptype" MaxLength="20">
				</asp:TextBox > 
				<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucSupplier" runat="server" NavigateUrl="Lookup/SupplierLookup.htm" Target="_blank"></asp:Hyperlink>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtSupplier" Text ="xxxxx20xxxxx" CssClass="inptype" MaxLength="20" >
				</asp:TextBox >
				<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucSupplier" runat="server" NavigateUrl="Lookup/SupplierLookup.htm" Target="_blank"></asp:Hyperlink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  Width="15%" />
		</asp:templatefield>
<asp:templatefield HeaderText="EMPLOYEES" >
			<AlternatingItemTemplate>
				<asp:TextBox runat="server" id="txtEmployees" Text ="xxxxx20xxxxx" CssClass="inptype" MaxLength="20">
				</asp:TextBox > 
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtEmployees" Text ="xxxxx20xxxxx" CssClass="inptype" MaxLength="20" >
				</asp:TextBox >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  Width="15%" />
		</asp:templatefield>

		<asp:templatefield HeaderText="INSURANCE PREMIUM INCOME" >
			<AlternatingItemTemplate>
				<asp:TextBox runat="server" id="txtInsurancePremiumIncome" Text ="999,999,999,999" CssClass="inptype" MaxLength="15" >
				</asp:TextBox >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtInsurancePremiumIncome" Text ="999,999,999,999" CssClass="inptype" MaxLength="15" >
				</asp:TextBox >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" Width="7%"/>
		</asp:templatefield>
		<asp:templatefield HeaderText="INSURANCE PREMIUM INCOME (%)" >
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtInsurancePremiumIncomePercentage" Text ="99.99" CssClass="inptype" MaxLength="5" Width="100%" >
				</asp:TextBox >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" Width="7%"/>
		</asp:templatefield>

		<asp:templatefield HeaderText="INTEREST RATE UPPING">
			<AlternatingItemTemplate>
				<asp:TextBox runat="server" id="txtInterestRateUpping" Text ="999,999,999,999" CssClass="inptype">
				</asp:TextBox >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtInterestRateUpping" Text ="999,999,999,999" CssClass="inptype">
				</asp:TextBox >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  Width="7%" />
		</asp:templatefield>
		
		<asp:templatefield HeaderText="INTEREST RATE UPPING (%)">
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtInterestRateUppingPercentage" Text ="99.99" CssClass="inptype" Width="100%">
				</asp:TextBox >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  Width="7%" />
		</asp:templatefield>

		<asp:templatefield HeaderText="OTHER" >
			<AlternatingItemTemplate>
				<asp:TextBox runat="server" id="txtOther" Text ="999,999,999,999" CssClass="inptype">
				</asp:TextBox >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtOther" Text ="999,999,999,999" CssClass="inptype">
				</asp:TextBox >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  Width="7%"/>
		</asp:templatefield>
		<asp:templatefield HeaderText="OTHER (%)" >
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtOtherPercentage" Text ="99.99" CssClass="inptype" Width="100%">
				</asp:TextBox >			
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right"  Width="7%"/>
		</asp:templatefield>

		<asp:templatefield HeaderText="TOTAL" >
			<AlternatingItemTemplate>
				<asp:TextBox runat="server" id="txtTotal" Text ="999,999,999,999" CssClass="inptype" Enabled="false">
				</asp:TextBox >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtTotal" Text ="999,999,999,999" CssClass="inptype" Enabled="false">
				</asp:TextBox >			
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
			<ItemStyle HorizontalAlign="Right" Width="8%" />
		</asp:templatefield>
		<asp:templatefield HeaderText="BANK ACCOUNT" >
			<AlternatingItemTemplate>
				<asp:TextBox runat="server" id="txtBankAccount" Text ="xxxxx50xxxxx" CssClass="inptype"  MaxLength="50" >
				</asp:TextBox >		
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtBankAccount" Text ="xxxxx50xxxxx" CssClass="inptype" MaxLength="50" >
				</asp:TextBox >	
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
			<asp:templatefield HeaderText="ACTION">
			<AlternatingItemTemplate>
				<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../images/IconDelete.gif" />
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../images/IconDelete.gif" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" Width="1%"/>
		</asp:templatefield>

	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>

<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>

  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    	<TR>
			<TD align="left"><asp:imagebutton id="imbAddSupplierEmployee" runat="server" ImageUrl="../../images/buttonadd.gif" CausesValidation="False"
					ALT="Add"></asp:imagebutton></TD>
		</TR>

    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right" class="tdganjil">
      <asp:ImageButton id="imbCalculateEntryCommission" imageurl="../../Images/ButtonCalculate.gif" postbackurl="SurveyReport_CF_CommisionProcessCalculate2.aspx" runat="server"></asp:ImageButton>
        <asp:ImageButton ID="imbCancelEntryCommission" runat="server" PostBackUrl="SurveyReport_CF_CommisionDataList.aspx" ImageUrl="../../Images/ButtonCancel.gif"></asp:ImageButton>
        
      </td>
    </tr>
  </table>
</div>

</form>
</body>
</html>
