<%@ Page Language="vb" AutoEventWireup="false"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>DocumentList</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../include/AccAcq.css" type="text/css" rel="stylesheet">
		
	</HEAD>
	<body MS_POSITIONING="GridLayout">
		<form id="Form1" method="post" runat="server">
			<TABLE id="Table1" cellSpacing="0" cellPadding="0" width="95%" border="0">
				<TR>
					<TD><asp:label id="lblMessage" Runat="server" ForeColor="red"></asp:label>&nbsp;
					</TD>
				</TR>
			</TABLE>
			<asp:panel id="pnlAction" runat="server" horizontalalign="center" width="100%">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
					<TR class="trtopi">
						<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopi" align="center">PRINT DOCUMENT</TD>
						<TD class="tdtopikanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" border="0">
					<TR>
						<TD class="tdgenap" style="HEIGHT: 15px" width="25%">Agreement No.</TD>
						<TD class="tdganjil" style="HEIGHT: 15px">
							<asp:Hyperlink id="lblAgreementNo" runat="server" Text="xxxxx20xxxxx"></asp:Hyperlink></TD>
					</TR>
					<TR>
						<TD class="tdgenap">Customer Name</TD>
						<TD class="tdganjil">
							<asp:Hyperlink id="lblCustName" runat="server"  Text="xxxxx50xxxxx"></asp:Hyperlink></TD>
					</TR>
					<TR>
						<TD class="tdgenap">Product Type</TD>
						<TD class="tdganjil">
							<asp:Label id="lblFinanceType" runat="server" Text="xx3xx"></asp:Label></TD>
						<asp:Label id="lblAppID" runat="server" visible="False" Text="xxxxx20xxxxx"></asp:Label></TR>
					
				</TABLE>
								
				<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataTypeIsabel.xml">
				</asp:XmlDataSource>
				<asp:XmlDataSource runat="server" ID="XmlDataSource2" DataFile="../DataType.xml">
				</asp:XmlDataSource>
			
				<br>
				<asp:Panel id="pnlList" Runat="server" Visible="True">
					<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
					<TR class="trtopiabu">
					<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
					<TD class="tdtopi" align="center">LIST OF DOCUMENT</TD>
					<TD class="tdtopikanan" width="10">&nbsp;</TD>
					</TR>
					</TABLE>
					<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
					<TR align="center">
					<TD>
					<asp:GridView id="dtgView" runat="server" width="100%" CellPadding="2" autogeneratecolumns="False" allowsorting="True" DataSourceID="XmlDataSource2">
						<Columns>
							<asp:templatefield SortExpression="DocumentName" HeaderText="DOCUMENT NAME">
								<ItemStyle HorizontalAlign="Left" />
								<ItemTemplate>
									<asp:Label id="lblDocumentName" runat="server" text="xxxxx50xxxxx">
									</asp:Label>
									<asp:Label id="lblDocID" runat="server" visible="False" text="xxxxx20xxxxx">
									</asp:Label>
									<asp:Label id="lblNumOfAssetUnit" runat="server" visible="False" text="xx2xx">
									</asp:Label>
								</ItemTemplate>
							</asp:templatefield>
							<asp:templatefield SortExpression="IsPrint" HeaderText="PRINT">
								<ItemStyle HorizontalAlign="center" />
								<ItemTemplate>
									<asp:Label id="lblPrint" runat="server" text="x1x">
									</asp:Label>
								</ItemTemplate>
							</asp:templatefield>
							<asp:templatefield SortExpression="LastPrintedDate" HeaderText="LAST PRINTED DATE">
								<ItemStyle HorizontalAlign="Center" />
								<ItemTemplate>
									<asp:Label id="lblLastPrintedDate" runat="server" text="dd/mm/yyyy">
									</asp:Label>
								</ItemTemplate>
							</asp:templatefield>
							<asp:templatefield SortExpression="LastPrintedBy" HeaderText="LAST PRINTED BY">
								<ItemStyle HorizontalAlign="Left" />
								<ItemTemplate>
									<asp:Label id="lblLastPrintedBy" runat="server" text="xxxxxx20xxxxx">
									</asp:Label>
								</ItemTemplate>
							</asp:templatefield>
							<asp:templatefield SortExpression="PrintNum" HeaderText="PRINT NUM">
								<ItemStyle HorizontalAlign="Right" />
								<ItemTemplate>
									<asp:Label id="lblPrintNum" runat="server" text="99">
									</asp:Label>
								</ItemTemplate>
							</asp:templatefield>
							<asp:templatefield HeaderText="ACTION">
								<ItemStyle HorizontalAlign="Center" />
								<ItemTemplate>
									<asp:LinkButton id="lnkPrint" Runat="server" CausesValidation="false" text="Print" CommandName="Print">Print</asp:LinkButton>
								</ItemTemplate>
							</asp:templatefield>
						</Columns>
						<HeaderStyle CssClass="tdjudul" />
						<AlternatingRowStyle CssClass="tdgenap" />
					</asp:GridView>
					</TD>
					<TR>
					<TD>
					<asp:ImageButton id="imgBack" runat="server" imageurl="../Images/ButtonBack.gif" CausesValidation="False" />
					</TD>
					</TR>
					</TR>
					</TABLE>
				</asp:Panel>
				</br><br>
				</br></BR>
			</asp:panel></form>
	</body>
</HTML>
