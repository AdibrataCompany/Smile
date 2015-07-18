<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>PRODUCT - VIEW</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<script language="JavaScript" type="text/JavaScript">

function myClose() {
    close();}

</script >

<style type="text/css">
.style1 {
	background-color: #F4FAFF;
	text-align: left;
}
.style2 {
	background-color: #F4F4DF;
	font-weight: bold;
	font-size: 10px;
	text-align: left;
}
.style3 {
	background-color: #FFFFFF;
	text-align: left;
}
.style4 {
	color: #0066CC;
}
</style>
</head>

<body>
<form id="FrmProductView" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">PRODUCT - VIEW</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="40%" class="style1">Product ID</td>
          <td class="style3"> CFMOHND001</td>
        </tr>
        <tr> 
          <td class="style1">Description</td>
          <td class="style3">PRODUCT CONSUMER FINANCE NEW HONDA</td>
        </tr>
        <tr> 
          <td colspan="2" class="style2">GENERAL</td>
        </tr>
        <tr> 
          <td class="style1">Currency</td>
          <td class="style3">IDR</td>
        </tr>
        <tr> 
          <td class="style1">Asset Type</td>
          <td class="style3">MOTORCYCLE</td>
        </tr>
        <tr> 
          <td class="style1">Credit Investigation Scheme</td>
          <td class="style3">CI Employee</td>
        </tr>
        <tr> 
          <td class="style1">Score Scheme Marketing</td>
          <td class="style3">Scoring Honda Supra</td>
        </tr>
        <tr> 
          <td class="style1">Score Scheme Credit</td>
          <td class="style3">Scoring Honda Supra</td>
        </tr>
        <tr> 
          <td class="style1">Journal Scheme</td>
          <td class="style3">Scheme 1</td>
        </tr>
        <tr>
          <td class="style1">Application Type</td>
          <td class="style3">Non Group</td>
        </tr>
        <tr> 
          <td class="style1">Finance Type</td>
          <td class="style3">Consumer Finance</td>
        </tr>
        <tr> 
          <td class="style1">Lease Back Type</td>
          <td class="style3">Direct Financing</td>
        </tr>
        <tr> 
          <td class="style1">Floor Financing</td>
          <td class="style3">No</td>
        </tr>
        <tr>
          <td class="style1">New / Used&nbsp; Type</td>
          <td class="style3">New</td>
        </tr>
		<tr>
          <td class="style1">Vehicle Type</td>
          <td class="style3">Public</td>
        </tr>
		<tr>
          <td class="style1">Conventional Type</td>
          <td class="style3">Syariah</td>
        </tr>
		<tr>
          <td class="style1">Payment Frequency</td>
          <td class="style3">Quarterly</td>
        </tr>
		<tr>
          <td class="style1">Installment Scheme</td>
          <td class="style3">Regular Fixed Installment</td>
        </tr>
		<tr>
          <td class="style1">Interest Type</td>
          <td class="style3">Fixed Rate</td>
        </tr>
        <tr> 
          <td class="style1">Effective Rate Type</td>
          <td class="style3">Standard Rate</td>
        </tr>
        <tr> 
          <td colspan="2" class="style2">LATE&nbsp; CHARGES</td>
        </tr>
        <tr>
          <td class="style1">Late Charges Percentage (Installment)</td>
          <td class="style3">5.000000 &nbsp;&#8240; / day Default</td>
        </tr>
		<tr>
          <td class="style1">Late Charges Percentage (Insurance)</td>
          <td class="style3">5.000000 &nbsp;&#8240; / day Default</td>
        </tr>
		<tr>
          <td class="style1">Grace Period Late Charges</td>
          <td class="style3">2 days Default</td>
        </tr>
		<tr>
          <td class="style1">Late Charges Calculation Method </td>
          <td class="style3">Calendar Day / Working Day</td>
        </tr>
        <tr>
          <td colspan="2" class="style2">FEES</td>
        </tr>
        <tr> 
          <td class="style1">Cancellation Fee</td>
          <td class="style3">50,000 Default</td>
        </tr>
        <tr> 
          <td class="style1">Provision Fee</td>
          <td class="style3">1.00 % Default</td>
        </tr>
        <tr> 
          <td class="style1">Notary Fee</td>
          <td class="style3">0.10 % Default</td>
        </tr>
		<tr>
          <td class="style1">Visit Fee</td>
          <td class="style3">0 Default</td>
        </tr>
        <tr> 
          <td class="style1">Rescheduling Fee</td>
          <td class="style3">0 Default</td>
        </tr>
        <tr> 
          <td class="style1">Change Due Date Rescheduling Fee</td>
          <td class="style3">0 Default</td>
        </tr>
        <tr> 
          <td class="style1">Asset Replacement Fee</td>
          <td class="style3">0 Default</td>
        </tr>
        <tr> 
          <td class="style1">Repossess Fee</td>
          <td class="style3">0 Default</td>
        </tr>
        <tr> 
          <td class="style1">Legalized Document Fee</td>
          <td class="style3">0 Default</td>
        </tr>
        <tr> 
          <td class="style1">PDC Bounce Fee</td>
          <td class="style3">5,000.00 Default</td>
        </tr>
        <tr> 
          <td colspan="2" class="style2">CREDIT PROCESS</td>
        </tr>
        <tr>
          <td class="style1">Maximum Coverage Area</td>
          <td class="style3">50 kms Default</td>
        </tr>
        <tr> 
          <td class="style1">PO Expiration Days</td>
          <td class="style3">15 days Locked</td>
        </tr>
        <tr> 
          <td class="style1">Installment Tolerance Amount</td>
          <td class="style3">5,000.00 Default</td>
        </tr>
        <tr> 
          <td class="style1">Maximum % from Interest Upping to Supplier</td>
          <td class="style3">0.00 % Maximum</td>
        </tr>
        <tr>
          <td colspan="2" class="style2">ACCOUNT MAINTENANCE</td>
        </tr>
		<tr>
          <td class="style1">Prepayment Penalty rate</td>
          <td class="style3">3.000000 % Default</td>
        </tr>
		<tr>
          <td class="style1">PDC Day To Remind</td>
          <td class="style3">30 Default</td>
        </tr>
		<tr>
          <td colspan="2" class="style2">ASSET DOCUMENT</td>
        </tr>
		<tr>
          <td class="style1">Length Main Document Processed</td>
          <td class="style3">90 days Default</td>
        </tr>
		<tr>
          <td class="style1">Length Main Document Taken</td>
          <td class="style3">15 days Default</td>
        </tr>
		<tr>
          <td colspan="2" class="style2">FINANCE </td>
        </tr>
		<tr>
          <td class="style1">Limit A/P Disbursement at Branch</td>
          <td class="style3">0 Default</td>
        </tr>
        <tr> 
          <td colspan="2" class="style2">COLLECTION</td>
        </tr>
        <tr> 
          <td class="style1">Create SP Automatically</td>
          <td class="style3">Yes, Default, Length SP Process 7 days </td>
        </tr>
        <tr> 
          <td class="style1">Create SP 1 Automatically</td>
          <td class="style3">Yes, Default, Length SP Process 14 days </td>
        </tr>
        <tr> 
          <td class="style1">Create SP 2 Automatically</td>
          <td class="style3">Yes, Default, Length SP Process 21 days </td>
        </tr>
        <tr>
          <td class="style1">Previous Overdue To Remind</td>
          <td class="style3">3 days&nbsp; Default </td>
        </tr>
        <tr> 
          <td class="style1">Days To Remind Installment</td>
          <td class="style3">0 days Default</td>
        </tr>
        <tr>
          <td class="style1">Days to remind by SMS</td>
          <td class="style3">3 days Default</td>
        </tr>
        <tr> 
          <td class="style1">Days Overdue To Assign To Desk Coll</td>
          <td class="style3">3 days Default</td>
        </tr>
        <tr> 
          <td class="style1">Days Overdue To Assign To Field Coll (DCR)</td>
          <td class="style3">7 days Default</td>
        </tr>
        <tr> 
          <td class="style1">Days Overdue To Generate RAL</td>
          <td class="style3">28 days Default</td>
        </tr>
        <tr> 
          <td class="style1">RAL Period</td>
          <td class="style3">14 days Default</td>
        </tr>
        <tr>
          <td class="style1">Maximum RAL Period</td>
          <td class="style3">21 days Default</td>
        </tr>
        <tr> 
          <td class="style1">Maximum Promise To Pay days</td>
          <td class="style3">31 days Default</td>
        </tr>
        <tr> 
          <td class="style1">Promise To Pay To Bank</td>
          <td class="style3">31 days Default</td>
        </tr>
        <tr> 
          <td class="style1">Promise To Pay To Company</td>
          <td class="style3">31 days Default</td>
        </tr>
        <tr> 
          <td class="style1">Promise To Pay To Supplier</td>
          <td class="style3"> 31 days Default</td>
        </tr>
        <tr> 
          <td class="style1">Inventory Expected</td>
          <td class="style3">14 days Default</td>
        </tr>
        <tr> 
          <td class="style1">Broken Promise Days</td>
          <td class="style3">2 days Default</td>
        </tr>
        <tr>
          <td colspan="2" class="style2">OTHER</td>
        	</tr>
        <tr> 
          <td class="style1">Active</td>
          <td class="style3">Yes</td>
        </tr>
      </table>
    </div>
  </div>
	<p><font face="Arial, Helvetica, sans-serif">| <a href="ProductDetailView.aspx" target="_self">
	Product Detail</a> | <a href="ViewProductApprovalScheme.aspx" target="_self">
	Product Approval Scheme</a> | <a href="ViewProductPaymentHierarchy.aspx" target="_self">
	Product Payment Hierarchy</a> |</font></p>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnClose" ImageUrl="../../images/ButtonClose.gif" onclientclick="myClose();"/></td>
    </tr>
    </table>
</div>
</form>
</body>
</html>
