<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="../../Confins.css">
<style type="text/css">
.style1 {
	font-family: Verdana;
	color: #FF0000;
}
</style>
</head>

<body>
<form id="FrmProductBudgetBranchAdd" runat="server">
<div align="center">
  <div align="center">
    <div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopiorangekiri">&nbsp;</td>
      <td align="center" class="tdtopiorange">BRANCH BUDGET</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
   <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Branch ID</td>
      <td class="tdganjil" >
		<asp:HyperLink runat="server" id="LinkBranchId" NavigateUrl="BranchView.aspx" Target="_blank">A03
		</asp:HyperLink>
		</td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Branch Name</td>
      <td class="tdganjil">
		Grand Wijaya</td>
    </tr>
     <tr> 
      <td width="25%" class="tdgenap">Asset Type</td>
      <td class="tdganjil">
		Mobil</td>
    </tr>
  
 
	<tr>
      <td width="25%" class="tdgenap">Asset Category</td>
      <td class="tdganjil" >
			Non Truck</td>
    </tr>
	<tr>
      <td width="25%" class="tdgenap">Asset Usage</td>
      <td class="tdganjil">
			Commercial</td>
     
    </tr>
	<tr>
      <td width="25%" class="tdgenap">Finance Type</td>
      <td class="tdganjil">
			Consumer Finance</td>
     
    </tr>
	<tr>
      <td width="25%" class="tdgenap">Lease Back Type</td>
      <td class="tdganjil">
			Direct Financing</td>
 
    </tr>
    <tr>
      <td width="25%" class="tdgenap" style="height: 18px">New / Used</td>
      <td class="tdganjil" style="height: 18px">
			New</td>
	</tr>
	<tr>
	<td class="tdgenap">Conventional Type</td>
          <td class="tdganjil" colspan="2"> 
			Conventional
			</td>
        	</tr>
		<tr>
          <td class="tdgenap">Floor Financing</td>
          <td class="tdganjil" colspan="2">
				Yes
		 </td>
        </tr>

	<tr> 
      <td class="tdgenap" width="25%">Year</td>
      <td class="tdganjil">
		2008
		</td>
      
    </tr>

    </table>
  
    <br> 
    
      <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td height="20" class="tdtopiorangekiri" style="width: 10px">&nbsp;</td>
      <td align="center" class="tdtopiorange">BRANCH BUDGET LISTING</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdjudulhijau"> 
      <td class="tdjudulorange" style="width: 10%">MONTH</td>
      <td class="tdjudulorange" style="width: 45%" align="center">UNIT </td>
      <td class="tdjudulorange" style="width: 45%" align="center">AMOUNT</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="style6" style="width: 100%">January</td>
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
		
	  <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server"  id="TbnAmount1" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
    
    <tr class="tdgenap"> 
      <td class="style7" style="width: 100%">February</td>
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit2" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>
		   <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneBudget2" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>

    </tr>
   
    <tr class="tdganjil"> 
      <td class="style6" style="width: 100%">March</td>
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit3" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
		
	  <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server"  id="TbnPhoneBudget3" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>

    </tr>
    
     <tr class="tdgenap"> 
      <td class="style7" style="width: 100%">April</td>
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit4" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>
		   <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneBudget4" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>

     

    </tr>


 <tr class="tdganjil"> 
      <td class="style6" style="width: 100%">May</td>
      
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit5" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
		
	  <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server"  id="TbnPhoneBudget5" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>

      
    </tr>
    
     <tr class="tdgenap"> 
      <td class="style7" style="width: 100%">June</td>
      
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit6" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>
		   <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneBudget6" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>

      

    </tr>


 <tr class="tdganjil"> 
      <td class="style6" style="width: 100%">July</td>
      
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit7" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
		
	  <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server"  id="TbnPhoneBudget7" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>

     
    </tr>

    
 <tr class="tdgenap"> 
      <td class="style7" style="width: 100%">August</td>
      
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit8" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>
		   <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneBudget8" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>

      

    </tr>

 <tr class="tdganjil"> 
      <td class="style6" style="width: 100%">September</td>
      
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit9" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
		
	  <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server"  id="TbnPhoneBudget9" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>

      
    </tr>
<tr class="tdgenap"> 
      <td class="style7" style="width: 100%">October</td>
      
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit10" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>
		   <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneBudget10" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>

      

    </tr>
 <tr class="tdganjil"> 
      <td class="style6" style="width: 100%">November</td>
      
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit11" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
		
	  <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server"  id="TbnPhoneBudget11" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>

      
    </tr>

<tr class="tdgenap"> 
      <td class="style7" style="width: 100%">December</td>
     
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit12" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>
		   <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneBudget12" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>

     

    </tr>

    </table>
    
  </div>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30" class="style3">
		&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="ProductBudgetBranchListing.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="ProductBudgetBranchlisting.aspx" />&nbsp;</td>
    </tr>
  </table>


  </div>
</div>
</form>
</body>
</html>