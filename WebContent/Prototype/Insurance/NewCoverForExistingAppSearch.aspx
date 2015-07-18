
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>NewCoverForExistingApp</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<link href="../Confins.css" rel="stylesheet" type="text/css">
		<link rel="stylesheet" type="text/css" href="../Include/Insurance.css">

	</HEAD>
	<body>
		<form id="form1" runat="server">
		<asp:panel id="pnlsearch" Runat="server">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopikuning">
						<TD class="tdtopiabukiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopiabu" align="center">NEW COVER FOR EXISTING APPLICATION</TD>
						<TD class="tdtopiabukanan" width="10" height="20">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
				<TR>
				<TD class="TDGENAP" width="20%" style="height: 26px">Branch </TD>
				<TD class="TDGANJIL" style="height: 26px">
				<asp:DropDownList id="ddlBranch" runat="server">
					<asp:ListItem>Select One</asp:ListItem>
					<asp:ListItem>Jakarta Electronic</asp:ListItem>
				</asp:DropDownList>
				<FONT color="#ff0033">*)</FONT>
				</TD>
				</TR>
				<TR>
				<TD class="TDGENAP" width="20%">Search By </TD>
				<TD class="TDGANJIL">
				<asp:DropDownList id="ddlsearchby" runat="server">
					<asp:ListItem>Select One</asp:ListItem>
					<asp:ListItem>Agreement No</asp:ListItem>
					<asp:ListItem>Customer Name</asp:ListItem>
				</asp:DropDownList>
				<input name="txtsearch" type="text" class="inptype"></TD>
				</TR>
				</TABLE>
				
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR>
				<TD>
				<DIV align="right">
				<asp:ImageButton id="imgsearch" runat="server" width="100px" height="20px" imageurl="../Images/ButtonSearch.gif" PostBackUrl="NewCoverForExistingAppSearch.aspx" />
				<asp:ImageButton id="imbReset" runat="server" imageurl="../Images/ButtonReset.gif" causesvalidation="False" />
				</DIV>
				</TD>
				</TR>
				</TABLE>
			</asp:panel><asp:panel id="pnlDtGrid" runat="server">
				<BR>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR class="tdtopiabu">
				<TD class="tdtopiabukiri" width="10" height="20">&nbsp;</TD>
				<TD class="tdtopiabu" align="center">NEW COVER FOR EXISTING APPLICATION LISTING
				</TD>
				<TD class="tdtopiabukanan" width="10">&nbsp;</TD>
				</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR>
				<TD>
				<asp:DataGrid id="dtgPagingNewAppInsurance" runat="server" CssClass="tablegrid" HorizontalAlign="Center" Width="100%" cellspacing="1" cellpadding="3" BorderWidth="0px" AutoGenerateColumns="False" AllowSorting="True" DataSourceID="xmlnewcover">
					<AlternatingItemStyle CssClass="tdgenap" />
					<ItemStyle CssClass="tdganjil" />
					<HeaderStyle HorizontalAlign="Center" CssClass="tdjudul" />
					<Columns>
						<asp:templatecolumn HeaderText="AGREEMENT NO" SortExpression="Agreementno">
							<ItemTemplate>
								<asp:HyperLink id="hypagreementno" runat="server" text="xx3xx" NavigateUrl="../AccMaintenance/AgreementView.htm" Target="_blank">
								</asp:HyperLink>
							</ItemTemplate>
						</asp:templatecolumn>
						<asp:templatecolumn HeaderText="CUSTOMER NAME" SortExpression="CustomerName">
							<ItemTemplate>
								<asp:HyperLink ID="lnkCust" Runat="server" text="xx3xx">
								</asp:HyperLink>
							</ItemTemplate>
						</asp:templatecolumn>
						<asp:templatecolumn HeaderText="MATURITY DATE" SortExpression="Maturitydate">
							<ItemTemplate>
								<asp:Label ID="lblMaturityDate" Runat="server" text="dd/MM/yyyy">
								</asp:Label>
							</ItemTemplate>
						</asp:templatecolumn>
						<asp:templatecolumn HeaderText="CONTRACT STATUS" SortExpression="ContractStatus">
							<ItemTemplate>
								<asp:Label ID="lblContractStatus" Runat="server" text="xx3xx">
								</asp:Label>
							</ItemTemplate>
						</asp:templatecolumn>
						<asp:templatecolumn HeaderText="ACTION">
							<ItemTemplate>
								<asp:LinkButton id="btnNewcover" runat="server" text="New Cover" commandName="NewCover" PostBackUrl="NewCoverStep1.htm">
								</asp:LinkButton>
							</ItemTemplate>
						</asp:templatecolumn>
					</Columns>
				</asp:DataGrid>
				<asp:XmlDataSource runat="server" ID="xmlnewcover" DataFile="../DataType.xml">
				</asp:XmlDataSource>
				</TD>
				</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR>
				<TD>
				<asp:ImageButton id="imbFirstPage" runat="server" imageurl="../Images/butkiri1.gif" commandname="First" />&nbsp;&nbsp;
				<asp:ImageButton id="imbPrevPage" runat="server" imageurl="../Images/butkiri.gif" commandname="Prev" />&nbsp;&nbsp;
				<asp:ImageButton id="imbNextPage" runat="server" imageurl="../Images/butkanan.gif" commandname="Next" />&nbsp;&nbsp;
				<asp:ImageButton id="imbLastPage" runat="server" imageurl="../Images/butkanan1.gif" commandname="Last" />
				</TD>
				<TD align="center" width="130">Page
				<asp:TextBox id="txtpage" runat="server" CssClass="inptype" width="34px" maxlength="3">1</asp:TextBox>
				&nbsp;
				<asp:ImageButton id="imbGoPage" runat="server" width="30" imageurl="../Images/butgo.gif" cssclass="inptype" />
				</TD>
				<asp:RangeValidator id="rgvGo" forecolor="#993300" font-name="Verdana" font-size="11px" runat="server" type="Integer" maximumvalue="999999999" errormessage="Page No. is not valid" minimumvalue="1" controltovalidate="txtpage">
				</asp:RangeValidator>
				<asp:RequiredFieldValidator id="rfvGo" forecolor="#993300" font-name="Verdana" font-size="11px" runat="server" errormessage="Page No. is not valid" controltovalidate="txtpage">
				</asp:RequiredFieldValidator>
				&nbsp;&nbsp;
				<TD align="right">
				<FONT color="#999999">Page
				<asp:Label id="lblPage" forecolor="#999999" runat="server">
				</asp:Label>
				&nbsp;of
				<asp:Label id="lblTotPage" forecolor="#999999" runat="server">
				</asp:Label>
				&nbsp;, 
								Total
				<asp:Label id="lblRecord" forecolor="#999999" runat="server">
				</asp:Label>
				&nbsp;record(s)</FONT>
				</TD>
				</TR>
				</TABLE>
				</BR>
		</asp:panel></form>
	
	</body>
</HTML>
