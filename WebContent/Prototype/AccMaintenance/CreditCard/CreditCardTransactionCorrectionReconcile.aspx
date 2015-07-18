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
<form id="frmCustomerComplain" runat="server">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopibiru"> 
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">CREDIT CARD RECONCILE</td>
      <td width="10" class="tdtopibirukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
   <tr> 
      <td width="20%" class="tdgenap">Agreement No</td>
      <td class="tdganjil">Agreement 00001
        <font color="red">*)</font> </td>
    </tr>

     <tr> 
      <td width="20%" class="tdgenap">Name</td>
      <td class="tdganjil"> Customer AdIns 000001
        <font color="red">*)</font> </td>
    </tr>
     <table align="center" width="95%" class="tablegrid">
    <tr>
    	<td class="tdgenap" width="20%">Credit Card Number</td>
	   	<td class="tdganjil" width="30%"><asp:Label ID="lblCreditCardNumber" runat="server">1234123412341234</asp:Label ></td>
    	<td class="tdgenap" width="20%">Card Holder Name</td>
	   	<td class="tdganjil" width="30%"><asp:Label ID="lblCreditCardHolderName" runat="server">Customer AdIns 000001</asp:Label ></td>
    </tr>
    <tr>
     	<td class="tdgenap" width="20%">Bank Issued Name</td>
	   	<td class="tdganjil" width="30%"><asp:Label ID="lblCreditCardBankIssued" runat="server">BCA</asp:Label></td>
    	<td class="tdgenap" width="20%">Card Type</td>
	   	<td class="tdganjil" width="30%"><asp:Label ID="lblCreditCardCardType" runat="server">Master</asp:Label>
		</td>
		</tr>
		<tr>
		<td class="tdgenap" width="20%">Approval Code</td>
	   	<td class="tdganjil" width="30%" colspan="3"><asp:Label ID="txtCreditCardApprovalCode" runat="server">1234sx</asp:Label >
		</td>
		
	</tr>
	 <tr>
     	<td class="tdgenap" width="20%">Amount Reconcile</td>
	   	<td class="tdganjil" width="30%" colspan="3"><asp:Label ID="txtAmountClearing" runat="server">999,999,999,999.99</asp:Label ></td>
		</tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
      <asp:ImageButton imageurl="../../Images/ButtonSave.gif" runat="server" ID="btnSaveCustomerComplain" PostBackUrl="CreditCardTransactionList.aspx"></asp:ImageButton>
       <asp:ImageButton imageurl="../../Images/ButtonCancel.gif" runat="server" ID="btnCancelCustomerComplain" PostBackUrl="CreditCardTransactionList.aspx"></asp:ImageButton>
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
