<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Form Kwitansi Collector Edit</title>
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
<form id="FrmKwitansiCollectorAdd" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
 	<tr class="trtopikuning"> 

      <td align="center" class="tdtopihijau" colspan="2">ADD KWITANSI COLLECTOR</td>
      <tr> 
      <td class="tdgenap" style="width: 19%; height: 24px;">Branch</td>
      <td width="86%" class="tdganjil" style="height: 24px">
       xxxxxxx99xxxxxxx</td>
    </tr>
      <tr> 
      <td class="tdgenap" style="width: 19%; height: 24px;">Kwitansi No</td>
      <td width="86%" class="tdganjil" style="height: 24px">
       <input name="textfield32223" type="text" class="inptype" size="25"> 
        <font color="red">*)</font> </td>
    </tr>
      <tr> 
      <td class="tdgenap" style="width: 19%"># of Kwitansi</td>
      <td width="86%" class="tdganjil">
       <asp:TextBox runat="server" id="TbnKwitansiNo" CssClass="InpType" Columns="3" Width="48px"></asp:TextBox>&nbsp;<font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 19%">Assigned To</td>
      <td width="86%" class="tdganjil"><input name="textfield32222" type="text" class="inptype" size="25" disabled="disabled"> 
        <a href="javascript:;" onClick="MM_openBrWindow('../../Lookup/EmployeeLookUp.htm','Product','scrollbars=yes,width=900,height=500,left=0,top=0')">
		<img src="../../Images/IconDetail.gif" width="15" height="15" border="0"></a> 
        <font color="red">*)</font> 
	  </td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnAdd" ImageUrl="../../Images/ButtonAdd.gif" PostBackUrl="FormKwintansiCollectorAdd1.aspx"></asp:ImageButton>
		&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../Images/ButtonCancel.gif" PostBackUrl="FormKwintansiCollector.aspx"></asp:ImageButton>
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
