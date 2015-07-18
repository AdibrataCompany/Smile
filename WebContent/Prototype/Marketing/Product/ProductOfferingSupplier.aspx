<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>*</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />

<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>

<style type="text/css">
.style1 {
	text-align: left;
}
.style2 {
	background-color: #FFFFFF;
	text-align: left;
}
.style3 {
	background-color: #F4FAFF;
	text-align: left;
}
.style4 {
	background-color: #F4F4DF;
	font-weight: bold;
	font-size: 10px;
	text-align: left;
}
</style>

</head>

<body>
<form id="FrmProductOfferingEdit" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3" class="style1"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">PRODUCT OFFERING SUPPLIER</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td class="style3" style="width: 40%">Branch</td>
          <td class="style2">Grand Wijaya</td>
        </tr>
        <tr> 
          <td class="style3" style="width: 40%">Product</td>
          <td class="style2">PRODUCT CONSUMER FINANCE NEW HONDA</td>
        </tr>
        <tr> 
          <td class="style3" style="width: 40%">Product Offering ID</td>
          <td class="style2"> PMRDK</td>
        </tr>
        <tr> 
          <td class="style3" style="width: 40%">Description</td>
          <td class="style2">Paket Merdeka</td>
        </tr>
        <tr> 
          <td colspan="2" class="style4">PAKET DATA</td>
        </tr>
        <tr> 
          <td class="style3" style="width: 40%">Period</td>
          <td class="style2">
			1/08/2008 To
			30/08/2008</td>
        </tr>
        <tr> 
          <td class="style3" style="width: 40%">Active</td>
          <td class="style2"> 
			Yes</td>
        </tr>
      </table>
      <br />
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td class="style3" style="width: 40%">Copy Supplier Data from Other Product 
			Offering</td>
          <td class="style2">
			<asp:DropDownList runat="server" id="CmbCopyData" Width="180px" CssClass="inptype">
				<asp:ListItem>Select One</asp:ListItem>
			</asp:DropDownList>
			&nbsp;
			<asp:ImageButton runat="server" id="BtnCopy" ImageUrl="../../images/ButtonCopy.gif" /></td>
        </tr>
      </table>
    	<br />
    </div>
    
  </div>
  <div align="center">
	<div align="center">
		<div align="center">
			<div align="center">
				<div align="center">
					<table width="95%" border="0" cellspacing="0" cellpadding="0">
						<tr class="trtopiabu">
							<td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
							<td align="center" class="tdtopihijau">PRODUCT 
							OFFERING SUPPLIER</td>
							<td width="10" class="tdtopihijaukanan">&nbsp;</td>
						</tr>
					</table>
					<asp:GridView runat="server" id="GrdViewSupplierPOT" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
						<Columns>
							<asp:boundfield DataField="valstring10" SortExpression="valstring10" HeaderText="SUPPLIER ID">
							</asp:boundfield>
							<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="SUPPLIER NAME">
							</asp:boundfield>
							<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="SUPPLIER ADDRESS">
							</asp:boundfield>
							<asp:boundfield DataField="valstring10" SortExpression="valstring10" HeaderText="SUPPLIER PHONE">
							</asp:boundfield>
							<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="CONTACT PERSON">
							</asp:boundfield>
							<asp:templatefield HeaderText="DELETE">
								<AlternatingItemTemplate>
									<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../images/IconDelete.gif" />
								</AlternatingItemTemplate>
								<ItemTemplate>
									<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../images/IconDelete.gif" />
								</ItemTemplate>
							</asp:templatefield>
						</Columns>
						<HeaderStyle CssClass="tdjudulhijau" />
						<AlternatingRowStyle CssClass="tdgenap" />
					</asp:GridView>
					<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
					</asp:XmlDataSource>
					<table width="95%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="50%" style="height: 14px; width: 100%;" colspan="2">
							<table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
								<tr>
									<td width="30" align="center">
									<asp:ImageButton runat="server" id="BtnFirstPrev" ImageUrl="../../images/butkiri1.gif" Width="20px" />
									</td>
									<td width="30" align="center">
									<asp:ImageButton runat="server" id="BtnPrev" ImageUrl="../../images/butkiri.gif" />
									</td>
									<td width="30" align="center">
									<asp:ImageButton runat="server" id="BtnNext" ImageUrl="../../images/butkanan.gif" Width="20px" />
									</td>
									<td width="30" align="center">
									<asp:ImageButton runat="server" id="BtnLastNext" ImageUrl="../../images/butkanan1.gif" />
									</td>
									<td width="130" align="center">Page 
        							<asp:TextBox runat="server" id="TbnPage" Width="20px" CssClass="inptype">
									</asp:TextBox>
&nbsp;&nbsp; 
        							<asp:ImageButton runat="server" id="BtnGo" ImageUrl="../../images/buttonGO.gif" />
									</td>
									<td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
								</tr>
							</table>
							</td>
						</tr>
						<tr>
							<td width="50%" height="30" class="style1">
							&nbsp;
							<asp:HyperLink runat="server" id="BtnAddSupplier" ImageUrl="../../images/ButtonAdd.gif" NavigateUrl="ProductOfferingSupplierAdd.aspx" Target="_blank">
							HyperLink</asp:HyperLink>
&nbsp;
							<asp:ImageButton runat="server" id="BtnPerviewSupplier" ImageUrl="../../images/ButtonPreview.gif" PostBackUrl="ProductOfferingSupplier.aspx" />
							</td>
							<td width="50%" align="right">&nbsp;&nbsp;</td>
						</tr>
					</table>
					<asp:XmlDataSource runat="server" ID="XmlDataSource2" DataFile="../../DataType.xml">
					</asp:XmlDataSource>
</div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="ProductOffering.aspx" Height="20px" /><asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="ProductOffering.aspx" /></td>
    </tr>
  </table>
    				<br />
				</div>
			</div>
		</div>
	</div>
	</div>
</div>

</form>
</body>
</html>
