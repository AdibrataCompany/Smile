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
<div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">PAYMENT RECEIVE</td>
      <td width="10" class="tdtopibirukanan">&nbsp;</td>
    </tr>
  </table>

    <table width="95%" border="0" cellspacing="1" cellpadding="2" align="center" class="tablegrid">
    <tr> 
      <td class="tdgenap">Way of Payment</td>
      <td class="tdganjil"><asp:DropDownList ID="ddlWayOfPayment" runat="server" AutoPostBack="true">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="Cash" Value="CA"></asp:ListItem>
      <asp:ListItem Text="Pick-Up" Value="PU"></asp:ListItem>
      <asp:ListItem Text="Bank" Value="BA"></asp:ListItem>
      <asp:ListItem Text="Credit Card" Value="CC"></asp:ListItem>
      <asp:ListItem Text="Prepaid" Value="CP"></asp:ListItem>
      </asp:DropDownList>
	</td>
	 <td class="tdgenap"> Bank Account</td>
      <td class="tdganjil"><select name="select3">
          <option selected>Select One</option>
          <option>Citi Bank Escrow</option>
          <option>BCA Escrow</option>
        </select></td>
    </tr>
    </table>

  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="100%" height="30" align="right">
      <% Dim NavigateURL as String
      
      if ddlWayOfPayment.SelectedValue = "PU" Then 
      		NavigateURL = "AgreementReceive.aspx?WayOfPayment=PU"
      Else       if ddlWayOfPayment.SelectedValue = "CC" Then 
    		NavigateURL = "AgreementReceive.aspx?WayOfPayment=CC"
	  Else		  if ddlWayOfPayment.SelectedValue = "BA" Then 
      		NavigateURL = "AgreementReceive.aspx?WayOfPayment=BA"
	  Else      if ddlWayOfPayment.SelectedValue = "CA" Then 
      		NavigateURL = "AgreementReceive.aspx?WayOfPayment=CA"
	  Else      if ddlWayOfPayment.SelectedValue = "CP" Then 
      		NavigateURL = "AgreementReceive.aspx?WayOfPayment=CP"
	  End If
	  hypNextPaymentReceive.NavigateURL = NavigateURL  %>
	  <asp:HyperLink ID="hypNextPaymentReceive" runat="server" ImageUrl="../../Images/ButtonNext.gif"></asp:HyperLink>
    </td>
    </tr>
  </table>


</div>
</form>
</body>
</html>
