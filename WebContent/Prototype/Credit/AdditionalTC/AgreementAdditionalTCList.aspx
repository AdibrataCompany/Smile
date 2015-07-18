<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>ASSETDOCUMENT</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head>
<body>
<form id="FrmAssetDocumentRelease" runat="server">
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
      <td width="20%" class="tdgenap">Branch</td>
      <td width="30%" class="tdganjil"><asp:Hyperlink runat="server" ID="lblBranch" Text="xxxxx20xxxxx" NavigateUrl=""></asp:Hyperlink ></td>
      <td width="20%" class="tdgenap">Customer Name</td>
      <td width="30%" class="tdganjil"><asp:Label runat="server" ID="lblCustomerName" Text="xxxxx50xxxxx"></asp:Label></td>
    </tr>

    <tr> 
      <td width="20%" class="tdgenap">Application ID</td>
      <td width="30%" class="tdganjil"><asp:Hyperlink runat="server" ID="lblApplicationID" Text="xxxxx20xxxxx" NavigateUrl=""></asp:Hyperlink ></td>
      <td width="20%" class="tdgenap">Application Step</td>
      <td width="30%" class="tdganjil"><asp:Label runat="server" ID="lblApplicationStep" Text="xx3xx"></asp:Label></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Agreement No</td>
      <td width="30%" class="tdganjil"><asp:Hyperlink runat="server" ID="lblAgreementNo" Text="xxxxx20xxxxx"  NavigateUrl=""></asp:Hyperlink ></td>
      <td width="20%" class="tdgenap">Contract Status</td>
      <td width="30%" class="tdganjil"><asp:Label runat="server" ID="lblContractStatus" Text="xx3xx"></asp:Label></td>
    </tr>
  </table>

</div>
<div align="center"> 
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">AGREEMENT ADDITIONAL T/C LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <asp:GridView runat="server" id="GrdViewSpBpkbToDealer" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
	<Columns>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="TERM & CONDITION">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="PRIOR TO">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valyesno" SortExpression="valyesno" HeaderText="MANDATORY">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:templatefield HeaderText="EDIT">
				<AlternatingItemTemplate>
						<asp:ImageButton runat="server" id="BtnIcoEdit2" ImageUrl="../../Images/IconEdit.gif" PostBackUrl="AgreementAdditionalTCEdit.aspx" />
				</AlternatingItemTemplate>
				<ItemStyle Width="5%" HorizontalAlign="Center"/>
				<HeaderStyle Width="5%" />
				<ItemTemplate>
						<asp:ImageButton runat="server" id="BtnIcoEdit1" ImageUrl="../../Images/IconEdit.gif" PostBackUrl="AgreementAdditionalTCEdit.aspx" />
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="CANCEL">
				<AlternatingItemTemplate>
						<asp:ImageButton runat="server" id="BtnIcoDelete" ImageUrl="../../Images/IconDelete.gif" PostBackUrl="AgreementAdditionalTCCancel.aspx"/>
				</AlternatingItemTemplate>
				<ItemStyle Width="5%" HorizontalAlign="Center"/>
				<HeaderStyle Width="5%" />
				<ItemTemplate>
						<asp:ImageButton runat="server" id="BtnIcoDelete" ImageUrl="../../Images/IconDelete.gif" PostBackUrl="AgreementAdditionalTCCancel.aspx"/>
				</ItemTemplate>
			</asp:templatefield>
			


		
	</Columns>
	<HeaderStyle CssClass="tdjudulhijau" />
	<AlternatingRowStyle CssClass="tdgenap" />
	</asp:GridView>
	<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
	</asp:XmlDataSource>
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnFirstPrev" ImageUrl="../../Images/butkiri1.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnPrev" ImageUrl="../../Images/butkiri.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnNext" ImageUrl="../../Images/butkanan.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnLastNext" ImageUrl="../../Images/butkanan1.gif" /></td>
      <td width="130" align="center">Page&nbsp;
		<asp:TextBox runat="server" id="TbnPage" Width="20px" CssClass="inptype">
		</asp:TextBox>
&nbsp;&nbsp; 
        <asp:ImageButton runat="server" id="BtnGo" ImageUrl="../../Images/butgo.gif" /></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  
  

 <table width="95%" border="0" cellspacing="0" cellpadding="0">
   <tr> 
      <td width="50%" align="left" height="30"><asp:ImageButton id="imbPrintCollateral" imageurl="../../Images/ButtonPrint.gif" postbackurl="AgreementAdditionalTCPrint.aspx" runat="server"></asp:ImageButton></td>
      <td width="50%" align="right"><asp:ImageButton id="imbAddCollateral" imageurl="../../Images/ButtonAdd.gif" postbackurl="AgreementAdditionalTCAdd.aspx" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbCancelCollateral" runat="Server" postbackurl="AgreementAdditionalTC.aspx" imageurl="../../Images/ButtonCancel.gif" ></asp:ImageButton>
      </td>
    </tr>
  </table>
  </div>
</form>
</body>
</html>
