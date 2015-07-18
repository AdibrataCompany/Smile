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
	background-color: #FFFFFF;
	margin-left: 40px;
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
      <td align="center" class="tdtopihijau">MARKETING MEMO - ENTRY APPLICATION DATA</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap" style="height: 18px">Company Name</td>
      <td width="30%" class="tdganjil" style="height: 18px" colspan="3">xxxxx50xxxxx</td>
   
  

    </tr>
      <tr> 
      <td class="tdgenap">NPWP Number</td>
      <td class="tdganjil" >xxxxx30xxxxx<td width="20%" class="tdgenap" style="height: 18px">
		Company Type </td>
      <td width="30%" class="tdganjil" style="height: 18px">xxxxx20xxxxx</td>
    </tr>
     <tr> 
      <td class="tdgenap">Industry Type </td>
      <td class="tdganjil" ><asp:Label ID="lblIndustryType" Text="xxxxx50xxxxx" runat="server"></asp:Label>&nbsp;
     
      <td class="tdgenap">Product</td>
      <td class="tdganjil"><asp:label id="lblProduct" runat="server" Text="xxxxx10xxxxx"></asp:label></td>
    </tr>

    <tr> 
	      <td colspan="4" class="tdjudulhijau">APPLICATION INFORMATION</td>
	</tr>
 	<tr> 
	  <td class="tdgenap">Source of Location</td>
      <td class="tdganjil"><asp:dropdownlist id="ddlSourceOfApplication" runat="server" width="100"> 
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="Bandung" value="300"></asp:ListItem>
      </asp:dropdownlist >
      </td>

      <td class="tdgenap">Source Of Data</td>
      <td class="tdganjil"><asp:textbox id="txtSourceOfData" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucSourceOfData" runat="server" NavigateUrl="../Lookup/MarketingLookup.aspx" Target="_blank"></asp:Hyperlink>
		</td>
    </tr>
	<tr> 
      <td class="tdgenap">Source of Referral</td>
      <td class="tdganjil"><asp:textbox id="txtSourceOfReferal" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucSourceOfReferal" runat="server" NavigateUrl="../Lookup/SourceOfReferal.aspx" Target="_blank"></asp:Hyperlink>
      </td>
      <td class="tdgenap">Marketing</td>
      <td class="tdganjil"><asp:textbox id="txtMarketing" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucMarketing" runat="server" NavigateUrl="../Lookup/Marketing.aspx" Target="_blank"></asp:Hyperlink>
		</td>

      </tr>
      <tr>
       	<td class="tdgenap">Surveyor</td>
      	<td class="tdganjil"width="30%"><asp:textbox id="txtSurveyor" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucSurveyor" runat="server" NavigateUrl="../Lookup/SurveyorLookup.aspx" Target="_blank"></asp:Hyperlink>
      	</td>
      	<td class="tdgenap">Alternative Marketing</td>
      	<td class="tdganjil"><asp:textbox id="txtAlternativeMarketing" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucAlternativeMarketing" runat="server" NavigateUrl="../Lookup/Marketing.aspx" Target="_blank"></asp:Hyperlink>
		</td>
      </tr>
       <tr>
       	<td class="tdgenap">Survey Date</td>
      	<td class="tdganjil"width="30%"><asp:textbox id="txtSurveyDate" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconCalendar.gif" ID="ucCalendar" runat="server" NavigateUrl="../Lookup/SurveyorLookup.aspx" Target="_blank"></asp:Hyperlink>
      	</td>
      	<td class="tdgenap">Dealing</td>
      	<td class="tdganjil"><asp:textbox id="txtDealing" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucDealing" runat="server" NavigateUrl="../Lookup/Marketing.aspx" Target="_blank"></asp:Hyperlink>
		</td>
      </tr>

       <tr>
       	<td class="tdgenap">Way Of Payment</td>
      	<td class="tdganjil"width="30%"><asp:dropdownlist id="ddlWayOfPayment" runat="server" cssclass="inptype" width="100">
		    <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
            <asp:ListItem Text="Bank Transfer" Value="BT"></asp:ListItem>
            <asp:ListItem Text="Cash" Value="CH"></asp:ListItem>
            <asp:ListItem Text="PDC" Value="PDC"></asp:ListItem>
      		</asp:dropdownlist > 
      	</td>
      	<td class="tdgenap">Lease Agreement</td>
      	<td class="tdganjil"width="30%"><asp:dropdownlist id="ddlLeaseAgreement" runat="server" cssclass="inptype" width="100">
			    <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
	            <asp:ListItem Text="Notarized" Value="NTR"></asp:ListItem>	
            	<asp:ListItem Text="Legalized" Value="LGL"></asp:ListItem>
            	<asp:ListItem Text="Waarmerking" Value="WMG"></asp:ListItem>
            	<asp:ListItem Text="Bawah Tangan" Value="BWH"></asp:ListItem>
      		</asp:dropdownlist > 
      	</td>
      </tr>
 <tr>
       	<td class="tdgenap">Syndication</td>
      	<td class="tdganjil"width="30%"><asp:RadioButtonList runat="server" id="rblSyndication" RepeatDirection="Horizontal">
    		<asp:ListItem Text="Yes" Value="1"></asp:ListItem>
			<asp:ListItem Text="No" Value="0"></asp:ListItem>
		</asp:RadioButtonList> 
      	</td>
      	<td class="tdgenap">Repeat Order Quality</td>
      	<td class="tdganjil"width="30%"><asp:Label ID="lblRepeatOrderQuality" runat="server" Text="Regular"></asp:Label></td>

      </tr>

    <tr> 
      <td colspan="4" class="tdjudulhijau">PRODUCT <font color="red">*)</font> 
      </td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap">Product Offering</td>
      <td colspan="3" class="tdganjil"> 
	<asp:textbox id="txtProduct" runat="server" cssclass="inptype" width="50%"></asp:textbox>
	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucLookUpProduct" runat="server" NavigateUrl="../Lookup/ProdcutLookup.aspx" Target="_blank"></asp:Hyperlink>
	</td>
    </tr>
    <tr> 
      <td class="tdgenap">Tenor</td>
      <td class="tdganjil" colspan="3"><asp:textbox id="txtTenor" runat="server" cssclass="inptype" width="50"></asp:textbox>
     </td>
    </tr>
    <td class="tdgenap">Payment Frequency</td>
      <td class="tdganjil" colspan="3"><asp:dropdownlist id="ddlPaymentFrequency" runat="server" cssclass="inptype" width="100">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="Weekly" Value="WE"></asp:ListItem>
      <asp:ListItem Text="BiWeekly" Value="BW"></asp:ListItem>
      <asp:ListItem Text="Monthly" Value="MO"></asp:ListItem>
      <asp:ListItem Text="BiMonthly" Value="BM"></asp:ListItem>
      <asp:ListItem Text="Semi Annual" Value="SM"></asp:ListItem>
      <asp:ListItem Text="Annually" Value="AN"></asp:ListItem>
     </asp:dropdownlist>
     <font color="red">*)</font> </td>

    <tr> 
      <td class="tdgenap" style="height: 24px">Interest Type</td>
      <td class="tdganjil" style="height: 24px" colspan="3">
  		<asp:dropdownlist id="ddlInterestType" runat="server" cssclass="inptype" width="100">
		    <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
            <asp:ListItem Text="Fixed" Value="FX"></asp:ListItem>	
        	<asp:ListItem Text="Floating" Value="FL"></asp:ListItem>
        </asp:dropdownlist > 
        <font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap">Installment Scheme</td>
      <td class="tdganjil" colspan="3">
     	<asp:dropdownlist id="ddlInstallmentScheme" runat="server" cssclass="inptype" width="100">
		    <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
            <asp:ListItem Text="Regular Fixed Installment" Value="RF"></asp:ListItem>	
        	<asp:ListItem Text="Irregular Installment" Value="IR"></asp:ListItem>
        	<asp:ListItem Text="Step Up/Step Down" Value="ST"></asp:ListItem>
        	<asp:ListItem Text="Even Principle" Value="EP"></asp:ListItem>
        </asp:dropdownlist > 
		<font color="red">*)</font> </td>
    </tr>
    <tr>
      <td class="tdgenap" style="height: 24px">Step Up Step Down Type</td>
      <td class="tdganjil" style="height: 24px" colspan="3">
    	<asp:RadioButtonList runat="server" id="rblStepUpStepDownType" RepeatDirection="Horizontal">
    	<asp:ListItem Text="Normal" Value="N"></asp:ListItem>
			<asp:ListItem Text="Regular Leasing" Value="RL"></asp:ListItem>
			<asp:ListItem Text="Leasing" Value="LS"></asp:ListItem>
		</asp:RadioButtonList> 
		<font color="red">*) if installment scheme Step Up/Step Down</font>
    </tr>
    <tr> 
      <td class="tdgenap">Currency</td>
      <td class="tdganjil" colspan="3">
			<asp:dropdownlist id="ddlCurrency" runat="server" width="100">
			<asp:ListItem Text="Select One" Value="0"></asp:ListItem>
			<asp:ListItem Text="IDR" Value="IDR"></asp:ListItem>
			<asp:ListItem Text="USD" Value="USD"></asp:ListItem>
			</asp:dropdownlist>
		</td>
    </tr>
     <tr> 
      <td class="tdgenap">Exchange Rate</td>
      <td class="style1" colspan="3">
			<asp:textbox id="txtExchangeRate" runat="server" cssclass="inptype" width="100"></asp:textbox>
		</td>
    </tr>
	<tr> 
      <td class="tdgenap">Number of Assets</td>
      <td class="tdganjil" colspan="3">
			<asp:textbox id="txtNumberOfAssets" runat="server" cssclass="inptype" width="50"></asp:textbox>
		</td>
    </tr>
    <tr> 
      <td colspan="4" class="tdjudulhijau">MAILING ADDRESS&nbsp; <font color="red">*)</font> 
            <asp:DropDownList ID="ddlSourceAddress" runat="Server">
            <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
		    <asp:ListItem Text="Company Address" Value="Company "></asp:ListItem>

      </asp:DropDownList>

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
		<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucZipCode" runat="server" NavigateUrl="../Lookup/ZipCodeLookup.htm" Target="_blank"></asp:Hyperlink>
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
			<asp:textbox id="txtFax1" runat="server" cssclass="inptype" width="20%"></asp:textbox>
        </font></td>
    </tr>
     <tr> 
      <td class="tdgenap">Coverage Area (KM)</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
      	<asp:Dropdownlist id="ddlCoverageArea" runat="server" cssclass="inptype" width="10%">
      	<asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      	<asp:ListItem Text="100" Value="100"></asp:ListItem>
      	</asp:Dropdownlist > 
      
        </font></td>
    </tr>
<tr class="tdjudulhijau"> 
      <td valign="top" colspan="4">REFERENCE PEOPLE</td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Name</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
        <input name="textarea" type="text" class="inptype" value="" size="20">
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Job Title</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
        <input name="textarea" type="text" class="inptype" value="" size="20">
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Address</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
        <textarea name="textfield342" cols="50" rows="5" class="inptype"></textarea>
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">RT/RW</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield323224" type="text" class="inptype" size="10">
        </font> / <font face="Tahoma, Verdana" size="2"> 
        <input name="textfield323225" type="text" class="inptype" size="10">
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Kelurahan</td>
      <td class="tdganjil" colspan="3"><input name="textfield343" type="text" class="inptype" size="20"></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Kecamatan</td>
      <td class="tdganjil" colspan="3"><input name="textfield344" type="text" class="inptype" size="20"></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">City</td>
      <td class="tdganjil" colspan="3"><input name="textfield352" type="text" class="inptype" size="20"></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Zip Code</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield3232" type="text" class="inptype" size="15">
        <a href="javascript:;" onClick="MM_openBrWindow('../Lookup/ZipCodeLookup.htm','ZipCode','scrollbars=yes,width=900,height=500,left=0,top=0')"><img src="../../Images/IconDetail.gif" width="15" height="15" align="absmiddle" border="0"></a> 
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Phone 1</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield3232623262" type="text" class="inptype" size="5">
        </font>- <font face="Tahoma, Verdana" size="2"> 
        <input name="textfield3232623263" type="text" class="inptype" size="10">
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Phone 2</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326232622" type="text" class="inptype" size="5">
        </font>- <font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326232632" type="text" class="inptype" size="10">
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Fax</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326232623" type="text" class="inptype" size="5">
        </font>- <font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326232633" type="text" class="inptype" size="10">
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Mobile Phone</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
        <input name="textarea" type="text" class="inptype" value="" size="20">
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Email</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
        <input name="textarea" type="text" class="inptype" value="" size="20">
        </font></td>
    </tr>
    <tr>
      <td class="tdgenap">Bank Name</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
        <select name="select19">
          <option selected>Select One</option>
        </select>
        </font></td>
    </tr>
    <tr>
      <td class="tdgenap">Bank Branch</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
        <input name="textarea" type="text" class="inptype" value="" size="20">
        </font></td>
    </tr>
    <tr>
      <td class="tdgenap">Account No.</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
        <input name="textarea" type="text" class="inptype" value="" size="20">
        </font></td>
    </tr>
    <tr>
      <td class="tdgenap">Account Name</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
        <input name="textarea" type="text" class="inptype" value="" size="20">
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Notes</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
        <textarea name="textarea" cols="80" rows="5" class="inptype"></textarea>
        </font></td>
    </tr>

	 <tr> 
	      <td colspan="4" class="tdjudulhijau">CUSTOMER GUARANTOR <font color="red">*)</font> 
	      </td>
	    </tr>
  	<tr> 
      <td width="20%" class="tdgenap">Type Guarantor</td>
      <td width="30%" class="tdganjil">
      <asp:DropDownList ID="ddlTypeGuarantor" runat="server">
      <asp:ListItem Text="Payment" Value="PAY"></asp:ListItem>
      <asp:ListItem Text="Personal" Value="PES"></asp:ListItem>
      <asp:ListItem Text="Corporate" Value="COR"></asp:ListItem>
      </asp:DropDownList>
      
      <td width="20%" class="tdgenap">Guarantor Name</td>
      <td width="30%" class="tdganjil">
      <asp:textbox id="txtGuarantorName" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucGuarantorName" runat="server" NavigateUrl="../Lookup/GuarantorLookup.aspx" Target="_blank"></asp:Hyperlink>
    </tr>  
    <tr> 
      <td width="20%" class="tdgenap" style="height: 23px" >Relation</td>
      <td width="30%" class="tdganjil" colspan="3" style="height: 23px"><asp:textbox ID="txtRelationGuarantor" CssClass="inptype" runat="server" Width="200"></asp:textbox>
        <font color="red">*)</font> </td>
    </tr>
 </table>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td align="right"><asp:ImageButton id="imbAddGuarantorApplicationData" imageurl="../../Images/ButtonAdd.gif"  runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
 <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">CUSTOMER GUARANTOR LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
    <div align="center">
    <asp:GridView runat="server" id="GrdListCustomer" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield HeaderText="NAME">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkAgreementNo" NavigateUrl="../Credit/ViewCompanyCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAgreementNo" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:boundfield DataField="valstringcsttype" HeaderText="TYPE" SortExpression="valstringcsttype">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" HeaderText="ADDRESS" SortExpression="valstring50">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:templatefield HeaderText="ACTION">
			<AlternatingItemTemplate>
				<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconDelete.gif" PostBackUrl="CustomerComplainAdd.aspx" />
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconDelete.gif" PostBackUrl="CustomerComplainAdd.aspx" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
    </div>

<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>

   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
       <td width="70%" align="right" height="30"><asp:CheckBox ID="chkContinue" runat="server" Text="Continue to Next Step for this application"></asp:CheckBox> </td>
       <td width="30%" align="right"><asp:ImageButton id="imbSaveCompanyCustomer" imageurl="../../Images/ButtonSave.gif" runat="server" PostBackUrl="MarketingMemoLSAssetDataList.aspx"></asp:ImageButton>
		<asp:ImageButton id="imbCancelPersonalCustomerSurveyReport" postbackurl="MarketingMemoLS.aspx" imageurl="../../Images/ButtonCancel.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
