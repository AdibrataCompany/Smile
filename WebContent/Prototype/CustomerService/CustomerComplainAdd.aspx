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
      <td align="center" class="tdtopihijau">CUSTOMER SERVICE - ADD</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Customer ID</td>
      <td class="tdganjil"> Customer000001
        <font color="red">*)</font> </td>
    </tr>
     <tr> 
      <td width="25%" class="tdgenap">Name</td>
      <td class="tdganjil"> Customer AdIns 000001
        <font color="red">*)</font> </td>
    </tr>
	 <tr> 
      <td colspan="2" class="tdjudulhijau">COMPLAIN <font color="red">*)</font> 
      </td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap">Complain</td>
      <td class="tdganjil"> 
		<textarea name="textfield342" rows="5" class="inptype" style="width: 95%"></textarea></td>
    </tr>
     <tr> 
      <td colspan="2" class="tdjudulhijau">SOLUTION <font color="red">*)</font> 
      </td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap">Solution</td>
      <td class="tdganjil"> 
		<textarea name="textfield342" rows="5" class="inptype" style="width: 95%"></textarea></td>
    </tr>
   <tr> 
      <td colspan="2" class="tdjudulhijau">RESULT <font color="red">*)</font> 
      </td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap">Result</td>
      <td class="tdganjil"> 
      <asp:DropDownList runat="server" ID="ddlResultCustomerComplain"> 
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="Solved" Value="S"></asp:ListItem>
      <asp:ListItem Text="Pending" Value="P"></asp:ListItem>
      </asp:DropDownList>
</td>
    </tr>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
      <asp:ImageButton imageurl="../Images/ButtonSave.gif" runat="server" ID="btnSaveCustomerComplain" PostBackUrl="CustomerComplain.aspx"></asp:ImageButton>
       <asp:ImageButton imageurl="../Images/ButtonCancel.gif" runat="server" ID="btnCancelCustomerComplain" PostBackUrl="CustomerComplain.aspx"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <br>
</div>
</form>
</body>
</html>
