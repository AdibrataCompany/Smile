<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Telesales</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script></head><body><form id="frmAssignDataBank" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">DATABANK INTERNAL</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
  <tr> 
      <td width="25%" class="tdgenap">Branch</td>
      <td width="85%" class="tdganjil">

      <asp:DropDownList ID="ddlSearchBranch" runat="server" Width="145px" Height="18px">
      <asp:ListItem Text="All" Value="All"></asp:ListItem>
      <asp:ListItem Text="Bandung" Value="E"></asp:ListItem>
      <asp:ListItem Text="Jakarta" Value="I"></asp:ListItem>

      </asp:dropdownlist>
        
      </td>
    </tr>

    <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Birth Date</td>
      <td width="80%" class="tdganjil" style="height: 25px">
    	<asp:TextBox runat="server" id="txtExpiredDate" Width="83px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp;<img src="../Images/iconcalendar.gif" width="20" height="20" align="top"> </font> </td>
    </tr>
    <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Maturity</td>
      <td width="80%" class="tdganjil" style="height: 25px">
    	 <asp:TextBox runat="server" id="txtMaturity1" Width="83px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp;<img src="../Images/iconcalendar.gif" width="20" height="20" align="top"> </font> 
         to  
         <asp:TextBox runat="server" id="txtMaturity2" Width="83px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp;<img src="../Images/iconcalendar.gif" width="20" height="20" align="top"> </font> 
        </td>
    </tr>
        <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Released Main Document</td>
      <td width="80%" class="tdganjil" style="height: 25px">
    	<asp:TextBox runat="server" id="txtReleased1" Width="83px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp;<img src="../Images/iconcalendar.gif" width="20" height="20" align="top"> </font> 
         to  
         <asp:TextBox runat="server" id="txtReleased2" Width="83px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp;<img src="../Images/iconcalendar.gif" width="20" height="20" align="top"> </font> 
        </td>
    </tr>
	<tr>
      <td width="20%" class="tdgenap" style="height: 25px">Last Date Follow Up</td>
      <td width="80%" class="tdganjil" style="height: 25px">
    	<asp:TextBox runat="server" id="txtFollowup" Width="83px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp;<img src="../Images/iconcalendar.gif" width="20" height="20" align="top"> </font> </td>
    </tr>
  <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Last Date Funding</td>
      <td width="80%" class="tdganjil" style="height: 25px">
 		 <asp:TextBox runat="server" id="txtLastFunding1" Width="83px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp;<img src="../Images/iconcalendar.gif" width="20" height="20" align="top"> </font> 
         to  
         <asp:TextBox runat="server" id="txtLastFunding2" Width="83px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp;<img src="../Images/iconcalendar.gif" width="20" height="20" align="top"> </font> 
        </td>
    </tr>
  <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Tenor</td>
      <td width="80%" class="tdganjil" style="height: 25px">
    	<asp:TextBox runat="server" id="txtTenor1" Width="66px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp; </font>Month 
         to  
         <asp:TextBox runat="server" id="txtTenor2" Width="83px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp; </font> Month
        </td>
    </tr>
   
   <tr>
      <td width="20%" class="tdgenap" style="height: 25px">NTF</td>
      <td width="80%" class="tdganjil" style="height: 25px">
    	<asp:TextBox runat="server" id="txtNtf1" Width="98px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red"></font>&nbsp;&nbsp; to  
         <asp:TextBox runat="server" id="txtNtf2" Width="103px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp;</font></td>
    </tr>
   
       <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Profession</td>
      <td width="80%" class="tdganjil" style="height: 25px">
		<asp:TextBox runat="server" id="TxtProfession" Width="104px" CssClass="inptype" TabIndex="1"></asp:TextBox>
		<font color="red">
		&nbsp;<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucProfession" runat="server" NavigateUrl="../../Lookup/EmployeeLookup.htm" Target="_blank"></asp:Hyperlink>
      </font> 
    </tr>
   
       <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Religion</td>
      <td width="80%" class="tdganjil" style="height: 25px">
		<asp:TextBox runat="server" id="TxtReligion" Width="104px" CssClass="inptype" TabIndex="1"></asp:TextBox>
		<font color="red">
		&nbsp;<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucReligion" runat="server" NavigateUrl="../../Lookup/EmployeeLookup.htm" Target="_blank"></asp:Hyperlink>
      </font> 
    </tr>
   <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Year Manufacturing</td>
      <td width="80%" class="tdganjil" style="height: 25px">
    	<asp:TextBox runat="server" id="txtYearManufacuring1" Width="98px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red"></font>&nbsp;&nbsp; to  
         <asp:TextBox runat="server" id="txtYearManufacuring2" Width="103px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp;</font></td>
    </tr>

   <tr>
      <td width="20%" class="tdgenap" style="height: 25px">% NTF</td>
      <td width="80%" class="tdganjil" style="height: 25px">
  		<asp:TextBox runat="server" id="txtPersenNTF1" Width="98px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red"></font>&nbsp;&nbsp; to  
         <asp:TextBox runat="server" id="txtPersenNTF2" Width="103px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp;</font></td>
    </tr>
    <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Product Type</td>
      <td width="80%" class="tdganjil" style="height: 25px">
        <asp:DropDownList ID="ddlSearchProduct" runat="server" Width="145px" Height="18px">
        <asp:ListItem Text="Select One" Value="SO"></asp:ListItem>
        <asp:ListItem Text="" ></asp:ListItem>
        <asp:ListItem Text="" ></asp:ListItem>
        </asp:dropdownlist>
    </tr>
    <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Asset Type</td>
      <td width="80%" class="tdganjil" style="height: 25px">
        <asp:DropDownList ID="ddlSearchAssetType" runat="server" Width="145px" Height="18px">
        <asp:ListItem Text="Select One" Value="SO"></asp:ListItem>
        <asp:ListItem Text="Mobil" ></asp:ListItem>
        <asp:ListItem Text="Motor" ></asp:ListItem>
        </asp:dropdownlist>
    </tr>

    <tr>
          <td width="20%" class="tdgenap" style="height: 25px">New/ Used&nbsp; Type</td>
          <td width="80%" class="tdganjil" style="height: 25px">
			<asp:RadioButtonlist runat="server" id="RdBtnListNewUsed" RepeatDirection="Horizontal">
			<asp:ListItem Text="New"></asp:ListItem>
			<asp:ListItem Text="Used"></asp:ListItem>
			<asp:ListItem Text="Both" Selected="True"></asp:ListItem>
			</asp:RadioButtonlist>
			
   	</tr>
   	<tr>
          <td width="20%" class="tdgenap" style="height: 25px">Conventional Type</td>
          <td width="80%" class="tdganjil" style="height: 25px">
			<asp:RadioButtonlist runat="server" id="RdBtnListConventionalType" RepeatDirection="Horizontal">
			<asp:ListItem Text="Conventional"></asp:ListItem>
			<asp:ListItem Text="Syariah"></asp:ListItem>
			<asp:ListItem Text="Both" Selected="True"></asp:ListItem>
			</asp:RadioButtonlist>

   	</tr>

    <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Floor Financing</td>
      <td width="80%" class="tdganjil" style="height: 25px">
	   <asp:RadioButtonlist runat="server" id="RdBtnListFloorFinancing" RepeatDirection="Horizontal">
			<asp:ListItem Text="Yes"></asp:ListItem>
			<asp:ListItem Text="No"></asp:ListItem>
			<asp:ListItem Text="Both" Selected="True"></asp:ListItem>
			</asp:RadioButtonlist>
			
      </td> 
    </tr>

    <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Age</td>
      <td width="80%" class="tdganjil" style="height: 25px">
  		<asp:TextBox runat="server" id="txtAge1" Width="98px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red"></font>&nbsp;&nbsp; to  
         <asp:TextBox runat="server" id="txtAge2" Width="103px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp;</font></td>
    </tr>
     <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Gender</td>
      <td width="80%" class="tdganjil" style="height: 25px">
		<asp:DropDownList runat="server" id="DropDownList2" Width="97px" Height="17px">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem>Female</asp:ListItem>
			<asp:ListItem>Male</asp:ListItem>
		</asp:DropDownList>
     </tr>
    <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Frequency RO</td>
      <td width="80%" class="tdganjil" style="height: 25px">
  		<asp:TextBox runat="server" id="txtFrequencyRO" Width="98px" CssClass="inptype" TabIndex="17"></asp:TextBox>
    </tr>
   <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Asset Collateral not in</td>
      <td width="80%" class="tdganjil" style="height: 25px">
		<asp:TextBox runat="server" id="TxtAsset" Width="226px" CssClass="inptype" TabIndex="1"></asp:TextBox>
		<font color="red">
		&nbsp;</font></tr>
  <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Frequency Past Due</td>
      <td width="80%" class="tdganjil" style="height: 25px">
  		<asp:TextBox runat="server" id="txtFrequencyPastDue1" Width="98px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red"></font>&nbsp;&nbsp; to  
         <asp:TextBox runat="server" id="txtFrequencyPastDue2" Width="103px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp;</font></td>
    </tr>
      <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Exposure</td>
      <td width="80%" class="tdganjil" style="height: 25px">
  		<asp:TextBox runat="server" id="txtExposure1" Width="98px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red"></font>&nbsp;&nbsp; to  
         <asp:TextBox runat="server" id="txtExposure2" Width="103px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp;</font></td>
    </tr>

  <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Maximum Outstanding Exposure</td>
      <td width="80%" class="tdganjil" style="height: 25px">
  		<asp:TextBox runat="server" id="txtMaxExposure1" Width="98px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red"></font>&nbsp;&nbsp; to  
         <asp:TextBox runat="server" id="txtMaxExposure2" Width="103px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp;</font></td>
    </tr>




    
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbSearchCriteria" imageurl="../../Images/ButtonSearch.gif" PostBackUrl="AssignDataBankInternal.aspx" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbResetCriteria" imageurl="../../Images/ButtonReset.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
