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
   	 <td class="tdgenap" width="20%">Sub Branch</td>
      <td class="tdganjil" width="30%">
      	<asp:DropDownList ID="ddlSubBranch" runat="server">
      		<asp:ListItem Text="xxxAAxxx" Value="xxxAAxxx"></asp:ListItem>
      		<asp:ListItem Text="xxxAAxxx" Value="xxxAAxxx"></asp:ListItem>
      	</asp:DropDownList>&nbsp;<font color="red">Zuma.BranchID</font>
      </td>
     <td class="tdgenap" width="20%">Promotion Media</td>
      <td class="tdganjil" width="30%">
      <asp:DropDownList ID="ddlSOA" runat="server">
      		<asp:ListItem Text="xxxAAxxx" Value="xxxAAxxx"></asp:ListItem>
      		<asp:ListItem Text="xxxAAxxx" Value="xxxAAxxx"></asp:ListItem>
      	</asp:DropDownList>&nbsp;<font color="red">Zuma.SourceApplication</font>
		</td>  
    </tr>
	<tr> 
	<td class="tdgenap">Source Of Referral</td>
      <td class="tdganjil"><asp:textbox id="txtReferal" runat="server" CssClass="inptype" width="100"></asp:textbox> 
         	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucReferal" runat="server" NavigateUrl="../Lookup/MarketingLookup.aspx" Target="_blank"></asp:Hyperlink>
	  </td>
	  <td class="tdgenap">Telesales</td>
      <td class="tdganjil"><asp:textbox id="txtMarketing" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucMarketing" runat="server" NavigateUrl="../Lookup/MarketingLookup.aspx" Target="_blank"></asp:Hyperlink>&nbsp;</td>
        
      </tr>
      <tr> 
   <td class="tdgenap">Surveyor</td>
      <td class="tdganjil"width="30%"><asp:textbox id="txtSurveyor" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucSurveyor" runat="server" NavigateUrl="../Lookup/SurveyorLookup.aspx" Target="_blank"></asp:Hyperlink>&nbsp;<font color="red">Zuma.SurveyorID</font>
      </td>
      
      <td class="tdgenap">Marketing I</td>
      <td class="tdganjil"><asp:textbox id="txtAlternateMarketing" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucAlternateMarketing" runat="server" NavigateUrl="../Lookup/MarketingLookup.aspx" Target="_blank"></asp:Hyperlink>
      <font color="red">Zuma.SurveyorID</font>
	  </td>
    
      </tr>

      <tr>
       <td class="tdgenap">Survey Date</td>
      	<td class="tdganjil" width="30%"><asp:textbox id="txtSurveyDate" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconCalendar.gif" ID="ucCalendar" runat="server" NavigateUrl="../Lookup/SurveyorLookup.aspx" Target="_blank"></asp:Hyperlink>&nbsp;<font color="red">Zuma.SurveyDate</font>
      	</td>

       <td class="tdgenap">Marketing II</td>
      <td class="tdganjil">
      		<asp:textbox id="txtAlternateMarketing0" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucAlternateMarketing0" runat="server" NavigateUrl="../Lookup/MarketingLookup.aspx" Target="_blank"></asp:Hyperlink>
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
      	<td class="tdgenap">&nbsp;</td>
      <td class="tdganjil" >&nbsp;</td>
      </tr>

	</table>
     <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td colspan="2" class="tdjudulhijau">PRODUCT <font color="red">*)</font> 
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
      <td class="tdganjil" ><asp:textbox id="txtTenor" runat="server" cssclass="inptype" width="50"></asp:textbox>&nbsp;<font color="red">Zuma.Tenor</font> 
       </td>
    </tr>
    
    <tr> 
      <td class="tdgenap" style="height: 24px">Interest Type</td>
      <td class="tdganjil" style="height: 24px">
  		<asp:dropdownlist id="ddlInterestType" runat="server" cssclass="inptype" width="100">
		    <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
            <asp:ListItem Text="Fixed" Value="FX"></asp:ListItem>	
        	<asp:ListItem Text="Floating" Value="FL"></asp:ListItem>
        </asp:dropdownlist > 
         </td>
    </tr>
    <tr> 
      <td class="tdgenap">Installment Scheme</td>
      <td class="tdganjil">
     	<asp:dropdownlist id="ddlInstallmentScheme" runat="server" cssclass="inptype" width="200">
		    <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
            <asp:ListItem Text="Regular Fixed Installment" Value="RF"></asp:ListItem>	
        </asp:dropdownlist > 
		 </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Currency</td>
      <td class="tdganjil">
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
      <td class="tdganjil">
			<asp:textbox id="txtNumberOfAssets" runat="server" cssclass="inptype" width="50"></asp:textbox>
		</td>
    </tr>
   </table>
   </br>   
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">TERM &amp; CONDITION</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>

    <div align="center">
  <asp:GridView runat="server" id="gridTC"  AllowSorting="true" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield HeaderText="NO" ItemStyle-HorizontalAlign="Center">
			<AlternatingItemTemplate>
				<asp:Label ID="lblTCNo" runat="server">XXX</asp:Label >
			</AlternatingItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="DOCUMENT" ItemStyle-HorizontalAlign="Center">
			<AlternatingItemTemplate>
				<asp:Label ID="lblTCDoc" runat="server">xxxxx55xxxxx</asp:Label >
			</AlternatingItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="PRIOR TO" ItemStyle-HorizontalAlign="Center">
			<AlternatingItemTemplate>
				<asp:Label ID="lblTCPriorTo" runat="server">xxxxx55xxxxx</asp:Label >
			</AlternatingItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="CHECKED" ItemStyle-HorizontalAlign="Center">
			<AlternatingItemTemplate>
				<asp:CheckBox ID="chkTC" runat="server"></asp:CheckBox>&nbsp;<font color="red">*)</font>
			</AlternatingItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="PROMISE DATE" ItemStyle-HorizontalAlign="Center">
			<AlternatingItemTemplate>
				<asp:textbox id="txtTCPromiseDate" runat="server" CssClass="inptype" width="100"></asp:textbox> 
				<asp:Hyperlink  ImageUrl="../../Images/IconCalendar.gif" ID="ucCalendar" runat="server" NavigateUrl="../Lookup/SurveyorLookup.aspx" Target="_blank"></asp:Hyperlink>
			</AlternatingItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="EXPIRED DATE" ItemStyle-HorizontalAlign="Center">
			<AlternatingItemTemplate>
				<asp:textbox id="txtTCDueDate" runat="server" CssClass="inptype" width="100"></asp:textbox> 
				<asp:Hyperlink  ImageUrl="../../Images/IconCalendar.gif" ID="ucCalendar" runat="server" NavigateUrl="../Lookup/SurveyorLookup.aspx" Target="_blank"></asp:Hyperlink>
			</AlternatingItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="NOTES" ItemStyle-HorizontalAlign="Center">
			<AlternatingItemTemplate>
				<asp:textbox id="txtTCNotes" runat="server" CssClass="inptype" width="100"></asp:textbox> 
			</AlternatingItemTemplate>
		</asp:templatefield>
		
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>

  <asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
		</asp:XmlDataSource>
    </div>

    
   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="70%" height="30" align="right">
		<asp:CheckBox ID="chkContinuea" runat="server" Text="Continue Entry for this application">
		</asp:CheckBox>
		</td>
      <td width="30%" align="right"><asp:ImageButton id="imbSavePersonalCustomerSurveyReport" imageurl="../../Images/ButtonSave.gif"  PostBackUrl="SurveyReportDEMotorZumaEntryAssetDataList.aspx" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbCancelPersonalCustomerSurveyReport" PostBackUrl="SurveyReportDEMotorZumaApplicationDataList.aspx" imageurl="../../Images/ButtonCancel.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
  
</div>
</form>
</body>
</html>
