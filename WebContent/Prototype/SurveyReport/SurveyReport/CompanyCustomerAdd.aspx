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
      <td align="center" class="tdtopihijau">COMPANY CUSTOMER - ADD</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap">Legal Name </td>
       <td colspan="3" class="tdganjil"><asp:textbox id="txtLegalName" runat="server" cssclass="inptype" width="95%"></asp:textbox>
        <font color="red">*)</font> </td>
    </tr>
    <tr>
      <td class="tdgenap">Tax Number</td>
      <td colspan="3" class="tdganjil"><asp:textbox id="txtIDNumber" runat="server" cssclass="inptype" width="300"></asp:textbox> 
        <font color="red">*)</font> </td>
    </tr>
    <tr>
      <td class="tdgenap">Company Type</td>
      <td colspan="3" class="tdganjil"><asp:DropDownList runat="server" id="DdlCompanyType" cssclass="inptype">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="Badan Usaha Milik Negara" Value ="BUMN"></asp:ListItem>
      <asp:ListItem Text="CV" Value="CV"></asp:ListItem>
      <asp:ListItem Text="Firma" Value="Firma"></asp:ListItem>
      <asp:ListItem Text="Perseroan Terbatas" Value="PT"></asp:ListItem>
</asp:DropDownList> 
        <font color="red">*)</font> </td>
    </tr>
     <tr>
        <td class="tdgenap">Group</td>
    	<td class="tdganjil" width="30%"><asp:dropdownlist id="ddlCustomerGroup" runat="server" cssclass="inptype">
	      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
	      <asp:ListItem Text="Group" Value="GR"></asp:ListItem>
	      <asp:ListItem Text="Non Group" Value="NGR"></asp:ListItem>
	      </asp:dropdownlist> &nbsp;<asp:textbox id="txtGroup" runat="server"  CssClass="inptype" width="50"></asp:textbox> 
	      <asp:Hyperlink ImageUrl="../Images/IconDetail.gif" ID="ucLookupGroup" runat="server" NavigateUrl="../Lookup/GroupLookup.aspx" Target="_blank"></asp:Hyperlink>
		</td>
	</tr>
	<tr>
      <td class="tdgenap">Industry Type</td>
      <td class="tdganjil"><asp:textbox id="txtIndustryType" runat="server" CssClass="inptype" width="100"></asp:textbox> 
      	<asp:Hyperlink  ImageUrl="../Images/IconDetail.gif" ID="ucIndustryType" runat="server" NavigateUrl="../Lookup/IndustryTypeLookup.aspx" Target="_blank"></asp:Hyperlink>
      </td>
    </tr>
</TABLE>
	<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
		</asp:XmlDataSource>

   <table width="95%" border="0" cellspacing="0" cellpadding="0">
   <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbSavePersonalCustomerSurveyReport" imageurl="../Images/ButtonSave.gif" postbackurl="CompanyCustomerDataDuplicateChecking.aspx" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbCancelPersonalCustomerSurveyReport" runat="Server" postbackurl="Customer.aspx" imageurl="../Images/ButtonCancel.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
 
  

  </div>
</form>
</body>
</html>
