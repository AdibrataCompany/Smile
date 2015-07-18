<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>PRODUCT BRANCH - EDIT</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
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
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmProductBranchByBranchEdit" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">PRODUCT BRANCH - VIEW</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>

  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style1" style="width: 36%"> Branch</td>
      <td class="style3" colspan="2">xxxxxxxxxx50xxxxxxxxxx
      </td>
    </tr>
    <tr> 
      <td class="style1"> Product ID</td>
      <td class="style3" colspan="2"><a href="ProductView.aspx" target="_blank">CFMOHND001</a></td>
    </tr>
    <tr> 
      <td class="style1" style="width: 36%"> Description </td>
      <td class="style3" colspan="2"><p class="style4">PRODUCT CONSUMER FINANCE NEW HONDA</p></td>
    </tr>
    <tr> 
      <td colspan="3" class="style2">GENERAL</td>
    </tr>
    <tr>
          <td class="style1" style="height: 21px">Currency</td>
          <td class="style3" colspan="2">IDR</td>
        </tr>
	<tr>
          <td class="style1">Asset Type</td>
          <td class="style3" colspan="2">MOTORCYCLE</td>
        </tr>
	<tr>
          <td class="style1">Credit Investigation Scheme</td>
          <td class="style3" colspan="2">CI Employee</td>
        </tr>
	<tr>
          <td class="style1" style="height: 19px">Score Scheme Marketing</td>
          <td class="style3" colspan="2" style="height: 19px">Scoring Honda Supra</td>
        </tr>
	<tr>
          <td class="style1">Score Scheme Credit</td>
          <td class="style3" colspan="2">Scoring Honda Supra</td>
        </tr>
	<tr>
          <td class="style1">Journal Scheme</td>
          <td class="style3" colspan="2">Scheme 1</td>
        </tr>
	<tr>
          <td class="style1" style="height: 8px">Application Type</td>
          <td class="style3" colspan="2" style="height: 8px">Non Group</td>
        </tr>
	<tr>
          <td class="style1">Finance Type</td>
          <td class="style3" colspan="2">Consumer Finance</td>
        </tr>
	<tr>
          <td class="style1">Lease Back Type</td>
          <td class="style3" colspan="2">Direct Financing</td>
        </tr>
	<tr>
          <td class="style1">Floor Financing</td>
          <td class="style3" colspan="2">No</td>
        </tr>
	<tr>
          <td class="style1">New / Used&nbsp; Type</td>
          <td class="style3" colspan="2">New</td>
        </tr>
	<tr>
          <td class="style1">Vehicle Type</td>
          <td class="style3" colspan="2">Public</td>
        </tr>
	<tr>
          <td class="style1">Conventional Type</td>
          <td class="style3" colspan="2">Syariah</td>
        </tr>
		<tr>
          <td class="style1">Payment Frequency</td>
          <td class="style3" colspan="2">Quarterly</td>
        </tr>
	<tr>
          <td class="style1">Installment Scheme</td>
          <td class="style3" colspan="2">Regular Fixed Installment</td>
        </tr>
	<tr>
          <td class="style1">Interest Type</td>
          <td class="style3" colspan="2">Fixed Rate</td>
        </tr>
	<tr>
          <td class="style1">Effective Rate Type</td>
          <td class="style3" colspan="2">Standard Rate</td>
        </tr>
    <tr>
      <td class="style2"> LATE CHARGES</td>
      <td class="style2" width="30%"> From HO</td>
      <td class="style2"> Branch</td>
    	</tr>
		<tr>
      <td class="style1" style="width: 36%"> Late Charges Percentage (Installment)</td>
      <td class="style3">5.000000 &#8240; / day Default </td>
      <td class="style3">
			6.000000&nbsp;&#8240; / day&nbsp;Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Late Charges Percentage (Insurance)</td>
      <td class="style3"> 5.000000 &#8240; / day Default</td>
      <td class="style3"> 
			3.000000&nbsp;&#8240; / day&nbsp;Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Grace Period Late Charges</td>
      <td class="style3">2 days Default</td>
      <td class="style3">
			2&nbsp;days&nbsp; Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Late Charges Calculation Method</td>
      <td class="style3" colspan="2"> 
			<asp:DropDownList runat="server" id="CmbLateChargesCalcMethod" CssClass="inptype" Enabled="False">
				<asp:ListItem>Calendar Day</asp:ListItem>
				<asp:ListItem>Working Calendar</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
    <tr> 
      <td class="style2"> FEES</td>
      <td class="style2" width="30%"> From HO</td>
      <td class="style2"> Branch</td>
    </tr>
    <tr>
      <td class="style1" style="width: 36%"> Cancellation Fee</td>
      <td class="style3">50,000&nbsp; Default</td>
      <td class="style3">
			55,000&nbsp; Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Provision Fee</td>
      <td class="style3">1.00 % Default</td>
      <td class="style3" style="height: 9px">
			1.00 % Default</td>
      </tr>
	<tr>
      <td class="style1" style="width: 36%"> Notary Fee</td>
      <td class="style3">0.10 % Default</td>
      <td class="style3">
			0.10 % Default</td>
      </tr>
	<tr>
      <td class="style1" style="width: 36%"> Survey Fee</td>
      <td class="style3">0 Default</td>
      <td class="style3">0 Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Visit Fee</td>
      <td class="style3">0 Default</td>
      <td class="style3">0 Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Rescheduling Fee</td>
      <td class="style3">0 Default</td>
      <td class="style3">0 Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Change Due Date Rescheduling Fee</td>
      <td class="style3">0 Default</td>
      <td class="style3">0 Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Asset Replacement Fee</td>
      <td class="style3">0 Default</td>
      <td class="style3">0 Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Repossess Fee</td>
      <td class="style3">0 Default</td>
      <td class="style3">0 Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Legalized Document Fee</td>
      <td class="style3">0 Default</td>
      <td class="style3">0 Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> PDC Bounce Fee</td>
      <td class="style3">5,000 Default</td>
      <td class="style3">
			6,000 Default</td>
    </tr>
	<tr>
      <td class="style2"> CREDIT PROCESS</td>
      <td class="style2" width="30%"> From HO</td>
      <td class="style2"> Branch</td>
    	</tr>
	<tr>
          <td class="style1">Maximum Coverage Area</td>
          <td class="style3" style="width: 25%">
			50 kms Default</td>
          <td class="style3">
			60&nbsp;kms Default</td>
        </tr>
	<tr>
      <td class="style1" style="width: 36%"> PO Expiration Days</td>
      <td class="style3">15 days Locked</td>
      <td class="style3">
			15&nbsp;days Locked</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Installment Tolerance Amount</td>
      <td class="style3">5,000 Default</td>
      <td class="style3">
			5,500 Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Maximum % from Interest Upping to Supplier</td>
      <td class="style3">0&nbsp;%</td>
      <td class="style3">
			0&nbsp;%</td>
      </tr>
	<tr>
      <td class="style2"> ACCOUNT MAINTENANCE</td>
      <td class="style2" width="30%"> From HO</td>
      <td class="style2"> Branch</td>
    	</tr>
	<tr>
      <td class="style1" style="width: 36%"> Prepayment Penalty Rate</td>
      <td class="style3">5.000000 % Default</td>
      <td class="style3">
			5.000000 % Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Days to Rem<span class="tdgenap">ind 
		PDC</span></td>
      <td class="style3">30 days Default </td>
      <td class="style3">
			25 days Default </td>
    </tr>
	<tr>
      <td class="style2"> ASSET DOCUMENT</td>
      <td class="style2" width="30%"> From HO</td>
      <td class="style2"> Branch</td>
    	</tr>
	<tr>
      <td class="style1" style="width: 36%"> Length Main Document Processed</td>
      <td class="style3">90 days Default</td>
      <td class="style3">
			90 days Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Length Main Document Taken</td>
      <td class="style3">15 days Default</td>
      <td class="style3">
			15 days Default</td>
    </tr>
	<tr>
      <td class="style2"> FINANCE</td>
      <td class="style2" width="30%"> From HO</td>
      <td class="style2"> Branch</td>
    	</tr>
	<tr>
      <td class="style1" style="width: 36%"> Limit A/P Disbursement at Branch</td>
      <td class="style3">0 Default </td>
      <td class="style3">
			0 Default 
			</td>
    </tr>
	<tr>
      <td class="style2"> COLLECTION</td>
      <td class="style2" width="30%"> From HO</td>
      <td class="style2"> Branch</td>
    	</tr>
	<tr>
      <td class="style1" style="width: 36%"> Create SP Automatically</td>
      <td class="style3">Yes Length SP Process 7 days</td>
      <td class="style3">
			Yes Length SP Process 7 days</td>
      	</tr>
		<tr>
      <td class="style1" style="width: 36%"> Create SP 1 Automatically</td>
      <td class="style3">Yes Length SP 1 Process 14 days</td>
      <td class="style3">
			Yes Length SP 1 Process 14 days 
			</td>
      	</tr>
		<tr>
      <td class="style1" style="width: 36%"> Create SP 2 Automatically</td>
      <td class="style3">Yes Length SP 2 Process 21 days</td>
      <td class="style3">
			Yes Length SP 2 Process 21 days</td>
      	</tr>
		<tr>
      <td class="style1" style="width: 36%"> Previous Overdue To Remind</td>
      <td class="style3">3 days Default</td>
            <td class="style3">
			3 days Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Days To Remind Installment</td>
      <td class="style3">0 days Default </td>
      <td class="style3">
			0 days Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Days To Remind By SMS</td>
      <td class="style3">3 days Default</td>
      <td class="style3">
			3 days Default</td>
    </tr>
	<tr>
          <td class="style1">Days Overdue To Assign To Desk Coll</td>
      <td class="style3">3 days Default</td>
      <td class="style3">
			3 days Default</td>
    </tr>
	<tr>
          <td class="style1">Days Overdue To Assign To Field Coll (DCR)</td>
      <td class="style3">4 days Default </td>
      <td class="style3">
			4 days Default</td>
    </tr>
	<tr>
          <td class="style1">Days Overdue To Generate RAL</td>
      <td class="style3">28 days Default </td>
      <td class="style3">
			30 da<span class="tdganjil">ys Default</span></td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> RAL Period</td>
      <td class="style3">14 days Default </td>
      <td class="style3">
			14 days Default </td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Maximum RAL Period</td>
      <td class="style3">21 days Default </td>
      <td class="style3">
			21 days Default </td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Maximum Promise To Pay Days</td>
      <td class="style3">31 days Default</td>
      <td class="style3">
			31 days Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Promise To Pay To Bank</td>
      <td class="style3">31 days Default</td>
      <td class="style3">
			31 days Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Promise To Pay To Company</td>
      <td class="style3">31 days Default</td>
      <td class="style3">
			31 days Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Promise To Pay To Supplier</td>
      <td class="style3">7 days Default</td>
      <td class="style3">
			7 days Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Inventory Expected</td>
      <td class="style3">10 days Default</td>
      <td class="style3">
			10 days Default</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Broken Promise Days</td>
      <td class="style3">2 days Default</td>
      <td class="style3">
			2 days Default</td>
    </tr>
	</table>
	<p align="center"><font face="Arial, Helvetica, sans-serif">| <a href="ProductBranchDetailView.aspx" target="_self">Product Branch Detail</a> |</font></p>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%"  align="left" height="30">&nbsp;</td>
      <td width="50%" align="right">&nbsp;<asp:ImageButton runat="server" id="BtnClose" ImageUrl="../../images/ButtonClose.gif" PostBackUrl="javascript:window.close();" /><br />
		</td>
    </tr>
  </table>  
</div>
</form>
</body>
</html>
