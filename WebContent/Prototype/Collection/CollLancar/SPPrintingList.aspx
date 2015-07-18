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
.style3 {
	text-align: left;
}
.style5 {
	text-align: left;
	color: #FF0000;
}
.style4 {
	color: #FF0000;
}
</style>
</head>

<body>
<form id="FrmSPPrinting" runat="server">
<div align="center">
  <table style="width: 100%">
	<tr>
		<td class="style5">&nbsp;&nbsp;&nbsp; <font color="red"><i>*)&nbsp;&nbsp; required field</i></font></td>
	</tr>
	</table>
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
       <td class="tdgenap" align="left">SP Type</td>
      <td class="tdganjil" align="left" colspan="3"><asp:CheckBoxList ID="chkSPType" runat="server" RepeatDirection="Vertical" >
      <asp:ListItem Text="SP1" Value="SP1"></asp:ListItem>
      <asp:ListItem Text="SP2" Value="SP2"></asp:ListItem>
      <asp:ListItem Text="SP3" Value="SP3"></asp:ListItem>
      <asp:ListItem Text="SPPU" Value="SPPU"></asp:ListItem></asp:CheckBoxList ></td>
      
     </td>
    </tr>


  </table>
  <br />
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">SP PRINTING - LISTING</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <asp:GridView runat="server" id="GrdViewSuratKuasaPrinting" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
		<Columns>
			<asp:boundfield DataField="valstring20" SortExpression="valstring20" HeaderText="AGREEMENT NO">
			</asp:boundfield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="CUSTOMER NAME">
			</asp:boundfield>
			<asp:boundfield DataField="valdate" SortExpression="valdate" HeaderText="DUE DATE">
			</asp:boundfield>
			<asp:boundfield DataField="valamount" SortExpression="valamount" HeaderText="AMOUNT OVERDUE">
			</asp:boundfield>
			<asp:boundfield DataField="valamount" SortExpression="valamount" HeaderText="OVERDUE DAYS">
			</asp:boundfield>
			<asp:boundfield DataField="valstring30" SortExpression="valstring30" HeaderText="RECOMMEND SP TYPE">
			<ItemStyle HorizontalAlign="Left"></ItemStyle>
			</asp:boundfield>

			<asp:boundfield DataField="valamount" SortExpression="valamount" HeaderText="LATE CHARGES">
			</asp:boundfield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="COLLECTOR">
			</asp:boundfield>
			<asp:templatefield HeaderText="ACTION">
			<AlternatingItemTemplate>
				<asp:LinkButton id="lnkAction" Runat="server" CausesValidation="false" text="Print" CommandName="View" PostBackUrl="SPPrintingList.aspx">Print</asp:LinkButton>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:LinkButton id="lnkAction" Runat="server" CausesValidation="false" text="Print" CommandName="View" PostBackUrl="SPPrintingList.aspx">Print</asp:LinkButton>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>

		</Columns>
		<HeaderStyle CssClass="tdjudulungu" />
		<AlternatingRowStyle CssClass="tdgenap" />
		</asp:GridView>
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
    </div>
    
  </div>
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnFirstPrev" ImageUrl="../../images/butkiri1.gif" Width="20px" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnPrev" ImageUrl="../../images/butkiri.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnNext" ImageUrl="../../images/butkanan.gif" Width="20px" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnLastNext" ImageUrl="../../images/butkanan1.gif" /></td>
      <td width="130" align="center">Page&nbsp;
		<asp:TextBox runat="server" id="TbnPage" Width="20px" CssClass="inptype">
		</asp:TextBox>
&nbsp;&nbsp; 
        <asp:ImageButton runat="server" id="BtnGo" ImageUrl="../../images/buttonGO.gif" /></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30" class="style3">
		&nbsp;
		</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnNextSp" ImageUrl="../../images/ButtonNext.gif" PostBackUrl="RptSPInputParameter.aspx" /></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
