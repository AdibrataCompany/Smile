<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>MOUList</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../Confins.css" type="text/css" rel="stylesheet">
		<SCRIPT src="../Elsa.js"></SCRIPT>
		<script language="JavaScript">
		function OpenCust(CustomerID,pStyle){ 
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1);
			window.open('http://<%=Request.servervariables("SERVER_NAME")%>/' + App + '/AccAcq/Credit/ViewPersonalCustomer.aspx?Style=' + pStyle + '&CustomerID=' + CustomerID, 'UserLookup', 'left=0, top=0, width=700, height=600, menubar=0, scrollbars=yes');
			}
		function OpenMOU(pMOUNO,pStyle){ 
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1);
			window.open('http://<%=Request.servervariables("SERVER_NAME")%>/' + App + '/AccAcq/MOU/ViewMOU.aspx?Style=' + pStyle + '&MOUNO=' + pMOUNO, 'UserLookup', 'left=0, top=0, width=700, height=600, menubar=0, scrollbars=yes');
			}
		</script>
	</HEAD>
	<body MS_POSITIONING="GridLayout">
		<form id="Form1" method="post" runat="server">
			<TABLE cellSpacing="0" cellPadding="0" width="100%" border="0">
				<tr>
					<td align="center">
						<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
							<TR>
								<td><asp:label id="lblMessage" ForeColor="red" Runat="server"></asp:label></td>
								<td><asp:rangevalidator id="rgvGo" runat="server" ErrorMessage="Page No. is not valid!" MinimumValue="1"
										maximumValue="999999" Type="integer" ControlToValidate="txtGoPage"></asp:rangevalidator></td>
							</TR>
						</TABLE>
						<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
							<TR class="trtopi">
								<TD class="tdtopihijaukiri" width="10" height="20"></TD>
								<TD class="tdtopihijau" align="center">MOU 
								MAINTENANCE</TD>
								<TD class="tdtopihijaukanan" width="10"></TD>
							</TR>
						</TABLE>
						<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" border="0">
							<TR>
								<TD class="tdgenap" width="25%">Search By</TD>
								<TD class="tdganjil"><asp:dropdownlist id="cboSearch" Runat="server">
										<asp:ListItem Value="MouNo">MOU No</asp:ListItem>								
										<asp:ListItem Value="Name">Customer Name</asp:ListItem>
										<asp:ListItem Value="Address">Address</asp:ListItem>
									</asp:dropdownlist>&nbsp;
									<asp:textbox id="txtSearch" Runat="server" Width="65%" CssClass="inptype"></asp:textbox></TD>
							</TR>
							<TR>
								<TD class="tdgenap" width="25%">MOU Status</TD>
								<TD class="tdganjil"><asp:dropdownlist id="cboMOUStatus" Runat="server">
										<asp:ListItem Value="All">All</asp:ListItem>
										<asp:ListItem Value="REQ">Request
										</asp:ListItem>
										<asp:ListItem Value="APR">Approved
										</asp:ListItem>
										<asp:ListItem Value="RJC">Rejected
										</asp:ListItem>
										<asp:ListItem Value="LIV">Active
										</asp:ListItem>
									</asp:dropdownlist>
								</TD>
							</TR>
							<TR>
								<TD class="tdgenap" width="25%">Expired</TD>
								<TD class="tdganjil">
								<asp:dropdownlist id="ddlExpired" Runat="server">
										<asp:ListItem Value="All">All</asp:ListItem>
										<asp:ListItem Value="Y">Yes</asp:ListItem>
										<asp:ListItem Value="N">No</asp:ListItem>
									</asp:dropdownlist>
								</TD>
							</TR>
							<TR>
								<TD class="tdgenap" width="25%">Expired Date &gt;=</TD>
								<TD class="tdganjil">
								<asp:TextBox runat="server" id="txtExpiredDate" CssClass="inptype" Width="100px">
								</asp:TextBox>
								&nbsp;<asp:Image runat="server" id="imgCalendar" ImageUrl="../images/iconCalendar.gif" /></TD>
							</TR>
						</TABLE>
						<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
							<TR>
								<TD align="right">
									<asp:imagebutton id="imbSearch" Runat="server" CausesValidation="False" ImageUrl="../Images/ButtonSearch.gif"></asp:imagebutton>
									<asp:imagebutton id="imbReset" Runat="server" CausesValidation="False" ImageUrl="../Images/ButtonReset.gif"></asp:imagebutton>
								</TD>
							</TR>
						</TABLE>
					</td>
				</tr>
			</TABLE>
			<asp:panel id="pnlList" Runat="server" Width="100%" HorizontalAlign="center">
				<BR>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
				<TR class="trtopi">
				<TD class="tdtopihijaukiri" width="10" height="20"></TD>
				<TD class="tdtopihijau" align="center">MOU LISTING</TD>
				<TD class="tdtopihijaukanan" width="10"></TD>
				</TR>
				</TABLE>
				<asp:GridView Width="95%" runat="server" id="grdMou" DataSourceID="XmlDataSource2" AutoGenerateColumns="False">
					<Columns>
						<asp:templatefield HeaderText="MOU NO">
							<ItemTemplate>
								<asp:HyperLink runat="server" id="hypMouNo" NavigateUrl="../Credit/ViewApplication.htm">xxxxx20xxxxx
								</asp:HyperLink>
							</ItemTemplate>
						</asp:templatefield>
						<asp:templatefield HeaderText="CUSTOMER NAME">
							<ItemTemplate>
								<asp:HyperLink runat="server" id="hypCustName" NavigateUrl="../Credit/ViewPersonalCustomer.htm">xxxxx30xxxxx
								</asp:HyperLink>
							</ItemTemplate>
						</asp:templatefield>
						<asp:boundfield DataField="valdate" HeaderText="MOU DATE" SortExpression="valdate">
							<ItemStyle HorizontalAlign="Center" />
						</asp:boundfield>
						<asp:boundfield DataField="valdate" HeaderText="EXPIRED DATE" SortExpression="valdate">
							<ItemStyle HorizontalAlign="Center" />
						</asp:boundfield>
						<asp:boundfield DataField="valYesNo" HeaderText="IS PLAFOND" SortExpression="valYesNo">
							<ItemStyle HorizontalAlign="Center" />
						</asp:boundfield>
						<asp:boundfield DataField="valamount" HeaderText="PLAFOND AMOUNT" SortExpression="valamount">
							<ItemStyle HorizontalAlign="Right" />
						</asp:boundfield>
						<asp:boundfield DataField="valamount" HeaderText="REALISATION AMOUNT" SortExpression="valamount">
							<ItemStyle HorizontalAlign="Right" />
						</asp:boundfield>
						<asp:boundfield DataField="valstring10" HeaderText="STATUS" SortExpression="valstring10">
						</asp:boundfield>
						<asp:templatefield HeaderText="ADJUST PLAFOND">
							<ItemTemplate>
								<asp:HyperLink runat="server" id="hypAdjust" Text="Adjust" NavigateUrl="MouAdjustPlafond.aspx" />
							</ItemTemplate>
							<ItemStyle HorizontalAlign="Center" />
						</asp:templatefield>
						<asp:templatefield HeaderText="EDIT">
							<ItemTemplate>
								<asp:ImageButton runat="server" id="hypEdit" ImageUrl="../images/iconEdit.gif" PostbackUrl="MouEdit.aspx" />
							</ItemTemplate>
							<ItemStyle HorizontalAlign="Center" />
						</asp:templatefield>
					</Columns>
					<HeaderStyle CssClass="tdjudulhijau" />
					<AlternatingRowStyle CssClass="tdgenap" />
				</asp:GridView>
				<asp:XmlDataSource runat="server" ID="XmlDataSource2" DataFile="../DataType.xml">
				</asp:XmlDataSource>
				<TABLE height="25" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR>
				<TD align="center" width="30">
				<asp:ImageButton id="imbFirstPage" runat="server" ImageUrl="../Images/butkiri1.gif" CausesValidation="False" />
				</TD>
				<TD align="center" width="30">
				<asp:ImageButton id="imbPrevPage" runat="server" ImageUrl="../Images/butkiri.gif" CausesValidation="False" />
				</TD>
				<TD align="center" width="30">
				<asp:ImageButton id="imbNextPage" runat="server" ImageUrl="../Images/butkanan.gif" CausesValidation="False" />
				</TD>
				<TD align="center" width="30">
				<asp:ImageButton id="imbLastPage" runat="server" ImageUrl="../Images/butkanan1.gif" CausesValidation="False" />
				</TD>
				<TD style="WIDTH: 163px" align="center" width="163">Page&nbsp;
				<asp:TextBox id="txtGoPage" runat="server" CssClass="inptype" Width="39px" MaxLength="4">
				</asp:TextBox>
				<asp:ImageButton id="imbGoPage" runat="server" ImageUrl="../Images/butgo.gif" EnableViewState="False" ImageAlign="AbsBottom" />
				</TD>
				<TD align="right">
				<FONT color="#999999">Page
				<asp:Label id="lblPage" runat="server"></asp:Label>
				&nbsp;of
				<asp:Label id="lblTotPage" runat="server"></asp:Label>
				, Total&nbsp;
				<asp:Label id="lblTotRec" runat="server"></asp:Label>
				&nbsp;record(s)</FONT>
				</TD>
				</TR>
				</TABLE>
				<br>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR>
				<TD align="left">
				<asp:ImageButton id="imbPrint" visible="True" runat="server" imageurl="../images/buttonprint.gif" />
				</TD>
				<TD align="right">
				<asp:ImageButton id="ImbAddNew" runat="server" imageurl="../Images/ButtonAdd.gif" PostBackUrl="MouAdd.aspx" />
				</TD>
				</TR>
				</TABLE>
			</asp:panel></form>
			</body>
</HTML>
