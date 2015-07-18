<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="../../Confins.css">
</head>

<body>
<form id="FrmAssetTypeAdd" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET TYPE - ADD</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td class="tdgenap" style="width: 26%">Asset Type ID</td>
          <td class="tdganjil"><font color="red">
			<asp:TextBox runat="server" id="TbsAssetTypeId" CssClass="inptype"></asp:TextBox>
&nbsp;&nbsp; *)</font></td>
        </tr>
        <tr> 
          <td class="tdgenap" style="width: 26%">Description</td>
          <td class="tdganjil"><font color="red">
			<asp:TextBox runat="server" id="TbsDescription" Width="200px" CssClass="inptype">
			</asp:TextBox>
&nbsp;&nbsp; *)</font></td>
        </tr>
        <tr> 
          <td class="tdgenap" style="width: 26%">Serial No 1 Label</td>
          <td class="tdganjil"> 
            <font color="red">
			<asp:TextBox runat="server" id="TbsSerialNo1" CssClass="inptype"></asp:TextBox>
			&nbsp;
			*)</font></td>
        </tr>
        <tr> 
          <td class="tdgenap" style="width: 26%">Serial No 2 Label</td>
          <td class="tdganjil"> 
            <font color="red">
			<asp:TextBox runat="server" id="TbsSerialNo2" CssClass="inptype"></asp:TextBox>
			</font></td>
        </tr>
        <tr> 
          <td class="tdgenap" style="width: 26%">Sandi BI CF</td>
          <td class="tdganjil"> 
            <font color="red">
			<asp:TextBox runat="server" id="TbsSandiBiCf" CssClass="inptype"></asp:TextBox>
			&nbsp;
			*)</font></td>
        </tr>
        <tr> 
          <td class="tdgenap" style="width: 26%">Sandi BI LS</td>
          <td class="tdganjil"> 
            <font color="red">
			<asp:TextBox runat="server" id="TbsSandiBiLs" CssClass="inptype"></asp:TextBox>
			&nbsp;
			*)</font></td>
        </tr>
        <tr> 
          <td class="tdgenap" style="width: 26%">Uang Jaminan Pengganti BPKB</td>
          <td class="tdganjil"> 
            <font color="red">
			<asp:TextBox runat="server" id="TbnUangJaminan" CssClass="inptype"></asp:TextBox>
			&nbsp;
			*)</font></td>
        </tr>
      </table>
    </div>
    
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="25%" height="30">&nbsp;</td>
      <td width="75%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="AssetType.aspx" />&nbsp;</a>
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="AssetType.aspx" /></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>