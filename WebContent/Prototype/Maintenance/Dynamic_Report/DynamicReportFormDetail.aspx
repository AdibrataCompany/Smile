<%@ Page Language="C#" AutoEventWireup="true" CodeFile="DynamicReportFormDetail.aspx.cs" Inherits="Dynamic_Report_DynamicReportFormDetail" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
   <LINK href="../Include/CSS/AccMnt.css" type='text/css' rel='stylesheet'>
    <title>Dynamic Report Form</title>
    </head>
<body>
    <form id="form1" runat="server">
        <asp:Panel ID="pnlTop" runat="server" Width="100%" Visible="false" >
               <table cellspacing="0" cellpadding="0" width="95%" align="center" border="0">
					<tr class="trtopikuning">
						<td class="tdtopikiri" width="10" height="20">&nbsp;</td>
						<td class="tdtopi" align="center">DYNAMIC REPORT FORM DETAIL</td>
						<td class="tdtopikanan" width="10">&nbsp;</td>
					</tr>
				</table>
        <table class="tablegrid" cellspacing="1" cellpadding="3" width="95%" align="center" border="0">
            <tr>
                <td width='25%' class='tdgenap'>Form ID</td>
                <td class='tdganjil'>
                    <asp:Label ID="lblFormID" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Item ID &amp; Report Parameter Variable</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtItemID" runat="server" CssClass="inptype" MaxLength="20"></asp:TextBox>
                    <asp:RequiredFieldValidator ID="rfvItemID" runat="server" ControlToValidate="txtItemID"
                        ErrorMessage="*)" CssClass="inptype"></asp:RequiredFieldValidator>
                    <asp:RequiredFieldValidator ID="reqItemID" runat="server" 
                        ControlToValidate="txtItemID" ErrorMessage="Fill Item ID" CssClass="inptype"></asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Report Parameter Name</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtParamName" runat="server" CssClass="inptype" MaxLength="20"></asp:TextBox>
                    <asp:RequiredFieldValidator ID="rfvParamName" runat="server" ControlToValidate="txtParamName"
                        ErrorMessage="*)" CssClass="inptype"></asp:RequiredFieldValidator>
                    <asp:RequiredFieldValidator ID="reqParamName" runat="server" 
                        ControlToValidate="txtParamName" ErrorMessage="Fill Parameter Name" CssClass="inptype"></asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Report ID</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtReportID" runat="server" CssClass="inptype" MaxLength="20"></asp:TextBox>
                    <asp:RequiredFieldValidator ID="rfvReportID" runat="server" ControlToValidate="txtReportID"
                        ErrorMessage="*)" CssClass="inptype"></asp:RequiredFieldValidator>
                    <asp:RequiredFieldValidator ID="reqReportID" runat="server" 
                        ControlToValidate="txtReportID" ErrorMessage="Fill Report ID" CssClass="inptype"></asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >ModuleID</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtModuleID" runat="server" CssClass="inptype" MaxLength="20"></asp:TextBox>
                    <asp:RequiredFieldValidator ID="rfvModuleID" runat="server" ControlToValidate="txtModuleID"
                        ErrorMessage="*)" CssClass="inptype"></asp:RequiredFieldValidator>
                    <asp:RequiredFieldValidator ID="reqModuleID" runat="server" 
                        ControlToValidate="txtModuleID" ErrorMessage="Fill Module ID" CssClass="inptype"></asp:RequiredFieldValidator>
                </td>
            </tr>
            
            <tr>
                <td width='25%' class='tdgenap' >Item Sequence</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtItemSeq" runat="server" Width="65px" CssClass="inptype"></asp:TextBox>
                    <asp:RequiredFieldValidator ID="rfvItemSeq" runat="server" ControlToValidate="txtItemSeq"
                        ErrorMessage="*)" CssClass="inptype"></asp:RequiredFieldValidator>
                    <asp:RequiredFieldValidator ID="reqItemSequence" runat="server" 
                        ControlToValidate="txtItemSeq" ErrorMessage="Fill Item Sequence" CssClass="inptype"></asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Item Type ID</td>
                <td class='tdganjil'>
                    <asp:DropDownList ID="ddlItemTypeID" runat="server"></asp:DropDownList>
                    <asp:RequiredFieldValidator ID="rfvItemTypeID" runat="server" ControlToValidate="ddlItemTypeID"
                        ErrorMessage="*)" CssClass="inptype"></asp:RequiredFieldValidator>
                    <asp:RequiredFieldValidator ID="reqItemTypeID" runat="server" 
                        ControlToValidate="ddlItemTypeID" ErrorMessage="Fill Item Type ID" CssClass="inptype"></asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Item Description</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtItemDesc" runat="server" TextMode="MultiLine" Width="300px" 
                        CssClass="inptype" MaxLength="50"></asp:TextBox></td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Item Values Type</td>
                <td class='tdganjil'>
                    <asp:DropDownList ID="ddlItemValuesType" runat="server" CssClass="inptype"></asp:DropDownList>
                    <asp:RequiredFieldValidator ID="rfvItemValuesType" runat="server" ControlToValidate="ddlItemValuesType"
                        ErrorMessage="*)" CssClass="inptype"></asp:RequiredFieldValidator>
                    <asp:RequiredFieldValidator ID="reqItemValuesType" runat="server" 
                        ControlToValidate="ddlItemValuesType" ErrorMessage="Fill Item Values Type" CssClass="inptype"></asp:RequiredFieldValidator>
                </td> 
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Item Values</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtItemValues" runat="server" TextMode="MultiLine" 
                        Width="300px" CssClass="inptype" MaxLength="1000"></asp:TextBox></td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Is Required</td>
                <td class='tdganjil'>
                    <asp:CheckBox ID="cbIsRequired" runat="server"/>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Is Required Message</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtIsRequiredMsg" runat="server" TextMode="MultiLine" 
                        Width="300px" CssClass="inptype" MaxLength="100"></asp:TextBox></td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >HTML Additional Attributes</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtHTMLAdd" runat="server" TextMode="MultiLine" Width="300px" 
                        CssClass="inptype" MaxLength="1000"></asp:TextBox></td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap'  >Custom Java Script</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtCustomJavaScript" runat="server" TextMode="MultiLine" Width="300px" CssClass="inptype"></asp:TextBox></td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Additional Tags</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtAdditionalTags" runat="server" TextMode="MultiLine" Width="300px" CssClass="inptype"></asp:TextBox></td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Item Css Class</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtItemCssClass" runat="server" Width="200px" 
                        CssClass="inptype" MaxLength="100"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Item Description Css Class</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtItemDescCss" runat="server" TextMode="MultiLine" 
                        Width="300px" CssClass="inptype" MaxLength="100"></asp:TextBox></td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Is Currency</td>
                <td class='tdganjil'>
                    <asp:CheckBox ID="cbIsCurrency" runat="server"/>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Tool Tip</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtToolTip" runat="server" TextMode="MultiLine" Width="300px" 
                        CssClass="inptype" MaxLength="500"></asp:TextBox></td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Item In Row Priority</td>
                <td class='tdganjil'>
                   <asp:TextBox ID="txtItemPriority" runat="server" Width="65px" CssClass="inptype"></asp:TextBox>
                   <asp:RangeValidator ID="rvRowPriority" runat="server" ControlToValidate="txtItemPriority" ErrorMessage="Must be numeric between 1 and 99"
                            Font-Names="verdana" Font-Size="smaller" MaximumValue="99" MinimumValue="1"
                            Type="Integer"></asp:RangeValidator>
                </td>
            </tr>
        </table>
                <table align="center" border="0" cellpadding="0" cellspacing="0" width="95%">
        <tr>
           <td align="right">
                <asp:ImageButton ID="ImageButton1" runat="server" ImageUrl="~/Images/ButtonSave.gif"
                        onclick="btnSave_Click"/>&nbsp;
                <asp:ImageButton ID="ImageButton2" runat="server" ImageUrl="~/Images/ButtonCancel.gif" CausesValidation="false"
                        onclick="btnCancel_Click"/>&nbsp;
           </td>       
        </tr>
        </table>
        </asp:Panel>
        <br />
        <asp:Panel ID="pnlBufferList" runat="server" Width="100%" Visible="True">
        				<table cellspacing="0" cellpadding="0" width="95%" align="center" border="0">
					<tr class="trtopikuning">
						<td class="tdtopikiri" width="10" height="20">&nbsp;</td>
						<td class="tdtopi" align="center">DYNAMIC REPORT FORM DETAIL</td>
						<td class="tdtopikanan" width="10">&nbsp;</td>
					</tr>
				</table>
				<table class="tablegrid" cellspacing="0" cellpadding="0" width="95%" align="center" border="0">
            <tr>
                <td >
                    <asp:DataGrid ID="ListDG" runat="server" AutoGenerateColumns="False" 
                            CellPadding="4" ForeColor="#333333" GridLines="None" AllowSorting="true"
                            Width="100%" OnItemCommand="ListDG_ItemCommand"  AllowPaging="True" OnSortCommand="Sorting">
                            <AlternatingItemStyle CssClass="tdgenap" BackColor="White" ForeColor="#284775" />
                            <ItemStyle CssClass="tdganjil" HorizontalAlign="Center" BackColor="#F7F6F3" ForeColor="#333333" />
                            <HeaderStyle CssClass="tdjudul" HorizontalAlign="Center" BackColor="#5D7B9D" Font-Bold="True" ForeColor="White" />
                        <Columns>
                            <asp:TemplateColumn HeaderText="FORM ID" SortExpression="FormID">
                                <HeaderStyle HorizontalAlign="Center" />
                                <ItemStyle HorizontalAlign="Left" />
                                <ItemTemplate>
                                    <asp:Label ID="FormID" runat="server" Enabled="True" 
                                    Text='<%# DataBinder.Eval(Container.DataItem, "FormID") %>'></asp:Label>
                                </ItemTemplate>
                            </asp:TemplateColumn>
                            <asp:TemplateColumn HeaderText="ITEM ID" SortExpression="ItemID">
                                <HeaderStyle HorizontalAlign="Center" />
                                <ItemStyle HorizontalAlign="Left" />
                                <ItemTemplate>
                                    <asp:Label ID="ItemID" runat="server" Enabled="True" 
                                    Text='<%# DataBinder.Eval(Container.DataItem, "ItemID") %>'></asp:Label>
                                </ItemTemplate>
                            </asp:TemplateColumn>
                            <asp:TemplateColumn HeaderText="ITEM SEQUENCE" SortExpression="ItemSequence">
                                <HeaderStyle HorizontalAlign="Center" />
                                <ItemStyle HorizontalAlign="Left" />
                                <ItemTemplate>
                                    <asp:Label ID="ItemSeq" runat="server" Enabled="True" 
                                    Text='<%# DataBinder.Eval(Container.DataItem, "ItemSequence") %>'></asp:Label>
                                </ItemTemplate>
                            </asp:TemplateColumn>  
                            <asp:TemplateColumn HeaderText="ITEM TYPE ID" SortExpression="ItemTypeID">
                                <HeaderStyle HorizontalAlign="Center" />
                                <ItemStyle HorizontalAlign="Left" />
                                <ItemTemplate>
                                    <asp:Label ID="ItemTypeID" runat="server" Enabled="True" 
                                    Text='<%# DataBinder.Eval(Container.DataItem, "ItemTypeID") %>'></asp:Label>
                                </ItemTemplate>
                            </asp:TemplateColumn>
                            <asp:TemplateColumn HeaderText="ITEM DESC" SortExpression="ItemDesc">
                                <HeaderStyle HorizontalAlign="Center" />
                                <ItemStyle HorizontalAlign="Left" />
                                <ItemTemplate>
                                    <asp:Label ID="ItemDescription" runat="server" Enabled="True" 
                                    Text='<%# DataBinder.Eval(Container.DataItem, "ItemDesc") %>'></asp:Label>
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
                            <asp:TemplateColumn HeaderText="DELETE">
                                    <HeaderStyle HorizontalAlign="Center" />
                                    <ItemStyle HorizontalAlign="Center" />
                                    <ItemTemplate>
                                        <asp:ImageButton ID="Delete" runat="server" CommandName="Delete" Enabled="True" CausesValidation="false" 
                                            ImageUrl="~/Images/IconDelete.gif" />
                                    </ItemTemplate>
                                </asp:TemplateColumn> 
                        </Columns>
                        <PagerStyle BackColor="#284775" ForeColor="White" HorizontalAlign="Center"
                                Visible="False" />
                        <FooterStyle BackColor="#5D7B9D" Font-Bold="True" ForeColor="White" />
                        <EditItemStyle BackColor="#999999" />
                        <SelectedItemStyle BackColor="#E2DED6" Font-Bold="True" ForeColor="#333333" />
                    </asp:DataGrid> 
            </tr>
        </table> 
				<table height="25" cellspacing="0" cellpadding="0" width="95%" align="center" border="0">
                    <caption>
                        <tr>
                            <td align="center" width="30">
                                &nbsp;<asp:ImageButton ID="imbFirstPage" runat="server" CommandName="First" 
                                    ImageUrl="~/Images/butkiri1.gif" OnCommand="NavigationLink_Click" />
                                <font face="Verdana"></font>
                            </td>
                            <td align="center" width="30">
                                &nbsp;<asp:ImageButton ID="imbPrevPage" runat="server" CommandName="Prev" 
                                    ImageUrl="~/Images/butkiri.gif" OnCommand="NavigationLink_Click" />
                                <font face="Verdana"></font>
                            </td>
                            <td align="center" width="30">
                                &nbsp;<asp:ImageButton ID="imbNextPage" runat="server" CommandName="Next" 
                                    ImageUrl="~/Images/butkanan.gif" OnCommand="NavigationLink_Click" />
                                <font face="Verdana"></font>
                            </td>
                            <td align="center" width="30">
                                &nbsp;<asp:ImageButton ID="imbLastPage" runat="server" CommandName="Last" 
                                    ImageUrl="~/Images/butkanan1.gif" OnCommand="NavigationLink_Click" />
                                <font face="Verdana"></font>
                            </td>
                            <td align="center">
                                <font face="Verdana" size="2">Page&nbsp;</font>
                                <asp:TextBox ID="txtGoPage" runat="server" CssClass="InpType" MaxLength="10" 
                                    Width="34px">1</asp:TextBox>
                                &nbsp;<asp:ImageButton ID="imbGoPage" runat="server" ImageUrl="~/Images/butgo.gif" 
                                    onclick="imbGoPage_Click" />
                                <asp:RangeValidator ID="rvGo" runat="server" ControlToValidate="txtGoPage" 
                                    ErrorMessage="Page Is Not Valid" Font-Names="verdana" Font-Size="smaller" 
                                    MaximumValue="999999999" MinimumValue="1" Type="Integer"></asp:RangeValidator>
                                <font face="Verdana" size="2">&nbsp;&nbsp; </font>
                            </td>
                            <td align="right">
                                <font color="#999999"><font face="Verdana" size="2">Page&nbsp;</font>
                                <asp:Label ID="lblPage" runat="server" Font-Names="Verdana" Font-Size="Smaller"></asp:Label>
                                <font face="Verdana" size="2">of</font>
                                <asp:Label ID="lblTotPage" runat="server" Font-Names="Verdana" 
                                    Font-Size="Smaller"></asp:Label>
                                <font face="Verdana" size="2">, Total&nbsp; </font>
                                <asp:Label ID="lblTotRec" runat="server" Font-Size="Smaller"></asp:Label>
                                &nbsp; <font face="Verdana" size="2">record(s)</font></font>
                            </td>
                        </tr>
                    </caption>
        </table>
        <table align="center" border="0" cellpadding="0" cellspacing="0" width="95%">
        <tr>
           <td align="right">
                <asp:ImageButton ID="btnAdd" runat="server"
                    CausesValidation="true" ImageUrl="~/Images/ButtonAdd.gif" 
                    onclick="btnAdd_Click" />&nbsp;&nbsp;
                <asp:ImageButton ID="btnBack" runat="server"
                    CausesValidation="false" ImageUrl="~/Images/ButtonBack.gif" 
                    onclick="btnBack_Click"/>
           </td>       
        </tr>
        </table>
 
        </asp:Panel> 
        <br />
        &nbsp;
        <br />
        
    </form>
</body>
</html>
