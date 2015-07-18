<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head>

<body>
<form id="form1" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">INSURANCE TERMINATION</td>
      <td width="10"><img src="../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr class="tdganjil"> 
          <td class="tdgenap">Agreement No</td>
          <td class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../AccMaintenance/AgreementView.htm','Agreement','scrollbars=yes,width=900,height=700')">xxxx20xxxx</a></td>
          <td class="tdgenap">Customer Name</td>
          <td class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700')">xxxxxxxxx50xxxxxxxxxxx</a></td>
        </tr>
        <tr class="tdganjil"> 
          <td width="20%" class="tdgenap">Insurance Co</td>
          <td width="30%" class="tdganjil">xxxx10xxxx </td>
          <td width="20%" class="tdgenap">Policy No</td>
          <td width="30%" class="tdganjil"><a href="PolicyDetailView.htm">xxxxxxx25xxxxxxx</a></td>
        </tr>
        <tr class="tdganjil"> 
          <td class="tdgenap">Contract Status</td>
          <td class="tdganjil">xxx</td>
          <td class="tdgenap">Tenor</td>
          <td class="tdganjil">99 months</td>
        </tr>
        <tr class="tdganjil"> 
          <td class="tdgenap">Asset Description</td>
          <td class="tdganjil">xxxxxxxxxxxxxx50xxxxxxxxxxxxxx</td>
          <td class="tdgenap">&nbsp;</td>
          <td class="tdganjil">&nbsp;</td>
        </tr>
        <tr class="tdganjil"> 
          <td class="tdgenap">Insurance Length</td>
          <td class="tdganjil">99 months</td>
          <td class="tdgenap">Insurance Period</td>
          <td align="left" class="tdganjil">dd/mm/yyyy to dd/mm/yyyy</td>
        </tr>
        <tr class="tdganjil"> 
          <td class="tdgenap">Insured By</td>
          <td>xxxx10xxxx</td>
          <td class="tdgenap">Paid By</td>
          <td align="left" class="tdganjil">xxxx10xxxx</td>
        </tr>
        <tr class="tdganjil"> 
          <td class="tdgenap">Main Coverage</td>
          <td>xxxx10xxxx</td>
          <td class="tdgenap">Additional Coverage</td>
          <td align="left" class="tdganjil">xxxx10xxxx</td>
        </tr>
         <tr class="tdganjil"> 
          <td class="tdgenap">Termination Date</td>
          <td colspan="3" class="tdganjil"><input type="text" name="textfield2222" class="inptype" size="15"> 
            <img src="../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"></td>
        </tr>

        <tr class="tdganjil"> 
          <td class="tdgenap">Termination Reason</td>
          <td colspan="3" class="tdganjil"><select name="select2">
              <option selected>Prepayment</option>
              <option>Asset Selling</option>
              <option>Contract Expired</option>
            </select></td>
        </tr>
        <tr class="tdganjil"> 
          <td class="tdgenap">Notes</td>
          <td colspan="3" class="tdganjil"><textarea name="textfield22222" cols="80" rows="5" class="inptype"></textarea></td>
        </tr>
      </table>
     
  <br>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiabukiri">&nbsp;</td>
      <td align="center" class="tdtopiabu">PREMIUM TO CUSTOMER</td>
      <td width="10" class="tdtopiabukanan">&nbsp;</td>
    </tr>
  </table>
  
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      
      <td width="25%" class="tdgenap">SRCC Premium</td>
      <td width="25%" class="tdganjil" align="right"><asp:Label runat="server" id="lblSRCCPremium" Text="9,999,999,999"></asp:Label ></td>
       <td class="tdgenap">TS Premium</td>
      <td class="tdganjil"  align="right"><asp:Label runat="server" id="lblTSPremium" Text="9,999,999,999"></asp:Label ></td>
    </tr>
    <tr> 
     
      <td class="tdgenap">SRCCTS Premium</td>
      <td class="tdganjil"  align="right"><asp:Label runat="server" id="lblSRCCTSPremium" Text="9,999,999,999"></asp:Label ></td>
       <td class="tdgenap">RSMD</td>
      <td class="tdganjil"  align="right"><asp:Label runat="server" id="lblRSMDPremium" Text="9,999,999,999"></asp:Label ></td>
    </tr>
    <tr> 
      
      <td class="tdgenap">TPL Premium</td>
      <td class="tdganjil" align="right"><asp:Label runat="server" id="lblTPLPremium" Text="9,999,999,999"></asp:Label ></td>
      <td class="tdgenap">AOG Premium</td>
      <td class="tdganjil"  align="right"><asp:Label runat="server" id="lblAOGPremium" Text="9,999,999,999"></asp:Label ></td>
    </tr>

    <tr> 
      
      <td class="tdgenap">Earthquake Premium</td>
      <td class="tdganjil" align="right"><asp:Label runat="server" id="lblEarthquakePremium" Text="9,999,999,999"></asp:Label ></td>
      <td class="tdgenap">Flood Premium</td>
      <td class="tdganjil" align="right"><asp:Label runat="server" id="lblFlodPremium" Text="9,999,999,999"></asp:Label ></td>
    </tr>
    <tr>
      <td width="25%" class="tdgenap">Loading Fee Premium</td>
      <td width="25%" class="tdganjil" align="right">
		<asp:Label runat="server" id="lblLoadingFeePremium" Text="9,999,999,999"></asp:Label ></td>
		<td class="tdganjil" colspan="2"></td>
    </tr>
    <tr>
      <td width="25%" class="tdgenap"><B>Main Premium</B></td>
      <td width="25%" class="tdganjil" align="right"><asp:Label runat="server" id="lblMainPremium" Text="9,999,999,999"></asp:Label ></td>
       <td class="tdgenap"><B>Total Additional Premium</B></td>
      <td class="tdganjil" align="right"><asp:Label runat="server" id="lblTotalAdditionalPremium" Text="9,999,999,999"></asp:Label ></td>
 	 </tr>
	<tr> 
	  <td class="tdgenap"><B>Discount</B></td>
      <td class="tdganjil" align="right"><asp:Label runat="server" id="lblDiscount" Text="9,999,999,999"></asp:Label ></td>
      <td class="tdgenap"><B>Total Premium To Customer</B></td>
      <td class="tdganjil" align="right"><asp:Label runat="server" id="lblTotalPremiumToCust" Text="9,999,999,999"></asp:Label ></td>   
    </tr>
  </table>
  <br>
  				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopi">
						<TD class="tdtopiabukiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopiABU" align="center">PREMIUM TO INSCO</TD>
						<TD class="tdtopiabukanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
					<TR>
						<TD class="tdgenap" width="20%">Main Premium</TD>
						<TD class="tdganjil" align="right" width="30%">
							&nbsp;9,999,999,999</TD>
						<TD class="tdgenap" width="20%">SRCC Premium</TD>
						<TD class="tdganjil" align="right" width="30%">
							&nbsp;9,999,999,999</TD>
					</TR>
					 <tr> 
      
      <td width="25%" class="tdgenap">SRCC Premium</td>
      <td width="25%" class="tdganjil" align="right">
		<asp:Label runat="server" id="lblToInscoSRCCPremium" Text="9,999,999,999"></asp:Label ></td>
       <td class="tdgenap">TS Premium</td>
      <td class="tdganjil" align="right">
		<asp:Label runat="server" id="lblToInscoTSPremium" Text="9,999,999,999"></asp:Label ></td>
    </tr>
    <tr> 
     
      <td class="tdgenap">SRCCTS Premium</td>
      <td class="tdganjil" align="right">
		<asp:Label runat="server" id="lblToInscoSRCCTSPremium" Text="9,999,999,999"></asp:Label ></td>
       <td class="tdgenap">RSMD</td>
      <td class="tdganjil" align="right">
		<asp:Label runat="server" id="lblToInscoRSMDPremium" Text="9,999,999,999"></asp:Label ></td>
    </tr>
    <tr> 
      
      <td class="tdgenap">TPL Premium</td>
      <td class="tdganjil" align="right">
		<asp:Label runat="server" id="lblToInscoTPLPremium" Text="9,999,999,999"></asp:Label ></td>
      <td class="tdgenap">AOG Premium</td>
      <td class="tdganjil" align="right">
		<asp:Label runat="server" id="lblToInscoAOGPremium" Text="9,999,999,999"></asp:Label ></td>
    </tr>

    <tr> 
      
      <td class="tdgenap">Earthquake Premium</td>
      <td class="tdganjil" align="right">
		<asp:Label runat="server" id="lblToInscoEarthquakePremium" Text="9,999,999,999"></asp:Label ></td>
      <td class="tdgenap">Flood Premium</td>
      <td class="tdganjil" align="right">
		<asp:Label runat="server" id="lbToInscolFlodPremium" Text="9,999,999,999"></asp:Label ></td>
    </tr>
    <tr>
      <td width="25%" class="tdgenap">Loading Fee Premium</td>
      <td width="25%" class="tdganjil" align="right">
		<asp:Label runat="server" id="lblToInscoLoadingFeePremium" Text="9,999,999,999"></asp:Label ></td>
		<td colspan="2"  class="tdganjil"></td>
    </tr>
					<TR>
						<TD class="tdgenap">Premium ToInsco</TD>
						<TD class="tdganjil" align="right">
							&nbsp;9,999,999,999</TD>
						<TD class="tdgenap"></TD>
						<TD class="tdganjil"></TD>
					</TR>
				</TABLE>

      <table width="95%" border="0" cellspacing="0" cellpadding="0">
        <tr> 
          <td width="50%" height="30">&nbsp;</td>
          <td width="50%" align="right"><a href="InsuranceTerminationCalculate.aspx"><img src="../Images/ButtonCalculate.gif" width="100" height="20" border="0"> 
            <img src="../Images/ButtonCancel.gif" width="100" height="20" border="0"></a> 
          </td>
        </tr>
      </table>
    </div>
  </div>
  </div>
</form>
</body>
</html>
