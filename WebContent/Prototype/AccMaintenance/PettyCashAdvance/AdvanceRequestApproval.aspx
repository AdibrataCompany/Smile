<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<HTML>
	<HEAD>
		<title>Untitled Document</title>
		<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
		<link href="../../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
		<style type="text/css">
.style3 {
	background-color: #FFFFFF;
	font-family: Verdana, Arial, Tahoma, sans-serif;
}
</style>
</HEAD>
	<body>
		<form id="form1" runat="server">
		<div align="center">
			<table width="95%" border="0" cellspacing="0" cellpadding="0">
				<tr class="trtopikuning">
					<td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
					<td align="middle" class="tdtopibiru"><div align="center">APPROVAL</div></td>
					<td width="10" class="tdtopibirukanan">&nbsp;</td>
				</tr>
			</table>
			<table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
				<tr>
					<td width="25%" class="tdgenap">Branch</td>
					
      <td class="tdganjil" style="width: 21%">
		<asp:DropDownList runat="server" id="ddlBranch">
			<asp:ListItem>Select One</asp:ListItem>
		</asp:DropDownList>
					</td>
					<td class="tdgenap" style="width: 12%">Search By</td>
					<td width="25%" class="tdganjil"><font face="Tahoma, Verdana" size="2">
							<asp:DropDownList runat="server" id="ddlSearchBy">
								<asp:ListItem>Select One</asp:ListItem>
								<asp:ListItem>Approval ID</asp:ListItem>								
								<asp:ListItem>Application ID</asp:ListItem>								
								<asp:ListItem>Agreement No</asp:ListItem>	
								<asp:ListItem>Customer</asp:ListItem>																							
							</asp:DropDownList>
							&nbsp;</font>
					<asp:TextBox runat="server" id="txtSearchBy" CssClass="inptype">
					</asp:TextBox>
					</td>
				</tr>
				<tr>
					<td width="25%" class="tdgenap">Approval Type</td>
					
      <td class="style3" style="width: 21%">Petty Cash Advance Approval</td>
					<td class="tdgenap" style="width: 12%">Approval Status</td>
					<td width="25%" class="tdganjil"><font face="Tahoma, Verdana" size="2">
							<asp:DropDownList runat="server" id="ddlApprovalStatus">
								<asp:ListItem>Open</asp:ListItem>
								<asp:ListItem>Final</asp:ListItem>																														
							</asp:DropDownList>
						</font>
					</td>
				</tr>
				<tr>
					<td class="tdgenap">Request From</td>
					<td class="tdganjil" style="width: 21%"><font face="Tahoma, Verdana" size="2">
						<asp:DropDownList runat="server" id="ddlRequestFrom">
								<asp:ListItem>All</asp:ListItem>													
							</asp:DropDownList>
						&nbsp;</font></td>
					<td class="tdgenap" style="width: 12%">Approval Result</td>
					<td class="tdganjil"><font face="Tahoma, Verdana" size="2">
						<asp:DropDownList runat="server" id="ddlApprovalResult">
								<asp:ListItem>All</asp:ListItem>						
								<asp:ListItem>Request</asp:ListItem>
								<asp:ListItem>Approved</asp:ListItem>
								<asp:ListItem>Declined</asp:ListItem>								
								<asp:ListItem>Return</asp:ListItem>									
							</asp:DropDownList>
						</font>
					</td>
				</tr>
				<tr>
					<td valign="top" class="tdgenap">To be Approved By</td>
					<td class="tdganjil" colspan="2"><font face="Tahoma, Verdana" size="2">
						<asp:DropDownList runat="server" id="ddlApprovedBy">
								<asp:ListItem>All</asp:ListItem>													
							</asp:DropDownList>
						&nbsp;</font></td>
					<td align="right" class="tdgenap">
					<asp:Image runat ="server" ID="imgSearch" ImageUrl="../../Images/ButtonSearch.gif"></asp:Image></td>
				</tr>
				<tr>
					<td valign="top" class="tdgenap">Product Type</td>
					<td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2">
						<asp:DropDownList runat="server" id="ddlProductType">
								<asp:ListItem>All</asp:ListItem>													
							</asp:DropDownList>
						&nbsp;</font></td>
				</tr>
			</table>
			<br>
	<table width="95%" border="0" cellspacing="0" cellpadding="0">
				<tr class="trtopikuning">
					<td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
					<td align="middle" class="tdtopibiru"><div align="center">APPROVAL LISTING</div></td>
					<td width="10" class="tdtopibirukanan">&nbsp;</td>
				</tr>
			</table>	
				<asp:GridView Width="95%" runat="server" id="grdApproval" DataSourceID="XmlDataSource2" AutoGenerateColumns="False">
					<Columns>
						<asp:templatefield HeaderText="APPR ID">
							<ItemTemplate>
								<asp:HyperLink runat="server" id="hypApprId" NavigateUrl="../Credit/ViewApplication.htm">xxxxx20xxxxx
								</asp:HyperLink>
							</ItemTemplate>
						</asp:templatefield>
						<asp:templatefield HeaderText="APPLICATION ID">
							<ItemTemplate>
								<asp:HyperLink runat="server" id="hypApplicationID" NavigateUrl="../Credit/ViewApplication.htm">xxxxx30xxxxx
								</asp:HyperLink>
							</ItemTemplate>
						</asp:templatefield>
						<asp:templatefield HeaderText="AGREEMENT NO">
							<ItemTemplate>
								<asp:HyperLink runat="server" id="hypAgreementNo" NavigateUrl="../Credit/ViewAgreement.htm">xxxxx30xxxxx
								</asp:HyperLink>
							</ItemTemplate>
						</asp:templatefield>						
						<asp:templatefield HeaderText="CUSTOMER NAME">
							<ItemTemplate>
								<asp:HyperLink runat="server" id="hypCustName" NavigateUrl="../Credit/ViewPersonalCustomer.htm">xxxxx30xxxxx
								</asp:HyperLink>
							</ItemTemplate>
						</asp:templatefield>
						<asp:templatefield HeaderText="STATUS">
							<ItemTemplate>
								<asp:Label runat="server" id="lblStatus">New
								</asp:Label>
							</ItemTemplate>
							<ItemStyle HorizontalAlign="Center" />
						</asp:templatefield>
						<asp:boundfield DataField="valstring10" HeaderText="RESULT" SortExpression="valstring10">
						</asp:boundfield>
						<asp:boundfield DataField="valstring20" HeaderText="FROM/TO" SortExpression="valstring20">
						</asp:boundfield>
						<asp:boundfield DataField="valDate" HeaderText="REQ DATE" SortExpression="valDate">
							<ItemStyle HorizontalAlign="Center" />
						</asp:boundfield>
						<asp:templatefield HeaderText="DURATION (a/b/c)">
							<ItemTemplate>
								<asp:Label runat="server" id="lblDuration">8/2/8
								</asp:Label>
							</ItemTemplate>
						</asp:templatefield>		
						<asp:templatefield HeaderText="LEVEL/PATH">
							<ItemTemplate>
								<asp:Label runat="server" id="lblLevelPath">xx5xx/xx5xx
								</asp:Label>
							</ItemTemplate>
						</asp:templatefield>																	
						<asp:boundfield DataField="valstring6" HeaderText="PROD TYPE" SortExpression="valstring6">
						</asp:boundfield>
						<asp:templatefield HeaderText="ACTION">
							<ItemTemplate>
								<asp:HyperLink runat="server" id="hypAction" NavigateUrl="AdvanceRequestApprovalNext.aspx" Text="Approval">
								</asp:HyperLink>
							</ItemTemplate>
						</asp:templatefield>							
						<asp:templatefield HeaderText="RE-REQUEST">
							<ItemTemplate>
								<asp:Label runat="server" id="lblReRequest" Text="Re-request">
								</asp:Label>
							</ItemTemplate>
						</asp:templatefield>
						<asp:templatefield HeaderText="TAKE BACK">
							<ItemTemplate>
								<asp:Label runat="server" id="lblTakeBack" Text="Take-back">
								</asp:Label>
							</ItemTemplate>
						</asp:templatefield>						
						</Columns>
					<HeaderStyle CssClass="tdjudulbiru" />
					<AlternatingRowStyle CssClass="tdgenap" />
				</asp:GridView>
				<asp:XmlDataSource runat="server" ID="XmlDataSource2" DataFile="../../DataType.xml">
				</asp:XmlDataSource>
				<TABLE height="25" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR>
				<TD align="center" width="30">
				<asp:ImageButton id="imbFirstPage" runat="server" ImageUrl="../../Images/butkiri1.gif" CausesValidation="False" />
				</TD>
				<TD align="center" width="30">
				<asp:ImageButton id="imbPrevPage" runat="server" ImageUrl="../../Images/butkiri.gif" CausesValidation="False" />
				</TD>
				<TD align="center" width="30">
				<asp:ImageButton id="imbNextPage" runat="server" ImageUrl="../../Images/butkanan.gif" CausesValidation="False" />
				</TD>
				<TD align="center" width="30">
				<asp:ImageButton id="imbLastPage" runat="server" ImageUrl="../../Images/butkanan1.gif" CausesValidation="False" />
				</TD>
				<TD style="WIDTH: 163px" align="center" width="163">Page&nbsp;
				<asp:TextBox id="txtGoPage" runat="server" CssClass="inptype" Width="39px" MaxLength="4">
				</asp:TextBox>
				<asp:ImageButton id="imbGoPage" runat="server" ImageUrl="../../Images/butgo.gif" EnableViewState="False" ImageAlign="AbsBottom" />
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
		</div>
		</form>
	</body>
</HTML>
