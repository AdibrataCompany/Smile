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
      <td align="center" class="tdtopihijau">PRODUCT BRANCH - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>

  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style1" style="width: 36%"> Branch</td>
      <td class="style3" colspan="3">xxxxxxxxxx50xxxxxxxxxx
      </td>
    </tr>
    <tr> 
      <td class="style1"> Product ID</td>
      <td class="style3" colspan="3"><a href="ProductView.aspx" target="_blank">CFMOHND001</a></td>
    </tr>
    <tr> 
      <td class="style1" style="width: 36%"> Description </td>
      <td class="style3" colspan="3"><p class="style4">PRODUCT CONSUMER FINANCE NEW HONDA</p></td>
    </tr>
    <tr> 
      <td colspan="4" class="style2">GENERAL</td>
    </tr>
    <tr>
          <td class="style1" style="height: 21px">Currency</td>
          <td class="style3" colspan="3">IDR</td>
        </tr>
	<tr>
          <td class="style1">Asset Type</td>
          <td class="style3" colspan="3">MOTORCYCLE</td>
        </tr>
	<tr>
          <td class="style1">Credit Investigation Scheme</td>
          <td class="style3" colspan="3">CI Employee</td>
        </tr>
	<tr>
          <td class="style1">Score Scheme Marketing</td>
          <td class="style3" colspan="3">Scoring Honda Supra</td>
        </tr>
	<tr>
          <td class="style1">Score Scheme Credit</td>
          <td class="style3" colspan="3">Scoring Honda Supra</td>
        </tr>
	<tr>
          <td class="style1">Journal Scheme</td>
          <td class="style3" colspan="3">Scheme 1</td>
        </tr>
	<tr>
          <td class="style1">Application Type</td>
          <td class="style3" colspan="3">Non Group</td>
        </tr>
	<tr>
          <td class="style1">Finance Type</td>
          <td class="style3" colspan="3">Consumer Finance</td>
        </tr>
	<tr>
          <td class="style1">Lease Back Type</td>
          <td class="style3" colspan="3">Direct Financing</td>
        </tr>
	<tr>
          <td class="style1">Floor Financing</td>
          <td class="style3" colspan="3">No</td>
        </tr>
	<tr>
          <td class="style1">New / Used&nbsp; Type</td>
          <td class="style3" colspan="3">New</td>
        </tr>
	<tr>
          <td class="style1">Vehicle Type</td>
          <td class="style3" colspan="3">Public</td>
        </tr>
	<tr>
          <td class="style1">Conventional Type</td>
          <td class="style3" colspan="3">Syariah</td>
        </tr>
		<tr>
          <td class="style1">Payment Frequency</td>
          <td class="style3" colspan="3">Quarterly</td>
        </tr>
	<tr>
          <td class="style1">Installment Scheme</td>
          <td class="style3" colspan="3">Regular Fixed Installment</td>
        </tr>
	<tr>
          <td class="style1">Interest Type</td>
          <td class="style3" colspan="3">Fixed Rate</td>
        </tr>
	<tr>
          <td class="style1">Effective Rate Type</td>
          <td class="style3" colspan="3">Standard Rate</td>
        </tr>
    <tr>
      <td class="style2"> LATE CHARGES</td>
      <td class="style2" width="30%"> From HO</td>
      <td class="style2" colspan="2"> Branch</td>
    	</tr>
		<tr>
      <td class="style1" style="width: 36%"> Late Charges Percentage (Installment)</td>
      <td class="style3">5.000000 &#8240; / day Default </td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnInstallmentLc" Width="70px" CssClass="inptype">6.000000</asp:TextBox>
&nbsp;&#8240; / day&nbsp;</td>
      <td class="style3">
      <asp:DropDownList runat="server" id="CmbInstallmentLc">
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>				
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Late Charges Percentage (Insurance)</td>
      <td class="style3"> 5.000000 &#8240; / day Default</td>
      <td class="style3"> 
			<asp:TextBox runat="server" id="TbnInsuranceLc" Width="70px" CssClass="inptype">3.000000</asp:TextBox>
&nbsp;&#8240; / day&nbsp;</td>
      <td class="style3"> <asp:DropDownList runat="server" id="CmbInsuranceLc">
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>				
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Grace Period Late Charges</td>
      <td class="style3">2 days Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnGracePeriod" Width="70px" CssClass="inptype">2</asp:TextBox>
			&nbsp;days&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbGracePeriod">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Late Charges Calculation Method</td>
      <td class="style3" colspan="3"> 
			<asp:DropDownList runat="server" id="CmbLateChargesCalcMethod" CssClass="inptype" Enabled="False">
				<asp:ListItem>Calendar Day</asp:ListItem>
				<asp:ListItem>Working Calendar</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
    <tr> 
      <td class="style2"> FEES</td>
      <td class="style2" width="30%"> From HO</td>
      <td class="style2" colspan="2"> Branch</td>
    </tr>
    <tr>
      <td class="style1" style="width: 36%"> Cancellation Fee</td>
      <td class="style3">50,000&nbsp; Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnCancellationFee" Width="70px" CssClass="inptype">55000</asp:TextBox>
		</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbCancellationFee">
			    <asp:ListItem>Maximum</asp:ListItem>
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>				
			</asp:DropDownList>
</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%" rowspan="2"> Provision Fee</td>
      <td class="style3" rowspan="2">1.00 % Default</td>
      <td class="style3" style="height: 9px" colspan="2">
			<asp:RadioButtonList runat="server" id="rdoProvisionFeeCalcType" RepeatDirection="Horizontal">
				<asp:ListItem Value="A" Selected="True">Amount</asp:ListItem>
				<asp:ListItem Value="P">Percentage</asp:ListItem>
			</asp:RadioButtonList>
			</td>
      </tr>
	<tr>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnProvisionFee" Width="70px" CssClass="inptype">1.00</asp:TextBox>
			</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbProvisionFee">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%" rowspan="2"> Notary Fee</td>
      <td class="style3" rowspan="2">0.10 % Default</td>
      <td class="style3" colspan="2">
			<asp:RadioButtonList runat="server" id="rdoNotaryFeeCalcType" RepeatDirection="Horizontal">
				<asp:ListItem Value="A" Selected="True">Amount</asp:ListItem>
				<asp:ListItem Value="P">Percentage</asp:ListItem>
			</asp:RadioButtonList>
			</td>
      </tr>
	<tr>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnNotaryFee" Width="70px" CssClass="inptype">0.10</asp:TextBox>
			</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbNotaryFee">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Survey Fee</td>
      <td class="style3">0 Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnSurveyFee" Width="70px" CssClass="inptype">0</asp:TextBox>
			</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbSurveyFee">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Visit Fee</td>
      <td class="style3">0 Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnVisitFee" Width="70px" CssClass="inptype">0</asp:TextBox>
			</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbVisitFee">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Rescheduling Fee</td>
      <td class="style3">0 Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnReschedullingFee" Width="70px" CssClass="inptype">0</asp:TextBox>
			</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbReschedullingFee">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Change Due Date Rescheduling Fee</td>
      <td class="style3">0 Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnChangeDueDateReschedullingFee" Width="70px" CssClass="inptype">0</asp:TextBox>
			</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbChangeDueDateReschedullingFee">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Asset Replacement Fee</td>
      <td class="style3">0 Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnAssetReplacementFee" Width="70px" CssClass="inptype">0</asp:TextBox>
			</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbAssetReplacementFee">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Repossess Fee</td>
      <td class="style3">0 Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnRepossesFee" Width="70px" CssClass="inptype">0</asp:TextBox>
			</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbRepossesFee">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Legalized Document Fee</td>
      <td class="style3">0 Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnLegalDocumentFee" Width="70px" CssClass="inptype">0</asp:TextBox>
			</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbLegalDocumentFee">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> PDC Bounce Fee</td>
      <td class="style3">5,000 Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnPdcBounceFee" Width="70px" CssClass="inptype">6000.00</asp:TextBox>
			</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbPdcBounceFee">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style2"> CREDIT PROCESS</td>
      <td class="style2" width="30%"> From HO</td>
      <td class="style2" colspan="2"> Branch</td>
    	</tr>
	<tr>
          <td class="style1">Maximum Coverage Area</td>
          <td class="style3" style="width: 25%">
			50 kms Default</td>
          <td class="style3">
			<asp:TextBox runat="server" id="txtMaxCoverArea" CssClass="inptype" Width="70px">0</asp:TextBox>
			&nbsp;kms</td>
          <td class="style3">
			<asp:DropDownList runat="server" id="ddlMaxCoverArea">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
				<asp:ListItem Value="N">Minimum</asp:ListItem>
				<asp:ListItem Value="X">Maximum</asp:ListItem>
			</asp:DropDownList>
    	  </td>			
        </tr>
	<tr>
      <td class="style1" style="width: 36%"> PO Expiration Days</td>
      <td class="style3">15 days Locked</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnPoExpirationDays" Width="70px" CssClass="inptype">15</asp:TextBox>
&nbsp;days</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbPoExpirationDays">
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Installment Tolerance Amount</td>
      <td class="style3">5,000 Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnInsTolaranceAmt" Width="70px" CssClass="inptype">5500.00</asp:TextBox>
			</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbInsTolaranceAmt">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Maximum % from Interest Upping to Supplier</td>
      <td class="style3">0&nbsp;% Maximum</td>
      <td class="style3" colspan="2">
			<asp:TextBox runat="server" id="TbnMaxFromUpBunga" Width="70px" CssClass="inptype">0</asp:TextBox>
			&nbsp;%</td>
      </tr>
	<tr>
      <td class="style2"> ACCOUNT MAINTENANCE</td>
      <td class="style2" width="30%"> From HO</td>
      <td class="style2" colspan="2"> Branch</td>
    	</tr>
	<tr>
      <td class="style1" style="width: 36%"> Prepayment Penalty Rate</td>
      <td class="style3">5.000000 % Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnPrepaymentPenaltyRate" Width="70px" CssClass="inptype">5.000000</asp:TextBox>
			&nbsp;%</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbPrepaymentPenaltyRate">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>				
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Days to Rem<span class="tdgenap">ind 
		PDC</span></td>
      <td class="style3">30 days Default </td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnPdcDayToRemind" Width="70px" CssClass="inptype">25</asp:TextBox>
			&nbsp;days</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbPdcDayToRemind">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style2"> ASSET DOCUMENT</td>
      <td class="style2" width="30%"> From HO</td>
      <td class="style2" colspan="2"> Branch</td>
    	</tr>
	<tr>
      <td class="style1" style="width: 36%"> Length Main Document Processed</td>
      <td class="style3">90 days Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnLengthMainDocProc" Width="70px" CssClass="inptype">90</asp:TextBox>
&nbsp;days</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbLengthMainDocProc">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Length Main Document Taken</td>
      <td class="style3">15 days Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnLengthMainDocTake" Width="70px" CssClass="inptype">15</asp:TextBox>
&nbsp;days</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbLengthMainDocTake">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style2"> FINANCE</td>
      <td class="style2" width="30%"> From HO</td>
      <td class="style2" colspan="2"> Branch</td>
    	</tr>
	<tr>
      <td class="style1" style="width: 36%"> Limit A/P Disbursement at Branch</td>
      <td class="style3">0 Default </td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnLimitAp" Width="70px" CssClass="inptype">0</asp:TextBox>
			</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbLimitAp">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style2"> COLLECTION</td>
      <td class="style2" width="30%"> From HO</td>
      <td class="style2" colspan="2"> Branch</td>
    	</tr>
	<tr>
      <td class="style1" style="width: 36%"> Create SP Automatically</td>
      <td class="style3">Yes Length SP Process 7 days</td>
      <td class="style3" colspan="2">
			<asp:DropDownList runat="server" id="CmbCreateSP0">
				<asp:ListItem>Yes</asp:ListItem>
				<asp:ListItem>No</asp:ListItem>
			</asp:DropDownList>
			&nbsp;
			Length SP Process&nbsp;&nbsp;&nbsp;
			<asp:TextBox runat="server" id="TbnCreateSPLength" Width="30px" CssClass="inptype">7</asp:TextBox>
&nbsp;days 
			</td>
      	</tr>
		<tr>
      <td class="style1" style="width: 36%"> Create SP 1 Automatically</td>
      <td class="style3">Yes Length SP 1 Process 14 days</td>
      <td class="style3" colspan="2">
			<asp:DropDownList runat="server" id="CmbCreateSP1">
				<asp:ListItem>Yes</asp:ListItem>
				<asp:ListItem>No</asp:ListItem>
			</asp:DropDownList>
			&nbsp;
            Length SP 1 Process 
            <asp:TextBox runat="server" id="TbnCreateSP1Length" Width="30px" CssClass="inptype">14</asp:TextBox>
&nbsp;days 
			</td>
      	</tr>
		<tr>
      <td class="style1" style="width: 36%"> Create SP 2 Automatically</td>
      <td class="style3">Yes Length SP 2 Process 21 days</td>
      <td class="style3" colspan="2">
			<asp:DropDownList runat="server" id="CmbCreateSP2">
				<asp:ListItem>Yes</asp:ListItem>
				<asp:ListItem>No</asp:ListItem>
			</asp:DropDownList>
			&nbsp;
            Length SP 2 Process 
            <asp:TextBox runat="server" id="TbnCreateSP2Length0" Width="30px" CssClass="inptype">21</asp:TextBox>
&nbsp;days</td>
      	</tr>
		<tr>
      <td class="style1" style="width: 36%"> Previous Overdue To Remind</td>
      <td class="style3">3 days Default</td>
            <td class="style3">
			<asp:TextBox runat="server" id="TbnPrevOverdueToRemind" Width="70px" CssClass="inptype">3</asp:TextBox>
			&nbsp;days</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbPrevOverdueToRemind">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Days To Remind Installment</td>
      <td class="style3">0 days Default </td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnDaysToRemindInst" Width="70px" CssClass="inptype">0</asp:TextBox>
			&nbsp;days</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbDaysToRemindInst">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Days To Remind By SMS</td>
      <td class="style3">3 days Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnDaysToRemindSms" Width="70px" CssClass="inptype">3</asp:TextBox>
			&nbsp;days </td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbDaysToRemindSms">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
          <td class="style1">Days Overdue To Assign To Desk Coll</td>
      <td class="style3">3 days Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnDaysOverdueToCall" Width="70px" CssClass="inptype">3</asp:TextBox>
			&nbsp;days</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbDaysOverdueToCall">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
          <td class="style1">Days Overdue To Assign To Field Coll (DCR)</td>
      <td class="style3">4 days Default </td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnDaysToRemindDcr" Width="70px" CssClass="inptype">4</asp:TextBox>
			&nbsp;days </td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbDaysToRemindDcr">
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Default</asp:ListItem>				
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
          <td class="style1">Days Overdue To Generate RAL</td>
      <td class="style3">28 days Default </td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnDaysToRemindRal" Width="70px" CssClass="inptype">30</asp:TextBox>
			&nbsp;days</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbDaysToRemindRal">
				<asp:ListItem>Maximum</asp:ListItem>
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>				
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> RAL Period</td>
      <td class="style3">14 days Default </td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnRalPeriod" Width="70px" CssClass="inptype">14</asp:TextBox>
			&nbsp;days</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbRalPeriod">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Maximum RAL Period</td>
      <td class="style3">21 days Default </td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnRalExtension0" Width="70px" CssClass="inptype">
			21</asp:TextBox>
			&nbsp;days</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbRalExtension0">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Maximum Promise To Pay Days</td>
      <td class="style3">31 days Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnMaxPromToPayDays" Width="70px" CssClass="inptype">31</asp:TextBox>
			&nbsp;days</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbMaxPromToPayDays">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Promise To Pay To Bank</td>
      <td class="style3">31 days Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnPromToPayToBank" Width="70px" CssClass="inptype">31</asp:TextBox>
			&nbsp;days</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbPromToPayToBank">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Promise To Pay To Company</td>
      <td class="style3">31 days Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnPromToPayToComp" Width="70px" CssClass="inptype">31</asp:TextBox>
			&nbsp;days</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbPromToPayToComp">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Promise To Pay To Supplier</td>
      <td class="style3">7 days Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnPromToPayToSupp" Width="70px" CssClass="inptype">7</asp:TextBox>
			&nbsp;days</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbPromToPayToSupp">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Inventory Expected</td>
      <td class="style3">10 days Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnInvExpected" Width="70px" CssClass="inptype">10</asp:TextBox>
			&nbsp;days</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbInvExpected">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	<tr>
      <td class="style1" style="width: 36%"> Broken Promise Days</td>
      <td class="style3">2 days Default</td>
      <td class="style3">
			<asp:TextBox runat="server" id="TbnBrokenPromiseDays" Width="70px" CssClass="inptype">3</asp:TextBox>
			&nbsp;days</td>
      <td class="style3">
			<asp:DropDownList runat="server" id="CmbBrokenPromiseDays">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
    </tr>
	</table>

  <div align="center">
    <div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="ProductBranch.aspx" Height="20px" />&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="ProductBranch.aspx" /><br />
		</td>
    </tr>
  </table>
    </div>
    
  </div>

</div>
</form>
</body>
</html>
