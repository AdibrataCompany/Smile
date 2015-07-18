<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="../../Confins.css">
</head>

<body>
<form id="FrmAssetMasterEdit2" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET PRICE - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="25%" class="tdgenap">Branch ID</td>
          <td class="tdganjil"><asp:Label runat="server" id="lblBranchID" Text="999"></asp:Label >
          </td>
        </tr>
        <tr> 
          <td class="tdgenap">Asset Code</td>
         <td class="tdganjil"><asp:Label runat="server" id="lblAssetCode" Text="xxxxx50xxxxx"></asp:Label >
          </td>
        </tr>
        <tr> 
          <td class="tdgenap">Commercial Description</td>
          <td class="tdganjil">
			<asp:Label runat="server" id="lblCommercialDescription" Text="xxxxx50xxxxx"></asp:Label >
		  </td>
        </tr>

        <tr> 
          <td class="tdgenap">Legal Description</td>
          <td class="tdganjil">
			<asp:Label runat="server" id="lblLegalDescription" Text="xxxxx50xxxxx"></asp:Label >
		  </td>
		<tr> 
          <td class="tdgenap">Year</td>
          <td class="tdganjil">
			<asp:Label runat="server" id="lblYear" Text="YYYY"></asp:Label >
		  </td>
        </tr>
		<tr> 
          <td class="tdgenap">Used/New</td>
          <td class="tdganjil">
			<asp:Label runat="server" id="lblUsedNew" Text="xxxxx10xxxxx"></asp:Label >
		  </td>
        </tr>
      <tr> 
          <td class="tdgenap">Date</td>
          <td class="tdganjil">
			<asp:Label runat="server" id="lblDate" Text="dd/MM/YYYY"></asp:Label >
		  </td>
      </tr>
      <tr> 
          <td class="tdgenap">Price</td>
          <td class="tdganjil">
			<asp:TextBox runat="server" id="txtPrice" Text="999,999,999,999" CssClass="inptype"></asp:TextBox ><font color="red">*)</font>
		  </td>
        </tr>

 

      </table>
    </div>
    
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="AssetPriceList.aspx" />  
		&nbsp;  
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="AssetPriceList.aspx" />
		</td>
    </tr>
    
  </table>
</div>
</form>
</body>
</html>
