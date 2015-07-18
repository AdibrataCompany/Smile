<%@ Page Language="C#" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
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


<form id="frmDatabase" runat="server">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">DATABASE - ADD</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap">Name</td>
      <td width="80%" class="tdganjil"> 
		<asp:textbox id="txtLegalName" runat="server" cssclass="inptype" width="39%"></asp:textbox>
        <font color="red">*)</font> </td>
    </tr>
      <tr> 
       <td class="tdgenap">Address</td>
      <td class="tdganjil">
		<asp:textbox id="txtLegalName0" runat="server" cssclass="inptype" width="95%" TextMode="MultiLine"></asp:textbox></td>
	</tr>
	<tr>
      <td class="tdgenap">Phone 1</td>
      <td class="tdganjil" colspan="3">
		<asp:textbox id="txtIDNumber" runat="server" cssclass="inptype" width="56px"></asp:textbox> 
        &nbsp;-&nbsp; 
		<asp:textbox id="txtLegalName1" runat="server" cssclass="inptype" width="25%"></asp:textbox>
        <font color="red">  *)</font> 
		</td>
    </tr>
    	<tr>
      <td class="tdgenap">Mobile Phone</td>
      <td class="tdganjil">
		<asp:textbox id="txtExpiredDateIDNumber" runat="server" cssclass="inptype" width="157px"></asp:textbox> 
        <font color="red">  *)</font> </td>
    </tr>

  	<tr> 
  	      <td class="tdgenap">Profession</td>
      <td class="tdganjil">
		<asp:dropdownlist runat="server" cssclass="inptype" width="100" id="ddlProfession"></asp:dropdownlist>
		<font color="red">  *)</font> </td>
    </tr>  
    <tr>
  <td width="20%" class="tdgenap">Email</td>
      <td width="30%" class="tdganjil">
		<asp:textbox id="txtMaidenName" runat="server" cssclass="inptype" width="300" AutoCompleteType="Email"></asp:textbox> 
		</td>
</tr>

<tr>
  <td width="20%" class="tdgenap">SOD (Source Of Data)</td>
  <td width="30%" class="tdganjil"><asp:dropdownlist runat="server" cssclass="inptype" width="100"></asp:dropdownlist></td>
</tr>
<tr>
  <td width="20%" class="tdgenap">Source Of Application</td>
      <td width="30%" class="tdganjil"><asp:dropdownlist id="ddlSourceOfApplication" runat="server" width="100"></asp:dropdownlist > 
		</td>

</tr>
</table>
   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbSaveDataBank" imageurl="../Images/ButtonSave.gif" postbackurl="Database_List.aspx" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbCancelDataBank" runat="Server" postbackurl="Database_List.aspx" imageurl="../Images/ButtonCancel.gif"></asp:ImageButton>
      </td>
    </tr>
  </table>
  </div>

</form>

</body>

</html>
