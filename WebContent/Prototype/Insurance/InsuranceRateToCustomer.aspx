<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
</head>

<body>
<form id="form1" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">RATE TO CUSTOMER </td>
      <td width="10"><img src="../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdganjil"> 
      <td width="200" class="tdgenap">Branch</td>
      <td class="tdganjil"> xxxx10xxxxxxx </td>
    </tr>
    <tr class="tdganjil"> 
      <td width="200" class="tdgenap">Search By</td>
      <td class="tdganjil"> 
		<asp:DropDownList runat="server" id="ddlSearchBy">
			<asp:ListItem>Insurance Asset Type</asp:ListItem>
			<asp:ListItem>Asset Usage</asp:ListItem>
			<asp:ListItem>New / Used</asp:ListItem>
			<asp:ListItem>Coverage Type</asp:ListItem>
			<asp:ListItem>Currency</asp:ListItem>
		</asp:DropDownList>
		&nbsp;
		<asp:TextBox runat="server" id="txtSearchBy" CssClass="inptype"></asp:TextBox>
		&nbsp;</td>
    </tr>

    <tr class="tdganjil">
      <td width="200" class="tdgenap">Copy Rate From Branch</td>
      <td class="tdganjil">
        <p>
          <asp:DropDownList runat="server" id="ddlCopyRateBranch">
			<asp:ListItem>Pecenongan</asp:ListItem>
			<asp:ListItem>Arteri</asp:ListItem>
			<asp:ListItem>Kelapa Gading</asp:ListItem>
			</asp:DropDownList>
			&nbsp;<asp:ImageButton runat="server" id="imbCopy" ImageUrl="../Images/ButtonCopy.gif" /></p>
        <p>This action will delete all Rate inserted for this branch and copy 
		all Rate from selected Branch</p>
      </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr align="right"> 
      <td>&nbsp;<asp:ImageButton runat="server" id="imbSearch" ImageUrl="../Images/ButtonSearch.gif" /><asp:ImageButton runat="server" id="imbReset" ImageUrl="../Images/ButtonReset.gif"/></td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">RATE TO CUSTOMER LISTING</td>
      <td width="10"><img src="../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
      <asp:GridView runat="server" id="GrdInsCoBranchRate" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
		<Columns>
			<asp:boundfield DataField="valstring10" HeaderText="INS. ASSET TYPE" SortExpression="valstring10">
			</asp:boundfield>
			<asp:boundfield DataField="valstring10" HeaderText="ASSET USAGE" SortExpression="valstring10">
			</asp:boundfield>
			<asp:boundfield DataField="valstring2" HeaderText="FINANCE TYPE" SortExpression="valstring2">
			</asp:boundfield>
			<asp:boundfield DataField="valstring2" HeaderText="LEASE BACK TYPE" SortExpression="valstring2">
			</asp:boundfield>
			<asp:boundfield DataField="valstring6" HeaderText="NEW / USED" SortExpression="valstring6">
			</asp:boundfield>
			<asp:boundfield DataField="valstring10" HeaderText="COVERAGE TYPE" SortExpression="valstring10">
			</asp:boundfield>
			<asp:boundfield DataField="vCurr" HeaderText="CURR" SortExpression="vCurr">
			</asp:boundfield>
			<asp:boundfield DataField="valNo" HeaderText="YEAR NUM" SortExpression="valNo">
				<ItemStyle HorizontalAlign="Right" />
			</asp:boundfield>
			<asp:boundfield DataField="valamount" HeaderText="OTR FROM" SortExpression="valamount">
				<ItemStyle HorizontalAlign="Right" />
			</asp:boundfield>
			<asp:boundfield DataField="valamount" HeaderText="OTR TO" SortExpression="valamount">
				<ItemStyle HorizontalAlign="Right" />
			</asp:boundfield>
			<asp:boundfield DataField="valNum3" HeaderText="% SUM INSURED " SortExpression="valNum3">
				<ItemStyle HorizontalAlign="Right" />
			</asp:boundfield>
			<asp:boundfield DataField="vRate" HeaderText="RATE FOR GROUP" SortExpression="vRate">
				<ItemStyle HorizontalAlign="Right" />
			</asp:boundfield>
			<asp:boundfield DataField="vRate" HeaderText="RATE FOR NON GROUP" SortExpression="vRate">
			</asp:boundfield>
			<asp:boundfield DataField="vRate" HeaderText="RATE FOR RO" SortExpression="vRate">
			</asp:boundfield>
			<asp:templatefield HeaderText="EDIT">
				<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="BtnIcoEdit" ImageUrl="../images/IconEdit.gif" PostBackUrl="InsuranceRateToCustomerEdit.aspx" />
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnIcoEdit" ImageUrl="../images/IconEdit.gif" PostBackUrl="InsuranceRateToCustomerEdit.aspx" />
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center" />
			</asp:templatefield>
			<asp:templatefield HeaderText="DELETE">
				<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="BtnIconDelete" ImageUrl="../images/IconDelete.gif" />
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnIconDelete" ImageUrl="../images/IconDelete.gif" />
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center" />
			</asp:templatefield>
		</Columns>
		<HeaderStyle CssClass="tdjudulabu" />
		<AlternatingRowStyle CssClass="tdgenap" />
		</asp:GridView>
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
		</asp:XmlDataSource> 
  <table width="95%" height="25" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><asp:Image runat="server" id="imbFirstPage" ImageUrl="../images/butkiri1.gif" /></td>
      <td width="30" align="center">  <asp:Image runat="server" id="imbpreviouspage" ImageUrl="../images/butkiri.gif" /></td>
      <td width="30" align="center">  <asp:Image runat="server" id="imbnextpage" ImageUrl="../images/butkanan.gif" /></td>
      <td width="30" align="center">  <asp:Image runat="server" id="imblastpage" ImageUrl="../images/butkanan1.gif" /></td>
      <td align="center" style="width: 318px">Page 
         &nbsp; 
       <asp:TextBox runat="server" id="txtgo" CssClass="inptype" MaxLength="5" Width="10%"></asp:TextBox>
        <asp:Image runat="server" id="imggo" ImageUrl="../images/butgo.gif" />
	</td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td width="50%" height="30"><asp:ImageButton runat="server" id="imbPrint" imageUrl ="../Images/ButtonPrint.gif"/></td>
      <td width="50%" align="right">
      <asp:ImageButton runat="server" id="imbAdd" imageUrl="../images/buttonAdd.gif" PostBackUrl="InsuranceRateToCustomerAdd.aspx"/>
      <asp:ImageButton runat="server" id="imbBack" ImageUrl="../images/buttonBack.gif" PostBackUrl="InsurancePremiumToCustomerSetting.aspx"/>
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
