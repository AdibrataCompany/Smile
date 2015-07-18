<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
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
<form id="form1" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiorangekiri">&nbsp;</td>
      <td align="center" class="tdtopiorange">SUB BRANCH - VIEW</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
       <tr> 
          <td width="150" class="tdgenap">Branch</td>
          <td class="tdganjil"><asp:Hyperlink ID="lblBranchName" runat="server" Text="Jakarta" NavigateUrl="SubBranchView.htm" Target="_self"></asp:Hyperlink>
			</td>
        </tr>
        <tr> 
          <td class="tdgenap">Sub Branch Name</td>
          <td class="tdganjil"><asp:Label runat="server" ID="lblSubbranchName"  Text="Sunter"></asp:Label>
			</td>
        </tr>
        <tr> 
          <td colspan="2" class="tdjudulorange">ADDRESS</td>
        </tr>
        <tr> 
          <td class="tdgenap">Address</td>
          <td class="tdganjil">
			<asp:Label runat="server" ID="lblSubbranchAddress"  Text="Jln. Sunter Raya"></asp:Label>
			</td>
        </tr>
        <tr> 
          <td class="tdgenap">RT/RW</td>
          <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
            <asp:Label runat="server" ID="lblSubbranchRT"  Text="001"></asp:Label>
            &nbsp;</font>/ <font face="Tahoma, Verdana" size="2"> 
            <asp:Label runat="server" ID="lblSubbranchRW"  Text="002"></asp:Label>
            &nbsp;</font></td>
        </tr>
        <tr> 
          <td class="tdgenap">Kelurahan</td>
          <td class="tdganjil">
			<asp:Label runat="server" ID="lblSubbranchKelurahan"  Text="Sunter"></asp:Label>
            &nbsp;</td>
        </tr>
        <tr> 
          <td class="tdgenap">Kecamatan</td>
          <td class="tdganjil">
			<asp:Label runat="server" ID="lblSubbranchKecamatan"  Text="Sunter"></asp:Label>
			</td>
        </tr>
        <tr> 
          <td class="tdgenap">City</td>
          <td class="tdganjil">
			<asp:Label runat="server" ID="lblSubbranchCity"  Text="Sunter"></asp:Label>
			</td>
        </tr>
        <tr> 
          <td class="tdgenap">Zip Code</td>
          <td class="tdganjil">
			<asp:Label runat="server" ID="lblSubbranchZipCode"  Text="11560"></asp:Label>
            &nbsp;</td>
        </tr>
        <tr> 
          <td class="tdgenap">Phone 1</td>
          <td class="tdganjil">
			<asp:Label runat="server" ID="lblSubbranchAreaPhone1"  Text="021"></asp:Label>
            &nbsp;- 
            <asp:Label runat="server" ID="lblSubbranchPhone1"  Text="5332112"></asp:Label>
            &nbsp;</td>
        </tr>
        <tr> 
          <td class="tdgenap">Phone 2</td>
          <td class="tdganjil">
			<asp:Label runat="server" ID="lblSubbranchAreaPhone2"  Text="0"></asp:Label>
            &nbsp;- 
            <asp:Label runat="server" ID="lblSubbranchPhone2"  Text="0"></asp:Label>
            </td>
        </tr>
        <tr> 
          <td class="tdgenap">Fax</td>
          <td class="tdganjil">
			<asp:Label runat="server" ID="lblSubbranchAreaFax1"  Text="0"></asp:Label>
            &nbsp;- 
            <asp:Label runat="server" ID="lblSubbranchFax1"  Text="0"></asp:Label>
            </td>
        </tr>
        <tr> 
          <td colspan="2" class="tdjudulorange">CONTACT PERSON</td>
        </tr>
        <tr> 
          <td class="tdgenap">Name</td>
          <td class="tdganjil">
			<asp:Label runat="server" ID="lblSubbranchContactPersonName"  Text="Allen Hutama"></asp:Label>
			</td>
        </tr>
        <tr> 
          <td class="tdgenap">Job Title</td>
          <td class="tdganjil">
			<asp:Label runat="server" ID="lblSubbranchContactPersonJobTitle"  Text="-"></asp:Label>
            </td>
        </tr>
        <tr> 
          <td class="tdgenap">Email</td>
          <td class="tdganjil">
			<asp:Label runat="server" ID="lblSubbranchContactPersonEmail"  Text="-"></asp:Label>
            </td>
        </tr>
        <tr> 
          <td class="tdgenap">Mobile Phone</td>
          <td class="tdganjil">
			<asp:Label runat="server" ID="lblSubbranchContactPersonMobilePhone"  Text="-"></asp:Label>
            </td>
        </tr>
       
      </table>
    </div>
    
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
       <a href="javascript:window.close();"> <img src="../Images/ButtonClose.gif" width="100" height="20" border="0"></a></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
