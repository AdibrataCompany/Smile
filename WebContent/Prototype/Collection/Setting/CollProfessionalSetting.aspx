<%@ Register TagPrefix="uc1" TagName="UcContactPerson" Src="../../UserController/UcContactPerson.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcCompanyAdress" Src="../../UserController/UcCompanyAdress.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcFindEmployee" Src="../../UserController/UcFindEmployee.ascx" %>
<%@ Page Language="vb" AutoEventWireup="false" Codebehind="CollProfessionalSetting.aspx.vb" Inherits="AdIns.Application.Eloan.Web.Collection.CollProfessionalSetting" %>
<%@ Register TagPrefix="uc1" TagName="UcBranchCollection" Src="../../UserController/UcBranchCollection.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcBranch" Src="../../UserController/UcBranch.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcLookupEmployee" Src="../../UserController/UcLookupEmployee.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcBankAccount" Src="../../UserController/UcBankAccount.ascx" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>CollectorResult</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../../include/collection.css" type="text/css" rel="stylesheet">
		<SCRIPT src="../../Eloan.js"></SCRIPT>
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
			<asp:label id="lblMessage" style="Z-INDEX: 101; LEFT: 24px; POSITION: absolute; TOP: 0px" runat="server"
				font-size="11px" font-name="Verdana" forecolor="Red"></asp:label><asp:panel id="pnlSearch" style="Z-INDEX: 102; LEFT: 8px; TOP: 0px" runat="server" Height="72px"
				Width="99.69%"><BR>
				<TABLE id="Table3" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">
							<P>PROFESSIONAL EXECUTOR SETTING</P>
						</TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table4" cellSpacing="1" cellPadding="2" width="95%" align="center"
					border="0">
					<TR class="tdganjil">
						<TD class="tdgenap" width="15%">Collection Group</TD>
						<TD class="tdganjil" width="25%">
							<uc1:UcBranchCollection id="UcBranchCollection1" runat="server"></uc1:UcBranchCollection></TD>
						<TD class="tdgenap" width="10%">Search By</TD>
						<TD class="tdganjil" width="50%">
							<asp:DropDownList id="cboSearchBy" runat="server" Width="144px" Font-Names="Verdana">
								<asp:ListItem Value="CollectorID">Collector ID</asp:ListItem>
								<asp:ListItem Value="CollectorName">Collector Name</asp:ListItem>
							</asp:DropDownList>&nbsp;
							<asp:TextBox id="TxtSearchByValue" runat="server" Width="168px" CssClass="InpType"></asp:TextBox></TD>
					</TR>
				</TABLE>
				<TABLE id="Table6" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR align="right">
						<TD>
							<asp:ImageButton id="BtnSearch" runat="server" ImageUrl="../../Images/ButtonSearch.gif"></asp:ImageButton>&nbsp;
							<asp:ImageButton id="BtnReset" runat="server" ImageUrl="../../Images/ButtonReset.gif"></asp:ImageButton></TD>
					</TR>
				</TABLE>
			</asp:panel><br>
			<br>
			<asp:panel id="pnlList" style="Z-INDEX: 101" Width="99.69%" Runat="server">
				<BR>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">
							<P>PROFESSIONAL EXECUTOR LISTING</P>
						</TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR align="center">
						<TD>
							<asp:DataGrid id="dtgCollector" runat="server" width="100%" onsortcommand="Sorting" backcolor="White"
								borderwidth="1px" borderstyle="None" bordercolor="#CCCCCC" autogeneratecolumns="False" allowsorting="True"
								cellpadding="0" HorizontalAlign="Center">
								<AlternatingItemStyle CssClass="tdgenap" Height="20"></AlternatingItemStyle>
								<ItemStyle CssClass="tdganjil" Height="20"></ItemStyle>
								<HeaderStyle Font-Bold="True" HorizontalAlign="Center" CssClass="tdjudul" Height="30"></HeaderStyle>
								<Columns>
									<asp:TemplateColumn SortExpression="CGID" HeaderText="COLLECTION GROUP">
										<HeaderStyle HorizontalAlign="Left"></HeaderStyle>
										<ItemTemplate>
											<asp:HyperLink Runat=server Enabled=True ID="hpCGID" text='<%# container.dataitem("CGName") %>' NavigateUrl='<%# LinkTo(container.dataItem("CGID")) %>' >
											</asp:HyperLink>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:BoundColumn Visible="False" DataField="CGID" SortExpression="CGID" HeaderText="COLL GROUP ID">
										<HeaderStyle HorizontalAlign="Left"></HeaderStyle>
									</asp:BoundColumn>
									<asp:BoundColumn Visible="False" DataField="CollectorID" HeaderText="COLLECTOR ID">
										<HeaderStyle HorizontalAlign="Left"></HeaderStyle>
									</asp:BoundColumn>
									<asp:TemplateColumn SortExpression="CollectorID" HeaderText="COLLECTOR ID">
										<ItemTemplate>
											<asp:HyperLink Runat=server Enabled=True ID="hpCollector" text='<%# container.dataitem("CollectorID") %>' NavigateUrl='<%# LinkToCollector(container.dataItem("CollectorID"),container.dataItem("CGID")) %>' >
											</asp:HyperLink>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:BoundColumn DataField="CollectorName" SortExpression="CollectorName" HeaderText="COLLECTOR NAME">
										<HeaderStyle HorizontalAlign="Left"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left"></ItemStyle>
									</asp:BoundColumn>
									<asp:BoundColumn DataField="PhoneNo" SortExpression="PhoneNo" HeaderText="PHONE NO">
										<HeaderStyle HorizontalAlign="Left"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left"></ItemStyle>
									</asp:BoundColumn>
									<asp:BoundColumn DataField="MOBILEPHONE" SortExpression="MOBILEPHONE" HeaderText="MOBILE PHONE">
										<HeaderStyle HorizontalAlign="Left"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left"></ItemStyle>
									</asp:BoundColumn>
									
									<asp:BoundColumn DataField="BankID" SortExpression="BankID" HeaderText="BANK NAME">
										<HeaderStyle HorizontalAlign="Left"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left"></ItemStyle>
									</asp:BoundColumn>									
									<asp:BoundColumn DataField="BankBranch" SortExpression="BankBranch" HeaderText="BANK BRANCH">
										<HeaderStyle HorizontalAlign="Left"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left"></ItemStyle>
									</asp:BoundColumn>									
									<asp:BoundColumn DataField="AccountNo" SortExpression="AccountNo" HeaderText="ACCOUNT NO">
										<HeaderStyle HorizontalAlign="Left"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left"></ItemStyle>
									</asp:BoundColumn>
									<asp:BoundColumn DataField="AccountName" SortExpression="AccountName" HeaderText="ACCOUNT NAME">
										<HeaderStyle HorizontalAlign="Left"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left"></ItemStyle>
									</asp:BoundColumn>									

																		
									<asp:BoundColumn DataField="Active" SortExpression="Active" HeaderText="ACTIVE">
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center"></ItemStyle>
									</asp:BoundColumn>
									<asp:TemplateColumn HeaderText="EDIT">
										<ItemStyle HorizontalAlign="Center"></ItemStyle>
										<ItemTemplate>
											<asp:ImageButton id="ImbEdit" runat="server" ImageUrl="../../Images/iconedit.gif" CommandName="Edit"></asp:ImageButton>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn HeaderText="DELETE">
										<ItemStyle HorizontalAlign="Center"></ItemStyle>
										<ItemTemplate>
											<asp:ImageButton id="ImbDelete" runat="server" ImageUrl="../../Images/icondelete.gif" CommandName="Delete"
												CausesValidation="False"></asp:ImageButton>
										</ItemTemplate>
									</asp:TemplateColumn>
								</Columns>
							</asp:DataGrid></TD>
					</TR>
				</TABLE>
				<TABLE id="Table5" style="HEIGHT: 53px" height="53" cellSpacing="0" cellPadding="0" width="95%"
					align="center" border="0">
					<TR>
						<TD align="center" width="30">
							<asp:imagebutton id="imbFirstPage" runat="server" ImageUrl="../../Images/butkiri1.gif" CommandName="First"
								OnCommand="NavigationLink_Click" CausesValidation="False"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbPrevPage" runat="server" ImageUrl="../../Images/butkiri.gif" CommandName="Prev"
								OnCommand="NavigationLink_Click" CausesValidation="False"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbNextPage" runat="server" ImageUrl="../../Images/butkanan.gif" CommandName="Next"
								OnCommand="NavigationLink_Click" CausesValidation="False"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbLastPage" runat="server" ImageUrl="../../Images/butkanan1.gif" CommandName="Last"
								OnCommand="NavigationLink_Click" CausesValidation="False"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD style="WIDTH: 247px" align="center" width="247"><FONT face="Verdana" size="2">Page&nbsp;
							</FONT>
							<asp:TextBox id="txtGoPage" runat="server" Width="34px" CssClass="InpType">1</asp:TextBox>
							<asp:imagebutton id="imbGoPage" runat="server" ImageUrl="..\..\Images\butgo.gif" EnableViewState="False"
								ImageAlign="AbsBottom"></asp:imagebutton>
							<asp:RangeValidator id="rgvGo" runat="server" Font-Names="Verdana" ControlToValidate="txtGoPage" MinimumValue="0"
								ErrorMessage="Page is not valid" Font-Size="Smaller"></asp:RangeValidator><FONT face="Verdana" size="2">&nbsp;&nbsp;
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
						<TD style="WIDTH: 160px" align="left">
							<asp:ImageButton id="imbPrint" runat="server" ImageUrl="..\..\images\buttonprint.gif"></asp:ImageButton></TD>
						<TD align="right"><FONT face="Verdana">
								<asp:ImageButton id="BtnAdd" runat="server" ImageUrl="..\..\images\buttonadd.gif"></asp:ImageButton></FONT></TD>
					</TR>
				</TABLE>
			</asp:panel><asp:panel id="pnlAddEdit" style="Z-INDEX: 102" Width="100%" Runat="server" HorizontalAlign="Center">
				<TABLE id="Table9" cellSpacing="3" cellPadding="0" width="95%" border="0">
					<TR>
						<TD align="left">
							<asp:label id="Label1" style="Z-INDEX: 101; LEFT: 16px; TOP: 8px" runat="server" forecolor="Red"
								font-name="Verdana" font-size="11px" Width="112px" Font-Names="Verdana" Font-Italic="True">*) required field</asp:label></TD>
					</TR>
				</TABLE>
				<TABLE id="Table2" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">PROFESSIONAL EXECUTOR SETTING&nbsp;&nbsp;&nbsp;-
							<asp:Label id="lblMenuAddEdit" runat="server"></asp:Label></TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" align="center" border="0">
					<TR class="tdganjil">
						<TD class="tdgenap" style="HEIGHT: 16px" width="25%">Collection Group
						</TD>
						<TD class="tdganjil" style="COLOR: red; HEIGHT: 16px">
							<asp:Label id="lblCollGroup" runat="server" Width="376px" ForeColor="#404040"></asp:Label></TD>
					</TR>
					<TR class="tdganjil">
						<TD class="tdgenap" style="HEIGHT: 5px" width="25%">
							<DIV align="left">Executor&nbsp;Id</DIV>
						</TD>
						<TD class="tdganjil" style="HEIGHT: 5px">
							<asp:Label id="lblExecutorID" runat="server" Width="89px" ForeColor="Black"></asp:Label>
							<asp:TextBox id="txtExecutorID" runat="server" Width="120px" CssClass="InpType" MaxLength="12"></asp:TextBox>&nbsp;
							<asp:Label id="lblbintang1" runat="server" Width="11px" ForeColor="Red">*)</asp:Label>
							<asp:RequiredFieldValidator id="RequiredFieldValidator1" runat="server" Width="136px" ControlToValidate="txtExecutorID"
								ErrorMessage="Please fill Executor ID"></asp:RequiredFieldValidator></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" align="center">
					<TR>
						<TD class="tdgenap" style="HEIGHT: 22px" width="25%">Executor Name</TD>
						<TD class="tdganjil" style="HEIGHT: 22px">
							<asp:TextBox id="txtExecutorName" runat="server" CssClass="InpType" MaxLength="50"></asp:TextBox>
							<asp:Label id="lblExecutorName" runat="server" Width="88px" ForeColor="Black"></asp:Label>
							<asp:Label id="lblbintang2" runat="server" Width="11px" ForeColor="Red">*)</asp:Label>
							<asp:RequiredFieldValidator id="RequiredFieldValidator2" runat="server" Width="200px" ControlToValidate="txtExecutorName"
								ErrorMessage="Please fill Executor Name"></asp:RequiredFieldValidator></TD>
					</TR>
					<tr> 
						<td class="tdgenap"> <div align="left">NPWP</div></td>
						<td class="tdganjil"> 
							<asp:TextBox id="txtNPWP" runat="server" Width="120px" CssClass="InpType" MaxLength="20"></asp:TextBox>
							<asp:Label id="lblNPWP" runat="server" Width="88px" ForeColor="Black"></asp:Label>
						</td>
					</tr>
					<TR>
						<TD class="tdgenap" style="HEIGHT: 14px" width="25%">
							<DIV align="left">Collector From</DIV>
						</TD>
						<TD class="tdganjil" style="HEIGHT: 14px">External</TD>
					</TR>					
					<tr> 
						<td class="tdgenap"> <div align="left">Collector Category</div></td>
						<td class="tdganjil">
							<asp:DropDownList id="cboCollectorCategory" runat="server">
								<asp:ListItem Value="Per">Personal</asp:ListItem>
								<asp:ListItem Value="Pro">Professional</asp:ListItem>
								<asp:ListItem Value="Ins">Institution</asp:ListItem>
							</asp:DropDownList>
						</td>
					</tr>
					<TR>
						<TD class="tdgenap" style="HEIGHT: 15px" width="25%">
							<DIV align="left">Supervisor</DIV>
						</TD>
						<TD class="tdganjil" style="HEIGHT: 15px">
							<asp:DropDownList id="cboSupervisor" runat="server"></asp:DropDownList></TD>
					</TR>
				</TABLE>
				<P></P>
				<TABLE class="tablegrid" id="Table7" cellSpacing="1" cellPadding="2" width="95%">
					<TR>
						<TD class="tdtopi" style="HEIGHT: 17px" colSpan="2">ADDRESS</TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%">
					<TR>
					<TR>
						<TD>
							<uc1:UcCompanyAdress id="oUcCompanyAdress" runat="server"></uc1:UcCompanyAdress></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table8" cellSpacing="1" cellPadding="2" width="95%" align="center">
					<TR>
						<TD class="tdgenap" style="HEIGHT: 29px" width="25%">Mobile Phone</TD>
						<TD class="tdganjil" style="HEIGHT: 29px">
							<asp:TextBox id="txtMobilePhone" runat="server" CssClass="InpType"></asp:TextBox></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="HEIGHT: 14px" width="25%">Email</TD>
						<TD class="tdganjil" style="HEIGHT: 14px">
							<asp:TextBox id="txtEmail" runat="server" Width="288px" CssClass="InpType"></asp:TextBox>
							<asp:RegularExpressionValidator id="revtxtEmail" runat="server" ControlToValidate="txtEmail" ErrorMessage="Invalid Email Address!"
								ValidationExpression="\w+([-+._]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*" Display="Dynamic"></asp:RegularExpressionValidator></TD>
					</TR>
					<TR>
						<TD class="tdgenap" style="HEIGHT: 14px" width="25%">Notes</TD>
						<TD class="tdganjil" style="HEIGHT: 14px">
							<asp:TextBox id="txtNotes" runat="server" Width="90%" CssClass="InpType" Rows="3" TextMode="MultiLine"></asp:TextBox></TD>
					</TR>
					<tr> 
						<td class="tdtopi" colspan="2">BANK ACCOUNT</td>
					</tr>
					<tr> 
						<td class="tdganjil" colspan="2"><uc1:UcBankAccount id="UcBankAccount" runat="server"></uc1:UcBankAccount></td>
					</tr>
					<TR>
						<TD class="tdgenap" width="25%">
							<DIV align="left">Active</DIV>
						</TD>
						<TD class="tdganjil" style="HEIGHT: 22px">
							<asp:CheckBox id="cbActive" runat="server" CssClass="InpType" BorderStyle="None"></asp:CheckBox></TD>
					</TR>
				</TABLE>
				<TABLE id="TableAddSave" style="HEIGHT: 19px" cellSpacing="0" cellPadding="0" width="95%"
					align="center" border="0">
					<TR>
						<TD align="right">&nbsp;&nbsp;
							<asp:ImageButton id="imbSave" runat="server" ImageUrl="..\..\Images\ButtonSave.gif"></asp:ImageButton>&nbsp;
							<asp:ImageButton id="imgCancel" runat="server" ImageUrl="..\..\Images\ButtonCancel.gif" CausesValidation="False"></asp:ImageButton>&nbsp;
							<A href="javascript:history.back();"></A>
						</TD>
					</TR>
				</TABLE>
			</asp:panel>
			<P>&nbsp;</P>
			<table>
			</table>
			</TABLE></form>
	</body>
</HTML>
