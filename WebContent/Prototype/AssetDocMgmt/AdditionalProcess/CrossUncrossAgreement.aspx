<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>CrossUncrossAgreement</title>
		<meta content="Microsoft Visual Studio.NET 7.0" name="GENERATOR">
		<meta content="Visual Basic 7.0" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript"/>
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema"/>
		<LINK href="../../Confins.css" type="text/css" rel="stylesheet">
		<script type="text/javascript" src="../../Elsa.js"></script>
		<script language="javascript">
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1)
			var ServerName = 'http://<%=Request.servervariables("SERVER_NAME")%>:' + '<%= Request.ServerVariables("SERVER_PORT")%>' + '/';			
		</script>
	</head>
	<body vLink="blue" aLink="black" link="blue" ms_positioning="GridLayout">
		<form id="Form1" method="post" runat="server">
			&nbsp;
			<asp:label id="lblMessage" runat="server" font-size="11px" font-name="Verdana" forecolor="#993300"></asp:label>
				<TABLE cellspacing="0" cellpadding="0" width="95%" align="center" border="0">
					<tr>
						<TD class="tdtopimerahkiri" width="10" height="20">&nbsp;</td>
						<TD class="tdtopimerah" align="center">CROSS AGREEMENT
						</td>
						<TD class="tdtopimerahkanan" width="10">&nbsp;</td>
					</tr>
				</TABLE>
				<TABLE class="tablegrid" cellspacing="1" cellpadding="3" width="95%" align="center" border="0">
					<tr>
						<TD class="tdgenap" width="20%" height="20">&nbsp;Branch</td>
						<TD class="tdganjil" align="left" width="80%">
							<asp:DropDownList id="cbobranch" runat="server">
								<asp:ListItem>Select One</asp:ListItem>
							</asp:DropDownList>
							<asp:requiredfieldvalidator id="rfvcbobranchid" runat="server" InitialValue="0" ErrorMessage="Please Select Branch"
								ControlToValidate="cbobranch" Display="Dynamic"></asp:requiredfieldvalidator>							
							</td>
						</tr>
					<tr>
						<TD class="tdgenap" width="20%" height="20">&nbsp;Search By</td>
						<TD class="tdganjil" align="left" width="80%">
							<asp:DropDownList id="cboSearchBy" runat="server">
								<asp:ListItem Value="0" Selected="True">Select One</asp:ListItem>
								<asp:ListItem Value="AgreementNo">Agreement No</asp:ListItem>
								<asp:ListItem Value="ApplicationID">Application ID</asp:ListItem>
								<asp:ListItem Value="Name">Customer Name</asp:ListItem>
							</asp:DropDownList>
							<asp:TextBox id="txtSearchBy" cssclass="inptype" runat="server"></asp:TextBox></td>
						</tr>
				</TABLE>
				<TABLE cellspacing="0" cellpadding="0" width="95%" align="center" border="0">
					<tr>
						<td>
							<DIV align="right">
								<asp:imagebutton id="imgsearch" runat="server" width="100" height="20" imageurl="../../Images/ButtonSearch.gif"></asp:imagebutton>
								<asp:imagebutton id="imbReset" runat="server" imageurl="../../Images/ButtonReset.gif" causesvalidation="False"></asp:imagebutton></DIV>
						</td>
					</tr>
				</TABLE>
				<TABLE cellspacing="0" cellpadding="0" width="95%" align="center" border="0">
					<TR>
						<TD class="tdtopimerahkiri" width="10" height="20">&nbsp;</td>
						<TD class="tdtopimerah" align="center">AGREEMENT LIST</td>
						<TD class="tdtopimerahkanan" width="10">&nbsp;</td>
					</tr>
				</TABLE>
				<div align="center">
					<asp:GridView runat="server" id="grdAgreement" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
						<Columns>
							<asp:templatefield HeaderText="APPLICATION ID">
								<AlternatingItemTemplate>
									<asp:HyperLink runat="server" id="LinkId" NavigateUrl="../../Credit/ViewApplication.htm" Target="_blank">xxxxx20xxxxx
									</asp:HyperLink>
								</AlternatingItemTemplate>
								<ItemTemplate>
									<asp:HyperLink runat="server" id="LinkId" NavigateUrl="../../Credit/ViewApplication.htm" Target="_blank">xxxxx20xxxxx
									</asp:HyperLink>
								</ItemTemplate>
							</asp:templatefield>
							<asp:templatefield HeaderText="AGREEMENT NO">
								<AlternatingItemTemplate>
									<asp:HyperLink runat="server" id="lnkAgreementNo" NavigateUrl="../../Credit/ViewAgreement.htm" Target="_blank">xxxxx20xxxxx
									</asp:HyperLink>
								</AlternatingItemTemplate>
								<ItemTemplate>
									<asp:HyperLink runat="server" id="lnkAgreementNo" NavigateUrl="../../Credit/ViewAgreement.htm" Target="_blank">xxxxx20xxxxx
									</asp:HyperLink>
								</ItemTemplate>
							</asp:templatefield>
							<asp:templatefield HeaderText="NAME">
								<AlternatingItemTemplate>
									<asp:HyperLink runat="server" id="lnkCustName" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxx30xxxxx
									</asp:HyperLink>
								</AlternatingItemTemplate>
								<ItemTemplate>
									<asp:HyperLink runat="server" id="lnkCustName" NavigateUrl="../../Credit/ViewCompanyCustomer.htm" Target="_blank">xxxxx30xxxxx
									</asp:HyperLink>
								</ItemTemplate>
							</asp:templatefield>
							<asp:boundfield DataField="valstring50" HeaderText="ADDRESS" SortExpression="valstring50">
							</asp:boundfield>
							<asp:boundfield DataField="valstring3" HeaderText="STEP" SortExpression="valstring3">
							</asp:boundfield>
							<asp:boundfield DataField="valstring3" HeaderText="STATUS" SortExpression="valstring3">
							</asp:boundfield>
							<asp:boundfield DataField="valstring3" HeaderText="CURR" SortExpression="valstring3">
							</asp:boundfield>
							<asp:boundfield DataField="valamount" HeaderText="INSTALLMENT" SortExpression="valamount">
								<ItemStyle HorizontalAlign="Right" />
							</asp:boundfield>
							<asp:templatefield HeaderText="ACTION">
								<AlternatingItemTemplate>
									<asp:HyperLink runat="server" id="hypEdit" NavigateUrl="CrossAgreementEdit.aspx" Text="Edit" />
								</AlternatingItemTemplate>
								<ItemTemplate>
									<asp:HyperLink runat="server" id="hypEdit" NavigateUrl="CrossUncrossAgreementEdit.aspx" Text="Edit" />
								</ItemTemplate>
								<ItemStyle HorizontalAlign="Center" />
							</asp:templatefield>
						</Columns>
						<HeaderStyle CssClass="tdjudulmerah" />
						<AlternatingRowStyle CssClass="tdgenap" />
					</asp:GridView>
					<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
					</asp:XmlDataSource>
				</div>
				<TABLE height="25" cellspacing="0" cellpadding="0" width="95%" align="center" border="0">
					<tr>
						<td>
							<asp:imagebutton id="imbFirstPage" runat="server" imageurl="../../images/butkiri1.gif"
								commandname="First"></asp:imagebutton>&nbsp;&nbsp;
							<asp:imagebutton id="imbPrevPage" runat="server" imageurl="../../images/butkiri.gif"
								commandname="Prev"></asp:imagebutton>&nbsp;&nbsp;
							<asp:imagebutton id="imbNextPage" runat="server" imageurl="../../images/butkanan.gif"
								commandname="Next"></asp:imagebutton>&nbsp;&nbsp;
							<asp:imagebutton id="imbLastPage" runat="server" imageurl="../../images/butkanan1.gif"
								commandname="Last"></asp:imagebutton></td>
						<TD align="center" width="130">Page
							<asp:textbox id="txtpage" runat="server" width="54px" maxlength="7" CssClass="inptype" >
						1</asp:textbox>&nbsp;
							<asp:imagebutton id="imbGoPage" runat="server" width="30" imageurl="../../images/butgo.gif" cssclass="inptype"></asp:imagebutton></td>
						<asp:rangevalidator id="rgvGo" runat="server" controltovalidate="txtpage" minimumvalue="1" errormessage="*"
							maximumvalue="999999999" type="Integer"></asp:rangevalidator>
						<asp:requiredfieldvalidator id="rfvGo" runat="server" controltovalidate="txtpage" errormessage="*"></asp:requiredfieldvalidator>
						&nbsp;&nbsp;
						<TD align="right"><FONT color="#999999">Page
								<asp:label id="lblPage" runat="server" forecolor="#999999"></asp:label>
						&nbsp;of
								<asp:label id="lblTotPage" runat="server" forecolor="#999999"></asp:label>
						, 
								Total
								<asp:label id="lblRecord" runat="server" forecolor="#999999"></asp:label>
						&nbsp;record(s)</FONT></td>
					</tr>
				</TABLE>
			</form>
	</body>
</html>
