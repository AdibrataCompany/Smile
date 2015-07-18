<%@ Page Language="vb" AutoEventWireup="false" Codebehind="CollResult.aspx.vb" Inherits="AdIns.Application.Eloan.Web.Collection.CollResult" %>
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
			<br>
		<table width="95%" border="0" cellspacing="0" cellpadding="0" align="center">
		    <tr class="trtopiungu"> 
		      <td width="10" height="20" class="tdtopiungu">&nbsp;</td>
		      <td align="center" class="tdtopiungu">RESULT - ADD</td>
		      <td width="10" class="tdtopiungukanan">&nbsp;</td>
		    </tr>
		  </table>
				<TABLE class="tablegrid"  cellSpacing="1" cellPadding="2" width="95%" align="center"
					border="0">
					<TR>
						<TD class="tdgenap" style="HEIGHT: 27px" width="25%">Action ID</TD>
						<TD class="tdganjil" style="HEIGHT: 27px">
							Telepon</TD>
					</TR>
					<TR class="tdganjil">
						<TD class="tdgenap" style="HEIGHT: 27px" width="25%">Result ID</TD>
						<TD class="tdganjil" style="HEIGHT: 27px">
							<asp:TextBox id="txtResultID" runat="server" Width="100px" CssClass="InpType" MaxLength="10"></asp:TextBox>
							<DIV style="DISPLAY: inline; WIDTH: 16px; COLOR: red; HEIGHT: 15px" ms_positioning="FlowLayout">
							<asp:label id="lblrequired" runat="server" forecolor="Red" Font-Italic="True" Font-Names="Verdana"
									font-name="Verdana" font-size="11px">*)</asp:label>
							</DIV>
							</TD>
					</TR>
					<TR class="tdganjil">
						<TD class="tdgenap" width="25%">Result Name</TD>
						<TD class="tdganjil" style="HEIGHT: 22px">
							<asp:TextBox id="txtResultName" runat="server" Width="291px" CssClass="InpType" MaxLength="100"></asp:TextBox>
							<DIV style="DISPLAY: inline; WIDTH: 16px; COLOR: red; HEIGHT: 15px" ms_positioning="FlowLayout">*)</DIV>
							</TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="25%">Result Category</TD>
						<TD class="tdganjil" style="HEIGHT: 22px">
							<asp:DropDownList id="cboResultCategory" runat="server">
							<asp:ListItem Text="Result" Value="Result"></asp:ListItem>
							</asp:DropDownList></TD>
					</TR>
				</TABLE>
				<TABLE  style="HEIGHT: 19px" cellSpacing="0" cellPadding="0" width="95%"
					align="center" border="0">
					<TR>
						<TD align="right">&nbsp;&nbsp;
							<asp:ImageButton id="imbSave" runat="server" ImageUrl="..\..\Images\ButtonSave.gif"></asp:ImageButton>&nbsp;
							<asp:ImageButton id="imgCancel" runat="server" CausesValidation="False" ImageUrl="..\..\Images\ButtonCancel.gif"></asp:ImageButton>&nbsp;
							<A href="javascript:history.back();"></A>
						</TD>
					</TR>
				</TABLE>
		</form>
	</body>
</HTML>
