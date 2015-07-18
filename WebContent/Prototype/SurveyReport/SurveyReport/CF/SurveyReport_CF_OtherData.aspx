<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html xmlns:m="http://schemas.microsoft.com/office/2004/12/omml" xmlns:v="urn:schemas-microsoft-com:vml" xmlns:o="urn:schemas-microsoft-com:office:office">
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
<form runat="Server" id="frmCompanyCustomerMarketingMemoLS">
<div align="center">
   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SURVEY REPORT - OTHER DATA</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap" >Application ID</td>
      <td class="tdganjil" ><asp:Hyperlink ID="hypApplicationID" runat="server"  Text="ApplicationID00001" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank"></asp:Hyperlink></td>
      <td width="20%" class="tdgenap" >Customer Name</td>
      <td class="tdganjil" ><asp:Hyperlink ID="hypCustomerName" runat="server"  Text="ApplicationID00001" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank"></asp:Hyperlink></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Product</td>
      <td class="tdganjil" colspan="3"><asp:Hyperlink ID="hypProductOffering" runat="server"  Text="ProductOffering001" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank"></asp:Hyperlink></td>
    </tr>
    </table>
    
    <br>
	 <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">CREDIT CHECKING RESULT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>

	<table align="center" width="95%">
	 <tr> 
      <td width="20%" class="tdgenap">Source</td>
      <td class="tdganjil" ><asp:dropdownlist ID="ddlSource" runat="server"  CssClass="inptype">
    		 <asp:ListItem Text="Bank/Finance lain" Value="BANK"></asp:ListItem>
     		 <asp:ListItem Text="Karyawan BFI" Value="BFI"></asp:ListItem>
			 <asp:ListItem Text="Existing Cust" Value="CUST"></asp:ListItem>
			 <asp:ListItem Text="Rekan kerja" Value="PARTN"></asp:ListItem>
			 <asp:ListItem Text="Lingkungan" Value="LINGK"></asp:ListItem>
			 <asp:ListItem Text="Lain-lain" Value="LAINLAIN"></asp:ListItem>
      </asp:dropdownlist ><font color="red">*)</font></td>
      </tr>
      <tr>
      <td width="20%" class="tdgenap">Result</td>
      <td class="tdganjil" >
		<asp:TextBox ID="txtCreditCheckingResult" runat="server"  Width="400px"  TextMode="MultiLine" CssClass="inptype" Height="43px"></asp:textbox><font color="red">*)</font></td>
    </tr>
    </table>
 <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbAddCreditChecking" imageurl="../../Images/ButtonAdd.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>

<table width="95%" align="center">
<tr>
<td>
 <asp:GridView runat="server" id="grdCreditCheckingResult" AllowSorting="true" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="100%" >
    <Columns>
    <asp:templatefield HeaderText="SOURCE" SortExpression="ApplicationID">
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lnkApplicationID" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:Label >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lnkApplicationID" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="RESULT" SortExpression="CustomerName">
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lnkCustomerName" NavigateUrl="../Credit/ViewCompanyCustomer.htm" Target="_blank">xxxxxxxx50xxxxxxxx
				</asp:Label >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lnkCustomerName" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx50xxxxxxxx
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
	

		<asp:templatefield HeaderText="DELETE">
			<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="lnkDelCapitalDetail" ImageUrl="../../Images/IconDelete.gif">
				</asp:ImageButton >

			</AlternatingItemTemplate>
			<ItemTemplate>
					<asp:ImageButton runat="server" id="lnkDelCapitalDetail" ImageUrl="../../Images/IconDelete.gif" ></asp:ImageButton >

			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
</td>
</tr>
</table>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="20%">Capacity, Condition and Other Information</td>
      <td><asp:textbox id="txtOtherInformation" runat="server" Width="400" TextMode="MultiLine" CssClass="inptype"> </asp:textbox>
	
      </td>
    </tr>
    <tr> 
      <td width="20%">File Attachment</td>
      <td><input type="file" class="inptype"/>
      </td>
    </tr>

  </table>
  <br>
  
	<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">CAPITAL</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
	<table align="center" width="95%">
	 <tr> 
      <td width="20%" class="tdgenap" >Home Status</td>
      <td class="tdganjil" ><asp:dropdownlist ID="ddlHomeStatus" runat="server"  CssClass="inptype"></asp:dropdownlist ><font color="red">*)</font></td>
      <td width="20%" class="tdgenap" >Home Price</td>
      <td class="tdganjil" ><asp:TextBox ID="txtHomePrice" runat="server"  CssClass="inptype"></asp:textbox><font color="red">*)</font></td>
    </tr>
	 <tr> 
      <td width="20%" class="tdgenap">Home Owner Name</td>
      <td class="tdganjil" ><asp:TextBox ID="txtHomeOwnerName" runat="server"  CssClass="inptype"></asp:textbox><font color="red">*)</font></td>
      <td width="20%" class="tdgenap">Stay Since Year</td>
      <td class="tdganjil" ><asp:TextBox ID="txtStaySinceYear" runat="server"  CssClass="inptype"></asp:textbox><font color="red">*)</font></td>
    </tr>
 	<tr> 
      <td width="20%" class="tdgenap">Rent Finish Date</td>
      <td class="tdganjil"><asp:TextBox ID="txtRentFinishDate" runat="server"  CssClass="inptype"></asp:textbox><font color="red">*)</font></td>
      <td width="20%" class="tdgenap">Rent Fee / Year</td>
      <td class="tdganjil"><asp:TextBox ID="txtRentFee" runat="server"  CssClass="inptype"></asp:textbox><font color="red">*)</font></td>
    </tr>
	<tr> 
      <td width="20%" class="tdgenap">Home Location</td>
      <td class="tdganjil" colspan="3"><asp:TextBox ID="txtHomeLocation" runat="server"  CssClass="inptype"></asp:textbox><font color="red">*)</font></td>
    </tr>
    </table>
	<table width="95%">
	 <tr> 
	      <td colspan="4" class="tdjudulhijau">CAPITAL DETAIL</td>
	    </tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbAddCapital" imageurl="../../Images/ButtonAdd.gif" runat="server"></asp:ImageButton></td>
    </tr>
  </table>
<table width="95%" align="center">
<tr>
<td>
 <asp:GridView runat="server" id="grdCapitalDetail" AllowSorting="true" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="100%" >
    <Columns>
    <asp:templatefield HeaderText="ASSET TYPE" SortExpression="ApplicationID">
			<AlternatingItemTemplate>
				<asp:textbox runat="server" id="txtAssetType"  CssClass="inptype">
				</asp:textbox>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:textbox runat="server" id="lnkApplicationID"  CssClass="inptype">
				</asp:textbox>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="ASSET NAME" SortExpression="CustomerName">
			<AlternatingItemTemplate>
				<asp:textbox runat="server" id="lnkCustomerName"  CssClass="inptype">
				</asp:textbox >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:textbox runat="server" id="lnkCustomerName"  CssClass="inptype">
				</asp:textbox>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="ASSET OWNER STATUS" SortExpression="ProductOffering">
			<AlternatingItemTemplate>
				<asp:textbox runat="server" id="txtOwnerStatus" CssClass="inptype">
				</asp:textbox>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:textbox runat="server" id="txtOwnerStatus" CssClass="inptype">
				</asp:textbox >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="ESTIMATION ASSET PRICE" SortExpression="ME">
			<AlternatingItemTemplate>
				<asp:textbox runat="server" id="txtEstimationAssetPrice" CssClass="inptype">
				</asp:textbox >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:textbox runat="server" id="txtEstimationAssetPrice" CssClass="inptype">
				</asp:textbox >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
			<asp:templatefield HeaderText="FINANCE COMPANY" SortExpression="ME">
			<AlternatingItemTemplate>
				<asp:textbox runat="server" id="txtFinanceCompany" CssClass="inptype">
				</asp:textbox>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:textbox runat="server" id="txtFinanceCompany" CssClass="inptype">
				</asp:textbox >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
	<asp:templatefield HeaderText="INSTALLMENT PER MONTH" SortExpression="ME">
			<AlternatingItemTemplate>
				<asp:textbox runat="server" id="txtInstallmentPerMonth" CssClass="inptype">
				</asp:textbox >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:textbox runat="server" id="txtInstallmentPerMonth" CssClass="inptype">
				</asp:textbox >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="DELETE">
			<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="lnkDelCapitalDetail" ImageUrl="../../Images/IconDelete.gif">
				</asp:ImageButton >

			</AlternatingItemTemplate>
			<ItemTemplate>
					<asp:ImageButton runat="server" id="lnkDelCapitalDetail" ImageUrl="../../Images/IconDelete.gif" ></asp:ImageButton >

			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>


</td>
</tr>
</table>
<br>
	<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">PURPOSE</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
		<table align="center" width="95%">
 	<tr> 
      <td width="20%" class="tdgenap">Finance Purpose</td>
      <td class="tdganjil"><asp:DropDownList ID="ddlFinancePurpose" runat="server">
      <asp:ListItem Text="Productive" Value="Prod"></asp:ListItem>
      <asp:ListItem Text="Consumtive" Value="Cons"></asp:ListItem>
	  </asp:DropDownList>
		<asp:TextBox ID="txtDescriptionFinancePurpose" runat="server" textmode="MultiLine" CssClass="inptype" Width="263px" Height="41px"></asp:textbox></td>
		</tr>
	  <tr>
      <td width="20%" class="tdgenap">Usage Unit Purpose</td>
      <td class="tdganjil"><asp:DropDownList ID="ddlUsageUnitPurpose" runat="server">
      <asp:ListItem Text="Pribadi / Pasangan" Value="SINGLE"></asp:ListItem>
      <asp:ListItem Text="Keluarga" Value="FAMILY"></asp:ListItem>
      <asp:ListItem Text="Orang Lain" Value="OTHER"></asp:ListItem>
      </asp:DropDownList>
      <asp:TextBox ID="txtDescriptionUsageUnitPurpose" runat="server" textmode="MultiLine"  CssClass="inptype" Width="220px" Height="53px"></asp:textbox></td>
    </tr>
    </table>
    <br>
    	<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">DOCUMENT CAPACITY ATTACHMENT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
	<table align="center" width="95%">
 
</table>
 
  
	
		 <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
  	<tr> 
      <td width="20%" class="tdgenap">Financial Data Type</td>
      <td class="tdganjil"><asp:DropDownList ID="ddlFinancialDataType" runat="server" AutoPostBack="True" CssClass="inptype">
      <asp:ListItem Text="Ijin Usaha" Value="IJINUSAHA"></asp:ListItem>
      <asp:listitem text="TDP/SIUP/Akte" Value="TDP"></asp:ListItem>
      <asp:ListItem Text="SPK Exp" Value="SPKEXP"></asp:ListItem>
      <asp:ListItem Text="SPK Aktif" Value="SPKACT"></asp:ListItem>
      <asp:ListItem Text="Bon/Nota Tagihan" Value="BON"></asp:ListItem>
      <asp:ListItem Text="Buku Tabungan" Value="REK"></asp:ListItem>
      <asp:ListItem Text="RK" Value="RK"></asp:ListItem>
      <asp:ListItem Text="Slip Gaji/SK Gaji" Value="SLIP"></asp:ListItem>
      <asp:ListItem Text="Bukti Kepemilikan unit lain" Value="OTHER"></asp:ListItem>
      <asp:ListItem Text="Foto Usaha" Value="USAHA"></asp:ListItem>
      <asp:ListItem Text="Lain-lain" Value="OTHERS"></asp:ListItem>
      </asp:DropDownList ></td>
      <td width="20%" class="tdgenap">Amount Financial</td>
      <td class="tdganjil"><asp:TextBox ID="txtAmountFinancial" runat="server"  CssClass="inptype"></asp:textbox></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Notes</td>
      <td class="tdganjil" colspan="3">
		<asp:textBox ID="txtNotesFinancial" textmode="MultiLine" runat="server" CssClass="inptype" Width="326px"></asp:textbox></td>
    </tr>
    </table>
    <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbAddDocumentCapacity" imageurl="../../Images/ButtonAdd.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <table align="center" width="95%">
  <tr>
  <td>
  
  &nbsp;</td>
  </tr>
  </table>
	
	
    <% if ddlFinancialDataType.SelectedValue = "REK" Or ddlFinancialDataType.SelectedValue = "RK" Then %>
    <table width="95%">
	 <tr> 
	      <td colspan="4" class="tdjudulhijau">BANK STATEMENT<asp:GridView runat="server" id="grdDocmentCapacity" AllowSorting="true" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="100%" >
    <Columns>
    <asp:templatefield HeaderText="FINANCIAL DATA TYPE">
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lnkApplicationID" CssClass="inptype">
				</asp:Label >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lnkApplicationID" CssClass="inptype">
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="AMOUNT FINANCIAL">
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lnkCustomerName" CssClass="inptype">
				</asp:Label >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lnkCustomerName" CssClass="inptype">
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="NOTES">
			<AlternatingItemTemplate>
				<asp:Label runat="server" id="lblNotes" CssClass="inptype">
				</asp:Label >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" id="lblNotes" CssClass="inptype">
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="EDIT">
			<ItemTemplate>
					<asp:ImageButton runat="server" id="lnkEditCapitalDetail" ImageUrl="../../Images/IconEdit.gif" ></asp:ImageButton >

			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>

		<asp:templatefield HeaderText="DELETE">
			<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="lnkDelCapitalDetail" ImageUrl="../../Images/IconDelete.gif">
				</asp:ImageButton >

			</AlternatingItemTemplate>
			<ItemTemplate>
					<asp:ImageButton runat="server" id="lnkDelCapitalDetail" ImageUrl="../../Images/IconDelete.gif" ></asp:ImageButton >

			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>

  		</td>
	    </tr>
	</table>
		 <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr>
      <td class="tdgenap" style="width: 28%">Bank Name</td>
      <td colspan="3" class="tdganjil">
      <asp:DropDownList ID="ddlBankStatementBankName" runat="server">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="BCA" Value="BCA"></asp:ListItem>
      </asp:DropDownList></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Bank Branch</td>
      <td colspan="3" class="tdganjil"><asp:TextBox ID="txtBankStatementBankBranch" runat="server" CssClass="inptype"></asp:TextBox></td>
    </tr>
      <tr> 
      <td class="tdgenap" style="width: 28%">Account Name</td>
      <td colspan="3" class="tdganjil">
		<asp:TextBox ID="txtBankStatementAccountName" runat="server" CssClass="inptype"></asp:TextBox></td>    </tr>
	  <tr> 
      <td class="tdgenap" style="width: 28%">Account No</td>
      <td colspan="3" class="tdganjil">
		<asp:TextBox ID="txtBankStatementccountNo" runat="server" CssClass="inptype"></asp:TextBox>
		</td>  
	  </tr>
	   <tr> 
      <td class="tdgenap" style="width: 28%">Plafond</td>
      <td colspan="3" class="tdganjil">
		<asp:TextBox ID="txtBankStatementPlafond" runat="server" CssClass="inptype"></asp:TextBox>
		</td>  
	  </tr>

	  </table>
 <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbAddBankStatment" imageurl="../../Images/ButtonAdd.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <table align="center" width="95%">
  <tr>
  <td colspan="4">
  
  <asp:GridView runat="server" id="grdBankStatement" AllowSorting="true" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="100%" >
    <Columns>
    <asp:templatefield HeaderText="MONTH">
			<AlternatingItemTemplate>
				<asp:textbox runat="server" id="txtBankStatementMonth"  CssClass="inptype">
				</asp:textbox>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:textbox runat="server" id="txtBankStatementMonth"  CssClass="inptype">
				</asp:textbox>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="DEBIT">
			<AlternatingItemTemplate>
				<asp:textbox runat="server" id="txtCustomerName" CssClass="inptype">
				</asp:textbox>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:textbox runat="server" id="txtCustomerName" CssClass="inptype">
				</asp:textbox>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="CREDIT">
			<AlternatingItemTemplate>
				<asp:TextBox runat="server" id="txtBankStatementCredit" CssClass="inptype">
				</asp:TextBox >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtBankStatementCredit" CssClass="inptype">
				</asp:TextBox>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
			<asp:templatefield HeaderText="SALDO">
			<AlternatingItemTemplate>
				<asp:textBox  runat="server" id="txtBankStatementSaldo" CssClass="inptype">
				</asp:textBox>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:textBox  runat="server" id="txtBankStatementSaldo" CssClass="inptype">
				</asp:textBox>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="DELETE">
			<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="lnkDelCapitalDetail" ImageUrl="../../Images/IconDelete.gif">
				</asp:ImageButton >

			</AlternatingItemTemplate>
			<ItemTemplate>
					<asp:ImageButton runat="server" id="lnkDelCapitalDetail" ImageUrl="../../Images/IconDelete.gif" ></asp:ImageButton >

			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>

  </td>
  </tr>
  <tr> 
      <td class="tdgenap" style="width: 20%">Total Debit</td>
      <td class="tdganjil">
		<asp:label ID="lblBankStatementTotalDebit" runat="server" Text="999,999,999,999.99"></asp:label ></td>   
	<td class="tdgenap" style="width: 20%">Total Credit</td>
      <td class="tdganjil">
		<asp:label ID="lblBankStatementTotalCredit" runat="server" Text="999,999,999,999.99"></asp:label></td>   
 	</tr>
 	<tr>
 	<td class="tdgenap" style="width: 28%">Total Saldo</td>
      <td colspan="3" class="tdganjil">
		<asp:label ID="lblBankStatementTotalSaldo" runat="server" Text="999,999,999,999.99"></asp:label></td>
	</tr>
	<tr>
		<td class="tdgenap" style="width: 20%">Average Debit</td>
      <td class="tdganjil">
		<asp:label ID="lblBankStatementAvarageDebit" runat="server" Text="999,999,999,999.99"></asp:label></td>
	<td class="tdgenap" style="width: 20%">Average Credit</td>
      <td class="tdganjil">
		<asp:label ID="lblBankStatementAvarageCredit" runat="server" Text="999,999,999,999.99"></asp:label></td>
		</tr>
		<tr>
	<td class="tdgenap" style="width: 28%">Average Saldo</td>
      <td class="tdganjil">
		<asp:label ID="lblBankStatementAvarageSaldo" runat="server" Text="999,999,999,999.99"></asp:label></td>
	  </tr> 
	  <tr>
	<td class="tdgenap" style="width: 28%">Average Usage on Plafond</td>
      <td class="tdganjil">
		<asp:label ID="lblBankStatementAvarageUsageOnPlafond" runat="server" Text="999,999,999,999.99"></asp:label></td>
	  </tr> 

  <% End If%>
  </table>
  <br>
	<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">FINANCIAL SIMULATION MONTHLY</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%">
	 <tr> 
	      <td colspan="4" class="tdjudulhijau">INCOME ESTIMATION</td>
	    </tr>
	</table>
	
	<table align="center" width="95%">
	 <tr>
      <td class="tdgenap" style="width: 20%">Estimation Income By Salary / Bank</td>
      <td  class="tdganjil">
      <asp:label ID="lblEstimationIncomeByBank" runat="server">999,999,999,999.99</asp:label ></td>
      <td class="tdgenap">Estimation Income By Capacity Estimation</td>
      <td  class="tdganjil">
      <asp:label ID="lblCapacityEstimationIncomeByBank" runat="server">999,999,999,999.99</asp:label ></td>
      
    </tr>
    <tr>
  	<td class="tdgenap" style="width: 28%">Margin Profit Estimation</td>
      <td  class="tdganjil">
      <asp:textBox ID="lblMarginProfitEstimation" runat="server" CssClass="inptype"></asp:textBox></td>
      <td class="tdgenap" style="width: 28%">Margin Profit by Capacity Estimation</td>
      <td  class="tdganjil">
      <asp:label ID="lblMarginProfitEstimationByProfitEstimation" runat="server">999,999,999,999.99</asp:label ></td>
    </tr>
</table>
<table width="95%">
	 <tr> 
	      <td colspan="4" class="tdjudulhijau">EXPENSE LIST</td>
	    </tr>
	</table>
	<table align="center" width="95%">
	 <tr>
      <td class="tdgenap" style="width: 20%">Family Expense</td>
      <td  class="tdganjil" >
      <asp:textbox ID="txtFamilyExpsense" runat="server" CssClass="inptype">999,999,999,999.99</asp:textbox></td>
      <td class="tdgenap">Family Expense By Estimation</td>
      <td  class="tdganjil">
      <asp:textBox ID="txtFamilyExpsenseByEstimation" runat="server" CssClass="inptype">999,999,999,999.99</asp:textBox></td>
    </tr>
    <tr>
  	<td class="tdgenap" style="width: 20%">Unit Operation Expense</td>
      <td  class="tdganjil">
      <asp:textBox ID="txtUnitOperationExpense" runat="server" CssClass="inptype">999,999,999,999.99</asp:textBox></td>
      <td class="tdgenap">Unit Operation Expense by Capacity Estimation</td>
      <td  class="tdganjil">
      <asp:textBox ID="txtUnitOperationExpenseByEstimation" runat="server" CssClass="inptype">999,999,999,999.99</asp:textBox></td>
    </tr>
    <tr>
  	<td class="tdgenap">Other Operation Expense</td>
      <td  class="tdganjil">
      <asp:textBox ID="txtOtherOperationExpense" runat="server" CssClass="inptype">999,999,999,999.99</asp:textBox></td>
      <td class="tdgenap">Other Operation Expense by Capacity Estimation</td>
      <td  class="tdganjil">
      <asp:textBox ID="txtOtherOperationExpenseByEstimation" runat="server" CssClass="inptype">999,999,999,999.99</asp:textBox></td>
    </tr>
 	<tr>
  	<td class="tdgenap" width="20%">Third Part Allowance Expense</td>
      <td  class="tdganjil">
      <asp:textBox ID="txtThirdPartAllowanceExpense" runat="server" CssClass="inptype">999,999,999,999.99</asp:textBox></td>
      <td class="tdgenap" >Third Part Allowance Expense by Capacity Estimation</td>
      <td  class="tdganjil">
      <asp:textBox ID="txtThirdPartAllowanceExpenseByEstimation" runat="server" CssClass="inptype">999,999,999,999.99</asp:textBox></td>
    </tr>
	<tr>
  	<td class="tdgenap" style="width: 20%">Monthly Installment at Company</td>
      <td  class="tdganjil">
      <asp:textBox ID="txtMonthlyInstallmentExpense" runat="server" CssClass="inptype">999,999,999,999.99</asp:textBox></td>
      <td class="tdgenap" style="width: 20%">Monthly Installment at Company by Estimation</td>
      <td  class="tdganjil">
      <asp:textBox ID="txtMonthlyInstallmentExpenseByEstimation" runat="server" CssClass="inptype">999,999,999,999.99</asp:textBox></td>
    </tr>
</table>
	<table width="95%">
	 <tr> 
	      <td colspan="4" class="tdjudulhijau">OTHER EXPENSE</td>
	    </tr>
	</table>
	  <table align="center" width="95%">
  <tr>
  <td colspan="4">
  
  <asp:GridView runat="server" id="grdOtherExpense" AllowSorting="true" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="100%" >
    <Columns>
    <asp:templatefield HeaderText="EXPENSE DESCRIPTION">
			<AlternatingItemTemplate>
				<asp:textbox runat="server" id="txtBankStatementMonth"  CssClass="inptype">
				</asp:textbox>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:textbox runat="server" id="txtBankStatementMonth"  CssClass="inptype">
				</asp:textbox>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="AMOUNT">
			<AlternatingItemTemplate>
				<asp:textbox runat="server" id="txtCustomerName" CssClass="inptype">
				</asp:textbox>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:textbox runat="server" id="txtCustomerName" CssClass="inptype">
				</asp:textbox>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="AMOUNT BY CAPACITY ESTIMATION">
			<AlternatingItemTemplate>
				<asp:TextBox runat="server" id="txtBankStatementCredit" CssClass="inptype">
				</asp:TextBox >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:TextBox runat="server" id="txtBankStatementCredit" CssClass="inptype">
				</asp:TextBox>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="DELETE">
			<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="lnkDelCapitalDetail" ImageUrl="../../Images/IconDelete.gif">
				</asp:ImageButton >

			</AlternatingItemTemplate>
			<ItemTemplate>
					<asp:ImageButton runat="server" id="lnkDelCapitalDetail" ImageUrl="../../Images/IconDelete.gif" ></asp:ImageButton >

			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
  </td>
  </tr>
</table>

<table align="center" width="95%">
	 <tr>
      <td class="tdgenap" style="width: 20%">Total Other Expense</td>
      <td  class="tdganjil">
      <asp:label ID="lblTotalOtherExpense" runat="server">999,999,999,999.99</asp:label></td>
      <td class="tdgenap" style="width: 20%">Total Other Expense By Estimation</td>
      <td  class="tdganjil">
      <asp:label ID="lblTotalOtherExpenseByEstimation" runat="server">999,999,999,999.99</asp:label></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 20%">Ending Balance Income </td>
      <td  class="tdganjil">
      <asp:label ID="lblEndingBalanceIncome" runat="server">999,999,999,999.99</asp:label></td>
      <td class="tdgenap" style="width: 20%">Ending Balance Income By Estimation</td>
      <td  class="tdganjil">
      <asp:label ID="lblEndingBalanceIncomeByEstimation" runat="server">999,999,999,999.99</asp:label></td>
    </tr>
</table>
<br>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">COLLATERAL COVERAGE</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
 </table>
<table width="95%" align="center">
<tr>
<td>
 <asp:GridView runat="server" id="grdCollateralCoverage" AllowSorting="true" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="100%" >
    <Columns>
    <asp:templatefield HeaderText="AGREEMENT NO">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblAgreementNo"></asp:label >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblAgreementNo"></asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="ASSET DESCRIPTION">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblAssetDescription"></asp:label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblAssetDescription"></asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="O/S EXPOSURE">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblOSExposure"></asp:label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblOSExposure"></asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="PRICE LIST">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblPriceList">
				</asp:label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblPriceList">
				</asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="TENOR">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblTenor" CssClass="inptype">
				</asp:label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblTenor" CssClass="inptype">
				</asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
		<asp:templatefield HeaderText="LEFT TENOR">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblLeftTenor" CssClass="inptype">
				</asp:label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblLeftTenor" CssClass="inptype">
				</asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	<asp:templatefield HeaderText="INSTALLMENT AMOUNT">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblInstallmentAmount">
				</asp:label >
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblInstallmentAmount">
				</asp:label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	<asp:templatefield HeaderText="CUSTOMER STATUS">
			<AlternatingItemTemplate>
				<asp:label runat="server" id="lblCustomerStatus">
				</asp:label>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:label runat="server" id="lblCustomerStatus">
				</asp:label>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
</td>
</tr>
</table>      
	<table align="center" width="95%">
	<tr> 
      <td width="20%" class="tdgenap">Collateral Coverage Ratio</td>
      <td class="tdganjil" >
		<asp:label ID="lblCollateralCoverageRatio" runat="server">999,99%</asp:label></td>
    </tr>
	</table>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">MARKETING DEVIATION</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
	<table align="center" width="95%">
	<tr> 
      <td width="20%" class="tdgenap">Marketing Deviation Description</td>
      <td class="tdganjil" >
		<asp:textbox ID="txtMarketingDeviationDescription" runat="server" TextMode="MultiLine"   CssClass="inptype" Width="523px"></asp:textbox></td>
    </tr>
	</table>
  <br>
<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbSearch" imageurl="../../Images/ButtonSave.gif" runat="server" PostBackUrl="SurveyReport_CF_ApplicationDataList.aspx"></asp:ImageButton>
		<asp:ImageButton id="imbCancel" postbackurl="SurveyReport_CF_ApplicationDataList.aspx" imageurl="../../Images/ButtonCancel.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
