<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html xmlns:v="urn:schemas-microsoft-com:vml" xmlns:o="urn:schemas-microsoft-com:office:office">
<head>
<title>Untitled Document</title>
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
<form runat="server" id="FormAssetDocumentBorrowfromBankProcess">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopimerahkiri">&nbsp;</td>
      <td align="center" class="tdtopimerah">ASSET DOCUMENT BORROW</td>
      <td width="10" class="tdtopimerahkanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap">Agreement No.</td>
      <td class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../AccMaintenance/AgreementView.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td width="18%" class="tdgenap">Customer</td>
      <td width="32%" class="tdganjil"><p><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxxxxxxxxxxxxxx</a></p></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Asset Description</td>
      <td width="30%" class="tdganjil">xxxxxxxxxxxxxxxxxxxxxx</td>
      <td class="tdgenap">Supplier</td>
      <td class="tdganjil"><div align="left">xxxxxxxxxxxxxxxxxxxxx</div></td>
    </tr>
       <tr> 
      <td width="20%" class="tdgenap">Funding Co. Name</td>
      <td width="30%" class="tdganjil">xxxxxxxxxxxxxxxxxxxxxx</td>
      <td class="tdgenap">Funding Pledge Status</td>
      <td class="tdganjil"><div align="left">xxxxxxxxxxxxxxxxxxxxx</div></td>
    </tr>
   
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tdjudulmerah">
    <tr>
      <td width="100%" align="center"><div align="justify"> 
          <p class="tdjudulmerah">REGISTRATION</p>
      </div></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    
    <tr> 
      <td class="tdgenap" width="20%">Chassis No</td>
      <td class="tdganjil" width="30%">xxxxxxxxxxxx</td>
      <td class="tdgenap" width="20%"> Engine No</td>
      <td class="tdganjil" width="30%">xxxxxxxxxxxxxxxxxxxxxx</td>
    </tr>
    <tr> 
      <td class="tdgenap">License Plate</td>
      <td class="tdganjil">xxxxxxxxxxxx</td>
      <td class="tdgenap">Tax Date</td>
      <td class="tdganjil">dd/mm/yyyy</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Guarantee&nbsp;<span id="lblGuarantee">None</span></td>
      <td width="30%" class="tdganjil" colspan="3">xxxxxxxxxxxxxxxxxxxxxx</td>
    </tr>
    </table>
<table width="95%" border="0" cellpadding="3" cellspacing="1" class="tdjudulmerah">
     <tr>
      <td width="100%" align="center"><div align="justify">
          <p class="tdjudulmerah">BORROW FROM BANK</p>
        </div></td>
    </tr>
  </table>

 <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
   <tr> 
      <td width="20%" class="tdgenap">Borrow from Bank Date</td>
      <td width="30%" class="tdganjil"><input name="textfield322422" type="text" class="inptype" size="15"> 
        <img src="../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"></td>
        <td class="tdgenap" width="30%">Expected Date Return To Bank</td>
      <td class="tdganjil"><input name="textfield3224222" type="text" class="inptype" size="15"> 
        <img src="../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"></td>
  
    </tr>
    <tr> 
  <td width="20%" class="tdgenap">Borrow from Bank By</td>
      <td width="30%" class="tdganjil"><input name="textfield32243" type="text" class="inptype" size="25"></td>
      <td class="tdgenap" width="20%"></td>
      <td class="tdganjil" width="30%">&nbsp;</td>
      </tr>
    <tr> 
      <td valign="tdgenap" class="tdgenap">Borrow Notes</td>
      <td colspan="3" valign="top" class="tdganjil" >
		<textarea name="textfield322432"  rows="2" class="inptype" style="width: 571px"></textarea></td>
    </tr>


     
  </table>

  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%">&nbsp;</td>
      <td width="50%" align="right"> <p><a href="javascript:history.go(-2);"> </a><a href="javascript:history.go(-2);"> 
        </a> </p></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopimerahkiri">&nbsp;</td>
      <td align="center" class="tdtopimerah">DOCUMENT LIST</td>
      <td width="10" class="tdtopimerahkanan">&nbsp;</td>
    </tr>
  </table>
   <table class="tablegrid" style="width: 95%">
		<tr class="tdjudulhijau">
			<td style="width: 399px; height: 16px;" class="tdjudulhijau" align="center">RECEIVE IN ADVANCE </td>
		<td style="width: 248px; height: 16px;" class="tdjudulhijau"align="center">DOCUMENT NAME</td>
		<td style="width: 243px; height: 16px;" class="tdjudulhijau"align="center">DOCUMENT NO</td>
		<td style="width: 197px; height: 16px;" class="tdjudulhijau"align="center">DOCUMENT DATE </td>
		<td style="width: 245px; height: 16px;" class="tdjudulhijau"align="center">1 st RECEIVE DATE</td>
		<td style="width: 245px; height: 16px;" class="tdjudulhijau"align="center">RACK LOCATION</td>
		<td style="width: 245px; height: 16px;" class="tdjudulhijau"align="center">FILLING LOCATION</td>
		<td style="width: 245px; height: 16px;" class="tdjudulhijau"align="center">STATUS</td>
		<td style="width: 245px; height: 16px;" class="tdjudulhijau"align="center">STATUS DATE</td>
		</tr>
		<tr>
		<td style="width: 399px" class="tdganjil" align="center"> Yes </td>
		<td style="width: 243px" class="tdganjil">xxxxxxx50xxxxxxx</td>
		<td style="width: 197px" class="tdganjil">xxxx20xxxx</td>
		<td style="width: 245px" class="tdganjil">dd/mm/yyyy</td>
		<td style="width: 197px" class="tdganjil">dd/mm/yyyy</td>
		<td style="width: 245px" class="tdganjil">xxxx20xxxx</td>
		<td style="width: 197px" class="tdganjil">xxxx20xxxx</td>
		<td style="width: 245px" class="tdganjil">Pledge</td>
		<td style="width: 197px" class="tdganjil">dd/mm/yyyy</td>
		</tr>
	</table>

  

    
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" align="left">
		&nbsp;</td>
	  <td width="50%" align="right">&nbsp;
	  <asp:ImageButton id="imbSaveExit" imageurl="../Images/ButtonSave.gif" runat="server" PostBackUrl="AssetDocumentBorrowfrombank.aspx"></asp:ImageButton>
		&nbsp;<asp:ImageButton id="imbCancel" imageurl="../Images/ButtonCancel.gif" runat="server" PostBackUrl="AssetDocumentBorrrowfrombank.aspx"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <p>&nbsp;</p>
  
</div>
</form>
</body>
</html>
