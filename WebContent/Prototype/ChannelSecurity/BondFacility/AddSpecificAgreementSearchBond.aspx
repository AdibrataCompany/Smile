<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
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
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopitoscakiri">&nbsp;</td>
      <td align="center" class="tdtopitosca">ADD SPECIFIC AGREEMENT FOR BOND</td>
      <td width="10" class="tdtopitoscakanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdganjil"> 
      <td width="200" class="tdgenap">Bank</td>
      <td class="tdganjil">xxxxxxxxxxxxxx50xxxxxxxxxxxxxx</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap">Funding Company Branch</td>
      <td class="tdganjil">xxxxxxxxxxxxxx50xxxxxxxxxxxxxx</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap">Contract No</td>
      <td>xxxxxxx20xxxxxx</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap">Contract Name</td>
      <td class="tdganjil">xxxxxxxxxxxxxx50xxxxxxxxxxxxxx</td>
    </tr>
    
    <tr class="tdganjil"> 
      <td class="tdgenap">Branch</td>
      <td class="tdganjil">
			<select name="Select2">
			<option>Select One</option>
			<option>Jakarta Electronic </option>
			<option>Palmerah</option>

			</select></td>
    </tr>
    <tr>
      <td class="tdgenap" style="width: 162px">Validation With TC</td>
      <td class="tdganjil">
			<select name="Select3">
			<option>Yes</option>
			<option>No </option>
			</select></td>
    	</tr>

    <tr class="tdganjil"> 
      <td class="tdgenap">Search By </td>
      <td class="tdganjil">
				<select name="Select1">
			<option>Select One</option>
			<option>Agreement No </option>
			<option>Customer Name</option>

			</select><input name="Text1" type="text" class="inptype">
		</td>
    </tr>
  </table>
   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td height="30">&nbsp; </td>
      <td align="right">
		<img src="../../Images/ButtonSearch.gif" width="100" height="20" border="0">      </td>
    </tr>
  </table>
  <div align="center"> 
      <asp:GridView runat="server" id="GrdViewBranch" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
		<Columns>
			<asp:templatefield HeaderText="APPLICATION ID">
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="LinkApplicationid" NavigateUrl="AddSpesificAgreementSearchBond.aspx" Text="xxxx20xxxx" />
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="AGREEMENT">
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="LinkAgreementNo" NavigateUrl="AddSpesificAgreementSearchBond.aspx" Text="xxxx20xxxx" />
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="CUSTOMER NAME">
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="LinkAgreementNo" NavigateUrl="AddSpesificAgreementSearchBond.aspx" Text="xxxx20xxxx" />
				</ItemTemplate>
			</asp:templatefield>
			<asp:boundfield DataField="valAmount" HeaderText="O/S &nbsp; A/R">
			</asp:boundfield>
			<asp:boundfield DataField="valAmount" HeaderText="O/S PRINCIPAL">
			</asp:boundfield>
			<asp:boundfield DataField="valNum3" HeaderText="TENOR">
			</asp:boundfield>
			<asp:boundfield DataField="valAmount" HeaderText="OTR">
			</asp:boundfield>
			<asp:boundfield DataField="valString50" HeaderText="ASSET DESCRIPTION">
			</asp:boundfield>
			<asp:templatefield>
				<HeaderTemplate>
					<asp:CheckBox runat="server" id="CheckBox1" />
				</HeaderTemplate>
				<ItemStyle HorizontalAlign="Center" />
				<HeaderStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:CheckBox runat="server" id="CheckBox1" />
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
  <div align="center"> 
    <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
      <tr class="tdganjil"> 
        <td colspan="5" class="tdgenap">Total Agreement Selected</td>
      </tr>
      <tr class="tdganjil"> 
        <td width="20%" class="tdgenap">Principal Amount</td>
        <td width="26%" class="tdganjil">999,999,999,999</td>
        <td class="tdgenap">OTR Amount</td>
        <td colspan="2">999,999,999,999</td>
      </tr>
      <tr class="tdganjil"> 
        <td class="tdgenap">A/R Amount</td>
        <td class="tdganjil">999,999,999,999</td>
        <td width="19%" class="tdgenap">Account</td>
        <td width="35%" colspan="2"><div align="left">9999 <a href="javascript:history.go(-1);"> 
            </a></div></td>
      </tr>
       <tr class="tdganjil"> 
        <td class="tdgenap">Amount must be add</td>
        <td class="style1">999,999,999,999</td>
        <td class="tdgenap">&nbsp;</td>
        <td colspan="2">&nbsp;</td>
      </tr>

      
    </table>
    <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
            <tr class="tdganjil"> 
        <td colspan="5" class="tdganjil">
          <div align="right"><a href="AddSpecificAgreementSearchBond.aspx"> &nbsp;<img src="../../Images/Buttonaddagreement.gif"  border="0" align="absmiddle"> 
			<a href="FundingAgreementBond.aspx"> <img src="../../Images/ButtonCancel.gif" width="100" height="20" border="0" align="absmiddle">
            </a>
            </div>
            </td>
      </tr>
    </table>

 
  </div>
</div>
</form>
</body>
</html>
