<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>SupplierForecastAdd</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<style type="text/css">
.style2 {
	background-color: #F4FAFF;
	text-align: left;
}
.style1 {
	background-color: #FFFFFF;
	text-align: left;
}
.style3 {
	background-color: #F4F4DF;
	font-weight: bold;
	font-size: 10px;
	text-align: center;
}
.style4 {
	background-color: #FFFFFF;
	text-align: center;
}
.style5 {
	text-align: right;
}
.style7 {
	color: #FF0000;
}
</style>
</head>

<body>
<form id="FrmSupplierForecastAdd" runat="server">
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER FORECAST - ADD</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>


  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style2" style="width: 87px">Supplier ID</td>
      <td class="style1">
		XXXXXXXXXX</td>
    </tr>
    <tr> 
      <td class="style2" style="width: 87px">Supplier Name</td>
      <td class="style1">
		PT. XXXXX</td>
    </tr>
    <tr> 
      <td class="style2" style="width: 87px">Year</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbnYear" CssClass="inptype"></asp:TextBox>
&nbsp;&nbsp; <span class="style7">*)</span></td>
    </tr>
    <tr> 
      <td width="25%" class="style3" colspan="2">FORECAST DATA</td>
    </tr>
    </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdganjil"> 
      <td class="style3" style="width: 150px">YEAR</td>
      <td class="style3" style="width: 217px">NEW ASSET</td>
      <td class="style3">USED ASSET</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="style1" style="width: 150px">January</td>
      <td class="tdganjil" style="width: 217px">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnit" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmount" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
      <td class="tdganjil">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnitUsed" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmountUsed" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr class="tdgenap"> 
      <td class="style2" style="width: 150px">February</td>
      <td class="tdgenap" style="width: 217px">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnit11" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmount0" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
      <td class="tdgenap">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnitUsed0" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmountUsed0" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="style1" style="width: 150px">March</td>
      <td class="tdganjil" style="width: 217px">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnit12" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmount1" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
      <td class="tdganjil">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnitUsed1" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmountUsed1" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="style2" style="width: 150px">April</td>
      <td class="tdgenap" style="width: 217px">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnit13" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmount2" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
      <td class="tdgenap">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnitUsed2" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmountUsed2" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="style1" style="width: 150px">May</td>
      <td class="tdganjil" style="width: 217px">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnit14" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmount3" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
      <td class="tdganjil">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnitUsed3" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmountUsed3" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="style2" style="width: 150px">June</td>
      <td class="tdgenap" style="width: 217px">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnit15" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmount4" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
      <td class="tdgenap">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnitUsed4" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmountUsed4" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="style1" style="width: 150px">July</td>
      <td class="tdganjil" style="width: 217px">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnit16" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmount5" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
      <td class="tdganjil">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnitUsed5" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmountUsed5" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="style2" style="width: 150px">August</td>
      <td class="tdgenap" style="width: 217px">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnit17" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmount6" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
      <td class="tdgenap">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnitUsed6" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmountUsed6" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="style1" style="width: 150px">September</td>
      <td class="tdganjil" style="width: 217px">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnit18" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmount7" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
      <td class="tdganjil">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnitUsed7" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmountUsed7" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="style2" style="width: 150px">October</td>
      <td class="tdgenap" style="width: 217px">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnit19" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmount8" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
      <td class="tdgenap">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnitUsed8" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmountUsed8" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="style1" style="width: 150px">November</td>
      <td class="tdganjil" style="width: 217px">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnit20" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmount9" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
      <td class="tdganjil">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnitUsed9" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmountUsed9" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="style2" style="width: 150px">December</td>
      <td class="tdgenap" style="width: 217px">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnit21" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmount10" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
      <td class="tdgenap">Unit&nbsp;
		<asp:TextBox runat="server" id="TbnUnitUsed10" Width="50px" CssClass="inptype">
		</asp:TextBox>
&nbsp; Amount&nbsp;
		<asp:TextBox runat="server" id="TbnAmountUsed10" Width="50px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="style4" style="width: 150px">&nbsp;</td>
      <td class="tdganjil" style="width: 217px">&nbsp;</td>
      <td class="tdganjil">&nbsp; </td>
    </tr>
  </table>
  <table style="width: 95%">
	<tr>
		<td>&nbsp;</td>
		<td class="style5">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="SupplierBranchForecast.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnBack" ImageUrl="../../images/ButtonBack.gif" PostBackUrl="SupplierBranchForecast.aspx" />
		</td>
	</tr>
	</table>
<br />


</form>








</body>

</html>
