<%@ Register TagPrefix="uc1" TagName="ValidDate" Src="../../../../../UserController/ValidDate.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcBankAccountID" Src="../../../../../UserController/UcBankAccountID.ascx" %>
<%@ Page Language="vb" AutoEventWireup="false" Codebehind="PCReimburseReconcile.aspx.vb" Inherits="AdIns.Application.Eloan.Web.AccMnt.PCReimburseReconcile"%>
<%@ Register TagPrefix="uc1" TagName="UcSearchByWithNoTable" Src="../../../../../UserController/UcSearchByWithNoTable.ascx" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>PCReimburseReconcile</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../../../../../Include/AccMnt.css" type="text/css" rel="stylesheet">
		<SCRIPT src="../../../Elsa.js"></SCRIPT>
		<script language=javascript >
		function OpenWinPetty(pBranch,pPetty){
		window.open('../../AccMnt/Cashier/PettyCash/PettyCashTransaction/PettyCashInquiryView.aspx?BranchID=' + pBranch +'&PettyCashNo=' + pPetty + '&Style=AccMnt', 'UserLookup', 'left=50, top=10, width=800, height=600, menubar=0, scrollbars=yes');
		}
		function OpenWinRequest(pBranch,pRequest){
		window.open('ViewPettyCashReimburse.aspx?Branch=' + pBranch +'&RequestNo=' + pRequest + '&Style=AccMnt', 'UserLookup', 'left=50, top=10, width=800, height=480, menubar=0, scrollbars=yes');
		}
		</script>
	</HEAD>
	<body>
		<form id="Form1" method="post" runat="server">
			<asp:label id="lblMessage" runat="server" forecolor="#FF0000" font-name="Verdana" font-size="11px"></asp:label><br>
			<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
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
					<TD class="tdgenap" width="20%">Bank Account</TD>
					<TD class="tdganjil" width="40%">&nbsp;<uc1:UcBankAccountID id="oFrombankAccount" runat="server"></uc1:UcBankAccountID><FONT color="red">*)</FONT>
							<INPUT id="hidCurrencyRateFrom" type="hidden" name="hidCurrencyRateFrom" runat="server">
					</TD>
					<TD class="tdgenap" width="15%">Request Date Until</TD>
					<TD class="tdganjil" width="25%">&nbsp;
						<uc1:validdate id="oRequestDate" runat="server"></uc1:validdate></TD>
				</TR>
				<TR>
					<TD class="tdgenap">Search By
					</TD>
					<TD class="tdganjil">&nbsp;
						<uc1:ucsearchbywithnotable id="oSearchBy" runat="server"></uc1:ucsearchbywithnotable></TD>
					<TD class="tdgenap" width="20%">Currency</TD>
					<TD class="tdganjil" width="30%">
						<asp:textbox id="txtCurrencyIDFrom" runat="server" cssclass="inptype" MaxLength="20" BorderStyle="None"
							ReadOnly="True" Width="100%"></asp:textbox>
					</TD>
				</TR>
			</TABLE>
			<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR>
					<TD align="right"><asp:imagebutton id="imgSearch" runat="server" width="100" height="20" imageurl="../../../../Images/ButtonSearch.gif" alt="Search"></asp:imagebutton><asp:imagebutton id="imbReset" runat="server" imageurl="../../../../Images/ButtonReset.gif" causesvalidation="False" alt="Reset"></asp:imagebutton></TD>
				</TR>
			</TABLE>
			<BR>
			<asp:panel id="PnlGrid" runat="server" Height="432px">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopi" align="center">REIMBURSE REQUEST LIST</TD>
						<TD class="tdtopikanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<asp:datagrid id="DtgReimburse" runat="server" width="100%" allowpaging="True" allowsorting="True"
								onsortcommand="SortGrid" autogeneratecolumns="False" datakeyfield="RequestNo" bordercolor="#CCCCCC"
								borderstyle="None" borderwidth="1px" backcolor="White" cellpadding="0">
								<SelectedItemStyle CssClass="tdgenap"></SelectedItemStyle>
								<AlternatingItemStyle CssClass="tdgenap"></AlternatingItemStyle>
								<ItemStyle Height="25px" CssClass="tdganjil"></ItemStyle>
								<HeaderStyle Height="25px" CssClass="tdjudul"></HeaderStyle>
								<FooterStyle ForeColor="#000066" BackColor="White"></FooterStyle>
								<Columns>
									<asp:TemplateColumn SortExpression="RequestNo" HeaderText="REQUEST NO">
										<HeaderStyle HorizontalAlign="Center" Width="18%"></HeaderStyle>
										<ItemTemplate>
											<a href="javascript:OpenWinRequest('<%#Container.dataItem("BranchID")%>','<%#Container.dataItem("RequestNo")%>');"><asp:Label id="lblGridRequestNo" runat="server" text='<%#Container.DataItem("RequestNo")%>'>
											</asp:Label></a>
											<asp:Label visible ="False" ID="lblBranchID" runat="server" Text='<%# DataBinder.Eval(Container, "DataItem.BranchID") %>'>
											</asp:Label>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn SortExpression="DESCRIPTION" HeaderText="DESCRIPTION">
										<HeaderStyle HorizontalAlign="Center" Width="30%"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left"></ItemStyle>
										<ItemTemplate>
											<asp:Label runat="server" Text='<%# DataBinder.Eval(Container, "DataItem.Description") %>'>
											</asp:Label>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn SortExpression="BA.CurrencyID" HeaderText="CURR">
										<HeaderStyle HorizontalAlign="Center" Width="5%"></HeaderStyle>
										<ItemStyle HorizontalAlign = "Center" Width = "5%"></ItemStyle>
										<ItemTemplate>
											<asp:Label runat="server" ID="lblCurrencyID" Text='<%# DataBinder.Eval(Container, "DataItem.CurrencyID") %>'>
											</asp:Label>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn SortExpression="TotalAmount" HeaderText="REQUEST AMOUNT">
										<HeaderStyle HorizontalAlign="Center" Width="15%"></HeaderStyle>
										<ItemStyle HorizontalAlign="Right"></ItemStyle>
										<ItemTemplate>
											<asp:Label runat="server" ID="TotalAmount" Text='<%# FormatNumber(DataBinder.Eval(Container, "DataItem.TotalAmount"),2) %>'>
											</asp:Label>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn SortExpression="AmountTransfer" HeaderText="TRANSFER AMOUNT">
										<HeaderStyle HorizontalAlign="Center" Width="15%"></HeaderStyle>
										<ItemStyle HorizontalAlign="Right"></ItemStyle>
										<ItemTemplate>
											<asp:Label runat="server" ID="AmountTransfer" Text='<%# FormatNumber(DataBinder.Eval(Container, "DataItem.AmountTransfer"),2) %>'>
											</asp:Label>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:BoundColumn DataField="RequestDate" SortExpression="RequestDate" HeaderText="REQUEST DATE" DataFormatString="{0:dd/MM/yyyy}">
										<HeaderStyle HorizontalAlign="Center" Width="8%"></HeaderStyle>
									</asp:BoundColumn>
									<asp:BoundColumn DataField="StatusDate" SortExpression="StatusDate" HeaderText="TRANSFER DATE" DataFormatString="{0:dd/MM/yyyy}">
										<HeaderStyle HorizontalAlign="Center" Width="8%"></HeaderStyle>
									</asp:BoundColumn>
									<asp:TemplateColumn SortExpression="Status" HeaderText="STATUS">
										<HeaderStyle HorizontalAlign="Center" Width="15%"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center"></ItemStyle>
										<ItemTemplate>
											<asp:Label runat="server" id="lblStatus" Text='<%# DataBinder.Eval(Container, "DataItem.Status") %>'>
											</asp:Label>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn HeaderText="ACTION">
										<HeaderStyle HorizontalAlign="Center" Width="15%"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center"></ItemStyle>
										<ItemTemplate>
											<asp:LinkButton CommandName="ACTION" id="ACTION" Text='<%# IIf(DataBinder.Eval(Container, "DataItem.Status")="Transfered","Reconcile","Cancel") %>' Runat="server"></asp:LinkButton>
										</ItemTemplate>
									</asp:TemplateColumn>
								</Columns>
								<PagerStyle Visible="False" HorizontalAlign="Left" ForeColor="#000066" BackColor="White" Mode="NumericPages"></PagerStyle>
							</asp:datagrid></TD>
					</TR>
				</TABLE>
				
			</asp:panel></form>
	</body>
</HTML>
