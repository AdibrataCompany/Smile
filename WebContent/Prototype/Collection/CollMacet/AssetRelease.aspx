<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>COLLECTION</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<script language="JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
<link rel="stylesheet" type="text/css" href="../../Confins.css">
<style type="text/css">
.style4 {
	color: #FF0000;
}
.style5 {
	text-align: left;
	color: #FF0000;
}
</style>
</head>
<body>
<form id="FrmAssetRelease" runat="server">
<div align="center">
  <table style="width: 100%">
	<tr>
		<td class="style5">&nbsp;&nbsp;&nbsp; <font color="red"><i>*)&nbsp;&nbsp; required field</i></font></td>
	</tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">ASSET RELEASE</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" width="17%"> 
        <div align="left">Branch</div>
      </td>
      <td class="tdganjil" style="width: 71%"> 
		<asp:DropDownList runat="server" id="CmbBranch" CssClass="inptype">
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
		&nbsp;<span class="style4">*)</span></td>
    </tr>
    <tr> 
      <td class="tdgenap" width="17%"> 
        		Search By</td>
      <td class="tdganjil" style="width: 71%"> 
        <select name="select">
          <option selected>Select One</option>
          <option>Agreement No</option>
          <option>Customer Name</option>
        </select>
        <asp:TextBox runat="server" id="TbsSearch" Height="18px" CssClass="inptype"></asp:TextBox>
&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr align="right"> 
      <td><a href="AssetReleaseSearch.aspx">
		<img src="../../images/ButtonSearch.gif" width="100" height="20" border="0"></a>&nbsp;
		<img src="../../images/ButtonReset.gif" width="100" height="20"></td>
    </tr>
  </table>
  
</div>
</form>
</body>
</html>
