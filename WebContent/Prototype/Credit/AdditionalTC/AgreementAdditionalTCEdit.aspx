<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>PRODUCT TERM &amp; CONDITION</title>
<link rel="stylesheet" type="text/css" href="Confins.css" />
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<style type="text/css">
.style1 {
	background-color: #F4FAFF;
	text-align: left;
}
.style2 {
	background-color: #FFFFFF;
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmProductTermConditionAdd" runat="server">
<div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">AGREEMENT ADDITIONAL T/C</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>

  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
  <tr> 
      <td width="20%" class="tdgenap" align="left">Branch</td>
      <td width="30%" class="tdganjil" align="left"><asp:Hyperlink runat="server" ID="lblBranch" Text="xxxxx20xxxxx" NavigateUrl=""></asp:Hyperlink ></td>
      <td width="20%" class="tdgenap" align="left">Customer Name</td>
      <td width="30%" class="tdganjil" align="left"><asp:Label runat="server" ID="lblCustomerName" Text="xxxxx50xxxxx"></asp:Label></td>
    </tr>

    <tr> 
      <td width="20%" class="tdgenap" align="left">Application ID</td>
      <td width="30%" class="tdganjil" align="left"><asp:Hyperlink runat="server" ID="lblApplicationID" Text="xxxxx20xxxxx" NavigateUrl=""></asp:Hyperlink ></td>
      <td width="20%" class="tdgenap" align="left">Application Step</td>
      <td width="30%" class="tdganjil" align="left"><asp:Label runat="server" ID="lblApplicationStep" Text="xx3xx"></asp:Label></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap" align="left">Agreement No</td>
      <td width="30%" class="tdganjil" align="left"><asp:Hyperlink runat="server" ID="lblAgreementNo" Text="xxxxx20xxxxx"  NavigateUrl=""></asp:Hyperlink ></td>
      <td width="20%" class="tdgenap" align="left">Contract Status</td>
      <td width="30%" class="tdganjil" align="left"><asp:Label runat="server" ID="lblContractStatus" Text="xx3xx"></asp:Label></td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">AGREEMENT ADDITIONAL T/C - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
       <tr> 
          <td width="25%" class="style1">Term &amp; Condition ID</td>
          <td class="style2"><font color="red">
			<asp:TextBox runat="server" id="txtTermConditionID" CssClass="inptype" Enabled="false" Text="xxxxx10xxxxx">
			</asp:TextBox >
&nbsp;*)</font> </td>
        </tr>
         <tr> 
          <td width="25%" class="style1">Term &amp; Condition Name</td>
          <td class="style2"><font color="red">
			<asp:TextBox runat="server" id="txtTermConditionName" Width="315px" CssClass="inptype" Text="xxxxx50xxxxx">
			</asp:TextBox >
&nbsp;*)</font> </td>
        </tr>
        <tr> 
          <td class="style1">Prior To</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbPriorTo" CssClass="inptype">
				<asp:ListItem>New Application</asp:ListItem>
				<asp:ListItem>Approval</asp:ListItem>
				<asp:ListItem>Purchase Order</asp:ListItem>
				<asp:ListItem>Delivery Order</asp:ListItem>
				<asp:ListItem>Go Live</asp:ListItem>
			</asp:DropDownList>
			</td>
        </tr>
        <tr> 
          <td class="style1">Mandatory</td>
          <td class="style2">
			<asp:RadioButton runat="server" id="RdBtnYes" Text="Yes" Checked="True" />&nbsp;<asp:RadioButton runat="server" id="RdBtnNo" Text="No" /></td>
        </tr>
      </table>
    </div>
    
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="AgreementAdditionalTCList.aspx" Height="20px" />&nbsp; 
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="AgreementAdditionalTCList.aspx" />&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
