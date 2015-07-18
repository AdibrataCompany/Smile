<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
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
			<asp:label id="lblMessage" runat="server" font-size="11px" font-name="Verdana" forecolor="#FF0000"></asp:label>
				<TABLE id="Table7" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR class="trtopibirukuning">
				<TD class="tdtopibirukiri" width="10" height="20">&nbsp;</TD>
				<TD class="tdtopibiru" align="center">PETTY CASH ADVANCE 
				RECONCILE</TD>
				<TD class="tdtopibirukanan" width="10">&nbsp;</TD>
				</TR>
				</TABLE>	
				<TABLE class="tablegrid" id="tbl" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
				<tr>
					<TD class="tdgenap" width="20%">Employee Name</TD>
					<TD class="tdganjil" width="30%">
					<asp:Label id="lblEmployeeName0" runat="server">xxxxx20xxxxx</asp:Label>
					</TD>
					<TD class="tdgenap" width="20%">Date</TD>
					<TD class="tdganjil" width="30%">
					<asp:Label id="lblDate0" runat="server">dd/mm/yyyy</asp:Label>
					</TD>
				</tr>
				<tr>
					<TD class="tdgenap" width="20%">Non Operational</TD>
					<TD class="tdganjil" width="30%" colspan="3" style="width: 60%">Yes</TD>
				</tr>
				<tr>
					<TD class="tdgenap" width="20%">Currency</TD>
					<TD class="tdganjil">
					<asp:Label id="lblCurrency0" runat="server">IDR</asp:Label>
					</TD>
					<TD class="tdgenap" style="HEIGHT: 15px; ">Amount</TD>
					<TD class="tdganjil" style="HEIGHT: 15px" width="30%" align="right">
					<asp:Label id="lblAmount0" runat="server">999,999,999.99</asp:Label>
					</TD>
				</tr>
				<TR>
				<TD class="tdgenap" width="20%">Description</TD>
				<TD class="tdganjil" colSpan="3">
				<asp:Label id="lblDesc" runat="server">xxxxxxxxxx50xxxxxxxxxx</asp:Label>
				</TD>
				</TR>
				</TABLE>
				<table cellSpacing="1" cellPadding="3" width="95%" align="center" border="0" class="tablegrid">
					<TR>
					<TD class="tdjudulbiru" colspan="4" style="width: 50%">APPROVAL DETAIL</TD>
					</TR>
					<tr>
						<TD class="tdgenap" width="20%">Reason</TD>
						<TD class="tdganjil" width="30%">xxxxx20xxxxx</TD>
						<TD class="tdgenap" width="20%">Approved By</TD>
						<TD class="tdganjil" width="30%">xxxxx20xxxxx</TD>
					</tr>
					<tr>
						<TD class="tdgenap">Alternate User</TD>
						<TD class="tdganjil" colspan="3">xxxxx20xxxxx</TD>
					</tr>
					<tr>
						<TD class="tdgenap">Approval Recommendation</TD>
						<TD class="tdganjil" colspan="3">
						<asp:TextBox runat="server" id="txtAprRecomm" CssClass="inptype" TextMode="MultiLine" Width="380px" Height="40px" Enabled="False">
						</asp:TextBox>
						</TD>
					</tr>
					<tr>
						<TD class="tdjudulbiru" colspan="4" style="width: 50%">TRANSFER DETAIL</TD>
					</tr>
					<tr>
						<td class="tdgenap" style="width: 20%">Request Branch</td>
						<td align="left" class="tdganjil" style="width: 30%">Palmerah</td>
						<td class="tdgenap" style="width: 20%">Total Amount Transfer</td>
						<td width="25%" class="tdganjil" align="right">999,999,999,999.99</td>
					</tr>
					<tr>
						<td class="tdgenap" style="width: 20%">Reference No</td>
						<td class="tdganjil" style="width: 30%">xxxxx20xxxxx&nbsp;</td>
						<td class="tdgenap" style="width: 20%">Value Date</td>
						<td width="25%" class="tdganjil">dd/mm/yyyy</td>
					</tr>
					<tr>
						<td class="tdgenap" style="width: 20%">Bank Account From</td>
						<td class="tdganjil">xxxxx20xxxxx&nbsp;</td>
						<td class="tdgenap">Bank Account To</td>
						<td class="tdganjil">xxxxx20xxxxx&nbsp;</td>
					</tr>
					<tr>
						<td class="tdgenap" style="width: 20%">Bilyet Giro No</td>
						<td class="tdganjil">xxxxx20xxxxx&nbsp;</td>
						<td class="tdgenap">Due Date</td>
						<td class="tdganjil">dd/mm/yyyy</td>
					</tr>
					<tr>
						<td class="tdgenap" style="width: 20%">Notes</td>
						<td class="tdganjil" colspan="3">
						<asp:TextBox runat="server" id="txtNotes0" CssClass="inptype" Width="450px" TextMode="MultiLine" Enabled="False">
						</asp:TextBox>
						</td>
					</tr>
				</table>
				<BR>
				<TABLE width="95%" align="center" border="0">
				<TR>
				<TD>
				<DIV align="right">
				<asp:ImageButton id="imbReconcile" runat="server" imageurl="../../Images/ButtonReconcile.gif" height="20" width="100" PostBackUrl="AdvanceRequestReconcileList.aspx" />
				<asp:ImageButton id="imbCancel" runat="server" imageurl="../../Images/ButtonCancel.gif" height="20" width="100" PostBackUrl="AdvanceRequestReconcileList.aspx" />
				</DIV>
				</TD>
				</TR>
				</TABLE>
			<br>
		</form>
	</body>
</HTML>
