<%@ Page Language="vb" AutoEventWireup="false" Codebehind="CollLetterField.aspx.vb" Inherits="AdIns.Application.Eloan.Web.Collection.CollLetterField"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>LetterTemplate</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../../include/collection.css" type="text/css" rel="stylesheet">
		<SCRIPT src="../../Elsa.js"></SCRIPT>
		<script language="javascript">
			function fConfirm() {
				if (window.confirm("Are you sure want to delete this record?")) 
					return true;
				else
					return false;
			}
			function fback() {
					history.go(-1);
					return false;
			}	
			
			
		</script>
	</HEAD>
	<body vLink="blue" aLink="black" link="blue">
		<form id="Form1" method="post" runat="server">
			<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<tr>
					<td><asp:label id="lblMessage" runat="server" forecolor="#993300" font-name="Verdana" font-size="11px"></asp:label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				</tr>
			</TABLE>
			<asp:panel id="pnlField" runat="server">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopikuning">
						<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopi" align="center">FIELD
						</TD>
						<TD class="tdtopikanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<ASP:DATAGRID id="dtgFieldName" runat="server" width="100%" cellpadding="0" onsortcommand="Sorting"
								backcolor="White" borderwidth="1px" borderstyle="None" bordercolor="#CCCCCC" datakeyfield="fieldName"
								autogeneratecolumns="False" allowsorting="True" allowpaging="True">
								<SelectedItemStyle CssClass="tdgenap"></SelectedItemStyle>
								<AlternatingItemStyle CssClass="tdgenap"></AlternatingItemStyle>
								<ItemStyle CssClass="tdganjil"></ItemStyle>
								<HeaderStyle CssClass="tdjudul"></HeaderStyle>
								<FooterStyle ForeColor="#000066" BackColor="White"></FooterStyle>
								<Columns>
									<asp:TemplateColumn SortExpression="Description" HeaderText="Description">
										<HeaderStyle Font-Underline="True" HorizontalAlign="Center" Height="30px"></HeaderStyle>
										<ItemStyle HorizontalAlign="left" Width="50%"></ItemStyle>
										<ItemTemplate>
											<asp:Literal id="ltlDescription" runat="server" Visible="true" text='<%#Container.DataItem("Description")%>'>
											</asp:Literal>
											<asp:Literal id="ltlFieldName" runat="server" Visible="false" text='<%#Container.DataItem("FieldName")%>'>
											</asp:Literal>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn SortExpression="TagName" HeaderText="TAG NAME">
										<HeaderStyle Font-Underline="True" HorizontalAlign="Center" Height="30px"></HeaderStyle>
										<ItemStyle HorizontalAlign="left" Width="50%"></ItemStyle>
										<ItemTemplate>
											<asp:Literal id="ltlTagName" runat="server" Visible="true" text='<%#Container.DataItem("TagName")%>'>
											</asp:Literal>
										</ItemTemplate>
									</asp:TemplateColumn>
								</Columns>
								<PagerStyle Visible="False" HorizontalAlign="Left" ForeColor="#000066" BackColor="White" Mode="NumericPages"></PagerStyle>
							</ASP:DATAGRID></TD>
					</TR>
				</TABLE>
				<TABLE height="25" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<ASP:IMAGEBUTTON id="imbFirstPage" runat="server" imageurl="../../images/butkiri1.gif" commandname="First"
								oncommand="NavigationLink_Click"></ASP:IMAGEBUTTON>&nbsp;&nbsp;
							<ASP:IMAGEBUTTON id="imbPrevPage" runat="server" imageurl="../../images/butkiri.gif" commandname="Prev"
								oncommand="NavigationLink_Click"></ASP:IMAGEBUTTON>&nbsp;&nbsp;
							<ASP:IMAGEBUTTON id="imbNextPage" runat="server" imageurl="../../images/butkanan.gif" commandname="Next"
								oncommand="NavigationLink_Click"></ASP:IMAGEBUTTON>&nbsp;&nbsp;
							<ASP:IMAGEBUTTON id="imbLastPage" runat="server" imageurl="../../images/butkanan1.gif" commandname="Last"
								oncommand="NavigationLink_Click"></ASP:IMAGEBUTTON></TD>
						<TD style="WIDTH: 245px" align="center" width="245">Page
							<ASP:TEXTBOX id="txtpage" runat="server" width="34px" maxlength="3" CssClass="inptype">1</ASP:TEXTBOX>&nbsp;
							<ASP:IMAGEBUTTON id="imbGoPage" runat="server" width="30" imageurl="../../images/butgo.gif" BorderColor="White"
								cssclass="inptype"></ASP:IMAGEBUTTON>
							<ASP:RANGEVALIDATOR id="rgvGo" runat="server" type="Integer" maximumvalue="999999999" errormessage="Page no. is not valid"
								minimumvalue="1" controltovalidate="txtpage" Display="Dynamic"></ASP:RANGEVALIDATOR>
							<ASP:REQUIREDFIELDVALIDATOR id="rfvGo" runat="server" errormessage="Page no. is not valid" controltovalidate="txtpage"
								Display="Dynamic"></ASP:REQUIREDFIELDVALIDATOR></TD>
						&nbsp;&nbsp;
						<TD align="right"><FONT color="#999999">Page
								<ASP:LABEL id="lblPage" runat="server" forecolor="#999999"></ASP:LABEL>&nbsp;of
								<ASP:LABEL id="lblTotPage" runat="server" forecolor="#999999"></ASP:LABEL>, 
								Total
								<ASP:LABEL id="lblRecord" runat="server" forecolor="#999999"></ASP:LABEL>&nbsp;record(s)</FONT></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<DIV align="right">
								<asp:imagebutton id="imbBack" runat="server" imageurl="../../Images/ButtonBack.gif" causesvalidation="False"></asp:imagebutton></DIV>
						</TD>
					</TR>
				</TABLE>
			</asp:panel></form>
	</body>
</HTML>
