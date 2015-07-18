<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="../Include/Insurance.css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
<style type="text/css">
.style1 {
	text-align: right;
	background-color: #FFFFFF;
}
</style>
</head>

<body>
<form id="form1" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiabukiri">&nbsp;</td>
      <td align="center" class="tdtopiabu"> NEW COVER REQUEST</td>
      <td width="10" class="tdtopiabukanan">&nbsp;</td>
    </tr>
  </table>
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr>
          <td class="tdgenap">Agreement No</td>
          
      <td class="tdganjil" style="width: 34%"><a href="javascript:;" onClick="MM_openBrWindow('../AccMaintenance/AgreementView.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
          <td class="tdgenap">Customer Name</td>
          
      <td class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxxxx50xxxxxxxxxx</a></td>
        </tr>
		<tr>
          <td class="tdgenap">Asset</td>
          <td class="tdganjil" style="width: 34%">xxxxxxxxxxxx50xxxxxxxxxxxx</td>
          <td class="tdgenap">&nbsp;</td>
          <td class="tdganjil">&nbsp;</td>
        </tr>
        <tr> 
          <td width="20%" class="tdgenap">Insurance Co.</td>
          <td class="tdganjil" style="width: 34%">xxxx10xxxx</td>
          <td width="20%" class="tdgenap">Policy No</td>
          <td width="30%" class="tdganjil">xxxxxx25xxxxxx</td>
        </tr>
       
         <tr> 
          <td class="tdgenap">Insurance Asset Type</td>
          <td class="tdganjil" style="width: 34%">xxxx</td>
          <td class="tdgenap">Asset Usage</td>
          <td class="tdganjil">xxxx10xxxx</td>
        </tr>
		 <tr> 
          <td class="tdgenap">Asset Used New</td>
          <td class="tdganjil" style="width: 34%">xxxx</td>
          <td class="tdgenap">Tenor</td>
          <td class="tdganjil">xxxx10xxxx</td>
        </tr>
		 <tr> 
          <td class="tdgenap">Manufacturing Year</td>
          <td class="tdganjil" style="width: 34%">xxxx</td>
          <td class="tdgenap"></td>
          <td class="tdganjil"></td>
        </tr>
        <tr> 
          <td class="tdgenap">Serial No 1</td>
          <td class="tdganjil" style="width: 34%">xxxxxxxxxxxx50xxxxxxxxxxxx</td>
          <td class="tdgenap">Serial No 2</td>
          <td class="tdganjil">xxxxxx25xxxxxx</td>
        </tr>
        <tr> 
          <td class="tdgenap">Insurance Length</td>
          <td class="tdganjil" style="width: 34%">xx</td>
          <td class="tdgenap">Insurance Period</td>
          <td class="tdganjil">dd/mm/yyyy to dd/mm/yyyy</td>
        </tr>
         <tr>
          <td class="tdgenap">Prepaid Amount</td>
          <td class="style1" style="width: 34%">&nbsp;999,999,999</td>
          <td class="tdgenap">Amount Coverage</td>
          <td class="style1">
			<asp:TextBox runat="server" id="TextBox1" CssClass="inptype">999,999,999</asp:TextBox>
			</td>
        </tr>
      </table>
      <br>
      <table width="95%" border="0" cellspacing="0" cellpadding="0" style="height: 20px">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiabukiri">&nbsp;</td>
      <td align="center" class="tdtopiabu"> PREMIUM TO CUSTOMER</td>
      <td width="10" class="tdtopiabukanan">&nbsp;</td>
    </tr>
  </table>      
  <asp:GridView runat="server" id="GridView1" AutoGenerateColumns="False" DataSourceID="xmlYear" Width="95%">
	<Columns>
		<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="YEAR">
			<HeaderStyle CssClass="tdjudulabu" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" SortExpression="valstring10" HeaderText="INSURANCE LENGTH">
			<HeaderStyle CssClass="tdjudulabu" />
		</asp:boundfield>
		<asp:templatefield HeaderText="COVERAGE">
			<HeaderStyle CssClass="tdjudulabu" />
			<ItemTemplate>
				<select name="Select1">
				<option selected="">ARK</option>
				<option selected="">TLO</option>
				</select>
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="valamount" SortExpression="valamount" HeaderText="PREMIUM">
			<HeaderStyle CssClass="TDJUDULABU" />
		</asp:boundfield>
		<asp:templatefield HeaderText="TPL AMOUNT">
			<HeaderStyle CssClass="tdjudulabu" />
			<ItemTemplate>
				<select name="Select1">
				<option selected="">0</option>
				<option selected="">10000000</option>
				</select>
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="valamount" SortExpression="valamount" HeaderText="TPL PREMIUM">
			<HeaderStyle CssClass="TDJUDULABU" />
		</asp:boundfield>
		<asp:templatefield HeaderText="SRCC">
			<HeaderStyle CssClass="tdjudulabu" />
			<ItemTemplate>
				<select name="Select1">
				<option selected="">YES</option>
				<option selected="">NO</option>
				</select>
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="valamount" SortExpression="valamount" HeaderText="SRCC PREMIUM">
			<HeaderStyle CssClass="TDJUDULABU" />
		</asp:boundfield>
		<asp:templatefield HeaderText="FLOOD">
			<HeaderStyle CssClass="tdjudulabu" />
			<ItemTemplate>
				<select name="Select1">
				<option selected="">YES</option>
				<option selected="">NO</option>
				</select>
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="valamount" SortExpression="valamount" HeaderText="FLOOD PREMIUM">
			<HeaderStyle CssClass="TDJUDULABU" />
		</asp:boundfield>
		<asp:boundfield DataField="valamount" SortExpression="valamount" HeaderText="TOTAL PREMIUM">
			<HeaderStyle CssClass="TDJUDULABU" />
		</asp:boundfield>
	</Columns>
	</asp:GridView>

 	<asp:XmlDataSource runat="server" ID="xmlYear" DataFile="../DataType.xml">
	</asp:XmlDataSource>

  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td height="30">&nbsp;</td>
      <td align="right">
		 <a href="NewCoverRequestAssetCalculate.aspx"><img src="../Images/buttonCalculate.gif" width="100" height="20" border="0"></a>      
		 <a href="NewCoverRequestAsset.aspx"><img src="../Images/ButtonCancel.gif" width="100" height="20" border="0"></a> 
       </td>
    </tr>
  </table>
  </div>
</form>
</body>
</html>
