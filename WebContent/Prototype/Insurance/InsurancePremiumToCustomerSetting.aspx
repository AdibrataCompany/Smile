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
      <td align="center" class="tdtopiabu">INSURANCE PREMIUM TO CUSTOMER </td>
      <td width="10"><img src="../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdganjil"> 
      <td width="200" class="tdgenap">Branch</td>
      <td class="tdganjil">
        <select name="select">
          <option>Select One</option>
          <option selected>Palmerah</option>
        </select>
      </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr align="right"> 
      <td>&nbsp;<asp:ImageButton runat="server" id="imbSearch" ImageUrl="../Images/ButtonSearch.gif" /><asp:ImageButton runat="server" id="imbReset" ImageUrl="../Images/ButtonReset.gif" /></td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">INSURANCE PREMIUM TO CUSTOMER LISTING</td>
      <td width="10"><img src="../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  <asp:GridView runat="server" id="GrdViewInsCoSetting" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
  <Columns>
	<asp:boundfield DataField="valstring10" HeaderText="BRANCH ID" SortExpression="valstring10">
	</asp:boundfield>
	<asp:boundfield DataField="valstring25" HeaderText="BRANCH NAME" SortExpression="valstring25">
	</asp:boundfield>
	<asp:templatefield HeaderText="FEE">
		<AlternatingItemTemplate>
			<asp:HyperLink runat="server" ImageUrl="../images/iconRate.gif" NavigateUrl="InsuranceFeeToCust.htm" />
		</AlternatingItemTemplate>
		<ItemTemplate>
			<asp:HyperLink runat="server" ImageUrl="../images/iconRate.gif" NavigateUrl="InsuranceFeeToCust.htm" />
		</ItemTemplate>
		<ItemStyle HorizontalAlign="Center" />
	</asp:templatefield>
	<asp:templatefield HeaderText="RATE">
		<AlternatingItemTemplate>
			<asp:ImageButton runat="server" ImageUrl="../images/iconRate.gif" PostbackUrl="InsuranceRateToCustomer.aspx" />
		</AlternatingItemTemplate>
		<ItemTemplate>
			<asp:ImageButton runat="server" ImageUrl="../images/iconRate.gif" PostbackUrl="InsuranceRateToCustomer.aspx" />
		</ItemTemplate>
		<ItemStyle HorizontalAlign="Center" />
	</asp:templatefield>
	<asp:templatefield HeaderText="TPL">
		<AlternatingItemTemplate>
			<asp:HyperLink runat="server" ImageUrl="../images/iconRate.gif" NavigateUrl="TPL.htm" />
		</AlternatingItemTemplate>
		<ItemTemplate>
			<asp:HyperLink runat="server" ImageUrl="../images/iconRate.gif" NavigateUrl="TPL.htm" />
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
</div>
</form>
</body>
</html>
