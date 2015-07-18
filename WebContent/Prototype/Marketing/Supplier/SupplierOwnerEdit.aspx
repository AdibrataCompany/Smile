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
<form id="FrmSupplierOwnerEdit" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3" class="style4"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER OWNER - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style1" style="width: 93%">Name</td>
      <td class="style3">
		<font color="red">
		<asp:TextBox runat="server" id="TbsName" Width="315px" CssClass="inptype">Silvia Tjandra</asp:TextBox>
		&nbsp; *)</font> </td>
    </tr>
    <tr> 
      <td class="style1" style="width: 93%">Title</td>
      <td class="style3"> 
		<asp:TextBox runat="server" id="TbsTitle" Width="200px" CssClass="inptype">Direktur Pemasaran</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 93%">Birth Place/ Date</td>
      <td class="style3">
		<asp:TextBox runat="server" id="TbsBirthPlace" Width="100px" CssClass="inptype">Jakarta</asp:TextBox>
		&nbsp; /&nbsp;
		<asp:TextBox runat="server" id="TbdDate" Width="100px" CssClass="inptype">dd/mm/yyyy</asp:TextBox>
		&nbsp;
		<asp:ImageButton runat="server" id="IcoCalender" ImageUrl="../../images/iconcalendar.gif" />
		</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 93%">NPWP</td>
      <td class="style3">
		<asp:TextBox runat="server" id="TbsNpwp" Width="200px" CssClass="inptype">xxxxxxxx30xxxxxxxx</asp:TextBox>
      </td>
    </tr>
    <tr> 
      <td class="style1" style="width: 93%">ID Type</td>
      <td class="style3">
		<asp:DropDownList runat="server" id="CmbIdType" CssClass="inptype">
			<asp:ListItem>Kartu Tanda Penduduk</asp:ListItem>
			<asp:ListItem>Paspor</asp:ListItem>
			<asp:ListItem>SIM</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 93%">ID Number</td>
      <td class="style3">
		<asp:TextBox runat="server" id="TbsSiup" Width="200px" CssClass="inptype">xxxxxxxx20xxxxxxxx</asp:TextBox>
&nbsp;</td>
    </tr>
    <tr> 
      <td colspan="2" class="style2">ADDRESS</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 93%">Address</td>
      <td class="tdganjil">
		<textarea name="TbsAddress" rows="5" class="inptype" style="width: 491px"></textarea></td>
    </tr>
    <tr> 
      <td class="style1" style="width: 93%">RT/RW</td>
      <td class="style3">
		<asp:TextBox runat="server" id="TbsRt" Width="50px" CssClass="inptype">999</asp:TextBox>
&nbsp;/ 
        <asp:TextBox runat="server" id="TbsRw" Width="50px" CssClass="inptype">999</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 93%">Kelurahan</td>
      <td class="style3">
		<asp:TextBox runat="server" id="TbsKelurahan" Width="200px" CssClass="inptype">
		</asp:TextBox>
&nbsp;</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 93%">Kecamatan</td>
      <td class="style3">
		<asp:TextBox runat="server" id="TbsKecamatan" Width="200px" CssClass="inptype">
		</asp:TextBox>
&nbsp;</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 93%">City</td>
      <td class="style3">
		<asp:TextBox runat="server" id="TbsCity" Width="200px" CssClass="inptype"></asp:TextBox>
&nbsp;</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 93%">Zip Code</td>
      <td class="style3">
		<asp:TextBox runat="server" id="TbsZipCode" Width="150px" CssClass="inptype"></asp:TextBox>
&nbsp;
		<font color="red"><asp:HyperLink runat="server" id="LinkZipCode" ImageUrl="../../images/IconDetail.gif" NavigateUrl="../../Setting/Organization/ZipCodeLookUp.aspx" Target="_blank" ToolTip="Untuk mengisi kolom Kelurahan, Kecamatan, City &amp; Zip Code">
		</asp:HyperLink>
		*)</font> </td>
    </tr>
    <tr> 
      <td class="style1" style="width: 93%">Phone 1</td>
      <td class="style3">
		<asp:TextBox runat="server" id="TbsAreaPhone1" Width="50px" CssClass="inptype">9999</asp:TextBox>
&nbsp;- 
        <asp:TextBox runat="server" id="TbsPhone1" Width="200px" CssClass="inptype">9999999999</asp:TextBox>
&nbsp;<font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="style1" style="width: 93%">Phone 2</td>
      <td class="style3">
		<asp:TextBox runat="server" id="TbsAreaPhone2" Width="50px" CssClass="inptype">9999</asp:TextBox>
&nbsp;- 
        <asp:TextBox runat="server" id="TbsPhone2" Width="200px" CssClass="inptype">9999999999</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 93%">Fax No.</td>
      <td class="style3">
		<asp:TextBox runat="server" id="TbsAreaFax" Width="50px" CssClass="inptype">9999</asp:TextBox>
&nbsp;- 
        <asp:TextBox runat="server" id="TbsFax" Width="200px" CssClass="inptype">9999999999</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 93%">Mobile Phone</td>
      <td class="style3">
		<asp:TextBox runat="server" id="TbsMobilePhone" Width="200px" CssClass="inptype">xxxxxxxx20xxxxxxxx</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 93%">E-Mail</td>
      <td class="style3">
		<asp:TextBox runat="server" id="TbsEmail" Width="200px" CssClass="inptype">xxxxxxxx30xxxxxxxx</asp:TextBox>
		</td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="SupplierOwner.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="SupplierOwner.aspx" />&nbsp; 
      </td>
    </tr>
  </table>
</div>
</form>
</body>

</html>
