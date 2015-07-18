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
<form id="FrmBranchEmployeeAdd" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3" class="style4"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiorangekiri">&nbsp;</td>
      <td align="center" class="tdtopiorange">BRANCH EMPLOYEE - EDIT</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="25%" class="style1">Employee ID</td>
          <td class="style3">
			001 </td>
        </tr>
        <tr> 
          <td width="25%" class="style1">Employee Name</td>
          <td class="style3">
			<asp:TextBox runat="server" id="TbsEmployeeName" Width="315px" CssClass="inptype">Hanny</asp:TextBox>
&nbsp;<font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="style1">Position</td>
          <td class="style3">
		<asp:DropDownList runat="server" id="CmbPosition" CssClass="inptype">
			<asp:ListItem>Marketing</asp:ListItem>
			<asp:ListItem>Marketing Supervisor</asp:ListItem>
			<asp:ListItem>Branch Manager</asp:ListItem>
			<asp:ListItem>Credit Analyst</asp:ListItem>
			<asp:ListItem>CA Supervisor</asp:ListItem>
			<asp:ListItem>Collection Head</asp:ListItem>
			<asp:ListItem>Collector Lancar</asp:ListItem>
		</asp:DropDownList>
		&nbsp;<font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="style1">Level</td>
          <td class="style3">
			<asp:DropDownList runat="server" id="CmbLevel" CssClass="inptype">
				<asp:ListItem>Senior</asp:ListItem>
				<asp:ListItem>Trainee</asp:ListItem>
				<asp:ListItem>Junior</asp:ListItem>
				<asp:ListItem>Select One</asp:ListItem>
			</asp:DropDownList>
&nbsp; </td>
        </tr>
        <tr> 
          <td class="style1">Status</td>
          <td class="style3">
			<asp:DropDownList runat="server" id="CmbStatus" CssClass="inptype">
				<asp:ListItem>Karyawan</asp:ListItem>
				<asp:ListItem>Free Lance</asp:ListItem>
				<asp:ListItem>Temporary</asp:ListItem>
			</asp:DropDownList>
&nbsp;<font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="style1" style="height: 37px">Marketing Group</td>
          <td class="style3" style="height: 37px">
			<asp:DropDownList runat="server" id="CmbMarketingGroup" CssClass="inptype">
				<asp:ListItem>Motorcycle</asp:ListItem>
				<asp:ListItem>Electronic</asp:ListItem>
				<asp:ListItem>KTA</asp:ListItem>
				<asp:ListItem>Select One</asp:ListItem>
			</asp:DropDownList>
&nbsp;<font color="#FF0000"><em>-- di isi jika position Marketing 
            Head, Marketing Supervisor &amp; Marketing Officer</em></font></td>
        </tr>
        <tr> 
          <td class="style1">Marketing Assistant</td>
          <td class="style3">
			<asp:DropDownList runat="server" id="CmbMarketingAssistant" CssClass="inptype">
				<asp:ListItem>xxxxxxxx50xxxxxxxx</asp:ListItem>
				<asp:ListItem>Select One</asp:ListItem>
			</asp:DropDownList>
&nbsp;</td>
        </tr>
        <tr> 
          <td class="style1">Marketing Supervisor</td>
          <td class="style3">
			<asp:DropDownList runat="server" id="CmbMarketingSupervisor" CssClass="inptype">
				<asp:ListItem>xxxxxxxx50xxxxxxxx</asp:ListItem>
				<asp:ListItem>Select One</asp:ListItem>
			</asp:DropDownList>
&nbsp;</td>
        </tr>
        <tr>
          <td class="style1">Marketing Type</td>
          <td class="style3"> 
			<asp:DropDownList runat="server" id="CmbMarketingSales0" CssClass="inptype">
				<asp:ListItem>Direct</asp:ListItem>
				<asp:ListItem>Indirect</asp:ListItem>
				<asp:ListItem>Select One</asp:ListItem>
			</asp:DropDownList>
			</td>
        </tr>
        <tr> 
          <td class="style1">Product Type</td>
          <td class="style3"> 
			<asp:DropDownList runat="server" id="CmbMarketingSales" CssClass="inptype">
				<asp:ListItem>CF</asp:ListItem>
				<asp:ListItem>LS</asp:ListItem>
				<asp:ListItem>Mix</asp:ListItem>
				<asp:ListItem>Select One</asp:ListItem>
			</asp:DropDownList>
			</td>
        </tr>
        <tr> 
          <td class="style1">Join Date</td>
          <td class="style3">
			<asp:TextBox runat="server" id="TbdJoinDate" CssClass="inptype">01/08/2007</asp:TextBox>
&nbsp;<asp:ImageButton runat="server" id="BtnJoinDate" ImageUrl="../../images/iconcalendar.gif" /></td>
        </tr>
        <tr> 
          <td class="style1">CA Supervisor</td>
          <td class="style3">
			<asp:DropDownList runat="server" id="CmbCaSupervisor" CssClass="inptype">
				<asp:ListItem>Select One</asp:ListItem>
				<asp:ListItem>xxxxxxxx50xxxxxxxx</asp:ListItem>
			</asp:DropDownList>
			</td>
        </tr>
        <tr> 
          <td class="style1">Is Active</td>
          <td class="style3">
			<asp:CheckBox runat="server" id="CbIsActive" />
			</td>
        </tr>
        <tr> 
          <td class="style1">Is EFL</td>
          <td class="style3">
			<asp:CheckBox runat="server" id="CbIsEFL" />
			</td>
        </tr>
        <tr> 
          <td colspan="2" class="style2"><strong>Address</strong></td>
        </tr>
        <tr> 
          <td class="style1">Address</td>
          <td class="style3"><textarea name="textfield342" cols="50" rows="5" class="inptype">Jl. Panjang No. 28</textarea></td>
        </tr>
        <tr> 
          <td class="style1">RT / RW</td>
          <td class="style3"><font face="Tahoma, Verdana" size="2"> 
            <asp:TextBox runat="server" id="TbsRt" Width="30px" CssClass="inptype">005</asp:TextBox>
			</font>&nbsp;/ 
            <font face="Tahoma, Verdana" size="2"> 
			<asp:TextBox runat="server" id="TbsRw" Width="30px" CssClass="inptype">007</asp:TextBox>
            </font></td>
        </tr>
        <tr> 
          <td class="style1">Kelurahan</td>
          <td class="style3">
			<asp:TextBox runat="server" id="TbsKelurahan" CssClass="inptype">Kebon Jeruk</asp:TextBox>
&nbsp;</td>
        </tr>
        <tr> 
          <td class="style1">Kecamatan</td>
          <td class="style3">
			<asp:TextBox runat="server" id="TbsKecamatan" CssClass="inptype">Kebon Jeruk</asp:TextBox>
&nbsp;</td>
        </tr>
        <tr> 
          <td class="style1">City</td>
          <td class="style3">
			<asp:TextBox runat="server" id="TbsCity" CssClass="inptype">Jakarta Barat</asp:TextBox>
&nbsp;</td>
        </tr>
        <tr> 
          <td class="style1">Zip Code</td>
          <td class="style3">
			<asp:TextBox runat="server" id="TbsZipCode" CssClass="inptype">11530</asp:TextBox>
&nbsp;<asp:HyperLink runat="server" id="LinkZipCode" ImageUrl="../../images/IconDetail.gif" NavigateUrl="ZipCodeLookUp.aspx" Target="_blank">
			</asp:HyperLink>
&nbsp;</td>
        </tr>
        <tr> 
          <td class="style1">Phone 1</td>
          <td class="style3">
			<asp:TextBox runat="server" id="TbsAreaPhone1" Width="65px" CssClass="inptype">021</asp:TextBox>
&nbsp;- 
            <asp:TextBox runat="server" id="TbsPhone1" CssClass="inptype">5369865</asp:TextBox>
			</td>
        </tr>
        <tr> 
          <td class="style1">Phone 2</td>
          <td class="style3">
			<asp:TextBox runat="server" id="TbsAreaPhone2" Width="65px" CssClass="inptype">
			</asp:TextBox>
&nbsp;- 
            <asp:TextBox runat="server" id="TbsPhone2" CssClass="inptype"></asp:TextBox>
			</td>
        </tr>
        <tr> 
          <td class="style1">Fax</td>
          <td class="style3">
			<asp:TextBox runat="server" id="TbsAreaFax" Width="65px" CssClass="inptype">
			</asp:TextBox>
&nbsp;- 
            <asp:TextBox runat="server" id="TbsFax" CssClass="inptype"></asp:TextBox>
			</td>
        </tr>
        <tr> 
          <td class="style1">Email</td>
          <td class="style3">
			<asp:TextBox runat="server" id="TbsEmail" CssClass="inptype">Hanny@yahoo.com</asp:TextBox>
			</td>
        </tr>
        <tr> 
          <td class="style1">Mobile Phone</td>
          <td class="style3">
			<asp:TextBox runat="server" id="TbsMobilePhone" CssClass="inptype">08131101010</asp:TextBox>
			</td>
        </tr>
      </table>
    </div>
    
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnAdd" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="BranchEmployee.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="BranchEmployee.aspx" /></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
