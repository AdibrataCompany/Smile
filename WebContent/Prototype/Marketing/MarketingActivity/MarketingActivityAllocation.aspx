<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Tele Sales Activity</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script></head><body><form id="frmTelesales" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">MARKETING ACTIVITY ALLOCATION</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr>
      <td width="20%" class="tdgenap">Search By</td>
      <td width="80%" class="tdganjil">
      <asp:DropDownList runat="server" ID="ddlSearchCriteria"> 
      <asp:ListItem Text="Prospect App ID" Value="Prospect.ProspectAppID"></asp:ListItem>
      <asp:ListItem Text="Name" Value="Prospect.Name"></asp:ListItem>
      <asp:ListItem Value="Prospect.MarketingID">Marketing ID</asp:ListItem>
      <asp:ListItem Value="ProductOffering.Desription">Product Offering
		</asp:ListItem>
      </asp:DropDownList>
      <asp:TextBox ID="txtSearchCustomer" runat="server" CssClass="inptype" width="200"></asp:textbox></td>
    	</tr>
    <tr>
      <td width="20%" class="tdgenap">Unassigned Marketing</td>
      <td width="80%" class="tdganjil">
      &nbsp;
		<asp:CheckBox runat="server" id="chkUnassignMarketing" /></td>
    	</tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbSearchCriteria" imageurl="../../Images/ButtonSearch.gif" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbResetCriteria" imageurl="../../Images/ButtonReset.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <br />
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">MARKETING ACTIVITIES ALLOCATION LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
    <div align="center">
    <asp:GridView runat="server" id="GrdListAgreement" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" AllowSorting="True" >
    <Columns>
		<asp:templatefield HeaderText="ALLOCATE">
			<AlternatingItemTemplate>
				<asp:CheckBox runat="server" id="chkAllocate" />
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:CheckBox runat="server" id="chkAllocate" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:boundfield DataField="valstring3" HeaderText="BRANCH" SortExpression="valstring3">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring20" HeaderText="PROSPECT APP ID" SortExpression="valstring20">
		</asp:boundfield>
		<asp:boundfield DataField="valstring30" HeaderText="NAME" SortExpression="valstring30">
		</asp:boundfield>
		<asp:boundfield DataField="vphone" HeaderText="PHONE NO" SortExpression="vphone">
		</asp:boundfield>
		<asp:boundfield DataField="valstring30" HeaderText="PRODUCT OFFERING" SortExpression="valstring30">
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" HeaderText="MARKETING ID" SortExpression="valstring10">
		</asp:boundfield>
		<asp:boundfield DataField="valstring6" HeaderText="STATUS" SortExpression="valstring6">
		</asp:boundfield>
	</Columns>
		<HeaderStyle CssClass="tdjudulhijau" />
		<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
	<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
	</asp:XmlDataSource>
    </div>

  
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
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton id="imbNext" imageurl="../../Images/ButtonNext.gif" runat="server" PostBackUrl="MarketingActivityAllocationSave.aspx"></asp:ImageButton>
		</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>