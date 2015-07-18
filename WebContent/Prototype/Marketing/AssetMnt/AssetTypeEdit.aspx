<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="../../Confins.css">
</head>

<body>
<form id="FrmAssetTypeEdit" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET TYPE - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td class="tdgenap" style="width: 29%">Asset Type ID</td>
          <td class="tdganjil">MOTORCYCLE</td>
        </tr>
        <tr> 
          <td class="tdgenap" style="width: 29%">Description</td>
          <td class="tdganjil"><font color="red">
			<asp:TextBox runat="server" id="TbsDescription" Width="200px" CssClass="inptype">Motorcycle</asp:TextBox>
&nbsp;*)</font></td>
        </tr>
        <tr> 
          <td class="tdgenap" style="width: 29%">Serial No 1 Label</td>
          <td class="tdganjil"><font color="red">
			<asp:TextBox runat="server" id="TbsSerialNo1" CssClass="inptype">No. Rangka</asp:TextBox>
&nbsp;*)</font></td>
        </tr>
        <tr> 
          <td class="tdgenap" style="width: 29%">Serial No 2 Label</td>
          <td class="tdganjil"><font color="red">
			<asp:TextBox runat="server" id="TbsSerialNo2" CssClass="inptype">No. Mesin</asp:TextBox>
&nbsp;</font></td>
        </tr>
        <tr> 
          <td class="tdgenap" style="width: 29%">Sandi BI CF</td>
          <td class="tdganjil"><font color="red">
			<asp:TextBox runat="server" id="TbsSandiBiCf" CssClass="inptype">1</asp:TextBox>
&nbsp;*)</font></td>
        </tr>
        <tr> 
          <td class="tdgenap" style="width: 29%">Sandi BI LS</td>
          <td class="tdganjil">
			<asp:TextBox runat="server" id="TbsSandiBiLs" CssClass="inptype">10</asp:TextBox>
&nbsp;<font color="red">*)</font></td>
        </tr>
        <tr> 
          <td class="tdgenap" style="width: 29%">Uang Jaminan Pengganti BPKB</td>
          <td class="tdganjil">
			<asp:TextBox runat="server" id="TbnUangJaminan" CssClass="inptype">0</asp:TextBox>
&nbsp;<font color="red">*)</font></td>
        </tr>
      </table>
    </div>
    
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td height="30" style="width: 17%">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="AssetType.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="AssetType.aspx" /></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
