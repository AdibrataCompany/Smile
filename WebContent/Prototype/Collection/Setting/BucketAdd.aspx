<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head>
<body>
<form runat="server" id="frmBucketAdd">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">BUCKET - ADD</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" width="25%">Bucket ID</td>
      <td class="tdganjil" colspan="3"> 
        <input name="textfield32" type="text" class="inptype" size="10">
        <font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap">Bucket Name</td>
      <td class="tdganjil" colspan="3"> 
        <input name="textfield3" type="text" class="inptype" size="50">
        <font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap">Days Overdue</td>
      <td class="tdganjil" colspan="3"> 
        <input name="textfield3" type="text" class="inptype" size="5">
        to 
        <input name="textfield33" type="text" class="inptype" size="5">
        <font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap">Currency</td>
      <td class="tdganjil" colspan="3"> 
        <select name="select14">
          <option selected>IDR</option>
          <option>USD</option>
        </select>
      </td>
    </tr>
    <tr> 
      <td class="tdgenap">Amount Overdue</td>
      <td class="tdganjil" colspan="3"> 
        <input name="textfield34" type="text" class="inptype" size="10">
        to 
        <input name="textfield332" type="text" class="inptype" size="10">
        <font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap"> 
        <div align="left">Outstanding Balance</div>
      </td>
      <td class="tdganjil"> 
        <input name="textfield342" type="text" class="inptype" size="10">
        to 
        <input name="textfield3322" type="text" class="inptype" size="10">
        <font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap"> 
        <div align="left">Finance Type</div>
      </td>
      <td class="tdganjil"> 
        <asp:DropDownList runat="server" ID="DDLFinanceType" >
        <asp:ListItem Text="Consumer Finance"></asp:ListItem>
        <asp:ListItem Text="Leasing"></asp:ListItem>
        </asp:DropDownList>
        <font color="red">*)</font> </td>
    </tr>

    
  </table>
  <br>
	<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><a href="Bucket.Aspx"><img src="../../Images/ButtonSave.gif" width="100" height="20" border="0"> 
        <img src="../../Images/ButtonCancel.gif" width="100" height="20" border="0"></a> 
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
