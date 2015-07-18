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
<form id="frmCustomerComplainList" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">CUSTOMER COMPLAIN</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Customer Name</td>
      <td width="85%" class="tdganjil"><asp:Label ID="lblCustomerName" runat="server" Text="BFI"></asp:Label>
		</td>
    </tr>
  </table>
   <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Result</td>
      <td width="85%" class="tdganjil"> 
      <asp:DropDownList runat="server" ID="ddlResultCustomerComplain"> 
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="Solved" Value="S"></asp:ListItem>
      <asp:ListItem Text="Pending" Value="P"></asp:ListItem>
      </asp:DropDownList>
		</td>
    </tr>
        <tr> 
      <td width="25%" class="tdgenap">Complain Type</td>
      <td width="85%" class="tdganjil"> 
		<asp:dropdownlist ID="ddlComplainType" runat="server">
		<asp:ListItem Text="Select One" Value="0"></asp:ListItem>
		<asp:ListItem Text="Customer Tidak Terpuaskan" Value="Puas"></asp:ListItem>
		<asp:ListItem Text="Complain mengenai tagihan" Value="Tagihan"></asp:ListItem>
		</asp:dropdownlist> 
		</td>
    </tr>

  </table>
 <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Complain Date</td>
      <td width="85%" class="tdganjil"> 
     	<asp:textbox ID="txtComplainDate" runat="server" CssClass="inptype"></asp:textbox>&nbsp;
		HH : MM
		<asp:textbox ID="txtComplainHour" runat="server" CssClass="inptype" Width="50Px"></asp:textbox>
		<asp:textbox ID="txtComplainMinute" runat="server" CssClass="inptype" Width="50Px"></asp:textbox>		</td>
    </tr>
  </table>

  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbSearchCustomerCriteria" imageurl="../Images/ButtonSearch.gif" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbResetCustomerCriteria" imageurl="../Images/ButtonReset.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">COMPLAINT LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
    <div align="center">
    <asp:GridView runat="server" id="GrdListAgreement" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield HeaderText="PERIODE COMPLAINT">
			<AlternatingItemTemplate>
				<asp:Label ID="lblPeriodeComplain" runat="server" Text="dd/MM/yyyy HH:MM:ss"></asp:Label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label ID="lblPeriodeComplain" runat="server" Text="dd/MM/yyyy HH:MM:ss"></asp:Label>			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="TYPE">
			<AlternatingItemTemplate>
				<asp:Label ID="lblComplainType" runat="server" Text="xxx20xxx"></asp:Label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label ID="lblComplainType" runat="server" Text="xxx20xxx"></asp:Label>		
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>

		<asp:templatefield HeaderText="RESULT">
			<AlternatingItemTemplate>
				<asp:Label ID="lblResult" runat="server" Text="Solved"></asp:Label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label ID="lblResult" runat="server" Text="Pending"></asp:Label>			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>

	
		<asp:templatefield HeaderText="SOLUTION">
			<AlternatingItemTemplate>
				<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../images/IconEdit.gif" PostBackUrl="CustomerComplainAddResult.aspx" />
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../images/IconEdit.gif" PostBackUrl="CustomerComplainAddResult.aspx" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
      
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
		</asp:XmlDataSource>
    </div>

  
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><img src="../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbAddCustomerComplain" imageurl="../Images/ButtonAdd.gif" PostBackUrl="CustomerComplainAddComplain.aspx" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>

   <br>
</div>
</form>
</body>
</html>
