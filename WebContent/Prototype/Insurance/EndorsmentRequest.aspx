<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="../Include/Insurance.css">
<script language="JavaScript">
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
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">ENDORSEMENT</td>
      <td width="10"><img src="../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  <div align="center"> 
    <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
      <tr> 
        <td width="20%" class="tdgenap">Search By</td>
        <td width="80%" class="tdganjil"> 
         <select name="select4">
         	 <option selected>Select One</option>
			 <option >Agreement No.</option>
            <option>Customer Name</option>
          </select>
			<asp:textbox ID="txtSearch" runat="server" CssClass="inptype"></asp:textbox>
	     </td>
      </tr>
    </table>
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><img src="../Images/ButtonSearch.gif" width="100" height="20" border="0"> 
        <img src="../Images/ButtonReset.gif" width="100" height="20"> </td>
    </tr>
  </table>
  <div align="center">
    <div align="center"></div>
  </div>
<br>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">AGREEMENT INSURED LISTING</td>
      <td width="10"><img src="../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>

  <table align="center" width="95%">
  <tr>
  <td>
  
    <asp:GridView runat="server" id="GrdListCustomer" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="100%" >
    <Columns>
		<asp:templatefield HeaderText="AGREEMENT NO">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomerName" NavigateUrl="../Credit/ViewCompanyCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomerName0" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:boundfield DataField="valstring20" HeaderText="CUSTOMER NAME" SortExpression="valstringcsttype">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" HeaderText="ASSET DESCRIPTION" SortExpression="valstring50">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" HeaderText="POLICY NO" SortExpression="valstring50">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" HeaderText="INSURED BY" SortExpression="valstring50">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" HeaderText="PAID BY" SortExpression="valstring50">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valyn" HeaderText="IS ENDORS" SortExpression="valstring50">
			<ItemStyle HorizontalAlign="CENTER" />
		</asp:boundfield>

		<asp:templatefield HeaderText="ENDORSMENT">
			<ItemTemplate>
				<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../images/IconEdit.gif" PostBackUrl="EndorsmentRequestEndorsRecalculate.aspx" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
      
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
		</asp:XmlDataSource>

  </td>
  </tr>
  </table>
  
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><img src="../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>

</div>
</form>
</body>
</html>
