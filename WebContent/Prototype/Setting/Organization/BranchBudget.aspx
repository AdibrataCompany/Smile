<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="../../Confins.css">
<style type="text/css">
.style1 {
	font-family: Verdana;
	color: #FF0000;
}
</style>
</head>

<body>
<form id="FrmBranchBudget" runat="server">
<div align="center">
  <div align="center">
    <div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopiorangekiri">&nbsp;</td>
      <td align="center" class="tdtopiorange">BRANCH BUDGET</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Branch ID</td>
      <td class="tdganjil" colspan="5">
		<asp:HyperLink runat="server" id="LinkBranchId" NavigateUrl="BranchView.aspx" Target="_blank">A03
		</asp:HyperLink>
		</td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Branch Name</td>
      <td class="tdganjil" colspan="5">
		Grand Wijaya</td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Year <span class="style1">( yyyy )</span></td>
      <td class="tdganjil" style="width: 143px">
		<asp:TextBox runat="server" id="TbnYear" Width="115px" CssClass="inptype"></asp:TextBox>
&nbsp;</td>
      <td class="tdgenap" style="width: 80px">
		Month</td>
      <td class="tdganjil" style="width: 96px">
		<asp:DropDownList runat="server" id="CmbMonth" CssClass="inptype">
			<asp:ListItem>All</asp:ListItem>
			<asp:ListItem>January</asp:ListItem>
			<asp:ListItem>February</asp:ListItem>
			<asp:ListItem>March</asp:ListItem>
			<asp:ListItem>April</asp:ListItem>
			<asp:ListItem>May</asp:ListItem>
			<asp:ListItem>June</asp:ListItem>
			<asp:ListItem>July</asp:ListItem>
			<asp:ListItem>August</asp:ListItem>
			<asp:ListItem>September</asp:ListItem>
			<asp:ListItem>October</asp:ListItem>
			<asp:ListItem>November</asp:ListItem>
			<asp:ListItem>December</asp:ListItem>
		</asp:DropDownList>
		</td>
      <td class="tdgenap" style="width: 102px">
		Asset Status</td>
      <td class="tdganjil">
		<asp:DropDownList runat="server" id="CmbAssetStatus" CssClass="inptype">
			<asp:ListItem>All</asp:ListItem>
			<asp:ListItem>New</asp:ListItem>
			<asp:ListItem>Used</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
    </table>
  <table border="0" cellspacing="0" cellpadding="0" style="width: 95%">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
          <td width="50%" align="right">
			<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" PostBackUrl="BranchBudgetListing.aspx" />&nbsp;
			<asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" PostBackUrl="BranchBudgetListing.aspx" /></td>
    </tr>
  </table>
    </div>
  </div>
</div>
</form>
</body>
</html>