<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../Confins.css" rel="stylesheet" type="text/css">
<style type="text/css">
.style1 {
	text-align: left;
}
</style>
</head>
<body>
<form id="form1" runat="server">
<div align="center" class="style1">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijau2kiri">&nbsp;</td>
      <td align="center" class="tdtopihijau2">TRANSFER REQUEST FOR FUNDING</td>
      <td width="10" class="tdtopihijau2kanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" style="width: 20%">Request Branch</td>
      <td align="left" class="tdganjil" style="width: 30%">
      	<asp:DropDownList runat="server" id="ddlBranch">
			<asp:ListItem>Select One</asp:ListItem>
		</asp:DropDownList>
      		<font color="red">&nbsp;*)</font>
      </td>
      <td class="tdgenap" style="width: 20%">Request Date </td>
      <td width="25%" class="tdganjil">
		<font color="red">
          <asp:TextBox runat="server" id="txtRequestDate" CssClass="inptype" Width="100px">
			</asp:TextBox>
			&nbsp;<img src="../Images/iconcalendar.gif"></font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Currency</td>
      <td class="tdganjil" style="width: 30%">
      	<asp:DropDownList runat="server" id="ddlCurrency">
			<asp:ListItem>IDR</asp:ListItem>      	
			<asp:ListItem>USD</asp:ListItem>
		</asp:DropDownList>
      		<font color="red">&nbsp;*)</font>
      	</td>
      <td class="tdgenap" style="width: 20%"> Approval Date</td>
      <td width="25%" class="tdganjil"> 
          <asp:TextBox runat="server" id="txtApproveDate" CssClass="inptype" Width="100px">
			</asp:TextBox>
			&nbsp;<img src="../Images/iconcalendar.gif"></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Branch Bank Account</td>
      <td class="tdganjil" colspan="3">
      	<asp:DropDownList runat="server" id="ddlBranchBankAccount">
			<asp:ListItem>All</asp:ListItem>      	
			<asp:ListItem>Select One</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Search By</td>
      <td class="tdganjil" colspan="3">
          	<asp:DropDownList runat="server" id="ddlSearchBy">
			<asp:ListItem>Agreement No</asp:ListItem>
			<asp:ListItem>Customer Name</asp:ListItem>
		</asp:DropDownList>
			<asp:TextBox runat="server" id="txtSearchBy" CssClass="inptype">
			</asp:TextBox>
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
      <td width="10" height="20" class="tdtopihijau2kiri">&nbsp;</td>
      <td align="center" class="tdtopihijau2">REQUEST FOR FUNDING LIST</td>
      <td width="10" class="tdtopihijau2kanan">&nbsp;</td>
    </tr>
  </table>
	<asp:GridView  Width="95%" runat="server" id="grdAgreement" DataSourceID="XmlDataSource2" AutoGenerateColumns="False">
		<Columns>
			<asp:templatefield HeaderText="REQUEST">
				<ItemTemplate>
					<asp:CheckBox runat="server" id="chkTransfer" />
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center" />
			</asp:templatefield>
			<asp:templatefield HeaderText="APPLICATION ID">
				<ItemTemplate>
					<asp:HyperLink runat="server" id="hypApplicationID" NavigateUrl="../Credit/ViewApplication.htm">xxxxx20xxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="AGREEMENT NO">
				<ItemTemplate>
					<asp:HyperLink runat="server" id="HypAgreementNo" NavigateUrl="../Credit/ViewAgreement.htm">xxxxx20xxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:templatefield HeaderText="CUSTOMER NAME">
				<ItemTemplate>
					<asp:HyperLink runat="server" id="hypCustName" NavigateUrl="../Credit/ViewPersonalCustomer.htm">xxxxx30xxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:boundfield DataField="vCurr" HeaderText="CURR" SortExpression="vCurr">
				<ItemStyle HorizontalAlign="Center" />
			</asp:boundfield>
			<asp:boundfield DataField="valstring30" HeaderText="BRANCH BANK ACCOUNT" SortExpression="valstring30">
			</asp:boundfield>	
			<asp:boundfield DataField="valstring30" HeaderText="DESCRIPTION" SortExpression="valstring30">
			</asp:boundfield>						
			<asp:boundfield DataField="valdate" HeaderText="REQUEST DATE" SortExpression="valdate">
				<ItemStyle HorizontalAlign="Center" />
			</asp:boundfield>			
			<asp:boundfield DataField="valdate" HeaderText="APPROVAL DATE" SortExpression="valdate">
				<ItemStyle HorizontalAlign="Center" />
			</asp:boundfield>
			<asp:boundfield DataField="valstring3" HeaderText="APP STEP" SortExpression="valstring3">
				<ItemStyle HorizontalAlign="Center" />
			</asp:boundfield>
		</Columns>
		<HeaderStyle CssClass="tdjudulhijau2" />	
		<AlternatingRowStyle CssClass="tdgenap" />			
	</asp:GridView>
	<asp:XmlDataSource runat="server" ID="XmlDataSource2" DataFile="../DataType.xml">
	</asp:xmldatasource>	
  
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
		<asp:ImageButton runat="server" id="imbNext" ImageUrl="../images/buttonNext.gif" PostBackUrl="TransferRequestForFundingNext.aspx"/> 
      </td>
    </tr>
  </table>
  
  
</div>

</form>
</body>
</html>
