<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

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
.style5 {
	text-align: left;
	color: #FF0000;
}
</style>
</head>

<body>
<form id="FrmCasesAdd" runat="server">
<div align="center">
  <table style="width: 100%">
	<tr>
		<td class="style5">&nbsp;&nbsp;&nbsp; <font color="red"><i>*)&nbsp;&nbsp; required field</i></font></td>
	</tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">CASES - ADD</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style2" style="width: 30%">Cases ID</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbsCasesId" CssClass="inptype"></asp:TextBox>
&nbsp; <font color="red"><i>*)</i></font></td>
    </tr>
    <tr> 
      <td class="style2" style="width: 30%">Description</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbsCasesDescription" Width="287px" CssClass="inptype"></asp:TextBox>
		&nbsp;<font color="red"><i>*)</i></font></td>
    </tr>
    <tr> 
      <td class="style2" style="width: 30%">Cases Value</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbCasesValue" CssClass="inptype">
		    <asp:ListItem>Ordinary</asp:ListItem>
		    <asp:ListItem>Warning</asp:ListItem>
			<asp:ListItem>Fatal</asp:ListItem>			
		</asp:DropDownList>
		&nbsp;<font color="red"><i>*)</i></font></td>
    </tr>
    <tr> 
      <td class="style2" style="width: 30%">Is Active</td>
      <td class="style1">
		<asp:CheckBox runat="server" id="CbIsActive" Checked="True" CssClass="inptype" /></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="Cases.aspx" />&nbsp; 
        <asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="Cases.aspx" />&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
