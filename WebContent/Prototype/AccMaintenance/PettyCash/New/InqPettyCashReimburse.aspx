<%@ Page Language="vb" AutoEventWireup="false" Codebehind="InqPettyCashReimburse.aspx.vb" Inherits="AdIns.Application.Eloan.Web.AccMnt.InqPettyCashReimburse"%>
<%@ Register TagPrefix="uc1" TagName="ValidDate" Src="../../../../../UserController/ValidDate.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcBankAccountID" Src="../../../../../UserController/UcBankAccountID.ascx" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>InqPettyCashReimburse</title>
		<meta name="GENERATOR" content="Microsoft Visual Studio .NET 7.1">
		<meta name="CODE_LANGUAGE" content="Visual Basic .NET 7.1">
		<meta name="vs_defaultClientScript" content="JavaScript">
		<meta name="vs_targetSchema" content="http://schemas.microsoft.com/intellisense/ie5">
		<LINK href="../../../../../Include/AccMnt.css" type="text/css" rel="stylesheet">
		<SCRIPT src="../../../../../Elsa.js"></SCRIPT>
		<script language="javascript">
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1)
			var ServerName = 'http://<%=Request.servervariables("SERVER_NAME")%>/';
			function OpenWinViewPCReimburse(pStyle,pRequestNo,pBranch)
				{				
					window.open(ServerName + App +  '/AccMnt/Cashier/PettyCash/PettyCashReimburse/ViewPettyCashReimburse.aspx?style=' + pStyle + '&RequestNo=' + pRequestNo + '&Branch=' + pBranch, 'UserLookup', 'left=50, top=50, width=800, height=480, menubar=0,scrollbars=1')
				}
		</script>
	</HEAD>
	<body vLink="blue" aLink="black" link="blue" ms_positioning="GridLayout">
		<form id="Form1" method="post" runat="server">			
			<asp:label id="lblMessage" runat="server" font-size="11px" font-name="Verdana" forecolor="#FF0000"></asp:label>
			<asp:panel id="pnlSearch" runat="server">
				<TABLE id="Table1" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopi" align="center">PETTY CASH REIMBURSE INQUIRY</TD>
						<TD class="tdtopikanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table3" cellSpacing="1" cellPadding="3" width="95%" align="center"
					border="0">
					<TR>
						<TD class="tdgenap" width="20%">Branch
						</TD>
						<TD class="tdganjil" width="40%">
							<asp:dropdownlist id="cboParent" Runat="server"></asp:dropdownlist>
							<asp:requiredfieldvalidator id="rfvcbobranchid" runat="server" ControlToValidate="cboParent" ErrorMessage="Please Select Branch"
								InitialValue="0" Display="Dynamic"></asp:requiredfieldvalidator>&nbsp; <FONT color="#ff0033">
								*)</FONT></TD>
						<TD class="tdgenap" width="20%">Date</TD>
						<TD class="tdganjil" width="20%">
							<UC1:VALIDDATE id="oDate" runat="server"></UC1:VALIDDATE></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table9" cellSpacing="1" cellPadding="3" width="95%" align="center"
					border="0">
					<TR>
						<TD class="tdgenap" width="20%">Bank Account</TD>
						<TD class="tdganjil" width="40%">&nbsp;<uc1:UcBankAccountID id="oFrombankAccount" runat="server"></uc1:UcBankAccountID><FONT color="red">*)</FONT>
								<INPUT id="hidCurrencyRateFrom" type="hidden" name="hidCurrencyRateFrom" runat="server">
						</TD>
						<TD class="tdgenap" width="20%">Currency</TD>
						<TD class="tdganjil" width="20%">
							<asp:textbox id="txtCurrencyIDFrom" runat="server" cssclass="inptype" MaxLength="20" BorderStyle="None"
								ReadOnly="True" Width="100%"></asp:textbox>
						</TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Status</TD>
						<TD class="tdganjil" width="30%" colSpan="3">
							<asp:DropDownList id="cboStatus" runat="server">
								<asp:ListItem Value="ALL" Selected="True">All</asp:ListItem>
								<asp:ListItem Value="REQ">Request</asp:ListItem>
								<asp:ListItem Value="TRF">Transfer</asp:ListItem>
								<asp:ListItem Value="CAN">Cancel</asp:ListItem>
								<asp:ListItem Value="REC">Reconcile</asp:ListItem>
							</asp:DropDownList></TD>
					</TR>
					
					<TR>
						<TD class="tdgenap" width="20%">Search By</TD>
						<TD class="tdganjil" width="80%" colSpan="3">
							<asp:DropDownList id="cboSearchBy" runat="server">
								<asp:ListItem Value="0">Select One</asp:ListItem>
								<asp:ListItem Value="RequestNo">Request No.</asp:ListItem>
								<asp:ListItem Value="Description">Description</asp:ListItem>
							</asp:DropDownList>
							<asp:TextBox id="txtSearchBy" runat="server" CssClass="inptype"></asp:TextBox></TD>
					</TR>
				</TABLE>
				<TABLE id="Table4" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<DIV align="right">
								<asp:imagebutton id="imgsearch" runat="server" width="100" height="20" imageurl="../../../../Images/ButtonSearch.gif" alt="Search"></asp:imagebutton>
								<asp:imagebutton id="imbReset" runat="server" imageurl="../../../../Images/ButtonReset.gif" causesvalidation="False" alt="Reset"></asp:imagebutton></DIV>
						</TD>
					</TR>
				</TABLE>
			</asp:panel>
			<asp:panel id="pnlDatagrid" runat="server" visible="false">
				<BR>
				<TABLE id="Table5" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopikuning">
						<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopi" align="center">PETTY CASH REIMBURSE LISTING</TD>
						<TD class="tdtopikanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table6" cellSpacing="0" cellPadding="0" width="95%" align="center"
					border="0">
					<TR>
						<TD>
							<asp:datagrid id="DtgReimburseInquiry" runat="server" width="100%" cellpadding="0" backcolor="White"
								borderwidth="1px" borderstyle="None" bordercolor="#CCCCCC" autogeneratecolumns="False" allowsorting="True"
								allowpaging="True" Visible="true" ShowFooter="True">
								<SelectedItemStyle CssClass="tdgenap"></SelectedItemStyle>
								<AlternatingItemStyle CssClass="tdgenap"></AlternatingItemStyle>
								<ItemStyle Height="25px" CssClass="tdganjil"></ItemStyle>
								<HeaderStyle Height="25px" CssClass="tdjudul"></HeaderStyle>
								<FooterStyle HorizontalAlign="Right" Width="30%" CssClass="tdjudul" Height="25px"></FooterStyle>
								<Columns>
									<asp:TemplateColumn SortExpression="RequestNo" HeaderText="REQUEST NO.">
										<HeaderStyle HorizontalAlign="Center" Height="30px"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center" Width="15%"></ItemStyle>
										<ItemTemplate>
											<ASP:HYPERLINK id="hyRequestNo" runat="server" text='<%#Container.DataItem("RequestNo")%>'>
											</ASP:HYPERLINK>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn SortExpression="RequestBy" HeaderText="REQUEST BY">
										<HeaderStyle HorizontalAlign="Center" Height="30px"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left" Width="20%"></ItemStyle>
										<ItemTemplate>
											<ASP:label id="lblRequestBy" runat="server" text='<%#Container.DataItem("RequestBy")%>'>
											</ASP:label>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn SortExpression="Description" HeaderText="DESCRIPTION">
										<HeaderStyle HorizontalAlign="Center" Height="30px"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left" Width="30%"></ItemStyle>
										<ItemTemplate>
											<asp:label id="lblDescription" runat="server" text='<%#Container.DataItem("Description")%>'>
											</asp:label>
										</ItemTemplate>
										<FooterStyle HorizontalAlign="Right" Width="20%"></FooterStyle>
										<FooterTemplate>
											Total
										</FooterTemplate>
									</asp:TemplateColumn>
									<asp:BoundColumn DataField="CurrencyID" SortExpression="CurrencyID" HeaderText="CURR" >
										<HeaderStyle HorizontalAlign="Center" CssClass="tdjudul"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center" Width="5%"></ItemStyle>
									</asp:BoundColumn>
									<asp:TemplateColumn SortExpression="Amount" HeaderText="AMOUNT">
										<HeaderStyle HorizontalAlign="Center" Height="30px"></HeaderStyle>
										<ItemStyle HorizontalAlign="Right" Width="8%"></ItemStyle>
										<ItemTemplate>
											<asp:label id=lblAmount runat="server" text='<%#formatnumber(Container.DataItem("Amount"),2)%>'>
											</asp:label>
										</ItemTemplate>
										<FooterStyle HorizontalAlign="Right" Width="7%"></FooterStyle>
										<FooterTemplate>
											<asp:label id="lblTotAmount" runat="server" text="TOTAL"></asp:label>
										</FooterTemplate>
									</asp:TemplateColumn>
									<asp:BoundColumn DataField="RequestDate" SortExpression="RequestDate" HeaderText="REQUEST DATE" DataFormatString="{0:dd/MM/yyyy}">
										<HeaderStyle HorizontalAlign="Center" CssClass="tdjudul"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center" Width="10%"></ItemStyle>
									</asp:BoundColumn>
									<asp:TemplateColumn SortExpression="Status" HeaderText="STATUS">
										<HeaderStyle HorizontalAlign="Center" Height="30px"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center" Width="12%"></ItemStyle>
										<ItemTemplate>
											<asp:label id="lblStatus" runat="server" text='<%#Container.DataItem("Status")%>'>
											</asp:label>
										</ItemTemplate>
									</asp:TemplateColumn>
								</Columns>
								<PagerStyle Visible="False" HorizontalAlign="Left" ForeColor="#000066" BackColor="White" Mode="NumericPages"></PagerStyle>
							</asp:datagrid></TD>
					</TR>
				</TABLE>
				<TABLE style="HEIGHT: 53px" height="53" cellSpacing="0" cellPadding="0" width="95%" align="center"
					border="0">
					<TR>
						<TD align="center" width="30">
							<asp:imagebutton id="imbFirstPage" runat="server" ImageUrl="../../../../Images/butkiri1.gif" CausesValidation="False"
								OnCommand="NavigationLink_Click" CommandName="First" alt="First"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbPrevPage" runat="server" ImageUrl="../../../../Images/butkiri.gif" CausesValidation="False"
								OnCommand="NavigationLink_Click" CommandName="Prev" alt="Prev"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbNextPage" runat="server" ImageUrl="../../../../Images/butkanan.gif" CausesValidation="False"
								OnCommand="NavigationLink_Click" CommandName="Next" alt="Next"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbLastPage" runat="server" ImageUrl="../../../../Images/butkanan1.gif" CausesValidation="False"
								OnCommand="NavigationLink_Click" CommandName="Last" alt="Last"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD style="WIDTH: 247px" align="center" width="247"><FONT face="Verdana" size="2">Page&nbsp;</FONT>
							<asp:TextBox id="txtGoPage" runat="server" CssClass="InpType" Width="34px">1</asp:TextBox>
							<asp:imagebutton id="imbGoPage" runat="server" ImageUrl="../../../../Images/butgo.gif" ImageAlign="AbsBottom"
								EnableViewState="False" alt="Go"></asp:imagebutton>
							<asp:RangeValidator id="rvGo" Runat="server" ControlToValidate="txtGoPage" ErrorMessage="Page Is Not Valid"
								Font-Size="smaller" MaximumValue="999999999" MinimumValue="0" Type="Integer" Font-Names="verdana"></asp:RangeValidator><FONT face="Verdana" size="2">&nbsp;&nbsp;
							</FONT>
						</TD>
						<TD align="right"><FONT color="#999999"><FONT face="Verdana" size="2">Page&nbsp;</FONT>
								<asp:label id="lblPage" runat="server" Font-Size="Smaller" Font-Names="Verdana"></asp:label><FONT face="Verdana" size="2">&nbsp;of</FONT>
								<asp:label id="lblTotPage" runat="server" Font-Size="Smaller" Font-Names="Verdana"></asp:label><FONT face="Verdana" size="2">, 
									Total&nbsp; </FONT>
								<asp:label id="lblTotRec" runat="server" Font-Size="Smaller"></asp:label>&nbsp; <FONT face="Verdana" size="2">
									record(s)</FONT></FONT>
						</TD>
					</TR>
					<TR>
						<TD colSpan="4">
							<asp:imagebutton id="imbPrint" runat="server" imageurl="../../../../Images/ButtonPrint.gif" causesvalidation="False" alt="Print"></asp:imagebutton></TD>
					</TR>
				</TABLE>
			</asp:panel><br>
		</form>
	</body>
</HTML>
