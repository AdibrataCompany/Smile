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
</style>

</head>

<body>
<form id="FrmProductOfferingEdit" runat="server">
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
							<asp:boundfield DataField="valstring10" HeaderText="SUPPLIER ID" SortExpression="valstring10">
							</asp:boundfield>
							<asp:boundfield DataField="valstring50" HeaderText="SUPPLIER NAME" SortExpression="valstring50">
							</asp:boundfield>
							<asp:boundfield DataField="valstring50" HeaderText="SUPPLIER ADDRESS" SortExpression="valstring50">
							</asp:boundfield>
							<asp:boundfield DataField="valstring10" HeaderText="SUPPLIER PHONE" SortExpression="valstring10">
							</asp:boundfield>
							<asp:boundfield DataField="valstring50" HeaderText="CONTACT PERSON" SortExpression="valstring50">
							</asp:boundfield>
						</Columns>
						<HeaderStyle CssClass="tdjudulhijau" />
						<AlternatingRowStyle CssClass="tdgenap" />
					</asp:GridView>
					<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
					</asp:XmlDataSource>
					<table width="95%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="50%" style="height: 14px; width: 100%;">
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
						</table>
					<asp:XmlDataSource runat="server" ID="XmlDataSource2" DataFile="../../DataType.xml">
					</asp:XmlDataSource>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnBack" ImageUrl="../../images/ButtonBack.gif" PostBackUrl="ProductOfferingView.aspx" /></td>
    </tr>
  </table>
<br />
</div>
</form>
</body>
</html>
