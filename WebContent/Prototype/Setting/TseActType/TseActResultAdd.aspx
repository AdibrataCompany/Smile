<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
</head>

<body>
<form id="form1" runat="server">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiorangekiri">&nbsp;</td>
      <td align="center" class="tdtopiorange">TELESALES ACTIVITY RESULT - ADD</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="25%" class="tdgenap"> Activity Type</td>
          <td class="tdganjil">xxxxx20xxxxx</td>
        </tr>
        <tr> 
          <td width="25%" class="tdgenap"> Result ID</td>
          <td class="tdganjil"><font color="red">
			<asp:TextBox runat="server" id="txtActId" CssClass="inptype">
			</asp:TextBox>
			*)</font> </td>
        </tr>
        <tr> 
          <td class="tdgenap">Result Description</td>
          <td class="tdganjil"><font color="red">
			<asp:TextBox runat="server" id="txtActDesc" CssClass="inptype" Width="250px">
			</asp:TextBox>
			*)</font> </td>
        </tr>
        </table>
    </div>
    
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
      	<asp:ImageButton runat="server" id="imbSave" ImageUrl="../../Images/ButtonSave.gif" PostBackUrl="TseActResult.aspx"></asp:ImageButton>
      	&nbsp;<asp:ImageButton runat="server" id="imbCancel" ImageUrl="../../Images/ButtonCancel.gif" PostBackUrl="TseActResult.aspx"></asp:ImageButton></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
