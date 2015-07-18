<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
</head>
<body>
<form runat="server" id="FrmBucket">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">BUCKET</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap">Search By</td>
      <td width="80%" class="tdganjil" colspan=3> 
        <select name="select14">
          <option selected>Bucket ID</option>
          <option>Bucket Name</option>
        </select>
        <input type="text" name="textfield">
      </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td> 
        <div align="right"> <img src="../../Images/ButtonSearch.gif" width="100" height="20"><img src="../../Images/ButtonReset.gif" width="100" height="20"></div>
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">BUCKET LISTING</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr align="center" class="tdjudulungu"> 
      <td>BUCKET ID</td>
      <td>BUCKET NAME</td>
      <td>DAYS OVERDUE</td>
      <td>CURRENCY</td>
      <td> AMOUNT OVERDUE</td>
      <td>OUTSTANDING BALANCE</td>
      <td width="5%">EDIT</td>
      <td width="5%">DELETE</td>
    </tr>
    <tr class="tdganjil"> 
      <td><a href="../BucketView.htm">BUCKET1</a></td>
      <td>Bucket 1</td>
      <td>1 - 5</td>
      <td><div align="center">IDR</div></td>
      <td>0 - 1,000,000.00</td>
      <td>0 - 99,999,999.00</td>
      <td align="center"><a href="BucketEdit.Aspx"><img src="../../Images/IconEdit.gif" width="16" height="13" border="0"></a></td>
      <td align="center"><img src="../../Images/IconDelete.gif" width="16" height="16"></td>
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
      <td width="50%" height="30"><img src="../../Images/ButtonPrint.gif" width="100" height="20" border="0"></td>
      <td width="50%" align="right"><a href="BucketAdd.aspx"><img src="../../Images/ButtonAdd.gif" width="100" height="20" border="0"></a> 
      </td>
    </tr>
  </table>
  
</div>
</form>
</body>
</html>
