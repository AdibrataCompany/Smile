<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="../../Confins.css">
</head>

<body>
<form id="FrmProductFORECASTAdd" runat="server">
<div align="center">
  <div align="center">
    <div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopiorangekiri">&nbsp;</td>
      <td align="center" class="tdtopiorange">BRANCH FORECAST</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
     <tr> 
      <td width="20%" class="tdgenap">Branch</td>
      <td class="tdganjil" >
		<asp:DropDownList runat="server" id="DDLBranch" CssClass="inptype" Width="143px" Height="16px">
			<asp:ListItem>Select One </asp:ListItem>
			<asp:ListItem>Bandung</asp:ListItem>
			<asp:ListItem>Jakarta</asp:ListItem>
		</asp:DropDownList>
		</td>
		
    </tr>
          <tr>
          <td class="tdgenap" width="20%">Asset Type</td>
          <td class="tdganjil" width="80%">
		  <asp:DropDownList runat="server" id="ddlAssetType" Width="250px" CssClass="inptype">
				<asp:ListItem Text="Select One"></asp:ListItem>
				<asp:ListItem Text="Mobil"></asp:ListItem>
				<asp:ListItem  Text="Motor"></asp:ListItem>
			</asp:DropDownList>

        </tr>
	
	<tr> 
      <td width="20%" class="tdgenap">Asset Category</td>
      <td class="tdganjil" >
			<asp:DropDownList runat="server" id="ddlAssetCategory" Width="250px" CssClass="inptype">
				<asp:ListItem Text="Select One"></asp:ListItem>
				<asp:ListItem Value="N" Text="Non Truck"></asp:ListItem>
				<asp:ListItem Value="T" Text="Truck"></asp:ListItem>
			</asp:DropDownList>

		</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Asset Usage</td>
      <td class="tdganjil" >
			<asp:DropDownList runat="server" id="CmbVehicleType" CssClass="inptype">
				<asp:ListItem Text="Select One"></asp:ListItem>
				<asp:ListItem Value="C" Text="Commercial"></asp:ListItem>
				<asp:ListItem Value="N" Text="Non Commercial"></asp:ListItem>
			</asp:DropDownList>

		</td>
    </tr>

	<tr> 
      <td width="20%" class="tdgenap">Finance Type</td>
      <td class="tdganjil" >
			<asp:RadioButtonlist runat="server" id="RdBtnFinanceType" RepeatDirection="Horizontal">
			<asp:ListItem Text="Consumer Finance" Selected="True"></asp:ListItem>
			<asp:ListItem Text="Finance Lease"></asp:ListItem>
			</asp:RadioButtonList>
		</td>
    </tr>
	<tr> 
      <td width="20%" class="tdgenap">Leaseback Type</td>
      <td class="tdganjil">
			<asp:RadioButtonlist runat="server" id="RdBtnLeaseBack" RepeatDirection="Horizontal">
			<asp:ListItem Text="Direct Finance" Selected="True"></asp:ListItem>
			<asp:ListItem Text="Leaseback"></asp:ListItem>
			</asp:RadioButtonList>

		</td>
    </tr>
	<tr> 
      <td width="20%" class="tdgenap">New / Used Type</td>
      <td class="tdganjil" >
			<asp:RadioButtonlist runat="server" id="RdBtnNew" RepeatDirection="Horizontal">
			<asp:ListItem Text="New" Selected="True"></asp:ListItem>
			<asp:ListItem Text="Used"></asp:ListItem>
			</asp:RadioButtonList>
    </tr>
   	<tr>
          <td class="tdgenap">Conventional Type</td>
          <td class="tdganjil" colspan="2"> 
			<asp:RadioButtonList runat="server" id="rdlConventionalType" RepeatDirection="Horizontal">
				<asp:ListItem  Value="C" Text="Conventional" Selected="True"></asp:ListItem>
				<asp:ListItem Value="S" Text="Syariah"></asp:ListItem>
			</asp:RadioButtonList>
			</td>
        	</tr>
		<tr>
          <td class="tdgenap">Floor Financing</td>
          <td class="tdganjil" colspan="2">
				<asp:RadioButtonList runat="server" id="rdoFloorFinancing" RepeatDirection="Horizontal">
				<asp:ListItem Value="Y" Text="Yes" Selected="true"></asp:ListItem>
				<asp:ListItem Value="N" Text="No"></asp:ListItem>
			</asp:RadioButtonList>
				</td>
        </tr>

	<tr> 
      <td class="tdgenap" width="25%">Year</td>
      <td class="tdganjil">
		<asp:TextBox runat="server" id="TbnYear" Width="60px" CssClass="inptype"></asp:TextBox>
		</td>
      
    </tr>

    </table>
  
    <br> 
     <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30" class="style3">
		&nbsp;</td>
      <td width="50%" align="right">
        <asp:HyperLink runat="server" id="HLinkCopy" ImageUrl="../../images/ButtonCopy.gif" NavigateUrl="../../lookup/ProductFORECASTLookup.aspx" Target="_search"></asp:HyperLink>

    </tr>
  </table>

    
      <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td height="20" class="tdtopiorangekiri" style="width: 10px">&nbsp;</td>
      <td align="center" class="tdtopiorange">BRANCH FORCAST LISTING</td>
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
		<asp:TextBox runat="server" id="TbnPhoneFORECAST2" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>

    </tr>
   
    <tr class="tdganjil"> 
      <td class="style6" style="width: 100%">March</td>
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit3" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
		
	  <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server"  id="TbnPhoneFORECAST3" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>

    </tr>
    
     <tr class="tdgenap"> 
      <td class="style7" style="width: 100%">April</td>
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit4" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>
		   <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneFORECAST4" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>

     

    </tr>


 <tr class="tdganjil"> 
      <td class="style6" style="width: 100%">May</td>
      
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit5" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
		
	  <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server"  id="TbnPhoneFORECAST5" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>

      
    </tr>
    
     <tr class="tdgenap"> 
      <td class="style7" style="width: 100%">June</td>
      
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit6" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>
		   <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneFORECAST6" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>

      

    </tr>


 <tr class="tdganjil"> 
      <td class="style6" style="width: 100%">July</td>
      
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit7" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
		
	  <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server"  id="TbnPhoneFORECAST7" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>

     
    </tr>

    
 <tr class="tdgenap"> 
      <td class="style7" style="width: 100%">August</td>
      
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit8" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>
		   <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneFORECAST8" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>

      

    </tr>

 <tr class="tdganjil"> 
      <td class="style6" style="width: 100%">September</td>
      
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit9" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
		
	  <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server"  id="TbnPhoneFORECAST9" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>

      
    </tr>
<tr class="tdgenap"> 
      <td class="style7" style="width: 100%">October</td>
      
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit10" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>
		   <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneFORECAST10" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>

      

    </tr>
 <tr class="tdganjil"> 
      <td class="style6" style="width: 100%">November</td>
      
      <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit11" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>
		
	  <td class="tdganjil" style="width: 185px">
		<asp:TextBox runat="server"  id="TbnPhoneFORECAST11" Width="185px" CssClass="inptype"></asp:TextBox>
		</td>

      
    </tr>

<tr class="tdgenap"> 
      <td class="style7" style="width: 100%">December</td>
     
      <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnUnit12" Width="185px" CssClass="inptype">
		</asp:TextBox>
		</td>
		   <td class="tdgenap" style="width: 185px">
		<asp:TextBox runat="server" id="TbnPhoneFORECAST12" Width="185px" CssClass="inptype">
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
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="ProductFORECASTListing.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="ProductFORECASTlisting.aspx" />&nbsp;</td>
    </tr>
  </table>


  </div>
</div>
</form>
</body>
</html>