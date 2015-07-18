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
<form id="frmMarketingEmployeeExternalAdd" runat="server">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field<br>
		</i>lookup supervisor ke table marketing yang External saja dan aktif<br>
		Function di filter berdasarkan external</font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">MARKETING EMPLOYEE EXTERNAL - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
     
    <tr> 
      <td width="20%" class="tdgenap">Branch</td>
      <td width="80%" class="tdganjil">
	      <asp:Label runat="server" ID="LblBranch" Text="xxxxxxxx50xxxxxxxx"></asp:Label>
      </td>
   </tr>

  
   <tr>
      <td width="20%" class="tdgenap">Name</td>
      <td width="80%" class="tdganjil" > 
        <asp:Label runat="server" ID="LblName" Text="xxxxxxxx50xxxxxxxx"></asp:Label>
	  </td>
    </tr>
    
   

     <tr> 
      <td class="tdgenap" width="20%">ID Type</td>
      <td class="tdganjil" width="80%">
          <asp:Label runat="server" ID="LblId" Text="xxxxxxxx50xxxxxxxx"></asp:Label>
          &nbsp;</td>          
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">ID Number</td>
      <td class="tdganjil" width="80%">
         <asp:Label runat="server" ID="LblIdNumber" Text="xxxxxxxx50xxxxxxxx"></asp:Label>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">ID Expired Date</td>
      <td class="tdganjil" width="80%"> 
		<asp:Label runat="server" ID="LblidExpiredDate" Text="dd-mm-yyyy"></asp:Label>
    </tr>
     <tr> 
      <td class="tdgenap" width="20%">Birth Place / Date</td>
      <td class="tdganjil" width="80%">
      	  <asp:Label runat="server" ID="LblBirthPlace" Text="xxxxxxxx50xxxxxxxx"></asp:Label> / 
         <asp:Label runat="server" ID="LblBirthDate" Text="dd-mm-yyyy"></asp:Label>
    </tr>
     <tr> 
      <td class="tdgenap" width="20%">Marital Status</td>
      <td class="tdganjil" width="80%"> 
      	<asp:Label runat="server" ID="LblMartialStatus" Text="xxxxxxxx50xxxxxxxx"></asp:Label>
    </tr>
     <tr> 
      <td class="tdgenap" width="20%">Spouse Name</td>
      <td class="tdganjil" width="80%">
      		<asp:Label runat="server" ID="LblSpouseName" Text="xxxxxxxx50xxxxxxxx"></asp:Label>

	 </td>
	<tr> 
      <td class="tdgenap" width="20%">Group</td>
      <td class="tdganjil" width="80%">
        <asp:Label runat="server" ID="LblGroup" Text="xxxxxxxx50xxxxxxxx"></asp:Label>

    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Level</td>
      <td class="tdganjil" width="80%">
     	<asp:Label runat="server" ID="LblLevel" Text="xxxxxxxx50xxxxxxxx"></asp:Label>
     	</td>
    </tr>
       <tr> 
      <td class="tdgenap" width="20%">Last Change Level Date</td>
      <td class="tdganjil" width="80%">
	     <asp:Label runat="server" ID="LblLastChangeLevelDate" Text="dd-mm-yyyy"></asp:Label>
		</td>
    </tr>
    <tr>
       <td width="20%" class="tdgenap">Function</td>
        <td width="80%" class="tdganjil">
        <asp:Label runat="server" ID="LblFunction" Text="xxxxxxxx50xxxxxxxx"></asp:Label>
       </td>
     </tr>

 <tr> 
      <td class="tdgenap" width="20%">Up Line</td>
      <td class="tdganjil" width="80%">
        <asp:Label runat="server" ID="LblUplineid" Text="xxxxxxxx20xxxxxxxx"></asp:Label>

		&nbsp;- Up Line Name </td>
    </tr>
  <tr> 
      <td class="tdgenap" width="20%">Supervisor</td>
      <td class="tdganjil" width="80%">
	    <asp:Label runat="server" ID="LblSupervisor" Text="xxxxxxxx20xxxxxxxx"></asp:Label>
		&nbsp; - SuperVisor Name</td>
     </tr>

    
    
    <tr> 
      <td colspan="2" class="tdjudulhijau">ADDRESS <font color="red">*)</font> 
      </td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap" width="20%">Address</td>
      <td class="tdganjil" width="80%"> 
      		<asp:Label runat="server" ID="LblAddressr" Text="xxxxxxxx100xxxxxxxx"></asp:Label>

    </tr>
    <tr> 
      <td class="tdgenap" width="20%">RT/RW</td>
      <td class="tdganjil" width="80%">
       <asp:Label runat="server" ID="LblRt" Text="999"></asp:Label>
       
      	/ 
      <asp:Label runat="server" ID="LblRwr" Text="999"></asp:Label>
        </td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Kelurahan</td>
      <td class="tdganjil" width="80%">
      	<asp:Label runat="server" ID="LblKelurahan" Text="xxxxxxxx50xxxxxxxx"></asp:Label>

    	</td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Kecamatan</td>
      <td class="tdganjil" width="80%">
		<asp:Label runat="server" ID="LblKecamatan" Text="xxxxxxxx50xxxxxxxx"></asp:Label>

	  </td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">City</td>
      <td class="tdganjil" width="80%">
         <asp:Label runat="server" ID="LblCity" Text="xxxxxxxx50xxxxxxxx"></asp:Label>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Zip Code</td>
      <td class="tdganjil" width="80%">
     	<asp:Label runat="server" ID="LblZipCode" Text="xx5xx"></asp:Label>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Phone 1</td>
      <td class="tdganjil" width="80%">
      <asp:Label runat="server" ID="LblPhone1a" Text="9999"></asp:Label>

       &nbsp; -
		 <asp:Label runat="server" ID="LblPhone1b" Text="9999999999"></asp:Label>

        </td>
    </tr>
   <tr> 
      <td class="tdgenap" width="20%">Phone 2</td>
      <td class="tdganjil" width="80%">
      <asp:Label runat="server" ID="LblPhone2a" Text="9999"></asp:Label>

       &nbsp; -
		 <asp:Label runat="server" ID="LblPhone2b" Text="9999999999"></asp:Label>

        </td>
    </tr>
  <tr> 
      <td class="tdgenap" width="20%">Fax</td>
      <td class="tdganjil" width="80%">
    <asp:Label runat="server" ID="LblFax1a" Text="9999"></asp:Label>

       &nbsp; -
		 <asp:Label runat="server" ID="LblFax1b" Text="9999999999"></asp:Label>

        </td>
    </tr>
         
          <tr> 
          <td class="tdgenap" width="20%">Email</td>
          <td class="tdganjil" width="80%">
		<asp:Label runat="server" ID="LblEmail" Text="xxxxxxxx30xxxxxxxx"></asp:Label>
			</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">Mobile Phone</td>
          <td class="tdganjil" width="80%">
			<asp:Label runat="server" ID="LblMobilePhone" Text="xxxxxxxx20xxxxxxxx"></asp:Label>
			</td>
        </tr>
    <tr> 
      <td colspan="2" class="tdjudulhijau"> 
      </td>
    </tr>
  
   
    <tr> 
      <td class="tdgenap" width="20%">Join Date</td>
      <td class="tdganjil" width="80%">
        <asp:Label runat="server" ID="LblJoinDate" Text="dd-mm-yyyy"></asp:Label> </td>
    </tr>
    
    <tr> 
      <td class="tdgenap" width="20%">Termination Date</td>
      <td class="tdganjil" width="80%">
        <asp:Label runat="server" ID="LblTerminationDate" Text="dd-mm-yyyy"></asp:Label></td>
    </tr>

      <tr>
      <td class="tdgenap" width="20%">Is Active</td>
      <td colspan="3" class="tdganjil" width="80%">
		 <asp:Label runat="server" ID="LblIsActive" Text="xxx"></asp:Label>    </tr>
    
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau"> FAMILY DATA</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr class="tdjudulhijau"> 
      <td width="5%" align="center">No</td>
      <td width="30%" align="center">NAME</td>
      <td width="20%" align="center">ID NUMBER</td>
      <td width="20%" align="center">BIRTH DATE</td>
      <td width="20%" align="center">RELATIONSHIP</td>
      
    </tr>
    <tr class="tdganjil"> 
      <td align="center">99</td>
      <td> <asp:Label runat="server" ID="LblFamName" Text="xxxxxxxx50xxxxxxxx"></asp:Label></td>
      <td> <asp:Label runat="server" ID="LblFamIdNumber" Text="xxxxxxxx50xxxxxxxx"></asp:Label></td>
      <td align="center"> <asp:Label runat="server" ID="LblFamBirthDate" Text="dd-mm-yyyy"></asp:Label></td>
      <td ><asp:Label runat="server" ID="LblFamRelationShip" Text="xxxxxxxx50xxxxxxxx"></asp:Label></td>
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
