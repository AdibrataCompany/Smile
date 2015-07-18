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
      <td class="tdganjil"><asp:Label ID="lblAssetType" runat="server" Text="Automotive"></asp:Label >
 
	</td>
    </tr>
    <tr>
      <td class="tdgenap" style="width: 19%">Asset Description</td>
      <td class="tdganjil"><asp:Label ID="lblAssetDescription" runat="server" Text="BMW-SERIES-M 6"></asp:Label >
 
	</td>
    </tr>

    </table>
   <div align="center">
   <asp:GridView runat="server" id="GrdListCustomer" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield HeaderText="NO">
			<ItemTemplate>
				<asp:Label runat="server" id="lblNo">x1x
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="SUPPLIER">
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAssetDescription" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>

		<asp:templatefield HeaderText="NOTES">
			<ItemTemplate>
				<asp:Label runat="server" id="lblAssetType" Text="xxxxxxxxxx20xxxxxxxxxx">
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>

		<asp:boundfield DataField="valamount" HeaderText="OTR PRICE" SortExpression="valamount">
			<ItemStyle HorizontalAlign="Right" />
		</asp:boundfield>
		<asp:boundfield DataField="valamount" HeaderText="CURRENT PRICE" SortExpression="valamount">
			<ItemStyle HorizontalAlign="Right" />
		</asp:boundfield>

		<asp:boundfield DataField="valamount" HeaderText="DOWN PAYMENT" SortExpression="valamount">
			<ItemStyle HorizontalAlign="Right" />
		</asp:boundfield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
     <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
 	<tr> 
      <td colspan="4" class="tdjudulhijau"> SUPPLIER ACCOUNT INFORMATION PRICE</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">A/P to Account</td>
      <td colspan="3" class="tdganjil">
      <asp:DropDownList ID="ddlSupplierAccount" runat="server">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="BCA - 1611283093" Value="BCA1"></asp:ListItem>
      </asp:DropDownList>
	</td>
    </tr>
  </table>
   <table width="95%">
    <tr> 
      <td colspan="4" class="tdjudulhijau"> OTU (OWNER TO USER) SUPPLIER ACCOUNT INFORMATION PRICE</td>
    </tr>
	</table>

  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
  <tr> 
      <td class="tdgenap" style="width: 28%">Bank Name</td>
      <td colspan="3" class="tdganjil">
      <asp:DropDownList ID="ddlSupplierOTUBankName" runat="server">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="BCA" Value="BCA"></asp:ListItem>
      </asp:DropDownList></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Bank Branch</td>
      <td colspan="3" class="tdganjil"><asp:TextBox ID="txtSupplierOTUBankBranch" runat="server" CssClass="inptype"></asp:TextBox></td>
    </tr>
      <tr> 
      <td class="tdgenap" style="width: 28%">Account Name</td>
      <td colspan="3" class="tdganjil">
		<asp:TextBox ID="txtSupplierOTUAccountName" runat="server" CssClass="inptype"></asp:TextBox></td>    </tr>
	  <tr> 
      <td class="tdgenap" style="width: 28%">Account No</td>
      <td colspan="3" class="tdganjil">
		<asp:TextBox ID="txtSupplierOTUBAccountNo" runat="server" CssClass="inptype"></asp:TextBox></td>    </tr>

    <tr> 
	      <td colspan="4" class="tdjudulhijau">ASSET DATA</td>
	</tr>
 	<tr> 
	  <td class="tdgenap">Serial No</td>
      <td class="tdganjil"><asp:textbox id="txtSerialNo" runat="server" CssClass="inptype" width="150" ></asp:textbox></td>
      <td class="tdgenap">Used / New Type</td>
      <td class="tdganjil">
		<asp:RadioButtonList runat="server" id="RdBtnUsedNewType" RepeatDirection="Horizontal">
       	<asp:ListItem Value="U" Selected="True">Used</asp:ListItem>
		<asp:ListItem Value="N">New</asp:ListItem>
      </asp:RadioButtonList> 

</td>
    </tr>
	<tr> 
      <td class="tdgenap">Invoice No</td>
      <td class="tdganjil"><asp:textbox id="txtInvoiceNo" runat="server" CssClass="inptype" width="150" ></asp:textbox></td>
      <td class="tdgenap">Usage</td>
      <td class="tdganjil"><asp:dropdownlist id="ddlUsage" runat="server" cssclass="inptype" width="100">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="Commercial" Value="C"></asp:ListItem>
      <asp:ListItem Text="Non Commercial" Value="NC"></asp:ListItem>
      </asp:dropdownlist > 
		</td>

      </tr>
    <tr> 
	  <td class="tdgenap">Chassis No [Serial No 1]</td>
      <td class="tdganjil"><asp:textbox id="txtChassisNo" runat="server" CssClass="inptype" width="150" ></asp:textbox></td>
      <td class="tdgenap">Made In</td>
      <td class="tdganjil"><asp:textbox id="txtMadeIn" runat="server" CssClass="inptype" width="75" ></asp:textbox></td>
    </tr>
	<tr> 
	  <td class="tdgenap">Engine No [Serial No 2]</td>
      <td class="tdganjil"><asp:textbox id="txtEngineNo" runat="server" CssClass="inptype" width="150" ></asp:textbox></td>
      <td class="tdgenap"></td>
      <td class="tdganjil"></td>
    </tr>

      <tr>
       	<td class="tdgenap">Manufacturing</td>
    	<td class="tdganjil"width="30%">
    		<asp:textbox id="txtYear" runat="server" CssClass="inptype" width="75" MaxLength="4" ></asp:textbox> YYYY 
			<asp:textbox id="txtMonth" runat="server" CssClass="inptype" width="30" MaxLength="2"></asp:textbox> MM </td>   

		<td class="tdgenap"></td>
    	<td class="tdganjil"width="30%"></td>       	
      </tr>
       <tr>
       	<td class="tdgenap">Color [Attribute 1]</td>
      	<td class="tdganjil"width="30%" colspan="3"><asp:textbox id="txtColor" runat="server" CssClass="inptype" width="300"  ></asp:textbox>
      	</td>
      </tr>
 		 <tr>
       	<td class="tdgenap">License Plate [Attribute 2]</td>
      	<td class="tdganjil"width="30%" colspan="3"><asp:textbox id="txtLicensePlate" runat="server" CssClass="inptype" width="300"  ></asp:textbox>
      	</td>
      </tr>

    <tr> 
      <td colspan="4" class="tdjudulhijau">ASSET REGISTRATION
      </td>
    </tr>
     <tr> 
      <td valign="top" class="tdgenap" width="20%">Name</td>
      <td colspan="3" class="tdganjil"> 
		<asp:textbox id="txtNameAssetRegistration" runat="server" cssclass="inptype" width="350"></asp:textbox>
		<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucAssetRegistration" runat="server" NavigateUrl="../Lookup/CustomerLookUp.htm" Target="_blank"></asp:Hyperlink></td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap" width="20%">ID No</td>
      <td colspan="3" class="tdganjil"> 
		<asp:textbox id="txtIDNo" runat="server" cssclass="inptype" width="200"></asp:textbox>
		</td>
    </tr>

     <tr> 
      <td valign="top" class="tdgenap" width="20%">Address</td>
      <td colspan="3" class="tdganjil"> 
	<asp:textbox id="txtgAddress" runat="server" cssclass="inptype" width="50%"></asp:textbox></td>
    </tr>
    <tr> 
      <td class="tdgenap">RT/RW</td>
      <td  colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtRT" runat="server" cssclass="inptype" width="15%"></asp:textbox>
        </font> / <font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtRW" runat="server" cssclass="inptype" width="15%"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Kelurahan</td>
      <td class="tdganjil" colspan="3"><asp:textbox id="txtKelurahan" runat="server" cssclass="inptype" width="100"></asp:textbox></td>
    </tr>
    <tr> 
      <td class="tdgenap">Kecamatan</td>
      <td class="tdganjil" colspan="3"><asp:textbox id="txtKecamatan" runat="server" cssclass="inptype" width="100"></asp:textbox></td>
    </tr>
    <tr> 
      <td class="tdgenap">City</td>
      <td class="tdganjil" colspan="3"><asp:textbox id="txtCity" runat="server" cssclass="inptype" width="100"></asp:textbox></td>
    </tr>
    <tr> 
      <td class="tdgenap">Zip Code</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtZipCode" Enabled="false" runat="server" cssclass="inptype" width="20%"></asp:textbox>
		<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucZipCode" runat="server" NavigateUrl="Lookup/ZipCodeLookup.htm" Target="_blank"></asp:Hyperlink>
		</font>
        </td> 
    </tr>
    <tr> 
      <td class="tdgenap">Phone 1</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
			<asp:textbox id="txtAreaPhone1" runat="server" cssclass="inptype" width="10%"></asp:textbox>
        - 
			<asp:textbox id="txtPhone1" runat="server" cssclass="inptype" width="20%"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="height: 24px">Phone 2</td>
      <td class="tdganjil" colspan="3" style="height: 24px"><font face="Tahoma, Verdana" size="2"> 
       	<asp:textbox id="txtAreaPhone2" runat="server" cssclass="inptype" width="10%"></asp:textbox>
        - 
			<asp:textbox id="txtPhone2" runat="server" cssclass="inptype" width="20%"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Fax</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
      	<asp:textbox id="txtAreaFax1" runat="server" cssclass="inptype" width="10%"></asp:textbox>
        - 
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
      <td colspan="4" class="tdjudulhijau">ASSET USAGE INFORMATION
      </td>
    </tr>
     <tr> 
      <td valign="top" class="tdgenap" width="20%">Name</td>
      <td colspan="3" class="tdganjil"> 
		<asp:textbox id="txtName" runat="server" cssclass="inptype" width="350"></asp:textbox>
		<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucAssetUser" runat="server" NavigateUrl="../Lookup/CustomerLookUp.htm" Target="_blank"></asp:Hyperlink></td>
    </tr>
    <tr>
	  <td valign="top" class="tdgenap" width="20%">Relationship With Customer</td>
      <td colspan="3" class="tdganjil"> 
		<asp:dropdownlist id="ddlRelation" runat="server" cssclass="inptype" width="150">
		 	<asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      		<asp:ListItem Text="Family" Value="F"></asp:ListItem>
      		<asp:ListItem Text="Other" Value="O"></asp:ListItem>
		</asp:dropdownlist>		
	</tr>
	<tr> 
      <td colspan="4" class="tdjudulhijau">ASSET LOCATION
      </td>
    </tr>
     <tr>
      <td class="tdgenap" style="width: 28%">Copy Address From</td>
      <td class="tdganjil" colspan="3"><asp:dropdownlist id="ddlCopyAddressFrom" runat="server" cssclass="inptype" width="150">
      		<asp:ListItem Text="Residence Address" Value="R"></asp:ListItem>
		 	<asp:ListItem Text="Legal Address" Value="L"></asp:ListItem>
      		<asp:ListItem Text="Company Address" Value="C"></asp:ListItem>
		</asp:dropdownlist>	
        </td>
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
			<asp:textbox id="txtFax1" runat="server" cssclass="inptype" width="20%"></asp:textbox>
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
      <td valign="top" class="tdgenap" style="width: 28%">Asset Notes</td>
      <td colspan="3" class="tdganjil"> 
		<textarea name="textarea0" cols="50" rows="5" class="inptype"></textarea> 
      </td>
    </tr>
     <tr> 
      <td colspan="4" class="tdjudulhijau">SUPPLIER EMPLOYEE <font color="red">*)</font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">General Manager</td>
      <td class="tdganjil">GM1 </td>
      <td class="tdgenap">Sales Person</td>
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

<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>

  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="70%" align="right" height="30"><asp:CheckBox ID="chkContinue" runat="server" Text="Continue to Next Step for this application"></asp:CheckBox> </td>
      <td width="30%" align="right" class="tdganjil">
      <asp:ImageButton id="imbSaveMarketingMemo" imageurl="../../Images/ButtonSave.gif" postbackurl="MarketingMemoLSInsuranceDataList.aspx" runat="server"></asp:ImageButton>
        <asp:ImageButton ID="imbCancelEntryAsset" runat="server" PostBackUrl="MarketingMemoLSAssetDataList.aspx" ImageUrl="../../Images/ButtonCancel.gif"></asp:ImageButton>
        
      </td>
    </tr>
  </table>
</div>
</div>
</form>
</body>
</html>
