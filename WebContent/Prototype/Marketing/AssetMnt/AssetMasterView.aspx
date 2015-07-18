<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Asset Master</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<script language="JavaScript" type="text/JavaScript">

function myClose() {
    close();}

</script >
<link rel="stylesheet" type="text/css" href="../../Confins.css">
</head>

<body>
<form id="FrmAssetMasterView" runat="server">
<div align="center">
 <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET MASTER</td>
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
      <td align="center" class="tdtopihijau">ASSET MASTER - VIEW</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="25%" class="tdgenap">Asset Code</td>
          <td class="tdganjil">HONDA</td>
        </tr>
        <tr> 
          <td class="tdgenap">Description</td>
          <td class="tdganjil">Honda</td>
        </tr>
        <tr> 
          <td class="tdgenap">Is Active</td>
          <td class="tdganjil">Yes</td>
        </tr>
      </table>
    </div>
    
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnClose" ImageUrl="../../images/ButtonClose.gif" onclientclick="myClose();"/><a href="javascript:window.close();">&nbsp;</a></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>