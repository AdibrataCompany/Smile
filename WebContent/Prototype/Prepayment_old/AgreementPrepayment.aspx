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
<form id="FrmPrepayment" runat="server">
<div align="center">
  <div align="center"> 
    <table width="95%" border="0" cellspacing="0" cellpadding="0">
      <tr class="trtopikuning"> 
        <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
        <td align="center" class="tdtopibiru">PREPAYMENT REQUEST</td>
        <td width="10" class="tdtopibirukanan">&nbsp;</td>
      </tr>
    </table>
  </div>
  <div>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap">Branch</td>
      <td class="tdganjil"><select name="select">
          <option selected>Head Office</option>
        </select></td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Search By</td>
      <td class="tdganjil"><select name="select2">
          <option selected>Name</option>
          <option>Agreement No</option>
          <option>Application Id</option>
          <option>Address</option>
          <option>Installment</option>
        </select> <input name="textfield322" type="text" class="inptype" size="15"></td>
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
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">AGREEMENT LISTING</td>
      <td width="10" class="tdtopibirukanan">&nbsp;</td>
    </tr>
  </table>
    <div align="center">
    <asp:GridView runat="server" id="GrdListAgreement" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
			<asp:templatefield HeaderText="AGREEMENT NO">
				<AlternatingItemTemplate>
					<asp:HyperLink runat="server" id="lnkAgreementNo" NavigateUrl="../../AccMaintenance/AgreementView.htm" Target="_blank">
					xxxxxxxx20xxxxxxxx
					</asp:HyperLink>
				</AlternatingItemTemplate>
				<ItemStyle HorizontalAlign="Left" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="lnkAgreementNo" NavigateUrl="../../AccMaintenance/AgreementView.htm" Target="_blank">
					xxxxxxxx20xxxxxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="NAME">
				<AlternatingItemTemplate>
					<asp:HyperLink runat="server" id="LinkName" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">
					xxxxxxxx50xxxxxxxx
					</asp:HyperLink>
				</AlternatingItemTemplate>
				<ItemStyle HorizontalAlign="Left" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="LinkName" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">
					xxxxxxxx50xxxxxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="ADDRESS">
				<ItemStyle HorizontalAlign="Left" />
			</asp:boundfield>

			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="STATUS">
				<ItemStyle HorizontalAlign="Left" />
			</asp:boundfield>

			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="INSTALLMENT">
				<ItemStyle HorizontalAlign="Left" />
			</asp:boundfield>

			<asp:templatefield HeaderText="ACTION">
			<ItemStyle HorizontalAlign="Center" />

				<AlternatingItemTemplate>
					<asp:ImageButton runat="server"  id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="AgreementPrepaymentRequest.aspx" />
				</AlternatingItemTemplate>
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="AgreementPrepaymentRequest.aspx" />
				</ItemTemplate>
			</asp:templatefield>
		</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
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
  
  
</div>
</div>

</form>
</body>

</html>
