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
       <asp:Panel ID="pnlInput" runat="server" Width="100%">
       			<TABLE cellSpacing="0" cellPadding="0" width="95%" align="center" border="0">
				<TR class="trtopikuning">
					<TD class="tdtopikiri" width="10" height="20">&nbsp;</TD>
					<TD class="tdtopi" align="center">DYNAMIC FORM HEADER DETAIL</TD>
					<TD class="tdtopikanan" width="10">&nbsp;</TD>
				</TR>
			</TABLE>
        <table class="tablegrid" cellspacing="1" cellpadding="3" width="95%" align="center" border="0">
            <tr>
                <td width='25%' class='tdgenap'>Form ID</td>
                <td class='tdganjil'>
                    <asp:Label ID="lblFormID" runat="server" Visible = "false"></asp:Label>
                    <asp:TextBox ID="txtFormID" runat="server" CssClass="inptype"></asp:TextBox>
                    <asp:RequiredFieldValidator ID="rfvFormID" runat="server" ControlToValidate="txtFormID"
                        ErrorMessage="*)"></asp:RequiredFieldValidator>
                    </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap'>Form Header</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtFormHeader" runat="server" TextMode="MultiLine" 
                        Width="300px" MaxLength="100" CssClass="inptype"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap'>Css Path</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtCssPath" runat="server" TextMode="MultiLine" Width="300px" 
                        CssClass="inptype" MaxLength="300"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap'>Header Css Class</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtHeaderCss" runat="server" TextMode="MultiLine" 
                        Width="300px" CssClass="inptype" MaxLength="100"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Desc Width</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtDescWidth" runat="server" Width="50px" CssClass="inptype" 
                        MaxLength="10"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap'>Table Width</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtTableWidth" runat="server" Width="50px" CssClass="inptype" 
                        MaxLength="10"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap'>Table Css Class</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtTableCss" runat="server" TextMode="MultiLine" Width="300px" 
                        CssClass="inptype" MaxLength="100"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap'>Custom Header Java Script</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtCustomHeader" runat="server" TextMode="MultiLine" 
                        Width="300px" CssClass="inptype"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap'>After Save Link</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtAfterSave" runat="server" TextMode="MultiLine" 
                        Width="300px" CssClass="inptype" MaxLength="1000"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap'>After Cancel Link</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtAfterCancel" runat="server" TextMode="MultiLine" 
                        Width="300px" CssClass="inptype" MaxLength="1000"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap'>No Of Column</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtNoOfColumn" runat="server" Width="50px" MaxLength = "1" 
                        CssClass="inptype"></asp:TextBox>
                    <asp:RequiredFieldValidator ID="rfvNoOfColumn" runat="server" ControlToValidate="txtNoOfColumn"
                        ErrorMessage="*)"></asp:RequiredFieldValidator>
                    <asp:RangeValidator ID="rvNoOfColumn" runat="server" ControlToValidate="txtNoOfColumn" ErrorMessage="Must be numeric between 1 and 9"
                            Font-Names="verdana" Font-Size="smaller" MaximumValue="9" MinimumValue="1"
                            Type="Integer"></asp:RangeValidator>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap'>Use Conditional After Save Link</td>
                <td class='tdganjil'>
                       <asp:CheckBox ID="cbIsConditionalSaveLink" runat="server"/>
                </td>
            </tr>
            
       </table>
       
               <table align="center" border="0" cellpadding="0" cellspacing="0" width="95%">
        <tr>
           <td align="right">
<asp:ImageButton ID="btnSave" ImageUrl="~/Images/ButtonSave.gif" runat="server" 
                        onclick="btnSave_Click" />&nbsp;&nbsp;
                    <asp:ImageButton ID="btnCancel" runat="server" ImageUrl="~/Images/ButtonCancel.gif" CausesValidation="false"
                        onclick="btnCancel_Click"/>
           </td>       
        </tr>
        </table>
    </asp:Panel>
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
