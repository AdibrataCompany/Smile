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
      <td align="center" class="tdtopihijau">TELE SALES ACTIVITY</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr>
      <td width="20%" class="tdgenap">Search By</td>
      <td width="80%" class="tdganjil">
      <asp:DropDownList runat="server" ID="ddlSearchCriteria"> 
      <asp:ListItem Text="Customer ID" Value="Customer.CustomerID"></asp:ListItem>
      <asp:ListItem Text="Customer Name" Value="Customer.Name"></asp:ListItem>
      <asp:ListItem Text="Databank Type"></asp:ListItem>      
      </asp:DropDownList>
      &nbsp;
      <asp:TextBox ID="txtSearchCustomer" runat="server" CssClass="inptype" width="200"></asp:textbox></td>
    	</tr>
    <tr>
      <td width="20%" class="tdgenap">Priority</td>
      <td width="80%" class="tdganjil">
      <asp:DropDownList runat="server" ID="ddlPriority"> 
      <asp:ListItem Text="1 - High" Value="11"></asp:ListItem>
      <asp:ListItem Text="2 - Medium" Value="2"></asp:ListItem>
      <asp:ListItem Value="3">3 - Low</asp:ListItem>
		<asp:ListItem Value="4">4 - Vey Low</asp:ListItem>
      </asp:DropDownList>
      </td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Activity Type</td>
      <td width="80%" class="tdganjil">
      	<asp:DropDownList runat="server" id="ddlActivityType">
			<asp:ListItem Selected="True">Phone</asp:ListItem>
			<asp:ListItem Value="Mail">Direct Mail</asp:ListItem>
			<asp:ListItem>SMS</asp:ListItem>
			<asp:ListItem Value="EmailFax">Email/Fax</asp:ListItem>
			<asp:ListItem>Other</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap" style="height: 25px">Reschedule Date</td>
      <td width="80%" class="tdganjil" style="height: 25px">
      <asp:TextBox ID="txtRescheduleDate" runat="server" CssClass="inptype" width="100"></asp:textbox>
        <font color="red">&nbsp;<img src="../../Images/iconcalendar.gif" width="20" height="20" align="top"></font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Remaining Days &lt;=</td>
      <td width="80%" class="tdganjil">
      <asp:TextBox ID="txtRemainDays" runat="server" CssClass="inptype" width="100"></asp:textbox>
      </td>
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
      <td align="center" class="tdtopihijau">TELE SALES ACTIVITIES LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
    <div align="center">
    <asp:GridView runat="server" id="GrdListAgreement" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" AllowSorting="True" >
    <Columns>
		<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="BRANCH ID">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" Visible="False" SortExpression="valstring10" HeaderText="EMPLOYEE ID">
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" Visible="False" SortExpression="valstring10" HeaderText="TSE ID">
		</asp:boundfield>
		<asp:templatefield HeaderText="NAME">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="../../Credit/ViewCompanyCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="vphone" Visible="False" SortExpression="vphone" HeaderText="PHONE NO">
		</asp:boundfield>
		<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="DATABANK TYPE">
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" SortExpression="valstring10" HeaderText="PRIORITY">
		</asp:boundfield>
		<asp:boundfield DataField="valnum4" SortExpression="valstring2" HeaderText="REMAINING DAYS">
			<ItemStyle HorizontalAlign="Right" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" SortExpression="valstring10" HeaderText="ACTIVITY TYPE">
		</asp:boundfield>
		<asp:boundfield DataField="valstring20" SortExpression="valstring20" HeaderText="RESULT STATUS">
		</asp:boundfield>
		<asp:boundfield DataField="valdate" SortExpression="valdate" HeaderText="RESCHEDULE DATE">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:templatefield HeaderText="HISTORY">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="BtnHistory" ImageUrl="../../Images/IconDocument.gif" NavigateUrl="ViewTseActivityHist.aspx" Target="_blank" />
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="BtnHistory" ImageUrl="../../Images/IconDocument.gif" NavigateUrl="ViewTseActivityHist.aspx" Target="_blank" />
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="ACTIVITY">
			<AlternatingItemTemplate>
				<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="TseActivityEdit.aspx" />
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="TseActivityEdit.aspx" />
			</ItemTemplate>
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
		&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>