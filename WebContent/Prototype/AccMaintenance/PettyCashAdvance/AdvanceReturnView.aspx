<%@ Page Language="vb" AutoEventWireup="false" Codebehind="AdvanceReturnView.aspx.vb" Inherits="AdIns.Application.Eloan.Web.AccMnt.AdvanceReturnView"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>VIEW CASH ADVANCE</title>
		<meta content="Microsoft Visual Studio.NET 7.0" name="GENERATOR">
		<meta content="Visual Basic 7.0" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../../../../Include/AccMnt.css" type="text/css" rel="stylesheet">
		<SCRIPT src="../../../../Elsa.js"></SCRIPT>
		<script language="javascript">
		
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1)
			var ServerName = 'http://<%=Request.servervariables("SERVER_NAME")%>/';
			
			function OpenWinMain(BranchId, AdvanceNo){				
					window.open(ServerName + App +  '/AccMnt/Cashier/PettyCash/AdvanceTransaction/AdvanceInquiryView.aspx?BranchId=' + BranchId + '&AdvanceNo=' + AdvanceNo, null, 'left=50, top=50, width=900, height=300, menubar=0,scrollbars=1')
					}
			function GoBack()
			{
				window.navigate('AdvanceReturn.aspx');
			}
			
		</script>
	</HEAD>
	<body vLink="blue" aLink="black" link="blue" ms_positioning="GridLayout">
		<form id="Form1" method="post" runat="server">
			<asp:label id="lblMessage" runat="server" font-size="11px" font-name="Verdana" forecolor="#993300"></asp:label><asp:panel id="pnlList" runat="server"><BR>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopi" align="center">CASH ADVANCE RETURN</TD>
						<TD class="tdtopikanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
					<TR>
						<TD class="tdgenap" width="20%">Advance No.</TD>
						<TD class="tdganjil" width="30%">
							<asp:hyperlink id="lblAdvanceNo" runat="server"></asp:hyperlink></TD>
						<TD class="tdgenap" width="15%">Ref. Voucher No.</TD>
						<TD class="tdganjil" width="35%" colSpan="2">
							<asp:label id="lblRefVoucherNo" runat="server"></asp:label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Employee Name</TD>
						<TD class="tdganjil" width="30%">
							<asp:label id="lblEmployeeName" runat="server"></asp:label></TD>
						<TD class="tdgenap" width="15%">Date</TD>
						<TD class="tdganjil" width="35%" colSpan="2">
							<asp:label id="lblDate" runat="server" Width="136px"></asp:label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Bank Account</TD>
						<TD class="tdganjil" width="30%">
							<asp:label id="lblBankAccount" runat="server" Width="112px"></asp:label></TD>
						<TD class="tdgenap" width="15%">Amount</TD>
						<TD class="tdganjil" align="right" width="5%">
							<asp:literal id="ltlCurrencyID" Runat="server"></asp:literal></TD>
						<TD class="tdganjil" align="right" width="30%">
							<asp:label id="lblAmount" runat="server" Width="264px">0</asp:label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Description</TD>
						<TD class="tdganjil" width="80%" colSpan="4">
							<asp:label id="lblDescription" runat="server"></asp:label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Return To Account</TD>
						<TD class="tdganjil" width="80%" colSpan="4">
							<asp:dropdownlist id="cmbBankAccount" runat="server" cssclass="inptype"></asp:dropdownlist>
							<asp:requiredfieldvalidator id="rfvReturnAccount" runat="server" display="Dynamic" initialvalue="0" errormessage="Please Select Bank Account"
								controltovalidate="cmbBankAccount"></asp:requiredfieldvalidator>
							<font color="red">*)</font>										
						</TD>
					</TR>
				</TABLE>
				<asp:panel id="pnlbutton" runat="server">
					<TABLE id="Table4" cellSpacing="0" cellPadding="2" width="95%" align="center" border="0">
						<TR>
							<TD>
								<DIV align="right">
									<asp:imagebutton id="imgSave" runat="server" width="100" height="20" imageurl="..\..\..\..\Images\ButtonSave.gif" alt="Save"></asp:imagebutton>
									<asp:imagebutton id="imbCancel" runat="server" width="100" height="20" imageurl="..\..\..\..\Images\ButtonCancel.gif" alt="Cancel"></asp:imagebutton></DIV>
							</TD>
						</TR>
					</TABLE>
				</asp:panel>
			</asp:panel><asp:dropdownlist id="cboBankAccountType" style="Z-INDEX: 101; LEFT: 8px; POSITION: absolute; TOP: 8px"
				runat="server" Visible="False"></asp:dropdownlist></form>
	</body>
</HTML>
