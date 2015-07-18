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
<form id="FrmSupplierHoldingEdit" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3" class="style4"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER HOLDING - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    
    <tr> 
      <td class="style1" width="20%">Name</td>
      <td colspan="3" class="style3" width="80%">
		XXXXXXXXXXXX</td>
    </tr>
    
    <tr> 
      <td class="style1" width="20%">Business Name</td>
      <td colspan="3" class="style3" width="80%">
		<asp:TextBox runat="server" id="TbsInitialName" Width="200px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="style1" width="20%">NPWP</td>
      <td colspan="3" class="style3" width="80%">
		<asp:TextBox runat="server" id="TbsNpwp" Width="200px" CssClass="inptype"></asp:TextBox>
      </td>
    </tr>
    <tr> 
      <td class="style1"width="20%">TDP</td>
      <td colspan="3" class="style3" width="80%">
		<asp:TextBox runat="server" id="TbsTdp" Width="200px" CssClass="inptype"></asp:TextBox>
&nbsp;</td>
    </tr>
    <tr> 
      <td class="style1" width="20%">SIUP</td>
      <td colspan="3" class="style3" width="80%">
		<asp:TextBox runat="server" id="TbsSiup" Width="200px" CssClass="inptype"></asp:TextBox>
&nbsp;</td>
    </tr>
    
    
    <tr> 
      <td class="style1" width="20%">Is Active</td>
      <td colspan="3" class="style3" width="80%">
		 &nbsp;<asp:CheckBox runat="server" id="CbIsActive" Checked="True" /></td>
    </tr>
    <tr> 
      <td colspan="4" class="style2">ADDRESS</td>
    </tr>
    <tr> 
      <td class="style1" width="20%">Address</td>
      <td colspan="3" class="style3" width="80%">
		<textarea name="TbsAddress" rows="5" class="inptype" style="width: 491px"></textarea></td>
    </tr>
    <tr> 
      <td class="style1" width="20%">RT/RW</td>
      <td colspan="3" class="style3" width="80%">
		<asp:TextBox runat="server" id="TbsRt" Width="50px" CssClass="inptype"></asp:TextBox>
&nbsp;/ 
        <asp:TextBox runat="server" id="TbsRw" Width="50px" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="style1" width="20%">Kelurahan</td>
      <td colspan="3" class="style3" width="80%">
		<asp:TextBox runat="server" id="TbsKelurahan" Width="200px" CssClass="inptype">
		</asp:TextBox>
&nbsp;</td>
    </tr>
    <tr> 
      <td class="style1" width="20%">Kecamatan</td>
      <td colspan="3" class="style3" width="80%">
		<asp:TextBox runat="server" id="TbsKecamatan" Width="200px" CssClass="inptype">
		</asp:TextBox>
&nbsp;</td>
    </tr>
    <tr> 
      <td class="style1" width="20%">City</td>
      <td colspan="3" class="style3" width="80%">
		<asp:TextBox runat="server" id="TbsCity" Width="200px" CssClass="inptype"></asp:TextBox>
&nbsp;</td>
    </tr>
    <tr> 
      <td class="style1" width="20%">Zip Code</td>
      <td colspan="3" class="style3" width="80%">
		<asp:TextBox runat="server" id="TbsZipCode" Width="150px" CssClass="inptype"></asp:TextBox>
		&nbsp;
			<asp:HyperLink runat="server" id="LinkZipCode" ImageUrl="../../images/IconDetail.gif" NavigateUrl="../../Setting/Organization/ZipCodeLookUp.aspx" Target="_blank" ToolTip="Untuk mengisi kolom Kelurahan, Kecamatan, City &amp; Zip Code">
		</asp:HyperLink>
		&nbsp;<font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="style1" width="20%">Phone 1</td>
      <td colspan="3" class="style3" width="80%">
		<asp:TextBox runat="server" id="TbsAreaPhone1" Width="50px" CssClass="inptype">
		</asp:TextBox>
		&nbsp;- 
        <asp:TextBox runat="server" id="TbsPhone1" Width="200px" CssClass="inptype"></asp:TextBox>
		&nbsp;<font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="style1" width="20%">Phone 2</td>
      <td colspan="3" class="style3" width="80%">
		<asp:TextBox runat="server" id="TbsAreaPhone2" Width="50px" CssClass="inptype">
		</asp:TextBox>
		&nbsp;- 
        <asp:TextBox runat="server" id="TbsPhone2" Width="200px" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="style1" width="20%">Fax No.</td>
      <td colspan="3" class="style3" width="80%">
		<asp:TextBox runat="server" id="TbsAreaFax" Width="50px" CssClass="inptype"></asp:TextBox>
		&nbsp;- 
        <asp:TextBox runat="server" id="TbsFax" Width="200px" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td colspan="4" class="style2">CONTACT PERSON</td>
    </tr>
    <tr> 
      <td class="style1" width="20%">Name</td>
      <td colspan="3" class="style3" width="80%">
		<asp:TextBox runat="server" id="TbsContactPersonName" Width="315px" CssClass="inptype">
		</asp:TextBox>
		&nbsp;<font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="style1" width="20%">Job Title</td>
      <td colspan="3" class="style3" width="80%">
		<asp:TextBox runat="server" id="TbsContactPersonJobTitle" Width="315px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="style1" width="20%">Email</td>
      <td colspan="3" class="style3" width="80%">
		<asp:TextBox runat="server" id="TbsContactPersonEmail" Width="315px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="style1" width="20%">Mobile Phone</td>
      <td colspan="3" class="style3" width="80%">
		<asp:TextBox runat="server" id="TbsContactPersonHp" Width="315px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
   
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="SupplierHolding.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="SupplierHolding.aspx" />&nbsp; 
      </td>
    </tr>
  </table>
  
</div>
</form>
</body>

</html>
