<html xmlns:v="urn:schemas-microsoft-com:vml" xmlns:o="urn:schemas-microsoft-com:office:office">
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<style type="text/css">
 p.MsoNormal
	{margin-bottom:.0001pt;
	font-size:12.0pt;
	font-family:"Times New Roman";
		margin-left: 0in;
	margin-right: 0in;
	margin-top: 0in;
}
</style>
</head>
<body>
<form runat="server" id="FundingSourceCntractBondAdd">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopitoscakiri">&nbsp;</td>
      <td align="center" class="tdtopitosca">FUNDING CONTRACT FOR BOND - 
		EDIT</td>
      <td width="10" class="tdtopitoscakanan">&nbsp;</td>
    </tr>
  </table>
   <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
      
	 <tr> 
      <td class="tdgenap" width="20%">Funding Company Name</td>
      <td class="tdganjil" width="30%">xxxxxxxxxxxxxx30xxxxxxxxxxxxxx</td>
      <td class="tdgenap"  width="20%">Security Percentage</td>
     <td class="tdganjil"><input name="textfield33" type="text" class="inptype" value="0" size="15">
        % </td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Bank Name</td>
      <td class="tdganjil" width="30%">xxxxxx30xxxxxx</td>
      <td class="tdgenap">Security Percentage Of</td>
      <td class="tdganjil"><select name="select7">
          <option selected>Base on Principal</option>
          <option>Base on A/R</option>
           <option>Base on OTR Price</option>

        </select></td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Funding Contract No</td>
      <td class="tdganjil" width="30%">
		xxxxxx30xxxxxx</td>
      <td class="tdgenap" width="20%">Security Type</td>
      <td class="tdganjil">
      <asp:CheckBoxList runat="server" ID="CbxListSecurityType" RepeatDirection="Vertical">
        <asp:ListItem Text="Corporate Guarantee"></asp:ListItem>
        <asp:ListItem Text="Parent Guarantee"></asp:ListItem>
        <asp:ListItem Text="Cash Deposit"></asp:ListItem>
        <asp:ListItem Text="Fixed Asset"></asp:ListItem>
      </asp:CheckBoxList>
      </td>
    </tr>
    <tr>
      <td class="tdgenap" width="20%">Contract Name</td>
      <td class="tdganjil" width="30%"><input name="textfield33262" type="text" class="inptype" size="30"></td>
      <td class="tdgenap" width="20%">Notary Fee</td>
      <td class="tdganjil" width="30%"><input name="textfield33262" value="0"  type="text" class="inptype" size="30"></td>
      
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Contract Date</td>
      <td class="tdganjil" width="30%"><input name="textfield332633" type="text" class="inptype" size="15"> 
        <img src="../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"><font color="red"> 
        *)</font> </td>
       <td class="tdgenap">Late Payment Fee</td>
      <td class="tdganjil">
		<input name="textfield332632348" type="text" class="inptype" value="0" size="10" style="width: 91px">
        %</td>
    </tr>
    
      <td class="tdgenap" width="20%">Plafond Amount</td>
    <td class="tdganjil" width="30%"><input name="textfield3325" type="text" class="inptype" value="0" size="15"></td>
      <td class="tdgenap">Fee Per Drawdown</td>
      <td class="tdganjil">
		<input name="textfield332632348" type="text" class="inptype" value="0" size="10" style="width: 144px">
        </td>
        <tr> 
      <td class="tdgenap" width="20%">Currency</td>
      <td class="tdganjil" width="30%"><select name="select8">
          <option selected>IDR</option>
          <option>USD</option>
        </select></td>
      <td class="tdgenap">Fee Per Facility</td>
      <td class="tdganjil">
		<input name="textfield332632348" type="text" class="inptype" value="0" size="10" style="width: 144px">
        </td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Interest Rate</td>
      <td class="tdganjil">
		<input name="textfield332632348" type="text" class="inptype" value="0" size="10" style="width: 91px">
        %</td>

      <td class="tdgenap" width="20%">Max Date For Drawdown</td>
      <td class="tdganjil" width="30%">
		<input name="textfield332632348" type="text" class="inptype"  size="10" style="width: 51px"></td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Intereset Type</td>
      <td class="tdganjil" width="30%">
      <asp:DropDownList runat="server" id="DDLInterestType">
        <asp:ListItem Text="Floating"></asp:ListItem>
        <asp:ListItem Text="Fixed"></asp:ListItem>      
        <asp:ListItem Text="Fixed per Batch"></asp:ListItem>
      </asp:DropDownList>
      </td>
      <td class="tdgenap" width="20%">Contract Status</td>
      <td class="tdganjil" width="30%">
		<asp:RadioButtonList runat="server" id="RBtnContaractStatus" RepeatDirection="Horizontal">
		  <asp:ListItem Text="Active" Selected="True"></asp:ListItem>
		  <asp:ListItem Text="Non Active"></asp:ListItem>
		</asp:RadioButtonList></td>
    </tr>
  

    <tr> 
      <td class="tdgenap" width="20%">Notes</td>
      <td class="tdganjil" width="30%" colspan="3">
					<textarea name="TextArea1" rows="2" style="width: 95%" class="inptype" cols="20"></textarea></td>
        </tr>
    </table>
    
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td height="30"> &nbsp;</td>
      <td align="right"> <a href="FundingSourceContractBond.aspx">
		<img src="../../Images/ButtonSave.gif" width="100" height="20" border="0"> 
        <img src="../../Images/ButtonCancel.gif" width="100" height="20" border="0"></a> 
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
