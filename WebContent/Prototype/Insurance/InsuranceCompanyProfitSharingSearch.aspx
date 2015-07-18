<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled 1</title>
<link rel="stylesheet" type="text/css" href="Confins.css" />
<link rel="stylesheet" type="text/css" href="../Confins.css" />
</head>

<body>

<form id="form1" runat="server">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiabukiri"></td>
      <td align="center" class="tdtopiabu">INSURANCE COMPANY PROFIT SHARING</td>
      <td width="10" class="tdtopiabukanan"></td>
    </tr>
  </table>
<table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdganjil"> 
      <td width="200" class="tdgenap">Insurance Co.Name</td>
      <td class="tdganjil">
		<asp:DropDownList runat="server" id="DropDownList1">
			<asp:ListItem>Multi Artha Guna</asp:ListItem>
			<asp:ListItem>Panin JKT</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
        
    </table>
	 <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><a href="insurancecompanyprofitsharingEdit.aspx"><img src="../Images/ButtonSearch.gif" width="100" height="20" border="0"></a> 
        <a href="javascript:history.go(-1);"><img src="../Images/ButtonReset.gif" width="100" height="20" border="0"></a></td>
    </tr>
  </table>

</form>

</body>

</html>
