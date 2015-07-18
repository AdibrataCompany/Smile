<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>*</title>
<link rel="stylesheet" type="text/css" href="../Confins.css" />
<script language="JavaScript" type="text/JavaScript">

function myClose() {
    close();}

</script >

<style type="text/css">
.style2 {
	background-color: #FFFFFF;
	text-align: left;
}
.style3 {
	background-color: #F4FAFF;
	text-align: left;
}
</style>
</head>
<body>
<form id="FrmSupplierLookUp" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style3" style="width: 219px">Supplier Category</td>
      <td class="style2">
		<asp:DropDownList runat="server" id="CmbSupplierCategory" CssClass="inptype">
	        <asp:ListItem>Select One</asp:ListItem>	
			<asp:ListItem>Traditional</asp:ListItem>
			<asp:ListItem>Modern</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
    <tr> 
      <td class="style3" style="width: 219px">Search By</td>
      <td class="style2">
<asp:DropDownList runat="server" id="CmbSearch" CssClass="inptype">
	<asp:ListItem>Supplier ID</asp:ListItem>
	<asp:ListItem>Supplier Name</asp:ListItem>
</asp:DropDownList>
&nbsp;
<asp:TextBox runat="server" id="TbsDescriptionSearch" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../images/ButtonSearch.gif" PostBackUrl="SupplierLookUp.aspx" />&nbsp; 
        <asp:ImageButton runat="server" id="BtnReset" ImageUrl="../images/ButtonReset.gif" PostBackUrl="SupplierLookUp.aspx" /> 
      </td>
    </tr>
  </table>
  <br />
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER LISTING </td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <asp:GridView runat="server" id="GrdViewSupplierLookUp" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
	<Columns>
		<asp:templatefield HeaderText="SELECT">
			<AlternatingItemTemplate>
				<asp:RadioButton runat="server" id="RndBtnSupplierSelect" />
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:RadioButton runat="server" id="RndBtnSupplierSelect" />
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="valstring10" SortExpression="valstring10" HeaderText="SUPPLIER ID">
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="SUPPLIER NAME">
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="SUPPLIER ADDRESS">
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" SortExpression="valstring10" HeaderText="SUPPLIER PHONE">
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="CONTACT PERSON">
		</asp:boundfield>
	</Columns>
	<HeaderStyle CssClass="tdjudulhijau" />
	<AlternatingRowStyle CssClass="tdgenap" />
	</asp:GridView>
	<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
	</asp:XmlDataSource>
  <div align="center">
	<div align="center">
		<div align="center">
			<div align="center">
				<div align="center">
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnFirstPrev" ImageUrl="../images/butkiri1.gif" Width="20px" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnPrev" ImageUrl="../images/butkiri.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnNext" ImageUrl="../images/butkanan.gif" Width="20px" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnLastNext" ImageUrl="../images/butkanan1.gif" /></td>
      <td width="130" align="center">Page 
        <asp:TextBox runat="server" id="TbnPage" Width="20px" CssClass="inptype">
		</asp:TextBox>
&nbsp;&nbsp; 
        <asp:ImageButton runat="server" id="BtnGo" ImageUrl="../images/buttonGO.gif" /></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
</div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../images/ButtonSelect.gif" Height="20px" onclientclick="myClose();" />&nbsp;&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../images/ButtonExit.gif" onclientclick="myClose();" /></td>
    </tr>
  </table>
    				<br />
				</div>
			</div>
		</div>
	</div>
	</div>
</div>

</form>
</body>
</html>
