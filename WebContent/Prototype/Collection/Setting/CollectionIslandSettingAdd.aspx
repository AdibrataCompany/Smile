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
<form runat="server" id="FrmCollectionIslandSettingEdit">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">COLLECTION ISLAND - ADD</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" width="25%">Collection Island ID</td>
      <td class="tdganjil" colspan="3"> <input name="textfield32" type="text" class="inptype" size="10"> 
        <font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap">Collection Island Name</td>
      <td class="tdganjil" colspan="3"> <input name="textfield3" type="text" class="inptype" size="50"> 
        <font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap"> <div align="left">Collection Island Head</div></td>
      <td class="tdganjil"> <input type="text" name="textfield" class="inptype" disable> 
        <a href="javascript:;" onClick="MM_openBrWindow('LookupEmployee.htm','Employee','scrollbars=yes,width=900,height=500')"><img src="../../Images/IconDetail.gif" width="15" height="15" border="0"></a> 
        <font color="red">*)</font> </td>
    </tr>
         <tr> 
      <td class="tdgenap"> <div align="left">Island Name</div></td>
      <td class="tdganjil"> 
      <asp:DropDownList runat="server" ID="DDLIsland" Width="126px" Height="16px">
        <asp:ListItem Text="Sumatera"></asp:ListItem>
        <asp:ListItem Text="Jawa"></asp:ListItem>
        <asp:ListItem Text="Kalimantan"></asp:ListItem>
        <asp:ListItem Text="Sulawesi"></asp:ListItem>
        <asp:ListItem Text="Denpasar"></asp:ListItem>
        <asp:ListItem Text="Irian Jaya"></asp:ListItem>
      </asp:DropDownList>
      
       </td>
    </tr>

    <tr> 
      <td class="tdjudulungu" colspan="4">ADDRESS</td>
    </tr>
    <tr>
      <td class="tdgenap">
        <asp:Label runat="server" ID="LblCopy" Text="Copy Address From Branch"></asp:Label>
      </td>
      <td class="tdganjil">
        <asp:DropDownList runat="server" ID="DDLCopy" Width="132px" Height="16px" >
        <asp:ListItem Text="-"></asp:ListItem>
        <asp:ListItem Text="Bandung"></asp:ListItem>
        <asp:ListItem Text="Jakarta"></asp:ListItem>
        <asp:ListItem Text="Denpasar"></asp:ListItem>
        <asp:ListItem Text="Medan"></asp:ListItem>
        </asp:DropDownList>
        <asp:ImageButton id="imbCopyAddress" runat="server" ImageUrl="../../images/buttoncopy.gif"></asp:ImageButton>
      </td>

    </tr>
    <tr> 
      <td class="tdgenap">Address</td>
      <td class="tdganjil" colspan="3">
          <textarea name="textfield" cols="40" rows="5"></textarea>
          <font color="red">*)</font></td>
    </tr>
    <tr> 
      <td class="tdgenap">RT/RW</td>
      <td class="tdganjil" colspan="3"> <input type="text" name="textfield5" class="inptype" size=5>
        / 
        <input type="text" name="textfield5" class="inptype" size=5> </td>
    </tr>
    <tr> 
      <td class="tdgenap">Kelurahan</td>
      <td class="tdganjil" colspan="3"> <input type="text" name="textfield82" class="inptype"> 
        <font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap">Kecamatan</td>
      <td class="tdganjil" colspan="3"> <input type="text" name="textfield83" class="inptype"> 
        <font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap">City</td>
      <td class="tdganjil" colspan="3"> <input type="text" name="textfield84" class="inptype"> 
        <font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap">Zip Code</td>
      <td class="tdganjil" colspan="3"> <input type="text" name="textfield5" class="inptype" size=5> 
        <a href="javascript:;" onClick="MM_openBrWindow('../Lookup/ZipCodeLookUp.htm','ZipCode','scrollbars=yes,width=900,height=500,left=0,top=0')"><img src="../../Images/IconDetail.gif" width="15" height="15" align="absmiddle" border="0"></a> 
        <font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap">Phone No 1</td>
      <td class="tdganjil" colspan="3"> <input type="text" name="textfield5" class="inptype" size=5>
        - 
        <input type="text" name="textfield5" class="inptype" size=10> <font color="red">*)</font> 
      </td>
    </tr>
    <tr> 
      <td class="tdgenap">Phone No 2</td>
      <td class="tdganjil" colspan="3"> <input type="text" name="textfield5" class="inptype" size="5">
        - 
        <input type="text" name="textfield5" class="inptype" size="10"> </td>
    </tr>
    <tr> 
      <td class="tdgenap">Fax No</td>
      <td class="tdganjil" colspan="3"> <input type="text" name="textfield52" class="inptype" size="5">
        - 
        <input type="text" name="textfield52" class="inptype" size="10"> </td>
    </tr>
    <tr> 
      <td class="tdjudulungu" colspan="4">CONTACT PERSON</td>
    </tr>
    <tr> 
      <td class="tdgenap">Name</td>
      <td class="tdganjil" colspan="3"> <input type="text" name="textfield6" size="40" class="inptype"> 
        <font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap">Title</td>
      <td class="tdganjil" colspan="3"> <input type="text" name="textfield7" class="inptype" size="40"> 
      </td>
    </tr>
    <tr> 
      <td class="tdgenap">Mobile Phone</td>
      <td class="tdganjil" colspan="3"> <input type="text" name="textfield8" class="inptype"> 
      </td>
    </tr>
    <tr> 
      <td class="tdgenap">E-mail</td>
      <td class="tdganjil" colspan="3"> <input type="text" name="textfield9" size="40" class="inptype"> 
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><a href="javascript:history.go(-1);"><img src="../../Images/ButtonSave.gif" width="100" height="20" border="0"> 
        <img src="../../Images/ButtonCancel.gif" width="100" height="20" border="0"></a> 
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>