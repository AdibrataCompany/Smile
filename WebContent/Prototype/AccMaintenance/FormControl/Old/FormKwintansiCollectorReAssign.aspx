<html>
<head>
<title>Form Receipt Collector Edit</title>
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
<form id="FrmReceiptCollectorReAssign" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
 	<tr class="trtopikuning"> 

      <td align="center" class="tdtopihijau" colspan="2">RE-ASSIGN RECEIPT FORM </td>
      <tr>
      <td class="tdgenap" style="width: 19%; height: 24px;">Branch</td>
      <td width="86%" class="tdganjil" style="height: 24px">
       xxxxxx99xxxxxx</td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 19%">Receipt No</td>
      <td width="86%" class="tdganjil">
       xxxxxxxxxxxx99</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 19%">Assigned To</td>
      <td width="86%" class="tdganjil"><input name="textfield32222" type="text" class="inptype" size="25" disabled="disabled" value="xxxxxxx99xxxxxx"> 
        <a href="javascript:;" onClick="MM_openBrWindow('../../Lookup/EmployeeLookUp.htm','Product','scrollbars=yes,width=900,height=500,left=0,top=0')">
		<img src="../../Images/IconDetail.gif" width="15" height="15" border="0"></a> 
        <font color="red">*)</font> 
	  </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 19%">Assigned Date</td>
      <td width="86%" class="tdganjil">
       99/99/9999</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 19%">Status</td>
      <td width="86%" class="tdganjil">
		xxxx999xxxx</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 19%">Notes</td>
      <td width="86%" class="tdganjil">
		<font face="Tahoma, Verdana" size="2"> 
        <input name="textfield323262324" type="text" class="inptype" size="15" style="width: 270px"></font></td>
    </tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../Images/ButtonSave.gif" PostBackUrl="FormKwintansiCollector.aspx"></asp:ImageButton>
		&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../Images/ButtonCancel.gif" PostBackUrl="FormKwintansiCollector.aspx"></asp:ImageButton>    </tr>
  </table>
</div>
</form>
</body>
</html>
