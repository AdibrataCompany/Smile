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
<form runat="server" id="frm1">
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
          <td width="25%" class="tdgenap">Branch</td>
          <td width="25%" class="tdganjil"> Palmerah</td>
          <td width="25%" class="tdgenap">Insurance Company</td>
          <td width="25%" class="tdganjil"> <select name="select">
              <option>Select One</option>
              <option selected>Panin Insurance Jakarta</option>
            </select> </td>
        </tr>
        <tr> 
          <td class="tdgenap">Search By</td>
          <td class="tdganjil"> <select name="select4">
              <option selected>Agreement No.</option>
              <option>Customer Name</option>
            </select> <input name="textfield3" type="text" class="inptype" size="15"> 
          </td>
          <td class="tdgenap">&nbsp;</td>
          <td class="tdganjil">&nbsp;</td>
        </tr>
          <tr> 
          <td width="25%" class="tdgenap">Insured By</td>
          <td width="25%" class="tdganjil">  
            <select name="select5">
              <option selected>Select One</option>
              <option>Company</option>
               <option>Customer</option>
               </select></td>
          <td width="25%" class="tdgenap">Paid By </td>
          <td width="25%" class="tdganjil">  
            <select name="select6">
              <option selected>Select One</option>
              <option>At Cost</option>
               <option>Customer</option>
               </select></td>
        </tr>

      </table>
    </div>
    <table width="95%" border="0" cellspacing="0" cellpadding="0">
      <tr> 
        <td width="50%" height="30">&nbsp;</td>
        <td width="50%" align="right"><img src="../Images/ButtonSearch.gif" width="100" height="20" border="0"> 
          <img src="../Images/ButtonReset.gif" width="100" height="20" border="0"></td>
      </tr>
    </table>
    <br>
  </div>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">POLICY RECEIVE LISTING</td>
      <td width="10"><img src="../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
  <td>
   <asp:GridView runat="server" id="GrdViewInsCoSetting" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="100%">
  <Columns>
	<asp:templatefield HeaderText="AGREEMENT NO">
		<AlternatingItemTemplate>
			<asp:hyperlink  runat="server" Text="xxxxx10xxxxx" NavigateUrl="InsuranceCompanyBranchView.htm" target="_blank"/>
		</AlternatingItemTemplate>
		<ItemTemplate>
			<asp:hyperlink  runat="server" Text="xxxxx10xxxxx" NavigateUrl="InsuranceCompanyBranchView.htm" target="_blank"/>
		</ItemTemplate>
	</asp:templatefield>	
	<asp:boundfield DataField="valstring25" HeaderText="CUSTOMER NAME" SortExpression="valstring25">
	</asp:boundfield>
	<asp:boundfield DataField="valstring25" HeaderText="ASSET DESCRIPTION" SortExpression="valstring20">
	</asp:boundfield>
	<asp:boundfield DataField="valstring25" HeaderText="INSURANCE COMPANY" SortExpression="vphone">
	</asp:boundfield>
	<asp:boundfield DataField="valstring10" HeaderText="INSURED BY" SortExpression="valstring20">
	</asp:boundfield>
	<asp:boundfield DataField="valstring10" HeaderText="PAID BY" SortExpression="valstring20">
	</asp:boundfield>
	<asp:templatefield HeaderText="EDIT">
		<ItemTemplate>
			<asp:ImageButton runat="server" ImageUrl="../images/iconEdit.gif" PostbackUrl="PolicyReceivingReceive.aspx" />
		</ItemTemplate>
		<ItemStyle HorizontalAlign="Center" />
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
  
</div>
</form>
</body>
</html>
