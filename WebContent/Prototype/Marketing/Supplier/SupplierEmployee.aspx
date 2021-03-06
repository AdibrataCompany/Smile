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
<form id="FrmSupplierEmployee" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER EMPLOYEE</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="style2">Supplier Name</td>
      <td class="style1">
		PT. XXXXX</td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Search By</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbSearch" CssClass="inptype">
			<asp:ListItem>Employee Name</asp:ListItem>			
		</asp:DropDownList>
&nbsp;
		<asp:TextBox runat="server" id="TbsSearch" Height="18px" CssClass="inptype"></asp:TextBox>
&nbsp;</td>
    </tr>
    <tr> 
      <td width="25%" class="style2">Position</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbPosition" CssClass="inptype">
			<asp:ListItem>All</asp:ListItem>			
			<asp:ListItem>Marketing</asp:ListItem>			
		</asp:DropDownList>
		</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" PostBackUrl="SupplierEmployee.aspx" />&nbsp; 
        <asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" PostBackUrl="SupplierEmployee.aspx" />&nbsp;</td>
    </tr>
  </table>
  <br />
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER EMPLOYEE LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <asp:GridView runat="server" id="GrdViewSupplierEmployeeListing" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
		<Columns>
			<asp:templatefield HeaderText="NAME">
				<AlternatingItemTemplate>
					<asp:HyperLink runat="server" id="LinkName" NavigateUrl="SupplierEmployeeView.aspx" Target="_blank">xxxxxxxx50xxxxxxxx
					</asp:HyperLink>
				</AlternatingItemTemplate>
				<ItemStyle HorizontalAlign="Left" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="LinkName" NavigateUrl="SupplierEmployeeView.aspx" Target="_blank">xxxxxxxx50xxxxxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="POSITION">
				<ItemStyle HorizontalAlign="Left" />
			</asp:boundfield>
			<asp:templatefield HeaderText="EDIT">
				<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="SupplierEmployeeEdit.aspx" />
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="SupplierEmployeeEdit.aspx" />
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="DELETE">
				<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../images/IconDelete.gif" />
				</AlternatingItemTemplate>
				<ItemStyle Width="5%" />
				<HeaderStyle Width="5%" />
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../images/IconDelete.gif" />
				</ItemTemplate>
			</asp:templatefield>
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
		&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnAdd" ImageUrl="../../images/ButtonAdd.gif" PostBackUrl="SupplierEmployeeAdd.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnBack" ImageUrl="../../images/ButtonBack.gif" PostBackUrl="Supplier.aspx" />&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
