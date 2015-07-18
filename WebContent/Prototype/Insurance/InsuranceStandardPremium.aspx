<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>InsuranceStandardPremium</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<link rel="stylesheet" type="text/css" href="../Confins.css">
	</HEAD>
	<body>
		<form id="Form1" method="post" runat="server">
						<asp:panel id="Panel1" Runat="server" HorizontalAlign="center" Width="100%">
				<TABLE id="Table1" cellSpacing="0" cellPadding="0" width="95%" border="0">
				<TR class="trtopiabu">
				<TD class="tdtopiabukiri" width="10" height="20">&nbsp;</TD>
				<TD class="tdtopiabu" align="center">INSURANCE STANDARD 
						SETTING</TD>
				<TD class="tdtopiabukanan" width="10">&nbsp;</TD>
				</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table2" cellSpacing="1" cellPadding="2" width="95%" border="0">
				<TR>
				<TD class="tdgenap" width="25%">Branch</TD>
				<TD class="tdganjil">
				<asp:DropDownList runat="server" id="DropDownList1">
					<asp:ListItem>Select One</asp:ListItem>
					<asp:ListItem>Jakarta Electronic</asp:ListItem>
				</asp:DropDownList>
				</TD>
				</TR>
				</TABLE>
				<TABLE id="Table3" cellSpacing="0" cellPadding="0" width="95%" border="0">
				<TR>
				<TD width="50%" height="30">&nbsp;</TD>
				<TD align="right" width="50%">
				<asp:ImageButton id="imbSearch" Runat="server" ImageUrl="../images/ButtonSearch.gif" CausesValidation="False" />
				<asp:ImageButton id="imbReset" Runat="server" ImageUrl="../images/ButtonReset.gif" CausesValidation="False" />
				</TD>
				</TR>
				</TABLE>
			</asp:panel>
			<br>
						<asp:panel id="PnlList" Runat="server" HorizontalAlign="center" Width="100%">
				<TABLE id="Table4" cellSpacing="0" cellPadding="0" width="95%" border="0">
					<TR class="trtopi">
						<TD class="tdtopiabukiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopiabu" align="center">INSURANCE STANDARD RATE LISTING</TD>
						<TD class="tdtopiabukanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<asp:DataGrid id="dtgPaging" runat="server" Width="95%" AllowSorting="True" AutoGenerateColumns="False" BorderWidth="0px" cellpadding="3" cellspacing="1" CssClass="tablegrid" DataSourceID="xmlRate">
					<AlternatingItemStyle CssClass="tdgenap" />
					<ItemStyle HorizontalAlign="Center" CssClass="tdganjil" />
					<HeaderStyle HorizontalAlign="Center" CssClass="tdjudul" />
					<Columns>
						<asp:templatecolumn HeaderText="BRANCH ID">
							<ItemTemplate>
								<asp:Label runat="server" Text='<%# Eval("valstring3") %>' id="Label1">
								</asp:Label>
							</ItemTemplate>
						</asp:templatecolumn>
						<asp:templatecolumn HeaderText="BRANCH NAME">
							<ItemTemplate>
								<asp:Label runat="server" Text='<%# Eval("valstring10") %>' id="Label1">
								</asp:Label>
							</ItemTemplate>
						</asp:templatecolumn>
						<asp:templatecolumn HeaderText="RATE BY MONTH">
							<ItemTemplate>
								<a href='InsStdPremMonth.aspx'>

								<asp:Image ID="imgRate" ImageUrl="../images/IconRate.gif" Runat="server" />
								</a>
							</ItemTemplate>
						</asp:templatecolumn>
						<asp:templatecolumn HeaderText="RATE BY YEAR">
							<ItemTemplate>
								<a href='InsStdPrem.aspx'>
								<asp:Image ID="imgRate" ImageUrl="../images/IconRate.gif" Runat="server" />
								</a>
							</ItemTemplate>
						</asp:templatecolumn>
					<asp:templatecolumn HeaderText="TPL">
							<ItemTemplate>
								<a href='InsuranceStdTPl.htm'>
								<asp:Image ID="imgRate" ImageUrl="../images/IconRate.gif" Runat="server" />
								</a>
							</ItemTemplate>
						</asp:templatecolumn>

					</Columns>
				</asp:DataGrid>
				<asp:XmlDataSource runat="server" ID="xmlRate" DataFile="../DataType.xml">
				</asp:XmlDataSource>
	<TABLE id="Table5" height="25" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
	<TR>
	<TD align="center" width="30">
	<asp:ImageButton id="imbFirstPage" runat="server" ImageUrl="../images/butkiri1.gif" CausesValidation="False" CommandName="First" />
	</TD>
	<TD align="center" width="30">
	<asp:ImageButton id="imbPrevPage" runat="server" ImageUrl="../images/butkiri.gif" CausesValidation="False" CommandName="Prev" />
	</TD>
	<TD align="center" width="30">
	<asp:ImageButton id="imbNextPage" runat="server" ImageUrl="../images/butkanan.gif" CausesValidation="False" CommandName="Next" />
	</TD>
	<TD align="center" width="30">
	<asp:ImageButton id="imbLastPage" runat="server" ImageUrl="../images/butkanan1.gif" CausesValidation="False" CommandName="Last" />
	</TD>
	<TD style="WIDTH: 163px" align="center" width="163">Page
	<asp:TextBox id="txtGoPage" runat="server" Width="34px" CssClass="inptype" MaxLength="3">
	</asp:TextBox>
	<asp:ImageButton id="imbGoPage" runat="server" ImageUrl="../images/butgo.gif" EnableViewState="False" ImageAlign="AbsBottom" />
	</TD>
	<TD align="right">
	<FONT color="#999999">Page
	<asp:Label id="lblPage" runat="server"></asp:Label>
	&nbsp;of
	<asp:Label id="lblTotPage" runat="server"></asp:Label>
	, Total
	<asp:Label id="lblTotRec" runat="server"></asp:Label>
	&nbsp;record(s)</FONT>
	</TD>
	</TR>
	</TABLE>
			</asp:panel></form>
	</body>
</HTML>
