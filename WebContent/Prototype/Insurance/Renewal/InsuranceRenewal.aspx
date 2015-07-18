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
		<form id="Form1" method="post" runat="server">
			<br>
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
					<td class="tdgenap" style="width: 20%">Branch</td>
					<td class="tdganjil" style="width: 30%">
						<asp:DropDownList runat="server" id="ddlBranch">
							<asp:ListItem>Select One</asp:ListItem>
						</asp:DropDownList>
					</td>
					<td class="tdgenap" style="width: 20%">Insurance Company</td>
					<td class="tdganjil" width="40%">
					<asp:DropDownList runat="server" id="ddlInsCo">
						<asp:ListItem>Select One</asp:ListItem>
					</asp:DropDownList>
					&nbsp;
						<FONT color="#ff3333"></FONT></td>
				</tr>
				<tr class="tdganjil" width="50%">
					<td class="tdgenap" style="width: 20%">Search By</td>
					<td class="tdganjil" style="width: 30%">
					<asp:DropDownList runat="server" id="ddlSearchBy">
						<asp:ListItem>Agreement No</asp:ListItem>
						<asp:ListItem>Customer Name</asp:ListItem>
					</asp:DropDownList>
						<asp:TextBox runat="server" id="txtSearchBy" CssClass="inptype" Width="100px">
					</asp:TextBox>
					</td>
					<td class="tdgenap" style="width: 20%">Currency</td>
					<td class="tdganjil" width="40%">
					<asp:DropDownList runat="server" id="DropDownList1">
						<asp:ListItem>IDR</asp:ListItem>
						<asp:ListItem>USD</asp:ListItem>
					</asp:DropDownList>
					</td>
				</tr>
				<tr class="tdganjil" width="50%">
					<td class="tdgenap" style="width: 20%">End Date</td>
					<td class="tdganjil" style="width: 30%">
					<asp:TextBox runat="server" id="txtEndDate" CssClass="inptype" Width="100px">
					</asp:TextBox>
					&nbsp;<asp:Image runat="server" id="imgCalendar" ImageUrl="../../images/iconCalendar.gif" /><td class="tdgenap" style="width: 20%"></td>
					<td class="tdganjil" width="40%">&nbsp;</td>
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
						<TD class="tdtopiabu" align="center">INSURANCE RENEWAL LISTING</TD>
						<TD class="tdtopiabukanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<div align="center">
					<asp:GridView runat="server" id="grdRenewal" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
						<Columns>
							<asp:templatefield HeaderText="AGREEMENT NO">
								<AlternatingItemTemplate>
									<asp:HyperLink runat="server" id="lnkApplicationID" NavigateUrl="../../Credit/ViewApplication.htm" Target="_blank">xxxxxxxx20xxxxxxxx
									</asp:HyperLink>
								</AlternatingItemTemplate>
								<ItemTemplate>
									<asp:HyperLink runat="server" id="lnkAgreementNo0" NavigateUrl="../../Credit/ViewAgreement.htm" Target="_blank">xxxxxxxx20xxxxxxxx
									</asp:HyperLink>
								</ItemTemplate>
								<ItemStyle HorizontalAlign="Left" />
							</asp:templatefield>
							<asp:templatefield HeaderText="CUSTOMER NAME">
								<AlternatingItemTemplate>
									<asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="../../Credit/ViewCompanyCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
									</asp:HyperLink>
								</AlternatingItemTemplate>
								<ItemTemplate>
									<asp:HyperLink runat="server" id="lnkCustomer0" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
									</asp:HyperLink>
								</ItemTemplate>
								<ItemStyle HorizontalAlign="Left" />
							</asp:templatefield>
							<asp:boundfield DataField="valstring20" HeaderText="INSURANCE COMPANY" SortExpression="valstring20">
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
							<asp:templatefield HeaderText="EDIT">
								<AlternatingItemTemplate>
									<asp:ImageButton runat="server" id="btnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="InsuranceRenewalAsset.aspx" />
								</AlternatingItemTemplate>
								<ItemTemplate>
									<asp:ImageButton runat="server" id="btnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="InsuranceRenewalAsset.aspx" />
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
			</asp:panel>
			<p><font color="red" face="Arial, Helvetica, sans-serif">Kalau hasil select lebih dari 1 asset due for renewal untuk 1 agreement, maka result akan di-distinct berdasarkan end date paling kecil</font></p>			
		</form>
	</body>
</HTML>
