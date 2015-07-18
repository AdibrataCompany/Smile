<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="../Include/Insurance.css">
<script language="JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
<style type="text/css">
.style1 {
	color: #0066CC;
}
</style>
</head>

<body>
<form id="frmInsuranceBilling" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">INSURANCE BILLING</td>
      <td width="10"><img src="../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="20%" class="tdgenap">Branch </td>
          <td class="tdganjil">Jakarta Elektronik&nbsp;</td>
          <td class="tdgenap" width="20%">Insurance Co</td>
          <td class="tdganjil"> 
            <select name="select">
              <option selected>PANIN-JKT</option>
            </select>
          </td>
        </tr>
        <tr> 
          <td width="150" class="tdgenap">Search By</td>
          <td class="tdganjil" width="778" > 
            <select name="select2">
              <option selected>Agreement No</option>
              <option>Customer Name</option>
              <option>Policy No</option>
            </select>
            <input name="textfield32" type="text" class="inptype" size="15">
          </td>
               <td width="150" class="tdgenap">Currency ID</td>
          <td class="tdganjil" width="778" > 
            <select name="select2">
              <option selected>Select One</option>
              <option>IDR</option>
              <option>USD</option>
            </select>&nbsp;
          </td>

        </tr>
      </table>
    </div>
    <table width="95%" border="0" cellspacing="0" cellpadding="0" align="center">
      <tr> 
        <td width="50%" height="30">&nbsp;</td>
        <td width="50%" align="right"><img src="../Images/ButtonSearch.gif" width="100" height="20" border="0"> 
          <img src="../Images/ButtonReset.gif" width="100" height="20"> </td>
      </tr>
    </table>
    <br>
  </div>
<table width="95%" border="0" cellspacing="0" cellpadding="0" align="center">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">INSURANCE BILLING LISTING</td>
      <td width="10"><img src="../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid" align="center">
    <tr> 
    <td>
	<asp:DataGrid id="dtgPaging" runat="server" width="100%" cssclass="tablegrid" allowsorting="True" autogeneratecolumns="False" borderwidth="0px" cellpadding="3" cellspacing="1" DataSourceID="XmlDataSource1">
						<AlternatingItemStyle CssClass="tdgenap" />
						<ItemStyle CssClass="tdganjil" />
						<HeaderStyle HorizontalAlign="Center" CssClass="tdjudul" />
						<Columns>
							<asp:templatecolumn>
								<ItemTemplate>
									<asp:CheckBox ID="chkInsuranceBillingSelection" runat="server">
									</asp:CheckBox>
								</ItemTemplate>
								<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
								<ItemStyle HorizontalAlign="Center"></ItemStyle>
								<HeaderTemplate>
								<asp:CheckBox ID="chkAll" runat="server"></asp:CheckBox>
								</HeaderTemplate>
							</asp:templatecolumn>

							<asp:templatecolumn HeaderText="AGREEMENT NO">
								<ItemTemplate>
									<asp:Label runat="server" Text='<%# Eval("valstring3") %>' id="lblinsurance">
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
									<asp:Label runat="server" Text='<%# Eval("valstring3") %>' id="lblused">
									</asp:Label>
								</ItemTemplate>
							</asp:templatecolumn>
							<asp:templatecolumn HeaderText="POLICY NO">
								<ItemTemplate>
									<asp:Label runat="server" Text='<%# Eval("valstring3") %>' id="lblcoverage">
									</asp:Label>
								</ItemTemplate>
							</asp:templatecolumn>
							<asp:templatecolumn HeaderText="POLICY RECEIVE DATTE">
								<ItemTemplate>
									<asp:Label runat="server" Text='<%# Eval("valstring3") %>' id="lblcurrency">
									</asp:Label>
								</ItemTemplate>
							</asp:templatecolumn>
						</Columns>
						<HeaderStyle CssClass="tdjudulhijau" />
					</asp:DataGrid>
					<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
		</asp:XmlDataSource>
					</td>
    </tr>
    </table>

				
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
  
  <table width="95%" border="0" cellspacing="0" cellpadding="0" align="center">
    <tr> 
      <td width="50%" height="30"><a href="InsuranceBillingSelect.aspx"><img src="../Images/ButtonSelect.gif" width="100" height="20" border="0"></a></td>
      <td width="50%" align="right">&nbsp;</td>
    </tr>
  </table>

</form>
</body>
</html>
