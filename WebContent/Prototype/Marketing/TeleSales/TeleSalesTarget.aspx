<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Tele Sales Target</title>
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
<form id="FrmTeleSalesTarget" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">TELE SALES TARGET</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
	<tr> 
      <td class="style2" width="20%">TSE ID</td>
      <td class="style1" width="80%">
		XXXXXXXXXX</td>
    </tr>

    <tr> 
      <td class="style2" width="20%">Tele Sales Name</td>
      <td class="style1" width="80%" >
		 XXXXX</td>
    </tr>
    <tr> 
      <td class="style2" width="20%">Year</td>
      <td class="style1" width="80%">
		<asp:TextBox runat="server" id="TbnYear" Width="60px" CssClass="inptype"></asp:TextBox>
		</td>
      
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" PostBackUrl="TeleSalesTarget.aspx" />&nbsp; 
        <asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" PostBackUrl="TeleSalesTarget.aspx" />&nbsp;</td>
    </tr>
  </table>
  <br />
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">TELE SALES TARGET LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <asp:GridView runat="server" id="GrdViewSupplierBudgetListing" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
		<Columns>
			<asp:templatefield HeaderText="YEAR">
				<AlternatingItemTemplate>
					YYYY
				</AlternatingItemTemplate>
				<ItemTemplate>
					YYYY
				</ItemTemplate>
			</asp:templatefield>
			<asp:boundfield DataField="valunit" SortExpression="valunit" HeaderText="PROSPECT TARGET">
				<ItemStyle HorizontalAlign="Right" />
			</asp:boundfield>
			<asp:boundfield DataField="valunit" SortExpression="valunit" HeaderText="UNIT TARGET">
				<ItemStyle HorizontalAlign="Right" />
			</asp:boundfield>
			<asp:boundfield DataField="valamount" SortExpression="valamount" HeaderText="PHONE BUDGET">
				<ItemStyle HorizontalAlign="Right" />
			</asp:boundfield>
			<asp:boundfield DataField="valamount" SortExpression="valamount" HeaderText="PHONE EXPENSE">
				<ItemStyle HorizontalAlign="Right" />
			</asp:boundfield>
			<asp:templatefield HeaderText="EDIT">
				<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="TeleSalesTargetEdit.aspx" />
				</AlternatingItemTemplate>
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="TeleSalesTargetEdit.aspx" />
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="DELETE">
				<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../images/IconDelete.gif" />
				</AlternatingItemTemplate>
				<ItemStyle HorizontalAlign="Center" />
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
  <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0" style="height: 1px">
    <tr> 
       <td></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30" class="style3">
		<asp:ImageButton runat="server" id="BtnPrint" ImageUrl="../../images/ButtonPrint.gif" /></td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnAdd" ImageUrl="../../images/ButtonAdd.gif" PostBackUrl="TeleSalesTargetAdd.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnAdd0" ImageUrl="../../images/ButtonBack.gif" PostBackUrl="TeleSales.aspx" />&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
