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
</head>
<body>
<form runat="Server" id="frmPersonalCustomerSurveyReportMobilCF">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SURVEY REPORT CF</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap" style="height: 18px">Legal Name</td>
      <td width="80%" class="tdganjil" style="height: 18px" colspan="3"><asp:Label ID="lblCustomerName" runat="server" Text="Customer0001"></asp:Label></td>
  
    </tr>
      <tr> 
      <td class="tdgenap">ID Number</td>
      <td class="tdganjil"><asp:Label ID="lblIDNumber" Text="1234.1234.1234.1234" runat="server"></asp:Label>&nbsp;
      (<asp:label id="lblIDType" text="KTP" runat="server"></asp:label>)
		</td>
      <td class="tdgenap">Birth Place / Date (Age)</td>
      <td class="tdganjil"><asp:label id="lblLocationBirth" Text="Jakarta" runat="server"></asp:label> &nbsp;/
      <asp:label id="lblBirthDate" runat="server">11/12/1978</asp:label>&nbsp;(<asp:Label ID="lblAge" runat="server" Text="29"></asp:Label>)</td>
    </tr>
     <tr> 
      <td class="tdgenap">Maiden Name</td>
      <td class="tdganjil"><asp:Label ID="lblMaidenName" Text="Mother Customer 001" runat="server"></asp:Label>
		</td>
      <td class="tdgenap">Product</td>
      <td class="tdganjil"><asp:label id="lblProduct" runat="server">DE Mobil/CF</asp:label></td>
    </tr>
    <table width="95%">
	 <tr> 
	      <td colspan="4" class="tdjudulhijau">APPLICATION DATA <font color="red">*)</font> 
	      </td>
	    </tr>
	</table>
    <table width="95%"" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    
   	<tr> 
   		<td class="tdgenap">Source Of Location</td>
      <td class="tdganjil" colspan="3">
      <asp:dropdownlist id="ddlSourceOfApplication" runat="server" width="100"> 
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="Bandung" value="300"></asp:ListItem>
      </asp:dropdownlist >
		</td>
     
    </tr>
	<tr> 
	<td class="tdgenap">Source Of Referral </td>
      <td class="tdganjil"><asp:textbox id="txtReferal" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucReferal" runat="server" NavigateUrl="../Lookup/MarketingLookup.aspx" Target="_blank"></asp:Hyperlink>
		</td>

      <td class="tdgenap">Source Of Data</td>
      <td class="tdganjil">
      <asp:textbox id="txtSourceOfData" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucSourceOfData" runat="server" NavigateUrl="../Lookup/MarketingLookup.aspx" Target="_blank"></asp:Hyperlink>
		</td>    
      </tr>
      <tr> 
  <td class="tdgenap">Marketing</td>
      <td class="tdganjil"><asp:textbox id="txtMarketing" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucMarketing" runat="server" NavigateUrl="../Lookup/MarketingLookup.aspx" Target="_blank"></asp:Hyperlink>

      </td>
      <td class="tdgenap">Alternate marketing</td>
      <td class="tdganjil"><asp:textbox id="txtAlternateMarketing" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucAlternateMarketing" runat="server" NavigateUrl="../Lookup/MarketingLookup.aspx" Target="_blank"></asp:Hyperlink>
      </td>
    
      </tr>

      <tr>
        <td class="tdgenap">Surveyor</td>
      <td class="tdganjil"width="30%"><asp:textbox id="txtSurveyor" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucSurveyor" runat="server" NavigateUrl="../Lookup/SurveyorLookup.aspx" Target="_blank"></asp:Hyperlink>
      </td>
       <td class="tdgenap">Dealing</td>
      <td class="tdganjil">
      <asp:textbox id="txtDaeling" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucDaeling" runat="server" NavigateUrl="../Lookup/SurveyorLookup.aspx" Target="_blank"></asp:Hyperlink>
		</td>
    </tr>
	<tr>
	 <td class="tdgenap">Survey Date</td>
      <td class="tdganjil"><asp:textbox id="txtSurveyDate" text="01/01/2008" runat="server" CssClass="inptype"></asp:textbox > 
        <font color="red" face="Tahoma, Verdana" size="2">  <img src="../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"></font></td>
			 <td class="tdgenap">Repeat Order Quality</td>
      <td class="tdganjil"><asp:label id="lblCustomerRate" text="Regular" runat="server" width="100"></asp:label> 
		</td>

    </tr>
    </table>
    	<table width="95%">
    <tr> 
      <td colspan="4" class="tdjudulhijau">PRODUCT <font color="red">*)</font> 
      </td>
    </tr>
    </table>
    <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid" align="center">
    <tr> 
      <td valign="top" class="tdgenap">Product Offering</td>
      <td class="tdganjil"> 
	<asp:textbox id="txtProduct" runat="server" cssclass="inptype" width="50%"></asp:textbox>
	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucLookUpProduct" runat="server" NavigateUrl="../../LookUp/ProductOfferingLookup.aspx" Target="_blank"></asp:Hyperlink>
	<font color="red">*)</font> 
	</td>
    </tr>
    <tr> 
      <td class="tdgenap">Tenor</td>
      <td class="tdganjil"><asp:textbox id="txtTenor" runat="server" cssclass="inptype" width="50"></asp:textbox>
      <font color="red">*)</font> </td>
    </tr>
    <tr>
    <td class="tdgenap">Payment Frequency</td>
      <td class="tdganjil"><asp:dropdownlist id="ddlPaymentFrequency" runat="server" cssclass="inptype" width="100">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="Weekly" Value="WE"></asp:ListItem>
      <asp:ListItem Text="BiWeekly" Value="BW"></asp:ListItem>
      <asp:ListItem Text="Monthly" Value="MO"></asp:ListItem>
      <asp:ListItem Text="BiMonthly" Value="BM"></asp:ListItem>
      <asp:ListItem Text="Semi Annual" Value="SM"></asp:ListItem>
      <asp:ListItem Text="Annually" Value="AN"></asp:ListItem>
     </asp:dropdownlist>
     <font color="red">*)</font> </td>

    </tr>
    <tr> 
      <td class="tdgenap" style="height: 24px">Interest Type</td>
      <td class="tdganjil" style="height: 24px"><select name="select2">
          <option selected>Fixed Rate</option>
          <option>Floating Rate</option>
        </select> <font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap">Installment Scheme</td>
      <td class="tdganjil"><select name="select">
          <option selected>Regular Fixed Installment</option>
          <option>Irregular Installment</option>
          <option>Step Up/Step Down</option>
          <option>Even Principle</option>
        </select> <font color="red">*)</font> </td>
    </tr>
    <tr>
      <td class="tdgenap" style="height: 24px">Step Up Step Down Type</td>
      <td class="tdganjil" style="height: 24px"><input name="radiobutton" type="radio" value="radiobutton" checked>
        Normal 
        <input type="radio" name="radiobutton" value="radiobutton">
        Leasing <font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap">Currency</td>
      <td class="tdganjil" colspan="3">
			<asp:dropdownlist id="ddlCurrency" runat="server" width="10%">
			<asp:ListItem Text="Select One" Value="0"></asp:ListItem>
			<asp:ListItem Text="IDR" Value="IDR"></asp:ListItem>
			<asp:ListItem Text="USD" Value="USD"></asp:ListItem>
			</asp:dropdownlist>
			<font color="red">*)</font> 
		</td>
    </tr>
  </table>
 <table>
 <table width="95%">
    <tr> 
      <td colspan="4" class="tdjudulhijau">MAILING ADDRESS&nbsp; <font color="red">*)</font> 
            <asp:DropDownList ID="ddlSourceAddress" runat="Server">
      <asp:ListItem Text="Legal Address" Value="Legal"></asp:ListItem>
      <asp:ListItem Text="Residence Address" Value="Residence"></asp:ListItem>
      </asp:DropDownList>
      </td>
    </tr>
    </table>
    <table class="tablegrid" width="95%" border="0" cellpadding="2" cellspacing="1">
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
    </table>

 </table>
<table width="95%" class="tablegrid">
   <tr> 
      <td colspan="4" class="tdjudulhijau">REFERENCE DATA</td>
    </tr>
    </table>
    <table width="95%" align="center"  border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td valign="top" width="20%" class="tdgenap">Name</td>
      <td class="tdganjil" width="30%"> 
			<asp:textbox id="txtReferenceName" runat="server" cssclass="inptype" width="50%"></asp:textbox>
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucGuarantorName1" runat="server" NavigateUrl="../Lookup/GuarantorLookup.aspx" Target="_blank"></asp:Hyperlink>
     </td>
      
    </tr>
    <tr>
    <td class="tdgenap">Reference Type</td>
      <td class="tdganjil" colspan="3">
      	<asp:dropdownlist id="txtReferenceType" runat="server" cssclass="inptype">
      	<asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      	<asp:ListItem Text="Customer Get Customer" Value="CGC"></asp:ListItem>
      	<asp:ListItem Text="Other" Value="OTH"></asp:ListItem>
      	</asp:dropdownlist>
	</td>
	</tr>

     <tr> 
      <td valign="top" class="tdgenap" width="20%">Address</td>
      <td colspan="3" class="tdganjil"> 
		<asp:textbox id="txtReferenceAddress" runat="server" cssclass="inptype" width="53%" TextMode="MultiLine" ></asp:textbox></td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">RT/RW</td>
      <td class="tdganjil" colspan="3" width="80%"><font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtReferenceRT" runat="server" cssclass="inptype" width="50"></asp:textbox>
        </font> / <font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtReferenceRW" runat="server" cssclass="inptype" width="50"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Kelurahan</td>
      <td class="tdganjil" ><asp:textbox id="txtReferenceKelurahan" runat="server" cssclass="inptype" width="200"></asp:textbox>
	</td>
    </tr>
    <tr> 
      <td class="tdgenap">Kecamatan</td>
      <td class="tdganjil"><asp:textbox id="txtReferenceKecamatan" runat="server" cssclass="inptype" width="200"></asp:textbox></td>
    </tr>
    <tr> 
      <td class="tdgenap">City</td>
      <td class="tdganjil"><asp:textbox id="txtReferenceCity" runat="server" cssclass="inptype" width="200"></asp:textbox></td>
    </tr>
     <tr> 
     
      <td class="tdgenap">Zip Code</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtReferenceZipCode" Enabled="false" runat="server" cssclass="inptype" width="100"></asp:textbox>
		<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucReferenceZipCode" runat="server" NavigateUrl="../../Lookup/ZipCodeLookup.htm" Target="_blank"></asp:Hyperlink>
		</font>
        </td> 
    </tr>
    <tr> 
      <td class="tdgenap">Phone 1</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
			<asp:textbox id="txtReferenceAreaPhone1" runat="server" cssclass="inptype" width="50"></asp:textbox>
        - 
			<asp:textbox id="txtReferencePhone1" runat="server" cssclass="inptype" width="20%"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Phone 2</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
       	<asp:textbox id="txtReferenceAreaPhone2" runat="server" cssclass="inptype" width="10%"></asp:textbox>
        - 
			<asp:textbox id="txtReferencePhone2" runat="server" cssclass="inptype" width="20%"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Fax</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
      	<asp:textbox id="txtReferenceAreaFax1" runat="server" cssclass="inptype" width="10%"></asp:textbox>
        - 
			<asp:textbox id="txtReferenceFax1" runat="server" cssclass="inptype" width="20%"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Account Name</td>
      <td class="tdganjil" colspan="3">
      	<asp:textbox id="txtReferenceAccountName" runat="server" cssclass="inptype"></asp:textbox>
      	</td>
    </tr>
    <tr>
      <td class="tdgenap">Account No</td>
      <td class="tdganjil" colspan="3">
      	<asp:textbox id="txtReferenceAccountNo" runat="server" cssclass="inptype"></asp:textbox>
	</td>
	</tr>
 <tr> 
      <td class="tdgenap">Bank Name</td>
      <td class="tdganjil" colspan="3">
      	<asp:textbox id="txtReferenceBankName" runat="server" cssclass="inptype"></asp:textbox>
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucGuarantorName0" runat="server" NavigateUrl="../Lookup/GuarantorLookup.aspx" Target="_blank"></asp:Hyperlink>
      	</td>
    </tr>
    <tr>
      <td class="tdgenap">Bank Branch</td>
      <td class="tdganjil" colspan="3">
      	<asp:textbox id="txtReferenceBankBranch" runat="server" cssclass="inptype"></asp:textbox>
	</td>
	</tr>
	  <tr>
      <td class="tdgenap">Email</td>
      <td class="tdganjil" colspan="3">
      	<asp:textbox id="txtReferenceEmail" runat="server" cssclass="inptype"></asp:textbox>
	</td>
	</tr>
	 <tr>
      <td class="tdgenap">Mobile Phone</td>
      <td class="tdganjil" colspan="3">
      	<asp:textbox id="txtReferenceMobilePhone" runat="server" cssclass="inptype"></asp:textbox>
	</td>
	</tr>
	 <tr>
      <td class="tdgenap">Job Title</td>
      <td class="tdganjil" colspan="3">
      	<asp:textbox id="txtReferenceJobTitle" runat="server" cssclass="inptype"></asp:textbox>
	</td>
	</tr>
	 <tr>
	<td class="tdgenap">Notes</td>
      <td class="tdganjil" colspan="3">
      	<asp:textbox id="txtReferenceNotes" runat="server"  Textmode ="MultiLine" cssclass="inptype" Width="433px"></asp:textbox>
	</td>
	</tr>

</table>

	<table width="95%">
	 <tr> 
	      <td colspan="4" class="tdjudulhijau">GUARANTOR</td>
	    </tr>
	</table>
	<table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
  	<tr> 
      <td width="20%" class="tdgenap">Type Guarantor</td>
      <td width="30%" class="tdganjil">
      <asp:DropDownList ID="ddlTypeGuarantor" runat="server">
      <asp:ListItem Text="Payment" Value="PAY"></asp:ListItem>
      <asp:ListItem Text="Personal" Value="PES"></asp:ListItem>
      <asp:ListItem Text="Coorporate" Value="COR"></asp:ListItem>
      </asp:DropDownList>
      
      <td width="20%" class="tdgenap">Guarantor Name</td>
      <td width="30%" class="tdganjil">
      <asp:textbox id="txtGuarantorName" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucGuarantorName" runat="server" NavigateUrl="../Lookup/GuarantorLookup.aspx" Target="_blank"></asp:Hyperlink>
    </tr>  
    <tr> 
      <td width="20%" class="tdgenap" style="height: 23px" >Relation</td>
      <td width="30%" class="tdganjil" colspan="3" style="height: 23px"><asp:textbox ID="txtRelationGuarantor" CssClass="inptype" runat="server" Width="200"></asp:textbox>
		</td>
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
      <td align="center" class="tdtopihijau">GUARANTOR LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>

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
      
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>

<BR>

<BR>

    <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="20%" align="right"></td>
      <td width="80%" align="right"><asp:CheckBox ID="chkContinue" runat="server" Text="Continue entry for this application"></asp:CheckBox><asp:ImageButton id="imbSavePersonalCustomerSurveyReport" imageurl="../../Images/ButtonSave.gif"  PostBackUrl="SurveyReport_CF_AssetList.aspx" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbCancelPersonalCustomerSurveyReport" PostBackUrl="SurveyReport_CF_ApplicationDataList.aspx" imageurl="../../Images/ButtonCancel.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <br>

</form>
</body>
</html>
