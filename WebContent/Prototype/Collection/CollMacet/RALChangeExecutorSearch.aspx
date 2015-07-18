<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html xmlns:v="urn:schemas-microsoft-com:vml" xmlns:o="urn:schemas-microsoft-com:office:office">
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
	text-align: center;
}
.style5 {
	text-align: left;
	color: #FF0000;
}
</style>
</head>
<body>
<form id="FrmRalChangeExecutorSearch" runat="server">
<div align="center">
  <table style="width: 100%">
	<tr>
		<td class="style5">&nbsp;&nbsp;&nbsp; <font color="red"><i>*)&nbsp;&nbsp; required field</i></font></td>
	</tr>
	</table>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">REPOSSESS AUTHORIZATION CHANGE 
		EXECUTOR</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" style="width: 17%">Branch</td>
      <td class="tdganjil" width="25%" style="width: 50%" > <select name="select4">
          <option selected>MEDAN</option>
          <option>JAMBI</option>
          <option>PEKANBARU</option>
          <option>BATAM</option>
          <option>GRAND WIJAYA</option>
          <option>BEKASI</option>
          <option>TANGERANG</option>
          <option>BANDUNG</option>
          <option>SEMARANG</option>
        </select> <font color="red"><i>*)</i></font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 17%"> <div align="left">Search By</div></td>
      <td class="tdganjil" ><a href="javascript:;" onClick="MM_openBrWindow('../AccMaintenance/AgreementView.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')"> 
        </a><select name="select">
          <option selected>Select One</option>
          <option>Agreement No</option>
          <option>Customer Name</option>
          <option>RAL No</option>
        </select> <input name="textfield" type="text" class="inptype"> &nbsp; </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr align="right"> 
      <td><a href="RALChangeExecutorSearch.htm">
		<img src="../../images/ButtonSearch.gif" width="100" height="20" border="0"></a> 
        <img src="../../images/ButtonReset.gif" width="100" height="20"></td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">REPOSSESS AUTHORIZATION CHANGE 
		EXECUTOR&nbsp; 
        LISTING </td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr align="center" class="tdjudulungu"> 
      <td width="9%"><a href="SKTReleaseSearch.htm">AGREEMENT NO.</a></td>
      <td width="17%"><a href="SKTReleaseSearch.htm">CUSTOMER NAME</a></td>
      <td style="width: 12%"><a href="SKTReleaseSearch.htm">INSTALLMENT NO.</a></td>
      <td width="9%"><a href="SKTReleaseSearch.htm">OVERDUE DAYS</a></td>
      <td width="12%"><a href="SKTReleaseSearch.htm">RAL NO</a></td>
      <td width="16%"><a href="SKTReleaseSearch.htm">RAL PERIOD</a></td>
      <td width="11%"><a href="SKTReleaseSearch.htm">EXECUTOR ID </a></td>
      <td width="11%">CHANGE</td>
      <td width="11%">PRINT RAL</td>
      <td width="5%">PRINT BAST</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td align="center" style="width: 12%">99</td>
      <td align="center">999</td>
      <td align="center">
		<img src="../../images/BulatMerah.gif" width="10" height="10">xx20xx</td>
      <td align="center">dd/mm/yyyy to dd/mm/yyyy</td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('ViewCollector.htm','Collector','scrollbars=yes,width=500,height=500')">xxxx10xxxx</a></td>
      <td class="style1"><a href="RALChangeExecutor2.htm">
		<img src="../../images/IconDocument.gif" width="16" height="11" border="0"></a></td>
      <td class="style1">
		<asp:ImageButton runat="server" id="BtnPrintRAL" ImageUrl="../../images/IconPrinter.gif" PostBackUrl="RALChangeExecutorInputParameter.aspx" Width="17px" ToolTip="Print RAL Untuk External" /></td>
      <td align="center">
		<asp:HyperLink runat="server" id="BtnBast" NavigateUrl="BAPK.htm" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td align="center" style="width: 12%">99</td>
      <td align="center">999</td>
      <td align="center">xx20xx</td>
      <td align="center">dd/mm/yyyy to dd/mm/yyyy</td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('ViewCollector.htm','Collector','scrollbars=yes,width=500,height=500')">xxxx10xxxx</a></td>
      <td class="style1"><a href="RALChangeExecutor2.htm">
		<img src="../../images/IconDocument.gif" width="16" height="11" border="0"></a></td>
      <td class="style1">
		<asp:ImageButton runat="server" id="BtnPrintRAL0" ImageUrl="../../images/IconPrinter.gif" PostBackUrl="RALChangeExecutorInputParameterTugas.aspx" ToolTip="Print RAL Untuk Internal" /></td>
      <td align="center">
		<asp:HyperLink runat="server" id="BtnBast0" NavigateUrl="BAPK.htm" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td align="center" style="width: 12%">99</td>
      <td align="center">999</td>
      <td align="center">xx20xx</td>
      <td align="center">dd/mm/yyyy to dd/mm/yyyy</td>
      <td height="24"><a href="javascript:;" onClick="MM_openBrWindow('ViewCollector.htm','Collector','scrollbars=yes,width=500,height=500')">xxxx10xxxx</a></td>
      <td height="24" class="style1"><a href="RALChangeExecutor2.htm">
		<img src="../../images/IconDocument.gif" width="16" height="11" border="0"></a></td>
      <td height="24" class="style1">
		<asp:ImageButton runat="server" id="BtnPrintRAL1" ImageUrl="../../images/IconPrinter.gif" PostBackUrl="RALChangeExecutorInputParameter.aspx" ToolTip="Print RAL Untuk External" /></td>
      <td align="center">
		<asp:HyperLink runat="server" id="BtnBast1" NavigateUrl="BAPK.htm" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td align="center" style="width: 12%">99</td>
      <td align="center">999</td>
      <td align="center">xx20xx</td>
      <td align="center">dd/mm/yyyy to dd/mm/yyyy</td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('ViewCollector.htm','Collector','scrollbars=yes,width=500,height=500')">xxxx10xxxx</a></td>
      <td class="style1"><a href="RALChangeExecutor2.htm">
		<img src="../../images/IconDocument.gif" width="16" height="11" border="0"></a></td>
      <td class="style1">
		<asp:ImageButton runat="server" id="BtnPrintRAL5" ImageUrl="../../images/IconPrinter.gif" PostBackUrl="RALChangeExecutorInputParameterTugas.aspx" ToolTip="Print RAL Untuk Internal" /></td>
      <td align="center">
		<asp:HyperLink runat="server" id="BtnBast2" NavigateUrl="BAPK.htm" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td align="center" style="width: 12%">99</td>
      <td align="center">999</td>
      <td align="center">xx20xx</td>
      <td align="center">dd/mm/yyyy to dd/mm/yyyy</td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('ViewCollector.htm','Collector','scrollbars=yes,width=500,height=500')">xxxx10xxxx</a></td>
      <td class="style1"><a href="RALChangeExecutor2.htm">
		<img src="../../images/IconDocument.gif" width="16" height="11" border="0"></a></td>
      <td class="style1">
		<asp:ImageButton runat="server" id="BtnPrintRAL2" ImageUrl="../../images/IconPrinter.gif" PostBackUrl="RALChangeExecutorInputParameter.aspx" ToolTip="Print RAL Untuk External" /></td>
      <td align="center">
		<asp:HyperLink runat="server" id="BtnBast3" NavigateUrl="BAPK.htm" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td align="center" style="width: 12%">99</td>
      <td align="center">999</td>
      <td align="center">xx20xx</td>
      <td align="center">dd/mm/yyyy to dd/mm/yyyy</td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('ViewCollector.htm','Collector','scrollbars=yes,width=500,height=500')">xxxx10xxxx</a></td>
      <td class="style1"><a href="RALChangeExecutor2.htm">
		<img src="../../images/IconDocument.gif" width="16" height="11" border="0"></a></td>
      <td class="style1">
		<asp:ImageButton runat="server" id="BtnPrintRAL6" ImageUrl="../../images/IconPrinter.gif" PostBackUrl="RALChangeExecutorInputParameterTugas.aspx" ToolTip="Print RAL Untuk Internal" /></td>
      <td align="center">
		<asp:HyperLink runat="server" id="BtnBast4" NavigateUrl="BAPK.htm" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td align="center" style="width: 12%">99</td>
      <td align="center">999</td>
      <td align="center">xx20xx</td>
      <td align="center">dd/mm/yyyy to dd/mm/yyyy</td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('ViewCollector.htm','Collector','scrollbars=yes,width=500,height=500')">xxxx10xxxx</a></td>
      <td class="style1"><a href="RALChangeExecutor2.htm">
		<img src="../../images/IconDocument.gif" width="16" height="11" border="0"></a></td>
      <td class="style1">
		<asp:ImageButton runat="server" id="BtnPrintRAL3" ImageUrl="../../images/IconPrinter.gif" PostBackUrl="RALChangeExecutorInputParameter.aspx" ToolTip="Print RAL Untuk External" /></td>
      <td align="center">
		<asp:HyperLink runat="server" id="BtnBast5" NavigateUrl="BAPK.htm" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td align="center" style="width: 12%">99</td>
      <td align="center">999</td>
      <td align="center">xx20xx</td>
      <td align="center">dd/mm/yyyy to dd/mm/yyyy</td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('ViewCollector.htm','Collector','scrollbars=yes,width=500,height=500')">xxxx10xxxx</a></td>
      <td class="style1"><a href="RALChangeExecutor2.htm">
		<img src="../../images/IconDocument.gif" width="16" height="11" border="0"></a></td>
      <td class="style1">
		<asp:ImageButton runat="server" id="BtnPrintRAL7" ImageUrl="../../images/IconPrinter.gif" PostBackUrl="RALChangeExecutorInputParameterTugas.aspx" ToolTip="Print RAL Untuk Internal" /></td>
      <td align="center">
		<asp:HyperLink runat="server" id="BtnBast6" NavigateUrl="BAPK.htm" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td align="center" style="width: 12%">99</td>
      <td align="center">999</td>
      <td align="center">xx20xx</td>
      <td align="center">dd/mm/yyyy to dd/mm/yyyy</td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('ViewCollector.htm','Collector','scrollbars=yes,width=500,height=500')">xxxx10xxxx</a></td>
      <td class="style1"><a href="RALChangeExecutor2.htm">
		<img src="../../images/IconDocument.gif" width="16" height="11" border="0"></a></td>
      <td class="style1">
		<asp:ImageButton runat="server" id="BtnPrintRAL4" ImageUrl="../../images/IconPrinter.gif" PostBackUrl="RALChangeExecutorInputParameter.aspx" ToolTip="Print RAL Untuk External" /></td>
      <td align="center">
		<asp:HyperLink runat="server" id="BtnBast7" NavigateUrl="BAPK.htm" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
      <td align="left"><a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
      <td align="center" style="width: 12%">99</td>
      <td align="center">999</td>
      <td align="center">xx20xx</td>
      <td align="center">dd/mm/yyyy to dd/mm/yyyy</td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('ViewCollector.htm','Collector','scrollbars=yes,width=500,height=500')">xxxx10xxxx</a></td>
      <td class="style1"><a href="RALChangeExecutor2.htm">
		<img src="../../images/IconDocument.gif" width="16" height="11" border="0"></a></td>
      <td class="style1">
		<asp:ImageButton runat="server" id="BtnPrintRAL8" ImageUrl="../../images/IconPrinter.gif" PostBackUrl="RALChangeExecutorInputParameterTugas.aspx" ToolTip="Print RAL Untuk Internal" /></td>
      <td align="center">
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
  
  
  
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td><img src="../../images/BulatMerah.gif" width="10" height="10"> Has Been 
        Extend </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
