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
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">PREPAYMENT INQUIRY</td>
      <td width="10" class="tdtopibirukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap">Branch</td>
      <td width="38%" class="tdganjil"><select name="select">
          <option selected>Head Office</option>
        </select></td>
      <td width="20%" class="tdgenap">Effective Date</td>
      <td class="tdganjil"><input name="textfield32" type="text" class="inptype" size="15"> 
        <img src="../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"></td>
    </tr>
    <tr> 
      <td class="tdgenap">Search By</td>
      <td class="tdganjil"><select name="select4">
          <option selected>Select One</option>
          <option>Request No</option>
          <option>Agreement No</option>
          <option>Customer Name</option>
        </select> <input name="textfield3" type="text" class="inptype" size="20"></td>
      <td class="tdgenap">Status</td>
      <td class="tdganjil"><select name="select">
          <option selected>All</option>
          <option>Request</option>
          <option>Approve</option>
          <option>Cancel</option>
        </select></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><img src="../../Images/ButtonSearch.gif" width="100" height="20" border="0"> 
        <img src="../../Images/ButtonReset.gif" width="100" height="20" border="0"> 
      </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">PREPAYMENT LISTING</td>
      <td width="10" class="tdtopibirukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr align="center" class="tdjudulbiru"> 
      <td><a href="PrepaymentInquiryList.aspx">REQUEST NO</a></td>
      <td><a href="PrepaymentInquiryList.aspx">AGREEMENT NO</a></td>
      <td><a href="PrepaymentInquiryList.aspx">CUSTOMER NAME</a></td>
      <td><a href="PrepaymentInquiryList.aspx">CURR</a></td>
      <td><a href="PrepaymentInquiryList.aspx">AMOUNT</a></td>
      <td><a href="PrepaymentInquiryList.aspx">EFFECTIVE DATE</a></td>
      <td><a href="PrepaymentInquiryList.aspx">STATUS</a></td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('../../AccMaintenance/AgreementPrepaymentRequestView.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('../../AccMaintenance/AgreementView.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('../../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700')">xxxx50xxxx</a></td>
      <td align="right"><div align="center">xxx</div></td>
      <td align="right">999,999,999.99</td>
      <td align="center">dd/mm/yyyy</td>
      <td align="center">REQ</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('../../AccMaintenance/AgreementPrepaymentRequestView.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('../../AccMaintenance/AgreementView.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('../../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700')">xxxx50xxxx</a></td>
      <td align="right"><div align="center">xxx</div></td>
      <td align="right">999,999,999.99</td>
      <td align="center">dd/mm/yyyy</td>
      <td align="center">APV</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('../../AccMaintenance/AgreementPrepaymentRequestView.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('../../AccMaintenance/AgreementView.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('../../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700')">xxxx50xxxx</a></td>
      <td align="right"><div align="center">xxx</div></td>
      <td align="right">999,999,999.99</td>
      <td align="center">dd/mm/yyyy</td>
      <td align="center">CAN</td>
    </tr>
  </table>
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><img src="../../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../../images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  
  
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="50%" height="30"><img src="../../Images/ButtonPrint.gif" width="100" height="20" border="0"></td>
      <td width="50%" align="right">&nbsp; </td>
    </tr>
  </table>
  
</div>
</body>
</html>
