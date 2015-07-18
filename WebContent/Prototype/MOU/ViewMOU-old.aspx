<%@ Page Language="vb" AutoEventWireup="false" Codebehind="ViewMOU.aspx.vb" Inherits="AdIns.Application.Eloan.Web.AccAcq.ViewMOU"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>VIEW MOU</title>
		<meta name="GENERATOR" content="Microsoft Visual Studio .NET 7.1">
		<meta name="CODE_LANGUAGE" content="Visual Basic .NET 7.1">
		<meta name="vs_defaultClientScript" content="JavaScript">
		<meta name="vs_targetSchema" content="http://schemas.microsoft.com/intellisense/ie5">
		<LINK href="../../Include/AccAcq.css" type="text/css" rel="stylesheet">
		<script language="javascript">
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1)
			var ServerName = 'http://<%=Request.servervariables("SERVER_NAME")%>/';			
		</script>
		<script language="javascript">
			function Close(){
				window.close();
			}
		</script>
		<SCRIPT src="../../Elsa.js"></SCRIPT>
	</HEAD>
	<body MS_POSITIONING="GridLayout">
		<form id="Form1" method="post" runat="server">
			<asp:panel id="pnlAdd" runat="server">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
					<TR>
						<TD colSpan="3">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<asp:label id="lblMessage" Runat="server" ForeColor="red"></asp:label></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopi">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">
							VIEW MOU</TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table8" cellSpacing="1" cellPadding="3" width="95%" align="center"
					border="0">
					<TR>
						<TD class="tdgenap" width="25%">Customer Name</TD>
						<TD class="tdganjil" id="lblcustomerid" colSpan="3">							
							<asp:Label id="LblCustName" runat="server"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="25%">
							<DIV align="left">MOU NO</DIV>
						</TD>
						<TD class="tdganjil" colSpan="3">
							<asp:Label id="lblMOUNO1" runat="server"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="25%">
							<DIV align="left">MOU Date</DIV>
						</TD>
						<TD class="tdganjil" colSpan="3">
							<asp:Label id="LblMouDate" runat="server"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="25%">Expired Date</TD>
						<TD class="tdganjil" colSpan="3">
							<asp:Label id="LblExpiredDate" runat="server"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="25%">Reff No</TD>
						<TD class="tdganjil" colSpan="3">
							<asp:Label id="LblReffNo" runat="server"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="25%">Is Plafon</TD>
						<TD class="tdganjil" colSpan="3">
							<asp:CheckBox id="chkIsPlafon" runat="server"></asp:CheckBox></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="25%">Plafon Amount</TD>
						<TD class="tdganjil" colSpan="3">
							<asp:Label id="LblPlafonAmount" runat="server"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="25%">Realisation Amount</TD>
						<TD class="tdganjil" colSpan="3">
							<asp:Label id="LblRealisationAmount" runat="server"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="25%">Status</TD>
						<TD class="tdganjil" colSpan="3">
							<asp:Label id="LblStatus" runat="server"></asp:Label></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="tdjudul">
						<TD vAlign="top">OTHER INFO</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table8" cellSpacing="1" cellPadding="3" width="95%" align="center"
					border="0">
					<TR>
						<TD class="tdgenap" width="20%">Currency</TD>
						<TD class="tdganjil" colSpan="3">
							<asp:Label id="LblCurrency" runat="server"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="25%">Interest Type</TD>
						<TD class="tdganjil" colSpan="3">
							<asp:Label id="LblInterestType" runat="server"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="25%">Installment Scheme</TD>
						<TD class="tdganjil" colSpan="3"></FONT>
							<asp:Label id="LblInstallmentScheme" runat="server"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap">First Installment</TD>
						<TD class="tdganjil" colSpan="3">
							<asp:Label id="LblFirstInstallment" runat="server"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="25%">Down Payment (%)</TD>
						<TD class="tdganjil" colSpan="3">
							<asp:Label id="LblDP" runat="server"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="25%">Tenor</TD>
						<TD class="tdganjil" colSpan="3">
							<asp:Label id="LblTenor" runat="server"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="25%">Effective Rate (%)</TD>
						<TD class="tdganjil" colSpan="3">
							<asp:Label id="LblEffRate" runat="server"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="25%">Installment Amount</TD>
						<TD class="tdganjil" colSpan="3">
							<asp:Label id="LblInstallmentAmount" runat="server"></asp:Label></TD>
					</TR>
				</TABLE>
				<br>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopi">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">
							AGREEMENT NO RELATED</TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<asp:datagrid id="DtgAgree" runat="server" width="100%" allowsorting="True"
								autogeneratecolumns="False" datakeyfield="Applicationid" bordercolor="#CCCCCC" borderstyle="None"
								borderwidth="1px" backcolor="White" cellpadding="0" Visible="TRUE">
								<SelectedItemStyle CssClass="tdgenap"></SelectedItemStyle>
								<AlternatingItemStyle CssClass="tdgenap"></AlternatingItemStyle>
								<ItemStyle Height="30px" CssClass="tdganjil"></ItemStyle>
								<HeaderStyle Height="30px" CssClass="tdjudul"></HeaderStyle>
								<FooterStyle ForeColor="#000066" BackColor="White"></FooterStyle>
								<Columns>
									<asp:TemplateColumn Visible="True" SortExpression="Branchid" HeaderText="BRANCH ID">
										<HeaderStyle HorizontalAlign="Center" Width="12%"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left" Width="12%"></ItemStyle>
										<ItemTemplate>
											<ASP:label id="lbranchid" runat="server" text='<%#Container.DataItem("branchid")%>'>
											</ASP:label>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn Visible="True" SortExpression="ApplicationID" HeaderText="APPLICATION ID">
										<HeaderStyle HorizontalAlign="Center" Width="15%"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left" Width="15%"></ItemStyle>
										<ItemTemplate>
											<ASP:HYPERLINK id="hyApplicationId" runat="server" text='<%#Container.DataItem("ApplicationID")%>'>
											</ASP:HYPERLINK>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn SortExpression="AgreementNo" HeaderText="AGREEMENT NO">
										<HeaderStyle HorizontalAlign="Center" Width="15%"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left" Width="15%"></ItemStyle>
										<ItemTemplate>
											<ASP:HYPERLINK id="hyAgreementNo" runat="server" text='<%#Container.DataItem("AgreementNo")%>'>
											</ASP:HYPERLINK>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn SortExpression="Name" HeaderText="NAME">
										<HeaderStyle HorizontalAlign="Center" Width="20%"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left" Width="20%"></ItemStyle>
										<ItemTemplate>
											<ASP:HYPERLINK id="hyCustomerName" runat="server" text='<%#Container.DataItem("Name")%>'>
											</ASP:HYPERLINK>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn SortExpression="Agreement.CurrencyID" HeaderText="CURR">
										<HeaderStyle HorizontalAlign="Center" Width="12%"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center" Width="12%"></ItemStyle>
										<ItemTemplate>
											<ASP:label id="lblCurrencyID" runat="server" text='<%#Container.DataItem("CurrencyID")%>'>
											</ASP:label>
										</ItemTemplate>
									</asp:TemplateColumn>			
									<asp:TemplateColumn SortExpression="ContractStatus" HeaderText="CONTRACT STATUS">
										<HeaderStyle HorizontalAlign="Center" Width="12%"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center" Width="12%"></ItemStyle>
										<ItemTemplate>
											<ASP:label id="lblcontractstatus" runat="server" text='<%#Container.DataItem("contractstatus")%>'>
											</ASP:label>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn SortExpression="ApplicationStep" HeaderText="STEP">
										<HeaderStyle HorizontalAlign="Center" Width="12%"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center" Width="12%"></ItemStyle>
										<ItemTemplate>
											<ASP:label id="lblApplicationStep" runat="server" text='<%#Container.DataItem("ApplicationStep")%>'>
											</ASP:label>
										</ItemTemplate>
									</asp:TemplateColumn>									
									<asp:TemplateColumn Visible="False" HeaderText="CUSTOMER ID">
										<HeaderStyle HorizontalAlign="Center" Width="25%"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center" Width="25%"></ItemStyle>
										<ItemTemplate>
											<asp:label id="lblCustomerId" runat="server" text='<%#Container.DataItem("CustomerId")%>'>
											</asp:label>
										</ItemTemplate>
									</asp:TemplateColumn>									
								</Columns>
								<PagerStyle Visible="False" HorizontalAlign="Left" ForeColor="#000066" BackColor="White" Mode="NumericPages"></PagerStyle>
							</asp:datagrid></TD>
					</TR>
				</TABLE>
				<TABLE height="25" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<asp:imagebutton id="imbFirstPage" runat="server" imageurl="../../images/butkiri1.gif" oncommand="NavigationLink_Click"
								commandname="First"></asp:imagebutton>&nbsp;&nbsp;
							<asp:imagebutton id="imbPrevPage" runat="server" imageurl="../../images/butkiri.gif" oncommand="NavigationLink_Click"
								commandname="Prev"></asp:imagebutton>&nbsp;&nbsp;
							<asp:imagebutton id="imbNextPage" runat="server" imageurl="../../images/butkanan.gif" oncommand="NavigationLink_Click"
								commandname="Next"></asp:imagebutton>&nbsp;&nbsp;
							<asp:imagebutton id="imbLastPage" runat="server" imageurl="../../images/butkanan1.gif" oncommand="NavigationLink_Click"
								commandname="Last"></asp:imagebutton></TD>
						<TD align="center" width="130">Page
							<asp:textbox id="txtpage" runat="server" width="34px" maxlength="3">1</asp:textbox>&nbsp;
							<asp:imagebutton id="imbGoPage" runat="server" imageurl="../../images/butgo.gif" width="30" cssclass="inptype"></asp:imagebutton></TD>
						<asp:rangevalidator id="rgvGo" runat="server" controltovalidate="txtpage" minimumvalue="1" errormessage="*"
							maximumvalue="999999999" type="Integer"></asp:rangevalidator>
						<asp:requiredfieldvalidator id="rfvGo" runat="server" controltovalidate="txtpage" errormessage="*"></asp:requiredfieldvalidator>&nbsp;&nbsp;
						<TD align="right"><FONT color="#999999">Page
								<asp:label id="lblPage" runat="server" forecolor="#999999"></asp:label>&nbsp;of
								<asp:label id="lblTotPage" runat="server" forecolor="#999999"></asp:label>, 
								Total
								<asp:label id="lblRecord" runat="server" forecolor="#999999"></asp:label>&nbsp;record(s)</FONT></TD>
					</TR>
				</TABLE>
				<TABLE id="Table9" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD align="left">
							<asp:imagebutton id=imbBack runat="server" imageurl="../../Images/ButtonBack.gif" causesvalidation="False" visible="False"></asp:imagebutton>							
						</TD>
						<TD align="right">
							<asp:imagebutton id=imbExit runat="server" imageurl="../../Images/ButtonExit.gif"></asp:imagebutton><A href="javascript:window.close();"></A>							
						</TD>
					</TR>
				</TABLE>
			</asp:panel>
		</form>
	</body>
</HTML>
