<%@ Page Language="vb" AutoEventWireup="false" %>
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
<div align="center"> 	
		<form id="Form1" runat="server">
		
			<br>
		
		
				<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
				
				 <tr> 
      <td colspan="3"><font color="red"><i>asset doc status yang main='ONHAND' 
      </i></font></td>
    </tr>

					<TR class="trtopiabu">
						<TD class="tdtopimerahkiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopimerah" align="center">DOCUMENT PLEDGE SEARCH DETAIL</TD>
						<TD class="tdtopimerahkanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" border="0">
					<TR class="tdganjil">
						<TD class="tdgenap" width="20%">Funding Company/ Branch</TD>
						<TD class="tdganjil">
							xxxxxxxx</TD>
					</TR>
					<TR class="tdganjil">
						<TD class="tdgenap" width="20%">Contract No</TD>
						<TD class="tdganjil">
							xx</TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Batch Date</TD>
						<TD class="tdganjil">
							dd/mm/yyyy</TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Search by</TD>
						<TD class="tdganjil">
							xxxxxxxx</TD>
					</TR>
				</TABLE>
			
		
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopimerahkiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopimerah" align="center">DOCUMENT PLEDGE LISTING</TD>
						<TD class="tdtopimerahkanan" width="10">&nbsp;</TD>
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
		<asp:templatefield SortExpression="valstring20" HeaderText="SELECT">
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				<asp:CheckBox runat="server" id="CheckBox1" />
			</ItemTemplate>
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>

				
				<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
		    </asp:XmlDataSource>

				<table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><img src="../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0" align ="center">
					<TR>
						<TD width="50%" height="30">&nbsp;</TD>
						<TD align="right" width="50%">
							<asp:imagebutton id="imbSelect" runat="server" causesvalidation="False" imageurl="../Images/ButtonSelect.gif" PostBackUrl="docpledgingdetailprocess.aspx"></asp:imagebutton>
							<asp:imagebutton id="imbExit" runat="server" causesvalidation="False" imageurl="../Images/ButtonExit.gif"></asp:imagebutton><A href="javascript:window.close();"></A>&nbsp;<A href="javascript:window.close();"></A>
						</TD>
					</TR>
				</TABLE>
			
</div>
	</form>

	</body>
</HTML>
