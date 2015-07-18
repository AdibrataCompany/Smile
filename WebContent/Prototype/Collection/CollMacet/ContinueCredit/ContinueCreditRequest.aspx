<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head>
<body>
<form runat="server" id="frmContinueCreditRequest">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">CONTINUE CREDIT REQUEST</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" width="25%"> <div align="left">Collection Group</div></td>
      <td class="tdganjil" width="25%"> <select name="select3">
          <option selected>CG Jakarta</option>
        </select> </td>
      <td class="tdgenap" width="25%">Search By</td>
      <td class="tdganjil" width="25%"><a href="javascript:;" onClick="MM_openBrWindow('../AccMaintenance/AgreementView.htm','Agreement','scrollbars=yes,width=900,height=700')"> 
        </a> <select name="select">
          <option selected>Select One</option>
          <option>Agreement No</option>
          <option>Customer Name</option>
        </select> <input name="textfield" type="text" class="inptype"> </td>
    </tr>
    <tr> 
      <td class="tdgenap">Branch</td>
      <td class="tdganjil"><select name="select2">
          <option selected>Palmerah</option>
        </select></td>
      <td class="tdgenap">Status</td>
      <td class="tdganjil"><select name="select2" style="width: 119px">
          <option selected>All</option>
          <option >New</option>
          <option >Reject</option>
        </select></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr align="right"> 
      <td><img src="../../../Images/ButtonSearch.gif" width="100" height="20"><img src="../../../Images/ButtonReset.gif" width="100" height="20"></td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">CONTINUE CREDIT REQUEST LISTING</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <asp:GridView runat="server" id="GrdListAgreement"  AllowSorting="True" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield SortExpression="valstring20" HeaderText="AGREEMENT NO">
			<ItemStyle HorizontalAlign="center" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAgreementno" NavigateUrl="../../../AccMaintenance/AgreementView.htm" Target="_blank">xxxx20xxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield SortExpression="valstring20" HeaderText="CUSTOMER NAME">
			<ItemStyle HorizontalAlign="center" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAgreementno" NavigateUrl="../../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx50xxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>

		<asp:templatefield SortExpression="valstring20" HeaderText="COLLECTOR ID">
			<ItemStyle HorizontalAlign="center" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAgreementno" NavigateUrl="" Target="_blank">xxxx10xxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>

		<asp:boundfield DataField="valstring20" SortExpression="valstring20" HeaderText="O/S BALANCE">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring20" SortExpression="valstring20" HeaderText="STATUS">
		</asp:boundfield>
		

		<asp:templatefield HeaderText="REQUEST">
			<ItemStyle HorizontalAlign="Center"></ItemStyle>
			<ItemTemplate>
				<asp:ImageButton id="ImbEdit" runat="server" ImageUrl="../../../Images/iconRequest.gif" PostBackUrl="ContinueCreditAssetList.aspx"></asp:ImageButton>
			</ItemTemplate>
			</asp:templatefield >
		
	</Columns>
			<HeaderStyle CssClass="tdjudulungu" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
      
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../../DataType.xml">
		</asp:XmlDataSource>
    </div>

 
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><img src="../../../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../../images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../../../images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>

  

  
  
  
</div>
</form>
</body>
</html>
