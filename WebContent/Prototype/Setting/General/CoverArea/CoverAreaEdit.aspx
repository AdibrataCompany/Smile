<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1"%>
<html>
<head>
<title>Untitled Document</title>
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
<form id="frmCoverArea" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td colspan="3"><font color="red"><em>*) required fields</em></font></td>
    </tr>
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">COVERAGE AREA - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
      <td width="25%" class="tdgenap">Description</td>
      <td width="85%" class="tdganjil">
      <asp:textbox runat="server" ID="txtDescription" CssClass="inptype"></asp:textbox>
		&nbsp;<font color="red">*)</font></td>
    </tr>
            <tr> 
      <td width="25%" class="tdgenap">Range</td>
      <td width="85%" class="tdganjil">
      <asp:textbox runat="server" ID="txtRange" CssClass="inptype"></asp:textbox>
		&nbsp;<font color="red">*)</font></td>
    </tr>
         <tr> 
      <td width="25%" class="tdgenap">Survey Fee</td>
      <td width="85%" class="tdganjil">
      <asp:textbox runat="server" ID="txtSurveyFee" CssClass="inptype"></asp:textbox>
		&nbsp;<font color="red">*)</font></td>
    </tr>

         <tr> 
      <td width="25%" class="tdgenap">Active</td>
      <td width="85%" class="tdganjil">
      <asp:CheckBox runat="server" ID="chkActive" Text="Yes"></asp:CheckBox >
		</td>
    </tr>

  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">

    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbSaveCoverArea" imageurl="../../../Images/ButtonSave.gif" runat="server" PostBackUrl="CoverAreaList.aspx"></asp:ImageButton>
		<asp:ImageButton id="imbCancelCoverArea" imageurl="../../../Images/ButtonCancel.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <br>
</div> 
</form>
</body>
</html>
