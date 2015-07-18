<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>*</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<style type="text/css">
.style1 {
	background-color: #F4FAFF;
	text-align: left;
}
.style2 {
	background-color: #FFFFFF;
	text-align: left;
}
.style3 {
	background-color: #F4F4DF;
	font-weight: bold;
	font-size: 10px;
	text-align: left;
}
.style5 {
	text-align: left;
}
.style7 {
	color: #FF0000;
}
</style>
</head>

<body>
<form id="FrmProductAdd" runat="server">
<div class="style5">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3" class="style5"><font color="red"><i>*)&nbsp;&nbsp;&nbsp;&nbsp; required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">PRODUCT - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="40%" class="style1">Copy Data From Other Product</td>
          <td class="style2" colspan="2"> 
			    <asp:DropDownList runat="server" id="CmbCopyDataProduct" Width="351px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				<br />
		<asp:ImageButton runat="server" id="BtnCopy" ImageUrl="../../images/ButtonCopy.gif" />&nbsp;</td>
        </tr>
        <tr> 
          <td width="40%" class="style1" style="height: 18px">Product ID</td>
          <td class="style2" colspan="2" style="height: 18px"><a href="ProductView.aspx" target="_blank">xxxxx20xxxxx</a>
			<font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="style1">Description</td>
          <td class="style2" colspan="2"><font color="red">
			<asp:TextBox runat="server" id="txtDescription" Width="315px" CssClass="inptype">
			</asp:TextBox>
&nbsp;*)</font> </td>
        </tr>
        <tr> 
          <td colspan="3" class="style3">GENERAL</td>
        </tr>
        <tr> 
          <td class="style1">Currency ID</td>
          <td class="style2" colspan="2">
			<asp:DropDownList runat="server" id="CmbCurrencyId" CssClass="inptype">
				<asp:ListItem>Select One</asp:ListItem>
				<asp:ListItem>Rupiah</asp:ListItem>
				<asp:ListItem>US Dollar</asp:ListItem>
			</asp:DropDownList>
&nbsp;<font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="style1">Credit Investigation Scheme</td>
          <td class="style2" colspan="2">
			<asp:DropDownList runat="server" id="CmbCreditInvestigationScheme" Width="250px" CssClass="inptype">
				<asp:ListItem>Select One</asp:ListItem>
			</asp:DropDownList>
&nbsp;<font color="red">*)</font></td>
        </tr>
        <tr> 
          <td class="style1">Score Scheme Marketing</td>
          <td class="style2" colspan="2">
			<asp:DropDownList runat="server" id="CmbScoreSchemeMarketing" Width="250px" CssClass="inptype">
				<asp:ListItem>Select One</asp:ListItem>
			</asp:DropDownList>
&nbsp;<font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="style1">Score Scheme Credit</td>
          <td class="style2" colspan="2"><font color="red">
			<asp:DropDownList runat="server" id="CmbScoreSchemeCredit" Width="250px" CssClass="inptype">
			<asp:ListItem>Select One</asp:ListItem>
			</asp:DropDownList>
&nbsp;*)</font> </td>
        </tr>
        <tr>
          <td class="style1">Journal Scheme</td>
          <td class="style2" colspan="2">
			<asp:DropDownList runat="server" id="CmbJournalScheme" Width="250px" CssClass="inptype">
				<asp:ListItem>Select One</asp:ListItem>
			</asp:DropDownList>
&nbsp;<font color="red">*)</font> </td>
        </tr>
        <tr>
          <td class="style1">Application Type</td>
          <td class="style2" colspan="2"> 
			<asp:DropDownList runat="server" id="CmbApplicationType" Width="128px" CssClass="inptype">
				<asp:ListItem>Group</asp:ListItem>
				<asp:ListItem>Non Group</asp:ListItem>
			</asp:DropDownList>
&nbsp;<font color="red">*)</font> </td>
        </tr>
        <tr>
          <td class="style1">Product Type</td>
          <td class="style2" colspan="2">
			<asp:DropDownList runat="server" id="ddlProductType" Width="250px" CssClass="inptype">
				<asp:ListItem Value="DEMotor">DE Motor</asp:ListItem>
				<asp:ListItem Selected="True" Value="DEMobil">DE Mobil
				</asp:ListItem>
				<asp:ListItem Value="KCM">CF</asp:ListItem>
				<asp:ListItem Value="Leasing">LS</asp:ListItem>
			</asp:DropDownList>
&nbsp;<font color="red">*)</font></td>
        </tr>
        <tr>
          <td class="style1">Asset Type</td>
          <td class="style2" colspan="2">
			<asp:DropDownList runat="server" id="CmbAssetType0" Width="250px" CssClass="inptype">
				<asp:ListItem>Select One</asp:ListItem>
			</asp:DropDownList>
&nbsp;<font color="red">*)</font></td>
        </tr>
		<tr>
          <td class="style1" style="height: 13px">Asset Category</td>
          <td class="style2" style="height: 13px" colspan="2">
			<asp:DropDownList runat="server" id="ddlAssetCategory" Width="250px" CssClass="inptype">
				<asp:ListItem Value="N">Non Truck</asp:ListItem>
				<asp:ListItem Value="T">Truck</asp:ListItem>
			</asp:DropDownList>
&nbsp;<font color="red">*)</font> 
			</td>
        	</tr>
		<tr>
          <td class="style1">Asset Usage</td>
          <td class="style2" colspan="2"> 
			<asp:DropDownList runat="server" id="CmbVehicleType0" CssClass="inptype">
				<asp:ListItem Value="C">Commercial</asp:ListItem>
				<asp:ListItem Selected="True" Value="N">Non Commercial
				</asp:ListItem>
			</asp:DropDownList>
&nbsp;<font color="red">*)</font> 
			</td>
        	</tr>
		<tr>
          <td class="style1" style="height: 13px">Finance Type</td>
          <td class="style2" style="height: 13px" colspan="2">
			<asp:RadioButtonList runat="server" id="RadioButtonList4" RepeatDirection="Horizontal">
				<asp:ListItem Selected="True" Value="CF">Consumer Finance
				</asp:ListItem>
				<asp:ListItem Value="LS">Finance Lease</asp:ListItem>
			</asp:RadioButtonList>
			</td>
        </tr>
		<tr>
          <td class="style1">Lease Back Type</td>
          <td class="style2" colspan="2">
				<asp:RadioButtonList runat="server" id="rdoExpressFundType0" RepeatDirection="Horizontal">
				<asp:ListItem Selected="True" Value="N">Direct Financing
				</asp:ListItem>
				<asp:ListItem Value="Y">Lease Back</asp:ListItem>
			</asp:RadioButtonList>
			</td>
        </tr>
		<tr>
          <td class="style1">New / Used&nbsp; Type</td>
          <td class="style2" colspan="2"> 
			<asp:RadioButtonList runat="server" id="RadioButtonList5" RepeatDirection="Horizontal">
				<asp:ListItem Value="N" Selected="True">New</asp:ListItem>
				<asp:ListItem Value="U">Used</asp:ListItem>
			</asp:RadioButtonList>
			</td>
        	</tr>
		<tr>
          <td class="style1">Conventional Type</td>
          <td class="style2" colspan="2"> 
			<asp:RadioButtonList runat="server" id="rdlConventionalType" RepeatDirection="Horizontal">
				<asp:ListItem Selected="True" Value="C">Conventional
				</asp:ListItem>
				<asp:ListItem Value="S">Syariah</asp:ListItem>
			</asp:RadioButtonList>
			</td>
        	</tr>
		<tr>
          <td class="style1">Floor Financing</td>
          <td class="style2" colspan="2">
				<asp:RadioButtonList runat="server" id="rdoFloorFinancing0" RepeatDirection="Horizontal">
				<asp:ListItem Value="Y">Yes</asp:ListItem>
				<asp:ListItem Selected="True" Value="N">No</asp:ListItem>
			</asp:RadioButtonList>
				<span class="style7">only for CF</span></td>
        </tr>
		<tr>
          <td class="style1">Payment Frequency</td>
          <td class="style2" colspan="2"> 
			<asp:DropDownList runat="server" id="CmbPaymentFrequency" Width="128px" CssClass="inptype">
				<asp:ListItem>All</asp:ListItem>
				<asp:ListItem>Monthly</asp:ListItem>
				<asp:ListItem>Bimonthly</asp:ListItem>
				<asp:ListItem>Quarterly</asp:ListItem>
				<asp:ListItem>Semi Annualy</asp:ListItem>
			</asp:DropDownList>
&nbsp;<font color="red">*)</font> </td>
        </tr>
		<tr>
          <td class="style1">Installment Scheme</td>
          <td class="style2" colspan="2"> 
			<asp:DropDownList runat="server" id="CmbInstallmentScheme" CssClass="inptype">
				<asp:ListItem>All</asp:ListItem>
				<asp:ListItem>Regular Fixed Installment Scheme</asp:ListItem>
				<asp:ListItem>Irregular Installment</asp:ListItem>
				<asp:ListItem>Step Up/ Step Down</asp:ListItem>
				<asp:ListItem>Even Principle</asp:ListItem>
			</asp:DropDownList>
&nbsp;<font color="red">*)</font> </td>
        </tr>
		<tr>
          <td class="style1">Interest Type</td>
          <td class="style2" colspan="2"> 
			<asp:DropDownList runat="server" id="CmbInterestType" CssClass="inptype">
				<asp:ListItem>All</asp:ListItem>
				<asp:ListItem>Fixed Rate</asp:ListItem>
				<asp:ListItem>Floating Rate</asp:ListItem>
			</asp:DropDownList>
&nbsp;<font color="red">*)</font> </td>
        	</tr>
		<tr>
          <td class="style1">Is Discount Payment</td>
          <td class="style2" colspan="2"> 
			<asp:RadioButtonList runat="server" id="rdoIsDiscPayment" RepeatDirection="Horizontal">
				<asp:ListItem Selected="True" Value="Y">Yes</asp:ListItem>
				<asp:ListItem Value="N">No</asp:ListItem>
			</asp:RadioButtonList></td>
        	</tr>
		<tr>
          <td class="style1">Effective Rate Type</td>
          <td class="style2" colspan="2"> 
			<asp:RadioButtonList runat="server" id="rdoEffRateType" RepeatDirection="Horizontal">
				<asp:ListItem Value="S" Selected="True">Standard Rate</asp:ListItem>
				<asp:ListItem Value="B">Bottom Rate</asp:ListItem>
			</asp:RadioButtonList></td>
        	</tr>
        <tr> 
          <td class="style3" colspan="3">LATE CHARGES</td>
        </tr>
        <tr> 
          <td class="style1">Late Charges Percentage (Installment)</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnInstallmentLc" CssClass="inptype">0</asp:TextBox>
&nbsp;&#8240; / day
			</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbInstallmentLc" CssClass="inptype">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
				<asp:ListItem Value="N">Minimum</asp:ListItem>
				<asp:ListItem Value="X">Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        </tr>
        <tr> 
          <td class="style1" width="40%">Late Charges Percentage (Insurance)</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnInsuranceLc" CssClass="inptype">0</asp:TextBox>
&nbsp;&#8240; / day
			</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbInsuranceLc" CssClass="inptype">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
				<asp:ListItem Value="N">Minimum</asp:ListItem>
				<asp:ListItem Value="X">Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        </tr>
        <tr>
          <td class="style1">Grace Period Late Charges</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnGracePeriod" CssClass="inptype">0</asp:TextBox>
&nbsp;days
			</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbGracePeriod" CssClass="inptype">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
				<asp:ListItem Value="N">Minimum</asp:ListItem>
				<asp:ListItem Value="X">Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        </tr>
        <tr> 
          <td class="style1">Late Charges Calculation Method</td>
          <td class="style2" colspan="2">
			<asp:DropDownList runat="server" id="CmbLateChargesCalcMethod" CssClass="inptype">
				<asp:ListItem>Calendar Day</asp:ListItem>
				<asp:ListItem>Working Calendar</asp:ListItem>
			</asp:DropDownList>
			</td>
        </tr>
        <tr>
          <td colspan="3" class="style3">FEES</td>
        </tr>
		<tr>
          <td class="style1">Cancellation Fee</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnCancellationFee" CssClass="inptype">0</asp:TextBox>
			</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbCancellationFee" CssClass="inptype">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
				<asp:ListItem Value="N">Minimum</asp:ListItem>
				<asp:ListItem Value="X">Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
			<tr>
          <td class="style1" rowspan="2">Provision Fee</td>
          <td class="style2" colspan="2">
			<asp:RadioButtonList runat="server" id="rdoProvisionFeeCalcType" RepeatDirection="Horizontal">
				<asp:ListItem Value="A" Selected="True">Amount</asp:ListItem>
				<asp:ListItem Value="P">Percentage</asp:ListItem>
			</asp:RadioButtonList>
			</td>
        	</tr>
			<tr>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnProvisionFee" CssClass="inptype">0</asp:TextBox>
			</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbProvisionFee" CssClass="inptype">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
				<asp:ListItem Value="N">Minimum</asp:ListItem>
				<asp:ListItem Value="X">Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        </tr>
		<tr>
          <td class="style1" rowspan="2">Notary Fee</td>
          <td class="style2" colspan="2">
			<asp:RadioButtonList runat="server" id="rdoNotaryFeeCalcType" RepeatDirection="Horizontal">
				<asp:ListItem Value="A" Selected="True">Amount</asp:ListItem>
				<asp:ListItem Value="P">Percentage</asp:ListItem>
			</asp:RadioButtonList></td>
        </tr>
		<tr>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnNotaryFee" CssClass="inptype">0</asp:TextBox>
			</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbNotaryFee" CssClass="inptype">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
				<asp:ListItem Value="N">Minimum</asp:ListItem>
				<asp:ListItem Value="X">Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        </tr>
        <tr>
          <td class="style1">Survey Fee</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnSurveyFee" CssClass="inptype">0</asp:TextBox>
			</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbSurveyFee" CssClass="inptype">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
				<asp:ListItem Value="N">Minimum</asp:ListItem>
				<asp:ListItem Value="X">Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
			<tr>
          <td class="style1">Visit Fee</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnVisitFee" CssClass="inptype">0</asp:TextBox>
			</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbVisitFee" CssClass="inptype">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
				<asp:ListItem Value="N">Minimum</asp:ListItem>
				<asp:ListItem Value="X">Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
			<tr>
          <td class="style1">Rescheduling Fee</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnReschedullingFee" CssClass="inptype">0</asp:TextBox>
			</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbReschedullingFee" CssClass="inptype" Height="16px">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
				<asp:ListItem Value="N">Minimum</asp:ListItem>
				<asp:ListItem Value="X">Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
			<tr>
          <td class="style1">Change Due Date Fee</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnChangeDueDateReschedullingFee" CssClass="inptype">0</asp:TextBox>
			</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbChangeDueDateReschedullingFee" CssClass="inptype">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
				<asp:ListItem Value="N">Minimum</asp:ListItem>
				<asp:ListItem Value="X">Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
			<tr>
          <td class="style1">Asset Replacement Fee</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnAssetReplacementFee" CssClass="inptype">0</asp:TextBox>
			</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbAssetReplacementFee" CssClass="inptype">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
				<asp:ListItem Value="N">Minimum</asp:ListItem>
				<asp:ListItem Value="X">Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
			<tr>
          <td class="style1">Repossess Fee</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnRepossesFee" CssClass="inptype">0</asp:TextBox>
			</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbRepossesFee" CssClass="inptype">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
				<asp:ListItem Value="N">Minimum</asp:ListItem>
				<asp:ListItem Value="X">Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
			<tr>
          <td class="style1">Legalized Document Fee</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnLegalDocumentFee" CssClass="inptype">0</asp:TextBox>
			</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbLegalDocumentFee" CssClass="inptype">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
				<asp:ListItem Value="N">Minimum</asp:ListItem>
				<asp:ListItem Value="X">Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
			<tr>
          <td class="style1" style="height: 22px">PDC Bounce Fee</td>
          <td class="style2" style="width: 25%; height: 22px;">
			<asp:TextBox runat="server" id="TbnPdcBounceFee" CssClass="inptype">0</asp:TextBox>
			</td>
          <td class="style2" style="height: 22px">
			<asp:DropDownList runat="server" id="CmbPdcBounceFee" CssClass="inptype">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
				<asp:ListItem Value="N">Minimum</asp:ListItem>
				<asp:ListItem Value="X">Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
        <tr> 
          <td colspan="3" class="style3">CREDIT PROCESS</td>
        </tr>
        <tr> 
          <td class="style1">Maximum Coverage Area</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="txtMaxCoverArea" CssClass="inptype">0</asp:TextBox>
			&nbsp;kms</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="ddlMaxCoverArea" CssClass="inptype">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
				<asp:ListItem Value="N">Minimum</asp:ListItem>
				<asp:ListItem Value="X">Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        </tr>
        <tr> 
          <td class="style1">PO Expiration Days</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnPoExpirationDays" CssClass="inptype">0</asp:TextBox>
&nbsp;days
			</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbPoExpirationDays" CssClass="inptype">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
				<asp:ListItem Value="N">Minimum</asp:ListItem>
				<asp:ListItem Value="X">Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        </tr>
        <tr> 
          <td class="style1">Installment Tolerance Amount</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnInsTolaranceAmt" CssClass="inptype">0</asp:TextBox>
			</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbInsTolaranceAmt" CssClass="inptype">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
				<asp:ListItem Value="N">Minimum</asp:ListItem>
				<asp:ListItem Value="X">Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        </tr>
        <tr> 
          <td class="style1">Maximum % From Interest Upping To Supplier</td>
          <td class="style2" colspan="2">
			<asp:TextBox runat="server" id="TbnMaxFromUpBunga" CssClass="inptype">0</asp:TextBox>
&nbsp;%&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
        </tr>
        <tr>
          <td colspan="3" class="style3">ACCOUNT MAINTENANCE</td>
        </tr>
		<tr>
          <td class="style1" width="40%">Prepayment Penalty Rate</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnPrepaymentPenaltyRate" CssClass="inptype">0</asp:TextBox>
&nbsp;%
			</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbPrepaymentPenaltyRate" CssClass="inptype">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        </tr>
		<tr>
          <td class="style1">Days to Remind PDC Cummulative</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnPdcDayToRemind" CssClass="inptype">
			0</asp:TextBox>
			&nbsp;days</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbPdcDayToRemind" CssClass="inptype">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
		<tr>
          <td colspan="3" class="style3">ASSET DOCUMENT</td>
        </tr>
		<tr>
          <td class="style1" width="40%">Length Main Document Processed</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnLengthMainDocProc" CssClass="inptype">0</asp:TextBox>
&nbsp;days
			</td>
            <td class="style2">
			<asp:DropDownList runat="server" id="CmbLengthMainDocProc" CssClass="inptype">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
            </td>
        </tr>
		<tr>
          <td class="style1" width="40%">Length Main Document Taken</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnLengthMainDocTake" CssClass="inptype">0</asp:TextBox>
&nbsp;days
			</td>
            <td class="style2">
			<asp:DropDownList runat="server" id="CmbLengthMainDocTake" CssClass="inptype">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
            </td>
        	</tr>
        <tr> 
          <td colspan="3" class="style3">FINANCE</td>
        </tr>
        <tr> 
          <td class="style1">Limit A/P Disbursement At Branch</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnLimitAp" CssClass="inptype">0</asp:TextBox>
			</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbLimitAp" CssClass="inptype">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        </tr>
        <tr>
          <td colspan="3" class="style3">COLLECTION</td>
        </tr>
		<tr>
          <td class="style1">Create SP Automatically</td>
          <td class="style2" style="width: 25%">
			<asp:DropDownList runat="server" id="CmbCreateSP" CssClass="inptype">
				<asp:ListItem Value="N">No</asp:ListItem>
				<asp:ListItem Value="Y">Yes</asp:ListItem>
			</asp:DropDownList>
			&nbsp;<asp:DropDownList runat="server" id="CmbCreateSPBehaviour" CssClass="inptype">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
			</asp:DropDownList>
			&nbsp; </td>
          <td class="style2">
			Length SP Process&nbsp;&nbsp;&nbsp;
			<asp:TextBox runat="server" id="TbnCreateSPLength" Width="30px" CssClass="inptype">0</asp:TextBox>
&nbsp;days </td>
        </tr>
		<tr>
          <td class="style1">Create SP 1 Automatically</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbCreateSP1" CssClass="inptype">
				<asp:ListItem Value="N">No</asp:ListItem>
				<asp:ListItem Value="Y">Yes</asp:ListItem>
			</asp:DropDownList>
			&nbsp;<asp:DropDownList runat="server" id="CmbCreateSP1Behaviour" CssClass="inptype">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
			</asp:DropDownList>
			&nbsp; </td>
          <td class="style2">
			Length SP 1 Process 
            <asp:TextBox runat="server" id="TbnCreateSP1Length" Width="30px" CssClass="inptype">0</asp:TextBox>
&nbsp;days </td>
        </tr>
		<tr>
          <td class="style1">Create SP 2 Automatically</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbCreateSP2" CssClass="inptype">
				<asp:ListItem Value="N">No</asp:ListItem>
				<asp:ListItem Value="Y">Yes</asp:ListItem>
			</asp:DropDownList>
			&nbsp;<asp:DropDownList runat="server" id="CmbCreateSP2Behaviour" CssClass="inptype">
				<asp:ListItem Value="D">Default</asp:ListItem>
				<asp:ListItem Value="L">Locked</asp:ListItem>
			</asp:DropDownList>
			&nbsp; </td>
          <td class="style2">
			Length SP 2 Process 
            <asp:TextBox runat="server" id="TbnCreateSP2Length0" Width="30px" CssClass="inptype">0</asp:TextBox>
&nbsp;days </td>
        </tr>
		<tr>
          <td class="style1">Previous Overdue To Remind</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnPrevOverdueToRemind" CssClass="inptype">
			0</asp:TextBox>
			&nbsp;days</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbPrevOverdueToRemind" CssClass="inptype">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
		<tr>
          <td class="style1">Days To Remind Installment</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnDaysToRemindInst" CssClass="inptype">0</asp:TextBox>
			&nbsp;days</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbDaysToRemindInst" CssClass="inptype">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
			<tr>
          <td class="style1">Days To Remind By SMS</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnDaysToRemindSms" CssClass="inptype">
			0</asp:TextBox>
			&nbsp;days</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbDaysToRemindSms" CssClass="inptype">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
			<tr>
          <td class="style1">Days Overdue To Assign To Desk Coll</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnDaysOverdueToCall" CssClass="inptype">
			0</asp:TextBox>
			&nbsp;days</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbDaysOverdueToCall" CssClass="inptype">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
			<tr>
          <td class="style1">Days Overdue To Assign To Field Coll (DCR)</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnDaysToRemindDcr" CssClass="inptype">
			0</asp:TextBox>
			&nbsp;days</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbDaysToRemindDcr" CssClass="inptype">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
			<tr>
          <td class="style1">Days Overdue To Generate RAL</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnDaysToRemindRal" CssClass="inptype">
			0</asp:TextBox>
			&nbsp;days</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbDaysToRemindRal" CssClass="inptype">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
			<tr>
          <td class="style1">RAL Period</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnRalPeriod" CssClass="inptype">0</asp:TextBox>
			&nbsp;days</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbRalPeriod" CssClass="inptype">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
			<tr>
          <td class="style1">Maximum RAL Period</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnRalExtension" CssClass="inptype">
			0</asp:TextBox>
			&nbsp;days</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbRalExtension" CssClass="inptype">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
			<tr>
          <td class="style1">Maximum Promise To Pay Days</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnMaxPromToPayDays" CssClass="inptype">
			0</asp:TextBox>
			&nbsp;days</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbMaxPromToPayDays" CssClass="inptype">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
			<tr>
          <td class="style1">Promise To Pay To Bank</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnPromToPayToBank" CssClass="inptype">
			0</asp:TextBox>
			&nbsp;days</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbPromToPayToBank" CssClass="inptype">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
			<tr>
          <td class="style1">Promise To Pay To Company</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnPromToPayToComp" CssClass="inptype">
			0</asp:TextBox>
			&nbsp;days</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbPromToPayToComp" CssClass="inptype">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
			<tr>
          <td class="style1">Promise To Pay To Supplier</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnPromToPayToSupp" CssClass="inptype">
			0</asp:TextBox>
			&nbsp;days</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbPromToPayToSupp" CssClass="inptype">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
			<tr>
          <td class="style1">Inventory Expected</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnInvExpected" CssClass="inptype">0</asp:TextBox>
			&nbsp;days</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbInvExpected" CssClass="inptype">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
			<tr>
          <td class="style1">Broken Promise Days</td>
          <td class="style2" style="width: 25%">
			<asp:TextBox runat="server" id="TbnBrokenPromiseDays" CssClass="inptype">
			0</asp:TextBox>
			&nbsp;days</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbBrokenPromiseDays" CssClass="inptype">
				<asp:ListItem>Default</asp:ListItem>
				<asp:ListItem>Locked</asp:ListItem>
				<asp:ListItem>Minimum</asp:ListItem>
				<asp:ListItem>Maximum</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
		<tr>
          <td colspan="3" class="style3">OTHER</td>
        </tr>
        <tr> 
          <td class="style1">Active</td>
          <td class="style2" colspan="2"> 
				<asp:RadioButtonList runat="server" id="rdoIsActive" RepeatDirection="Horizontal">
				<asp:ListItem Value="Y" Selected="True">Yes</asp:ListItem>
				<asp:ListItem Value="N">No</asp:ListItem>
			</asp:RadioButtonList>
			</td>
        </tr>
      </table>
      <br>
  <div align="center">
    <div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" style="height: 14px"></td>
      <td width="50%" align="right" style="height: 14px"></td>
    </tr>
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="Product.aspx" Height="20px" />&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="Product.aspx" /></td>
    </tr>
  </table>
    </div>
    
  </div>

    </div>
    
  </div>
</div>
</div>
</form>
</body>
</html>
