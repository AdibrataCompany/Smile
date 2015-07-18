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
	background-color: #FEE8E0;
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
<form id="FrmBranchAdd" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3" class="style4"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiorangekiri">&nbsp;</td>
      <td align="center" class="tdtopiorange">BRANCH - EDIT</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="150" class="style1">Branch ID</td>
          <td class="style3">
			A03</td>
        </tr>
        <tr> 
          <td class="style1">Branch Full Name</td>
          <td class="style3">
			<asp:TextBox runat="server" id="TbsBranchFullName" Width="315px" CssClass="inptype">Grand Wijaya</asp:TextBox>
&nbsp;<font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="style1">Branch Initial Name</td>
          <td class="style3"><font color="red">
			<asp:TextBox runat="server" id="TbsBranchInitialName" CssClass="inptype">GRW</asp:TextBox>
			*)</font> </td>
        </tr>
        <tr> 
          <td class="style1">Company</td>
          <td class="style3">
			<asp:DropDownList runat="server" id="CmbCompany" Width="150px" CssClass="inptype">
				<asp:ListItem>PT. XXXXX</asp:ListItem>
				<asp:ListItem>Select One</asp:ListItem>
			</asp:DropDownList>
&nbsp;<font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="style1">Area</td>
          <td class="style3"><font color="red">
			<asp:DropDownList runat="server" id="CmbArea" Width="150px" CssClass="inptype">
				<asp:ListItem>Jawa</asp:ListItem>
				<asp:ListItem>Select One</asp:ListItem>
				<asp:ListItem>Sumatra</asp:ListItem>
				<asp:ListItem>Bali</asp:ListItem>
				<asp:ListItem>Kalimantan</asp:ListItem>
				<asp:ListItem>Sulawesi</asp:ListItem>
			</asp:DropDownList>
			*)</font></td>
        </tr>
        <tr> 
          <td colspan="2" class="style2"><strong>Address</strong></td>
        </tr>
        <tr> 
          <td class="style1">Address</td>
          <td class="style3"><textarea name="textfield342" cols="50" rows="5" class="inptype">Wijaya Graha Puri Blok F3,
Jl. Wijaya 3</textarea> 
            <font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="style1">RT/RW</td>
          <td class="style3"><font face="Tahoma, Verdana" size="2"> 
            <asp:TextBox runat="server" id="TbsRt" Width="30px" CssClass="inptype">07</asp:TextBox>
&nbsp;</font>/ <font face="Tahoma, Verdana" size="2"> 
            &nbsp;
			<asp:TextBox runat="server" id="TbsRw" Width="30px" CssClass="inptype">010</asp:TextBox>
            </font></td>
        </tr>
        <tr> 
          <td class="style1">Kelurahan</td>
          <td class="style3">
			<asp:TextBox runat="server" id="TbsKelurahan" CssClass="inptype">Melawai</asp:TextBox>
&nbsp;<font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="style1">Kecamatan</td>
          <td class="style3">
			<asp:TextBox runat="server" id="TbsKecamatan" CssClass="inptype">Kebayoran Baru</asp:TextBox>
&nbsp;<font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="style1">City</td>
          <td class="style3">
			<asp:TextBox runat="server" id="TbsCity" CssClass="inptype">Jakarta Selatan</asp:TextBox>
&nbsp;<font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="style1">Zip Code</td>
          <td class="style3">
			<asp:TextBox runat="server" id="TbsZipCode" CssClass="inptype">12160</asp:TextBox>
&nbsp;<asp:HyperLink runat="server" id="LinkZipCode" ImageUrl="../../images/IconDetail.gif" NavigateUrl="ZipCodeLookUp.aspx" Target="_blank">
			</asp:HyperLink>
&nbsp;<font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="style1">Phone 1</td>
          <td class="style3">
			<asp:TextBox runat="server" id="TbsAreaPhone1" Width="65px" CssClass="inptype">021</asp:TextBox>
&nbsp;-&nbsp;
			<asp:TextBox runat="server" id="TbsPhone1" CssClass="inptype">7250667</asp:TextBox>
			<font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="style1">Phone 2</td>
          <td class="style3">
			<asp:TextBox runat="server" id="TbsAreaPhone2" Width="65px" CssClass="inptype">
			</asp:TextBox>
&nbsp;-&nbsp;
			<asp:TextBox runat="server" id="TbsPhone2" CssClass="inptype"></asp:TextBox>
			</td>
        </tr>
        <tr> 
          <td class="style1">Fax</td>
          <td class="style3">
			<asp:TextBox runat="server" id="TbsAreaFax" Width="65px" CssClass="inptype">021</asp:TextBox>
&nbsp;-&nbsp;
			<asp:TextBox runat="server" id="TbsFax" CssClass="inptype">7202958</asp:TextBox>
			</td>
        </tr>
        <tr> 
          <td colspan="2" class="style2"><strong>Contact Person</strong></td>
        </tr>
        <tr> 
          <td class="style1">Name</td>
          <td class="style3"><font color="red">
			<asp:TextBox runat="server" id="TbsContactPersonName" Width="315px" CssClass="inptype">Isabel Lay</asp:TextBox>
			*)</font> </td>
        </tr>
        <tr> 
          <td class="style1">Job Title</td>
          <td class="style3"> 
            <font color="red">
			<asp:TextBox runat="server" id="TbsContactPersonJobTitle" Width="250px" CssClass="inptype">Business Relation</asp:TextBox>
			</font> </td>
        </tr>
        <tr> 
          <td class="style1">Email</td>
          <td class="style3"> 
            <font color="red">
			<asp:TextBox runat="server" id="TbsContactPersonEmail" Width="250px" CssClass="inptype">Isabel@yahoo.com</asp:TextBox>
			</font> </td>
        </tr>
        <tr> 
          <td class="style1">Mobile Phone</td>
          <td class="style3"> 
            <font color="red">
			<asp:TextBox runat="server" id="TbsContactPersonHP" Width="200px" CssClass="inptype">0811101010</asp:TextBox>
			</font> </td>
        </tr>
        <tr> 
          <td colspan="2" class="style2">Branch Data</td>
        </tr>
        <tr> 
          <td class="style1">Branch Manager</td>
          <td class="style3"> 
            <font color="red">
			<asp:TextBox runat="server" id="TbsBranchManagerName" Width="315px" CssClass="inptype">Guntur Gozali</asp:TextBox>
			</font> </td>
        </tr>
        <tr> 
          <td class="style1">ADH</td>
          <td class="style3"> 
            <font color="red">
			<asp:TextBox runat="server" id="TbsAdhName" Width="315px" CssClass="inptype">Kastoto</asp:TextBox>
			</font> </td>
        </tr>
        <tr> 
          <td class="style1">PIC for Legal Dept</td>
          <td class="style3"> 
            <font color="red">
			<asp:TextBox runat="server" id="TbsPICLegalDept" Width="315px" CssClass="inptype">Ivan Gozali</asp:TextBox>
			</font> </td>
        </tr>
        <tr> 
          <td class="style1">AR Control Name</td>
          <td class="style3"> 
            <font color="red">
			<asp:TextBox runat="server" id="TbsArControlName" Width="315px" CssClass="inptype">Chandra Kirana</asp:TextBox>
			</font> </td>
        </tr>
        <tr> 
          <td class="style1">Asset Doc Custodian Name</td>
          <td class="style3"> 
            <font color="red">
			<asp:TextBox runat="server" id="TbsAsset" Width="315px" CssClass="inptype">Maria Karmelinda Asten</asp:TextBox>
			</font> </td>
        </tr>
        <tr> 
          <td class="style1">Branch Status</td>
          <td class="style3"> 
			<asp:DropDownList runat="server" id="CmbBranchStatus" CssClass="inptype">
				<asp:ListItem>Large</asp:ListItem>
				<asp:ListItem>Medium</asp:ListItem>
				<asp:ListItem>Small</asp:ListItem>
				<asp:ListItem>Sub Branch</asp:ListItem>
			</asp:DropDownList>
			</td>
        </tr>
        <tr> 
          <td class="style1">Productivity Value</td>
          <td class="style3"> 
            <font color="red">
			<asp:TextBox runat="server" id="TbnProductivityValue" Width="150px" CssClass="inptype">200</asp:TextBox>
			</font> &nbsp;Target Unit/AO/Bulan</td>
        </tr>
        <tr> 
          <td class="style1">Productivity Collection</td>
          <td class="style3"> 
            <font color="red">
			<asp:TextBox runat="server" id="TbnProductivityCollection" Width="150px" CssClass="inptype">100</asp:TextBox>
			</font> </td>
        </tr>
        <tr> 
          <td class="style1">#of employee</td>
          <td class="style3"> 
            <font color="red">
			<asp:TextBox runat="server" id="TbnNumberOfEmployee" Width="150px" CssClass="inptype">50</asp:TextBox>
			</font> </td>
        </tr>
        <tr> 
          <td class="style2" colspan="2">Branch Bank Account</td>
        </tr>
        <tr> 
          <td class="style1">Bank Name</td>
          <td class="style3"> 
            <font color="red">
			<asp:TextBox runat="server" id="TbsBankAccountName" Width="315px" CssClass="inptype">BCA</asp:TextBox>
			</font> </td>
        </tr>
        <tr> 
          <td class="style1">Account Name</td>
          <td class="style3"> 
            <font color="red">
			<asp:TextBox runat="server" id="TbsAccountName" Width="315px" CssClass="inptype">Guntur Gozali</asp:TextBox>
			</font> </td>
        </tr>
        <tr> 
          <td class="style1">Account No</td>
          <td class="style3"> 
            <font color="red">
			<asp:TextBox runat="server" id="TbsAccountNo" Width="315px" CssClass="inptype">0353123456</asp:TextBox>
			</font> </td>
        </tr>
      </table>
    </div>
    
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnAdd" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="Branch.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnAdd0" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="Branch.aspx" /></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
