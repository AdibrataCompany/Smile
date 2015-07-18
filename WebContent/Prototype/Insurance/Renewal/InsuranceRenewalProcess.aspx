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
<form runat="Server" id="frmRenewal">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiabukiri">&nbsp;</td>
      <td align="center" class="tdtopiabu">INSURANCE RENEWAL - STEP 1</td>
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
      <td class="tdgenap" width="20%" >Current Insurance Period</td>
      <td class="tdganjil" colspan="3" style="width: 60%">dd-mm-yyyy to 
		dd-mm-yyyy</tr>
	<tr> 
	      <td colspan="4" class="tdjudulabu">INSURANCE DATA</td>
	</tr>
		<tr>
    <td class="tdgenap">Copy From Asset</td>
      <td class="tdganjil" colspan="3"><asp:dropdownlist id="ddlCopyFromAsset" runat="server" cssclass="inptype" width="50">
      <asp:ListItem Text="" Value="0"></asp:ListItem>
      <asp:ListItem Text="1" Value="1"></asp:ListItem>
      <asp:ListItem Text="2" Value="2"></asp:ListItem>
      </asp:dropdownlist >
&nbsp;<img src="../../Images/ButtonCopy.gif" border="0" align="absmiddle"></td>
	 
    	</tr>
	<tr> 
	  <td class="tdgenap">Insured By</td>
      <td class="tdganjil"><asp:dropdownlist id="ddlInsuredBy" runat="server" cssclass="inptype" width="100">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="Company" Value="Comp"></asp:ListItem>
      <asp:ListItem Text="Customer" Value="Cust"></asp:ListItem>
      <asp:ListItem Text="BFI Customer" Value="Cust"></asp:ListItem>
      </asp:dropdownlist ><font color="red" >&nbsp;*)</font> </td>
      <td class="tdgenap">Insurance Company</td>
      <td class="tdganjil"><asp:dropdownlist id="ddlInsuranceCompany" runat="server" cssclass="inptype" width="100">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="PT. ACA" Value="ACA"></asp:ListItem>
      <asp:ListItem Text="PT. ACB" Value="ACB"></asp:ListItem>
      </asp:dropdownlist ><font color="red" >&nbsp;*) if insured by company</font> </td>
    </tr>
	<tr> 
	  <td class="tdgenap">Paid By</td>
      <td class="tdganjil"><asp:dropdownlist id="ddlPaidBy" runat="server" cssclass="inptype" width="100">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="Company" Value="Comp"></asp:ListItem>
      <asp:ListItem Text="Customer" Value="Cust"></asp:ListItem>
      <asp:ListItem Text="At Cost" Value="Cost"></asp:ListItem>
      </asp:dropdownlist ><font color="red" >&nbsp;*)</font> </td>
       <td class="tdgenap">Application Type</td>
      <td class="tdganjil"><asp:dropdownlist id="ddlApplicationType" runat="server" cssclass="inptype" width="100">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="Group" Value="G"></asp:ListItem>
      <asp:ListItem Text="Non Group" Value="NG"></asp:ListItem>
      </asp:dropdownlist ><font color="red" >&nbsp;*)</font> </td>
    </tr>
	<tr> 
	<td class="tdgenap">Cover Period</td>
      <td class="tdganjil"><asp:dropdownlist id="ddlCoverPeriod" runat="server" cssclass="inptype" width="100">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="Full Tenor" Value="Comp"></asp:ListItem>
      <asp:ListItem Text="Annualy" Value="Cust"></asp:ListItem>
      </asp:dropdownlist ><font color="red" >&nbsp;*)</font> </td>
	  <td class="tdgenap">Insurance Length</td>
      <td class="tdganjil"><asp:textbox id="txtInsuranceLength" runat="server" CssClass="inptype" width="75" ></asp:textbox><font color="red" >&nbsp;*) in month</font></td>
     
    </tr>


    </table>
   

<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>

  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right" class="tdganjil">
      <asp:ImageButton id="imbNext" imageurl="../../Images/ButtonNext.gif" postbackurl="InsuranceRenewalProcessNext.aspx" runat="server"></asp:ImageButton>
        <asp:ImageButton ID="imbCancel" runat="server" PostBackUrl="InsuranceRenewalAsset.aspx" ImageUrl="../../Images/ButtonCancel.gif"></asp:ImageButton>
        
      </td>
    </tr>
  </table>
</div>

</form>
</body>
</html>
