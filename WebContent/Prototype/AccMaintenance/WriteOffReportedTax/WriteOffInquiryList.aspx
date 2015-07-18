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
<form id="form1" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">WRITE OFF INQUIRY</td>
      <td width="10" class="tdtopibirukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap" style="height: 32px">Branch</td>
      <td class="tdganjil" style="height: 32px; width: 32%"><select name="select">
          <option selected>Head Office</option>
        </select></td>
      <td width="20%" class="tdgenap" style="height: 32px">Request Date</td>
      <td width="30%" class="tdganjil" style="height: 32px"><input name="textfield32" type="text" class="inptype" size="15"> 
        <img src="../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"></td>
    </tr>
    <tr>
      <td class="tdgenap">Status</td>
      <td class="tdganjil"><select name="select5">
          <option selected>All</option>
          <option>Request</option>
          <option>Approve</option>
          <option>Cancel</option>
          <option>Reject</option>
        </select></td>
      <td class="tdgenap">Currency ID</td>
      <td class="tdganjil"><select name="select6">
          <option selected>Select One</option>
          <option>Rupiah</option>
          <option>Dollar</option>
        </select></td>
      </tr>
    <tr> 
      <td class="tdgenap">Search By</td>
      <td class="tdganjil" style="width: 32%"><select name="select4">
          <option selected>Select One</option>
          <option>Request No</option>
          <option>Agreement No</option>
          <option>Customer Name</option>
        </select> <input name="textfield3" type="text" class="inptype" size="20"></td>
      <td width="25%" class="tdgenap">&nbsp;</td>
      <td class="tdganjil">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><img src="../../Images/ButtonSearch.gif" width="100" height="20" border="0"> 
        <img src="../../Images/ButtonReset.gif" width="100" height="20" border="0"> 
      </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">WRITE OFF LISTING</td>
      <td width="10" class="tdtopibirukanan">&nbsp;</td>
    </tr>
  </table>
  
  
   <asp:GridView runat="server" id="grdAgreementList" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="100%" >
    <Columns>
		<asp:templatefield HeaderText="ACTION">
			<ItemTemplate>
				<asp:CheckBox runat="server" id="lnkCustomerName"></asp:CheckBox>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:boundfield DataField="valstring20" HeaderText="WRITE OFF#" SortExpression="valstring20">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" HeaderText="AGREEMENT NO" SortExpression="valstring50">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" HeaderText="CUSTOMER NAME" SortExpression="valstring50">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield  DataField="valamount" HeaderText="WO AMOUNT" SortExpression="valstring3">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valdate" HeaderText="REQUEST DATE" SortExpression="valdate">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		</Columns>
			<HeaderStyle CssClass="tdjudulbiru" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
  
  		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>

 
  <table width="95%" border="0" cellpadding="3" cellspacing="1">
    <tr> 
      <td align="right">
       <img src="../../Images/ButtonSave.gif" width="100" height="20" border="0"><br>
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
  
  
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">&nbsp; </td>
    </tr>
  </table>
  
</div>
</form>
</body>
</html>
