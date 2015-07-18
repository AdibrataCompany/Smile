<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Personal Customer Match Similar Data</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
<style type="text/css">
.style1 {
	color: #0066CC;
}
</style>
</head>
<body>
<form id="frmDuplicateChecking" runat="server">
<div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">CUSTOMER DATA</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Name</td>
      <td class="tdganjil">CompanyCustomer001</td>
    </tr>
    <tr> 
      <td class="tdgenap">NPWP Number</td>
      <td class="tdganjil"> 111222333444555</td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau"> MATCH/SIMILAR CUSTOMER DATA</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr align="center" class="tdjudulhijau"> 
      <td width="5%">NO</td>
      <td width="30%">NAME</td>
      <td width="10%">NPWP NUMBER</td>
      <td width="15%">TYPE</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center">1</td>
      <td align="center"><div align="left" class="style1">
		<a href="javascript:;">CompanyCustomer001</a></div></td>
      <td> 333444555</td>
      <td>ID NPWP</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center">2</td>
      <td align="center"><div align="left"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=0,left=0')">Sumardy</a></div></td>
      <td> 111222333444555</td>
      <td>ID NPWP</td>
    </tr>
    </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau"> NEGATIVE LIST</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr align="center" class="tdjudulhijau"> 
      <td width="5%">NO</td>
      <td width="30%">NAME</td>
      <td width="10%">ID NUMBER</td>
      <td width="15%">TYPE</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center">1</td>
      <td align="center"><div align="left" class="style1">
		<a href="javascript:;">CompanyCustomer001</a></div></td>
      <td> 222555888</td>
      <td>Name</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center">2</td>
      <td align="center"><div align="left"><a href="javascript:;" onClick="MM_openBrWindow('../Inquiries/NegativeListView.htm','Negative','scrollbars=yes,width=900,height=500,left=0,top=0')">Customer 
          Tidak Pernah Bayar</a></div></td>
      <td> 111222333444555</td>
      <td>ID NPWP</td>
    </tr>
    </table>
  	 <table align="center" width="95%">
      <tr> 
      <td class="tdjudulhijau" width="100%">DE MOTOR <font color="red">*)</font> 
      </td>
    </tr>
	</table>

     <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbSavePersonalCustomerSurveyReportDEMotor" imageurl="../Images/ButtonNext.gif" postbackurl="CompanyCustomerAddDetail.aspx" runat="server"></asp:ImageButton>
		<asp:ImageButton  postbackurl="Customer.aspx" id="imbCancelPersonalCustomerSurveyReportDEMotor" imageurl="../Images/ButtonCancel.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
   <table align="center" width="95%">
      <tr> 
      <td class="tdjudulhijau" width="100%">LEASING<font color="red">*)</font> 
      </td>
    </tr>
	</table>
   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbSavePersonalCustomerSurveyReportLeasing" imageurl="../Images/ButtonNext.gif" postbackurl="CompanyCustomerAddDetail.aspx" runat="server"></asp:ImageButton>
		<asp:ImageButton  postbackurl="Customer.aspx" id="imbCancelPersonalCustomerSurveyReportLeasing" imageurl="../Images/ButtonCancel.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
  	
   <table align="center" width="95%">
      <tr> 
      <td class="tdjudulhijau" width="100%">KCM<font color="red">*)</font> 
      </td>
    </tr>
	</table>
   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbSavePersonalCustomerSurveyReportCF" imageurl="../Images/ButtonNext.gif"  postbackurl="CF/CompanyCustomer_Add_KCM.aspx"  runat="server"></asp:ImageButton>
		<asp:ImageButton  postbackurl="Customer.aspx" id="imbCancelPersonalCustomerSurveyReportCF" imageurl="../Images/ButtonCancel.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30"><asp:ImageButton id="imbBackPersonalCustomer" imageurl="../Images/ButtonBack.gif" postbackurl="Customer.aspx" runat="server"></asp:ImageButton></td>
    </tr>
  </table>
  <br>
</div>
</form>
</body>
</html>
