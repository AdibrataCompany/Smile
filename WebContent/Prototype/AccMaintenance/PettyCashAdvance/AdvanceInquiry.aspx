﻿<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
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
			<asp:label id="lblMessage" runat="server" forecolor="#FF0000" font-name="Verdana" font-size="11px"></asp:label><asp:panel id="pnlList" runat="server">
				<TABLE id="Table1" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR>
				<TD class="tdtopibirukiri" width="10" height="20">&nbsp;</TD>
				<TD class="tdtopibiru" align="center">PETTY CASH ADVANCE INQUIRY</TD>
				<TD class="tdtopibirukanan" width="10">&nbsp;</TD>
				</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table3" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
				<TR>
				<TD class="tdgenap" width="20%">Branch </TD>
				<TD class="tdganjil" width="30%">
				<asp:DropDownList id="cboParent" Runat="server">
					<asp:ListItem>All</asp:ListItem>
					<asp:ListItem>Account 1</asp:ListItem>
				</asp:DropDownList>
				</TD>
				<TD class="tdgenap" width="20%">Status</TD>
				<TD class="tdganjil" width="30%">
				<asp:DropDownList id="cboStatus" runat="server">
					<asp:ListItem Value="0" Selected="True">All</asp:ListItem>
					<asp:ListItem Value="REQ">Request</asp:ListItem>
					<asp:ListItem Value="APR">Approved</asp:ListItem>
					<asp:ListItem Value="TFR">Transferred</asp:ListItem>
					<asp:ListItem Value="REC">Reconciled</asp:ListItem>
				</asp:DropDownList>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="20%">Search By</TD>
				<TD class="tdganjil" colspan="3" style="width: 60%">
				<asp:DropDownList id="cboSearchBy" runat="server">
					<asp:ListItem Value="0">Select One</asp:ListItem>
					<asp:ListItem Value="AdvanceNo">Advance No</asp:ListItem>
					<asp:ListItem Value="EmployeeName">Employee Name
					</asp:ListItem>
					<asp:ListItem Value="Description">Description</asp:ListItem>
				</asp:DropDownList>
				<asp:TextBox id="txtSearchBy" runat="server" CssClass="inptype" Width="88px">
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
			</asp:panel>
			<asp:panel id="pnlDatagrid" runat="server">
			<BR>
			<TABLE id="Table5" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
			<TR class="trtopikuning">
			<TD class="tdtopibirukiri" width="10" height="20">&nbsp;</TD>
			<TD class="tdtopibiru" align="center">PETTY CASH ADVANCE 
						LISTING</TD>
			<TD class="tdtopibirukanan" width="10">&nbsp;</TD>
			</TR>
			</TABLE>
			<div align="center">
				<asp:GridView Width="95%" runat="server" id="grdAgreement" DataSourceID="XmlDataSource2" AutoGenerateColumns="False">
					<Columns>
						<asp:boundfield DataField="valstring3" HeaderText="BRANCH" SortExpression="valstring3">
						</asp:boundfield>					
						<asp:templatefield HeaderText="ADVANCE NO">
							<ItemTemplate>
								<asp:HyperLink runat="server" id="HypAdvanceNo" NavigateUrl="AdvanceRequestView.aspx" Target="_blank">xxxxx20xxxxx
								</asp:HyperLink>
							</ItemTemplate>
						</asp:templatefield>
						<asp:boundfield DataField="valstring20" HeaderText="EMPLOYEE NAME" SortExpression="valstring20">
						</asp:boundfield>
						<asp:boundfield DataField="valstring50" HeaderText="DESCRIPTION" SortExpression="valstring50">
						</asp:boundfield>
						<asp:boundfield DataField="vCurr" HeaderText="CURR" SortExpression="vCurr">
							<ItemStyle HorizontalAlign="Center" />
						</asp:boundfield>
						<asp:boundfield DataField="valamount" HeaderText="AMOUNT" SortExpression="valamount">
							<ItemStyle HorizontalAlign="Right" />
						</asp:boundfield>
						<asp:boundfield DataField="valamount" HeaderText="OS AMOUNT" SortExpression="valamount">
						</asp:boundfield>						
						<asp:boundfield DataField="valdate" HeaderText="ADVANCE DATE" SortExpression="valdate">
							<ItemStyle HorizontalAlign="Center" />
						</asp:boundfield>
						<asp:boundfield DataField="valstring10" HeaderText="STATUS" SortExpression="valstring10">
						</asp:boundfield>
						<asp:boundfield DataField="valdate" HeaderText="RETURN DATE" SortExpression="valdate">
						</asp:boundfield>
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
			<TD>
			<asp:ImageButton id="imbPrint" runat="server" imageurl="../../Images/ButtonPrint.gif" causesvalidation="False" alt="Print" />
			</TD>
			</TR>
			</TABLE>
			</BR>
			</asp:panel><br>
		</form>
	</body>
</HTML>
