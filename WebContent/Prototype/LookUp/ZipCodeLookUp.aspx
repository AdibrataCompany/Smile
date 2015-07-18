<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Zip Code</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
</head>
<body>
<form id="frmLookupZipCode" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ZIP CODE</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Zip Code</td>
      <td class="tdganjil"><asp:TextBox ID="txtZipCode" runat="server" CssClass="inptype"></asp:TextBox> </td>
      <td width="25%" class="tdgenap">Kelurahan</td>
      <td class="tdganjil"><asp:TextBox ID="txtKelurahan" runat="server" CssClass="inptype"></asp:TextBox></td>
    </tr>
    <tr>
      <td width="25%" class="tdgenap">Kecamatan</td>
      <td class="tdganjil"><asp:TextBox ID="txtKecamatan" runat="server" CssClass="inptype"></asp:TextBox></td>
        <td width="25%" class="tdgenap">City</td>
      <td class="tdganjil"><asp:TextBox ID="txtCity" runat="server" CssClass="inptype"></asp:TextBox></td>
	</tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><img src="../Images/ButtonSearch.gif" width="100" height="20" border="0"> <img src="../Images/ButtonReset.gif" width="100" height="20" border="0"> 
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ZIP CODE LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  
  <table width="100%" align="center">
    <tr> 
    <td align="center">
   <asp:GridView runat="server" id="GrdListCustomer" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield HeaderText="SELECT">
			<AlternatingItemTemplate>
				<asp:RadioButton  runat="server" id="rdbSelectZipCode">
				</asp:RadioButton>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:RadioButton  runat="server" id="rdbSelectZipCode">
				</asp:RadioButton>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:boundfield DataField="valstring6" HeaderText="ZIP CODE" SortExpression="valstringcsttype">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" HeaderText="KELURAHAN" SortExpression="valstring50">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" HeaderText="KECAMATAN" SortExpression="valstring50">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" HeaderText="CITY" SortExpression="valstring50">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
      
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
		</asp:XmlDataSource>
  
    </td>
    </tr>
  </table>
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><img src="../Images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../Images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../Images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../Images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../Images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  
  
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><a href="javascript:window.close();"><img src="../Images/ButtonSelect.gif" width="100" height="20" border="0"></a> 
        <a href="javascript:window.close();"><img src="../Images/ButtonExit.gif" width="100" height="20" border="0"></a><a href="AgreementRelatedDetailAdd.htm"> 
        </a></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
