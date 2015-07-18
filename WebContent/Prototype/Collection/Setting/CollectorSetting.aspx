<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>COLLECTION</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
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
</style>
</head>
<body>
<form id="FrmCollectorSettingSearch" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">COLLECTION</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" style="width: 19%">Collection Group</td>
      <td class="tdganjil" style="width: 18%"> 
        <select name="select">
          <option selected>CG Jakarta</option>
        </select>
      </td>
      <td width="16%" class="tdgenap">Search By</td>
      <td width="34%" class="tdganjil"> 
        <select name="select14">
          <option selected>Collector Id</option>
          <option>Collector Name</option>
          <option>Collector Type</option>
        </select>
        <input name="textfield" type="text" class="inptype">
      </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td> 
        <div align="right"> 
			<img src="../../images/ButtonSearch.gif" width="100" height="20">&nbsp;
			<img src="../../images/ButtonReset.gif" width="100" height="20"></div>
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">COLLECTION LISTING</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>

  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr align="center" class="tdjudulungu"> 
      <td><a href="CollectorSettingSearch.htm">COLLECTOR ID</a></td>
      <td><a href="CollectorSettingSearch.htm">COLLECTOR NAME</a></td>
      <td><a href="CollectorSettingSearch.htm">TYPE</a></td>
      <td><a href="CollectorSettingSearch.htm">ACTIVE</a></td>
      <td>SCHEME</td>
      <td>EDIT</td>
      <td>DELETE</td>
    </tr>
    <tr class="tdganjil"> 
      <td width="15%">
		<asp:HyperLink runat="server" id="LinkCollectorId" NavigateUrl="../CollMacet/ViewCollector.htm" Target="_blank">xxxxx10xxxxx
		</asp:HyperLink>
		</td>
      <td>xxxxxxxx50xxxxxxxx</td>
      <td class="style1">xxxxx20xxxxx</td>
      <td align="center">Y</td>
      <td align="center">&nbsp;</td>
      <td align="center"><a href="CollectorSettingEdit.aspx">
		<img src="../../images/IconEdit.gif" width="16" height="13" border="0"></a></td>
      <td align="center">
		<img src="../../images/IconDelete.gif" width="16" height="16"></td>
    </tr>
    <tr class="tdgenap"> 
      <td width="15%">
		<asp:HyperLink runat="server" id="LinkCollectorId0" NavigateUrl="../CollMacet/ViewCollector.htm" Target="_blank">xxxxx10xxxxx
		</asp:HyperLink>
		</td>
      <td>xxxxxxxx50xxxxxxxx</td>
      <td class="style1">xxxxx20xxxxx</td>
      <td align="center">Y</td>
      <td align="center"><a href="CollectorScheme.aspx">
		<img src="../../images/IconDetail.gif" width="15" height="15" border="0"></a></td>
      <td align="center"><a href="CollectorSettingEdit.aspx">
		<img src="../../images/IconEdit.gif" width="16" height="13" border="0"></a></td>
      <td align="center">
		<img src="../../images/IconDelete.gif" width="16" height="16"></td>
    </tr>
    <tr class="tdganjil"> 
      <td height="24" width="15%">
		<asp:HyperLink runat="server" id="LinkCollectorId1" NavigateUrl="../CollMacet/ViewCollector.htm" Target="_blank">xxxxx10xxxxx
		</asp:HyperLink>
		</td>
      <td>xxxxxxxx50xxxxxxxx</td>
      <td class="style1">xxxxx20xxxxx</td>
      <td align="center">Y</td>
      <td align="center"><a href="CollectorScheme.aspx">
		<img src="../../images/IconDetail.gif" width="15" height="15" border="0"></a></td>
      <td align="center"><a href="CollectorSettingEdit.aspx">
		<img src="../../images/IconEdit.gif" width="16" height="13" border="0"></a></td>
      <td align="center">
		<img src="../../images/IconDelete.gif" width="16" height="16"></td>
    </tr>
    <tr class="tdgenap"> 
      <td width="15%">
		<asp:HyperLink runat="server" id="LinkCollectorId2" NavigateUrl="../CollMacet/ViewCollector.htm" Target="_blank">xxxxx10xxxxx
		</asp:HyperLink>
		</td>
      <td>xxxxxxxx50xxxxxxxx</td>
      <td class="style1">xxxxx20xxxxx</td>
      <td align="center">x</td>
      <td align="center">&nbsp;</td>
      <td align="center"><a href="CollectorSettingEdit.aspx">
		<img src="../../images/IconEdit.gif" width="16" height="13" border="0"></a></td>
      <td align="center">
		<img src="../../images/IconDelete.gif" width="16" height="16"></td>
    </tr>
    <tr class="tdganjil"> 
      <td width="15%">
		<asp:HyperLink runat="server" id="LinkCollectorId3" NavigateUrl="../CollMacet/ViewCollector.htm" Target="_blank">xxxxx10xxxxx
		</asp:HyperLink>
		</td>
      <td>xxxxxxxx50xxxxxxxx</td>
      <td class="style1">xxxxx20xxxxx</td>
      <td align="center">x</td>
      <td align="center">&nbsp;</td>
      <td align="center"><a href="CollectorSettingEdit.aspx">
		<img src="../../images/IconEdit.gif" width="16" height="13" border="0"></a></td>
      <td align="center">
		<img src="../../images/IconDelete.gif" width="16" height="16"></td>
    </tr>
    <tr class="tdgenap"> 
      <td width="15%">
		<asp:HyperLink runat="server" id="LinkCollectorId4" NavigateUrl="../CollMacet/ViewCollector.htm" Target="_blank">xxxxx10xxxxx
		</asp:HyperLink>
		</td>
      <td>xxxxxxxx50xxxxxxxx</td>
      <td class="style1">xxxxx20xxxxx</td>
      <td align="center">x</td>
      <td align="center">&nbsp;</td>
      <td align="center"><a href="CollectorSettingEdit.aspx">
		<img src="../../images/IconEdit.gif" width="16" height="13" border="0"></a></td>
      <td align="center">
		<img src="../../images/IconDelete.gif" width="16" height="16"></td>
    </tr>
    <tr class="tdganjil"> 
      <td width="15%">
		<asp:HyperLink runat="server" id="LinkCollectorId5" NavigateUrl="../CollMacet/ViewCollector.htm" Target="_blank">xxxxx10xxxxx
		</asp:HyperLink>
		</td>
      <td>xxxxxxxx50xxxxxxxx</td>
      <td class="style1">xxxxx20xxxxx</td>
      <td align="center">x</td>
      <td align="center">&nbsp;</td>
      <td align="center"><a href="CollectorSettingEdit.aspx">
		<img src="../../images/IconEdit.gif" width="16" height="13" border="0"></a></td>
      <td align="center">
		<img src="../../images/IconDelete.gif" width="16" height="16"></td>
    </tr>
    <tr class="tdgenap"> 
      <td width="15%">
		<asp:HyperLink runat="server" id="LinkCollectorId6" NavigateUrl="../CollMacet/ViewCollector.htm" Target="_blank">xxxxx10xxxxx
		</asp:HyperLink>
		</td>
      <td>xxxxxxxx50xxxxxxxx</td>
      <td class="style1">xxxxx20xxxxx</td>
      <td align="center">x</td>
      <td align="center">&nbsp;</td>
      <td align="center"><a href="CollectorSettingEdit.aspx">
		<img src="../../images/IconEdit.gif" width="16" height="13" border="0"></a></td>
      <td align="center">
		<img src="../../images/IconDelete.gif" width="16" height="16"></td>
    </tr>
    <tr class="tdganjil"> 
      <td width="15%">
		<asp:HyperLink runat="server" id="LinkCollectorId7" NavigateUrl="../CollMacet/ViewCollector.htm" Target="_blank">xxxxx10xxxxx
		</asp:HyperLink>
		</td>
      <td>xxxxxxxx50xxxxxxxx</td>
      <td class="style1">xxxxx20xxxxx</td>
      <td align="center">x</td>
      <td align="center">&nbsp;</td>
      <td align="center"><a href="CollectorSettingEdit.aspx">
		<img src="../../images/IconEdit.gif" width="16" height="13" border="0"></a></td>
      <td align="center">
		<img src="../../images/IconDelete.gif" width="16" height="16"></td>
    </tr>
    <tr class="tdgenap"> 
      <td width="15%"><a href="javascript:;" onClick="MM_openBrWindow('ViewCollector.htm','Collector','scrollbars=yes,width=900,height=500')">xxxxx10xxxxx</a></td>
      <td>xxxxxxxx50xxxxxxxx</td>
      <td class="style1">xxxxx20xxxxx</td>
      <td align="center">x</td>
      <td align="center">&nbsp;</td>
      <td align="center"><a href="CollectorSettingEdit.aspx">
		<img src="../../images/IconEdit.gif" width="16" height="13" border="0"></a></td>
      <td align="center">
		<img src="../../images/IconDelete.gif" width="16" height="16"></td>
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
  
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30"><a href="RptCollector.htm">
		<img src="../../images/ButtonPrint.gif" width="100" height="20" border="0"></a></td>
      <td width="50%" align="right"><a href="CollectorSettingAdd.aspx">
		<img src="../../images/ButtonAdd.gif" width="100" height="20" border="0"></a> 
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
