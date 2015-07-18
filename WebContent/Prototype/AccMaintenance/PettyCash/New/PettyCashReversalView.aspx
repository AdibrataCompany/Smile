<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>PETTY CASH REVERSAL VIEW</title>
		<meta content="Microsoft Visual Studio.NET 7.0" name="GENERATOR">
		<meta content="Visual Basic 7.0" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<!--
		<LINK href="../../Include/AccMnt.css" type="text/css" rel="stylesheet">
		-->
		<LINK href='../../../Confins.css' type=text/css rel=stylesheet >
		<SCRIPT src="../../../Elsa.js"></SCRIPT>
	</HEAD>
	<body vLink="blue" aLink="black" link="blue" ms_positioning="GridLayout">
		<form id="Form1" method="post" runat="server">
			<asp:label id="lblMessage" runat="server" font-size="11px" font-name="Verdana" forecolor="#993300"></asp:label>
			<asp:panel id="pnlList" runat="server" Width="100%">
				<BR>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR class="trtopikuning" height="20">
				<TD class="tdtopibirukiri" width="10">&nbsp;</TD>
				<TD class="tdtopibiru" align="center">PETTY CASH REVERSAL</TD>
				<TD class="tdtopibirukanan" width="10">&nbsp;</TD>
				</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" align="center" border="0">
				<TR>
				<TD class="tdgenap" width="20%">Petty Cash No</TD>
				<TD class="tdganjil" width="30%">
				<asp:Label id="lblPettyCashNo" runat="server">xxxxx20xxxxx</asp:Label>
				</TD>
				<TD class="tdgenap" width="20%">Ref Voucher No</TD>
				<TD class="tdganjil" width="30%">
				<asp:Label id="lblRefVoucherNo" runat="server">xxxxx20xxxxx</asp:Label>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="20%">Employee Name</TD>
				<TD class="tdganjil" width="30%">
				<asp:Label id="lblEmployeeName" runat="server">xxxxx20xxxxx</asp:Label>
				</TD>
				<TD class="tdgenap" width="20%">Date</TD>
				<TD class="tdganjil" width="30%">
				<asp:Label id="lblDate" runat="server">dd-mm-yyyy</asp:Label>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="20%">Bank Account</TD>
				<TD class="tdganjil" width="30%">
				<asp:Label id="lblBankAccount" runat="server">xxxxx20xxxxx</asp:Label>
				</TD>
				<TD class="tdgenap" width="20%">Currency</TD>
				<TD class="tdganjil" align="left" width="30%">
				<asp:Label id="lblCurrencyID" runat="server">IDR</asp:Label>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="20%">Department</TD>
				<TD class="tdganjil" width="30%">
				<asp:Label id="lblSubBranch" runat="server">xxxxx20xxxxx</asp:Label>
				</TD>
				<TD class="tdgenap" width="20%">Amount</TD>
				<TD class="tdganjil" align="right" width="30%">
				<asp:Label id="lblAmount" runat="server">999,999,999.99</asp:Label>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="20%">Sub Branch</TD>
				<TD class="tdganjil" width="80%" colSpan="3">
				<asp:Label id="lblDepartment" runat="server">xxxxx20xxxxx</asp:Label>
				</TD>
				</TR>				
				<TR>
				<TD class="tdgenap" width="20%">Description</TD>
				<TD class="tdganjil" width="80%" colSpan="3">
				<asp:Label id="lblDescription" runat="server">xxxxx30xxxxx</asp:Label>
				</TD>
				</TR>
				<TR>
				<TD class="tdjudulbiru" align="center" colSpan="4">TRANSACTION DETAIL</TD>
				</TR>
				</TABLE>
				<div align="center">
					<asp:GridView Width="95%" runat="server" id="grdPettyCash" DataSourceID="XmlDataSource2" AutoGenerateColumns="False">
					<Columns>
						<asp:TemplateField HeaderText="TRANSACTION">
							<ItemTemplate>
								<asp:HyperLink id="hyPettyCashNo" runat="server" text='xxxxx20xxxxx' NavigateUrl="">
								</asp:HyperLink>
							</ItemTemplate>
						</asp:TemplateField>
						<asp:boundfield DataField="valstring30" HeaderText="DESCRIPTION" SortExpression="valstring30">
						</asp:boundfield>
						<asp:boundfield DataField="valAmount" HeaderText="AMOUNT" SortExpression="valAmount">
							<ItemStyle HorizontalAlign="Right" />
						</asp:boundfield>
					</Columns>
						<HeaderStyle CssClass="tdjudulbiru" />
						<AlternatingRowStyle CssClass="tdgenap" />
					</asp:GridView>
					<asp:XmlDataSource runat="server" ID="XmlDataSource2" DataFile="../../DataType.xml">
					</asp:XmlDataSource>
				</div>				
				<asp:Panel id="pnlbutton" runat="server" HorizontalAlign="Left">
					<TABLE id="Table4" width="95%" align="center" border="0">
					<TR>
					<TD>
					<DIV align="right">
					<asp:ImageButton id="imbSave" runat="server" causesvalidation="False" imageurl="../../Images/ButtonSave.gif" alt="Save" />&nbsp;
					<asp:ImageButton id="imbCancel" runat="server" causesvalidation="False" imageurl="../../Images/ButtonCancel.gif" alt="Cancel" />&nbsp;
					</DIV>
					</TD>
					</TR>
					</TABLE>
				</asp:Panel>
			</asp:panel></form>
	</body>
</HTML>
