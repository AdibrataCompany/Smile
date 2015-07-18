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
</head>
<body>
<form runat="server" id="frmEntryAssetData">
<div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
	<tr>
	<td colspan="3"><font color="red"><i>*) required field</i></font></td>
	</tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau"> ENTRY ASSET - 999 of 999</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Application ID</td>
      <td class="tdganjil"><asp:HyperLink ID="hypApplicationID" text="Application00001" NavigateUrl="../Credit/ViewApplication.htm" runat="server" Target="_blank"></asp:HyperLink>
      </td>
    </tr>
    <tr> 
      <td class="tdgenap">Customer Name</td>
      <td class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700')">xxxxxxxxxx50xxxxxxxxxxx</a></td>
    </tr>
    <tr> 
      <td class="tdgenap">Currency</td>
      <td class="tdganjil">IDR</td>
    </tr>
    <tr>
      <td class="tdgenap">Asset Type</td>
      <td class="tdganjil">xxxx50xxxx</td>
    </tr>
	<tr>
      <td class="tdgenap">Asset Description</td>
      <td class="tdganjil">xxxx50xxxx</td>
    </tr>
  </table>
  <table  width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td colspan="2" class="tdjudulhijau" style="width: 295px">SUPPLIER  
      </td>
      <td class="tdjudulhijau">NOTES</td>
      <td class="tdjudulhijau">OTR PRICE</td>
      <td class="tdjudulhijau">DOWN PAYMENT</td>
    </tr>
    <tr> 
      <td colspan="2" class="tdganjil" style="width: 295px">xxx50xxxx</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        xxx50xxxx
        </font> </td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        999,999,999,999
        </font> </td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        999,999,999,999
        </font> </td>
    </tr>
    <tr> 
      <td colspan="2" class="tdganjil" style="width: 295px; height: 21px;">xxx50xxxx</td>
      <td class="tdganjil" style="height: 21px"><font face="Tahoma, Verdana" size="2"> 
        xxx50xxxx
        </font> </td>
      <td class="tdganjil" style="height: 21px"><font face="Tahoma, Verdana" size="2"> 
        999,999,999,999
        </font> </td>
      <td class="tdganjil" style="height: 21px"><font face="Tahoma, Verdana" size="2"> 
        999,999,999,999
        </font> </td>
    </tr>
    <tr> 
      <td colspan="2" class="tdganjil" style="width: 295px">xxx50xxxx</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        xxx50x
      xxx
        </font> </td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        999,999,999,999
        </font> </td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        999,999,999,999
        </font> </td>
    </tr>
  </table>
  <table width="95%">
      <tr> 
      <td colspan="4" class="tdjudulhijau"> PRICE LIST CONTROL</td>
    </tr>
  </table>
  <table  width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
     <tr> 
      <td class="tdgenap" style="width: 28%">Basic Price List</td>
      <td class="tdganjil"><asp:label ID="lblBasicPriceList" text="999,999,999.99" runat="server"></asp:label> 
      </td>
     
    </tr>
        <tr> 
      <td class="tdgenap" style="width: 28%">Price Deviation</td>
      <td class="tdganjil"><asp:label ID="lblPriceDeviation" text="99.99" runat="server"></asp:label> 
      %</td>
 
    </tr>
        <tr> 
      <td class="tdgenap" style="width: 28%">Supplier Market Price</td>
      <td class="tdganjil"> 
      <asp:label ID="lblBasicPriceList0" text="999,999,999.99" runat="server"></asp:label> 
      </td>
 
    </tr>


  </table>
    <table width="95%">
    <tr> 
      <td colspan="4" class="tdjudulhijau"> SUPPLIER MARKET PRICE</td>
    </tr>
	</table>
<table  width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
 <tr> 
      <td valign="top" class="tdgenap" style="width: 28%">Supplier</td>
      <td colspan="3" class="tdganjil">
		<asp:label ID="lblBasicPriceList1" text="999,999,999.99" runat="server"></asp:label> 
      </td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap" style="width: 28%">Price Estimation</td>
      <td colspan="3" class="tdganjil">
		<asp:label ID="lblBasicPriceList2" text="999,999,999.99" runat="server"></asp:label> 
      </td>
    </tr>
</table>
	
	<table width="100%" align="center">
	<tr>
	<td>
	     <div align="center">
	    <asp:GridView runat="server" id="GrdPriceListSupplier" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
	    <Columns>
	 	   <asp:boundfield DataField="valNo" HeaderText="NO" SortExpression="valstring10">
				<ItemStyle HorizontalAlign="left" />
			</asp:boundfield>
			<asp:boundfield DataField="valstring10" HeaderText="SUPPLIER NAME" SortExpression="valstring10">
				<ItemStyle HorizontalAlign="left" />
			</asp:boundfield>
			<asp:boundfield DataField="valamount" HeaderText="PRICE ESTIMATION" SortExpression="valamount">
				<ItemStyle HorizontalAlign="right" />
			</asp:boundfield>
		</Columns>
				<HeaderStyle CssClass="tdjudulhijau" />
				<AlternatingRowStyle CssClass="tdgenap" />
	    </asp:GridView>
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
    </div>
	</td>
	</tr>
	</table>
	<table  width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
	 <tr> 
      <td valign="top" class="tdgenap" style="width: 28%">Avarage Market Price</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
       <asp:Label ID="lblAvgMarketPrice" runat="server" text="999,999,999,999.99"></asp:Label>
        </font></td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap" style="width: 28%">Maximum Allowed Amount Finance</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
       <asp:Label ID="lblMaksimumAllowedAmountFinance" runat="server" text="999,999,999,999.99"></asp:Label>
        </font></td>
    </tr>
	
</table>
	 <table width="95%">
    <tr> 
      <td colspan="4" class="tdjudulhijau"> SUPPLIER ACCOUNT INFORMATION PRICE</td>
    </tr>
	</table>

  <table  width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
  <tr> 
      <td class="tdgenap" style="width: 28%">A/P to Account</td>
      <td colspan="3" class="tdganjil">
      <asp:label ID="lblBasicPriceList3" text="99999999" runat="server"></asp:label> 
	</td>
    </tr>
  </table>
   <table width="95%">
    <tr> 
      <td colspan="4" class="tdjudulhijau"> OTU (OWNER TO USER) SUPPLIER ACCOUNT INFORMATION PRICE</td>
    </tr>
	</table>

  <table  width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
  <tr> 
      <td class="tdgenap" style="width: 28%">Supplier Name</td>
      <td colspan="3" class="tdganjil">
      <asp:label ID="lblBasicPriceList4" text="xxxxx50xxxxx" runat="server"></asp:label> 
      </td>
    </tr>

  <tr> 
      <td class="tdgenap" style="width: 28%">Bank Name</td>
      <td colspan="3" class="tdganjil">
      <asp:label ID="lblBasicPriceList5" text="xxxxx50xxxxx" runat="server"></asp:label> 
      </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Bank Branch</td>
      <td colspan="3" class="tdganjil">
		<asp:label ID="lblBasicPriceList6" text="xxxxx50xxxxx" runat="server"></asp:label> 
      </td>
    </tr>
      <tr> 
      <td class="tdgenap" style="width: 28%">Account Name</td>
      <td colspan="3" class="tdganjil">
		<asp:label ID="lblBasicPriceList7" text="xxxxx50xxxxx" runat="server"></asp:label> 
      </td>    </tr>
	  <tr> 
      <td class="tdgenap" style="width: 28%">Account No</td>
      <td colspan="3" class="tdganjil">
		<asp:label ID="lblBasicPriceList8" text="xxxxx50xxxxx" runat="server"></asp:label> 
      </td>    </tr>
  </table>

  <table width="95%">
    <tr> 
      <td colspan="4" class="tdjudulhijau">ASSET DATA</td>
    </tr>
   </table>
   <table  width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" style="width: 28%">[Serial No 1]</td>
      <td class="tdganjil"> 
		<asp:label ID="lblBasicPriceList9" text="xxxxx50xxxxx" runat="server"></asp:label> 
      &nbsp;</td>
      <td width="25%" class="tdgenap">Used/New</td>
      <td width="25%" class="tdganjil">
		<asp:label ID="lblBasicPriceList12" text="New" runat="server"></asp:label> 
      </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">[Serial No 2]</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <asp:label ID="lblBasicPriceList10" text="xxxxx50xxxxx" runat="server"></asp:label> 
      &nbsp;</font></td>
      <td class="tdgenap">Usage</td>
		<td class="tdganjil">
		<asp:label ID="lblBasicPriceList13" text="Commercial" runat="server"></asp:label> 
      &nbsp;</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Manufacturing Year</td>
      <td colspan="3" class="tdganjil">
		<asp:label ID="lblBasicPriceList11" text="2008" runat="server"></asp:label> 
      &nbsp;</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%; height: 26px;">[Attribute 1]</td>
      <td colspan="3" class="tdganjil" style="height: 26px"><font face="Tahoma, Verdana" size="2"> 
        <asp:label ID="lblBasicPriceList14" text="xxxxx50xxxxx" runat="server"></asp:label> 
      &nbsp;</font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">[Attribute 2]</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <asp:label ID="lblBasicPriceList15" text="xxxxx50xxxxx" runat="server"></asp:label> 
      &nbsp;</font></td>
    </tr>
    </table>
    <table  width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td colspan="4" class="tdjudulhijau">ASSET REGISTRATION</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Name</td>
      <td colspan="3" class="tdganjil"><input name="textfield3252" type="text" class="inptype" size="15"></td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap" style="width: 28%">Address</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <textarea name="textfield3232" cols="50" rows="5" class="inptype"></textarea>
        </font> <font color="red">*)</font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">RT/RW</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield323252" type="text" class="inptype" size="5">
        / 
        <input name="textfield3232522" type="text" class="inptype" size="5">
        </font> <font color="red">*)</font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Kelurahan</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
      <asp:TextBox id="txtAssetRegistrationKelurahan" runat="server" CssClass="inptype" Width="200"></asp:TextBox>
        </font> <font color="red">*)</font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Kecamatan</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
            <asp:TextBox id="txtAssetRegistrationKecamatan" runat="server" CssClass="inptype" Width="200"></asp:TextBox>
        </font> <font color="red">*)</font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">City</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
            <asp:TextBox id="txtAssetRegistrationCity" runat="server" CssClass="inptype" Width="200"></asp:TextBox>

        </font> <font color="red">*)</font></td>
    </tr>
	<tr> 
      <td class="tdgenap">Zip Code</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtZipCode" Enabled="false" runat="server" cssclass="inptype" width="100" Height="17px"></asp:textbox>
		<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucZipCode" runat="server" NavigateUrl="../../Lookup/ZipCodeLookup.aspx" Target="_blank"></asp:Hyperlink>
		</font> <font color="red">*)</font>
        </td> 
    </tr>    
    <tr> 
      <td class="tdgenap" style="width: 28%">Tax Date</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield3232622" type="text" class="inptype" size="15">
        <img src="../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"> 
        </font></td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap" style="width: 28%">Asset Notes</td>
      <td colspan="3" class="tdganjil"> <textarea name="textarea" cols="50" rows="5" class="inptype"></textarea> 
      </td>
    </tr>
    </table>
    <table align="center" width="95%">
    <tr> 
      <td colspan="4" class="tdjudulhijau" style="height: 20px">ASSET USSAGE
		<font color="red">&nbsp;</font></td>
    </tr>
    </table>
    <table  width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" style="width: 28%">Usage Name</td>
      <td class="tdganjil" colspan=3> <input name="textfield3222" type="text" class="inptype" size="15"> 
      </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Relationship with Customer</td>
      <td class="tdganjil" colspan=3><select name="select4">
          <option selected>Select One</option>
        </select></td>
    </tr>
    <tr> 
      <td colspan="4" class="tdjudulhijau">ASSET USAGE LOCATION
		<font color="red">*)</font></td>
    </tr>
    <tr>
      <td class="tdgenap" style="width: 28%">Copy Address From</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
        <select name="select9">
          <option selected>Legal Address</option>
          <option>Residence Address</option>
          <option>Company Address</option>
        </select>&nbsp; 
        <img src="../../Images/ButtonCopy.gif" border="0" align="absmiddle"></font></td>
    </tr>
    <tr>
      <td valign="top" class="tdgenap" style="width: 28%">Address</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <textarea name="textfield32326323" cols="50" rows="5" class="inptype"></textarea>
        </font></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 28%">RT/RW</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326324" type="text" class="inptype" size="5">
        / 
        <input name="textfield32326325" type="text" class="inptype" size="5">
        </font></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 28%">Kelurahan</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326326" type="text" class="inptype" size="15">
        </font></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 28%">Kecamatan</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326327" type="text" class="inptype" size="15">
        </font></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 28%">City</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326328" type="text" class="inptype" size="15">
        </font></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 28%">Zip Code</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326329" type="text" class="inptype" size="15">
        <a href="javascript:;" onClick="MM_openBrWindow('../../Lookup/ZipCodeLookup.aspx','ZipCode','scrollbars=yes,width=900,height=500,left=0,top=0')"><img src="../../Images/IconDetail.gif" width="15" height="15" border="0" align="absmiddle"></a> 
        </font></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 28%">Tax Date</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326330" type="text" class="inptype" size="15">
        <img src="../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"> 
        </font></td>
    </tr>
	<tr>
      <td valign="top" class="tdgenap" style="width: 28%">Asset Notes</td>
      <td colspan="3" class="tdganjil"> 
		<textarea name="textarea0" cols="50" rows="5" class="inptype"></textarea> 
      </td>
    </tr>
    </table>
    <table width="95%" align="center">
    <tr> 
      <td colspan="4" class="tdjudulhijau">SUPPLIER EMPLOYEE <font color="red">*)</font></td>
    </tr>
    </table>
    <table  width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" style="width: 20%">General Manager</td>
      <td class="tdganjil">GM1 </td>
      <td class="tdgenap" width="20%">Sales Person</td>
      <td class="tdganjil"><select name="select">
          <option selected>Select one</option>
        </select> </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Branch Manager</td>
      <td class="tdganjil">BM1 </td>
      <td class="tdgenap">Sales Supervisor</td>
      <td class="tdganjil"><select name="select">
          <option selected>Select one</option>
        </select> </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Administration Head</td>
      <td class="tdganjil">ADH1 </td>
      <td class="tdgenap">Supplier Admin</td>
      <td class="tdganjil"><select name="select7">
          <option selected>Select one</option>
        </select> </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET DOCUMENT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr align="center"> 
      <td width="5%" class="tdjudulhijau">NO</td>
      <td width="20%" class="tdjudulhijau">DOCUMENT</td>
      <td width="20%" class="tdjudulhijau">NUMBER</td>
      <td width="5%" class="tdjudulhijau">CHECKED</td>
      <td width="20%" class="tdjudulhijau">NOTES</td>
    </tr>
    <tr class="tdganjil">
      <td align="center">99</td>
      <td>xxxxxxx20xxxxxxx</td>
      <td><font face="Tahoma, Verdana" size="2">
        <input name="textfield3232623" type="text" class="inptype" size="15">
        </font></td>
      <td align="center"> 
        <input type="checkbox" name="checkbox" value="checkbox">
        </td>
      <td><font face="Tahoma, Verdana" size="2">
        <input name="textfield3232632" type="text" class="inptype" size="30">
        </font></td>
    </tr>
    <tr class="tdgenap">
      <td align="center">99</td>
      <td>xxxxxxx20xxxxxxx</td>
      <td><font face="Tahoma, Verdana" size="2">
        <input name="textfield3232624" type="text" class="inptype" size="15">
        </font></td>
      <td align="center">
<input type="checkbox" name="checkbox2" value="checkbox">
      </td>
      <td><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326322" type="text" class="inptype" size="30">
        </font></td>
    </tr>
  </table>
 <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr valign="bottom"> 
      <td align="right">  
      <asp:ImageButton runat="server" ImageUrl="../../Images/ButtonNext.gif" PostBackUrl="CompleteData_InsuranceAssetList.aspx"  ID="imbEntryAssetSave"></asp:ImageButton>
      <asp:ImageButton runat="Server" ImageUrl="../../Images/ButtonCancel.gif" PostBackUrl="CompleteDataEntryList.aspx" ID="imbEntryAssetCancel"></asp:ImageButton>


      </td>
    </tr>
  </table>
</div>
</form>

</body>
</html>
