<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
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
<table width="95%" border="1" cellspacing="0" cellpadding="0" class="tablegrid">
	<tr class="tdjudulungu" height="20px" align="center">
		<td><font color="#0099CC"><a href="SmartSearch.aspx">Agreement</a></font></td>
		<td><font color="#0099CC"><a href="SmartSearchCustomer.aspx">Customer</a></font></td>
		<td><font color="#0099CC"><a href="SmartSearchAsset.aspx">Asset</a></font></td>
		<td><font color="#0099CC"><a href="SmartSearchInsurance.aspx">Insurance</a></font></td>			
		<td><font color="red">Negative List</font></td>		
	</tr>
</table>
</div>
<BR>
<div align="center">
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">SMART SEARCH - NEGATIVE CUSTOMER</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>

  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
 	  <tr> 
      <td class="tdgenap" style="width: 25%">Search By </td>
      <td width="86%" class="tdganjil">
      <asp:DropDownList runat="server" id="ddlSearchBy">
		<asp:ListItem Value="Name">Name</asp:ListItem>
		<asp:ListItem>Address</asp:ListItem>
		</asp:DropDownList>
      &nbsp;
      <asp:TextBox runat="server" id="txtSearchBy" CssClass="InpType" ></asp:TextBox>
      </td>
    </tr>
  <tr> 
      <td class="tdgenap" style="width: 25%">Source</td>
      <td width="86%" class="tdganjil">
       <asp:DropDownList runat="server" id="ddlSource">
		<asp:ListItem Value="A">All</asp:ListItem>
		<asp:ListItem Value="APPI">APPI</asp:ListItem>
		<asp:ListItem Value="BICHK">BI Checking</asp:ListItem>
		<asp:ListItem Value="SYS">System</asp:ListItem>
		</asp:DropDownList>
       </td>
    </tr>
  <tr> 
      <td class="tdgenap" style="width: 25%">Type</td>
      <td width="86%" class="tdganjil">
       <asp:DropDownList runat="server" id="ddlType">
		<asp:ListItem Value="A">All</asp:ListItem>
		<asp:ListItem Value="B">Bad</asp:ListItem>
		<asp:ListItem Value="W">Warning</asp:ListItem>
		</asp:DropDownList>&nbsp;
       </td>
    </tr>
  <tr> 
      <td class="tdgenap" style="width: 25%">Active</td>
      <td width="86%" class="tdganjil">
       <asp:DropDownList runat="server" id="ddlType1">
		<asp:ListItem Value="A">All</asp:ListItem>
		<asp:ListItem Value="Y">Yes</asp:ListItem>
		<asp:ListItem Value="N">No</asp:ListItem>
		</asp:DropDownList>
       </td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="ImgSearch" ImageUrl="../Images/ButtonSearch.gif"></asp:ImageButton>&nbsp;
		<asp:ImageButton runat="server" id="ImgReset" ImageUrl="../Images/ButtonReset.gif"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">NEGATIVE CUSTOMER LISTING</td>
      <td class="tdtopiungukanan" style="width: 10px">&nbsp;</td>
    </tr>
  </table>
  <asp:GridView runat="server" id="grdCustomer" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
	<Columns>	
		<asp:templatefield HeaderText="CUSTOMER NAME">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="hypCustName" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxxxx50xxxxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="valstring50" HeaderText="ADDRESS" SortExpression="valstring50">
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" HeaderText="SOURCE" SortExpression="valstring10">
		</asp:boundfield>		
		<asp:boundfield DataField="valstring10" HeaderText="TYPE" SortExpression="valstring10">
		</asp:boundfield>		
		<asp:boundfield DataField="valYesNo" HeaderText="ACTIVE" SortExpression="valYesNo">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>		
	</Columns>
		<HeaderStyle CssClass="tdjudulungu" />
		<AlternatingRowStyle CssClass="tdgenap" />
	</asp:GridView>
	<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
	</asp:XmlDataSource>
  
   <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>     
      <td width="30" align="center" style="height: 27px"><asp:ImageButton runat="server" id="ImgFirst" ImageUrl="../images/butkiri1.gif"></asp:ImageButton></td>
      <td width="30" align="center" style="height: 27px"><asp:ImageButton runat="server" id="ImgPrev" ImageUrl="../images/butkiri.gif"></asp:ImageButton></td>
      <td width="30" align="center" style="height: 27px"><asp:ImageButton runat="server" id="ImgNext" ImageUrl="../images/butkanan.gif"></asp:ImageButton></td>
      <td width="30" align="center" style="height: 27px"><asp:ImageButton runat="server" id="ImgLast" ImageUrl="../images/butkanan1.gif"></asp:ImageButton></td>
      <td width="130" align="center" style="height: 27px">Page 
        <asp:TextBox runat="server" id="txtPage" CssClass="InpType" Columns="3">1</asp:TextBox>&nbsp; 
        <asp:ImageButton runat="server" id="ImgGo" ImageUrl="../images/butgo.gif"></asp:ImageButton></td>
      <td align="right" style="height: 27px"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>  
</div>
  </form>
</body>

</html>
