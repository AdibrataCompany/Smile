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
.style2 {
	font-size: xx-small;
}
</style>
</head>
<body>
<form id="frmPaymentReceive" runat="server">
<%@ Import Namespace="System.Configuration" %>
<%@ Import Namespace="System.Data.SqlClient" %>
<%@ Import Namespace="System.Data" %>
<%@ Import Namespace="System.Text.RegularExpressions" %>
<%@ Import Namespace="System.Text" %>
<%@ Import Namespace="System.IO" %>
<SCRIPT language="vb" runat="server">
   	Dim sWayOfPayment as String
    Sub Page_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
				lblWayOfPayment.Visible = True
	    	If Request.Querystring ("WayOfPayment") = "CP" then 
	    		pnlBank.Visible= False
	    		pnlFormControl.Visible= False
	    		pnlCreditCard.Visible = False
	    		lblWayOfPayment.Text = "Contract Prepaid"
	    	Else If Request.Querystring ("WayOfPayment") = "CA" then 
	    		pnlBank.Visible= True
	    		pnlFormControl.Visible= False
	    		pnlCreditCard.Visible = False
				lblWayOfPayment.Text = "Cash"
	    	Else If Request.Querystring ("WayOfPayment") = "BA" then 
	    		pnlBank.Visible= True
	    		pnlFormControl.Visible= False
	    		pnlCreditCard.Visible = False
				lblWayOfPayment.Text = "Bank"
	    	Else If Request.Querystring ("WayOfPayment") = "CC" then 
	    		pnlBank.Visible= False
	    		pnlFormControl.Visible= False
	    		pnlCreditCard.Visible = True
				lblWayOfPayment.Text = "Credit Card"
	    	Else If Request.Querystring ("WayOfPayment") = "PU" then 
	    		pnlBank.Visible= False
	    		pnlFormControl.Visible= True
	    		pnlCreditCard.Visible = False
				lblWayOfPayment.Text = "Form Control"
	    	End If
	    	imbSave.NavigateUrl = "AgreementReceive.aspx?WayOfPayment=" + Request.QueryString("WayOfPayment")
	    	imbCancel.NavigateUrl = "AgreementReceive.aspx?WayOfPayment=" + Request.QueryString("WayOfPayment")
       End Sub
</script>

<div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">PAYMENT RECEIVE</td>
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
         <td class="tdgenap">Way of Payment</td>
         <td class="tdganjil" colspan="3"><asp:Label ID="lblWayOfPayment" runat="server" Text="txt"></asp:label></td>
    </tr>
    </table>
    
     <asp:Panel ID="pnlBank" runat="server">
	  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
		<tr>
			<td class="tdgenap" width="20%">Bank Account</td>
			<td class="tdganjil">
			<asp:Label ID="lblBankAccount" runat="server">Bank Escrow</asp:Label>
			</td>
		</tr>
		</table>
     </asp:panel>
	  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td colspan="4" class="tdjudulbiru">PAYMENT DETAIL</td>
    </tr>
    </table>
	  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr>
      <td class="tdgenap" style="height: 22px">Receive From</td>
      <td class="tdganjil" style="height: 22px"><input name="textfield32" type="text" class="inptype" size="30"></td>
      <td class="tdgenap" style="height: 22px">Reference No</td>
      <td class="tdganjil" style="height: 22px"><input name="textfield3222" type="text" class="inptype" size="20"></td>
    </tr>
    <tr> 
    
      <td class="tdgenap"  width="20%">Value Date</td>
      <td class="tdganjil"><input name="textfield322" type="text" class="inptype" value="dd/mm/yyyy" size="15"> 
        <img src="../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle">
        <asp:ImageButton ID="imbCalcValueDate" runat="server" ImageUrl="../../Images/ButtonCalculate.gif"></asp:ImageButton>
        </td>
              <td class="tdgenap">Amount Receive</td>
      <td class="tdganjil"><input name="textfield3223" type="text" class="inptype" size="20" value="999999999"></td>

    </tr>
    <tr> 
      <td valign="top" class="tdgenap">Currency ID</td>
      <td colspan="3" class="tdganjil">IDR</td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap">Notes</td>
      <td colspan="3" class="tdganjil"><textarea name="textfield324" cols="80" class="inptype"></textarea></td>
    </tr>
    </table>
    <asp:Panel ID="pnlFormControl" runat="server">
	<table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">	
  	<tr>
      <td class="tdgenap" width="20%" style="height: 24px">Form Control Number</td>
      <td class="tdganjil" style="height: 24px"><input name="textfield32222" type="text" class="inptype" size="25" disabled="disabled"> 
        <a href="javascript:;" onClick="MM_openBrWindow('../Lookup/EmployeeLookUp.htm','Product','scrollbars=yes,width=900,height=500,left=0,top=0')">
		<img src="../../Images/IconDetail.gif" width="15" height="15" border="0"></a>
		<font color="red" class="style2">*) required if WOP is Pick-Up</font></td>
    	</tr>
      </table>
    </asp:Panel>

    <asp:Panel ID="pnlCreditCard" runat="server">
	<table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
		<tr>
			<td class="tdjudulbiru">CREDIT CARD</td>
		</tr>
	</table>
    <table align="center" width="95%">
    <tr>
    	<td class="tdgenap" width="20%">Credit Card Number</td>
	   	<td class="tdganjil" width="30%"><asp:TextBox ID="txtCreditCardNumber" runat="server" CssClass="inptype"></asp:TextBox></td>
    	<td class="tdgenap" width="20%">Card Holder Name</td>
	   	<td class="tdganjil" width="30%"><asp:TextBox ID="txtCreditCardHolderName" runat="server" CssClass="inptype"></asp:TextBox></td>
    </tr>
    <tr>
     	<td class="tdgenap" width="20%">Bank Issued Name</td>
	   	<td class="tdganjil" width="30%">
	   	<asp:DropDownList ID="ddlBankNameIssued" runat="server" CssClass="inptype">
	   	<asp:ListItem text="Select One" Value="0"></asp:ListItem>
	   	<asp:ListItem text="Citibank" Value="Citibank"></asp:ListItem>
	   	<asp:ListItem text="BCA" Value="BCA"></asp:ListItem>

	   	</asp:DropDownList></td>
    	<td class="tdgenap" width="20%">Card Type</td>
	   	<td class="tdganjil" width="30%">
	   	<asp:DropDownList ID="ddlCardType" runat="server" CssClass="inptype">
	   	<asp:ListItem text="Select One" Value="0"></asp:ListItem>
	   	<asp:ListItem text="Visa" Value="Visa"></asp:ListItem>
	   	<asp:ListItem text="Master" Value="Master"></asp:ListItem>
	   	<asp:ListItem text="American Express" Value="Amex"></asp:ListItem>
	   	</asp:DropDownList>
		</td>
		</tr>
		<tr>
		<td class="tdgenap" width="20%">Approval Code</td>
	   	<td class="tdganjil" width="30%"><asp:TextBox ID="txtCreditCardApprovalCode" runat="server" CssClass="inptype"></asp:TextBox>
		</td>
		<td class="tdgenap" width="20%">Credit Card Charges</td>
	   	<td class="tdganjil" width="30%"><asp:TextBox ID="txtCreditCardCharges" runat="server" CssClass="inptype"></asp:TextBox>
		</td>

	</tr>
  </table>
  </asp:Panel>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">PAYMENT ALLOCATION DETAIL</td>
      <td width="10" class="tdtopibirukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdjudulbiru"> 
      <td width="25%"><div align="center">PAYMENT ALLOCATION</div></td>
      <td style="width: 15%"><div align="center">OS AMOUNT OVER DUE AS OF DD/MM/YYYY</div></td>
      <td style="width: 13%"><div align="center">AMOUNT RECEIVE</div></td>
      <td width="30%" align="right"><div align="center">DESCRIPTION</div></td>
    </tr>
    <tr class="tdganjil"> 
      <td>Insurance Premium</td>
      <td style="width: 15%"><div align="right">999,999,999.99</div></td>
      <td style="width: 13%"> <div align="center"> 
          <input name="textfield32225" type="text" class="inptype" size="18">
        </div></td>
      <td align="right"><div align="center"> 
          <input name="textfield3222113" type="text" class="inptype" size="25" style="width: 297px; height: 14px">
        </div></td>
    </tr>
    <tr class="tdgenap"> 
      <td>Installment Due</td>
      <td style="width: 15%"><div align="right">999,999,999.99</div></td>
      <td style="width: 13%"> <div align="center"> 
          <input name="textfield322252" type="text" class="inptype" size="18">
        </div></td>
      <td align="right"><div align="center"> 
          <input name="textfield32221145" type="text" class="inptype" size="25" style="width: 297px; height: 14px">
        </div></td>
    </tr>
    <tr class="tdganjil"> 
      <td> Installment Late Charges</td>
      <td style="width: 15%"><div align="right">999,999,999.99</div></td>
      <td style="width: 13%"> <div align="center"> 
          <input name="textfield322254" type="text" class="inptype" size="18">
        </div></td>
      <td align="right"><div align="center"> 
          <input name="textfield32221146" type="text" class="inptype" size="25" style="width: 297px; height: 14px">
        </div></td>
    </tr>
    <tr class="tdgenap"> 
      <td>Insurance Late Charges</td>
      <td style="width: 15%"><div align="right">999,999,999.99</div></td>
      <td style="width: 13%"> <div align="center"> 
          <input name="textfield322255" type="text" class="inptype" size="18">
        </div></td>
      <td align="right"><div align="center"> 
          <input name="textfield32221147" type="text" class="inptype" size="25" style="width: 297px; height: 14px">
        </div></td>
    </tr>
    <tr class="tdganjil"> 
      <td>Charge Receivebale</td>
      <td style="width: 15%"><div align="right">999,999,999.99</div></td>
      <td style="width: 13%"> <div align="center"> 
          <input name="textfield322256" type="text" class="inptype" size="18">
        </div></td>
      <td align="right"><div align="center"> 
          <input name="textfield32221148" type="text" class="inptype" size="25" style="width: 297px; height: 14px">
        </div></td>
    </tr>
    <tr class="tdganjil"> 
      <td>Prepaid</td>
      <td style="width: 15%"><div align="right"></div></td>
      <td style="width: 13%"> <div align="center"> 
          <input name="textfield322258" type="text" class="inptype" size="18">
        </div></td>
      <td align="right"><div align="center"> 
          <input name="textfield32221150" type="text" class="inptype" size="25" style="width: 297px; height: 14px">
        </div></td>
    </tr>
    <tr class="tdgenap"> 
      <td>Other</td>
      <td style="width: 15%"> <div class="style2">
          <select name="select3">
            <option selected>Select One</option>
            <option>Administration Fee</option>
            <option>Other Fee</option>
            <option>Pick-Up Fee</option>
          </select>
        </div></td>
      <td style="width: 13%"> <div align="center"> 
          <input name="textfield322257" type="text" class="inptype" size="18">
        </div></td>
      <td align="right"><div align="center"> 
          <input name="textfield32221151" type="text" class="inptype" size="25" style="width: 297px; height: 14px">
        </div></td>
    </tr>
  </table>
  <br>
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
