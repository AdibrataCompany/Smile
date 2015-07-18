<html><head><title>Payment Point Report</title><meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"><link href="../../../Confins.css" rel="stylesheet" type="text/css"><script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script></head><body><form id="form1" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
 	<tr class="trtopikuning"> 

      <td align="center" class="tdtopihijau" colspan="2">PAYMENT POINT 
		TRANSACTION REPORT</td>
      <tr>
          <td class="tdgenap" style="width: 16%">Bank Name</td>
          <td width="781" class="tdganjil">
      		<select name="select5">
              <option selected>Bank BCA</option>
              <option>Bank BNI</option>
              <option>Bank BRI</option>
            </select><font color="red"> *)</font></td>
        </tr>
      <tr>
          <td class="tdgenap" style="width: 16%">Type</td>
          <td width="781" class="tdganjil">
      		<select name="select4">
              <option selected>Download</option>
              <option>Upload</option>
            </select>
      		<font color="red">*)</font></td>
        </tr>
      <tr> 
      <td class="tdgenap" style="width: 16%">Posting Date</td>
      <td width="86%" class="tdganjil">
      <font face="Tahoma, Verdana" size="2">
        <input name="textfield32333" type="text" class="inptype" size="10">
        </font>
		<img src="../../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"> 
		To
      <font face="Tahoma, Verdana" size="2">
        <input name="textfield32334" type="text" class="inptype" size="10">
        </font>
		<img src="../../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"> </td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">&nbsp;<a href="PaymentPointTransactionReport.htm"><img src="../../../Images/ButtonViewReport.gif" width="100" height="20" border="0"></a>
      <asp:ImageButton runat="server" id="ImgReset" ImageUrl="../../../Images/ButtonReset.gif"></asp:ImageButton>
      </td>
    </tr>
  </table>
</div>
</Form>
</body>
</html>
