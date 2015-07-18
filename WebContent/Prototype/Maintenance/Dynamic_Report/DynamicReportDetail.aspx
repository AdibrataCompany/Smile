<%@ Page Language="C#" AutoEventWireup="true" CodeFile="DynamicReportDetail.aspx.cs" Inherits="Dynamic_Report_DynamicReportDetail" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1" runat="server">
    <LINK href="../Include/CSS/AccMnt.css" type='text/css' rel='stylesheet'>
    <title>Dynamic Report Detail</title>
</head>
<body>
    <form id="form1" runat="server">
        <asp:Panel ID="pnlTop" runat="server" Width="100%" Visible="false" >
               <table cellspacing="0" cellpadding="0" width="95%" align="center" border="0">
					<tr class="trtopikuning">
						<td class="tdtopikiri" width="10" height="20">&nbsp;</td>
						<td class="tdtopi" align="center">DYNAMIC REPORT DETAIL</td>
						<td class="tdtopikanan" width="10">&nbsp;</td>
					</tr>
				</table>
        <table class="tablegrid" cellspacing="1" cellpadding="3" width="95%" align="center" border="0">
            <tr>
                <td width='25%' class='tdgenap'>Report ID</td>
                <td class='tdganjil'>
                    <asp:Label ID="lblReportID" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Module ID</td>
                <td class='tdganjil'>
                    <asp:Label ID="lblModuleID" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Company ID</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtCompanyID" runat="server" MaxLength="10" Width="300px" CssClass="inptype"></asp:TextBox>
                    <asp:RequiredFieldValidator ID="rfvCompanyID" runat="server" ControlToValidate="txtCompanyID"
                        ErrorMessage="*)" CssClass="inptype"></asp:RequiredFieldValidator>
                    <asp:RequiredFieldValidator ID="reqCompanyID" runat="server" 
                        ControlToValidate="txtCompanyID" ErrorMessage="Fill Company ID" CssClass="inptype"></asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Report Name</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtReportName" runat="server" MaxLength="200" Width="300px" CssClass="inptype"></asp:TextBox>
                    .rpt
                    <asp:RequiredFieldValidator ID="rfvReportName" runat="server" ControlToValidate="txtReportName"
                        ErrorMessage="*)" CssClass="inptype"></asp:RequiredFieldValidator>
                    <asp:RequiredFieldValidator ID="reqReportName" runat="server" 
                        ControlToValidate="txtReportName" ErrorMessage="Fill Report Name" CssClass="inptype"></asp:RequiredFieldValidator>
                        
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Report Path</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtReportPath" runat="server" MaxLength="2000" Width="300px" CssClass="inptype"></asp:TextBox>
                    <asp:RequiredFieldValidator ID="rfvReportPath" runat="server" ControlToValidate="txtReportPath"
                        ErrorMessage="*)" CssClass="inptype"></asp:RequiredFieldValidator>
                    <asp:RequiredFieldValidator ID="reqReportPath" runat="server" 
                        ControlToValidate="txtReportPath" ErrorMessage="Fill Report Path" CssClass="inptype"></asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Store Procedure Name</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtSP" runat="server" MaxLength="200" Width="300px" CssClass="inptype"></asp:TextBox>
                    <asp:RequiredFieldValidator ID="rfvSP" runat="server" ControlToValidate="txtSP"
                        ErrorMessage="*)" CssClass="inptype"></asp:RequiredFieldValidator>
                    <asp:RequiredFieldValidator ID="reqSP" runat="server" 
                        ControlToValidate="txtSP" ErrorMessage="Fill Store Procedure Name" CssClass="inptype"></asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td width='25%' class='tdgenap' >Description Detail</td>
                <td class='tdganjil'>
                    <asp:TextBox ID="txtDescriptionDetail" runat="server" TextMode="MultiLine" 
                        Width="300px" CssClass="inptype" MaxLength="200"></asp:TextBox></td>
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
						<td class="tdtopi" align="center">DYNAMIC FORM DETAIL</td>
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
                            <asp:TemplateColumn HeaderText="REPORT ID" SortExpression="ReportID">
                                <HeaderStyle HorizontalAlign="Center" />
                                <ItemStyle HorizontalAlign="Left" />
                                <ItemTemplate>
                                    <asp:Label ID="ReportID" runat="server" Enabled="True" 
                                    Text='<%# DataBinder.Eval(Container.DataItem, "ReportID") %>'></asp:Label>
                                </ItemTemplate>
                            </asp:TemplateColumn>
                            <asp:TemplateColumn HeaderText="MODULE ID" SortExpression="ModuleID">
                                <HeaderStyle HorizontalAlign="Center" />
                                <ItemStyle HorizontalAlign="Left" />
                                <ItemTemplate>
                                    <asp:Label ID="ModuleID" runat="server" Enabled="True" 
                                    Text='<%# DataBinder.Eval(Container.DataItem, "ModuleID") %>'></asp:Label>
                                </ItemTemplate>
                            </asp:TemplateColumn>
                            <asp:TemplateColumn HeaderText="COMPANY ID" SortExpression="CompanyID">
                                <HeaderStyle HorizontalAlign="Center" />
                                <ItemStyle HorizontalAlign="Left" />
                                <ItemTemplate>
                                    <asp:Label ID="CompanyID" runat="server" Enabled="True" 
                                    Text='<%# DataBinder.Eval(Container.DataItem, "CompanyID") %>'></asp:Label>
                                </ItemTemplate>
                            </asp:TemplateColumn>  
                            <asp:TemplateColumn HeaderText="REPORT NAME" SortExpression="ReportName">
                                <HeaderStyle HorizontalAlign="Center" />
                                <ItemStyle HorizontalAlign="Left" />
                                <ItemTemplate>
                                    <asp:Label ID="ReportName" runat="server" Enabled="True" 
                                    Text='<%# DataBinder.Eval(Container.DataItem, "ReportName") %>'></asp:Label>
                                </ItemTemplate>
                            </asp:TemplateColumn>
                            <asp:TemplateColumn HeaderText="REPORT PATH" SortExpression="ReportPath">
                                <HeaderStyle HorizontalAlign="Center" />
                                <ItemStyle HorizontalAlign="Left" />
                                <ItemTemplate>
                                    <asp:Label ID="ReportPath" runat="server" Enabled="True" 
                                    Text='<%# DataBinder.Eval(Container.DataItem, "ReportPath") %>'></asp:Label>
                                </ItemTemplate>
                            </asp:TemplateColumn>
                            <asp:templatecolumn headertext="VIEW SUBREPORT DETAIL">
										<headerstyle horizontalalign="Center"></headerstyle>
										<itemstyle horizontalalign="Center"></itemstyle>
										<itemtemplate>
											 <asp:ImageButton ID="ViewSubreportDetail" runat="server" CommandName="ViewSubreportDetail" Enabled="True" CausesValidation="false" 
                                            ImageUrl="~/Images/IconReceived.gif" />
										</itemtemplate>
								</asp:templatecolumn>
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
