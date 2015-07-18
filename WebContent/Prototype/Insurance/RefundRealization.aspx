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
<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
	<TR class="trtopiabu">
		<TD class="tdtopiabukiri" width="10" height="20">&nbsp;</TD>
		<TD class="tdtopiabu" align="center">REFUND REALIZATION</TD>
		<TD class="tdtopiabukiri" width="10">&nbsp;</TD>
	</TR>
</TABLE>
<TABLE class="tablegrid" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
					<TR>
						<TD class="tdgenap" width="15%">Branch
						</TD>
						<TD class="tdganjil" width="30%">
							<asp:DropDownList id="ddlBranch" runat="server">
								<asp:ListItem>Select One</asp:ListItem>
								<asp:ListItem>Jakarta Electronic</asp:ListItem>
							</asp:DropDownList>
						 <FONT color="#ff0033">
								*)</FONT>
						</TD>
						<TD class="tdgenap" width="15%">
							<DIV align="left">Search By</DIV>
						</TD>
						<TD class="tdganjil" width="35%" colSpan="3">
						<asp:DropDownList id="cbosearchby" runat="server">
								<asp:ListItem>Select One</asp:ListItem>
								<asp:ListItem>Agreement No</asp:ListItem>
								<asp:ListItem>Customer Name</asp:ListItem>

							</asp:DropDownList>

						</TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<DIV align="right">
								<asp:imagebutton id="imgsearch" runat="server" width="100" height="20" imageurl="../Images/ButtonSearch.gif"></asp:imagebutton>
								<asp:imagebutton id="imbReset" runat="server" imageurl="../Images/ButtonReset.gif" causesvalidation="False"></asp:imagebutton></DIV>
						</TD>
					</TR>
				</TABLE>


</form>

</body>

</html>
