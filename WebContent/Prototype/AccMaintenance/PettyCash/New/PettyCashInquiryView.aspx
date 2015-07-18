<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>VIEW PETTY CASH TRANSACTION</title>
		<meta content="Microsoft Visual Studio.NET 7.0" name="GENERATOR">
		<meta content="Visual Basic 7.0" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<!--
		<LINK href="../../../../Include/AccMnt.css" type="text/css" rel="stylesheet">
		-->
		<LINK href='../../../Confins.css' type=text/css rel=stylesheet >
		<SCRIPT src="../../../../../Elsa.js"></SCRIPT>
		<script language="javascript">
		var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1)
			var ServerName = 'http://<%=Request.servervariables("SERVER_NAME")%>/';
			
			function OpenWinMain(GiroNo,PDCReceiptNo,branchid,flagfile){
				
					window.open(ServerName + App +  '/AccMnt/PDC/PDCInquiryDetail.aspx?GiroNo=' + GiroNo + '&PDCReceiptNo=' + PDCReceiptNo + '&branchid=' + branchid + '&flagfile=' + flagfile , null, 'left=50, top=10, width=900, height=900, menubar=0,scrollbars=1')
					}
			
		</script>
	</HEAD>
	<body vLink="blue" aLink="black" link="blue" ms_positioning="GridLayout">
		<form id="Form1" method="post" runat="server">
			<asp:label id="lblMessage" runat="server" font-size="11px" font-name="Verdana" forecolor="#993300"></asp:label>
			<asp:panel id="pnlList" runat="server" Width="100%">
				<BR>
				<TABLE cellSpacing="0" cellPadding="0" width="100%" align="center" border="0">
				<TR height="20">
				<TD class="tdtopibirukiri" width="10">&nbsp;</TD>
				<TD class="tdtopibiru" align="center">VIEW PETTY CASH TRANSACTION</TD>
				<TD class="tdtopibirukanan" width="10">&nbsp;</TD>
				</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="100%" align="center" border="0">
				<TR>
				<TD class="tdgenap" width="20%">Petty Cash No</TD>
				<TD class="tdganjil" width="30%">
				<asp:Label id="lblPettyCashNo" runat="server">xxxxx20xxxxx</asp:Label>
				</TD>
				<TD class="tdgenap" style="width: 20%">Ref Voucher No</TD>
				<TD class="tdganjil" width="35%" colSpan="2">
				<asp:Label id="lblRefVoucherNo" runat="server">xxxxx20xxxxx</asp:Label>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="20%">Employee Name</TD>
				<TD class="tdganjil" width="30%">
				<asp:Label id="lblEmployeeName" runat="server">xxxxx20xxxxx</asp:Label>
				</TD>
				<TD class="tdgenap" style="width: 20%">Date</TD>
				<TD class="tdganjil" width="35%" colSpan="2">
				<asp:Label id="lblDate" runat="server">dd-mm-yyyy</asp:Label>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="20%">Bank Account</TD>
				<TD class="tdganjil" width="30%">
				<asp:Label id="lblBankAccount" runat="server">xxxxx20xxxxx</asp:Label>
				</TD>
				<TD class="tdgenap" style="width: 20%">Amount</TD>
				<TD class="tdganjil" width="5%">
				<asp:Label id="lblCurrencyID" Runat="Server">IDR</asp:Label>
				</TD>
				<TD class="tdganjil" align="right" width="30%">
				<asp:Label id="lblAmount" runat="server" EnableViewState="False">999,999,999.99
				</asp:Label>
				</TD>
				</TR>
				<tr>
					<TD class="tdgenap" width="20%">Sub Branch</TD>
					<TD class="tdganjil" width="80%" colSpan="4">
					<asp:Label id="lblSubBranch" runat="server">xxxxx20xxxxx</asp:Label>
					</TD>
				</tr>
				<TR>
				<TD class="tdgenap" width="20%">Department</TD>
				<TD class="tdganjil" width="80%" colSpan="4">
				<asp:Label id="lblDepartement" runat="server">xxxxx20xxxxx</asp:Label>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="20%">Description</TD>
				<TD class="tdganjil" width="80%" colSpan="4">
				<asp:Label id="lblDescription" runat="server">xxxxx20xxxxx</asp:Label>
				</TD>
				</TR>
				<TR>
				<TD class="tdjudulbiru" align="center" colSpan="5">TRANSACTION DETAIL</TD>
				</TR>
				</TABLE>
				<div align="center">
					<asp:GridView Width="100%" runat="server" id="grdTransaction" DataSourceID="XmlDataSource2" AutoGenerateColumns="False">
					<Columns>
						<asp:TemplateField HeaderText="COA ID">
							<ItemTemplate>
								<asp:Label id="lblCOAID" runat="server" text='xxxxx20xxxxx'>
								</asp:Label>
							</ItemTemplate>
						</asp:TemplateField>
						<asp:TemplateField HeaderText="TRANSACTION">
							<ItemTemplate>
								<asp:HyperLink id="hyPettyCashNo" runat="server" text='xxxxx20xxxxx'>
								</asp:HyperLink>
							</ItemTemplate>
						</asp:TemplateField>
						<asp:TemplateField HeaderText="DESCRIPTION">
							<ItemTemplate>
								<asp:Label id="lblDescription" runat="server" text='xxxxx30xxxxx'>
								</asp:Label>
							</ItemTemplate>
							<FooterStyle HorizontalAlign="Right" />
							<FooterTemplate>
								<asp:Label id="lblTotal" runat="server">Total</asp:Label>
							</FooterTemplate>
						</asp:TemplateField>
						<asp:TemplateField HeaderText="AMOUNT">
							<ItemStyle HorizontalAlign="Right" />
							<ItemTemplate>
								<asp:Label id="lblPCDAmount" runat="server" text='999,999,999.99'>
								</asp:Label>
							</ItemTemplate>
							<FooterStyle HorizontalAlign="Right" />
							<FooterTemplate>
								<asp:Label id="lblTotal" runat="server">999,999,999.99</asp:Label>
							</FooterTemplate>
						</asp:TemplateField>
					</Columns>
					<HeaderStyle CssClass="tdjudulbiru" />
					<AlternatingRowStyle CssClass="tdgenap" />
				</asp:GridView>
				<asp:XmlDataSource runat="server" ID="XmlDataSource2" DataFile="../../DataType.xml">
				</asp:XmlDataSource>
				</div>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="100%" align="center" border="0">
				<TR>
				<TD class="tdjudulbiru" colSpan="4">CORRECTION INFORMATION</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="20%">Cashier</TD>
				<TD class="tdganjil" width="30%">
				<asp:Label id="lblCashierReversal" runat="server">xxxxx20xxxxx</asp:Label>
				</TD>
				<TD class="tdgenap" width="20%">Ref Voucher No</TD>
				<TD class="tdganjil" width="30%">
				<asp:Label id="lblRefVoucherNoReversal" runat="server">xxxxx20xxxxx
				</asp:Label>
				</TD>
				</TR>
				<TR>
				<TD class="tdjudulbiru" colSpan="4">STATUS</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="20%">Status</TD>
				<TD class="tdganjil" width="30%">
				<asp:Label id="lblStatus" runat="server">xxxxx10xxxxx</asp:Label>
				</TD>
				<TD class="tdgenap" width="20%">Status Date</TD>
				<TD class="tdganjil" width="30%">
				<asp:Label id="lblStatusDate" runat="server">dd-mm-yyyy</asp:Label>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="20%">Cashier</TD>
				<TD class="tdganjil" width="30%">
				<asp:Label id="lblCashierStatus" runat="server">xxxxx20xxxxx</asp:Label>
				</TD>
				<TD class="tdgenap" width="20%"></TD>
				<TD class="tdganjil" width="30%"></TD>
				</TR>
				</TABLE>
				<asp:Panel id="pnlbutton" Runat="server">
					<TABLE cellSpacing="0" cellPadding="2" width="100%" align="center" border="0">
					<TR>
					<TD align="left">
					<asp:ImageButton id="imbPrint" Runat="server" ImageUrl="../../Images/ButtonPrint.gif" />
					</TD>
					<TD>
					<DIV align="right">
					<asp:ImageButton id="imbExit" runat="server" ImageUrl="../../Images/ButtonExit.gif" PostBackUrl="javascript:window.close();" />
					</DIV>
					</TD>
					</TR>
					</TABLE>
				</asp:Panel>
			</asp:panel>
		</form>
	</body>
</HTML>
