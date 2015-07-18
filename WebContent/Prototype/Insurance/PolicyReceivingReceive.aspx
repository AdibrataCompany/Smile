<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head>

<body>
<form runat="server" id="form1">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">POLICY RECEIVE</td>
      <td width="10"><img src="../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
<table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="150" class="tdjudulabu">&nbsp;</td>
          <td class="tdjudulabu">&nbsp;</td>
          <td width="100" align="center" class="tdjudulabu">CORRECT</td>
        </tr>
        <tr> 
          <td class="tdgenap">Agreement No</td>
          <td class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../AccMaintenance/AgreementView.htm','Agreement','scrollbars=yes,width=900,height=700')">xxxx20xxxx</a></td>
          <td align="center" class="tdganjil">&nbsp;</td>
        </tr>
        <tr> 
          <td class="tdgenap">Customer Name</td>
          <td class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700')">xxxxxxxxx50xxxxxxxxxxx</a></td>
          <td align="center" class="tdganjil"><input name="checkbox2" type="checkbox" value="checkbox" checked></td>
        </tr>
        <tr> 
          <td class="tdgenap">Address</td>
          <td class="tdganjil">xxxxxxxxxxxxxx50xxxxxxxxxxxxxx</td>
          <td align="center" class="tdganjil"><input name="checkbox2" type="checkbox" value="checkbox" checked></td>
        </tr>
        </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="150" class="tdjudulabu">&nbsp;</td>
          <td class="tdjudulabu">&nbsp;</td>
          <td width="100" align="center" class="tdjudulabu">CORRECT</td>
        </tr>
        <tr> 
          <td class="tdgenap">Asset Description</td>
          <td class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewAsset.htm','Asset','scrollbars=yes,width=900,height=700')">xxxx50xxxx</a></td>
          <td align="center" class="tdganjil">&nbsp;</td>
        </tr>
        <tr> 
          <td class="tdgenap">Asset Year</td>
          <td class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700')">9999</a></td>
          <td align="center" class="tdganjil"><input name="checkbox2" type="checkbox" value="checkbox" checked></td>
        </tr>
        <tr> 
          <td class="tdgenap">Serial No 1</td>
          <td class="tdganjil">xxxx50xxxx</td>
          <td align="center" class="tdganjil"><input name="checkbox2" type="checkbox" value="checkbox" checked></td>
        </tr>
        <tr> 
          <td class="tdgenap">Serial No 2</td>
          <td class="tdganjil">xxxx50xxxx</td>
          <td align="center" class="tdganjil"><input name="checkbox23" type="checkbox" value="checkbox" checked></td>
        </tr>
        
        <tr> 
          <td width="150" class="tdgenap">Sum Insured</td>
          <td class="tdganjil">99,999,999</td>
			  <td align="center" class="tdganjil"><input name="checkbox25" type="checkbox" value="checkbox" checked></td>
       
	 </tr>
      </table>
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="150" align="center" class="tdjudulabu">ATTRIBUTEID</td>
          <td align="center" class="tdjudulabu">ATTRIBUTE CONTENT</td>
          <td align="center" class="tdjudulabu">IS VALID</td>
        </tr>
         <tr> 
          <td align="center" class="tdganjil">xxxx50xxxx&nbsp;</td>
          <td align="center" class="tdganjil">xxxx50xxxx</td>
          <td align="center" class="tdganjil">
			<input name="checkbox26" type="checkbox" value="checkbox" checked></td>
         
          <td align="center" class="tdganjil">&nbsp;</td>
        </tr>
		</table>
		 <table width="95%" border="0" cellspacing="0" cellpadding="0" align="center">
		  <tr>
		  <td>
		   <asp:GridView runat="server" id="grdPolicyReceive" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="100%">
		  <Columns>
			<asp:templatefield HeaderText="YEAR NUM">
				<ItemTemplate>
					<asp:hyperlink  runat="server" Text="xxxxx10xxxxx" NavigateUrl="InsuranceCompanyBranchView.htm" target="_blank"/>
				</ItemTemplate>
			</asp:templatefield>	
			<asp:boundfield DataField="valamount" HeaderText="SUM INSURED AMOUNT" SortExpression="valstring25">
			</asp:boundfield>
			<asp:boundfield DataField="valamount" HeaderText="COVERAGE TYPE" SortExpression="valstring25">
			</asp:boundfield>
			<asp:boundfield DataField="valamount" HeaderText="SRCC" SortExpression="valstring25">
			</asp:boundfield>
			<asp:boundfield DataField="valamount" HeaderText="TS" SortExpression="valstring25">
			</asp:boundfield>
			<asp:boundfield DataField="valamount" HeaderText="SRCC-TS" SortExpression="valstring25">
			</asp:boundfield>
			<asp:boundfield DataField="valamount" HeaderText="RSMD" SortExpression="valstring25">
			</asp:boundfield>
			<asp:boundfield DataField="valamount" HeaderText="TPL" SortExpression="valstring25">
			</asp:boundfield>
			<asp:boundfield DataField="valamount" HeaderText="EARTH QUAKE" SortExpression="valstring25">
			</asp:boundfield>
			<asp:boundfield DataField="valamount" HeaderText="FLOOD" SortExpression="valstring25">
			</asp:boundfield>
			<asp:boundfield DataField="valamount" HeaderText="AOG" SortExpression="valstring25">
			</asp:boundfield>
			<asp:templatefield HeaderText="IS VALID">
				<ItemTemplate>
					<asp:CheckBox runat="server"/>
				</ItemTemplate>
			</asp:templatefield>	
			</Columns>
		  <HeaderStyle CssClass="tdjudulabu" />
		  <AlternatingRowStyle CssClass="tdgenap" />
		  </asp:GridView>
		  <asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
		  </asp:XmlDataSource>  

  </td>
  </tr>
  </table>

		
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        
      </table>
    </div>
        <table align="center" width="95%">
        <tr> 
          <td colspan="3" class="tdjudulabu">Insurance</td>
        </tr>
        </table>
        <table align="center" width="95%">
        <tr> 
          <td class="tdgenap">Insurance Period</td>
          <td class="tdganjil">dd/mm/yyyy to dd/mm/yyyy</td>
          <td align="center" class="tdganjil"><input name="checkbox22" type="checkbox" value="checkbox" checked></td>
        </tr>
        <tr> 
          <td class="tdgenap">Insurance Length</td>
          <td class="tdganjil">99 months</td>
          <td align="center" class="tdganjil"><input name="checkbox2" type="checkbox" value="checkbox" checked></td>
        </tr>
        <tr>
          <td class="tdgenap">Num of Assets</td>
          <td class="tdganjil">99</td>
          <td align="center" class="tdganjil">
			<input name="checkbox23" type="checkbox" value="checkbox" checked></td>
        </tr>
		<tr>
          <td class="tdgenap">SPPA Date</td>
          <td class="tdganjil">dd/mm/yyyy</td>
          <td align="center" class="tdganjil">&nbsp;</td>
        </tr>
		<tr>
          <td class="tdgenap">Policy Number</td>
          <td class="tdganjil">
			<input name="textfield37" type="text" class="inptype" size="20"></td>
          <td align="center" class="tdganjil">&nbsp;</td>
        	</tr>
			<tr>
          <td class="tdgenap" style="height: 22px">Premium To Insco</td>
          <td class="tdganjil" style="height: 22px">IDR 999,999,999</td>
          <td align="center" class="tdganjil" style="height: 22px"></td>
        	</tr>
        <tr> 
          <td class="tdgenap">Received Date</td>
          <td class="tdganjil"> <input name="textfield" type="text" class="inptype" size="10"> 
          <img src="../Images/iconcalendar.gif" width="20" height="20"> </td>
          <td align="center" class="tdganjil">&nbsp;</td>
        </tr>
      </table>
      

      <table width="95%" border="0" cellspacing="0" cellpadding="0">
        <tr> 
          <td width="50%" height="30"><a href="javascript:;" onClick="MM_openBrWindow('Report/DocEndors.htm','Endors','scrollbars=yes,width=700,height=700')"><img src="../Images/ButtonEndors.gif" width="100" height="20" border="0"></a></td>
          <td width="50%" align="right"><a href="PolicyReceivingValidate.htm"><img src="../Images/ButtonValidate.gif" width="100" height="20" border="0"></a> 
            <a href="PolicyReceivingSearch.aspx"><img src="../Images/ButtonCancel.gif" width="100" height="20" border="0"></a></td>
        </tr>
      </table>
    </div>
    
  </div>
  
</div>
</form>
</body>
</html>
