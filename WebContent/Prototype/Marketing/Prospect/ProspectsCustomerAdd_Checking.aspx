<html>
<head>
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
</head>
	<body>
		<form id="Form1" method="post" runat="server">
			<div align="center">
					<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
						<TR class="trtopihijauhijau">
							<TD class="tdtopihijaukiri" width="10" height="20">&nbsp;</TD>
							<TD class="tdtopihijau" align="center">CUSTOMER DATA</TD>
							<TD class="tdtopihijaukanan" width="10">&nbsp;</TD>
						</TR>
					</TABLE>
					<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" border="0">
					<TR>
					<TD class="tdgenap" width="10%">Name</TD>
					<TD class="tdganjil" width="50%">xxxx99xxxx</TD>
					</TR>
					<TR>
					<TD class="tdgenap">ID Type</TD>
					<TD class="tdganjil">xxxx99xxxx</TD>
					</TR>
					<TR>
					<TD class="tdgenap">ID Number</TD>
					<TD class="tdganjil">99999999999</TD>
					</TR>
					<TR>
					<TD class="tdgenap">Birth Date</TD>
					<TD class="tdganjil">Jakarta, 99/99/9999</TD>
					</TR>
					<TR>
					<TD class="tdgenap">Mother Maiden Name</TD>
					<TD class="tdganjil">xxxx99xxxx</TD>
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
					
					<asp:GridView runat="server" id="GridViewPersonalCustomer2" DataSourceID="XmlDataSource1" AutoGenerateColumns="False" Width="95%" >
						<Columns>
							<asp:boundfield DataField="valnumber2" SortExpression="valstring" HeaderText="NO">
								
							</asp:boundfield>
							<asp:templatefield HeaderText="NAME">
								<ItemTemplate>
									<asp:HyperLink runat="server" id="HypName2" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxxxxx
									</asp:HyperLink>
								</ItemTemplate>
							</asp:templatefield>
							<asp:boundfield DataField="valstring20" SortExpression="valstring" HeaderText="ID TYPE">
								
							</asp:boundfield>
							<asp:boundfield DataField="valstring20" SortExpression="valstring" HeaderText="ID NUMBER">
								
							</asp:boundfield>

							<asp:boundfield DataField="valdate" SortExpression="valnumber" HeaderText="BIRTH DATE">
								
								<ItemStyle HorizontalAlign="Center" />
							</asp:boundfield>
							<asp:boundfield DataField="valstring" SortExpression="valnumber" HeaderText="MOTHER MAIDEN NAME">
								
								<ItemStyle HorizontalAlign="Left" />
							</asp:boundfield>
							<asp:boundfield DataField="valsimilartype" SortExpression="valnumber" HeaderText="TYPE">
								<ItemStyle HorizontalAlign="Left" />
							</asp:boundfield>
						</Columns>
							<HeaderStyle CssClass="tdjudulhijau" />
							<AlternatingRowStyle CssClass="tdgenap" />
					</asp:GridView>
				
					<BR>
					<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
					<TR class="trtopihijau">
					<TD class="tdtopihijaukiri" width="10" height="20"></TD>
					<TD class="tdtopihijau" align="center">NEGATIVE LIST</TD>
					<TD class="tdtopihijaukanan" width="10"></TD>
					</TR>
					</TABLE>
					
					<asp:GridView runat="server" id="GridViewPersonalCustomer3" DataSourceID="XmlDataSource1" AutoGenerateColumns="False" Width="95%" >
						<Columns>
							<asp:boundfield DataField="valnumber2" SortExpression="valstring" HeaderText="NO">
							</asp:boundfield>
							<asp:templatefield HeaderText="NAME">
								<ItemTemplate>
									<asp:HyperLink runat="server" id="HypName3" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxxxxx
									</asp:HyperLink>
								</ItemTemplate>
							</asp:templatefield>
							<asp:boundfield DataField="valstring20" SortExpression="valstring" HeaderText="ID TYPE">
							</asp:boundfield>
							<asp:boundfield DataField="valstring20" SortExpression="valstring" HeaderText="ID NUMBER">
							</asp:boundfield>

							<asp:boundfield DataField="valdate" SortExpression="valnumber" HeaderText="BIRTH DATE">
								<ItemStyle HorizontalAlign="Center" />
							</asp:boundfield>
							<asp:boundfield DataField="valstring" SortExpression="valnumber" HeaderText="MOTHER MAIDEN NAME">
								<ItemStyle HorizontalAlign="Left" />
							</asp:boundfield>
							<asp:boundfield DataField="valsimilartype" SortExpression="valnumber" HeaderText="TYPE">
								<ItemStyle HorizontalAlign="Left" />
							</asp:boundfield>
						</Columns>
						<HeaderStyle CssClass="tdjudulhijau" />
							<AlternatingRowStyle CssClass="tdgenap" />

					</asp:GridView>
				<asp:XmlDataSource runat="server" id="XmlDataSource1" DataFile="~/XML/Menu_Eloan_All_999.xml">
					</asp:XmlDataSource>

					<BR>
				<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td align="left">&nbsp;</td>
     <td align="right"> <a href="ProspectsCustomer.aspx"><img src="../../Images/ButtonSave.gif" width="100" height="20" border="0"></a>&nbsp; 
    <a href="ProspectsCustomer.aspx"><img src="../../Images/ButtonCancel.gif" width="100" height="20" border="0">&nbsp; 
      </a></td>

    </tr>
  </table>
					
					
					</div>
		</form>
	</body>
</HTML>
