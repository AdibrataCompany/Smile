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
<form  id="FrmAssetDocumentReceive" runat="server">
<div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopimerahkiri">&nbsp;</td>
      <td align="center" class="tdtopimerah">EDIT ASSET DOCUMENT</td>
      <td width="10" class="tdtopimerahkanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td  class="tdgenap" width="25%">Branch </td>
      <td  class="tdganjil">
 		  <asp:DropDownList runat="server" ID="DDLBranch">
 		     <asp:ListItem Text="Select One" ></asp:ListItem>
 		     <asp:ListItem Text="Bandung"></asp:ListItem>
 		     <asp:ListItem Text="Medan"></asp:ListItem>
 		     <asp:ListItem Text="Jakarta"></asp:ListItem>
		</asp:DropDownList>
      </td>
    </tr>
    </table>
   
    <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
 
    <tr> 
      <td width="25%" class="tdgenap">Search By</td>
      <td  class="tdganjil">
 		  <asp:DropDownList runat="server" ID="DDLSearchBy">
 		     <asp:ListItem Text="Agreement No" Selected="True"></asp:ListItem>
 		     <asp:ListItem Text="Applicationid"></asp:ListItem>
 		     <asp:ListItem Text="Customer Name"></asp:ListItem>
 		     <asp:ListItem Text="Asset Description"></asp:ListItem>
 		     <asp:ListItem Text="License Plate"></asp:ListItem>
   		     <asp:ListItem Text="Status"></asp:ListItem>
   		      <asp:ListItem Text="Engine No"></asp:ListItem>
   		     
 		      		      		      		      		     
 		  </asp:DropDownList> 
 		  &nbsp;    	
		<asp:TextBox runat="server" ID="TxtSearchBy" CssClass="inptype" TabIndex="17"></asp:TextBox>	
		</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" style="height: 20px"></td>
      <td width="50%" align="right" style="height: 20px">
		<img src="../../Images/ButtonSearch.gif" width="100" height="20" border="0"> 
        <img src="../../Images/ButtonReset.gif" width="100" height="20" border="0"> 
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopimerahkiri">&nbsp;</td>
      <td align="center" class="tdtopimerah">ASSET LISTING</td>
      <td width="10" class="tdtopimerahkanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <asp:GridView runat="server" id="GrdListAgreement"  AllowSorting="True" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield SortExpression="valstring20" HeaderText="APPLICATION ID">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkApplicationid" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkApplicationid" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield SortExpression="valstring20" HeaderText="AGREEMENT NO">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkAgreementno" NavigateUrl="../AccMaintenance/AgreementView.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAgreementno" NavigateUrl="../AccMaintenance/AgreementView.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield SortExpression="valstring20" HeaderText="NAME">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="../Credit/ViewCompanyCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="ASSET DESCRIPTION">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" SortExpression="valstring10" HeaderText="LICENSE PLATE">
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="ENGINE NO.">
		</asp:boundfield>
		<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="ASSET STATUS">
		</asp:boundfield>
		<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="DOC STATUS">
		</asp:boundfield>

		<asp:templatefield HeaderText="ACTION">
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="EditDocumentList.Aspx" Target="_self">Edit
				</asp:HyperLink>
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
      <td width="30" align="center">
		<img src="../../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center">
		<img src="../../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center">
		<img src="../../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center">
		<img src="../../images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../../images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>

</div>
</form>
</body>
</html>
