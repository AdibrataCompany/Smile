<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>SUPPLIER - ADD</title>
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
.style5 {
	text-align: right;
}
.style6 {
	background-color: #FFFFFF;
	text-align: center;
}
.style7 {
	background-color: #F4FAFF;
	text-align: center;
}
</style>
</head>

<body>
<form id="FrmTeleSalesTargetAdd" runat="server">
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">TELE SALES TARGET - ADD</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>


  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style2">TSE ID</td>
      <td class="style1">
		XXXXXXXXXX</td>
    </tr>
    <tr> 
      <td class="style2">TSE Name</td>
      <td class="style1">
		XXXXXXXXXX</td>
    </tr>
    <tr> 
      <td class="style2">Year</td>
      <td class="style1">
		<asp:TextBox runat="server" id="TbnYear" Width="60px" CssClass="inptype"></asp:TextBox></td>
    </tr>
    <tr> 
      <td width="25%" class="style3" colspan="2" style="width: 50%">&nbsp;DATA</td>
    </tr>
    </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdjudulhijau"> 
      <td class="style3" style="width: 10%">MONTH</td>
      <td class="style3" style="width: 22.5%">PROSPECT TARGET</td>
      <td class="style3" style="width: 22.5%">UNIT TARGET </td>
      <td class="style3" style="width: 22.5%">PHONE BUDGET</td>
      <td class="style3" style="width: 22.5%">PHONE EXPENSE</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="style6" style="width: 100%">January</td>
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnProspect" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
		
	  <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server"  id="TbnPhoneBudget" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>

      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneExpense" Width="185px" CssClass="inptype" ></asp:TextBox>
		</td>
    </tr>
    
    <tr class="tdgenap"> 
      <td class="style7" style="width: 100%">February</td>
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnProspect2" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit2" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>
		   <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneBudget2" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>

      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnitUsed2" Width="185px" CssClass="inptype" >
		</asp:TextBox>
		</td>

    </tr>
   
    <tr class="tdganjil"> 
      <td class="style6" style="width: 100%">March</td>
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnProspect3" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit3" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
		
	  <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server"  id="TbnPhoneBudget3" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>

      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneExpense3" Width="185px" CssClass="inptype" ></asp:TextBox>
		</td>
    </tr>
    
     <tr class="tdgenap"> 
      <td class="style7" style="width: 100%">April</td>
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnProspect4" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit4" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>
		   <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneBudget4" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>

      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnitUsed4" Width="185px" CssClass="inptype" >
		</asp:TextBox>
		</td>

    </tr>


 <tr class="tdganjil"> 
      <td class="style6" style="width: 100%">May</td>
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnProspect5" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit5" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
		
	  <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server"  id="TbnPhoneBudget5" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>

      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneExpense5" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
    
     <tr class="tdgenap"> 
      <td class="style7" style="width: 100%">June</td>
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnProspect6" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit6" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>
		   <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneBudget6" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>

      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnitUsed6" Width="185px" CssClass="inptype" >
		</asp:TextBox>
		</td>

    </tr>


 <tr class="tdganjil"> 
      <td class="style6" style="width: 100%">July</td>
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnProspect7" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit7" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
		
	  <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server"  id="TbnPhoneBudget7" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>

      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneExpense7" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>

    
 <tr class="tdgenap"> 
      <td class="style7" style="width: 100%">August</td>
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnProspect8" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit8" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>
		   <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneBudget8" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>

      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnitUsed8" Width="185px" CssClass="inptype" >
		</asp:TextBox>
		</td>

    </tr>

 <tr class="tdganjil"> 
      <td class="style6" style="width: 100%">September</td>
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnProspect9" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit9" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
		
	  <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server"  id="TbnPhoneBudget9" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>

      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneExpense9" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
<tr class="tdgenap"> 
      <td class="style7" style="width: 100%">October</td>
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnProspect10" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit10" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>
		   <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneBudget10" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>

      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnitUsed10" Width="185px" CssClass="inptype" >
		</asp:TextBox>
		</td>

    </tr>
 <tr class="tdganjil"> 
      <td class="style6" style="width: 100%">November</td>
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnProspect11" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit11" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
		
	  <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server"  id="TbnPhoneBudget11" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>

      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneExpense11" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>

<tr class="tdgenap"> 
      <td class="style7" style="width: 100%">December</td>
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnProspect12" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit12" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>
		   <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneBudget12" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>

      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnitUsed12" Width="185px" CssClass="inptype" >
		</asp:TextBox>
		</td>

    </tr>

    </table>
  <table style="width: 95%">
	<tr>
		<td>&nbsp;</td>
		<td class="style5">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="TeleSalesTarget.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="TeleSalesTarget.aspx" />
		</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td>&nbsp;</td>
	</tr>
</table>
<br />


</form>








</body>

</html>
