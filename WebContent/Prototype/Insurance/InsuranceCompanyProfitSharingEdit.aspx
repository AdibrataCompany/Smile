<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled 1</title>
<link rel="stylesheet" type="text/css" href="../Confins.css" />
</head>

<body>

<form id="form1" runat="server">
 <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiabukiri"></td>
      <td align="center" class="tdtopiabu">INSURANCE COMPANY PROFIT SHARING - EDIT</td>
      <td width="10" class="tdtopiabukanan"></td>
    </tr>
  </table>
<table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
      <td class="tdgenap">Insurance Co.Id</td>
      <td class="tdganjil">PANIN-JKT</td>
    </tr>
    <tr> 
      <td class="tdgenap">Insurance Co. Name</td>
      <td class="tdganjil">Panin Insurance Jakarta</td>
    </tr>
    <tr> 
      <td class="tdgenap">% Cost Of Insurance Coy</td>
      <td class="tdganjil">
		<asp:TextBox runat="server" id="TextBox1" CssClass="inptype" Width="30px"></asp:TextBox> &nbsp;<font color="red">*)</font> </td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr align="center" class="tdjudulabu"> 
      <td width="15%">% UND FROM (&gt;)</td>
      <td width="12%">% UND TO (&lt;=)</td>
      <td width="15%">% PROFIT SHARING</td>
       <td width="15%">DELETE</td>

      </tr>
       <tr align="center" class="tdgenap"> 
      <td width="15%">
		<input name="Text1" type="text" class="inptype" style="width: 70px" value="0" /></td>
      <td width="12%">
		<input name="Text2" type="text" class="inptype" style="width: 70px" value="30" /></td>
      <td width="15%">
		<input name="Text3" type="text" class="inptype" style="width: 70px" value="0"/></td>
		 <td width="15%"><input name="Image1" type="image" src="../images/IconDelete.gif" />
		</td>

      </tr>
		   <tr align="center" class="tdgenap"> 
      <td width="15%">
		<input name="Text1" type="text" class="inptype" style="width: 70px" value="30" /></td>
      <td width="12%">
		<input name="Text2" type="text" class="inptype" style="width: 70px" value="40" /></td>
      <td width="15%">
		<input name="Text3" type="text" class="inptype" style="width: 70px" value="10"/></td>
		 <td width="15%"><input name="Image1" type="image" src="../images/IconDelete.gif" />
		</td>

      </tr>
	    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;<asp:ImageButton runat="server" id="ImageButton1" ImageUrl="../images/ButtonAdd.gif" PostBackUrl="InsuranceCompanyProfitSharingUNDAdd.aspx"></asp:ImageButton></td>
      <td width="50%" align="right"><a href="InsuranceCompanyProfitSharingSearch.aspx"><img src="../Images/ButtonSave.gif" width="100" height="20" border="0"></a> 
        <a href="javascript:history.go(-1);"><img src="../Images/ButtonCancel.gif" width="100" height="20" border="0"></a></td>
    </tr>
  </table>

</form>

</body>

</html>
