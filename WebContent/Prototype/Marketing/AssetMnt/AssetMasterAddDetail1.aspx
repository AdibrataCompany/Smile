<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="../../Confins.css">
</head>

<body>
<form id="FrmAssetMasterAddDetail1" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET MASTER - ADD</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="25%" class="tdgenap">Asset Code</td>
          <td class="tdganjil">HONDA. 
            <input name="textfield33" type="text" class="inptype" size="20">
            <font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="tdgenap">Description</td>
          <td class="tdganjil">Honda- 
            <input name="textfield34" type="text" class="inptype" size="40">
            <font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="tdgenap">IsActive</td>
          <td class="tdganjil">
			<asp:CheckBox runat="server" id="CbxIsActive" Checked="True" /> </td>
        </tr>
     </table>
    </div>
    
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="AssetMasterListing.aspx" />&nbsp;    
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="AssetMasterListing.aspx" />
		</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
