<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>*</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<style type="text/css">
.style1 {
	background-color: #F4FAFF;
	text-align: left;
}
.style2 {
	background-color: #FFFFFF;
	text-align: left;
}
.style5 {
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmProductAdd" runat="server">
<div class="style5">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3" class="style5"><font color="red"><i>*)&nbsp;&nbsp;&nbsp;&nbsp; required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">PRODUCT DETAIL - VIEW</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="40%" class="style1" style="height: 18px">Product ID</td>
          <td class="style2" style="height: 18px"><a href="ProductView.aspx" target="_blank">xxxxx20xxxxx</a></td>
        </tr>
        <tr> 
          <td class="style1">Description</td>
          <td class="style2">
		PRODUCT CONSUMER FINANCE NEW HONDA</td>
        </tr>
        <tr> 
          <td class="style1">Asset Type</td>
          <td class="style2">
			AUTOMOTIVE</td>
        </tr>
        <tr> 
          <td class="style1" style="height: 13px">Asset Category</td>
          <td class="style2" style="height: 13px">
			NON TRUCK</td>
        </tr>
        <tr> 
          <td class="style1" style="height: 13px">Asset Origination</td>
          <td class="style2" style="height: 13px">
			CBU</td>
        </tr>
        <tr> 
          <td class="style1" style="height: 13px">Finance Type</td>
          <td class="style2" style="height: 13px">
			Consumer Finance</td>
        </tr>
        <tr> 
          <td class="style1">Lease Back Type</td>
          <td class="style2">
				Lease Back</td>
        </tr>
			<tr>
          <td class="style1">New / Used&nbsp; Type</td>
          <td class="style2"> 
			Used</td>
        	</tr>
		<tr>
          <td class="style1">Conventional Type</td>
          <td class="style2"> 
			Conventional</td>
        	</tr>
		<tr>
          <td class="style1">Vehicle Type</td>
          <td class="style2"> 
			Non Public</td>
        	</tr>
			<tr>
          <td class="style1">Floor Financing</td>
          <td class="style2">
				No</td>
        </tr>
		<tr>
          <td class="style1">Asset Group</td>
          <td class="style2">
			Group A</td>
        </tr>
		<tr>
          <td class="style1">Customer Rating</td>
          <td class="style2">
			1 - Excellent</td>
        </tr>
        <tr> 
          <td class="style1">Asset Year</td>
          <td class="style2"> 
		2006</td>
        </tr>
        <tr> 
          <td class="style1">Tenor</td>
          <td class="style2"> 
		24</td>
        </tr>
        <tr> 
          <td class="style1" style="height: 19px">Minimum Gross Yield</td>
          <td class="style2" style="height: 19px"> 
		10&nbsp;% pa</td>
        </tr>
        <tr> 
          <td class="style1">Minimum Effective Rate</td>
          <td class="style2"> 
		11&nbsp;% pa</td>
        </tr>
        <tr> 
          <td class="style1">Minimum DP Percentage - Branch Category A</td>
          <td class="style2"> 
		10&nbsp;%</td>
        </tr>
        <tr> 
          <td class="style1">Minimum DP Percentage - Branch Category B</td>
          <td class="style2"> 
		15&nbsp;%</td>
        </tr>
        <tr>
          <td class="style1">Minimum Interest Income to be Warned</td>
          <td class="style2"> 
		2,000,000.00</td>
        </tr>
        <tr> 
          <td class="style1">Minimum Interest Income to be Rejected</td>
          <td class="style2"> 
		1,000,000.00</td>
        </tr>
        <tr> 
          <td class="style1">Maximum Amount Finance</td>
          <td class="style2"> 
		300,000,000.00</td>
        </tr>
        <tr> 
          <td class="style1">Admin Fee</td>
          <td class="style2"> 
				Amount 500,000.00</td>
        </tr>
        <tr> 
          <td class="style1">Active</td>
          <td class="style2"> 
				Yes</td>
        </tr>
      </table>
  <div align="center">
    <div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonBack.gif" PostBackUrl="ProductDetailView.aspx" /></td>
    </tr>
  </table>
    </div>
    
  </div>

    </div>
    
  </div>
</div>
</div>
</form>
</body>
</html>
