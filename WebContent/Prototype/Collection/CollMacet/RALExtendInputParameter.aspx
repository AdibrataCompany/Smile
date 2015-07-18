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
<form id="FrmRALInputParameter" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">PRINT RAL EXTEND</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="style2">Agreement No</td>
      <td class="style1">
		xxxxx20xxxxx</td>
    </tr>
    <tr> 
      <td width="25%" class="style2">RAL No</td>
      <td class="style1">
		xxxxx20xxxxx</td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Customer Name</td>
      <td class="style1">
		xxxxxxxx50xxxxxxxx</td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Executor Name</td>
      <td class="style1">
		xxxxxxxx50xxxxxxxx</td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Authorized By</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbsAuthorizedBy" Width="290px" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Position</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbsPosition" Width="290px" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Authorized By 1</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbsAuthorizedBy1" Width="290px" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Position</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbsPosition1" Width="290px" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Authorized By 2</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbsAuthorizedBy2" Width="290px" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Position</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbsPosition2" Width="290px" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30" class="style3">
		<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonPrint.gif" PostBackUrl="ReportSuratKuasa.aspx" /></td>
      <td width="50%" align="right">
		&nbsp; 
        <asp:ImageButton runat="server" id="BtnBack" ImageUrl="../../images/ButtonBack.gif" PostBackUrl="SKTPrintingSearch.htm" />&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
