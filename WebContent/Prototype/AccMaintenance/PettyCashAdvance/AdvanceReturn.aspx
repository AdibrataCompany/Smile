<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>Advance Request</title>
		<meta content="Microsoft Visual Studio.NET 7.0" name="GENERATOR">
		<meta content="Visual Basic 7.0" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../../Confins.css" type="text/css" rel="stylesheet">
		<SCRIPT language="javascript" src="../../Elsa.js">
		</SCRIPT>
	</HEAD>
	<body vLink="blue" aLink="black" link="blue" ms_positioning="GridLayout">
		<form id="Form1" method="post" runat="server">
				<INPUT id="hidCurrencyRateFrom" type="hidden" name="hidCurrencyRateFrom" runat="server">
			<asp:label id="lblMessage" runat="server" font-size="11px" font-name="Verdana" forecolor="#FF0000"></asp:label><BR>
			<asp:panel id="pnlReview" runat="server" Height="168px">
				<TABLE id="tblNextHeader" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR>
				<TD class="tdtopibirukiri" width="10" height="20">&nbsp;</TD>
				<TD class="tdtopibiru" align="center">PETTY CASH ADVANCE RETURN</TD>
				<TD class="tdtopibirukanan" width="10">&nbsp;</TD>
				</TR>
				</TABLE>
				<TABLE class="tablegrid" id="tbl" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
				<tr>
					<TD class="tdgenap" width="20%">Employee Name</TD>
					<TD class="tdganjil" width="30%">
					<asp:Label id="lblEmployeeName0" runat="server">xxxxx20xxxxx</asp:Label>
					</TD>
					<TD class="tdgenap" width="20%">Date</TD>
					<TD class="tdganjil" width="30%">
					<asp:Label id="lblDate0" runat="server">dd/mm/yyyy</asp:Label>
					</TD>
				</tr>
				<tr>
					<TD class="tdgenap" width="20%">Non Operational</TD>
					<TD class="tdganjil" width="30%" colspan="3" style="width: 60%">Yes</TD>
				</tr>
				<tr>
					<TD class="tdgenap" width="20%">Currency</TD>
					<TD class="tdganjil">
					<asp:Label id="lblCurrency0" runat="server">IDR</asp:Label>
					</TD>
					<TD class="tdgenap" style="HEIGHT: 15px; ">Amount</TD>
					<TD class="tdganjil" style="HEIGHT: 15px" width="30%" align="right">
					<asp:Label id="lblAmount0" runat="server">999,999,999.99</asp:Label>
					</TD>
				</tr>
				<TR>
				<TD class="tdgenap" width="20%">Description</TD>
				<TD class="tdganjil" colSpan="3">
				<asp:Label id="lblDesc" runat="server">xxxxxxxxxx50xxxxxxxxxx</asp:Label>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="20%">Outstanding Amount</TD>
				<TD class="tdganjil" colSpan="3">
				<asp:Label id="lblOsAmount" runat="server">999,999,999.99</asp:Label>
				</TD>
				</TR>
				</TABLE>
				<table cellSpacing="1" cellPadding="3" width="95%" align="center" border="0" class="tablegrid">
					<tr>
						<TD class="tdjudulbiru" colspan="4" style="width: 50%">RETURN DETAIL</TD>
					</tr>
					<tr>
						<td class="tdgenap" style="width: 20%">Return Date</td>
						<td align="left" class="tdganjil" style="width: 30%">dd/mm/yyyy</td>
						<td class="tdgenap" style="width: 20%">Amount Returned</td>
						<td width="25%" class="tdganjil" align="right">999,999,999.99</td>
					</tr>
					<tr>
						<td class="tdgenap" style="width: 20%">Reference No</td>
						<td class="tdganjil" colspan="3">
						<asp:TextBox runat="server" id="txtReferenceNo" CssClass="inptype">
						</asp:TextBox>
						<font color="red">&nbsp;*)</font></td>
					</tr>
					<tr>
						<td class="tdgenap" style="width: 20%">Bank Account From</td>
						<td class="tdganjil" colspan="3">
						<asp:DropDownList runat="server" id="ddlBankAccountFrom">
							<asp:ListItem>Select One</asp:ListItem>
						</asp:DropDownList>
						<font color="red">&nbsp;*)</font></td>
					</tr>
					<tr>
						<td class="tdgenap" style="width: 20%">Bank Account To</td>
						<td class="tdganjil" colspan="3">
						<asp:DropDownList runat="server" id="ddlBankAccountTo">
							<asp:ListItem>Select One</asp:ListItem>
						</asp:DropDownList>
						<font color="red">&nbsp;*)</font></td>
					</tr>
					<tr>
						<td class="tdgenap" style="width: 20%">Return Notes</td>
						<td class="tdganjil" colspan="3">
						<asp:TextBox id="txtReturnNotes" runat="server" CssClass="inptype" TextMode="MultiLine" Width="500px" Height="30px">
						</asp:TextBox>
						<font color="red">&nbsp;*)</font></td>
					</tr>
				</table>
				<br>
				<TABLE id="tblAdvanceDetail" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR>
				<TD class="tdtopibirukiri" width="10" height="20">&nbsp;</TD>
				<TD class="tdtopibiru" align="center">PETTY CASH ADVANCE - TRANSACTION</TD>
				<TD class="tdtopibirukanan" width="10">&nbsp;</TD>
				</TR>
				</TABLE>
				<div align="center">
					<asp:GridView Width="95%" runat="server" id="grdAdvance0" DataSourceID="XmlDataSource2" AutoGenerateColumns="False" ShowFooter="true">
						<Columns>
							<asp:templatefield HeaderText="PETTY CASH NO">
								<ItemTemplate>
									<asp:HyperLink runat="server" id="hypPettyCashNo0" NavigateUrl="../PettyCash/PettyCashView.htm" Target="_blank">xxxxx20xxxxx
									</asp:HyperLink>
								</ItemTemplate>
							</asp:templatefield>
							<asp:boundfield DataField="valdate" HeaderText="PC DATE" SortExpression="valdate">
								<ItemStyle HorizontalAlign="Center" />
							</asp:boundfield>
							<asp:boundfield DataField="valstring20" HeaderText="TRANSACTION" SortExpression="valstring20">
							</asp:boundfield>
							<asp:templatefield FooterText="TOTAL" HeaderText="DESCRIPTION">
								<ItemTemplate>
									<asp:Label runat="server" id="lblDescription" Text="xxxxxxxxxx50xxxxxxxxxx">
									</asp:Label>
								</ItemTemplate>
								<FooterTemplate>
									<asp:Label runat="server" id="lblFooterTotalAmountText" Text="TOTAL" Font-Bold="true" />
								</FooterTemplate>
								<ItemStyle HorizontalAlign="Center" />
								<FooterStyle HorizontalAlign="Right" />
							</asp:templatefield>
							<asp:templatefield FooterText="TOTAL" HeaderText="AMOUNT">
								<ItemTemplate>
									<asp:Label runat="server" id="lblAmount" Text="999,999,999.99">
									</asp:Label>
								</ItemTemplate>
								<FooterTemplate>
									<asp:Label runat="server" id="lblFooterTotalAmount" Text="999,999,999,999.99" Font-Bold="true" />
								</FooterTemplate>
								<ItemStyle HorizontalAlign="Right" />
								<FooterStyle HorizontalAlign="Right" />
							</asp:templatefield>
						</Columns>
						<HeaderStyle CssClass="tdjudulbiru" />
						<AlternatingRowStyle CssClass="tdgenap" />
					</asp:GridView>
					<asp:XmlDataSource runat="server" ID="XmlDataSource2" DataFile="../../DataType.xml">
					</asp:XmlDataSource>
				</div>
				<br>
				<asp:Panel id="pnlSave" runat="server" HorizontalAlign="Left">
					<TABLE id="Table4" width="95%" align="center" border="0">
					<TR>
					<TD>
					<DIV align="right">
					<asp:ImageButton id="imbSave" runat="server" imageurl="../../Images/ButtonSave.gif" PostBackUrl="AdvanceReturnSearch.aspx" />
					<asp:ImageButton id="imbCancel" runat="server" imageurl="../../Images/ButtonCancel.gif" causesvalidation="False" PostBackUrl="AdvanceReturnSearch.aspx" />
					</DIV>
					</TD>
					</TR>
					</TABLE>
				</asp:Panel>
				</asp:panel>&nbsp;</form>
	</body>
</HTML>
