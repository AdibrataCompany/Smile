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
<form id="frmBPKBBlock" runat="server">
<div align="center">
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">BRE ASSIGNMENT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
   
    <tr> 
      <td width="25%" class="tdgenap">BRE Name</td>
      <td class="tdganjil"><asp:TextBox id="txtEmployeeName" runat="server" CssClass="inptype"></asp:TextBox>
			<asp:HyperLink runat="server" id="LinkZipCode" ImageUrl="../../images/IconDetail.gif" NavigateUrl="../../Setting/Organization/ZipCodeLookUp.aspx" Target="_blank" ToolTip="Untuk mengisi kolom Kelurahan, Kecamatan, City &amp; Zip Code">
		</asp:HyperLink>
		</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><img src="../../Images/ButtonSearch.gif" width="100" height="20" border="0"> 
        <img src="../../Images/ButtonReset.gif" width="100" height="20" border="0" align="absmiddle"> 
      </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">BRE LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="100%">
    <tr> 
    <td align="center">
        <asp:GridView runat="server" id="grdListAgreementAsset" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
    		
		<asp:templatefield HeaderText="BRE NAME">
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAgreementNo" Target="_blank">xxxxxxxx50xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>

		<asp:templatefield HeaderText="ACTION">
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				<asp:HYperlink runat="server" id="hypRequest" ImageUrl="../../Images/iconedit.jpg"  NavigateUrl="SupplierBRE_SupplierList.aspx"/>
			</ItemTemplate>
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
      
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>

    </td>
    </tr>
   
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
</div>
</form>
<p>
&nbsp;</p>
</body>
</html>
