<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
</head>
<body>
<form runat="server" id="FrmFundingAgreementBond">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopitoscakiri">&nbsp;</td>
      <td align="center" class="tdtopitosca">FUNDING COMPANY FOR BOND</td>
      <td width="10" class="tdtopitoscakanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" style="width: 26%">Funding Company Branch</td>
      <td class="tdganjil"><select name="select2">
          <option selected>INA</option>
          <option>BUANA</option>
          <option>BNI</option>
        </select> 
        <input name="textfield3" type="text" class="inptype" size="20"></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<img src="../../Images/ButtonSearch.gif" width="100" height="20" border="0"> 
        <img src="../../Images/ButtonReset.gif" width="100" height="20" border="0"> 
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopitoscakiri">&nbsp;</td>
      <td align="center" class="tdtopitosca">FUNDING COMPANY FOR BOND LISTING</td>
      <td width="10" class="tdtopitoscakanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center"> 
      <asp:GridView runat="server" id="GrdViewBranch" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
		<Columns>
			<asp:boundfield DataField="valstring20" HeaderText="FUNDING CONTRACT NO">
			</asp:boundfield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="SELECTION TIME">
			</asp:boundfield>
			<asp:templatefield HeaderText="ADD AGREEMENT">
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="BtnTnc" ImageUrl="../../images/IconAddNew.gif" NavigateUrl="AddAgreementBond.aspx" />
				</ItemTemplate>
			</asp:templatefield>

			<asp:templatefield HeaderText="ADD SPECIFIC AGREEMENT">
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="BtnNegCov" ImageUrl="../../images/IconAddNew.gif" NavigateUrl="AddSpecificAgreementBond.aspx" />
				</ItemTemplate>
			</asp:templatefield>

			<asp:templatefield HeaderText="REVIEW AGREEMENT PLEDGED">
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="BtnPlafon" ImageUrl="../../images/IconClaim.gif" NavigateUrl="ReviewAgreementSelectedBond.aspx" />
				</ItemTemplate>
			</asp:templatefield>

			<asp:templatefield HeaderText="AGREEMENT SELECTED">
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="BtnDoc" ImageUrl="../../images/IconDocument.gif" NavigateUrl="AgreementSelectedBond.aspx" />
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
  

  </div>
  </form>
</body>
</html>
