<%@ Register TagPrefix="uc1" TagName="UcCompanyAdress" Src="../../UserController/UcCompanyAdress.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcContactPerson" Src="../../UserController/UcContactPerson.ascx" %>
<%@ Page Language="vb" AutoEventWireup="false" Codebehind="CollectionGroupView.aspx.vb" Inherits="AdIns.Application.Eloan.Web.Collection.CollectionGroupView" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>InsCoView</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../../include/Collection.css" type="text/css" rel="stylesheet">
		<script language="javascript">
			function windowClose() {
				window.close();
			}
			function fback() {
					history.go(-1);
					return false;
			}	
		</script>
		<SCRIPT src="../../Elsa.js"></SCRIPT>
	</HEAD>
	<body MS_POSITIONING="GridLayout">
		<form id="Form1" method="post" runat="server">
			<asp:panel id="PnlView" style="Z-INDEX: 101; LEFT: 8px; POSITION: absolute; TOP: 8px" HorizontalAlign="Center"
				Width="100%" Runat="server" Visible="False">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"</TD>
						<TD class="tdtopi" align="center">
							<P>COLLECTION GROUP VIEW</P>
						</TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" style="WIDTH: 910px; HEIGHT: 264px" cellSpacing="1" cellPadding="2"
					width="910" align="center" border="0">
					<TR class="tdganjil">
						<TD class="tdgenap" style="WIDTH: 173px; HEIGHT: 8px" width="173">Collection Group 
							ID</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 8px" width="277">
							<asp:Label id="lblCGID" runat="server" Width="184px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="WIDTH: 173px; HEIGHT: 17px" width="173">Collection Group 
							Name</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 17px" width="277">
							<asp:Label id="lblCGName" runat="server" Width="184px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="WIDTH: 173px; HEIGHT: 18px" width="173">Collection Group 
							Head</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 18px" width="277">
							<asp:Label id="lblCGHead" runat="server" Width="184px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdtopi" style="WIDTH: 173px; HEIGHT: 1px" colSpan="2">ADDRESS</TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="WIDTH: 173px; HEIGHT: 4px">Address</TD>
						</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 4px">
							<asp:Label id="lblAddress" runat="server" Width="256px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="WIDTH: 173px; HEIGHT: 21px">RT/RW</TD>
						</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 21px">
							<asp:Label id="lblRT" runat="server" Width="32px"></asp:Label>
							<asp:Label id="Label3" runat="server" Width="8px">/</asp:Label>
							<asp:Label id="lblRW" runat="server" Width="39px"></asp:Label></TD>
						</TD></TR>
					<TR>
						<TD class="tdgenap" style="WIDTH: 173px; HEIGHT: 5px">Kelurahan</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 5px">
							<asp:Label id="lblKelurahan" runat="server" Width="256px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="WIDTH: 173px; HEIGHT: 8px">Kecamatan</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 8px">
							<asp:Label id="lblKecamatan" runat="server" Width="256px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="WIDTH: 173px; HEIGHT: 1px">City</TD>
						</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 1px">
							<asp:Label id="lblCity" runat="server" Width="256px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="WIDTH: 173px; HEIGHT: 1px">ZipCode</TD>
						</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 1px">
							<asp:Label id="lblZipCode" runat="server" Width="80px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="WIDTH: 173px; HEIGHT: 3px">Phone No&nbsp;1</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 3px">
							<asp:Label id="lblPhone1" runat="server" Width="144px"></asp:Label></TD>
						</TD></TR>
					<TR>
						<TD class="tdgenap" style="WIDTH: 173px; HEIGHT: 5px">Phone No&nbsp;2</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 5px">
							<asp:Label id="lblPhone2" runat="server" Width="128px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="WIDTH: 173px; HEIGHT: 4px">Fax No</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 4px">
							<asp:Label id="lblFax" runat="server" Width="175px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdtopi" style="WIDTH: 173px; HEIGHT: 7px" colSpan="2">CONTACT PERSON</TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="WIDTH: 173px; HEIGHT: 9px">Contact Person</TD>
						</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 9px">
							<asp:Label id="lblCPName" runat="server" Visible="False" Width="256px"></asp:Label></TD>
						</TD></TR>
					<TR>
						<TD class="tdgenap" style="WIDTH: 173px; HEIGHT: 10px">Contact Person Title</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 10px">
							<asp:Label id="lblCPTitle" runat="server" Width="256px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="WIDTH: 173px; HEIGHT: 4px">Contact Person Mobile Phone</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 4px">
							<asp:Label id="lblMobilePhone" runat="server" Width="256px"></asp:Label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="WIDTH: 173px; HEIGHT: 22px">Contact Person Email</TD>
						<TD class="tdganjil" style="WIDTH: 277px; HEIGHT: 22px">
							<asp:Label id="lblCPEmail" runat="server" Visible="False" Width="256px"></asp:Label></TD>
					</TR>
				</TABLE>
				<TABLE id="Table10" style="HEIGHT: 19px" cellSpacing="0" cellPadding="0" width="95%" align="center"
					border="0">
					<TR>
						<TD align="right">&nbsp;
							<asp:ImageButton id="BtnClose" runat="server" CausesValidation="False" ImageUrl="..\..\Images\ButtonClose.gif"></asp:ImageButton>&nbsp;
							<A href="javascript:history.back();"></A>
						</TD>
					</TR>
				</TABLE>
			</asp:panel></form>
	</body>
</HTML>
