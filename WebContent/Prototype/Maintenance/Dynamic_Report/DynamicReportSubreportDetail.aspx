<%@ Page Language="C#" AutoEventWireup="true" CodeFile="DynamicReportSubreportDetail.aspx.cs" Inherits="DynamicReportSubReportDetail" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
</head>
<LINK href="../Include/CSS/AccMnt.css" type='text/css' rel='stylesheet'>
<body>
    <form id="form1" runat="server">
    <div>
        <asp:Panel ID="pnlTop" runat="server" Width="100%">
       <table cellspacing="0" cellpadding="0" width="95%" align="center" border="0">
					<tr class="trtopikuning">
						<td class="tdtopikiri" width="10" height="20">&nbsp;</td>
						<td class="tdtopi" align="center">SUBREPORT DETAIL LIST</td>
						<td class="tdtopikanan" width="10">&nbsp;</td>
					</tr>
				</table>
				<table class="tablegrid" cellspacing="0" cellpadding="0" width="95%" align="center" border="0">
            <tr align="center">
                    <td style="width: 100%">
                        <asp:DataGrid ID="ListDG" runat="server" AllowPaging="True"
                            AutoGenerateColumns="False" CellPadding="4" AllowSorting ="true"
                            CssClass="tablegrid" HorizontalAlign="Left" OnSortCommand="Sorting" 
                            Width="100%" Font-Bold="False" Font-Italic="False" Font-Names="Tahoma" 
                            Font-Overline="False" Font-Strikeout="False" Font-Underline="False" 
                            ForeColor="#333333" GridLines="None" onitemcommand="ListDG_ItemCommand">
                            <AlternatingItemStyle CssClass="tdgenap" BackColor="White" ForeColor="#284775" />
                            <ItemStyle CssClass="tdganjil" HorizontalAlign="Center" BackColor="#F7F6F3" ForeColor="#333333" />
                            <HeaderStyle CssClass="tdjudul" HorizontalAlign="Center" BackColor="#5D7B9D" Font-Bold="True" ForeColor="White" />
                            <Columns>
                                <asp:TemplateColumn HeaderText="REPORT ID" SortExpression="ReportID">
                                    <HeaderStyle HorizontalAlign="Center" />
                                    <ItemStyle HorizontalAlign="Left" />
                                    <ItemTemplate>
                                        <asp:Label ID="lblReportID" runat="server" Enabled="True" Text='<%# DataBinder.Eval(Container.DataItem, "ReportID")%>'>
											</asp:Label>
                                    </ItemTemplate>
                                </asp:TemplateColumn>
                                <asp:TemplateColumn HeaderText="MODULE ID" SortExpression="ModuleID">
                                    <HeaderStyle HorizontalAlign="Center" />
                                    <ItemStyle HorizontalAlign="Left" />
                                    <ItemTemplate>
                                        <asp:Label ID="lblModuleID" runat="server" Enabled="True" Text='<%# DataBinder.Eval(Container.DataItem, "ModuleID")%>'>
											</asp:Label>
                                    </ItemTemplate>
                                </asp:TemplateColumn>
                                <asp:TemplateColumn HeaderText="COMPANY ID" SortExpression="CompanyID">
                                    <HeaderStyle HorizontalAlign="Center" />
                                    <ItemStyle HorizontalAlign="Left" />
                                    <ItemTemplate>
                                        <asp:Label ID="lblCompanyID" runat="server" Enabled="True" Text='<%# DataBinder.Eval(Container.DataItem, "CompanyID")%>'>
											</asp:Label>
                                    </ItemTemplate>
                                </asp:TemplateColumn>
                                <asp:TemplateColumn HeaderText="SUBREPORT ID" SortExpression="SubreportID">
                                    <HeaderStyle HorizontalAlign="Center" />
                                    <ItemStyle HorizontalAlign="Left" />
                                    <ItemTemplate>
                                        <asp:Label ID="lblSubreportID" runat="server" Enabled="True" Text='<%# DataBinder.Eval(Container.DataItem, "SubreportID")%>'>
											</asp:Label>
                                    </ItemTemplate>
                                </asp:TemplateColumn>
                                <asp:TemplateColumn HeaderText="SUBREPORT NAME" SortExpression="SubreportName">
                                    <HeaderStyle HorizontalAlign="Center" />
                                    <ItemStyle HorizontalAlign="Left" />
                                    <ItemTemplate>
                                        <asp:Label ID="lblSubreportName" runat="server" Enabled="True" Text='<%# DataBinder.Eval(Container.DataItem, "SubreportName")%>'>
											</asp:Label>
                                    </ItemTemplate>
                                </asp:TemplateColumn>
                                <asp:TemplateColumn HeaderText="SP NAME" SortExpression="StoreProcedureName">
                                    <HeaderStyle HorizontalAlign="Center" />
                                    <ItemStyle HorizontalAlign="Left" />
                                    <ItemTemplate>
                                        <asp:Label ID="lblSPName" runat="server" Enabled="True" Text='<%# DataBinder.Eval(Container.DataItem, "StoreProcedureName")%>'>
											</asp:Label>
                                    </ItemTemplate>
                                </asp:TemplateColumn>
                                <asp:templatecolumn headertext="EDIT">
										<headerstyle horizontalalign="Center"></headerstyle>
										<itemstyle horizontalalign="Center"></itemstyle>
										<itemtemplate>
											 <asp:ImageButton ID="Edit" runat="server" CommandName="Edit" Enabled="True" CausesValidation="false" 
                                            ImageUrl="~/Images/iconedit.gif" />
										</itemtemplate>
								</asp:templatecolumn>
								<asp:templatecolumn headertext="DELETE">
										<headerstyle horizontalalign="Center"></headerstyle>
										<itemstyle horizontalalign="Center"></itemstyle>
										<itemtemplate>
											 <asp:ImageButton ID="Delete" runat="server" CommandName="Delete" Enabled="True" CausesValidation="false" 
                                            ImageUrl="~/Images/icondelete.gif" />
										</itemtemplate>
								</asp:templatecolumn>
                            </Columns>
                            <PagerStyle BackColor="#284775" ForeColor="White" HorizontalAlign="Center"
                                Visible="False" />
                            <FooterStyle BackColor="#5D7B9D" Font-Bold="True" ForeColor="White" />
                            <EditItemStyle BackColor="#999999" />
                            <SelectedItemStyle BackColor="#E2DED6" Font-Bold="True" ForeColor="#333333" />
                        </asp:DataGrid> 
                    </td>    
                </tr>
        </table>
				<table height="25" cellspacing="0" cellpadding="0" width="95%" align="center" border="0">
                <tr>
                    <td align="center" width="30">
                        &nbsp;<asp:ImageButton ID="imbFirstPage" runat="server" 
                            ImageUrl="~/Images/butkiri1.gif" CommandName="First" 
                            OnCommand="NavigationLink_Click" /><font face="Verdana"></font></td>
                    <td align="center" width="30">
                        &nbsp;<asp:ImageButton ID="imbPrevPage" runat="server" 
                            ImageUrl="~/Images/butkiri.gif" CommandName="Prev" 
                            OnCommand="NavigationLink_Click"/><font face="Verdana" ></font></td>
                    <td align="center" width="30">
                        &nbsp;<asp:ImageButton ID="imbNextPage" runat="server" 
                            ImageUrl="~/Images/butkanan.gif" CommandName="Next" 
                            OnCommand="NavigationLink_Click" /><font face="Verdana" ></font></td>
                    <td align="center" width="30">
                        &nbsp;<asp:ImageButton ID="imbLastPage" runat="server" 
                            ImageUrl="~/Images/butkanan1.gif" CommandName="Last" 
                            OnCommand="NavigationLink_Click"/><font face="Verdana" ></font></td>
                    <td align="center" style="width: 247px" width="247">
                        <font face="Verdana" size="2">Page&nbsp;</font>
                        <asp:TextBox ID="txtGoPage" runat="server" CssClass="InpType" Width="34px" MaxLength="10">1</asp:TextBox>&nbsp;<asp:ImageButton
                            ID="imbGoPage" runat="server" ImageUrl="~/Images/butgo.gif" 
                            onclick="imbGoPage_Click" />
                        <asp:RangeValidator ID="rvGo" runat="server" ControlToValidate="txtGoPage" ErrorMessage="Page Is Not Valid"
                            Font-Names="verdana" Font-Size="smaller" MaximumValue="999999999" MinimumValue="1"
                            Type="Integer"></asp:RangeValidator><font face="Verdana" size="2"> &nbsp;&nbsp; </font></td>
                    <td align="right">
                        <font color="#999999"><font face="Verdana" size="2">Page&nbsp;</font>
                            <asp:Label ID="lblPage" runat="server" Font-Names="Verdana" Font-Size="Smaller"></asp:Label><font
                                face="Verdana" size="2"> of</font>
                            <asp:Label ID="lblTotPage" runat="server" Font-Names="Verdana" Font-Size="Smaller"></asp:Label><font
                                face="Verdana" size="2">, Total&nbsp; </font>
                            <asp:Label ID="lblTotRec" runat="server" Font-Size="Smaller"></asp:Label>&nbsp;
                            <font face="Verdana" size="2">record(s)</font></font>
                    </td>
                </tr>
            </table>
        <table align="center" border="0" cellpadding="0" cellspacing="0" width="95%">
                 <tr>
                    <td align='right' class="tdganjil"'>
                     <asp:ImageButton ID="btnAdd" runat="server" ImageUrl="~/Images/ButtonAdd.gif"
                            onclick="btnAdd_Click" CausesValidation="False"/>&nbsp;&nbsp;
                     <asp:ImageButton ID="btnBack" runat="server" CausesValidation="false" ImageUrl="~/Images/ButtonBack.gif" 
                            onclick="btnBack_Click"/>
                    </td> 
                </tr>
        </table> 
        </asp:Panel>
        <asp:Panel ID="pnlHeaderList" runat="server" Width="100%" Visible="false">
               <table cellspacing="0" cellpadding="0" width="95%" align="center" border="0">
					<tr class="trtopikuning">
						<td class="tdtopikiri" width="10" height="20">&nbsp;</td>
						<td class="tdtopi" align="center">SUBREPORT DETAIL</td>
						<td class="tdtopikanan" width="10">&nbsp;</td>
					</tr>
				</table>
				<table class="tablegrid" cellspacing="1" cellpadding="3" width="95%" align="center" border="0">
		    <tr>
                <td class='tdgenap' style="width: 25%">Report ID</td>
                <td class='tdganjil'>
                    <asp:Label ID="lblReportID" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class='tdgenap' style="width: 25%">Module ID</td>
                <td class='tdganjil'>
                    <asp:Label ID="lblModuleID" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class='tdgenap' style="width: 25%">Company ID</td>
                <td class='tdganjil'>
                    <asp:Label ID="lblCompanyID" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class='tdgenap' style="width: 25%">Subreport ID</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtSubreportID" runat="server" MaxLength="50"></asp:TextBox>
                    <asp:Label ID="lblSubreportID" runat="server"></asp:Label>
                    <font color="#FF0000">*)</font><asp:RequiredFieldValidator
                        ID="reqSubreportID" runat="server" ErrorMessage="Please fill Subreport ID" ControlToValidate="txtSubreportID"></asp:RequiredFieldValidator>
                    
                </td>
            </tr>
            <tr>
                <td class='tdgenap'>Subreport Name</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtSubreportName" runat="server" MaxLength="200"></asp:TextBox>.rpt<font color="#FF0000">*)</font><asp:RequiredFieldValidator
                        ID="reqSubreportName" runat="server" ErrorMessage="Please fill Subreport Name" ControlToValidate="txtSubreportName"></asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td class='tdgenap'>Store Procedure Name</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtSPName" runat="server" MaxLength="200"></asp:TextBox><font color="#FF0000">*)</font><asp:RequiredFieldValidator
                        ID="reqSPName" runat="server" ErrorMessage="Please fill Store Procedure Name" ControlToValidate="txtSPName"></asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td class='tdgenap'>Description</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtDesc" Rows="5" runat="server" MaxLength="200" Height="46px" 
                        TextMode="MultiLine" Width="288px"></asp:TextBox>
                </td>
            </tr>
        </table>
                <table align="center" border="0" cellpadding="0" cellspacing="0" width="95%">
        <tr>
           <td align="right">
                <asp:ImageButton ID="ImageButton1" ImageUrl="~/Images/ButtonSave.gif" runat="server" 
                        onclick="imbSave_Click" />&nbsp;&nbsp;
                <asp:ImageButton ID="ImageButton2" ImageUrl="~/Images/ButtonCancel.gif" runat="server" 
                        CausesValidation = "false" onclick="imbCancel_Click"/>
           </td>       
        </tr>
        </table>
        </asp:Panel>  
    </div>
    </form>
</body>
</html>
