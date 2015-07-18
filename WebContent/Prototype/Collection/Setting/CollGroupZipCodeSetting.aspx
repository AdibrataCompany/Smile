<%@ Page Language="vb" AutoEventWireup="false" Codebehind="CollGroupZipCodeSetting.aspx.vb" Inherits="AdIns.Application.Eloan.Web.Collection.CollGroupZipCodeSetting" %>
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
				<TABLE id="Table3" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">
							<P>ZIP CODE COLLECTION GROUP ALLOCATION
							</P>
						</TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table4" cellSpacing="1" cellPadding="2" width="95%" align="center"
					border="0">
					<TR class="tdganjil">
						<TD class="tdgenap" width="20%">City</TD>
						<TD class="tdganjil" width="80%">
							<asp:DropDownList id="cboCity" runat="server" Width="144px" Font-Names="Verdana"></asp:DropDownList>
							<asp:RequiredFieldValidator id="RequiredFieldValidator1" runat="server" ErrorMessage="Please Select City" ControlToValidate="cboCity"
								InitialValue="0" Display="Dynamic"></asp:RequiredFieldValidator></TD>
					</TR>
				</TABLE>
				<TABLE id="Table5" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR align="right">
						<TD>
							<asp:ImageButton id="BtnSearch" runat="server" ImageUrl="../../Images/ButtonSearch.gif"></asp:ImageButton>&nbsp;
							<asp:ImageButton id="BtnReset" runat="server" ImageUrl="../../Images/ButtonReset.gif" CausesValidation="False"></asp:ImageButton></TD>
					</TR>
				</TABLE>
			</asp:panel><asp:panel id="PnlSearchDetail" style="Z-INDEX: 102; LEFT: 8px; TOP: 0px" runat="server" Width="99.69%"
				Height="72px"><BR>
				<TABLE id="Table6" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">
							<P>ZIP CODE COLLECTION GROUP ALLOCATION
							</P>
						</TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table7" cellSpacing="1" cellPadding="2" width="95%" align="center"
					border="0">
					<TR>
						<TD class="tdgenap" width="7%">City</TD>
						<TD class="tdganjil" width="25%" colSpan="3">
							<asp:Label id="lblCity" runat="server" Width="435px"></asp:Label></TD>
					</TR>
					<TR class="tdganjil">
						<TD class="tdgenap" width="15%">Seach By</TD>
						<TD class="tdganjil" width="35%">
							<asp:DropDownList id="cboSearchBy" runat="server" Width="109px" Font-Names="Verdana">
								<asp:ListItem Value="0">Select One</asp:ListItem>
								<asp:ListItem Value="Kelurahan">Kelurahan</asp:ListItem>
								<asp:ListItem Value="Kecamatan">Kecamatan</asp:ListItem>
								<asp:ListItem Value="ZipCode">Zip Code</asp:ListItem>
							</asp:DropDownList>
							<asp:TextBox id="txtSearchByValue" runat="server" CssClass="InpType"></asp:TextBox></TD>
						<TD class="tdgenap" width="10%">Unallocated Zip Code</TD>
						<TD class="tdganjil" width="30%">
							<asp:CheckBox id="cbUnZipCode" runat="server"></asp:CheckBox></TD>
					</TR>
				</TABLE>
				<TABLE id="Table8" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR align="right">
						<TD>
							<asp:ImageButton id="BtnSearchDetail" runat="server" ImageUrl="../../Images/ButtonSearch.gif" CausesValidation="False"></asp:ImageButton>&nbsp;
							<asp:ImageButton id="BtnResetDetail" runat="server" ImageUrl="../../Images/ButtonReset.gif" CausesValidation="False"></asp:ImageButton>&nbsp;
						</TD>
					</TR>
				</TABLE>
				<BR>
				<TABLE id="Table9" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">
							<P>ZIP CODE COLLECTION GROUP ALLOCATION DEFAULT</P>
						</TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table10" cellSpacing="1" cellPadding="2" width="95%" align="center"
					border="0">
					<TR class="tdganjil">
						<TD class="tdgenap" width="15%">Default Collection Group</TD>
						<TD class="tdganjil" width="35%">
							<asp:DropDownList id="cboDefaultCG" runat="server" Font-Names="Verdana"></asp:DropDownList>
							<asp:RequiredFieldValidator id="RequiredFieldValidator2" runat="server" ErrorMessage="Please Select Default Collection Group"
								ControlToValidate="cboDefaultCG" InitialValue="0" Display="Dynamic"></asp:RequiredFieldValidator></TD>
						<TD class="tdgenap" width="10%">Default Criteria</TD>
						<TD class="tdganjil" width="30%">
							<asp:DropDownList id="cboCriteria" runat="server" Font-Names="Verdana">
								<asp:ListItem Value="All">All Zip Code</asp:ListItem>
								<asp:ListItem Value="UnZipCode">Unallocated Zip Code</asp:ListItem>
							</asp:DropDownList>of this page</TD>
					</TR>
				</TABLE>
				<TABLE id="Table11" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR align="right">
						<TD>&nbsp;
							<asp:ImageButton id="imbApply" runat="server" ImageUrl="../../Images/Buttonapplydefault.gif"></asp:ImageButton></TD>
					</TR>
				</TABLE>
			</asp:panel><br>
			<asp:panel id="pnlList" style="Z-INDEX: 101; LEFT: 8px; TOP: 328px" Width="99.69%" Runat="server">
				<BR>
				<TABLE id="Table12" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">ZIP CODE COLLECTION GROUP ALLOCATION LISTING</TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE id="Table13" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR align="center">
						<TD>
							<asp:DataGrid id="dtgCollZipCode" runat="server" cellpadding="0" allowsorting="True" autogeneratecolumns="False"
								bordercolor="#CCCCCC" borderstyle="None" borderwidth="1px" backcolor="White" onsortcommand="Sorting"
								width="100%" HorizontalAlign="Center">
								<AlternatingItemStyle CssClass="tdgenap" Height="20"></AlternatingItemStyle>
								<ItemStyle CssClass="tdganjil" Height="20"></ItemStyle>
								<HeaderStyle Font-Bold="True" HorizontalAlign="Center" CssClass="tdjudul" Height="30"></HeaderStyle>
								<Columns>
									<asp:BoundColumn DataField="ZIPCODE" SortExpression="ZIPCODE" HeaderText="ZIP CODE">
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center"></ItemStyle>
									</asp:BoundColumn>
									<asp:BoundColumn DataField="KELURAHAN" SortExpression="KELURAHAN" HeaderText="KELURAHAN">
										<HeaderStyle HorizontalAlign="Left"></HeaderStyle>
									</asp:BoundColumn>
									<asp:BoundColumn DataField="KECAMATAN" SortExpression="KECAMATAN" HeaderText="KECAMATAN">
										<HeaderStyle HorizontalAlign="Left"></HeaderStyle>
									</asp:BoundColumn>
									<asp:TemplateColumn HeaderText="COLLECTION GROUP">
										<ItemTemplate>
											<asp:DropDownList id="cboCG" Runat="server"></asp:DropDownList>
										</ItemTemplate>
									</asp:TemplateColumn>									
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
								OnCommand="NavigationLink_Click" CommandName="First"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbPrevPage" runat="server" ImageUrl="../../Images/butkiri.gif" CausesValidation="False"
								OnCommand="NavigationLink_Click" CommandName="Prev"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbNextPage" runat="server" ImageUrl="../../Images/butkanan.gif" CausesValidation="False"
								OnCommand="NavigationLink_Click" CommandName="Next"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbLastPage" runat="server" ImageUrl="../../Images/butkanan1.gif" CausesValidation="False"
								OnCommand="NavigationLink_Click" CommandName="Last"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD style="WIDTH: 247px" align="center" width="247"><FONT face="Verdana" size="2">Page&nbsp;</FONT>
							<asp:TextBox id="txtGoPage" runat="server" Width="34px" CssClass="InpType">1</asp:TextBox>
							<asp:imagebutton id="imbGoPage" runat="server" ImageUrl="../../Images/butgo.gif" ImageAlign="AbsBottom"
								EnableViewState="False"></asp:imagebutton>
							<asp:RangeValidator id="rvGo" Font-Names="verdana" ErrorMessage="Page Is Not Valid" ControlToValidate="txtGoPage"
								Runat="server" Font-Size="smaller" MaximumValue="999999999" MinimumValue="0" Type="Integer"></asp:RangeValidator><FONT face="Verdana" size="2">&nbsp;&nbsp;
							</FONT>
						</TD>
						<TD align="right"><FONT color="#999999"><FONT face="Verdana" size="2">Page&nbsp;</FONT>
								<asp:label id="lblPage" runat="server" Font-Names="Verdana" Font-Size="Smaller"></asp:label><FONT face="Verdana" size="2">&nbsp;of</FONT>
								<asp:label id="lblTotPage" runat="server" Font-Names="Verdana" Font-Size="Smaller"></asp:label><FONT face="Verdana" size="2">, 
									Total&nbsp; </FONT>
								<asp:label id="lblTotRec" runat="server" Font-Size="Smaller"></asp:label>&nbsp; <FONT face="Verdana" size="2">
									record(s)</FONT></FONT>
						</TD>
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
			<table id="Table2">
			</table>
			</TABLE></form>
	</body>
</HTML>
