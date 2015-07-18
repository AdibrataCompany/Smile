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
		<td><font color="red">Asset</font></td>
		<td><font color="#0099CC"><a href="SmartSearchInsurance.aspx">Insurance</a></font></td>			
		<td><font color="#0099CC"><a href="SmartSearchNegativeList.aspx">Negative List</a></font></td>								
	</tr>
</table>
<br>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">SMART SEARCH - ASSET</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>

  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Branch</td>
      <td class="tdganjil">
				<asp:DropDownList runat="server" id="ddlBranch">
					<asp:ListItem>All</asp:ListItem>
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Search By</td>
      <td class="tdganjil">
				<asp:DropDownList runat="server" id="ddlSearchBy">
					<asp:ListItem>Application ID</asp:ListItem>
					<asp:ListItem>Agreement No</asp:ListItem>
					<asp:ListItem Selected="True">Name</asp:ListItem>
					<asp:ListItem>Asset Description</asp:ListItem>										
					<asp:ListItem>License Plate</asp:ListItem>										
					<asp:ListItem>Status</asp:ListItem>															
				</asp:DropDownList>
				<asp:TextBox runat="server" id="txtSearchBy" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><img src="../Images/ButtonSearch.gif" width="100" height="20" border="0"> 
        <img src="../Images/ButtonReset.gif" width="100" height="20" border="0"> 
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">ASSET LISTING</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
				<asp:GridView runat="server" id="grdAgreement" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
					<Columns>
						<asp:templatefield HeaderText="APPLICATION ID">
							<ItemTemplate>
								<asp:HyperLink runat="server" id="hypApplicationID" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank">xxxxx20xxxxx</asp:HyperLink>
							</ItemTemplate>
						</asp:templatefield>					
						<asp:templatefield HeaderText="AGREEMENT NO">
							<ItemTemplate>
								<asp:HyperLink runat="server" id="hypAgreementNo" NavigateUrl="../Credit/ViewAgreement.htm" Target="_blank">xxxxx20xxxxx</asp:HyperLink>
							</ItemTemplate>
						</asp:templatefield>
						<asp:templatefield HeaderText="CUSTOMER NAME">
							<ItemTemplate>
								<asp:HyperLink runat="server" id="hypCustName" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxx50xxxxx</asp:HyperLink>
							</ItemTemplate>
						</asp:templatefield>
						<asp:boundfield DataField="valstring50" HeaderText="ASSET DESCRIPTION" SortExpression="valstring50">
						</asp:boundfield>						
						<asp:boundfield DataField="valstring20" HeaderText="SERIAL NO" SortExpression="valstring20">
						</asp:boundfield>
						<asp:boundfield DataField="valstring20" HeaderText="ENGINE NO" SortExpression="valstring20">
						</asp:boundfield>						
						<asp:boundfield DataField="valstring20" HeaderText="ASSET REGISTRATION" SortExpression="valstring20">
						</asp:boundfield>
						<asp:boundfield DataField="valstring10" HeaderText="LICENSE PLATE" SortExpression="valstring10">
						</asp:boundfield>
						<asp:boundfield DataField="valstring3" HeaderText="ASSET STATUS" SortExpression="valstring3">
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
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnFirstPrev" ImageUrl="../images/butkiri1.gif" Width="20px" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnPrev" ImageUrl="../images/butkiri.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnNext" ImageUrl="../images/butkanan.gif" Width="20px" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnLastNext" ImageUrl="../images/butkanan1.gif" /></td>
      <td width="130" align="center">Page&nbsp;
		<asp:TextBox runat="server" id="TbnPage" Width="20px" CssClass="inptype">
		</asp:TextBox>
&nbsp;&nbsp; 
        <asp:ImageButton runat="server" id="BtnGo" ImageUrl="../images/buttonGO.gif" /></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
