<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
<style type="text/css">
.style1 {
	background-color: #F4F4DF;
	font-weight: bold;
	font-size: 10px;
	text-align: left;
}
</style>
</head>
<body>
<form id="frmMarketingEmployeeExternalAdd" runat="server">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
       <td colspan="3"><font color="red"><i>*) required field<br>
		</i>lookup supervisor ke table marketing yang External saja dan aktif<br>
		Function di filter berdasarkan external</font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">MARKETING EMPLOYEE EXTERNAL - ADD</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
     
    <tr> 
      <td width="20%" class="tdgenap">Branch</td>
      <td width="80%" class="tdganjil">
	      <asp:DropDownList ID="ddlSearchBranch" runat="server" Width="145px" Height="18px">
		      <asp:ListItem Text="Select one" Value="SE"></asp:ListItem>		
		      <asp:ListItem Text="Bandung" Value="803"></asp:ListItem>
		      <asp:ListItem Text="Jakarta" Value="804"></asp:ListItem>
	      </asp:dropdownlist>
      </td>
   </tr>

  
   <tr>
      <td width="20%" class="tdgenap">Name</td>
      <td width="80%" class="tdganjil" > 
        <asp:TextBox runat="server" ID="TxtName" CssClass="inptype"></asp:TextBox>
        <font color="red">*)</font> </td>
    </tr>
    
   

     <tr> 
      <td class="tdgenap" width="20%">ID Type</td>
      <td class="tdganjil" width="80%">
	      <asp:DropDownList ID="ddlSearchIDType" runat="server" Height="16px" Width="142px">
          <asp:ListItem Text="Select one" Value="SO"></asp:ListItem>
          <asp:ListItem Text="KTP" Value="KTP"></asp:ListItem>
          <asp:ListItem Text="SIM" Value="SIM"></asp:ListItem>
	      </asp:dropdownlist>
	  </td>          
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">ID Number</td>
      <td class="tdganjil" width="80%">
	       <asp:TextBox runat="server" ID="TxtIdNumber" CssClass="inptype"></asp:TextBox>
          <font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">ID Expired Date</td>
      <td class="tdganjil" width="80%"> 
		<asp:TextBox runat="server" id="txtExpiredDate" Width="83px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp;<img src="../Images/iconcalendar.gif" width="20" height="20" align="top"> </font> </td>
    </tr>
     <tr> 
      <td class="tdgenap" width="20%">Birth Place / Date</td>
      <td class="tdganjil" width="80%">
       <asp:TextBox runat="server" ID="TxtBirthPlace" CssClass="inptype"></asp:TextBox> / 
         <asp:TextBox runat="server" ID="Txtbirthdate" CssClass="inptype"></asp:TextBox> 
         &nbsp;<img src="../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"> 
        <font color="red">*)</font> </td>
    </tr>
     <tr> 
      <td class="tdgenap" width="20%">Marital Status</td>
      <td class="tdganjil" width="80%"> 
      	<asp:DropDownList runat="server" ID="DDLMartialStatus" Width="113px" Height="16px">
      			<asp:ListItem Text="Select One"></asp:ListItem>
      	</asp:DropDownList>	
        <font color="red">*)</font> </td>
    </tr>
     <tr> 
      <td class="tdgenap" width="20%">Spouse Name</td>
      <td class="tdganjil" width="80%">
      		<asp:TextBox runat="server" id="txtSpouseName" Width="125px" CssClass="inptype" TabIndex="17"></asp:TextBox>
	 </td>
	  <tr> 
      <td class="tdgenap" width="20%">Group</td>
      <td class="tdganjil" width="80%"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield3232" type="text" class="inptype" size="15" style="width: 179px">&nbsp; </font></td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Level</td>
      <td class="tdganjil" width="80%">
     	<asp:TextBox runat="server" id="TbxLevel" CssClass="inptype"></asp:TextBox>
        <a href="javascript:;" onClick="MM_openBrWindow('../Lookup/MarketingEmployeeLookup.htm','ZipCode','scrollbars=yes,width=900,height=500,left=0,top=0')">
		<img src="../../Images/IconDetail.gif" width="15" height="15" align="absmiddle" border="0"></a> 
		</td>
    </tr>
       <tr> 
      <td class="tdgenap" width="20%">Last Change Level Date</td>
      <td class="tdganjil" width="80%">
	      <asp:TextBox runat="server" id="TbxLastChangeLevel" CssClass="inptype"></asp:TextBox>
		 <img src="../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"> 
        <font color="red">*)</font> </td>
    </tr>
    <tr>
       <td width="20%" class="tdgenap">Function</td>
        <td width="80%" class="tdganjil">
          <asp:DropDownList ID="ddlSearchFunction" runat="server" Height="18px" Width="124px">
          	<asp:ListItem Text="Select one" ></asp:ListItem>
          	<asp:ListItem Text="BA" ></asp:ListItem>
          </asp:dropdownlist>
       </td>
     </tr>

 <tr> 
      <td class="tdgenap" width="20%">Up Line</td>
      <td class="tdganjil" width="80%"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield3232" type="text" class="inptype" size="15" style="width: 124px">
        <a href="javascript:;" onClick="MM_openBrWindow('../Lookup/MarketingEmployeeLookup.htm','ZipCode','scrollbars=yes,width=900,height=500,left=0,top=0')">
		<img src="../../Images/IconDetail.gif" width="15" height="15" align="absmiddle" border="0"></a> 
		Up Line Name</font></td>
    </tr>
  <tr> 
      <td class="tdgenap" width="20%">Supervisor</td>
      <td class="tdganjil" width="80%"><font face="Tahoma, Verdana" size="2"> 
	      <asp:TextBox runat="server" id="TbxSupervisor" CssClass="inptype"></asp:TextBox>
         <a href="javascript:;" onClick="MM_openBrWindow('../Lookup/ZipCodeLookup.htm','ZipCode','scrollbars=yes,width=900,height=500,left=0,top=0')">
		<img src="../../Images/IconDetail.gif" width="15" height="15" align="absmiddle" border="0"></a> 
         </font><label id="LabelNamaEmployee">SuperVisor Name</label></td>
     </tr>

    
    
    <tr> 
      <td colspan="2" class="tdjudulhijau">ADDRESS <font color="red">*)</font> 
      </td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap" width="20%">Address</td>
      <td class="tdganjil" width="80%"> 
      		<textarea name="textfield342" cols="50" rows="5" class="inptype"></textarea></td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">RT/RW</td>
      <td class="tdganjil" width="80%">
       <asp:TextBox runat="server" id="txtRt" Width="48px" CssClass="inptype" ></asp:TextBox>
       
      	/ 
      <asp:TextBox runat="server" id="txtRw" Width="48px" CssClass="inptype" ></asp:TextBox>
        </td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Kelurahan</td>
      <td class="tdganjil" width="80%">
      	<asp:TextBox runat="server" id="txtKelurahan" Width="125px" CssClass="inptype" ></asp:TextBox>
    	</td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Kecamatan</td>
      <td class="tdganjil" width="80%">
		<asp:TextBox runat="server" id="txtKecamatan" Width="125px" CssClass="inptype" ></asp:TextBox>
	  </td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">City</td>
      <td class="tdganjil" width="80%">
         <asp:TextBox runat="server" id="txtCity" Width="125px" CssClass="inptype"></asp:TextBox></td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Zip Code</td>
      <td class="tdganjil" width="80%">
      <asp:TextBox runat="server" id="txtZipCode" Width="125px" CssClass="inptype" ></asp:TextBox>
        <a href="javascript:;" onClick="MM_openBrWindow('../../Lookup/ZipCodeLookup.htm','ZipCode','scrollbars=yes,width=900,height=500,left=0,top=0')">
		<img src="../../Images/IconDetail.gif" width="15" height="15" align="absmiddle" border="0"></a> 
		</td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Phone 1</td>
      <td class="tdganjil" width="80%">
      <asp:TextBox runat="server" id="txtPhone1a" Width="64px" CssClass="inptype"></asp:TextBox>
       &nbsp; -
	  <asp:TextBox runat="server" id="txtPhone1b" Width="97px" CssClass="inptype" ></asp:TextBox>
        </td>
    </tr>
   <tr> 
      <td class="tdgenap" width="20%">Phone 2</td>
      <td class="tdganjil" width="80%">
      <asp:TextBox runat="server" id="txtPhone2a" Width="64px" CssClass="inptype"></asp:TextBox>
       &nbsp; -
	  <asp:TextBox runat="server" id="txtPhone2b" Width="97px" CssClass="inptype" ></asp:TextBox>
        </td>
    </tr>
  <tr> 
      <td class="tdgenap" width="20%">Fax</td>
      <td class="tdganjil" width="80%">
      <asp:TextBox runat="server" id="txtFax1" Width="64px" CssClass="inptype"></asp:TextBox>
       &nbsp; - 
	  <asp:TextBox runat="server" id="txtFax2" Width="97px" CssClass="inptype" ></asp:TextBox>
        </td>
    </tr>
         
          <tr> 
          <td class="tdgenap" width="20%">Email</td>
          <td class="tdganjil" width="80%">
			<asp:TextBox runat="server" id="TbsEmail" CssClass="inptype"></asp:TextBox>
			</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">Mobile Phone</td>
          <td class="tdganjil" width="80%">
			<asp:TextBox runat="server" id="TbsMobilePhone" CssClass="inptype"></asp:TextBox>
			</td>
        </tr>
    <tr> 
      <td colspan="2" class="tdjudulhijau"> &nbsp;
      </td>
    </tr>
  
   
    <tr> 
      <td class="tdgenap" width="20%">Join Date</td>
      <td class="tdganjil" width="80%">
        <input name="textfield332" type="text" class="inptype" size="20"> <img src="../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"> 
        <font color="red">*)</font> </td>
    </tr>
    
    <tr> 
      <td class="tdgenap" width="20%">Termination Date</td>
      <td class="tdganjil" width="80%">
        <input name="textfield332" type="text" class="inptype" size="20"> <img src="../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"> </td>
    </tr>

      <tr>
      <td class="tdgenap" width="20%">Is Active</td>
      <td colspan="3" class="tdganjil" width="80%">
		<input type="checkbox" name="checkbox1" value="checkbox">Yes</td>
    </tr>
    
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau"> FAMILY DATA</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr class="tdjudulhijau"> 
      <td width="5%" align="center">No</td>
      <td width="30%" align="center">NAME</td>
      <td width="20%" align="center">ID NUMBER</td>
      <td width="20%" align="center">BIRTH DATE</td>
      <td width="20%" align="center">RELATIONSHIP</td>
      <td width="5%" align="center">DELETE</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center">99</td>
      <td><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield323234442232322" type="text" class="inptype" size="30">
        </font></td>
      <td> <font face="Tahoma, Verdana" size="2">
        <input name="textfield323234442232323" type="text" class="inptype" size="15">
        </font></td>
      <td> <font face="Tahoma, Verdana" size="2"> 
        <input name="textfield323234442232324" type="text" class="inptype" size="15">
        <img src="../Images/iconcalendar.gif" width="20" height="20"> </font></td>
      <td align="center"><select name="select14">
          <option selected>Select One</option>
        </select></td>
      <td align="center"><img src="../../Images/IconDelete.gif" width="16" height="16" align="absmiddle"></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td height="30" colspan="2" align="left"><img src="../../Images/ButtonAdd.gif" width="100" height="20"></td>
    </tr>

  </table>
  
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" align="left">
		&nbsp;</td>
	  <td width="50%" align="right">&nbsp;
	  <asp:ImageButton id="imbSaveExit" imageurl="../../Images/ButtonSave.gif" runat="server" PostBackUrl="Marketing.aspx"></asp:ImageButton>
	  &nbsp;<asp:ImageButton id="imbCancel" imageurl="../../Images/ButtonCancel.gif" runat="server" PostBackUrl="Marketing.aspx"></asp:ImageButton>
      </td>
    </tr>
  </table>
 
</div>
</form>
</body>
</html>
