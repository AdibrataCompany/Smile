<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>MOU</title>
		<meta name="GENERATOR" content="Microsoft Visual Studio .NET 7.1">
		<meta name="CODE_LANGUAGE" content="Visual Basic .NET 7.1">
		<meta name="vs_defaultClientScript" content="JavaScript">
		<meta name="vs_targetSchema" content="http://schemas.microsoft.com/intellisense/ie5">
		<LINK href="../Confins.css" type="text/css" rel="stylesheet">
		<script language="javascript">
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1)
			var ServerName = 'http://<%=Request.servervariables("SERVER_NAME")%>/';			
		</script>
		<SCRIPT src="../Elsa.js"></SCRIPT>
	</HEAD>
	<body MS_POSITIONING="GridLayout">
		<form id="Form1" method="post" runat="server">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
				<TR>
				<TD>
				<FONT color="red">&nbsp;</FONT>
				<asp:Label id="lblMessage" ForeColor="red" Runat="server">
				</asp:Label>
				</TD>
				</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0" align="center">
				<TR class="trtopi">
				<TD class="tdtopihijaukiri" width="10" height="20"></TD>
				<TD class="tdtopihijau" align="center">MOU ACTIVATION</TD>
				<TD class="tdtopihijaukanan" width="10"></TD>
				</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table8" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
				<TR>
				<TD class="tdgenap" width="25%">Customer Name</TD>
				<TD class="tdganjil" id="lblcustomerid">xxxxxxxxxx50xxxxxxxxxx</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">
				<asp:Label id="lblMOUNO" runat="server" Width="80px">MOU No
				</asp:Label>
				</TD>
				<TD class="tdganjil">
				<asp:Label id="lblMOUNO1" runat="server" Width="80px">xxxxx20xxxxx
				</asp:Label>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">
				<DIV align="left">MOU Date</DIV>
				</TD>
				<TD class="tdganjil">dd-mm-yyyy</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Expired Date</TD>
				<TD class="tdganjil">dd-mm-yyyy</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Reference No</TD>
				<TD class="tdganjil">xxxxx20xxxx</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Is Plafond</TD>
				<TD class="tdganjil">Yes</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Plafond Amount</TD>
				<TD class="tdganjil">999,999,999.99</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Status </TD>
				<TD class="tdganjil">Approved</TD>
				</TR>
				<TR class="tdjudulhijau">
					<TD colspan="2">OTHER INFO</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="20%">Currency</TD>
				<TD class="tdganjil">IDR</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Interest Type</TD>
				<TD class="tdganjil">-</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Installment Scheme</TD>
				<TD class="tdganjil">Regular Fixed Installment</TD>
				</TR>
				<TR>
				<td class="tdgenap">First Installment</td>
				<td class="tdganjil">Advance</td>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Down Payment (%)</TD>
				<TD class="tdganjil">10 %</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Tenor</TD>
				<TD class="tdganjil">24</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Effective Rate (%)</TD>
				<TD class="tdganjil">10 %</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Installment Amount</TD>
				<TD class="tdganjil">5,000,000.00</TD>
				</TR>
				</TABLE>
				<br>
				<div align="center">
					<table width="95%" border="0" cellspacing="0" cellpadding="0">
						<tr class="trtopikuning">
							<td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
							<td align="center" class="tdtopihijau">AGREEMENT LISTING</td>
							<td width="10" class="tdtopihijaukanan">&nbsp;</td>
						</tr>
					</table>
					<asp:GridView Width="95%" runat="server" id="grdAgreement" DataSourceID="XmlDataSource2" AutoGenerateColumns="False">
						<Columns>
							<asp:boundfield DataField="valstring3" HeaderText="BRANCH" SortExpression="valstring3">
								<ItemStyle HorizontalAlign="Center" />							
							</asp:boundfield>
							<asp:templatefield HeaderText="APPLICATION ID">
								<ItemTemplate>
									<asp:HyperLink runat="server" id="hypApplicationID" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank">xxxxx20xxxxx
									</asp:HyperLink>
								</ItemTemplate>
							</asp:templatefield>
							<asp:templatefield HeaderText="AGREEMENT NO">
								<ItemTemplate>
									<asp:HyperLink runat="server" id="HypAgreementNo" NavigateUrl="../Credit/ViewAgreement.htm" Target="_blank">xxxxx20xxxxx
									</asp:HyperLink>
								</ItemTemplate>
							</asp:templatefield>
							<asp:templatefield HeaderText="CUSTOMER NAME">
								<ItemTemplate>
									<asp:HyperLink runat="server" id="hypCustName" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxx30xxxxx
									</asp:HyperLink>
								</ItemTemplate>
							</asp:templatefield>
							<asp:boundfield DataField="vCurr" HeaderText="CURR" SortExpression="vCurr">
								<ItemStyle HorizontalAlign="Center" />							
							</asp:boundfield>
							<asp:boundfield DataField="valstring3" HeaderText="CONTRACT STATUS" SortExpression="valstring3">
								<ItemStyle HorizontalAlign="Center" />							
							</asp:boundfield>
							<asp:boundfield DataField="valstring3" HeaderText="APP STEP" SortExpression="valstring3">
								<ItemStyle HorizontalAlign="Center" />
							</asp:boundfield>
						</Columns>
						<HeaderStyle CssClass="tdjudulhijau" />
						<AlternatingRowStyle CssClass="tdgenap" />
					</asp:GridView>
					<asp:XmlDataSource runat="server" ID="XmlDataSource2" DataFile="../DataType.xml">
					</asp:XmlDataSource>
					<table width="95%" height="25" border="0" cellpadding="0" cellspacing="0">
						<tr>
							<td width="30" align="center">
							<asp:Image runat="server" id="imbFirstPage" ImageUrl="../images/butkiri1.gif" />
							</td>
							<td width="30" align="center">
							<asp:Image runat="server" id="imbpreviouspage" ImageUrl="../images/butkiri.gif" />
							</td>
							<td width="30" align="center">
							<asp:Image runat="server" id="imbnextpage" ImageUrl="../images/butkanan.gif" />
							</td>
							<td width="30" align="center">
							<asp:Image runat="server" id="imblastpage" ImageUrl="../images/butkanan1.gif" />
							</td>
							<td align="center" style="width: 318px">Page 
         &nbsp;
							<asp:TextBox runat="server" id="txtgo" CssClass="inptype" MaxLength="5" Width="10%">
							</asp:TextBox>
							<asp:Image runat="server" id="imggo" ImageUrl="../images/butgo.gif" />
							</td>
							<td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
						</tr>
					</table>
				</div>
				<br>
				<TABLE id="Table9" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR>
				<TD align="right">
				<asp:ImageButton id="btnActivate" runat="server" imageurl="../Images/ButtonActivate.gif" causesvalidation="True" PostBackUrl="MOUActivation.aspx" />								
				<asp:ImageButton id="btnClose" runat="server" imageurl="../Images/ButtonCancel.gif" causesvalidation="False" PostBackUrl="MOUActivation.aspx" />
				</TD>
				</TR>
				</TABLE>
		</form>
	</body>
</HTML>
