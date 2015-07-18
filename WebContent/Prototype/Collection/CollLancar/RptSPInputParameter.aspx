<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>COLLECTION</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<style type="text/css">
.style1 {
	background-color: #FFFFFF;
	text-align: left;
}
.style2 {
	background-color: #F4FAFF;
	text-align: left;
}
.style4 {
	color: #FF0000;
}
.style5 {
	text-align: left;
	color: #FF0000;
}
.style6 {
	background-color: #FFFFFF;
	text-align: left;
	color: #FF0000;
}
.style7 {
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmRptSPInputParameter" runat="server">
<div align="center">
 <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">SP PRINTING</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
     <tr> 
      <td width="20%" class="tdgenap"  align="left">Agreement No</td>
      <td width="30%" class="tdganjil" align="left"><asp:Hyperlink ID="hypAgreementNo" runat="server" Text="xxxxx20xxxxx" NavigateUrl="../../Credit/ViewCompanyCustomer.htm" Target="_blank"></asp:Hyperlink ></td>
     <td width="20%" class="tdgenap" align="left">Customer Name</td>
      <td width="30%" class="tdganjil" align="left"><asp:Hyperlink ID="lblCustomerName" runat="server" Text="xxxxx50xxxxxx"  NavigateUrl="../../Credit/ViewCompanyCustomer.htm" Target="_blank"></asp:Hyperlink ></td>
      </tr>
      <tr> 
      <td class="tdgenap" align="left">Due Date</td>
      <td class="tdganjil" align="left"><asp:Label ID="lblDueDate" Text="dd/mm/yyyy" runat="server"></asp:Label></td>
      <td class="tdgenap" align="left">Amount Overdue</td>
      <td class="tdganjil" align="left"><asp:label id="lblAmountOverdue" runat="server">999,999,999,999</asp:label></td>
    </tr>
     <tr> 
      <td class="tdgenap" align="left">Overdue Days</td>
      <td class="tdganjil" align="left"><asp:Label ID="lblOverdueDays" Text="99" runat="server"></asp:Label></td>
       <td class="tdgenap" align="left">Late Charges</td>
      <td class="tdganjil" align="left"><asp:Label ID="llblLateCharges" Text="999,999,999,999" runat="server"></asp:Label></td>
    </tr>
      <tr> 
       <td class="tdgenap" align="left">Recommend SP Type</td>
      <td class="tdganjil" align="left"><asp:Label ID="lblRecommendSPType" Text="xxxxx30xxxxx" runat="server"></asp:Label></td>
      
      <td class="tdgenap" align="left">Collector Name</td>
      <td class="tdganjil" align="left"><asp:Hyperlink ID="lblCollectorName" Text="xxxxx50xxxxx" runat="server" NavigateUrl="../../Credit/ViewCompanyCustomer.htm" Target="_blank" ></asp:Hyperlink ></td>
    </tr>
   <tr> 
       <td class="tdgenap" align="left">Last SP Type</td>
      <td class="tdganjil" align="left"><asp:Label ID="lblLastSPType" Text="xxxxx30xxxxx" runat="server"></asp:Label></td>
      
      <td class="tdgenap" align="left">Last SP Date</td>
      <td class="tdganjil" align="left"><asp:Label ID="lblLastSPDate" Text="dd/MM/yyyy" runat="server" ></asp:Label ></td>
    </tr>
    <tr> 
       <td class="tdgenap" align="left">SP Type</td>
      <td class="tdganjil" align="left"><asp:DropDownList ID="ddlSPType" runat="server">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="SP 1" Value="SP1"></asp:ListItem>
      <asp:ListItem Text="SP 2" Value="SP2"></asp:ListItem>
      <asp:ListItem Text="SP 3" Value="SP3"></asp:ListItem>
      <asp:ListItem Text="SPPU" Value="SPPU"></asp:ListItem></asp:DropDownList><font color="red">*)</font></td>
      
      <td class="tdgenap" align="left"></td>
      <td class="tdganjil" align="left"></td>
    </tr>



  </table>

  <table style="width: 100%">
	<tr>
		<td class="style5">&nbsp;</td>
	</tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">SP PRINTING SIGNER&nbsp;</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap"  align="left">Signer 1</td>
      <td width="30%" class="tdganjil" align="left">
		<span class="style4">
		<asp:TextBox runat="server" id="TbsSingner1" Width="117px" CssClass="inptype">
		</asp:TextBox>
		</span></td>
      <td width="20%" class="tdgenap"  align="left">
		Job Position Signer 1</td>
      <td width="30%" class="tdganjil" align="left">
		<asp:TextBox runat="server" id="TbsJobPositionSign1" Width="163px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr>
      <td width="20%" class="tdgenap"  align="left">Signer 2</td>
      <td width="30%" class="tdganjil" align="left">
		<asp:TextBox runat="server" id="TbsSingner2" Width="117px" CssClass="inptype">
		</asp:TextBox>
		</td>
      <td width="20%" class="tdgenap"  align="left">
		Job Position Signer 2</td>
      <td width="30%" class="tdganjil" align="left">
		<asp:TextBox runat="server" id="TbsJobPositionSign2" Width="163px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap"  align="left">Signer 3</td>
      <td width="30%" class="tdganjil" align="left">
		<asp:TextBox runat="server" id="TbsSingner3" Width="117px" CssClass="inptype">
		</asp:TextBox>
		</td>
      <td width="20%" class="tdgenap"  align="left">
		Job Position Signer 3</td>
      <td width="30%" class="tdganjil" align="left" >
		<asp:TextBox runat="server" id="TbsJobPositionSign3" Width="163px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap"  align="left">Signer 4</td>
      <td width="30%" class="tdganjil" align="left">
		<asp:TextBox runat="server" id="TbsSingner4" Width="117px" CssClass="inptype">
		</asp:TextBox>
		</td>
      <td width="20%" class="tdgenap"  align="left">
		Job Position Signer 4</td>
      <td width="30%" class="tdganjil" align="left">
		<asp:TextBox runat="server" id="TbsJobPositionSign4" Width="163px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap"  align="left">Signer 5</td>
      <td width="30%" class="tdganjil" align="left">
		<asp:TextBox runat="server" id="TbsSingner5" Width="117px" CssClass="inptype">
		</asp:TextBox>
		</td>
      <td width="20%" class="tdgenap"  align="left">
		Job Position Signer 5</td>
      <td width="30%" class="tdganjil" align="left">
		<asp:TextBox runat="server" id="TbsJobPositionSign5" Width="163px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap"  align="left">Signer 6</td>
      <td width="30%" class="tdganjil" align="left">
		<asp:TextBox runat="server" id="TbsSingner6" Width="117px" CssClass="inptype">
		</asp:TextBox>
		</td>
      <td width="20%" class="tdgenap"  align="left">
		Job Position Signer 6</td>
      <td width="30%" class="tdganjil" align="left">
		<asp:TextBox runat="server" id="TbsJobPositionSign6" Width="163px" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30" class="style7"> 
        <asp:ImageButton runat="server" id="BtnPrint" ImageUrl="../../images/ButtonPrint.gif" PostBackUrl="RptSPInputParameter.aspx"  /></td>
      <td width="50%" align="right">
		&nbsp;&nbsp;&nbsp; 
        <asp:ImageButton runat="server" id="BtnBack" ImageUrl="../../images/ButtonBack.gif" PostBackUrl="SPPrinting.aspx" />&nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
