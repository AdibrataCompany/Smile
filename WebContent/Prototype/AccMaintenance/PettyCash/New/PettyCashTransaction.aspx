<%@ Register TagPrefix="uc1" TagName="ucLookUpTransaction" Src="../../../../../UserController/ucLookUpTransaction.ascx" %>
<%@ Register TagPrefix="uc1" TagName="ValidDate" Src="../../../../../UserController/ValidDate.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcBankName" Src="../../../../../UserController/UcBankName.ascx" %>
<%@ Register TagPrefix="uc2" TagName="ValidDate" Src="../../../../../UserController/ValidDate.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcBankAccountID" Src="../../../../../UserController/UcBankAccountID.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcLookupEmployee" Src="../../../../../UserController/UcLookupEmployee.ascx" %>
<%@ Page Language="vb" AutoEventWireup="false" Codebehind="PettyCashTransaction.aspx.vb" Inherits="AdIns.Application.Eloan.Web.AccMnt.PettyCashTransaction"%>
<%@ Register TagPrefix="uc1" TagName="ucInputNumber" Src="../../../../../UserController/ucInputNumber.ascx" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>PDCMulti</title>
		<meta content="Microsoft Visual Studio.NET 7.0" name="GENERATOR">
		<meta content="Visual Basic 7.0" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<SCRIPT src="../../../../../Elsa.js"></SCRIPT>
		<LINK href="../../../../../Include/AccMnt.css" type="text/css" rel="stylesheet">
	</HEAD>
	<body vLink="blue" aLink="black" link="blue" ms_positioning="GridLayout">
		<form id="Form1" method="post" runat="server">
			&nbsp;
			<asp:label id="lblMessage" runat="server" font-size="11px" font-name="Verdana" forecolor="#FF0000"></asp:label><asp:panel id="PnlHeader" style="Z-INDEX: 101; LEFT: 0px; TOP: 504px" runat="server">
				<TABLE id="Table1" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopikuning">
						<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopi" align="center">PETTY CASH TRANSACTION</TD>
						<TD class="tdtopikanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD class="tdganjil" width="100%">
							<uc1:UcLookupEmployee id="oEmployeeName" runat="server"></uc1:UcLookupEmployee>
							<asp:Label id="lblErrEmployee" runat="server" ForeColor="Red"></asp:Label></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="1" width="95%" align="center" border="0">
					<TR>
						<TD class="tdgenap" width="20%">Bank Account</TD>
						<TD class="tdganjil" width="40%">
							<uc1:UcBankAccountID id="oFrombankAccount" runat="server"></uc1:UcBankAccountID><FONT color="red">*)</FONT>
							<INPUT id="hidCurrencyRateFrom" type="hidden" name="hidCurrencyRateFrom" runat="server"></TD>
						<TD class="tdgenap" width="5%">Date</TD>
						<TD class="tdganjil"  width="35%" colSpan="2">
							&nbsp;<asp:label id="lblBussinessDate" runat="server"></asp:label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Departement</TD>
						<TD class="tdganjil" width="40%">
							<DIV align="left">
								<asp:DropDownList id="cboDepartement" runat="server"></asp:DropDownList>
								<asp:RequiredFieldValidator id="RequiredFieldValidator1" runat="server" Visible="true" ErrorMessage="Please fill Departement"
									ControlToValidate="cboDepartement" Display="Dynamic" initialvalue="0"></asp:RequiredFieldValidator><FONT color="red">*)</FONT>
							</DIV>
						</TD>
						<TD class="tdgenap" width="5%">Amount
							<asp:textbox id="txtCurrencyIDFrom" runat="server" cssclass="inptype" MaxLength="20" BorderStyle="None"
								ReadOnly="True" Width="100%"></asp:textbox>
						</TD>
						<TD class="tdganjil" width="35%">
							<DIV align="left">
								<DIV align="left">
									<uc1:UCInputNumber id="txtAmount" runat="server" CssClass="inptype"></uc1:UCInputNumber>
								</DIV>
							</DIV>
						</TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="190">Description</TD>
						<TD class="tdganjil"width="30%" colSpan="4">
							<asp:TextBox id="txtDescription" runat="server" Width="448px" CssClass="inpType" maxlength="80"></asp:TextBox>
							<DIV align="left">
								<asp:RequiredFieldValidator id="RequiredFieldValidator3" runat="server" Visible="true" ErrorMessage="Please fill Description"
									ControlToValidate="txtDescription" Display="Dynamic"></asp:RequiredFieldValidator><FONT color="red">*)</FONT>
							</DIV>
						</TD>
					</TR>
				</TABLE>
				<TABLE id="Table4" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD width="50%" height="30">&nbsp;</TD>
						<TD align="right" width="50%">
							<asp:imagebutton id="imbNext" runat="server" imageurl="../../../../Images/ButtonNext.gif" causesvalidation="True" alt="Next"></asp:imagebutton>&nbsp;
							<asp:imagebutton id="imbReset" runat="server" imageurl="../../../../Images/ButtonReset.gif" causesvalidation="False" alt="Reset"></asp:imagebutton></TD>
					</TR>
				</TABLE>
			</asp:panel>&nbsp;<asp:panel id="pnlList" runat="server">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopikuning">
						<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopi" align="center">PETTY CASH TRANSACTION</TD>
						<TD class="tdtopikanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" align="center" border="0">
					<TR>
						<TD class="tdgenap" width="20%">Employee Name</TD>
						<TD class="tdganjil" width="30%">
							<asp:label id="lblEmployeeName" runat="server"></asp:label></TD>
						<TD class="tdgenap" width="10%">Date</TD>
						<TD class="tdganjil" width="40%" colSpan="2">
							<asp:label id="lblDate" runat="server"></asp:label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Bank Account</TD>
						<TD class="tdganjil" width="30%">
							<asp:label id="lblbankAccount" runat="server"></asp:label></TD>
						<TD class="tdgenap" width="10%">Amount</TD>
						<TD class="tdganjil" align="right" width="5%">
							<asp:literal id="ltlCurrencyID" runat="server"></asp:literal></TD>
						<TD class="tdganjil" align="right" width="35%">
							<asp:label id="lblAmount" runat="server"></asp:label></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" align="center" border="0">
					<TR>
						<TD class="tdgenap" width="20%">Departement</TD>
						<TD class="tdganjil">
							<asp:label id="lblDepartement" runat="server"></asp:label></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="20%">Description</TD>
						<TD class="tdganjil">
							<asp:label id="lblDescription" runat="server"></asp:label></TD>
					</TR>
				</TABLE>
				<asp:Panel id="pnlBG" Visible="False" Runat="server">
					<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" align="center" border="0">
						<TR>
							<TD class="tdjudul" colSpan="4">BILYET GIRO ENTRY</TD>
						</TR>
						<TR>
							<TD class="tdgenap" width="20%">Bilyet Giro No.</TD>
							<TD class="tdganjil" width="30%">
								<asp:DropDownList id="cboBilyet" runat="server"></asp:DropDownList></TD>
							<TD class="tdgenap" width="20%">Due Date</TD>
							<TD class="tdganjil" width="30%">
								<uc2:ValidDate id="oDueDate" runat="server"></uc2:ValidDate></TD>
						</TR>
					</TABLE>
				</asp:Panel>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" align="center" border="0">
					<TR>
						<TD class="tdjudul">TRANSACTION DETAIL</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR width="100%">
						<TD class="tdgenap">
							<uc1:ucLookUpTransaction id="oTrans" runat="server"></uc1:ucLookUpTransaction></TD>
					</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD width="50%" height="30">&nbsp;</TD>
						<TD align="right" width="50%">
							<asp:imagebutton id="btnAdd" runat="server" imageurl="../../../../Images/ButtonAdd.gif" causesvalidation="True" alt="Add"></asp:imagebutton>&nbsp;
							<asp:imagebutton id="btnCancel" runat="server" imageurl="../../../../Images/ButtonCancel.gif" causesvalidation="False" alt="Cancel"></asp:imagebutton></TD>
					</TR>
				</TABLE>
			</asp:panel><asp:panel id="pnlGrid" runat="server" Visible="False">
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopikuning">
						<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
						<TD class="tdtopi" align="center">TRANSACTION LIST</TD>
						<TD class="tdtopikanan" width="10">&nbsp;</TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<asp:datagrid id="DtgPCList" runat="server" Visible="False" width="100%" AutoGenerateColumns="False"
								bordercolor="#CCCCCC" borderstyle="None" backcolor="White" cellpadding="0" ShowFooter="True">
								<SelectedItemStyle CssClass="tdgenap"></SelectedItemStyle>
								<AlternatingItemStyle CssClass="tdgenap"></AlternatingItemStyle>
								<ItemStyle CssClass="tdganjil"></ItemStyle>
								<HeaderStyle CssClass="tdjudul"></HeaderStyle>
								<FooterStyle Font-Bold="True" Height="20px" CssClass="tdjudul"></FooterStyle>
								<Columns>
									<asp:TemplateColumn HeaderText="TRANSACTION" visible="false">
										<HeaderStyle HorizontalAlign="Center" Height="25px"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left" Width="30%"></ItemStyle>
										<ItemTemplate>
											<asp:label id="lblTransactionID2" runat="server" text='<%#Container.DataItem("TransactionID")%>'>
											</asp:label>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn HeaderText="TRANSACTION">
										<HeaderStyle HorizontalAlign="Center" Height="25px"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left" Width="30%"></ItemStyle>
										<ItemTemplate>
											<asp:label id="lblTransactionID" runat="server" text='<%#Container.DataItem("Transaction")%>'>
											</asp:label>
										</ItemTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn HeaderText="DESCRIPTION">
										<HeaderStyle HorizontalAlign="Center" Height="25px"></HeaderStyle>
										<ItemStyle HorizontalAlign="Left" Width="30%"></ItemStyle>
										<ItemTemplate>
											<asp:label id="lblDESCRIPTION" runat="server" text='<%#Container.DataItem("Description")%>'>
											</asp:label>
										</ItemTemplate>
										<FooterStyle HorizontalAlign="Left" Height="25px"></FooterStyle>
										<FooterTemplate>
											<asp:label id="lblTot" runat="server" text="TOTAL" Font-Bold="True"></asp:label>
										</FooterTemplate>
									</asp:TemplateColumn>
									<asp:BoundColumn Visible="False" DataField="Amount"></asp:BoundColumn>
									<asp:TemplateColumn HeaderText="AMOUNT">
										<HeaderStyle HorizontalAlign="Center" Height="25px"></HeaderStyle>
										<ItemStyle HorizontalAlign="Right" Width="15%"></ItemStyle>
										<ItemTemplate>
											<asp:label id="lblPCAmount" runat="server" text='<%#formatnumber(Container.DataItem("Amount"),2)%>'>
											</asp:label>
										</ItemTemplate>
										<FooterStyle HorizontalAlign="Right"></FooterStyle>
										<FooterTemplate>
											<asp:label id="lblTotPCAmount" runat="server"></asp:label>
										</FooterTemplate>
									</asp:TemplateColumn>
									<asp:TemplateColumn HeaderText="DELETE">
										<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
										<ItemStyle HorizontalAlign="Center" Width="10%"></ItemStyle>
										<ItemTemplate>
											<asp:imagebutton id="imbDelete" runat="server" causesvalidation="False" imageurl="../../../../Images/IconDelete.gif"
												commandname="DELETE" alt="Delete"></asp:imagebutton>
										</ItemTemplate>
									</asp:TemplateColumn>
								</Columns>
								<PagerStyle Visible="False" HorizontalAlign="Left" ForeColor="#000066" BackColor="White" Mode="NumericPages"></PagerStyle>
							</asp:datagrid></TD>
					</TR>
				</TABLE>
				<BR>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD align="right">
							<asp:imagebutton id="imbSave" runat="server" imageurl="../../../../Images/ButtonSave.gif" causesvalidation="false" alt="Save"></asp:imagebutton>&nbsp;
							<asp:imagebutton id="imbCancel" runat="server" imageurl="../../../../Images/ButtonCancel.gif" causesvalidation="False" alt="Cancel"></asp:imagebutton></TD>
					</TR>
				</TABLE>
			</asp:panel></form>
	</body>
</HTML>
