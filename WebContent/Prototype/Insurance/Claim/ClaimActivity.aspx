<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="../../Include/Insurance.css">
<script language="JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head>

<body>
<form id="form1" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20">
		<img src="../../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">CLAIM ACTIVITY</td>
      <td width="10">
		<img src="../../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  <div align="center"> 
    <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
      <tr class="tdganjil"> 
        <td width="20%" class="tdgenap">Branch</td>
        <td width="30%" class="tdganjil"> 
          <asp:DropDownList runat="server" id="DropDownList1">
			<asp:ListItem>Select One</asp:ListItem>
			</asp:DropDownList>
        </td>
        <td width="20%" class="tdgenap">Search By</td>
        <td width="30%" class="tdganjil">
		<asp:DropDownList runat="server" id="ddlSearchBy">
			<asp:ListItem>Agreement No</asp:ListItem>
			<asp:ListItem>Customer Name</asp:ListItem>
		</asp:DropDownList>
		<asp:TextBox runat="server" id="txtSearchBy" CssClass="inptype">
		</asp:TextBox>
		</td>
      </tr>
      </table>
  </div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="imbSearch" ImageUrl="../../images/buttonSearch.gif" />
		<asp:ImageButton runat="server" id="imbReset" ImageUrl="../../images/buttonReset.gif"/></td>
    </tr>
  </table>
<br>  
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20">
		<img src="../../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">AGREEMENT LISTING</td>
      <td width="10">
		<img src="../../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
    <asp:GridView runat="server" id="grdClaimRequest" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield HeaderText="AGREEMENT NO">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkAgreementNo" NavigateUrl="../../Credit/ViewAgreement.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkAgreementNo" NavigateUrl="../../Credit/ViewAgreement.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="CUSTOMER NAME">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="../../Credit/ViewCompanyCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:templatefield HeaderText="POLICY NO">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkPolicy" NavigateUrl="../PolicyDetailView.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkPolicy" NavigateUrl="../PolicyDetailView.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:boundfield DataField="valdate" HeaderText="START DATE" SortExpression="valdate">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valdate" HeaderText="END DATE" SortExpression="valdate">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring3" HeaderText="COVERAGE" SortExpression="valstring3">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:templatefield HeaderText="EDIT">
			<AlternatingItemTemplate>
				<asp:ImageButton runat="server" id="btnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="ClaimActivityDetail.aspx" />
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:ImageButton runat="server" id="btnEdit" ImageUrl="../../images/IconEdit.gif" PostBackUrl="ClaimActivityDetail.aspx" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulabu" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
	<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
	</asp:XmlDataSource>
      
    <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnFirstPrev" ImageUrl="../../images/butkiri1.gif" Width="20px" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnPrev" ImageUrl="../../images/butkiri.gif" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnNext" ImageUrl="../../images/butkanan.gif" Width="20px" /></td>
      <td width="30" align="center">
		<asp:ImageButton runat="server" id="BtnLastNext" ImageUrl="../../images/butkanan1.gif" /></td>
      <td width="130" align="center">Page&nbsp;
		<asp:TextBox runat="server" id="TbnPage" Width="20px" CssClass="inptype">
		</asp:TextBox>
&nbsp;&nbsp; 
        <asp:ImageButton runat="server" id="BtnGo" ImageUrl="../../images/buttonGO.gif" /></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>  
  
  
</div>
</form>
</body>
</html>
