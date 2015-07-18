<%@ Page Language="vb" AutoEventWireup="false" Codebehind="RptPettyCashReimburseViewer.aspx.vb" Inherits="AdIns.Application.Eloan.Web.AccMnt.RptPettyCashReimburseViewer"%>
<%@ Register TagPrefix="cr" Namespace="CrystalDecisions.Web" Assembly="CrystalDecisions.Web, Version=11.0.3300.0, Culture=neutral, PublicKeyToken=692fbea5521e1304" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>RptPettyCashReimburseViewer</title>
		<meta name="GENERATOR" content="Microsoft Visual Studio .NET 7.1">
		<meta name="CODE_LANGUAGE" content="Visual Basic .NET 7.1">
		<meta name="vs_defaultClientScript" content="JavaScript">
		<meta name="vs_targetSchema" content="http://schemas.microsoft.com/intellisense/ie5">
	</HEAD>
	<body MS_POSITIONING="GridLayout">
		<form id="Form1" method="post" runat="server">
			<asp:ImageButton id="imbBack" runat="server" ImageUrl="../../../../images/ButtonBack.gif" alt="Back"></asp:ImageButton>
			<CR:CrystalReportViewer id="CRVRptPCReimburse" runat="server" HasDrillUpButton="false" HasToggleGroupTreeButton="false"
				HasPrintButton="true" HasExportButton="True" enableddrilldown="false" displaygrouptree="false" hassearchbutton="false"></CR:CrystalReportViewer>
		</form>
	</body>
</HTML>
