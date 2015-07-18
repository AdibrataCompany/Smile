<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html xmlns:v="urn:schemas-microsoft-com:vml" xmlns:o="urn:schemas-microsoft-com:office:office">
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
<form runat="server" id="FormAssetDocumentReceiveDetail">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopimerahkiri">&nbsp;</td>
      <td align="center" class="tdtopimerah">ASSET DOCUMENT COLLATERAL RECEIVE</td>
      <td width="10" class="tdtopimerahkanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
     <tr> 
      <td width="20%" class="tdgenap">Application ID</td>
      <td width="30%" class="tdganjil"><asp:Hyperlink runat="server" ID="lblApplicationID" Text="xxxxx20xxxxx" NavigateUrl=""></asp:Hyperlink ></td>
      <td width="20%" class="tdgenap">(Asset No) Asset Description</td>
      <td width="30%" class="tdganjil"><asp:Label runat="server" ID="lblAssetDescription" Text="(x2x) xxxxx50xxxxx"></asp:Label></td>
      

    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Agreement No</td>
      <td width="30%" class="tdganjil"><asp:Hyperlink runat="server" ID="lblAgreementNo" Text="xxxxx20xxxxx"  NavigateUrl=""></asp:Hyperlink ></td>
      <td width="20%" class="tdgenap">License Plate</td>
      <td width="30%" class="tdganjil"><asp:Label runat="server" ID="lblLicensePlate" Text="xxxxx50xxxxx"></asp:Label></td>
    </tr>
     <tr> 
      <td width="20%" class="tdgenap">Customer Name</td>
      <td width="30%" class="tdganjil" ><asp:Hyperlink runat="server" ID="lblCustomerName" Text="xxxxx50xxxxx"  NavigateUrl=""></asp:Hyperlink >     
      <td width="20%" class="tdgenap">Engine No</td>
      <td width="30%" class="tdganjil"><asp:Label runat="server" ID="lblEngineNo" Text="xxxxx50xxxxx"></asp:Label></td>
    </tr>
     <tr> 
      <td width="20%" class="tdgenap">Supplier Name</td>
      <td width="30%" class="tdganjil" ><asp:Hyperlink runat="server" ID="lblSupplierName" Text="xxxxx50xxxxx"  NavigateUrl=""></asp:Hyperlink >     
      <td width="20%" class="tdgenap">Chassis No</td>
      <td width="30%" class="tdganjil"><asp:Label runat="server" ID="lblChassisNo" Text="xxxxx50xxxxx"></asp:Label></td>
    </tr>

  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tdjudulmerah">
    <tr>
      <td width="100%" align="center"><div align="justify"> 
          <p class="tdjudulmerah">REGISTRATION</p>
      </div></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap">Receive Date</td>
      <td class="tdganjil"><asp:TextBox runat="server" ID="txtReceiveDate" Text="dd/mm/yyyy" CssClass="inptype"></asp:TextBox >     
      		<asp:ImageButton  ImageUrl="../Images/iconcalendar.gif" ID="ucDocumentDate" runat="server"></asp:ImageButton  ></td>
      <td class="tdgenap">Receive From</td>
      <td class="tdganjil"><asp:TextBox runat="server" ID="txtReceiveFrom" Text="xxxxx50xxxxx" CssClass="inptype"></asp:TextBox >  </td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Rack Location</td>
      <td width="30%" class="tdganjil"><asp:DropDownList ID="ddlRackLocation" runat="server">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="xxxxx50xxxxxx" Value="1"></asp:ListItem></asp:DropDownList>
      </td>
      <td width="20%" class="tdgenap">Filling Location</td>
      <td width="30%" class="tdganjil"><asp:DropDownList ID="ddlFillingLocation" runat="server">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="xxxxx50xxxxxx" Value="1"></asp:ListItem></asp:DropDownList>
</td>
    </tr>
    </table>
<br>
   
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopimerahkiri">&nbsp;</td>
      <td align="center" class="tdtopimerah">DOCUMENT LIST</td>
      <td width="10" class="tdtopimerahkanan">&nbsp;</td>
    </tr>
  </table>
   <div align="center">
   <asp:GridView runat="server" id="GrdListAgreement"  AllowSorting="True" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield HeaderText="DOCUMENT NAME">
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				<asp:Label runat="server" ID="lblDocumentName" Text="xxxxxxx50xxxxxxx"></asp:Label>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="DOCUMENT NO">
			<AlternatingItemTemplate>
				<asp:Label runat="server" ID="txtDocumentNo" Text="xxxxx50xxxxx" ></asp:Label>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				<asp:TextBox runat="server" ID="txtDocumentNo" Text="xxxxx50xxxxx" CssClass="inptype" Enabled="true"></asp:TextBox >
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="DOCUMENT DATE">
			<AlternatingItemTemplate>
				dd/mm/yyyy
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				<asp:TextBox runat="server" ID="txtDocumentNo" Text="dd/MM/yyyy" CssClass="inptype" Enabled="true"></asp:TextBox >
				<asp:ImageButton runat="server" id="ImageButton1" ImageUrl="../Images/iconcalendar.gif" />
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="1st RECEIVE DATE">
			<AlternatingItemTemplate>
				dd/mm/yyyy
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				-
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="STATUS">
			<AlternatingItemTemplate>
				OnHand
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				Waiting
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="valdate" HeaderText="STATUS DATE">
		</asp:boundfield>
		<asp:templatefield HeaderText="RECEIVE">
			<AlternatingItemTemplate>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				<asp:CheckBox runat="server" id="CheckBox1" />
			</ItemTemplate>
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
    	<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
		</asp:XmlDataSource>
    </div>

    
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" align="left">
		&nbsp;</td>
	  <td width="50%" align="right">&nbsp;
	  <asp:ImageButton id="imbSaveExit" imageurl="../Images/ButtonSave.gif" runat="server" PostBackUrl="AssetDocumentReceive.aspx"></asp:ImageButton>
		&nbsp;<asp:ImageButton id="imbCancel" imageurl="../Images/ButtonCancel.gif" runat="server" PostBackUrl="AssetDocumentReceive.aspx"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <p>&nbsp;</p>
</div>
</form>
</body>
</html>
