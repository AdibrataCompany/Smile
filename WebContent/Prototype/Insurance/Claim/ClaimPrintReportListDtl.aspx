<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="../../Include/Insurance.css">
<script language="JavaScript">
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
      <td width="10" height="20">
		<img src="../../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">CLAIM LISTING</td>
      <td width="10">
		<img src="../../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
    <asp:GridView runat="server" id="grdClaimRequest" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:boundfield DataField="valstring1" HeaderText="ASSET NO" SortExpression="valstring1">
		</asp:boundfield>
		<asp:boundfield DataField="valstring30" HeaderText="ASSET DESCRIPTION" SortExpression="valstring30">
		</asp:boundfield>
		<asp:boundfield DataField="valstring20" HeaderText="SERIAL NO" SortExpression="valstring20">
		</asp:boundfield>
		<asp:boundfield DataField="valstring20" HeaderText="ENGINE NO" SortExpression="valstring20">
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" HeaderText="LICENSE PLATE" SortExpression="valstring10">
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" HeaderText="CLAIM NO" SortExpression="valstring10">
		</asp:boundfield>
		<asp:boundfield DataField="valdate" HeaderText="REQUEST DATE" SortExpression="valdate">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" HeaderText="CLAIM TYPE" SortExpression="valstring10">
		</asp:boundfield>
		<asp:templatefield HeaderText="PRINT CLAIM FORM">
			<AlternatingItemTemplate>
				<asp:ImageButton runat="server" id="btnPrintClaim" ImageUrl="../../images/IconPrinter.gif" />
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:ImageButton runat="server" id="btnPrintClaim" ImageUrl="../../images/IconPrinter.gif" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>		
	</Columns>
			<HeaderStyle CssClass="tdjudulabu" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
	<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
	</asp:XmlDataSource>
      
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
      <td width="50%" height="30">
		<asp:ImageButton runat="server" id="imbBack" ImageUrl="../../images/buttonBack.gif" PostBackUrl="ClaimPrintReportListDtl.aspx"/></td>
      <td width="50%" align="right">
		&nbsp;</td>
    </tr>
  </table>  
</div>
</form>
</body>
</html>
