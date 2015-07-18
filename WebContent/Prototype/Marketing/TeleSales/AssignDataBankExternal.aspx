<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Assign Databank External</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head><body><form id="frmAssignDataBankExternal" runat="server">
<div align="center">
<table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>

 <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">DATABANK EXTERNAL LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
    <div align="center">
    <asp:GridView runat="server" id="GrdListAgreement" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="BRANCH ID">
		</asp:boundfield>
		<asp:templatefield HeaderText="NAME">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="../../Credit/ViewCompanyCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="Address">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
      
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
    </div>

  
    <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      
      <td width="50%" align="right">
   
        &nbsp;</td>
    </tr>
  </table>

   <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdtopihijau"> 
      <td colspan="2">ASSIGNMENT <font color="red"><i>*) </i></font></td>
    </tr>
    <tr>
    <td width="20%" class="tdgenap">SOD (Source Of Data)</td>
    <td width="30%" class="tdganjil"><asp:dropdownlist runat="server" cssclass="inptype" width="100"></asp:dropdownlist></td>
  </tr>
  <tr>
    <td width="20%" class="tdgenap">Source Of Application</td>
    <td width="30%" class="tdganjil"><asp:dropdownlist id="ddlSourceOfApplication" runat="server" width="100"></asp:dropdownlist ></td>
  </tr>
    <tr>
      <td width="20%" class="tdgenap" style="height: 25px">DataBank Type</td>
      <td width="80%" class="tdganjil" style="height: 25px">
		<asp:DropDownList runat="server" id="DDLDataBankType" Width="97px" Height="17px">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem>Birthday</asp:ListItem>
			<asp:ListItem>Will Mature</asp:ListItem>
			<asp:ListItem>External</asp:ListItem>
		</asp:DropDownList>
     </tr>
<tr>
      <td width="20%" class="tdgenap" style="height: 25px">Priority</td>
      <td width="80%" class="tdganjil" style="height: 25px">
		<asp:DropDownList runat="server" id="DDLPriority" Width="97px" Height="17px">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem>1.High</asp:ListItem>
			<asp:ListItem>2.Medium</asp:ListItem>
			<asp:ListItem>3.Low</asp:ListItem>
			<asp:ListItem>4.Very Low</asp:ListItem>
		</asp:DropDownList>
     </tr>
      <tr> 
      <td width="20%" class="tdgenap">Tele Sales </td>
      <td width="80%" class="tdganjil" colspan="3">
		<asp:TextBox runat="server" id="TxtTSE" Width="141px" CssClass="inptype" TabIndex="1"></asp:TextBox>
		<font color="red">
		&nbsp;<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucTSE" runat="server" NavigateUrl="../../Lookup/EmployeeLookup.htm" Target="_blank"></asp:Hyperlink>
      </font> 
	
    </tr>
   <tr> 
      <td width="20%" class="tdgenap">O/S Quota</td>
      <td width="80%" class="tdganjil" colspan="3">99 </td>
   </tr>
    <tr> 
      <td width="20%" class="tdgenap">Assigned Date</td>
      <td width="80%" class="tdganjil" colspan="3">
    dd-mm-yyyy</tr>
        <tr> 
      <td width="20%" class="tdgenap">End Date</td>
      <td width="80%" class="tdganjil" colspan="3">
			<asp:TextBox runat="server" id="txtExpiredDate" Width="83px" CssClass="inptype" TabIndex="17"></asp:TextBox>
        <font color="red">&nbsp;<img src="../Images/iconcalendar.gif" width="20" height="20" align="top"> </font> </td></td>				
    </tr>
 <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Status</td>
      <td width="80%" class="tdganjil" style="height: 25px">
		Open
     </tr>

     

  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" align="left">
		&nbsp;</td>
	  <td width="50%" align="right">&nbsp;
	  <asp:ImageButton id="imbSaveExit" imageurl="../../Images/ButtonSave.gif" runat="server" PostBackUrl="DataBankExternal.aspx"></asp:ImageButton>
		&nbsp;<asp:ImageButton id="imbCancel" imageurl="../../Images/ButtonCancel.gif" runat="server" PostBackUrl="DataBankExternal.aspx"></asp:ImageButton>
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
