<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>Receipt Form</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../../Confins.css" type="text/css" rel="stylesheet">
		<SCRIPT src="../../Elsa.js"></SCRIPT>
		<script type="text/javascript">
		function OpenDetail(pType,ID,pStyle){ 
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1);
			window.open('http://<%=Request.servervariables("SERVER_NAME")%>:<%=Request.servervariables("SERVER_PORT")%>/' + App + '/AccMnt/Setting/ReceiptFormDetail.aspx?Style=' + pStyle + '&Type=' + pType + '&IdNo=' + ID, 'UserLookup', 'left=0, top=0, width=700, height=600, menubar=0, scrollbars=yes');
			}
		</script>
	</HEAD>
	<body vLink="blue" aLink="black" link="blue">
		<form id="Form2" method="post" runat="server">
			&nbsp;
			<asp:label id="lblMessage" runat="server" font-size="11px" font-name="Verdana" forecolor="Red"></asp:label>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR class="trtopikuning">
				<TD class="tdtopibirukiri" width="10" height="20">&nbsp;</TD>
				<TD class="tdtopibiru" align="center">FORM CONTROL - RE-ASSIGN</TD>
				<TD class="tdtopibirukanan" width="10">&nbsp;</TD>
				</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
				<TR>
				<TD class="tdgenap" style="WIDTH: 20%">Branch</TD>
				<TD class="tdganjil">
				xxxxx20xxxxx</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Form Control No</TD>
				<TD class="tdganjil">
				xxxxx20xxxxx</TD>
				</TR>
				<tr>
					<TD class="tdgenap" width="25%">Last Assigned To</TD>
					<TD class="tdganjil">
					xxxxx20xxxxx</TD>
				</tr>
				<tr>
					<TD class="tdjudulbiru" width="25%" colspan="2">CURRENTLY 
					ASSIGNED</TD>
				</tr>
				<tr>
					<TD class="tdgenap" width="25%" style="height: 26px">Assigned To</TD>
					<TD class="tdganjil" style="height: 26px">
				<asp:TextBox id="txtEmployeeName" runat="server" cssclass="inptype" maxlength="30">
				</asp:TextBox>
				&nbsp;<asp:Image runat="server" id="imgEmpLookup" ImageUrl="../../images/iconDetail.gif" /><font color="red">&nbsp;</font></TD>
				</tr>
				<TR>
				<TD class="tdgenap" style="WIDTH: 20%">Assigned Date</TD>
				<TD class="tdganjil">
				dd-mm-yyyy</TD>
				</TR>
				<TR>
				<TD class="tdgenap" style="WIDTH: 20%">Status</TD>
				<TD class="tdganjil">
				Assign</TD>
				</TR>
				<TR>
				<TD class="tdgenap" style="WIDTH: 20%">Notes</TD>
				<TD class="tdganjil">
				<asp:TextBox runat="server" id="txtNotes" TextMode="MultiLine" CssClass="inptype" Width="250px" Height="40px">
				</asp:TextBox>
				</TD>
				</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<DIV align="right">
								<asp:imagebutton id="imbSave0" runat="server" width="100" height="20" imageurl="../../Images/ButtonSave.gif" PostBackUrl="ReceiptForm.aspx"></asp:imagebutton>
								<asp:imagebutton id="imbCancel" runat="server" imageurl="../../Images/ButtonCancel.gif" causesvalidation="False" PostBackUrl="ReceiptForm.aspx"></asp:imagebutton>								
							</DIV>
						</TD>
					</TR>
				</TABLE>
			</form>
	</body>
</HTML>
