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
      <td class="tdganjil">Customer001</td>
    </tr>
    <tr> 
      <td class="tdgenap">ID Type</td>
      <td class="tdganjil">KTP</td>
    </tr>
    <tr> 
      <td class="tdgenap">ID Number</td>
      <td class="tdganjil"> 111222333444555</td>
    </tr>
    <tr> 
      <td class="tdgenap">Birth Date</td>
      <td class="tdganjil">20/04/1980</td>
    </tr>
    <tr>
      <td class="tdgenap">Personal NPWP</td>
      <td class="tdganjil">33344445556666</td>
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
      <td width="10%">ID TYPE</td>
      <td width="10%">ID NUMBER</td>
      <td width="10%">BIRTH DATE</td>
      <td width="15%">MOTHER MAIDEN NAME</td>
      <td width="15%">TYPE</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center">1</td>
      <td align="center"><div align="left" class="style1">
		<a href="javascript:;">Henry</a></div></td>
      <td> KTP</td>
      <td> 333444555</td>
      <td align="center">01/01/1990</td>
      <td>Mama</td>
      <td>Name + Mother Maiden Name</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center">2</td>
      <td align="center"><div align="left"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=0,left=0')">Sumardy</a></div></td>
      <td> KTP</td>
      <td> 111222333444555</td>
      <td align="center">10/05/1982</td>
      <td>Mama</td>
      <td>ID Number</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center">3</td>
      <td align="center"><div align="left"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=0,left=0')">Cahyo 
          Nugroho </a></div></td>
      <td> KTP</td>
      <td> 666444777888</td>
      <td align="center">20/04/1980</td>
      <td>Mama</td>
      <td>Birth Date + Mother Maiden Name</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center">4</td>
      <td align="center"><div align="left"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=0,left=0')">Ratna</a></div></td>
      <td> KTP</td>
      <td>666111222555</td>
      <td align="center">20/04/1980</td>
      <td>Mama</td>
      <td>Name + Birth Date</td>
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
      <td width="10%">ID TYPE</td>
      <td width="10%">ID NUMBER</td>
      <td width="10%">BIRTH DATE</td>
      <td width="15%">TYPE</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center">1</td>
      <td align="center"><div align="left" class="style1">
		<a href="javascript:;">Henry</a></div></td>
      <td> KTP</td>
      <td> 222555888</td>
      <td align="center">06/08/1970</td>
      <td>Name</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center">2</td>
      <td align="center"><div align="left"><a href="javascript:;" onClick="MM_openBrWindow('../Inquiries/NegativeListView.htm','Negative','scrollbars=yes,width=900,height=500,left=0,top=0')">Customer 
          Tidak Pernah Bayar</a></div></td>
      <td> KTP</td>
      <td> 111222333444555</td>
      <td align="center">04/07/1960</td>
      <td>ID Number</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center">3</td>
      <td align="center"><div align="left"><a href="javascript:;" onClick="MM_openBrWindow('../Inquiries/NegativeListView.htm','Negative','scrollbars=yes,width=900,height=500,left=0,top=0')">Customer 
          Korupsi </a></div></td>
      <td> KTP</td>
      <td> 111444777</td>
      <td align="center">20/04/1980</td>
      <td>Birth Date</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center">4</td>
      <td align="center"><div align="left">Henry</div></td>
      <td> KTP</td>
      <td> 333666999</td>
      <td align="center">20/04/1980</td>
      <td>Name + Birth Date</td>
    </tr>
  </table>  
   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30"><asp:ImageButton id="imbBackPersonalCustomer" imageurl="../Images/ButtonBack.gif" postbackurl="ZumaCustomer.aspx" runat="server"></asp:ImageButton></td>
      <td width="50%" align="right">
		<asp:ImageButton id="imbSavePersonalCustomerSurveyReportCF" imageurl="../Images/ButtonNext.gif" postbackurl="ZumaPersonalCustomer_Add_KCM.aspx" runat="server"></asp:ImageButton>
		<asp:ImageButton  postbackurl="ZumaCustomer.aspx" id="imbCancelPersonalCustomerSurveyReportCF" imageurl="../Images/ButtonCancel.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
    </tr>
  </table>
  <br>
</div>
</form>
</body>
</html>
