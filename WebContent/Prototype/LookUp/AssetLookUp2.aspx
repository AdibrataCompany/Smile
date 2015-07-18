<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Asset</title>
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
<form id="frmLookupAsset" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Asset Type</td>
      <td class="tdganjil"><asp:DropDownList runat="server"  ID="ddlAssetType">
            <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="Heavy Equipment" Value="HE"></asp:ListItem>
            <asp:ListItem Text="Automotive" Value="Automotive"></asp:ListItem>
      </asp:DropDownList></td>
    </tr>
    <tr> 
      <td class="tdgenap">Search By</td>
      <td class="tdganjil"><select name="select">
          <option selected>Asset Code</option>
          <option>Description</option>
        </select> <input name="textfield" type="text" size="20" class="inptype"> 
      </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td height="30">&nbsp;</td>
      <td align="right"><a href="AssetLookUp2.aspx"><img src="../Images/ButtonSearch.gif" width="100" height="20" border="0"></a> 
        <a href="AssetLookUp.htm"><img src="../Images/ButtonReset.gif" width="100" height="20" border="0"></a> 
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr align="center" class="tdjudulhijau"> 
      <td width="10%">SELECT</td>
      <td width="25%"><a href="AssetLookUp2.aspx">ASSET CODE</a></td>
      <td width="65%"><a href="AssetLookUp2.aspx">DESCRIPTION</a></td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><input type="radio" name="radiobutton" value="radiobutton"></td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('../Marketing/AssetMasterDetailView.htm','AssetMaster','scrollbars=yes,width=900,height=300,left=0,top=0')">xxxx10xxxx</a></td>
      <td>xxxxxxxx50xxxxxxxx</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><input type="radio" name="radiobutton" value="radiobutton"></td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('../Marketing/AssetMasterDetailView.htm','AssetMaster','scrollbars=yes,width=900,height=300,left=0,top=0')">xxxx10xxxx</a></td>
      <td>xxxxxxxx50xxxxxxxx</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><input type="radio" name="radiobutton" value="radiobutton"></td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('../Marketing/AssetMasterDetailView.htm','AssetMaster','scrollbars=yes,width=900,height=300,left=0,top=0')">xxxx10xxxx</a></td>
      <td>xxxxxxxx50xxxxxxxx</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><input type="radio" name="radiobutton" value="radiobutton"></td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('../Marketing/AssetMasterDetailView.htm','AssetMaster','scrollbars=yes,width=900,height=300,left=0,top=0')">xxxx10xxxx</a></td>
      <td>xxxxxxxx50xxxxxxxx</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><input type="radio" name="radiobutton" value="radiobutton"></td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('../Marketing/AssetMasterDetailView.htm','AssetMaster','scrollbars=yes,width=900,height=300,left=0,top=0')">xxxx10xxxx</a></td>
      <td>xxxxxxxx50xxxxxxxx</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><input type="radio" name="radiobutton" value="radiobutton"></td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('../Marketing/AssetMasterDetailView.htm','AssetMaster','scrollbars=yes,width=900,height=300,left=0,top=0')">xxxx10xxxx</a></td>
      <td>xxxxxxxx50xxxxxxxx</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><input type="radio" name="radiobutton" value="radiobutton"></td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('../Marketing/AssetMasterDetailView.htm','AssetMaster','scrollbars=yes,width=900,height=300,left=0,top=0')">xxxx10xxxx</a></td>
      <td>xxxxxxxx50xxxxxxxx</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><input type="radio" name="radiobutton" value="radiobutton"></td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('../Marketing/AssetMasterDetailView.htm','AssetMaster','scrollbars=yes,width=900,height=300,left=0,top=0')">xxxx10xxxx</a></td>
      <td>xxxxxxxx50xxxxxxxx</td>
    </tr>
    <tr class="tdganjil"> 
      <td align="center"><input type="radio" name="radiobutton" value="radiobutton"></td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('../Marketing/AssetMasterDetailView.htm','AssetMaster','scrollbars=yes,width=900,height=300,left=0,top=0')">xxxx10xxxx</a></td>
      <td>xxxxxxxx50xxxxxxxx</td>
    </tr>
    <tr class="tdgenap"> 
      <td align="center"><input type="radio" name="radiobutton" value="radiobutton"></td>
      <td><a href="javascript:;" onClick="MM_openBrWindow('../Marketing/AssetMasterDetailView.htm','AssetMaster','scrollbars=yes,width=900,height=300,left=0,top=0')">xxxx10xxxx</a></td>
      <td>xxxxxxxx50xxxxxxxx</td>
    </tr>
  </table>
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><img src="../Images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../Images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../Images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../Images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../Images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  
  
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><a href="javascript:window.close();"><img src="../Images/ButtonSelect.gif" width="100" height="20" border="0"></a> 
        <a href="javascript:window.close();"><img src="../Images/ButtonExit.gif" width="100" height="20" border="0"></a><a href="AgreementRelatedDetailAdd.htm"> 
        </a><a href="javascript:history.go(-2);"> </a> </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
