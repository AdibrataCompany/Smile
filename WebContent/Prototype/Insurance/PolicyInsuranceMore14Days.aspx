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
      <td align="center" class="tdtopiabu">POLICY INSURANCE UNRECEIVED REPORT &gt; 14 DAYS</td>
      <td width="10" class="tdtopiabukanan"></td>
    </tr>
  </table>
 <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
   <tr> 
          <td class="tdgenap" style="height: 29px; width: 13%;">Branch</td>
          <td width="25%" class="tdganjil" style="height: 29px"> <asp:DropDownList runat="server" id="cbobranch">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem>Jakarta Elektronik</asp:ListItem>
			</asp:DropDownList>&nbsp;</td>
                </tr>
       
         <tr> 
          <td class="tdgenap" style="height: 29px; width: 13%;">As Of Date</td>
          <td width="50%" class="tdganjil" style="height: 29px">
			<asp:TextBox runat="server" id="TextBox1" CssClass="inptype" Width="75px"></asp:TextBox>
			&nbsp;<asp:Image runat="server" id="Image1" ImageUrl="../images/iconcalendar.gif"></asp:Image> 
			&nbsp;</td> </tr>

              </table>
      <table width="95%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td> 
            <div align="right">
			<a href="InsuranceProfitSharing.htm">	
          <asp:ImageButton runat="server" id="imgviewreport" ImageUrl="../images/Buttonviewreport.gif" PostBackUrl="Report/InsuranceRefund_New.htm"></asp:ImageButton></a></div></td>
        </tr>
      </table>

</form>

<p class="style1">&nbsp;</p>

<p class="style1">&nbsp;&nbsp;&nbsp; </p>

</body>

</html>
