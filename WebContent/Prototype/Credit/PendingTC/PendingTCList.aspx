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
      <td align="center" class="tdtopihijau">AGREEMENT PENDING T/C</td>
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
      <td align="center" class="tdtopihijau">AGREEMENT PENDING T/C LISTING</td>
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
		<asp:boundfield DataField="valyesno1" SortExpression="valyesno1" HeaderText="CHECKED">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valyesno" SortExpression="valyesno" HeaderText="MANDATORY">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:templatefield HeaderText="CHECKED DATE">
				<AlternatingItemTemplate>
						<asp:Label runat="server" id="lblCheckedDate" Text="dd/mm/yyyy"/>
				</AlternatingItemTemplate>
				<ItemStyle Width="5%" HorizontalAlign="Center"/>
				<HeaderStyle Width="5%" />
				<ItemTemplate>
						<asp:Label runat="server" id="lblCheckedDate" />
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center"></ItemStyle>
			</asp:templatefield>

		<asp:templatefield HeaderText="PROMISE DATE">
				<AlternatingItemTemplate>
						<asp:Label runat="server" id="lblPromiseDate" />
				</AlternatingItemTemplate>
				<ItemStyle Width="5%" HorizontalAlign="Center"/>
				<HeaderStyle Width="5%" />
				<ItemTemplate>
						<asp:Label runat="server" id="lblPromiseDate" Text="dd/mm/yyyy"/>
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center"></ItemStyle>
			</asp:templatefield>
		<asp:boundfield DataField="valstring100" SortExpression="valstring100" HeaderText="NOTES">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>

		<asp:templatefield HeaderText="">
				<AlternatingItemTemplate>
						<asp:CheckBox runat="server" id="chkReceive" Enabled="false"/>
				</AlternatingItemTemplate>
				<ItemStyle Width="5%" HorizontalAlign="Center"/>
				<HeaderStyle Width="5%" />
				<ItemTemplate>
						<asp:CheckBox runat="server" id="chkReceive" />
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
      <td width="50%" align="left" height="30"><asp:ImageButton id="imbPrintCollateral" imageurl="../../Images/ButtonPrint.gif" postbackurl="PendingTCPrint.aspx" runat="server"></asp:ImageButton></td>
      <td width="50%" align="right"><asp:ImageButton id="imbSavePendingTC" imageurl="../../Images/ButtonSave.gif" postbackurl="PendingTCList.aspx" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbCancelCollateral" runat="Server" postbackurl="PendingTC.aspx" imageurl="../../Images/ButtonCancel.gif" ></asp:ImageButton>
      </td>
    </tr>
  </table>
  </div>
</form>
</body>
</html>
