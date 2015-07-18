<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../../Confins.css" rel="stylesheet" type="text/css">
</head>
<body>
<form  id="FrmAssetList" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">CONTINUE CREDIT REQUEST</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap">Customer Name</td>
      <td width="80%" class="tdganjil" colspan=3> 
         Anthony</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Application ID</td>
      <td width="80%" class="tdganjil" colspan=3> 
         xxxx10xxxxx</td>
    </tr>

<tr> 
      <td width="20%" class="tdgenap">Asset Unit</td>
      <td width="80%" class="tdganjil" colspan=3> 
        5
      </td>
    </tr>

  </table>
  
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">REPOSSESS ASSET LIST</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
   <div align="center">
    <asp:GridView runat="server" id="GrdListAgreement"  AllowSorting="True" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="NO">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="ASSET DESCRIPTION">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring20" SortExpression="valstring20" HeaderText="CHASIS NO">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring20" SortExpression="valstring20" HeaderText="ENGINE NO">
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" SortExpression="valstring10" HeaderText="COLOR">
		</asp:boundfield>
		<asp:boundfield DataField="valstringyear" SortExpression="valstringyear" HeaderText="YEAR">
		</asp:boundfield>
		<asp:boundfield DataField="valstring20" SortExpression="valstring20" HeaderText="LICENSE PLATE">
		</asp:boundfield>
		<asp:boundfield DataField="valdate" SortExpression="valdate" HeaderText="INV EXPECTED DATE">
		</asp:boundfield>
		<asp:boundfield DataField="valdate" SortExpression="valdate" HeaderText="REPOSSESS DATE">
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="ASSET STATUS">
		</asp:boundfield>
	</Columns>
			<HeaderStyle CssClass="tdjudulungu" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
      
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../../DataType.xml">
		</asp:XmlDataSource>
    </div>

 
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center">
		<img src="../../../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center">
		<img src="../../../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center">
		<img src="../../../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center">
		<img src="../../../images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../../../images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
      <a href="ContinueCreditRequest.aspx">
		<img src="../../../Images/ButtonBack.gif" width="100" height="20" border="0"></a> 

		<a href="ContinueCreditRequestProcess.aspx">
		<img src="../../../Images/ButtonNext.gif" width="100" height="20" border="0"></a> 
      </td>
    </tr>
  </table>
  
</div>
</form>
</body>
</html>
