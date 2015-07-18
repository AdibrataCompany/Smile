<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html xmlns:m="http://schemas.microsoft.com/office/2004/12/omml" xmlns:v="urn:schemas-microsoft-com:vml" xmlns:o="urn:schemas-microsoft-com:office:office">
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
<form runat="Server" id="frmCompanyCustomerMarketingMemoLS">
<div align="center"> 
   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SURVEY REPORT - OTHER DATA</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap" >Search By</td>
      <td class="tdganjil" >
      	<asp:dropdownlist id="ddlSearchBy" runat="server" >
      	 	<asp:ListItem Text="Customer Name" Value="0"></asp:ListItem>
			<asp:ListItem Text="Address" Value="0"></asp:ListItem>
			<asp:ListItem Text="Application ID" Value="0"></asp:ListItem>
			<asp:ListItem Text="Product Offering" Value="0"></asp:ListItem>
      	</asp:dropdownlist > 
      	<asp:textbox id="txtSearchBy" runat="server" CssClass="inptype" width="150"></asp:textbox> 


</td>
     

    </tr>
     

</table>
   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbSearch" imageurl="../../Images/ButtonSearch.gif" runat="server" PostBackUrl="MarketingMemoLSApplicationData.aspx"></asp:ImageButton>
		<asp:ImageButton id="imbReset" postbackurl="MarketingMemoLS.aspx" imageurl="../../Images/ButtonReset.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">APPLICATION LIST</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>

  <asp:GridView runat="server" id="GrdListCustomer" AllowSorting="true" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
    <asp:templatefield HeaderText="APPLICATION ID" SortExpression="ApplicationID">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkApplicationID" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkApplicationID" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="CUSTOMER NAME" SortExpression="CustomerName">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomerName" NavigateUrl="../Credit/ViewCompanyCustomer.htm" Target="_blank">xxxxxxxx50xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomerName" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx50xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="PRODUCT OFFERING" SortExpression="ProductOffering">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkProductOffering" NavigateUrl="../Marketing/ProductView.htm" Target="_blank">xxxxxxxx50xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkProductOffering" NavigateUrl="../Marketing/ProductView.htm" Target="_blank">xxxxxxxx50xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="MARKETING" SortExpression="ME">
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblMarketing">xxxxxxxx20xxxxxxxx
				</asp:Label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lblMarketing">xxxxxxxX20xxxxxxxx
				</asp:Label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="ACTION">
			<AlternatingItemTemplate>
					<asp:HyperLink runat="server" id="lnkNewApplication" NavigateUrl="SurveyReport_CF_OtherData.aspx" Target="_self">Entry Other Data
				</asp:HyperLink>

			</AlternatingItemTemplate>
			<ItemTemplate>
					<asp:HyperLink runat="server" id="lnkNewApplication" NavigateUrl="SurveyReport_CF_OtherData.aspx" Target="_self">Entry Other Data				</asp:HyperLink>

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
</form>
</body>
</html>
