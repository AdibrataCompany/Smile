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
	background-color: #F4F4DF;
	font-weight: bold;
	font-size: 10px;
	text-align: left;
}
.style3 {
	background-color: #FFFFFF;
	text-align: left;
}
.style4 {
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmSupplierEmployeeAdd" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3" class="style4"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER EMPLOYEE - ADD</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style1" style="width: 25%">Employee Name</td>
      <td class="style3">
		<font color="red">
		<asp:TextBox runat="server" id="TbsEmployeeName" Width="315px" CssClass="inptype">
		</asp:TextBox>
		&nbsp; *)</font> </td>
    </tr>
    <tr> 
      <td class="style1" style="width: 25%">Position</td>
      <td class="style3">
		<asp:DropDownList runat="server" id="CmbPosition" CssClass="inptype">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem>General Manager</asp:ListItem>
			<asp:ListItem>Branch Manager</asp:ListItem>			
			<asp:ListItem>Administration Head</asp:ListItem>
			<asp:ListItem>Sales Supervisor</asp:ListItem>
			<asp:ListItem>Sales Person</asp:ListItem>
			<asp:ListItem>Supplier Admin</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 25%">Is Active</td>
      <td class="style3">
		<asp:CheckBox runat="server" id="CbIsActive" Checked="True" />
		</td>
    </tr>
    <tr>
      <td class="style2" colspan="2"><strong>ADDRESS</strong></td>
      </tr>
	<tr>
      <td class="style1" style="width: 51%">Address</td>
      <td class="tdganjil">
		<textarea name="TbsAddress" rows="5" class="inptype" style="width: 491px" cols="20"></textarea></td>
    </tr>
	<tr>
      <td class="style1" style="width: 51%">RT/RW</td>
      <td class="style3">
		<asp:TextBox runat="server" id="TbsRt" Width="50px" CssClass="inptype"></asp:TextBox>
		&nbsp;/ 
        <asp:TextBox runat="server" id="TbsRw" Width="50px" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
	<tr>
      <td class="style1" style="width: 51%">Kelurahan</td>
      <td class="style3">
		<asp:TextBox runat="server" id="TbsKelurahan" Width="200px" CssClass="inptype">
		</asp:TextBox>
		&nbsp;</td>
    </tr>
	<tr>
      <td class="style1" style="width: 51%">Kecamatan</td>
      <td class="style3">
		<asp:TextBox runat="server" id="TbsKecamatan" Width="200px" CssClass="inptype">
		</asp:TextBox>
		&nbsp;</td>
    </tr>
	<tr>
      <td class="style1" style="width: 51%">City</td>
      <td class="style3">
		<asp:TextBox runat="server" id="TbsCity" Width="200px" CssClass="inptype"></asp:TextBox>
		&nbsp;</td>
    </tr>
	<tr>
      <td class="style1" style="width: 51%">Zip Code</td>
      <td class="style3">
		<asp:TextBox runat="server" id="TbsZipCode" Width="150px" CssClass="inptype"></asp:TextBox>
		&nbsp;
		<font color="red"><asp:HyperLink runat="server" id="LinkZipCode" ImageUrl="../../images/IconDetail.gif" NavigateUrl="../../Setting/Organization/ZipCodeLookUp.aspx" Target="_blank" ToolTip="Untuk mengisi kolom Kelurahan, Kecamatan, City &amp; Zip Code">
		</asp:HyperLink>
		*)</font> </td>
    </tr>
    <tr> 
      <td colspan="2" class="style2">BANK ACCOUNT</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 25%">Bank Name</td>
      <td class="style3">
		<asp:TextBox runat="server" id="TbsBankName" Width="150px" CssClass="inptype"></asp:TextBox>
&nbsp;
		<asp:HyperLink runat="server" id="LinkDetail" ImageUrl="../../images/IconDetail.gif" NavigateUrl="../../Setting/General/BankMasterLookUp.aspx" Target="_blank">
		</asp:HyperLink>
		&nbsp;</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 25%">Bank Branch</td>
      <td class="style3">
        <asp:TextBox runat="server" id="TbsBankBranch" Width="200px" CssClass="inptype"></asp:TextBox>
&nbsp;</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 25%">Account No</td>
      <td class="style3">
        <asp:TextBox runat="server" id="TbsAccountNo" Width="200px" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 25%">Account Name</td>
      <td class="style3">
        <asp:TextBox runat="server" id="TbsAccountName" Width="200px" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="SupplierEmployee.aspx" />&nbsp; 
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="SupplierEmployee.aspx" />&nbsp; 
      </td>
    </tr>
  </table>
</div>
</form>
</body>

</html>
