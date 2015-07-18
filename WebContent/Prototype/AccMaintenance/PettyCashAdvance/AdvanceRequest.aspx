<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>Advance Request</title>
		<meta content="Microsoft Visual Studio.NET 7.0" name="GENERATOR">
		<meta content="Visual Basic 7.0" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../../Confins.css" type="text/css" rel="stylesheet">
		<SCRIPT language="javascript" src="../../Elsa.js">
		</SCRIPT>
	</HEAD>
	<body vLink="blue" aLink="black" link="blue" ms_positioning="GridLayout">
		<form id="Form1" method="post" runat="server">
			<asp:label id="lblMessage" runat="server" font-size="11px" font-name="Verdana" forecolor="#FF0000"></asp:label><BR>
			<asp:panel id="pnlMain" runat="server">
				<TABLE id="Table1" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR>
				<TD class="tdtopibirukiri" width="10" height="20">&nbsp;</TD>
				<TD class="tdtopibiru" align="center">PETTY CASH ADVANCE REQUEST</TD>
				<TD class="tdtopibirukanan" width="10">&nbsp;</TD>
				</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table5" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
				<tr>
					<TD class="tdgenap" style="width: 20%">Employee</TD>
					<TD class="tdganjil">
					<asp:TextBox runat="server" id="txtEmployeeName" CssClass="inptype" Width="200px">
					</asp:TextBox>
					&nbsp;<asp:Image runat="server" id="imgLookup" ImageUrl="../../images/iconDetail.gif" /></TD>
				</tr>
				<TR>
				<TD class="tdgenap" style="width: 20%">Date</TD>
				<TD class="tdganjil">
				<asp:Label id="lblBusinessDate" runat="server">dd/mm/yyyy</asp:Label>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" style="width: 20%">Non Operational</TD>
				<TD class="tdganjil">
				<asp:CheckBox runat="server" id="chkNonOperational" /></TD>
				</TR>
				<TR>
				<TD class="tdgenap" style="width: 20%">Currency</TD>
				<TD class="tdganjil">
				<asp:DropDownList runat="server" id="ddlCurrency">
					<asp:ListItem>IDR</asp:ListItem>
					<asp:ListItem>USD</asp:ListItem>
				</asp:DropDownList>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="20%">Amount</TD>
				<TD class="tdganjil"><font color="red">
				<asp:TextBox runat="server" id="txtAmount" CssClass="inptype">
				</asp:TextBox>
				&nbsp;*)</font></TD>
				</TR>
				<TR>
				<TD class="tdgenap" style="width: 20%">Description</TD>
				<TD class="tdganjil">
				<asp:TextBox id="txtDesc" runat="server" cssclass="inptype" MaxLength="100" Width="300px">-
				</asp:TextBox>
				<asp:RequiredFieldValidator id="Requiredfieldvalidator3" runat="server" Display="Dynamic" ErrorMessage="Please Fill Description" ControlToValidate="txtdesc">
				</asp:RequiredFieldValidator>
				<font color="red">&nbsp;*)</font></TD>
				</TR>
				</TABLE>
				<TABLE width="95%" align="center" border="0">
					<TR>
						<TD>
							<DIV align="right">
								<asp:imagebutton id="imgNext" runat="server" imageurl="../../Images/ButtonNext.gif" height="20"	width="100" alt="Next" PostBackUrl="AdvanceRequestNext.aspx"></asp:imagebutton>
								<asp:imagebutton id="imbReset" runat="server" imageurl="../../Images/ButtonReset.gif" causesvalidation="False" alt="Reset"></asp:imagebutton></DIV>
						</TD>
					</TR>
				</TABLE>
			</asp:panel>&nbsp;</form>
	</body>
</HTML>
