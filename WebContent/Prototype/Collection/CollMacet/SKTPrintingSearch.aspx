<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>COLLECTION</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
<link rel="stylesheet" type="text/css" href="../../Confins.css">
<style type="text/css">
.style1 {
	text-align: left;
}
.style2 {
	text-align: right;
}
.style5 {
	text-align: left;
	color: #FF0000;
}
</style>
</head>
<body>
<form id="FrmSKTPrintingSearch" runat="server">
<div align="center">
  <table style="width: 100%">
	<tr>
		<td class="style5">&nbsp;&nbsp;&nbsp; <font color="red"><i>*)&nbsp;&nbsp; required field</i></font></td>
	</tr>
	</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">REPOSSESS AUTHORIZATION LETTER PRINT</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" width="18%">Branch</td>
      <td class="tdganjil" style="width: 65%"> <select name="select3">
          <option selected>MEDAN</option>
          <option>JAMBI</option>
          <option>PEKANBARU</option>
          <option>BATAM</option>
          <option>GRAND WIJAYA</option>
          <option>BEKASI</option>
          <option>TANGERANG</option>
          <option>BANDUNG</option>
          <option>SEMARANG</option>
        </select> &nbsp; <font color="#FF0000">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap" width="18%">Search By</td>
      <td class="tdganjil" style="width: 65%"> <select name="select">
          <option selected>Select One</option>
          <option>Agreement No</option>
          <option>Customer Name</option>
        </select> <input name="textfield" type="text" class="inptype"> </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr align="right"> 
      <td><img src="../../images/ButtonSearch.gif" width="100" height="20"> 
		<img src="../../images/ButtonReset.gif" width="100" height="20"></td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">REPOSSESS AUTHORIZATION LETTER PRINT 
        LISTING </td>
      <td align="center" class="tdtopiungukanan" width="10px">&nbsp;</td>
    </tr>
  </table>
  
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr align="center" class="tdjudulungu"> 
      <td><a href="SKTPrintingSearch.htm">AGREEMENT NO.</a></td>
      <td><a href="SKTPrintingSearch.htm">CUSTOMER NAME</a></td>
      <td><a href="SKTPrintingSearch.htm">INSTALLMENT NO.</a></td>
      <td><a href="SKTPrintingSearch.htm">DAYS OVERDUE</a></td>
      <td><a href="SKTPrintingSearch.htm">RAL NO</a></td>
      <td><a href="SKTPrintingSearch.htm">EXECUTOR ID</a></td>
      <td width="5%">SELECT EXECUTOR</td>
      <td width="5%">PRINT RAL</td>
      <td width="5%">PRINT BAST</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="style1"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td class="style2">99</td>
      <td class="style2">999</td>
      <td class="style1">xxxxx20xxxxx</td>
      <td class="style1">xxxxx10xxxxx</td>
      <td align="center"><a href="SKTPrintingExecutor.htm">
		<img src="../../images/IconDocument.gif" width="16" height="11" border="0"></a></td>
      <td align="center">
		<asp:ImageButton runat="server" id="BtnPrintRAL" ImageUrl="../../images/IconPrinter.gif" PostBackUrl="RALInputParameter.aspx" ToolTip="Print RAL Untuk External" /></td>
      <td align="center" bordercolor="0">
		<asp:HyperLink runat="server" id="BtnBast" NavigateUrl="BAPK.htm" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdgenap"> 
      <td class="style1"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td class="style2">99</td>
      <td class="style2">999</td>
      <td class="style1">xxxxx20xxxxx</td>
      <td class="style1">xxxxx10xxxxx</td>
      <td align="center"><a href="SKTPrintingExecutor.htm">
		<img src="../../images/IconDocument.gif" width="16" height="11" border="0"></a></td>
      <td align="center">
		<asp:ImageButton runat="server" id="BtnPrintRAL0" ImageUrl="../../images/IconPrinter.gif" PostBackUrl="RALInputParameterTugas.aspx" ToolTip="Print RAL Untuk Internal" /></td>
      <td align="center" bordercolor="0">
		<asp:HyperLink runat="server" id="BtnBast0" NavigateUrl="BAPK.htm" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="style1"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td class="style2">99</td>
      <td class="style2">999</td>
      <td class="style1">xxxxx20xxxxx</td>
      <td class="style1">xxxxx10xxxxx</td>
      <td align="center"><a href="SKTPrintingExecutor.htm">
		<img src="../../images/IconDocument.gif" width="16" height="11" border="0"></a></td>
      <td align="center">
		<asp:ImageButton runat="server" id="BtnPrintRAL1" ImageUrl="../../images/IconPrinter.gif" PostBackUrl="RALInputParameter.aspx" ToolTip="Print RAL Untuk External" /></td>
      <td align="center" bordercolor="0">
		<asp:HyperLink runat="server" id="BtnBast1" NavigateUrl="BAPK.htm" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdgenap"> 
      <td class="style1"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td class="style2">99</td>
      <td class="style2">999</td>
      <td class="style1">xxxxx20xxxxx</td>
      <td class="style1">xxxxx10xxxxx</td>
      <td align="center"><a href="SKTPrintingExecutor.htm">
		<img src="../../images/IconDocument.gif" width="16" height="11" border="0"></a></td>
      <td align="center">
		<asp:ImageButton runat="server" id="BtnPrintRAL9" ImageUrl="../../images/IconPrinter.gif" PostBackUrl="RALInputParameterTugas.aspx" ToolTip="Print RAL Untuk Internal" /></td>
      <td align="center" bordercolor="0">
		<asp:HyperLink runat="server" id="BtnBast2" NavigateUrl="BAPK.htm" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="style1"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td class="style2">99</td>
      <td class="style2">999</td>
      <td class="style1">xxxxx20xxxxx</td>
      <td class="style1">xxxxx10xxxxx</td>
      <td align="center"><a href="SKTPrintingExecutor.htm">
		<img src="../../images/IconDocument.gif" width="16" height="11" border="0"></a></td>
      <td align="center">
		<asp:ImageButton runat="server" id="BtnPrintRAL3" ImageUrl="../../images/IconPrinter.gif" PostBackUrl="RALInputParameter.aspx" ToolTip="Print RAL Untuk External" /></td>
      <td align="center" bordercolor="0">
		<asp:HyperLink runat="server" id="BtnBast3" NavigateUrl="BAPK.htm" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdgenap"> 
      <td class="style1"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td class="style2">99</td>
      <td class="style2">999</td>
      <td class="style1">xxxxx20xxxxx</td>
      <td class="style1">xxxxx10xxxxx</td>
      <td align="center"><a href="SKTPrintingExecutor.htm">
		<img src="../../images/IconDocument.gif" width="16" height="11" border="0"></a></td>
      <td align="center">
		<asp:ImageButton runat="server" id="BtnPrintRAL10" ImageUrl="../../images/IconPrinter.gif" PostBackUrl="RALInputParameterTugas.aspx" ToolTip="Print RAL Untuk Internal" /></td>
      <td align="center" bordercolor="0">
		<asp:HyperLink runat="server" id="BtnBast4" NavigateUrl="BAPK.htm" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="style1"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td class="style2">99</td>
      <td class="style2">999</td>
      <td class="style1">xxxxx20xxxxx</td>
      <td class="style1">xxxxx10xxxxx</td>
      <td align="center"><a href="SKTPrintingExecutor.htm">
		<img src="../../images/IconDocument.gif" width="16" height="11" border="0"></a></td>
      <td align="center">
		<asp:ImageButton runat="server" id="BtnPrintRAL5" ImageUrl="../../images/IconPrinter.gif" PostBackUrl="RALInputParameter.aspx" ToolTip="Print RAL Untuk External" /></td>
      <td align="center" bordercolor="0">
		<asp:HyperLink runat="server" id="BtnBast5" NavigateUrl="BAPK.htm" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdgenap"> 
      <td class="style1"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td class="style2">99</td>
      <td class="style2">999</td>
      <td class="style1">xxxxx20xxxxx</td>
      <td class="style1">xxxxx10xxxxx</td>
      <td align="center"><a href="SKTPrintingExecutor.htm">
		<img src="../../images/IconDocument.gif" width="16" height="11" border="0"></a></td>
      <td align="center">
		<asp:ImageButton runat="server" id="BtnPrintRAL11" ImageUrl="../../images/IconPrinter.gif" PostBackUrl="RALInputParameterTugas.aspx" Width="17px" ToolTip="Print RAL Untuk Internal" /></td>
      <td align="center" bordercolor="0">
		<asp:HyperLink runat="server" id="BtnBast6" NavigateUrl="BAPK.htm" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="style1"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td class="style2">99</td>
      <td class="style2">999</td>
      <td class="style1">xxxxx20xxxxx</td>
      <td class="style1">xxxxx10xxxxx</td>
      <td align="center"><a href="SKTPrintingExecutor.htm">
		<img src="../../images/IconDocument.gif" width="16" height="11" border="0"></a></td>
      <td align="center">
		<asp:ImageButton runat="server" id="BtnPrintRAL7" ImageUrl="../../images/IconPrinter.gif" PostBackUrl="RALInputParameter.aspx" ToolTip="Print RAL Untuk External" /></td>
      <td align="center" bordercolor="0">
		<asp:HyperLink runat="server" id="BtnBast7" NavigateUrl="BAPK.htm" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdgenap"> 
      <td class="style1"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td class="style2">99</td>
      <td class="style2">999</td>
      <td class="style1">xxxxx20xxxxx</td>
      <td class="style1">xxxxx10xxxxx</td>
      <td align="center"><a href="SKTPrintingExecutor.htm">
		<img src="../../images/IconDocument.gif" width="16" height="11" border="0"></a></td>
      <td align="center">
		<asp:ImageButton runat="server" id="BtnPrintRAL12" ImageUrl="../../images/IconPrinter.gif" PostBackUrl="RALInputParameterTugas.aspx" ToolTip="Print RAL Untuk Internal" /></td>
      <td align="center" bordercolor="0">
		<asp:HyperLink runat="server" id="BtnBast8" NavigateUrl="BAPK.htm" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
  </table>
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
