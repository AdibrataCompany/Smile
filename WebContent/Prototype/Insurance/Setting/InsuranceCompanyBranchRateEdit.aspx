<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<style type="text/css">
.style1 {
	background-color: #FFFFFF;
	font-family: Verdana, Arial, Tahoma, sans-serif;
}
</style>
</head>

<body>
<form id="form1" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field<br>
		Minimum Rate Jual = Rate To InsCo + Minimum Earned</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">INSURANCE COMPANY RATE - EDIT</td>
      <td width="10"><img src="../../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Insurance Co. Branch Id</td>
      <td class="tdganjil" colspan="3">PANIN-JKT</td>
    </tr>
    <tr> 
      <td class="tdgenap">Insurance Co. Branch Name</td>
      <td class="tdganjil" colspan="3">Panin Insurance Jakarta</td>
    </tr>
    <tr> 
      <td class="tdgenap">Company Branch </td>
      <td class="tdganjil" colspan="3">Jakarta - Automotive</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="height: 24px">Ins. Asset Type</td>
      <td class="tdganjil" style="height: 24px" colspan="3"> 
		Non Truck&nbsp;</td>
    </tr>
    <tr> 
      <td class="tdgenap">Asset Usage</td>
      <td class="tdganjil" colspan="3">Non Commercial</td>
    </tr>
    <tr> 
      <td class="tdgenap">New / Used</td>
      <td class="tdganjil" colspan="3"> 
		New&nbsp;</td>
    </tr>
    <tr> 
      <td class="tdgenap">Coverage Type</td>
      <td class="tdganjil" colspan="3">  
		All Risk&nbsp;</td>
    </tr>
    <tr>
      <td class="tdgenap">Currency</td>
      <td class="tdganjil" colspan="3">  
		IDR</td>
    </tr>
    <tr> 
      <td class="tdgenap">Year Num</td>
      <td class="tdganjil" colspan="3"> 
		2</td>
    </tr>
    <tr> 
      <td class="tdgenap">OTR From</td>
      <td class="tdganjil" colspan="3"> 
		0</td>
    </tr>
    <tr> 
      <td class="tdgenap">OTR To</td>
      <td class="tdganjil" colspan="3">  
		150,000,000.00</td>
    </tr>
    <tr>
      <td class="tdgenap">Sum Insured Percentage</td>
      <td class="style1" colspan="3"> 80 %</td>
    </tr>
    <tr>
      <td class="tdgenap">Minimum Earned</td>
      <td class="tdganjil" colspan="3"> <font size="1"> 
		<asp:TextBox runat="server" id="txtMinEarnInsCo" CssClass="inptype" Width="70px">0.5
		</asp:TextBox>
		&nbsp;% <font color="red">*)</font> </font> </td>
    </tr>
    <tr>
      <td class="tdgenap" width="20%">Rate To Ins Co</td>
      <td class="tdganjil" style="width: 30%"> <font size="1"> 
		<asp:TextBox runat="server" id="txtRateToInsCo" CssClass="inptype" Width="70px">2
		</asp:TextBox>
		&nbsp;% </font><font color="red">*)</font> </td>
      <td class="tdgenap" style="width: 25%"> Discount Rate To Ins Co</td>
      <td class="tdganjil" width="30%"> <font size="1"> 
		<asp:TextBox runat="server" id="txtDiscRateToInsCo" CssClass="inptype" Width="70px">25
		</asp:TextBox>
		&nbsp;% </font><font color="red">*)</font> </td>
    </tr>
    <tr>
      <td class="tdgenap" width="20%">SRCC Rate</td>
      <td class="tdganjil" style="width: 30%"> <font size="1"> 
		<asp:TextBox runat="server" id="txtSrccRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% <font color="red">*)</font> </font> </td>
      <td class="tdgenap" style="width: 25%"> Discount SRCC Rate</td>
      <td class="tdganjil" width="30%"> <font size="1"> 
		<asp:TextBox runat="server" id="txtDiscSrccRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% </font><font color="red">*)</font> </td>
    	</tr>
		<tr>
      <td class="tdgenap" width="20%">TS Rate</td>
      <td class="tdganjil" style="width: 30%"> <font size="1"> 
		<asp:TextBox runat="server" id="txtTsRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% <font color="red">*)</font></font></td>
      <td class="tdgenap" style="width: 25%"> Discount TS Rate</td>
      <td class="tdganjil" width="30%"> <font size="1"> 
		<asp:TextBox runat="server" id="txtDiscTsRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% </font><font color="red">*)</font> </td>
    	</tr>
		<tr>
      <td class="tdgenap">SRCCTS Rate</td>
      <td class="tdganjil" style="width: 30%"> <font size="1"> 
		<asp:TextBox runat="server" id="txtSrccTsRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% <font color="red">*)</font></font></td>
      <td class="tdgenap" style="width: 25%"> Discount SRCCTS Rate</td>
      <td class="tdganjil" width="30%"> <font size="1"> 
		<asp:TextBox runat="server" id="txtDiscSrccTsRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% </font><font color="red">*)</font> </td>
    	</tr>
		<tr>
      <td class="tdgenap">RSMD Rate</td>
      <td class="tdganjil" style="width: 30%"> <font size="1"> 
		<asp:TextBox runat="server" id="txtRsmdRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% <font color="red">*)</font></font></td>
      <td class="tdgenap" style="width: 25%"> Discount RSMD Rate</td>
      <td class="tdganjil" width="30%"> <font size="1"> 
		<asp:TextBox runat="server" id="txtDiscRsmdRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% </font><font color="red">*)</font> </td>
    	</tr>
		<tr>
      <td class="tdgenap">AOG Rate</td>
      <td class="tdganjil" style="width: 30%"> <font size="1"> 
		<asp:TextBox runat="server" id="txtAogRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% <font color="red">*)</font> </font> </td>
      <td class="tdgenap" style="width: 25%"> Discount AOG Rate</td>
      <td class="tdganjil" width="30%"> <font size="1"> 
		<asp:TextBox runat="server" id="txtDiscAogRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% </font><font color="red">*)</font> </td>
    	</tr>
		<tr>
      <td class="tdgenap">Earthquake Rate</td>
      <td class="tdganjil" style="width: 30%"> <font size="1"> 
		<asp:TextBox runat="server" id="txtEarthquakeRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% <font color="red">*)</font> </font> </td>
      <td class="tdgenap" style="width: 25%"> Discount Earthquake Rate</td>
      <td class="tdganjil" width="30%"> <font size="1"> 
		<asp:TextBox runat="server" id="txtDiscEarthquakeRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% </font><font color="red">*)</font> </td>
    	</tr>
		<tr>
      <td class="tdgenap">Flood Rate</td>
      <td class="tdganjil" style="width: 30%"> <font size="1"> 
		<asp:TextBox runat="server" id="txtFloodRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% <font color="red">*)</font></font></td>
      <td class="tdgenap" style="width: 25%"> Discount Flood Rate</td>
      <td class="tdganjil" width="30%"> <font size="1"> 
		<asp:TextBox runat="server" id="txtDiscFloodRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% </font><font color="red">*)</font> </td>
    	</tr>
		</table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><a href="javascript:history.go(-1);"><img src="../../Images/ButtonSave.gif" width="100" height="20" border="0"></a> 
        <a href="javascript:history.go(-1);"><img src="../../Images/ButtonCancel.gif" width="100" height="20" border="0"></a></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
