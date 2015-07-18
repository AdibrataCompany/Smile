<%@ Page Language="vb" AutoEventWireup="false" Codebehind="CollGroup.aspx.vb" Inherits="AdIns.Application.Eloan.Web.CollGroup" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>CollGroupResult</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../../include/collection.css" type="text/css" rel="stylesheet">
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
		</script>
	</HEAD>
	<body MS_POSITIONING="GridLayout">
		<form id="Form1" method="post" runat="server">
			<asp:label id="lblMessage" style="Z-INDEX: 101; LEFT: 24px; POSITION: absolute; TOP: 0px" runat="server"
				font-size="11px" font-name="Verdana" forecolor="Red"></asp:label><br>
			<asp:panel id="pnlList" style="Z-INDEX: 101" Width="99.69%" Runat="server">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">
							<P>COLLECTION GROUP</P>
						</TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" align="center" border="0">
					<TR class="tdganjil">
						<TD class="tdgenap" width="25%">Search By</TD>
						<TD class="tdganjil">
							<asp:DropDownList id="cboSearchBy" runat="server" Width="144px" Font-Names="Verdana">
								<asp:ListItem Value="CGID" Selected="True">Collection Group ID</asp:ListItem>
								<asp:ListItem Value="CGName">Collection Group Name</asp:ListItem>
							</asp:DropDownList>&nbsp;
							<asp:TextBox id="TxtSearchByValue" runat="server" Width="168px" CssClass="InpType"></asp:TextBox></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR align="right">
						<TD>
							<asp:ImageButton id="BtnSearch" runat="server" ImageUrl="../../Images/ButtonSearch.gif"></asp:ImageButton>&nbsp;
							<asp:ImageButton id="BtnReset" runat="server" ImageUrl="../../Images/ButtonReset.gif"></asp:ImageButton></TD>
					</TR>
				</TABLE>
				<BR>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">COLLECTION GROUP LISTING</TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR align="center">
						<TD width="100%">
							<asp:DataGrid id="dtgCollGroup" runat="server" Width="100%" HorizontalAlign="Left" OnSortCommand="Sorting"
								AllowSorting="True" AutoGenerateColumns="False">
								<AlternatingItemStyle CssClass="tdgenap"></AlternatingItemStyle>
								<ItemStyle Font-Size="XX-Small" Font-Names="Verdana" CssClass="tdganjilKegiatan"></ItemStyle>
								<HeaderStyle Font-Size="Smaller" Font-Names="Verdana" Font-Bold="True" HorizontalAlign="Center"
									CssClass="tdjudul"></HeaderStyle>
								<Columns>
									<asp:BoundColumn DataField="CGID" SortExpression="CGID" HeaderText="COLL GROUP ID"></asp:BoundColumn>
									<asp:BoundColumn DataField="CGName" SortExpression="CGName" HeaderText="COLL GROUP NAME"></asp:BoundColumn>
									<asp:BoundColumn DataField="Address" SortExpression="Address" HeaderText="ADDRESS"></asp:BoundColumn>
									<asp:BoundColumn DataField="PhoneNo" SortExpression="PhoneNo" HeaderText="PHONE NO"></asp:BoundColumn>
									<asp:BoundColumn DataField="ContactPerson" SortExpression="ContactPerson" HeaderText="CONTACT PERSON"></asp:BoundColumn>
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
							<asp:imagebutton id="imbFirstPage" runat="server" ImageUrl="..\..\Images\butkiri1.gif" CausesValidation="False"
								OnCommand="NavigationLink_Click" CommandName="First"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbPrevPage" runat="server" ImageUrl="../../Images/butkiri.gif" CausesValidation="False"
								OnCommand="NavigationLink_Click" CommandName="Prev"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbNextPage" runat="server" ImageUrl="..\..\Images\butkanan.gif" CausesValidation="False"
								OnCommand="NavigationLink_Click" CommandName="Next"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbLastPage" runat="server" ImageUrl="..\..\Images\butkanan1.gif" CausesValidation="False"
								OnCommand="NavigationLink_Click" CommandName="Last"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD style="WIDTH: 247px" align="center" width="247"><FONT face="Verdana" size="2">Page&nbsp;
							</FONT>
							<asp:TextBox id="txtGoPage" runat="server" Width="34px" CssClass="InpType">1</asp:TextBox>
							<asp:imagebutton id="imbGoPage" runat="server" ImageUrl="..\..\Images\butgo.gif" ImageAlign="AbsBottom"
								EnableViewState="False"></asp:imagebutton>
							<asp:RangeValidator id="rgvGo" runat="server" Font-Names="Verdana" Font-Size="Smaller" ErrorMessage="Page is not valid"
								MinimumValue="0" ControlToValidate="txtGoPage"></asp:RangeValidator><FONT face="Verdana" size="2">&nbsp;&nbsp;
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
							<asp:ImageButton id="ImageButton1" runat="server" ImageUrl="..\..\images\buttonprint.gif"></asp:ImageButton></TD>
						<TD align="right"><FONT face="Verdana">
								<asp:ImageButton id="BtnAdd" runat="server" ImageUrl="..\..\images\buttonadd.gif"></asp:ImageButton></FONT></TD>
					</TR>
				</TABLE>
			</asp:panel><asp:panel id="pnlAddEdit" style="Z-INDEX: 102" Width="100%" Runat="server" HorizontalAlign="Center">
				<TABLE id="Table2" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">COLLECTION GROUP&nbsp;&nbsp;-
							<asp:Label id="lblMenuAddEdit" runat="server"></asp:Label></TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table7" cellSpacing="1" cellPadding="2" width="95%" align="center"
					border="0">
					<TR class="tdganjil">
						<TD class="tdgenap" style="HEIGHT: 27px" width="25%">Collection Group ID</TD>
						<TD class="tdganjil" style="HEIGHT: 27px">
							<asp:TextBox id="txtCollGroupID" runat="server" Width="100px" CssClass="InpType" MaxLength="10"></asp:TextBox>
							<asp:Label id="lblCollGroupID" runat="server"></asp:Label>
							<asp:RequiredFieldValidator id="RequiredFieldValidator1" runat="server" Width="184px" ErrorMessage="Please fill CollGroup Id"
								ControlToValidate="txtCollGroupID"></asp:RequiredFieldValidator></TD>
					</TR>
					<TR class="tdganjil">
						<TD class="tdgenap" width="25%">Collection Group Name</TD>
						<TD class="tdganjil" style="HEIGHT: 22px">
							<asp:TextBox id="txtCollGroupName" runat="server" Width="291px" CssClass="InpType" MaxLength="100"></asp:TextBox>
							<asp:RequiredFieldValidator id="rfv1" runat="server" Width="184px" ErrorMessage="Please fill CollGroup Name"
								ControlToValidate="txtCollGroupName"></asp:RequiredFieldValidator></TD>
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
