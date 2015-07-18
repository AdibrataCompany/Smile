<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Supplier</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<style type="text/css">
.style1 {
	background-color: #FFFFFF;
	text-align: left;
}
.style2 {
	background-color: #F4FAFF;
	text-align: left;
}
.style3 {
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmSupplierHoldingMemberList" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER HOLDING MEMBER</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
          <td class="style2"width="20%">Supplier Holding Name</td>
          <td class="style1" width="80%">XXXXX</td>
        </tr>

 
      <tr> 
          <td class="style2" width="20%">Business Name</td>
          <td class="style1" width="80%">XXXXX</td>
        </tr>
	<tr> 
          <td class="style2" width="20%">Address</td>
          <td class="style1" width="80%">XXXXX</td>
     </tr>
     
	
	<tr>
      <td width="20%" class="style2">Search By</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbSearch">
			<asp:ListItem>Member Name</asp:ListItem>
			<asp:ListItem>Member Business Name</asp:ListItem>
			<asp:ListItem>Member Address</asp:ListItem>
		</asp:DropDownList>
	&nbsp;
		<asp:TextBox runat="server" id="TbsSearch" CssClass="inptype"></asp:TextBox>
	&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" PostBackUrl="SupplierHoldingMemberlist.aspx" />&nbsp; 
        <asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" PostBackUrl="SupplierHoldingMemberlist.aspx" />&nbsp;</td>
    </tr>
  </table>
  <br />
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER HOLDING MEMBER LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <asp:GridView runat="server" id="GrdViewSupplierListing" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
		<Columns>
			<asp:templatefield HeaderText="MEMBER NAME">
				<AlternatingItemTemplate>
					<asp:HyperLink runat="server" id="LinkName" NavigateUrl="SupplierView.aspx" Target="_blank">xxxxxxxx50xxxxxxxx
					</asp:HyperLink>
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:HyperLink runat="server" id="LinkName" NavigateUrl="SupplierView.aspx" Target="_blank">xxxxxxxx50xxxxxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:boundfield DataField="valstring20" SortExpression="valstring20" HeaderText="MEMBER BUSINESS NAME">
			</asp:boundfield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="MEMBER ADDRESS">
			</asp:boundfield>
			<asp:boundfield DataField="valyesno" SortExpression="valyesno" HeaderText="IS ACTIVE">
			</asp:boundfield>
		</Columns>
		<HeaderStyle CssClass="tdjudulhijau" />
		<AlternatingRowStyle CssClass="tdgenap" />
		</asp:GridView>
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
    </div>
    
  </div>
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnFirstPrev" ImageUrl="../../images/butkiri1.gif" Width="20px" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnPrev" ImageUrl="../../images/butkiri.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnNext" ImageUrl="../../images/butkanan.gif" Width="20px" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnLastNext" ImageUrl="../../images/butkanan1.gif" /></td>
      <td width="130" align="center">Page&nbsp;
		<asp:TextBox runat="server" id="TbnPage" Width="20px" CssClass="inptype">
		</asp:TextBox>
&nbsp;&nbsp; 
        <asp:ImageButton runat="server" id="BtnGo" ImageUrl="../../images/buttonGO.gif" /></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30" class="style3">
	</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnClose" ImageUrl="../../images/ButtonClose.gif" OnClientClick="myclose();"/>&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
