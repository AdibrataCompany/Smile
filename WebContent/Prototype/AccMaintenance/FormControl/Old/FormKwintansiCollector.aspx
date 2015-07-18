<html>
<head>
<title>Form Receipt Collector</title>
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
.style3 {
	background-color: #FFFFFF;
	text-align: center;
}
.style4 {
	color: #0066CC;
	text-align: center;
}
</style>
</head>
<body>
<form id="FrmReceiptCollector" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
 	<tr class="trtopikuning"> 

      <td align="center" class="tdtopihijau" colspan="2">RECEIPT FORM </td>
      <tr> 
      <td class="tdgenap" style="width: 19%">Branch</td>
      <td width="86%" class="tdganjil">
       <asp:DropDownList runat="server" id="DDLBranch">
		<asp:ListItem Value="800">Grand Wijaya</asp:ListItem>
		<asp:ListItem Value="801">Tangerang</asp:ListItem>
		<asp:ListItem Value="999">Head Office</asp:ListItem>
		</asp:DropDownList>
      </td>
    </tr>
      <tr> 
      <td class="tdgenap" style="width: 19%">Search By </td>
      <td width="86%" class="tdganjil">
       <asp:DropDownList runat="server" id="DDLAddress0">
		<asp:ListItem Value="FormNo">Receipt No</asp:ListItem>
		<asp:ListItem Value="AssignedTo">Assigned To</asp:ListItem>
		</asp:DropDownList>
      &nbsp;
       <asp:TextBox runat="server" id="TxtFullName0" CssClass="InpType"></asp:TextBox>
      </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 19%">Status</td>
      <td width="86%" class="tdganjil"><asp:DropDownList runat="server" id="DDLStatus">
        <asp:ListItem Value="All">All</asp:ListItem>
		<asp:ListItem Value="ASG">Assign</asp:ListItem>
		<asp:ListItem Value="RTN">Return</asp:ListItem>
		<asp:ListItem Value="BRK">Broke</asp:ListItem> 
		<asp:ListItem Value="LST">Lost</asp:ListItem>
		<asp:ListItem Value="USD">Used</asp:ListItem>
		</asp:DropDownList>
	  </td>
    </tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../Images/ButtonSearch.gif"></asp:ImageButton>
		&nbsp;
		<asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../Images/ButtonReset.gif"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">RECEIPT FORM LISTING</td>
      <td class="tdtopihijaukanan" style="width: 10px">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr align="center" class="tdjudulungu"> 
      <td class="style1"><a href="AddressMaintenance.htm">BATCH NO</a></td>
      <td><a href="AddressMaintenance.htm">RECEIPT NO</a></td>
      <td><a href="AddressMaintenance.htm">A<span class="style1">SSIGNED TO</span></a></td>
      <td class="style4"><a href="AddressMaintenance.htm">ASSIGNED DATE</a></td>
      <td class="style1"><a href="AddressMaintenance.htm">STATUS</a></td>
      <td class="style1"><a href="AddressMaintenance.htm">RE-</a>ASSIGN</td>
      <td><a href="AddressMaintenance.htm">E<span class="style1">DIT</span></a></td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollector.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollectorHistory.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollectorOutStanding.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx50xxxx</td>
      <td class="style3">99/99/9999</td>
      <td>Assign</td>
      <td align="center">&nbsp;</td>
      <td align="center" class="style1">
		<a href="FormKwintansiCollectorEdit.aspx">Edit</a></td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollector.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollectorHistory.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollectorOutStanding.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx50xxxx</td>
      <td class="style2">99/99/9999</td>
      <td>Return</td>
      <td align="center"><a href="FormKwintansiCollectorReAssign.aspx">Re-Assign</a></td>
      <td align="center"><a href="FormKwintansiCollectorEdit.aspx">Edit</a></td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollector.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollectorHistory.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollectorOutStanding.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx50xxxx</td>
      <td class="style2">99/99/9999</td>
      <td>Broke</td>
      <td align="center">&nbsp;</td>
      <td align="center"><a href="FormKwintansiCollectorEdit.aspx">Edit</a></td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollector.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollectorHistory.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollectorOutStanding.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx50xxxx</td>
      <td class="style2">99/99/9999</td>
      <td>Lost</td>
      <td align="center">&nbsp;</td>
      <td align="center"><a href="FormKwintansiCollectorEdit.aspx">Edit</a></td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollector.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollectorHistory.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollectorOutStanding.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx50xxxx</td>
      <td class="style2">99/99/9999</td>
      <td>Assign</td>
      <td align="center">&nbsp;</td>
      <td align="center"><a href="FormKwintansiCollectorEdit.aspx">Edit</a></td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollector.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollectorHistory.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollectorOutStanding.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx50xxxx</td>
      <td class="style2">99/99/9999</td>
      <td>Return</td>
      <td align="center"><a href="FormKwintansiCollectorReAssign.aspx">Re-Assign</a></td>
      <td align="center"><a href="FormKwintansiCollectorEdit.aspx">Edit</a></td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollector.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollectorHistory.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollectorOutStanding.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx50xxxx</td>
      <td class="style2">99/99/9999</td>
      <td>Broke</td>
      <td align="center">&nbsp;</td>
      <td align="center"><a href="FormKwintansiCollectorEdit.aspx">Edit</a></td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollector.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollectorHistory.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollectorOutStanding.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx50xxxx</td>
      <td class="style2">99/99/9999</td>
      <td>Lost</td>
      <td align="center">&nbsp;</td>
      <td align="center"><a href="FormKwintansiCollectorEdit.aspx">Edit</a></td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollector.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollectorHistory.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollectorOutStanding.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx50xxxx</td>
      <td class="style2">99/99/9999</td>
      <td>Assign</td>
      <td align="center">&nbsp;</td>
      <td align="center"><a href="FormKwintansiCollectorEdit.aspx">Edit</a></td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollector.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollectorHistory.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('ViewFormKwintansiCollectorOutStanding.aspx','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx50xxxx</td>
      <td class="style2">99/99/9999</td>
      <td>Return</td>
      <td align="center"><a href="FormKwintansiCollectorReAssign.aspx">Re-Assign</a></td>
      <td align="center"><a href="FormKwintansiCollectorEdit.aspx">Edit</a></td>
    </tr>
  </table>

	<asp:XmlDataSource runat="server" id="XmlDataSource1" DataFile="~/XML/Menu_Eloan_All_999.xml">
	</asp:XmlDataSource>
   <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>     
      <td width="30" align="center"><asp:ImageButton runat="server" id="ImgFirst" ImageUrl="../../images/butkiri1.gif"></asp:ImageButton></td>
      <td width="30" align="center"><asp:ImageButton runat="server" id="ImgPrev" ImageUrl="../../images/butkiri.gif"></asp:ImageButton></td>
      <td width="30" align="center"><asp:ImageButton runat="server" id="ImgNext" ImageUrl="../../images/butkanan.gif"></asp:ImageButton></td>
      <td width="30" align="center"><asp:ImageButton runat="server" id="ImgLast" ImageUrl="../../images/butkanan1.gif"></asp:ImageButton></td>
      <td width="130" align="center">Page 
        <asp:TextBox runat="server" id="txtPage" CssClass="InpType" Columns="3">
		1</asp:TextBox>&nbsp; 
        <asp:ImageButton runat="server" id="ImgGo" ImageUrl="../../images/butgo.gif"></asp:ImageButton></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>  
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnAdd" ImageUrl="../../Images/ButtonAdd.gif" PostBackUrl="FormKwintansiCollectorAdd.aspx"></asp:ImageButton>
		&nbsp;
		</td>
    </tr>
  </table>
  </div>
</form>
</body>
</html>
