<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
</head>
<body>
<form runat="server" id="frmgeneralsetting">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">GENERAL SETTING - COLLECTION</td>
      <td class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center"> 
    <div align="center"> 
      <table width="95%" border="0" cellspacing="1" cellpadding="2" class="tablegrid">
        <tr> 
          <td class="tdgenap" width="25%">Search By</td>
          <td class="tdganjil" width="78%" colspan="3"> 
			<select name="select" style="width: 90px">
              <option selected>Name</option>
            </select> <asp:TextBox runat="server" id="txtsearchby" CssClass="inptype"></asp:TextBox> </td>
        </tr>
      </table>
    </div>
    <table width="95%" border="0" cellspacing="0" cellpadding="0">
      <tr> 
        <td width="50%" height="30">&nbsp;</td>
        <td width="50%" align="right"><img src="../../Images/ButtonSearch.gif" width="100" height="20" border="0"> 
          <img src="../../Images/ButtonReset.gif" width="100" height="20"> </td>
      </tr>
    </table>
    <br>
    <table width="95%" border="0" cellspacing="0" cellpadding="0">
      <tr class="trtopikuning"> 
        <td height="20" class="tdtopiungukiri">&nbsp;</td>
        <td align="center" class="tdtopiungu">GENERAL SETTING - COLLECTION - LISTING</td>
        <td class="tdtopiungukanan">&nbsp;</td>
      </tr>
    </table>
  </div>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdjudulungu"> 
      <td align="center"><a href="GeneralSetting.aspx">NAME</a></td>
      <td width="20%" align="center"><a href="GeneralSetting.aspx">VALUE</a></td>
      <td width="10%" align="center">EDIT</td>
    </tr>
    <tr class="tdganjil"> 
      <td>xxxxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxxxx50xxxxxxxxx</td>
      <td align="center"><a href="GeneralSettingEdit.aspx"><img src="../../Images/IconEdit.gif" width="16" height="13" border="0"></a></td>
    </tr>
    <tr class="tdgenap"> 
      <td>xxxxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxxxx50xxxxxxxxx</td>
      <td align="center"><a href="GeneralSettingEdit.aspx"><img src="../../Images/IconEdit.gif" width="16" height="13" border="0"></a></td>
    </tr>
    <tr class="tdganjil"> 
      <td>xxxxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxxxx50xxxxxxxxx</td>
      <td align="center"><a href="GeneralSettingEdit.aspx"><img src="../../Images/IconEdit.gif" width="16" height="13" border="0"></a></td>
    </tr>
    <tr class="tdgenap"> 
      <td style="height: 15px">xxxxxxxxxx50xxxxxxxxx</td>
      <td style="height: 15px">xxxxxxxxxx50xxxxxxxxx</td>
      <td align="center" style="height: 15px"><a href="GeneralSettingEdit.aspx"><img src="../../Images/IconEdit.gif" width="16" height="13" border="0"></a></td>
    </tr>
    <tr class="tdganjil"> 
      <td>xxxxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxxxx50xxxxxxxxx</td>
      <td align="center"><a href="GeneralSettingEdit.aspx"><img src="../../Images/IconEdit.gif" width="16" height="13" border="0"></a></td>
    </tr>
    <tr class="tdgenap"> 
      <td>xxxxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxxxx50xxxxxxxxx</td>
      <td align="center"><a href="GeneralSettingEdit.aspx"><img src="../../Images/IconEdit.gif" width="16" height="13" border="0"></a></td>
    </tr>
    <tr class="tdganjil"> 
      <td>xxxxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxxxx50xxxxxxxxx</td>
      <td align="center"><a href="GeneralSettingEdit.aspx"><img src="../../Images/IconEdit.gif" width="16" height="13" border="0"></a></td>
    </tr>
    <tr class="tdgenap"> 
      <td>xxxxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxxxx50xxxxxxxxx</td>
      <td align="center"><a href="GeneralSettingEdit.aspx"><img src="../../Images/IconEdit.gif" width="16" height="13" border="0"></a></td>
    </tr>
    <tr class="tdganjil"> 
      <td>xxxxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxxxx50xxxxxxxxx</td>
      <td align="center"><a href="GeneralSettingEdit.aspx"><img src="../../Images/IconEdit.gif" width="16" height="13" border="0"></a></td>
    </tr>
    <tr class="tdgenap"> 
      <td>xxxxxxxxxx50xxxxxxxxx</td>
      <td>xxxxxxxxxx50xxxxxxxxx</td>
      <td align="center"><a href="GeneralSettingEdit.aspx"><img src="../../Images/IconEdit.gif" width="16" height="13" border="0"></a></td>
    </tr>
  </table>
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><img src="../../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../../images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td><img src="../../Images/ButtonPrint.gif" width="100" height="20" border="0"></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
