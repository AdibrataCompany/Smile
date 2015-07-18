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
				<INPUT id="hidCurrencyRateFrom" type="hidden" name="hidCurrencyRateFrom" runat="server">
			<asp:label id="lblMessage" runat="server" font-size="11px" font-name="Verdana" forecolor="#FF0000"></asp:label><BR>
			<asp:panel id="pnlReview" runat="server" Height="168px">
				<TABLE id="tblNextHeader" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR>
				<TD class="tdtopibirukiri" width="10" height="20">&nbsp;</TD>
				<TD class="tdtopibiru" align="center">PETTY CASH ADVANCE 
						REQUEST</TD>
				<TD class="tdtopibirukanan" width="10">&nbsp;</TD>
				</TR>
				</TABLE>
				<TABLE class="tablegrid" id="tbl" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
				<tr>
					<TD class="tdgenap" width="20%">Employee Name</TD>
					<TD class="tdganjil" width="30%">
					<asp:Label id="lblEmployeeName1" runat="server">xxxxx20xxxxx</asp:Label>
					</TD>
					<TD class="tdgenap">Date</TD>
					<TD class="tdganjil" width="30%">
					<asp:Label id="lblDate1" runat="server">dd/mm/yyyy</asp:Label>
					</TD>
				</tr>
				<tr>
					<TD class="tdgenap" width="20%">Non Operational</TD>
					<TD class="tdganjil" width="30%">Yes</TD>
					<TD class="tdgenap">Currency</TD>
					<TD class="tdganjil" width="30%">
					<asp:Label id="lblCurrency1" runat="server">IDR</asp:Label>
					</TD>
				</tr>
				<tr>
					<TD class="tdgenap" width="20%">Amount</TD>
					<TD class="tdganjil" colspan="3">
					<asp:Label id="lblAmount1" runat="server">999,999,999.99</asp:Label>
					</TD>
				</tr>
				<tr>
					<TD class="tdgenap" width="20%">Description</TD>
					<TD class="tdganjil" colSpan="3">
					<asp:Label id="lblDesc0" runat="server">
					xxxxxxxxxx50xxxxxxxxxx</asp:Label>
					</TD>
				</tr>
				</TABLE>
					<table cellSpacing="1" cellPadding="3" width="95%" align="center" border="0" class="tablegrid">
						<TR>
						<TD class="tdjudulbiru" colspan="4">APPROVAL DETAIL</TD>
						</TR>
						<tr>
							<TD class="tdgenap" width="20%">Reason</TD>
							<TD class="tdganjil" width="30%">
							<asp:DropDownList runat="server" id="ddlReason">
								<asp:ListItem>Select One</asp:ListItem>
							</asp:DropDownList>
							</TD>
							<TD class="tdgenap" width="20%">Approved By</TD>
							<TD class="tdganjil" width="30%">
							<asp:DropDownList runat="server" id="ddlApprovedBy">
								<asp:ListItem>Select One</asp:ListItem>
							</asp:DropDownList>
							</TD>
						</tr>
						<tr>
							<TD class="tdgenap">Alternate User</TD>
							<TD class="tdganjil" colspan="3">
							<asp:DropDownList runat="server" id="ddlAlternateUser">
								<asp:ListItem>Select One</asp:ListItem>
							</asp:DropDownList>
							</TD>
						</tr>
						<tr>
							<TD class="tdgenap">Approval Recommendation</TD>
							<TD class="tdganjil" colspan="3">
							<asp:TextBox runat="server" id="txtAprRecomm" CssClass="inptype" TextMode="MultiLine" Width="380px" Height="40px">
							</asp:TextBox>
							</TD>
						</tr>
				</table>
				<asp:panel id="pnlSave" runat="server" HorizontalAlign="Left">
					<TABLE id="Table4" width="95%" align="center" border="0">
						<TR>
							<TD>
								<DIV align="right">
									<asp:imagebutton id="imgRequest" runat="server" imageurl="../../Images/ButtonRequest.gif" PostBackUrl="AdvanceRequest.aspx"></asp:imagebutton>
									<asp:imagebutton id="imbCancel" runat="server" imageurl="../../Images/ButtonCancel.gif" causesvalidation="False" PostBackUrl="AdvanceRequest.aspx"></asp:imagebutton></DIV>
							</TD>
						</TR>
					</TABLE>
				</asp:panel>
			</asp:panel>&nbsp;</form>
	</body>
</HTML>
