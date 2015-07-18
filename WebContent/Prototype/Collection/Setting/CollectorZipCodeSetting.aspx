<%@ Register TagPrefix="uc1" TagName="UcBranchCollection" Src="../../UserController/UcBranchCollection.ascx" %>
<%@ Page Language="vb" AutoEventWireup="false" Codebehind="CollectorZipCodeSetting.aspx.vb" Inherits="AdIns.Application.Eloan.Web.Collection.CollectorZipCodeSetting" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>CollectorResult</title>
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
			function OpenViewCollectionGroup(pCGID){
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1);
			window.open('http://<%=Request.servervariables("SERVER_NAME")%>/' + App + '/Collection/Setting/CollectionGroupView.aspx?CGID=' + pCGID , 'CollectionGroupView', 'left=15, top=10, width=985, height=450, menubar=0, scrollbars=yes');
			}
			
			function OpenViewCollector(pCollID,pCGID){
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1);
			window.open('http://<%=Request.servervariables("SERVER_NAME")%>/' + App + '/Collection/Setting/CollectorView.aspx?CollectorID=' + pCollID + '&CGID=' + pCGID, 'CollectorView', 'left=15, top=10, width=900, height=350, menubar=0, scrollbars=yes');
			}
		</script>
	</HEAD>
	<body MS_POSITIONING="GridLayout">
		<form id="Form1" method="post" runat="server">
			<asp:label id="lblMessage" style="Z-INDEX: 100; LEFT: 24px; POSITION: absolute; TOP: 0px" runat="server"
				forecolor="Red" font-name="Verdana" font-size="11px"></asp:label><asp:panel id="PnlSearch" style="Z-INDEX: 102; LEFT: 8px; TOP: 8px" runat="server" Width="99.69%"
				Height="72px"><BR>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">ZIP CODE COLLECTOR ALLOCATION
						</TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" align="center" border="0">
					<TR class="tdganjil">
						<TD class="tdgenap" width="20%">Collection Group</TD>
						<TD class="tdganjil" width="80%">
							<uc1:UcBranchCollection id="UcCG" runat="server"></uc1:UcBranchCollection></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR align="right">
						<TD style="HEIGHT: 17px">
							<asp:ImageButton id="BtnSearch" runat="server" ImageUrl="../../Images/ButtonSearch.gif"></asp:ImageButton>&nbsp;
							<asp:ImageButton id="BtnReset" runat="server" ImageUrl="../../Images/ButtonReset.gif"></asp:ImageButton></TD>
					</TR>
				</TABLE>
			</asp:panel><asp:panel id="PnlSearchDetail" style="Z-INDEX: 102; LEFT: 8px; TOP: 0px" runat="server" Width="99.69%"
				Height="72px"><BR>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">ZIP CODE COLLECTOR ALLOCATION DEFAULT</TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" align="center" border="0">
					<TR>
						<TD class="tdgenap" width="15%">Collection Group Id</TD>
						<TD class="tdganjil" style="WIDTH: 260px" width="260">
							<asp:Label id="lblCGID" runat="server" Width="184px"></asp:Label></TD>
						<TD class="tdgenap" width="10%">Collection Group Name</TD>
						<TD class="tdganjil" width="30%">
							<asp:Label id="lblCGName" runat="server" Width="184px"></asp:Label></TD>
					</TR>
					<TR class="tdganjil">
						<TD class="tdgenap" width="15%">Search By</TD>
						<TD class="tdganjil" width="25%">
							<asp:DropDownList id="cboSearchBy" runat="server" Width="109px" Font-Names="Verdana">
								<asp:ListItem Value="0" Selected="True">Select One</asp:ListItem>
								<asp:ListItem Value="Kelurahan">Kelurahan</asp:ListItem>
								<asp:ListItem Value="Kecamatan">Kecamatan</asp:ListItem>
								<asp:ListItem Value="ZipCode">Zip Code</asp:ListItem>
							</asp:DropDownList>
							<asp:TextBox id="txtSearchByValue" runat="server" Width="88px" CssClass="InpType"></asp:TextBox></TD>
						<TD class="tdgenap" width="15%">Unallocated Zip Code</TD>
						<TD class="tdganjil" width="30%">
							<asp:CheckBox id="cbUnZipCode" runat="server"></asp:CheckBox></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR align="right">
						<TD>
							<asp:ImageButton id="BtnSearchDetail" runat="server" ImageUrl="../../Images/ButtonSearch.gif" CausesValidation="False"></asp:ImageButton>&nbsp;
							<asp:ImageButton id="BtnResetDetail" runat="server" ImageUrl="../../Images/ButtonReset.gif" CausesValidation="False"></asp:ImageButton></TD>
					</TR>
				</TABLE>
				<BR>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">ZIP CODE COLLECTOR ALLOCATION LISTING</TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" align="center" border="0">
					<TR class="tdganjil">
						<TD class="tdgenap" width="15%">Default Collector</TD>
						<TD class="tdganjil" width="25%">
							<asp:DropDownList id="cboDefaultCollector" runat="server" Font-Names="Verdana"></asp:DropDownList>
							<asp:Label id="lblDefaultCollector" runat="server" Visible="False" ForeColor="Red">Please Select Default Collector</asp:Label></TD>
						<TD class="tdgenap" width="15%">Default Criteria</TD>
						<TD class="tdganjil" width="30%">
							<asp:DropDownList id="cboCriteria" runat="server" Font-Names="Verdana">
								<asp:ListItem Value="All">All Zip Code</asp:ListItem>
								<asp:ListItem Value="UnZipCode">Unallocated Zip Code</asp:ListItem>
							</asp:DropDownList>&nbsp;of this page</TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR align="right">
						<TD>&nbsp;
							<asp:ImageButton id="imbApply" runat="server" ImageUrl="../../Images/Buttonapplydefault.gif"></asp:ImageButton></TD>
					</TR>
				</TABLE>
			</asp:panel><br>
			<asp:panel id="pnlList" style="Z-INDEX: 101; LEFT: 8px; TOP: 344px" Width="99.69%" Runat="server">
				<BR>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">ZIP CODE GROUP ALLOCATION LISTING</TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR align="center">
						<TD>
							<asp:DataGrid id="dtgCollZipCode" runat="server" Width="100%" CssClass="tablegrid" cellspacing="1"
								cellpadding="3" BorderWidth="0px" AutoGenerateColumns="False" AllowSorting="True" OnSortCommand="Sorting"
								HorizontalAlign="Left">
								<AlternatingItemStyle CssClass="tdgenap"></AlternatingItemStyle>
								<ItemStyle CssClass="tdganjil"></ItemStyle>
								<HeaderStyle Font-Bold="True" HorizontalAlign="Center" CssClass="tdjudul"></HeaderStyle>
								<Columns>
									<asp:BoundColumn DataField="ZIPCODE" SortExpression="ZIPCODE" HeaderText="ZIP CODE">
										<HeaderStyle HorizontalAlign="Left"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left"></ItemStyle>
									</asp:BoundColumn>
									<asp:BoundColumn DataField="KELURAHAN" SortExpression="KELURAHAN" HeaderText="KELURAHAN">
										<HeaderStyle HorizontalAlign="Left"></HeaderStyle>
									</asp:BoundColumn>
									<asp:BoundColumn DataField="KECAMATAN" SortExpression="KECAMATAN" HeaderText="KECAMATAN">
										<HeaderStyle HorizontalAlign="Left"></HeaderStyle>
									</asp:BoundColumn>
									<asp:TemplateColumn HeaderText="COLLECTOR">
										<HeaderStyle HorizontalAlign="Left"></HeaderStyle>
										<ItemTemplate>
											<asp:DropDownList id="cboCollector" Runat="server"></asp:DropDownList>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:BoundColumn Visible="False" DataField="CollectorID"></asp:BoundColumn>
									<asp:TemplateColumn Visible="False">
										<ItemTemplate>
											<asp:Label ID="lblZipCode" runat="server" Visible="False">
												<%# container.dataitem("ZipCode")%>
											</asp:Label>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn Visible="False">
										<ItemTemplate>
											<asp:Label ID="lblKelurahan" runat="server" Visible="False">
												<%# container.dataitem("Kelurahan")%>
											</asp:Label>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn Visible="False">
										<ItemTemplate>
											<asp:Label ID="lblKecamatan" runat="server" Visible="False">
												<%# container.dataitem("Kecamatan")%>
											</asp:Label>
										</ItemTemplate>
									</asp:TemplateColumn>
								</Columns>
							</asp:DataGrid></TD>
					</TR>
				</TABLE>
				<TABLE style="HEIGHT: 53px" height="53" cellSpacing="0" cellPadding="0" width="95%" align="center"
					border="0">
					<TR>
						<TD align="center" width="30">
							<asp:imagebutton id="imbFirstPage" runat="server" ImageUrl="../../Images/butkiri1.gif" CausesValidation="False"
								CommandName="First" OnCommand="NavigationLink_Click"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbPrevPage" runat="server" ImageUrl="../../Images/butkiri.gif" CausesValidation="False"
								CommandName="Prev" OnCommand="NavigationLink_Click"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbNextPage" runat="server" ImageUrl="../../Images/butkanan.gif" CausesValidation="False"
								CommandName="Next" OnCommand="NavigationLink_Click"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbLastPage" runat="server" ImageUrl="../../Images/butkanan1.gif" CausesValidation="False"
								CommandName="Last" OnCommand="NavigationLink_Click"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD style="WIDTH: 247px" align="center" width="247"><FONT face="Verdana" size="2">Page&nbsp;
								<asp:TextBox id="txtGoPage" runat="server" Width="34px" CssClass="InpType">1</asp:TextBox></FONT>
							<asp:imagebutton id="imbGoPage" runat="server" ImageUrl="../../Images/butgo.gif" EnableViewState="False"
								ImageAlign="AbsBottom"></asp:imagebutton><FONT face="Verdana" size="2">&nbsp;&nbsp;
							</FONT>
						</TD>
						<TD align="right"><FONT color="#999999"><FONT face="Verdana" size="2">Page&nbsp; </FONT>
								<asp:label id="lblPage" runat="server" Font-Names="Verdana" Font-Size="Smaller"></asp:label><FONT face="Verdana" size="2">&nbsp;of
								</FONT>
								<asp:label id="lblTotPage" runat="server" Font-Names="Verdana" Font-Size="Smaller"></asp:label><FONT face="Verdana" size="2">, 
									Total&nbsp; </FONT>
								<asp:label id="lblTotRec" runat="server" Font-Size="Smaller"></asp:label>&nbsp;<FONT face="Verdana" size="2">record(s)</FONT></FONT></TD>
					</TR>
				</TABLE>
				<TABLE id="Table1" style="HEIGHT: 25px" height="25" cellSpacing="0" cellPadding="0" width="95%"
					align="center" border="0" runat="server">
					<TR>
						<TD align="left" width="50%">
							<asp:ImageButton id="imbPrint" runat="server" ImageUrl="../../images/buttonprint.gif" CausesValidation="False"></asp:ImageButton></TD>
						<TD align="right"><FONT face="Verdana">
								<asp:ImageButton id="imbSave" runat="server" ImageUrl="../../images/buttonsave.gif" CausesValidation="False"></asp:ImageButton>&nbsp;
								<asp:ImageButton id="ImageButton1" runat="server" ImageUrl="../../images/buttoncancel.gif" CausesValidation="False"></asp:ImageButton></FONT></TD>
					</TR>
				</TABLE>
			</asp:panel><br>
			<P>&nbsp;</P>
			<table>
			</table>
			</TABLE></form>
	</body>
</HTML>
