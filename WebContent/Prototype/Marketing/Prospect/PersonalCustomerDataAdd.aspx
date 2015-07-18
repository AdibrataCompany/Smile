<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1"%>
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
<style type="text/css">
.style2 {
	text-align: center;
}
.style3 {
	font-family: verdana, Arial, tahoma, sans-serif;
	background-color: #FFFFFF;
}
</style>
</head>
<body>
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">NEW APPLICATION - ADD</td>
      <td width="10" class="tdtopihijaukanan"></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td colspan="2" class="tdjudulhijau">PERSONAL DATA <font face="Tahoma, Verdana" size="2"> 
        <font color="red">*)</font> 
        </font></td>
    </tr>
    <tr>
      <td class="tdgenap" style="width: 9%">Full Name</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32323445" type="text" class="inptype" value="Anisa" size="50"></font></td>

    	</tr>
    <tr>
       <td class="tdgenap" style="width: 9%">Legal Name</td>
      <td width="25%" class="tdganjil"> <font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32323447" type="text" class="inptype" value="Anisa Setiawan" size="50"></font></td>
    	</tr>
    <tr> 
      <td class="tdgenap" style="width: 9%; height: 22px;">ID Type</td>
      <td width="25%" class="tdganjil" style="height: 22px"><select name="select30">
          <option>Select One</option>
          <option selected>Kartu Tanda Penduduk</option>
          <option>Kartu Ijin Tinggal Sementara</option>
        </select></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 9%">ID Number</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32323448" type="text" class="inptype" value="23434232434" size="25"></font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 9%">Gender</td>
      <td class="tdganjil"> 
		<input type="radio" name="radiobutto4" value="V1">
        Male 
        <input type="radio" name="radiobutton4" value="V1" checked="">
        Female </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 9%">Birth Place/Date</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32323449" type="text" class="inptype" value="Jakarta" size="20"><span class="style3"> 
		/</span></font> <font face="Tahoma, Verdana" size="2"> 
        <input name="textfield-----2147483648" type="text" class="inptype" size="12" value="99/99/9999">
        <img src="../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"></font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 9%">Home Status</td>
      <td class="tdganjil"><select name="select31">
          <option>Select One</option>
          <option selected>Keluarga</option>
          <option>Kontrak</option>
        </select></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 9%">Mother Maiden Name</td>
      <td class="tdganjil"> 
		<font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32323450" type="text" class="inptype" value="Mama" size="50"></font></td>
    </tr>
    <tr> 
      <td colspan="2" class="tdjudulhijau">RESIDENCE ADDRESS <font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 9%">Address</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield3232" type="text" class="inptype" value="Muara Karang" size="15"></font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 9%">RT/RW</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield323225" type="text" class="inptype" value="007" size="5">
        </font>/ <font face="Tahoma, Verdana" size="2"> 
        <input name="textfield323226" type="text" class="inptype" value="003" size="5"></font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 9%">Kelurahan</td>
      <td class="tdganjil"><input name="textfield343" type="text" class="inptype" value="Penjaringan" size="20"></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 9%">Kecamatan</td>
      <td class="tdganjil"><input name="textfield344" type="text" class="inptype" value="Pluit" size="20"></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 9%">City</td>
      <td class="tdganjil"><input name="textfield352" type="text" class="inptype" value="Jakarta" size="20"></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 9%">Zip Code</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield3232" type="text" class="inptype" value="14450" size="15">
        <a href="javascript:;" onClick="MM_openBrWindow('../Lookup/ZipCodeLookup.htm','ZipCode','scrollbars=yes,width=900,height=500')"><img src="../../Images/IconDetail.gif" width="15" height="15" align="absmiddle" border="0"></a></font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 9%">Phone 1</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32322" type="text" class="inptype" value="021" size="5">
        - 
        <input name="textfield32323" type="text" class="inptype" value="6619999" size="10"></font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 9%">Phone 2</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield323222" type="text" class="inptype" size="5">
        - 
        <input name="textfield323232" type="text" class="inptype" size="10"></font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 9%">Fax</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield323223" type="text" class="inptype" size="5">
        - 
        <input name="textfield323233" type="text" class="inptype" size="10"></font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Coverage Area (KM)</td>
      <td class="tdganjil" ><font face="Tahoma, Verdana" size="2"> 
       <select name="select32">
          <option>Select One</option>
          <option >0</option>
          <option>100</option>
              </select> </font></td>
    </tr>

    <tr>
      <td colspan="2" class="tdjudulhijau">JOB DATA</td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 9%; height: 26px;">Profession</td>
      <td class="tdganjil" style="height: 26px"> <select name="select32">
          <option>Select One</option>
          <option >Artist</option>
          <option>Employee</option>
          <option selected>Guru</option>
          <option>UKM</option>
          <option>Nelayan</option>
          <option>Wartawan</option>
          <option></option>
        </select> <font color="red">*)</font></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 9%">Employment since year</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32323451" type="text" class="inptype" value="2001" size="15">
        </font><font color="red">*)</font></td>
    </tr>
	<tr>
      <td colspan="2" class="tdjudulhijau">APPLICATION DATA</td>
    </tr>
	<tr>
      <td class="tdgenap">Product Offering</td>
      <td class="tdganjil">
		<input name="textfield32323454" type="text" class="inptype" size="25">
        <a href="javascript:;" onClick="MM_openBrWindow('../Lookup/ProductLookup.htm','Product','scrollbars=yes,width=900,height=500,left=0,top=0')"><img src="../../Images/IconDetail.gif" width="15" height="15" border="0"></a> 
        <font color="red">*)</font></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 9%">OTR Price</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32323455" type="text" class="inptype" size="15" value=""> </font></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 9%">Down Payment (%)</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32323456" type="text" class="inptype" size="15" value=""> </font></td>
    </tr>
    <tr>
      <td class="tdgenap" style="width: 9%">Capitalized Insurance Amount</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32323456" type="text" class="inptype" size="15" value=""> </font></td>
    </tr>

	<tr>
      <td class="tdgenap">Tenor</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32323457" type="text" class="inptype" size="15" value=""></font></td>
    </tr>
	<tr>
      <td class="tdgenap">Flat Rate</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32323458" type="text" class="inptype" size="3" value="" style="width: 55px"> 
		%</font></td>
    	</tr>
    	<tr>
      <td class="tdgenap">Effective Rate</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32323458" type="text" class="inptype" size="3" value="" style="width: 55px"> 
		%</font></td>
    	</tr>

	<tr>
      <td class="tdgenap">First Installment</td>
      <td class="tdganjil"> <select name="select32">
          <option>Select One</option>
          <option >Advance</option>
          <option>Arrear</option>
        </select> <font color="red">*)</font></td>
    </tr>
    <tr>
      <td class="tdgenap">Insurance Type</td>
      <td class="tdganjil"> <select name="select32">
          <option>Select One</option>
          <option >All Risk</option>
          <option>Total Loss</option>
          <option>Combination</option>
        </select> <font color="red">*)</font></td>
    </tr>

	<tr>
      <td class="tdgenap">Installment Amount</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32323460" type="text" class="inptype" size="15" value=""></font></td>
    </tr>
    <tr>
      <td class="tdgenap">Referantor</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32323460" type="text" class="inptype" size="15" value=""></font><img src="../../Images/IconDetail.gif" width="15" height="15" border="0"></td>
    </tr>
 	<tr> 
      <td class="tdgenap">Notes</td>
      <td class="tdganjil">
      <input name="textfield32323460" type="text" class="inptype" size="15" value="" style="width: 227px; height: 82px">
         
	  </td>
    </tr>

	
    </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET DATA</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr class="tdjudulhijau"> 
      <td style="width: 3%" class="style2">NO</td>
      <td style="width: 15%" class="style2">ASSET DESCRIPTION</td>
      <td style="width: 15%" class="style2">YEAR</td>
      <td style="width: 234px" class="style2">OTR</td>
      <td style="width: 48%" class="style2">PRICE LIST</td>
      <td style="width: 24%" class="style2">DIFFERENCE</td>
      <td width="5%" class="style2">DELETE</td>
    </tr>
    <tr class="tdganjil"> 
      <td style="width: 3%" class="style2">99</td>
      <td style="width: 15%" class="style2"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32323460" type="text" class="inptype" size="15" value=""></font><img src="../../Images/IconDetail.gif" width="15" height="15" border="0"><font face="Tahoma, Verdana" size="2"> 
        
        </font></td>
      <td style="width: 15%" class="style2"> <font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32323460" type="text" class="inptype" size="15" value=""></font></td>
      <td style="width: 234px" class="style2"> <font face="Tahoma, Verdana" size="2"> 
        <input name="textfield-2147483646" type="text" class="inptype" size="15" style="width: 166px; height: 17px"></font></td>
      <td style="width: 48%" class="style2"> <font face="Tahoma, Verdana" size="2"> 
        <input name="textfield----2147483647" type="text" class="inptype" size="15" style="width: 135px; height: 17px"></font></td>
      <td style="width: 24%" class="style2"> <font face="Tahoma, Verdana" size="2"> 
        <input name="textfield----2147483647" type="text" class="inptype" size="15" style="width: 135px; height: 17px"></font></td>
      <td class="style2"><img src="../../Images/IconDelete.gif" width="16" height="16" align="absmiddle"></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td height="30" align="left"><img src="../../Images/ButtonAdd.gif" width="100" height="20"></td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td align="left">&nbsp;</td>
     <td align="right"> <a href="ProspectsCustomerAdd_Checking.aspx"><img src="../../Images/ButtonNext.gif" width="100" height="20" border="0"></a>&nbsp; 
    <a href="ProspectsCustomer.aspx"><img src="../../Images/ButtonCancel.gif" width="100" height="20" border="0">&nbsp; 
      </a></td>

    </tr>
  </table>

   </div>
  </body>
</html>
