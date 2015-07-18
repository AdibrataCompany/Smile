<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>INSURANCE PROFIT SHARING REPORT</title>
<link rel="stylesheet" type="text/css" href="../Confins.css" />
<style type="text/css">
.style1 {
	text-align: right;
}
</style>
</head>

<body>

<form id="form1" runat="server">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiabukiri"></td>
      <td align="center" class="tdtopiabu">INSURANCE PROFIT SHARING REPORT</td>
      <td width="10" class="tdtopiabukanan"></td>
    </tr>
  </table>
 <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td class="tdgenap" style="height: 29px; width: 13%;">Insurance Co.</td>
          <td width="25%" class="tdganjil" style="height: 29px"> <asp:DropDownList runat="server" id="DropDownList1">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem>Multi Artha Guna</asp:ListItem>
			</asp:DropDownList>&nbsp;</td>
                </tr>
       
              </table>
      <table width="95%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td> 
            <div align="right">
			<a href="Report/InsuranceProfitSharing.htm">	
          <asp:ImageButton runat="server" id="imgviewreport" ImageUrl="../images/Buttonviewreport.gif"></asp:ImageButton></a></div></td>
        </tr>
      </table>

</form>

<p class="style1">&nbsp;</p>

</body>

</html>
