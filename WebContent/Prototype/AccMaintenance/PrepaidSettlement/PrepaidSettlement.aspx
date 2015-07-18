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
<form id="frmPaymentReceive" runat="server">

<div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">PREPAID SETTLEMENT</td>
      <td width="10" class="tdtopibirukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td  width="20%" class="tdgenap">Agreement Branch</td>
      <td  class="tdganjil">xxxxxxxxxxxxx</td>
      <td width="20%" class="tdgenap">Currency Name</td>
      <td class="tdganjil">Rupiah</td>
    </tr>
    <tr> 
      <td class="tdgenap">Agreement No.</td>
      <td class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../AccMaintenance/AgreementView.htm','Agreement','scrollbars=yes,width=900,height=700')">xxxx20xxxx</a></td>
      <td class="tdgenap">Customer Name</td>
      <td class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700')">xxxxxxxxxxxxxxxxxxxx</a></td>
    </tr>
    <tr> 
      <td class="tdgenap">Installment Amount</td>
      <td class="tdganjil"><div align="right">999,999,999.99</div></td>
      <td class="tdgenap">Next Installment Due</td>
      <td class="tdganjil">dd/mm/yyyy | Installment 99</td>
    </tr>
    <tr> 
      <td class="tdgenap">Total Amount to be Paid</td>
      <td class="tdganjil"><div align="right"><strong>999,999,999.99</strong></div></td>
      <td class="tdgenap">Prepaid Balance</td>
      <td class="tdganjil"><div align="right">999,999,999.99</div></td>
    </tr>
   
    </table>
   
	  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td colspan="4" class="tdjudulbiru">PAYMENT DETAIL</td>
    </tr>
    </table>
	  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
   
    <tr> 
    
      <td class="tdgenap"  width="20%">Value Date</td>
      <td class="tdganjil"><input name="textfield322" type="text" class="inptype" value="dd/mm/yyyy" size="15"> 
        <img src="../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle">
        <asp:ImageButton ID="imbCalcValueDate" runat="server" ImageUrl="../../Images/ButtonCalculate.gif"></asp:ImageButton>
        </td>
          
    </tr>
    <tr> 
      <td valign="top" class="tdgenap">Notes</td>
      <td colspan="3" class="tdganjil"><textarea name="textfield324" cols="80" class="inptype"></textarea></td>
    </tr>
    </table>
  <br>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">OS AMOUNT OVER DUE AS OF 99/99/9999</td>
      <td width="10" class="tdtopibirukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Installment Due</td>
      <td width="25%" class="tdganjil"><div align="right">999,999,999.99</div></td>
      <td width="25%" class="tdgenap">Insurance Premium Due</td>
      <td width="25%" class="tdganjil"><div align="right">999,999,999.99</div></td>
    </tr>
    <tr> 
      <td class="tdgenap">Installment Late Charges</td>
      <td class="tdganjil"><div align="right">999,999,999.99</div></td>
      <td class="tdgenap">Insurance Late Charges</td>
      <td class="tdganjil"><div align="right">999,999,999.99</div></td>
    </tr>
    <tr> 
      <td class="tdgenap">Repossession Fee</td>
      <td class="tdganjil"><div align="right">999,999,999.99</div></td>
      <td class="tdgenap">PDC Bounce Fee</td>
      <td class="tdganjil"><div align="right">999,999,999.99</div></td>
    </tr>
    <tr> 
      <td class="tdgenap">&nbsp;</td>
      <td class="tdganjil">&nbsp;</td>
      <td class="style1"><strong>Total OS Over Due</strong></td>
      <td class="tdganjil"><div align="right"><strong>999,999,999.99</strong></div></td>
    </tr>
  </table>

  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
      <asp:HyperLink ID="imbSave" runat="server" ImageUrl="../../Images/ButtonSave.gif" ></asp:HyperLink>
      <asp:HyperLink ID="imbCancel" runat="server" ImageUrl="../../Images/ButtonCancel.gif"></asp:HyperLink>
		</td>
    </tr>
  </table>

  <br>

</div>
</form>
</body>
</html>
