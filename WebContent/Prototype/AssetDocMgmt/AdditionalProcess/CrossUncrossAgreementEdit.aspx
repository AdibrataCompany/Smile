<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>CrossUncrossAgreementEdit</title>
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
			<asp:label id="lblMessage" runat="server" font-size="11px" font-name="Verdana" forecolor="#993300"></asp:label><asp:panel id="pnlList" runat="server">
				<TABLE cellspacing="0" cellpadding="0" width="95%" align="center" border="0">
				<tr>
					<TD class="tdtopimerahkiri" width="10" height="20">&nbsp;</TD>
					<TD class="tdtopimerah" align="center">CROSS AGREEMENT - EDIT
					</TD>
					<TD class="tdtopimerahkanan" width="10">&nbsp;</TD>
				</tr>
				</TABLE>
				<TABLE class="tablegrid" cellspacing="1" cellpadding="3" width="95%" align="center" border="0">
					<tr>
						<TD class="tdgenap" width="20%" height="20">&nbsp;Agreement No</td>
						<TD class="tdganjil" width="20%" height="20">
							<asp:Label id="lblAgreementNo" runat="server">xxxxx20xxxxx</asp:Label></td>
						<TD class="tdgenap" width="20%" height="20">&nbsp;Application ID</td>
						<TD class="tdganjil" width="20%" height="20">
							<asp:Label id="lblApplicationID" runat="server">xxxxx20xxxxx</asp:Label></td>
					</tr>
					<tr>
						<TD class="tdgenap" width="20%" height="20">&nbsp;Branch</td>
						<TD class="tdganjil" width="20%" height="20">
							<asp:Label id="lblBranch" runat="server">x3x</asp:Label></td>
						<TD class="tdgenap" width="20%" height="20">&nbsp;Customer Name</td>
						<TD class="tdganjil" width="20%" height="20">
							<asp:Label id="lblCustomerName" runat="server">xxxxx50xxxxx</asp:Label></td>
					</tr>
				</TABLE> <!-- CROSS DEFAULT --></asp:panel>
				<asp:panel id="pnlCrossDefault" runat="server"><br/>
				<TABLE cellspacing="0" cellpadding="0" width="95%" align="center" border="0">
					<TR class="trtopikuning">
						<TD class="tdtopimerahkiri" width="10" height="20">&nbsp;</td>
						<TD class="tdtopimerah" align="center">CROSS DEFAULT TO</td>
						<TD class="tdtopimerahkanan" width="10">&nbsp;</td>
					</tr>
				</TABLE>
					<div align="center">
						<asp:GridView runat="server" id="grdCrossDefault" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
							<Columns>
								<asp:boundfield DataField="valNo" HeaderText="NO" SortExpression="valNo">
									<ItemStyle HorizontalAlign="Center" />
								</asp:boundfield>
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
								<asp:boundfield DataField="valdate" HeaderText="AGREEMENT DATE" SortExpression="valdate">
									<ItemStyle HorizontalAlign="Center" />
								</asp:boundfield>
								<asp:boundfield DataField="valstring3" HeaderText="DEFAULT STATUS" SortExpression="valstring3">
									<ItemStyle HorizontalAlign="Center" />
								</asp:boundfield>
								<asp:boundfield DataField="valstring3" HeaderText="CONTRACT STATUS" SortExpression="valstring3">
									<ItemStyle HorizontalAlign="Center" />
								</asp:boundfield>
								<asp:templatefield HeaderText="DELETE">
									<AlternatingItemTemplate>
										<asp:ImageButton runat="server" ImageUrl="../../images/iconDelete.gif" PostbackUrl="CrossAgreementEdit.aspx" />
									</AlternatingItemTemplate>
									<ItemTemplate>
										<asp:ImageButton runat="server" ImageUrl="../../images/iconDelete.gif" PostbackUrl="CrossAgreementEdit.aspx" />
									</ItemTemplate>
									<ItemStyle HorizontalAlign="Center" />
								</asp:templatefield>
								<asp:templatefield HeaderText="EDIT">
									<AlternatingItemTemplate>
										<asp:HyperLink runat="server" id="hypEdit" NavigateUrl="CrossAgreementEdit.aspx" Text="Edit" />
									</AlternatingItemTemplate>
									<ItemTemplate>
										<asp:HyperLink runat="server" id="hypEdit" NavigateUrl="CrossAgreementEdit.aspx" Text="Edit" />
									</ItemTemplate>
									<ItemStyle HorizontalAlign="Center" />
								</asp:templatefield>
							</Columns>
							<HeaderStyle CssClass="tdjudulmerah" />
							<AlternatingRowStyle CssClass="tdgenap" />
						</asp:GridView>
					</div>
				<TABLE cellspacing="0" cellpadding="0" width="95%" align="center" border="0">
					<TR vAlign="bottom">
						<TD align="left">
							<asp:ImageButton id="imbPKAdd" runat="server" CausesValidation="False" ImageUrl="../../images/buttonadd.gif"
								visible="False"></asp:ImageButton>&nbsp;
							<asp:ImageButton id="imbPKShow" runat="server" CausesValidation="False" ImageUrl="../../images/ButtonShowDataAgree.gif"></asp:ImageButton></td>
					</tr>
				</TABLE>
			</asp:panel>
			<!-- CROSS COLLATERAL -->
			<asp:panel id="pnlCrossCollateral" runat="server">
			<br/>
				<TABLE cellspacing="0" cellpadding="0" width="95%" align="center" border="0">
					<TR class="trtopikuning">
						<TD class="tdtopimerahkiri" width="10" height="20">&nbsp;</td>
						<TD class="tdtopimerah" align="center">CROSS COLLATERAL TO</td>
						<TD class="tdtopimerahkanan" width="10">&nbsp;</td>
					</tr>
				</TABLE>
				<div align="center">
					<div align="center">
						<asp:GridView runat="server" id="grdCrossCollateral" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
							<Columns>
								<asp:boundfield DataField="valstring2" HeaderText="ASSET SEQ NO" SortExpression="valstring2">
									<ItemStyle HorizontalAlign="Center" />
								</asp:boundfield>
								<asp:templatefield HeaderText="AGREEMENT NO">
									<AlternatingItemTemplate>
										<asp:HyperLink runat="server" id="lnkAgreementNo0" NavigateUrl="../../Credit/ViewAgreement.htm" Target="_blank">xxxxx20xxxxx
										</asp:HyperLink>
									</AlternatingItemTemplate>
									<ItemTemplate>
										<asp:HyperLink runat="server" id="lnkAgreementNo1" NavigateUrl="../../Credit/ViewAgreement.htm" Target="_blank">xxxxx20xxxxx
										</asp:HyperLink>
									</ItemTemplate>
								</asp:templatefield>
								<asp:templatefield HeaderText="NAME">
									<AlternatingItemTemplate>
										<asp:HyperLink runat="server" id="lnkCustName0" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxx30xxxxx
										</asp:HyperLink>
									</AlternatingItemTemplate>
									<ItemTemplate>
										<asp:HyperLink runat="server" id="lnkCustName1" NavigateUrl="../../Credit/ViewCompanyCustomer.htm" Target="_blank">xxxxx30xxxxx
										</asp:HyperLink>
									</ItemTemplate>
								</asp:templatefield>
								<asp:boundfield DataField="valdate" HeaderText="AGREEMENT DATE" SortExpression="valdate">
									<ItemStyle HorizontalAlign="Center" />
								</asp:boundfield>
								<asp:boundfield DataField="valstring3" HeaderText="DEFAULT STATUS" SortExpression="valstring3">
									<ItemStyle HorizontalAlign="Center" />
								</asp:boundfield>
								<asp:boundfield DataField="valstring3" HeaderText="CONTRACT STATUS" SortExpression="valstring3">
									<ItemStyle HorizontalAlign="Center" />
								</asp:boundfield>
								<asp:templatefield HeaderText="DELETE">
									<AlternatingItemTemplate>
										<asp:ImageButton runat="server" ImageUrl="../../images/iconDelete.gif" PostbackUrl="CrossAgreementEdit.aspx" />
									</AlternatingItemTemplate>
									<ItemTemplate>
										<asp:ImageButton runat="server" ImageUrl="../../images/iconDelete.gif" PostbackUrl="CrossAgreementEdit.aspx" />
									</ItemTemplate>
									<ItemStyle HorizontalAlign="Center" />
								</asp:templatefield>
								<asp:templatefield HeaderText="EDIT">
									<AlternatingItemTemplate>
										<asp:HyperLink runat="server" id="hypEdit0" NavigateUrl="UncrossAgreementEdit.aspx" Text="Edit" />
									</AlternatingItemTemplate>
									<ItemTemplate>
										<asp:HyperLink runat="server" id="hypEdit1" NavigateUrl="UncrossAgreementEdit.aspx" Text="Edit" />
									</ItemTemplate>
									<ItemStyle HorizontalAlign="Center" />
								</asp:templatefield>
							</Columns>
							<HeaderStyle CssClass="tdjudulmerah" />
							<AlternatingRowStyle CssClass="tdgenap" />
						</asp:GridView>
					</div>
					<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
					</asp:XmlDataSource>
			</div>
				<TABLE cellspacing="0" cellpadding="0" width="95%" align="center" border="0">
					<TR vAlign="bottom">
						<TD align="left">
							<asp:ImageButton id="imbCCAdd" runat="server" CausesValidation="False" ImageUrl="../../images/buttonadd.gif"
								Visible="False"></asp:ImageButton>&nbsp;
							<asp:ImageButton id="imbCCShow" runat="server" CausesValidation="False" ImageUrl="../../images/ButtonShowDataAgree.gif"></asp:ImageButton></td>
					</tr>
				</TABLE>
			</asp:panel><asp:panel id="pnlSave" runat="server"><br/>
				<TABLE cellspacing="0" cellpadding="0" width="95%" align="center" border="0">
					<TR vAlign="bottom">
						<TD align="right">
							<asp:ImageButton id="imbSave" runat="server" CausesValidation="False" ImageUrl="../../images/buttonsave.gif" PostBackUrl="CrossUncrossAgreement.aspx"></asp:ImageButton>&nbsp;
							<asp:ImageButton id="imbCancel" runat="server" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="CrossUncrossAgreement.aspx"></asp:ImageButton>&nbsp;
						</td>
					</tr>
				</TABLE>
			</asp:panel></form>
	</body>
</html>
