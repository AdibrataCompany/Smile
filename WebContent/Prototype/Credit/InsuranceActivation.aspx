<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1"%>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head>
<body>
<div align="center">
<form id="frmCustomerComplainList" runat="server">

  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">INSURANCE ACTIVATION</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Search By</td>
      <td width="30%" class="tdganjil"><asp:DropDownList runat="server" ID="ddlSearchBy">
      <asp:ListItem Text="Customer Name" Value="Customer.Name"></asp:ListItem>
      <asp:ListItem Text="Agreement No" Value="AgreementNo"></asp:ListItem>
      <asp:ListItem Text="Marketing Name" Value="Marketing.Name"></asp:ListItem>
      <asp:ListItem Text="Supplier Name" Value="Supplier.Name"></asp:ListItem></asp:DropDownList>
      <asp:TextBox ID="txtSearchBy" runat="server" CssClass="inptype"></asp:TextBox>
      </td>
      <td width="20%" class="tdgenap">Approval Date</td>
      <td width="30%" class="tdganjil"><asp:Textbox runat="server" ID="txtApprovalDate" CssClass="inptype"></asp:Textbox>
          				<asp:imagebutton id="imbCalendar" runat="server" ImageUrl="../images/iconcalendar.gif" CausesValidation="False"></asp:imagebutton></td>
    </tr>
  </table>
 <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbSearchPO" imageurl="../Images/ButtonSearch.gif" runat="server" PostBackUrl="InsuranceActivation.aspx"></asp:ImageButton>
		<asp:ImageButton id="imbResetPO" imageurl="../Images/ButtonReset.gif" runat="server"  PostBackUrl="InsuranceActivation.aspx"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">AGREEMENT LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <asp:GridView runat="server" id="GrdAgreementList" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield HeaderText="AGREEMENT NO">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkAgreementNo" NavigateUrl="../Credit/ViewAgreement.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAgreementNo" NavigateUrl="../Credit/ViewAgreement.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="CUSTOMER NAME">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomerName" NavigateUrl="../Credit/ViewCustomer.htm" Target="_blank">xxxxxxxx50xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomerName" NavigateUrl="../Credit/ViewCustomer.htm" Target="_blank">xxxxxxxx50xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="MARKETING NAME">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkMarketingName" NavigateUrl="../Marketing/AOView.htm" Target="_blank">xxxxxxxx50xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkMarketingName" NavigateUrl="../Marketing/AOView.htm" Target="_blank">xxxxxxxx50xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>

		<asp:boundfield DataField="valstring3" HeaderText="CURRENCY" SortExpression="valstring3">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valnum9" HeaderText="INSTALLMENT AMOUNT" SortExpression="valnum9">
			<ItemStyle HorizontalAlign="Right" />
		</asp:boundfield>
		<asp:boundfield DataField="valdate" HeaderText="APPROVAL DATE" SortExpression="valdate">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>


		<asp:templatefield HeaderText="ACTION">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="hypInsuranceActivation" NavigateUrl="InsuranceActivationProcess.aspx" Target="_self">Insurance Activation</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:HyperLink runat="server" id="hypInsuranceActivation" NavigateUrl="InsuranceActivationProcess.aspx" Target="_self">Insurance Activation</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
      
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
		</asp:XmlDataSource>
    </div>

  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><img src="../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  
  </form>
</div>
</body>
</html>
