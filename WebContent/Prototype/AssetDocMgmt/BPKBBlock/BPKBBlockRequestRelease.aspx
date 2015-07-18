<%@ Page Language="C#" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head>
<body>


<form id="frmBPKBBlock" runat="server">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">BPKB BLOCK RELEASE</td>
      <td width="10" class="tdtopibirukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
	  <tr> 
	      <td width="20%" class="tdgenap">BPKB Block No</td>
	      <td width="80%" class="tdganjil"> 
			<asp:label id="lblBpkbBlockNo" runat="server" width="39%">xxx20xxx</asp:label>
			</td>
	    </tr>

    <tr> 
      <td width="20%" class="tdgenap">Agreement No</td>
      <td width="80%" class="tdganjil"> 
		<asp:hyperlink id="hypAgreementNo" runat="server" width="39%">xxxx20xxxx</asp:hyperlink>
		</td>
    </tr>
        <tr> 
      <td width="20%" class="tdgenap">Customer Name</td>
      <td width="80%" class="tdganjil"> 
		<asp:hyperlink id="hypCustomerName" runat="server" width="39%">xxxx20xxxx</asp:hyperlink>
		</td>
    </tr>
      <tr> 
       <td class="tdgenap">Asset Description</td>
      <td class="tdganjil">
		<asp:hyperlink id="hypAssetDescription" runat="server" width="95%">xxxx20xxxx</asp:Hyperlink></td>
	</tr>
     	<tr>
       <td class="tdgenap">Asset Description</td>
      <td class="tdganjil">
		<asp:hyperlink id="hypAssetDescription0" runat="server" width="95%">xxxx20xxxx</asp:Hyperlink></td>
		</tr>
		<tr>
       <td class="tdgenap">BPKB No</td>
      <td class="tdganjil">
		<asp:label id="lblDocumentNo" runat="server" width="95%">xxxx20xxxx</asp:label></td>
		</tr>
		<tr>
       <td class="tdgenap">License Plate</td>
      <td class="tdganjil">
		<asp:label id="lblLicensePlate" runat="server" width="95%">xxxx15xxxx</asp:label></td>
		</tr>
		<tr>
       <td class="tdgenap">Chasis No.</td>
      <td class="tdganjil">
		<asp:label id="lblChasisNumber" runat="server" width="95%">xxxx20xxxx</asp:label></td>
		</tr>
		<tr>
       <td class="tdgenap">Engine No.</td>
      <td class="tdganjil">
		<asp:label id="lblEngineNo" runat="server" width="95%">xxxx20xxxx</asp:label></td>
		</tr>
     <tr> 
       <td class="tdgenap">Reason</td>
      <td class="tdganjil">
		<asp:dropdownlist id="ddlReason" runat="server">
		<asp:ListItem Text="Nasabah Buruk" Value="bad"></asp:ListItem>
		</asp:dropdownlist></td>
	</tr>

    	<tr>
      <td class="tdgenap">Notes</td>
      <td class="tdganjil">
		<asp:textbox id="txtExpiredDateIDNumber" runat="server" cssclass="inptype" width="408px" TextMode="MultiLine"></asp:textbox> 
        <font color="red">  *)</font> </td>
    </tr>

  	</table>
   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbSaveDataBank" imageurl="../../Images/ButtonSave.gif" postbackurl="BPKBBlockRequest_AgreementList.aspx" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbCancelDataBank" runat="Server" postbackurl="BPKBBlockRequest_AgreementList.aspx" imageurl="../../Images/ButtonCancel.gif"></asp:ImageButton>
      </td>
    </tr>
  </table>
  </div>

</form>

</body>

</html>
