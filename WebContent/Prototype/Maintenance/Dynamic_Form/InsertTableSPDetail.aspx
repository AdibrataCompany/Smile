<%@ Page Language="C#" AutoEventWireup="true" CodeFile="InsertTableSPDetail.aspx.cs" Inherits="InsertTableSPDetail" %>

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
						<td class="tdtopi" align="center">PAGING SP DETAIL</td>
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
                                <asp:TemplateColumn HeaderText="FORM ID" SortExpression="FormID">
                                    <HeaderStyle HorizontalAlign="Center" />
                                    <ItemStyle HorizontalAlign="Left" />
                                    <ItemTemplate>
                                        <asp:Label ID="lblFormID" runat="server" Enabled="True" Text='<%# DataBinder.Eval(Container.DataItem, "FormID")%>'>
											</asp:Label>
                                    </ItemTemplate>
                                </asp:TemplateColumn>
                                <asp:TemplateColumn HeaderText="SP NAME" SortExpression="SPName">
                                    <HeaderStyle HorizontalAlign="Center" />
                                    <ItemStyle HorizontalAlign="Left" />
                                    <ItemTemplate>
                                        <asp:Label ID="lblSPName" runat="server" Enabled="True" Text='<%# DataBinder.Eval(Container.DataItem, "SPName")%>'>
											</asp:Label>
                                    </ItemTemplate>
                                </asp:TemplateColumn>
                                <asp:TemplateColumn HeaderText="PARAMETER" SortExpression="Parameter">
                                    <HeaderStyle HorizontalAlign="Center" />
                                    <ItemStyle HorizontalAlign="Left" />
                                    <ItemTemplate>
                                        <asp:Label ID="lblParameter" runat="server" Enabled="True" Text='<%# DataBinder.Eval(Container.DataItem, "Parameter")%>'>
											</asp:Label>
                                    </ItemTemplate>
                                </asp:TemplateColumn>
                                <asp:TemplateColumn HeaderText="ITEM ID" SortExpression="ItemID">
                                    <HeaderStyle HorizontalAlign="Center" />
                                    <ItemStyle HorizontalAlign="Left" />
                                    <ItemTemplate>
                                        <asp:Label ID="lblItemID" runat="server" Enabled="True" Text='<%# DataBinder.Eval(Container.DataItem, "ItemID")%>'>
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
						<td class="tdtopi" align="center">SP DETAIL LIST</td>
						<td class="tdtopikanan" width="10">&nbsp;</td>
					</tr>
				</table>
				<table class="tablegrid" cellspacing="1" cellpadding="3" width="95%" align="center" border="0">
            <tr>
                <td class='tdgenap' style="width: 25%">Form ID</td>
                <td class='tdganjil'>
                    <asp:Label ID="lblFormId" runat="server" Text=""></asp:Label>
                </td>
            </tr>
            <tr>
                <td class='tdgenap'>SP Name</td>
                <td class='tdganjil'>
                    <asp:DropDownList ID="cboSpName" runat="server" Visible="False" 
                        CssClass="inptype">
                    </asp:DropDownList>
                    <asp:Label ID="lblSPName" runat="server" Text=""></asp:Label>
                </td>
            </tr>
            <tr>
                <td class='tdgenap'>Parameter Name</td>
                <td class='tdganjil'>
                    @<asp:TextBox MaxLength='100' ID="txtParameter" runat="server" 
                        CssClass="inptype"></asp:TextBox>
                    <asp:RequiredFieldValidator ID="reqParameter" runat="server" 
                        ControlToValidate="txtParameter" ErrorMessage="please fill Parameter Name"></asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td class='tdgenap'>Parameter Source</td>
                <td class='tdganjil'>
                    <asp:DropDownList ID="cboSource" runat="server" CssClass="inptype">
                    </asp:DropDownList>
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
