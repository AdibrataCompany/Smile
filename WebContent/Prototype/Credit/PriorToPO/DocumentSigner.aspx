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
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">DOCUMENT SIGNER REGISTRATION</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap" style="height: 18px">Customer Name</td>
      <td width="80%" class="tdganjil" style="height: 18px" colspan="3"><asp:Label ID="lblCustomerName" runat="server" Text="Customer0001"></asp:Label></td>
  
    </tr>
    <tr> 
      <td width="20%" class="tdgenap" style="height: 18px">Agreement No</td>
      <td width="80%" class="tdganjil" style="height: 18px" colspan="3"><asp:Label ID="lblAgreementNo" runat="server" Text="AgreementNo00001"></asp:Label></td>
    </tr>

      <tr> 
      <td class="tdgenap">NPWP NUMBER</td>
      <td class="tdganjil"><asp:Label ID="lblNPWPNUMBER" Text="1234.1234.1234.1234" runat="server"></asp:Label>
	</td>
    
    </tr>
     <tr> 
      <td class="tdgenap">Product</td>
      <td class="tdganjil"><asp:label id="lblProduct" runat="server">Leasing</asp:label></td>
    </tr>
    <table width="95%">
	 <tr> 
	      <td colspan="4" class="tdjudulhijau">WITNESS <font color="red">
			*)</font> 
	      </td>
	    </tr>
	</table>
    <table width="95%">
    
   	<tr> 
   		<td class="tdgenap" width="20%">Witness I</td>
      <td class="tdganjil">
      <asp:textbox id="txtWitness1" runat="server" CssClass="inptype" width="100"></asp:textbox> 
		</td>
     
    </tr>
	<tr> 
	<td class="tdgenap" width="20%">Witness II </td>
      <td class="tdganjil"><asp:textbox id="txtWitness2" runat="server" CssClass="inptype" width="100"></asp:textbox> 
	</td>
	</tr>
</table>
<table width="95%">
	 <tr> 
	      <td colspan="4" class="tdjudulhijau">PERSON IN CHARGE <font color="red">
			*)</font> 
	      </td>
	    </tr>
	</table>
<table align="center" width="95%">
<tr>
      <td class="tdgenap" width="20%">Company PIC</td>
      <td class="tdganjil">
      <asp:textbox id="txtCompanyPIC" runat="server" CssClass="inptype" width="100"></asp:textbox> 
		</td>    
      </tr>
</table>
      <table width="95%">
	 <tr> 
	      <td colspan="4" class="tdjudulhijau">LESSEE SIGNER <font color="red">
			*)</font> 
	      </td>
	    </tr>
	</table>
<table align="center" width="95%">
<tr>
      <td class="tdgenap" width="20%">Lessee Name</td>
      <td class="tdganjil">
      <asp:textbox id="txtLeaseeName" runat="server" CssClass="inptype" width="100"></asp:textbox> 
		</td>    
      </tr>
</table>
    <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="20%" align="right"></td>
      <td width="80%" align="right"><asp:ImageButton id="imbSavePriorTOPo" imageurl="../../Images/ButtonSave.gif"  PostBackUrl="PriorToPO_AgreementList.aspx" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbCancelPriorTOPo" PostBackUrl="PriorToPO_AgreementList.aspx" imageurl="../../Images/ButtonCancel.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <br>
</div>
</form>
</body>
</html>
