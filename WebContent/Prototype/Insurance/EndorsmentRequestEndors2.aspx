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
</head>

<body>
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiabukiri">&nbsp;</td>
      <td align="center" class="tdtopiabu"> ENDORSMENT REQUEST</td>
      <td width="10" class="tdtopiabukanan">&nbsp;</td>
    </tr>
  </table>
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr>
          <td class="tdgenap">Agreement No</td>
          
      <td class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../AccMaintenance/AgreementView.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
          <td class="tdgenap">Customer Name</td>
          
      <td class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxxxx50xxxxxxxxxx</a></td>
        </tr>
		<tr>
          <td class="tdgenap">Asset</td>
          <td class="tdganjil">xxxxxxxxxxxx50xxxxxxxxxxxx</td>
          <td class="tdgenap">&nbsp;</td>
          <td class="tdganjil">&nbsp;</td>
        </tr>
        <tr> 
          <td width="20%" class="tdgenap">Insurance Co.</td>
          <td width="30%" class="tdganjil">xxxx10xxxx</td>
          <td width="20%" class="tdgenap">Policy No</td>
          <td width="30%" class="tdganjil">xxxxxx25xxxxxx</td>
        </tr>
       
         <tr> 
          <td class="tdgenap">Insurance Asset Type</td>
          <td class="tdganjil">xxxx</td>
          <td class="tdgenap">Asset Usage</td>
          <td class="tdganjil">xxxx10xxxx</td>
        </tr>
		 <tr> 
          <td class="tdgenap">Asset Used New</td>
          <td class="tdganjil">xxxx</td>
          <td class="tdgenap">Tenor</td>
          <td class="tdganjil">xxxx10xxxx</td>
        </tr>
		 <tr> 
          <td class="tdgenap">Manufacturing Year</td>
          <td class="tdganjil">xxxx</td>
          <td class="tdgenap"></td>
          <td class="tdganjil"></td>
        </tr>
        <tr> 
          <td class="tdgenap">Serial No 1</td>
          <td class="tdganjil">xxxxxxxxxxxx50xxxxxxxxxxxx</td>
          <td class="tdgenap">Serial No 2</td>
          <td class="tdganjil">xxxxxx25xxxxxx</td>
        </tr>
        <tr> 
          <td class="tdgenap">Insurance Length</td>
          <td class="tdganjil">xx</td>
          <td class="tdgenap">Insurance Period</td>
          <td class="tdganjil">dd/mm/yyyy to dd/mm/yyyy</td>
        </tr>
         <tr>
          <td class="tdgenap">Endorsment Date</td>
          <td class="tdganjil"><input type="text" name="textfield2222" class="inptype" size="15">
            <img src="../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"></td>
          <td class="tdgenap">Prepaid Amount</td>
          <td class="tdganjil">999,999,999</td>
        </tr>
      </table>
      <br>
      
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdjudulabu"> 
          <td width="40%" align="center">&nbsp;</td>
          <td width="30%" align="center">CURRENT</td>
          <td width="30%" align="center">NEW</td>
        </tr>
        <tr class="tdganjil"> 
          <td>Sum Insured</td>
          <td align="right">999,999,999</td>
          <td align="right">
			<input name="textfield22222" type="text" class="inptype" value="999,999,999" size="20"> 
          </td>
        </tr>
        <tr class="tdgenap"> 
          <td style="height: 18px">Main Premium By Cust.</td>
          <td align="right" style="height: 18px">999,999,999</td>
          <td align="right" style="height: 18px">0</td>
        </tr>
        <tr class="tdganjil"> 
          <td>Main Premium To InsCo.</td>
          <td align="right">999,999,999</td>
          <td align="right">0</td>
        </tr>
        <tr class="tdgenap"> 
          <td>Premium Amount By Cust.</td>
          <td align="right">999,999,999</td>
          <td align="right">0</td>
        </tr>
        <tr class="tdganjil"> 
          <td>Premium Amount To InsCo.</td>
          <td align="right">999,999,999</td>
          <td align="right">0</td>
        </tr>
      </table>
      <br>
       <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiABU"> 
      <td width="10" height="20" class="tdtopiABUkiri">&nbsp;</td>
      <td align="center" class="tdtopiabu">MAIN PREMIUM RATE</td>
      <td width="10" class="tdtopiabukanan">&nbsp;</td>
    </tr>
  </table>
  </div>
      <div align="center">
     
    <asp:GridView runat="server" id="GrdListCustomer" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
    	<asp:templatefield HeaderText="YEAR NUM">
			<ItemTemplate>
				<asp:Label runat="server" id="lblYearNum">9
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>

		<asp:templatefield HeaderText="# OF MONTHS">
			<ItemTemplate>
				<asp:Label runat="server" id="lblMonths">12
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="COVERAGE TYPE">
			<ItemTemplate>
				<asp:dropdownlist id="ddlCoverageType" runat="server" cssclass="inptype" width="100">
			      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
			      <asp:ListItem Text="Total Loss" Value="TL"></asp:ListItem>
			      <asp:ListItem Text="All Risk" Value="AR"></asp:ListItem>
			      <asp:ListItem Text="Fire" Value="FR"></asp:ListItem>
      			</asp:dropdownlist >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="INSURED (%)">
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtPercentageInsured" CssClass="inptype" Text="99.99">
				</asp:TextBox >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="RATE (%)">
			<ItemTemplate>
				<asp:Label runat="server" id="lblAssetType" Text="99.99">
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" />
		</asp:templatefield>

		<asp:templatefield HeaderText="PREMIUM">
			<ItemTemplate>
				<asp:Label runat="server" id="lblPremium" Text="9,999,999,999">
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" />
		</asp:templatefield>

		<asp:templatefield HeaderText="TOTAL PREMIUM">
			<ItemTemplate>
				<asp:Label runat="server" id="lblTotalPremium" Text="9,999,999,999">
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" />
		</asp:templatefield>

	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>


<br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiabukiri">&nbsp;</td>
      <td align="center" class="tdtopiabu">ADDITIONAL RATE</td>
      <td width="10" class="tdtopiabukanan">&nbsp;</td>
    </tr>
  </table>
  <table align="center" width="95%">
  <tr>
  <td>
  
    <asp:GridView runat="server" id="GrdAdditionalRate" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2"  >
    <Columns>
		<asp:templatefield HeaderText="YEAR NUM">
			<ItemTemplate>
				<asp:Label runat="server" id="lblYearNum">9
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" Width=5% />
		</asp:templatefield>

		<asp:templatefield HeaderText="# OF MONTHS">
			<ItemTemplate>
				<asp:Label runat="server" id="lblMonths">12
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" Width=5% />
		</asp:templatefield>
		<asp:templatefield HeaderText="SRCC">
			<ItemTemplate>
				<asp:DropDownList runat="server" id="ddlSRCC" >
				<asp:ListItem Value="1" Text="Yes"></asp:ListItem>
				<asp:ListItem Value="0" Text="No"></asp:ListItem>
				</asp:DropDownList >
				
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="TS">
			<ItemTemplate>
				<asp:DropDownList runat="server" id="ddlTS" >
				<asp:ListItem Value="1" Text="Yes"></asp:ListItem>
				<asp:ListItem Value="0" Text="No"></asp:ListItem>
				</asp:DropDownList >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="SRCCTS">
			<ItemTemplate>
				<asp:DropDownList runat="server" id="ddlSRCCTS" >
				<asp:ListItem Value="1" Text="Yes"></asp:ListItem>
				<asp:ListItem Value="0" Text="No"></asp:ListItem>
				</asp:DropDownList >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="RSMD">
			<ItemTemplate>
				<asp:DropDownList runat="server" id="ddlRSMD" >
				<asp:ListItem Value="1" Text="Yes"></asp:ListItem>
				<asp:ListItem Value="0" Text="No"></asp:ListItem>
				</asp:DropDownList >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
        <asp:templatefield HeaderText="TPL">
			<ItemTemplate>
				<asp:DropDownList runat="server" id="ddlTPL" >
				<asp:ListItem Value="0" Text="0"></asp:ListItem>
				<asp:ListItem Value="100000000" Text="100,000,000"></asp:ListItem>
				<asp:ListItem Value="200000000" Text="200,000,000"></asp:ListItem>
				</asp:DropDownList >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="AOG">
			<ItemTemplate>
				<asp:DropDownList runat="server" id="ddlAOG" >
				<asp:ListItem Value="1" Text="Yes"></asp:ListItem>
				<asp:ListItem Value="0" Text="No"></asp:ListItem>
				</asp:DropDownList >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="EARTHQUAKE">
			<ItemTemplate>
				<asp:DropDownList runat="server" id="ddlEarthquake" >
				<asp:ListItem Value="1" Text="Yes"></asp:ListItem>
				<asp:ListItem Value="0" Text="No"></asp:ListItem>
				</asp:DropDownList >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="FLOOD">
			<ItemTemplate>
				<asp:DropDownList runat="server" id="ddlFlood" >
				<asp:ListItem Value="1" Text="Yes"></asp:ListItem>
				<asp:ListItem Value="0" Text="No"></asp:ListItem>
				</asp:DropDownList >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>

		<asp:templatefield HeaderText="TOTAL ADDITIONAL PREMIUM">
			<ItemTemplate>
				<asp:Label runat="server" id="lblTotalAdditionalPremium" Text="9,999,999,999">
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Right" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulabu" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>

		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>

  </td>
  </tr>
  </table>
 <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td height="30">&nbsp;</td>
      <td align="right">
		 <a href="EndorsmentRequestEndorsRecalculate.aspx"><img src="../Images/buttonCalculate.gif" width="100" height="20" border="0"></a>      
		 <a href="EndorsmentRequest.aspx"><img src="../Images/ButtonCancel.gif" width="100" height="20" border="0"></a> 
       </td>
    </tr>
  </table>
  </div>
</body>
</html>
