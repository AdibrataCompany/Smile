<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Laporan Status Kredit</title>
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

      <td align="center" class="tdtopihijau" colspan="2">LAPORAN STATUS KREDIT</td>
      <tr>
          <td width="25%" class="tdgenap">Branch</td>
          <td width="781" class="tdganjil"><select name="select">
          	  <option selected>All</option>
              <option>Palmerah</option>
              <option>Kelapa Gading</option>
              <option>Fatmawati</option>
            </select> </td>
        </tr>
      <tr> 
      <td class="tdgenap" style="width: 11%">New Application Date</td>
      <td width="86%" class="tdganjil">
      <font face="Tahoma, Verdana" size="2">
        <input name="textfield32333" type="text" class="inptype" size="10">
        </font>
		<img src="../../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"> 
		To <font face="Tahoma, Verdana" size="2">
        <input name="textfield32334" type="text" class="inptype" size="10">
        </font>
		<img src="../../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"> <font color="red">*) Default Value is Business Date</font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 11%">Supplier Name</td>
      <td width="86%" class="tdganjil"><select name="select3">
          	  <option selected>All</option>
              <option>xxxx99xxxx</option>
              <option>xxxx99xxxx</option>
              <option>xxxx99xxxx</option>
            </select></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 11%">Asset Type</td>
      <td width="86%" class="tdganjil"><select name="select0">
          	  <option selected>All</option>
              <option>Car</option>
              <option>Motorcycle</option>
              <option>Electronics</option>
            </select></td>
    </tr>
    <tr>
      <td class="tdgenap" style="width: 11%">Approval Status</td>
      <td width="86%" class="tdganjil">
         <select name="select2">
          	  <option selected>Approved</option>
              <option>Reject</option>
              <option>Cancel</option>
            </select></td>
    	</tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">&nbsp;<a href="LaporanStatusKredit.htm"><img src="../../../Images/ButtonViewReport.gif" width="100" height="20" border="0"></a><a href="LaporanStatusKredit.aspx">
		<asp:ImageButton runat="server" id="ImgReset" ImageUrl="../../../Images/ButtonReset.gif"></asp:ImageButton></a>
      </td>
    </tr>
  </table>
</div>
</Form>
</body>
</html>
