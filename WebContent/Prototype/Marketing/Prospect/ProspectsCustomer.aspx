<html>
<head>
<title>Pre-Screening Personal Customer</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
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
.style2 {
	text-align: center;
}
</style>
</head>
<body>
<form id="form1" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
 	<tr class="trtopikuning"> 

      <td align="center" class="tdtopihijau" colspan="2">NEW APPLICATION</td>
      <tr> 
      <td class="tdgenap" style="width: 15%">Application Date</td>
      <td width="86%" class="tdganjil">
       <asp:TextBox runat="server" id="TxtBirthDate1" CssClass="InpType" Columns="15" ></asp:TextBox>&nbsp;<img src="../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"> 
		To
       <asp:TextBox runat="server" id="TxtBirthDate2" CssClass="InpType" Columns="15" ></asp:TextBox>&nbsp;<img src="../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 15%">Search By</td>
      <td width="85%" class="tdganjil"><select name="select4">
          <option selected>Name</option>
          <option>Address</option>
        </select> <input name="textfield3" type="text" class="inptype" size="15"></td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="ImgSearch" ImageUrl="../../Images/ButtonSearch.gif"></asp:ImageButton>&nbsp;
		<asp:ImageButton runat="server" id="ImgReset" ImageUrl="../../Images/ButtonReset.gif"></asp:ImageButton>
      </td>
    </tr>
  </table>
 <asp:panel id="pnlList" style="Z-INDEX: 101; LEFT: 8px; TOP: 344px" Runat="server" Width="99.69%">
	<BR>
	<table width="95%" border="0" cellspacing="0" cellpadding="0">
		<tr class="trtopikuning">
			<td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
			<td align="center" class="tdtopihijau">NEW APPLICATION LISTING</td>
			<td class="tdtopihijaukanan" style="width: 10px">&nbsp;</td>
		</tr>
	</table>
	<table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
		<tr align="center" class="tdjudulhijau">
			<td style="width: 24%"><a href="Customer.htm">PROSPECT APPLICATION ID</a></td>
			<td style="width: 23%"><a href="Customer.htm">NAME</a></td>
			<td style="width: 8%"><a href="Customer.htm">TYPE</a></td>
			<td width="10%" class="style1"><a href="Customer.htm">DATE</a></td>
			<td width="40%"><a href="Customer.htm">ADDRESS</a></td>
			<td width="10%">ACTION</td>
		</tr>
		<tr class="tdganjil">
			<td style="width: 24%" class="style2">xxxx50xxxx</td>
			<td style="width: 23%">xxxxxxxxxxxx50xxxxxxxxxx</td>
			<td align="center" style="width: 8%">P</td>
			<td align="center">99/99/9999</td>
			<td>xxxxxxxxxxxxxxxxx50xxxxxxxxxxxxxxxxx</td>
			<td align="center"><a href="PersonalCustomerDataEdit.aspx">
			<img src="../../Images/IconEdit.gif" width="16" height="13" border="0"></img></a></td>
		</tr>
		<tr class="tdgenap">
			<td style="width: 24%" class="style2">xxxx50xxxx</td>
			<td style="width: 23%">xxxxxxxxxxxx50xxxxxxxxxx</td>
			<td align="center" style="width: 8%">C</td>
			<td align="center">99/99/9999</td>
			<td>xxxxxxxxxxxxxxxxx50xxxxxxxxxxxxxxxxx</td>
			<td align="center"><a href="CompanyDataCustomerEdit.aspx">
			<img src="../../Images/IconEdit.gif" width="16" height="13" border="0"></img></a></td>
		</tr>
		<tr class="tdganjil">
			<td style="width: 24%" class="style2">xxxx50xxxx</td>
			<td style="width: 23%">xxxxxxxxxxxx50xxxxxxxxxx</td>
			<td align="center" style="width: 8%">P</td>
			<td align="center">99/99/9999</td>
			<td>xxxxxxxxxxxxxxxxx50xxxxxxxxxxxxxxxxx</td>
			<td align="center"><a href="PersonalCustomerDataEdit.aspx">
			<img src="../../Images/IconEdit.gif" width="16" height="13" border="0"></img></a></td>
		</tr>
		<tr class="tdgenap">
			<td style="width: 24%" class="style2">xxxx50xxxx</td>
			<td style="width: 23%">xxxxxxxxxxxx50xxxxxxxxxx</td>
			<td align="center" style="width: 8%">C</td>
			<td align="center">99/99/9999</td>
			<td>xxxxxxxxxxxxxxxxx50xxxxxxxxxxxxxxxxx</td>
			<td align="center"><a href="CompanyDataCustomerEdit.aspx">
			<img src="../../Images/IconEdit.gif" width="16" height="13" border="0"></img></a></td>
		</tr>
		<tr class="tdganjil">
			<td style="width: 24%" class="style2">xxxx50xxxx</td>
			<td style="width: 23%">xxxxxxxxxxxx50xxxxxxxxxx</td>
			<td align="center" style="width: 8%">P</td>
			<td align="center">99/99/9999</td>
			<td>xxxxxxxxxxxxxxxxx50xxxxxxxxxxxxxxxxx</td>
			<td align="center"><a href="PersonalCustomerDataEdit.aspx">
			<img src="../../Images/IconEdit.gif" width="16" height="13" border="0"></img></a></td>
		</tr>
		<tr class="tdgenap">
			<td style="width: 24%" class="style2">xxxx50xxxx</td>
			<td style="width: 23%">xxxxxxxxxxxx50xxxxxxxxxx</td>
			<td align="center" style="width: 8%">C</td>
			<td align="center">99/99/9999</td>
			<td>xxxxxxxxxxxxxxxxx50xxxxxxxxxxxxxxxxx</td>
			<td align="center"><a href="CompanyDataCustomerEdit.aspx">
			<img src="../../Images/IconEdit.gif" width="16" height="13" border="0"></img></a></td>
		</tr>
		<tr class="tdganjil">
			<td style="width: 24%" class="style2">xxxx50xxxx</td>
			<td style="width: 23%">xxxxxxxxxxxx50xxxxxxxxxx</td>
			<td align="center" style="width: 8%">P</td>
			<td align="center">99/99/9999</td>
			<td>xxxxxxxxxxxxxxxxx50xxxxxxxxxxxxxxxxx</td>
			<td align="center"><a href="PersonalCustomerDataEdit.aspx">
			<img src="../../Images/IconEdit.gif" width="16" height="13" border="0"></img></a></td>
		</tr>
		<tr class="tdgenap">
			<td style="width: 24%" class="style2">xxxx50xxxx</td>
			<td style="width: 23%">xxxxxxxxxxxx50xxxxxxxxxx</td>
			<td align="center" style="width: 8%">P</td>
			<td align="center">99/99/9999</td>
			<td>xxxxxxxxxxxxxxxxx50xxxxxxxxxxxxxxxxx</td>
			<td align="center"><a href="PersonalCustomerDataEdit.aspx">
			<img src="../../Images/IconEdit.gif" width="16" height="13" border="0"></img></a></td>
		</tr>
	</table>
	<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
	<TR>
	<TD align="center" width="30">
	<asp:ImageButton id="imbFirstPage" runat="server" ImageUrl="../../Images/butkiri1.gif" CausesValidation="False" CommandName="First" />
	<FONT face="Verdana"></FONT>
	</TD>
	<TD align="center" width="30">
	<asp:ImageButton id="imbPrevPage" runat="server" ImageUrl="../../Images/butkiri.gif" CausesValidation="False" CommandName="Prev" />
	<FONT face="Verdana"></FONT>
	</TD>
	<TD align="center" width="30">
	<asp:ImageButton id="imbNextPage" runat="server" ImageUrl="../../Images/butkanan.gif" CausesValidation="False" CommandName="Next" />
	<FONT face="Verdana"></FONT>
	</TD>
	<TD align="center" width="30">
	<asp:ImageButton id="imbLastPage" runat="server" ImageUrl="../../Images/butkanan1.gif" CausesValidation="False" CommandName="Last" />
	<FONT face="Verdana"></FONT>
	</TD>
	<TD style="WIDTH: 247px" align="center" width="247">
	<FONT face="Verdana" size="2">Page&nbsp;</FONT>
	<asp:TextBox runat="server" id="txtPage" CssClass="InpType" Columns="3">1</asp:TextBox>
	<asp:ImageButton id="imbGoPage" runat="server" ImageUrl="../../Images/butgo.gif" EnableViewState="False" ImageAlign="AbsBottom" />
	<FONT face="Verdana" size="2">&nbsp;&nbsp; </FONT>
	</TD>
	<TD align="right">
	<FONT color="#999999">
	<FONT face="Verdana" size="2">Page&nbsp;</FONT>
	<asp:Label id="lblPage" runat="server" Font-Names="Verdana" Font-Size="Smaller">
	</asp:Label>
	<FONT face="Verdana" size="2">&nbsp;of</FONT>
	<asp:Label id="lblTotPage" runat="server" Font-Names="Verdana" Font-Size="Smaller">
	</asp:Label>
	<FONT face="Verdana" size="2">, 
									Total&nbsp; </FONT>
	<asp:Label id="lblRecord" runat="server" Font-Size="Smaller"></asp:Label>
	&nbsp;
	<FONT face="Verdana" size="2">record(s)</FONT>
	</FONT>
	</TD>
	</TR>
	</TABLE>
	<table width="95%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td align="left">&nbsp;</td>
			<td align="right"><a href="PersonalCustomerDataAdd.aspx">
			<img src="../../Images/ButtonAddPersonal.gif" width="100" height="20" border="0"></img></a>&nbsp;
			<a href="CompanyDataCustomerAdd.aspx">
			<img src="../../Images/ButtonAddCompany.gif" width="100" height="20" border="0">&nbsp;
			</img></a></td>
		</tr>
	</table>
	</BR>
	</asp:panel>
</div>
</form>