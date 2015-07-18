<%@ Page Language="vb" AutoEventWireup="false" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>DocumentList</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../include/AccAcq.css" type="text/css" rel="stylesheet">
		
	</HEAD>
	<body MS_POSITIONING="GridLayout">
		<form id="Form1" method="post" runat="server">
			<div align="center">
			<TABLE id="Table1" cellSpacing="0" cellPadding="0" width="95%" border="0">
				<TR>
					<TD><asp:label id="lblMessage" Runat="server" ForeColor="red"></asp:label>&nbsp;
					</TD>
				</TR>
			</TABLE>
			<asp:panel id="pnlSearch" runat="server" horizontalalign="center" width="100%">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
					<TR class="trtopi">
						<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopi" align="center">PRINT</TD>
						<TD class="tdtopikanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" border="0">
					<TR>
						<TD class="tdgenap" width="25%">Search By</TD>
						<TD class="tdganjil">
							<asp:dropdownlist id="cboSearch" runat="server">
								<asp:ListItem Value="CustomerName">Customer Name</asp:ListItem>
								<asp:ListItem Value="AgreementNo">Agreement No</asp:ListItem>
								<asp:ListItem Value="AOName">MO Name</asp:ListItem>
							</asp:dropdownlist>&nbsp;
							<asp:textbox id="txtSearch" runat="server" cssclass="inptype" Width="50%"></asp:textbox>
							<asp:RequiredFieldValidator id="reqTxtSearch" Runat="server" Display="Dynamic" ErrorMessage="Please Enter Search Criteria"
								ControlToValidate="txtSearch"></asp:RequiredFieldValidator></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
					<TR>
						<TD align="right" width="50%">
							<asp:imagebutton id="imbSearch" runat="server" imageurl="../Images/ButtonSearch.gif" PostBackUrl="DocumentList.aspx"></asp:imagebutton>
							<asp:imagebutton id="imbReset" runat="server" imageurl="../Images/ButtonReset.gif" CausesValidation="False"  PostBackUrl="DocumentList.aspx"></asp:imagebutton></TD>
					</TR>
				</TABLE>
				<BR>
			</asp:panel>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopi" align="center">PRINT DOCUMENT</TD>
						<TD class="tdtopikanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				
							<asp:GridView id="dtgPaging" runat="server" width="95%" CellPadding="2" autogeneratecolumns="False"
								allowsorting="True" DataSourceID="XmlDataSource1">
								<Columns>
									<asp:TemplateField SortExpression="AgreementNo" HeaderText="AGREEMENT NO">
										<ItemStyle HorizontalAlign="Left" Width="12%"></ItemStyle>
										<ItemTemplate>
											<asp:hyperlink id=lnkAgreementNo runat="server" text="xxxxx20xxxxx">
											</asp:hyperlink>
											<asp:Label ID="lblApplicationID" Runat=server Visible=False text="xxxxx20xxxxx">
											</asp:Label>
										</ItemTemplate>
									</asp:TemplateField>
									<asp:TemplateField SortExpression="CustomerName" HeaderText="CUSTOMER NAME">
										<ItemStyle HorizontalAlign="Left" Width="20%"></ItemStyle>
										<ItemTemplate>
											<asp:hyperlink id=lnkCustomerName runat="server" text="xxxxx50xxxxx">
											</asp:hyperlink>
										</ItemTemplate>
									</asp:TemplateField>
									<asp:TemplateField SortExpression="EmployeeName" HeaderText="MO NAME">
										<ItemStyle HorizontalAlign="Left" Width="15%"></ItemStyle>
										<ItemTemplate>
											<asp:HyperLink id=lnkEmployeeName Runat="server" text="xxxxx50xxxxx">
											</asp:HyperLink>
										</ItemTemplate>
									</asp:TemplateField>
									<asp:TemplateField HeaderText="ACTION">
										<ItemStyle HorizontalAlign="Center" Width="8%"></ItemStyle>
										<ItemTemplate>
											<asp:LinkButton id="lnkAction" Runat="server" CausesValidation="false" text="Print" CommandName="View" PostBackUrl="DocumentListDetail.aspx">Print</asp:LinkButton>
										</ItemTemplate>
									</asp:TemplateField>
									<asp:TemplateField Visible="False" HeaderText="CUSTOMER ID">
										<ItemStyle HorizontalAlign="Center"></ItemStyle>
										<ItemTemplate>
											<asp:Label id=lblCustomerID Runat="server" text="xxxxx20xxxxx">
											</asp:Label>
										</ItemTemplate>
									</asp:TemplateField>
									<asp:TemplateField Visible="False" HeaderText="MOID">
										<ItemStyle HorizontalAlign="Center"></ItemStyle>
										<ItemTemplate>
											<asp:Label id=lblAOID Runat="server" text="xxxxx20xxxxx">
											</asp:Label>
										</ItemTemplate>
									</asp:TemplateField>
									<asp:TemplateField Visible="False" HeaderText="CustomerType">
										<ItemStyle HorizontalAlign="Center"></ItemStyle>
										<ItemTemplate>
											<asp:Label id=lblCustomerType Runat="server" text="xx3xx">
											</asp:Label>
										</ItemTemplate>
									</asp:TemplateField>
									<asp:TemplateField Visible="False" HeaderText="GuarantorID">
										<ItemStyle HorizontalAlign="Center"></ItemStyle>
										<ItemTemplate>
											<asp:Label id="lblGuarantorID" Runat="server" text="xxxxx20xxxxx">
											</asp:Label>
										</ItemTemplate>
									</asp:TemplateField>
									<asp:TemplateField Visible="False" HeaderText="Spouse">
										<ItemStyle HorizontalAlign="Center"></ItemStyle>
										<ItemTemplate>
											<asp:Label id="lblSpouse" Runat="server" text="xxxxx50xxxxx">
											</asp:Label>
										</ItemTemplate>
									</asp:TemplateField>						
								</Columns>
								<HeaderStyle CssClass="tdjudul" />
					<AlternatingRowStyle CssClass="tdgenap" />

							</asp:GridView >
							<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
		</asp:XmlDataSource>

				<TABLE height="25" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD align="center" width="30">
							<asp:imagebutton id="imbFirstPage" runat="server" imageurl="../Images/butkiri1.gif" commandname="First"
								 causesvalidation="False"></asp:imagebutton></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbPrevPage" runat="server" imageurl="../Images/butkiri.gif" commandname="Prev"
								 causesvalidation="False"></asp:imagebutton></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbNextPage" runat="server" imageurl="../Images/butkanan.gif" commandname="Next"
								 causesvalidation="False"></asp:imagebutton></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbLastPage" runat="server" imageurl="../Images/butkanan1.gif" commandname="Last"
								 causesvalidation="False"></asp:imagebutton></TD>
						<TD style="WIDTH: 247px" align="center" width="247">Page&nbsp;
							<asp:textbox id="txtGoPage" runat="server" width="34px" cssclass="inptype" maxlength="9">1</asp:textbox>
							<asp:imagebutton id="imbGoPage" runat="server" imageurl="../Images/butgo.gif" imagealign="AbsBottom"
								enableviewstate="False"></asp:imagebutton>
							<asp:RangeValidator id="rgvGo" runat="server" ErrorMessage="Page is not valid" ControlToValidate="txtGoPage"
								enableviewstate="False" Font-Size="Smaller" maximumvalue="999999999" MinimumValue="1" type="Integer"></asp:RangeValidator></TD>
						<TD align="right"><FONT color="#999999">Page
								<asp:label id="lblPage" runat="server">x</asp:label>&nbsp;of
								<asp:label id="lblTotPage" runat="server">y</asp:label>, Total&nbsp;
								<asp:label id="lblTotRec" runat="server">99</asp:label>&nbsp;record(s)</FONT>
						</TD>
					</TR>
				</TABLE>
			<br>
			</div>
			</form>
	</body>
</HTML>
