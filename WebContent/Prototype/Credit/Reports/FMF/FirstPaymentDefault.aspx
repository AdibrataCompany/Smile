<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>First Payment Default</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head>
<body>
<form id="form1" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
 	<tr class="trtopikuning"> 

      <td align="center" class="tdtopihijau" colspan="2">FIRST PAYMENT DEFAULT</td>
      <tr>
          <td width="25%" class="tdgenap">Branch</td>
          <td width="781" class="tdganjil"><select name="select">
          	  <option selected>All</option>
              <option>Palmerah</option>
              <option>Kelapa Gading</option>
              <option>Fatmawati</option>
            </select>&nbsp; <font color="red">*) </font> </td>
        </tr>
      <tr>
      <td class="tdgenap" style="width: 11%">Aging Date</td>
      <td width="86%" class="tdganjil">
      <font face="Tahoma, Verdana" size="2">
        <input name="textfield32335" type="text" class="inptype" size="10">
        </font>
		<img src="../../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"> <font color="red">*) Default Value is Business Date 
		- 1</font></td>
    </tr>
      <tr> 
      <td class="tdgenap" style="width: 11%">Product</td>
      <td width="86%" class="tdganjil">
      <font face="Tahoma, Verdana" size="2">
        <input name="textfield32336" type="text" class="inptype" size="10" style="width: 244px; height: 16px">
        <a href="javascript:;" onClick="MM_openBrWindow('../Lookup/ProductLookUp.htm','Product','scrollbars=yes,width=900,height=500,left=0,top=0')">
		<img src="../../../Images/IconDetail.gif" width="15" height="15" border="0"></a> <font color="red">
		*) </font></font></td>
    </tr>
    <tr>
      <td class="tdgenap" style="width: 11%">FPD By</td>
      <td width="86%" class="tdganjil">
      <font face="Tahoma, Verdana" size="2">
        <input name="textfield32337" type="text" class="inptype" size="10" style="width: 244px; height: 16px">
        <a href="javascript:;" onClick="MM_openBrWindow('../Lookup/EmployeeLookUp.htm','Product','scrollbars=yes,width=900,height=500,left=0,top=0')">
		<img src="../../../Images/IconDetail.gif" width="15" height="15" border="0"></a></font></td>
    	</tr>
    <tr>
      <td class="tdgenap" style="width: 11%">Report Type</td>
      <td width="86%" class="tdganjil">
         <select name="select2">
          	  <option selected>Summary</option>
              <option>Detail</option>
            </select> <font color="red">*) </font></td>
    	</tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><a href="FirstpaymentDefaultSumRpt.htm"><img src="../../../Images/ButtonViewReport.gif" width="100" height="20" border="0"></a>
      <a href="FistPaymentDefaultDetailRpt.htm"><img src="../../../Images/ButtonViewReport.gif" width="100" height="20" border="0"></a><a href="FirstPaymentDefault.aspx">
		<asp:ImageButton runat="server" id="ImgReset" ImageUrl="../../../Images/ButtonReset.gif"></asp:ImageButton></a>
      </td>
    </tr>
  </table>
</div>
</Form>
</body>
</html>
