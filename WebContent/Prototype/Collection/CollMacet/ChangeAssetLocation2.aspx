<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>COLLECTION</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
<link rel="stylesheet" type="text/css" href="../../Confins.css">
<style type="text/css">
.style5 {
	text-align: left;
	color: #FF0000;
}
</style>
</head>
<body>
<form id="FrmChangeAssetLocation2" runat="server">
<div align="center">
  <table style="width: 100%">
	<tr>
		<td class="style5">&nbsp;&nbsp;&nbsp; <font color="red"><i>*)&nbsp;&nbsp; required field</i></font></td>
	</tr>
	</table>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">CHANGE ASSET LOCATION</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap">Branch</td>
      <td class="tdganjil" colspan="3">xxxxxxxxxx</td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap"> <div align="left">Agreement No.</div></td>
      <td width="25%" class="tdganjil" colspan="3" style="width: 50%"> <a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="height: 17px">Asset Type</td>
      <td class="tdganjil" style="height: 17px" colspan="3">xxxxx20xxxxx</td>
    </tr>
    <tr> 
      <td class="tdgenap">Asset Code</td>
      <td class="tdganjil" colspan="3">xxxxxxxx50xxxxxxxx</td>
    </tr>
    <tr> 
      <td class="tdgenap"> <div align="left">Asset Description</div></td>
      <td colspan="3" class="tdganjil">xxxxxxxx50xxxxxxxx</td>
    </tr>
    <tr> 
      <td class="tdgenap"> Manufacturing Year&nbsp;</td>
      <td colspan="3" class="tdganjil">9999&nbsp;</td>
    </tr>
    <tr> 
      <td class="tdgenap">Chassis No. (Serial 1)</td>
      <td class="tdganjil" style="width: 177px">xxxxxxxx50xxxxxxxx</td>
      <td class="tdgenap" style="width: 103px">Engine No. (Serial 2)</td>
      <td class="tdganjil">xxxxxxxx50xxxxxxxx</td>
    </tr>
    <tr> 
      <td class="tdgenap">License Plate (Attribute 1)</td>
      <td class="tdganjil" style="width: 177px"> <div align="left">xxxxx10xxxxx</div></td>
      <td class="tdgenap" style="width: 103px">Color (Attribute 2)</td>
      <td class="tdganjil">xxxxxxxx50xxxxxxxx</td>
    </tr>
    <tr> 
      <td colspan="4" class="tdjudulungu" style="height: 23px">CHANGE ASSET 
		LOCATION</td>
    </tr>
    <tr> 
      <td class="tdgenap"> <div align="left">Old Asset Location</div></td>
      <td class="tdganjil" colspan="3"> <input name="textfield2" type="text" class="inptype" size="25"> 
        <font color="#FF0000">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap">New Asset Location</td>
      <td class="tdganjil" colspan="3"> <input name="textfield24" type="text" class="inptype" size="25"> 
        <font color="#FF0000">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap">Notes&nbsp;</td>
      <td class="tdganjil" colspan="3"> <textarea name="textarea" cols="50" rows="2" class="inptype"></textarea>&nbsp;</td>
    </tr>
    </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">&nbsp;
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="ChangeAssetLocation.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="ChangeAssetLocation.aspx" /> 
      </td>
    </tr>
  </table>
  
  
  
 
  
  
</div>
</form>
</body>
</html>
