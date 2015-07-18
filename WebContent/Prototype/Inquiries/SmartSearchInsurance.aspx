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
		<td><font color="red">Insurance</font></td>			
		<td><font color="#0099CC"><a href="SmartSearchNegativeList.aspx">Negative List</a></font></td>								
	</tr>
</table>
<br>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">SMART SEARCH - INSURANCE</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>

  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" style="width: 20%">Branch</td>
      <td class="tdganjil" width="30%">
				<asp:DropDownList runat="server" id="ddlBranch">
					<asp:ListItem>All</asp:ListItem>
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</td>
      <td class="tdgenap" style="width: 20%">
				Insured By</td>
      <td class="tdganjil">
				<asp:dropdownlist id="ddlInsuredBy" runat="server" cssclass="inptype" width="100">
      <asp:ListItem Text="All" Value="A"></asp:ListItem>
      <asp:ListItem Text="Company" Value="Comp"></asp:ListItem>
      <asp:ListItem Text="Customer" Value="Cust"></asp:ListItem>
      <asp:ListItem Text="BFI Customer" Value="Cust"></asp:ListItem>
      </asp:dropdownlist ></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Start Date &gt;=</td>
      <td class="tdganjil" width="30%">
					<asp:TextBox runat="server" id="txtStartDate" CssClass="inptype" Width="100px">
					</asp:TextBox>
					&nbsp;<asp:Image runat="server" id="imgCalendar0" ImageUrl="../images/iconCalendar.gif" /></td>
      <td class="tdgenap" style="width: 20%">
				Paid By</td>
      <td class="tdganjil">
				<asp:dropdownlist id="ddlPaidBy" runat="server" cssclass="inptype" width="100">
      <asp:ListItem Text="All" Value="A"></asp:ListItem>
      <asp:ListItem Text="Company" Value="Comp"></asp:ListItem>
      <asp:ListItem Text="Customer" Value="Cust"></asp:ListItem>
      <asp:ListItem Text="At Cost" Value="Cost"></asp:ListItem>
      </asp:dropdownlist ></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">End Date &lt;=</td>
      <td class="tdganjil" width="30%">
			<asp:TextBox runat="server" id="txtEndDate" CssClass="inptype" Width="100px">
			</asp:TextBox>
			&nbsp;<asp:Image runat="server" id="imgCalendar" ImageUrl="../images/iconCalendar.gif" /></td>
      <td class="tdgenap" style="width: 20%">Cover Period</td>
      <td class="tdganjil">
		<asp:dropdownlist id="ddlCoverPeriod" runat="server" cssclass="inptype" width="100">
      		<asp:ListItem Text="All" Value="A"></asp:ListItem>
      		<asp:ListItem Text="Full Tenor" Value="FT"></asp:ListItem>
      		<asp:ListItem Text="Annualy" Value="AN"></asp:ListItem>
      	</asp:dropdownlist >
      </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Search By</td>
      <td class="tdganjil" colspan="3">
		<asp:DropDownList runat="server" id="ddlSearchBy">
			<asp:ListItem>Insurance Company</asp:ListItem>
			<asp:ListItem>Asset Description</asp:ListItem>
			<asp:ListItem>Agreement No</asp:ListItem>
			<asp:ListItem Selected="True">Name</asp:ListItem>
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
      <td align="center" class="tdtopiungu">INSURANCE LISTING</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
<asp:GridView runat="server" id="grdAgreement" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
	<Columns>
		<asp:templatefield HeaderText="AGREEMENT NO">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="hypAgreementNo" NavigateUrl="../Credit/ViewAgreement.htm" Target="_blank">xxxxx20xxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="CUSTOMER NAME">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="hypCustName" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxx50xxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="INSURANCE COMPANY">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="hypInsurance" NavigateUrl="../Insurance/InsuranceCompanyByBranchView.htm" Target="_blank">xxxxx20xxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="valstring50" HeaderText="ASSET DESCRIPTION" SortExpression="valstring50">
		</asp:boundfield>
		<asp:templatefield HeaderText="POLICY NO">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="hypPolicyNo" NavigateUrl="../Insurance/PolicyDetailView.htm" Target="_blank">xxxxx20xxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="PERIOD">
			<ItemTemplate>
				<asp:Label runat="server" id="lblPeriod" Text="dd/mm/yyyy to dd/mm/yyyy" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="INSURED BY">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="hypInsuredBy" NavigateUrl="">xxxxx10xxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:boundfield DataField="valstring10" HeaderText="PAID BY" SortExpression="valstring10">
		</asp:boundfield>
		<asp:boundfield DataField="valstring2" HeaderText="COVER PERIOD" SortExpression="valstring2">
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
