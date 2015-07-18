<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
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
<form id="frmCustomerComplain" runat="server">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">CUSTOMER SERVICE - ADD COMPLAIN</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    
     <tr> 
      <td width="25%" class="tdgenap">Name</td>
      <td class="tdganjil"> Customer AdIns 000001</td>
    </tr>
     <tr> 
      <td colspan="2" class="tdjudulhijau">COMPLAIN 
      </td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap">Complain Title</td>
      <td class="tdganjil"> 
		<asp:textbox ID="txtComplain" runat="server" CssClass="inptype"></asp:textbox><font color="red">*)</font>  </td>
    </tr>
	<tr> 
      <td valign="top" class="tdgenap">Complain Detail</td>
      <td class="tdganjil"> 
		<asp:textbox ID="txtComplainDetail" runat="server" TextMode="MultiLine" CssClass="inptype" Width="494px" Height="55px"></asp:textbox><font color="red">*)</font>  </td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap">Complain Type </td>
      <td class="tdganjil"> 
		<asp:dropdownlist ID="ddlComplainType" runat="server">
		<asp:ListItem Text="Select One" Value="0"></asp:ListItem>
		<asp:ListItem Text="Customer Tidak Terpuaskan" Value="Puas"></asp:ListItem>
		<asp:ListItem Text="Complain mengenai tagihan" Value="Tagihan"></asp:ListItem>
		</asp:dropdownlist> <font color="red">*)</font>
		</td>
    </tr>

   <tr> 
      <td valign="top" class="tdgenap">Complain Date</td>
      <td class="tdganjil"> 
		<asp:textbox ID="txtComplainDate" runat="server" CssClass="inptype"></asp:textbox>&nbsp;
		HH : MM
		<asp:textbox ID="txtComplainHour" runat="server" CssClass="inptype" Width="50Px"></asp:textbox>
		<asp:textbox ID="txtComplainMinute" runat="server" CssClass="inptype" Width="50Px"></asp:textbox><font color="red">*)</font>
		</td>
    </tr>
  <tr> 

  <td valign="top" class="tdgenap">Result</td>
      <td class="tdganjil">Pending</td>
    </tr>

 </table> 
 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
      <asp:ImageButton imageurl="../Images/ButtonSave.gif" runat="server" ID="btnSaveCustomerComplain" PostBackUrl="CustomerComplainList.aspx"></asp:ImageButton>
       <asp:ImageButton imageurl="../Images/ButtonCancel.gif" runat="server" ID="btnCancelCustomerComplain" PostBackUrl="CustomerComplainList.aspx"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <br>
</div>
</form>
</body>
</html>
