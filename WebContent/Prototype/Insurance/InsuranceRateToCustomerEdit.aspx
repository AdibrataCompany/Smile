<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
<style type="text/css">
.style1 {
	background-color: #F4FAFF;
	text-align: left;
}
.style2 {
	background-color: #FFFFFF;
	text-align: left;
}
</style>
</head>

<body>
<form id="form1" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">INSURANCE RATE TO CUSTOMER SETTING - 
		EDIT</td>
      <td width="10"><img src="../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdganjil"> 
      <td width="25%" class="tdgenap">Branch Id</td>
      <td width="25%" class="tdganjil">x3x</td>
      <td width="25%" class="tdgenap">Branch Name</td>
      <td width="25%" class="tdganjil">xxx20xxx</td>
    </tr>
    <tr class="tdgenap"> 
      <td>Ins. Asset Type</td>
      <td class="tdganjil" colspan="3"> 
		Non Truck&nbsp;</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap">Asset Usage</td>
      <td colspan="3"> 
        Non Commercial</td>
    </tr>
    <tr>
          <td class="style1" style="height: 13px">Finance Type</td>
          <td class="style2" style="height: 13px" colspan="3">
			Consumer Finance</td>
        </tr>
	<tr>
          <td class="style1">Lease Back Type</td>
          <td class="style2" colspan="3">
				Direct Financing</td>
        </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap">Asset New/Used</td>
      <td colspan="3"> 
        <div align="left"> 
		New</div>
      </td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap">Coverage Type</td>
      <td colspan="3"> 
		All Risk</td>
    </tr>
    <tr class="tdganjil">
      <td class="tdgenap">Currency </td>
      <td colspan="3">
		IDR</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap">Year Num</td>
      <td colspan="3"> 
		2<font color="red">&nbsp;*)</font>&nbsp;
      </td>
    </tr>
    <tr>
      <td class="tdgenap">OTR From</td>
      <td class="tdganjil" colspan="3"> 
		0&nbsp;<font color="red">*)</font> 
		</td>
    </tr>
	<tr>
      <td class="tdgenap">OTR To</td>
      <td class="tdganjil" colspan="3">  
		150,000,000.00&nbsp;<font color="red">*)</font> 
		</td>
    </tr>
	<tr>
      <td class="tdgenap">Sum Insured Percentage</td>
      <td class="tdganjil" colspan="3"> <font size="1"> 
        80
        % </font><font color="red">*)</font> </td>
    	</tr>
		<tr>
      <td class="tdgenap">Rate For Group</td>
      <td class="tdganjil" colspan="3"> <font size="1"> 
		<asp:TextBox runat="server" id="txtRateToInsCo" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% </font><font color="red">*)</font> </td>
    	</tr>
		<tr>
      <td class="tdgenap">Rate For Non Group</td>
      <td class="tdganjil" colspan="3"> <font size="1"> 
		<asp:TextBox runat="server" id="txtRateToInsCo0" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% <font color="red">*)</font> </font> </td>
    	</tr>
		<tr>
      <td class="tdgenap">Rate For Repeat Order</td>
      <td class="tdganjil" colspan="3"> <font size="1"> 
		<asp:TextBox runat="server" id="txtDiscRateToInsCo" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% </font><font color="red">*)</font> </td>
    </tr>
	<tr>
      <td class="tdgenap">SRCC Rate</td>
      <td class="tdganjil" colspan="3"> <font size="1"> 
		<asp:TextBox runat="server" id="txtSrccRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% <font color="red">*)</font> </font></td>
    </tr>
	<tr>
      <td class="tdgenap">TS Rate</td>
      <td class="tdganjil" colspan="3"> <font size="1"> 
		<asp:TextBox runat="server" id="txtTsRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% <font color="red">*)</font> </font></td>
    </tr>
	<tr>
      <td class="tdgenap">SRCCTS Rate</td>
      <td class="tdganjil" colspan="3"> <font size="1"> 
		<asp:TextBox runat="server" id="txtSrccTsRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% <font color="red">*)</font> </font></td>
    </tr>
	<tr>
      <td class="tdgenap">RSMD Rate</td>
      <td class="tdganjil" colspan="3"> <font size="1"> 
		<asp:TextBox runat="server" id="txtRsmdRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% <font color="red">*)</font> </font></td>
    </tr>
	<tr>
      <td class="tdgenap">AOG Rate</td>
      <td class="tdganjil" colspan="3"> <font size="1"> 
		<asp:TextBox runat="server" id="txtAogRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% <font color="red">*)</font> </font></td>
    </tr>
	<tr>
      <td class="tdgenap">Earthquake Rate</td>
      <td class="tdganjil" colspan="3"> <font size="1"> 
		<asp:TextBox runat="server" id="txtEarthquakeRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% <font color="red">*)</font> </font></td>
    </tr>
	<tr>
      <td class="tdgenap">Flood Rate</td>
      <td class="tdganjil" colspan="3"> <font size="1"> 
		<asp:TextBox runat="server" id="txtFloodRate" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% <font color="red">*)</font> </font></td>
    	</tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
      <asp:ImageButton runat="server" id="imbSave" imageUrl="../images/buttonSave.gif" PostBackUrl="InsuranceRateToCustomer.aspx"></asp:ImageButton>
      &nbsp;<asp:ImageButton runat="server" id="imbCancel" imageUrl="../images/buttonCancel.gif" PostBackUrl="InsuranceRateToCustomer.aspx"></asp:ImageButton>
	  </td>
    </tr>
  </table>
  
</div>
	</form>
</body>
</html>
