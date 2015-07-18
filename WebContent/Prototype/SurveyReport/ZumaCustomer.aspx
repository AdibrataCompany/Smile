<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1"%>
<html>
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
	color: #0066CC;
}
</style>
</head>
<body>
<form id="frmCustomerComplainList" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">CUSTOMER</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
   <tr> 
      <td width="25%" class="tdgenap">Zuma Application No.</td>
      <td width="85%" class="tdganjil">
      	<asp:HyperLink ID="lblZumaNo" runat="server" NavigateUrl="../Credit/ViewZumaApplication.aspx"  Target="_blank">xxxxxxxx50xxxxxxxx</asp:HyperLink >
      </tr>
       <tr> 
      <td width="25%" class="tdgenap">Zuma Customer Name</td>
      <td width="85%" class="tdganjil">
      	<asp:Label ID="lblZumaCustomerName" runat="server">xxxxxxxx50xxxxxxxx</asp:Label>
      </tr>
  
    <tr> 
      <td width="25%" class="tdgenap">Customer Name</td>
      <td width="85%" class="tdganjil">
         <asp:TextBox ID="txtSearchCustomer" runat="server" CssClass="inptype" width="200"></asp:textbox></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbSearchCustomerCriteria" imageurl="../Images/ButtonSearch.gif" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbResetCustomerCriteria" imageurl="../Images/ButtonReset.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">CUSTOMER LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
    <div align="center">
    <asp:GridView runat="server" id="GrdListCustomer" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield HeaderText="NAME">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomerName" NavigateUrl="../Credit/ViewCompanyCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomerName" NavigateUrl="../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
		</asp:templatefield>
		<asp:boundfield DataField="valstringcsttype" HeaderText="TYPE" SortExpression="valstringcsttype">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" HeaderText="ADDRESS" SortExpression="valstring50">
			<ItemStyle HorizontalAlign="Left" />
		</asp:boundfield>
		<asp:templatefield HeaderText="ACTION">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="BtnEdit" NavigateUrl="DEMotor/SurveyReportDEMotorZumaApplicationData.aspx"> Entry Application Data </asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:HyperLink runat="server" id="BtnEdit" NavigateUrl="DEMotor/SurveyReportDEMotorZumaApplicationData.aspx"> Entry Application Data </asp:HyperLink>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
      
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
		</asp:XmlDataSource>
    </div>
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><a href="PersonalCustomerZumaAdd.aspx"><img src="../Images/ButtonAddPersonal.gif" width="100" height="20" border="0"></a> 
              </td>
    </tr>
  </table>

  
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><img src="../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
   <br>
</div>  

  </form>
</body>
</html>
