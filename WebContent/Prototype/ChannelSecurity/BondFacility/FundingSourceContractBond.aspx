<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
</head>
<body>
<form runat="server" id="FrmFundingSourceContractBond">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopitoscakiri">&nbsp;</td>
      <td align="center" class="tdtopitosca">FUNDING CONTRACT FOR BOND</td>
      <td width="10" class="tdtopitoscakanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="150" class="tdgenap">Funding Company Branch</td>
      <td class="tdganjil">	<select name="Select1" style="width: 140px">
				<option>BII</option>
				<option>PANIN</option>

			</select>		&nbsp;</td>
    </tr>
     <tr> 
      <td width="150" class="tdgenap">Contract Status</td>
      <td class="tdganjil">	<select name="Select1" style="width: 86px">
				<option>Active</option>
				<option>Not Active</option>
				<option>All</option>

			</select>		&nbsp;</td>
    </tr>

    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><img src="../../Images/ButtonSearch.gif" width="100" height="20" border="0"> 
        <img src="../../Images/ButtonReset.gif" width="100" height="20" border="0"> 
      </td>
    </tr>
 </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopitoscakiri">&nbsp;</td>
      <td align="center" class="tdtopitosca">FUNDING CONTRACT FOR BOND LISTING</td>
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
			<asp:templatefield HeaderText="T & C">
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="BtnTnc" ImageUrl="../../images/Icontnc.gif" NavigateUrl="../FundingSourceContractTLTnC.htm" />
				</ItemTemplate>
			</asp:templatefield>

			<asp:templatefield HeaderText="NEG. COV.">
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="BtnNegCov" ImageUrl="../../images/IconNegCov.gif" NavigateUrl="../FundingSourceContractNegCov.htm" />
				</ItemTemplate>
			</asp:templatefield>

			<asp:templatefield HeaderText="PLAFON BRANCH">
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="BtnPlafon" ImageUrl="../../images/IconPlafonBranch.gif" NavigateUrl="../FundingSourceContractPlafon.htm" />
				</ItemTemplate>
			</asp:templatefield>

			<asp:templatefield HeaderText="DOC.">
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="BtnDoc" ImageUrl="../../images/IconDocument.gif" NavigateUrl="../ContractDocumentListing.htm" />
				</ItemTemplate>
			</asp:templatefield>

			<asp:templatefield HeaderText="BATCH">
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="BtnBatch" ImageUrl="../../images/IconDrawDown.gif" NavigateUrl="../Drawdown.htm" />
				</ItemTemplate>
			</asp:templatefield>

			<asp:templatefield HeaderText="EDIT">
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="FundingSourceContractBondEdit.aspx" />
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="DELETE">
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../images/IconDelete.gif" />
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
  
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">
		&nbsp;</td>
      <td width="50%" align="right"><a href="FundingSourceContractBondAdd.aspx">
		<img src="../../Images/ButtonAdd.gif" width="100" height="20" border="0"></a> 
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
