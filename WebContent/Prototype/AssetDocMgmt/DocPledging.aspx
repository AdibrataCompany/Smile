<%@ Page Language="vb" AutoEventWireup="false" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>DocPledging</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../Confins.css" type="text/css" rel="stylesheet">
		
	</HEAD>
	<body MS_POSITIONING="GridLayout">
		<form id="Form1" runat="server">
<div align="center"> 		
			
			<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
			<TR class="trtopiabu">
						<TD class="tdtopimerahkiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopimerah" align="center">DOCUMENT PLEDGE</TD>
						<TD class="tdtopimerahkanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" border="0">
					<TR class="tdganjil">
						<TD class="tdgenap" width="20%">Funding Company/ Branch</TD>
						<TD class="tdganjil">
							<asp:DropDownList id=drdCompany runat="server" Width="123px" Height="16px" >
							<asp:ListItem Text="All"></asp:ListItem>
							<asp:ListItem Text="BII"></asp:ListItem>
							<asp:ListItem Text="BCA"></asp:ListItem>
							</asp:DropDownList></TD>
					</TR>
					<TR class="tdganjil">
						<TD class="tdgenap" width="20%">Contract No</TD>
						<TD class="tdganjil">
							<asp:DropDownList id=drdContract runat="server" >
							</asp:DropDownList></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Batch Date</TD>
						<TD class="tdganjil">
							<asp:DropDownList id="drdBatchDate" runat="server" ></asp:DropDownList></TD>
					</TR>
					<tr> 
      <td width="25%" class="tdgenap">Search By</td>
      <td  class="tdganjil">
 		  <asp:DropDownList runat="server" ID="DDLSearchBy">
 		     <asp:ListItem Text="Agreement No" Selected="True"></asp:ListItem>
 		     <asp:ListItem Text="Applicationid"></asp:ListItem>
 		     <asp:ListItem Text="Customer Name"></asp:ListItem>
 		     <asp:ListItem Text="Asset Description"></asp:ListItem>
 		     <asp:ListItem Text="License Plate"></asp:ListItem>
   		     <asp:ListItem Text="Status"></asp:ListItem>
   		      <asp:ListItem Text="Engine No"></asp:ListItem>
   		     
 		      		      		      		      		     
 		  </asp:DropDownList> 
 		  &nbsp;    	
		<asp:TextBox runat="server" ID="TxtSearchBy" CssClass="inptype" TabIndex="17"></asp:TextBox>	
		</td>
    </tr>

				</TABLE>
				
				<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
					<TR>
						<TD width="50%" height="30">&nbsp;</TD>
						<TD align="right" width="50%">
							<asp:imagebutton id="imbSearch" runat="server" ImageUrl="../Images/ButtonSearch.gif" PostBackUrl="DocPledgingDetail.aspx"></asp:imagebutton>
							<asp:imagebutton id="imbReset" Runat="server" ImageUrl="../Images/ButtonReset.gif"></asp:imagebutton></TD>
					</TR>
				</TABLE>
</div>				
</form>
	</body>
</HTML>
