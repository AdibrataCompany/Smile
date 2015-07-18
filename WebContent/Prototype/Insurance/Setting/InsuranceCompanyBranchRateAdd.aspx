<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
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
      <td align="center" class="tdtopiabu">INSURANCE COMPANY RATE - ADD</td>
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
		<asp:DropDownList runat="server" id="ddlInsAssetType">
			<asp:ListItem>Truck</asp:ListItem>
			<asp:ListItem>Non Truck</asp:ListItem>
		</asp:DropDownList>
&nbsp;</td>
    </tr>
    <tr> 
      <td class="tdgenap">Asset Usage</td>
      <td class="tdganjil" colspan="3"><asp:DropDownList runat="server" id="ddlAssetUsage">
		<asp:ListItem>Commercial</asp:ListItem>
		<asp:ListItem>Non Commercial</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
    <tr> 
      <td class="tdgenap">New / Used</td>
      <td class="tdganjil" colspan="3"> 
		<asp:DropDownList runat="server" id="ddlNewUsed">
		<asp:ListItem>New</asp:ListItem>
		<asp:ListItem>Used</asp:ListItem>
		</asp:DropDownList>
		&nbsp;</td>
    </tr>
    <tr> 
      <td class="tdgenap">Coverage Type</td>
      <td class="tdganjil" colspan="3">  
		<asp:DropDownList runat="server" id="ddlCoverageType">
		<asp:ListItem>All Risk</asp:ListItem>
		<asp:ListItem>TLO</asp:ListItem>
		<asp:ListItem>Fire</asp:ListItem>		
		</asp:DropDownList>
		&nbsp;</td>
    </tr>
    <tr>
      <td class="tdgenap">Currency</td>
      <td class="tdganjil" colspan="3">  
		<asp:DropDownList runat="server" id="ddlCurrency">
		<asp:ListItem>IDR</asp:ListItem>
		<asp:ListItem>USD</asp:ListItem>	
		</asp:DropDownList>
		</td>
    </tr>
    <tr> 
      <td class="tdgenap">Year Num</td>
      <td class="tdganjil" colspan="3"> 
		<asp:TextBox runat="server" id="txtYearNum" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;<font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap">OTR From</td>
      <td class="tdganjil" colspan="3"> 
		<asp:TextBox runat="server" id="txtOtrFrom" CssClass="inptype">
		</asp:TextBox>
		&nbsp;<font color="red">*)</font> 
		</td>
    </tr>
    <tr> 
      <td class="tdgenap">OTR To</td>
      <td class="tdganjil" colspan="3">  
		<asp:TextBox runat="server" id="txtOtrTo" CssClass="inptype">
		</asp:TextBox>
		&nbsp;<font color="red">*)</font> 
		</td>
    </tr>
    <tr>
      <td class="tdgenap">Sum Insured Percentage</td>
      <td class="tdganjil" colspan="3"> <font size="1"> 
        <input name="textfield333224" type="text" class="inptype" size="10">
        % </font><font color="red">*)</font> </td>
    </tr>
    <tr>
      <td class="tdgenap">Minimum Earned</td>
      <td class="tdganjil" colspan="3"> <font size="1"> 
		<asp:TextBox runat="server" id="txtRateToInsCo0" CssClass="inptype" Width="70px">
		</asp:TextBox>
		&nbsp;% <font color="red">*)</font> </font> </td>
    	</tr>
		<tr>
      <td class="tdgenap" width="20%">Rate To Ins Co</td>
      <td class="tdganjil" style="width: 30%"> <font size="1"> 
		<asp:TextBox runat="server" id="txtRateToInsCo1" CssClass="inptype" Width="70px">2
		</asp:TextBox>
		&nbsp;% </font><font color="red">*)</font> </td>
      <td class="tdgenap" style="width: 25%"> Discount Rate To Ins Co</td>
      <td class="tdganjil" width="30%"> <font size="1"> 
		<asp:TextBox runat="server" id="txtDiscRateToInsCo0" CssClass="inptype" Width="70px">25
		</asp:TextBox>
		&nbsp;% </font><font color="red">*)</font> </td>
    </tr>
	<tr>
      <td class="tdgenap" width="20%">SRCC Rate</td>
      <td class="tdganjil" style="width: 30%"> <font size="1"> 
		<asp:TextBox runat="server" id="txtSrccRate0" CssClass="inptype" Width="70px">
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
		<asp:TextBox runat="server" id="txtTsRate0" CssClass="inptype" Width="70px">
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
		<asp:TextBox runat="server" id="txtSrccTsRate0" CssClass="inptype" Width="70px">
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
		<asp:TextBox runat="server" id="txtRsmdRate0" CssClass="inptype" Width="70px">
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
		<asp:TextBox runat="server" id="txtAogRate0" CssClass="inptype" Width="70px">
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
		<asp:TextBox runat="server" id="txtEarthquakeRate0" CssClass="inptype" Width="70px">
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
		<asp:TextBox runat="server" id="txtFloodRate0" CssClass="inptype" Width="70px">
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
      <td width="50%" align="right">
      <asp:ImageButton runat="server" id="imbSave" imageUrl="../images/buttonSave.gif" PostBackUrl="InsuranceCompanyBranchRate.aspx"></asp:ImageButton>
      <asp:ImageButton runat="server" id="imbCancel" imageUrl="../images/buttonCancel.gif" PostBackUrl="InsuranceCompanyBranchRate.aspx"></asp:ImageButton>
	  </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
