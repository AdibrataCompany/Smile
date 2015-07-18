<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
</head>
<body>
<form runat="server" id="frmloanBuyBackBond">
<div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopitoscakiri">&nbsp;</td>
      <td align="center" class="tdtopitosca">LOAN BUY BACK BOND</td>
      <td width="10" class="tdtopitoscakanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdganjil"> 
      <td width="24%" class="tdgenap">Funding Company / Branch</td>
      <td width="76%" class="tdganjil"><select name="select">
          <option selected>Select One</option>
        </select> </td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap">Funding Contract No</td>
      <td class="tdganjil"><select name="select3">
          <option selected>Select One</option>
        </select> </td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap">Funding Batch No</td>
      <td class="tdganjil"><select name="select2">
          <option selected>Select One</option>
        </select> </td>
    </tr>
     <tr class="tdganjil"> 
      <td class="tdgenap">Buy Back Type</td>
      <td class="tdganjil">
      <asp:RadioButtonList runat="server" ID="RbtnBuyBack" RepeatDirection="Horizontal">
      	 <asp:ListItem Text="Buy Back without Sell back" Selected="True"></asp:ListItem>
      	 <asp:ListItem Text="Buy Back with Sell back"></asp:ListItem>
      </asp:RadioButtonList>
      </td>
    </tr>

    <tr class="tdganjil"> 
      <td class="tdgenap">OS Principal less than</td>
      <td class="tdganjil"><input type="text" name="textfield2222" class="inptype" size="20">
        zero means all</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap">Tenor Remain, less than</td>
      <td class="tdganjil"><input type="text" name="textfield22222" class="inptype" size="5">
        zero means all</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap">Effective Rate, Greater than</td>
      <td class="tdganjil"><input type="text" name="textfield22222" class="inptype" size="5">
        zero means all</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap">Buy Back Amount</td>
      <td class="tdganjil"><input type="text" name="textfield22222" class="inptype" size="20">
      </td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td height="30">&nbsp; </td>
      <td align="right"> <a href="BuyBackSelectionBond.aspx">
		<img src="../../Images/ButtonSelect.gif" width="100" height="20" border="0"></a><a href="javascript:history.go(-1);"> 
        </a> </td>
    </tr>
  </table>
  
</div>
</form>
</body>
</html>
