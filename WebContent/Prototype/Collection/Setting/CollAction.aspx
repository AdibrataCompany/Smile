<%@ Page Language="vb" ContentType="text/html" ResponseEncoding="iso-8859-1"  %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>ActionResult</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../../Confins.css" type="text/css" rel="stylesheet">
	</HEAD>
	<body>
		<form id="Form1" method="post" runat="server">
		<br>
		<table width="95%" border="0" cellspacing="0" cellpadding="0" align="center">
		    <tr class="trtopiungu"> 
		      <td width="10" height="20" class="tdtopiungu">&nbsp;</td>
		      <td align="center" class="tdtopiungu">ACTION</td>
		      <td width="10" class="tdtopiungukanan">&nbsp;</td>
		    </tr>
		  </table>
			<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" align="center" border="0">
				<TR class="tdganjil">
					<TD class="tdgenap" width="20%">Search By</TD>
					<TD class="tdganjil">
						<asp:DropDownList id="cboSearchBy" runat="server" Width="144px" Font-Names="Verdana">
							<asp:ListItem Value="ActionID" Selected="True">Action ID</asp:ListItem>
							<asp:ListItem Value="ActionDescription">Action Name</asp:ListItem>
						</asp:DropDownList>&nbsp;
						<asp:TextBox id="txtSearchByValue" runat="server" Width="168px" CssClass="InpType"></asp:TextBox></TD>
				</TR>
			</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR align="right">
						<TD>
							<asp:ImageButton id="BtnSearch" runat="server" ImageUrl="../../Images/ButtonSearch.gif"></asp:ImageButton>&nbsp;
							<asp:ImageButton id="BtnReset" runat="server" ImageUrl="../../Images/ButtonReset.gif"></asp:ImageButton></TD>
					</TR>
				</TABLE>
				<BR>
		<table width="95%" border="0" cellspacing="0" cellpadding="0" align="center">
		    <tr class="trtopiungu"> 
		      <td width="10" height="20" class="tdtopiungu">&nbsp;</td>
		      <td align="center" class="tdtopiungu">ACTION LISTING</td>
		      <td width="10" class="tdtopiungukanan">&nbsp;</td>
		    </tr>
		  </table>
		<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
			<TR align="center">
				<TD width="100%">
				 <asp:GridView runat="server" id="GrdListCustomer" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="100%" >
    <Columns>
		<asp:templatefield HeaderText="ACTION ID">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomerName" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx10xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:boundfield DataField="valstring20" HeaderText="ACTION NAME" SortExpression="valstringcsttype">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:templatefield HeaderText="EDIT">
			<ItemTemplate>
				<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="CollActionEdit.aspx" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="DELETE">
			<ItemTemplate>
				<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/icondelete.gif" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="VIEW RESULT">
			<ItemTemplate>
				<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/icondetail.gif" PostBackUrl="CollResult.aspx" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>

				
				
					</TD>
			</TR>
		</TABLE>
				<TABLE style="HEIGHT: 53px" height="53" cellSpacing="0" cellPadding="0" width="95%" align="center"
					border="0">
					<TR>
						<TD align="center" width="30">
							<asp:imagebutton id="imbFirstPage" runat="server" ImageUrl="../../Images/butkiri1.gif" CausesValidation="False"
								OnCommand="NavigationLink_Click" CommandName="First"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbPrevPage" runat="server" ImageUrl="../../Images/butkiri.gif" CausesValidation="False"
								OnCommand="NavigationLink_Click" CommandName="Prev"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbNextPage" runat="server" ImageUrl="../../Images/butkanan.gif" CausesValidation="False"
								OnCommand="NavigationLink_Click" CommandName="Next"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbLastPage" runat="server" ImageUrl="../../Images/butkanan1.gif" CausesValidation="False"
								OnCommand="NavigationLink_Click" CommandName="Last"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD style="WIDTH: 247px" align="center" width="247"><FONT face="Verdana" size="2">Page&nbsp;</FONT>
							<asp:TextBox id="txtGoPage" runat="server" Width="34px" CssClass="InpType" MaxLength="3">1</asp:TextBox>
							<asp:imagebutton id="imbGoPage" runat="server" ImageUrl="../../Images/butgo.gif" ImageAlign="AbsBottom"
								EnableViewState="False"></asp:imagebutton>
							<FONT face="Verdana" size="2">&nbsp;&nbsp;
							</FONT>
						</TD>
						<TD align="right"><FONT color="#999999"><FONT face="Verdana" size="2">Page&nbsp; </FONT>
								<asp:label id="lblPage" runat="server" Font-Names="Verdana" Font-Size="Smaller"></asp:label><FONT face="Verdana" size="2">&nbsp;of
								</FONT>
								<asp:label id="lblTotPage" runat="server" Font-Names="Verdana" Font-Size="Smaller"></asp:label><FONT face="Verdana" size="2">, 
									Total&nbsp; </FONT>
								<asp:label id="lblTotRec" runat="server" Font-Size="Smaller"></asp:label>&nbsp;<FONT face="Verdana" size="2">record(s)</FONT></FONT></TD>
					</TR>
				</TABLE>
				<TABLE  cellSpacing="0" cellPadding="0" width="95%"	align="center" border="0" runat="server">
					<TR>
						<TD align="left">
							&nbsp;</TD>
						<TD align="right"><FONT face="Verdana">
								<asp:ImageButton id="BtnAdd" runat="server" ImageUrl="../../images/buttonadd.gif" PostBackUrl="CollActionAdd.aspx"></asp:ImageButton></FONT></TD>
					</TR>
				</TABLE>
		</form>
	</body>
</HTML>
