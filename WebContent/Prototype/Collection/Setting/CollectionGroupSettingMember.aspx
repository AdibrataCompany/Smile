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
<form runat="server" id="FrmCollectionGroupSettingEdit">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">COLLECTION GROUP MEMBER</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" width="25%">Collection Group ID</td>
      <td class="tdganjil"> x3x </td>
    </tr>
    <tr> 
      <td class="tdgenap">Collection Group Name</td>
      <td class="tdganjil"> xxxxxxx50xxxxxxx </td>
    </tr>
    <tr> 
      <td class="tdgenap"> <div align="left">Collection Group Head</div></td>
      <td class="tdganjil"> xxxxxxx50xxxxxxx </td>
    </tr>
     </table>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">COLLECTION GROUP MEMBER LISTING</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
   <div align="center">
    <asp:GridView runat="server" id="GrdListAgreement"  AllowSorting="True" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield HeaderText="MEMBER">
			<HeaderTemplate>
				<asp:CheckBox runat="server" id="CheckBox1" />
			</HeaderTemplate>
			<ItemStyle Width="5%" HorizontalAlign="Center" />
			<ItemTemplate>
				<asp:CheckBox runat="server" id="CheckBox1" />
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="BRANCH ID">
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkApplicationid" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank">x3x
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="BRANCH NAME">
		</asp:boundfield>
	</Columns>
			<HeaderStyle CssClass="tdjudulungu" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
      
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
    </div>

     
		

 
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
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif"  />&nbsp;
		&nbsp; 
      </td>
    </tr>
  </table>
  
  
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><a href="javascript:history.go(-1);">&nbsp;<img src="../../Images/ButtonClose.gif" width="100" height="20" border="0"></a> 
      </td>
    </tr>
  </table>

</div>
</form>
</body>
</html>
