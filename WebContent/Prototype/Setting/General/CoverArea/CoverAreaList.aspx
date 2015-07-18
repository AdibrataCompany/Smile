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
<form id="frmCustomerComplainList" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">COVERAGE AREA</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Search By</td>
      <td width="85%" class="tdganjil">
      <asp:DropDownList runat="server" ID="ddlSearchCriteria"> 
      <asp:ListItem Text="Description" Value="Customer.Name"></asp:ListItem>
      <asp:ListItem Text="Range" Value="Customer.Address"></asp:ListItem>
      </asp:DropDownList>
      <asp:TextBox ID="txtSearchCustomer" runat="server" CssClass="inptype" width="200"></asp:textbox></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbSearchCustomerCriteria" imageurl="../../../Images/ButtonSearch.gif" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbResetCustomerCriteria" imageurl="../../../Images/ButtonReset.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">COVERAGE AREA LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
    <div align="center">
    <asp:GridView runat="server" id="GrdListCustomer" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:boundfield DataField="valstring2" HeaderText="ID" SortExpression="valstring2 ">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring25" HeaderText="DESCRIPTION" SortExpression="valstring25">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring3" HeaderText="RANGE" SortExpression="valstring3">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valamount" HeaderText="SURVEY FEE" SortExpression="valamount">
			<ItemStyle HorizontalAlign="Right" />
		</asp:boundfield>
		<asp:templatefield HeaderText="ACTION">
			<AlternatingItemTemplate>
				<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../../images/IconEdit.gif" PostBackUrl="CoverAreaEdit.aspx" />
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../../images/IconEdit.gif" PostBackUrl="CoverAreaEdit.aspx" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
      
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../../DataType.xml">
		</asp:XmlDataSource>
    </div>
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton id="imbAddCoverArea" imageurl="../../../Images/ButtonAdd.gif" runat="server" PostBackUrl="CoverAreaAdd.aspx"></asp:ImageButton>
	  </td>
    </tr>
  </table>

  
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><img src="../../../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../../images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../../../images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
   <br>
</div>
  </form>
</body>
</html>
