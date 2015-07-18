<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html xmlns:m="http://schemas.microsoft.com/office/2004/12/omml" xmlns:v="urn:schemas-microsoft-com:vml" xmlns:o="urn:schemas-microsoft-com:office:office">
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
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
      <td align="center" class="tdtopihijau">INSURANCE ACTIVATION</td>
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
    <td width="20%" class="tdgenap">Start Date</td>
      <td width="30%" class="tdganjil"><asp:Textbox runat="server" ID="txtApprovalDate" CssClass="inptype"></asp:Textbox>
          				<asp:imagebutton id="imbCalendar" runat="server" ImageUrl="../images/iconcalendar.gif" CausesValidation="False"></asp:imagebutton></td>
          				 <td class="tdgenap"></td>
      <td class="tdganjil"></td>

</tr>
    </table>
  

<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
 

  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="70%" align="right" height="30">&nbsp;</td>
      <td width="30%" align="right" class="tdganjil">
      <asp:ImageButton id="imbSaveEntryInsurance" imageurl="../Images/ButtonSave.gif" postbackurl="InsuranceActivation.aspx" runat="server"></asp:ImageButton>
        <asp:ImageButton ID="imbCancelEntryInsurance" runat="server" PostBackUrl="InsuranceActivation.aspx" ImageUrl="../Images/ButtonCancel.gif"></asp:ImageButton>
        
      </td>
    </tr>
  </table>
</div>

</form>
</body>
</html>
