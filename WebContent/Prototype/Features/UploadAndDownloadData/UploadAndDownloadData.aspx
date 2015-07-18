<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>FEATURES</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<style type="text/css">
.style1 {
	background-color: #FFFFFF;
	text-align: left;
}
.style2 {
	background-color: #F4FAFF;
	text-align: left;
}
.style3 {
	color: #FF0000;
}
.style4 {
	font-family: Verdana;
	color: #FF0000;
}
.style5 {
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmUploadAndDownLoadData" runat="server">
<div align="center">
  <table style="width: 95%">
	<tr>
		<td class="style5"><font color="red"><i>*) required field<br />
		**) Table/ View Name Column will be disable if Facility = &#39;Download&#39;</i></font></td>
	</tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopiungu2kiri">&nbsp;</td>
      <td align="center" class="tdtopiungu2">UPLOAD AND DOWNLOAD DATA&nbsp;</td>
      <td width="10" class="tdtopiungu2kanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="style2">Module</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbModule">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem>Marketing</asp:ListItem>
			<asp:ListItem>Finance</asp:ListItem>			
		</asp:DropDownList>
		&nbsp;<span class="style4">*)</span></td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Application Type</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbApplicationType">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem>Supplier</asp:ListItem>									
		</asp:DropDownList>
		&nbsp;<span class="style4">*)</span></td>
    </tr>
    <tr>
      <td width="25%" class="style2">Facility</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbFacility">
			<asp:ListItem>DownLoad</asp:ListItem>
			<asp:ListItem>UpLoad</asp:ListItem>						
		</asp:DropDownList>
		&nbsp; <span class="style4">*)</span></td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Table / View Name</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbTableName">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem>Sales</asp:ListItem>						
			<asp:ListItem>SupplierIncentive</asp:ListItem>
		</asp:DropDownList>
		&nbsp;<span class="style3">**)</span></td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Column Setting</td>
      <td class="style1">
		<textarea name="TaAsal" cols="20" style="height: 96px">BranchId
ApplicationId
AgreementNo
SalesDate
SupplierId
AOId
AOSupervisorId
CAID
GMAID
BMID
ADHID
SalesmanId
SalesSupervisorId
SupplierAdminId
TotalOTR
DownPayment
NTF
FinanceType
ProductType
NumOfAssetUnit
WayOfPayment
FloationgPeriod
InsAssetPremium
InsAssetReceivedInAdv
InsAssetCapitalized
InsAssetInsuredBy
InsAssetPaidBy
InsAssetPeriod
EffectiveRate
FlatRate
SupplierRate
PaymentFrequency
FirstInstallment
InstallmentScheme
InterestType
NumOfInstallment
Tenor
CummulativeTenor
InstallmentAmount
GracePeriod
GracePeriodType
GrossYield
OutstandingPrincipal
OutstandingInterest
TDPAmount
DiffRateAmount
IsAvalist
IsNST
IsIncentiveSupplier
MaturityDate
Notes
UsrUpd
DtmUpd

</textarea>
		<asp:ImageButton runat="server" id="BtnKiri" ImageUrl="../../images/BtnKiriPindah.JPG" PostBackUrl="UploadAndDownloadData.aspx" />&nbsp;<asp:ImageButton runat="server" id="BtnKanan" ImageUrl="../../images/BtnKananPindah.JPG" PostBackUrl="UploadAndDownloadData2.aspx" /><textarea name="TaTujuan" cols="20" style="height: 96px"></textarea>&nbsp;
		<span class="style3">**)</span></td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Condition</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbsCondition" Width="323px"></asp:TextBox>
&nbsp; <span class="style3">**)</span></td>
    </tr>
    <tr> 
      <td width="25%" class="style2">File Name</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbsFileName" Width="323px"></asp:TextBox>
&nbsp; <span class="style3">**)</span></td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Path</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbsPath" Width="290px"></asp:TextBox>
&nbsp;
		<asp:Button runat="server" Text="Browse ..." id="BtnBrowse" />&nbsp;<span class="style3">*)</span></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		&nbsp;</td>
    </tr>
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnExecution" ImageUrl="../../images/ButtonExecution.gif" PostBackUrl="UploadAndDownloadData.aspx" />
		&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
