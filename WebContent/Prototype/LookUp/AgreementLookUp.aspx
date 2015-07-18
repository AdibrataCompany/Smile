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
<form id="FrmAgreementLookUp" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">AGREEMENT</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style3" style="width: 175px">Currency</td>
      <td class="style2">
		<asp:DropDownList runat="server" id="CmbCurrency">
	        <asp:ListItem>Select One</asp:ListItem>	
			<asp:ListItem>Rupiah</asp:ListItem>
			<asp:ListItem>US Dollar</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
    <tr> 
      <td class="style3" style="width: 175px">Search By</td>
      <td class="style2">
<asp:DropDownList runat="server" id="CmbSearch">
	<asp:ListItem>Agreement No</asp:ListItem>
	<asp:ListItem>Customer Name</asp:ListItem>
	<asp:ListItem>Product Offering</asp:ListItem>
	<asp:ListItem>Way Of Payment</asp:ListItem>
</asp:DropDownList>
&nbsp;
<asp:TextBox runat="server" id="TbsDescriptionSearch" Height="18px" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<a href="../Marketing/AssetMnt/AssetMasterListing.htm">
		<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../images/ButtonSearch.gif" PostBackUrl="AgreementLookUp.aspx" /></a>&nbsp; 
        <asp:ImageButton runat="server" id="BtnReset" ImageUrl="../images/ButtonReset.gif" PostBackUrl="AgreementLookUp.aspx" /> 
      </td>
    </tr>
  </table>
  <br />
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">AGREEMENT&nbsp; LISTING </td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
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
		<asp:boundfield DataField="valstring20" SortExpression="valstring20" HeaderText="AGREEMENT NO">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="CUSTOMER NAME">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="PRODUCT OFFERING">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" SortExpression="valstring10" HeaderText="WAY OF PAYMENT">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
	</Columns>
	<HeaderStyle CssClass="tdjudulungu" />
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
        <asp:TextBox runat="server" id="TbnPage" Width="20px" Height="18px">
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
      <td width="50%" align="right"><a href="javascript:history.go(-1);">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../images/ButtonSelect.gif" Height="20px" onclientclick="myClose();" /></a>&nbsp;&nbsp;<a href="javascript:history.go(-1);"><asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../images/ButtonExit.gif" onclientclick="myClose();" /></a></td>
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
