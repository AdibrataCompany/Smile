<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
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
<form id="frmMarketingOrganization" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">MARKETING EMPLOYEE</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
      <tr> 
      <td width="25%" class="tdgenap">Branch Name</td>
      <td width="85%" class="tdganjil">

      <asp:DropDownList ID="ddlSearchBranch" runat="server" Width="145px" Height="18px">
      <asp:ListItem Text="All" Value="All"></asp:ListItem>
      <asp:ListItem Text="Bandung" Value="E"></asp:ListItem>
      <asp:ListItem Text="Jakarta" Value="I"></asp:ListItem>

      </asp:dropdownlist>
        
      </td>
    </tr>
   	<tr>
      <td width="25%" class="tdgenap" style="height: 24px">Name</td>
      <td width="78%" class="tdganjil" style="height: 24px"> 
        <input name="textfield3" type="text" class="inptype" size="20" style="width: 196px">
      </td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Function</td>
      <td width="85%" class="tdganjil">

      <asp:DropDownList ID="ddlSearchFunction" runat="server" Height="16px" Width="146px">
      <asp:ListItem Text="All" Value="All"></asp:ListItem>
      <asp:ListItem Text="Bussiness Associate" Value="BA"></asp:ListItem>
      <asp:ListItem Text="Business Representative Executive" Value="BRE"></asp:ListItem>
      <asp:ListItem Text="Customer Service" Value="CS"></asp:ListItem>
	  <asp:ListItem Text="Marketing Executive" Value="ME"></asp:ListItem>
      <asp:ListItem Text="Telesales Executive" Value="TSE"></asp:ListItem>


      </asp:dropdownlist>
        
      </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" style="height: 30px"></td>
      <td width="50%" align="right" style="height: 30px">
		<img src="../../Images/ButtonSearch.gif" width="100" height="20" border="0"> 
        <img src="../../Images/ButtonReset.gif" width="100" height="20" border="0"> 
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">MARKETING EMPLOYEE LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  
  <div align="center">
    <div align="center"> 
      <asp:GridView runat="server" id="GrdViewBranch" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" AllowSorting="True">
		<Columns>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="BRANCH">
				<ItemStyle HorizontalAlign="Center" />
			</asp:boundfield>
			<asp:templatefield HeaderText="NAME">
				<AlternatingItemTemplate>
					<asp:HyperLink runat="server" id="lnkAgreementNo" NavigateUrl="MarketingEmployeeInternalView.aspx" Target="_blank">xxxxxxxx50xxxxxxxx
					</asp:HyperLink>
				</AlternatingItemTemplate>
				<ItemStyle HorizontalAlign="Left" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="lnkAgreementNo" NavigateUrl="MarketingEmployeeExternalView.aspx" Target="_blank">xxxxxxxx50xxxxxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="ADDRESS">
				<ItemStyle HorizontalAlign="Left" />
			</asp:boundfield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="FUNCTION">
				<ItemStyle HorizontalAlign="Left" />
			</asp:boundfield>
			<asp:boundfield DataField="valyesno" SortExpression="valyesno" HeaderText="IS INTERNAL">
				<ItemStyle HorizontalAlign="Center" />
			</asp:boundfield>
			<asp:boundfield DataField="valyesno" SortExpression="valyesno" HeaderText="ACTIVE">
				<ItemStyle HorizontalAlign="Center" />
				<HeaderStyle Wrap="True" />
			</asp:boundfield>
			<asp:templatefield HeaderText="EDIT">
				<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="BtnIcoEdit" ImageUrl="../../images/IconEdit.gif" Height="16px" PostBackUrl="MarketingEmployeeInternalEdit.aspx" />
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnIcoEdit" ImageUrl="../../images/IconEdit.gif" Height="16px" PostBackUrl="MarketingEmployeeExternalEdit.aspx" />
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="DELETE">
				<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../images/IconDelete.gif" />
				</AlternatingItemTemplate>
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../images/IconDelete.gif" />
				</ItemTemplate>
			</asp:templatefield>
		</Columns>
		<HeaderStyle CssClass="tdjudulhijau" />
		<AlternatingRowStyle CssClass="tdgenap" />
		</asp:GridView>

  
  
  
  
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
		<asp:XmlDataSource runat="server" id="XmlDataSource2">
		</asp:XmlDataSource>
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="50%" height="30">
		   Marketing Internal --&gt; <asp:ImageButton runat="server" ID="imbAddMarketingInternal" ImageUrl="../../images/ButtonAdd.gif" PostBackUrl="MarketingEmployeeInternalAdd.aspx"></asp:ImageButton>
		</td>
      <td width="50%" align="right">
   
        Marketing External --&gt; <asp:ImageButton runat="server" ID="imbAddMarketingExternal" ImageUrl="../../images/ButtonAdd.gif" PostBackUrl="MarketingEmployeeExternalAdd.aspx"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <br>
  
     <asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
	</asp:XmlDataSource>


 </div>


</form>
</body>
</html>
