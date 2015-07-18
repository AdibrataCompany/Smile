<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
</head>

<body>
<form id="form1" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">LIFE INSURANCE COMPANY RATE - EDIT</td>
      <td width="10"><img src="../../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Insurance Co. Branch Id</td>
      <td class="tdganjil">PANIN-JKT</td>
    </tr>
    <tr> 
      <td class="tdgenap">Insurance Co. Branch Name</td>
      <td class="tdganjil">Panin Insurance Jakarta</td>
    </tr>
    <tr>
      <td class="tdgenap">Company Branch </td>
      <td class="tdganjil">Jakarta - Automotive</td>
    </tr>
    <tr> 
      <td class="tdgenap">Tenor</td>
      <td class="tdganjil">24</td>
    </tr>
    <tr> 
      <td class="tdgenap">Age</td>
      <td class="tdganjil">22 years</td>
    </tr>
    <tr> 
      <td class="tdgenap">Gender</td>
      <td class="tdganjil">Female</td>
    </tr>
    <tr> 
      <td class="tdgenap">Rate to Ins Co</td>
      <td class="tdganjil">
		<asp:TextBox runat="server" id="txtRate" CssClass="inptype" Width="70px">2
		</asp:TextBox>
		&nbsp;%<font color="red"> *)</font></td>
    </tr>
    </table>
    
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
      <asp:ImageButton runat="server" id="imbSave" imageUrl="../images/buttonSave.gif" PostBackUrl="LifeInsuranceCompanyBranchRate.aspx"></asp:ImageButton>
      <asp:ImageButton runat="server" id="imbCancel" imageUrl="../images/buttonCancel.gif" PostBackUrl="LieInsuranceCompanyBranchRate.aspx"></asp:ImageButton>
	  </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
