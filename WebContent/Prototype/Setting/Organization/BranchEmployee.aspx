<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>BRANCH EMPLOYEE</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<style type="text/css">
.style1 {
	background-color: #F4FAFF;
	text-align: left;
}
.style2 {
	background-color: #FFFFFF;
	text-align: left;
}
.style3 {
	text-align: left;
}
</style>
</head>

<body>
<form id="FrmBranchEmployee" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiorangekiri">&nbsp;</td>
      <td align="center" class="tdtopiorange">BRANCH EMPLOYEE</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="style1">Branch ID</td>
      <td class="style2" colspan="5">
		<asp:HyperLink runat="server" id="ListBranchId" NavigateUrl="BranchView.aspx" Target="_blank">A03
		</asp:HyperLink>
		</td>
    </tr>
    <tr> 
      <td class="style1">Branch Name</td>
      <td class="style2" colspan="5">Grand Wijaya</td>
    </tr>
    <tr> 
      <td width="20%" class="style1">Search By</td>
      <td class="style2">
		<asp:DropDownList runat="server" id="CmbSearch" CssClass="inptype">
			<asp:ListItem>Employee ID</asp:ListItem>
			<asp:ListItem>Employee Name</asp:ListItem>
		</asp:DropDownList>
        &nbsp;
        <asp:TextBox runat="server" id="TbsSearch" CssClass="inptype"></asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td width="20%" class="style1">Position</td>
      <td class="style2">
		<asp:DropDownList runat="server" id="CmbSearchPosition" CssClass="inptype">
			<asp:ListItem>All</asp:ListItem>
			<asp:ListItem>Marketing</asp:ListItem>
			<asp:ListItem>Marketing Supervisor</asp:ListItem>
			<asp:ListItem>Branch Manager</asp:ListItem>
			<asp:ListItem>Credit Analyst</asp:ListItem>
			<asp:ListItem>CA Supervisor</asp:ListItem>
			<asp:ListItem>Collection Head</asp:ListItem>
			<asp:ListItem>Collector Lancar</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnSearch" ImageUrl="../../images/ButtonSearch.gif" PostBackUrl="BranchEmployee.aspx" /> &nbsp;
		<asp:ImageButton runat="server" id="BtnReset" ImageUrl="../../images/ButtonReset.gif" PostBackUrl="BranchEmployee.aspx" />&nbsp;</td>
    </tr>
  </table>
  <br />
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiorangekiri">&nbsp;</td>
      <td align="center" class="tdtopiorange">BRANCH EMPLOYEE LISTING</td>
      <td width="10" class="tdtopiorangekanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
    <div align="center"> 
      <asp:GridView runat="server" id="GrdViewBranchEmployee" DataSourceID="XmlDataSource1" AutoGenerateColumns="False" CellPadding="2" Width="95%" ToolTip="Example Id : 001, Name : Hanny, Position : Marketing">
		<Columns>
			<asp:templatefield HeaderText="ID">
				<AlternatingItemTemplate>
					<asp:HyperLink runat="server" id="LinkId" NavigateUrl="BranchEmployeeView.aspx" Target="_blank">xxxxx10xxxxx
					</asp:HyperLink>
				</AlternatingItemTemplate>
				<ItemStyle HorizontalAlign="Left" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="LinkId" NavigateUrl="BranchEmployeeView.aspx" Target="_blank">xxxxx10xxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="NAME">
				<ItemStyle HorizontalAlign="Left" />
			</asp:boundfield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="POSITION">
				<ItemStyle HorizontalAlign="Left" />
			</asp:boundfield>
			<asp:templatefield HeaderText="EDIT">
				<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="BtnIcoEdit" ImageUrl="../../images/IconEdit.gif" Height="16px" PostBackUrl="BranchEmployeeEdit.aspx" />
				</AlternatingItemTemplate>
				<ItemStyle Width="15%" />
				<HeaderStyle Width="15%" />
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnIcoEdit" ImageUrl="../../images/IconEdit.gif" Height="16px" PostBackUrl="BranchEmployeeEdit.aspx" />
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="DELETE">
				<AlternatingItemTemplate>
					<asp:ImageButton runat="server" id="BtnIcoDelete" ImageUrl="../../images/IconDelete.gif" />
				</AlternatingItemTemplate>
				<ItemStyle Width="15%" />
				<HeaderStyle Width="15%" />
				<ItemTemplate>
					<asp:ImageButton runat="server" id="BtnIcoDelete" ImageUrl="../../images/IconDelete.gif" />
				</ItemTemplate>
			</asp:templatefield>
		</Columns>
		<HeaderStyle CssClass="tdjudulorange" />
		<AlternatingRowStyle CssClass="tdgenap" />
		</asp:GridView>
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
    </div>
    
  </div>
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnFirstPrev" ImageUrl="../../images/butkiri1.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnPrev" ImageUrl="../../images/butkiri.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnNext" ImageUrl="../../images/butkanan.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnLastNext" ImageUrl="../../images/butkanan1.gif" Width="20px" /></td>
      <td width="130" align="center">Page 
        <asp:TextBox runat="server" id="TbnPage" Width="20px" CssClass="inptype">
		</asp:TextBox>
&nbsp;&nbsp; 
        <asp:ImageButton runat="server" id="BtnGo" ImageUrl="../../images/buttonGO.gif" /></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30" class="style3">
		<asp:ImageButton runat="server" id="BtnPrint" ImageUrl="../../images/ButtonPrint.gif" PostBackUrl="ReportBranchEmployee.aspx" /></td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="BtnAdd" ImageUrl="../../images/ButtonAdd.gif" PostBackUrl="BranchEmployeeAdd.aspx" />&nbsp;
		<asp:ImageButton runat="server" id="BtnBack" ImageUrl="../../images/ButtonBack.gif" PostBackUrl="Branch.aspx" />
      &nbsp;</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
