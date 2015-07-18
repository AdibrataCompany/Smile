<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html xmlns:v="urn:schemas-microsoft-com:vml" xmlns:o="urn:schemas-microsoft-com:office:office">
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
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
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">CREDIT INVESTIGATION</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Search By</td>
      <td width="87%" class="tdganjil"><asp:DropDownList runat="server" id="ddlSearchBy">
		<asp:ListItem Value="ApplicationID">Application ID</asp:ListItem>
		<asp:ListItem Value="AgreementNo">Agreement No</asp:ListItem>
		<asp:ListItem Value="Name">Customer Name</asp:ListItem>
		</asp:DropDownList>
		<asp:TextBox runat="server" id="txtSearchBy" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Application Step</td>
      <td width="87%" class="tdganjil">
		<asp:DropDownList runat="server" id="ddlAppStep">
			<asp:ListItem>All</asp:ListItem>
			<asp:ListItem>NAP</asp:ListItem>
			<asp:ListItem>CSR</asp:ListItem>
			<asp:ListItem>RCA</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Status</td>
      <td width="87%" class="tdganjil">
		<asp:DropDownList runat="server" id="ddlStatus">
			<asp:ListItem Value="NE">New Entry</asp:ListItem>
			<asp:ListItem Value="UE">Update Entry</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
    <tr> 
      <td width="25%" class="tdgenap">Product Type</td>
      <td width="87%" class="tdganjil">
		<asp:DropDownList runat="server" id="ddlProductType">
			<asp:ListItem Selected="True">All</asp:ListItem>
			<asp:ListItem Value="DEMotor">DE Motor</asp:ListItem>
			<asp:ListItem Value="DEMobil">DE Mobil</asp:ListItem>
			<asp:ListItem Value="CF">KCM</asp:ListItem>
			<asp:ListItem Value="LS">Leasing</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="imbSearch" ImageUrl="../images/buttonSearch.gif" />
		<asp:ImageButton runat="server" id="imbReset" ImageUrl="../images/buttonReset.gif" /> 
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">APPLICATION LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  	<asp:GridView  Width="95%" runat="server" id="grdAgreement" DataSourceID="XmlDataSource2" AutoGenerateColumns="False">
		<Columns>
			<asp:templatefield HeaderText="APPLICATION ID">
				<ItemTemplate>
					<asp:HyperLink runat="server" id="HyperLink1" NavigateUrl="../AccMaintenance/AgreementView.htm">xxxxx20xxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="CUSTOMER NAME" ApplyFormatInEditMode="True">
			</asp:boundfield>
			<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="APP STEP">
			</asp:boundfield>
			<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="STATUS">
			</asp:boundfield>
			<asp:boundfield DataField="valstring10" SortExpression="valstring10" HeaderText="PRODUCT TYPE">
			</asp:boundfield>
			<asp:templatefield HeaderText="ACTION">
				<ItemTemplate>
					<asp:ImageButton runat="server" id="LinkButton1" ImageUrl="../images/iconEdit.gif" PostBackUrl="CreditInvestigationResult.aspx"></asp:ImageButton>
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center" />
			</asp:templatefield>
		</Columns>
		<HeaderStyle CssClass="tdjudulhijau" />	
		<AlternatingRowStyle CssClass="tdgenap" />			
	</asp:GridView>
	<asp:XmlDataSource runat="server" ID="XmlDataSource2" DataFile="../DataType.xml"></asp:xmldatasource>	
  
  <table width="95%" height="25" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><asp:Image runat="server" id="imbFirstPage" ImageUrl="../images/butkiri1.gif" /></td>
      <td width="30" align="center">  <asp:Image runat="server" id="imbpreviouspage" ImageUrl="../images/butkiri.gif" /></td>
      <td width="30" align="center">  <asp:Image runat="server" id="imbnextpage" ImageUrl="../images/butkanan.gif" /></td>
      <td width="30" align="center">  <asp:Image runat="server" id="imblastpage" ImageUrl="../images/butkanan1.gif" /></td>
      <td align="center" style="width: 318px">Page 
         &nbsp; 
       <asp:TextBox runat="server" id="txtgo" CssClass="inptype" MaxLength="5" Width="10%"></asp:TextBox>
        <asp:Image runat="server" id="imggo" ImageUrl="../images/butgo.gif" />
	</td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
