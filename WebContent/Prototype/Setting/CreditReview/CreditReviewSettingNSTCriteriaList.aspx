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
      <td align="center" class="tdtopiorange">CREDIT REVIEW - NST CRITERIA</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Group Criteria</td>
      <td class="tdganjil">Asset Document</td>
    </tr>
        <tr>
      <td width="20%" class="tdgenap">Branch</td>
      <td class="tdganjil" >
		<asp:DropDownList runat="server" id="DDLBranch" CssClass="inptype" Width="143px" Height="16px">
			<asp:ListItem>Select One </asp:ListItem>
			<asp:ListItem>Bandung</asp:ListItem>
			<asp:ListItem>Jakarta</asp:ListItem>
		</asp:DropDownList>
		</td>
		
    </tr>
	<tr>
          <td class="tdgenap" width="20%">Asset Type</td>
          <td class="tdganjil" width="80%">
		  <asp:DropDownList runat="server" id="ddlAssetType" Width="250px" CssClass="inptype">
				<asp:ListItem Text="Select One"></asp:ListItem>
				<asp:ListItem Text="Mobil"></asp:ListItem>
				<asp:ListItem  Text="Motor"></asp:ListItem>
			</asp:DropDownList>

        </tr>
	
	</tr>
	<tr>
      <td width="20%" class="tdgenap">Asset Category</td>
      <td class="tdganjil" >
			<asp:DropDownList runat="server" id="ddlAssetCategory" Width="250px" CssClass="inptype">
				<asp:ListItem Text="Select One"></asp:ListItem>
				<asp:ListItem Value="N" Text="Non Truck"></asp:ListItem>
				<asp:ListItem Value="T" Text="Truck"></asp:ListItem>
			</asp:DropDownList>

		</td>
    </tr>
	<tr>
      <td width="20%" class="tdgenap">Asset Ussage</td>
      <td class="tdganjil" >
			<asp:DropDownList runat="server" id="CmbVehicleType" CssClass="inptype">
				<asp:ListItem Text="Select One"></asp:ListItem>
				<asp:ListItem Value="C" Text="Commercial"></asp:ListItem>
				<asp:ListItem Value="N" Text="Non Commercial"></asp:ListItem>
			</asp:DropDownList>

		</td>
    </tr>
	<tr>
      <td width="20%" class="tdgenap">Finance Type</td>
      <td class="tdganjil" >
			<asp:RadioButtonlist runat="server" id="RdBtnFinanceType" RepeatDirection="Horizontal">
			<asp:ListItem Text="Consumer Finance" Selected="True"></asp:ListItem>
			<asp:ListItem Text="Finance Lease"></asp:ListItem>
			</asp:RadioButtonList>
		</td>
    </tr>
	<tr>
      <td width="20%" class="tdgenap">Leaseback Type</td>
      <td class="tdganjil">
			<asp:RadioButtonlist runat="server" id="RdBtnLeaseBack" RepeatDirection="Horizontal">
			<asp:ListItem Text="Direct Finance" Selected="True"></asp:ListItem>
			<asp:ListItem Text="Leaseback"></asp:ListItem>
			</asp:RadioButtonList>

		</td>
    </tr>
	<tr>
      <td width="20%" class="tdgenap">New / Used Type</td>
      <td class="tdganjil" >
			<asp:RadioButtonlist runat="server" id="RdBtnNew" RepeatDirection="Horizontal">
			<asp:ListItem Text="New" Selected="True"></asp:ListItem>
			<asp:ListItem Text="Used"></asp:ListItem>
			</asp:RadioButtonList>
    </tr>
   	</tr>
	<tr>
          <td class="tdgenap">Syairah Type</td>
          <td class="tdganjil"> 
			<asp:RadioButtonList runat="server" id="rdlConventionalType" RepeatDirection="Horizontal">
				<asp:ListItem  Value="C" Text="Non Syairah" Selected="True"></asp:ListItem>
				<asp:ListItem Value="S" Text="Syariah"></asp:ListItem>
			</asp:RadioButtonList>
			</td>
        	</tr>
	<tr>
          <td class="tdgenap">Floor Financing</td>
          <td class="tdganjil">
				<asp:RadioButtonList runat="server" id="rdoFloorFinancing" RepeatDirection="Horizontal">
				<asp:ListItem Value="Y" Text="Yes" Selected="true"></asp:ListItem>
				<asp:ListItem Value="N" Text="No"></asp:ListItem>
			</asp:RadioButtonList>
				</td>
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
      <td align="center" class="tdtopiorange">NST CRITERIA LISTING</td>
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
				<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="CreditReviewSettingNSTCriteriaEdit.aspx" />
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
      <asp:HyperLink ImageUrl="../../Images/ButtonAdd.gif" NavigateUrl="CreditReviewSettingNSTCriteriaAdd.aspx" ID="hypNSTCriteriaAdd" runat="server"> </asp:HyperLink>

      </td>
    </tr>
  </table>

</form>
</body>
</html>
