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
<form id="frm1" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiorangekiri">&nbsp;</td>
      <td align="center" class="tdtopiorange">NST CRITERIA - ADD</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
       <tr> 
          <td width="150" class="tdgenap">Group Criteria</td>
          <td class="tdganjil">Asset Document<font color="red">*)</font> </td>
        </tr>
        <tr>
      <td width="20%" class="tdgenap">Branch</td>
      <td class="tdganjil" ><asp:Label ID="lblBranch" runat="server"></asp:Label>
		</td>
		
    	</tr>
		<tr>
          <td class="tdgenap" width="20%">Asset Type</td>
          <td class="tdganjil" width="80%">
			<asp:Label ID="lblAssetType" runat="server"></asp:Label>

        </tr>
	
		</tr>
		<tr>
      <td width="20%" class="tdgenap">Asset Category</td>
      <td class="tdganjil" >
			<asp:Label ID="lblAssetCategory" runat="server"></asp:Label>

		</td>
    	</tr>
		<tr>
      <td width="20%" class="tdgenap">Asset Usage</td>
      <td class="tdganjil" >
			<asp:Label ID="lblAssetUsage" runat="server"></asp:Label>

		</td>
    	</tr>
		<tr>
      <td width="20%" class="tdgenap">Finance Type</td>
      <td class="tdganjil" >
			<asp:Label ID="lblFinanceType" runat="server"></asp:Label>

		</td>
    	</tr>
		<tr>
      <td width="20%" class="tdgenap">Leaseback Type</td>
      <td class="tdganjil">
			<asp:Label ID="lblLEasebackType" runat="server"></asp:Label>

		</td>
    	</tr>
		<tr>
      <td width="20%" class="tdgenap">New / Used Type</td>
      <td class="tdganjil" >
			<asp:Label ID="lblNewUsedType" runat="server"></asp:Label>
    </tr>
   		</tr>
		<tr>
          <td class="tdgenap">Syairah Type</td>
          <td class="tdganjil"> 
			<asp:Label ID="lblSyairahType" runat="server"></asp:Label>
			</td>
        	</tr>
		<tr>
          <td class="tdgenap">Floor Financing</td>
          <td class="tdganjil">
		  <asp:Label ID="lblFloorFinancing" runat="server"></asp:Label>

				</td>
        </tr>
        <tr> 
          <td class="tdgenap" width="20%">NST Criteria ID</td>
          <td class="tdganjil" width="80%"><asp:TextBox ID="txtCriteriaNSTID" runat="server" CssClass="inptype"></asp:TextBox>
            <font color="red">*)</font> </td>
        </tr>
        <tr>
          <td class="tdgenap">NST Criteria Description</td>
          <td class="tdganjil">
			<asp:TextBox ID="txtCriteriaNSTDescription0" runat="server" CssClass="inptype" Width="321px"></asp:TextBox>
            <font color="red">*)</font> </td>
        </tr>
		<tr>
          <td class="tdgenap">Standard Criteria Description</td>
          <td class="tdganjil">
			<asp:TextBox ID="txtCriteriaNSTDescription1" runat="server" CssClass="inptype" Width="321px"></asp:TextBox>
            <font color="red">*)</font> </td>
        </tr>
        <tr>

          <td class="tdgenap">Approval Type</td>
          <td class="tdganjil">
			<asp:DropDownlist ID="txtCriteriaNSTDescription2" runat="server" Width="121px">
					<asp:ListItem Text="Risk Approval" Value="RISK"></asp:ListItem>
					<asp:ListItem Text="Price Approval" Value="PRICE"></asp:ListItem>
			</asp:DropDownlist>
            <font color="red">*)</font> </td>
        </tr>
        <tr> 

          <td class="tdgenap">Final Level At</td>
          <td class="tdganjil">
			<asp:DropDownlist ID="txtCriteriaNSTDescription" runat="server" Width="121px">
					<asp:ListItem Text="QAD Head" Value="QADH"></asp:ListItem>
			</asp:DropDownlist>
            <font color="red">*)</font> </td>
        </tr>
               
      </table>
    </div>
    
  </div>
	<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
      <asp:Imagebutton runat="server" ID="imbSaveCriteriaNST" PostBackUrl="CreditReviewSettingNSTCriteriaList.aspx" ImageUrl="../../Images/ButtonSave.gif"></asp:Imagebutton>
      <asp:Imagebutton runat="server" ID="imbCancelCriteriaNST" PostBackUrl="CreditReviewSettingNSTCriteriaList.aspx" ImageUrl="../../Images/ButtonCancel.gif"></asp:Imagebutton>
		</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
