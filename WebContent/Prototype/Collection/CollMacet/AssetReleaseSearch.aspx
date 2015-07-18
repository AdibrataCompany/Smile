<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>COLLECTION</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
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
}
</style>
</head>
<body>
<div align="center">
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
		&nbsp;<span class="style4"> *)</span></td>
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
        <asp:TextBox runat="server" id="TbsSearch" CssClass="inptype"></asp:TextBox>
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
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">ASSET RELEASE - LISTING</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr align="center" class="tdjudulungu"> 
      <td style="width: 19%"> AGREEMENT NO.</td>
      <td style="width: 24%">CUSTOMER NAME</td>
      <td style="width: 112px">EXECUTOR ID</td>
      <td style="width: 130px">CONTRACT STATUS</td>
      <td>RELEASE</td>
    </tr>
    <tr class="tdganjil"> 
      <td style="width: 19%" class="style5"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left" style="width: 24%"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td style="width: 112px">xxxxx20xxxxx</td>
      <td align="center" style="width: 130px">xx3xx</td>
      <td align="center"><a href="AssetReleaseRequest.aspx">
		<img src="../../images/IconRelease.gif" width="18" height="14" border="0"></a></td>
    </tr>
    <tr class="tdgenap"> 
      <td style="width: 19%" class="style5"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left" style="width: 24%"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td style="width: 112px">xxxxx20xxxxx</td>
      <td align="center" style="width: 130px" >xx3xx</td>
      <td align="center" class="tdgenap"><a href="AssetReleaseRequest.aspx">
		<img src="../../images/IconRelease.gif" width="18" height="14" border="0"></a></td>
    </tr>
    <tr class="tdganjil"> 
      <td style="width: 19%" class="style5"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left" style="width: 24%"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td style="width: 112px">xxxxx20xxxxx</td>
      <td align="center" style="width: 130px">xx3xx</td>
      <td align="center"><a href="AssetReleaseRequest.aspx">
		<img src="../../images/IconRelease.gif" width="18" height="14" border="0"></a></td>
    </tr>
    <tr class="tdgenap"> 
      <td style="width: 19%" class="style5"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left" style="width: 24%"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td style="width: 112px">xxxxx20xxxxx</td>
      <td align="center" style="width: 130px" >xx3xx</td>
      <td align="center" class="tdgenap"><a href="AssetReleaseRequest.aspx">
		<img src="../../images/IconRelease.gif" width="18" height="14" border="0"></a></td>
    </tr>
    <tr class="tdganjil"> 
      <td style="width: 19%" class="style5"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left" style="width: 24%"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td style="width: 112px">xxxxx20xxxxx</td>
      <td align="center" style="width: 130px">xx3xx</td>
      <td align="center"><a href="AssetReleaseRequest.aspx">
		<img src="../../images/IconRelease.gif" width="18" height="14" border="0"></a></td>
    </tr>
    <tr class="tdgenap"> 
      <td style="width: 19%" class="style5"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left" style="width: 24%"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td style="width: 112px">xxxxx20xxxxx</td>
      <td align="center" style="width: 130px" >xx3xx</td>
      <td align="center" class="tdgenap"><a href="AssetReleaseRequest.aspx">
		<img src="../../images/IconRelease.gif" width="18" height="14" border="0"></a></td>
    </tr>
    <tr class="tdganjil"> 
      <td style="width: 19%" class="style5"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left" style="width: 24%"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td style="width: 112px">xxxxx20xxxxx</td>
      <td align="center" style="width: 130px">xx3xx</td>
      <td align="center"><a href="AssetReleaseRequest.aspx">
		<img src="../../images/IconRelease.gif" width="18" height="14" border="0"></a></td>
    </tr>
    <tr class="tdgenap"> 
      <td style="width: 19%" class="style5"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left" style="width: 24%"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td style="width: 112px">xxxxx20xxxxx</td>
      <td align="center" style="width: 130px" >xx3xx</td>
      <td align="center" class="tdgenap"><a href="AssetReleaseRequest.aspx">
		<img src="../../images/IconRelease.gif" width="18" height="14" border="0"></a></td>
    </tr>
    <tr class="tdganjil"> 
      <td style="width: 19%" class="style5"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left" style="width: 24%"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td style="width: 112px">xxxxx20xxxxx</td>
      <td align="center" style="width: 130px">xx3xx</td>
      <td align="center"><a href="AssetReleaseRequest.aspx">
		<img src="../../images/IconRelease.gif" width="18" height="14" border="0"></a></td>
    </tr>
    <tr class="tdgenap"> 
      <td style="width: 19%" class="style5"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left" style="width: 24%"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td style="width: 112px">xxxxx20xxxxx</td>
      <td align="center" style="width: 130px" >xx3xx</td>
      <td align="center" class="tdgenap"><a href="AssetReleaseRequest.aspx">
		<img src="../../images/IconRelease.gif" width="18" height="14" border="0"></a></td>
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
  
  
  
</div>
</body>
</html>
