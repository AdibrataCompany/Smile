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
      <td width="10" height="20" class="tdtopiorangekiri">&nbsp;</td>
      <td align="center" class="tdtopiorange">TELESALES ACTIVITY RESULT</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr>
      <td width="25%" class="tdgenap">Telesales Activity Type</td>
      <td class="tdganjil">xxxxx20xxxxx</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Search By</td>
      <td class="tdganjil">&nbsp;<asp:DropDownList runat="server" id="DropDownList1">
		<asp:ListItem Value="TblTseActType.ActTypeID">ID</asp:ListItem>
		<asp:ListItem Value="TblTseActType.ActTypeDesc">Description
		</asp:ListItem>
		</asp:DropDownList>&nbsp;
		<asp:TextBox runat="server" id="txtSearchBy" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton runat="server" id="imbSearch" ImageUrl="../../Images/ButtonSearch.gif" PostBackUrl="TseActResult.aspx"></asp:ImageButton >
        &nbsp;<asp:ImageButton runat="server" id="imbReset" ImageUrl="../../Images/ButtonReset.gif" PostBackUrl="TseActResult.aspx"></asp:ImageButton >  
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiorangekiri">&nbsp;</td>
      <td align="center" class="tdtopiorange">TELESALES ACTIVITY RESULT LISTING</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
    <asp:GridView runat="server" id="grdTseActResult" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" AllowSorting="True" >
    <Columns>
		<asp:boundfield DataField="valstring10" HeaderText="ACTIVITY RESULT ID" SortExpression="valstring10">
		</asp:boundfield>
		<asp:boundfield DataField="valstring30" HeaderText="ACTIVITY RESULT DESCRIPTION" SortExpression="valstring30">
		</asp:boundfield>
		<asp:templatefield HeaderText="EDIT">
			<AlternatingItemTemplate>
				<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../Images/IconEdit.gif" PostBackUrl="TseActResultEdit.aspx" />
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../Images/IconEdit.gif" PostBackUrl="TseActResultEdit.aspx" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="DELETE">
			<AlternatingItemTemplate>
				<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../Images/IconDelete.gif" />
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../Images/IconDelete.gif" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
		<HeaderStyle CssClass="tdjudulhijau" />
		<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
   	<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
	</asp:XmlDataSource>
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center">
		<img src="../../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center">
		<img src="../../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center">
		<img src="../../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center">
		<img src="../../images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../../images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30"> <asp:ImageButton runat="server" id="imbPrint" ImageUrl="../../Images/ButtonPrint.gif"></asp:ImageButton ></td>
      <td width="50%" align="right"><asp:ImageButton runat="server" id="imbAdd" ImageUrl="../../Images/ButtonAdd.gif" PostBackUrl="TseActResultAdd.aspx"></asp:ImageButton >
      <asp:ImageButton runat="server" id="imbBack" ImageUrl="../../Images/ButtonBack.gif" PostBackUrl="TseActType.aspx"></asp:ImageButton >
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
