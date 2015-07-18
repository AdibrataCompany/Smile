<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml" xmlns:v="urn:schemas-microsoft-com:vml" xmlns:o="urn:schemas-microsoft-com:office:office">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>COLLECTION</title>
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
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmPrepaymentInputParameter" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">PRINTING SIGNER</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style2" style="width: 20%">Signer 1</td>
      <td class="style1" style="width: 123px">
		<asp:TextBox runat="server" id="TbsSigner1" Width="150px" CssClass="inptype">xxxxxxxx50xxxxxxxx</asp:TextBox>
		</td>
      <td class="style2" style="width: 123px">
		Job Position Signer 1</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbsJobPositionSigner1" Width="178px" CssClass="inptype">Branch Operation Manager</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="style2" style="width: 20%">Signer 2</td>
      <td class="style1" style="width: 123px">
		<asp:TextBox runat="server" id="TbsSigner2" Width="150px" CssClass="inptype"></asp:TextBox>
		</td>
      <td class="style2" style="width: 123px">
		Job Position Signer 2</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbsJobPositionSigner2" Width="178px" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="style2" style="width: 20%">Signer 3</td>
      <td class="style1" style="width: 123px">
		<asp:TextBox runat="server" id="TbsSigner3" Width="150px" CssClass="inptype"></asp:TextBox>
		</td>
      <td class="style2" style="width: 123px">
		Job Position Signer 3</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbsJobPositionSigner3" Width="178px" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" class="style3" style="height: 4px">
		</td>
      <td width="50%" align="right" style="height: 4px">
		</td>
    </tr>
    <tr> 
      <td width="50%" height="30" class="style3">
		<asp:HyperLink runat="server" id="LinkPrintPrepayment" ImageUrl="../../images/ButtonPrint.gif" NavigateUrl="ReportPrePayment.aspx" Target="_blank">
		</asp:HyperLink>
&nbsp;</td>
      <td width="50%" align="right">
		&nbsp; 
        <asp:ImageButton runat="server" id="BtnBack" ImageUrl="../../images/ButtonBack.gif" PostBackUrl="PrepaymentPrintingSearch.aspx" />&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
