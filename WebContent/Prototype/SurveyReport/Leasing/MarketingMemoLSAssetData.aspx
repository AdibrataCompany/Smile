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
<style type="text/css">
.style1 {
	background-color: #F4F4DF;
}
</style>
</head>
<body>
<form runat="Server" id="frmCompanyCustomerMarketingMemoLS">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">MARKETING MEMO - ENTRY ASSET DATA 
		999 OF 999</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
     <tr> 
      <td class="tdgenap" style="width: 19%">Application ID</td>
      <td class="tdganjil" colspan="3"><asp:HyperLink ID="hypApplicationID" NavigateUrl="../../ViewApplication.htm" runat="server" Target="_blank" Text="Application0001"></asp:HyperLink>
	</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 19%; height: 20px;">Customer Name</td>
      <td class="tdganjil" style="height: 20px" colspan="3"><asp:HyperLink ID="hypCustomerName" text="CompanyCustomer0001" runat="server" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target= _blank></asp:HyperLink>
		</td>
    </tr>
    <tr>
      <td class="tdgenap" style="width: 19%">Currency</td>
      <td class="tdganjil" colspan="3">IDR</td>
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
      <td  class="tdjudulhijau" width="40%">SUPPLIER <font color="red">*)</font> </td>
      <td  class="tdjudulhijau" width="3%">GUARANTEE<font color="red">*)</font> </td>
      <td  class="tdjudulhijau" >NOTES<font color="red">*)</font> </td>
      <td  class="tdjudulhijau" width="3%">OTR PRICE<font color="red">*)</font> </td>
      <td  class="tdjudulhijau" width="3%">CURRENT PRICE <font color="red">*)</font> </td>
      <td  class="tdjudulhijau" width="3%">DOWN PAYMENT<font color="red">*)</font> </td>
      <td  class="tdjudulhijau" style="width: 172px; height: 20px;">PAID AT SUPPLIER<font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdganjil" width="40%">
		<input name="textfield322233" type="text" class="inptype" value="Supplier Name"> 
        <a href="javascript:;" onClick="MM_openBrWindow('../Lookup/SupplierLookup.htm','Supplier','scrollbars=yes,width=900,height=500,left=0,top=0')">
		<img src="../../Images/IconDetail.gif" width="15" height="15" border="0"></a> 
		<font color="red">Main Supplier</font></td>
      <td class="tdganjil" width="3%

">
		<asp:DropDownList ID="ddlGuarante1" runat="server">
		 	<asp:ListItem Text="Payment" Value="PAY"></asp:ListItem>
      		<asp:ListItem Text="Personal" Value="PES"></asp:ListItem>
	     	<asp:ListItem Text="Corporate" Value="COR"></asp:ListItem>
	     	<asp:ListItem Text="Buy Back" Value="BUY"></asp:ListItem>
		</asp:DropDownList>
</td>
      <td class="tdganjil" >
		<input name="textfield322234" type="text" class="inptype" ></td>
    	<td class="tdganjil"  width="3%">
		<asp:textbox ID="txtOTRPrice" runat="server" class="inptype"></asp:textbox></td>
    	<td class="tdganjil" width="3%">
		<asp:textbox ID="txtCurrentPrice" runat="server" class="inptype"></asp:textbox></td>
    	<td class="tdganjil"  width="3%">
		<asp:textbox ID="txtDownPayment" runat="server" class="inptype"></asp:textbox></td>
		      <td class="tdganjil">
		<asp:DropDownList ID="ddlPaidSupplier1" runat="server">
		<asp:ListItem Text="Select One" Value="0"></asp:ListItem>
		<asp:ListItem Text="Yes" Value="Yes"></asp:ListItem>
		<asp:ListItem Text="No" Value="No"></asp:ListItem>
		</asp:DropDownList>
		</td>

    </tr>
     <tr> 
      <td class="tdganjil" width="40%">
		<input name="textfield322235" type="text" class="inptype" value="Fill Supplier Name is Optional"> 
        <a href="javascript:;" onClick="MM_openBrWindow('../Lookup/SupplierLookup.htm','Supplier','scrollbars=yes,width=900,height=500,left=0,top=0')">
		<img src="../../Images/IconDetail.gif" width="15" height="15" border="0"></a></td>
      <td class="tdganjil" width="3%">
		No</td>
      <td class="tdganjil" >
		<input name="textfield322236" type="text" class="inptype" ></td>
    	<td class="tdganjil"  width="3%">
		<asp:textbox ID="txtOTRPrice2" runat="server" class="inptype"></asp:textbox></td>
    	<td class="tdganjil"  width="3%">
		<asp:textbox ID="txtCurrentPrice2" runat="server" class="inptype"></asp:textbox></td>
    	<td class="tdganjil"  width="3%">
		<asp:textbox ID="txtDownPayment2" runat="server" class="inptype"></asp:textbox></td>
		      <td class="tdganjil">
		<asp:DropDownList ID="ddlPaidSupplier2" runat="server">
		<asp:ListItem Text="Select One" Value="0"></asp:ListItem>
		<asp:ListItem Text="Yes" Value="Yes"></asp:ListItem>
		<asp:ListItem Text="No" Value="No"></asp:ListItem>
		</asp:DropDownList>
		</td>

    </tr>
 <tr> 
      <td class="tdganjil" width="40%">
		<input name="textfield322227" type="text" class="inptype" value="Fill Supplier Name is Optional"> 
        <a href="javascript:;" onClick="MM_openBrWindow('../Lookup/SupplierLookup.htm','Supplier','scrollbars=yes,width=900,height=500,left=0,top=0')">
		<img src="../../Images/IconDetail.gif" width="15" height="15" border="0"></a></td>
      <td class="tdganjil" width="3%">
		No</td>
      <td class="tdganjil" >
		<input name="textfield322224" type="text" class="inptype" ></td>
    	<td class="tdganjil"  width="3%">
		<asp:textbox ID="txtOTRPrice3" runat="server" class="inptype"></asp:textbox></td>
    	<td class="tdganjil"  width="3%">
		<asp:textbox ID="txtCurrentPrice3" runat="server" class="inptype"></asp:textbox></td>
    	<td class="tdganjil"  width="3%">
		<asp:textbox ID="txtDownPayment3" runat="server" class="inptype"></asp:textbox></td>
		      <td class="tdganjil">
		<asp:DropDownList ID="ddlPaidSupplier3" runat="server">
		<asp:ListItem Text="Select One" Value="0"></asp:ListItem>
		<asp:ListItem Text="Yes" Value="Yes"></asp:ListItem>
		<asp:ListItem Text="No" Value="No"></asp:ListItem>
		</asp:DropDownList>
		</td>

    </tr>
    </table>
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right" class="tdganjil">
      <asp:ImageButton runat="server" ID="imbNextEntryAsset" ImageUrl="../../Images/ButtonNext.gif" PostBackUrl="MarketingMemoLSEditAssetData.aspx"></asp:ImageButton>
        <asp:ImageButton ID="imbCancelEntryAsset" runat="server" PostBackUrl="MarketingMemoLSAssetDataList.aspx" ImageUrl="../../Images/ButtonCancel.gif"></asp:ImageButton>
        
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
