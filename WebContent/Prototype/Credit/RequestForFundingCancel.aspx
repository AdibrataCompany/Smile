<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html xmlns:v="urn:schemas-microsoft-com:vml" xmlns:o="urn:schemas-microsoft-com:office:office">
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
<form id="form1" runat="server">
<div align="center">  
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">REQUEST FOR PROSPECT FUNDING - CANCEL</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" style="width: 20%">Application ID</td>
      <td class="tdganjil" style="width: 30%"><a href="../Credit/ViewApplication.htm" target="_blank">
			xxxxx20xxxxx</a></td>
      <td class="tdgenap" style="width: 20%">Agreement No</td>
      <td class="tdganjil" style="width: 30%"><a href="../Credit/ViewAgreement.htm" target="_blank">
			xxxxx20xxxxx</a></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Customer Name</td>
      <td class="tdganjil" style="width: 30%"><a href="../Credit/ViewPersonalCustomer.htm" target="_blank">
			xxxxxxxxxx50xxxxxxxxxx</a></td>
      <td class="tdgenap" style="width: 20%">Product</td>
      <td class="tdganjil" style="width: 30%">xxxxxxxxxxx50xxxxxxxxxxx</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Product Type</td>
      <td class="tdganjil" style="width: 30%">
			DE Mobil</td>
      <td class="tdgenap" style="width: 20%">Application Step</td>
      <td class="tdganjil" style="width: 30%">POP</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Approval Date</td>
      <td class="tdganjil" style="width: 30%">
			dd-mm-yyyy</td>
      <td class="tdgenap" style="width: 20%">&nbsp;</td>
      <td class="tdganjil" style="width: 30%" align="right">&nbsp;</td>
    </tr>
    <tr> 
      <td class="tdjudulhijau" colspan="4">REQUEST DETAIL</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Request Date</td>
      <td class="tdganjil" style="width: 30%">
			dd-mm-yyyy</td>
      <td class="tdgenap" style="width: 20%">AP Amount</td>
      <td class="tdganjil" style="width: 30%" align="right">999,999,999,999.99</td>
    </tr>
    <tr>
          <td class="tdgenap" style="width: 20%">Currency</td>
          <td class="tdganjil" style="width: 30%">
			IDR</td>
          <td class="tdgenap" style="width: 20%">Commission Amount</td>
          <td class="tdganjil" style="width: 30%" align="right">
		999,999.99</td>
        </tr>
    <tr>
          <td class="tdgenap" style="width: 20%">Outstanding Account</td>
          <td class="tdganjil" style="width: 30%" align="right">
			999,999,999.99</td>
          <td class="tdgenap" style="width: 20%">Total Amount Requested</td>
          <td class="tdganjil" style="width: 30%" align="right">
		999,999,999,999.99</td>
        </tr>
	<tr>
          <td class="tdgenap" style="width: 20%">Request Transfer To</td>
          <td class="tdganjil" colspan="3">
			Account Branch 1</td>
        	</tr>
	<tr>
          <td class="tdgenap" style="width: 20%">Description</td>
          <td class="tdganjil" colspan="3">
			Request for Customer ABC</td>
        	</tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="imbSave" ImageUrl="../images/buttonSave.gif" PostBackUrl="RequestForFunding.aspx" />
		<asp:ImageButton runat="server" id="imbCancel" ImageUrl="../images/buttonCancel.gif" PostBackUrl="RequestForFunding.aspx" /> 
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
