<%@ Page Language="vb" AutoEventWireup="false" Codebehind="CasesSetting.aspx.vb" Inherits="AdIns.Application.Eloan.Web.Collection.CasesSetting" %>
<%@ Register TagPrefix="uc1" TagName="UcSearchBy" Src="../../UserController/UcSearchBy.ascx" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>Master Cases Maintenance</title>
		<meta content="Microsoft Visual Studio.NET 7.0" name="GENERATOR">
		<meta content="Visual Basic 7.0" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../../Include/Collection.css" type="text/css" rel="stylesheet">
		<SCRIPT src="../../Elsa.js"></SCRIPT>
	</HEAD>
	<body vLink="blue" aLink="black" link="blue" ms_positioning="GridLayout">
		<form id="Form1" method="post" runat="server">
			<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<tr>
					<td><asp:label id="lblMessage" runat="server" font-size="11px" font-name="Verdana" forecolor="#993300"></asp:label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				</tr>
			</TABLE>
			<asp:panel id="pnlList" runat="server">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopi" align="center">CASES</TD>
						<TD class="tdtopikanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<UC1:UCSEARCHBY id="oSearchBy" runat="server"></UC1:UCSEARCHBY>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<DIV align="right">
								<ASP:IMAGEBUTTON id="imgsearch" runat="server" width="100" height="20" imageurl="../../Images/ButtonSearch.gif"></ASP:IMAGEBUTTON>
								<ASP:IMAGEBUTTON id="imbReset" runat="server" imageurl="../../Images/ButtonReset.gif" causesvalidation="False"></ASP:IMAGEBUTTON></DIV>
						</TD>
					</TR>
				</TABLE>
				<ASP:PANEL id="pnlDatagrid" runat="server">
					<BR>
					<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
						<TR class="trtopikuning">
							<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
							<TD class="tdtopi" align="center">CASES LISTING</TD>
							<TD class="tdtopikanan" width="10">&nbsp;</TD>
						</TR>
					</TABLE>
					<TABLE class="tablegrid" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
						<TR>
							<TD>
							<asp:DataGrid id="DtgCasesSetting" runat="server" cellpadding="0" allowsorting="True" autogeneratecolumns="False"
								bordercolor="#CCCCCC" borderstyle="None" borderwidth="1px" backcolor="White" onsortcommand="SortGrid"
								width="100%" HorizontalAlign="Center">
								<AlternatingItemStyle Height="20px" CssClass="tdgenap"></AlternatingItemStyle>
								<ItemStyle Height="20px" CssClass="tdganjiln"></ItemStyle>
								<HeaderStyle Font-Bold="True" HorizontalAlign="Center" Height="30px" CssClass="tdjudul"></HeaderStyle>
									<Columns>
										<asp:TemplateColumn SortExpression="CasesID" HeaderText="CASES ID">
											<HeaderStyle Font-Underline="True" HorizontalAlign="Center" Height="30px"></HeaderStyle>
											<ItemStyle HorizontalAlign="Left" Width="15%"></ItemStyle>
											<ItemTemplate>
												<ASP:LABEL id=lblCasesID runat="server" text='<%#Container.DataItem("CasesID")%>'>
												</ASP:LABEL>
											</ItemTemplate>
										</asp:TemplateColumn>
										<asp:TemplateColumn SortExpression="Description" HeaderText="DESCRIPTION">
											<HeaderStyle Font-Underline="True" HorizontalAlign="Center" Height="30px"></HeaderStyle>
											<ItemStyle HorizontalAlign="Left" Width="50%"></ItemStyle>
											<ItemTemplate>
												<ASP:LABEL id=lblDescription runat="server" text='<%#Container.DataItem("Description")%>'>
												</ASP:LABEL>
											</ItemTemplate>
										</asp:TemplateColumn>
										<asp:TemplateColumn HeaderText="EDIT">
											<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
											<ItemStyle HorizontalAlign="Center"></ItemStyle>
											<ItemTemplate>
												<ASP:IMAGEBUTTON id="imbEdit" runat="server" imageurl="../../Images/IconEdit.gif" causesvalidation="False"
													commandname="EDIT"></ASP:IMAGEBUTTON>
											</ItemTemplate>
										</asp:TemplateColumn>
										<asp:TemplateColumn HeaderText="DELETE">
											<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
											<ItemStyle HorizontalAlign="Center"></ItemStyle>
											<ItemTemplate>
												<ASP:IMAGEBUTTON id="imbDelete" runat="server" imageurl="../../Images/IconDelete.gif" causesvalidation="False"
													commandname="DELETE"></ASP:IMAGEBUTTON>
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
								<ASP:IMAGEBUTTON id="imbFirstPage" runat="server" imageurl="../../images/butkiri1.gif" oncommand="NavigationLink_Click"
									commandname="First"></ASP:IMAGEBUTTON>&nbsp;&nbsp;
								<ASP:IMAGEBUTTON id="imbPrevPage" runat="server" imageurl="../../images/butkiri.gif" oncommand="NavigationLink_Click"
									commandname="Prev"></ASP:IMAGEBUTTON>&nbsp;&nbsp;
								<ASP:IMAGEBUTTON id="imbNextPage" runat="server" imageurl="../../images/butkanan.gif" oncommand="NavigationLink_Click"
									commandname="Next"></ASP:IMAGEBUTTON>&nbsp;&nbsp;
								<ASP:IMAGEBUTTON id="imbLastPage" runat="server" imageurl="../../images/butkanan1.gif" oncommand="NavigationLink_Click"
									commandname="Last"></ASP:IMAGEBUTTON></TD>
							<TD style="WIDTH: 245px" align="center" width="245">Page
								<ASP:TEXTBOX id="txtpage" runat="server" width="34px" maxlength="3">1</ASP:TEXTBOX>&nbsp;
								<ASP:IMAGEBUTTON id="imbGoPage" runat="server" width="30" imageurl="../../images/butgo.gif" cssclass="inptype"
									BorderColor="White"></ASP:IMAGEBUTTON>
								<ASP:RANGEVALIDATOR id="rgvGo" runat="server" Display="Dynamic" controltovalidate="txtpage" minimumvalue="1"
									errormessage="Page no. is not valid" maximumvalue="999999999" type="Integer"></ASP:RANGEVALIDATOR>
								<ASP:REQUIREDFIELDVALIDATOR id="rfvGo" runat="server" Display="Dynamic" controltovalidate="txtpage" errormessage="Page no. is not valid"></ASP:REQUIREDFIELDVALIDATOR></TD>
							&nbsp;&nbsp;
							<TD align="right"><FONT color="#999999">Page
									<ASP:LABEL id="lblPage" runat="server" forecolor="#999999"></ASP:LABEL>&nbsp;of
									<ASP:LABEL id="lblTotPage" runat="server" forecolor="#999999"></ASP:LABEL>, 
									Total
									<ASP:LABEL id="lblRecord" runat="server" forecolor="#999999"></ASP:LABEL>&nbsp;record(s)</FONT></TD>
						</TR>
					</TABLE>
					<TABLE height="30" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
						<TR>
							<TD align="left">
								<ASP:IMAGEBUTTON id="imbPrint" runat="server" imageurl="../../images/buttonprint.gif"></ASP:IMAGEBUTTON></TD>
							<TD align="right">
								<ASP:IMAGEBUTTON id="ImgAddNew" runat="server" imageurl="../../Images/ButtonAdd.gif"></ASP:IMAGEBUTTON></TD>
						</TR>
					</TABLE>
				</ASP:PANEL>
			</asp:panel><asp:panel id="pnlAdd" runat="server">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopikuning">
						<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopi" align="center">
							<ASP:LABEL id="lblTitle" runat="server"></ASP:LABEL></TD>
						<TD class="tdtopikanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
					<TR>
						<TD class="tdgenap" width="25%">
							<DIV align="left">Cases ID</DIV>
						</TD>
						<TD class="tdganjil" colSpan="3">
							<ASP:TEXTBOX id="txtCasesID" runat="server" maxlength="10" CssClass="inptype"></ASP:TEXTBOX>
							<ASP:REQUIREDFIELDVALIDATOR id="Requiredfieldvalidator1" runat="server" font-name="Verdana" font-size="11px"
								controltovalidate="txtCasesID" errormessage="Please Fill Cases ID" display="Dynamic"></ASP:REQUIREDFIELDVALIDATOR></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="25%">
							<DIV align="left">Description</DIV>
						</TD>
						<TD class="tdganjil" colSpan="3">
							<ASP:TEXTBOX id="txtDescription" runat="server" width="475px" maxlength="100" CssClass="inptype"></ASP:TEXTBOX>
							<ASP:REQUIREDFIELDVALIDATOR id="Requiredfieldvalidator3" runat="server" font-name="Verdana" font-size="11px"
								controltovalidate="txtDescription" errormessage="Please Fill Description" display="Dynamic"></ASP:REQUIREDFIELDVALIDATOR></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD align="right">
							<ASP:IMAGEBUTTON id="btnSaveAdd" runat="server" imageurl="../../Images/ButtonSave.gif" causesvalidation="True"></ASP:IMAGEBUTTON>
							<ASP:IMAGEBUTTON id="btnCancelAdd" runat="server" imageurl="../../Images/ButtonCancel.gif" causesvalidation="False"></ASP:IMAGEBUTTON></TD>
					</TR>
				</TABLE>
			</asp:panel></form>
	</body>
</HTML>
