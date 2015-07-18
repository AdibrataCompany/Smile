<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>DocPledging</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../Confins.css" type="text/css" rel="stylesheet">
		
	</HEAD>
	<body MS_POSITIONING="GridLayout">
		<form id="Form1" method="post" runat="server">
<div align="center"> 							
			
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopimerahkiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopimerah" align="center">DOCUMENT PLEDGE LISTING CONFIRMATION</TD>
						<TD class="tdtopimerahkanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
					<TR class="tdganjil">
						<TD class="tdgenap" width="25%" height="20">Document Will be Pledge</TD>
						<TD class="tdganjil">
							99</TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="25%" height="20">Document Will Not be Pledge</TD>
						<TD class="tdganjil">
							99</TD>
					</TR>
					</TABLE>
			<asp:GridView runat="server" id="GrdListAgreement"  AllowSorting="True" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield SortExpression="valstring20" HeaderText="APPLICATION ID">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkApplicationid" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkApplicationid" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield SortExpression="valstring20" HeaderText="AGREEMENT NO">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkAgreementno" NavigateUrl="../AccMaintenance/AgreementView.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAgreementno" NavigateUrl="../AccMaintenance/AgreementView.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield SortExpression="valstring20" HeaderText="CUSTOMER NAME">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="../Credit/ViewCompanyCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>

				
				<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
		    </asp:XmlDataSource>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0" align="center">
					<TR>
						<TD width="50%" height="30">&nbsp;</TD>
						<TD align="right" width="50%">
							<asp:imagebutton id="imbSave" runat="server"  imageurl="../Images/ButtonSave.gif" PostBackUrl="docpledgingdetail.aspx"></asp:imagebutton>
							<asp:imagebutton id="imbCancel" runat="server" imageurl="../Images/ButtonCancel.gif" PostBackUrl="docpledging.aspx"></asp:imagebutton></TD>
					</TR>
				</TABLE>
</div>			
			</form>
	</body>
</HTML>
