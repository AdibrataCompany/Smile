<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
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
      <td align="center" class="tdtopiorange">CREDIT REVIEW - STANDARD CRITERIA</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Group Criteria</td>
      <td class="tdganjil">Asset Document</td>
    </tr>
        <tr> 
      <td width="25%" class="tdgenap">Search By</td>
      <td class="tdganjil">
      <select name="select4">
          <option selected>NST Criteria ID</option>
          <option>NST Criteria Description</option>
        </select> <input name="textfield3" type="text" class="inptype" size="20"></td>
    </tr>

  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton ID="imbSearch" runat="server" ImageUrl="../../Images/ButtonSearch.gif">
      </asp:ImageButton>
      <asp:ImageButton ID="imbReset" runat="server" ImageUrl="../../Images/ButtonReset.gif">
      </asp:ImageButton>
     
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiorangekiri">&nbsp;</td>
      <td align="center" class="tdtopiorange">STANDARD CRITERIA LISTING</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <asp:GridView ID="grdSubBranch" runat="server"  AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
      <Columns>
		<asp:templatefield HeaderText="ID">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="hypSubBranchView" NavigateUrl="SubBranchView.aspx" Target="_blank">xxx3xxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:boundfield DataField="valstring10" HeaderText="DESCRIPTION" SortExpression="valstring10">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:templatefield HeaderText="EDIT">
			<ItemTemplate>
				<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="CreditReviewSettingStandardCriteriaEdit.aspx" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="DELETE">
			<ItemTemplate>
				<asp:ImageButton runat="server" id="btnDelete" ImageUrl="../../images/IconDelete.gif"/>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>

	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
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
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
      <asp:HyperLink ImageUrl="../../Images/ButtonAdd.gif" NavigateUrl="CreditReviewSettingStandardCriteriaAdd.aspx" ID="hypNSTCriteriaAdd" runat="server"> </asp:HyperLink>

      </td>
    </tr>
  </table>

</form>
</body>
</html>
