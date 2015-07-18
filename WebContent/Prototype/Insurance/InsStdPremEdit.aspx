<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled 1</title>
<link rel="stylesheet" type="text/css" href="../Confins.css" />
</head>

<body>

<form id="form1" runat="server">
<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
						<TR class="trtopiabu">
							<TD class="tdtopiabukiri" width="10" height="20">&nbsp;</TD>
							<TD class="tdtopiabu" align="center">INSURANCE STANDARD RATE&nbsp;SETTING&nbsp;- ADD
						</TD>
							<TD class="tdtopiabukanan" width="10">&nbsp;</TD>
						</TR>
					</TABLE>
					<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" border="0">
						<TR>
							<TD class="tdgenap" width="23%">Branch Id</TD>
							<TD class="tdganjil" width="24.5%">
								<asp:label id="lblBranchID" runat="server" Text="xxx"></asp:label></TD>
							<TD class="tdgenap" width="23%">Branch Name</TD>
							<TD class="tdganjil" width="24.5%">
								<asp:label id="lblBranchName" runat="server" Text="xxxxxxx"></asp:label></TD>
						</TR>
						<TR>
							<TD class="tdgenap" style="HEIGHT: 16px" colSpan="1">Ins. Asset Type</TD>
							<TD class="tdganjil" style="HEIGHT: 16px" colSpan="3">
								<asp:Label id="LblIDUsage2" runat="server" Visible="true" text="xxxxxx"></asp:Label></TD>
						</TR>
						<TR>
							<TD class="tdgenap" colSpan="1">Asset Usage</TD>
							<TD class="tdganjil" colSpan="3">
								<asp:Label id="LblIDUsage" runat="server" Visible="true" text="xxxxxx"></asp:Label></TD>
						</TR>
						<TR>
							<TD class="tdgenap" colSpan="1">Asset New/Used</TD>
							<TD class="tdganjil" colSpan="3">
								<asp:Label id="LblIDUsage0" runat="server" Visible="true" text="xxxxxx"></asp:Label></TD>
						</TR>
						<TR>
							<TD class="tdgenap" colSpan="1">Coverage Type</TD>
							<TD class="tdganjil" colSpan="3">
								<asp:Label id="LblIDUsage1" runat="server" Visible="true" text="xxxxxx"></asp:Label></TD>
						</TR>
						<TR>
							<TD class="tdgenap" colSpan="1">Year Num</TD>
							<TD class="tdganjil" colSpan="3">
								<asp:Label id="LblIDUsage3" runat="server" Visible="true" text="xx"></asp:Label></TD>
						</TR>
						<TR>
							<TD class="tdgenap" colSpan="1">Rate</TD>
							<TD class="tdganjil" colSpan="3">
								<asp:textbox id="txtStandardRate" runat="server" cssclass="inptype" maxlength="9" columns="10"></asp:textbox>%
								<FONT color="red">*)</FONT> &nbsp;
							</TD>
						</TR>
						<TR>
							<TD class="tdgenap" colSpan="1">SRCC Rate</TD>
							<TD class="tdganjil" colSpan="3">
								<asp:textbox id="txtSRCCRate" runat="server" cssclass="inptype" maxlength="9" columns="10"></asp:textbox>%
								<FONT color="red">*) </FONT>
								&nbsp;</TD>
						</TR>
						<TR>
							<TD class="tdgenap" colSpan="1">Flood Rate</TD>
							<TD class="tdganjil" colSpan="3">
								<asp:textbox id="txtFloodRate" runat="server" cssclass="inptype" maxlength="9" columns="10"></asp:textbox>%<FONT color="#ff0000">
									<FONT color="red">*) </FONT></FONT>
								&nbsp;</TD>
						</TR>
						<TR>
							<TD class="tdgenap" colSpan="1">Sum Insured Percentage</TD>
							<TD class="tdganjil" colSpan="3">
								<asp:textbox id="txtSumIns" runat="server" cssclass="inptype" maxlength="9" columns="10"></asp:textbox>%
								<FONT color="red">*) </FONT>
																&nbsp;</TD>
						</TR>
					</TABLE>
					<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
						<TR>
							<TD align="right">
								<asp:imagebutton id="imbSave" runat="server" imageurl="../images/ButtonSave.gif" PostBackUrl="InsStdPrem.aspx"></asp:imagebutton>
								<asp:imagebutton id="imbCancel" runat="server" imageurl="../images/ButtonCancel.gif" causesvalidation="False" PostBackUrl="InsStdPrem.aspx"></asp:imagebutton></TD>
						</TR>
					</TABLE>

</form>

</body>

</html>
