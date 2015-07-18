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
      <td align="center" class="tdtopihijau2">REQUEST FOR FUNDING LIST</td>
      <td width="10" class="tdtopihijau2kanan">&nbsp;</td>
    </tr>
  </table>
	<asp:GridView  Width="95%" runat="server" id="grdAgreement" DataSourceID="XmlDataSource2" AutoGenerateColumns="False" ShowFooter="true">
		<Columns>
			<asp:templatefield HeaderText="AGREEMENT NO">
				<ItemTemplate>
					<asp:HyperLink runat="server" id="HypAgreementNo" NavigateUrl="../Credit/ViewAgreement.htm">xxxxx20xxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="CUSTOMER NAME">
				<ItemTemplate>
					<asp:HyperLink runat="server" id="hypCustName" NavigateUrl="../Credit/ViewPersonalCustomer.htm">xxxxx30xxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:boundfield DataField="valstring20" HeaderText="DESCRIPTION" SortExpression="valstring20">
			</asp:boundfield>
			<asp:boundfield DataField="valdate" HeaderText="APPROVAL DATE" SortExpression="valdate">
				<ItemStyle HorizontalAlign="Center" />
			</asp:boundfield>
			<asp:templatefield HeaderText="REQUEST DATE">
				<ItemTemplate>
					<asp:HyperLink runat="server" id="hypRequestDate" NavigateUrl="../Credit/ViewRequestFunding.htm">dd-mm-yyyy
					</asp:HyperLink>
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center" />
			</asp:templatefield>
			<asp:templatefield FooterText="TOTAL" HeaderText="APP STEP">
				<ItemTemplate>
					<asp:Label runat="server" id="lblAppStep" Text="xx3xx">
					</asp:Label>
				</ItemTemplate>
				<FooterTemplate>
					<asp:Label runat="server" id="lblFooterTotalAmountText" Text="TOTAL" Font-Bold="true" />
				</FooterTemplate>				
				<ItemStyle HorizontalAlign="Center" />
				<FooterStyle HorizontalAlign="Right" />				
			</asp:templatefield>
			<asp:templatefield FooterText="TOTAL" HeaderText="AMOUNT">
				<ItemTemplate>
					<asp:Label runat="server" id="lblAmount" Text="999,999,999.99">
					</asp:Label>
				</ItemTemplate>
				<FooterTemplate>
					<asp:Label runat="server" id="lblFooterTotalAmount" Text="999,999,999,999.99" Font-Bold="true" />
				</FooterTemplate>				
				<ItemStyle HorizontalAlign="Right" />
				<FooterStyle HorizontalAlign="Right" />				
			</asp:templatefield>
		</Columns>
		<HeaderStyle CssClass="tdjudulhijau2" />	
		<AlternatingRowStyle CssClass="tdgenap" />			
	</asp:GridView>
  	<asp:XmlDataSource runat="server" ID="XmlDataSource2" DataFile="../DataType.xml">
  	</asp:xmldatasource>	

  <table width="95%" height="25" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><asp:Image runat="server" id="imbFirstPage" ImageUrl="../images/butkiri1.gif" /></td>
      <td width="30" align="center">  <asp:Image runat="server" id="imbpreviouspage" ImageUrl="../images/butkiri.gif" /></td>
      <td width="30" align="center">  <asp:Image runat="server" id="imbnextpage" ImageUrl="../images/butkanan.gif" /></td>
      <td width="30" align="center">  <asp:Image runat="server" id="imblastpage" ImageUrl="../images/butkanan1.gif" /></td>
      <td align="center" style="width: 318px">Page 
         &nbsp; 
       <asp:TextBox runat="server" id="txtgo" CssClass="inptype" MaxLength="5" Width="10%"></asp:TextBox>
        <asp:Image runat="server" id="imggo" ImageUrl="../images/butgo.gif" />
	</td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
<br>  
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijau2kiri">&nbsp;</td>
      <td align="center" class="tdtopihijau2">TRANSFER REQUEST FOR FUNDING</td>
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
      <td class="tdgenap" style="width: 20%">Branch Bank Account</td>
      <td class="tdganjil" style="width: 30%">
      	Account Branch 1</td>
      <td class="tdgenap" style="width: 20%"> Branch OS Amount</td>
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
		<asp:ImageButton runat="server" id="imbSave" ImageUrl="../images/buttonSave.gif" PostBackUrl="TransferRequestForFunding.aspx"/>
		<asp:ImageButton runat="server" id="imbCancel" ImageUrl="../images/buttonCancel.gif" PostBackUrl="TransferRequestForFunding.aspx" /> 
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
