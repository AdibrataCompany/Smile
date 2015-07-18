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
<form runat="Server" id="frmSurveyReportDEMotorApplicationData">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SURVEY REPORT DE MOTOR - 
		APPLICATION DATA</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap" width="20%">Legal Name</td>
      <td width="80%" class="tdganjil"  colspan="3"><asp:Label ID="lblCustomerName" runat="server" Text="Customer0001"></asp:Label></td>
  
    </tr>
      <tr> 
      <td class="tdgenap" width="20%">ID Number</td>
      <td class="tdganjil" width="30%"><asp:Label ID="lblIDNumber" Text="1234.1234.1234.1234" runat="server"></asp:Label>&nbsp;
      (<asp:label id="lblIDType" text="KTP" runat="server"></asp:label>)
		</td>
      <td class="tdgenap" width="20%">Birth Location / Date (age)</td>
      <td class="tdganjil" width="30%"><asp:label id="lblLocationBirth" Text="Jakarta" runat="server"></asp:label> &nbsp;/
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
	      <td colspan="4" class="tdjudulhijau">APPLICATION DATA  
	      </td>
	    </tr>
	</table>
    <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">

    
   	<tr> 
   	 <td class="tdgenap" width="20%">Source of Location</td>
      <td class="tdganjil" width="30%"><asp:textbox id="txtSourceOfLocation" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucSourceOfLocation" runat="server" NavigateUrl="../Lookup/SubBranch.aspx" Target="_blank"></asp:Hyperlink>
      </td>
     <td class="tdgenap" width="20%">Source Of Data</td>
      <td class="tdganjil" width="30%">
      <asp:textbox id="txtSourceOfData" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucSourceOfData" runat="server" NavigateUrl="../Lookup/MarketingLookup.aspx" Target="_blank"></asp:Hyperlink>
		</td>  
    </tr>
	<tr> 
	<td class="tdgenap">Source Of Referral </td>
      <td class="tdganjil"><asp:textbox id="txtReferal" runat="server" CssClass="inptype" width="100"></asp:textbox> 
         	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucReferal" runat="server" NavigateUrl="../Lookup/MarketingLookup.aspx" Target="_blank"></asp:Hyperlink>
	  </td>
	  <td class="tdgenap">Marketing</td>
      <td class="tdganjil"><asp:textbox id="txtMarketing" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucMarketing" runat="server" NavigateUrl="../Lookup/MarketingLookup.aspx" Target="_blank"></asp:Hyperlink>
	</td>
        
      </tr>
      <tr> 
   <td class="tdgenap">Surveyor</td>
      <td class="tdganjil"width="30%"><asp:textbox id="txtSurveyor" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucSurveyor" runat="server" NavigateUrl="../Lookup/SurveyorLookup.aspx" Target="_blank"></asp:Hyperlink>
      </td>
      
      <td class="tdgenap">Alternate marketing</td>
      <td class="tdganjil"><asp:textbox id="txtAlternateMarketing" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucAlternateMarketing" runat="server" NavigateUrl="../Lookup/MarketingLookup.aspx" Target="_blank"></asp:Hyperlink>
      </td>
    
      </tr>

      <tr>
       <td class="tdgenap">Survey Date</td>
      	<td class="tdganjil" width="30%"><asp:textbox id="txtSurveyDate" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconCalendar.gif" ID="ucCalendar" runat="server" NavigateUrl="../Lookup/SurveyorLookup.aspx" Target="_blank"></asp:Hyperlink>
      	</td>

       <td class="tdgenap">Dealing</td>
      <td class="tdganjil">
      <asp:textbox id="txtDaeling" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucDaeling" runat="server" NavigateUrl="../Lookup/SurveyorLookup.aspx" Target="_blank"></asp:Hyperlink>
		</td>
    </tr>
     <tr>
       	<td class="tdgenap">Way Of Payment</td>
      	<td class="tdganjil" width="30%"><asp:dropdownlist id="ddlWayOfPayment" runat="server" cssclass="inptype" width="100">
		    <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
            <asp:ListItem Text="Bank Transfer" Value="BT"></asp:ListItem>
            <asp:ListItem Text="Cash" Value="CH"></asp:ListItem>
            <asp:ListItem Text="PDC" Value="PDC"></asp:ListItem>
      		</asp:dropdownlist > 
      	</td>
      	<td class="tdgenap">Repeat Order Quality</td>
      <td class="tdganjil" ><asp:label id="lblCustomerRate" text="Regular" runat="server" width="100"></asp:label> 
	</td>
      </tr>

	<tr>
	<td class="tdgenap">Application Type</td>
      <td class="tdganjil" colspan="3">
      <asp:dropdownlist id="ddlApplicationType" runat="server" width="100"> 
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="Group" value="300"></asp:ListItem>
      <asp:ListItem Text="Non Group" value="300"></asp:ListItem>
      </asp:dropdownlist >
		</td>

    </tr>
    </table>
    
     <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td colspan="4" class="tdjudulhijau">PRODUCT <font color="red">*)</font> 
      </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Product Offering</td>
      <td class="tdganjil"> 
	<asp:textbox id="txtProduct" runat="server" cssclass="inptype" width="50%"></asp:textbox>
	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucLookUpProduct" runat="server" NavigateUrl="../../LookUp/ProductOfferingLookup.aspx" Target="_blank"></asp:Hyperlink>
	
	</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Tenor</td>
      <td class="tdganjil" ><asp:textbox id="txtTenor" runat="server" cssclass="inptype" width="50"></asp:textbox>
       </td>
    </tr>
    
    <tr> 
      <td class="tdgenap" style="height: 24px">Interest Type</td>
      <td class="tdganjil" style="height: 24px" colspan="3">
  		<asp:dropdownlist id="ddlInterestType" runat="server" cssclass="inptype" width="100">
		    <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
            <asp:ListItem Text="Fixed" Value="FX"></asp:ListItem>	
        	<asp:ListItem Text="Floating" Value="FL"></asp:ListItem>
        </asp:dropdownlist > 
         </td>
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
		 </td>
    </tr>
    <tr>
      <td class="tdgenap" style="height: 24px">Step Up Step Down Type</td>
      <td class="tdganjil" style="height: 24px" colspan="3">
    	<asp:RadioButtonList runat="server" id="rblStepUpStepDownType" RepeatDirection="Horizontal">
    	<asp:ListItem Text="Normal" Value="N"></asp:ListItem>
			<asp:ListItem Text="Regular Leasing" Value="RL"></asp:ListItem>
			<asp:ListItem Text="Leasing" Value="LS"></asp:ListItem>
		</asp:RadioButtonList> 
		
    </tr>

    <tr> 
      <td class="tdgenap" style="width: 20%">Currency</td>
      <td class="tdganjil" colspan="3">
			<asp:dropdownlist id="ddlCurrency" runat="server" width="10%" AutoPostBack="true">
			<asp:ListItem Text="IDR" Value="IDR" Selected="True"></asp:ListItem>
			<asp:ListItem Text="USD" Value="USD"></asp:ListItem>
			</asp:dropdownlist>
			 
		</td>
    </tr>
    
    <% if ddlCurrency.SelectedValue  <> "IDR"  Then %>
    <tr> 
      <td class="tdgenap" style="width: 20%">Exchange Rate</td>
      <td class="tdganjil" >
		<asp:textbox id="txtExchange" runat="server" cssclass="inptype" width="99px" Height="16px"></asp:textbox>
      </td>
    </tr>
    <% End If%>
    <tr> 
      <td class="tdgenap" style="width: 20%">Number of Assets</td>
      <td class="tdganjil" colspan="3">
			<asp:textbox id="txtNumberOfAssets" runat="server" cssclass="inptype" width="50"></asp:textbox>
		</td>
    </tr>

  </table>
   <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr class="tdjudulhijau"> 
      <td valign="top">REFERENCE PEOPLE</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap">Name</td>
      <td class="tdganjil" width="80%"><font face="Tahoma, Verdana" size="2"> 
        <input name="textarea" type="text" class="inptype" value="" size="20">
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Job Title</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textarea" type="text" class="inptype" value="" size="20">
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Reference Type</td>
      <td class="tdganjil"> 
        <asp:RadioButtonList runat="server" ID="RdBtnReferenceType" RepeatDirection="Horizontal">
          <asp:ListItem Text="Personal" Value="P" Selected="True"></asp:ListItem>
          <asp:ListItem Text="Company" Value="C"></asp:ListItem>
        </asp:RadioButtonList>
        </td>
    </tr>

    <tr> 
      <td width="20%" class="tdgenap">Address</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <textarea name="textfield342" cols="50" rows="5" class="inptype"></textarea>
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">RT/RW</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield323224" type="text" class="inptype" size="10">
        </font> / <font face="Tahoma, Verdana" size="2"> 
        <input name="textfield323225" type="text" class="inptype" size="10">
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Kelurahan</td>
      <td class="tdganjil"><input name="textfield343" type="text" class="inptype" size="20"></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Kecamatan</td>
      <td class="tdganjil" ><input name="textfield344" type="text" class="inptype" size="20"></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">City</td>
      <td class="tdganjil"><input name="textfield352" type="text" class="inptype" size="20"></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Zip Code</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield3232" type="text" class="inptype" size="15">
        <a href="javascript:;" onClick="MM_openBrWindow('../../Lookup/ZipCodeLookup.htm','ZipCode','scrollbars=yes,width=900,height=500,left=0,top=0')"><img src="../../Images/IconDetail.gif" width="15" height="15" align="absmiddle" border="0"></a> 
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Phone 1</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield3232623262" type="text" class="inptype" size="5">
        </font>- <font face="Tahoma, Verdana" size="2"> 
        <input name="textfield3232623263" type="text" class="inptype" size="10">
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Phone 2</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326232622" type="text" class="inptype" size="5">
        </font>- <font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326232632" type="text" class="inptype" size="10">
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Fax</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326232623" type="text" class="inptype" size="5">
        </font>- <font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326232633" type="text" class="inptype" size="10">
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Mobile Phone</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textarea" type="text" class="inptype" value="" size="20">
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Email</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textarea" type="text" class="inptype" value="" size="20">
        </font></td>
    </tr>
    <tr>
      <td class="tdgenap">Bank Name</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <select name="select19">
          <option selected>Select One</option>
        </select>
        </font></td>
    </tr>
    <tr>
      <td class="tdgenap">Bank Branch</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textarea" type="text" class="inptype" value="" size="20">
        </font></td>
    </tr>
    <tr>
      <td class="tdgenap">Account No.</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textarea" type="text" class="inptype" value="" size="20">
        </font></td>
    </tr>
    <tr>
      <td class="tdgenap">Account Name</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textarea" type="text" class="inptype" value="" size="20">
        </font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Notes</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <textarea name="textarea" cols="80" rows="5" class="inptype"></textarea>
        </font></td>
    </tr>
  </table>

  

    
   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="70%" height="30" align="right">
		<asp:CheckBox ID="chkContinuea" runat="server" Text="Continue Entry for this application">
		</asp:CheckBox>
		</td>
      <td width="30%" align="right"><asp:ImageButton id="imbSavePersonalCustomerSurveyReport" imageurl="../../Images/ButtonSave.gif"  PostBackUrl="SurveyReportDEMotorEntryAssetDataList.aspx" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbCancelPersonalCustomerSurveyReport" PostBackUrl="../Customer.aspx" imageurl="../../Images/ButtonCancel.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
  
</div>
</form>
</body>
</html>
