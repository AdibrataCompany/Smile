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
<form runat="server" id="FrmBucketEdit">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ADDITIONAL COLLATERAL - RECEIVE&nbsp;</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
   <tr> 
      <td class="tdgenap">Asset Type</td>
      <td class="tdganjil" colspan="3" width="80%"> 
        xxxx10xxxx
      </td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Asset Description</td>
      <td class="tdganjil" colspan="3"><asp:TextBox ID="txtAssetCode" runat="server" CssClass="inptype"></asp:TextBox>
          <asp:HyperLink ID="hypAssetCode" runat="server" ImageUrl="../../Images/IconDetail.gif" NavigateUrl="../../Lookup/AssetLookup.htm" Target="_blank"></asp:HyperLink>
    </tr>
    <tr> 
      <td class="tdgenap">Resale Value (%)</td>
      <td class="tdganjil" colspan="3"> 
        <input name="textfield3" type="text" class="inptype" size="50" value="99.99" style="width: 59px"></td>
    </tr>
    <tr> 
      <td class="tdgenap">Market Value</td>
      <td class="tdganjil" colspan="3"> 
      <input name="textfield3" type="text" class="inptype" size="50" value="999,999,999,999.99" style="width: 125px">
         </td>
    </tr>
   
    <tr> 
      <td class="tdgenap">Chassis No [Serial No 1]</td>
      <td class="tdganjil" colspan="3" width="30%"> 
        <asp:TextBox ID="txtSerial1" runat="server" CssClass="inptype"></asp:textbox></td>
    </tr>
    <tr> 
      <td class="tdgenap"> 
        <div align="left">Engine No&nbsp; [Serial No 2]</div>
      </td>
      <td class="tdganjil" colspan="3"> 
         <asp:TextBox ID="txtSerial2" runat="server" CssClass="inptype"></asp:textbox></td>
    </tr>
    <tr>
      <td class="tdgenap" width="20%">Is Insurance</td>
      <td class="tdganjil" width="30%">
          <asp:RadioButtonlist runat="server" id="RdBtnIsInsurance" RepeatDirection="Horizontal" AutoPostBack="true">
			<asp:ListItem Text="Yes" Value="Y" Selected="True"></asp:ListItem>
			<asp:ListItem Text="No" Value="N"  ></asp:ListItem>
     	  </asp:RadioButtonlist>
	  </td>
	    <% if RdBtnIsInsurance.SelectedValue  = "Y"  Then %>

	  <td class="tdgenap" style="width: 20%">Insurance Remainder Date</td>
      <td class="tdganjil" width="30%"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield3232622" type="text" class="inptype" size="15">
        <img src="../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"> 
        </font></td>
        <% End If%>
    </tr>
    <tr> 
      <td class="tdgenap"> 
        <div align="left">Document Type</div>
      </td>
      <td class="tdganjil" colspan="3"> 
        <asp:DropDownList runat="server" ID="DDLFinanceType" >
        <asp:ListItem Text="BPKB"></asp:ListItem>
        <asp:ListItem Text="Sertifikat Rumah"></asp:ListItem>
        </asp:DropDownList>
        <font color="red">*)  (Sesuai dengan Asset Type)</font> </td>
    </tr>
    <tr>
      <td class="tdgenap" style="width: 20%">Document no</td>
      <td colspan="3" class="tdganjil" width="30%"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield3232622" type="text" class="inptype" size="15" style="width: 184px">&nbsp; 
        </font></td>

    </tr>
    <tr>
      <td class="tdgenap" style="width: 20%">Document Description</td>
      <td colspan="3" class="tdganjil" >
       <asp:TextBox ID="txtDocDescription" runat="server" CssClass="inptype" Width="100%" TextMode="MultiLine"></asp:textbox>
      </td>

    </tr>
    <tr>
	<td class="tdgenap" style="width: 20%">Receive Date</td>
      <td colspan="3" class="tdganjil" width="30%"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield3232622" type="text" class="inptype" size="15">
        <img src="../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"> 
        </font></td>

    </tr>
    <tr>
    <td class="tdgenap" style="width: 20%">Attatchment File</td>
      <td colspan="3" class="tdganjil" width="30%"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield3232622" type="text" class="inptype" size="15" style="width: 185px">
        <img src="../../Images/11.gif" width="21" height="20" align="absmiddle"> 
        </font></td>

    </tr>
    <tr>
      <td class="tdgenap" style="width: 20%">Notes</td>
      <td colspan="3" class="tdganjil" >
       <asp:TextBox ID="txtNotes" runat="server" CssClass="inptype" Width="100%" TextMode="MultiLine" Height="80px"></asp:textbox>
      </td>

    </tr>

  </table>
  <br>
	<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<a href="AdditionalCollateralReceiveDoc.aspx"><img src="../../Images/ButtonSave.gif" width="100" height="20" border="0"> 
        <img src="../../Images/ButtonCancel.gif" width="100" height="20" border="0"></a> 
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
