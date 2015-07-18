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
<div align="center">
<form id="form1" runat="server">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">INSURANCE COMPANY BRANCH RATE</td>
      <td width="10"><img src="../../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Insurance Company Name</td>
      <td class="tdganjil">Panin Insurance</td>
    </tr>
    <tr> 
      <td class="tdgenap">Insurance Branch Id</td>
      <td class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('InsuranceCompanyView.htm','Insurance','scrollbars=yes,width=900,height=500')">PANIN-JKT</a></td>
    </tr>
    <tr> 
      <td width="200" class="tdgenap">Insurance Branch Name</td>
      <td class="tdganjil">Panin Insurance Jakarta</td>
    </tr>
    <tr> 
      <td width="200" class="tdgenap">Company Branch</td>
      <td class="tdganjil">Jakarta - Automotive</td>
    </tr>
    <tr> 
      <td width="200" class="tdgenap">Search By</td>
      <td class="tdganjil"> 
		<asp:DropDownList runat="server" id="ddlSearchBy">
			<asp:ListItem>Insurance Asset Type</asp:ListItem>
			<asp:ListItem>Asset Usage</asp:ListItem>
			<asp:ListItem>New / Used</asp:ListItem>
			<asp:ListItem>Coverage Type</asp:ListItem>
			<asp:ListItem>Currency</asp:ListItem>
		</asp:DropDownList>
		<asp:TextBox runat="server" id="txtSearchBy" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>

    <tr> 
      <td class="tdgenap">Copy Rate From InsCo Branch</td>
      <td class="tdganjil"> 
		<asp:TextBox runat="server" id="txtInsCoBranch" CssClass="inptype">
		</asp:TextBox>
&nbsp;<a href="javascript:;" onClick="MM_openBrWindow('../Lookup/InsCoBranchLookup.htm','InsCoBranch','scrollbars=yes,width=900,height=500')"><img src="../../Images/IconDetail.gif" width="15" height="15" border="0"></a>
		<asp:ImageButton runat="server" id="imbCopy" ImageUrl="../Images/ButtonCopy.gif" />
		&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr align="right"> 
      <td>
		<asp:ImageButton runat="server" id="imbSearch" ImageUrl="../Images/ButtonSearch.gif" />
		<asp:ImageButton runat="server" id="imbReset" ImageUrl="../Images/ButtonReset.gif"/></td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">INSURANCE COMPANY BRANCH RATE</td>
      <td width="10"><img src="../../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
     <asp:GridView runat="server" id="GrdInsCoBranchRate" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
		<Columns>
			<asp:boundfield DataField="valstring10" HeaderText="INS. ASSET TYPE" SortExpression="valstring10">
			</asp:boundfield>
			<asp:boundfield DataField="valstring10" HeaderText="ASSET USAGE" SortExpression="valstring10">
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
			<asp:boundfield DataField="vRate" HeaderText="RATE TO INSCO" SortExpression="vRate">
				<ItemStyle HorizontalAlign="Right" />
			</asp:boundfield>
			<asp:templatefield HeaderText="EDIT">
				<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="BtnIcoEdit" ImageUrl="../images/IconEdit.gif" PostBackUrl="InsuranceCompanyBranchRateEdit.aspx" />
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnIcoEdit" ImageUrl="../images/IconEdit.gif" PostBackUrl="InsuranceCompanyBranchRateEdit.aspx" />
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
      <td width="50%" align="right">&nbsp;<asp:ImageButton runat="server" id="imbAdd" imageUrl="../images/buttonAdd.gif" PostBackUrl="InsuranceCompanyBranchRateAdd.aspx"/><asp:ImageButton runat="server" id="imbBack" ImageUrl="../images/buttonBack.gif" PostBackUrl="InsuranceCompanySettingBranch.aspx"/></td>
    </tr>
  </table>
</form>  
</div>
</body>
</html>
