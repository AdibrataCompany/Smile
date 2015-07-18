<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="../../Include/Insurance.css">
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
      <td width="10" height="20">
		<img src="../../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">CLAIM REQUEST</td>
      <td width="10">
		<img src="../../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  
  <div align="center"> 
    <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
      <tr class="tdganjil"> 
        <td class="tdgenap" style="width: 20%">Search By</td>
        <td class="tdganjil">
		<asp:DropDownList runat="server" id="ddlSearchBy">
			<asp:ListItem>Asset Description</asp:ListItem>
			<asp:ListItem>License Plate</asp:ListItem>
			<asp:ListItem>Chassis No</asp:ListItem>
			<asp:ListItem>Engine No</asp:ListItem>
		</asp:DropDownList>
		&nbsp; 
		<asp:TextBox runat="server" id="txtSearchBy" CssClass="inptype" Width="200px">
		</asp:TextBox>
		</td>
      </tr>
    </table>
  </div>
  
<br />
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20">
		<img src="../../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">ASSET LISTING</td>
      <td width="10">
		<img src="../../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
    <asp:GridView runat="server" id="grdClaimRequest" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:boundfield DataField="valNo" HeaderText="ASSET NO" SortExpression="valNo">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>		
		<asp:boundfield DataField="valstring50" HeaderText="ASSET DESCRIPTION" SortExpression="valstring50">
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" HeaderText="LICENSE PLATE" SortExpression="valstring10">
		</asp:boundfield>
		<asp:boundfield DataField="valstring20" HeaderText="CHASSIS NO" SortExpression="valstring20">
		</asp:boundfield>
		<asp:boundfield DataField="valstring20" HeaderText="ENGINE NO" SortExpression="valstring20">
		</asp:boundfield>				
		<asp:templatefield HeaderText="CLAIM">
			<AlternatingItemTemplate>
				<asp:ImageButton runat="server" id="btnClaim" ImageUrl="../../images/IconClaim.gif" PostBackUrl="ClaimRequestDetail.aspx" />
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:ImageButton runat="server" id="btnClaim" ImageUrl="../../images/IconClaim.gif" PostBackUrl="ClaimRequestDetail.aspx" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>		
	</Columns>
			<HeaderStyle CssClass="tdjudulabu" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
      
	<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
	</asp:XmlDataSource>
      
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td height="30" align="right">
		<asp:ImageButton runat="server" id="imbCancel" ImageUrl="../../images/buttonCancel.gif" PostBackUrl="ClaimRequest.aspx"/>
	  </td>
    </tr>
  </table>
  <p>&nbsp;</p>
</div>
</form>
</body>
</html>
