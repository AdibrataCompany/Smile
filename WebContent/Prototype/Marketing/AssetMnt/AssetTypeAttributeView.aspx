<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns:v="urn:schemas-microsoft-com:vml" xmlns:o="urn:schemas-microsoft-com:office:office">
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}

function myClose() {
    close();}



//-->
</script>
<link rel="stylesheet" type="text/css" href="../../Confins.css">
</head>

<body>
<form id="FrmAssetAttributeView" runat="server">
<div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET ATTRIBUTE</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Asset Type ID</td>
      <td class="tdganjil">
			<asp:HyperLink runat="server" id="LinkAssetTypeId" NavigateUrl="AssetTypeView.aspx" Target="_blank">MOTORCYCLE
			</asp:HyperLink>
		</td>
    </tr>
    <tr> 
      <td class="tdgenap">Description</td>
      <td class="tdganjil">Motorcycle</td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET ATTRIBUTE - VIEW</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="25%" class="tdgenap">Attribute ID</td>
          <td class="tdganjil">
			LICPLATE</td>
        </tr>
        <tr> 
          <td class="tdgenap">Attribute Name</td>
          <td class="tdganjil">License Plate</td>
        </tr>
        <tr> 
          <td class="tdgenap">Attribute Type</td>
          <td class="tdganjil">Character</td>
        </tr>
        <tr> 
          <td class="tdgenap">Atribute Length</td>
          <td class="tdganjil">20</td>
        </tr>
        <tr> 
          <td class="tdgenap"><p>Can Be Changed After Go Live</p></td>
          <td class="tdganjil">Yes</td>
        </tr>
      </table>
    </div>
    
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnClose" ImageUrl="../../images/ButtonClose.gif" onclientclick="myClose();"/><a href="javascript:history.go(-1);"></a></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>