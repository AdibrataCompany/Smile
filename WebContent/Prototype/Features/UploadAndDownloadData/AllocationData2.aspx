<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>FEATURES</title>
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
.style4 {
	color: #FF0000;
}
.style5 {
	text-align: left;
	color: #FF0000;
}
</style>
</head>

<body>
<form id="FrmAllocationData2" runat="server">
<div align="center">
  <table style="width: 100%">
	<tr>
		<td class="style5">&nbsp;&nbsp;&nbsp; <font color="red"><i>*)&nbsp;&nbsp; required field</i></font></td>
	</tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopiungu2kiri">&nbsp;</td>
      <td align="center" class="tdtopiungu2">ALLOCATION DATA</td>
      <td width="10" class="tdtopiungu2kanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style2" style="width: 30%">Module</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbModule">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem>Marketing</asp:ListItem>
			<asp:ListItem>Finance</asp:ListItem>			
		</asp:DropDownList>
		&nbsp; <span class="style4">*)</span></td>
    </tr>
    <tr> 
      <td class="style2" style="width: 30%">Application Type</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbApplicationType">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem>Supplier</asp:ListItem>									
		</asp:DropDownList>
		&nbsp; <span class="style4">*)</span></td>
    </tr>
    <tr> 
      <td class="style2" style="width: 30%">Search By</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbSearch">
			<asp:ListItem>Download Key</asp:ListItem>
			<asp:ListItem>Row No.</asp:ListItem>						
		</asp:DropDownList>
&nbsp;
		<asp:TextBox runat="server" id="TbsSearch" Height="18px"></asp:TextBox>
&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<a href="../../Marketing/AssetMnt/AssetMasterListing.htm">
		<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" PostBackUrl="AllocationData2.aspx" /></a>&nbsp; 
        <asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" PostBackUrl="AllocationData2.aspx" />&nbsp;</td>
    </tr>
  </table>
  <br />
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiungu2kiri">&nbsp;</td>
      <td align="center" class="tdtopiungu2">ALLOCATION DATA - TRANSFER</td>
      <td width="10" class="tdtopiungu2kanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style2" style="width: 30%">Module</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbModule0">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem>Marketing</asp:ListItem>
			<asp:ListItem>Finance</asp:ListItem>			
		</asp:DropDownList>
&nbsp; <span class="style4">*)</span></td>
    </tr>
    <tr> 
      <td class="style2" style="width: 30%">Application Type</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbApplicationType0">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem>Supplier</asp:ListItem>									
		</asp:DropDownList>
		&nbsp; <span class="style4">*)</span></td>
    </tr>
    <tr> 
      <td class="style2" style="width: 30%">Table Name</td>
      <td class="style1">
		<asp:DropDownList runat="server" id="CmbTableName">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem>Sales</asp:ListItem>						
			<asp:ListItem>SupplierIncentive</asp:ListItem>
		</asp:DropDownList>
		&nbsp;<span class="style4">*)</span> </td>
    </tr>
  </table>
  <br />
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiungu2kiri">&nbsp;</td>
      <td align="center" class="tdtopiungu2">ALLOCATION DATA - LISTING</td>
      <td width="10" class="tdtopiungu2kanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <asp:GridView runat="server" id="GrdViewAllocationData" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
		<Columns>
			<asp:boundfield DataField="valnum9" SortExpression="valnum9" HeaderText="DOWNLOAD KEY">
				<ItemStyle HorizontalAlign="Left" />
			</asp:boundfield>
			<asp:boundfield DataField="valnum9" SortExpression="valnum9" HeaderText="ROW NO">
				<ItemStyle HorizontalAlign="Right" />
			</asp:boundfield>
			<asp:boundfield DataField="valstring100" SortExpression="valstring100" HeaderText="S1">
				<ItemStyle Width="5%" HorizontalAlign="Left" />
				<HeaderStyle Width="5%" />
			</asp:boundfield>
			<asp:boundfield DataField="valstring100" SortExpression="valstring100" HeaderText="S2">
				<ItemStyle Width="5%" HorizontalAlign="Left" />
				<HeaderStyle Width="5%" />
			</asp:boundfield>
			<asp:boundfield DataField="valamount" SortExpression="valamount" HeaderText="N1">
				<ItemStyle HorizontalAlign="Right" />
			</asp:boundfield>
			<asp:boundfield DataField="valamount" SortExpression="valamount" HeaderText="N2">
				<ItemStyle HorizontalAlign="Right" />
			</asp:boundfield>
			<asp:boundfield DataField="valdate" SortExpression="valdate" HeaderText="D1">
				<ItemStyle HorizontalAlign="Left" />
			</asp:boundfield>
			<asp:boundfield DataField="valdate" SortExpression="valdate" HeaderText="D2">
				<ItemStyle HorizontalAlign="Left" />
			</asp:boundfield>
			<asp:templatefield>
				<HeaderTemplate>
					<asp:CheckBox runat="server" id="CbSelect" />
				</HeaderTemplate>
				<AlternatingItemTemplate>
					<asp:CheckBox runat="server" id="CbSelect" />
				</AlternatingItemTemplate>
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:CheckBox runat="server" id="CbSelect" />
				</ItemTemplate>
			</asp:templatefield>
		</Columns>
		<HeaderStyle BackColor="#F2D9F2" />
		<AlternatingRowStyle CssClass="tdgenap" />
		</asp:GridView>
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="C:\Inetpub\wwwroot\Final Prototype\DataType.xml">
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
		<asp:TextBox runat="server" id="TbnPage" Width="20px" Height="18px">
		</asp:TextBox>
&nbsp;&nbsp; 
        <asp:ImageButton runat="server" id="BtnGo" ImageUrl="../../images/buttonGO.gif" /></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30" class="style3">
		&nbsp;
		</td>
      <td width="50%" align="right">
		&nbsp;
		&nbsp;
		<asp:ImageButton runat="server" id="BtnAllocation" ImageUrl="../../images/ButtonAllocationData.GIF" PostBackUrl="AllocationData2.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.GIF" PostBackUrl="AllocationData2.aspx" /></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
