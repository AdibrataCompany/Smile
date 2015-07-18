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
<style type="text/css">
.style1 {
	background-color: #F4F4DF;
}
</style>
</head>
<body>
<form runat="Server" id="frmEntryAssetData">
<div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
	<tr>
	<td><font color="red"><i>*) required field</i></font></td>
	</tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau"> ENTRY ASSET</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" style="width: 19%">Application ID</td>
      <td class="tdganjil"><asp:HyperLink ID="hypApplicationID" NavigateUrl="../../ViewApplication.htm" runat="server" Target="_blank" Text="Application0001"></asp:HyperLink>
	</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 19%; height: 20px;">Customer Name</td>
      <td class="tdganjil" style="height: 20px"><asp:HyperLink ID="hypCustomerName" text="Customer0001" runat="server" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target= _blank></asp:HyperLink>
		</td>
    </tr>
    <tr>
      <td class="tdgenap" style="width: 19%">Currency</td>
      <td class="tdganjil">IDR</td>
    </tr>
   
    <tr>
      <td class="tdgenap" style="width: 19%">Asset Type</td>
      <td class="tdganjil"><asp:TextBox ID="txtAssetType" runat="server" enabled="false" CssClass="inptype"></asp:TextBox>
		</td>
    	</tr>

    <tr>
      <td class="tdgenap" style="width: 19%">Asset Description</td>
      <td class="tdganjil"><asp:TextBox ID="txtAssetCode" runat="server" CssClass="inptype"></asp:TextBox>
      <asp:HyperLink ID="hypAssetCode" runat="server" ImageUrl="../../Images/IconDetail.gif" NavigateUrl="../../Lookup/AssetLookup.htm" Target="_blank"></asp:HyperLink>
		</td>
    	</tr>
    </table>
    <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td  class="tdjudulhijau" style="width: 42%; height: 20px;">SUPPLIER <font color="red">*)</font> </td>
      <td  class="tdjudulhijau" style="width: 30%; height: 20px;">GUARANTEE<font color="red">*)</font> </td>
      <td  class="tdjudulhijau" style="width: 206px; height: 20px;">
		<span class="style1">NOTES</span><font color="red">*)</font> </td>
      <td  class="tdjudulhijau" style="width: 172px; height: 20px;">OTR PRICE<font color="red">*)</font> </td>
      <td  class="tdjudulhijau" style="height: 20px">DOWN PAYMENT<font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdganjil" style="width: 42%; height: 39px;">
		<input name="textfield322233" type="text" class="inptype" size="40" style="width: 244px; height: 17px" value="Supplier Name"> 
        <a href="javascript:;" onClick="MM_openBrWindow('../../Lookup/SupplierLookup.htm','Supplier','scrollbars=yes,width=900,height=500,left=0,top=0')">
		<img src="../../Images/IconDetail.gif" width="15" height="15" border="0"></a> 
		<font color="red">Main Supplier</font></td>
      <td class="tdganjil">
		<asp:DropDownList ID="ddlBuyBackGuaranteSupplier1" runat="server">
		<asp:ListItem Text="Select One" Value="0"></asp:ListItem>
		<asp:ListItem Text="No Guarantee" Value="NG"></asp:ListItem>
		<asp:ListItem Text="Personal" Value="PS"></asp:ListItem>
		<asp:ListItem Text="Payment" Value="PA"></asp:ListItem>
		<asp:ListItem Text="Coorporate" Value="CO"></asp:ListItem>
		<asp:ListItem Text="BuyBack" Value="CO"></asp:ListItem>
		</asp:DropDownList>
		</td>
      <td class="tdganjil" style="height: 39px; width: 206px;">
		<input name="textfield322234" type="text" class="inptype" size="40" style="width: 154px"></td>
    	<td class="tdganjil" style="height: 39px; width: 172px;">
		<input name="textfield322225" type="text" class="inptype" size="40" style="width: 101px"></td>
    	<td class="tdganjil" style="height: 39px">
		<input name="textfield322232" type="text" class="inptype" size="40" style="width: 101px"></td>
    </tr>
     <tr> 
      <td class="tdganjil" style="width: 42%">
		<input name="textfield322235" type="text" class="inptype" size="40" value="Fill Supplier Name is Optional"> 
        <a href="javascript:;" onClick="MM_openBrWindow('../Lookup/SupplierLookup.htm','Supplier','scrollbars=yes,width=900,height=500,left=0,top=0')">
		<img src="../../Images/IconDetail.gif" width="15" height="15" border="0"></a></td>
      <td class="tdganjil">No</td>
      <td class="tdganjil" style="width: 206px">
		<input name="textfield322236" type="text" class="inptype" size="40" style="width: 154px"></td>

    	<td class="tdganjil" style="width: 172px">
		<input name="textfield322228" type="text" class="inptype" size="40" style="width: 101px"></td>
    	<td class="tdganjil">
		<input name="textfield322231" type="text" class="inptype" size="40" style="width: 101px"></td>
    </tr>
 <tr> 
      <td class="tdganjil" style="width: 42%">
		<input name="textfield322227" type="text" class="inptype" size="40" value="Fill Supplier Name is Optional"> 
        <a href="javascript:;" onClick="MM_openBrWindow('../Lookup/SupplierLookup.htm','Supplier','scrollbars=yes,width=900,height=500,left=0,top=0')">
		<img src="../../Images/IconDetail.gif" width="15" height="15" border="0"></a></td>
		      <td class="tdganjil">No</td>
      <td class="tdganjil" style="width: 206px">
		<input name="textfield322224" type="text" class="inptype" size="40" style="width: 154px"></td>
    	<td class="tdganjil" style="width: 172px">
		<input name="textfield322229" type="text" class="inptype" size="40" style="width: 101px"></td>
    	<td class="tdganjil">
		<input name="textfield322230" type="text" class="inptype" size="40" style="width: 101px"></td>
    </tr>
    </table>
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right" class="tdganjil">
	      <asp:ImageButton runat="server" ID="imbNextEntryAsset" ImageUrl="../../Images/ButtonNext.gif" PostBackUrl="SurveyReport_CF_EntryAsset.aspx"></asp:ImageButton>
	        <asp:ImageButton ID="imbCancelEntryAsset" runat="server" PostBackUrl="SurveyReport_CF_AssetDataList.aspx" ImageUrl="../../Images/ButtonCancel.gif"></asp:ImageButton>
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
