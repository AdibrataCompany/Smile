<%@ Page Language="vb" AutoEventWireup="false" Codebehind="AssetCheckList.aspx.vb" Inherits="AdIns.Application.Eloan.Web.Collection.AssetCheckList" %>
<%@ Register TagPrefix="uc1" TagName="UcSearchBy" Src="../../UserController/UcSearchBy.ascx" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
  <HEAD>
		<title>AssetCheckList</title>
		<meta content="Microsoft Visual Studio .NET 7.1" name="GENERATOR">
		<meta content="Visual Basic .NET 7.1" name="CODE_LANGUAGE">
		<meta content="JavaScript" name="vs_defaultClientScript">
		<LINK href="../../include/collection.css" type="text/css" rel="stylesheet">
		<meta content="http://schemas.microsoft.com/intellisense/ie5" name="vs_targetSchema">
		<SCRIPT src="../../Elsa.js"></SCRIPT>
		<!--
		<script language="javascript">
			function fback() {
					history.back(-1);
					return false;
			}	
		</script>		
		-->
</HEAD>
	<body vLink="blue" aLink="black" link="blue" ms_positioning="GridLayout">
		<form id="Form1" method="post" runat="server">
			&nbsp;
			<asp:label id="lblMessage" runat="server" forecolor="#993300" font-name="Verdana" font-size="11px"></asp:label><asp:panel id="pnlList" runat="server">
<TABLE cellSpacing=0 cellPadding=0 width="95%" align=center border=0>
  <TR class=trtopikuning>
    <TD class=tdtopikiri width=10 height=20>&nbsp;</TD>
    <TD class=tdtopi align=center>ASSET CHECK LIST</TD>
    <TD class=tdtopikanan width=10>&nbsp;</TD></TR></TABLE>
<TABLE class=tablegrid cellSpacing=1 cellPadding=3 width="95%" align=center 
border=0>
<uc1:ucsearchby id=oSearchBy runat="server"></uc1:ucsearchby></TABLE>
<TABLE cellSpacing=0 cellPadding=0 width="95%" align=center border=0>
  <TR>
    <TD>
      <DIV align=right>
<asp:imagebutton id=imgsearch runat="server" imageurl="../../Images/ButtonSearch.gif" height="20" width="100"></asp:imagebutton>
<asp:imagebutton id=imbReset runat="server" imageurl="../../Images/ButtonReset.gif" causesvalidation="False"></asp:imagebutton></DIV></TD></TR></TABLE><BR>
<asp:panel id=pnlDtGrid runat="server">
<TABLE cellSpacing=0 cellPadding=0 width="95%" align=center border=0>
  <TR class=trtopikuning>
    <TD class=tdtopikiri width=10 height=20>&nbsp;</TD>
    <TD class=tdtopi align=center>ASSET CHECK LIST</TD>
    <TD class=tdtopikanan width=10>&nbsp;</TD></TR></TABLE>
<TABLE class=tablegrid cellSpacing=0 cellPadding=0 width="95%" align=center 
border=0>
  <TR>
    <TD>
<asp:datagrid id=dtgAssetCheckList runat="server" width="100%" cellpadding="0" onsortcommand="SortGrid" backcolor="White" borderwidth="1px" borderstyle="None" bordercolor="#CCCCCC" datakeyfield="AssetTypeID" autogeneratecolumns="False" allowsorting="True" allowpaging="True">
									<SelectedItemStyle CssClass="tdgenap"></SelectedItemStyle>
									<AlternatingItemStyle CssClass="tdgenap"></AlternatingItemStyle>
									<ItemStyle CssClass="tdganjil"></ItemStyle>
									<HeaderStyle CssClass="tdjudul"></HeaderStyle>
									<FooterStyle ForeColor="#000066" BackColor="White"></FooterStyle>
									<Columns>
										<asp:TemplateColumn SortExpression="AssetType.Description" HeaderText="ASSET TYPE">
											<HeaderStyle Font-Underline="True" HorizontalAlign="Center" Height="30px"></HeaderStyle>
											<ItemStyle HorizontalAlign="Left" Width="10%"></ItemStyle>
											<ItemTemplate>
												<asp:Label ID=lblAssetTypeIDdtg text='<%#Container.dataItem("AssetDescr")%>' Runat=server >
												</asp:Label>
											</ItemTemplate>
										</asp:TemplateColumn>
										<asp:TemplateColumn  HeaderText="ASSET TYPE ID" visible=false>
											<HeaderStyle Font-Underline="True" HorizontalAlign="Center" Height="30px"></HeaderStyle>
											<ItemStyle HorizontalAlign="Left" Width="5%"></ItemStyle>
											<ItemTemplate>
												<asp:Label ID=lblAssetTypeId text='<%#Container.dataItem("AssetTypeID")%>' Runat=server >
												</asp:Label>
											</ItemTemplate>
										</asp:TemplateColumn>
										<asp:TemplateColumn SortExpression="CheckListID" HeaderText="CHECK LIST ID">
											<HeaderStyle Font-Underline="True" HorizontalAlign="Center" Height="30px"></HeaderStyle>
											<ItemStyle HorizontalAlign="Left" Width="15%"></ItemStyle>
											<ItemTemplate>
												<asp:label id=lblCheckListIDdtg runat="server" text='<%#Container.DataItem("CheckListID")%>'>
												</asp:label>
											</ItemTemplate>
										</asp:TemplateColumn>
										<asp:TemplateColumn SortExpression="AssetRepossesionCheckListSetting.Description" HeaderText="DESCRIPTION">
											<HeaderStyle Font-Underline="True" HorizontalAlign="Center" Height="30px"></HeaderStyle>
											<ItemStyle HorizontalAlign="Left" Width="20%"></ItemStyle>
											<ItemTemplate>
												<asp:label id=lblDescription runat="server" text='<%#Container.DataItem("Description")%>'>
												</asp:label>
											</ItemTemplate>
										</asp:TemplateColumn>
										<asp:TemplateColumn SortExpression="IsYNQuestion" HeaderText="YESNO / QTY QUESTION">
											<HeaderStyle Font-Underline="True" HorizontalAlign="Center" Height="30px"></HeaderStyle>
											<ItemStyle HorizontalAlign="Left" Width="10%"></ItemStyle>
											<ItemTemplate>
												<asp:label id=lblIsYNQuestion runat="server" text='<%#Container.DataItem("IsYNQuestion")%>'>
												</asp:label>
											</ItemTemplate>
										</asp:TemplateColumn>										
										<asp:TemplateColumn SortExpression="IsActive" HeaderText="ACTIVE" Visible=false>
											<HeaderStyle Font-Underline="True" HorizontalAlign="Center" Height="30px"></HeaderStyle>
											<ItemStyle HorizontalAlign="Left" Width="10%"></ItemStyle>
											<ItemTemplate>
												<asp:label id=lblIsActive runat="server" text='<%#Container.DataItem("IsActive")%>'>
												</asp:label>
											</ItemTemplate>
										</asp:TemplateColumn>
										<asp:TemplateColumn HeaderText="EDIT">
											<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
											<ItemStyle HorizontalAlign="Center" Width="5%"></ItemStyle>
											<ItemTemplate>
												<asp:imagebutton id="imbEdit" runat="server" imageurl="../../Images/IconEdit.gif" causesvalidation="False" 
 commandname="EDIT"></asp:imagebutton>
											</ItemTemplate>
										</asp:TemplateColumn>
										<asp:TemplateColumn HeaderText="DELETE">
											<HeaderStyle HorizontalAlign="Center"></HeaderStyle>
											<ItemStyle HorizontalAlign="Center" Width="5%"></ItemStyle>
											<ItemTemplate>
												<asp:imagebutton id="imbDelete" runat="server" imageurl="../../Images/IconDelete.gif" causesvalidation="False" 
 commandname="DELETE"></asp:imagebutton>
											</ItemTemplate>
										</asp:TemplateColumn>
									</Columns>
									<PagerStyle Visible="False" HorizontalAlign="Left" ForeColor="#000066" BackColor="White" Mode="NumericPages"></PagerStyle>
								</asp:datagrid></TD></TR></TABLE>
<TABLE height=25 cellSpacing=0 cellPadding=0 width="95%" align=center 
  border=0>
  <TR>
    <TD>
<asp:imagebutton id=imbFirstPage runat="server" imageurl="../../images/butkiri1.gif" commandname="First" oncommand="NavigationLink_Click"></asp:imagebutton>&nbsp;&nbsp; 
<asp:imagebutton id=imbPrevPage runat="server" imageurl="../../images/butkiri.gif" commandname="Prev" oncommand="NavigationLink_Click"></asp:imagebutton>&nbsp;&nbsp; 
<asp:imagebutton id=imbNextPage runat="server" imageurl="../../images/butkanan.gif" commandname="Next" oncommand="NavigationLink_Click"></asp:imagebutton>&nbsp;&nbsp; 
<asp:imagebutton id=imbLastPage runat="server" imageurl="../../images/butkanan1.gif" commandname="Last" oncommand="NavigationLink_Click"></asp:imagebutton></TD>
    <TD align=center width=130>Page 
<ASP:TEXTBOX id=txtpage runat="server" width="34px" CssClass="inptype" maxlength="3">1</ASP:TEXTBOX>&nbsp; 
<asp:imagebutton id=imbGoPage runat="server" imageurl="../../images/butgo.gif" width="30" cssclass="inptype"></asp:imagebutton></TD>
<ASP:RANGEVALIDATOR id=rgvGo runat="server" font-size="11px" font-name="Verdana" forecolor="#993300" type="Integer" maximumvalue="999999999" errormessage="Page No. is not valid" minimumvalue="1" controltovalidate="txtpage"></ASP:RANGEVALIDATOR>
<ASP:REQUIREDFIELDVALIDATOR id=rfvGo runat="server" font-size="11px" font-name="Verdana" forecolor="#993300" errormessage="Page No. is not valid" controltovalidate="txtpage"></ASP:REQUIREDFIELDVALIDATOR>&nbsp;&nbsp; 

    <TD align=right><FONT color=#999999>Page 
<asp:label id=lblPage runat="server" forecolor="#999999"></asp:label>&nbsp;of 
<asp:label id=lblTotPage runat="server" forecolor="#999999"></asp:label>, 
      Total 
<asp:label id=lblRecord runat="server" forecolor="#999999"></asp:label>&nbsp;record(s)</FONT></TD></TR></TABLE>
<TABLE cellSpacing=0 cellPadding=0 width="95%" align=center border=0>
  <TR>
    <TD align=left>
<asp:imagebutton id=imbPrint runat="server" imageurl="../../images/buttonprint.gif"></asp:imagebutton></TD>
    <TD align=right>
<asp:imagebutton id=ImgAddNew runat="server" imageurl="../../Images/ButtonAdd.gif"></asp:imagebutton></TD></TR></TABLE></asp:panel>
			</asp:panel><asp:panel id="pnlAdd" runat="server">
<TABLE cellSpacing=0 cellPadding=0 width="95%" align=center border=0>
  <TR class=trtopikuning>
    <TD class=tdtopikiri width=10 height=20>&nbsp;</TD>
    <TD class=tdtopi align=center>
<ASP:LABEL id=lblTitle runat="server"></ASP:LABEL></TD>
    <TD class=tdtopikanan width=10>&nbsp;</TD></TR></TABLE>
<TABLE class=tablegrid cellSpacing=1 cellPadding=3 width="95%" align=center 
border=0>
  <TR>
    <TD class=tdgenap width="25%">
      <DIV align=left>Asset Type </DIV></TD>
    <TD class=tdganjil colSpan=3>
<asp:DropDownList id=cboAssetType runat="server"></asp:DropDownList>
<asp:Label id=lblAssetTypeID runat="server"></asp:Label>
<ASP:REQUIREDFIELDVALIDATOR id=rfvAssetType runat="server" font-size="11px" font-name="Verdana" errormessage="Please Choose Asset Type" controltovalidate="cboAssetType" display="Dynamic"></ASP:REQUIREDFIELDVALIDATOR></TD></TR>
  <TR>
    <TD class=tdgenap width="25%">Check List ID</TD>
    <TD class=tdganjil colSpan=3>
<asp:TextBox id=txtCheckListID runat="server" CssClass="inptype" MaxLength="10"></asp:TextBox>
<asp:Label id=lblCheckListID runat="server"></asp:Label>
<ASP:REQUIREDFIELDVALIDATOR id=rfvCheckListID runat="server" font-size="11px" font-name="Verdana" errormessage="Please Fill Check List ID" controltovalidate="txtCheckListID" display="Dynamic"></ASP:REQUIREDFIELDVALIDATOR></TD></TR>
  <TR>
    <TD class=tdgenap width="25%">
      <DIV align=left>Description</DIV></TD>
    <TD class=tdganjil colSpan=3>
<ASP:TEXTBOX id=txtDescription runat="server" width="475px" CssClass="inptype" maxlength="100"></ASP:TEXTBOX>
<ASP:REQUIREDFIELDVALIDATOR id=rfvDescription runat="server" font-size="11px" font-name="Verdana" errormessage="Please Fill Description" controltovalidate="txtDescription" display="Dynamic"></ASP:REQUIREDFIELDVALIDATOR></TD></TR>
  <TR>
    <TD class=tdgenap width="25%">Question Type</TD>
    <TD class=tdganjil colSpan=3>
<asp:RadioButtonList id=rdoQuestioType runat="server" RepeatDirection="Horizontal" Width="259px">
								<asp:ListItem Value="1">Y/N Question</asp:ListItem>
								<asp:ListItem Value="0">QTY Question</asp:ListItem>
							</asp:RadioButtonList>
<ASP:REQUIREDFIELDVALIDATOR id=REQUIREDFIELDVALIDATOR1 runat="server" font-size="11px" font-name="Verdana" errormessage="Please Choose Question Type" controltovalidate="rdoQuestioType" display="Dynamic"></ASP:REQUIREDFIELDVALIDATOR></TD></TR>
  <TR>
    <TD class=tdgenap width="25%">Active</TD>
    <TD class=tdganjil colSpan=3>
<asp:CheckBox id=chkIsActive runat="server"></asp:CheckBox></TD></TR>
  </TABLE>
<TABLE cellSpacing=0 cellPadding=0 width="95%" align=center border=0>
  <TR>
    <TD align=right>
<ASP:IMAGEBUTTON id=btnSaveAdd runat="server" imageurl="../../Images/ButtonSave.gif" causesvalidation="True"></ASP:IMAGEBUTTON>
<ASP:IMAGEBUTTON id=btnCancelAdd runat="server" imageurl="../../Images/ButtonCancel.gif" causesvalidation="False"></ASP:IMAGEBUTTON></TD></TR></TABLE>
			</asp:panel></form>
	</body>
</HTML>
