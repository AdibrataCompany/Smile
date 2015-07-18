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
      <td align="center" class="tdtopihijau">ASSET MASTER - EDIT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center">
      <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
        <tr> 
          <td width="25%" class="tdgenap">Asset Code</td>
          <td class="tdganjil">HONDA</td>
        </tr>
        <tr> 
          <td class="tdgenap">Description</td>
          <td class="tdganjil">
			<asp:TextBox runat="server" id="TbxCommercialDescription" CssClass="inptype">Honda</asp:TextBox>
&nbsp;<font color="red">*)</font> </td>
        </tr>
        <tr> 
          <td class="tdgenap">Commercial Description</td>
          <td class="tdganjil">
			<asp:TextBox runat="server" id="TbsDescription" CssClass="inptype">Honda</asp:TextBox>
&nbsp;<font color="red">*) if final level</font></td>
        </tr>

        <tr> 
          <td class="tdgenap">Asset Category</td>
          <td class="tdganjil">
			<asp:DropDownList runat="server" id="CmbAssetCategory" CssClass="inptype">
				<asp:ListItem>BUS</asp:ListItem>
				<asp:ListItem>MINI BUS</asp:ListItem>
				<asp:ListItem>OTHERS</asp:ListItem>
			</asp:DropDownList>
&nbsp;<font color="red">*)</font> </td>
<tr> 
          <td class="tdgenap">Cylinder</td>
          <td class="tdganjil">
			<asp:TextBox runat="server" id="TbxCylinder" CssClass="inptype">0</asp:TextBox> 
&nbsp;<font color="red">*) if asset type automotive/motorcycle, if final level</font> </td>
        </tr>
		<tr> 
          <td class="tdgenap">Transmission</td>
          <td class="tdganjil">
			<asp:RadioButtonList runat="server" id="RbtnTransmission" RepeatDirection="Horizontal">
				<asp:ListItem Value="MT">Manual</asp:ListItem>
				<asp:ListItem Value="AT">Automatic</asp:ListItem>
          
          </asp:RadioButtonList>  
			<font color="red">*) if asset type automotive/motorcycle, if final level</font> </td>
        </tr>
      <tr> 
          <td class="tdgenap">Fuel Type</td>
          <td class="tdganjil">
			<asp:RadioButtonList runat="server" id="RbtnFuelType" RepeatDirection="Horizontal">
				<asp:ListItem Value="Di">Diesel</asp:ListItem>
				<asp:ListItem Value="Ga">Gasoline</asp:ListItem>
          
          </asp:RadioButtonList>  		
			<font color="red">*) if asset type automotive, if final level</font></td>
        </tr>
 <tr> 
          <td class="tdgenap">Price</td>
          <td class="tdganjil">
			<asp:RadioButtonList runat="server" id="RbtnPrice" RepeatDirection="Horizontal">
				<asp:ListItem Value="On">On the Road</asp:ListItem>
				<asp:ListItem Value="Off">Off the Road</asp:ListItem>
          
          </asp:RadioButtonList>  		
			<font color="red">*) if final level</font> </td>
        </tr>

 <tr> 
          <td class="tdgenap">Resale Value ( % )</td>
          <td class="tdganjil">
			<asp:TextBox runat="server" id="TbnResaleValue" CssClass="inptype">0</asp:TextBox>
&nbsp;<font color="red">*) if final level</font> </td>
        </tr>
        <tr> 
          <td class="tdgenap">Resale Value Category</td>
          <td class="tdganjil">
			<asp:TextBox runat="server" id="TbxResaleValueCategory" CssClass="inptype">A</asp:TextBox>
&nbsp;<font color="red">*) if final level</font> </td>
        </tr>

        <tr> 
          <td class="tdgenap">IsActive</td>
          <td class="tdganjil">
			<asp:CheckBox runat="server" id="CbxIsActive" Checked="True" /> </td>
        </tr>
         <tr> 
          <td class="tdgenap">Notes</td>
          <td class="tdganjil">
          <asp:TextBox runat="server" id="TbxNotes" CssClass="inptype" Height="75px" Width="206px" Rows="10" Columns="50" TextMode="MultiLine">
			Asset Code Automotive</asp:TextBox> <font color="red">*) if final level</font>

			</td>
        </tr>

      </table>
    </div>
    
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif" PostBackUrl="AssetMasterListing.aspx" />  
		&nbsp;  
		<asp:ImageButton runat="server" id="BtnCancel" ImageUrl="../../images/ButtonCancel.gif" PostBackUrl="AssetMasterListing.aspx" />
		</td>
    </tr>
    
  </table>
</div>
</form>
</body>
</html>
