<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Language" content="en-us" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled 1</title>
<link rel="stylesheet" type="text/css" href="../Confins.css" />
</head>

<body>

<form id="form1" runat="server">
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="tdtopikiri"> 
      <td width="10" class="tdtopiabukiri" ></td>
      <td align="center" class="tdtopiabu" style="height: 20px">PRINT INSURANCE 
		BILLING</td>
      <td width="10" class="tdtopiabukanan" style="height: 20px"></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
<tr class="tdgenap">
	<td>Branch</td>
	<td><asp:DropDownList runat="server" id="cbobranch">
		<asp:ListItem>Select One</asp:ListItem>
		<asp:ListItem>Jakarta Electronic</asp:ListItem>
	</asp:DropDownList></td>
</tr>
<tr class="tdgenap">
	<td>Invoice No</td>
	<td><asp:TextBox runat="server" id="TextBox1" CssClass="inptype"></asp:TextBox></td>
</tr>
<tr class="tdgenap">
	<td>Currency</td>
	<td><asp:DropDownList runat="server" id="cbocurrency">
		<asp:ListItem>Select One</asp:ListItem>
		<asp:ListItem>IDR</asp:ListItem>
		<asp:ListItem>USD</asp:ListItem>
	</asp:DropDownList></td>
</tr>

</table>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><a href="Report/BillingReport.htm"> 
       <asp:ImageButton runat="server" id="imbprint" ImageUrl="../images/ButtonPrint.gif" PostBackUrl="Report/PrintBillingReport.htm"></asp:ImageButton></td>
    </tr>
  </table>


</form>

</body>

</html>
