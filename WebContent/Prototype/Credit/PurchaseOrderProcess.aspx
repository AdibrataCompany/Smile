<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
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
<div align="center">
<form id="frmCustomerComplainList" runat="server">

  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">PURCHASE ORDER PROCESS</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Agrement No.</td>
      <td width="25%" class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,left=0,top=0')">
		xxxx20xxxx</a></td>
      <td width="25%" class="tdgenap">Customer Name</td>
      <td width="25%" class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700')">xxxx50xxxx</a></td>
    </tr>
  </table>
 
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau"> PURCHASE ORDER / PO NUMBER xxxx10xxxx</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td colspan="2" valign="top" class="tdgenap">To:</td>
      <td width="50%" class="tdgenap" colspan="2">Send To:<font face="Tahoma, Verdana" size="2">&nbsp; 
        </font></td>
    </tr>
    <tr> 
      <td colspan="2" valign="top" class="tdganjil">xxxxxxxxxxxx50xxxxxxxxxxxx</td>
      <td valign="top" colspan="2" class="tdganjil">xxxxxxxxxxxx50xxxxxxxxxxxx</td>
    </tr>
    <tr> 
      <td colspan="2" valign="top" class="tdganjil">xxxxxxxxxxxx50xxxxxxxxxxxx<br>
        xxxxxxxxxxxx50xxxxxxxxxxxx </td>
      <td valign="top" colspan="2" class="tdganjil">xxxxxxxxxxxx50xxxxxxxxxxxx<br>
        xxxxxxxxxxxx50xxxxxxxxxxxx </td>
    </tr>
    <tr> 
      <td colspan="2" valign="top" class="tdganjil">xxxxxxxx30xxxxxxx</td>
      <td valign="top" colspan="2" class="tdganjil">xxxxxxxx30xxxxxxx</td>
    </tr>
    <tr> 
      <td colspan="2" valign="top" class="tdganjil">xxxxxxxxxx 99999</td>
      <td valign="top" colspan="2" class="tdganjil">xxxxxxxxxx 99999</td>
    </tr>
    <tr> 
      <td colspan="4" class="tdganjil">
      <table width="100%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
          <tr> 
            <td class="tdjudulhijau">NUM OF ASSETS</td>
            <td class="tdjudulhijau">ASSET DESCRIPTION</td>
            <td class="tdjudulhijau">ITEM</td>
            <td class="tdjudulhijau">CURRENCY</td>
            <td class="tdjudulhijau">AMOUNT</td>
          </tr>
          <tr class="tdganjil"> 
            <td>999</td>
            <td>xxxxxxxxxx50xxxxxxxxxx</td>
            <td>Total OTR</td>
            <td>IDR</td>
            <td>999,999,999.00</td>
          </tr>
          <tr class="tdgenap"> 
            <td>&nbsp;</td>
            <td></td>
            <td>Total DP</td>
            <td>IDR</td>
            <td>(999,999,999.00)</td>
          </tr>
          <tr class="tdganjil"> 
            <td>&nbsp;</td>
            <td></td>
            <td>First Installment</td>
            <td>IDR</td>
            <td>(999,999,999.00)</td>
          </tr>
          <tr class="tdgenap"> 
            <td>&nbsp;</td>
            <td></td>
            <td>Insurance</td>
            <td>IDR</td>
            <td>(999,999,999.00)</td>
          </tr>
          <tr class="tdganjil"> 
            <td>&nbsp;</td>
            <td></td>
            <td>Admin Fee</td>
            <td>IDR</td>
            <td>(999,999,999.00)</td>
          </tr>
          <tr class="tdgenap"> 
            <td>&nbsp;</td>
            <td></td>
            <td>Total</td>
            <td>IDR</td>
            <td>999,999,999.00</td>
          </tr>
        </table></td>
    </tr>
    <tr> 
      <td colspan="4" class="tdjudulhijau">ADDITIONAL NOTES</td>
    </tr>
    <tr class="tdgenap"> 
      <td colspan="4" valign="top" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <textarea name="textarea" cols="60" rows="5" class="inptype"></textarea>
        </font></td>
    </tr>
      <tr> 
      <td class="tdgenap" width="20%" style="height: 57px">Way of A/P Payment</td>
      <td class="tdganjil" style="height: 57px">
			<asp:RadioButtonList runat="server" id="rdbtnSumInsuredBased" RepeatDirection="Vertical" >
			<asp:ListItem Text="Full A/P Payment" Value="Full"></asp:ListItem>
			<asp:ListItem Text="Breakdown A/P" Value="Break"></asp:ListItem></asp:RadioButtonList>
			</td>
			 <td class="tdgenap" width="20%" style="height: 57px">ToP</td>
      <td class="tdganjil" style="height: 57px">
			<asp:TextBox runat="server" ID="txtToP" CssClass="inptype"></asp:TextBox>
			<font color="red">*) If Full A/P Payment</font></td>	
    </tr>
     <tr> 
      <td class="tdgenap" width="20%">Purchase Order Notes</td>
      <td class="tdganjil" colspan="3">
		<asp:TextBox runat="server" ID="txtPurchaseOrderNotes" CssClass="inptype" Width="400px"></asp:TextBox>
	</td>
	
    </tr>

    <tr> 
      <td colspan="4" class="tdjudulhijau">BREAKDOWN A/P <font color="red">*) If Breakdown A/P Payment</font></td>
    </tr>
  </table>
      <asp:GridView runat="server" id="GrdViewSupplierListing" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" Width="95%">
		<Columns>
			<asp:boundfield DataField="valNo" SortExpression="valNo" HeaderText="NO">
				<ItemStyle HorizontalAlign="Center" />
			</asp:boundfield>
			<asp:templatefield HeaderText="HOLD A/P">
				<ItemStyle HorizontalAlign="Left" />
				<ItemTemplate>
					<asp:DropDownList runat="server" id="ddlHoldAP">
						<asp:ListItem Text="Yes" Value="True"></asp:ListItem>
						<asp:ListItem Text="No" Value="False" Selected="True">
						</asp:ListItem>
					</asp:DropDownList>
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="RATE (%)">
				<AlternatingItemTemplate>
					<asp:Label runat="server" id="lblRate" Text=""></asp:Label>
				</AlternatingItemTemplate>
				<ItemStyle HorizontalAlign="Left" />
				<ItemTemplate>
					<asp:Label runat="server" id="lblRate" Text="99.99">
					</asp:Label>
					<font color="red">*) If Hold A/P = Yes</font>
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="TOP (days)">
				<AlternatingItemTemplate>
					<asp:TextBox runat="server" id="txtToP" Text="1" CssClass="inptype">
					</asp:TextBox>
				</AlternatingItemTemplate>
				<ItemStyle HorizontalAlign="Left" />
				<ItemTemplate>
					<asp:TextBox runat="server" id="txtToP" Text="0" CssClass="inptype">
					</asp:TextBox>
					<font color="red">*) If Hold A/P = No</font>
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="A/P Amount">
				<AlternatingItemTemplate>
					<asp:Label runat="server" id="lblAPAmount" Text="999,999,999-x">
					</asp:Label>
				</AlternatingItemTemplate>
				<ItemStyle HorizontalAlign="Left" />
				<ItemTemplate>
					<asp:TextBox runat="server" id="txtAPAmount" Text="x" CssClass="inptype">
					</asp:TextBox>
				</ItemTemplate>
			</asp:templatefield>
		</Columns>
		<HeaderStyle CssClass="tdjudulhijau" />
		<AlternatingRowStyle CssClass="tdgenap" />
		<RowStyle CssClass="tdganjil" />
		</asp:GridView>



  <asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataTypeIsabel.xml">
		</asp:XmlDataSource>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">TERM &amp; CONDITION</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td align="center" class="tdjudulhijau">NO</td>
      <td align="center" class="tdjudulhijau">DOCUMENT</td>
      <td align="center" class="tdjudulhijau">PRIOR TO</td>
      <td align="center" class="tdjudulhijau">CHECKED</td>
      <td align="center" class="tdjudulhijau">MANDATORY</td>
      <td align="center" class="tdjudulhijau">PROMISE DATE</td>
      <td align="center" class="tdjudulhijau">NOTES</td>
    </tr>
    <tr> 
      <td align="center" class="tdganjil">99</td>
      <td class="tdganjil">xxxx50xxxx</td>
      <td align="center" class="tdganjil"><font face="Tahoma, Verdana" size="2">
		POP</font></td>
      <td align="center" class="tdganjil"><input type="checkbox" name="checkbox" value="checkbox"></td>
      <td align="center" class="tdganjil">v</td>
      <td align="center" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32333" type="text" class="inptype" size="10">
        </font><img src="../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"></td>
      <td align="center" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield323262324" type="text" class="inptype" size="15">
        </font></td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center">99</td>
      <td>xxxx50xxxx</td>
      <td align="center"><font face="Tahoma, Verdana" size="2">POP</font></td>
      <td align="center"><input type="checkbox" name="checkbox" value="checkbox"></td>
      <td align="center">v</td>
      <td align="center"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield323332" type="text" class="inptype" size="10">
        </font><img src="../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"></td>
      <td align="center"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield323262324" type="text" class="inptype" size="15">
        </font></td>
    </tr>
    <tr> 
      <td align="center" class="tdganjil">99</td>
      <td class="tdganjil">xxxx50xxxx</td>
      <td align="center" class="tdganjil"><font face="Tahoma, Verdana" size="2">
		POP</font></td>
      <td align="center" class="tdganjil"><input type="checkbox" name="checkbox" value="checkbox"></td>
      <td align="center" class="tdganjil">v</td>
      <td align="center" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield323333" type="text" class="inptype" size="10">
        </font><img src="../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"></td>
      <td align="center" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield323262324" type="text" class="inptype" size="15">
        </font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="20%" height="30">&nbsp;</td>
      <td width="50%" align="right"><a href="javascript:history.go(-1);"><img src="../Images/ButtonSave.gif" width="100" height="20" border="0"></a><a href="javascript:history.go(-1);"> 
        <img src="../Images/ButtonCancel.gif" width="100" height="20" border="0"></a> 
      </td>
    </tr>
  </table>
  </form>
</div>
</body>
</html>
