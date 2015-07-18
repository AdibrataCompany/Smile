<%@ Page Language="vb" AutoEventWireup="false" Codebehind="ViewPettyCashReimburse.aspx.vb" Inherits="AdIns.Application.Eloan.Web.AccMnt.ViewPettyCashReimburse"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>ViewPettyCashReimburse</title>
		<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
		<LINK href='../../../../include/<%= request("style") %>.css' type=text/css rel=stylesheet >
			<SCRIPT src="../../../../../Elsa.js"></SCRIPT>
			<script language="javascript">
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1)
			var ServerName = 'http://<%=Request.servervariables("SERVER_NAME")%>/';
			function OpenWinViewPCInquiry(pStyle,pPettyCashNo,pBranch)
				{				
					window.open(ServerName + App +  '/AccMnt/Cashier/PettyCash/PettyCashTransaction/PettyCashInquiryView.aspx?style=' + pStyle + '&PettyCashNo=' + pPettyCashNo + '&BranchId=' + pBranch, 'userlookup', 'left=50, top=50, width=800, height=500, menubar=0,scrollbars=1')
				}
			</script>
	</HEAD>
	<body MS_POSITIONING="GridLayout">
		<TABLE height="520" cellSpacing="0" cellPadding="0" width="95%" border="0" ms_2d_layout="TRUE" aling="Center">
			<TR vAlign="top">
				<TD width="10" height="15"></TD>
				<TD width="937"></TD>
			</TR>
			<TR vAlign="top">
				<TD height="505"></TD>
				<TD>
					<div align="center">
						<form id="Form1" method="post" runat="server">
							<table width="100%" border="0" cellspacing="0" cellpadding="0" height="20" align="center">
								<tr class="trtopikuning">
									<td width="10" height="20" class="tdtopikiri">&nbsp;</td>
									<td align="center" class="tdtopi">VIEW PETTY CASH REIMBURSE</td>
									<td width="10" class="tdtopikanan">&nbsp;</td>
								</tr>
							</table>
							<table width="100%" border="0" cellpadding="2" cellspacing="1" class="tablegrid" height="97"
								align="center">
								<tr>
									<td width="20%" class="tdgenap" height="23">Branch Request</td>
									<td width="30%" class="tdganjil" height="23">
										<asp:label id="lblBranchRequest" runat="server"></asp:label></td>
									<td width="20%" class="tdgenap" height="23">Request Date</td>
									<td width="30%" class="tdganjil" height="23">
										<asp:label id="lblRequestDate" runat="server"></asp:label></td>
								</tr>
								<tr>
									<td width="20%" class="tdgenap" height="23">Request No.</td>
									<td width="30%" class="tdganjil" height="23">
										<asp:label id="LblRequestNo" runat="server"></asp:label></td>
									<td width="20%" class="tdgenap" height="23">
										Currency</td>
									<td width="30%" class="tdganjil" height="23">
										<asp:Label id="lblCurrency" runat="server"></asp:Label></td>
								</tr>
								<tr>
									<td width="20%" class="tdgenap" height="23">Branch Bank Account</td>
									<td width="30%" class="tdganjil" height="23">
										<asp:label id="LblBranchBankAccount" runat="server"></asp:label></td>
									<td width="20%" class="tdgenap" height="23">Total Request Amount</td>
									<td width="30%" class="tdganjil" height="23">
										<asp:label id="LblRequestAmount" runat="server" align="right"></asp:label></td>
								</tr>
								<tr>
									<td width="20%" class="tdgenap" height="23">Description</td>
									<td width="30%" class="tdganjil" height="23" colspan="3">
										<asp:label id="lblDescription" runat="server"></asp:label></td>
								</tr>
							</table>
							<table width="100%" border="0" cellspacing="0" cellpadding="0" height="20" align="center">
								<tr>
									<td colspan="3" class="tdjudul" align="center">PETTY CASH TRANSACTION LIST</td>
								</tr>
							</table>
							<asp:datagrid id="DtdTransactionList" runat="server" AutoGenerateColumns="False" BorderWidth="0px"
								cellpadding="3" cellspacing="1" CssClass="tablegrid"  ShowFooter="True">
								<AlternatingItemStyle CssClass="tdgenap"></AlternatingItemStyle>
								<ItemStyle CssClass="tdganjil" width="20px"></ItemStyle>
								<HeaderStyle HorizontalAlign="Center" CssClass="tdjudul" Height="20px"></HeaderStyle>
								<FooterStyle HorizontalAlign="Right" Width="30%" CssClass="tdjudul" Height="20px"></FooterStyle>
								<Columns>
									<asp:TemplateColumn SortExpression="PETTYCASHNO" HeaderText="PETTY CASH NO.">
										<HeaderStyle HorizontalAlign="Center" Height="30px"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center" Width="15%"></ItemStyle>
										<ItemTemplate>
											<ASP:Hyperlink id="lblPettyCashNo" runat="server" text='<%#Container.DataItem("PETTYCASHNO")%>'>
											</ASP:Hyperlink>
										</ItemTemplate>
										<FooterTemplate>
											Total
										</FooterTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn SortExpression="Description" HeaderText="DESCRIPTION">
										<HeaderStyle HorizontalAlign="Center" Height="30px"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left" Width="30%"></ItemStyle>
										<ItemTemplate>
											<asp:label id="lblGridDescription" runat="server" text='<%#Container.DataItem("Description")%>'>
											</asp:label>
										</ItemTemplate>
										<FooterStyle HorizontalAlign="Right" Width="20%"></FooterStyle>
									</asp:TemplateColumn>
									<asp:TemplateColumn SortExpression="PCAMOUNT" HeaderText="PC AMOUNT">
										<HeaderStyle HorizontalAlign="Center" Height="30px"></HeaderStyle>
										<ItemStyle HorizontalAlign="right" Width="20%"></ItemStyle>
										<ItemTemplate>
											<ASP:label id="lblPCAmount" runat="server" text='<%#formatnumber(Container.DataItem("AMOUNT"),2)%>'>
											</ASP:label>
										</ItemTemplate>
										<FooterTemplate>
											<asp:label id="lblTotPCAmount" runat="server" text="TOTAL"></asp:label>
										</FooterTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn SortExpression="PCDATE" HeaderText="PC DATE">
										<HeaderStyle HorizontalAlign="Center" Height="30px"></HeaderStyle>
										<ItemStyle HorizontalAlign="center" Width="8%"></ItemStyle>
										<ItemTemplate>
											<asp:label id=lblPCDate runat="server" text='<%#Container.DataItem("PETTYCASHDATE")%>'>
											</asp:label>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn SortExpression="AMOUNTTRANSFER" HeaderText="AMOUNT TRANSFER">
										<HeaderStyle HorizontalAlign="Center" Height="30px"></HeaderStyle>
										<ItemStyle HorizontalAlign="right" Width="12%"></ItemStyle>
										<ItemTemplate>
											<asp:label id="lblGridAmountTransfer" runat="server" text='<%#formatnumber(Container.DataItem("AMOUNTTRANSFER"),2)%>'>
											</asp:label>
										</ItemTemplate>
										<FooterTemplate>
											<asp:label id="lblTotAmountTransfer" runat="server" text="TOTAL"></asp:label>
										</FooterTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn SortExpression="NOTES" HeaderText="NOTES">
										<HeaderStyle HorizontalAlign="Center" Height="30px"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center" Width="12%"></ItemStyle>
										<ItemTemplate>
											<asp:label id="lblNotes" runat="server" text='<%#Container.DataItem("FINANCERNOTE")%>'>
											</asp:label>
										</ItemTemplate>
									</asp:TemplateColumn>
								</Columns>
							</asp:datagrid>
							<table width="100%" border="0" cellspacing="0" cellpadding="0" height="20" align="center">
								<tr>
									<td colspan="3" class="tdjudul" align="left">TRANSFER INFORMATION</td>
								</tr>
							</table>
							<table width="100%" border="0" cellpadding="2" cellspacing="1" class="tablegrid" Height="37"
								align="center">
								<tr>
									<td width="20%" class="tdgenap" height="23">Ref Voucher NO.</td>
									<td width="30%" class="tdganjil" height="23">
										<asp:label id="lblRefVoucherNo" runat="server"></asp:label></td>
									<td width="20%" class="tdgenap" height="23">Transfer Date</td>
									<td width="30%" class="tdganjil" height="23"><asp:label id="lblTransferDate" runat="server"></asp:label></td>
								</tr>
								<tr>
									<td width="20%" class="tdgenap" height="23">Reference No</td>
									<td width="30%" class="tdganjil" height="23">
										<asp:label id="lblRefNo" runat="server"></asp:label></td>
									<td width="20%" class="tdgenap" height="23">Amount Transfer</td>
									<td width="30%" class="tdganjil" height="23">
										<asp:label id="lblAmountTransfer" runat="server"></asp:label></td>
								</tr>
							</table>
							<table width="100%" border="0" cellspacing="0" cellpadding="0" height="20" align="center">
								<tr>
									<td colspan="3" class="tdjudul" align="left">STATUS</td>
								</tr>
							</table>
							<table width="100%" border="0" cellpadding="2" cellspacing="1" class="tablegrid" Height="37"
								align="center">
								<tr>
									<td width="20%" class="tdgenap" height="23">Status</td>
									<td width="30%" class="tdganjil" height="23">
										<asp:label id="lblStatus" runat="server"></asp:label></td>
									<td width="20%" class="tdgenap" height="23">Status Date</td>
									<td width="30%" class="tdganjil" height="23"><asp:label id="lblStatusDate" runat="server"></asp:label></td>
								</tr>
								<tr>
									<td width="20%" class="tdgenap" height="23">Request By</td>
									<td width="30%" class="tdganjil" height="23">
										<asp:label id="lblRequestBy" runat="server"></asp:label></td>
									<td width="20%" class="tdgenap" height="23"></td>
									<td width="30%" class="tdganjil" height="23"></td>
								</tr>
							</table>
							<table width="100%" border="0" cellpadding="2" cellspacing="1" Height="27" align="center">
								<tr>
									<td width="20%" height="23" colspan="2" bgcolor="white"><asp:ImageButton ID="imbPrint" ImageUrl="../../../../Images/ButtonPrint.gif" Width="100" Height="20"
											Runat="server" alt="Print"></asp:ImageButton>
									</td>
									<td width="20%" height="23" align="right" colspan="2" bgcolor="white">
										<div align="right"><A href="javascript:window.close();"><img src="../../../../../Images/ButtonClose.gif" width="100" height="20" border="0"></A></div>
									</td>
								</tr>
							</table>
						</form>
					</div>
				</TD>
			</TR>
		</TABLE>
	</body>
</HTML>
