<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="../../Include/Insurance.css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head>

<body>
<form id="form1" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiabukiri">&nbsp;</td>
      <td align="center" class="tdtopiabu">CLAIM ACTIVITY REJECT</td>
      <td width="10" class="tdtopiabukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="20%" class="tdgenap">Agreement No</td>
          <td width="30%" class="tdganjil"><a href="../../AccMaintenance/AgreementView.htm">xxxxxxxxxx20xxxxxxxxxx</a></td>
          <td width="20%" class="tdgenap">Customer Name</td>
          <td width="30%" class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700')">xxxxxxxxxx50xxxxxxxxxx</a></td>
        </tr>
        <tr> 
          <td width="20%" class="tdgenap">Insurance Co</td>
          <td width="30%" class="tdganjil">xxxx10xxxx </td>
          <td width="20%" class="tdgenap">Policy No</td>
          <td width="30%" class="tdganjil"><a href="../PolicyDetailView.htm">xxxxxxx25xxxxxxx</a></td>
        </tr>
        <tr> 
          <td class="tdgenap">Asset Description</td>
          <td class="tdganjil" colspan="3">xxxxxxxxxx50xxxxxxxxxx</td>
        </tr>
        <tr> 
          <td class="tdgenap">Coverage Name</td>
          <td class="tdganjil">xx3xx</td>
          <td class="tdgenap">Insurance Period</td>
          <td align="left" class="tdganjil">dd/mm/yyyy to dd/mm/yyyy</td>
        </tr>
        <tr>
          <td class="tdgenap">Claim Request Date</td>
          <td align="left" class="tdganjil">dd-mm-yyyy</td>
          <td class="tdgenap">Event Date</td>
          <td align="left" class="tdganjil">dd-mm-yyyy</td>
        </tr>
        <tr> 
          <td class="tdgenap">Claim Type</td>
          <td align="left" class="tdganjil">xxxx10xxxx</td>
          <td class="tdgenap">Cases</td>
          <td align="left" class="tdganjil">xxxx20xxxx</td>
        </tr>
        <tr>
          <td class="tdgenap">Event Location</td>
          <td align="left" class="tdganjil" colspan="3">xxxxxxxxxx50xxxxxxxxxx</td>
        </tr>
        <tr> 
      <td class="tdgenap" style="width: 20%">Damage Part</td>
          <td class="tdganjil" colspan="3">
			xxxxxxxxxx50xxxxxxxxxx</td>
        </tr>
        <tr> 
      <td class="tdgenap" style="width: 20%">Reported By</td>
          <td colspan="3" class="tdganjil">
			xxxx20xxxx As xxxx20xxxx</td>
        </tr>
        <tr> 
          <td class="tdgenap" style="height: 19px">Claim No</td>
          <td colspan="3" class="tdganjil" style="height: 19px">
			xxxx20xxxx </td>
        </tr>
        <tr> 
          <td class="tdgenap">Reject By</td>
          <td colspan="3" class="tdganjil">
			<asp:DropDownList runat="server" id="ddlRejectBy">
				<asp:ListItem>Customer</asp:ListItem>
				<asp:ListItem>Insurance Company</asp:ListItem>
			</asp:DropDownList>
			<font color="red">
			&nbsp;*)</font></td>
        </tr>
        <tr> 
          <td class="tdgenap">Reject Reason</td>
          <td colspan="3" class="tdganjil">
			<font color="red">
			<asp:DropDownList runat="server" id="ddlRejectReason">
				<asp:ListItem>Select One</asp:ListItem>
			</asp:DropDownList>
			&nbsp;*)</font></td>
        </tr>
        <tr> 
          <td class="tdgenap">Reject Date</td>
          <td colspan="3" class="tdganjil">
		<asp:TextBox runat="server" id="txtRejectDate" CssClass="inptype" Width="100px">
		</asp:TextBox>&nbsp;<img src="../../Images/iconcalendar.gif" width="20" height="20">	
          </td>
        </tr>
		<tr>
          <td class="tdgenap">Notes</td>
          <td colspan="3" class="tdganjil"><font color="red">
			<asp:TextBox runat="server" id="txtNotes" CssClass="inptype" Width="460px" TextMode="MultiLine" Height="40px">
			</asp:TextBox>
			</font></td>
        </tr>
      </table>
      
	<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
	</asp:XmlDataSource>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td height="30" align="right">&nbsp;  
		<asp:ImageButton runat="server" id="imbSave" ImageUrl="../../images/buttonSave.gif" PostBackUrl="ClaimActivity.aspx"/>
		<asp:ImageButton runat="server" id="imbCancel" ImageUrl="../../images/buttonCancel.gif" PostBackUrl="ClaimActivity.aspx"/>
		</td>
    </tr>
  </table>      
  </div>
</div>
</form>
</body>
</html>
