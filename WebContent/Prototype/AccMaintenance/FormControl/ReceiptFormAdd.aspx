﻿<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>Receipt Form</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../../Confins.css" type="text/css" rel="stylesheet">
		<SCRIPT src="../../Elsa.js"></SCRIPT>
		<script type="text/javascript">
		function OpenDetail(pType,ID,pStyle){ 
			var AppInfo = '<%= Request.servervariables("PATH_INFO")%>';
			var App = AppInfo.substr(1, AppInfo.indexOf('/', 1) - 1);
			window.open('http://<%=Request.servervariables("SERVER_NAME")%>:<%=Request.servervariables("SERVER_PORT")%>/' + App + '/AccMnt/Setting/ReceiptFormDetail.aspx?Style=' + pStyle + '&Type=' + pType + '&IdNo=' + ID, 'UserLookup', 'left=0, top=0, width=700, height=600, menubar=0, scrollbars=yes');
			}
		</script>
	</HEAD>
	<body vLink="blue" aLink="black" link="blue">
		<form id="Form2" method="post" runat="server">
			&nbsp;
			<asp:label id="lblMessage" runat="server" font-size="11px" font-name="Verdana" forecolor="Red"></asp:label>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR class="trtopikuning">
				<TD class="tdtopibirukiri" width="10" height="20">&nbsp;</TD>
				<TD class="tdtopibiru" align="center">FORM CONTROL - ADD</TD>
				<TD class="tdtopibirukanan" width="10">&nbsp;</TD>
				</TR>
				</TABLE>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="3" width="95%" align="center" border="0">
				<TR>
				<TD class="tdgenap" style="WIDTH: 20%">Branch</TD>
				<TD class="tdganjil">
				<asp:DropDownList id="CboBranch" Runat="server">
					<asp:ListItem>Select One</asp:ListItem>
				</asp:DropDownList>
				</TD>
				</TR>
				<TR>
				<TD class="tdgenap" width="25%">Form Control Begin No</TD>
				<TD class="tdganjil">
				<asp:TextBox id="txtReceiptNoBegin" runat="server" cssclass="inptype" maxlength="30">
				</asp:TextBox>
				<font color="red">&nbsp;*)</font></TD>
				</TR>
				<tr>
					<TD class="tdgenap" width="25%">Form Control End No</TD>
					<TD class="tdganjil">
					<asp:TextBox id="txtReceiptNoEnd" runat="server" cssclass="inptype" maxlength="30">
					</asp:TextBox>
					<font color="red">&nbsp;*)</font>
					</TD>
				</tr>
				<TR>
				<TD class="tdgenap" style="WIDTH: 20%">Assigned To</TD>
				<TD class="tdganjil">
				<asp:TextBox id="txtEmployeeName" runat="server" cssclass="inptype" maxlength="30">
				</asp:TextBox>
				&nbsp;<asp:Image runat="server" id="imgEmpLookup" ImageUrl="../../images/iconDetail.gif" /><font color="red">&nbsp;*)</font>
				</TD>
				</TR>
				</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<DIV align="right">
								<asp:imagebutton id="imbAdd" runat="server" width="100" height="20" imageurl="../../Images/ButtonAdd.gif" ></asp:imagebutton>
								<asp:imagebutton id="imbCancel" runat="server" imageurl="../../Images/ButtonCancel.gif" causesvalidation="False"></asp:imagebutton>								
							</DIV>
						</TD>
					</TR>
				</TABLE>
				<BR>
					<div align="center">
					<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopikuning">
					<TD class="tdtopibirukiri" width="10" height="20">&nbsp;</TD>
					<TD class="tdtopibiru" align="center">FORM CONTROL LIST</TD>
					<TD class="tdtopibirukanan" width="10">&nbsp;</TD>
					</TR>
					</TABLE>
					<asp:GridView runat="server" id="grdReceiptForm" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
						<Columns>
							<asp:boundfield DataField="valNo" HeaderText="NO" SortExpression="valno">
								<ItemStyle HorizontalAlign="Center" />
							</asp:boundfield>
							<asp:boundfield DataField="valstring20" HeaderText="FORM CONTROL NO" SortExpression="valstring20">
							</asp:boundfield>
							<asp:templatefield HeaderText="DELETE">
								<ItemTemplate>
									<asp:ImageButton runat="server" id="btnDelete" ImageUrl="../../images/IconDelete.gif" />
								</ItemTemplate>
								<ItemStyle HorizontalAlign="Center" />
							</asp:templatefield>
						</Columns>
						<HeaderStyle CssClass="tdjudulbiru" />
						<AlternatingRowStyle CssClass="tdgenap" />
					</asp:GridView>
					<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
					</asp:XmlDataSource>
					</div>
					<TABLE height="25" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
					<TD>
					<asp:ImageButton id="imbFirstPage" runat="server" imageurl="../../images/butkiri1.gif" />
					&nbsp;&nbsp;
					<asp:ImageButton id="imbPrevPage" runat="server" imageurl="../../images/butkiri.gif" />
					&nbsp;&nbsp;
					<asp:ImageButton id="imbNextPage" runat="server" imageurl="../../images/butkanan.gif" />
					&nbsp;&nbsp;
					<asp:ImageButton id="imbLastPage" runat="server" imageurl="../../images/butkanan1.gif" />
					</TD>
					<TD style="WIDTH: 247px" align="center" width="247">
					<FONT face="Verdana" size="2">Page&nbsp; </FONT>
					<asp:TextBox id="txtGoPage" runat="server" MaxLength="7" CssClass="InpType" Width="54px">
					1</asp:TextBox>
					<asp:ImageButton id="imbGoPage" runat="server" ImageAlign="AbsBottom" EnableViewState="False" ImageUrl="../../Images/butgo.gif" />
					<asp:RangeValidator id="rgvGo" runat="server" Font-Size="Smaller" ErrorMessage="Page is not valid" maximumvalue="999999999" MinimumValue="1" ControlToValidate="txtGoPage" type="Integer" enableviewstate="False">
					</asp:RangeValidator>
					</TD>
					<TD align="right">
					<FONT color="#999999">Page
					<asp:Label id="lblPage" runat="server"></asp:Label>
					&nbsp;of
					<asp:Label id="lblTotPage" runat="server"></asp:Label>
					, Total&nbsp;
					<asp:Label id="lblRecord" runat="server"></asp:Label>
					&nbsp;record(s)</FONT>
					</TD>
					</TR>
					</TABLE>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR>
						<TD>
							<DIV align="right">
								<asp:imagebutton id="imbSave" runat="server" width="100" height="20" imageurl="../../Images/ButtonSave.gif" PostBackUrl="ReceiptForm.aspx"></asp:imagebutton>
							</DIV>
						</TD>
					</TR>
				</TABLE>
			</form>
	</body>
</HTML>
