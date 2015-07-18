<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html xmlns:v="urn:schemas-microsoft-com:vml" xmlns:o="urn:schemas-microsoft-com:office:office">
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head>
<body>
<form runat="server" id="frmContinueCreditRequestProcess">
<div align="center">
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">CONTINUE CREDIT REQUEST</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap"> <div align="left">Agreement No.</div></td>
      <td class="tdganjil"> <a href="javascript:;" onClick="MM_openBrWindow('../AccMaintenance/AgreementView.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td class="tdgenap">Customer Name</td>
      <td class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxxxx50xxxxxxxxxx</a></td>
    </tr>
    <tr> 
      <td width="25%" valign="middle" class="tdgenap"> <div align="left">Address</div></td>
      <td colspan="3" class="tdganjil">xxxxxxxxxxxxxxxxx50xxxxxxxxxxxxxxxxx</td>
    </tr>
  
    <tr> 
      <td class="tdgenap">Installment No</td>
      <td class="tdganjil"> <div align="right">99</div></td>
      <td class="tdgenap">Installment Amount</td>
      <td class="tdganjil"> <div align="right">999,999,999</div></td>
    </tr>
    <tr> 
      <td class="tdgenap">Due Date</td>
      <td width="25%" class="tdganjil">dd/mm/yyyy</td>
      <td width="25%" class="tdgenap">Overdue Days</td>
      <td width="25%" class="tdganjil"> <div align="right">99</div></td>
    </tr>
    
      </table>
    <br>
    <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">OS AMOUNT OVER DUE AS OF DD/MM/YYYY</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>

     <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap">Installment Due</td>
      <td class="tdganjil"> <div align="right">999,999,999</div></td>
      <td class="tdgenap">Insurance Premium Due</td>
      <td class="tdganjil"> <div align="right">999,999,999</div></td>
    </tr>
    <tr> 
      <td class="tdgenap">Install. Late Charges</td>
      <td class="tdganjil"> <div align="right">999,999,999</div></td>
      <td class="tdgenap">Insurance Late Charges</td>
      <td class="tdganjil"><div align="right">999,999,999</div></td>
    </tr>
    <tr> 
      <td class="tdgenap">Reposession Fee</td>
      <td class="tdganjil"> <div align="right">999,999,999</div></td>
      <td class="tdgenap">PDC Bounce Fee</td>
      <td class="tdganjil">&nbsp;</td>
    </tr>
    <tr>
    	<td class="tdgenap">Reason</td>
      	<td class="tdganjil"> <select name="select2">
          <option selected>Select One</option>
          <option>Sudah ada dana</option>
        </select></td>
      <td class="tdgenap">Approve By</td>
      <td colspan="3" class="tdganjil"> <select name="select">
          <option selected>select one</option>
          <option>User1</option>
          <option>User2</option>
        </select>
        *) </td>
    </tr>
     <tr>
    	<td class="tdgenap">Alternate User</td>
      	<td class="tdganjil" colspan="3"> <select name="select2">
          <option selected>Select One</option>
          <option>Sudah ada dana</option>
        </select></td>
     
    </tr>

    <tr>
    	<td class="tdgenap">Approval Recomendation</td>
      	<td class="tdganjil" colspan="3"> 
      	<asp:TextBox runat="server" id="txtboxApproval" TextMode="MultiLine" Width="100%" CssClass="inptype"></asp:TextBox>
      	</td>
     
    </tr>

    </table>
    <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
      <a href="ContinueCreditRequest.aspx">
		<img src="../../../Images/ButtonSave.gif" width="100" height="20" border="0"></a> 

		<a href="ContinueCreditRequest.aspx">
		<img src="../../../Images/ButtonCancel.gif" width="100" height="20" border="0"></a> 
      </td>
    </tr>
  </table>
    
</div>
</form>
</body>
</html>
