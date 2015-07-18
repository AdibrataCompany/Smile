<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>PDCRInquiry</title>
		<meta content="Microsoft Visual Studio.NET 7.0" name="GENERATOR">
		<meta content="Visual Basic 7.0" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../../../Confins.css" type="text/css" rel="stylesheet">
		<SCRIPT src="../../../Elsa.js"></SCRIPT>
		<script language="javascript">
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1)
			var ServerName = 'http://<%=Request.servervariables("SERVER_NAME")%>/';
			
			function OpenWinMain(BranchId, PettyCashNo){
					window.open(ServerName + App +  '/AccMnt/Cashier/PettyCash/PettyCashTransaction/PettyCashInquiryView.aspx?BranchId=' + BranchId + '&PettyCashNo=' + PettyCashNo +  '&style=AccMnt', null, 'left=50, top=50, width=800, height=500, menubar=0,scrollbars=1')
					}
			function OpenActionWindow(BranchId, PettyCashNo){																	
					window.open(ServerName + App +  '/AccMnt/Cashier/PettyCash/PettyCashTransaction/PettyCashReversalView.aspx?BranchId=' + BranchId + '&PettyCashNo=' + PettyCashNo , null, 'left=50, top=50, width=800, height=500, menubar=0,scrollbars=1')
					}					
		</script>
	</HEAD>
	<body vLink="blue" aLink="black" link="blue" ms_positioning="GridLayout">
		<form id="Form1" method="post" runat="server">
			&nbsp;
			<asp:label id="lblMessage" runat="server" forecolor="#FF0000" font-name="Verdana" font-size="11px"></asp:label><asp:panel id="pnlList" runat="server">
				<TABLE id="Table1" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD class="tdtopibirukiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopibiru" align="center">PETTY CASH REVERSAL</TD>
						<TD class="tdtopibirukanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table9" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
				<TR>
				<TD class="tdgenap" width="20%">Date</TD>
				<TD class="tdganjil" width="30%">
				<asp:TextBox runat="server" id="txtDate" CssClass="inptype" Width="100px">
				</asp:TextBox>
				&nbsp;<asp:Image ID="imgCalendar" runat="server" ImageUrl="../../images/iconCalendar.gif" /></TD>
				<TD class="tdgenap" width="20%">Currency</TD>
				<TD class="tdganjil" width="30%">
				<asp:TextBox id="txtCurrencyIDFrom" runat="server" cssclass="inptype" MaxLength="20" BorderStyle="None" ReadOnly="True" Width="100%">IDR</asp:TextBox>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="20%">Bank Account</TD>
				<TD class="tdganjil" width="30%" colSpan="3">
				<FONT color="red">
				<asp:DropDownList id="ddlBankAccount" runat="server">
					<asp:ListItem Value="0">Select One</asp:ListItem>
				</asp:DropDownList>
				&nbsp;*)</FONT>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="20%">Search By</TD>
				<TD class="tdganjil" colSpan="3">
				<asp:DropDownList id="cboSearchBy" runat="server">
					<asp:ListItem Value="0">Select One</asp:ListItem>
					<asp:ListItem Value="PettyCashNo">Petty Cash No.
					</asp:ListItem>
					<asp:ListItem Value="DepartementName">Department
					</asp:ListItem>
					<asp:ListItem Value="EmployeeName">Employee Name
					</asp:ListItem>
					<asp:ListItem Value="Description">Description</asp:ListItem>
				</asp:DropDownList>
				<asp:TextBox id="txtSearchBy" runat="server" CssClass="inptype" Width="192px">
				</asp:TextBox>
				</TD>
				</TR>
				</TABLE>
				<TABLE id="Table4" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<DIV align="right">
								<asp:imagebutton id="imgsearch" runat="server" width="100" height="20" imageurl="../../Images/ButtonSearch.gif" alt="Search"></asp:imagebutton>
								<asp:imagebutton id="imbReset" runat="server" imageurl="../../Images/ButtonReset.gif" causesvalidation="False" alt="Reset"></asp:imagebutton></DIV>
						</TD>
					</TR>
				</TABLE>
			</asp:panel><asp:panel id="pnlDatagrid" runat="server" visible="false"><BR>
				<TABLE id="Table5" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopikuning">
						<TD class="tdtopibirukiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopibiru" align="center">PETTY CASH LISTING</TD>
						<TD class="tdtopibirukanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<div align="center">
					<asp:GridView Width="95%" runat="server" id="grdPettyCash" DataSourceID="XmlDataSource2" AutoGenerateColumns="False">
								<Columns>
									<asp:TemplateField SortExpression="PettyCashNo" HeaderText="PETTY CASH NO">
										<ItemTemplate>
											<ASP:hyperlink id=hyPettyCashNo runat="server" text='xxxxx20xxxxx' NavigateUrl="">
											</ASP:hyperlink>
										</ItemTemplate>
									</asp:TemplateField>
									<asp:boundfield DataField="valstring20" HeaderText="SUB BRANCH" SortExpression="valstring20">
									</asp:boundfield>									
									<asp:boundfield DataField="valstring20" HeaderText="DEPARTMENT" SortExpression="valstring20">
									</asp:boundfield>
									<asp:boundfield DataField="valstring20" HeaderText="EMPLOYEE NAME" SortExpression="valstring20">
									</asp:boundfield>
									<asp:boundfield DataField="valstring30" HeaderText="DESCRIPTION" SortExpression="valstring30">
									</asp:boundfield>
									<asp:boundfield DataField="vCurr" HeaderText="CURR" SortExpression="vCurr">
										<ItemStyle HorizontalAlign="Center" />
									</asp:boundfield>
									<asp:boundfield DataField="valamount" HeaderText="AMOUNT" SortExpression="valamount">
										<ItemStyle HorizontalAlign="Right" />
									</asp:boundfield>
									<asp:boundfield DataField="valDate" HeaderText="PC DATE" SortExpression="valDate">
										<ItemStyle HorizontalAlign="Center" />
									</asp:boundfield>
									<asp:TemplateField HeaderText="ACTION">
										<ItemStyle HorizontalAlign="Center"></ItemStyle>
										<ItemTemplate>
											<asp:hyperlink id="hyAction" runat="server" text='Reverse' NavigateUrl="PettyCashReversalView.aspx"></asp:hyperlink>
										</ItemTemplate>
									</asp:TemplateField>
								</Columns>
						<HeaderStyle CssClass="tdjudulbiru" />
						<AlternatingRowStyle CssClass="tdgenap" />								
					</asp:GridView>
					<asp:XmlDataSource runat="server" ID="XmlDataSource2" DataFile="../../DataType.xml">
					</asp:XmlDataSource>
				</div>							

				<TABLE height="25" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<asp:imagebutton id="imbFirstPage" runat="server" imageurl="../../images/butkiri1.gif" commandname="First"
								oncommand="NavigationLink_Click" alt="First"></asp:imagebutton>&nbsp;&nbsp;
							<asp:imagebutton id="imbPrevPage" runat="server" imageurl="../../images/butkiri.gif" commandname="Prev"
								oncommand="NavigationLink_Click" alt="Prev"></asp:imagebutton>&nbsp;&nbsp;
							<asp:imagebutton id="imbNextPage" runat="server" imageurl="../../images/butkanan.gif" commandname="Next"
								oncommand="NavigationLink_Click" alt="Next"></asp:imagebutton>&nbsp;&nbsp;
							<asp:imagebutton id="imbLastPage" runat="server" imageurl="../../images/butkanan1.gif" commandname="Last"
								oncommand="NavigationLink_Click" alt="Last"></asp:imagebutton></TD>
						<TD style="WIDTH: 72px; POSITION: relative; TOP: 0px" align="center" width="72">Page
							<asp:textbox id="txtpage" runat="server" CssClass="inptype" width="34px" maxlength="3">1</asp:textbox>&nbsp;
						</TD>
						<TD style="WIDTH: 29px">
							<asp:imagebutton id="imbGoPage" runat="server" width="30" imageurl="../../images/butgo.gif"
								cssclass="inptype" alt="Go"></asp:imagebutton></TD>
						<TD>
							<asp:rangevalidator id="rgvGo" runat="server" errormessage="*" controltovalidate="txtpage" type="Integer"
								maximumvalue="999999999" minimumvalue="1"></asp:rangevalidator>
							<asp:requiredfieldvalidator id="rfvGo" runat="server" errormessage="*" controltovalidate="txtpage"></asp:requiredfieldvalidator>&nbsp;&nbsp;
						</TD>
						<TD align="right"><FONT color="#999999">Page
								<asp:label id="lblPage" runat="server" forecolor="#999999"></asp:label>&nbsp;of
								<asp:label id="lblTotPage" runat="server" forecolor="#999999"></asp:label>, 
								Total
								<asp:label id="lblRecord" runat="server" forecolor="#999999"></asp:label>&nbsp;record(s)</FONT></TD>
					</TR>
				
				</TABLE>
			</asp:panel><br>
		</form>
	</body>
</HTML>
