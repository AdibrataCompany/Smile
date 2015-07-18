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
<form runat="Server" id="frmViewCustomerCapacity">
<div align="center">
   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">VIEW CUSTOMER BANK STATEMENT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap" >Customer Name</td>
      <td class="tdganjil" ><asp:Hyperlink ID="hypCustomerName" runat="server"  Text="xxxxxxxx50xxxxxxxx" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank"></asp:Hyperlink></td>
    </tr>
    
  </table>
 
  <br>
	<table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
     <tr>
      <td class="tdjudulhijau" style="width: 28%">APPLICATION ID</td>
      <td class="tdjudulhijau">
     	<asp:HyperLink runat="server" id="lnkApplicationID" NavigateUrl="../../Credit/ViewApplication.htm" Target="_blank">xxxxxxxx20xxxxxxxx
		</asp:HyperLink>
      </td>
      <td class="tdjudulhijau" style="width: 28%">AGREEMENT NO</td>
      <td class="tdjudulhijau">
      	<asp:HyperLink runat="server" id="lnkAgreementno" NavigateUrl="../../AccMaintenance/AgreementView.htm" Target="_blank">xxxxxxxx20xxxxxxxx
		</asp:HyperLink>

	   </td>
	 </tr>
	 <tr>
      <td class="tdgenap" style="width: 28%">Step</td>
      <td class="tdganjil">
     	xxxx
      </td>
      <td class="tdgenap" style="width: 28%">Status</td>
      <td class="tdganjil">
      	xxx
	  </td>
	</tr>

    <tr>
      <td class="tdgenap" style="width: 28%">Bank Name</td>
      <td class="tdganjil">
      xxxxxxxx50xxxxxxxx
      </td>
      <td class="tdgenap" style="width: 28%">Bank Branch</td>
      <td class="tdganjil">
      xxxxxxxx50xxxxxxxx
	  </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Account Name</td>
      <td class="tdganjil">
		xxxxxxxx50xxxxxxxx
	  </td> 
	  <td class="tdgenap" style="width: 28%">Account No</td>
      <td class="tdganjil">
		xxxxxxxx50xxxxxxxx
  	  </td>  
	  </tr>   
	  </table>
 

 	 <asp:GridView runat="server" id="grdBankStatement" AllowSorting="True" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    	<Columns>
		<asp:templatefield HeaderText="MONTH">
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				999,999,999,999.99
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="DEBIT">
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				999,999,999,999.99
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="CREDIT">
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				999,999,999,999.99
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="SALDO">
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				999,999,999,999.99
			</ItemTemplate>
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>

  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
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
      <td class="tdganjil" colspan="3">
		<asp:label ID="lblBankStatementAvarageSaldo" runat="server" Text="999,999,999,999.99"></asp:label></td>
	  </tr> 
	  <tr>
	<td class="tdgenap" style="width: 28%">Average Usage on Plafond</td>
      <td class="tdganjil" colspan="3">
		<asp:label ID="lblBankStatementAvarageUsageOnPlafond" runat="server" Text="999,999,999,999.99"></asp:label></td>
	  </tr> 
</table>
<br>
 <br>
	<table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
     <tr>
      <td class="tdjudulhijau" style="width: 28%">APPLICATION ID</td>
      <td class="tdjudulhijau">
     	<asp:HyperLink runat="server" id="lnkApplicationID2" NavigateUrl="../../Credit/ViewApplication.htm" Target="_blank">xxxxxxxx20xxxxxxxx
		</asp:HyperLink>
      </td>
      <td class="tdjudulhijau" style="width: 28%">AGREEMENT NO</td>
      <td class="tdjudulhijau">
      	<asp:HyperLink runat="server" id="lnkAgreementno2" NavigateUrl="../../AccMaintenance/AgreementView.htm" Target="_blank">xxxxxxxx20xxxxxxxx
		</asp:HyperLink>

	   </td>
	 </tr>
	 <tr>
      <td class="tdgenap" style="width: 28%">Step</td>
      <td class="tdganjil">
     	xxxx
      </td>
      <td class="tdgenap" style="width: 28%">Status</td>
      <td class="tdganjil">
      	xxx
	  </td>
	</tr>

    <tr>
      <td class="tdgenap" style="width: 28%">Bank Name</td>
      <td class="tdganjil">
      xxxxxxxx50xxxxxxxx
      </td>
      <td class="tdgenap" style="width: 28%">Bank Branch</td>
      <td class="tdganjil">
      xxxxxxxx50xxxxxxxx
	  </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Account Name</td>
      <td class="tdganjil">
		xxxxxxxx50xxxxxxxx
	  </td> 
	  <td class="tdgenap" style="width: 28%">Account No</td>
      <td class="tdganjil">
		xxxxxxxx50xxxxxxxx
  	  </td>  
	  </tr>   
	  </table>
 

 	 <asp:GridView runat="server" id="grdBankStatement2" AllowSorting="True" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    	<Columns>
		<asp:templatefield HeaderText="MONTH">
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				999,999,999,999.99
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="DEBIT">
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				999,999,999,999.99
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="CREDIT">
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				999,999,999,999.99
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="SALDO">
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				999,999,999,999.99
			</ItemTemplate>
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>

  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
  <tr> 
      <td class="tdgenap" style="width: 20%">Total Debit</td>
      <td class="tdganjil">
		<asp:label ID="lblBankStatementTotalDebit2" runat="server" Text="999,999,999,999.99"></asp:label ></td>   
	<td class="tdgenap" style="width: 20%">Total Credit</td>
      <td class="tdganjil">
		<asp:label ID="lblBankStatementTotalCredit2" runat="server" Text="999,999,999,999.99"></asp:label></td>   
 	</tr>
 	<tr>
 	<td class="tdgenap" style="width: 28%">Total Saldo</td>
      <td colspan="3" class="tdganjil">
		<asp:label ID="lblBankStatementTotalSaldo2" runat="server" Text="999,999,999,999.99"></asp:label></td>
	</tr>
	<tr>
		<td class="tdgenap" style="width: 20%">Average Debit</td>
      <td class="tdganjil">
		<asp:label ID="lblBankStatementAvarageDebit2" runat="server" Text="999,999,999,999.99"></asp:label></td>
	<td class="tdgenap" style="width: 20%">Average Credit</td>
      <td class="tdganjil">
		<asp:label ID="lblBankStatementAvarageCredit2" runat="server" Text="999,999,999,999.99"></asp:label></td>
		</tr>
		<tr>
	<td class="tdgenap" style="width: 28%">Average Saldo</td>
      <td class="tdganjil" colspan="3">
		<asp:label ID="lblBankStatementAvarageSaldo2" runat="server" Text="999,999,999,999.99"></asp:label></td>
	  </tr> 
	  <tr>
	<td class="tdgenap" style="width: 28%">Average Usage on Plafond</td>
      <td class="tdganjil" colspan="3">
		<asp:label ID="lblBankStatementAvarageUsageOnPlafond2" runat="server" Text="999,999,999,999.99"></asp:label></td>
	  </tr> 
</table>
<br>

  <asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
		</asp:XmlDataSource>

 <br>
 <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">
     <a href="javascript:history.go(-1);"><img src="../Images/ButtonBack.gif" width="100" height="20" border="0"></a>
      </td>
      <td width="50%" align="right">
       <a href="javascript:window.close();"><img src="../Images/ButtonClose.gif" width="100" height="20" border="0"> 
    </td>
    </tr>
  </table>
   
</div>
</form>
</body>
</html>
