<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
<style type="text/css">
.style1 {
	text-align: left;
}
</style>
</head>
<body>
<form id="form1" runat="server">
<div align="center" class="style1">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijau2kiri">&nbsp;</td>
      <td align="center" class="tdtopihijau2">REVERSE PROSPECT FUNDING</td>
      <td width="10" class="tdtopihijau2kanan">&nbsp;</td>
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
      <td class="tdgenap" style="width: 20%">Contract Status</td>
      <td class="tdganjil" style="width: 30%">CAN</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Approval Date</td>
      <td class="tdganjil" style="width: 30%">
			dd-mm-yyyy</td>
      <td class="tdgenap" style="width: 20%">&nbsp;</td>
      <td class="tdganjil" style="width: 30%" align="right">&nbsp;</td>
    </tr>
    <tr> 
      <td class="tdjudulhijau2" colspan="4">REQUEST DETAIL</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Request Branch</td>
      <td class="tdganjil" colspan="3">
			xxxxx20xxxxx</td>
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
          <td class="tdgenap" style="width: 20%">Request Transfer To</td>
          <td class="tdganjil" style="width: 30%" >
			Account Branch 1</td>
          <td class="tdgenap" style="width: 20%">Total Amount Requested</td>
          <td class="tdganjil" style="width: 30%" align="right">
		999,999,999,999.99</td>
        </tr>
	<tr>
          <td class="tdgenap" style="width: 20%">Description</td>
          <td class="tdganjil" colspan="3">
			Transfer to Account Branch 1</td>
        	</tr>
	<tr>
      <td class="tdjudulhijau2" colspan="4">TRANSFER DETAIL </td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 20%">Transfer No</td>
      <td class="tdganjil" style="width: 30%">
          xxxxx20xxxxx</td>
      <td class="tdgenap">
          	Amount Transfer</td>
      <td class="tdganjil" align="right">
          999,999,999,999.99</td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 20%">Reference No</td>
      <td class="tdganjil" style="width: 30%">
          xxxxx20xxxxx</td>
      <td class="tdgenap" style="width: 20%"> Value Date</td>
      <td width="25%" class="tdganjil"> 
          dd-mm-yyyy</td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 20%">Bank Account From</td>
      <td class="tdganjil">
          	Account HO 1</td>
      <td class="tdgenap">Bank Account To</td>
      <td class="tdganjil">
          	Account Branch 1</td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 20%">Bilyet Giro No</td>
      <td class="tdganjil">
       	xxxxx20xxxxx</td>
      <td class="tdgenap">
          	Due Date</td>
      <td class="tdganjil">
          dd-mm-yyyy</td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 20%">Notes</td>
      <td class="tdganjil" colspan="3">
          Notes Transfer for Funding</td>
    </tr>
	<tr>
      <td class="tdjudulhijau2" colspan="4">REVERSAL DETAIL</td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 20%">Amount Reverse</td>
      <td class="tdganjil" colspan="3" align="right"><strong>
		999,999,999,999.99</strong></td>
    </tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="imbSave" ImageUrl="../images/buttonSave.gif" PostBackUrl="RequestForFundingReversal.aspx" />
		<asp:ImageButton runat="server" id="imbCancel" ImageUrl="../images/buttonCancel.gif" PostBackUrl="RequestForFundingReversal.aspx" /> 
      </td>
    </tr>
  </table>
  
</div>

</form>
</body>
</html>
