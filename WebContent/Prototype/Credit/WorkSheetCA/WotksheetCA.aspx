<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
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
<form runat="Server" id="frmPersonalCustomerSurveyReportMobilCF">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">WORKSHEET CREDIT ADMIN</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap" style="height: 18px">Customer Name</td>
      <td width="80%" class="tdganjil" style="height: 18px"><asp:Label ID="lblCustomerName" runat="server" Text="Customer0001"></asp:Label></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap" style="height: 18px">Agreement No</td>
      <td width="80%" class="tdganjil" style="height: 18px"><asp:Label ID="lblAgreementNo" runat="server" Text="AgreementNo00001"></asp:Label></td>
    </tr>
     <tr> 
      <td class="tdgenap">Product</td>
      <td class="tdganjil"><asp:label id="lblProduct" runat="server">Leasing</asp:label></td>
    </tr>
    </table>
    <table width="95%">
    
   	<tr> 
   		<td class="tdgenap" width="20%">Recomendation</td>
      <td class="tdganjil">
      <asp:dropdownlist ID="ddlRecomendation" runat="server" CssClass="inptype" width="212px">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="Recomended" Value="REC"></asp:ListItem>
      <asp:ListItem Text="Not Recomended" Value="NOTREC"></asp:ListItem>
      </asp:dropdownlist> 
		</td>
    </tr>
	</table>

<table width="95%" align="center">
	 <tr> 
	      <td colspan="4" class="tdjudulhijau">DEVIATION <font color="red">
			*)</font> 
	      </td>
	    </tr>
	</table>
		<table align="center" width="95%">
	 <tr> 
      <td width="20%" class="tdgenap">Group</td>
      <td class="tdganjil" ><asp:dropdownlist ID="ddlGroupDeviation" runat="server"  CssClass="inptype">
    		 <asp:ListItem Text="Asset DOcument" Value="ASDOK"></asp:ListItem>
		      </asp:dropdownlist ><font color="red">*)</font></td>
      </tr>
      	 <tr> 
      <td width="20%" class="tdgenap">NST Criteria</td>
      <td class="tdganjil" ><asp:dropdownlist ID="ddlNSTCriteria" runat="server"  CssClass="inptype">
    		 <asp:ListItem Text="Tidak Ada BPKB" Value="NO BPKB"></asp:ListItem>
	      </asp:dropdownlist ><font color="red">*)</font></td>
      </tr>
      <tr>
      <td width="20%" class="tdgenap">Standard Criteria</td>
      <td class="tdganjil" >
		<asp:dropdownlist ID="ddlNSTCriteria0" runat="server"  CssClass="inptype">
    		 <asp:ListItem Text="Wajib Cek BPKB" Value="CEKBPKB"></asp:ListItem>
      </asp:dropdownlist ><font color="red">*)</font></td>
      </tr>
		<tr>
      <td width="20%" class="tdgenap">Approval Type</td>
      <td class="tdganjil" >
		<asp:dropdownlist ID="ddlNSTCriteria1" runat="server"  CssClass="inptype">
    		 <asp:ListItem Text="Approval Risk" Value="RISK"></asp:ListItem>
     		 <asp:ListItem Text="Approval Price" Value="PRICE"></asp:ListItem>
      </asp:dropdownlist ><font color="red">*)</font></td>
      	</tr>
		<tr>
      <td width="20%" class="tdgenap">Final Level At</td>
      <td class="tdganjil" >
		<asp:dropdownlist ID="ddlNSTCriteria2" runat="server"  CssClass="inptype">
    		 <asp:ListItem Text="QAD Head" Value="QAD Head"></asp:ListItem>
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
	    <asp:templatefield HeaderText="GROUP">
			<ItemTemplate>
				<asp:Label runat="server" id="lnkApplicationID" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="NST CRITERIA">
			<ItemTemplate>
				<asp:Label runat="server" id="lnkCustomerName" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx50xxxxxxxx
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
	    <asp:templatefield HeaderText="STANDARD CRITERIA">
			<ItemTemplate>
				<asp:Label runat="server" id="lnkApplicationID" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
	    <asp:templatefield HeaderText="APPROVAL TYPE">
			<ItemTemplate>
				<asp:Label runat="server" id="lnkApplicationID">xxxxxxxx20xxxxxxxx
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
	    <asp:templatefield HeaderText="FINAL LEVEL AT">
			<ItemTemplate>
				<asp:Label runat="server" id="lnkApplicationID">xxxxxxxx20xxxxxxxx
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

	<table align="center" width="95%">
	<tr>
      <td class="tdgenap" width="20%">Strength</td>
      <td class="tdganjil">
      <asp:textbox id="txtCompanyPIC" runat="server" CssClass="inptype" width="420px" TextMode="MultiLine"></asp:textbox> 
		</td>    
      </tr>
      <tr>
      <td class="tdgenap" width="20%">Risk</td>
      <td class="tdganjil">
      <asp:textbox id="txtCompanyPIC0" runat="server" CssClass="inptype" width="420px" TextMode="MultiLine"></asp:textbox> 
		</td>    
      </tr>
      </table>
	  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
       <tr>
       <td colspan="4" class="tdjudulhijau">TERM AND CONDITION</td>
      <td class="tdganjil">
      &nbsp;</td>    
      </tr>
      </table>
	  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
      <tr>
      <td width="20%" class="tdgenap">Group</td>
      <td class="tdganjil" >
		<asp:dropdownlist ID="ddlGroupDeviation0" runat="server"  CssClass="inptype">
    		 <asp:ListItem Text="Asset DOcument" Value="ASDOK"></asp:ListItem>
     		
      </asp:dropdownlist ><font color="red">*)</font></td>
      </tr>
<tr>
      <td width="20%" class="tdgenap">NST Criteria</td>
      <td class="tdganjil" >
		<asp:dropdownlist ID="ddlNSTCriteria3" runat="server"  CssClass="inptype">
    		 <asp:ListItem Text="Tidak Ada BPKB" Value="NO BPKB"></asp:ListItem>
	      </asp:dropdownlist ><font color="red">*)</font></td>
      </tr>
	</table>
	 <table width="95%" border="0" cellspacing="0" cellpadding="0">
	    <tr> 
	      <td width="50%" height="30">&nbsp;</td>
	      <td width="50%" align="right"><asp:ImageButton id="imbAddTermAndCondition" imageurl="../../Images/ButtonAdd.gif" runat="server"></asp:ImageButton>
	      </td>
	    </tr>
	  </table>


	<tabLe align="center" width="95%"> 
	<tr>
	<td>
	
		 <asp:GridView runat="server" id="grdCreditCheckingResult0" AllowSorting="true" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="100%" >
	    <Columns>
	    <asp:templatefield HeaderText="GROUP">
			<ItemTemplate>
				<asp:Label runat="server" id="lnkApplicationID0" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="NST CRITERIA">
			<ItemTemplate>
				<asp:Label runat="server" id="lnkCustomerName0" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx50xxxxxxxx
				</asp:Label >
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="DELETE">
			<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="lnkDelCapitalDetail0" ImageUrl="../../Images/IconDelete.gif">
				</asp:ImageButton >

			</AlternatingItemTemplate>
			<ItemTemplate>
					<asp:ImageButton runat="server" id="lnkDelCapitalDetail1" ImageUrl="../../Images/IconDelete.gif" ></asp:ImageButton >

			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
	
	</td>
	</tr>
	</tabLe>
    <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="20%" align="right"></td>
      <td width="80%" align="right"><asp:ImageButton id="imbSavePriorTOPo" imageurl="../../Images/ButtonSave.gif"  PostBackUrl="PriorToPO_AgreementList.aspx" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbCancelPriorTOPo" PostBackUrl="PriorToPO_AgreementList.aspx" imageurl="../../Images/ButtonCancel.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <br>
<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>  
</form>
</body>
</html>
