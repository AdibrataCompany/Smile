<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<style type="text/css">
.style1 {
	color: #0066CC;
}
.style2 {
	text-align: right;
}
</style>
</head>
<body>
<form Runat="server" id="FrmDrawdownBond">
<div align="center">
 

  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopitoscakiri">&nbsp;</td>
      <td align="center" class="tdtopitosca">DRAWDOWN LISTING FOR RECEIVING FUND</td>
      <td width="10" class="tdtopitoscakanan">&nbsp;</td>
    </tr>
  </table>
    <div align="center"> 
      <asp:GridView runat="server" id="GrdViewBranch" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
		<Columns>
			<asp:boundfield DataField="valstring20" HeaderText="FUNDING CO.">
			</asp:boundfield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="CONTRACT NUMBER">
			</asp:boundfield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="BATCH NO">
			</asp:boundfield>
			<asp:boundfield DataField="valdate" HeaderText="BATCH DATE">
			</asp:boundfield>
			<asp:boundfield DataField="valamount" HeaderText="AMOUNT">
			</asp:boundfield>
			<asp:boundfield DataField="vCurr" HeaderText="CURR">
			</asp:boundfield>
			<asp:templatefield HeaderText="RECEIVE">
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="BtnDoc" ImageUrl="../../images/IconReceived.gif" NavigateUrl="DrawdownBondReceiveFund.aspx" />
				</ItemTemplate>
			</asp:templatefield>
		</Columns>
		<HeaderStyle CssClass="tdjudultosca" />
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

  <br>
  
</div>
</form>
</body>
</html>
