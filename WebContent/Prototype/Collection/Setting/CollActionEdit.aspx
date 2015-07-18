<%@ Page Language="vb" AutoEventWireup="false" Codebehind="CollAction.aspx.vb" Inherits="AdIns.Application.Eloan.Web.Collection.CollAction" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>ActionResult</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../../Confins.css" type="text/css" rel="stylesheet">
	</HEAD>
	<body>
		<form id="Form1" method="post" runat="server">
	
				<TABLE cellSpacing="3" cellPadding="0" width="95%" border="0">
					<TR>
						<TD align="left">
							<asp:label id="Label1"  runat="server" forecolor="Red"
								font-name="Verdana" Font-Names="Verdana" Font-Italic="True">*) required field</asp:label></TD>
					</TR>
				</TABLE>
					<table width="95%" border="0" cellspacing="0" cellpadding="0" align="center">
		    <tr class="trtopiungu"> 
		      <td width="10" height="20" class="tdtopiungu">&nbsp;</td>
		      <td align="center" class="tdtopiungu">ACTION - EDIT</td>
		      <td width="10" class="tdtopiungukanan">&nbsp;</td>
		    </tr>
		  </table>
				<TABLE class="tablegrid" id="Table7" cellSpacing="1" cellPadding="2" width="95%" align="center"
					border="0">
					<TR class="tdganjil">
						<TD class="tdgenap" width="20%">Action ID</TD>
						<TD class="tdganjil">
							<asp:Label id="lblActionID" runat="server" MaxLength="10" Text="01"></asp:Label>
							<asp:label id="lblrequired" runat="server" forecolor="Red" Font-Italic="True" Font-Names="Verdana"
									font-name="Verdana" font-size="11px">*)</asp:label>
							</TD>
					</TR>
					<TR class="tdganjil">
						<TD class="tdgenap" width="25%">Action Name</TD>
						<TD class="tdganjil">
							<asp:TextBox id="txtActionName" runat="server" CssClass="InpType" MaxLength="100" Text="Telpone"></asp:TextBox>
							<DIV style="DISPLAY: inline; WIDTH: 16px; COLOR: red; HEIGHT: 15px" ms_positioning="FlowLayout">*)</DIV>
							</TD>
					</TR>
				</TABLE>
				<TABLE id="TableAddSave" style="HEIGHT: 19px" cellSpacing="0" cellPadding="0" width="95%"
					align="center" border="0">
					<TR>
						<TD align="right">&nbsp;&nbsp;
							<asp:ImageButton id="imbSave" runat="server" ImageUrl="../../Images/ButtonSave.gif"></asp:ImageButton>&nbsp;
							<asp:ImageButton id="imgCancel" runat="server" ImageUrl="../../Images/ButtonCancel.gif" CausesValidation="False"></asp:ImageButton>&nbsp;
						</TD>
					</TR>
				</TABLE>
			</form>
	</body>
</HTML>
