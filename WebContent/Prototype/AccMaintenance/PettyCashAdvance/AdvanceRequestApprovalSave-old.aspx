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
				<TR>
				<TD class="tdgenap" width="20%">Employee Name</TD>
				<TD class="tdganjil" width="30%">
				<asp:Label id="lblEmployeeName" runat="server">xxxxx20xxxxx</asp:Label>
				</TD>
				<TD class="tdgenap" colspan="2">Date</TD>
				<TD class="tdganjil" width="30%">
				<asp:Label id="lblDate" runat="server">dd/mm/yyyy</asp:Label>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="20%">Bank Account</TD>
				<TD class="tdganjil">
				<asp:Label id="lblBankAccount" runat="server">xxxxx30xxxxx</asp:Label>
				</TD>
				<TD class="tdgenap" style="HEIGHT: 15px; width: 20%;">Amount</TD>
				<TD class="tdganjil" style="HEIGHT: 15px; width: 5%;">
				<asp:Label id="lblCurrency" runat="server">IDR</asp:Label>
				</TD>
				<TD class="tdganjil" style="HEIGHT: 15px" width="30%" align="right">
				<asp:Label id="lblAmount" runat="server">999,999,999.99</asp:Label>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="20%">Funding By HO</TD>
				<TD class="tdganjil" colSpan="4">Yes</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="20%">Description</TD>
				<TD class="tdganjil" colSpan="4">
				<asp:Label id="lblDesc" runat="server">xxxxxxxxxx50xxxxxxxxxx</asp:Label>
				</TD>
				</TR>
				</TABLE>
				<asp:Panel id="pnlBilyet" runat="server" HorizontalAlign="Left">
					<TABLE class="tablegrid" id="tbl" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
					<TR class="tdjudulbiru" height="25">
					<TD>BILYET GIRO ENTRY</TD>
					</TR>
					</TABLE>
					<TABLE class="tablegrid" id="tblBilyet" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
					<TR>
					<TD class="tdgenap" width="20%">Bilyet Giro No</TD>
					<TD class="tdganjil">xxxxx20xxxxx</TD>
					<TD class="tdgenap" width="20%">Due Date</TD>
					<TD class="tdganjil" width="30%">dd/mm/yyyy</TD>
					</TR>
					</TABLE>
				</asp:Panel>
				<table cellSpacing="1" cellPadding="3" width="95%" align="center" border="0" class="tablegrid">
					<TR>
					<TD class="tdjudulbiru" colspan="2" style="width: 50%">APPROVAL DETAIL</TD>
					</TR>
					<tr>
						<TD class="tdgenap" style="width: 20%">Approval</TD>
						<TD class="tdganjil" width="30%" style="width: 50%">
						<asp:DropDownList runat="server" id="ddlApproval">
							<asp:ListItem>Approve</asp:ListItem>
							<asp:ListItem>Reject</asp:ListItem>
						</asp:DropDownList>
						</TD>
					</tr>
					<tr>
						<TD class="tdgenap" style="width: 20%">Approved Amount</TD>
						<TD class="tdganjil">
						<asp:TextBox runat="server" id="txtApproveAmount" CssClass="inptype">
						</asp:TextBox>
						</TD>
					</tr>
					<tr>
						<TD class="tdgenap" style="width: 20%">Is Final</TD>
						<TD class="tdganjil">
						<asp:RadioButtonList runat="server" id="rdoIsFinal" RepeatDirection="Horizontal" AutoPostBack="true">
							<asp:ListItem Selected="True">Yes</asp:ListItem>
							<asp:ListItem>No</asp:ListItem>
						</asp:RadioButtonList>
						</TD>
					</tr>
					<% If rdoIsFinal.SelectedValue = "No" Then %><tr>
						<TD class="tdgenap" style="width: 20%">Next User Approval</TD>
						<TD class="tdganjil">
						<asp:TextBox runat="server" id="txtEmployeeName" CssClass="inptype" Width="200px">
						</asp:TextBox>
						&nbsp;<asp:Image runat="server" id="imgLookup" ImageUrl="../../images/iconDetail.gif" /></TD>
					</tr>
					<% End If %><tr>
						<TD class="tdgenap" style="width: 20%">Approval Recommendation</TD>
						<TD class="tdganjil">
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
									<asp:imagebutton id="imgSave" runat="server" imageurl="../../Images/ButtonSave.gif" height="20" width="100" alt="Save" PostBackUrl="AdvanceRequestApproval.aspx"></asp:imagebutton>
									<asp:imagebutton id="imbCancel" runat="server" imageurl="../../Images/ButtonCancel.gif" causesvalidation="False" alt="Cancel" PostBackUrl="AdvanceRequestApproval.aspx"></asp:imagebutton></DIV>
							</TD>
						</TR>
					</TABLE>
				</asp:panel>
			</asp:panel>&nbsp;</form>
	</body>
</HTML>
