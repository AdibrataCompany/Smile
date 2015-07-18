<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Form Kwitansi Collector Edit</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head>
<body>
<form id="form1" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
 	<tr class="trtopikuning"> 

      <td align="center" class="tdtopihijau" colspan="2">VIEW AGREEMENT APPROVAL 
		DEVIASI</td>
      <tr>
      <td class="tdgenap" style="width: 19%; height: 24px;">Branch</td>
      <td width="86%" class="tdganjil" style="height: 24px">
       xxxxxxx99xxxxxxx</td>
    </tr>
      <tr> 
      <td class="tdgenap" style="width: 19%">Application ID</td>
      <td width="86%" class="tdganjil">
       <a href="javascript:;" onClick="MM_openBrWindow('ViewApplication.htm','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
    </tr>
      <tr> 
					<td class="tdgenap">Agreement No</td>
					
      <td class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
    </tr>
    <tr> 
					<td class="tdgenap">Customer Name</td>
					
      <td class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxxxx50xxxxxxxxxx</a></td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau"> APPROVAL DEVIASI LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <asp:GridView runat="server" id="GridApprovalDeviasi" DataSourceID="XmlDataSource1" AutoGenerateColumns="False" ControlStyle-CssClass="tablegrid" Width="95%" CssClass="tablegrid">
		<Columns>
			<asp:boundfield DataField="valnumber2" SortExpression="valstring" HeaderText="NO" ItemStyle-HorizontalAlign="Center">
				<ControlStyle CssClass="tdganjil" />
			</asp:boundfield>
			<asp:boundfield DataField="valstring" SortExpression="valstring" HeaderText="DEVIASI" ItemStyle-HorizontalAlign="Left">
				<ControlStyle CssClass="tdgenap" />
			</asp:boundfield>
			<asp:boundfield DataField="valnumber2" SortExpression="valstring" HeaderText="VALUE" ItemStyle-HorizontalAlign="Center">
				<ControlStyle CssClass="tdgenap" />
			</asp:boundfield>
		</Columns>
	</asp:GridView>
	<asp:XmlDataSource runat="server" id="XmlDataSource1" DataFile="~/XML/Menu_Eloan_All_999.xml">
	</asp:XmlDataSource>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<a href="javascript:window.close();"><img src="../Images/ButtonClose.gif" width="100" height="20" border="0"></a>&nbsp;
		</td>
    </tr>
  </table>

</div>
</form>
</body>
</html>
