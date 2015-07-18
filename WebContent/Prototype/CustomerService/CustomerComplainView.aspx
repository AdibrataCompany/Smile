<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Untitled Document</title>
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
<form id="frmCustomerComplain" runat="server">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">CUSTOMER SERVICE - VIEW</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
     <tr> 
      <td width="25%" class="tdgenap">Name</td>
      <td class="tdganjil"><asp:HyperLink ID="hypCustomerName" runat="server" Text="Customer AdIns 000001" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank"></asp:HyperLink>
        <font color="red">*)</font> </td>
    </tr>
	 <tr> 
      <td colspan="2" class="tdjudulhijau">COMPLAIN <font color="red">*)</font> 
      </td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap">Complain</td>
      <td class="tdganjil"> 
      <asp:label id="txtCustomerComplin" runat="server" Text="Customer Complain, pembayaran sudah di bayar tapi dianggap tidak bayar"></asp:label>
		</td>
    </tr>
     <tr> 
      <td colspan="2" class="tdjudulhijau">SOLUTION <font color="red">*)</font> 
      </td>
    </tr>
    </table>
    <table align="center" width="95%">
    <tr>
    <td>
     <asp:GridView runat="server" id="GrdListAgreement" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="100%" >
    <Columns>
		<asp:templatefield HeaderText="DATE SOLUTION">
			<AlternatingItemTemplate>
				<asp:Label ID="lblPeriodeComplain" runat="server" Text="dd/MM/yyyy HH:MM:ss"></asp:Label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label ID="lblPeriodeComplain" runat="server" Text="dd/MM/yyyy HH:MM:ss"></asp:Label>			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="SOLUTION">
			<AlternatingItemTemplate>
				<asp:Label ID="lblSolution" runat="server" Text="xxx100xxx"></asp:Label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label ID="lblSolution" runat="server" Text="xxx100xxx"></asp:Label>			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="RESULT">
		<AlternatingItemTemplate>
				<asp:Label ID="lblResult" runat="server" Text="Pending"></asp:Label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label ID="lblResult" runat="server" Text="Pending"></asp:Label>			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
      
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
		</asp:XmlDataSource>
		</td>
		</tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
     <a href="javascript:history.go(-1);"><img src="../Images/ButtonBack.gif" width="100" height="20" border="0"></a> 


      </td>
    </tr>
  </table>
  <br>
</div>
</form>
</body>
</html>
