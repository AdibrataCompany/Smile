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
<style type="text/css">
.style4 {
	background-color: #E6F1FF;
	font-weight: bold;
	font-size: 10px;
	text-align: right;
}
</style>
</head>
<body>
<form id="frmPaymentReceive" runat="server">

<div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">PREPAYMENT WITHOUT RRD REQUEST</td>
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
      <tr> 
      <td valign="top" class="tdgenap">Currency ID</td>
      <td colspan="3" class="tdganjil">IDR</td>
    </tr>

    </table>
  <br>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td colspan="4" class="tdjudulbiru">PREPAYMENT WITHOUT RRD REQUEST</td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Reason</td>
      <td width="25%" class="tdganjil"><asp:Label ID="lblReason" runat="server" Text="Lunas"></asp:Label>
      </td>
      <td width="25%" class="tdgenap">Approved by</td>
      <td width="25%" class="tdganjil"><asp:Label ID="lblApprovedBy" runat="server" Text="User1"></asp:Label>	</td>
    </tr>
    <tr> 
      <td class="tdgenap">Alternate User</td>
      <td colspan="3" class="tdganjil"><asp:Label ID="lblAlternateApprovedBy" runat="server"></asp:Label></td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap">Approval Recommendation</td>
      <td colspan="3" class="tdganjil"><asp:Label ID="lblApprovalRecomendation" runat="server"></asp:Label></td>
    </tr>
    <tr> 
      <td valign="top" class="style4" colspan="4"><strong>Total Amount To be Paid: 
		99,999,999,00</strong></td>
    </tr>
    <tr> 
      <td valign="top" class="style4" colspan="4"><strong>Prepaid Amount: 
		99,999,999,00</strong></td>
    </tr>
       <tr> 
      <td valign="top" class="style4" colspan="4" style="height: 11px"><strong>
		Balance: 
		99,999,999,00</strong></td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">
      <asp:HyperLink ID="imbSave0" runat="server" ImageUrl="../../Images/ButtonBack.gif"  NavigateUrl="PrepaymentWithoutRRDExecutionList.aspx"></asp:HyperLink>
      </td>
      <td width="50%" align="right">
      <asp:HyperLink ID="imbSave" runat="server" ImageUrl="../../Images/ButtonExecution.gif"  NavigateUrl="PrepaymentWithoutRRDExecutionList.aspx"></asp:HyperLink>
      <asp:HyperLink ID="imbCancel" runat="server" ImageUrl="../../Images/ButtonCancel.gif"  NavigateUrl="PrepaymentWithoutRRDExecutionList.aspx"></asp:HyperLink>
		</td>
    </tr>
  </table>

  <br>

</div>
</form>
</body>
</html>
