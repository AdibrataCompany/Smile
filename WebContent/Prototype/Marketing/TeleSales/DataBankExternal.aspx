<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1"%>
<html>
<head>
<title>Databank External</title>
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
<form id="frmDataBankExternal" runat="server">
<div align="center">
<table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i></i>
		Check Box muncul jika Is Assignnya &quot;NO&quot;
      </font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">DATABANK EXTERNAL</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
   <tr> 
      <td width="25%" class="tdgenap">Branch</td>
      <td width="85%" class="tdganjil">

      <asp:DropDownList ID="ddlSearchBranch" runat="server" Width="145px" Height="18px">
      <asp:ListItem Text="All" Value="All"></asp:ListItem>
      <asp:ListItem Text="Bandung" Value="E"></asp:ListItem>
      <asp:ListItem Text="Jakarta" Value="I"></asp:ListItem>

      </asp:dropdownlist>
        
      </td>
    </tr>

    <tr> 
      <td width="25%" class="tdgenap">Search By</td>
      <td width="85%" class="tdganjil">
      <asp:DropDownList runat="server" ID="ddlSearchCriteria"> 
      <asp:ListItem Text="Name" Value="Databank.Name"></asp:ListItem>
      <asp:ListItem Text="Address" Value="Databank.Address"></asp:ListItem>
      </asp:DropDownList>
      <asp:TextBox ID="txtSearchCustomer" runat="server" CssClass="inptype" width="200"></asp:textbox></td>
    </tr>
    <tr>
          <td width="20%" class="tdgenap" style="height: 25px">Is Assign&nbsp;</td>
          <td width="80%" class="tdganjil" style="height: 25px">
			<asp:RadioButtonlist runat="server" id="RdBtnYes" RepeatDirection="Horizontal">
			<asp:ListItem Text="Yes"></asp:ListItem>
			<asp:ListItem Text="No"></asp:ListItem>
			<asp:ListItem Text="Both" Selected="True"></asp:ListItem>
			</asp:RadioButtonList>
		  </td>
   	</tr>

  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbSearchCustomerCriteria" imageurl="../../Images/Buttonsearch.gif" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbResetCustomerCriteria" imageurl="../../Images/ButtonReset.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>

  
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">DATABANK EXTERNAL LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
    <div align="center">
    <asp:GridView runat="server" id="GrdListCustomer" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield>
			<HeaderTemplate>
				<asp:CheckBox runat="server" id="CheckBox1" />
			</HeaderTemplate>
			<AlternatingItemTemplate>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				<asp:CheckBox runat="server" id="CheckBox1" />
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="BRANCH ID">
		</asp:boundfield>
		<asp:templatefield HeaderText="NAME">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkAgreementNo" NavigateUrl="../Credit/ViewCompanyCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAgreementNo" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="ADDRESS">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:templatefield HeaderText="IS ASSIGN">
			<AlternatingItemTemplate>
				Yes
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				No
			</ItemTemplate>
		</asp:templatefield>

		
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
      
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
    </div>
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
      &nbsp;<asp:ImageButton ID="imbAssignDataBankExternal" runat="server" ImageUrl="../../Images/ButtonAssign.gif" PostBackUrl="AssignDatabankExternal.aspx"></asp:ImageButton> 
      </td>
    </tr>
  </table>

  
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
   <br>
</div>
  

  </form>
</body>
</html>
