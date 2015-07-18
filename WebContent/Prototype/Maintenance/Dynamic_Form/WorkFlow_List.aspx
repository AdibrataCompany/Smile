<%@ Page Language="C#" AutoEventWireup="true"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <LINK href="../../Confins.css" type='text/css' rel='stylesheet'/>
    <title>Dynamic Form Header</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
       
    <asp:Panel ID="pnlTop" runat="server" Width="100%">
    
           			<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR class="trtopikuning">
					<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
					<TD class="tdtopi" align="center">DYNAMIC FORM HEADER</TD>
					<TD class="tdtopikanan" width="10">&nbsp;</TD>
				</TR>
			</TABLE>
            <table class="tablegrid" cellspacing="0" cellpadding="0" width="95%" align="center" border="0">
                <tr>
                    <td width = "25%" class="tdganjil">Form ID :</td> 
                    <td class='tdganjil'>                        
                     &nbsp;<asp:TextBox ID="txtSearch" runat="server" CssClass="inptype"></asp:TextBox>
                    </td>
                </tr>
                <tr>
                    <td colspan='2' align='right' class="tdganjil" >
                    <asp:ImageButton ID="imbSearch" runat="server" ImageUrl="~/Images/ButtonSearch.gif" 
                            onclick="imbSearch_Click" />
                    </td> 
                </tr> 
            </table> 
    </asp:Panel> 
    <asp:Panel ID="pnlHeaderList" runat="server" Width="100%" Visible="false">
            <TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR class="trtopikuning">
					<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
					<TD class="tdtopi" align="center">DYNAMIC FORM HEADER LIST</TD>
					<TD class="tdtopikanan" width="10">&nbsp;</TD>
				</TR>
			</TABLE>
            <table align="center" border="0" cellpadding="0" cellspacing="0" width="95%">
                <tr align="center">
                    <td>
                        <asp:DataGrid ID="ListDG" runat="server" AllowPaging="True"
                            AutoGenerateColumns="False" CellPadding="4" AllowSorting="true"
                            CssClass="tablegrid" HorizontalAlign="Left" OnSortCommand="Sorting" 
                            Width="100%" Font-Bold="False" Font-Italic="False" Font-Names="Tahoma" 
                            Font-Overline="False" Font-Strikeout="False" Font-Underline="False" 
                            ForeColor="#333333" GridLines="None" OnItemCommand="ListDG_ItemCommand">
                            <AlternatingItemStyle CssClass="tdgenap" BackColor="White" ForeColor="#284775" />
                            <ItemStyle CssClass="tdganjil" HorizontalAlign="Center" BackColor="#F7F6F3" ForeColor="#333333" />
                            <HeaderStyle CssClass="tdjudul" HorizontalAlign="Center" BackColor="#5D7B9D" Font-Bold="True" ForeColor="White" />
                            <Columns>
                                <asp:TemplateColumn HeaderText="FORM ID" SortExpression="FormID">
                                    <HeaderStyle HorizontalAlign="Center" />
                                    <ItemStyle HorizontalAlign="Left" />
                                    <ItemTemplate>
                                        <asp:Label ID="lblFormID" runat="server" Enabled="True" Text='<%# DataBinder.Eval(Container.DataItem, "FormID")%>'>
											</asp:Label>
                                    </ItemTemplate>
                                </asp:TemplateColumn>
                                <asp:TemplateColumn HeaderText="FORM HEADER" SortExpression="FormHeader">
                                    <HeaderStyle HorizontalAlign="Center" />
                                    <ItemStyle HorizontalAlign="Left" />
                                    <ItemTemplate>
                                        <asp:Label ID="lblFormHeader" runat="server" Enabled="True" Text='<%# DataBinder.Eval(Container.DataItem, "FormHeader")%>'>
											</asp:Label>
                                    </ItemTemplate>
                                </asp:TemplateColumn>
                                <asp:TemplateColumn HeaderText="CSS PATH" SortExpression="CssPath">
                                    <HeaderStyle HorizontalAlign="Center" />
                                    <ItemStyle HorizontalAlign="Left" />
                                    <ItemTemplate>
                                        <asp:Label ID="lblCssPath" runat="server" Enabled="True" Text='<%# DataBinder.Eval(Container.DataItem, "CssPath")%>'>
											</asp:Label>
                                    </ItemTemplate>
                                </asp:TemplateColumn>
                                <asp:TemplateColumn HeaderText="HEADER CSS CLASS" SortExpression="HeaderCssClass">
                                    <HeaderStyle HorizontalAlign="Center" />
                                    <ItemStyle HorizontalAlign="Left" />
                                    <ItemTemplate>
                                        <asp:Label ID="lblHeaderCss" runat="server" Enabled="True" Text='<%# DataBinder.Eval(Container.DataItem, "HeaderCssClass")%>'>
											</asp:Label>
                                    </ItemTemplate>
                                </asp:TemplateColumn>
                                <asp:TemplateColumn HeaderText="TABLE CSS CLASS" SortExpression="TableCssClass">
                                    <HeaderStyle HorizontalAlign="Center" />
                                    <ItemStyle HorizontalAlign="Left" />
                                    <ItemTemplate>
                                        <asp:Label ID="lblTableCss" runat="server" Enabled="True" Text='<%# DataBinder.Eval(Container.DataItem, "TableCssClass")%>'>
											</asp:Label>
                                    </ItemTemplate>
                                </asp:TemplateColumn>
                                <asp:TemplateColumn HeaderText="NO OF COLUMN" SortExpression="NoOfColumn">
                                    <HeaderStyle HorizontalAlign="Center" />
                                    <ItemStyle HorizontalAlign="Left" />
                                    <ItemTemplate>
                                        <asp:Label ID="lblNoOfColumn" runat="server" Enabled="True" Text='<%# DataBinder.Eval(Container.DataItem, "NoOfColumn")%>'>
											</asp:Label>
                                    </ItemTemplate>
                                </asp:TemplateColumn>
                                <asp:templatecolumn headertext="VIEW DETAIL">
										<headerstyle horizontalalign="Center"></headerstyle>
										<itemstyle horizontalalign="Center"></itemstyle>
										<itemtemplate>
											 <asp:ImageButton ID="ViewDetail" runat="server" CommandName="ViewDetail" Enabled="True" CausesValidation="false" 
                                            ImageUrl="~/Images/IconReceived.gif" />
										</itemtemplate>
								</asp:templatecolumn>
								<asp:templatecolumn headertext="VIEW SAVE LINK">
										<headerstyle horizontalalign="Center"></headerstyle>
										<itemstyle horizontalalign="Center"></itemstyle>
										<itemtemplate>
											 <asp:ImageButton ID="ViewSaveLink" runat="server" CommandName="ViewSaveLink" Enabled="True" CausesValidation="false" 
                                            ImageUrl="~/Images/IconReceived.gif" />
										</itemtemplate>
								</asp:templatecolumn>
								<asp:templatecolumn headertext="VIEW SP">
										<headerstyle horizontalalign="Center"></headerstyle>
										<itemstyle horizontalalign="Center"></itemstyle>
										<itemtemplate>
											 <asp:ImageButton ID="ViewSP" runat="server" CommandName="ViewSP" Enabled="True" CausesValidation="false" 
                                            ImageUrl="~/Images/IconReceived.gif" />
										</itemtemplate>
								</asp:templatecolumn>
                                <asp:templatecolumn headertext="EDIT">
										<headerstyle horizontalalign="Center"></headerstyle>
										<itemstyle horizontalalign="Center"></itemstyle>
										<itemtemplate>
											 <asp:ImageButton ID="Action" runat="server" CommandName="Edit" Enabled="True" CausesValidation="false" 
                                            ImageUrl="~/Images/iconedit.gif" />
										</itemtemplate>
								</asp:templatecolumn>
								<asp:templatecolumn headertext="DELETE">
										<headerstyle horizontalalign="Center"></headerstyle>
										<itemstyle horizontalalign="Center"></itemstyle>
										<itemtemplate>
											 <asp:ImageButton ID="Delete" runat="server" CommandName="Delete" Enabled="True" CausesValidation="false" 
                                            ImageUrl="~/Images/IconDelete.gif" />
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
            <table align="center" border="0" cellpadding="0" cellspacing="0" height="53"  width="95%">
                <tr>
                    <td align="center" width="30">
                        &nbsp;<asp:ImageButton ID="imbFirstPage" runat="server" ImageUrl="~/Images/butkiri1.gif" CommandName="First" OnCommand="NavigationLink_Click" /><font face="Verdana"></font></td>
                    <td align="center" width="30">
                        &nbsp;<asp:ImageButton ID="imbPrevPage" runat="server" ImageUrl="~/Images/butkiri.gif" CommandName="Prev" OnCommand="NavigationLink_Click"/><font face="Verdana" ></font></td>
                    <td align="center" width="30">
                        &nbsp;<asp:ImageButton ID="imbNextPage" runat="server" ImageUrl="~/Images/butkanan.gif" CommandName="Next" OnCommand="NavigationLink_Click" /><font face="Verdana" ></font></td>
                    <td align="center" width="30">
                        &nbsp;<asp:ImageButton ID="imbLastPage" runat="server" ImageUrl="~/Images/butkanan1.gif" CommandName="Last" OnCommand="NavigationLink_Click"/><font face="Verdana" ></font></td>
                    <td align="center"  width="247">
                        <font face="Verdana" size="2">Page&nbsp;</font>
                        <asp:TextBox ID="txtGoPage" runat="server" CssClass="InpType" Width="34px" MaxLength="10">1</asp:TextBox>&nbsp;<asp:ImageButton
                            ID="imbGoPage" runat="server" ImageUrl="~/Images/butgo.gif" 
                            onclick="imbGoPage_Click" /><asp:RangeValidator ID="rvGo" runat="server" ControlToValidate="txtGoPage" ErrorMessage="Page Is Not Valid"
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
                    <td align='right'>
                     <asp:ImageButton ID="btnAdd" runat="server" ImageUrl="~/Images/ButtonAdd.gif" CausesValidation="true"
                            onclick="btnAdd_Click"/>

                    </td> 
                </tr>
            </table>                    
        </asp:Panel>     
    </div>
    </form>
</body>
</html>
