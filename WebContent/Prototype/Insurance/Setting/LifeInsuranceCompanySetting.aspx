<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
</head>

<body>
<form id="form1" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">LIFE INSURANCE COMPANY SETTING</td>
      <td width="10"><img src="../../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Search By</td>
      <td class="tdganjil">
        <asp:DropDownList runat="server" id="ddlSearchBy">
			<asp:ListItem>Company Name</asp:ListItem>
			<asp:ListItem>Contact Person</asp:ListItem>
		</asp:DropDownList>
		&nbsp;
		<asp:TextBox runat="server" id="txtSearchBy" CssClass="inptype">
		</asp:TextBox>
      </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr align="right"> 
      <td><asp:ImageButton runat="server" id="imbSearch" ImageUrl="../Images/ButtonSearch.gif" /> 
        <asp:ImageButton runat="server" id="imbReset" ImageUrl="../Images/ButtonReset.gif" /> </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">LIFE INSURANCE COMPANY LISTING</td>
      <td width="10"><img src="../../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
 <asp:GridView runat="server" id="GrdViewInsCoSetting" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
  <Columns>
	<asp:boundfield DataField="valstring10" HeaderText="INS CO. BRANCH" SortExpression="valstring10">
	</asp:boundfield>
	<asp:boundfield DataField="valstring25" HeaderText="INSCO. BRANCH NAME" SortExpression="valstring25">
	</asp:boundfield>
	<asp:boundfield DataField="valstring20" HeaderText="CONTACT PERSON" SortExpression="valstring20">
	</asp:boundfield>
	<asp:boundfield DataField="vphone" HeaderText="PHONE" SortExpression="vphone">
	</asp:boundfield>
	<asp:boundfield DataField="valstring20" HeaderText="COMPANY BRANCH" SortExpression="valstring20">
	</asp:boundfield>
	<asp:templatefield HeaderText="BRANCH">
		<AlternatingItemTemplate>
			<asp:ImageButton runat="server" ImageUrl="../images/IconBranch.gif" PostBackUrl="LifeInsuranceCompanySettingBranch.aspx" />
		</AlternatingItemTemplate>
		<ItemTemplate>
			<asp:ImageButton runat="server" ImageUrl="../images/IconBranch.gif" PostBackUrl="LifeInsuranceCompanySettingBranch.aspx" />
		</ItemTemplate>
		<ItemStyle HorizontalAlign="Center" />
	</asp:templatefield>
	<asp:templatefield HeaderText="EDIT">
		<AlternatingItemTemplate>
			<asp:ImageButton runat="server" ImageUrl="../images/iconEdit.gif" PostBackUrl="LifeInsuranceCompanySettingEdit.aspx" />
		</AlternatingItemTemplate>
		<ItemTemplate>
			<asp:ImageButton runat="server" ImageUrl="../images/iconEdit.gif" PostBackUrl="LifeInsuranceCompanySettingEdit.aspx" />
		</ItemTemplate>
		<ItemStyle HorizontalAlign="Center" />
	</asp:templatefield>
	<asp:templatefield HeaderText="DELETE">
		<AlternatingItemTemplate>
			<asp:ImageButton runat="server" ImageUrl="../images/iconDelete.gif" />
		</AlternatingItemTemplate>
		<ItemTemplate>
			<asp:ImageButton runat="server" ImageUrl="../images/iconDelete.gif" />
		</ItemTemplate>
		<ItemStyle HorizontalAlign="Center" />
	</asp:templatefield>
	</Columns>
  <HeaderStyle CssClass="tdjudulabu" />
  <AlternatingRowStyle CssClass="tdgenap" />
  </asp:GridView>
  <asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
  </asp:XmlDataSource>  
  
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><img src="../../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield2" class="inptype" size="3"> &nbsp; 
        <img src="../../images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td width="50%" height="30"></td>
      <td width="50%" align="right"><asp:ImageButton runat="server" id="imbAdd" ImageUrl ="../images/ButtonAdd.gif" PostBackUrl="LifeInsuranceCompanySettingAdd.aspx"></asp:ImageButton></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
