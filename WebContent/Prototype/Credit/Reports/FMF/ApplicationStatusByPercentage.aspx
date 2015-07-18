<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Sales Dealer Evaluation</title>
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

      <td align="center" class="tdtopihijau" colspan="2">APPLICATION STATUS BY 
		PERCENTAGE</td>
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
      <td class="tdgenap" style="width: 11%">Period</td>
      <td width="86%" class="tdganjil">
      <select name="select4">
          	  <option selected>January</option>
              <option>February</option>
              <option>March</option>
              <option>April</option>
              <option>May</option>
              <option>June</option>
              <option>Jully</option>
              <option>August</option>
              <option>September</option>
              <option>October</option>
              <option>November</option>
              <option>December</option>
            </select> 
      <select name="select3">
          	  <option selected>2007</option>
              <option>2008</option>
              <option>2009</option>
              <option>2010</option>
              <option>2011</option>
              <option>2012</option>
              <option>2013</option>
              <option>2014</option>
            </select><font color="red"> *) </font></td>
    </tr>
    <tr>
      <td class="tdgenap" style="width: 11%">Asset Type</td>
      <td width="86%" class="tdganjil"><select name="select5">
          	  <option selected>All</option>
              <option>Car</option>
              <option>Motorcycle</option>
              <option>Electronics</option>
            </select></td>
    	</tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">&nbsp;<a href="ApplicationStatusByPercentage.htm"><img src="../../../Images/ButtonViewReport.gif" width="100" height="20" border="0"></a><a href="LaporanStatusKredit.aspx">
		<asp:ImageButton runat="server" id="ImgReset" ImageUrl="../../../Images/ButtonReset.gif"></asp:ImageButton></a>
      </td>
    </tr>
  </table>
</div>
</Form>
</body>
</html>
