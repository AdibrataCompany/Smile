<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>MOUAdd</title>
		<meta name="GENERATOR" content="Microsoft Visual Studio .NET 7.1">
		<meta name="CODE_LANGUAGE" content="Visual Basic .NET 7.1">
		<meta name="vs_defaultClientScript" content="JavaScript">
		<meta name="vs_targetSchema" content="http://schemas.microsoft.com/intellisense/ie5">
		<LINK href="../Confins.css" type="text/css" rel="stylesheet">
		<script language="javascript">
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1)
			var ServerName = 'http://<%=Request.servervariables("SERVER_NAME")%>/';			
		</script>
		<SCRIPT src="../Elsa.js"></SCRIPT>
	</HEAD>
	<body MS_POSITIONING="GridLayout">
		<form id="Form1" method="post" runat="server">
			<asp:panel id="pnlAdd" runat="server">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
				<TR>
				<TD>
				<FONT color="red">
				<I>*) required field</I>
				</FONT>
				<asp:Label id="lblMessage" ForeColor="red" Runat="server">
				</asp:Label>
				</TD>
				</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0" align="center">
				<TR class="trtopi">
				<TD class="tdtopihijaukiri" width="10" height="20"></TD>
				<TD class="tdtopihijau" align="center">MOU 
							MAINTENANCE - ADD</TD>
				<TD class="tdtopihijaukanan" width="10"></TD>
				</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table8" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
				<TR>
				<TD class="tdgenap" width="25%">Customer Name</TD>
				<TD class="tdganjil" id="lblcustomerid" colspan="3">
				<asp:TextBox runat="server" id="txtCustName" CssClass="inptype" Width="250px">
				</asp:TextBox>
				&nbsp;<asp:Image runat="server" id="imgLookup" ImageUrl="../images/iconDetail.gif" />&nbsp;<FONT color="red">*)</FONT>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">
				<asp:Label id="lblMOUNO" runat="server" Width="80px">MOU No
				</asp:Label>
				</TD>
				<TD class="tdganjil" colspan="3">
				<asp:Label id="lblMOUNO1" runat="server" Width="80px">-
				</asp:Label>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">
				<DIV align="left">MOU Date</DIV>
				</TD>
				<TD class="tdganjil" colspan="3">
				<asp:TextBox runat="server" id="txtMouDate" CssClass="inptype" Width="100px">
				</asp:TextBox>
				&nbsp;<asp:Image runat="server" id="imgCalendar" ImageUrl="../images/iconCalendar.gif" />&nbsp;<FONT color="red">*)</FONT>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Expired Date</TD>
				<TD class="tdganjil" colspan="3">
				<asp:TextBox runat="server" id="txtExpiredDate" CssClass="inptype" Width="100px">
				</asp:TextBox>
				&nbsp;<asp:Image runat="server" id="imgCalendar2" ImageUrl="../images/iconCalendar.gif" />&nbsp;<FONT color="red">*)</FONT>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Reference No</TD>
				<TD class="tdganjil" colspan="3">
				<asp:TextBox id="txtReffNo" runat="server" CssClass="inptype" Width="200px">
				</asp:TextBox>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Is Plafond</TD>
				<TD class="tdganjil" colspan="3">
				<asp:CheckBox id="chkIsPlafon" runat="server" Checked="True" />
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Plafond Amount</TD>
				<TD class="tdganjil" colspan="3">
				<asp:TextBox id="txtPlafonAmount" runat="server" CssClass="inptype">0
				</asp:TextBox>
				&nbsp;<FONT color="red">*)</FONT>
				<asp:RequiredFieldValidator id="rfvPlafonAmount" runat="server" font-name="Verdana" font-size="11px" controltovalidate="txtPlafonAmount" errormessage="Please Fill Plafond Amount" display="Dynamic">
				</asp:RequiredFieldValidator>
				<asp:RangeValidator id="rgvPlafonAmount" runat="server" ControlToValidate="txtPlafonAmount" Type="Double" MinimumValue="0" ErrorMessage="Plafond Amount must be &gt; 0 !" Display="Dynamic" MaximumValue="99999999999999999">
				</asp:RangeValidator>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Status </TD>
				<TD class="tdganjil" colspan="3">
				<asp:Label id="lblStatus" runat="server">Request</asp:Label>
				</TD>
				</TR>
				<TR class="tdjudulhijau">
				<TD colspan="4">OTHER INFO</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="20%">Currency</TD>
				<TD class="tdganjil" colspan="3">
				<asp:DropDownList id="cboCurrency" runat="server">
					<asp:ListItem Value="IDR">IDR</asp:ListItem>
					<asp:ListItem Value="USD">USD</asp:ListItem>
				</asp:DropDownList>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Interest Type</TD>
				<TD class="tdganjil" colspan="3">
				<asp:DropDownList id="cboInterestType" runat="server">
					<asp:ListItem Value="0">Select One</asp:ListItem>
					<asp:ListItem Value="FX">Fixed Rate</asp:ListItem>
					<asp:ListItem Value="FL">Floating Rate</asp:ListItem>
				</asp:DropDownList>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Installment Scheme</TD>
				<TD class="tdganjil" colspan="3">
				<asp:DropDownList id="cboInstScheme" runat="server">
					<asp:ListItem Value="0">Select One</asp:ListItem>
					<asp:ListItem Value="RF">Regular Fixed Installment Scheme
					</asp:ListItem>
					<asp:ListItem Value="IR">Irregular Installment
					</asp:ListItem>
					<asp:ListItem Value="ST">Step Up/Step Down</asp:ListItem>
					<asp:ListItem Value="EP">Even Principle</asp:ListItem>
				</asp:DropDownList>
				</TD>
				</TR>
				<TR>
				<td class="tdgenap">First Installment</td>
				<td class="tdganjil" colspan="3">
				<asp:DropDownList id="cboFirstInstallment" runat="server">
					<asp:ListItem Value="0">Select One</asp:ListItem>
					<asp:ListItem Value="AD">Advance</asp:ListItem>
					<asp:ListItem Value="AR">Arrear</asp:ListItem>
				</asp:DropDownList>
				</td>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Down Payment (%)</TD>
				<TD class="tdganjil" colspan="3">
				<asp:TextBox id="txtDownPayment" runat="server" CssClass="inptype">
				</asp:TextBox>
				<asp:RangeValidator id="rgvDowntPayment" runat="server" ControlToValidate="txtDownPayment" Type="Double" MinimumValue="0" ErrorMessage="Down Payment Must Be In Percentage - Max 100%" Display="Dynamic" MaximumValue="100">
				</asp:RangeValidator>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Tenor</TD>
				<TD class="tdganjil" colspan="3">
				<asp:TextBox id="txtTenor" runat="server" CssClass="inptype">
				</asp:TextBox>
				<asp:RangeValidator id="rgvTenor" runat="server" ControlToValidate="txtTenor" Type="Integer" MinimumValue="0" ErrorMessage="Tenor Must Be Numeric" Display="Dynamic" MaximumValue="999">
				</asp:RangeValidator>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Effective Rate (%)</TD>
				<TD class="tdganjil" colspan="3">
				<asp:TextBox id="txtEffectiveRate" runat="server" CssClass="inptype">
				</asp:TextBox>
				<asp:RangeValidator id="rgvEffectiveRate" runat="server" ControlToValidate="txtEffectiveRate" Type="Double" MinimumValue="0" ErrorMessage="Effective Rate Must Be In Percentage - Max 100% " Display="Dynamic" MaximumValue="100">
				</asp:RangeValidator>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Installment Amount</TD>
				<TD class="tdganjil" colspan="3">
				<asp:TextBox id="txtInstallmentAmount" runat="server" CssClass="inptype">
				</asp:TextBox>
				<asp:RangeValidator id="rgvInstallmentAmount" runat="server" ControlToValidate="txtInstallmentAmount" Type="Double" MinimumValue="0" ErrorMessage="Installment Amount must be &gt; 0 !" Display="Dynamic" MaximumValue="99999999999999999">
				</asp:RangeValidator>
				</TD>
				</TR>
				<TR class="tdjudulhijau">
				<TD colspan="4">APPROVAL DETAIL</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Reason</TD>
				<TD class="tdganjil">
				<asp:DropDownList runat="server" id="DropDownList1">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</TD>
				<TD class="tdgenap">Approved By</TD>
				<TD class="tdganjil">
				<asp:DropDownList runat="server" id="DropDownList2">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Alternate User</TD>
				<TD class="tdganjil" colspan="3">
				<asp:DropDownList runat="server" id="DropDownList3">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Approval Recommendation</TD>
				<TD class="tdganjil" colspan="3">
				<asp:TextBox runat="server" id="txtAprRecomm" CssClass="inptype" TextMode="MultiLine" Width="380px" Height="40px">
				</asp:TextBox>
				</TD>
				</TR>
				</TABLE>
				<TABLE id="Table9" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD align="right">
							<asp:imagebutton id="btnRequestAdd" runat="server" imageurl="../Images/ButtonRequest.gif" causesvalidation="True" PostBackUrl="MouList.aspx"></asp:imagebutton>
							<asp:imagebutton id="btnCancelAdd" runat="server" imageurl="../Images/ButtonCancel.gif" causesvalidation="False" PostBackUrl="MouList.aspx"></asp:imagebutton></TD>
					</TR>
				</TABLE>
			</asp:panel>
		</form>
	</body>
</HTML>
