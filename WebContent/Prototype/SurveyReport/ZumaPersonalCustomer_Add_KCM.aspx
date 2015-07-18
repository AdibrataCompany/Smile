<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
<style type="text/css">
.style1 {
	margin-left: 0px;
}
</style>
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
      <td align="center" class="tdtopihijau">PERSONAL CUSTOMER - KCM</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap" style="height: 18px">Legal Name</td>
      <td width="80%" class="tdganjil" style="height: 18px" colspan="3"><asp:Label ID="lblCustomerName" runat="server" Text="Customer0001"></asp:Label>&nbsp;<font color="red">Zuma.LegalName</font></td>
  
    </tr>
      <tr> 
      <td class="tdgenap">ID Number</td>
      <td class="tdganjil"><asp:Label ID="lblIDNumber" Text="1234.1234.1234.1234" runat="server"></asp:Label>&nbsp;
      (<asp:label id="lblIDType" text="KTP" runat="server"></asp:label>)
		</td>
      <td class="tdgenap">&nbsp;Birth Place / Date (age)</td>
      <td class="tdganjil"><asp:label id="lblLocationBirth" Text="Jakarta" runat="server"></asp:label> &nbsp;/
      <asp:label id="lblBirthDate" runat="server">11/12/1978</asp:label>&nbsp;(<asp:Label ID="lblAge" runat="server" Text="29"></asp:Label>)</td>
    </tr>
     <tr> 
      <td class="tdgenap">Maiden Name</td>
      <td class="tdganjil"><asp:Label ID="lblMaidenName" Text="Mother Customer 001" runat="server"></asp:Label>
		</td>
      <td class="tdgenap">Product</td>
      <td class="tdganjil"><asp:label id="lblProduct" runat="server">DE Motor</asp:label></td>
    </tr>
	<table width="95%">
	 <tr> 
	      <td colspan="4" class="tdjudulhijau">PERSONAL CUSTOMER&nbsp; 
	      </td>
	    </tr>
	</table>
	<table width="95%">
  	<tr> 
      <td width="20%" class="tdgenap">Full Name</td>
      <td width="30%" class="tdganjil"><asp:textbox id="txtFullName" runat="server" cssclass="inptype" width="300"></asp:textbox> 
        &nbsp;</td>
      <td width="20%" class="tdgenap">Mobile Phone</td>
      <td width="30%" class="tdganjil"><asp:textbox id="txtMobilePhone" runat="server" cssclass="inptype" width="150"></asp:textbox>
        &nbsp;&nbsp;<font color="red">Zuma.MobilePhone</font> </td>
    </tr>  
    <tr> 
            
      <td width="20%" class="tdgenap">Nationality</td>
      <td width="30%" class="tdganjil">
      <asp:dropdownlist id="ddlNationality0" runat="server" cssclass="inptype" width="100">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="WNI" Value="WNI"></asp:ListItem>
      <asp:ListItem Text="WNA" Value="WNA"></asp:ListItem>
      </asp:dropdownlist > 
		<font color="red">*)</font></td>
      <td class="tdgenap">WNA Country</td>
      <td class="tdganjil">
      <asp:dropdownlist id="ddlNationality1" runat="server" cssclass="inptype" width="100">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="Australia" Value="WNI"></asp:ListItem>
      <asp:ListItem Text="China" Value="WNA"></asp:ListItem>
      </asp:dropdownlist > 
		</td>
    </tr>
    <tr> 
      <td class="tdgenap">Group</td>
      <td class="tdganjil"><asp:textbox id="txtGroup" runat="server"  CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink ImageUrl="../Images/IconDetail.gif" ID="ucLookupGroup" runat="server" NavigateUrl="../../Lookup/GroupLookup.aspx" Target="_blank"></asp:Hyperlink>
		<font color="red">*)</font>	</td>

      <td class="tdgenap">&nbsp;</td>
      <td class="tdganjil" width="30%">&nbsp;</td>
    </tr>

    <tr> 
      <td class="tdgenap">Marital Status</td>
      <td class="tdganjil"><asp:dropdownlist id="ddlNationality" runat="server" cssclass="inptype" width="100">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="Divorced" Value="D"></asp:ListItem>
      <asp:ListItem Text="Married" Value="M"></asp:ListItem>
      <asp:ListItem Text="Single" Value="S"></asp:ListItem>
      <asp:ListItem Text="Widow" Value="W"></asp:ListItem>      
      </asp:dropdownlist > 
		<font color="red">*)</font></td>

      <td class="tdgenap">&nbsp;</td>
      <td class="tdganjil" width="30%">&nbsp;</td>
    </tr>

</table>

	<table width="95%">
    <tr> 
      <td colspan="4" class="tdjudulhijau">LEGAL ADDRESS <font color="red">*)</font> 
      </td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap" width="20%">Address</td>
      <td colspan="3" class="tdganjil"><asp:textbox id="txtgAddress" runat="server" cssclass="inptype" TextMode="MultiLine" width="50%"></asp:textbox>&nbsp;<font color="red">*) Zuma.LegalAddress</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap">RT/RW</td>
      <td  colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtRT" runat="server" cssclass="inptype" width="15%"></asp:textbox>
        </font> / <font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtRW" runat="server" cssclass="inptype" width="15%"></asp:textbox>
        </font>&nbsp;<font color="red">Zuma.LegalRTRW</font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Kelurahan</td>
      <td class="tdganjil" colspan="3"><asp:textbox id="txtKelurahan" runat="server" cssclass="inptype" width="200"></asp:textbox>&nbsp;<font color="red">*) Zuma.LegalKelurahan</font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Kecamatan</td>
      <td class="tdganjil" colspan="3"><asp:textbox id="txtKecamatan" runat="server" cssclass="inptype" width="200"></asp:textbox>&nbsp;<font color="red">*) Zuma.LegalKecamatan</font></td>
    </tr>
    <tr> 
      <td class="tdgenap">City</td>
      <td class="tdganjil" colspan="3"><asp:textbox id="txtCity" runat="server" cssclass="inptype" width="200"></asp:textbox>&nbsp;<font color="red">*) Zuma.LegalCity</font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Zip Code</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtZipCode" Enabled="false" runat="server" cssclass="inptype" width="100" Height="17px"></asp:textbox>
		<asp:Hyperlink  ImageUrl="../Images/IconDetail.gif" ID="ucZipCode" runat="server" NavigateUrl="../../Lookup/ZipCodeLookup.aspx" Target="_blank"></asp:Hyperlink>
		</font>&nbsp;<font color="red">*) Zuma.LegalZipCode</font>
        </td> 
    </tr>
    <tr> 
      <td class="tdgenap">Phone 1</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
			<asp:textbox id="txtAreaPhone1" runat="server" cssclass="inptype" width="10%"></asp:textbox>
        - 
			<asp:textbox id="txtPhone1" runat="server" cssclass="inptype" width="20%"></asp:textbox>
		<font color="red">*) Zuma.HomePhone</font></font></td>
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
    <table width="95%">
    <tr> 
      <td colspan="4" class="tdjudulhijau">RESIDENCE ADDRESS <font color="red">*)</font> 
      <asp:ImageButton ID="imbCopyLegalAddress" runat="server" ImageUrl="../Images/ButtonCopy.gif"></asp:ImageButton></td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap" width="20%">Address</td>
      <td colspan="3" class="tdganjil"> 
	<asp:textbox id="txtResidenceAddress" runat="server" cssclass="inptype" width="50%" TextMode="MultiLine" ></asp:textbox>&nbsp;<font color="red">*) Zuma.ResidenceAddress</font></td>
    </tr>
    <tr> 
      <td class="tdgenap">RT/RW</td>
      <td  colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtResidenceRT" runat="server" cssclass="inptype" width="50"></asp:textbox>
        </font> / <font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtResidenceRW" runat="server" cssclass="inptype" width="50"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Kelurahan</td>
      <td class="tdganjil" colspan="3"><asp:textbox id="txtResidenceKelurahan" runat="server" cssclass="inptype" width="200"></asp:textbox>&nbsp;<font color="red">*)</font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Kecamatan</td>
      <td class="tdganjil" colspan="3"><asp:textbox id="txtResidenceKecamatan" runat="server" cssclass="inptype" width="200"></asp:textbox>&nbsp;<font color="red">*)</font></td>
    </tr>
    <tr> 
      <td class="tdgenap">City</td>
      <td class="tdganjil" colspan="3"><asp:textbox id="txtResidenceCity" runat="server" cssclass="inptype" width="200"></asp:textbox><font color="red">*)</font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Zip Code</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtResidenceZipCode" Enabled="false" runat="server" cssclass="inptype" width="100"></asp:textbox>
		<asp:Hyperlink  ImageUrl="../Images/IconDetail.gif" ID="ucResidenceZipCode" runat="server" NavigateUrl="../../Lookup/ZipCodeLookup.aspx" Target="_blank"></asp:Hyperlink>
		</font><font color="red">*)</font>
        </td> 
    </tr>
    <tr> 
      <td class="tdgenap">Phone 1</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
			<asp:textbox id="txtResidenceAreaPhone1" runat="server" cssclass="inptype" width="10%"></asp:textbox>
        - 
			<asp:textbox id="txtResidencePhone1" runat="server" cssclass="inptype" width="20%"></asp:textbox>
        &nbsp;<font color="red">*)</font></font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="height: 24px">Phone 2</td>
      <td class="tdganjil" colspan="3" style="height: 24px"><font face="Tahoma, Verdana" size="2"> 
       	<asp:textbox id="txtResidenceAreaPhone2" runat="server" cssclass="inptype" width="10%"></asp:textbox>
        - 
			<asp:textbox id="txtResidencePhone2" runat="server" cssclass="inptype" width="20%"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Fax</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
      	<asp:textbox id="txtResidenceAreaFax1" runat="server" cssclass="inptype" width="10%"></asp:textbox>
        - 
			<asp:textbox id="txtResidenceFax1" runat="server" cssclass="inptype" width="20%"></asp:textbox>
        </font></td>
    </tr>
    
    </table>
	<table width="95%">
   <tr> 
      <td colspan="4" class="tdjudulhijau">EMERGENCY CONTACT</td>
    </tr>
    <tr> 
      <td valign="top" width="20%" class="tdgenap">Name</td>
      <td class="tdganjil" width="30%"> 
			<asp:textbox id="txtEmergencyName" runat="server" cssclass="inptype" width="50%"></asp:textbox>
     </td>
      <td valign="top" width="20%" class="tdgenap">Relation</td>
      <td class="tdganjil" width="30%" > 
		<asp:dropdownlist id="ddlEmergencyContactRelation" runat="server" width="50%">
		<asp:ListItem Text="Select One" Value="0"></asp:ListItem>
		<asp:ListItem Text="Paman" Value="Paman"></asp:ListItem>
		<asp:ListItem Text="Other" Value="Other"></asp:ListItem>
		</asp:dropdownlist></td>
    </tr>
     <tr> 
      <td valign="top" class="tdgenap" width="20%">Address</td>
      <td colspan="3" class="tdganjil"> 
		<asp:textbox id="txtEmergencyAddress" runat="server" cssclass="inptype" width="53%" TextMode="MultiLine" ></asp:textbox></td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">RT/RW</td>
      <td class="tdganjil" colspan="3" width="80%"><font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtEmergencyRT" runat="server" cssclass="inptype" width="50"></asp:textbox>
        </font> / <font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtEmergencyRW" runat="server" cssclass="inptype" width="50"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Kelurahan</td>
      <td class="tdganjil" ><asp:textbox id="txtEmergencyKelurahan" runat="server" cssclass="inptype" width="200"></asp:textbox>
	</td>
    </tr>
    <tr> 
      <td class="tdgenap">Kecamatan</td>
      <td class="tdganjil"><asp:textbox id="txtEmergencyKecamatan" runat="server" cssclass="inptype" width="200"></asp:textbox></td>
    </tr>
    <tr> 
      <td class="tdgenap">City</td>
      <td class="tdganjil"><asp:textbox id="txtEmergencyCity" runat="server" cssclass="inptype" width="200"></asp:textbox></td>
    </tr>
     <tr> 
     
      <td class="tdgenap">Zip Code</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtEmergencyZipCode" Enabled="false" runat="server" cssclass="inptype" width="100"></asp:textbox>
		<asp:Hyperlink  ImageUrl="../Images/IconDetail.gif" ID="ucEmergencyZipCode" runat="server" NavigateUrl="../../Lookup/ZipCodeLookup.htm" Target="_blank"></asp:Hyperlink>
		</font>
        </td> 
    </tr>
    <tr> 
      <td class="tdgenap">Phone 1</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
			<asp:textbox id="txtEmergencyAreaPhone1" runat="server" cssclass="inptype" width="50"></asp:textbox>
        - 
			<asp:textbox id="txtEmergencyPhone1" runat="server" cssclass="inptype" width="20%"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Phone 2</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
       	<asp:textbox id="txtEmergencyAreaPhone2" runat="server" cssclass="inptype" width="10%"></asp:textbox>
        - 
			<asp:textbox id="txtEmergencyPhone2" runat="server" cssclass="inptype" width="20%"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Fax</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
      	<asp:textbox id="txtEmergencyAreaFax1" runat="server" cssclass="inptype" width="10%"></asp:textbox>
        - 
			<asp:textbox id="txtEmergencyFax1" runat="server" cssclass="inptype" width="20%"></asp:textbox>
        </font></td>
    </tr>

</table>

    <table width="95%">
    <tr> 
      <td colspan="4" class="tdjudulhijau">JOB DATA<font color="red"> 
		<asp:dropdownlist id="ddlEmergencyContactRelation0" runat="server" width="20%">
		<asp:ListItem Text="Select One" Value="0"></asp:ListItem>
		<asp:ListItem Text="Legal Address" Value="LA"></asp:ListItem>
		<asp:ListItem Text="Residence Address" Value="RA"></asp:ListItem>
		</asp:dropdownlist> </font> 
      </td>
    </tr>
    </table>
    <table width="95%" align="center">
    <tr> 
      <td valign="top" class="tdgenap" width="20%">Profession</td>
      <td class="tdganjil"> 
			<asp:dropdownlist id="txtJobDataProfession" runat="server" width="150">
			<asp:ListItem Text="Select One" Value="0"></asp:ListItem>
			<asp:ListItem Text="Buruh" Value="LA"></asp:ListItem>
			<asp:ListItem Text="Profesional" Value="RA"></asp:ListItem>
			<asp:ListItem Text="Dll" Value="RA"></asp:ListItem>
			</asp:dropdownlist >
     &nbsp;<font color="red" face="Tahoma, Verdana" size="2">*)</font></td>
     </tr>
    <tr> 
      <td class="tdgenap">Company Name</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtJobDataCompanyName" runat="server" cssclass="inptype" width="100"></asp:textbox>

        </font> </td>
    </tr>
    <tr> 
      <td class="tdgenap">Industry Type</td>
      <td class="tdganjil"><asp:textbox id="txtJobDataIndustryType" runat="server" cssclass="inptype" width="10%"></asp:textbox>
	</td>
    </tr>
    <tr> 
      <td class="tdgenap">Business Address</td>
      <td class="tdganjil">
		<asp:textbox id="txtJobDataBusinessAddress" runat="server"  TextMode="MultiLine" CssClass="inptype" width="47%"></asp:textbox></td>
    </tr>
     <tr> 
      <td class="tdgenap" width="20%">RT/RW</td>
      <td class="tdganjil" width="80%">	<asp:textbox id="txtJobDataRT" runat="server" cssclass="inptype" width="50"></asp:textbox>
 / <font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtJobDataRW" runat="server" cssclass="inptype" width="50"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Kelurahan</td>
      <td class="tdganjil" ><asp:textbox id="txtJobDataKeluarahan" runat="server" cssclass="inptype" width="200"></asp:textbox>
	</td>
    </tr>
    <tr> 
      <td class="tdgenap">Kecamatan</td>
      <td class="tdganjil"><asp:textbox id="txtJobDataKecamatan" runat="server" cssclass="inptype" width="200"></asp:textbox></td>
    </tr>
    <tr> 
      <td class="tdgenap">City</td>
      <td class="tdganjil"><asp:textbox id="txtJobDataCity" runat="server" cssclass="inptype" width="200"></asp:textbox></td>
    </tr>
     <tr> 
     
      <td class="tdgenap">Zip Code</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtJobDataZipCode" Enabled="false" runat="server" cssclass="inptype" width="15%"></asp:textbox>
		<asp:Hyperlink  ImageUrl="../Images/IconDetail.gif" ID="ucJobDataZipCode" runat="server" NavigateUrl="../../Lookup/ZipCodeLookup.aspx" Target="_blank"></asp:Hyperlink>
		</font>
        </td> 
    </tr>
    <tr> 
      <td class="tdgenap">Phone 1</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
			<asp:textbox id="txtJobDataAreaPhone1" runat="server" cssclass="inptype" width="10%"></asp:textbox>
        - 
			<asp:textbox id="txtJobDataPhone1" runat="server" cssclass="inptype" width="20%"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Phone 2</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
       	<asp:textbox id="txtJobDataAreaPhone2" runat="server" cssclass="inptype" width="10%"></asp:textbox>
        - 
			<asp:textbox id="txtJobDataPhone2" runat="server" cssclass="inptype" width="20%"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Fax</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
       	<asp:textbox id="txtJobDataAreaFax" runat="server" cssclass="inptype" width="10%"></asp:textbox>
        - 
			<asp:textbox id="txtJobDataFax" runat="server" cssclass="inptype" width="20%"></asp:textbox>
        </font></td>
    </tr>

        <tr> 
      <td class="tdgenap">Business Scale</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
			<asp:textbox id="txtBusinessScale" runat="server" cssclass="inptype" width="5%"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Number of Employee</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
       	<asp:textbox id="txtEmployeeNumber" runat="server" cssclass="inptype" width="6%"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Employment Since </td>
      <td class="tdganjil" ><font face="Tahoma, Verdana" size="2"> 
			<asp:textbox id="txtEmployeeSinceYear" runat="server" cssclass="inptype" width="22%"></asp:textbox>
        <font color="red">  &nbsp;<img src="../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"></font></font></td>
    </tr>
    </table>
        <table width="95%" align="center">
    <tr> 
      <td width="20%" class="tdjudulhijau">CAPITAL DATA</td>
    </tr>
   </table>
	<table width="95%" align="center" class="style1">
    <tr> 
      <td width="20%" class="tdgenap">Home Status</td>
      <td width="30%" class="tdganjil"> 
			<asp:dropdownlist id="txtJobDataProfession0" runat="server" width="150">
			<asp:ListItem Text="Select One" Value="0"></asp:ListItem>
			<asp:ListItem Text="Kontrak" Value="LA"></asp:ListItem>
			<asp:ListItem Text="Keluarga" Value="RA"></asp:ListItem>
			<asp:ListItem Text="Kost" Value="RA"></asp:ListItem>
			</asp:dropdownlist >
		<font color="red">
        *)</font></td>
      <td width="20%" class="tdgenap">Home Price</td>
      <td width="30%" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
			<asp:textbox id="txtJobDataPhone3" runat="server" cssclass="inptype" width="100"></asp:textbox>
        </font> </td>
    </tr>  
    <tr> 
            
      <td width="20%" class="tdgenap">Home Owner Name</td>
      <td width="30%" class="tdganjil">
		<font color="red">
		<asp:textbox id="txtFullName0" runat="server" cssclass="inptype" width="300"></asp:textbox> 
        </font></td>
      <td class="tdgenap">Stay Since Year</td>
      <td class="tdganjil">
      <font face="Tahoma, Verdana" size="2"> 
       	<asp:textbox id="txtEmployeeNumber0" runat="server" cssclass="inptype" width="50"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Rent Finish Date</td>
      <td width="30%" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
			<asp:textbox id="txtEmployeeSinceYear0" runat="server" cssclass="inptype" width="22%"></asp:textbox>
        <font color="red">  &nbsp;<img src="../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"></font></font></td>
      <td width="20%" class="tdgenap">Rent Fee</td>
      <td width="30%" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
			<asp:textbox id="txtJobDataPhone4" runat="server" cssclass="inptype" width="100"></asp:textbox>
        </font> </td>
    </tr> 
    <tr> 
      <td width="20%" class="tdgenap">Home Location</td>
      <td width="30%" class="tdganjil"> 
			<asp:dropdownlist id="txtJobDataProfession1" runat="server" width="150">
			<asp:ListItem Text="Select One" Value="0"></asp:ListItem>
			<asp:ListItem Text="Sederhana" Value="LA"></asp:ListItem>
			<asp:ListItem Text="Menengah" Value="RA"></asp:ListItem>
			<asp:ListItem Text="Mewah" Value="RA"></asp:ListItem>
			</asp:dropdownlist >
		<font color="red">
        *)</font></td>
      <td width="20%" class="tdgenap">&nbsp;</td>
      <td width="30%" class="tdganjil">&nbsp;</td>
    </tr> 
   </table>

    <table width="95%" align="center" class="style1">
    <tr> 
      <td width="20%" class="tdjudulhijau">&nbsp;</td>
      <td width="40%" class="tdjudulhijau">&nbsp;</td>
      <td width="40%" class="tdjudulhijau">&nbsp;</td>
    </tr>
   </table>

  <table width="95%" align="center">
    <tr> 
      <td width="100%" class="tdjudulhijau" colspan="2">OTHER BUSINESS<font color="red"> </font> 
      </td>
    </tr>
   </table>
   <table width="95%" align="center">
        <tr> 
      <td class="tdgenap" width="20%">Name</td>
      <td class="tdganjil" width="80%"><font face="Tahoma, Verdana" size="2"> 
      	<asp:textbox id="txtOtherBusinessName" runat="server" cssclass="inptype" width="264px"></asp:textbox>
        </font></td>
    </tr>
    <tr>
       <td class="tdgenap">Type</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
      	<asp:textbox id="txtType" runat="server" cssclass="inptype" width="100"></asp:textbox>
        </font></td>
    </tr>
        <tr> 
      <td class="tdgenap">Economy Sector</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
      	<asp:textbox id="txtType0" runat="server" cssclass="inptype" width="100"></asp:textbox>
        </font></td>
    </tr>
        <tr> 
      <td class="tdgenap">Industry Group</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
      	<asp:textbox id="txtType1" runat="server" cssclass="inptype" width="100px"></asp:textbox>
        </font></td>
    </tr>
        <tr> 
      <td class="tdgenap">Industry</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
      	<asp:textbox id="txtOtherBusinessIndustry" runat="server" cssclass="inptype" width="92px"></asp:textbox>
        </font></td>
    </tr>
    <tr>
       <td class="tdgenap">Job Title</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
      	<asp:textbox id="txtOtherBusinessJobTitle" runat="server" cssclass="inptype" width="169px"></asp:textbox>
        </font></td>
    </tr>
        <tr> 
      <td class="tdgenap">Since Year</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
      	<asp:textbox id="txtOtherBusinessSinceYear" runat="server" cssclass="inptype" width="60px"></asp:textbox>
        </font></td>
    </tr>
   	</table>
   	
   	  <table width="95%" align="center">
    <tr> 
      <td width="95%" class="tdjudulhijau" colspan="2">CUSTOMER NOTES<font color="red"> </font> 
      </td>
    </tr>
    <tr>
    	<td>
    		<asp:textbox id="txtCustNotes" runat="server" cssclass="inptype" width="900" height="100"></asp:textbox>
    	</td>
    </tr>
   </table>

   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="70%" height="30" align="right"> <asp:CheckBox ID="chkContinue" runat="server" Text="Continue entry for this application"></asp:CheckBox> </td>
      <td width="30%" align="right"><asp:ImageButton id="imbSavePersonalCustomerSurveyReport" imageurl="../Images/ButtonSave.gif" runat="server" PostBackUrl="DEMotor/SurveyReportDEMotorZumaApplicationData.aspx"></asp:ImageButton>
		<asp:ImageButton id="imbCancelPersonalCustomerSurveyReport" postbackurl="ZumaCustomer.aspx" imageurl="../Images/ButtonCancel.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>

</form>
</body>
</html>
