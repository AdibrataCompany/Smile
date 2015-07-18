<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
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
<form id="frm1" runat="server">
<div align="center">
  <div align="center"> 
    <table width="95%" border="0" cellspacing="0" cellpadding="0">
      <tr class="trtopikuning"> 
        <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
        <td align="center" class="tdtopibiru">PREPAYMENT WITHOUT RRD - INQUIRY</td>
        <td width="10" class="tdtopibirukanan">&nbsp;</td>
      </tr>
    </table>
  </div>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="15%" class="tdgenap">Search By</td>
      <td class="tdganjil">
      <asp:DropDownList ID="ddlSearchBy" runat="server">
      <asp:ListItem Text="Name" Value="Name"></asp:ListItem>
      <asp:ListItem Text="Agreement No" Value="AgreementNo"></asp:ListItem>
      <asp:ListItem Text="Request No" Value="RequestNo"></asp:ListItem>
      </asp:DropDownList>
	<asp:TextBox ID="txtSearchBy" runat="server" CssClass="inptype"></asp:TextBox>
	</td>
    </tr>
    <tr> 
      <td width="15%" class="tdgenap">Request Date</td>
      <td class="tdganjil">
		<asp:TextBox ID="txtRequestDate" runat="server" CssClass="inptype"></asp:TextBox>
        <img src="../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"></td>
    </tr>
	<tr> 
      <td width="15%" class="tdgenap">Status</td>
      <td class="tdganjil"><asp:Dropdownlist ID="ddlStatus" runat="server">
      <asp:ListItem Text="Request" Value="REQ"></asp:ListItem>
      <asp:ListItem Text="Approved" Value="APR"></asp:ListItem>
      <asp:ListItem Text="Execute" Value="EXC"></asp:ListItem>
      </asp:Dropdownlist>
    </tr>


  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><img src="../../Images/ButtonSearch.gif" width="100" height="20" border="0"> 
        <img src="../../Images/ButtonReset.gif" width="100" height="20" border="0"> 
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">AGREEMENT LISTING</td>
      <td width="10" class="tdtopibirukanan">&nbsp;</td>
    </tr>
  </table>
  
  <table width="95%" border="0" cellpadding="3" cellspacing="1" align="center">
    <tr>
    <td>
   <asp:GridView runat="server" id="grdAgreementList" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="100%" >
    <Columns>
		<asp:templatefield HeaderText="REQUEST NO">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomerName" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:boundfield DataField="valstring20" HeaderText="AGREEMENT NO" SortExpression="valstring20">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" HeaderText="NAME" SortExpression="valstring50">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring3" HeaderText="REQUEST DATE" SortExpression="valstring3">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring3" HeaderText="STATUS" SortExpression="valstring3">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:templatefield HeaderText="PROCESS">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="hypAction" ImageUrl="../../images/IconEdit.gif" NavigateURL="PrepaymentWithOutRRDExecute.aspx" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		</Columns>
			<HeaderStyle CssClass="tdjudulbiru" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
		</td>
		</tr>
	</table>
    </div>

  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><img src="../../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../../images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
</form>
</body>
</html>
