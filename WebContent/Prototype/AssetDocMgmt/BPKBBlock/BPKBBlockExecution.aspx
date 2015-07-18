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
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">BPKB BLOCK EXECUTION</td>
      <td width="10" class="tdtopibirukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap">Branch</td>
      <td class="tdganjil"><asp:DropDownList ID="ddlBranchID" runat="server">
      <asp:ListItem text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem text="Sunter" Value="801"></asp:ListItem>
      </asp:DropDownList>
	</td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Search By</td>
      <td class="tdganjil"><select name="select4">
	      <option>Agreement No</option>
          <option>Customer Name</option>
          <option>Asset Description</option>
          <option>License Plate</option>
		  <option>Document No</option>
		  <option>Engine No</option>
        </select> <input name="textfield3" type="text" class="inptype" size="20"></td>
    </tr>
     <tr> 
      <td width="25%" class="tdgenap">Block Status</td>
      <td class="tdganjil"><select name="select4">
	      <option>Block</option>
          <option>Release</option>
        </select> </td>
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
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">BPKB BLOCK LISTING</td>
      <td width="10" class="tdtopibirukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="100%">
    <tr> 
    <td align="center">
        <asp:GridView runat="server" id="grdListAgreementAsset" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
    		<asp:templatefield HeaderText="ACTION">
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				<asp:CheckBox runat="server" id="chkAction" />
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="AGREEMENT NO">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkAgreementNo" NavigateUrl="../../Credit/ViewCompanyCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAgreementNo" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="CUSTOMER NAME">
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomerName" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="ASSET DESCRIPTION">
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAssetDescription" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="DOCUMENT NO">
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lnkCustomerName">xxxxxxxx50xxxxxxxx
				</asp:Label>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:Label runat="server" id="lnkCustomerName">xxxxxxxx50xxxxxxxx
				</asp:Label>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="LICENSE PLATE">
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:Label runat="server" id="lnkAssetDescription">xxxx10xxxx
				</asp:Label>
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="ENGINE NO">
		</asp:boundfield>
		<asp:templatefield HeaderText="CONTRACT STATUS">
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblContractStatus">LIV </asp:Label>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				<asp:Label runat="server" id="lblContractStatus">ICP </asp:Label>
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="valyesno" SortExpression="valyesno" HeaderText="STATUS BLOCK">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
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
<img src="../../Images/ButtonExecution.gif" width="100" height="20" border="0" style="float: right"></p>
</body>
</html>
