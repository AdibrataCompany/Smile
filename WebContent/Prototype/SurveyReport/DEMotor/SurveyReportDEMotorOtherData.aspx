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
<form runat="Server" id="frmSurveyReportDEMotorOtherData">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SURVEY REPORT DE MOTOR - OTHER DATA</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap" >Application ID</td>
      <td class="tdganjil" ><asp:Hyperlink ID="hypApplicationID" runat="server"  Text="ApplicationID00001" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank"></asp:Hyperlink></td>
      <td width="20%" class="tdgenap" >Customer Name</td>
      <td class="tdganjil" ><asp:Hyperlink ID="hypCustomerName" runat="server"  Text="ApplicationID00001" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank"></asp:Hyperlink></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Product</td>
      <td class="tdganjil" colspan="3"><asp:Hyperlink ID="hypProductOffering" runat="server"  Text="ProductOffering001" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank"></asp:Hyperlink></td>
    </tr>
    </table>
	<table width="95%">
	 <tr> 
	      <td colspan="4" class="tdjudulhijau">CHARACTER ANALYSIS
	      </td>
	    </tr>
	</table>
	  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">  	<tr> 
      <td width="20%" class="tdgenap">Negative List </td>
      <td class="tdganjil" >
		 <asp:radiobuttonlist runat="server" id="CbxListNegativeList" Enabled="false" RepeatDirection="Horizontal">
      	 <asp:ListItem Text="Normal" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="Warning"></asp:ListItem>
      	 <asp:ListItem Text="Bad Debt"></asp:ListItem>
      	 <asp:ListItem Text="No Record"></asp:ListItem>
      	 </asp:radiobuttonlist>
	  </td>
     
    </tr>  
   	<tr> 
      <td class="tdgenap" width="20%">Cooperative </td>
      <td class="tdganjil" > 
      	 <asp:radiobuttonlist runat="server" id="CbxListCooperative" RepeatDirection="Horizontal">
      	 <asp:ListItem Text="Cooperative" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="Non Cooperative"></asp:ListItem>
      	 <asp:ListItem Text="Unknown" ></asp:ListItem>
      	 </asp:radiobuttonlist></td>
    </tr>  
    <tr> 
      <td class="tdgenap" width="20%">Another Loan</td>
      <td class="tdganjil"  > 
      	 <asp:RadioButtonList runat="server" id="CbxListAnotherLoan" AutoPostBack="True" RepeatDirection="Horizontal">
      	 <asp:ListItem Text="Yes" Value="1" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="No" Value="0"></asp:ListItem>
      	 <asp:ListItem Text="Expired" Value="2"></asp:ListItem>
      	 </asp:RadioButtonList ></td>
    </tr>  
    
     <% if CbxListAnotherLoan.SelectedValue  = "Expired" Or CbxListAnotherLoan.SelectedValue = "2" Then %>
       <tr> 
      <td class="tdgenap" width="20%">Payment Record </td>
      <td class="tdganjil"  > 
      	 <asp:Radiobuttonlist runat="server" id="CbxPaymentRecord" RepeatDirection="Horizontal" TextAlign="Right" Cell>
      	 <asp:ListItem Text="Good" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="No"></asp:ListItem>
      	 <asp:ListItem Text="Expired"></asp:ListItem>
      	 </asp:Radiobuttonlist></td>
    </tr>  
    <% End If%>
    <tr>
      <td class="tdgenap" width="20%">Customer Rating </td>
      <td class="tdganjil"  > 
      	 <asp:Radiobuttonlist runat="server" id="CbxPaymentRecord2" RepeatDirection="Horizontal" Enabled="false">
      	 <asp:ListItem Text="Excellent" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="Good"></asp:ListItem>
      	 <asp:ListItem Text="Regular"></asp:ListItem>
      	 <asp:ListItem Text="Bad"></asp:ListItem>
      	 <asp:ListItem Text="Warning"></asp:ListItem>
      	 </asp:Radiobuttonlist></td>
    </tr>  


</table>

	  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">    <tr> 
      <td colspan="4" class="tdjudulhijau" >COLLATERAL ANALYSIS 
      </td>
    </tr>
      <tr>
      <td class="tdgenap" width="20%">BPKB Name </td>
      <td class="tdganjil"  > 
      	 <asp:Radiobuttonlist runat="server" id="RbtnBpkbName" RepeatDirection="Horizontal" >
      	 <asp:ListItem Text="Self " Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="Family"></asp:ListItem>
      	 <asp:ListItem Text="Other"></asp:ListItem>
      	 </asp:Radiobuttonlist></td>
    </tr>  
     <tr>
      <td class="tdgenap" width="20%">Unit Condition </td>
      <td class="tdganjil"  > 
      	 <asp:Radiobuttonlist runat="server" id="RbtnUnitCondition" RepeatDirection="Horizontal" >
      	 <asp:ListItem Text="Standard" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="Less standard"></asp:ListItem>
      	 <asp:ListItem Text="Not Standard"></asp:ListItem>
      	 </asp:Radiobuttonlist></td>
    </tr> 
        <tr>
      <td class="tdgenap" width="20%" style="height: 31px">Unit Duration </td>
      <td class="tdganjil" style="height: 31px"  > 
      	 <asp:Radiobuttonlist runat="server" id="RbtnUnitDuration" RepeatDirection="Vertical" >
      	 <asp:ListItem Text="&lt; 1 Year" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="1-3 Year"></asp:ListItem>
      	 <asp:ListItem Text=" &gt; 3 Year"></asp:ListItem>
      	 </asp:Radiobuttonlist></td>
    </tr> 
    <tr>
      <td class="tdgenap" width="20%">Unit Usage </td>
      <td class="tdganjil"  > 
      	 <asp:Radiobuttonlist runat="server" id="RbtnUnitUsage" RepeatDirection="Horizontal" >
      	 <asp:ListItem Text="Family" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="Commercial"></asp:ListItem>
      	 </asp:Radiobuttonlist></td>
    </tr> 
  </table>
	  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">    <tr> 
      <td colspan="2" class="tdjudulhijau" >CAPITAL ANALYSIS
      </td>
    </tr>
      <tr>
      <td class="tdgenap" width="20%" >Home Status </td>
      <td class="tdganjil"  > 
      	 <asp:DropDownList runat="server" id="DDLHomeStatus" AutoPostBack="true">
      	 <asp:ListItem Text="Milik Sendiri" Value="1" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="Milik Keluarga" Value="2"></asp:ListItem>
      	 <asp:ListItem Text="Sewa / Kontrak" Value="3"></asp:ListItem>
       	 <asp:ListItem Text="Rumah Dinas" Value="4"></asp:ListItem>
       	 <asp:ListItem Text="Other" Value="0"></asp:ListItem>
      	 </asp:DropDownList ></td>
    </tr>  
     <tr>
      <td class="tdgenap" width="20%">Stay Duration </td>
      <td class="tdganjil"  > 
      	 <asp:Radiobuttonlist runat="server" id="RbtnStayDuration" RepeatDirection="Vertical" >
      	 <asp:ListItem Text="&lt; 1 Year" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="1-3 Year"></asp:ListItem>
     	  <asp:ListItem Text="3-5 Year"></asp:ListItem>
      	 <asp:ListItem Text=" &gt; 5 Year"></asp:ListItem>
      	 </asp:Radiobuttonlist></td>
    </tr> 
    <% if DDLHomeStatus.SelectedValue = "Sewa / Kontrak" Or DDLHomeStatus.SelectedValue = "3" Then %>
    <tr>
      <td class="tdgenap" width="20%" style="height: 31px">Rent Period</td>
      <td class="tdganjil" style="height: 31px"  > 
      	 <asp:Radiobuttonlist runat="server" id="RbtnRentPeriod" RepeatDirection="Horizontal">
      	 <asp:ListItem Text="&lt;= Tenor " Selected="True"></asp:ListItem>
       	 <asp:ListItem Text=" &gt;  Tenor"></asp:ListItem>
      	 </asp:Radiobuttonlist></td>
    </tr> 
    <% End If%>
    <tr>
      <td class="tdgenap" width="20%">Home Condition</td>
      <td class="tdganjil"  > 
      	 <asp:DropDownList runat="server" id="DDLHomeCondition">
      	 <asp:ListItem Text="Permanent" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="Semi Permanent"></asp:ListItem>
      	 <asp:ListItem Text="Tidak Layak Huni"></asp:ListItem>
      	 </asp:DropDownList ></td>
    </tr> 
    <tr>
      <td class="tdgenap" width="20%">Home Location</td>
      <td class="tdganjil"> 
         <asp:RadioButton runat="server" ID="RdbtnHomeLocation1" GroupName="HomeLocation" Text="Jalan Raya / Besar" Checked="true"> </asp:RadioButton>
 		 <br>
	     <asp:RadioButton runat="server" ID="RdbtnHomeLocation2" GroupName="HomeLocation" Text="Perumahan"> </asp:RadioButton>
		 <br>
		 <asp:RadioButton runat="server" ID="RdbtnHomeLocation3" GroupName="HomeLocation" Text="Gang"> </asp:RadioButton>
		 <br>
		 <asp:RadioButton runat="server" ID="RdbtnHomeLocation4" GroupName="HomeLocation" Text="Perkampungan / Pedesaan"> </asp:RadioButton>
		 <br>
		 <asp:RadioButton runat="server" ID="RdbtnHomeLocation5" GroupName="HomeLocation" Text="Other"> </asp:RadioButton>
		 &nbsp;&nbsp;
		 <asp:TextBox runat="server" ID="TxtBxOtherHomeLocation" CssClass="inptype" ></asp:TextBox>

      </td>
   </tr>
		
    <tr>
     <td class="tdgenap" width="20%">Other Asset</td>
      <td class="tdganjil"  > 
      	 <asp:CheckBoxList runat="server" id="ChkbxOtherAsset" RepeatDirection="Horizontal">
      	 <asp:ListItem Text="Mobil" ></asp:ListItem>
      	 <asp:ListItem Text="Motor Unit Lain"></asp:ListItem>
      	 <asp:ListItem Text="Rumah / Tempat usaha lain milik sendiri"></asp:ListItem>
       	 </asp:CheckBoxList ></td>
    </tr> 
  </table>

  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">    
  	<tr> 
      <td colspan="2" class="tdjudulhijau" >CAPACITY ANALYSIS
      </td>
	</tr>	
	<tr>
	  <td class="tdgenap" width="20%">Profession </td>
      <td class="tdganjil"  > 
      	 <asp:DropDownList runat="server" id="DDLProfession" AutoPostBack="true">
      	 <asp:ListItem Text="Karyawan Swasta" Value="1" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="PNS" Value="2"></asp:ListItem>
      	 <asp:ListItem Text="Proffesional" Value="3"></asp:ListItem>
       	 <asp:ListItem Text="Guru / Dosen" Value="4"></asp:ListItem>
       	 <asp:ListItem Text="Petani / Nelayan" Value="5"></asp:ListItem>
       	 <asp:ListItem Text="Wiraswasta" Value="6"></asp:ListItem>
    	 <asp:ListItem Text="Others" Value="0"></asp:ListItem>
      	 </asp:DropDownList ></td>
    </tr>  
 	<% if DDLProfession.SelectedValue = "6" Or DDLProfession.SelectedValue = "0" Then %>
	<tr>
	  <td class="tdgenap" width="20%">Other Proffesion <font color="red">*)</font></td>
      <td class="tdganjil"  > 
      	 <asp:TextBox runat="server" id="TxtbxOtherProfession" CssClass="inptype" Width="161px">
		 </asp:TextBox ></td>
    </tr> 
    <% End If%>
	<tr>
	  <td class="tdgenap" width="20%">Job Duration </td>
      <td class="tdganjil"  > 
      	 <asp:RadioButtonList runat="server" id="DDLJobDuration" RepeatDirection="Vertical">
     	 <asp:ListItem Text="&lt; 1 Year" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="1-3 Year"></asp:ListItem>
     	  <asp:ListItem Text="3-5 Year"></asp:ListItem>
     	    <asp:ListItem Text="5-10 Year"></asp:ListItem>
      	 <asp:ListItem Text=" &gt; 10 Year"></asp:ListItem>
      	 </asp:RadioButtonList ></td>
    </tr> 

	<tr>
	  <td class="tdgenap" width="20%">Job Position </td>
      <td class="tdganjil"  > 
      	 <asp:DropDownList runat="server" id="DDLJobPosition" >
      	 <asp:ListItem Text="Staff" Value="1" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="Supervisor / Kepala Bagian" Value="2"></asp:ListItem>
      	 <asp:ListItem Text="Management" Value="3"></asp:ListItem>
       	 <asp:ListItem Text="Owner" Value="4"></asp:ListItem>
      	 </asp:DropDownList ></td>
    </tr> 
    <tr>
	  <td class="tdgenap" width="20%">Job Location </td>
      <td class="tdganjil"  > 
      	 <asp:DropDownList runat="server" id="DDLJobLocation" Width="181px" Height="17px" >
      	 <asp:ListItem Text="Strategis / Ramai" Value="1" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="Sedang" Value="2"></asp:ListItem>
      	 <asp:ListItem Text="Kurang Strategis / sepi" Value="3"></asp:ListItem>
      	 </asp:DropDownList ></td>
    </tr> 
	<tr>
	  <td class="tdgenap" width="20%">Monthly Income </td>
      <td class="tdganjil"  > 
      	 <asp:RadioButtonList runat="server" id="DDLMonthlyIncome" RepeatDirection="Vertical">
      	 <asp:ListItem Text="&lt; 1 Juta" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="1-2 Juta"></asp:ListItem>
     	 <asp:ListItem Text="2-4 Juta"></asp:ListItem>
     	 <asp:ListItem Text="4-5 Juta"></asp:ListItem>
      	 <asp:ListItem Text=" &gt; 5 Juta"></asp:ListItem>
      	 </asp:RadioButtonList ></td>
    </tr> 
	<tr>
	  <td class="tdgenap" width="20%">Cash Flow Coverage</td>
      <td class="tdganjil"  > 
      	 <asp:RadioButtonList runat="server" id="DDLCashFlowCoverage" RepeatDirection="Vertical">
      	 <asp:ListItem Text="&lt; 2 Juta" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="2-3 Juta"></asp:ListItem>
     	 <asp:ListItem Text="3-4 Juta"></asp:ListItem>
     	 <asp:ListItem Text=" &gt; 4 Juta"></asp:ListItem>
      	 </asp:RadioButtonList ></td>
    </tr> 
	<tr>
	  <td class="tdgenap" width="20%">Number of Dependency</td>
      <td class="tdganjil"  > 
      	 <asp:RadioButtonList runat="server" id="DDLNumberofDependency" RepeatDirection="Vertical">
      	 <asp:ListItem Text="&lt;= 2 Orang" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="3 Orang"></asp:ListItem>
     	 <asp:ListItem Text="4 Orang"></asp:ListItem>
      	 <asp:ListItem Text=" &gt; 5 Orang"></asp:ListItem>
      	 </asp:RadioButtonList ></td>
    </tr> 
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">    
  	<tr> 
      <td colspan="2" class="tdjudulhijau" >CREDIT CHECKING 
      </td>
	</tr>	
	 <tr>
      <td class="tdgenap" width="20%">Sumber Credit Checking Dilakukan ke :</td>
      <td class="tdganjil"> 
         <asp:CheckBox runat="server" ID="ChBxCheck1"  Text="Lingkungan Sekitar"> </asp:CheckBox >
 		 <br>
	    <asp:CheckBox runat="server" ID="ChBxCheck2" Text="Rt/Rw / Tokoh masyarakat Sekitar"> </asp:CheckBox >
		 <br>
		 <asp:CheckBox runat="server" ID="ChBxCheck3" Text="Atas nama terakhir BPKB"> </asp:CheckBox >
		 <br>
		 <asp:CheckBox runat="server" ID="ChBxCheck4"  Text="Rekan Kerja Kantor"> </asp:CheckBox >
		 <br>
		 <asp:CheckBox runat="server" ID="ChBxCheck5"  Text="Keluarga yang tidak tinggal satu rumah"> </asp:CheckBox >
		 <br>
		 <asp:CheckBox runat="server" ID="ChBxCheck6"  Text="Keluarga yang tinggal satu rumah"> </asp:CheckBox >
		 <br>
		 <asp:CheckBox runat="server" ID="ChBxCheck7"  Text="Emergency Contact"> </asp:CheckBox >
		 <br>
		 <asp:CheckBox runat="server" ID="ChBxCheck8"  Text="Others"> </asp:CheckBox >
		 &nbsp;&nbsp;
		 <asp:TextBox runat="server" ID="TxtBxOtherCheck" CssClass="inptype" ></asp:TextBox>

      </td>
   
	
	<tr>
	  <td class="tdgenap" width="20%">Owner Asset</td>
      <td class="tdganjil"  > 
      	 <asp:RadioButtonList runat="server" id="DDLownerAsset" RepeatDirection="Horizontal">
      	 <asp:ListItem Text="Yes" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="No"></asp:ListItem>
      	 </asp:RadioButtonList ></td>
    </tr> 
    	<tr>
	  <td class="tdgenap" width="20%">Asset Usage</td>
      <td class="tdganjil"  > 
      	 <asp:RadioButtonList runat="server" id="RdbtnCommercial" RepeatDirection="Horizontal">
      	 <asp:ListItem Text="Commercial" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="Non Commercial"></asp:ListItem>
      	 </asp:RadioButtonList ></td>
    </tr> 
      <tr>
      <td class="tdgenap" width="20%">Informasi Domisili &amp; kepemilikan rumah konsumen</td>
      <td class="tdganjil"> 
         <asp:RadioButton runat="server" ID="RdbtnDomisili1" GroupName="Domisili" Text="Benar milik sendiri / keluarga" Checked="true"> </asp:RadioButton>
 		 <br>
	     <asp:RadioButton runat="server" ID="RdbtnDomisili2" GroupName="Domisili" Text="Benar Menyewa"> </asp:RadioButton>
		 <br>
		 <asp:RadioButton runat="server" ID="RdbtnDomisili3" GroupName="Domisili" Text="Benar Rumah Dinas"> </asp:RadioButton>
		 <br>
		 <asp:RadioButton runat="server" ID="RdbtnDomisili4" GroupName="Domisili" Text="Kost"> </asp:RadioButton>
		 <br>
		 <asp:RadioButton runat="server" ID="RdbtnDomisili5" GroupName="Domisili" Text="Lain - lain "> </asp:RadioButton>
		 &nbsp;&nbsp;
		 <asp:TextBox runat="server" ID="TxtBxOtherDomisili" CssClass="inptype" ></asp:TextBox>

      </td>
   </tr>
  
		<tr>
	  <td class="tdgenap" width="20%">Informasi Lama berdomisili</td>
      <td class="tdganjil"  > 
      	 <asp:RadioButtonList runat="server" id="DDLLamadomisili" RepeatDirection="Vertical">
      	 <asp:ListItem Text="&lt; 1 Year" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="1-3 Year"></asp:ListItem>
     	 <asp:ListItem Text="3-5 Year"></asp:ListItem>
     	 <asp:ListItem Text=" &gt; 5 Year"></asp:ListItem>
      	 </asp:RadioButtonList ></td>
    </tr> 
		<tr>
	  <td class="tdgenap" width="20%">Informasi Usaha / pekerjaan konsumen</td>
      <td class="tdganjil"  > 
      	 <asp:RadioButtonList runat="server" id="DDLinfokonsumen" RepeatDirection="Vertical">
      	 <asp:ListItem Text="Benar, sesuai info dari konsumen" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="info tidak sesuai / pekerjaan diragukan"></asp:ListItem>
       	 </asp:RadioButtonList ></td>
    </tr> 

	<tr>
	  <td class="tdgenap" width="20%">Karakter konsumen</td>
      <td class="tdganjil"  > 
      	 <asp:RadioButtonList runat="server" id="DDLkarakterkonsumen" RepeatDirection="Vertical">
      	 <asp:ListItem Text="Ada info Negatif" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="Tidak ada info Negatif"></asp:ListItem>
       	 </asp:RadioButtonList ></td>
    </tr> 
  	<tr>
	  <td class="tdgenap" width="20%">Marketing Deviation Description</td>
      <td class="tdganjil"  > 
      	 <asp:TextBox runat="server" ID="TxtbxDeviasi"  Width="400" Height="100" TextMode="MultiLine" CssClass="inptype"></asp:TextBox>
      	    	 </td>
    </tr>
	<tr>
	  <td class="tdgenap" width="20%">SK yang digunakan</td>
      <td class="tdganjil"  > 
      	 <asp:TextBox runat="server" ID="TxtbxSkNo"  CssClass="inptype"></asp:TextBox>
      	    	 </td>
    </tr>


    </table>
   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="70%" height="30" align="right"></td>
      <td width="30%" align="right"><asp:ImageButton id="imbSaveSurveyReportDeMotor" imageurl="../../Images/ButtonSave.gif" runat="server" PostBackUrl="SurveyReportDEMotorOtherDataList.aspx"></asp:ImageButton>
		<asp:ImageButton id="imbCancelSurveyReportDEMotor" postbackurl="SurveyReportDEMotorOtherDataList.aspx" imageurl="../../Images/ButtonCancel.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>

</div>
</form>
</body>
</html>
