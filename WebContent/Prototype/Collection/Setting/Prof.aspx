<%@ Register TagPrefix="uc1" TagName="UcLookupEmployee" Src="../../UserController/UcLookupEmployee.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcBranch" Src="../../UserController/UcBranch.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcBranchCollection" Src="../../UserController/UcBranchCollection.ascx" %>
<%@ Page Language="vb" AutoEventWireup="false" Codebehind="Prof.aspx.vb" Inherits="AdIns.Application.Eloan.Web.Prof" %>
<%@ Register TagPrefix="uc1" TagName="UcFindEmployee" Src="../../UserController/UcFindEmployee.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcCompanyAdress" Src="../../UserController/UcCompanyAdress.ascx" %>
<%@ Register TagPrefix="uc1" TagName="UcContactPerson" Src="../../UserController/UcContactPerson.ascx" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
  <HEAD>
		<title>CollectorResult</title>
<meta content="Microsoft Visual Studio .NET 7.1" name=GENERATOR>
<meta content="Visual Basic .NET 7.1" name=CODE_LANGUAGE>
<meta content=JavaScript name=vs_defaultClientScript>
<meta content=http://schemas.microsoft.com/intellisense/ie5 name=vs_targetSchema>
<LINK href="../../Confins.css" type=text/css rel=stylesheet >
</HEAD>
<body MS_POSITIONING="GridLayout">
<form id=Form1  runat="server">
<asp:label id=lblMessage runat="server"></asp:label>
<asp:panel id=pnlSearch runat="server">

<TABLE cellSpacing=0 cellPadding=0 align=center border=0 style="width: 95%">
  <TR class=trtopiabu>
    <TD class=tdtopikiri width=10 height=20></TD>
    <TD class=tdtopi align=center>
      <P>PROFESSIONAL EXECUTOR</P></TD>
    <TD class=tdtopikanan width=10></TD></TR></TABLE>
<TABLE class=tablegrid id=Table4 cellSpacing=1 cellPadding=2 width="95%" 
align=center border=0>
  <TR class=tdganjil>
    <TD class=tdgenap width="25%">Search By</TD>
    <TD class=tdganjil>
<asp:DropDownList id=cboSearchBy runat="server" Width="144px" Font-Names="Verdana">
<asp:ListItem Value="CGName">Collection Group Name</asp:ListItem>
<asp:ListItem Value="CollectorID">Collector ID</asp:ListItem>
<asp:ListItem Value="CollectorName">Collector Name</asp:ListItem>
</asp:DropDownList>&nbsp; 
<asp:TextBox id=TxtSearchByValue runat="server" Width="168px" CssClass="InpType"></asp:TextBox></TD></TR></TABLE>
<TABLE id=Table6 cellSpacing=0 cellPadding=0 width="95%" align=center 
  border=0>
  <TR align=right>
    <TD>
<asp:ImageButton id=BtnSearch runat="server" ImageUrl="../../Images/ButtonSearch.gif"></asp:ImageButton>&nbsp; 
<asp:ImageButton id=BtnReset runat="server" ImageUrl="../../Images/ButtonReset.gif"></asp:ImageButton></TD></TR></TABLE></asp:panel><br><br><asp:panel id=pnlList style="Z-INDEX: 101" Width="99.69%" Runat="server"><BR>
<TABLE cellSpacing=0 cellPadding=0 width="95%" align=center border=0>
  <TR class=trtopiabu>
    <TD class=tdtopikiri width=10 height=20></TD>
    <TD class=tdtopi align=center>
      <P>PROFESSIONAL EXECUTOR LISTING</P></TD>
    <TD class=tdtopikanan width=10></TD></TR></TABLE>
<TABLE cellSpacing=0 cellPadding=0 width="95%" align=center border=0>
  <TR align=center>
    <TD width="100%">
<asp:DataGrid id=dtgCollector runat="server" Width="100%" HorizontalAlign="Left" OnSortCommand="Sorting" AllowSorting="True" AutoGenerateColumns="False">
<AlternatingItemStyle CssClass="tdgenap">
</AlternatingItemStyle>

<ItemStyle Font-Size="XX-Small" Font-Names="Verdana" CssClass="tdganjilKegiatan">
</ItemStyle>

<HeaderStyle Font-Size="Smaller" Font-Names="Verdana" Font-Bold="True" HorizontalAlign="Center" CssClass="tdjudul">
</HeaderStyle>

<Columns>
<asp:TemplateColumn SortExpression="CGID" HeaderText="COLLECTION GROUP">
<ItemTemplate>
											<asp:HyperLink Runat=server Enabled=True ID="hpCGID" text='<%# container.dataitem("CGName") %>' NavigateUrl='<%# LinkTo(container.dataItem("CGID")) %>' >
											</asp:HyperLink>
										
</ItemTemplate>
</asp:TemplateColumn>
<asp:BoundColumn Visible="False" DataField="CGID" SortExpression="CGID" HeaderText="COLL GROUP ID"></asp:BoundColumn>
<asp:BoundColumn Visible="False" DataField="CollectorID" HeaderText="COLLECTOR ID"></asp:BoundColumn>
<asp:TemplateColumn SortExpression="CollectorID" HeaderText="COLLECTOR ID">
<ItemTemplate>
											<asp:HyperLink Runat=server Enabled=True ID="hpCollector" text='<%# container.dataitem("CollectorID") %>' NavigateUrl='<%# LinkToCollector(container.dataItem("CollectorID"),container.dataItem("CGID")) %>' >
											</asp:HyperLink>
										
</ItemTemplate>
</asp:TemplateColumn>
<asp:BoundColumn DataField="Name" SortExpression="Name" HeaderText="COLLECTOR NAME"></asp:BoundColumn>
<asp:BoundColumn DataField="PhoneNo" SortExpression="PhoneNo" HeaderText="PHONE NO"></asp:BoundColumn>
<asp:BoundColumn DataField="MOBILEPHONE" SortExpression="MOBILEPHONE" HeaderText="MOBILE PHONE"></asp:BoundColumn>
<asp:BoundColumn DataField="Active" SortExpression="Active" HeaderText="ACTIVE"></asp:BoundColumn>
<asp:TemplateColumn HeaderText="EDIT">
<ItemStyle HorizontalAlign="Center">
</ItemStyle>

<ItemTemplate>
											<asp:ImageButton id="ImbEdit" runat="server" ImageUrl="../../Images/iconedit.gif" CommandName="Edit"></asp:ImageButton>
										
</ItemTemplate>
</asp:TemplateColumn>
<asp:TemplateColumn HeaderText="DELETE">
<ItemStyle HorizontalAlign="Center">
</ItemStyle>

<ItemTemplate>
											<asp:ImageButton id="ImbDelete" runat="server" ImageUrl="../../Images/icondelete.gif" CommandName="Delete" CausesValidation="False"></asp:ImageButton>
										
</ItemTemplate>
</asp:TemplateColumn>
</Columns>
</asp:DataGrid></TD></TR></TABLE>
<TABLE id=Table5 style="HEIGHT: 53px" height=53 cellSpacing=0 cellPadding=0 
width="95%" align=center border=0>
  <TR>
    <TD align=center width=30>
<asp:imagebutton id=imbFirstPage runat="server" ImageUrl="../../Images/butkiri1.gif" CausesValidation="False" OnCommand="NavigationLink_Click" CommandName="First"></asp:imagebutton><FONT 
      face=Verdana></FONT></TD>
    <TD align=center width=30>
<asp:imagebutton id=imbPrevPage runat="server" ImageUrl="../../Images/butkiri.gif" CausesValidation="False" OnCommand="NavigationLink_Click" CommandName="Prev"></asp:imagebutton><FONT 
      face=Verdana></FONT></TD>
    <TD align=center width=30>
<asp:imagebutton id=imbNextPage runat="server" ImageUrl="../../Images/butkanan.gif" CausesValidation="False" OnCommand="NavigationLink_Click" CommandName="Next"></asp:imagebutton><FONT 
      face=Verdana></FONT></TD>
    <TD align=center width=30>
<asp:imagebutton id=imbLastPage runat="server" ImageUrl="../../Images/butkanan1.gif" CausesValidation="False" OnCommand="NavigationLink_Click" CommandName="Last"></asp:imagebutton><FONT 
      face=Verdana></FONT></TD>
    <TD style="WIDTH: 247px" align=center width=247><FONT face=Verdana 
      size=2>Halaman&nbsp; </FONT>
<asp:TextBox id=txtGoPage runat="server" Width="34px" CssClass="InpType">1</asp:TextBox>
<asp:imagebutton id=imbGoPage runat="server" ImageUrl="..\..\Images\butgo.gif" ImageAlign="AbsBottom" EnableViewState="False"></asp:imagebutton>
<asp:RangeValidator id=rgvGo runat="server" Font-Names="Verdana" Font-Size="Smaller" ErrorMessage="Page is not valid" MinimumValue="0" ControlToValidate="txtGoPage"></asp:RangeValidator><FONT 
      face=Verdana size=2>&nbsp;&nbsp; </FONT></TD>
    <TD align=right><FONT color=#999999><FONT face=Verdana size=2>Page&nbsp; 
      </FONT>
<asp:label id=lblPage runat="server" Font-Names="Verdana" Font-Size="Smaller"></asp:label><FONT 
      face=Verdana size=2>&nbsp;of </FONT>
<asp:label id=lblTotPage runat="server" Font-Names="Verdana" Font-Size="Smaller"></asp:label><FONT 
      face=Verdana size=2>, Total&nbsp; </FONT>
<asp:label id=lblTotRec runat="server" Font-Size="Smaller"></asp:label>&nbsp;<FONT 
      face=Verdana size=2>record(s)</FONT></FONT></TD></TR></TABLE>
<TABLE id=Table1 style="HEIGHT: 25px" height=25 cellSpacing=0 cellPadding=0 
width="95%" align=center border=0 runat="server">
  <TR>
    <TD style="WIDTH: 160px" align=left>
<asp:ImageButton id=imbPrint runat="server" ImageUrl="..\..\images\buttonprint.gif"></asp:ImageButton></TD>
    <TD align=right><FONT face=Verdana>
<asp:ImageButton id=BtnAdd runat="server" ImageUrl="..\..\images\buttonadd.gif"></asp:ImageButton></FONT></TD></TR></TABLE></asp:panel><asp:panel 
id=pnlAddEdit style="Z-INDEX: 102" Width="100%" 
Runat="server" HorizontalAlign="Center">
<TABLE id=Table2 cellSpacing=0 cellPadding=0 width="95%" align=center 
  border=0>
  <TR class=trtopiabu>
    <TD class=tdtopikiri width=10 height=20></TD>
    <TD class=tdtopi align=center>COLLECTION&nbsp;SETTING&nbsp;&nbsp;- 
<asp:Label id=lblMenuAddEdit runat="server"></asp:Label></TD>
    <TD class=tdtopikanan width=10></TD></TR></TABLE>
<TABLE class=tablegrid cellSpacing=1 cellPadding=2 width="95%" align=center 
border=0>
  <TR class=tdganjil>
    <TD class=tdgenap style="HEIGHT: 14px" width="25%">Collection Group </TD>
    <TD class=tdganjil style="COLOR: red; HEIGHT: 14px">
<asp:Label id=lblCollectionGroup runat="server" Width="352px" ForeColor="Black"></asp:Label></TD></TR>
  <TR class=tdganjil>
    <TD class=tdgenap style="HEIGHT: 5px" width="25%">
      <DIV align=left>Collector Id</DIV></TD>
    <TD class=tdganjil style="HEIGHT: 5px">
<asp:DropDownList id=cboCollectorID runat="server">
<asp:ListItem Value="Flin">Flin</asp:ListItem>
</asp:DropDownList>
<asp:Label id=lblCollectorID runat="server" Width="384px" ForeColor="Black"></asp:Label></TD></TR></TABLE>
<uc1:UcFindEmployee id=UcEmployee runat="server"></uc1:UcFindEmployee>
<TABLE class=tablegrid cellSpacing=1 cellPadding=2 width="95%" align=center 
  <TR>
  <TR>
    <TD class=tdgenap style="HEIGHT: 14px" width="25%">
      <DIV align=left>Collector Type</DIV></TD>
    <TD class=tdganjil style="HEIGHT: 14px">
<asp:DropDownList id=cboCollectorType runat="server">
<asp:ListItem Value="COL">COL</asp:ListItem>
<asp:ListItem Value="COM">COM</asp:ListItem>
</asp:DropDownList></TD></TR>
  <TR>
    <TD class=tdgenap style="HEIGHT: 15px" width="25%">
      <DIV align=left>Supervisor</DIV></TD>
    <TD class=tdganjil style="HEIGHT: 15px">
<asp:DropDownList id=cboSupervisor runat="server">
<asp:ListItem Value="Flin">Flin</asp:ListItem>
<asp:ListItem Value="Cahyo">Cahyo</asp:ListItem>
</asp:DropDownList></TD></TR>
  <TR>
    <TD class=tdgenap width="25%">
      <DIV align=left>Active</DIV></TD>
    <TD class=tdganjil style="HEIGHT: 22px">
<asp:CheckBox id=cbActive runat="server"></asp:CheckBox></TD></TR></TABLE>
<P></P>
<TABLE id=TableAddSave style="HEIGHT: 19px" cellSpacing=0 cellPadding=0 
width="95%" align=center border=0>
  <TR>
    <TD align=right>&nbsp;&nbsp; 
<asp:ImageButton id=imbSave runat="server" ImageUrl="..\..\Images\ButtonSave.gif"></asp:ImageButton>&nbsp; 
<asp:ImageButton id=imgCancel runat="server" ImageUrl="..\..\Images\ButtonCancel.gif" CausesValidation="False"></asp:ImageButton>&nbsp; 
      <A href="javascript:history.back();"></A></TD></TR></TABLE></asp:panel>
<P>&nbsp;</P>
<table></table></TABLE></form>
	</body>
</HTML>
