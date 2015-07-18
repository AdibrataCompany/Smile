<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Untitled Document</title>
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
<form id="frmBPKBBlockirListAsset" runat="server">
<div align="center">
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">BPKB BLOCKIR REQUEST</td>
      <td width="10" class="tdtopibirukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" width="20%">Branch</td>
      <td class="tdganjil"><asp:label ID="lblBranchID" runat="server" Text="Sunter"></asp:label></td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Agreement No</td>
      <td class="tdganjil"><asp:hyperlink ID="hypAgreementNo" runat="server" NavigateUrl="a.aspx" Text="800AG20080800002"></asp:hyperlink></td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Customer Name</td>
      <td class="tdganjil"><asp:hyperlink ID="hypCustomerName" runat="server" NavigateUrl="a.aspx" Text="Customer AdIns00000001"></asp:hyperlink>
    </tr>
  </table>
  
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">&nbsp;ASSET LISTING</td>
      <td width="10" class="tdtopibirukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="100%">
    <tr align="center"> 
    <td>
            <asp:GridView runat="server" id="grdListAgreementAsset" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield HeaderText="ASSET">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkAgreementNo" NavigateUrl="../../Credit/ViewCompanyCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAgreementNo" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="LIC PLATE">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblLicPlate">xxxxx8xxxx
				</asp:label >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblLicPlate">xxxx8xxxx
				</asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="ENGINE NO.">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblEngineNo">xxxxxxxx20xxxxxxxx
				</asp:label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblEngineNo">xxxxxxxx20xxxxxxxx
				</asp:label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="CHASIS NO.">
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblChasisNo">xxxxxxxx20xxxxxxxx
				</asp:Label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lblChasisNo">xxxxxxxx20xxxxxxxx
				</asp:Label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="YEAR">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblYear">xx4xx
				</asp:label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblYear">xx4xx
				</asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
      
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
    </td>
  </table>
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><img src="../../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../../images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><img src="../../Images/ButtonSave.gif" width="100" height="20" border="0"> 
        <img src="../../Images/ButtonCancel.gif" width="100" height="20" border="0"> 
      </td>
    </tr>
  </table>  
  
</div>
</form>
</body>
</html>
