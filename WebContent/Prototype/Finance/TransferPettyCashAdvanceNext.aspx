<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
<style type="text/css">
.style1 {
	text-align: left;
}
</style>
</head>
<body>
<form id="form1" runat="server">
<div align="center" class="style1">
<br>  
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijau2kiri">&nbsp;</td>
      <td align="center" class="tdtopihijau2">PETTY CASH ADVANCE LISTING</td>
      <td width="10" class="tdtopihijau2kanan">&nbsp;</td>
    </tr>
  </table>
				<TABLE class="tablegrid" id="tbl" cellSpacing="1" cellPadding="3" width="95%" border="0">
				<tr>
					<TD class="tdgenap" width="20%">Employee Name</TD>
					<TD class="tdganjil" width="30%">
					<asp:Label id="lblEmployeeName0" runat="server">xxxxx20xxxxx</asp:Label>
					</TD>
					<TD class="tdgenap" colspan="2">Date</TD>
					<TD class="tdganjil" width="30%">
					<asp:Label id="lblDate0" runat="server">dd/mm/yyyy</asp:Label>
					</TD>
				</tr>
				<tr>
					<TD class="tdgenap" width="20%">Non Operational</TD>
					<TD class="tdganjil" width="30%">Yes</TD>
					<TD class="tdgenap" colspan="2">Currency</TD>
					<TD class="tdganjil" width="30%">
					<asp:Label id="lblCurrency0" runat="server">IDR</asp:Label>
					</TD>
				</tr>
				<tr>
					<TD class="tdgenap" width="20%">Amount</TD>
					<TD class="tdganjil" colspan="4">
					<asp:Label id="lblAmount0" runat="server">999,999,999.99</asp:Label>
					</TD>
				</tr>
				<TR>
				<TD class="tdgenap" width="20%">Description</TD>
				<TD class="tdganjil" colSpan="4">
				<asp:Label id="lblDesc" runat="server">xxxxxxxxxx50xxxxxxxxxx</asp:Label>
				</TD>
				</TR>
					<TR>
					<TD class="tdjudulhijau2" colspan="5" style="width: 50%">APPROVAL DETAIL</TD>
					</TR>
					<tr>
						<TD class="tdgenap">Reason</TD>
						<TD class="tdganjil">xxxxx20xxxxx</TD>
						<TD class="tdgenap">Approved By</TD>
						<TD class="tdganjil" colspan="2">xxxxx20xxxxx</TD>
					</tr>
					<tr>
						<TD class="tdgenap">Approval Date</TD>
						<TD class="tdganjil">dd/mm/yyyy</TD>
						<TD class="tdgenap">Alternate User</TD>
						<TD class="tdganjil" colspan="2">xxxxx20xxxxx</TD>
					</tr>
					<tr>
						<TD class="tdgenap">Approval Recommendation</TD>
						<TD class="tdganjil" colspan="4">
						<asp:TextBox runat="server" id="txtAprRecomm" CssClass="inptype" TextMode="MultiLine" Width="380px" Height="40px" Enabled="False">
						</asp:TextBox>
						</TD>
					</tr>
				</table>
  	<asp:XmlDataSource runat="server" ID="XmlDataSource2" DataFile="../DataType.xml">
  	</asp:xmldatasource>	

<br>  
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijau2kiri">&nbsp;</td>
      <td align="center" class="tdtopihijau2">TRANSFER PETTY CASH ADVANCE</td>
      <td width="10" class="tdtopihijau2kanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" style="width: 20%">Request Branch</td>
      <td align="left" class="tdganjil" style="width: 30%">
      	Palmerah</td>
      <td class="tdgenap" style="width: 20%">Total Amount Transfer</td>
      <td width="25%" class="tdganjil" align="right">
		999,999,999,999.99</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Reference No</td>
      <td class="tdganjil" style="width: 30%">
          <asp:TextBox runat="server" id="txtReferenceNo" CssClass="inptype" Width="150px">
			</asp:TextBox>
			</td>
      <td class="tdgenap" style="width: 20%"> Value Date</td>
      <td width="25%" class="tdganjil"> 
          <asp:TextBox runat="server" id="txtValueDate" CssClass="inptype" Width="100px">
			</asp:TextBox>
			&nbsp;<img src="../Images/iconcalendar.gif"></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Bank Account From</td>
      <td class="tdganjil">
          	<asp:DropDownList runat="server" id="ddlBankAccountFrom">
			<asp:ListItem>Select One</asp:ListItem>
		</asp:DropDownList>
        </td>
      <td class="tdgenap">Bank Account To</td>
      <td class="tdganjil">
          	<asp:DropDownList runat="server" id="ddlBankAccountTo">
			<asp:ListItem>Select One</asp:ListItem>
		</asp:DropDownList>
   	  </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Bilyet Giro No</td>
      <td class="tdganjil">
       	<asp:DropDownList runat="server" id="ddlBilyetGiro">
			<asp:ListItem>Select One</asp:ListItem>
		</asp:DropDownList>
        </td>
      <td class="tdgenap">
          	Due Date</td>
      <td class="tdganjil">
          <asp:TextBox runat="server" id="txtDueDate" CssClass="inptype" Width="100px">
			</asp:TextBox>
			&nbsp;<img src="../Images/iconcalendar.gif"></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Notes</td>
      <td class="tdganjil" colspan="3">
          <asp:TextBox runat="server" id="txtNotes" CssClass="inptype" Width="450px" TextMode="MultiLine">
			</asp:TextBox>
        </td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="imbSave" ImageUrl="../images/buttonSave.gif" PostBackUrl="TransferPettyCashAdvance.aspx"/>
		<asp:ImageButton runat="server" id="imbCancel" ImageUrl="../images/buttonCancel.gif" PostBackUrl="TransferPettyCashAdvance.aspx" /> 
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
