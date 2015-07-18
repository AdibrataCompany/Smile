<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>PremToCustRateCust</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
				<link rel="stylesheet" type="text/css" href="../Confins.css">
				</HEAD>
	<body ms_positioning="GridLayout">
		<form id="Form1" method="post" runat="server">
			<table cellSpacing="0" cellPadding="0" width="95%" border="0">
				<tr>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;
						</td>
				</tr>
			</table>
			<asp:panel id="pnlTop" runat="server" width="100%">
				<asp:Panel id="pnlList" runat="server" width="100%" horizontalalign="center">
					<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
					<TR class="trtopiabu">
					<TD class="tdtopiabukiri" width="10" height="20">&nbsp;</TD>
					<TD class="tdtopiabu" align="center">INSURANCE STANDARD RATE&nbsp;SETTING</TD>
					<TD class="tdtopiabukanan" width="10">&nbsp;</TD>
					</TR>
					</TABLE>
					<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" border="0">
					<TR>
					<TD class="tdgenap" width="25%">Branch</TD>
					<TD class="tdganjil">Jakarta Electronic</TD>
					</TR>
					<TR>
					<TD class="tdgenap" width="25%">Search By</TD>
					<TD class="tdganjil">
					<asp:DropDownList id="cboSearch" runat="server">
						<asp:ListItem value="InsuranceType">Insurance Asset Type
						</asp:ListItem>
						<asp:ListItem value="UsageID">Asset Usage</asp:ListItem>
						<asp:ListItem value="NewUsed">New / Used</asp:ListItem>
						<asp:ListItem value="CoverageType">Coverage Type
						</asp:ListItem>
					</asp:DropDownList>
					&nbsp;
					<asp:TextBox id="txtSearch" runat="server" cssclass="inptype">
					</asp:TextBox>
					</TD>
					</TR>
					<TR>
					<TD class="tdgenap" width="25%">INSURANCE RATE TYPE</TD>
					<TD class="tdganjil">Month</TD>
					</TR>
					<TR>
					<TD class="tdgenap" width="25%">Copy Rate From Branch</TD>
					<TD class="tdganjil">
					<asp:TextBox runat="server" id="TextBox1" CssClass="inptype">
					</asp:TextBox>
					<asp:ImageButton runat="server" id="ImageButton1" ImageUrl="../images/IconDetail.gif" />
					<asp:ImageButton id="ImgCopyButton" runat="server" ImageUrl="../images/ButtonCopy.gif" CausesValidation="False" />
					</TD>
					</TR>
					</TABLE>
					<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
					<TR>
					<TD width="50%" height="30">&nbsp;</TD>
					<TD align="right" width="50%">
					<asp:ImageButton id="imbSearch" runat="server" CausesValidation="False" imageurl="../images/ButtonSearch.gif" />
					<asp:ImageButton id="imbReset" runat="server" CausesValidation="False" imageurl="../images/ButtonReset.gif" />
					</TD>
					</TR>
					</TABLE>
					<BR>
					<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
					<TR class="trtopiabu">
					<TD class="tdtopiabukiri" width="10" height="20">&nbsp;</TD>
					<TD class="tdtopiabu" align="center">INSURANCE STANDARD RATE&nbsp;SETTING</TD>
					<TD class="tdtopiabukanan" width="10">&nbsp;</TD>
					</TR>
					</TABLE>
					<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
					<TR>
					<TD>
					<asp:DataGrid id="dtgPaging" runat="server" width="100%" cssclass="tablegrid" allowsorting="True" autogeneratecolumns="False" borderwidth="0px" cellpadding="3" cellspacing="1" DataSourceID="XmlRate">
						<AlternatingItemStyle CssClass="tdgenap" />
						<ItemStyle CssClass="tdganjil" />
						<HeaderStyle HorizontalAlign="Center" CssClass="tdjudul" />
						<Columns>
							<asp:templatecolumn HeaderText="INS. ASSET TYPE">
								<ItemTemplate>
									<asp:Label runat="server" Text='<%# Eval("valstring3") %>' id="lblassettype">
									</asp:Label>
								</ItemTemplate>
							</asp:templatecolumn>
							<asp:templatecolumn HeaderText="ASSET USAGE">
								<ItemTemplate>
									<asp:Label runat="server" Text='<%# Eval("valstring50") %>' id="lblusage">
									</asp:Label>
								</ItemTemplate>
							</asp:templatecolumn>
							<asp:templatecolumn HeaderText="NEW/USED">
								<ItemTemplate>
									<asp:Label runat="server" Text='<%# Eval("valstring3") %>' id="lblused">
									</asp:Label>
								</ItemTemplate>
							</asp:templatecolumn>
							<asp:templatecolumn HeaderText="COVERAGE TYPE">
								<ItemTemplate>
									<asp:Label runat="server" Text='<%# Eval("valstring3") %>' id="lblcoverage">
									</asp:Label>
								</ItemTemplate>
							</asp:templatecolumn>
							<asp:templatecolumn HeaderText="CURRENCYID">
								<ItemTemplate>
									<asp:Label runat="server" Text='<%# Eval("valstring3") %>' id="lblcurrency">
									</asp:Label>
								</ItemTemplate>
							</asp:templatecolumn>
							<asp:templatecolumn HeaderText="MONTH">
								<ItemTemplate>
									<asp:Label runat="server" Text='<%# Eval("valid") %>' id="lblmonth">
									</asp:Label>
								</ItemTemplate>
							</asp:templatecolumn>
							<asp:templatecolumn HeaderText="RATE">
								<ItemStyle HorizontalAlign="Right" />
								<ItemTemplate>
									<asp:Label runat="server" Text='<%# Eval("valid") %>' id="lblrate">
									</asp:Label>
								</ItemTemplate>
							</asp:templatecolumn>
							<asp:templatecolumn HeaderText="SRCC RATE">
								<ItemStyle HorizontalAlign="Right" />
								<ItemTemplate>
									<asp:Label runat="server" Text='<%# Eval("valid") %>' id="lblsrcc">
									</asp:Label>
								</ItemTemplate>
							</asp:templatecolumn>
							<asp:templatecolumn HeaderText="FLOOD RATE">
								<ItemStyle HorizontalAlign="Right" />
								<ItemTemplate>
									<asp:Label runat="server" Text='<%# Eval("valid") %>' id="lblflood">
									</asp:Label>
								</ItemTemplate>
							</asp:templatecolumn>
							<asp:templatecolumn HeaderText="SUM INSURED PERCENTAGE">
								<ItemStyle HorizontalAlign="Right" />
								<ItemTemplate>
									<asp:Label runat="server" Text='<%# Eval("valid") %>' id="lblsuminsured">
									</asp:Label>
								</ItemTemplate>
							</asp:templatecolumn>
							<asp:templatecolumn HeaderText="EDIT">
								<ItemStyle HorizontalAlign="Center" />
								<ItemTemplate>
									<asp:ImageButton id="imgEdit" runat="server" causesvalidation="False" imageurl="../images/IconEdit.gif" commandname="Edit" PostBackUrl="InsStdPremMonthEdit.aspx" />
								</ItemTemplate>
							</asp:templatecolumn>
							<asp:templatecolumn HeaderText="DELETE">
								<ItemStyle HorizontalAlign="Center" />
								<ItemTemplate>
									<asp:ImageButton id="imbDelete" runat="server" causesvalidation="False" imageurl="../images/IconDelete.gif" commandname="Delete" />
								</ItemTemplate>
							</asp:templatecolumn>
						</Columns>
					</asp:DataGrid>
					<asp:XmlDataSource runat="server" ID="XmlRate" DataFile="../DataType.xml">
					</asp:XmlDataSource>
					</TD>
					</TR>
					</TABLE>
					<TABLE height="25" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
					<TD align="center" width="30">
					<asp:ImageButton id="imbFirstPage" runat="server" imageurl="../images/butkiri1.gif" causesvalidation="False" commandname="First" />
					</TD>
					<TD align="center" width="30">
					<asp:ImageButton id="imbPrevPage" runat="server" imageurl="../images/butkiri.gif" causesvalidation="False" commandname="Prev" />
					</TD>
					<TD align="center" width="30">
					<asp:ImageButton id="imbNextPage" runat="server" imageurl="../images/butkanan.gif" causesvalidation="False" commandname="Next" />
					</TD>
					<TD align="center" width="30">
					<asp:ImageButton id="imbLastPage" runat="server" imageurl="../images/butkanan1.gif" causesvalidation="False" commandname="Last" />
					</TD>
					<TD style="WIDTH: 163px" align="center" width="163">Page&nbsp;
					<asp:TextBox id="txtGoPage" runat="server" width="34px" cssclass="inptype" maxlength="3">
					</asp:TextBox>
					<asp:ImageButton id="imbGoPage" runat="server" imageurl="../images/buttonGO.gif" enableviewstate="False" imagealign="AbsBottom" />
					</TD>
					<TD align="right">
					<FONT color="#999999">Page
					x&nbsp;of
					xx, Total&nbsp;
					xxx&nbsp;record(s)</FONT>
					</TD>
					</TR>
					</TABLE>
					<TABLE cellSpacing="3" cellPadding="1" width="95%" border="0">
					<TR>
					<TD align="left">
					 <a href="Report/RptInsStdRateMonth.htm"><img src="../Images/buttonPrint.gif" width="100" height="20" border="0"></a>    
					</TD>
					<TD align="right">
					<asp:ImageButton id="imbAdd" runat="server" imageurl="../images/ButtonAdd.gif" causesvalidation="False" PostBackUrl="InsStdPremMonthAdd.aspx" />
					<asp:ImageButton id="imbBack" runat="server" imageurl="../images/ButtonBack.gif" causesvalidation="False" PostBackUrl="InsuranceStandardPremium.aspx" />
					</TD>
					</TR>
					</TABLE>
					</BR>
				</asp:Panel>
							</asp:panel></form>
	</body>
</HTML>
