<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Tele Sales Activity</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head><body><form id="frmTelesalesAct" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">MARKETING ACTIVITY</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" style="width: 25%">Prospect Application ID</td>
      <td class="tdganjil" colspan="3">
      xxxxxxxx20xxxxxxxx</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 25%">Customer Name</td>
      <td class="tdganjil" colspan="3">
      <asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="../Credit/ViewCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx</asp:HyperLink>
		</td>
    </tr>
    <tr>
      <td class="tdgenap" style="width: 25%">Address</td>
      <td class="tdganjil" colspan="3">
      xxxxxxxx50xxxxxxxx</td>		
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 25%">Kelurahan</td>
      <td class="tdganjil" colspan="3">
      xxxxxxxx50xxxxxxxx</td>		
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 25%">Kecamatan</td>
      <td class="tdganjil" colspan="3">
      xxxxxxxx50xxxxxxxx</td>		
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 25%">City</td>
      <td class="tdganjil" colspan="3">
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
      <td class="tdganjil" style="width: 25%">
      dd-mmm</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 25%">Phone No</td>
      <td class="tdganjil" style="width: 30%">
      xx4xx - xxxxx10xxxxxx</td>
      <td class="tdgenap" style="width: 20%">Profession</td>
      <td class="tdganjil" style="width: 25%">
      xxxxxxxx20xxxxxxxx</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 25%">Mobile Phone No</td>
      <td class="tdganjil" style="width: 30%">
      xx4xx - xxxxx10xxxxxx</td>
      <td class="tdgenap" style="width: 20%">Religion</td>
      <td class="tdganjil" style="width: 25%">
      xxxxx10xxxxx</td>
    </tr>
    <tr>
      <td width="20%" class="tdgenap">Source of Data</td>
      <td class="tdganjil" style="width: 30%">
      xxxxx10xxxxx</td>
      <td class="tdgenap" style="width: 20%">
      Source of Application</td>
      <td class="tdganjil" style="width: 25%">
      xxxxx10xxxxx</td>
      	</tr>
	<tr>
      <td class="tdgenap" style="width: 25%">Marketing ID</td>
      <td class="tdganjil" colspan="3">
      xxxxx10xxxxx</td>
      </tr>
    <tr> 
      <td class="tdgenap" style="width: 25%">Status</td>
      <td class="tdganjil" colspan="3">
      xx5xx</td>
    </tr>
    </table>
    <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdtopihijau"> 
      <td colspan="2">LAST ACTIVITY</td>
    </tr>
    <tr>
      <td width="20%" class="tdgenap" style="height: 17px">Last Activity</td>
      <td width="80%" class="tdganjil" style="height: 17px">xxxxxxxx20xxxxxxxx</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Last Activity Date</td>
      <td width="80%" class="tdganjil">
      <asp:Label runat="server" Text="Label" id="lblLastActDate">dd-mm-yyyy</asp:Label>
		, hh:mm</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Last Activity Notes</td>
      <td width="80%" class="tdganjil">xxxxxxxx50xxxxxxxx</td>
    </tr>
    <tr class="tdtopihijau">
      <td colspan="2">ACTIVITY</td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 25%">Product Offering</td>
      <td class="tdganjil" style="width: 60%">
      <asp:TextBox runat="server" id="txtProductOfferingID" CssClass="inptype" Enabled="False" Width="338px">
		</asp:TextBox>
        <font color="red">&nbsp;<img src="../../Images/icondetail.gif" align="top"></font></td>
      	</tr>
	<tr>
      <td width="20%" class="tdgenap">Result Activity</td>
      <td width="80%" class="tdganjil">
      <asp:DropDownList runat="server" id="ddlResultActivity">
		<asp:ListItem>Select One</asp:ListItem>
		<asp:ListItem>Call</asp:ListItem>
		<asp:ListItem>Visit</asp:ListItem>
		</asp:DropDownList>
        <font color="red">&nbsp;*)</font></td>
    	</tr>
    <tr>
      <td width="20%" class="tdgenap" style="height: 26px">Result Da<span class="tdgenap">te</span></td>
      <td width="80%" class="tdganjil" style="height: 26px">
      <asp:TextBox runat="server" id="txtResultDate" Width="94px" CssClass="inptype"></asp:TextBox>
        <font color="red">&nbsp;<img src="../../Images/iconcalendar.gif" width="20" height="20" align="top"> 
		*)</font></td>
    </tr>
	<tr>
      <td width="20%" class="tdgenap" style="height: 26px">Result Time </td>
      <td width="80%" class="tdganjil" style="height: 26px">
      <asp:TextBox runat="server" id="txtResultTimeHH" Width="40px" CssClass="inptype"></asp:TextBox>
        &nbsp;:
      <asp:TextBox runat="server" id="txtResultTimeMM" Width="40px" CssClass="inptype"></asp:TextBox>
        <font color="red">&nbsp;*)</font></td>
    	</tr>
    <tr> 
      <td width="20%" class="tdgenap">Notes</td>
      <td width="80%" class="tdganjil">
      <asp:TextBox runat="server" id="txaNotes" Width="350px" TextMode="MultiLine" Height="50px">
		</asp:TextBox>
		</td>
    </tr>
    <tr class="tdtopihijau">
      <td colspan="2">NEXT ACTIVITY PLAN</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Plan Activity</td>
      <td width="80%" class="tdganjil">
      <asp:DropDownList runat="server" id="ddlPlanActivity">
		<asp:ListItem>Select One</asp:ListItem>
		<asp:ListItem>Call</asp:ListItem>
		<asp:ListItem>Visit</asp:ListItem>
		</asp:DropDownList>
        <font color="red">&nbsp;</font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Plan Date</td>
      <td width="80%" class="tdganjil">
      <asp:TextBox runat="server" id="txtPlanDate" Width="94px" CssClass="inptype"></asp:TextBox>
        <font color="red">&nbsp;<img src="../../Images/iconcalendar.gif" width="20" height="20" align="top"></font></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Plan Time</td>
      <td width="80%" class="tdganjil">
      <asp:TextBox runat="server" id="txtPlanTimeHH" Width="40px" CssClass="inptype"></asp:TextBox>
        &nbsp;:
      <asp:TextBox runat="server" id="txtPlanTimeMM" Width="40px" CssClass="inptype"></asp:TextBox>
        </td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30"><a href="ViewMarketingActivityHist.aspx" target="_blank">
		<strong>Marketing Activity History</strong></a></td>
      <td width="50%" align="right">&nbsp;</td>
    </tr>
    <tr> 
      <td width="50%" height="30">
		&nbsp;</td>
      <td width="50%" align="right">&nbsp;<asp:ImageButton id="imbSave" imageurl="../../Images/ButtonSave.gif" runat="server" PostBackUrl="MarketingActivity.aspx"></asp:ImageButton>
		&nbsp;<asp:ImageButton id="imbCancel" imageurl="../../Images/ButtonCancel.gif" runat="server" PostBackUrl="MarketingActivity.aspx"></asp:ImageButton>
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
