<%@ Register TagPrefix="uc1" TagName="ValidDate" Src="../../../../../UserController/ValidDate.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcCurrencyID" Src="../../../../../UserController/UcCurrencyID.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcBankAccountID" Src="../../../../../UserController/UcBankAccountID.ascx" %>
<%@ Page Language="vb" AutoEventWireup="false" Codebehind="PCReimburseRequest.aspx.vb" Inherits="AdIns.Application.Eloan.Web.AccMnt.PCReimburseRequest"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>PDCRInquiry</title>
		<meta content="Microsoft Visual Studio.NET 7.0" name="GENERATOR">
		<meta content="Visual Basic 7.0" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../../../../../Include/AccMnt.css" type="text/css" rel="stylesheet">
		<SCRIPT src="../../../Elsa.js"></SCRIPT>
		<script language="javascript">
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1)
			var ServerName = 'http://<%=Request.servervariables("SERVER_NAME")%>/';
			
			function OpenWinMain(pPettyCashNo,pBranchId){																	
					window.open(ServerName + App +  '/AccMnt/Cashier/PettyCash/PettyCashTransaction/PettyCashInquiryView.aspx?BranchId=' + pBranchId + '&PettyCashNo=' + pPettyCashNo +  '&style=AccMnt', null, 'left=50, top=50, width=800, height=500, menubar=0,scrollbars=1')
					}
		</script>
	</HEAD>
	<body vLink="blue" aLink="black" link="blue" ms_positioning="GridLayout">
		<form id="Form1" method="post" runat="server">
			<asp:label id="lblMessage" runat="server" forecolor="#FF0000" font-name="Verdana" font-size="11px"></asp:label><asp:panel id="pnlListChoosen" runat="server"><BR>
				<TABLE id="Table7" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopi" align="center">PETTY CASH REIMBURSE</TD>
						<TD class="tdtopikanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table8" cellSpacing="1" cellPadding="3" width="95%" align="center"
					border="0">
					<TR>
						<TD class="tdgenap" width="20%">Bank Account</TD>
						<TD class="tdganjil" width="30%" colSpan="5">
							<asp:DropDownList id="cboBank" runat="server" Visible ="False" ></asp:DropDownList>
							<asp:RequiredFieldValidator id="RequiredFieldValidator1" Enabled = "False" runat="server" ErrorMessage="Please fill Bank Account"
								Display="Dynamic" ControlToValidate="cboBank" InitialValue="0"></asp:RequiredFieldValidator>
							<ASP:label id="lblBankAccount" runat="server"></ASP:label>
						</TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Currency</TD>
						<TD class="tdganjil" width="30%">
							<asp:Label id="lblCurrencyID" Runat="server"></asp:Label></TD>
						<TD class="tdgenap" width="20%">Date Until</TD>
						<TD class="tdganjil" width="30%" colSpan="3">
							<asp:Label id="lblDate" runat="server"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Description</TD>
						<TD class="tdganjil" width="30%" colSpan="5">
							<asp:TextBox id="txtDescription" runat="server" MaxLength="80" CssClass="inptype" Width="400px"></asp:TextBox>
							<asp:RequiredFieldValidator id="RequiredFieldValidator2" runat="server" ErrorMessage="Please fill Description"
								Display="Dynamic" ControlToValidate="txtDescription" InitialValue='""'></asp:RequiredFieldValidator></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table10" cellSpacing="1" cellPadding="3" width="95%" align="center"
					border="0">
					<TR>
						<TD class="tdjudul" align="center">PETTY CASH TRANSACTION LIST</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table11" cellSpacing="0" cellPadding="0" width="95%" align="center"
					border="0">
					<TR>
						<TD align="center">
							<asp:datagrid id="dtgChoosen" runat="server" ShowFooter="True" cellpadding="0" backcolor="White"
								borderwidth="1px" borderstyle="None" bordercolor="#CCCCCC" autogeneratecolumns="False" width="100%"
								PageSize="1000">
								<SelectedItemStyle CssClass="tdgenap"></SelectedItemStyle>
								<AlternatingItemStyle CssClass="tdgenap"></AlternatingItemStyle>
								<ItemStyle Height="25px" CssClass="tdganjil"></ItemStyle>
								<HeaderStyle Height="25px" CssClass="tdjudul"></HeaderStyle>
								<FooterStyle Font-Bold="True" Height="25px" CssClass="tdjudul"></FooterStyle>
								<Columns>
									<asp:BoundColumn Visible="False" DataField="PettyCashNo"></asp:BoundColumn>
									<asp:TemplateColumn HeaderText="PETTY CASH NO.">
										<HeaderStyle HorizontalAlign="Center" Height="30px"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left" Width="15%"></ItemStyle>
										<ItemTemplate>
											<ASP:HYPERLINK id="hyPettyCashNo" runat="server" text='<%#Container.DataItem("PettyCashNo")%>' Visible="True" >
											</ASP:HYPERLINK>
										</ItemTemplate>
										<FooterStyle HorizontalAlign="Left" Height="25px"></FooterStyle>
										<FooterTemplate>
											<asp:label id="lblTot2" runat="server" text="TOTAL" Font-Bold="True"></asp:label>
										</FooterTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn HeaderText="DEPARTEMENT">
										<HeaderStyle HorizontalAlign="Center" Height="30px"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left" Width="15%"></ItemStyle>
										<ItemTemplate>
											<ASP:label id="lblDepartement" runat="server" text='<%#Container.DataItem("Departement")%>' Visible="True">
											</ASP:label>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn HeaderText="EMPLOYEE">
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left" Width="15%"></ItemStyle>
										<ItemTemplate>
											<asp:Label id="lblEmployeeName" runat="server" text='<%# Container.DataItem("Employee") %>' Visible="True">
											</asp:Label>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn HeaderText="DESCRIPTION">
										<HeaderStyle HorizontalAlign="Center" Height="30px"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left" Width="20%"></ItemStyle>
										<ItemTemplate>
											<asp:label id="lblDescription" runat="server" text='<%#Container.DataItem("Description")%>' Visible="True">
											</asp:label>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn HeaderText="AMOUNT">
										<HeaderStyle HorizontalAlign="Center" Height="30px"></HeaderStyle>
										<ItemStyle HorizontalAlign="Right" Width="15%"></ItemStyle>
										<ItemTemplate>
											<asp:label id="lblPCAmountChoosen2" runat="server" text='<%#formatnumber(Container.DataItem("Amount"),2)%>' Visible="True">
											</asp:label>
										</ItemTemplate>
										<FooterStyle HorizontalAlign="Right"></FooterStyle>
										<FooterTemplate>
											<asp:label id="lblTotPCAmount2" runat="server" Visible="true"></asp:label>
										</FooterTemplate>
									</asp:TemplateColumn>
									<asp:BoundColumn DataField="PCDate" HeaderText="PC DATE" DataFormatString="{0:dd/MM/yyyy}">
										<HeaderStyle HorizontalAlign="Center" CssClass="tdjudul"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center" Width="10%"></ItemStyle>
									</asp:BoundColumn>
								</Columns>
								<PagerStyle Visible="False" HorizontalAlign="Left" ForeColor="#000066" BackColor="White" Mode="NumericPages"></PagerStyle>
							</asp:datagrid></TD>
					</TR>
				</TABLE>
				<BR>
				<TABLE class="tablegrid" id="Table12" cellSpacing="0" cellPadding="0" width="95%" align="center"
					border="0">
					<TR>
						<TD class="tdganjil" align="right">
							<asp:imagebutton id="imbSave" runat="server" causesvalidation="True" imageurl="../../../../Images/ButtonSave.gif" alt="Save"></asp:imagebutton>&nbsp;
							<asp:imagebutton id="imbCancel" runat="server" causesvalidation="False" imageurl="../../../../Images/ButtonCancel.gif" alt="Cancel"></asp:imagebutton></TD>
					</TR>
				</TABLE>
			</asp:panel>&nbsp;
			<asp:panel id="pnlList" runat="server">
				<TABLE id="Table1" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopi" align="center">PETTY CASH REIMBURSE</TD>
						<TD class="tdtopikanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table3" cellSpacing="1" cellPadding="3" width="95%" align="center"
					border="0">
					<TR>
						<TD class="tdgenap" width="20%">Bank Account</TD>
						<TD class="tdganjil" width="30%" colspan="3">
							<uc1:UcBankAccountID id="oFrombankAccount" runat="server"></uc1:UcBankAccountID><FONT color="red">*)</FONT>
							<INPUT id="hidCurrencyRateFrom" type="hidden" name="hidCurrencyRateFrom" runat="server">
						</TD>
						
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Currency
						</TD>
						<TD class="tdganjil" width="30%">
							<asp:textbox id="txtCurrencyID" runat="server" cssclass="inptype" MaxLength="20" BorderStyle="None"
								ReadOnly="True" Width="100%"></asp:textbox>
						</TD>
						<TD class="tdgenap" width="20%">Date Until</TD>
						<TD class="tdganjil" width="30%">
							<uc1:ValidDate id="oValidDate" runat="server"></uc1:ValidDate></TD>
					</TR>
				</TABLE>
				<TABLE id="Table4" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<DIV align="right">
								<asp:imagebutton id="imgsearch" runat="server" width="100" causesvalidation="True" imageurl="../../../../Images/ButtonSearch.gif"
									height="20" Enabled="True" alt="Search"></asp:imagebutton>&nbsp;
								<asp:imagebutton id="imbReset" runat="server" causesvalidation="False" imageurl="../../../../Images/ButtonReset.gif" alt="Reset"></asp:imagebutton></DIV>
						</TD>
					</TR>
				</TABLE>
			</asp:panel><asp:panel id="pnlGrid" runat="server" visible="true"><BR>
				<TABLE id="Table5" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopikuning">
						<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopi" align="center">PETTY CASH TRANSACTION LIST</TD>
						<TD class="tdtopikanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table6" cellSpacing="0" cellPadding="0" width="95%" align="center"
					border="0">
					<TR>
						<TD>
							<asp:datagrid id="DtgPC" runat="server" ShowFooter="True" cellpadding="0" backcolor="White" borderwidth="1px"
								borderstyle="None" bordercolor="#CCCCCC" autogeneratecolumns="False" width="100%" allowsorting="True">
								<SelectedItemStyle CssClass="tdgenap"></SelectedItemStyle>
								<AlternatingItemStyle CssClass="tdgenap"></AlternatingItemStyle>
								<ItemStyle Height="25px" CssClass="tdganjil"></ItemStyle>
								<HeaderStyle Height="25px" CssClass="tdjudul"></HeaderStyle>
								<FooterStyle Font-Bold="True" Height="25px" CssClass="tdjudul"></FooterStyle>
								<Columns>
									<asp:TemplateColumn SortExpression="PettyCashNo" HeaderText="PETTY CASH NO.">
										<HeaderStyle HorizontalAlign="Center" Height="30px"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left" Width="15%"></ItemStyle>
										<ItemTemplate>
											<asp:hyperlink id="lblPettyCash" runat="server" text='<%#Container.DataItem("PettyCashNo")%>' Visible="True" >
											</asp:hyperlink>
										</ItemTemplate>
										<FooterTemplate>
											<asp:label id="lblTot" runat="server" text="TOTAL" Font-Bold="True"></asp:label>
										</FooterTemplate>
									</asp:TemplateColumn>
									<asp:BoundColumn DataField="DEPARTEMENTNAME" SortExpression="DEPARTMENTNAME" HeaderText="DEPARTMENT">
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
									</asp:BoundColumn>
									<asp:BoundColumn DataField="EMPLOYEENAME" SortExpression="EMPLOYEENAME" HeaderText="EMPLOYEE">
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
									</asp:BoundColumn>
									<asp:BoundColumn DataField="DESCRIPTION" SortExpression="DESCRIPTION" HeaderText="DESCRIPTION">
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
									</asp:BoundColumn>
									<asp:TemplateColumn SortExpression="Amount" HeaderText="AMOUNT">
										<HeaderStyle HorizontalAlign="Center" Height="30px"></HeaderStyle>
										<ItemStyle HorizontalAlign="Right" Width="15%"></ItemStyle>
										<ItemTemplate>
											<asp:label id="lblPCAmount" runat="server" text='<%#formatnumber(Container.DataItem("Amount"),0)%>' Visible="True" >
											</asp:label>
										</ItemTemplate>
										<FooterStyle HorizontalAlign="Right"></FooterStyle>
										<FooterTemplate>
											<asp:label id="lblTotPCAmount" runat="server" Font-Bold="True" Visible="true"></asp:label>
										</FooterTemplate>
									</asp:TemplateColumn>
									<asp:BoundColumn DataField="PettyCashDate" SortExpression="PettyCashDate" HeaderText="PC DATE" DataFormatString="{0:dd/MM/yyyy}">
										<HeaderStyle HorizontalAlign="Center" CssClass="tdjudul"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center" Width="10%"></ItemStyle>
									</asp:BoundColumn>
									<asp:TemplateColumn>
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center"></ItemStyle>
										<HeaderTemplate>
											<asp:CheckBox id="cbAll" Visible="True" Runat="server" OnCheckedChanged="checkAll" AutoPostBack="True"></asp:CheckBox>
										</HeaderTemplate>
										<ItemTemplate>
											<asp:CheckBox id="cbCheck" Visible="True" Runat="server"></asp:CheckBox>
										</ItemTemplate>
									</asp:TemplateColumn>
								</Columns>
								<PagerStyle Visible="False" HorizontalAlign="Left" ForeColor="#000066" BackColor="White" Mode="NumericPages"></PagerStyle>
							</asp:datagrid></TD>
					</TR>
				</TABLE>
				<BR>
				<TABLE class="tablegrid" id="Table2" cellSpacing="0" cellPadding="0" width="95%" align="center"
					border="0">
					<TR>
						<TD class="tdganjil" align="right">
							<asp:imagebutton id="imbNext" runat="server" causesvalidation="False" imageurl="../../../../Images/ButtonNext.gif"
								Visible="True" alt="Next"></asp:imagebutton></TD>
					</TR>
				</TABLE>
			</asp:panel><br>
		</form>
	</body>
</HTML>
