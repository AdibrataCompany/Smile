<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>COLLECTION</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<script language="JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
<link rel="stylesheet" type="text/css" href="../../Confins.css">
</head>
<body>
<form id="FrmCollectorAdd" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">COLLECTION SETTING - ADD</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Collection Group</td>
      <td class="tdganjil"> CG Jakarta</td>
    </tr>
    <tr> 
      <td class="tdgenap"> 
        <div align="left">Collector Id</div>
      </td>
      <td class="tdganjil"> 
        <select name="select2">
          <option selected>Select One</option>
          <option>xxxxx12xxxxx</option>          
        </select>
        <font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td valign="middle" class="tdgenap"> 
        <div align="left">Collector Type</div>
      </td>
      <td class="tdganjil"> 
        <select name="select">
          <option selected>Select One</option>
          <option>Head Group</option>
          <option>Head Collection</option>
          <option>Desk Collection</option>
          <option>Desk Collection Supervisor</option>
          <option>Field Collector Supervisor</option>
          <option>Field Collector 1</option>
          <option>Field Collector 2</option>
          <option>Head Remedial</option>
          <option>Remedial Supervisor</option>
          <option>Remedial</option>
          <option>Collection Support</option>
        </select>
        <font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td valign="middle" class="tdgenap"> 
        Collector From</td>
      <td class="tdganjil"> 
        Internal</td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap"> 
        <div align="left">Supervisor</div>
      </td>
      <td class="tdganjil"> 
        <select name="select4">
          <option selected>Select One</option>
          <option>xxxxxxxx50xxxxxxxx</option>          
        </select>
      </td>
    </tr>
    <tr> 
      <td class="tdgenap"> 
        <div align="left">Active</div>
      </td>
      <td class="tdganjil"> 
        <input name="checkbox" type="checkbox" value="checkbox" checked>
      </td>
    </tr>
  </table>
  
  
  
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><a href="javascript:history.go(-1);"> </a><a href="CollectorSetting.aspx">
		<img src="../../images/ButtonSave.gif" width="100" height="20" border="0"></a>&nbsp; 
        <a href="javascript:history.go(-1);">
		<img src="../../images/ButtonCancel.gif" width="100" height="20" border="0"></a> 
      </td>
    </tr>
  </table>
  <p>&nbsp;</p>
</div>
</form>
</body>
</html>
