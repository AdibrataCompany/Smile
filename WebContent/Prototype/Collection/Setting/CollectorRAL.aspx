<%@ Register TagPrefix="uc1" TagName="UcLookupEmployee" Src="../../UserController/UcLookupEmployee.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcBranch" Src="../../UserController/UcBranch.ascx" %>
<%@ Page Language="vb" AutoEventWireup="false" Codebehind="CollectorRAL.aspx.vb" Inherits="AdIns.Application.Eloan.Web.Collection.CollectorRAL" %>
<%@ Register TagPrefix="uc1" TagName="UcFindEmployee" Src="../../UserController/UcFindEmployee.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcCompanyAdress" Src="../../UserController/UcCompanyAdress.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcContactPerson" Src="../../UserController/UcContactPerson.ascx" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>CollGroupResult</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../../include/collection.css" type="text/css" rel="stylesheet">
		<SCRIPT src="../../Elsa.js"></SCRIPT>
		<script language="javascript">
			function fConfirm() {
				if (window.confirm("Are you sure want to delete this record?")) 
					return true;
				else
					return false;
			}
			function fback() {
					history.go(-1);
					return false;
			}	
			
			function OpenViewCollGroup(pCGID){
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1);
			window.open('http://<%=Request.servervariables("SERVER_NAME")%>/' + App + '/Collection/Setting/CollectionGroupView.aspx?CGID=' + pCGID , 'InsuranceCo', 'left=15, top=10, width=985, height=450, menubar=0, scrollbars=yes');
			}
			
			function OpenViewAgreement(pAgreementNo){
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1);
			window.open('http://<%=Request.servervariables("SERVER_NAME")%>/' + App + '/AccAcq/Credit/ViewStatementofAccount.aspx?AgreementNo=' + pAgreementNo + '&Style=Collection', 'AgreementView', 'left=5, top=5, width=985, height=600, menubar=0, scrollbars=yes');
			}
			
			function OpenViewCustomer(pCustomerID){
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1);
			window.open('http://<%=Request.servervariables("SERVER_NAME")%>/' + App + '/AccAcq/Credit/ViewPersonalCustomer.aspx?CustomerID=' + pCustomerID + '&Style=Collection', 'CustomerView', 'left=5, top=5, width=985, height=600, menubar=0, scrollbars=yes');
			}
		</script>
	</HEAD>
	<body MS_POSITIONING="GridLayout">
		<form id="Form1" method="post" runat="server">
			<asp:label id="lblMessage" style="Z-INDEX: 101; LEFT: 24px; POSITION: absolute; TOP: 0px" runat="server"
				font-size="11px" font-name="Verdana" forecolor="Red"></asp:label>
			<br>
			<asp:panel id="pnlList" style="Z-INDEX: 101" Width="99.69%" Runat="server">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">EXECUTOR</TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" align="center" border="0">
					<TR class="tdganjil">
						<TD class="tdgenap" style="HEIGHT: 14px" width="25%">
							<DIV align="left">Collection Group</DIV>
						</TD>
						<TD class="tdganjil" style="HEIGHT: 14px">
							<asp:Label id="lblCGName" runat="server" Width="352px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="25%">Executor Name</TD>
						<TD class="tdganjil">
							<asp:Label id="lblExecutorName" runat="server" Width="352px"></asp:Label></TD>
					</TR>
				</TABLE>
				<BR>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">RAL HISTORY</TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR align="center">
						<TD width="100%">
							<asp:DataGrid id="dtgRAL" HorizontalAlign="Center" runat="server" width="100%" onsortcommand="Sorting"
								backcolor="White" borderwidth="1px" borderstyle="None" bordercolor="#CCCCCC" autogeneratecolumns="False"
								allowsorting="True" cellpadding="0">
								<AlternatingItemStyle CssClass="tdgenap" Height="20"></AlternatingItemStyle>
								<ItemStyle CssClass="tdganjil" Height="20"></ItemStyle>
								<HeaderStyle Font-Bold="True" HorizontalAlign="Center" CssClass="tdjudul" Height="30"></HeaderStyle>
								<Columns>
									<asp:BoundColumn DataField="APPLICATIONID" SortExpression="APPLICATIONID" HeaderText="APPLICATION ID" ItemStyle-HorizontalAlign=Center ></asp:BoundColumn>
									<asp:BoundColumn DataField="NAME" SortExpression="NAME" HeaderText="CUSTOMER NAME"></asp:BoundColumn>
									<asp:BoundColumn DataField="INSTALLMENTNO" SortExpression="INSTALLMENTNO" HeaderText="INSTALLMENT NO." ItemStyle-HorizontalAlign=right ></asp:BoundColumn>
									<asp:BoundColumn DataField="RALPERIOD" SortExpression="RALPERIOD" HeaderText="RAL PERIOD"></asp:BoundColumn>
									<asp:BoundColumn DataField="RALSTATUS" SortExpression="RALSTATUS" HeaderText="RAL STATUS" ItemStyle-HorizontalAlign=Center ></asp:BoundColumn>
									<asp:BoundColumn DataField="ReleaseReason" SortExpression="ReleaseReason" HeaderText="RELEASE REASON"  ></asp:BoundColumn>
									<asp:BoundColumn DataField="REPOSSESS" SortExpression="REPOSSESS" HeaderText="REPOSSESS" ItemStyle-HorizontalAlign=Center ></asp:BoundColumn>
								</Columns>
							</asp:DataGrid></TD>
					</TR>
				</TABLE>
				<BR>
				<TABLE style="HEIGHT: 25px" height="25" cellSpacing="0" cellPadding="0" width="95%" align="center"
					border="0" runat="server">
					<TR>
						<TD style="WIDTH: 160px" align="left"></TD>
						<TD align="right"><FONT face="Verdana">
								<A href="javascript:window.close();"><A href="javascript:window.close();"><IMG src="..\..\Images\ButtonExit.gif" border="0"></A></asp:ImageButton></A>&nbsp;
								<asp:ImageButton id="imbBack" runat="server" ImageUrl="..\..\images\buttonback.gif"></asp:ImageButton></FONT></TD>
					</TR>
				</TABLE>
			</asp:panel>
			<P>&nbsp;</P>
			</TABLE></form>
	</body>
</HTML>
