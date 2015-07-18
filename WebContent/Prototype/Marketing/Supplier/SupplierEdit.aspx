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
<form id="FrmSupplierAdd" runat="server">
<div align="center" class="style4">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3" class="style4"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SUPPLIER - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="style1" style="width: 51%">Supplier Group</td>
      <td colspan="3" class="style3"> 
		<asp:DropDownList runat="server" id="CmbSupplierGroup" CssClass="inptype">
			<asp:ListItem>Group</asp:ListItem>
			<asp:ListItem>Non Group</asp:ListItem>
			<asp:ListItem>Afiliasi Group</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 51%">Supplier Name</td>
      <td colspan="3" class="style3">PT.XXXXXX </td>
    </tr>
    <tr> 
      <td class="style1" style="width: 51%">Business Name</td>
      <td colspan="3" class="style3">
		<asp:TextBox runat="server" id="TbsInitialName" Width="200px" CssClass="inptype">XXXXX</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 51%">NPWP</td>
      <td colspan="3" class="style3">
		<asp:TextBox runat="server" id="TbsNpwp" Width="200px" CssClass="inptype">XXXXX</asp:TextBox>
      </td>
    </tr>
    <tr> 
      <td class="style1" style="width: 51%">TDP</td>
      <td colspan="3" class="style3">
		<asp:TextBox runat="server" id="TbsTdp" Width="200px" CssClass="inptype">XXXXX</asp:TextBox>
&nbsp;</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 51%">SIUP</td>
      <td colspan="3" class="style3">
		<asp:TextBox runat="server" id="TbsSiup" Width="200px" CssClass="inptype">XXXXX</asp:TextBox>
&nbsp;</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 51%">Supplier Type</td>
      <td colspan="3" class="style3">
		
			<asp:RadioButton runat="server" id="RdBtnPersonal" Text="Personal" />&nbsp;<asp:RadioButton runat="server" id="RdBtnCompany" Text="Company" Checked="True" /></td>
    </tr>
        <tr> 
      <td class="style1" width="20%">Calculate Tax Method</td>
      <td colspan="3" class="style3" width="80%">
		<asp:DropDownList runat="server" id="DDLCalculateMethod" Enabled="false" Width="107px" Height="19px">
		 <asp:ListItem Text="net"></asp:ListItem>
		</asp:DropDownList>
			</td>
    </tr>

   <tr> 
      <td class="style1" width="20%">Insentive Scheme</td>
      <td colspan="3" class="style3" width="80%">
		<asp:DropDownList runat="server" id="DDLInsentiveScheme" Width="201px" Height="20px">
		<asp:ListItem Text="select one"></asp:ListItem>
		</asp:DropDownList>
		</td>	
    </tr>

    <tr> 
      <td class="style1" style="width: 51%">Is Active</td>
      <td colspan="3" class="style3">
		 &nbsp;<asp:CheckBox runat="server" id="CbIsActive" Checked="True" /></td>
    </tr>
    <tr> 
      <td colspan="4" class="style2">ADDRESS</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 51%">Address</td>
      <td colspan="3" class="tdganjil">
		<textarea name="TbsAddress" rows="5" class="inptype" style="width: 491px">XXXXX</textarea></td>
    </tr>
    <tr> 
      <td class="style1" style="width: 51%">RT/RW</td>
      <td colspan="3" class="style3">
		<asp:TextBox runat="server" id="TbsRt" Width="50px" CssClass="inptype">999</asp:TextBox>
&nbsp;/ 
        <asp:TextBox runat="server" id="TbsRw" Width="50px" CssClass="inptype">999</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 51%">Kelurahan</td>
      <td colspan="3" class="style3">
		<asp:TextBox runat="server" id="TbsKelurahan" Width="200px" CssClass="inptype">XXXXX</asp:TextBox>
&nbsp;</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 51%">Kecamatan</td>
      <td colspan="3" class="style3">
		<asp:TextBox runat="server" id="TbsKecamatan" Width="200px" CssClass="inptype">XXXXX</asp:TextBox>
&nbsp;</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 51%">City</td>
      <td colspan="3" class="style3">
		<asp:TextBox runat="server" id="TbsCity" Width="200px" CssClass="inptype">XXXXX</asp:TextBox>
&nbsp;</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 51%">Zip Code</td>
      <td colspan="3" class="style3">
		<asp:TextBox runat="server" id="TbsZipCode" Width="150px" CssClass="inptype">99999</asp:TextBox>
&nbsp;
		<asp:HyperLink runat="server" id="LinkZipCode" ImageUrl="../../images/IconDetail.gif" NavigateUrl="../../Setting/Organization/ZipCodeLookUp.aspx" Target="_blank" ToolTip="Untuk mengisi kolom Kelurahan, Kecamatan, City &amp; Zip Code">
		</asp:HyperLink>
		<font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="style1" style="width: 51%">Phone 1</td>
      <td colspan="3" class="style3">
		<asp:TextBox runat="server" id="TbsAreaPhone1" Width="50px" CssClass="inptype">9999</asp:TextBox>
&nbsp;- 
        <asp:TextBox runat="server" id="TbsPhone1" Width="200px" CssClass="inptype">9999999999</asp:TextBox>
&nbsp;<font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="style1" style="width: 51%">Phone 2</td>
      <td colspan="3" class="style3">
		<asp:TextBox runat="server" id="TbsAreaPhone2" Width="50px" CssClass="inptype">9999</asp:TextBox>
&nbsp;- 
        <asp:TextBox runat="server" id="TbsPhone2" Width="200px" CssClass="inptype">9999999999</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 51%">Fax No.</td>
      <td colspan="3" class="style3">
		<asp:TextBox runat="server" id="TbsAreaFax" Width="50px" CssClass="inptype">9999</asp:TextBox>
&nbsp;- 
        <asp:TextBox runat="server" id="TbsFax" Width="200px" CssClass="inptype">9999999999</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td colspan="4" class="style2">CONTACT PERSON</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 51%">Name</td>
      <td colspan="3" class="style3">
		<asp:TextBox runat="server" id="TbsContactPersonName" Width="315px" CssClass="inptype">XXXXX</asp:TextBox>
&nbsp;<font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="style1" style="width: 51%">Job Title</td>
      <td colspan="3" class="style3">
		<asp:TextBox runat="server" id="TbsContactPersonJobTitle" Width="315px" CssClass="inptype">XXXXX</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 51%">Email</td>
      <td colspan="3" class="style3">
		<asp:TextBox runat="server" id="TbsContactPersonEmail" Width="315px" CssClass="inptype">XXXXX</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="style1" style="width: 51%">Mobile Phone</td>
      <td colspan="3" class="style3">
		<asp:TextBox runat="server" id="TbsContactPersonHp" Width="315px" CssClass="inptype">
		9999999999</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td colspan="4" class="style2">SUPPLIER DATA</td>
    </tr>
      <tr> 
      <td class="style1" width="20%">Holding</td>
      <td colspan="3" class="style3" width="80%">
		<asp:TextBox runat="server" id="TbsHolding" Width="150px" CssClass="inptype"></asp:TextBox>
		&nbsp;
			<asp:HyperLink runat="server" id="LinkHolding" ImageUrl="../../images/IconDetail.gif" NavigateUrl="../../lookup/SupplierHoldingLookup.aspx" Target="_blank" >
		</asp:HyperLink>
		
		</td>
    </tr>
   
    <tr> 
      <td class="style1" style="width: 51%">Start Date</td>
      <td class="style3" style="width: 43%">
		<asp:TextBox runat="server" id="TbsPksJoinDate" Width="150px" CssClass="inptype">dd/mm/yyyy</asp:TextBox>
&nbsp;&nbsp;
		<asp:ImageButton runat="server" id="BtnCalenderJoinDate" ImageUrl="../../images/iconcalendar.gif" /></td>
      
    </tr>
  <tr> 
      <td class="style1" width="20%">Bad Status</td>
      <td colspan="3" class="style3" width="80%">
			<asp:RadioButton runat="server" id="RdBtnNormal" Text="Normal" Checked="True" ForeColor="Silver" />&nbsp;&nbsp;&nbsp;
			<asp:RadioButton runat="server" id="RdBtnBad" Text="Bad" ForeColor="Silver" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<asp:RadioButton runat="server" id="RdBtnWarning" Text="Warning" ForeColor="Silver" /> </td>
    </tr>
    <tr> 
      <td class="style1" width="20%">Level</td>
      <td colspan="3" class="style3" width="80%">
	    <asp:RadioButtonList runat="server" ID="RdBtnLevel" RepeatDirection="Horizontal">
	    	<asp:ListItem Text="Main"></asp:ListItem>
	    	<asp:ListItem Text="Active"></asp:ListItem>
	    	<asp:ListItem Text="Normal"></asp:ListItem>
	    	<asp:ListItem Text="Passive"></asp:ListItem>

	    </asp:RadioButtonList>		
	  </td>		
    </tr>
    <tr> 
      <td class="style1" width="20%">is Automotive Asset ?</td>
      <td colspan="3" class="style3" width="80%"> 
		 <asp:RadioButtonList runat="server" id="RbtnLAutomotive" RepeatDirection="Horizontal">
		 <asp:ListItem Text="Yes"></asp:ListItem>
		 <asp:ListItem Text="No"></asp:ListItem>
		 </asp:RadioButtonList>
	  </td>	
    </tr>
    <tr> 
      <td colspan="4" class="style2">AUTOMOTIVE DATA</td>
    </tr>
    <tr> 
      <td class="style1" width="20%"> BPKB Registration Status</td>
      <td colspan="3" class="style3" width="80%"> 
		<asp:RadioButton runat="server" id="RdBtnYes" Text="Yes" Checked="True" />&nbsp;&nbsp;&nbsp;
		<asp:RadioButton runat="server" id="RdBtnNo" Text="No" /></td>
    </tr>
    <tr> 
      <td class="style1" width="20%">Category</td>
      <td class="style3" colspan="3" width="80%">
		<asp:RadioButtonList runat="server" id="RadioButtonList1" RepeatDirection="Horizontal">
			<asp:ListItem Text="Main Dealer"></asp:ListItem>
			<asp:ListItem Text="Authorized Dealer"></asp:ListItem>
			<asp:ListItem Text="Show Room"></asp:ListItem>
		
		</asp:RadioButtonList>
		 </td>
    </tr>
     <tr> 
      <td class="style1" width="20%">Plafond Amount for Vendor</td>
      <td class="style3" align="right" width="80%">
		<asp:TextBox runat="server" id="TxtBPlafond" CssClass="inptype" Width="128px" Text="0"></asp:TextBox>
    	</td>			
    </tr>

    
    
    
    <tr> 
      <td class="style1" width="20%">Asset Sold</td>
      <td colspan="3" class="style3" width="80%">
			<asp:RadioButton runat="server" id="RdBtnNew" Text="New" Checked="True" />&nbsp;&nbsp;&nbsp;
			<asp:RadioButton runat="server" id="RdBtnUsed" Text="Used" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<asp:RadioButton runat="server" id="RdBtnExCbu" Text="Ex CBU" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<asp:RadioButton runat="server" id="RdBtnMixed" Text="Mixed" /> </td>
    </tr>
 <tr> 
      <td colspan="4" class="style2">FLOOR FINANCING</td>
    </tr>
    <tr> 
      <td class="style1" width="20%">Prepayment Penalty Type</td>
      <td colspan="3" class="style3" width="80%"> 
		<asp:DropDownList runat="server" id="ddlPrepaymentPenaltyType" >
		<asp:ListItem Text="Percentage" Value="Percentage"></asp:ListItem>
		<asp:ListItem Text="Amount" Value="Amount"></asp:ListItem>
		</asp:DropDownList>
	  </td>
    </tr>

 	<tr> 
      <td class="style1" width="20%">Prepayment Penalty</td>
      <td colspan="3" class="style3" width="80%"> 
		<asp:TextBox runat="server" id="txtPrepaymentPenalty" Text="999,999,999" CssClass="inptype" /></td>
    </tr>
	<tr> 
      <td class="style1" width="20%">Plafond Amount</td>
      <td colspan="3" class="style3" width="80%"> 
		<asp:TextBox runat="server" id="txtPlafondAmount" Text="999,999,999" CssClass="inptype"/></td>
    </tr>
 	<tr> 
      <td colspan="4" class="style2">ASSET DOCUMENT</td>
    </tr>
    <tr> 
      <td class="style1" width="20%">Plafond SP BPKB</td>
      <td colspan="3" class="style3" width="80%"> 
		<asp:TextBox runat="server" id="txtPlafondSPBPKB" Text="99" CssClass="inptype"/></td>
    </tr>
    <tr> 
      <td class="style1" width="20%">Aging SP BPKB</td>
      <td colspan="3" class="style3" width="80%"> 
		<asp:TextBox runat="server" id="txtAgingSPBPKB" Text="99" CssClass="inptype"/> in Days</td>
    </tr>

  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="Supplier.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="Supplier.aspx" />&nbsp; 
      </td>
    </tr>
  </table>
</div>
</form>
</body>

</html>
