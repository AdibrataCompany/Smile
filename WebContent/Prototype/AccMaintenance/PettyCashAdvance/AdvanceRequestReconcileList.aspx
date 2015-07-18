<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>PDCRInquiry</title>
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
			
			function OpenWinMain(BranchId, AdvanceNo){				
					window.open(ServerName + App +  '/AccMnt/Cashier/PettyCash/AdvanceTransaction/AdvanceInquiryView.aspx?BranchId=' + BranchId + '&AdvanceNo=' + AdvanceNo, null, 'left=50, top=50, width=900, height=300, menubar=0,scrollbars=1')
					}					
		</script>
	</HEAD>
	<body vLink="blue" aLink="black" link="blue" ms_positioning="GridLayout">
		<form id="Form1" method="post" runat="server">
			&nbsp;
			<asp:label id="lblMessage" runat="server" font-size="11px" font-name="Verdana" forecolor="#FF0000"></asp:label>
				<TABLE id="Table1" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR>
				<TD class="tdtopibirukiri" width="10" height="20">&nbsp;</TD>
				<TD class="tdtopibiru" align="center">PETTY CASH ADVANCE - RECONCILE</TD>
				<TD class="tdtopibirukanan" width="10">&nbsp;</TD>
				</TR>
				</TABLE>
				<div align="center">
					<table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
						<tr>
							<td class="tdgenap" style="width: 20%">Bank Account</td>
							<td align="left" class="tdganjil">
							<asp:DropDownList runat="server" id="ddlBankAccount">
								<asp:ListItem>Select One</asp:ListItem>
								<asp:ListItem>Account Branch 1</asp:ListItem>
							</asp:DropDownList>
				<font color="red">&nbsp;*)</font></td>
						</tr>
						<tr>
							<td class="tdgenap" style="width: 20%">
							Transfer Date &lt;=</td>
							<td class="tdganjil">
							<asp:TextBox runat="server" id="txtTransferDate" CssClass="inptype" Width="100px">
							</asp:TextBox>
							&nbsp;<asp:Image runat="server" id="imgCalendar2" ImageUrl="../../images/iconCalendar.gif" /></td>
						</tr>
						<tr>
							<td class="tdgenap" style="width: 20%">Search By</td>
							<td class="tdganjil">
							<asp:DropDownList id="cboSearchBy" runat="server">
								<asp:ListItem Value="0">Select One
								</asp:ListItem>
								<asp:ListItem Value="AdvanceNo">Advance No
								</asp:ListItem>
								<asp:ListItem Value="EmployeeName">Employee Name
								</asp:ListItem>
							</asp:DropDownList>
							<asp:TextBox runat="server" id="txtSearchBy" CssClass="inptype">
							</asp:TextBox>
							</td>
						</tr>
					</table>
				</div>
				<TABLE class="tablegrid" id="Table9" cellSpacing="1" cellPadding="3" width="95%" align="center"
					border="0">
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
				<BR>
				<TABLE id="Table5" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR class="trtopibirukuning">
				<TD class="tdtopibirukiri" width="10" height="20">&nbsp;</TD>
				<TD class="tdtopibiru" align="center">PETTY CASH ADVANCE LISTING</TD>
				<TD class="tdtopibirukanan" width="10">&nbsp;</TD>
				</TR>
				</TABLE>
				<div align="center">
					<asp:GridView Width="95%" runat="server" id="grdApproval" DataSourceID="XmlDataSource2" AutoGenerateColumns="False">
						<Columns>
							<asp:boundfield DataField="valstring20" HeaderText="ADVANCE NO" SortExpression="valstring20">
							</asp:boundfield>
							<asp:boundfield DataField="valstring20" HeaderText="EMPLOYEE NAME" SortExpression="valstring20">
							</asp:boundfield>
							<asp:boundfield DataField="valstring30" HeaderText="DESCRIPTION" SortExpression="valstring20">
							</asp:boundfield>	
							<asp:boundfield DataField="valstring20" HeaderText="TRANSFER NO" SortExpression="valstring20">
							</asp:boundfield>													
							<asp:boundfield DataField="valDate" HeaderText="TRANSFER DATE" SortExpression="valDate">
								<ItemStyle HorizontalAlign="Center" />
							</asp:boundfield>						
							<asp:boundfield DataField="vCurr" HeaderText="CURR" SortExpression="vCurr">
								<ItemStyle HorizontalAlign="Center" />
							</asp:boundfield>
							<asp:boundfield DataField="valamount" HeaderText="AMOUNT" SortExpression="valamount">
								<ItemStyle HorizontalAlign="Right" />
							</asp:boundfield>
							<asp:templatefield HeaderText="RECONCILE">
								<ItemTemplate>
									<asp:HyperLink runat="server" id="hypReconcile" Text="Reconcile" NavigateUrl="AdvanceRequestReconcile.aspx" />
								</ItemTemplate>
								<ItemStyle HorizontalAlign="Center" />
							</asp:templatefield>
						</Columns>
						<HeaderStyle CssClass="tdjudulbiru" />
						<AlternatingRowStyle CssClass="tdgenap" />
					</asp:GridView>
				</div>
				<asp:XmlDataSource runat="server" ID="XmlDataSource2" DataFile="../../DataType.xml">
				</asp:XmlDataSource>
				<TABLE height="25" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR>
				<TD>
				<asp:ImageButton id="imbFirstPage" runat="server" imageurl="../../images/butkiri1.gif" commandname="First" alt="First" />&nbsp;&nbsp;
				<asp:ImageButton id="imbPrevPage" runat="server" imageurl="../../images/butkiri.gif" commandname="Prev" alt="Prev" />&nbsp;&nbsp;
				<asp:ImageButton id="imbNextPage" runat="server" imageurl="../../images/butkanan.gif" commandname="Next" alt="Next" />&nbsp;&nbsp;
				<asp:ImageButton id="imbLastPage" runat="server" imageurl="../../images/butkanan1.gif" commandname="Last" alt="Last" />
				</TD>
				<TD style="WIDTH: 72px; POSITION: relative; TOP: 0px" align="center" width="72">Page
				<asp:TextBox id="txtpage" runat="server" CssClass="inptype" width="34px" maxlength="3">1</asp:TextBox>
				&nbsp; </TD>
				<TD style="WIDTH: 29px">
				<asp:ImageButton id="imbGoPage" runat="server" width="30" imageurl="../../images/butgo.gif" cssclass="inptype" alt="Go" />
				</TD>
				<TD>
				<asp:RangeValidator id="rgvGo" runat="server" errormessage="*" controltovalidate="txtpage" type="Integer" maximumvalue="999999999" minimumvalue="1">
				</asp:RangeValidator>
				<asp:RequiredFieldValidator id="rfvGo" runat="server" errormessage="*" controltovalidate="txtpage">
				</asp:RequiredFieldValidator>
				&nbsp;&nbsp; </TD>
				<TD align="right">
				<FONT color="#999999">Page
				<asp:Label id="lblPage" runat="server" forecolor="#999999">
				</asp:Label>
				&nbsp;of
				<asp:Label id="lblTotPage" runat="server" forecolor="#999999">
				</asp:Label>
				, 
								Total
				<asp:Label id="lblRecord" runat="server" forecolor="#999999">
				</asp:Label>
				&nbsp;record(s)</FONT>
				</TD>
				</TR>
				<TR>
				<TD></TD>
				</TR>
				</TABLE>
			<br>
		</form>
	</body>
</HTML>
