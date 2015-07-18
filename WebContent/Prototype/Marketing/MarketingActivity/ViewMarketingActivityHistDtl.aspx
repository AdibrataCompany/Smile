<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Marketing Activity</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head><body><form id="frmMarketingAct" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">MARKETING ACTIVITY HISTORY - VIEW</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" style="width: 25%">Prospect Application ID</td>
      <td width="80%" class="tdganjil" colspan="3">
      xxxxxxxx20xxxxxxxx</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 25%">Customer Name</td>
      <td width="80%" class="tdganjil" colspan="3">
      <asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="../Credit/ViewCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx</asp:HyperLink>
		</td>
    </tr>
    <tr>
      <td class="tdgenap" style="width: 25%">Address</td>
      <td width="80%" class="tdganjil" colspan="3">
      xxxxxxxx50xxxxxxxx</td>		
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 25%">Kelurahan</td>
      <td width="80%" class="tdganjil" colspan="3">
      xxxxxxxx50xxxxxxxx</td>		
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 25%">Kecamatan</td>
      <td width="80%" class="tdganjil" colspan="3">
      xxxxxxxx50xxxxxxxx</td>		
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 25%">City</td>
      <td width="80%" class="tdganjil" colspan="3">
      xxxxxxxx30xxxxxxxx</td>		
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 25%">Zip Code</td>
      <td class="tdganjil" colspan="3">
      999999</td>		
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 25%">Email</td>
      <td class="tdganjil" style="width: 30%">
      xxxxxxxx30xxxxxxxx</td>		
      <td class="tdgenap" style="width: 20%">Birthday</td>
      <td width="30%" class="tdganjil">
      <asp:Label runat="server" Text="Label" id="lblBirthday0">dd-mmm</asp:Label>
		</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 25%">Phone No</td>
      <td class="tdganjil" style="width: 30%">
      xx4xx - xxxxx10xxxxxx</td>
      <td class="tdgenap" style="width: 20%">Profession</td>
      <td width="30%" class="tdganjil">
      xxxxxxxx20xxxxxxxx</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 25%">Mobile Phone No</td>
      <td class="tdganjil" style="width: 30%">
      xx4xx - xxxxx10xxxxxx</td>
      <td class="tdgenap" style="width: 20%">Religion</td>
      <td width="30%" class="tdganjil">
      xxxxx10xxxxx</td>
    </tr>
    <tr>
      <td class="tdgenap" style="width: 25%">Source of Data</td>
      <td class="tdganjil" style="width: 30%">
      xxxxx10xxxxx</td>
      <td class="tdgenap" style="width: 20%">
      Source of Application</td>
      <td class="tdganjil">
      xxxxx10xxxxx</td>
      	</tr>
	<tr>
      <td class="tdgenap" style="width: 25%">Marketing ID</td>
      <td class="tdganjil" colspan="3" style="width: 60%">
      xxxxx10xxxxx</td>
      </tr>
    <tr>
      <td class="tdgenap" style="width: 25%">Status</td>
      <td class="tdganjil" colspan="3" style="width: 60%">
      xx5xx</td>
    </tr>
    </table>
    <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdtopihijau">
      <td colspan="2">ACTIVITY</td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 25%">Product Offering</td>
      <td class="tdganjil" style="width: 60%">
      xxxxxxxx50xxxxxxxx</td>
      	</tr>
	<tr>
      <td class="tdgenap" style="width: 25%">Result Activity</td>
      <td width="80%" class="tdganjil">
      xxxxxxxx20xxxxxxxx</td>
    	</tr>
    <tr>
      <td class="tdgenap">Result Date</td>
      <td width="80%" class="tdganjil">
      dd-mm-yyyy</td>
    </tr>
	<tr>
      <td class="tdgenap">Result Time</td>
      <td width="80%" class="tdganjil">
      hh:mm</td>
    	</tr>
    <tr> 
      <td class="tdgenap" style="width: 25%">Notes</td>
      <td width="80%" class="tdganjil">
      xxxxxxxx200xxxxxxxx</td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30"><asp:ImageButton id="imbBack" imageurl="../../Images/ButtonBack.gif" runat="server" PostBackUrl="ViewMarketingActivityHist.aspx"></asp:ImageButton>
      </td>
      <td width="50%" align="right">&nbsp;</td>
    </tr>
    </table>
</div>
</form>
</body>
</html>
