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
      <td align="center" class="tdtopihijau">COMPLETE DATA - ENTRY INSURANCE DATA 
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
      <td class="tdganjil"><asp:Label ID="lblInsuredBy" Text="Company" runat="server"></asp:Label> </td>
      <td class="tdgenap">Insurance Company</td>
      <td class="tdganjil">
		<asp:Label ID="lblInsuranceCompany" Text="PT. ASOKA" runat="server"></asp:Label></td>
    </tr>
	<tr> 
	  <td class="tdgenap">Paid By</td>
      <td class="tdganjil" colspan="3">
		<asp:Label ID="lblPaidBy" Text="Customer" runat="server"></asp:Label></td>
     
	<tr> 
	<td class="tdgenap">Cover Period</td>
      <td class="tdganjil">
		<asp:Label ID="lblCoverPeriod" Text="Full Tenor" runat="server"></asp:Label> </td>
	  <td class="tdgenap">Insurance Length</td>
      <td class="tdganjil">
		<asp:Label ID="lblInsuranceLength" Text="24" runat="server"></asp:Label><font color="red" >&nbsp; in month</font></td>
     
    </tr>
    </table>
    <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
	<tr> 
      <td colspan="4" class="tdjudulhijau">ASSET USAGE INFORMATION</td>
    </tr>
    </table>
    <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
     <tr>
      <td class="tdgenap" style="width: 28%">Copy Address From</td>
      <td class="tdganjil" colspan="3"><asp:dropdownlist id="ddlCopyAddressFrom" runat="server" cssclass="inptype" width="150">
      		<asp:ListItem Text="Residence Address" Value="R"></asp:ListItem>
		 	<asp:ListItem Text="Legal Address" Value="L"></asp:ListItem>
      		<asp:ListItem Text="Company Address" Value="C"></asp:ListItem>
		</asp:dropdownlist>	
        </td>
    </tr>
    <tr>
      <td valign="top" class="tdgenap" style="width: 28%">Address</td>
      <td colspan="3" class="tdganjil">
      	<asp:TextBox ID="txtAddressAssetUsage" runat="server" CssClass="inptype"></asp:TextBox>
        </td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 28%">RT/RW</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326324" type="text" class="inptype" size="5">
        / 
        <input name="textfield32326325" type="text" class="inptype" size="5">
        </font></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 28%">Kelurahan</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326326" type="text" class="inptype" size="15">
        </font></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 28%">Kecamatan</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
			<asp:textbox id="txtFax1" runat="server" cssclass="inptype" width="20%"></asp:textbox>
        <input name="textfield32326327" type="text" class="inptype" size="15">
        </font></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 28%">City</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326328" type="text" class="inptype" size="15">
        </font></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 28%">Zip Code</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326329" type="text" class="inptype" size="15">
        <a href="javascript:;" onClick="MM_openBrWindow('../../Lookup/ZipCodeLookup.aspx','ZipCode','scrollbars=yes,width=900,height=500,left=0,top=0')"><img src="../../Images/IconDetail.gif" width="15" height="15" border="0" align="absmiddle"></a> 
        </font></td>
    </tr>
	<tr>
      <td class="tdgenap">Usage Industry Type</td>
      <td class="tdganjil" colspan="3"><asp:textbox id="txtIndustryType" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucIndustryType" runat="server" NavigateUrl="../../Lookup/IndustryTypeLookup.aspx" Target="_blank"></asp:Hyperlink>
      </td>
    </tr>
    <tr>
      <td valign="top" class="tdgenap" style="width: 28%">Asset Notes</td>
      <td colspan="3" class="tdganjil"> 
		<textarea name="textarea0" cols="50" rows="5" class="inptype"></textarea> 
      </td>
    </tr>


    </table>
   

<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>

  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right" class="tdganjil">
      <asp:ImageButton id="imbNextCompleteData" imageurl="../../Images/ButtonNext.gif" postbackurl="CompleteEntry_InsuranceDataDetail.aspx" runat="server"></asp:ImageButton>
        <asp:ImageButton ID="imbCancelEntryInsurance" runat="server" PostBackUrl="CompleteEntry_InsuranceDataList.aspx" ImageUrl="../../Images/ButtonCancel.gif"></asp:ImageButton>
        
      </td>
    </tr>
  </table>
</div>

</form>
</body>
</html>
