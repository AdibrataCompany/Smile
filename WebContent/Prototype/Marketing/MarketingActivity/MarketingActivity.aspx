<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Marketing Activity</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script></head><body><form id="frmMarketingAct" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">MARKETING ACTIVITY</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr>
      <td width="20%" class="tdgenap">Search By</td>
      <td width="80%" class="tdganjil">
      <asp:DropDownList runat="server" ID="ddlSearchCriteria"> 
      <asp:ListItem Text="Prospect ID" Value="Prospect.ProspectID"></asp:ListItem>
      <asp:ListItem Text="Prospect Name" Value="Prospect.Name"></asp:ListItem>
      </asp:DropDownList>
      &nbsp;
      <asp:TextBox ID="txtSearchCustomer" runat="server" CssClass="inptype" width="200"></asp:textbox></td>
    	</tr>
    <tr>
      <td width="20%" class="tdgenap">Plan Date</td>
      <td width="80%" class="tdganjil">
      <asp:TextBox ID="txtPlanDate" runat="server" CssClass="inptype" width="113px"></asp:textbox>
		&nbsp;<asp:Image runat="server" id="imgCalendar" ImageUrl="../../Images/iconcalendar.gif" /></td>
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
      <td align="center" class="tdtopihijau">MARKETING ACTIVITIES LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
    <div align="center">
    <asp:GridView runat="server" id="GrdListAgreement" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" AllowSorting="True" >
    <Columns>
		<asp:boundfield DataField="valstring3" HeaderText="BRANCH ID" SortExpression="valstring3">
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
		<asp:boundfield DataField="valstring6" HeaderText="STATUS" SortExpression="valstring6">
		</asp:boundfield>
		<asp:templatefield HeaderText="PLAN DATE">
			<AlternatingItemTemplate>
				<asp:Label runat="server" Text="dd-mm-yyyy hh:mm" />
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" Text="dd-mm-yyyy hh:mm" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="HISTORY">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="BtnHistory" ImageUrl="../../Images/IconDocument.gif" NavigateUrl="ViewMarketingActivityHist.aspx" Target="_blank" />
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:HyperLink runat="server" id="BtnHistory" ImageUrl="../../Images/IconDocument.gif" NavigateUrl="ViewMarketingActivityHist.aspx" Target="_blank" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="ACTION">
			<AlternatingItemTemplate>
				<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../Images/IconEdit.gif" PostBackUrl="MarketingActivityEdit.aspx" />
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../Images/IconEdit.gif" PostBackUrl="MarketingActivityEdit.aspx" />
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
		&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>