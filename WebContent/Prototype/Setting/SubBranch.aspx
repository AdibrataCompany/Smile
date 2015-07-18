<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head>

<body>
<form id="frmSubBranch" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiorangekiri">&nbsp;</td>
      <td align="center" class="tdtopiorange">SUB BRANCH</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Branch</td>
      <td class="tdganjil">Bandung</td>
    </tr>
        <tr> 
      <td width="25%" class="tdgenap">Search By</td>
      <td class="tdganjil">
      <select name="select4">
          <option selected>Sub Branch ID</option>
          <option>Sub Branch Name</option>
        </select> <input name="textfield3" type="text" class="inptype" size="20"></td>
    </tr>

  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton ID="imbSearch" runat="server" ImageUrl="../Images/ButtonSearch.gif">
      </asp:ImageButton>
      <asp:ImageButton ID="imbReset" runat="server" ImageUrl="../Images/ButtonReset.gif">
      </asp:ImageButton>
     
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiorangekiri">&nbsp;</td>
      <td align="center" class="tdtopiorange">SUB BRANCH LISTING</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <asp:GridView ID="grdSubBranch" runat="server"  AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
      <Columns>
		<asp:templatefield HeaderText="ID">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="hypSubBranchView" NavigateUrl="SubBranchView.aspx" Target="_blank">xxx3xxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:HyperLink runat="server" id="hypSubBranchView" NavigateUrl="SubBranchView.aspx" Target="_blank">xxx3xxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:boundfield DataField="valstring10" HeaderText="TYPE" SortExpression="valstring10">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring25" HeaderText="ADDRESS" SortExpression="valstring25">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="vphone" HeaderText="PHONE" SortExpression="vphone">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" HeaderText="CONTACT PERSON" SortExpression="valstring10">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:templatefield HeaderText="EDIT">
			<AlternatingItemTemplate>
				<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../images/IconEdit.gif" PostBackUrl="SubBranchEdit.aspx" />
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../images/IconEdit.gif" PostBackUrl="SubBranchEdit.aspx" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
  </asp:GridView>
  <asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
		</asp:XmlDataSource>

    
  </div>
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><img src="../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><a href="BranchAdd.htm">
      <asp:HyperLink ImageUrl="../Images/ButtonAdd.gif" NavigateUrl="SubBranchAdd.aspx" ID="hypSubBranchAdd" runat="server"> </asp:HyperLink>

      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
