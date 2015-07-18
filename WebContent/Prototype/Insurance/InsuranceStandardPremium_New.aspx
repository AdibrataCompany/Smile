<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>InsuranceStandardPremium</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<link rel="stylesheet" type="text/css" href="../Confins.css">
	</HEAD>
	<body>
		<form id="Form1" method="post" runat="server">
						<asp:panel id="Panel1" Runat="server" HorizontalAlign="center" Width="100%">
				<TABLE id="Table1" cellSpacing="0" cellPadding="0" width="95%" border="0">
				<TR class="trtopiabu">
				<TD class="tdtopiabukiri" width="10" height="20">&nbsp;</TD>
				<TD class="tdtopiabu" align="center">INSURANCE STANDARD 
						SETTING</TD>
				<TD class="tdtopiabukanan" width="10">&nbsp;</TD>
				</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table2" cellSpacing="1" cellPadding="2" width="95%" border="0">
				<TR>
				<TD class="tdgenap" width="25%">Branch</TD>
				<TD class="tdganjil">
				<asp:DropDownList runat="server" id="DropDownList1">
					<asp:ListItem>Select One</asp:ListItem>
					<asp:ListItem>Jakarta Electronic</asp:ListItem>
				</asp:DropDownList>
				</TD>
				</TR>
				</TABLE>
				<TABLE id="Table3" cellSpacing="0" cellPadding="0" width="95%" border="0">
				<TR>
				<TD width="50%" height="30">&nbsp;</TD>
				<TD align="right" width="50%">
				<asp:ImageButton id="imbSearch" Runat="server" ImageUrl="../images/ButtonSearch.gif" CausesValidation="False" PostBackUrl="InsuranceStandardPremium_NewSearch.aspx" />
				<asp:ImageButton id="imbReset" Runat="server" ImageUrl="../images/ButtonReset.gif" CausesValidation="False" PostBackUrl="InsuranceStandardPremium_New.aspx" />
				</TD>
				</TR>
				</TABLE>
			</asp:panel>
			<br>
						</form>
	</body>
</HTML>
