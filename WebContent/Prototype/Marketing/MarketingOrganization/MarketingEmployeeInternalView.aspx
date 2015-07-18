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
<style type="text/css">
.style1 {
	background-color: #F4F4DF;
	font-weight: bold;
	font-size: 10px;
	text-align: center;
}
</style>
</head>
<body>
<form id="frmMarketingEmployeeInternalAdd" runat="server">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field<br>
		</i>lookup supervisor ke table marketing yang internal saja dan aktif<br>
		Function di filter berdasarkan internal </font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">MARKETING EMPLOYEE INTERNAL - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
      <tr> 
         <td width="20%" class="tdgenap" >Branch</td>
      	 <td width="80%" class="tdganjil" >
	    	<asp:Label runat="server" ID="LblBranch" Text="xxxxxxxx50xxxxxxxx"></asp:Label>
         </td>
   </tr>

   <tr> 
      <td class="tdgenap" width="20%">Employee Id</td>
      <td class="tdganjil" width="80%">
      	<asp:Label runat="server" ID="LblEmployeeId" Text="xxxxxxxx50xxxxxxxx"></asp:Label>

  		</td>
     </tr>
     <tr> 
 	     <td class="tdgenap" width="20%">Name</td>
 	     <td class="tdganjil" width="80%">
  		 <asp:Label runat="server" ID="LblName" Text="xxxxxxxx50xxxxxxxx"></asp:Label>

  		  </td>
     </tr>
    <tr> 
      <td class="tdgenap" width="20%">ID Type</td>
      <td class="tdganjil" width="80%">
	     <asp:Label runat="server" ID="LblIdType" Text="xxxxxxxx50xxxxxxxx"></asp:Label>
	  </td>          
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">ID Number</td>
      <td class="tdganjil" width="80%">
       <asp:Label runat="server" ID="LblIDNumber" Text="xxxxxxxx50xxxxxxxx"></asp:Label>
    </tr>
     <tr> 
      <td class="tdgenap" width="20%">ID Expired Date</td>
      <td class="tdganjil" width="80%"> 
		<asp:Label runat="server" ID="LblidExpiredDate" Text="dd-mm-yyyy"></asp:Label>
	</td>
    </tr>

    <tr> 
      <td class="tdgenap" width="20%">NIK</td>
      <td class="tdganjil" width="80%">
		<asp:Label runat="server" ID="LblNIK" Text="xxxxxxxx50xxxxxxxx"></asp:Label>
	</td>
    </tr>
    
    <tr>
      <td class="tdgenap" width="20%">Position</td>
      <td class="tdganjil" width="80%">
      	 <asp:Label runat="server" ID="LblPosition" Text="xxxxxxxx50xxxxxxxx"></asp:Label>
     </tr>
    
     <tr>
       <td width="20%" class="tdgenap">Function</td>
        <td width="80%" class="tdganjil">
         <asp:Label runat="server" ID="LblFunction" Text="xxxxxxxx50xxxxxxxx"></asp:Label>
       </td>
     </tr>
     <tr>
      <td class="tdgenap" width="20%">Grade</td>
      <td class="tdganjil" width="80%">
	      <asp:Label runat="server" ID="LblGrade" Text="xxxxxxxx50xxxxxxxx"></asp:Label>
     </tr>
      <tr> 
      <td class="tdgenap" width="20%">Supervisor</td>
      <td class="tdganjil" width="80%">
	      <asp:Label runat="server" ID="LblSupervisor" Text="xxxxxxxx20xxxxxxxx"></asp:Label>
&nbsp; - Nama Supervisor</td>
     </tr>
    <tr> 
        <td colspan="2" class="tdjudulhijau">ADDRESS <font color="red">*)</font> 
        </td>
    </tr>
    <tr> 
          <td class="tdgenap" width="20%">Address</td>
          <td class="tdganjil" width="80%">xxxxxxxx100xxxxxxxx</td>
    </tr>
        <tr> 
          <td class="tdgenap" width="20%">RT / RW</td>
          <td class="tdganjil" width="80%">999 / 999</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">Kelurahan</td>
          <td class="tdganjil" width="80%">xxxxxxxx30xxxxxxxx</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">Kecamatan</td>
          <td class="tdganjil" width="80%">xxxxxxxx30xxxxxxxx</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">City</td>
          <td class="tdganjil" width="80%">xxxxxxxx30xxxxxxxx</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">Zip Code</td>
          <td class="tdganjil" width="80%">99999</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">Phone 1</td>
          <td class="tdganjil" width="80%">999 - 99999999</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">Phone 2</td>
          <td class="tdganjil" width="80%">999 - 99999999</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">Fax</td>
          <td class="tdganjil" width="80%">999 - 99999999</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">Email</td>
          <td class="tdganjil" width="80%">xxxxxxxx100xxxxxxxx</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">Mobile Phone</td>
          <td class="tdganjil" width="80%">9999 - 99999999</td>
        </tr>

		<td colspan="2" class="style1">  </td>
   
    <tr>
      <td class="tdgenap" width="20%">Is Active</td>
      <td class="tdganjil" width="80%">
       <asp:Label runat="server" ID="Lblisactive" Text="xxx"></asp:Label>
        </td>
    </tr>
 
  
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" align="left">
		&nbsp;</td>
	  <td width="50%" align="right">&nbsp;
	  <asp:ImageButton id="imbSaveExit" imageurl="../../Images/ButtonExit.gif" runat="server" PostBackUrl="Marketing.aspx"></asp:ImageButton>
		
      </td>
    </tr>
  </table>
  
</div>
</form>
</body>
</html>
