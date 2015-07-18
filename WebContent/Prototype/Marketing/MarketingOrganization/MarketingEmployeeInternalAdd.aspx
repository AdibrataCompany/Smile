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
	text-align: center;
}
</style>
</head>
<body>
<form id="frmMarketingEmployeeInternalAdd" runat="server">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field<br>
		</i>lookup supervisor ke table marketing yang internal saja dan aktif<br>
		Function di filter berdasarkan internal </font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">MARKETING EMPLOYEE INTERNAL - ADD</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
      <tr> 
         <td width="20%" class="tdgenap" >Branch</td>
      	 <td width="80%" class="tdganjil" >
	    	<asp:DropDownList ID="ddlSearchBranch" runat="server" Width="146px" Height="16px" >
      			<asp:ListItem Text="Select one" Value="SE"></asp:ListItem>
      	 		<asp:ListItem Text="Bandung" Value="803"></asp:ListItem>
     			<asp:ListItem Text="Jakarta" Value="804"></asp:ListItem>
			</asp:dropdownlist>
         </td>
   </tr>

   <tr> 
      <td class="tdgenap" width="20%">Employee Id</td>
      <td class="tdganjil" width="80%">
      		<asp:TextBox runat="server" ID="TxtEmployeeid" CssClass="inptype"></asp:TextBox>
			<a href="javascript:;" onClick="MM_openBrWindow('../../Lookup/MarketingLookup.aspx','ZipCode','scrollbars=yes,width=900,height=500,left=0,top=0')">
    		&nbsp;<img src="../../Images/IconDetail.gif" width="15" height="15" align="absmiddle" border="0"></a> 
  		</td>
     </tr>
     <tr> 
 	     <td class="tdgenap" width="20%">Name</td>
 	     <td class="tdganjil" width="80%">
  		  xxxxx50xxxxx
  		  </td>
     </tr>
    <tr> 
      <td class="tdgenap" width="20%">ID Type</td>
      <td class="tdganjil" width="80%">
	      <asp:DropDownList ID="ddlSearchIDType" runat="server" Height="16px" Width="142px">
          <asp:ListItem Text="Select one" Value="SO"></asp:ListItem>
          <asp:ListItem Text="KTP" Value="KTP"></asp:ListItem>
          <asp:ListItem Text="SIM" Value="SIM"></asp:ListItem>
	      </asp:dropdownlist>
	      <font color="red">*)</font> 
	  </td>          
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">ID Number</td>
      <td class="tdganjil" width="80%">
        <asp:TextBox runat="server" ID="TxtIDNumber" CssClass="inptype"></asp:TextBox>
        <font color="red">*)</font> </td>
    </tr>
     <tr> 
      <td class="tdgenap" width="20%">ID Expired Date</td>
      <td class="tdganjil" width="80%"> 
		<asp:TextBox runat="server" id="txtExpiredDate" Width="123px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp;<img src="../Images/iconcalendar.gif" width="20" height="20" align="top"> </font> </td>
    </tr>

    <tr> 
      <td class="tdgenap" width="20%">NIK</td>
      <td class="tdganjil" width="80%">
		<asp:TextBox runat="server" id="TxtNik" Width="123px" CssClass="inptype" ></asp:TextBox></td>
    </tr>
    
    <tr>
      <td class="tdgenap" width="20%">Position</td>
      <td class="tdganjil" width="80%">
      	  <asp:DropDownList ID="ddlSearchPosition" runat="server" Height="21px" Width="186px">
          <asp:ListItem Text="Select one" Value="SO"></asp:ListItem>
          <asp:ListItem Text="Team Leader" Value="TL"></asp:ListItem>
          <asp:ListItem Text="Product Head" Value="KP"></asp:ListItem>
          <asp:ListItem Text="Sales Head" Value="SH"></asp:ListItem>
          <asp:ListItem Text="Koodinator Mitra Business" Value="KMB"></asp:ListItem>
		  <asp:ListItem Text="Marketing Business Analyst" Value="MBA"></asp:ListItem>
          </asp:dropdownlist>
     </tr>
    
     <tr>
       <td width="20%" class="tdgenap">Function</td>
        <td width="80%" class="tdganjil">
          <asp:DropDownList ID="ddlSearchFunction" runat="server" Height="18px" Width="96px">
          <asp:ListItem Text="Select one" Value="SO"></asp:ListItem>
          <asp:ListItem Text="BRE" Value="BRE"></asp:ListItem>
          <asp:ListItem Text="CS" Value="CS"></asp:ListItem>
	      <asp:ListItem Text="ME" Value="ME"></asp:ListItem>
          <asp:ListItem Text="TSE" Value="TSE"></asp:ListItem>
          </asp:dropdownlist>
       </td>
     </tr>
     <tr>
      <td class="tdgenap" width="20%">Grade</td>
      <td class="tdganjil" width="80%">
      	  <asp:DropDownList ID="ddlSearchGrade" runat="server" Height="17px" Width="109px">
          <asp:ListItem Text="Select one" Value="SO"></asp:ListItem>
          <asp:ListItem Text="A1" Value="A1"></asp:ListItem>
          </asp:dropdownlist><font color="red">*)</font>
     </tr>
      <tr> 
      <td class="tdgenap" width="20%">Supervisor</td>
      <td class="tdganjil" width="80%">
	      <asp:TextBox runat="server" id="txtSupervisor" Width="123px" CssClass="inptype" TabIndex="17"></asp:TextBox>
          <a href="javascript:;" onClick="MM_openBrWindow('../../Lookup/MarketingLookup.aspx','ZipCode','scrollbars=yes,width=900,height=500,left=0,top=0')">
           &nbsp;<img src="../../Images/IconDetail.gif" width="15" height="15" align="absmiddle" border="0"></a> 
        &nbsp; <label id="LabelNamaEmployee"></label>Nama Supervisor</td>
     </tr>
    <tr> 
        <td colspan="2" class="tdjudulhijau">ADDRESS <font color="red">*)</font> 
        </td>
    </tr>
    <tr> 
          <td class="tdgenap" width="20%">Address</td>
          <td class="tdganjil" width="80%">xxxxxxxx100xxxxxxxx</td>
    </tr>
        <tr> 
          <td class="tdgenap" width="20%">RT / RW</td>
          <td class="tdganjil" width="80%">999 / 999</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">Kelurahan</td>
          <td class="tdganjil" width="80%">xxxxxxxx30xxxxxxxx</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">Kecamatan</td>
          <td class="tdganjil" width="80%">xxxxxxxx30xxxxxxxx</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">City</td>
          <td class="tdganjil" width="80%">xxxxxxxx30xxxxxxxx</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">Zip Code</td>
          <td class="tdganjil" width="80%">99999</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">Phone 1</td>
          <td class="tdganjil" width="80%">999 - 99999999</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">Phone 2</td>
          <td class="tdganjil" width="80%">999 - 99999999</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">Fax</td>
          <td class="tdganjil" width="80%">999 - 99999999</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">Email</td>
          <td class="tdganjil" width="80%">xxxxxxxx100xxxxxxxx</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">Mobile Phone</td>
          <td class="tdganjil" width="80%">9999 - 99999999</td>
        </tr>

		<td colspan="2" class="style1">  </td>
   
    <tr>
      <td class="tdgenap" width="20%">Is Active</td>
      <td class="tdganjil" width="80%">
        <asp:CheckBox runat="server" ID="ChbxActive" Text="Yes"></asp:CheckBox>	
        </td>
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
  <br>
</div>
</form>
</body>
</html>
