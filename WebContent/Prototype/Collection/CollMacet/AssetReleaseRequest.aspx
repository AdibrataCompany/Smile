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
	text-align: right;
}
</style>
</head>
<body>
<div align="center">
<form id="FrmAssetRelease" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">ASSET RELEASE REQUEST</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" style="width: 20%"> 
        Agreement No</td>
      <td class="tdganjil" style="width: 71%"> 
		<a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewAgreement.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a>&nbsp;</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%"> 
        Customer Name</td>
      <td class="tdganjil" style="width: 71%"> 
		<a href="javascript:;" onClick="MM_openBrWindow('../../LookUp/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxx50xxxxxxxx</a></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%"> 
        		Asset Unit</td>
      <td class="tdganjil" style="width: 71%"> 
        999</td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr align="right"> 
      <td>&nbsp;</td>
    </tr>
  </table>
  
</div>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">ASSET RELEASE REQUEST - LISTING</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr align="center" class="tdjudulungu"> 
      <td style="width: 8%"> NO</td>
      <td style="width: 8%"> ASSET DESCRIPTION</td>
      <td>CHASIS NO.</td>
      <td>ENGINE NO.</td>
      <td>COLOR</td>
      <td>YEAR</td>
      <td>LICENSE PLATE</td>
      <td>INV. EXPECTED DATE</td>
      <td>REPOSSESS DATE</td>
      <td>ASSET STATUS</td>
      <td>RELEASE</td>
      <td>PRINT BAST</td>
    </tr>
    <tr class="tdganjil"> 
      <td style="width: 8%" class="style1">99</td>
      <td align="center" style="width: 8%">xxxxxxxx50xxxxxxxx</td>
      <td align="left" width="18%">xxxxx20xxxxx</td>
      <td>xxxxx20xxxxx</td>
      <td align="center">xxxxx20xxxxx</td>
      <td align="center">YYYY</td>
      <td align="center">xxxxx20xxxxx</td>
      <td align="center">dd/mm/yyyy</td>
      <td align="center">dd/mm/yyyy</td>
      <td align="center">xx3xx</td>
      <td align="center"><a href="../CollMacet/AssetRelease2.htm">Release</a></td>
      <td align="center">
		<asp:HyperLink runat="server" id="BtnBPK" NavigateUrl="ReportBPK.aspx" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdgenap"> 
      <td style="width: 8%" class="style1">99</td>
      <td align="center" style="width: 8%">xxxxxxxx50xxxxxxxx</td>
      <td align="left" width="18%">xxxxx20xxxxx</td>
      <td>xxxxx20xxxxx</td>
      <td align="center" >xxxxx20xxxxx</td>
      <td align="center" >YYYY</td>
      <td align="center" >xxxxx20xxxxx</td>
      <td align="center" >dd/mm/yyyy</td>
      <td align="center" >dd/mm/yyyy</td>
      <td align="center" >xx3xx</td>
      <td align="center" class="tdgenap"><a href="../CollMacet/AssetRelease2.htm">Release</a></td>
      <td align="center" class="tdgenap">
		<asp:HyperLink runat="server" id="BtnBPK0" NavigateUrl="ReportBPK.aspx" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td style="width: 8%" class="style1">99</td>
      <td align="center" style="width: 8%">xxxxxxxx50xxxxxxxx</td>
      <td align="left" width="18%">xxxxx20xxxxx</td>
      <td>xxxxx20xxxxx</td>
      <td align="center">xxxxx20xxxxx</td>
      <td align="center">YYYY</td>
      <td align="center">xxxxx20xxxxx</td>
      <td align="center">dd/mm/yyyy</td>
      <td align="center">dd/mm/yyyy</td>
      <td align="center">xx3xx</td>
      <td align="center"><a href="../CollMacet/AssetRelease2.htm">Release</a></td>
      <td align="center">
		<asp:HyperLink runat="server" id="BtnBPK1" NavigateUrl="ReportBPK.aspx" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdgenap"> 
      <td style="width: 8%" class="style1">99</td>
      <td align="center" style="width: 8%">xxxxxxxx50xxxxxxxx</td>
      <td align="left" width="18%">xxxxx20xxxxx</td>
      <td>xxxxx20xxxxx</td>
      <td align="center" >xxxxx20xxxxx</td>
      <td align="center" >YYYY</td>
      <td align="center" >xxxxx20xxxxx</td>
      <td align="center" >dd/mm/yyyy</td>
      <td align="center" >dd/mm/yyyy</td>
      <td align="center" >xx3xx</td>
      <td align="center" class="tdgenap"><a href="../CollMacet/AssetRelease2.htm">Release</a></td>
      <td align="center" class="tdgenap">
		<asp:HyperLink runat="server" id="BtnBPK2" NavigateUrl="ReportBPK.aspx" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td style="width: 8%" class="style1">99</td>
      <td align="center" style="width: 8%">xxxxxxxx50xxxxxxxx</td>
      <td align="left" width="18%">xxxxx20xxxxx</td>
      <td>xxxxx20xxxxx</td>
      <td align="center">xxxxx20xxxxx</td>
      <td align="center">YYYY</td>
      <td align="center">xxxxx20xxxxx</td>
      <td align="center">dd/mm/yyyy</td>
      <td align="center">dd/mm/yyyy</td>
      <td align="center">xx3xx</td>
      <td align="center"><a href="../CollMacet/AssetRelease2.htm">Release</a></td>
      <td align="center">
		<asp:HyperLink runat="server" id="BtnBPK3" NavigateUrl="ReportBPK.aspx" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdgenap"> 
      <td style="width: 8%" class="style1">99</td>
      <td align="center" style="width: 8%">xxxxxxxx50xxxxxxxx</td>
      <td align="left" width="18%">xxxxx20xxxxx</td>
      <td>xxxxx20xxxxx</td>
      <td align="center" >xxxxx20xxxxx</td>
      <td align="center" >YYYY</td>
      <td align="center" >xxxxx20xxxxx</td>
      <td align="center" >dd/mm/yyyy</td>
      <td align="center" >dd/mm/yyyy</td>
      <td align="center" >xx3xx</td>
      <td align="center" class="tdgenap"><a href="../CollMacet/AssetRelease2.htm">Release</a></td>
      <td align="center" class="tdgenap">
		<asp:HyperLink runat="server" id="BtnBPK4" NavigateUrl="ReportBPK.aspx" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td style="width: 8%" class="style1">99</td>
      <td align="center" style="width: 8%">xxxxxxxx50xxxxxxxx</td>
      <td align="left" width="18%">xxxxx20xxxxx</td>
      <td>xxxxx20xxxxx</td>
      <td align="center">xxxxx20xxxxx</td>
      <td align="center">YYYY</td>
      <td align="center">xxxxx20xxxxx</td>
      <td align="center">dd/mm/yyyy</td>
      <td align="center">dd/mm/yyyy</td>
      <td align="center">xx3xx</td>
      <td align="center"><a href="../CollMacet/AssetRelease2.htm">Release</a></td>
      <td align="center">
		<asp:HyperLink runat="server" id="BtnBPK5" NavigateUrl="ReportBPK.aspx" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdgenap"> 
      <td style="width: 8%" class="style1">99</td>
      <td align="center" style="width: 8%">xxxxxxxx50xxxxxxxx</td>
      <td align="left" width="18%">xxxxx20xxxxx</td>
      <td>xxxxx20xxxxx</td>
      <td align="center" >xxxxx20xxxxx</td>
      <td align="center" >YYYY</td>
      <td align="center" >xxxxx20xxxxx</td>
      <td align="center" >dd/mm/yyyy</td>
      <td align="center" >dd/mm/yyyy</td>
      <td align="center" >xx3xx</td>
      <td align="center" class="tdgenap"><a href="../CollMacet/AssetRelease2.htm">Release</a></td>
      <td align="center" class="tdgenap">
		<asp:HyperLink runat="server" id="BtnBPK6" NavigateUrl="ReportBPK.aspx" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdganjil"> 
      <td style="width: 8%" class="style1">99</td>
      <td align="center" style="width: 8%">xxxxxxxx50xxxxxxxx</td>
      <td align="left" width="18%">xxxxx20xxxxx</td>
      <td>xxxxx20xxxxx</td>
      <td align="center">xxxxx20xxxxx</td>
      <td align="center">YYYY</td>
      <td align="center">xxxxx20xxxxx</td>
      <td align="center">dd/mm/yyyy</td>
      <td align="center">dd/mm/yyyy</td>
      <td align="center">xx3xx</td>
      <td align="center"><a href="../CollMacet/AssetRelease2.htm">Release</a></td>
      <td align="center">
		<asp:HyperLink runat="server" id="BtnBPK7" NavigateUrl="ReportBPK.aspx" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
    <tr class="tdgenap"> 
      <td style="width: 8%" class="style1">99</td>
      <td align="center" style="width: 8%">xxxxxxxx50xxxxxxxx</td>
      <td align="left" width="18%">xxxxx20xxxxx</td>
      <td>xxxxx20xxxxx</td>
      <td align="center" >xxxxx20xxxxx</td>
      <td align="center" >YYYY</td>
      <td align="center" >xxxxx20xxxxx</td>
      <td align="center" >dd/mm/yyyy</td>
      <td align="center" >dd/mm/yyyy</td>
      <td align="center" >xx3xx</td>
      <td align="center" class="tdgenap"><a href="../CollMacet/AssetRelease2.htm">Release</a></td>
      <td align="center" class="tdgenap">
		<asp:HyperLink runat="server" id="BtnBPK8" NavigateUrl="ReportBPK.aspx" ImageUrl="../../images/IconPrinter.gif" Target="_blank">
		</asp:HyperLink>
		</td>
    </tr>
  </table>
</form>
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
  <table width="95%" border="0" cellspacing="2" cellpadding="1">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><a href="javascript:history.go(-1);">
		<img src="../../images/ButtonBack.gif" width="100" height="20" border="0"></a> 
      </td>
    </tr>
  </table>
  
  
  
  
  
  
</body>
</html>
