<%@ Page Language="vb" AutoEventWireup="false" Codebehind="CollResult.aspx.vb" Inherits="AdIns.Application.Eloan.Web.Collection.CollResult" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<title>ActionResult</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<LINK href="../../Confins.css" type="text/css" rel="stylesheet">
	</HEAD>
	<body>
		<form id="Form1" method="post" runat="server">
			<br>
		<table width="95%" border="0" cellspacing="0" cellpadding="0" align="center">
		    <tr class="trtopiungu"> 
		      <td width="10" height="20" class="tdtopiungu">&nbsp;</td>
		      <td align="center" class="tdtopiungu">RESULT</td>
		      <td width="10" class="tdtopiungukanan">&nbsp;</td>
		    </tr>
		  </table>
				<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" align="center" border="0">
					<TR class="tdganjil">
						<TD class="tdgenap" width="25%">Action Name</TD>
						<TD class="tdganjil">&nbsp;
							<asp:Label id="lblActionName" runat="server" Width="488px"></asp:Label></TD>
					</TR>
				</TABLE>
				<BR>
			<table width="95%" border="0" cellspacing="0" cellpadding="0" align="center">
		    <tr class="trtopiungu"> 
		      <td width="10" height="20" class="tdtopiungu">&nbsp;</td>
		      <td align="center" class="tdtopiungu">RESULT</td>
		      <td width="10" class="tdtopiungukanan">&nbsp;</td>
		    </tr>
		  </table>
				<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR align="center">
						<TD>
						<asp:GridView runat="server" id="GrdResult" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="100%" >
						<Columns>
						<asp:templatefield HeaderText="RESULT ID">
							<ItemTemplate>
								<asp:HyperLink runat="server" id="lnkCustomerName" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx10xxxxxxxx
								</asp:HyperLink>
							</ItemTemplate>
							<ItemStyle HorizontalAlign="Left" />
						</asp:templatefield>
						<asp:boundfield DataField="valstring20" HeaderText="DESCRIPTION" SortExpression="valstringcsttype">
							<ItemStyle HorizontalAlign="Center" />
						</asp:boundfield>
						<asp:boundfield DataField="valstring20" HeaderText="PROMISE TO PAY" SortExpression="valstringcsttype">
							<ItemStyle HorizontalAlign="Center" />
						</asp:boundfield>
						<asp:templatefield HeaderText="EDIT">
							<ItemTemplate>
								<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="CollActionEdit.aspx" />
							</ItemTemplate>
							<ItemStyle HorizontalAlign="Center" />
						</asp:templatefield>
						<asp:templatefield HeaderText="DELETE">
							<ItemTemplate>
								<asp:ImageButton runat="server" id="BtnEdit" ImageUrl="../../images/icondelete.gif" />
							</ItemTemplate>
							<ItemStyle HorizontalAlign="Center" />
						</asp:templatefield>
						</Columns>
							<HeaderStyle CssClass="tdjudulungu" />
							<AlternatingRowStyle CssClass="tdgenap" />
						</asp:GridView>
						<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
						</asp:XmlDataSource>

						</TD>
					</TR>
				</TABLE>
				<TABLE id="Table5" style="HEIGHT: 53px" height="53" cellSpacing="0" cellPadding="0" width="95%"
					align="center" border="0">
					<TR>
						<TD align="center" width="30">
							<asp:imagebutton id="imbFirstPage" runat="server" CausesValidation="False" OnCommand="NavigationLink_Click"
								CommandName="First" ImageUrl="..\..\Images\butkiri1.gif"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbPrevPage" runat="server" CausesValidation="False" OnCommand="NavigationLink_Click"
								CommandName="Prev" ImageUrl="../../Images/butkiri.gif"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbNextPage" runat="server" CausesValidation="False" OnCommand="NavigationLink_Click"
								CommandName="Next" ImageUrl="..\..\Images\butkanan.gif"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD align="center" width="30">
							<asp:imagebutton id="imbLastPage" runat="server" CausesValidation="False" OnCommand="NavigationLink_Click"
								CommandName="Last" ImageUrl="..\..\Images\butkanan1.gif"></asp:imagebutton><FONT face="Verdana"></FONT></TD>
						<TD style="WIDTH: 247px" align="center" width="247"><FONT face="Verdana" size="2">Page&nbsp;
							</FONT>
							<asp:TextBox id="txtGoPage" runat="server" Width="34px" CssClass="InpType">1</asp:TextBox>
							<asp:imagebutton id="imbGoPage" runat="server" ImageUrl="..\..\Images\butgo.gif" ImageAlign="AbsBottom"
								EnableViewState="False"></asp:imagebutton>
							<asp:RangeValidator id="rgvGo" runat="server" Font-Size="Smaller" ErrorMessage="Page is not valid" MinimumValue="0"
								ControlToValidate="txtGoPage" Font-Names="Verdana"></asp:RangeValidator><FONT face="Verdana" size="2">&nbsp;&nbsp;
							</FONT>
						</TD>
						<TD align="right"><FONT color="#999999"><FONT face="Verdana" size="2">Page&nbsp; </FONT>
								<asp:label id="lblPage" runat="server" Font-Size="Smaller" Font-Names="Verdana"></asp:label><FONT face="Verdana" size="2">&nbsp;of
								</FONT>
								<asp:label id="lblTotPage" runat="server" Font-Size="Smaller" Font-Names="Verdana"></asp:label><FONT face="Verdana" size="2">, 
									Total&nbsp; </FONT>
								<asp:label id="lblTotRec" runat="server" Font-Size="Smaller"></asp:label>&nbsp;<FONT face="Verdana" size="2">record(s)</FONT></FONT></TD>
					</TR>
				</TABLE>
				<TABLE id="Table1" style="HEIGHT: 25px" height="25" cellSpacing="0" cellPadding="0" width="95%"
					align="center" border="0" runat="server">
					<TR>
						<TD style="WIDTH: 160px" align="left"></TD>
						<TD align="right"><FONT face="Verdana">
								<asp:ImageButton id="BtnAdd" runat="server" ImageUrl="..\..\images\buttonadd.gif"></asp:ImageButton>&nbsp;
								<asp:ImageButton id="ImageButton1" runat="server" CausesValidation="False" ImageUrl="..\..\Images\ButtonBack.gif"></asp:ImageButton></FONT></TD>
					</TR>
				</TABLE>
			</asp:panel><asp:panel id="pnlAddEdit" style="Z-INDEX: 102" Runat="server" Width="100%" HorizontalAlign="Center">
				<TABLE id="Table4" cellSpacing="3" cellPadding="0" width="95%" border="0">
					<TR>
						<TD align="left">
							<asp:label id="Label1" style="Z-INDEX: 101; LEFT: 16px; TOP: 8px" runat="server" font-size="11px"
								font-name="Verdana" forecolor="Red" Width="112px" Font-Names="Verdana" Font-Italic="True">*) required field</asp:label></TD>
					</TR>
				</TABLE>
				<TABLE id="Table2" cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
					<TR class="trtopiabu">
						<TD class="tdtopikiri" width="10" height="20"></TD>
						<TD class="tdtopi" align="center">RESULT&nbsp;-
							<asp:Label id="lblMenuAddEdit" runat="server"></asp:Label></TD>
						<TD class="tdtopikanan" width="10"></TD>
					</TR>
				</TABLE>
				<TABLE class="tablegrid" id="Table7" cellSpacing="1" cellPadding="2" width="95%" align="center"
					border="0">
					<TR>
						<TD class="tdgenap" style="HEIGHT: 27px" width="25%">Action ID</TD>
						<TD class="tdganjil" style="HEIGHT: 27px">
							<asp:Label id="lblActionIDAddEdit" runat="server" Width="488px"></asp:Label></TD>
					</TR>
					<TR class="tdganjil">
						<TD class="tdgenap" style="HEIGHT: 27px" width="25%">Result ID</TD>
						<TD class="tdganjil" style="HEIGHT: 27px">
							<asp:TextBox id="txtResultID" runat="server" Width="100px" CssClass="InpType" MaxLength="10"></asp:TextBox>
							<asp:Label id="lblResultID" runat="server"></asp:Label>
							<DIV style="DISPLAY: inline; WIDTH: 16px; COLOR: red; HEIGHT: 15px" ms_positioning="FlowLayout">
							<asp:label id="lblrequired" runat="server" forecolor="Red" Font-Italic="True" Font-Names="Verdana"
									font-name="Verdana" font-size="11px">*)</asp:label>
							</DIV>
							<asp:RequiredFieldValidator id="RequiredFieldValidator1" runat="server" Width="184px" ErrorMessage="Please fill Result Id"
								ControlToValidate="txtResultID"></asp:RequiredFieldValidator></TD>
					</TR>
					<TR class="tdganjil">
						<TD class="tdgenap" width="25%">Result Name</TD>
						<TD class="tdganjil" style="HEIGHT: 22px">
							<asp:TextBox id="txtResultName" runat="server" Width="291px" CssClass="InpType" MaxLength="100"></asp:TextBox>
							<DIV style="DISPLAY: inline; WIDTH: 16px; COLOR: red; HEIGHT: 15px" ms_positioning="FlowLayout">*)</DIV>
							<asp:RequiredFieldValidator id="rfv1" runat="server" Width="184px" ErrorMessage="Please fill Result Description"
								ControlToValidate="txtResultName"></asp:RequiredFieldValidator></TD>
					</TR>
					<TR>
						<TD class="tdgenap" width="25%">Result Category</TD>
						<TD class="tdganjil" style="HEIGHT: 22px">
							<asp:DropDownList id="cboResultCategory" runat="server"></asp:DropDownList></TD>
					</TR>
				</TABLE>
				<TABLE id="TableAddSave" style="HEIGHT: 19px" cellSpacing="0" cellPadding="0" width="95%"
					align="center" border="0">
					<TR>
						<TD align="right">&nbsp;&nbsp;
							<asp:ImageButton id="imbSave" runat="server" ImageUrl="..\..\Images\ButtonSave.gif"></asp:ImageButton>&nbsp;
							<asp:ImageButton id="imgCancel" runat="server" CausesValidation="False" ImageUrl="..\..\Images\ButtonCancel.gif"></asp:ImageButton>&nbsp;
							<A href="javascript:history.back();"></A>
						</TD>
					</TR>
				</TABLE>
			</asp:panel>
			<P>&nbsp;</P>
			<table>
			</table>
			</TABLE></form>
	</body>
</HTML>
