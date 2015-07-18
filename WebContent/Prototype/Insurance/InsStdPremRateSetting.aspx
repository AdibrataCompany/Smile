<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>PremToCustRateCust</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<script language="JavaScript" type="text/JavaScript">
			<!--
			function MM_openBrWindow(theURL,winName,features) { //v2.0
			  window.open(theURL,winName,features);
			}
			//-->
			</script>

				<link rel="stylesheet" type="text/css" href="../Confins.css">
				</HEAD>
	<body ms_positioning="GridLayout">
		<form id="Form1" method="post" runat="server">
			<table cellSpacing="0" cellPadding="0" width="95%" border="0">
				<tr>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;
						</td>
				</tr>
			</table>
			<asp:panel id="pnlTop" runat="server" width="100%">
				<asp:Panel id="pnlList" runat="server" width="100%" horizontalalign="center">
					<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
					<TR class="trtopiabu">
					<TD class="tdtopiabukiri" width="10" height="20">&nbsp;</TD>
					<TD class="tdtopiabu" align="center">INSURANCE STANDARD RATE&nbsp;SETTING</TD>
					<TD class="tdtopiabukanan" width="10">&nbsp;</TD>
					</TR>
					</TABLE>
					<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" border="0">
					<TR>
					<TD class="tdgenap" width="25%">Branch</TD>
					<TD class="tdganjil">Jakarta Electronic</TD>
					</TR>
					<TR>
					<TD class="tdgenap" width="25%">Copy Settin<span class="tdgenap">g</span> From Branch</TD>
					<TD class="tdganjil">
					<asp:TextBox runat="server" id="TextBox1" CssClass="inptype">
					</asp:TextBox>
					<a href="javascript:;" onClick="MM_openBrWindow('../Lookup/InsCoBranchLookup.htm','InsCoBranch','scrollbars=yes,width=900,height=500')">
					<img src="../Images/IconDetail.gif" width="15" height="15" border="0"></img></a></img>
					<asp:ImageButton id="ImgCopyButton" runat="server" ImageUrl="../images/ButtonCopy.gif" CausesValidation="False" />
					</TD>
					</TR>
					<tr>
						<td width="25%" class="tdgenap">% Cost From Main&nbsp; Premi 
						Customer</td>
						<td class="tdganjil">
						<input name="textfield3232" type="text" class="inptype" size="5">
						<font color="red">*)</font> </input></td>
					</tr>
					<tr>
						<td width="25%" class="tdgenap">% Cost From SRCC 
						Customer</td>
						<td class="tdganjil">
						<input name="textfield3232" type="text" class="inptype" size="5">
						<font color="red">*)</font> </input></td>
					</tr>
					<tr>
						<td width="25%" class="tdgenap">% Cost From Flood 
						Customer</td>
						<td class="tdganjil">
						<input name="textfield3232" type="text" class="inptype" size="5">
						<font color="red">*)</font> </input></td>
					</tr>
					<tr>
						<td width="25%" class="tdgenap">% Cost From TPL 
						Customer</td>
						<td class="tdganjil">
						<input name="textfield3232" type="text" class="inptype" size="5">
						<font color="red">*)</font> </input></td>
					</tr>
					</TABLE>
					<TABLE cellSpacing="3" cellPadding="1" width="95%" border="0">
					<TR>
					<TD align="left"></TD>
					<TD align="right">
					<asp:ImageButton id="imbAdd" runat="server" imageurl="../images/ButtonSave.gif" causesvalidation="False" PostBackUrl="InsuranceStandardPremium_New.aspx" />
					<asp:ImageButton id="imbBack" runat="server" imageurl="../images/ButtonCancel.gif" causesvalidation="False" PostBackUrl="InsuranceStandardPremium_New.aspx" />
					</TD>
					</TR>
					</TABLE>
					</BR>
				</asp:Panel>
							</asp:panel></form>
	</body>
</HTML>
