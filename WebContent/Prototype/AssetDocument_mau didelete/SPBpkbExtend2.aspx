<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>ASSETDOCUMENT</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
<style type="text/css">
.style1 {
	color: #FF0000;
}
.style5 {
	text-align: left;
	color: #FF0000;
}
</style>
</head>
<body>
<form id="FrmSPBPKBExtend2" runat="server">
<div align="center"> 
  <table style="width: 100%">
	<tr>
		<td class="style5">&nbsp;&nbsp;&nbsp; <font color="red"><i>*)&nbsp;&nbsp; required field</i></font></td>
	</tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopimerahkiri">&nbsp;</td>
      <td align="center" class="tdtopimerah">SP BPKB EXTEND</td>
      <td width="10" class="tdtopimerahkanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Agreement No</td>
      <td class="tdganjil" style="width: 142px"> 
		<asp:HyperLink runat="server" id="LinkAgreementNo" NavigateUrl="../LookUp/ViewAgreement.htm" Target="_blank">xxxxx20xxxxx
		</asp:HyperLink>
		</td>
      <td class="tdgenap" style="width: 116px"> 
		Customer Name</td>
      <td class="tdganjil"> 
		<asp:HyperLink runat="server" id="LinkCustomer" NavigateUrl="../LookUp/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx50xxxxxxxx
		</asp:HyperLink>
		</td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Asset Description</td>
      <td class="tdganjil" style="width: 142px"> 
		<asp:HyperLink runat="server" id="LinkAssetDescription" NavigateUrl="../LookUp/ViewAsset.htm" Target="_blank">xxxxxxxx50xxxxxxxx
		</asp:HyperLink>
		</td>
      <td class="tdgenap" style="width: 116px"> 
		Supplier Name</td>
      <td class="tdganjil"> 
		<asp:HyperLink runat="server" id="LinkSupplierName" NavigateUrl="../Marketing/Supplier/SupplierView.aspx" Target="_blank">xxxxxxxx50xxxxxxxx
		</asp:HyperLink>
		</td>
    </tr>
    <tr> 
      <td width="25%" class="tdjudulmerah" colspan="4">EXTEND INFORMATION</td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Current SP BPKB No</td>
      <td class="tdganjil" style="width: 142px"> 
		xxxxx20xxxxx</td>
      <td class="tdgenap" style="width: 116px"> 
		New SP BPKB No</td>
      <td class="tdganjil"> 
		<asp:TextBox runat="server" id="TbsNewSPBpkbNo" CssClass="inptype">
		</asp:TextBox>
		&nbsp;<span class="style1">*)</span></td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Current SP BPKB Date</td>
      <td class="tdganjil" style="width: 142px"> 
		dd/mm/yyyy</td>
      <td class="tdgenap" style="width: 116px"> 
		New SP BPKB Date</td>
      <td class="tdganjil"> 
		<asp:TextBox runat="server" id="TbdNewSPBpkbDate" CssClass="inptype" Width="100px">
		</asp:TextBox>
&nbsp;
		<asp:ImageButton runat="server" id="BtnCalendar" ImageUrl="../images/iconcalendar.gif" />
		&nbsp;<span class="style1">*)</span></td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Expected Received Date</td>
      <td class="tdganjil" style="width: 142px"> 
		dd/mm/yyyy</td>
      <td class="tdgenap" style="width: 116px"> 
		Extend Until Date</td>
      <td class="tdganjil"> 
		<asp:TextBox runat="server" id="TbdNewSPBpkbDate0" CssClass="inptype" Width="100px">
		</asp:TextBox>
&nbsp;
		<asp:ImageButton runat="server" id="BtnCalendar0" ImageUrl="../images/iconcalendar.gif" />
		&nbsp;<span class="style1">*)</span></td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Serial No 1 Label</td>
      <td class="tdganjil" style="width: 142px"> 
		<asp:TextBox runat="server" id="TbsChasisNo" CssClass="inptype">
		</asp:TextBox>
		&nbsp;<span class="style1">*)</span></td>
      <td class="tdgenap" style="width: 116px"> 
		Serial No 2 Label</td>
      <td class="tdganjil"> 
		xxxxxxxx50xxxxxxxx</td>
    </tr>
    <tr> 
      <td class="tdgenap">Reason</td>
      <td class="tdganjil" colspan="3"><select name="select">
          <option selected>Select one</option>
          <option>Reason 1</option>
        </select></td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopimerahkiri">&nbsp;</td>
      <td align="center" class="tdtopimerah">DOCUMENT LIST</td>
      <td width="10" class="tdtopimerahkanan">&nbsp;</td>
    </tr>
  </table>
  <asp:GridView runat="server" id="GrdViewExtendDocumentList" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" ToolTip="Document List berisi data mengenai semua Document yang berhubungan dengan asset tersebut tetapi document nya bukan main ( selain BPKB )">
	<Columns>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="DOCUMENT NO.">
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="DOCUMENT NAME">
		</asp:boundfield>
		<asp:boundfield DataField="valstring20" SortExpression="valstring20" HeaderText="DOCUMENT STATUS">
		</asp:boundfield>
		<asp:boundfield DataField="valdate" SortExpression="valdate" HeaderText="DOCUMENT DATE">
		</asp:boundfield>
	</Columns>
	<HeaderStyle CssClass="tdjudulmerah" />
	<AlternatingRowStyle CssClass="tdgenap" />
	</asp:GridView>
	<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
	</asp:XmlDataSource>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">&nbsp;<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../images/ButtonSave.gif" PostBackUrl="SPBpkbExtend.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../images/ButtonCancel.gif" PostBackUrl="SPBpkbExtend.aspx" />&nbsp;</td>
    </tr>
  </table>
  
  
</div>
</form>
</body>
</html>
