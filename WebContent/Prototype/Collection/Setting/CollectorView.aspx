<%@ Register TagPrefix="uc1" TagName="UcCompanyAdress" Src="../../UserController/UcCompanyAdress.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcContactPerson" Src="../../UserController/UcContactPerson.ascx" %>
<%@ Page Language="vb" AutoEventWireup="false" Codebehind="CollectorView.aspx.vb" Inherits="AdIns.Application.Eloan.Web.Collection.CollectorView" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>CollectorView</title>
		<meta content="Microsoft FrontPage 5.0" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../../include/Collection.css" type="text/css" rel="stylesheet">
		<SCRIPT src="../../Elsa.js"></SCRIPT>
		<script language="javascript">
			function windowClose() {
				window.close();
			}
			function fback() {
					history.go(-1);
					return false;
			}	
			function click() {
				if (event.button==2) {
					alert('You Are Not Authorize!');
					}
					}
				document.onmousedown=click
				
				function OpenViewRAL(pCGID,pCollectorID){
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1);
			window.open('http://<%=Request.servervariables("SERVER_NAME")%>/' + App + '/Collection/Setting/CollectorRAL.aspx?CGID=' + pCGID + '&CollectorID=' + pCollectorID, 'RALView', 'left=15, top=10, width=985, height=450, menubar=0, scrollbars=yes');
			}
		</script>
	</HEAD>
	<body MS_POSITIONING="GridLayout">
		<form id="Form1" method="post" runat="server">
			<asp:panel id="PnlView" style="Z-INDEX: 101; LEFT: 24px; TOP: 16px" HorizontalAlign="Center"
				Width="95%" Runat="server" Visible="False" Height="136px">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">
							<P>VIEW COLLECTOR</P>
						</TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" height="1" cellSpacing="1" cellPadding="2" width="95%" align="center"
					border="0">
					<TR class="tdganjil">
						<TD class="tdgenap" style="HEIGHT: 8px" width="25%">Collection Group</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 8px" width="277">
							<asp:Label id="lblCGName" runat="server" Width="184px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="HEIGHT: 17px" width="25%">Collector ID</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 17px" width="277">
							<asp:Label id="lblCollectorID" runat="server" Width="184px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="HEIGHT: 17px" width="25%">Employee Id</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 17px" width="277">
							<asp:Label id="lblEmployeeID" runat="server" Width="456px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="HEIGHT: 14px" width="25%">Employee Name</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 14px" width="277">
							<asp:Label id="lblEmployeeName" runat="server" Width="448px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="HEIGHT: 13px" width="25%">NPWP</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 13px">
							<asp:Label id="lblNPWP" runat="server" Width="504px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="HEIGHT: 17px" width="25%">Collector Type</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 17px" width="277">
							<asp:Label id="lblCollectorType" runat="server" Width="448px"></asp:Label></TD>
					</TR>
					
					
					<TR>
						<TD class="tdgenap" style="HEIGHT: 13px" width="25%">Collector From</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 13px">
							<asp:Label id="lblCollectorFrom" runat="server" text="" ></asp:Label></TD>
					</TR>	
					
					
					<TR>
						<TD class="tdgenap" style="HEIGHT: 13px" width="25%">CollectorCategory</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 13px">
							<asp:Label id="lblCollectorCategory" runat="server" Width="504px"></asp:Label></TD>
					</TR>					
					<TR>
						<TD class="tdgenap" style="HEIGHT: 13px" width="25%">Supervisor</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 13px" width="277">
							<asp:Label id="lblSupervisor" runat="server" Width="184px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="HEIGHT: 13px" width="25%">Bucket</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 13px" width="277">
							<asp:Label id="lblBucket" runat="server" Width="184px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="HEIGHT: 13px" width="25%">ZipCode</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 13px" width="277">
							<asp:Label id="lblZipCode" runat="server" Width="184px"></asp:Label></TD>
					</TR>
				</TABLE>
			</asp:panel></TD></TR></TBODY>
			</TABLE></TR></TBODY>
			</TABLE>
			<asp:panel id="PnlView2" HorizontalAlign="Center" Width="95%" Runat="server" Visible="False"
				Height="136px">
				<TABLE class="tablegrid" height="1" cellSpacing="1" cellPadding="2" width="95%" align="center"
					border="0">
					<TR class="tdganjil">
						<TD class="tdgenap" style="HEIGHT: 16px" width="25%">Address</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 16px">
							<asp:Label id="lblAddress" runat="server" Width="256px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="HEIGHT: 17px" width="25%">Phone No</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 17px">
							<asp:Label id="lblPhoneNo" runat="server" Width="376px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="HEIGHT: 17px" width="25%">Mobile Phone</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 17px">
							<asp:Label id="lblMobilePhone" runat="server" Width="376px"></asp:Label></TD>
					</TR>



					<TR>
						<TD class="tdgenap" style="HEIGHT: 13px" width="25%">Bank Name</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 13px">
							<asp:Label id="lblBankID" runat="server" Width="504px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="HEIGHT: 13px" width="25%">Bank Branch</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 13px">
							<asp:Label id="lblBankBranch" runat="server" Width="504px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="HEIGHT: 13px" width="25%">Bank Account No</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 13px">
							<asp:Label id="lblBankAccountNo" runat="server" Width="504px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="HEIGHT: 13px" width="25%">Bank Account Name</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 13px">
							<asp:Label id="lblBankAccountName" runat="server" Width="504px"></asp:Label></TD>
					</TR>					

					
					<TR>
						<TD class="tdgenap" style="HEIGHT: 13px" width="25%">Notes</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 13px">
							<asp:Label id="lblNotes" runat="server" Width="504px"></asp:Label></TD>
					</TR>					

					<TR>
						<TD class="tdgenap" width="25%">Active</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 1px" width="277">
							<asp:Label id="lblActive" runat="server" Width="184px"></asp:Label></TD>
					</TR>
					
				</TABLE>
				<TABLE width="95%" align="center">
					<TR width="100%">
						<TD width="100%" colSpan="2">
							<asp:HyperLink id="hpRAL" runat="server" Enabled="True" text="RAL History"></asp:HyperLink></TD>
					</TR>
				</TABLE>
			</asp:panel>
			<asp:Panel id="pnlClose" runat="server" style="Z-INDEX: 103; LEFT: 24px; TOP: 360px" Width="95%">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD align="right">
							<asp:imagebutton id="btnClose" runat="server" imageurl="../../Images/ButtonClose.gif" causesvalidation="true"></asp:imagebutton></TD>
					</TR>
				</TABLE>
			</asp:Panel></form>
	</body>
</HTML>
