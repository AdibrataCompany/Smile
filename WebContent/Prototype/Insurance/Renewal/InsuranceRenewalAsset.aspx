<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>Insurance Renewal</title>
		<meta name="GENERATOR" content="Microsoft Visual Studio .NET 7.1">
		<meta name="CODE_LANGUAGE" content="Visual Basic .NET 7.1">
		<meta name="vs_defaultClientScript" content="JavaScript">
		<meta name="vs_targetSchema" content="http://schemas.microsoft.com/intellisense/ie5">
		<LINK href="../../Confins.css" type="text/css" rel="stylesheet">
		<script language="javascript">
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1)
			var ServerName = 'http://<%=Request.servervariables("SERVER_NAME")%>/';			
		</script>
		<SCRIPT src="../Elsa.js"></SCRIPT>
		<script>
			function directtoInsuranceRenewalProcess(strAppID,strAgrNo,strBranchID)
			{
				Response.Redirect("")
			}
		</script>
	</HEAD>
	<body>
		<form id="frmRenewal" method="post" runat="server">
			<asp:label id="lblMessage" runat="server" font-size="11px" font-name="Verdana" forecolor="#993300"></asp:label>
			<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR class="trtopi">
					<TD class="tdtopiabukiri" width="10" height="20">&nbsp;</TD>
					<TD class="tdtopiabu" align="center">INSURANCE RENEWAL</TD>
					<TD class="tdtopiabukanan" width="10">&nbsp;</TD>
				</TR>
			</TABLE>
			<table class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" align="center" border="0">
				<tr class="tdganjil" width="50%">
					<td class="tdgenap" style="width: 20%">Application ID</td>
					<td class="tdganjil" style="width: 30%">
					<asp:HyperLink ID="hypApplicationID" NavigateUrl="../../ViewApplication.htm" runat="server" Target="_blank" Text="Application0001"></asp:HyperLink>
      				</td>
					<td class="tdgenap" style="width: 20%">Customer Name</td>
					<td class="tdganjil" style="width: 30%">
					<asp:HyperLink ID="hypCustomerName" text="CompanyCustomer0001" runat="server" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target= _blank></asp:HyperLink>
					</td>
				</tr>
				<tr class="tdganjil" width="50%">
					<td class="tdgenap" style="width: 20%">Agreement No</td>
					<td class="tdganjil" style="width: 30%">
					<a href="../../Credit/ViewAgreement.htm" target="_blank">
					xxxxx20xxxxx</a></td>
					<td class="tdgenap" style="width: 20%">Currency</td>
					<td class="tdganjil" width="40%">
					IDR</td>
				</tr>
				<tr class="tdganjil" width="50%">
					<td class="tdgenap" style="width: 20%">Search By</td>
					<td class="tdganjil" style="width: 30%">
					<asp:DropDownList runat="server" id="ddlSearchBy">
						<asp:ListItem>Asset Description</asp:ListItem>
						<asp:ListItem>Coverage</asp:ListItem>
						<asp:ListItem>New Used</asp:ListItem>
						<asp:ListItem>Usage</asp:ListItem>
					</asp:DropDownList>
						<asp:TextBox runat="server" id="txtSearchBy" CssClass="inptype" Width="100px">
					</asp:TextBox>
					</td>
					<td class="tdgenap" style="width: 20%">Insurance Company</td>
					<td class="tdganjil" style="width: 30%">
					<asp:DropDownList runat="server" id="ddlInsCo">
						<asp:ListItem>Select One</asp:ListItem>
					</asp:DropDownList>
					&nbsp;
						</td>
				</tr>
				<tr class="tdganjil" width="50%">
					<td class="tdgenap" style="width: 20%">End Date</td>
					<td class="tdganjil" style="width: 30%">
					<asp:TextBox runat="server" id="txtEndDate" CssClass="inptype" Width="100px">
					</asp:TextBox>
					&nbsp;<asp:Image runat="server" id="imgCalendar" ImageUrl="../../images/iconCalendar.gif" /><td class="tdgenap" style="width: 20%">
					&nbsp;</td>
					<td class="tdganjil" style="width: 30%">
					&nbsp;</td>
				</tr>
			</table>
			<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR>
					<TD>
						<DIV align="right"><asp:imagebutton id="ImbSearch" Runat="server" ImageUrl="../../Images/ButtonSearch.gif" causesvalidation="true"></asp:imagebutton>
							<asp:imagebutton id="ImbReset" Runat="server" ImageUrl="../../Images/ButtonReset.gif" causesvalidation="false"></asp:imagebutton></DIV>
					</TD>
				</TR>
			</TABLE>
			<br />
			<asp:panel id="PnlGrid" runat="server">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR class="trtopi">
				<TD class="tdtopiabukiri" width="10" height="20">&nbsp;</TD>
				<TD class="tdtopiabu" align="center">INSURANCE RENEWAL 
						ASSET LISTING</TD>
				<TD class="tdtopiabukanan" width="10">&nbsp;</TD>
				</TR>
				</TABLE>
				<div align="center">
					<asp:GridView runat="server" id="grdRenewal" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
						<Columns>
							<asp:boundfield DataField="valNo" HeaderText="ASSET NO" SortExpression="valNo">
								<ItemStyle HorizontalAlign="Center" />
							</asp:boundfield>
							<asp:boundfield DataField="valstring50" HeaderText="ASSET DESCRIPTION" SortExpression="valstring50">
							</asp:boundfield>
							<asp:boundfield DataField="valstring20" HeaderText="INSURANCE COMPANY" SortExpression="valstring20">
								<ItemStyle HorizontalAlign="Center" />
							</asp:boundfield>
							<asp:boundfield DataField="valdate" HeaderText="START DATE" SortExpression="valdate">
								<ItemStyle HorizontalAlign="Center" />
							</asp:boundfield>
							<asp:boundfield DataField="valdate" HeaderText="END DATE" SortExpression="valdate">
								<ItemStyle HorizontalAlign="Center" />
							</asp:boundfield>
							<asp:boundfield DataField="valstring3" HeaderText="COVERAGE" SortExpression="valstring3">
								<ItemStyle HorizontalAlign="Center" />
							</asp:boundfield>
							<asp:boundfield DataField="valstring3" HeaderText="NEW USED" SortExpression="valstring3">
							</asp:boundfield>
							<asp:boundfield DataField="valstring10" HeaderText="USAGE" SortExpression="valstring10">
							</asp:boundfield>
							<asp:templatefield HeaderText="INSURANCE">
								<AlternatingItemTemplate>
									<asp:HyperLink runat="server" id="hypInsurance" Text="Insurance" NavigateUrl="InsuranceRenewalProcess.aspx" />
								</AlternatingItemTemplate>
								<ItemTemplate>
									<asp:HyperLink runat="server" id="hypInsurance" Text="Insurance" NavigateUrl="InsuranceRenewalProcess.aspx" />
								</ItemTemplate>
								<ItemStyle HorizontalAlign="Center" />
							</asp:templatefield>
						</Columns>
						<HeaderStyle CssClass="tdjudulabu" />
						<AlternatingRowStyle CssClass="tdgenap" />
					</asp:GridView>
					<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
					</asp:XmlDataSource>
				</div>
				<table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
					<tr>
						<td width="30" align="center">
						<asp:ImageButton runat="server" id="BtnFirstPrev" ImageUrl="../../images/butkiri1.gif" Width="20px" />
						</td>
						<td width="30" align="center">
						<asp:ImageButton runat="server" id="BtnPrev" ImageUrl="../../images/butkiri.gif" />
						</td>
						<td width="30" align="center">
						<asp:ImageButton runat="server" id="BtnNext" ImageUrl="../../images/butkanan.gif" Width="20px" />
						</td>
						<td width="30" align="center">
						<asp:ImageButton runat="server" id="BtnLastNext" ImageUrl="../../images/butkanan1.gif" />
						</td>
						<td width="130" align="center">Page&nbsp;
						<asp:TextBox runat="server" id="TbnPage" Width="20px" CssClass="inptype">
						</asp:TextBox>
						&nbsp;&nbsp;
						<asp:ImageButton runat="server" id="BtnGo" ImageUrl="../../images/buttonGO.gif" />
						</td>
						<td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
					</tr>
				</table>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR height="20px">
				<TD>&nbsp;</TD>
				</TR>
				<TR height="20px">
				<TD>
				<DIV align="left">
				<asp:ImageButton id="imbBack" Runat="server" ImageUrl="../../Images/ButtonBack.gif" PostBackUrl="InsuranceRenewal.aspx" causesvalidation="false" />
				</DIV>
				</TD>
				</TR>
				</TABLE>
			</asp:panel>
		</form>
	</body>
</HTML>
