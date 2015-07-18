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
<form id="form1" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">INSURANCE COMPANY BRANCH LOADING FEE</td>
      <td width="10"><img src="../Images/AbuKanan.gif" width="10" height="21"></td>
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
      <td class="tdgenap">Copy Loading Fee From InsCo Branch</td>
      <td class="tdganjil"> 
        <p>
          <input name="textfield322222" type="text" class="inptype" size="20">
          <a href="javascript:;" onClick="MM_openBrWindow('../Lookup/InsCoBranchLookup.htm','InsCoBranch','scrollbars=yes,width=900,height=500')"><img src="../Images/IconDetail.gif" width="15" height="15" border="0"></a> 
          <img src="../Images/ButtonCopy.gif" width="100" height="20" border="0"> 
        </p>
        <p>This action will delete all Loading Fee inserted for this branch and copy all 
          Loading Fee from selected Branch </p>
      </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr align="right"> 
      <td><img src="../Images/ButtonSearch.gif" width="100" height="20" border="0"> 
        <img src="../Images/ButtonReset.gif" width="100" height="20"></td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">INSURANCE COMPANY BRANCH FEE</td>
      <td width="10"><img src="../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  <asp:GridView runat="server" id="GrdViewInsCoSetting" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
  <Columns>
	<asp:boundfield DataField="valstring3" HeaderText="CURRENCY" SortExpression="valstring3">
	</asp:boundfield>
	<asp:boundfield DataField="valstring3" HeaderText="COVERAGE TYPE" SortExpression="valstring3">
	</asp:boundfield>
	<asp:boundfield DataField="valunit" HeaderText="MAX ASSET AGE" SortExpression="valunit">
		<ItemStyle HorizontalAlign="Right" />
	</asp:boundfield>
	<asp:boundfield DataField="vPercent" HeaderText="LOADING FEE RATE" SortExpression="vPercent">
		<ItemStyle HorizontalAlign="Right" />
	</asp:boundfield>
	<asp:templatefield HeaderText="EDIT">
		<AlternatingItemTemplate>
			<asp:ImageButton runat="server" ImageUrl="../images/iconEdit.gif" PostBackUrl="InsuranceCompanyBranchLoadingFeeEdit.aspx" />
		</AlternatingItemTemplate>
		<ItemTemplate>
			<asp:ImageButton runat="server" ImageUrl="../images/iconEdit.gif" PostBackUrl="InsuranceCompanyBranchLoadingFeeEdit.aspx" />
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
</div>  
<div align="center">
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
      <td width="50%" height="30">
		<asp:ImageButton runat="server" id="imbPrint" ImageUrl="../images/buttonPrint.gif"/></td>
      <td width="50%" align="right">&nbsp;<asp:ImageButton runat="server" id="imbAdd" ImageUrl="../images/buttonAdd.gif" PostBackUrl="InsuranceCompanyBranchLoadingFeeAdd.aspx" /><asp:ImageButton runat="server" id="imbBack" ImageUrl="../images/buttonBack.gif" PostBackUrl="InsuranceCompanySettingBranch.aspx"/></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
