<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>*</title>
<link rel="stylesheet" type="text/css" href="../Confins.css" />
<style type="text/css">
.style1 {
	text-align: left;
}
.style2 {
	background-color: #FFFFFF;
	text-align: left;
}
.style3 {
	background-color: #F4FAFF;
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmProductOfferingAdd" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3" class="style1"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SURVEY FEE - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr>
          <td class="style3" style="width: 40%">Coverage Range</td>
          <td class="style2">
			21 - 60 KM <font color="red">*)</font> 
			</td>
        </tr>
        <tr> 
          <td class="style3" style="width: 40%">Survey Fee</td>
          <td class="style2"> <font color="red">
			<asp:TextBox runat="server" id="txtSurveyFee" Width="150px" CssClass="inptype">100,000.00
			</asp:TextBox>
			&nbsp;*)</font> </td>
        </tr>
        </table>
</div>      
  <div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" style="height: 30px"></td>
      <td width="50%" align="right" style="height: 30px">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../images/ButtonSave.gif" PostBackUrl="SurveyFee.aspx" Height="20px" />&nbsp;&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../images/ButtonCancel.gif" PostBackUrl="SurveyFee.aspx" /></td>
    </tr>
  </table>
  </div>
</form>
</body>
</html>
