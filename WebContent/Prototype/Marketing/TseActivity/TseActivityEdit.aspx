<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Tele Sales Activity</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
<style type="text/css">
.style1 {
	font-family: Verdana;
	color: #FF0000;
}
</style>
</head><body><form id="frmTelesalesAct" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">TELE SALES ACTIVITY</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap">Customer Name</td>
      <td width="80%" class="tdganjil" colspan="3">
      <asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="../Credit/ViewCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx</asp:HyperLink>
		</td>
    </tr>
    <tr>
      <td width="20%" class="tdgenap">Address</td>
      <td width="80%" class="tdganjil" colspan="3">
      xxxxxxxx50xxxxxxxx</td>		
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Kelurahan</td>
      <td width="80%" class="tdganjil" colspan="3">
      xxxxxxxx50xxxxxxxx</td>		
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Kecamatan</td>
      <td width="80%" class="tdganjil" colspan="3">
      xxxxxxxx50xxxxxxxx</td>		
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">City</td>
      <td width="80%" class="tdganjil" colspan="3">
      xxxxxxxx30xxxxxxxx</td>		
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Zip Code</td>
      <td width="80%" class="tdganjil" colspan="3">
      999999</td>		
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Email</td>
      <td width="30%" class="tdganjil">
      xxxxxxxx30xxxxxxxx</td>
      <td width="20%" class="tdgenap">Birthday</td>
      <td width="30%" class="tdganjil">
      <asp:Label runat="server" Text="Label" id="lblBirthday0">dd-mmm</asp:Label>
		</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Phone No</td>
      <td width="30%" class="tdganjil">
      xx4xx - xxxxx10xxxxxx</td>
      <td width="20%" class="tdgenap">Profession</td>
      <td width="30%" class="tdganjil">
      xxxxxxxx20xxxxxxxx</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Mobile Phone No</td>
      <td width="30%" class="tdganjil">
      xx4xx - xxxxx10xxxxxx</td>
      <td width="20%" class="tdgenap">Religion</td>
      <td width="30%" class="tdganjil">
      xxxxx10xxxxx</td>
    </tr>
    <tr>
      <td width="20%" class="tdgenap">Source of Data</td>
      <td class="tdganjil" style="width: 40%">
      xxxxx10xxxxx</td>
      <td class="tdgenap" style="width: 25%">
      Source of Application</td>
      <td class="tdganjil">
      xxxxx10xxxxx</td>
      	</tr>
    <tr> 
      <td width="20%" class="tdgenap">Priority</td>
      <td width="30%" class="tdganjil">
      xxxxx10xxxxx</td>
      <td width="20%" class="tdgenap">Assigned Date</td>
      <td width="30%" class="tdganjil">
		dd-mm-yyyy</td>				
    </tr>
    <tr>
      <td width="20%" class="tdgenap">Status</td>
      <td class="tdganjil" colspan="3" style="width: 60%">
      <asp:DropDownList runat="server" id="DropDownList1">
		<asp:ListItem>Open</asp:ListItem>
		<asp:ListItem>Close</asp:ListItem>
		<asp:ListItem>Prospect</asp:ListItem>
		<asp:ListItem Enabled="False">Funding</asp:ListItem>
		</asp:DropDownList>
		</td>
      	</tr>
    <tr>
      <td width="20%" class="tdgenap">Product Offering</td>
      <td class="tdganjil" colspan="3" style="width: 60%">
      <asp:TextBox runat="server" id="txtProductOfferingID" CssClass="inptype" Enabled="False" Width="338px">
		</asp:TextBox>
        <font color="red">&nbsp;<img src="../../Images/icondetail.gif" align="top"></font></td>
      	</tr>
    <tr>
      <td width="20%" class="tdgenap">Is Valid</td>
      <td class="tdganjil" colspan="3" style="width: 60%">
      <asp:CheckBox runat="server" id="chkIsValid" Checked="True" /></td>
    </tr>
    </table>
    <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdtopihijau"> 
      <td colspan="2">LAST ACTIVITY</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Last Activity Date</td>
      <td width="80%" class="tdganjil">
      <asp:Label runat="server" Text="Label" id="lblLastActDate">dd-mm-yyyy</asp:Label></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap" style="height: 17px">Last Activity Type</td>
      <td width="80%" class="tdganjil" style="height: 17px">xxxxxxxx20xxxxxxxx</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Last Activity Result</td>
      <td width="80%" class="tdganjil">xxxxxxxx50xxxxxxxx</td>
    </tr>
    <tr class="tdtopihijau">
      <td colspan="2">ACTIVITY</td>
    </tr>
	<tr>
      <td width="20%" class="tdgenap">Activity Date</td>
      <td width="80%" class="tdganjil">
      <asp:Label runat="server" Text="Label" id="lblLastActDate0">dd-mm-yyyy</asp:Label></td>
    	</tr>
		<tr>
      <td width="20%" class="tdgenap">Activity Type</td>
      <td width="80%" class="tdganjil">
		<asp:RadioButtonList runat="server" id="rdoActivityType" RepeatDirection="Horizontal" AutoPostBack="true">
			<asp:ListItem Selected="True">Phone</asp:ListItem>
			<asp:ListItem Value="Mail">Direct Mail</asp:ListItem>
			<asp:ListItem>SMS</asp:ListItem>
			<asp:ListItem Value="EmailFax">Email/Fax</asp:ListItem>
			<asp:ListItem>Other</asp:ListItem>
		</asp:RadioButtonList>
		</td>
    </tr>
	<% if rdoActivityType.SelectedValue <> "Other" Then %>
	<tr>
      <td width="20%" class="tdgenap" style="height: 18px">Result Status</td>
      <td width="80%" class="tdganjil" style="height: 18px">
  		<% if rdoActivityType.SelectedValue = "Phone" Then %>
		<asp:DropDownList runat="server" id="cboResultStatus" AutoPostBack="true">
			<asp:ListItem Value="Invalid">Unconnect - Invalid</asp:ListItem>
			<asp:ListItem Value="NoPhone">Unconnect - No Phone</asp:ListItem>
			<asp:ListItem Value="NobodyPick">Connect - Nobody Pick Up
			</asp:ListItem>
			<asp:ListItem Value="Busy">Connect - Busy Line</asp:ListItem>
			<asp:ListItem Value="MissCust">Contact - Miss Customer
			</asp:ListItem>
			<asp:ListItem Value="AlreadyMoved">Contact - Already Moved
			</asp:ListItem>
			<asp:ListItem Value="WrongNumber">Contact - Wrong Number
			</asp:ListItem>
			<asp:ListItem Value="Reschedule">Contact - Reschedule</asp:ListItem>
			<asp:ListItem Value="Interested">Contact - Interested</asp:ListItem>
			<asp:ListItem Value="Uninterested">Contact - Uninterested
			</asp:ListItem>  					
		</asp:DropDownList>
    	<% Else If rdoActivityType.SelectedValue = "SMS" Then %>
		<asp:DropDownList runat="server" id="cboAssignStatus" AutoPostBack="true">    	
			<asp:ListItem Value="AssignQS">Assigned to QS</asp:ListItem>
			<asp:ListItem Value="NotAssignQS">Not Assigned to QS</asp:ListItem>	 	
		</asp:DropDownList>      	
    	<% Else If rdoActivityType.SelectedValue = "Mail" or rdoActivityType.SelectedValue = "EmailFax" Then %>
		<asp:DropDownList runat="server" id="cboMailStatus" AutoPostBack="true">    	
			<asp:ListItem Value="NotSend">Not Sent</asp:ListItem>    	
    		<asp:ListItem Value="Send">Sent</asp:ListItem>    	
		</asp:DropDownList>    		
    	<% End If %>	    	
		<span class="style1">&nbsp;*)</span></td>
    </tr>
    <% End If %>
	<% if cboResultStatus.SelectedValue = "Reschedule" or cboResultStatus.SelectedValue = "NobodyPick" or	cboResultStatus.SelectedValue = "Busy" or cboResultStatus.SelectedValue = "MissCust" Then%>        
    <tr> 
      <td width="20%" class="tdgenap">Reschedule Date</td>
      <td width="80%" class="tdganjil">
      <asp:TextBox runat="server" id="txtRescheduleDate" Width="94px" CssClass="inptype"></asp:TextBox>
        <font color="red">&nbsp;<img src="../../Images/iconcalendar.gif" width="20" height="20" align="top"> 
		*)</font></td>
    </tr>    
	<%Else If rdoActivityType.SelectedValue = "SMS" Then%>        	
    <tr> 
      <td width="20%" class="tdgenap">Assign QS Date</td>
      <td width="80%" class="tdganjil">
      <asp:TextBox runat="server" id="txtAssignDate" Width="94px" CssClass="inptype"></asp:TextBox>
        <font color="red">&nbsp;<img src="../../Images/iconcalendar.gif" width="20" height="20" align="top"> 
		*)</font></td>
    </tr>
    <%Else If rdoActivityType.SelectedValue = "Mail" or rdoActivityType.SelectedValue = "EmailFax" Then%>        	
    <tr> 
      <td width="20%" class="tdgenap">Send Date</td>
      <td width="80%" class="tdganjil">
      <asp:TextBox runat="server" id="txtSendDate" Width="94px" CssClass="inptype"></asp:TextBox>
        <font color="red">&nbsp;<img src="../../Images/iconcalendar.gif" width="20" height="20" align="top"> 
		*)</font></td>
    </tr>
    <%End If%>    
    <tr> 
      <td width="20%" class="tdgenap">Attention To Supervisor</td>
      <td width="80%" class="tdganjil">
      <asp:CheckBox runat="server" id="chkAttSupervisor" Checked="True" />
		</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Result Description</td>
      <td width="80%" class="tdganjil">
      <asp:TextBox runat="server" id="txaResultDesc" Width="350px" TextMode="MultiLine" Height="50px">
		</asp:TextBox>
		</td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30"><strong>
		<a target="_blank" href="ViewTseActivityHist.aspx">Telesales Activity History</a></strong></td>
      <td width="50%" align="right">&nbsp;</td>
    </tr>
    <tr> 
      <td width="50%" height="30">
		&nbsp;</td>
      <td width="50%" align="right">&nbsp;<asp:ImageButton id="imbSave" imageurl="../../Images/ButtonSave.gif" runat="server" PostBackUrl="TseActivity.aspx"></asp:ImageButton>
		&nbsp;<asp:ImageButton id="imbCancel" imageurl="../../Images/ButtonCancel.gif" runat="server" PostBackUrl="TseActivity.aspx"></asp:ImageButton>
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
