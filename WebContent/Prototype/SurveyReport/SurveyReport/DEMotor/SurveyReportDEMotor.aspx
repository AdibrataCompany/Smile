<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Survey Report DE Motor</title>
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
<form runat="Server" id="frmSurveyReportDEMotor">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SURVEY REPORT DE MOTOR</td>
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
      <td class="tdgenap">Birth Place / Date (age)</td>
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
	      <td colspan="4" class="tdjudulhijau">PERSONAL CUSTOMER&nbsp; <font color="red">*)</font>
	      </td>
	    </tr>
	</table>
	<table width="95%">
  	<tr> 
      <td width="20%" class="tdgenap">Full Name</td>
      <td width="30%" class="tdganjil">
		<asp:textbox id="txtFullName" runat="server" cssclass="inptype" width="80%"></asp:textbox>  
         <font color="red"> *)</font></td>
      <td width="20%" class="tdgenap">Mobile Phone</td>
      <td width="30%" class="tdganjil">
		<asp:textbox id="txtMobilePhone" runat="server" cssclass="inptype" width="80%"></asp:textbox> 
         </td>
    </tr>  
   	<tr> 
      <td class="tdgenap" style="width: 26%">Marital Status</td>
      <td class="tdganjil"> 
      		<asp:dropdownlist id="txtMartialStatus" runat="server" width="150">
      		<asp:ListItem Text="Single"></asp:ListItem>
      		<asp:ListItem Text="Married"></asp:ListItem>
     		<asp:ListItem Text="Divorce"></asp:ListItem>
      		<asp:ListItem Text="Widow"></asp:ListItem>
      		</asp:dropdownlist >
      		<font color="red"> *)</font>
      </td>

      
    </tr>  


</table>

	<table width="95%">
    <tr> 
      <td colspan="4" class="tdjudulhijau">LEGAL ADDRESS <font color="red">*)</font> 
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
  

    </table>
    <table width="95%">
    <tr> 
      <td colspan="4" class="tdjudulhijau">RESIDENCE ADDRESS <font color="red">*)</font> 
      <asp:ImageButton ID="imbCopyLegalAddress" runat="server" ImageUrl="../../Images/ButtonCopy.gif"></asp:ImageButton></td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap" width="20%">Address</td>
      <td colspan="3" class="tdganjil"> 
	<asp:textbox id="txtResidenceAddress" runat="server" cssclass="inptype" width="50%"></asp:textbox></td>
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
      <td class="tdganjil" colspan="3"><asp:textbox id="txtResidenceKelurahan" runat="server" cssclass="inptype" width="100"></asp:textbox></td>
    </tr>
    <tr> 
      <td class="tdgenap">Kecamatan</td>
      <td class="tdganjil" colspan="3"><asp:textbox id="txtResidenceKecamatan" runat="server" cssclass="inptype" width="100"></asp:textbox></td>
    </tr>
    <tr> 
      <td class="tdgenap">City</td>
      <td class="tdganjil" colspan="3"><asp:textbox id="txtResidenceCity" runat="server" cssclass="inptype" width="100"></asp:textbox></td>
    </tr>
    <tr> 
      <td class="tdgenap">Zip Code</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtResidenceZipCode" Enabled="false" runat="server" cssclass="inptype" width="20%"></asp:textbox>
		<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucResidenceZipCode" runat="server" NavigateUrl="../Lookup/ZipCodeLookup.htm" Target="_blank"></asp:Hyperlink>
		</font>
        </td> 
    </tr>
    <tr> 
      <td class="tdgenap">Phone 1</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
			<asp:textbox id="txtResidenceAreaPhone1" runat="server" cssclass="inptype" width="10%"></asp:textbox>
        - 
			<asp:textbox id="txtResidencePhone1" runat="server" cssclass="inptype" width="20%"></asp:textbox>
        </font></td>
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
       <tr> 
      <td class="tdgenap">Coverage Area (KM)</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
      	<asp:Dropdownlist id="ddlCoverageArea" runat="server" cssclass="inptype" width="10%">
      	<asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      	<asp:ListItem Text="100" Value="100"></asp:ListItem>
      	</asp:Dropdownlist > 
      
        </font></td>
    </tr>

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
		<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucEmergencyZipCode" runat="server" NavigateUrl="../../Lookup/ZipCodeLookup.htm" Target="_blank"></asp:Hyperlink>
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
    <tr> 
      <td width="100%" class="tdjudulhijau" colspan="2">COLLECTION<font color="red"> </font> 
      </td>
    </tr>
	 <tr> 
     	<td class="tdgenap">Installment Reminder</td>
      	<td class="tdganjil"width="30%"><asp:RadioButtonList runat="server" id="rblInstallmentReminder" RepeatDirection="Horizontal">
    		<asp:ListItem Text="Yes" Value="1"></asp:ListItem>
			<asp:ListItem Text="No" Value="0"></asp:ListItem>
		</asp:RadioButtonList> 
      	</td>
    </tr>
     <tr> 
     	<td class="tdgenap">Reminder Type</td>
      	<td class="tdganjil"width="30%"><asp:RadioButtonList runat="server" id="rblReminderType" RepeatDirection="Horizontal">
    		<asp:ListItem Text="SMS" Value="SMS"></asp:ListItem>
			<asp:ListItem Text="Call" Value="Call"></asp:ListItem>
		</asp:RadioButtonList><font color="red">*) If Installment Reminder = Yes</font> 
      	</td>
    </tr>

    

</table>

    </table>
   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="70%" height="30" align="right"> <asp:CheckBox ID="chkContinue" runat="server" Text="Continue Entry for this application"></asp:CheckBox> </td>
      <td width="30%" align="right"><asp:ImageButton id="imbSaveSurveyReportDeMotor" imageurl="../../Images/ButtonSave.gif" runat="server" PostBackUrl="SurveyReportDEMotorApplicationData.aspx"></asp:ImageButton>
		<asp:ImageButton id="imbCancelSurveyReportDEMotor" postbackurl="../Customer.aspx" imageurl="../../Images/ButtonCancel.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>

</form>
</body>
</html>
