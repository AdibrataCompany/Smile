<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
<form id="form1" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20"><img src="../../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">INSURANCE COMPANY SETTING - EDIT</td>
      <td width="10"><img src="../../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Insurance Company Id</td>
      <td class="tdganjil">PANIN</td>
    </tr>
    <tr>
      <td class="tdgenap">Name</td>
      <td class="tdganjil"> 
		<asp:TextBox runat="server" id="txtInsCoName" text="Panin Insurance" CssClass="inptype" Width="330px">
		</asp:TextBox>
		&nbsp;<font color="red">*)</font> </td>
    </tr>
    <tr > 
      <td class="tdjudulabu" colspan="2">ADDRESS</td>
    </tr>
    <tr> 
      <td class="tdgenap">Address</td>
      <td class="tdganjil"> 
		<asp:TextBox runat="server" id="txtAddress" TextMode="MultiLine" Height="65px" Width="330px" CssClass="inptype"></asp:TextBox>
		&nbsp;<font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap">RT/RW</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <asp:TextBox runat="server" id="txtRt" CssClass="inptype" Width="50px">
		</asp:TextBox>
&nbsp; </font>/ <font face="Tahoma, Verdana" size="2">&nbsp;
		<asp:TextBox runat="server" id="txtRw" CssClass="inptype" Width="50px"></asp:TextBox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Kelurahan</td>
      <td class="tdganjil"><font color="red">
		<asp:TextBox runat="server" id="txtKelurahan" Text="Palmerah" CssClass="inptype">
		</asp:TextBox>
		</font> &nbsp;<font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap">Kecamatan</td>
      <td class="tdganjil"><font color="red">
		<asp:TextBox runat="server" id="txtKecamatan" Text="Palmerah" CssClass="inptype">
		</asp:TextBox>
		&nbsp;*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="height: 24px">City</td>
      <td class="tdganjil" style="height: 24px"><font color="red">
		<asp:TextBox runat="server" id="txtCity" Text="Jakarta" CssClass="inptype">
		</asp:TextBox>
		</font> &nbsp;<font color="red">*)</font> </td>
    </tr>
    <tr> 
      <td class="tdgenap">ZIP Code</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <font color="red">
		<asp:TextBox runat="server" id="txtZipCode" Text="11480" CssClass="inptype" Width="80px">
		</asp:TextBox>
		</font> &nbsp;<a href="javascript:;" onClick="MM_openBrWindow('../Lookup/ZipCodeLookup.aspx','ZipCode','scrollbars=yes,width=900,height=500')"><img src="../../Images/IconDetail.gif" width="15" height="15" align="absmiddle" border="0"></a> 
        </font><font color="red">*)</font> <font face="Tahoma, Verdana" size="2">&nbsp; 
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Phone 1</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <asp:TextBox runat="server" id="txtPhoneArea1" CssClass="inptype" Width="60px">021
		</asp:TextBox>
&nbsp;- 
        <asp:TextBox runat="server" id="txtPhoneNo1" CssClass="inptype" Width="99px">5831567
		</asp:TextBox>
&nbsp;</font><font color="red">*)</font> <font face="Tahoma, Verdana" size="2">&nbsp; 
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Phone 1</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <asp:TextBox runat="server" id="txtPhoneArea2" CssClass="inptype" Width="60px">
		</asp:TextBox>
&nbsp;- 
        <asp:TextBox runat="server" id="txtPhoneNo2" CssClass="inptype" Width="99px">
		</asp:TextBox>
&nbsp;</font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Fax Number</td>
      <td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <asp:TextBox runat="server" id="txtFaxArea" CssClass="inptype" Width="60px">
		</asp:TextBox>
&nbsp;- 
        <asp:TextBox runat="server" id="txtFaxNo" CssClass="inptype" Width="99px">
		</asp:TextBox>
&nbsp;</font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Contact Person</td>
      <td class="tdganjil">
		<asp:TextBox runat="server" id="txtContactPerson" CssClass="inptype" Width="400px">
		</asp:TextBox>
      </td>
    </tr>
    <tr> 
      <td class="tdgenap">Contact Person Title</td>
      <td class="tdganjil">
		<asp:TextBox runat="server" id="txtContactPersonTitle" CssClass="inptype" Width="400px">
		</asp:TextBox>
      </td>
    </tr>
    <tr> 
      <td class="tdgenap">Mobile Phone</td>
      <td class="tdganjil"> 
		<asp:TextBox runat="server" id="txtMobilePhone" CssClass="inptype" Width="200px">
		</asp:TextBox>
      &nbsp;</td>
    </tr>
    <tr> 
      <td class="tdgenap">E-mail</td>
      <td class="tdganjil"> 
		<asp:TextBox runat="server" id="txtEmail" CssClass="inptype" Width="200px">
		</asp:TextBox>
      &nbsp;</td>
    </tr>

    <tr>
		<TD class="tdgenap" style="HEIGHT: 22px" width="25%">Days In Year</TD>
		<TD class="tdganjil" style="HEIGHT: 2px">
        <font face="Tahoma, Verdana" size="2"> 
        <asp:TextBox runat="server" id="txtDaysInYear" CssClass="inptype" Width="110px">365
		</asp:TextBox>
		</font></TD>
	</tr>

    <TR class="tdganjil">
		<TD class="tdgenap" style="HEIGHT: 22px" width="25%">Is Active</TD>
		<TD class="tdganjil" style="HEIGHT: 2px">
			<asp:CheckBox runat="server" id="chkActive" /></TD>
	</TR>

  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"> <a href="javascript:history.go (-1);"><img src="../../Images/ButtonSave.gif" width="100" height="20" border="0"></a> 
        <a href="javascript:history.go (-1);"><img src="../../Images/ButtonCancel.gif" width="100" height="20" border="0"></a></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
