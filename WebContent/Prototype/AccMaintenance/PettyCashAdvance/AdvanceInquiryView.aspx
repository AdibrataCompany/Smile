<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>VIEW CASH ADVANCE</title>
		<meta content="Microsoft Visual Studio.NET 7.0" name="GENERATOR">
		<meta content="Visual Basic 7.0" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../../Confins.css" type="text/css" rel="stylesheet">
		<SCRIPT src="../../Elsa.js"></SCRIPT>
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
			<asp:label id="lblMessage" runat="server" forecolor="#993300" font-name="Verdana" font-size="11px"></asp:label><asp:panel id="pnlList" runat="server"><BR>
				<TABLE cellSpacing="0" cellPadding="0" width="100%" align="center" border="0">
					<TR class="trtopikuning">
						<TD class="tdtopibirukiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopibiru" align="center">VIEW CASH ADVANCE</TD>
						<TD class="tdtopibirukanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="100%" align="center" border="0">
					<TR>
						<TD class="tdgenap">Advance No.</TD>
						<TD class="tdganjil">
							<asp:label id="lblAdvanceNo" runat="server"></asp:label></TD>
						<TD class="tdgenap">Ref. Voucher No.</TD>
						<TD class="tdganjil" colSpan="2">
							<asp:label id="lblRefVoucherNo" runat="server"></asp:label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="HEIGHT: 16px" width="20%">Employee Name</TD>
						<TD class="tdganjil" style="HEIGHT: 16px" width="30%">
							<asp:label id="lblEmployeeName" runat="server"></asp:label></TD>
						<TD class="tdgenap" style="HEIGHT: 16px" width="20%">Date</TD>
						<TD class="tdganjil" style="HEIGHT: 16px" width="30%" colSpan="2">
							<asp:label id="lblDate" runat="server" Width="136px"></asp:label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Bank Account</TD>
						<TD class="tdganjil" width="30%">
							<asp:label id="lblBankAccount" runat="server" Width="112px"></asp:label></TD>
						<TD class="tdgenap" width="15%">Amount
						</TD>
						<TD class="tdganjil" width="5%">
							<asp:Literal id="ltlCurrencyID" runat="server"></asp:Literal></TD>
						<TD class="tdganjil" align="right" width="30%">
							<asp:label id="lblAmount" runat="server" Width="264px" EnableViewState="False"></asp:label></TD>
					</TR>
					<TR>
						<TD class="tdgenap">Description</TD>
						<TD class="tdganjil" width="30%" colSpan="4">
							<asp:label id="lblDescription" runat="server" Width="704px"></asp:label></TD>
					</TR>
					<TR>
						<TD class="tdjudulbiru" colSpan="5">RETURN INFORMATION</TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Return To Account</TD>
						<TD class="tdganjil" width="30%">
							<asp:label id="lblReturnToAccount" runat="server"></asp:label></TD>
						<TD class="tdgenap" width="20%">Ref. Voucher No.</TD>
						<TD class="tdganjil" width="30%" colSpan="2">
							<asp:label id="lblRefVoucherNoReturn" runat="server"></asp:label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Cashier</TD>
						<TD class="tdganjil" width="30%">
							<asp:label id="lblCashier" runat="server"></asp:label></TD>
						<TD class="tdgenap" width="20%"></TD>
						<TD class="tdganjil" width="30%" colSpan="2"></TD>
					</TR>
					<TR>
						<TD class="tdjudulbiru" colSpan="5">STATUS</TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Status</TD>
						<TD class="tdganjil" width="30%">
							<asp:label id="lblStatus" runat="server"></asp:label></TD>
						<TD class="tdgenap" width="20%">Status Date</TD>
						<TD class="tdganjil" width="30%" colSpan="2">
							<asp:label id="lblStatusDate" runat="server"></asp:label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Cashier</TD>
						<TD class="tdganjil" width="30%">
							<asp:label id="lblCashierStatus" runat="server"></asp:label></TD>
						<TD class="tdgenap" width="20%"></TD>
						<TD class="tdganjil" width="30%" colSpan="2"></TD>
					</TR>
				</TABLE>
				<asp:panel id="pnlbutton" runat="server">
					<TABLE cellSpacing="0" cellPadding="0" width="100%" align="center" border="0">
						<TR>
							<TD align="left">
								<asp:ImageButton id="imbPrint" runat="server" ImageUrl="../../Images/ButtonPrint.gif" alt="Print"></asp:ImageButton>
							<TD>
							<TD align="right"><IMG id="imbexit" style="CURSOR: hand" onfocus="Close();" onclick="Close();" alt="" src="../../Images/Buttonexit.gif">
							</TD>
						</TR>
					</TABLE>
				</asp:panel>
			</asp:panel></form>
	</body>
</HTML>
