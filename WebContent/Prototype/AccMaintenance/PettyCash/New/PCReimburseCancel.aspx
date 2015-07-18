<%@ Page Language="vb" AutoEventWireup="false" Codebehind="PCReimburseCancel.aspx.vb" Inherits="AdIns.Application.Eloan.Web.AccMnt.PCReimburseCancel"%>
<%@ Register TagPrefix="uc" TagName="ValidDate" Src="../../../../../UserController/ValidDate.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcCurrencyID" Src="../../../../../UserController/UcCurrencyID.ascx" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>PCReimburseCancel</title>
		<META http-equiv="Content-Type" content="text/html; charset=windows-1252">
		<meta name="GENERATOR" content="Microsoft Visual Studio .NET 7.1">
		<meta name="CODE_LANGUAGE" content="Visual Basic .NET 7.1">
		<meta name="vs_defaultClientScript" content="JavaScript">
		<meta name="vs_targetSchema" content="http://schemas.microsoft.com/intellisense/ie5">
		<LINK href="../../../../../include/AccMnt.css" type="text/css" rel="stylesheet">
		<SCRIPT src="../../../../../Elsa.js"></SCRIPT>
		<script language="javascript">
		function OpenWinPetty(pBranch,pPetty){
		window.open('../PettyCashTransaction/PettyCashInquiryView.aspx?BranchID=' + pBranch +'&PettyCashNo=' + pPetty + '&Style=AccMnt', 'UserLookup', 'left=50, top=10, width=600, height=480, menubar=0, scrollbars=yes');
		}
		function OpenWinRequest(pBranch,pRequest){
		window.open('ViewPettyCashReimburse.aspx?Branch=' + pBranch +'&RequestNo=' + pRequest + '&Style=AccMnt', 'UserLookup', 'left=50, top=10, width=600, height=480, menubar=0, scrollbars=yes');
		}
		
		
		</script>
	</HEAD>
	<body MS_POSITIONING="GridLayout">
		<form id="Form1" method="post" runat="server">
			<asp:label id="lblMessage" runat="server" forecolor="#993300" font-name="Verdana" font-size="11px"></asp:label>
			<BR>
			<asp:panel id="pnlsearch" Runat="server">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopikuning">
						<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopi" align="center">PETTY CASH REIMBURSE CANCEL</TD>
						<TD class="tdtopikanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
					<TR>
						<TD class="tdgenap" style="HEIGHT: 23px" vAlign="middle" width="20%">Branch</TD>
						<TD class="tdganjil" style="HEIGHT: 23px" width="20%">
							<asp:DropDownList id="cboBranch" runat="server"></asp:DropDownList>
							<asp:RequiredFieldValidator id="rfvBranch" runat="server" Display="Dynamic" ErrorMessage="Please Select Branch"
								ControlToValidate="cboBranch"></asp:RequiredFieldValidator></TD>
						<TD class="tdgenap" style="HEIGHT: 23px" width="20%">Request Date</TD>
						<TD class="tdganjil" style="HEIGHT: 23px" width="40%">
							<uc:ValidDate id="oRequestDate" runat="server"></uc:ValidDate></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Currency
						</TD>
						<TD class="tdganjil" width="20%">
							<uc1:UcCurrencyID id="oCurrencyID" runat="server"></uc1:UcCurrencyID></TD>
						<TD class="tdgenap" width="20%">Search By
						</TD>
						<TD class="tdganjil" width="40%">
							<asp:DropDownList id="cboSearchBy" runat="server">
								<asp:ListItem Value="">Select One</asp:ListItem>
								<asp:ListItem Value="RequestNo">Request No.</asp:ListItem>
								<asp:ListItem Value="Description">Description</asp:ListItem>
							</asp:DropDownList>
							<asp:TextBox id="txtSearchBy" runat="server" CssClass="inptype"></asp:TextBox></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<DIV align="right">		
								<asp:imagebutton id="imgsearch" runat="server" width="100" height="20" imageurl="../../../../Images/ButtonSearch.gif" alt="Search"></asp:imagebutton>
								<asp:imagebutton id="imbReset" runat="server" imageurl="../../../../Images/ButtonReset.gif" causesvalidation="False" alt="Reset"></asp:imagebutton></DIV>
						</TD>
					</TR>
				</TABLE>
			</asp:panel><br>
			<asp:panel id="pnlDtGrid" runat="server">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopikuning">
						<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopi" align="center">REQUEST PETTY CASH REIMBURSE LIST</TD>
						<TD class="tdtopikanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<asp:datagrid id="dtgPetty" runat="server" width="100%" cellpadding="2" onsortcommand="SortGrid"
								backcolor="White" borderwidth="1px" borderstyle="None" bordercolor="#CCCCCC" datakeyfield="RequestNo"
								autogeneratecolumns="False" allowsorting="True">
								<SelectedItemStyle CssClass="tdgenap"></SelectedItemStyle>
								<AlternatingItemStyle CssClass="tdgenap"></AlternatingItemStyle>
								<ItemStyle CssClass="tdganjil"></ItemStyle>
								<HeaderStyle Height="30px" CssClass="tdjudul"></HeaderStyle>
								<FooterStyle ForeColor="#000066" BackColor="White"></FooterStyle>
								<Columns>
									<asp:TemplateColumn HeaderText="REQUEST NO">
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left"></ItemStyle>
										<ItemTemplate>
											<a href="javascript:OpenWinRequest('<%#Container.dataItem("BranchID")%>','<%#Container.dataItem("RequestNo")%>');"><asp:Label ID="lblRequestNo" Runat="server" text='<%#Container.dataItem("RequestNo")%>'>
											</asp:Label></a>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:BoundColumn DataField="REQUESTBY" HeaderText="REQUEST BY">
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left"></ItemStyle>
									</asp:BoundColumn>
									<asp:BoundColumn DataField="DESCRIPTION" HeaderText="DESCRIPTION">
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left"></ItemStyle>
									</asp:BoundColumn>
									<asp:BoundColumn DataField="CurrencyID" HeaderText="CURR">
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
										<ItemStyle HorizontalAlign="center"></ItemStyle>
									</asp:BoundColumn>
									<asp:BoundColumn DataField="AMOUNT" HeaderText="AMOUNT" DataFormatString="{0:###,###,###.00}">
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
										<ItemStyle HorizontalAlign="Right"></ItemStyle>
									</asp:BoundColumn>
									<asp:BoundColumn DataField="REQUESTDATE" HeaderText="REQUEST DATE" DataFormatString="{0:dd/MM/yyyy}">
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center"></ItemStyle>
									</asp:BoundColumn>
									<asp:TemplateColumn HeaderText="ACTION">
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center"></ItemStyle>
										<ItemTemplate>
											<asp:LinkButton CommandName="Cancel" text='Cancel' Runat="server"></asp:LinkButton>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:BoundColumn DataField="BAnkaccountname" Visible="False">
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center"></ItemStyle>
									</asp:BoundColumn>
									<asp:BoundColumn DataField="BankAccountID" Visible="False">
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center"></ItemStyle>
									</asp:BoundColumn>
								</Columns>
								<PagerStyle Visible="False" HorizontalAlign="Left" ForeColor="#000066" BackColor="White" Mode="NumericPages"></PagerStyle>
							</asp:datagrid></TD>
					</TR>
				</TABLE>
				<TABLE height="25" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<asp:imagebutton id="imbFirstPage" runat="server" imageurl="../../../../images/butkiri1.gif" commandname="First"
								oncommand="NavigationLink_Click" alt="First"></asp:imagebutton>&nbsp;&nbsp;
							<asp:imagebutton id="imbPrevPage" runat="server" imageurl="../../../../images/butkiri.gif" commandname="Prev"
								oncommand="NavigationLink_Click" alt="Prev"></asp:imagebutton>&nbsp;&nbsp;
							<asp:imagebutton id="imbNextPage" runat="server" imageurl="../../../../images/butkanan.gif" commandname="Next"
								oncommand="NavigationLink_Click" alt="Next"></asp:imagebutton>&nbsp;&nbsp;
							<asp:imagebutton id="imbLastPage" runat="server" imageurl="../../../../images/butkanan1.gif" commandname="Last"
								oncommand="NavigationLink_Click" alt="Last"></asp:imagebutton></TD>
						<TD align="center" width="130">Page
							<ASP:TEXTBOX id="txtpage" runat="server" CssClass="inptype" width="34px" maxlength="3">1</ASP:TEXTBOX>&nbsp;
							<asp:imagebutton id="imbGoPage" runat="server" width="30" imageurl="../../../../images/butgo.gif"
								cssclass="inptype" alt="Go"></asp:imagebutton></TD>
						<ASP:RANGEVALIDATOR id="rgvGo" runat="server" font-size="11px" font-name="Verdana" forecolor="#993300"
							type="Integer" maximumvalue="999999999" errormessage="Page No. is not valid" minimumvalue="1" controltovalidate="txtpage"></ASP:RANGEVALIDATOR>
						<ASP:REQUIREDFIELDVALIDATOR id="rfvGo" runat="server" font-size="11px" font-name="Verdana" forecolor="#993300"
							errormessage="Page No. is not valid" controltovalidate="txtpage"></ASP:REQUIREDFIELDVALIDATOR>
						<TD align="right"><FONT color="#999999">Page
								<asp:label id="lblPage" runat="server" forecolor="#999999"></asp:label>of
								<asp:label id="lblTotPage" runat="server" forecolor="#999999"></asp:label>, 
								Total
								<asp:label id="lblRecord" runat="server" forecolor="#999999"></asp:label>record(s)</FONT></TD>
					</TR>
				</TABLE>
			</asp:panel>
			<asp:panel id="pnlTransfer" Runat="server">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopikuning">
						<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopi" align="center">PETTY CASH REIMBURSE CANCEL</TD>
						<TD class="tdtopikanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
					<TR>
						<TD class="tdgenap" style="HEIGHT: 23px" vAlign="middle" width="20%">Branch Request</TD>
						<TD class="tdganjil" style="HEIGHT: 23px" width="30%">
							<asp:Label id="lblBranch" runat="server"></asp:Label></TD>
						<TD class="tdgenap" style="HEIGHT: 23px" width="20%">Request Date</TD>
						<TD class="tdganjil" style="HEIGHT: 23px">
							<asp:Label id="lblRequestDate" runat="server"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Request No</TD>
						<TD class="tdganjil" width="30%">
							<asp:Label id="lblRequestNo2" runat="server"></asp:Label></TD>
						<TD class="tdgenap" width="20%">Currency</TD>
						<TD class="tdganjil">
							<asp:Label id="lblCurrencyID" Runat="server"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Branch Bank Account
						</TD>
						<TD class="tdganjil" width="30%">
							<asp:Label id="lblBankAccount" runat="server"></asp:Label></TD>
						<TD class="tdgenap" width="20%">Total Request Amount</TD>
						<TD class="tdganjil">
							<asp:Label id="lblAmount" runat="server"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Description</TD>
						<TD class="tdganjil" width="30%">
							<asp:Label id="lblDescription" runat="server"></asp:Label></TD>
						<TD class="tdgenap" width="20%"></TD>
						<TD class="tdganjil"></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD class="tdjudul" align="center" height="20">PETTY CASH TRANSACTION LIST</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<asp:datagrid id="dtgPettyDtl" runat="server" width="100%" cellpadding="2" backcolor="White" borderwidth="1px"
								borderstyle="None" bordercolor="#CCCCCC" autogeneratecolumns="False" allowsorting="True" OnItemDataBound="getTotal"
								OnSortCommand="SortPetty" ShowFooter="True">
								<SelectedItemStyle CssClass="tdgenap"></SelectedItemStyle>
								<AlternatingItemStyle CssClass="tdgenap"></AlternatingItemStyle>
								<ItemStyle CssClass="tdganjil"></ItemStyle>
								<HeaderStyle Height="30px" CssClass="tdjudul"></HeaderStyle>
								<FooterStyle Height="30px" CssClass="tdjudul"></FooterStyle>
								<Columns>
									<asp:TemplateColumn HeaderText="PETTY CASH NO" FooterText="TOTAL">
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left"></ItemStyle>
										<ItemTemplate>
											<a href="javascript:OpenWinPetty('<%#Container.dataItem("BranchID")%>','<%#Container.DataItem("PettyCashNo")%>');"><asp:Label ID="lblPettyCashNo" Runat="server" text='<%#Container.dataItem("PETTYCASHNO")%>'>
											</asp:Label></a>
										</ItemTemplate>
										<FooterStyle HorizontalAlign="Center"></FooterStyle>
									</asp:TemplateColumn>
									<asp:BoundColumn DataField="DESCRIPTION" HeaderText="DESCRIPTION">
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left"></ItemStyle>
									</asp:BoundColumn>
									<asp:BoundColumn DataField="AMOUNT" HeaderText="PC AMOUNT" DataFormatString="{0:###,###,###.00}">
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
										<ItemStyle HorizontalAlign="Right"></ItemStyle>
										<FooterStyle HorizontalAlign="Right"></FooterStyle>
									</asp:BoundColumn>
									<asp:BoundColumn DataField="PETTYCASHDATE" HeaderText="PC DATE" DataFormatString="{0:dd/MM/yyyy}">
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center"></ItemStyle>
									</asp:BoundColumn>
								</Columns>
								<PagerStyle Visible="False" HorizontalAlign="Left" ForeColor="#000066" BackColor="White" Mode="NumericPages"></PagerStyle>
							</asp:datagrid></TD>
					</TR>
				</TABLE>
				<BR>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<DIV align="right">
								<asp:imagebutton id="imbSave" runat="server" width="100" height="20" imageurl="../../../../Images/ButtonSave.gif" alt="Save"></asp:imagebutton>
								<asp:imagebutton id="imbCancel" runat="server" imageurl="../../../../Images/ButtonCancel.gif" causesvalidation="False" alt="Cancel"></asp:imagebutton></DIV>
						</TD>
					</TR>
				</TABLE>
			</asp:panel>
		</form>
	</body>
</HTML>
