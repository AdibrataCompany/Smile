<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled 1</title>

<link rel="stylesheet" type="text/css" href="../Confins.css" />

</head>

<body>

<form id="form1" runat="server">
<br>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiabukiri">&nbsp;</td>
      <td align="center" class="tdtopiabu">CHANGE INSCO</td>
      <td width="10" class="tdtopiabukanan">&nbsp;</td>
    </tr>
  </table>
<TABLE class="tablegrid" cellSpacing="1" cellPadding="3" width="95%"  border="0">
<TR>
<TD class="tdgenap" >Branch </TD>
<TD class="tdganjil" style="height: 26px">
<asp:DropDownList id="ddlBranch" runat="server">
	<asp:ListItem>Select One</asp:ListItem>
	<asp:ListItem>Jakarta Electronic</asp:ListItem>
</asp:DropDownList>
<FONT color="#ff0033">*)</FONT>
</TD>
</TR>
<TR>
<TD class="tdgenap" width="20%">Search By </TD>
<TD class="tdganjil">
<asp:DropDownList id="ddlsearchby" runat="server">
	<asp:ListItem>Select One</asp:ListItem>
	<asp:ListItem>Agreement No</asp:ListItem>
	<asp:ListItem>Customer Name</asp:ListItem>
</asp:DropDownList>
<asp:TextBox runat="server" id="TextBox1" CssClass="inptype"></asp:TextBox>
</TD>
</TR>
</TABLE>

<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
<TR>
<TD>
<DIV align="right">
<asp:ImageButton id="imgsearch" runat="server" width="100px" height="20px" imageurl="../Images/ButtonSearch.gif" PostBackUrl="ChangeInscoSearch.aspx" />
<asp:ImageButton id="imbReset" runat="server" imageurl="../Images/ButtonReset.gif" causesvalidation="False" />
</DIV>
</TD>
</TR>
</TABLE>
</form>

</body>

</html>
