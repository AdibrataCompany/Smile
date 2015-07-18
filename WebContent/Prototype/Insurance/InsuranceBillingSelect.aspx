<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head>

<body>

<form id="form1" runat="server">

<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">INSURANCE BILLING</td>
      <td width="10"><img src="../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="150" class="tdgenap" style="height: 17px">Insurance Co</td>
          <td class="tdganjil" style="height: 17px">xxxxxxx20xxxxxxxxx</td>
        </tr>
        <tr> 
          <td class="tdgenap">Invoice No</td>
          <td class="tdganjil"><input name="textfield3" type="text" class="inptype" size="15"> 
            <font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="tdgenap">Invoice Date</td>
          <td class="tdganjil"><input name="textfield32" type="text" class="inptype" size="15"> 
            <img src="../Images/iconcalendar.gif" width="20" height="20"> <font color="red">*)</font> 
          </td>
        </tr>
         <tr> 
          <td class="tdgenap">Received Invoice Date</td>
          <td class="tdganjil"><input name="textfield32" type="text" class="inptype" size="15"> 
            <img src="../Images/iconcalendar.gif" width="20" height="20"> <font color="red">*)</font> 
          </td>
        </tr>

        <tr> 
          <td class="tdgenap">Due Date</td>
          <td class="tdganjil"><input name="textfield322" type="text" class="inptype" size="15"> 
            <img src="../Images/iconcalendar.gif" width="20" height="20"><font color="red">*)</font> 
          </td>
        </tr>
        <tr>
          <td class="tdgenap">Currency</td>
          <td class="tdganjil">IDR</td>
        </tr>
      </table>
    </div>
    
  </div>
  
	<asp:DataGrid id="dtgPaging" runat="server" width="95%" allowsorting="True" autogeneratecolumns="False" borderwidth="0px" cellpadding="3" cellspacing="1" DataSourceID="XmlDataSource1">
						<AlternatingItemStyle CssClass="tdgenap" />
						<ItemStyle CssClass="tdganjil" />
						<HeaderStyle HorizontalAlign="Center" CssClass="tdjudul" />
						<Columns>
							<asp:templatecolumn HeaderText="AGREEMENT NO">
								<ItemTemplate>
									<asp:Label runat="server" Text='<%# Eval("valstring20") %>' id="lblinsurance">
									</asp:Label>
								</ItemTemplate>
							</asp:templatecolumn>
							<asp:templatecolumn HeaderText="CUSTOMER NAME">
								<ItemTemplate>
									<asp:Label runat="server" Text='<%# Eval("valstring50") %>' id="lblusage">
									</asp:Label>
								</ItemTemplate>
							</asp:templatecolumn>
							<asp:templatecolumn HeaderText="ASSET DESCRIPTION">
								<ItemTemplate>
									<asp:Label runat="server" Text='<%# Eval("valstring20") %>' id="lblused">
									</asp:Label>
								</ItemTemplate>
							</asp:templatecolumn>
							<asp:templatecolumn HeaderText="POLICY NO">
								<ItemTemplate>
									<asp:Label runat="server" Text='<%# Eval("valstring20") %>' id="lblcoverage">
									</asp:Label>
								</ItemTemplate>
							</asp:templatecolumn>
							<asp:templatecolumn HeaderText="PREMIUM / ENDORSMENT TO INSCO">
								<ItemTemplate>
									<asp:Label runat="server" Text='<%# Eval("valAmount") %>' id="lblcurrency">
									</asp:Label>
								</ItemTemplate>
								<ItemStyle HorizontalAlign="Right"></ItemStyle>
							</asp:templatecolumn>
							<asp:templatecolumn HeaderText="PREMIUM TO BE PAID">
								<ItemTemplate>
									<asp:TextBox runat="server" CssClass="inptype" Text='<%# Eval("valAmount") %>' id="lblcurrency">
									</asp:TextBox>
								</ItemTemplate>
								<ItemStyle HorizontalAlign="Right"></ItemStyle>

							</asp:templatecolumn>
							<asp:templatecolumn HeaderText="INVOICE AMOUNT">
								<ItemTemplate>
									<asp:TextBox runat="server" CssClass="inptype" Text='<%# Eval("valAmount") %>' id="lblcurrency">
									</asp:TextBox>
								</ItemTemplate>
								<ItemStyle HorizontalAlign="Right"></ItemStyle>
							</asp:templatecolumn>
						</Columns>
						<HeaderStyle CssClass="tdjudulhijau" />
					</asp:DataGrid>
  <asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
		</asp:XmlDataSource>

  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><img src="../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="193" class="tdgenap">Total Admin Fee</td>
      <td width="732" align="right" class="tdganjil" colspan="2"> 
        <div align="left"> 
          <input name="textfield34" type="text" class="inptype" size="15">
        </div>
      </td>
    </tr>
    <tr> 
      <td width="193" class="tdgenap">Total Stamp Duty Fee</td>
      <td align="right" class="tdganjil" colspan="2" width="732"> 
        <div align="left"> 
          <input name="textfield35" type="text" class="inptype" size="15">
        </div>
      </td>
    </tr>
     <tr> 
      <td width="193" class="tdgenap">Total Account</td>
      <td align="right" class="tdganjil" colspan="2" width="732"> 
        <div align="left">99</div>
      </td>
    </tr>
	 <tr> 
      <td width="193" class="tdgenap">Total Premium To Be Paid</td>
      <td align="right" class="tdganjil" colspan="2" width="732"> 
        <div align="left">999,999,999</div>
      </td>
    </tr>

    <tr> 
      <td width="193" class="tdgenap">Total Invoice Amount</td>
      <td align="right" class="tdganjil" colspan="2" width="732"> 
        <div align="left">999,999,999</div>
      </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><img src="../Images/ButtonCalculate.gif" width="100" height="20" border="0"> 
        <a href="javascript:history.go(-1);"><img src="../Images/ButtonSave.gif" width="100" height="20" border="0"></a> 
        <a href="InsuranceBilling.aspx"><img src="../Images/ButtonCancel.gif" width="100" height="20" border="0"></a></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
