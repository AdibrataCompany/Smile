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
<style type="text/css">
.style1 {
	background-color: #F4FAFF;
	text-align: left;
}
.style2 {
	background-color: #FFFFFF;
	text-align: left;
}
</style>
</head>
<body>
<form id="form1" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">REQUEST FOR PROSPECT FUNDING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" style="width: 20%">Search By</td>
      <td class="tdganjil" colspan="3"><asp:DropDownList runat="server" id="ddlSearchBy">
		<asp:ListItem Value="ApplicationID">Application ID</asp:ListItem>
		<asp:ListItem Value="AgreementNo">Agreement No</asp:ListItem>
		<asp:ListItem Value="Name">Customer Name</asp:ListItem>
		</asp:DropDownList>
		<asp:TextBox runat="server" id="txtSearchBy" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Product</td>
      <td class="tdganjil" colspan="3">
		<asp:TextBox runat="server" id="txtSearchBy0" CssClass="inptype">
		</asp:TextBox>
		&nbsp;<asp:Image runat="server" id="imgDetail" ImageUrl="../images/iconDetail.gif" /></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Product Type</td>
      <td class="tdganjil" colspan="3">
		<asp:DropDownList runat="server" id="ddlProductType">
			<asp:ListItem Selected="True">All</asp:ListItem>
			<asp:ListItem Value="DEMotor">DE Motor</asp:ListItem>
			<asp:ListItem Value="DEMobil">DE Mobil</asp:ListItem>
			<asp:ListItem Value="CF">KCM</asp:ListItem>
			<asp:ListItem Value="LS">Leasing</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
    <tr>
          <td class="style1" style="width: 20%">Asset Type</td>
          <td class="style2" colspan="3">
			<asp:DropDownList runat="server" id="CmbAssetType" Width="250px" CssClass="inptype">
				<asp:ListItem>All</asp:ListItem>
				<asp:ListItem>Automotive</asp:ListItem>
				<asp:ListItem>Motorcycle</asp:ListItem>				
			</asp:DropDownList>
		</td>
        </tr>
	<tr>
          <td class="style1" style="height: 13px; width: 20%;">Asset Category</td>
          <td class="style2" style="height: 13px" colspan="3">
			<asp:DropDownList runat="server" id="ddlAssetCategory" Width="250px" CssClass="inptype">
				<asp:ListItem Value="A">All</asp:ListItem>			
				<asp:ListItem Value="N">Non Truck</asp:ListItem>
				<asp:ListItem Value="T">Truck</asp:ListItem>
			</asp:DropDownList>
			</td>
        	</tr>
	<tr>
          <td class="style1" style="width: 20%">Asset Usage</td>
          <td class="style2" style="width: 30%"> 
			<asp:DropDownList runat="server" id="ddlVehicleType" CssClass="inptype">
				<asp:ListItem Selected="True" Value="A">All</asp:ListItem>			
				<asp:ListItem Value="C">Commercial</asp:ListItem>
				<asp:ListItem Value="N">Non Commercial
				</asp:ListItem>
			</asp:DropDownList>
			</td>
          <td class="style1" style="width: 20%">New / Used&nbsp; Type</td>
          <td class="style2" style="width: 30%"> 
			<asp:DropDownList runat="server" id="ddlNewUsed" CssClass="inptype">
				<asp:ListItem Selected="True" Value="A">All</asp:ListItem>			
				<asp:ListItem Value="N">New</asp:ListItem>
				<asp:ListItem Value="U">Used</asp:ListItem>
			</asp:DropDownList>          
			</td>
        	</tr>
	<tr>
          <td class="style1" style="height: 13px; width: 20%;">Finance Type</td>
          <td class="style2" style="height: 13px; width: 30%;">
			<asp:DropDownList runat="server" id="ddlFinanceType" CssClass="inptype">
				<asp:ListItem Selected="True" Value="A">All</asp:ListItem>			
				<asp:ListItem Value="CF">Consumer Finance</asp:ListItem>
				<asp:ListItem Value="LS">Finance Lease</asp:ListItem>
			</asp:DropDownList>
			</td>
          <td class="style1" style="width: 20%">Floor Financing</td>
          <td class="style2" style="width: 30%">
			<asp:DropDownList runat="server" id="ddlFloorFinancing" CssClass="inptype">
				<asp:ListItem Selected="True" Value="A">All</asp:ListItem>			
				<asp:ListItem Value="Y">Yes</asp:ListItem>
				<asp:ListItem Value="N">No</asp:ListItem>
			</asp:DropDownList>              
    		</td>
        </tr>
	<tr>
          <td class="style1" style="width: 20%">Lease Back Type</td>
          <td class="style2" style="width: 30%">
			<asp:DropDownList runat="server" id="ddlExpressFundType" CssClass="inptype">
				<asp:ListItem Selected="True" Value="A">All</asp:ListItem>			
				<asp:ListItem Value="N">Direct Financing</asp:ListItem>
				<asp:ListItem Value="Y">Lease Back</asp:ListItem>
			</asp:DropDownList>          
			</td>
          <td class="style1" style="width: 20%">Approval Date</td>
          <td class="style2">
		<asp:TextBox runat="server" id="txtApprovalDate" CssClass="inptype" Width="99px">
		</asp:TextBox>
		&nbsp;<asp:Image runat="server" id="imgCalendar" ImageUrl="../images/iconCalendar.gif" /></td>
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
      <td align="center" class="tdtopihijau">AGREEMENT LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  	<asp:GridView  Width="95%" runat="server" id="grdAgreement" DataSourceID="XmlDataSource2" AutoGenerateColumns="False">
		<Columns>
			<asp:templatefield HeaderText="APPLICATION ID">
				<ItemTemplate>
					<asp:HyperLink runat="server" id="hypApplicationID" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank">xxxxx20xxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="AGREEMENT NO">
				<ItemTemplate>
					<asp:HyperLink runat="server" id="HypAgreementNo" NavigateUrl="../Credit/ViewAgreement.htm" Target="_blank">xxxxx20xxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="CUSTOMER NAME">
				<ItemTemplate>
					<asp:HyperLink runat="server" id="hypCustName" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxx30xxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:boundfield DataField="valstring20" HeaderText="PRODUCT" SortExpression="valstring20">
			</asp:boundfield>			
			<asp:boundfield DataField="valstring10" HeaderText="PRODUCT TYPE" SortExpression="valstring10">
			</asp:boundfield>
			<asp:boundfield DataField="valdate" HeaderText="APPROVAL DATE" SortExpression="valdate">
				<ItemStyle HorizontalAlign="Center" />
			</asp:boundfield>
			<asp:boundfield DataField="valstring3" HeaderText="APP STEP" SortExpression="valstring3">
				<ItemStyle HorizontalAlign="Center" />
			</asp:boundfield>
			<asp:templatefield HeaderText="REQUEST">
				<ItemTemplate>
					<asp:HyperLink runat="server" id="hypRequest" Text="Request" NavigateUrl="RequestForFundingNext.aspx" />
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center" />
			</asp:templatefield>
			<asp:templatefield HeaderText="CANCEL">
				<ItemTemplate>
					<asp:HyperLink runat="server" id="hypCancel" Text="Cancel" NavigateUrl="RequestForFundingCancel.aspx" />
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
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		&nbsp;</td>
    </tr>
  </table>
  <p><font face="Arial, Helvetica, sans-serif" color="red">Select Agreement yang sudah approve final tapi belum GoLive dan Status 
	masih null atau Request<br>
	Request link hanya muncul bila statusnya masih null<br>
	Cancel Link hanya muncul bila statusnya Request (dlm hal ini belum 
	Transferred/Reconciled)</font></p>
</div>
</form>
</body>
</html>
