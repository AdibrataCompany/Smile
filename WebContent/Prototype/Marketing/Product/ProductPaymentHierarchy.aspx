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
	background-color: #FFFFFF;
	text-align: left;
}
.style5 {
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmProductAdd" runat="server">
<div class="style5">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3" class="style5"><font color="red"><i>*)&nbsp;&nbsp;&nbsp;&nbsp; required field<br />
		Validate so between payment hierarchy, values are not repeatable</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">PRODUCT PAYMENT HIERARCHY</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="40%" class="style1" style="height: 18px">Product ID</td>
          <td class="style2" style="height: 18px"><a href="ProductView.aspx" target="_blank">xxxxx10xxxxx</a></td>
        </tr>
        <tr> 
          <td class="style1">Description</td>
          <td class="style2">xxxxxxxxxx50xxxxxxxxxxxx</td>
        </tr>
        </table>
      <br />        
  	<table width="95%" border="0" cellspacing="0" cellpadding="0">
    	<tr class="trtopiabu"> 
      		<td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
     	 	<td align="center" class="tdtopihijau">PRODUCT PAYMENT HIERARCHY</td>
    	  	<td width="10" class="tdtopihijaukanan">&nbsp;</td>
    	</tr>
  	</table>
     <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="40%" class="style1">Payment Hierarchy - 1</td>
          <td class="style2"> 
			    <asp:DropDownList runat="server" id="cboPayHie1">
					<asp:ListItem Value="INSTALLRCV">Installment Receive
					</asp:ListItem>
					<asp:ListItem Value="INSURRCV">Insurance Receive
					</asp:ListItem>
					<asp:ListItem Value="LCINSTALL">Late Charge - Installment
					</asp:ListItem>
					<asp:ListItem Value="LCINSUR">Late Charge - Insurance
					</asp:ListItem>
				</asp:DropDownList>
				<font color="red">&nbsp;*)</font></td>
        </tr>
        <tr> 
          <td width="40%" class="style1" style="height: 18px">Payment Hierarchy 
			- 2</td>
          <td class="style2" style="height: 18px">
			<asp:DropDownList runat="server" id="cboPayHie2">
				<asp:ListItem Value="INSTALLRCV">Installment Receive
				</asp:ListItem>
				<asp:ListItem Value="INSURRCV">Insurance Receive</asp:ListItem>
				<asp:ListItem Value="LCINSTALL">Late Charge - Installment</asp:ListItem>
				<asp:ListItem Value="LCINSUR">Late Charge - Insurance
				</asp:ListItem>
			</asp:DropDownList>
				<font color="red">&nbsp;*)</font></td>
        </tr>
        <tr> 
          <td class="style1">Payment Hierarchy - 3</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="cboPayHie3">
				<asp:ListItem Value="INSTALLRCV">Installment Receive
				</asp:ListItem>
				<asp:ListItem Value="INSURRCV">Insurance Receive</asp:ListItem>
				<asp:ListItem Value="LCINSTALL">Late Charge - Installment</asp:ListItem>
				<asp:ListItem Value="LCINSUR">Late Charge - Insurance
				</asp:ListItem>
			</asp:DropDownList>
				<font color="red">&nbsp;*)</font></td>
        </tr>
        <tr> 
          <td class="style1">Payment Hierarchy - 4</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="cboPayHie4">
				<asp:ListItem Value="INSTALLRCV">Installment Receive
				</asp:ListItem>
				<asp:ListItem Value="INSURRCV">Insurance Receive</asp:ListItem>
				<asp:ListItem Value="LCINSTALL">Late Charge - Installment</asp:ListItem>
				<asp:ListItem Value="LCINSUR">Late Charge - Insurance
				</asp:ListItem>
			</asp:DropDownList>
				<font color="red">&nbsp;*)</font></td>
        </tr>
        </table>

  <div align="center">
    <div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" style="height: 14px"></td>
      <td width="50%" align="right" style="height: 14px"></td>
    </tr>
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="Product.aspx" Height="20px" />&nbsp;
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="Product.aspx" /></td>
    </tr>
  </table>
    </div>
    
  </div>

    </div>
    
  </div>
</div>
</div>
</form>
</body>
</html>
