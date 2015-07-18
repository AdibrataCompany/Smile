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
<form runat="Server" id="frmInsuranceRenewal">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiabukiri">&nbsp;</td>
      <td align="center" class="tdtopiabu">INSURANCE RENEWAL - STEP 3</td>
      <td width="10" class="tdtopiabukanan">&nbsp;</td>
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
      <td class="tdgenap" width="20%">Agreement No</td>
      <td class="tdganjil" width="30%"><a href="../../Credit/ViewAgreement.htm" target="_blank">xxxxx20xxxxx</a></td>
      <td class="tdgenap" width="20%">Currency</td>
      <td class="tdganjil" width="30%">IDR</td>
   	</tr>
		<tr>
      <td class="tdgenap" width="20%">Tenor</td>
      <td class="tdganjil" width="30%"><asp:Label ID="lblTenor" runat="server" Text="36"></asp:Label >	</td>
      <td class="tdgenap" width="20%">Cumulative Tenor</td>
      <td class="tdganjil" width="30%">0</td>
   	</tr>
		<tr>
      <td class="tdgenap" width="20%">Asset No</td>
      <td class="tdganjil" width="30%">1</td>
      <td class="tdgenap" width="20%">Application Type</td>
      <td class="tdganjil" width="30%"><asp:Label ID="lblApplicationType" runat="server" Text="Non Group"></asp:Label >	</td>

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
	      <td colspan="4" class="tdjudulabu">INSURANCE DATA</td>
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
    </table>
    <br>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiabukiri">&nbsp;</td>
      <td align="center" class="tdtopiabu">PREMIUM TO CUSTOMER</td>
      <td width="10" class="tdtopiabukanan">&nbsp;</td>
    </tr>
  </table>
  
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      
      <td width="25%" class="tdgenap">SRCC Premium</td>
      <td width="25%" class="tdganjil" align="right"><asp:Label runat="server" id="lblSRCCPremium" Text="9,999,999,999"></asp:Label ></td>
       <td class="tdgenap">TS Premium</td>
      <td class="tdganjil" align="right"><asp:Label runat="server" id="lblTSPremium" Text="9,999,999,999"></asp:Label ></td>
    </tr>
    <tr> 
     
      <td class="tdgenap">SRCCTS Premium</td>
      <td class="tdganjil" align="right"><asp:Label runat="server" id="lblSRCCTSPremium" Text="9,999,999,999"></asp:Label ></td>
       <td class="tdgenap">RSMD Premium</td>
      <td class="tdganjil" align="right"><asp:Label runat="server" id="lblRSMDPremium" Text="9,999,999,999"></asp:Label ></td>
    </tr>
    <tr> 
      
      <td class="tdgenap">TPL Premium</td>
      <td class="tdganjil" align="right"><asp:Label runat="server" id="lblTPLPremium" Text="9,999,999,999"></asp:Label ></td>
      <td class="tdgenap">AOG Premium</td>
      <td class="tdganjil" align="right"><asp:Label runat="server" id="lblAOGPremium" Text="9,999,999,999"></asp:Label ></td>
    </tr>

    <tr> 
      
      <td class="tdgenap">Earthquake Premium</td>
      <td class="tdganjil" align="right"><asp:Label runat="server" id="lblEarthquakePremium" Text="9,999,999,999"></asp:Label ></td>
      <td class="tdgenap">Flood Premium</td>
      <td class="tdganjil" align="right"><asp:Label runat="server" id="lblFlodPremium" Text="9,999,999,999"></asp:Label ></td>
    </tr>
    <tr> 
	  <td class="tdgenap">Discount (-)</td>
      <td class="tdganjil" align="right"><asp:Label runat="server" id="lblDiscount" Text="9,999,999,999"></asp:Label ></td>
	  <td class="tdgenap">Loading Fee Premium</td>
      <td class="tdganjil" align="right">
		<asp:Label runat="server" id="lblLoadingFeePremium" Text="9,999,999,999"></asp:Label ></td>
   </tr>

    <tr> 
      <td class="tdgenap">Admin Fee</td>
      <td class="tdganjil" align="right">
		<asp:TextBox runat="server" id="txtAdminFee" Text="9,999,999,999" CssClass="inptype"></asp:TextBox ></td>
      <td class="tdgenap">Stamp Duty Fee</td>
      <td class="tdganjil" align="right">
		<asp:TextBox runat="server" id="txtStampDutyFee" Text="9,999,999,999" CssClass="inptype"></asp:TextBox ></td>
    </tr>
     

	<tr> 
	  <td class="tdgenap">Total Premium To Customer</td>
      <td class="tdganjil" align="right" colspan="3"><asp:Label runat="server" id="lblTotalPremiumToCust" Text="9,999,999,999"></asp:Label ></td>

   </tr>
   <tr> 
      <td class="tdgenap" >Paid Amount By Customer</td>
      <td class="tdganjil" align="right" colspan="3">
		<strong>9,999,999.99</strong></td>
     </tr>
     <tr> 
      <td class="tdgenap">Insurance Notes</td>
      <td class="tdganjil" colspan="3">
		<asp:TextBox runat="server" id="TbxInsuranceNotes" CssClass="inptype" Height="125" Width="500" Rows="10" Columns="50" TextMode="MultiLine">
			</asp:TextBox> </td>
      
    </tr>

  </table>

  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="70%" align="right" height="30">&nbsp;</td>
      <td width="30%" align="right" class="tdganjil">
      <asp:ImageButton id="imbSaveEntryInsurance" imageurl="../../Images/ButtonSave.gif" postbackurl="InsuranceRenewalAsset.aspx" runat="server"></asp:ImageButton>
        <asp:ImageButton ID="imbCancelEntryInsurance" runat="server" PostBackUrl="InsuranceRenewalAsset.aspx" ImageUrl="../../Images/ButtonCancel.gif"></asp:ImageButton>
        
      </td>
    </tr>
  </table>
</div>

</form>
</body>
</html>
