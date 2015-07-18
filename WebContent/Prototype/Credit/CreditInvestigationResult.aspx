<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
</head>
<body>
<form id="frmCreditInvestigation" runat="server">
<div align="center">
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">CREDIT INVESTIGATION</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdganjil" width="25%"> 
      <td class="tdgenap">Application ID</td>
      <td width="705" class="tdganjil"><label></label>
        xxxxx20xxxxx</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap" width="25%"> Agreement No</td>
      <td class="tdganjil"><a href="../Credit/ViewAgreement.htm" target="_blank">xxxxx20xxxxx</a></td>
    </tr>
    <tr class="tdganjil"> 
      <td width="25%" class="tdgenap">Customer Name</td>
      <td class="tdganjil" style="height: 18px">xxxxxxxxxxx50xxxxxxxxxxx</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap" width="25%">Survey Date</td>
      <td class="tdganjil">
		<asp:TextBox runat="server" id="txtSurveyDate" CssClass="inptype" Width="82px"></asp:TextBox>
		&nbsp;<img src="../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"></td>
    </tr>
    <tr>
      <td class="tdgenap" width="25%">Surveyor</td>
      <td class="tdganjil">
		<asp:DropDownList runat="server" id="cboSurveyor">
			<asp:ListItem>Select One</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap" width="25%">Result</td>
      <td class="tdganjil">
		<asp:DropDownList runat="server" id="cboResult">
			<asp:ListItem Value="RCM">Recommend</asp:ListItem>
			<asp:ListItem Value="REC">Reconsider</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap" width="25%">Notes</td>
      <td class="tdganjil">
		<asp:TextBox runat="server" id="txaNotes" TextMode="MultiLine" Width="455px">
		</asp:TextBox>
		</td>
    </tr>
  </table>
  <p align="center"><font face="Tahoma, Verdana" size="2">|&nbsp;<a id="hyFileAttachment" href="ViewFileAttachment.htm" target="_blank">File Attachment</a>&nbsp;|</font>
  </p>			
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">CREDIT INVESTIGATION Q &amp; A LIST</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdjudulhijau"> 
      <td height="25">CUSTOMER TYPE : PERSONAL CUSTOMER</td>
    </tr>
    <tr align="center" class="tdjudulhijau"> 
      <td height="24" colspan="6"><div align="left">KELENGKAPAN DATA PENDUKUNG (FOTOCOPY)</div></td>
    </tr>
    <tr class="tdganjil"> 
      <td height="49" class="tdgenap"><p>1. KTP/PASPORT/ID Setara</p>
        <p>&nbsp; &nbsp;&nbsp;<input type="radio" name="radiobutton1" value="V1"> 
		Ada<br>
          &nbsp; &nbsp; 
          <input type="radio" name="radiobutton1" value="V1">
          Tidak
        </p></td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap" style="height: 77px"><p>2. Rekening ta<span class="tdgenap">bungan koran 3 bulan terakhir</span></p>
        <p>&nbsp; &nbsp; 
          <input type="radio" name="radiobutton" value="radiobutton"> Ada<br>
          &nbsp; &nbsp; 
          <input type="radio" name="radiobutton" value="radiobutton"> Tidak<br>
          </p></td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap"><p>3. Fotocopy kartu kredit</p>
        <p>&nbsp; &nbsp; 
          <input type="radio" name="radiobutton" value="radiobutton"> Ada<br>
          &nbsp; &nbsp; 
          <input type="radio" name="radiobutton" value="radiobutton"> Tidak<br>
          </p></td>
    </tr>
 </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr align="center" class="tdjudulhijau"> 
      <td height="24" colspan="6"><div align="left">DATA PRIBADI</div></td>
    </tr>
    <tr class="tdganjil"> 
      <td height="49" class="tdgenap"><p>1. Verifikasi dengan</p>
        <p>&nbsp; &nbsp; 
          <input type="text" name="textfield7" class="inptype">
        </p></td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap"><p>2. Hubungan verificator dengan customer</p>
        <p>&nbsp; &nbsp; 
          <input type="text" name="textfield33224" class="inptype"></p></td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap"><p>3. Status rumah sama dengan aplikasi</p>
        <p>&nbsp; &nbsp; 
          <input type="radio" name="radiobutton" value="radiobutton"> Ya&nbsp;
          <br>
          &nbsp; &nbsp; 
          <input type="radio" name="radiobutton" value="radiobutton"> Tidak</p></td>
    </tr>
     <tr class="tdganjil"> 
      <td class="tdgenap">&nbsp;</td>
    </tr>

  </table>

  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><a href="javascript:history.go(-1);"><img src="../Images/ButtonSave.gif" width="100" height="20" border="0"> 
        <img src="../Images/ButtonCancel.gif" width="100" height="20" border="0"></a> 
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
