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
<br>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiabukiri">&nbsp;</td>
      <td align="center" class="tdtopiabu">CHANGE INSCO</td>
      <td width="10" class="tdtopiabukanan">&nbsp;</td>
    </tr>
  </table>
<TABLE class="tablegrid" cellSpacing="1" cellPadding="3" width="95%"  border="0">
	<TR>
		<TD class="tdgenap" >Branch </TD>
		<TD class="tdganjil" style="height: 26px">
		<asp:DropDownList id="ddlBranch" runat="server">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem>Jakarta Electronic</asp:ListItem>
		</asp:DropDownList>
		<FONT color="#ff0033">*)</FONT> </TD>
	</TR>
	<TR>
		<TD class="tdgenap" width="20%">Search By </TD>
		<TD class="tdganjil">
		<asp:DropDownList id="ddlsearchby" runat="server">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem>Agreement No</asp:ListItem>
			<asp:ListItem>Customer Name</asp:ListItem>
		</asp:DropDownList>
		<asp:TextBox runat="server" id="TextBox1" CssClass="inptype">
		</asp:TextBox>
		</TD>
	</TR>
</TABLE>
<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
	<TR>
		<TD>
		<DIV align="right">
			<asp:ImageButton id="imgsearch" runat="server" width="100px" height="20px" imageurl="../Images/ButtonSearch.gif" PostBackUrl="ChangeInscoSearch.aspx" />
			<asp:ImageButton id="imbReset" runat="server" imageurl="../Images/ButtonReset.gif" causesvalidation="False" />
		</DIV>
		</TD>
	</TR>
</TABLE>
<br>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiabukiri">&nbsp;</td>
      <td align="center" class="tdtopiabu">CHANGE INSCO LISTING</td>
      <td width="10" class="tdtopiabukanan">&nbsp;</td>
    </tr>
  </table>

	<asp:GridView  Width="95%" runat="server" id="GridView1" DataSourceID="XmlDataSource2" AutoGenerateColumns="False">
		<Columns>
			<asp:templatefield HeaderText="AGREEMENTNO">
				<ItemTemplate>
					<asp:HyperLink runat="server" id="HyperLink1" NavigateUrl="../AccMaintenance/AgreementView.htm">xx3xxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="CUSTOMER NAME" ApplyFormatInEditMode="True">
			</asp:boundfield>
			<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="INSURED BY">
			</asp:boundfield>
			<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="PAID BY">
			</asp:boundfield>
			<asp:boundfield DataField="valdate" SortExpression="valdate" HeaderText="GO LIVE DATE">
			</asp:boundfield>
			<asp:templatefield HeaderText="CHANGE">
				<ItemTemplate>
					<asp:LinkButton runat="server" id="LinkButton1" PostBackUrl="ChangeInscoDetail.aspx">Change</asp:LinkButton>
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center" />
			</asp:templatefield>
		</Columns>
		<HeaderStyle CssClass="tdjudulabu" />	
		<AlternatingRowStyle CssClass="tdgenap" />			
	</asp:GridView>
	<asp:XmlDataSource runat="server" ID="XmlDataSource2" DataFile="../DataType.xml"></asp:xmldatasource>
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
