<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>

<html>
<head>
<title>Telesales Add</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head>
<body>
<form id="frmCustomerComplain" runat="server">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">TELE SALES - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
 
     <tr>
      <td class="tdgenap" width="20%">Tse ID</td>
      <td class="tdganjil" width="80%"> 
		<asp:Label runat="server" id="LblTseId" Text="xxxxxxxx50xxxxxxxx"></asp:label></td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Name</td>
      <td class="tdganjil" width="80%"> 
		<asp:Label runat="server" id="LblName" Text="xxxxxxxx50xxxxxxxx"></asp:label></td>
    	</tr>
       <tr> 
      <td class="tdgenap" width="20%">ID Type</td>
      <td class="tdganjil" width="80%"> 
		<asp:Label runat="server" id="LblIdType" Text="xxxxxxxx50xxxxxxxx"></asp:label></td>
		
     </tr>
     <tr> 
      <td class="tdgenap" width="20%">ID Number</td>
      <td class="tdganjil" width="80%"> 
		<asp:Label runat="server" id="LblIdNumber" Text="xxxxxxxx50xxxxxxxx"></asp:label></td>
	
    </tr>
     <tr> 
      <td class="tdgenap" width="20%">ID Expired Date</td>
      <td class="tdganjil" width="80%"> 
		<asp:TextBox runat="server" id="txtExpiredDate" Width="83px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp;<img src="../Images/iconcalendar.gif" width="20" height="20" align="top"> </font> </td>
    </tr>
      <tr> 
      <td class="tdgenap" width="20%">Tele Sales Position</td>
      <td class="tdganjil" width="80%"> 
		<asp:DropDownList runat="server" id="DropDownList3">
			<asp:ListItem Value="TSL">Tele Sales</asp:ListItem>
			<asp:ListItem Value="TSLSPV">Tele Sales Supervisor</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
     

      <tr>
      <td class="tdgenap" width="20%">Tele Sales Supervisor</td>
      <td class="tdganjil" width="80%"> 
		<asp:DropDownList runat="server" id="DropDownList1" TabIndex="30" Width="129px" Height="17px">
			<asp:ListItem Selected="True" Value="0">Select One</asp:ListItem>
			<asp:ListItem Value="Employee001">Employee 1</asp:ListItem>
			<asp:ListItem Value="Employee002">Employee 2</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
    <tr> 
          <td class="tdgenap" width="20%">Quota</td>
          <td class="tdganjil" width="80%">
			<asp:TextBox runat="server" id="TbsOsQuota" CssClass="inptype" Width="46px"></asp:TextBox>
			</td>
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
     <tr> 

     <tr> 
      <td colspan="2" class="tdjudulhijau">&nbsp;</td>

    
     
     <tr> 
      <td class="tdgenap" width="20%">Joined Date</td>
      <td class="tdganjil" width="80%">  
		<asp:TextBox runat="server" id="txtJoinDate" Width="83px" CssClass="inptype" TabIndex="40"></asp:TextBox>
        <font color="red">&nbsp;<img src="../Images/iconcalendar.gif" width="20" height="20" align="top"> *)</font> </td>
    </tr>
     <tr> 
      <td class="tdgenap" width="20%">Resigned Date</td>
      <td class="tdganjil" width="80%">  
		<asp:TextBox runat="server" id="txtResignDate" Width="83px" CssClass="inptype" TabIndex="41"></asp:TextBox>
        <font color="red">&nbsp;<img src="../Images/iconcalendar.gif" width="20" height="20" align="top"> </font> </td>
    </tr>
     <tr>
      <td class="tdgenap" width="20%">Active</td>
      <td class="tdganjil" width="80%"> 
		<asp:CheckBox runat="server" id="chkActive" Checked="True" TabIndex="50" Text="Yes" /></td>
    </tr>
    </table>
	<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
      <asp:ImageButton imageurl="../../Images/ButtonSave.gif" runat="server" ID="btnSaveTelesales"  PostBackUrl="Telesales.aspx"></asp:ImageButton>
       &nbsp;<asp:ImageButton imageurl="../../Images/ButtonCancel.gif" runat="server" ID="btnCancelTelesales" PostBackUrl="Telesales.aspx"></asp:ImageButton>
      </td>
    </tr>
  	</table>
    </div>
  <br>
</form>
</body>
</html>
