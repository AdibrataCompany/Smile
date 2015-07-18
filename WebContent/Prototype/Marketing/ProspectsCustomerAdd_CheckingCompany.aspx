<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head>
	<body>
		<form id="Form1" method="post" runat="server">
			<div align="center">
					
					<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
						<TR class="trtopihijauhijau">
							<TD class="tdtopihijaukiri" width="10" height="20">&nbsp;</TD>
							<TD class="tdtopihijau" align="center">COMPANY DATA</TD>
							<TD class="tdtopihijauKanan" width="10">&nbsp;</TD>
						</TR>
					</TABLE>
					<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" border="0">
						<TR>
							<TD class="tdgenap" width="10%">Name</TD>
							<TD class="tdganjil" width="50%">
								xxxxx99xxxxx</TD>
						</TR>
					</TABLE>
					<BR>
					<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
					<TR class="trtopihijau">
					<TD class="tdtopihijaukiri" width="10" height="20"></TD>
					<TD class="tdtopihijau" align="center">MATCH/SIMILAR 
							CUSTOMER DATA</TD>
					<TD class="tdtopihijaukanan" width="10"></TD>
					</TR>
					</TABLE>
					
					<asp:GridView runat="server" id="GridViewPersonalCustomer" DataSourceID="XmlDataSource1" AutoGenerateColumns="False" ControlStyle-CssClass="tablegrid" Width="95%" CssClass="tablegrid">
						<Columns>
						<asp:boundfield DataField="valnumber2" SortExpression="valnumber" HeaderText="NO">
								<ControlStyle CssClass="tdganjil" />
								<ItemStyle HorizontalAlign="Left" />
							</asp:boundfield>
							<asp:boundfield DataField="valnumber1" SortExpression="valstring" HeaderText="NPWP">
								<ControlStyle CssClass="tdganjil" />
							</asp:boundfield>
							<asp:templatefield HeaderText="NAME">
								<ItemTemplate>
									<asp:HyperLink runat="server" id="HypName" NavigateUrl="../Credit/ViewCompanyCustomer.htm" Target="_blank">xxxxxxxxxxx
									</asp:HyperLink>
								</ItemTemplate>
							</asp:templatefield>
							<asp:boundfield DataField="valsimilartype1" SortExpression="valnumber" HeaderText="TYPE">
								<ControlStyle CssClass="tdganjil" />
								<ItemStyle HorizontalAlign="Left" />
							</asp:boundfield>
							
						</Columns>
					</asp:GridView>
					
					<BR>
					<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
					<TR class="trtopihijau">
					<TD class="tdtopihijaukiri" width="10" height="20"></TD>
					<TD class="tdtopihijau" align="center">NEGATIVE LIST</TD>
					<TD class="tdtopihijaukanan" width="10"></TD>
					</TR>
					</TABLE>
					
					<asp:GridView runat="server" id="GridViewPersonalCustomer4" DataSourceID="XmlDataSource1" AutoGenerateColumns="False" ControlStyle-CssClass="tablegrid" Width="95%" CssClass="tablegrid">
						<Columns>
						<asp:boundfield DataField="valnumber2" SortExpression="valnumber" HeaderText="NO">
								<ControlStyle CssClass="tdganjil" />
								<ItemStyle HorizontalAlign="Left" />
							</asp:boundfield>
							<asp:boundfield DataField="valnumber1" SortExpression="valstring" HeaderText="NPWP">
								<ControlStyle CssClass="tdganjil" />
							</asp:boundfield>
							<asp:templatefield HeaderText="NAME">
								<ItemTemplate>
									<asp:HyperLink runat="server" id="HypName4" NavigateUrl="../Credit/ViewCompanyCustomer.htm" Target="_blank">xxxxxxxxxxx
									</asp:HyperLink>
								</ItemTemplate>
							</asp:templatefield>
							<asp:boundfield DataField="valsimilartype1" SortExpression="valnumber" HeaderText="TYPE">
								<ControlStyle CssClass="tdganjil" />
								<ItemStyle HorizontalAlign="Left" />
							</asp:boundfield>
							
						</Columns>
					</asp:GridView>
					
					<asp:XmlDataSource runat="server" id="XmlDataSource1" DataFile="~/XML/Menu_Eloan_All_999.xml">
					</asp:XmlDataSource>
				
					<BR>
					 <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td align="left">&nbsp;</td>
     <td align="right"> <a href="ProspectsApplicationScoring.aspx"><img src="../Images/ButtonNext.gif" width="100" height="20" border="0"></a>&nbsp; 
    <a href="ProspectsCustomer.aspx"><img src="../Images/ButtonCancel.gif" width="100" height="20" border="0">&nbsp; 
      </a></td>

    </tr>
  </table>
					</div>
		</form>
	</body>
</HTML>
