<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>ASSETDOCUMENT</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
<style type="text/css">
.style5 {
	text-align: left;
	color: #FF0000;
}
.style1 {
	color: #FF0000;
}
</style>
</head>
<body>
<form id="FrmInqPendingReceiveDocToFundCompPladge" runat="server">
<div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    </table>
  <table style="width: 100%">
	<tr>
		<td class="style5">&nbsp;&nbsp;&nbsp; <font color="red"><i>*)&nbsp;&nbsp; required field</i></font></td>
	</tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopimerahkiri">&nbsp;</td>
      <td align="center" class="tdtopimerah">INQUIRY PENDING RECEIVE DOCUMENT 
		FROM 
		FUNDING COMPANY</td>
      <td width="10" class="tdtopimerahkanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Branch Location</td>
      <td class="tdganjil"> 
		<asp:DropDownList runat="server" id="CmbBranchLocation">
	        <asp:ListItem>Select One</asp:ListItem>	
			<asp:ListItem>MEDAN</asp:ListItem>
			<asp:ListItem>JAMBI</asp:ListItem>
			<asp:ListItem>PEKANBARU</asp:ListItem>
			<asp:ListItem>BATAM</asp:ListItem>
			<asp:ListItem>GRAND WIJAYA</asp:ListItem>
			<asp:ListItem>BEKASI</asp:ListItem>
			<asp:ListItem>TANGERANG</asp:ListItem>
			<asp:ListItem>BANDUNG</asp:ListItem>
			<asp:ListItem>SEMARANG</asp:ListItem>			
		</asp:DropDownList>
		&nbsp;
		</td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Funding Company</td>
      <td class="tdganjil"> 
		<asp:DropDownList runat="server" id="CmbFundingCompany">
	        <asp:ListItem>All</asp:ListItem>	
			<asp:ListItem>BRI</asp:ListItem>
			<asp:ListItem>BCA</asp:ListItem>
			<asp:ListItem>ANZ Panin Bank</asp:ListItem>						
		</asp:DropDownList>
		&nbsp;<span class="style1">*)</span></td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Search By</td>
      <td class="tdganjil"> 
		<asp:DropDownList runat="server" id="CmbSearch">
	        <asp:ListItem>Select One</asp:ListItem>	
			<asp:ListItem>Agreement No</asp:ListItem>
			<asp:ListItem>Customer Name</asp:ListItem>
			<asp:ListItem>Supplier Name</asp:ListItem>
			<asp:ListItem>Asset Status</asp:ListItem>
			<asp:ListItem>SP BPKB No</asp:ListItem>
			<asp:ListItem>SP BPKB Date</asp:ListItem>			
			<asp:ListItem>Overdue Days</asp:ListItem>
			<asp:ListItem>Reason</asp:ListItem>
		</asp:DropDownList>
		&nbsp;
		<asp:TextBox runat="server" id="TbsSearch" Width="203px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">&nbsp;<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" PostBackUrl="FrmInqPendingAssetDocToFundCompPledge2.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" PostBackUrl="FrmInqPendingAssetDocToFundCompPledge2.aspx" />&nbsp;</td>
    </tr>
  </table>
  
  
</div>
</form>
</body>
</html>
