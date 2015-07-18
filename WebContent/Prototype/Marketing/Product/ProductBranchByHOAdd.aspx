<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>PRODUCT</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<style type="text/css">
.style1 {
	background-color: #F4FAFF;
	text-align: left;
}
.style2 {
	background-color: #FFFFFF;
	text-align: left;
}
</style>
</head>


<body>
<form id="FrmProductBranchByHOAdd" runat="server">
<div align="center">
  <div align="center">
    <div align="center"> 
      <table width="95%" border="0" cellspacing="0" cellpadding="0">
        <tr class="trtopihijau"> 
          <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
          <td align="center" class="tdtopihijau">PRODUCT BRANCH</td>
          <td width="10" class="tdtopihijaukanan">&nbsp;</td>
        </tr>
      </table>
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="25%" class="style1">Product ID</td>
          <td class="style2">
		<asp:HyperLink runat="server" id="LinkProduct" NavigateUrl="ProductView.aspx" Target="_blank">CFMOHND001
		</asp:HyperLink>
			</td>
        </tr>
        <tr> 
          <td class="style1">Description</td>
          <td class="style2">PRODUCT CONSUMER FINANCE NEW HONDA</td>
        </tr>
      </table>
      <br></br>
      <table width="95%" border="0" cellspacing="0" cellpadding="0">
        <tr class="trtopiabu"> 
          <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
          <td align="center" class="tdtopihijau">PRODUCT - ASSIGN BRANCH</td>
          <td width="10" class="tdtopihijaukanan">&nbsp;</td>
        </tr>
      </table>
      <div align="center"> 
        <div align="center"> 
          <asp:GridView runat="server" id="GrdViewProductBranchByHOAdd" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
			<Columns>
				<asp:templatefield HeaderText="ASSIGN">
					<AlternatingItemTemplate>
						<asp:CheckBox runat="server" id="CbAssign" Checked="True" />
					</AlternatingItemTemplate>
					<ItemTemplate>
						<asp:CheckBox runat="server" id="CbAssign" Checked="True" />
					</ItemTemplate>
				</asp:templatefield>
				<asp:boundfield DataField="valstring50" HeaderText="BRANCH NAME" SortExpression="valstring50">
					<ItemStyle HorizontalAlign="Left" />
				</asp:boundfield>
			</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
			</asp:GridView>
			<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
			</asp:XmlDataSource>
        </div>
      </div>
    </div>
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp; </td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnOk" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="Product.aspx" />&nbsp; 
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="Product.aspx" />&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
