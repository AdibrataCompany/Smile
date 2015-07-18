<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled 1</title>
<link rel="stylesheet" type="text/css" href="../Confins.css" />
<style type="text/css">
.style1 {
	text-align: right;
}
.style2 {
	font-family: Verdana, Arial, Tahoma, sans-serif;
}
.style3 {
	background-color: #FFFFFF;
	text-align: right;
}
</style>
</head>

<body>

<form id="form1" runat="server">
<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
<TR class="trtopiabu">
	<TD class="tdtopiabukiri" width="10" height="20">&nbsp;</TD>
	<TD class="tdtopiabu" align="center">REFUND CALCULATION&nbsp;</TD>
	<TD class="tdtopiabukanan" width="10">&nbsp;</TD>
</TR>
</TABLE>
<TABLE class="tablegrid" id="Table2" cellSpacing="1" cellPadding="2" width="95%" border="0">
	<TR class="tdganjil">
		<TD class="tdgenap" style="width: 160px">Agreement No</TD>
		<TD class="tdganjil"><asp:hyperlink id="HplinkAgreementNo" runat="server" text="xxxxxxx" NavigateUrl="../AccMaintenance/AgreementView.htm"></asp:hyperlink></TD>
		<TD class="tdgenap">Customer Name</TD>
		<TD class="tdganjil">
			<asp:hyperlink id="HpLinkCustName" text="xxxxxxx" runat="server" NavigateUrl="../Credit/ViewPersonalCustomer.htm"></asp:hyperlink></TD>
	</TR>
	<TR>
									<TD class="tdgenap" width="25%">Currency</TD>
									<TD class="tdganjil" width="25%">
										<asp:label id="lblCurrency" runat="server"  text="xxxxxxx"></asp:label></TD>
									<TD class="tdgenap" width="25%">Maturity Date</TD>
									<TD class="tdganjil" width="25%">
										<asp:label id="lblMaturityDate" runat="server" Text="dd/MM/yyyy"></asp:label></TD>
								</TR>
								<TR>
									<TD class="tdgenap" width="25%">Premium By Customer</TD>
									<TD class="tdganjil" width="25%" align="right">
										<asp:label id="lblPrembyCust" runat="server" Text="999,9999,999"></asp:label></TD>
									<TD class="tdgenap" width="25%"></TD>
									<TD class="tdganjil" width="25%"></TD>
								</TR>
								<TR>
									<TD class="tdgenap" width="25%">Admin Fee To Customer</TD>
									<TD class="tdganjil" align="right" width="25%">
										<asp:label id="lblAdminFee" runat="server" Text="999,9999,999"></asp:label></TD>
									<TD class="tdgenap" width="25%">Meterai Fee To Customer</TD>
									<TD class="tdganjil" align="right" width="25%">
										<asp:label id="lblMeteraiFee" runat="server" Text="999,9999,999"></asp:label></TD>
								</TR>
								<TR>
									<TD class="tdgenap" width="25%">Insurance Company</TD>
									<TD class="tdganjil" width="25%">
										<asp:label id="lblInsuranceCompany" runat="server" Text="xxxxx"></asp:label></TD>
									<TD class="tdgenap" width="25%">Premium Amount To Insco</TD>
									<TD class="tdganjil" align="right" width="25%">
										<asp:label id="lblPremToInsco" runat="server" Text="999,9999,999"></asp:label></TD>
								</TR>
								<TR>
									<TD class="tdgenap" width="25%">Admin Fee To Insco</TD>
									<TD class="tdganjil" align="right" width="25%">
										<asp:label id="lblAdminFeeInsco" runat="server" Text="999,9999,999"></asp:label></TD>
									<TD class="tdgenap" width="25%">Meterai Fee To Insco</TD>
									<TD class="tdganjil" align="right" width="25%">
										<asp:label id="lblMeteraiFeeInsco" runat="server" Text="999,9999,999"></asp:label></TD>
								</TR>
								<TR>
									<TD class="tdgenap" width="25%">Budget Refund For Renewal</TD>
									<TD class="tdganjil" align="right" width="25%">
										<asp:label id="lblBudget" runat="server" Text="999,9999,999"></asp:label></TD>
									<TD class="tdgenap" width="25%">Insurance Income This Year</TD>
									<TD class="tdganjil" align="right" width="25%">
										<asp:label id="lblInsuranceIncome" runat="server" Text="999,9999,999"></asp:label></TD>
								</TR>
</TABLE>
<table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="17%" class="tdjudulabu" style="height: 17px">TO</td>
      <td width="12%" class="tdjudulabu" style="height: 17px">REFUND </td>
      <td width="12%" class="tdjudulabu" style="height: 17px">TAX</td>
      <td width="12%" class="tdjudulabu" style="height: 17px">NET TOTAL</td>
      <td width="12%" class="tdjudulabu" style="height: 17px">ACCOUNT </td>
    </tr>
    <tr> 
      <td class="tdjudulabu">&nbsp;</td>
      <td class="tdjudulabu">INSURANCE</td>
      <td class="tdjudulabu">&nbsp;</td>
      <td class="tdjudulabu">&nbsp;</td>
      <td class="tdjudulabu">&nbsp;</td>
    </tr>
    <tr class="tdganjil"> 
      <td>Main Supplier</td>
      <td class="style1">
										<asp:label id="lblPrembyCust0" runat="server" Text="999,9999,999"></asp:label></td>
      <td class="style1">
										<asp:label id="lblPrembyCust2" runat="server" Text="999,9999,999"></asp:label></td>
      <td class="style1">
										<asp:label id="lblPrembyCust8" runat="server" Text="999,9999,999"></asp:label></td>
      <td>xxxxx-xxxxx-334343</td>
    </tr>
    <tr class="tdganjil"> 
      <td>Salesman 1 </td>
      <td class="style1">
										<asp:label id="lblPrembyCust1" runat="server" Text="999,9999,999"></asp:label></td>
      <td class="style1">
										<asp:label id="lblPrembyCust3" runat="server" Text="999,9999,999"></asp:label></td>
      <td class="style1">
										<asp:label id="lblPrembyCust9" runat="server" Text="999,9999,999"></asp:label></td>
      <td>xxxxx-xxxxx-334343</td>
      </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiabukiri">&nbsp;</td>
      <td align="center" class="tdtopiabu">COMMISION FOR ANOTHER SUPPLIER</td>
      <td width="10" class="tdtopiabukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td align="center" class="tdjudulabu">SUPPLIER</td>
      <td align="center" class="tdjudulabu">SALESMAN</td>
      <td class="tdjudulabu">REFUND INSURANCE&nbsp;</td>
      <td class="tdjudulabu">TAX</td>
      <td class="tdjudulabu">NET TOTAL</td>
      <td align="center" class="tdjudulabu">ACCOUNT</td>
      <td align="center" class="tdjudulabu">DELETE</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><font face="Tahoma, Verdana" size="2">xxxx50xxxx </font> </td>
      <td align="center"><font face="Tahoma, Verdana" size="2">xxxx50xxxx </font></td>
      <td class="style1">
										<asp:label id="lblPrembyCust4" runat="server" Text="999,9999,999"></asp:label>
		<font face="Tahoma, Verdana" size="2"> 
		&nbsp;</font></td>
      <td class="style1"><font face="Tahoma, Verdana" size="2"> 
										<asp:label id="lblPrembyCust5" runat="server" Text="999,9999,999"></asp:label>&nbsp;</font></td>
      <td class="style1"><font face="Tahoma, Verdana" size="2"> 
										<asp:label id="lblPrembyCust10" runat="server" Text="999,9999,999"></asp:label>&nbsp;</font></td>
      <td><div align="left"><span class="style2">Supplier</span><font face="Tahoma, Verdana" size="2"> 1333444555</font></div></td>
      <td align="center"><asp:ImageButton runat="server" id="ImageButton1" ImageUrl="../images/icondelete.gif"></asp:ImageButton></td>
    </tr>
  </table>
    <br>

<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiabukiri">&nbsp;</td>
      <td align="center" class="tdtopiabu">COMMISION FOR ANOTHER SALESMAN</td>
      <td width="10" class="tdtopiabukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td align="center" class="tdjudulabu">SUPPLIER</td>
      <td align="center" class="tdjudulabu">SALESMAN</td>
      <td class="tdjudulabu">REFUND INSURANCE&nbsp;</td>
      <td class="tdjudulabu">TAX</td>
      <td class="tdjudulabu">NET TOTAL</td>
      <td align="center" class="tdjudulabu">ACCOUNT</td>
      <td align="center" class="tdjudulabu">DELETE</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><font face="Tahoma, Verdana" size="2"> 
        xxxx50xxxx&nbsp; 
        </font></td>
      <td align="center"><font face="Tahoma, Verdana" size="2">xxxx50xxxx </font></td>
      <td class="style1"><font face="Tahoma, Verdana" size="2"> 
										<asp:label id="lblPrembyCust6" runat="server" Text="999,9999,999"></asp:label>&nbsp;</font></td>
      <td class="style1"><font face="Tahoma, Verdana" size="2"> 
										<asp:label id="lblPrembyCust7" runat="server" Text="999,9999,999"></asp:label>&nbsp;</font></td>
      <td class="style1"><font face="Tahoma, Verdana" size="2"> 
										<asp:label id="lblPrembyCust11" runat="server" Text="999,9999,999"></asp:label>&nbsp;</font></td>
      <td><div align="left"><font face="Tahoma, Verdana" size="2"> Salesman 1333444555</font></div></td>
      <td align="center">
		<asp:ImageButton runat="server" id="ImageButton2" ImageUrl="../images/icondelete.gif"></asp:ImageButton></td>
    </tr>
  </table>
   <br>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
								<TR class="tdganjil">
									<td class="tdgenap" style="width: 299px"><STRONG>Total Refund</STRONG>
									</td>
									<TD class="style3">
										<font face="Tahoma, Verdana" size="2"> 
										<asp:label id="lblPrembyCust12" runat="server" Text="999,9999,999"></asp:label></font>
									</TD>
								</TR>
								<TR class="tdganjil">
									<td class="tdgenap" style="width: 299px">Insurance Income</td>
									<TD class="style3">
										<font face="Tahoma, Verdana" size="2"> 
										<asp:label id="lblPrembyCust13" runat="server" Text="999,9999,999"></asp:label></font>
									</TD>
								</TR>
								<TR class="tdganjil">
									<td class="tdgenap" style="width: 299px">O/S Budget For Renewal Refund</td>
									<TD class="style3">
										<font face="Tahoma, Verdana" size="2"> 
										<asp:label id="lblPrembyCust14" runat="server" Text="999,9999,999"></asp:label></font>
									</TD>
								</TR>
							</table>
							<br>
							<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
								<TR vAlign="bottom">
									<TD align="right">
										<asp:ImageButton id="imbsave" runat="server" ImageUrl="../images/buttonsave.gif" PostBackUrl="RefundRealization.aspx"></asp:ImageButton>
										<asp:ImageButton id="imbcancel" runat="server" ImageUrl="../images/buttoncancel.gif" PostBackUrl="RefundRealization.aspx"></asp:ImageButton>
									</TD>
								</TR>
							</TABLE>
</form>

</body>

</html>
