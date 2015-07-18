<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
</head>
<body>
<form  id="FrmCollectionGroupSetting" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">COLLECTION ISLAND</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
  <tr> 
      <td width="20%" class="tdgenap">Island Name</td>
      <td width="80%" class="tdganjil" colspan=3> 
        <select name="select14" style="width: 155px">
          <option selected>All</option>
          <option>Sumatera</option>
          <option>Jawa</option>
          <option>Sulawesi</option>
        </select>&nbsp;
      </td>
    </tr>

    <tr> 
      <td width="20%" class="tdgenap">Search By</td>
      <td width="80%" class="tdganjil" colspan=3> 
        <select name="select14">
          <option selected>Collection Island Id</option>
          <option>Collection Island Name</option>
         
        </select>
        <input type="text" name="textfield">
      </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td> 
        <div align="right"> <img src="../../Images/ButtonSearch.gif" width="100" height="20"><img src="../../Images/ButtonReset.gif" width="100" height="20"></div>
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">COLLECTION ISLAND LISTING</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
   <div align="center">
    <asp:GridView runat="server" id="GrdListAgreement"  AllowSorting="True" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="ISLAND NAME">
		</asp:boundfield>
		<asp:templatefield SortExpression="valstring20" HeaderText="COLLECTION ISLAND ID">
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkCollectionIslandid" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank">x3x
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="COLLECTION ISLAND NAME">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="ADDRESS">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring20" SortExpression="valstring20" HeaderText="PHONE NO">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="COLLECTION ISLAND  HEAD">
		</asp:boundfield>
		<asp:templatefield HeaderText="COLLECTION ISLAND MEMBER">
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				<asp:ImageButton id="ImbEdit" runat="server" ImageUrl="../../Images/iconedit.gif" PostBackUrl="CollectionIslandSettingMember.aspx" />
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="EDIT">
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				<asp:ImageButton id="ImbEdit" runat="server" ImageUrl="../../Images/iconedit.gif" PostBackUrl="CollectionIslandSettingEdit.aspx" />
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="DELETE">
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				<asp:ImageButton id="ImbDelete" runat="server" ImageUrl="../../Images/icondelete.gif" CommandName="Delete" CausesValidation="False" />
			</ItemTemplate>
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulungu" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
      
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
    </div>

 
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><img src="../../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../../images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30"><a href="../Report/RptCollIsland.htm"><img src="../../Images/ButtonPrint.gif" width="100" height="20" border="0"></a></td>
      <td width="50%" align="right"><a href="CollectionIslandSettingAdd.aspx"><img src="../../Images/ButtonAdd.gif" width="100" height="20" border="0"></a> 
      </td>
    </tr>
  </table>
  
</div>
</form>
</body>
</html>
