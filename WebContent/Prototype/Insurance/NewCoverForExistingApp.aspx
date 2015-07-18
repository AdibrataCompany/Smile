<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>NewCoverForExistingApp</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<link href="../Confins.css" rel="stylesheet" type="text/css">
		<link rel="stylesheet" type="text/css" href="../Include/Insurance.css">
		</HEAD>
	<body>
				<form id="InsNewCover" method="post" runat="server">
			<asp:panel id="pnlsearch" Runat="server">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopikuning">
						<TD class="tdtopiabukiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopiabu" align="center">NEW COVER FOR EXISTING APPLICATION</TD>
						<TD class="tdtopiabukanan" width="10" height="20">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
				<TR>
				<TD class="TDGENAP" width="20%" style="height: 26px">Branch </TD>
				<TD class="TDGANJIL" style="height: 26px">
				<asp:DropDownList id="ddlBranch" runat="server">
					<asp:ListItem>Select One</asp:ListItem>
					<asp:ListItem>Jakarta Electronic</asp:ListItem>
				</asp:DropDownList>
				<FONT color="#ff0033">*)</FONT>
				</TD>
				</TR>
				<TR>
				<TD class="TDGENAP" width="20%">Search By </TD>
				<TD class="TDGANJIL">
				<asp:DropDownList id="ddlsearchby" runat="server">
					<asp:ListItem>Select One</asp:ListItem>
					<asp:ListItem>Agreement No</asp:ListItem>
					<asp:ListItem>Customer Name</asp:ListItem>
				</asp:DropDownList>
				<input name="txtsearch" type="text" class="inptype"></TD>
				</TR>
				</TABLE>
				
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR>
				<TD>
				<DIV align="right">
				<asp:ImageButton id="imgsearch" runat="server" width="100px" height="20px" imageurl="../Images/ButtonSearch.gif" PostBackUrl="NewCoverForExistingAppSearch.aspx" />
				<asp:ImageButton id="imbReset" runat="server" imageurl="../Images/ButtonReset.gif" causesvalidation="False" />
				</DIV>
				</TD>
				</TR>
				</TABLE>
			</asp:panel></form>
	</body>
</HTML>
