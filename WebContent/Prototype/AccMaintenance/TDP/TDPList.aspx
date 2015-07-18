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
<%@ Import Namespace="System.Configuration" %>
<%@ Import Namespace="System.Data.SqlClient" %>
<%@ Import Namespace="System.Data" %>
<%@ Import Namespace="System.Text.RegularExpressions" %>
<%@ Import Namespace="System.Text" %>
<%@ Import Namespace="System.IO" %>

<form id="frm1" runat="server">
<SCRIPT language="vb" runat="server">
   	
</script>
<div align="center">
<table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>Notes : Find from Agreement where 
		ContractStatus = 'PRP'&nbsp; and application step in ('APR','POP','DLO' )<br>
		Join AgreementAssetsupplier Distinct paid to supplier yang isinya 'NO'</i></font></td>
    </tr>
  </table>

  <div align="center"> 
    <table width="95%" border="0" cellspacing="0" cellpadding="0">
      <tr class="trtopikuning"> 
        <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
        <td align="center" class="tdtopibiru">TDP AMOUNT RECEIVE</td>
        <td width="10" class="tdtopibirukanan">&nbsp;</td>
      </tr>
    </table>
  </div>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap">Branch</td>
      <td class="tdganjil"><select name="select3">
          <option selected>Head Office</option>
          <option>Kelapa Gading</option>
          <option>Fatmawati</option>
        </select> <font size="-1"><b></b></font></td>
    </tr>
    <tr> 
      <td width="15%" class="tdgenap">Search By</td>
      <td class="tdganjil"><select name="select">
          <option selected>Name</option>
          <option>Application ID</option>
          <option>Agreement No</option>
          <option>Address</option>
          <option>TDP Amount</option>
        </select> <input name="textfield32" type="text" class="inptype" size="15"></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" style="height: 30px"></td>
      <td width="50%" align="right" style="height: 30px"><img src="../../Images/ButtonSearch.gif" width="100" height="20" border="0"> 
        <img src="../../Images/ButtonReset.gif" width="100" height="20" border="0"> 
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">AGREEMENT LISTING</td>
      <td width="10" class="tdtopibirukanan">&nbsp;</td>
    </tr>
  </table>
  
  <table width="95%" border="0" cellpadding="3" cellspacing="1" align="center">
    <tr>
    <td>
   <asp:GridView runat="server" id="grdAgreementList" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="100%" >
    <Columns>
		<asp:templatefield HeaderText="APPLICATION ID">
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomerName" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="valstring20" SortExpression="valstring20" HeaderText="AGREEMENT NO">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="NAME">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="ADDRESS">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="STEP">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="CURRENCY">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:boundfield DataField="valnum9" SortExpression="valnum9" HeaderText="TDP AMOUNT">
			<ItemStyle HorizontalAlign="Right" />
		</asp:boundfield>
		<asp:templatefield HeaderText="ACTION">
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="hypAction" ImageUrl="../../images/IconEdit.gif" NavigateURL="TDPReceive.aspx" />
			</ItemTemplate>
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulbiru" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
		</td>
		</tr>
	</table>
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
  <table align="center" width="95%">
  <tr>
  <td align="left">
   <asp:HyperLink ID="imbSave" runat="server" ImageUrl="../../Images/ButtonBack.gif" NavigateUrl="PaymentReceiveWayOfPayment.aspx" ></asp:HyperLink>
  </td>
  </tr>
  </table>
</form>
</body>
</html>
