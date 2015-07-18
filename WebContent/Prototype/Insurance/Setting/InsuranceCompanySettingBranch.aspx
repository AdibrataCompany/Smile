<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript">
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
      <td align="center" class="tdtopiabu">INSURANCE COMPANY BRANCH</td>
      <td width="10"><img src="../../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Insurance Company Id</td>
      <td class="tdganjil">PANIN</td>
    </tr>
    <tr> 
      <td class="tdgenap">Insurance Company Name</td>
      <td class="tdganjil">Panin Insurance</td>
    </tr>
  </table>
  <asp:GridView runat="server" id="GrdViewInsCoSetting" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
  <Columns>
	<asp:templatefield HeaderText="INSCO. BRANCH">
		<AlternatingItemTemplate>
			<asp:hyperlink  runat="server" Text="xxxxx10xxxxx" NavigateUrl="InsuranceCompanyBranchView.htm" target="_blank"/>
		</AlternatingItemTemplate>
		<ItemTemplate>
			<asp:hyperlink  runat="server" Text="xxxxx10xxxxx" NavigateUrl="InsuranceCompanyBranchView.htm" target="_blank"/>
		</ItemTemplate>
	</asp:templatefield>	
	<asp:boundfield DataField="valstring25" HeaderText="INSCO. BRANCH NAME" SortExpression="valstring25">
	</asp:boundfield>
	<asp:boundfield DataField="valstring20" HeaderText="CONTACT PERSON" SortExpression="valstring20">
	</asp:boundfield>
	<asp:boundfield DataField="vphone" HeaderText="PHONE" SortExpression="vphone">
	</asp:boundfield>
	<asp:boundfield DataField="valstring20" HeaderText="COMPANY BRANCH" SortExpression="valstring20">
	</asp:boundfield>
	<asp:templatefield HeaderText="LOADING FEE RATE">
		<AlternatingItemTemplate>
			<asp:ImageButton runat="server" ImageUrl="../images/iconRate.gif" PostbackUrl="InsuranceCompanyBranchLoadingFee.aspx" />
		</AlternatingItemTemplate>
		<ItemTemplate>
			<asp:ImageButton runat="server" ImageUrl="../images/iconRate.gif" PostbackUrl="InsuranceCompanyBranchLoadingFee.aspx" />
		</ItemTemplate>
		<ItemStyle HorizontalAlign="Center" />
	</asp:templatefield>	
	<asp:templatefield HeaderText="FEE">
		<AlternatingItemTemplate>
			<asp:HyperLink runat="server" ImageUrl="../images/iconRate.gif" NavigateUrl="InsuranceCompanyBranchFee.htm" />
		</AlternatingItemTemplate>
		<ItemTemplate>
			<asp:HyperLink runat="server" ImageUrl="../images/iconRate.gif" NavigateUrl="InsuranceCompanyBranchFee.htm" />
		</ItemTemplate>
		<ItemStyle HorizontalAlign="Center" />
	</asp:templatefield>
	<asp:templatefield HeaderText="RATE">
		<AlternatingItemTemplate>
			<asp:ImageButton runat="server" ImageUrl="../images/iconRate.gif" PostbackUrl="InsuranceCompanyBranchRate.aspx" />
		</AlternatingItemTemplate>
		<ItemTemplate>
			<asp:ImageButton runat="server" ImageUrl="../images/iconRate.gif" PostbackUrl="InsuranceCompanyBranchRate.aspx" />
		</ItemTemplate>
		<ItemStyle HorizontalAlign="Center" />
	</asp:templatefield>
	<asp:templatefield HeaderText="TPL">
		<AlternatingItemTemplate>
			<asp:Hyperlink runat="server" ImageUrl="../images/iconRate.gif" NavigateUrl="InsuranceCompanyBranchTPL.htm" />
		</AlternatingItemTemplate>
		<ItemTemplate>
			<asp:Hyperlink runat="server" ImageUrl="../images/iconRate.gif" NavigateUrl="InsuranceCompanyBranchTPL.htm" />
		</ItemTemplate>
		<ItemStyle HorizontalAlign="Center" />
	</asp:templatefield>	
	<asp:templatefield HeaderText="EDIT">
		<AlternatingItemTemplate>
			<asp:ImageButton runat="server" ImageUrl="../images/iconEdit.gif" PostbackUrl="InsuranceCompanyBranchEdit.aspx" />
		</AlternatingItemTemplate>
		<ItemTemplate>
			<asp:ImageButton runat="server" ImageUrl="../images/iconEdit.gif" PostbackUrl="InsuranceCompanyBranchEdit.aspx" />
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
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
      	<asp:ImageButton runat="server" id="imbAdd" ImageUrl="../images/buttonAdd.gif" PostBackUrl="InsuranceCompanyBranchAdd.aspx"></asp:ImageButton>
      	<asp:ImageButton runat="server" id="imbBack" ImageUrl="../images/buttonBack.gif" PostBackUrl="InsuranceCompanySetting.aspx"></asp:ImageButton>
    </tr>
  </table>
</form>  
</div>
</body>
</html>
