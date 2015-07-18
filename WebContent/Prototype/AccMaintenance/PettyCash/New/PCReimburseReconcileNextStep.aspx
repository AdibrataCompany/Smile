<%@ Page Language="vb" AutoEventWireup="false" Codebehind="PCReimburseReconcileNextStep.aspx.vb" Inherits="AdIns.Application.Eloan.Web.AccMnt.PCReimburseReconcileNextStep"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>PCReimburseReconcileNextStep</title>
		<meta name="GENERATOR" content="Microsoft Visual Studio .NET 7.1">
		<meta name="CODE_LANGUAGE" content="Visual Basic .NET 7.1">
		<meta name="vs_defaultClientScript" content="JavaScript">
		<meta name="vs_targetSchema" content="http://schemas.microsoft.com/intellisense/ie5">
		<link href="../../../../../Include/AccMnt.css" type="text/css" rel="stylesheet">
		<SCRIPT src="../../../Elsa.js"></SCRIPT>
		<script language=javascript >
		var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
		var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1)
		var ServerName = 'http://<%=Request.servervariables("SERVER_NAME")%>/';
		
		function OpenWinPetty(pBranch,pPetty){
		window.open('../../AccMnt/Cashier/PettyCash/PettyCashTransaction/PettyCashInquiryView.aspx?BranchID=' + pBranch +'&PettyCashNo=' + pPetty + '&Style=AccMnt', 'UserLookup', 'left=50, top=10, width=800, height=600, menubar=0, scrollbars=yes');
		}
		function OpenWinRequest(pBranch,pRequest){
		window.open('ViewPettyCashReimburse.aspx?Branch=' + pBranch +'&RequestNo=' + pRequest + '&Style=AccMnt', 'UserLookup', 'left=50, top=10, width=800, height=480, menubar=0, scrollbars=yes');
		}
		function OpenWinViewPCInquiry(pStyle,pPettyCashNo,pBranch)
		{				
			window.open(ServerName + App +  '/AccMnt/Cashier/PettyCash/PettyCashTransaction/PettyCashInquiryView.aspx?style=' + pStyle + '&PettyCashNo=' + pPettyCashNo + '&BranchId=' + pBranch, 'userlookup', 'left=50, top=50, width=800, height=500, menubar=0,scrollbars=1')
		}
			</script>
	</HEAD>
	<body>
		<form id="Form1" method="post" runat="server">
			<br>
			<TABLE id="Table1" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR>
					<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
					<TD class="tdtopi" align="center">RECONCILE PETTY CASH REIMBURSE
					</TD>
					<TD class="tdtopikanan" width="10">&nbsp;</TD>
				</TR>
			</TABLE>
			<TABLE class="tablegrid" id="Table2" cellSpacing="1" cellPadding="2" width="95%" align="center"
				border="0">
				<TR>
					<TD class="tdgenap" width="20%">Request No</TD>
					<TD class="tdganjil" width="30%" colspan="3">&nbsp;
						<asp:hyperlink id="hypRequestNo" runat="server" ></asp:hyperlink>
					</TD>
				</TR>
				<TR>
					<TD class="tdgenap" width="20%">Bank Account</TD>
					<TD class="tdganjil" width="30%">&nbsp;
						<asp:Label id="LblBankAccount" runat="server"></asp:Label>
					</TD>
					<TD class="tdgenap" width="20%">Currency</TD>
					<TD class="tdganjil" width="30%">&nbsp;
						<asp:Label id="LblCurency" runat="server"></asp:Label>
					</TD>
				</TR>
				<TR>
					<TD class="tdgenap" width="20%">Request Date</TD>
					<TD class="tdganjil" width="30%">&nbsp;
						<asp:Label id="LblRequestDate" runat="server"></asp:Label>
					</TD>
					<TD class="tdgenap" width="20%">Request Amount</TD>
					<TD class="tdganjil" width="30%">&nbsp;
						<asp:Label id="LblRequestAmount" runat="server"></asp:Label>
					</TD>
				</TR>
				<TR>
					<TD class="tdgenap" width="20%">Transfer Date</TD>
					<TD class="tdganjil" width="30%">&nbsp;
						<asp:Label id="LblTransferDate" runat="server"></asp:Label>
					</TD>
					<TD class="tdgenap" width="20%">Transfer Amount</TD>
					<TD class="tdganjil" width="30%">&nbsp;
						<asp:Label id="LblTransferAmount" runat="server"></asp:Label>
					</TD>
				</TR>
			</TABLE>
			<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR>
					<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
					<TD class="tdtopi" align="center">PETTY CASH TRANSACTION LIST</TD>
					<TD class="tdtopikanan" width="10">&nbsp;</TD>
				</TR>
			</TABLE>
			<asp:datagrid id="DtgReconcile" HorizontalAlign="Center" runat="server" allowsorting="True"
				autogeneratecolumns="False" datakeyfield="RequestNo" bordercolor="#CCCCCC" borderstyle="None"
				borderwidth="1px" backcolor="White" cellpadding="0" width="95%">
				<SelectedItemStyle CssClass="tdgenap"></SelectedItemStyle>
				<AlternatingItemStyle CssClass="tdgenap"></AlternatingItemStyle>
				<ItemStyle Height="20px" CssClass="tdganjil"></ItemStyle>
				<HeaderStyle Height="20px" CssClass="tdjudul"></HeaderStyle>
				<FooterStyle ForeColor="#000066" BackColor="White"></FooterStyle>
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
				<PagerStyle Visible="False" HorizontalAlign="Left" ForeColor="#000066" BackColor="White" Mode="NumericPages"></PagerStyle>
			</asp:datagrid>
			<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR>
					<TD align="right">
						<asp:imagebutton id="imgReconcile" Visible="False" runat="server" imageurl="../../../../Images/ButtonReconcile.gif"
							height="20" width="100" alt="Reconcile"></asp:imagebutton>
						<asp:imagebutton id="imgDecline" Visible="False" runat="server" imageurl="../../../../Images/ButtonDecline.gif"
							height="20" width="100" alt="Decline"></asp:imagebutton>
						<asp:imagebutton id="imbCancel" runat="server" imageurl="../../../../Images/ButtonCancel.gif" causesvalidation="False" alt="Cancel"></asp:imagebutton>
					</TD>
				</TR>
			</TABLE>
		</form>
	</body>
</HTML>
