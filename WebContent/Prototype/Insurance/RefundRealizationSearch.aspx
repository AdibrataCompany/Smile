<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled 1</title>
<link rel="stylesheet" type="text/css" href="../Confins.css" />
</head>

<body>

<form id="form1" runat="server">
<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
	<TR class="trtopiabu">
		<TD class="tdtopiabukiri" width="10" height="20">&nbsp;</TD>
		<TD class="tdtopiabu" align="center">REFUND REALIZATION</TD>
		<TD class="tdtopiabukiri" width="10">&nbsp;</TD>
	</TR>
</TABLE>
<TABLE class="tablegrid" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
					<TR>
						<TD class="tdgenap" width="15%">Branch
						</TD>
						<TD class="tdganjil" width="30%">
							<asp:DropDownList id="ddlBranch" runat="server">
								<asp:ListItem>Select One</asp:ListItem>
								<asp:ListItem>Jakarta Electronic</asp:ListItem>
							</asp:DropDownList>
						 <FONT color="#ff0033">
								*)</FONT>
						</TD>
						<TD class="tdgenap" width="15%">
							<DIV align="left">Search By</DIV>
						</TD>
						<TD class="tdganjil" width="35%" colSpan="3">
						<asp:DropDownList id="cbosearchby" runat="server">
								<asp:ListItem>Select One</asp:ListItem>
								<asp:ListItem>Agreement No</asp:ListItem>
								<asp:ListItem>Customer Name</asp:ListItem>

							</asp:DropDownList>

						</TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<DIV align="right">
								<asp:imagebutton id="imgsearch" runat="server" width="100" height="20" imageurl="../Images/ButtonSearch.gif"></asp:imagebutton>
								<asp:imagebutton id="imbReset" runat="server" imageurl="../Images/ButtonReset.gif" causesvalidation="False"></asp:imagebutton></DIV>
						</TD>
					</TR>
				</TABLE>
				<br>
<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
	<TR class="trtopiabu">
		<TD class="tdtopiabukiri" width="10" height="20">&nbsp;</TD>
		<TD class="tdtopiabu" align="center">REFUND REALIZATION LISTING</TD>
		<TD class="tdtopiabukanan" width="10">&nbsp;</TD>
	</TR>
</TABLE>
<TABLE class="tablegrid" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
<tr>
	<td>
	<asp:GridView runat="server" id="GridView1" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" Width="95%">
		<Columns>
			<asp:templatefield HeaderText="AGREEMENT NO ">
				<ItemStyle CssClass="tdgenap" />
				<HeaderStyle CssClass="tdjudulabu" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="HyperLink1" NavigateUrl="../AccMaintenance/AgreementView.htm">xxxxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="CUSTOMER NAME">
				<ItemStyle CssClass="tdganjil" />
				<HeaderStyle CssClass="tdjudulabu " />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="HyperLink1">xxxxxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:boundfield DataField="valdate" SortExpression="valdate" HeaderText="START DATE">
				<ItemStyle CssClass="tdgenap" />
				<HeaderStyle CssClass="tdjudulabu" />
			</asp:boundfield>
			<asp:boundfield DataField="valdate" SortExpression="valdate" HeaderText="END DATE">
				<ItemStyle CssClass="tdganjil" />
				<HeaderStyle CssClass="tdjudulabu" />
			</asp:boundfield>
			<asp:templatefield HeaderText="REFUND">
				<ItemStyle CssClass="tdgenap" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="HyperLink1" NavigateUrl="RefundRealizationNext.aspx">Refund
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
		</Columns>
	</asp:GridView>
	<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
	</asp:XmlDataSource>
	</td>
	</tr>
</table>
<table width="95%" height="25" border="0" align="left" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><asp:Image runat="server" id="imbFirstPage" ImageUrl="../images/butkiri1.gif" /></td>
      <td width="30" align="center">  <asp:Image runat="server" id="imbpreviouspage" ImageUrl="../images/butkiri.gif" /></td>
      <td width="30" align="center">  <asp:Image runat="server" id="imbnextpage" ImageUrl="../images/butkanan.gif" /></td>
      <td width="30" align="center">  <asp:Image runat="server" id="imblastpage" ImageUrl="../images/butkanan1.gif" /></td>
      <td align="center" style="width: 318px">Page 
         &nbsp; 
       <asp:TextBox runat="server" id="txtgo" CssClass="inptype" MaxLength="5" Width="10%"></asp:TextBox>
        <asp:Image runat="server" id="imggo" ImageUrl="../images/butgo.gif" />
	</td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>

</form>

</body>

</html>
