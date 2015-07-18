<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled 1</title>
<link rel="stylesheet" type="text/css" href="../Confins.css" />
</head>

<body>

<form id="form1" runat="server">
		<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopiabukiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopiabu" align="center">CHANGE INSURANCE 
						COMPANY SELECTION</TD>
						<TD class="tdtopiabukanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
					<TABLE class="tablegrid" id="Table2" cellSpacing="1" cellPadding="2" width="95%" border="0">
						<TR class="tdganjil">
							<TD class="tdgenap" style="width: 160px">Agreement No</TD>
							<TD class="tdganjil"><asp:hyperlink id="HplinkAgreementNo" runat="server" text="xxxxxxx" NavigateUrl="../AccMaintenance/AgreementView.htm"></asp:hyperlink></TD>
							<TD class="tdgenap">Customer Name</TD>
							<TD class="tdganjil">
								<asp:hyperlink id="HpLinkCustName" text="xxxxxxx" runat="server" NavigateUrl="../Credit/ViewPersonalCustomer.htm"></asp:hyperlink></TD>
						</TR>
						<TR class="tdganjil">
							<TD class="tdgenap" style="width: 160px">Currency</TD>
							<TD class="tdganjil">
							<asp:label id="lblTenor0" runat="server" text="xxxxxxx"></asp:label></TD>
							<TD class="tdgenap">Paid By</TD>
							<TD class="tdganjil"><asp:label id="LblPaidBy" runat="server" text="xxxxxxx"></asp:label></TD>
						</TR>
						<TR class="tdganjil">
							<TD class="tdgenap" style="width: 160px">&nbsp;</TD>
							<TD class="tdganjil">&nbsp;</TD>
							<TD class="tdgenap">Tenor</TD>
							<TD class="tdganjil"><asp:label id="lblAssetYear" runat="server" text="xxxxxxx"></asp:label></TD>
						</TR>
						</TABLE>
		<asp:GridView  Width="95%" runat="server" id="GridView1" DataSourceID="XmlDataSource2" AutoGenerateColumns="False" CellPadding="2">
		<Columns>
			<asp:boundfield DataField="valstring30" HeaderText="CURRENT INSCO" SortExpression="valstring30">
			</asp:boundfield>
			<asp:boundfield DataField="valstring6" HeaderText="INSURED BY" SortExpression="valstring6">
			</asp:boundfield>
			<asp:boundfield DataField="valstring3" HeaderText="ASSET NO" SortExpression="valstring3">
			</asp:boundfield>
			<asp:boundfield DataField="valstring50" HeaderText="ASSET DESCRIPTION" SortExpression="valstring50">
			</asp:boundfield>
			<asp:boundfield DataField="valstring3" HeaderText="INSURANCE TYPE" SortExpression="valstring3">
			</asp:boundfield>
			<asp:boundfield DataField="valamount" HeaderText="AMOUNT COVERAGE" SortExpression="valamount">
				<ItemStyle HorizontalAlign="Right" />
			</asp:boundfield>
			<asp:boundfield DataField="valstring3" HeaderText="STATUS" SortExpression="valstring3">
			</asp:boundfield>
			<asp:templatefield HeaderText="COVERAGE">
				<ItemTemplate>
					<asp:HyperLink runat="server" id="HyperLink1" NavigateUrl="PolicyDetailView.htm" Target="_blank">Coverage
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
		</Columns>
		<HeaderStyle CssClass="tdjudulabu" />
		<AlternatingRowStyle CssClass="tdgenap" />		
	</asp:GridView>
	<asp:XmlDataSource runat="server" ID="XmlDataSource2" DataFile="../DataType.xml">
	</asp:XmlDataSource>
	
  <table width="95%"  border="0"  cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><asp:Image runat="server" id="imbFirstPage" ImageUrl="../images/butkiri1.gif" /></td>
      <td width="30" align="center">  <asp:Image runat="server" id="imbpreviouspage" ImageUrl="../images/butkiri.gif" /></td>
      <td width="30" align="center">  <asp:Image runat="server" id="imbnextpage" ImageUrl="../images/butkanan.gif" /></td>
      <td width="30" align="center">  <asp:Image runat="server" id="imblastpage" ImageUrl="../images/butkanan1.gif" /></td>
      <td align="center" style="width: 318px">Page 
         &nbsp; 
       <asp:TextBox runat="server" id="txtgo" CssClass="inptype" MaxLength="5" Width="10%"></asp:TextBox>
        <asp:Image runat="server" id="imggo" ImageUrl="../images/butgo.gif" />
	</td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  <br>
<TABLE class="tablegrid" id="Table3"  cellSpacing="1" cellPadding="2" width="95%" border="0">
	<TR class="tdganjil">
		<TD class="tdgenap" style="width: 160px">Asset No to change</TD>
		<TD class="tdganjil">
		<asp:DropDownList id="cboAssetNoChg" runat="server">
	<asp:ListItem>1</asp:ListItem>
	<asp:ListItem>2</asp:ListItem>
</asp:DropDownList>
</TD>
</TR>
	<TR class="tdganjil">
		<TD class="tdgenap" style="width: 160px">Insurance Co to change</TD>
		<TD class="tdganjil">
		<asp:DropDownList id="CboInsco" runat="server">
	<asp:ListItem>Select One</asp:ListItem>
	<asp:ListItem>PANIN-JKT</asp:ListItem>
</asp:DropDownList>
</TD>
</TR>
</TABLE>
<TABLE cellSpacing="0" cellPadding="0" width="95%" align="left" border="0">
<TR>
<TD>
<DIV align="right">
<asp:ImageButton id="imgsave" runat="server" width="100px" height="20px" imageurl="../Images/Buttonsave.gif" PostBackUrl="ChangeInsco.aspx" />
<asp:ImageButton id="imbcancel" runat="server" imageurl="../Images/Buttoncancel.gif" PostBackUrl="ChangeInsco.aspx"  causesvalidation="False" />
</DIV>
</TD>
</TR>
</TABLE>

</form>

</body>

</html>
