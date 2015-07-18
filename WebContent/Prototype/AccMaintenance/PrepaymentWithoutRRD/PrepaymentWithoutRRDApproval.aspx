<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<HTML>
	<HEAD>
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
		<style type="text/css">
.style1 {
	background-color: #FFFFFF;
	font-family: Verdana, Arial, Tahoma, sans-serif, Calibri;
}
</style>
</HEAD>
	<body>
		
<div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">A P P R O V A L</td>
      <td width="10" class="tdtopibirukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
				<tr>
					<td width="20%" class="tdgenap">Search By</td>
					<td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2">
							<select name="select2">
          <option selected>Select One</option>
          <option>Approval ID</option>
          <option>Application ID</option>
          <option>Agreement No</option>
          <option>Customer</option>
        </select>
							<SPAN style="FONT-SIZE: 10pt; FONT-FAMILY: 'Times New Roman'; mso-fareast-font-family: 'Times New Roman'; mso-ansi-language: EN-US; mso-fareast-language: EN-US; mso-bidi-language: AR-SA">
								<INPUT id="Text1" type="text" name="Text1"></SPAN>
						</font>
					</td>
				</tr>
				<tr>
					<td width="20%" class="tdgenap">Approval Type</td>
					
      <td width="20%" class="style1">Prepayment Without RRD</td>
					<td width="20%" class="tdgenap">Approval Status</td>
					<td width="20%" class="tdganjil"><font face="Tahoma, Verdana" size="2">
							<select name="select5">
								<option selected>Open</option>
								<option>Final</option>
							</select>
						</font>
					</td>
				</tr>
				<tr>
					<td class="tdgenap">Request From</td>
					<td class="tdganjil"><font face="Tahoma, Verdana" size="2">
							<select name="select4">
								<option selected>All</option>
							</select>
						</font>
					</td>
					<td class="tdgenap">Approval Result</td>
					<td class="tdganjil"><font face="Tahoma, Verdana" size="2">
							<select name="select7">
								<option selected>All</option>
								<option>Request</option>
								<option>Approved</option>
								<option>Decline</option>
							</select>
						</font>
					</td>
				</tr>
				<tr>
					<td valign="top" class="tdgenap">To be Approved By</td>
					<td class="tdganjil"><font face="Tahoma, Verdana" size="2">
							<select name="select6">
								<option selected>All</option>
							</select>
						</font>
					</td>
					
      <td colspan="2" align="right" class="tdganjil"><img src="../../Images/ButtonSearch.gif" width="100" height="20"> 
        <img src="../../Images/ButtonReset.gif" width="100" height="20"> </td>
				</tr>
			</table>
			<br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
      <td align="center" class="tdtopibiru">APPROVAL LISTING</td>
      <td width="10" class="tdtopibirukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr align="center" class="tdjudulbiru"> 
      <td width="5%"><u>APPR ID</u></td>
      <td width="10%"><u>APPLICATION ID</u></td>
      <td width="10%"><u>AGREEMENT NO</u></td>
      <td width="10%"><u>CUSTOMER</u></td>
      <td width="5%"><u>STATUS</u></td>
      <td width="10%"><u>RESULT</u></td>
      <td width="10%"><u>FROM/TO</u></td>
      <td width="10%"><u>REG. DATE</u></td>
      <td width="5%"><u>DURATION (a/b/c)</u></td>
      <td width="10%">ACTION</td>
      <td width="10%">RE REQUEST</td>
    </tr>
    <tr> 
      <td align="middle" class="tdganjil">xxxx</td>
      <td class="tdganjil"><div align="center"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewApplication.htm','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></div></td>
      <td class="tdganjil"><div align="center"><a href="javascript:;" onClick="MM_openBrWindow('../AccMaintenance/AgreementView.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></div></td>
      <td class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx50xxxxxx</a></td>
      <td align="middle" class="tdganjil">New </td>
      <td align="middle" class="tdganjil"><font face="Tahoma, Verdana" size="2">Reguest 
        </font> </td>
      <td align="middle" class="tdganjil">User 1/JT</td>
      <td class="tdganjil">dd/mm/yyyy</td>
      <td class="tdganjil"><div align="center">8/2/8</div></td>
      <td align="center" class="tdganjil"><a href="../AgreementWaiveTransactionApprovalDetail.htm">Approval</a></td>
      <td class="tdganjil">ReRequest</td>
    </tr>
    <tr> 
      <td align="middle" class="tdgenap">xxxx</td>
      <td class="tdgenap"><div align="center"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewApplication.htm','Application','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></div></td>
      <td class="tdgenap"><div align="center"><a href="javascript:;" onClick="MM_openBrWindow('../AccMaintenance/AgreementView.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></div></td>
      <td class="tdgenap"><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx50xxxxxx</a></td>
      <td align="middle" class="tdgenap">New </td>
      <td align="middle" class="tdgenap"><font face="Tahoma, Verdana" size="2">Reguest 
        </font> </td>
      <td align="middle" class="tdgenap">User 1/JT</td>
      <td class="tdgenap">dd/mm/yyyy</td>
      <td class="tdgenap"><div align="center">8/2/8</div></td>
      <td align="center" class="tdgenap"><a href="../AgreementWaiveTransactionApprovalDetail.htm">Approval</a></td>
      <td class="tdgenap">ReRequest</td>
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
  <br>
			<table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
				<tr align="middle" class="tdjudulbiru">
					<td width="5%" align="middle">DURATION LEGEND (a/b/c)</td>
				</tr>
				<tr>
					<td class="tdganjil">a: Number of days from the first person to the next person
					</td>
				</tr>
				<tr>
					<td class="tdganjil">b: Maximum days for the first person to approve</td>
				</tr>
				<tr>
					<td class="tdganjil">c: Number of days since request date until now</td>
				</tr>
			</table>
			<br>
		</div>
	</body>
</HTML>
