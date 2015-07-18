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
      <td align="center" class="tdtopihijau">PERSONAL CUSTOMER - ADD</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap">Legal Name </td>
      <td class="tdganjil"> <asp:textbox id="txtLegalName" runat="server" cssclass="inptype" width="95%"></asp:textbox>
        <font color="red">*)</font>&nbsp;<font color="red">Zuma.FullName</font> </td>
    </tr>
      <tr> 
       <td class="tdgenap">Type</td>
      <td class="tdganjil">
      <asp:RadioButtonlist runat="server" id="RdBtnListUnitDuration" RepeatDirection="Horizontal" AutoPostBack="true" Enabled="false">
			<asp:ListItem Text="Employee" Value="N" Selected="True"></asp:ListItem>
			<asp:ListItem Text="Professional" Value="U"></asp:ListItem>
			<asp:ListItem Text="Entrepreneur"></asp:ListItem>
			</asp:RadioButtonlist>

	</tr>
	  <tr> 
       <td class="tdgenap">ID Type</td>
      <td class="tdganjil">
		<asp:DropDownList ID="rbIDType" runat="server" width="100" RepeatDirection="Horizontal" >
      <asp:ListItem Text="KTP" Value="KTP"></asp:ListItem>
      <asp:ListItem Text="SIM" Value="SIM"></asp:ListItem>
      <asp:ListItem Text="KITAS" Value="KITAS"></asp:ListItem>
      </asp:DropDownList> 
	</tr>
	<tr>
      <td class="tdgenap">ID Number</td>
      <td class="tdganjil"><asp:textbox id="txtIDNumber" runat="server" cssclass="inptype" width="300"></asp:textbox> 
        <font color="red">*)</font>&nbsp;<font color="red">Zuma.IDNumber</font> </td>
    </tr>
    <tr>
      <td class="tdgenap">NPWP Number</td>
      <td class="tdganjil"><asp:textbox id="txtNPWPNumber" runat="server" cssclass="inptype" width="300"></asp:textbox> 
        <font color="red">*)</font> </td>
    </tr>

    	<tr>
      <td class="tdgenap">Expired Date</td>
      <td class="tdganjil"><asp:textbox id="txtExpiredDateIDNumber" runat="server" cssclass="inptype" width="80"></asp:textbox> 
        <font color="red">  <img src="../Images/iconcalendar.gif" width="20" height="20" align="absmiddle">*)</font> </td>
    </tr>

  	<tr> 
  	      <td class="tdgenap">Gender</td>
      <td class="tdganjil">
      <asp:RadioButtonlist runat="server" id="RdBtnListUnitDuration0" RepeatDirection="Horizontal" AutoPostBack="true" Enabled="false">
			<asp:ListItem Text="Male" Value="N" Selected="True"></asp:ListItem>
			<asp:ListItem Text="Female" Value="U"></asp:ListItem>
			</asp:RadioButtonlist><font color="red">Zuma.Gender</font>
			</td>
    </tr>  

  	<tr> 
  	      <td class="tdgenap">Birth Place / Date</td>
      <td class="tdganjil"><asp:textbox id="txtLocation" runat="server" cssclass="inptype" width="200"></asp:textbox> /
      <asp:textbox id="txtBirthDate" runat="server" cssclass="inptype" width="80"></asp:textbox> 
        <font color="red">  <img src="../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"> &nbsp;*)</font> <font color="red">Zuma.BirthLocationDate</font> </td>
    </tr>  
<tr>
  <td width="20%" class="tdgenap">Mother Maiden Names</td>
      <td class="tdganjil" ><asp:textbox id="txtMaidenName" runat="server" cssclass="inptype" width="300"></asp:textbox>&nbsp;<font color="red">Zuma.MotherMaidenName</font> 
		</td>
</tr>
<tr>
  <td width="20%" class="tdgenap">Product</td>
      <td class="tdganjil"><asp:dropdownlist id="ddlProduct" runat="server" width="100">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="DE Motor" Value="DEMTR"></asp:ListItem>
      <asp:ListItem Text="DE Mobil" Value="DEMBL"></asp:ListItem>
      <asp:ListItem Text="CF Mobil" Value="CFMBL"></asp:ListItem>
      <asp:ListItem Text="Leasing" Value="LSNG"></asp:ListItem>
      </asp:dropdownlist > 
		</td>

</tr>
</table>
   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbSavePersonalCustomerSurveyReport" imageurl="../Images/ButtonSave.gif" postbackurl="ZumaCustomerDataDuplicateChecking.aspx" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbCancelPersonalCustomerSurveyReport" runat="Server" postbackurl="ZumaCustomer.aspx" imageurl="../Images/ButtonCancel.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
 
  

  </div>
</form>
</body>
</html>
