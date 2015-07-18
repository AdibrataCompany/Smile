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
.style5 {
	text-align: left;
}
.style6 {
	background-color: #F4F4DF;
	font-weight: bold;
	font-size: 10px;
	text-align: center;
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
      <td align="center" class="tdtopihijau">PRODUCT APPROVAL SCHEME</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="40%" class="style1">Product ID</td>
          <td class="style2"> CFMOHND001</td>
        </tr>
        <tr> 
          <td class="style1">Description</td>
          <td class="style2">PRODUCT CONSUMER FINANCE NEW HONDA</td>
        </tr>
        </table>
      <br />
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">APPROVAL SCHEME LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr class="tdjudulhijau"> 
          <td class="style6" style="width: 49%">APPROVAL TYPE</td>
          <td class="style6"> APPROVAL SCHEME<font color="red">&nbsp;*)</font></td>
        </tr>
        <tr> 
          <td class="style1" style="width: 49%">Agreement Change Due Date </td>
          <td class="style1"> 
			    <asp:DropDownList runat="server" id="CmbApprAgrChangeDueDate" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        </tr>
        <tr> 
          <td class="style2" style="width: 49%">Agreement Transfer</td>
          <td class="style2"> 
			    <asp:DropDownList runat="server" id="CmbApprAgrTransfer" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        </tr>
        <tr> 
          <td class="style1" style="width: 49%">Asset Release </td>
          <td class="style1"> 
			    <asp:DropDownList runat="server" id="CmbApprAssetRelease" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        </tr>
        <tr> 
          <td class="style2" style="width: 49%">Asset Replacement </td>
          <td class="style2"> 
			    <asp:DropDownList runat="server" id="CmbApprAssetReplacement" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        </tr>
        <tr> 
          <td class="style1" style="width: 49%">Claim Advanced </td>
          <td class="style1"> 
			    <asp:DropDownList runat="server" id="CmbApprClaimAdv" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        </tr>
        <tr> 
          <td class="style2" style="width: 49%">Continue Credit </td>
          <td class="style2"> 
			    <asp:DropDownList runat="server" id="CmbApprContinueCredit" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        </tr>
        <tr> 
          <td class="style1" style="width: 49%">Collection Expense </td>
          <td class="style1"> 
			    <asp:DropDownList runat="server" id="CmbApprCollExpense" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        </tr>
        <tr> 
          <td class="style2" style="width: 49%">Debt Forgiveness </td>
          <td class="style2"> 
			    <asp:DropDownList runat="server" id="CmbApprDebtForgiveness" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        </tr>
        <tr> 
          <td class="style1" style="width: 49%">Inventory Appraisal Estimate </td>
          <td class="style1"> 
			    <asp:DropDownList runat="server" id="CmbApprInvApprEstimate" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        </tr>
        <tr> 
          <td class="style2" style="width: 49%">Full Prepayment </td>
          <td class="style2"> 
			    <asp:DropDownList runat="server" id="CmbApprFullPrepayment" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        </tr>
        <tr> 
          <td class="style1" style="width: 49%">Inv Selling For Final Sett </td>
          <td class="style1"> 
			    <asp:DropDownList runat="server" id="CmbApprInvSellingForFinalSett" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        </tr>
        <tr> 
          <td class="style2" style="width: 49%">Stop Accrued Transactions </td>
          <td class="style2"> 
			    <asp:DropDownList runat="server" id="CmbApprStopAccruedTrans" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        </tr>
        <tr> 
          <td class="style1" style="width: 49%">Partial Asset Prepayment </td>
          <td class="style1"> 
			    <asp:DropDownList runat="server" id="CmbApprParAssetPrepayment" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        </tr>
        <tr>
          <td class="style2" style="width: 49%">Request For Credit Approval - 
			Price</td>
          <td class="style2"> 
			    <asp:DropDownList runat="server" id="CmbApprRCAPrice" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        	</tr>
        <tr> 
          <td class="style2" style="width: 49%">Request For Credit Approval - 
			Risk</td>
          <td class="style2"> 
			    <asp:DropDownList runat="server" id="CmbApprRCARisk" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        </tr>
        <tr> 
          <td class="style1" style="width: 49%">Rescheduling </td>
          <td class="style1"> 
			    <asp:DropDownList runat="server" id="CmbApprRescheduling" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        </tr>
        <tr> 
          <td class="style2" style="width: 49%">Restructure </td>
          <td class="style2"> 
			    <asp:DropDownList runat="server" id="CmbApprRestructure" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        </tr>
        <tr> 
          <td class="style1" style="width: 49%">Refund To Customer </td>
          <td class="style1"> 
			    <asp:DropDownList runat="server" id="CmbApprRefundToCustomer" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        </tr>
        <tr> 
          <td class="style2" style="width: 49%">Inventory Selling </td>
          <td class="style2"> 
			    <asp:DropDownList runat="server" id="CmbApprInvSelling" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        </tr>
        <tr> 
          <td class="style1" style="width: 49%">Waive Transaction </td>
          <td class="style1"> 
			    <asp:DropDownList runat="server" id="CmbApprWaiveTrans" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        </tr>
        <tr> 
          <td class="style2" style="width: 49%">Write Off </td>
          <td class="style2"> 
			    <asp:DropDownList runat="server" id="CmbApprWriteOff" Width="300px" CssClass="inptype">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
        </tr>
        </table>
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
