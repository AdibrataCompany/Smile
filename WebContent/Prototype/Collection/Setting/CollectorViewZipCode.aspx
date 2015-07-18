<%@ Register TagPrefix="uc1" TagName="UcContactPerson" Src="../../UserController/UcContactPerson.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcCompanyAdress" Src="../../UserController/UcCompanyAdress.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcFindEmployee" Src="../../UserController/UcFindEmployee.ascx" %>
<%@ Page Language="vb" AutoEventWireup="false" Codebehind="CollectorViewZipCode.aspx.vb" Inherits="AdIns.Application.Eloan.Web.Collection.CollectorViewZipCode" %>
<%@ Register TagPrefix="uc1" TagName="UcBranch" Src="../../UserController/UcBranch.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcLookupEmployee" Src="../../UserController/UcLookupEmployee.ascx" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>CollGroupResult</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../../include/collection.css" type="text/css" rel="stylesheet">
		<SCRIPT src="../../Elsa.js"></SCRIPT>
		<script language="javascript">
			function fConfirm() {
				if (window.confirm("Are you sure want to delete this record?")) 
					return true;
				else
					return false;
			}
			function fback() {
					history.go(-1);
					return false;
			}	
			
			function OpenViewCollGroup(pCGID){
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1);
			window.open('http://<%=Request.servervariables("SERVER_NAME")%>/' + App + '/Collection/Setting/CollectionGroupView.aspx?CGID=' + pCGID , 'InsuranceCo', 'left=15, top=10, width=985, height=450, menubar=0, scrollbars=yes');
			}
		</script>
	</HEAD>
	<body MS_POSITIONING="GridLayout">
		<form id="Form1" method="post" runat="server">
			<asp:label id="lblMessage" style="Z-INDEX: 101; LEFT: 24px; POSITION: absolute; TOP: 0px" runat="server"
				forecolor="Red" font-name="Verdana" font-size="11px"></asp:label><br>
			<br>
			<asp:panel id="pnlList" style="Z-INDEX: 101" Width="99.69%" Runat="server">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">VIEW ZIP CODE</TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" align="center" border="0">
					<TR class="tdganjil">
						<TD class="tdgenap" width="25%">Collector
						</TD>
						<TD class="tdganjil">
							<asp:Label id="lblCollectorName" runat="server" Width="352px"></asp:Label></TD>
					</TR>
				</TABLE>
				<BR>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">VIEW ZIP CODE</TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR align="center">
						<TD width="100%">
							<asp:DataGrid id="dtgZipCode" runat="server" Width="100%" AutoGenerateColumns="False" AllowSorting="True"
								OnSortCommand="Sorting" HorizontalAlign="Left">
								<AlternatingItemStyle CssClass="tdgenap"></AlternatingItemStyle>
								<ItemStyle CssClass="tdganjilKegiatan"></ItemStyle>
								<HeaderStyle Font-Bold="True" HorizontalAlign="Center" CssClass="tdjudul"></HeaderStyle>
								<Columns>
									<asp:BoundColumn DataField="ZIPCODE" SortExpression="ZIPCODE" HeaderText="ZIP CODE" HeaderStyle-HorizontalAlign="Left"></asp:BoundColumn>
									<asp:BoundColumn DataField="KELURAHAN" SortExpression="KELURAHAN" HeaderText="KELURAHAN" HeaderStyle-HorizontalAlign="Left"></asp:BoundColumn>
									<asp:BoundColumn DataField="KECAMATAN" SortExpression="KECAMATAN" HeaderText="KECAMATAN" HeaderStyle-HorizontalAlign="Left"></asp:BoundColumn>
									<asp:BoundColumn DataField="CITY" SortExpression="CITY" HeaderText="CITY" HeaderStyle-HorizontalAlign="Left"></asp:BoundColumn>
								</Columns>
							</asp:DataGrid></TD>
					</TR>
				</TABLE>
				<TABLE style="HEIGHT: 53px" height="53" cellSpacing="0" cellPadding="0" width="95%" align="center"
					border="0">
					<TR>
						<TD align="center" width="30">
							<asp:imagebutton id="imbFirstPage" runat="server" CommandName="First" OnCommand="NavigationLink_Click"
								CausesValidation="False" ImageUrl="../../Images/butkiri1.gif"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbPrevPage" runat="server" CommandName="Prev" OnCommand="NavigationLink_Click"
								CausesValidation="False" ImageUrl="../../Images/butkiri.gif"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbNextPage" runat="server" CommandName="Next" OnCommand="NavigationLink_Click"
								CausesValidation="False" ImageUrl="../../Images/butkanan.gif"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbLastPage" runat="server" CommandName="Last" OnCommand="NavigationLink_Click"
								CausesValidation="False" ImageUrl="../../Images/butkanan1.gif"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD style="WIDTH: 247px" align="center" width="247"><FONT face="Verdana" size="2">Page&nbsp;
							</FONT>
							<asp:TextBox id="txtGoPage" runat="server" Width="34px" CssClass="InpType">1</asp:TextBox>
							<asp:imagebutton id="imbGoPage" runat="server" ImageUrl="..\..\Images\butgo.gif" EnableViewState="False"
								ImageAlign="AbsBottom"></asp:imagebutton>
							<asp:RangeValidator id="rgvGo" runat="server" ControlToValidate="txtGoPage" MinimumValue="0" ErrorMessage="Page is not valid"
								Font-Size="Smaller" Font-Names="Verdana"></asp:RangeValidator><FONT face="Verdana" size="2">&nbsp;&nbsp;
							</FONT>
						</TD>
						<TD align="right"><FONT color="#999999"><FONT face="Verdana" size="2">Page&nbsp; </FONT>
								<asp:label id="lblPage" runat="server" Font-Size="Smaller" Font-Names="Verdana"></asp:label><FONT face="Verdana" size="2">&nbsp;of
								</FONT>
								<asp:label id="lblTotPage" runat="server" Font-Size="Smaller" Font-Names="Verdana"></asp:label><FONT face="Verdana" size="2">, 
									Total&nbsp; </FONT>
								<asp:label id="lblTotRec" runat="server" Font-Size="Smaller"></asp:label>&nbsp;<FONT face="Verdana" size="2">record(s)</FONT></FONT></TD>
					</TR>
				</TABLE>
				<TABLE style="HEIGHT: 25px" height="25" cellSpacing="0" cellPadding="0" width="95%" align="center"
					border="0" runat="server">
					<TR>
						<TD style="WIDTH: 160px" align="left"></TD>
						<TD align="right"><FONT face="Verdana">
								<asp:ImageButton id="imbBack" runat="server" ImageUrl="../../images/buttonback.gif"></asp:ImageButton></FONT></TD>
					</TR>
				</TABLE>
			</asp:panel>
			<P>&nbsp;</P>
			</TABLE></form>
	</body>
</HTML>
