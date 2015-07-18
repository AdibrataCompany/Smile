<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
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
	font-family: Verdana, Arial, Tahoma, sans-serif;
	color: #FFFFFF;
}
</style>
</head>
<body>
<form id="form1" runat="server">
<table width="95%"  border="0" align="center" cellpadding="0" cellspacing="0">
  <tr> 
    <td align="left" background="../Images/tabBackG.gif"><table  border="0" align="left" cellpadding="0" cellspacing="0">
        <tr class="tab"> 
          <td width="7" style="height: 19px"><font color="#FFFFFF" size="1"><img border="0" src="../Images/tabMstart.gif" width="7" height="19"></font></td>
          <td background="../Images/tabM.gif" style="height: 19px"><table border="0" cellspacing="0" cellpadding="0">
              <tr> 
                <td width="15">&nbsp;</td>
                <td><b><a href="SmartSearch.htm"><font  class="tab">AGREEMENT</font></a></b></td>
              </tr>
            </table></td>
          <td background="../Images/tabT.gif" style="height: 19px"><table border="0" cellspacing="0" cellpadding="0">
              <tr> 
          <td width="15" style="height: 19px"><font size="1"><img border="0" src="../Images/tabMM.gif" width="15" height="19"></font></td>
          <td background="../Images/tabM.gif" style="height: 19px"><table border="0" cellspacing="0" cellpadding="0">
              <tr> 
                <td width="15">&nbsp;</td>
                <td><b><a href="SmartSearchCustomer.aspx"><font  class="tab">PERSONAL CUSTOMER</font></a></b></td>
                <td width="15">&nbsp;</td>
              </tr>
            </table></td>
          <td style="height: 19px"><font size="1"><img border="0" src="../Images/tabMT.gif" width="15" height="19"></font></td>
                <td class="style1"><strong>COMPANY CUSTOMER</strong></td>
                <td width="15">&nbsp;</td>
              </tr>
            </table></td>
          <td width="15" style="height: 19px"><font size="1"><img border="0" src="../Images/tabTM.gif" width="15" height="19"></font></td>
          <td background="../Images/tabM.gif" style="height: 19px"><table border="0" cellspacing="0" cellpadding="0">
              <tr> 
                <td width="15">&nbsp;</td>
                <td><b><a href="SmartSearchAsset.htm"><font  class="tab">ASSET</font></a></b></td>
                <td width="15">&nbsp;</td>
              </tr>
            </table></td>
          <td width="15" style="height: 19px"><font size="1"><img border="0" src="../Images/tabMM.gif" width="15" height="19"></font></td>
          <td background="../Images/tabM.gif" style="height: 19px"><table border="0" cellspacing="0" cellpadding="0">
              <tr> 
                <td width="15">&nbsp;</td>
                <td><b><font face="Verdana" size="1"><a href="SmartSearchnegative.htm"><font class="tab">NEGATIVE 
                  LIST</font></a></font></b></td>
                <td width="15">&nbsp;</td>
              </tr>
            </table></td>
          <td style="height: 19px"><font size="1"><img border="0" src="../Images/tabMend.gif" width="25" height="19"></font></td>
        </tr>
      </table></td>
  </tr>
</table>
<BR>
<div align="center">
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">SMART SEARCH COMPANY CUSTOMER</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
 	      <tr> 
      <td class="tdgenap" style="width: 11%">NPWP</td>
      <td width="86%" class="tdganjil">
      <asp:TextBox runat="server" id="TxtNPWP" CssClass="InpType" ></asp:TextBox>
      </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 11%">Name</td>
      <td width="86%" class="tdganjil"><asp:TextBox runat="server" id="TxtName" CssClass="InpType"></asp:TextBox></td>
    </tr>
  <tr> 
      <td class="tdgenap" style="width: 11%">Address</td>
      <td width="86%" class="tdganjil">
         <asp:TextBox runat="server" id="TxtAddress" CssClass="InpType" Rows="3" Columns="50"></asp:TextBox></td>
    </tr>
    </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton runat="server" id="ImgSearch" ImageUrl="../Images/ButtonSearch.gif"></asp:ImageButton>&nbsp;
		<asp:ImageButton runat="server" id="ImgReset" ImageUrl="../Images/ButtonReset.gif"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">COMPANY CUSTOMER LISTING</td>
      <td class="tdtopihijaukanan" style="width: 10px">&nbsp;</td>
    </tr>
  </table>
  <asp:GridView runat="server" id="GridViewPersonalCustomer" DataSourceID="XmlDataSource1" AutoGenerateColumns="False" ControlStyle-CssClass="tablegrid" Width="95%" CssClass="tablegrid">
		<Columns>
			<asp:boundfield DataField="valnumber1" SortExpression="valstring" HeaderText="NPWP">
				<ControlStyle CssClass="tdganjil" />
			</asp:boundfield>
			<asp:templatefield HeaderText="NAME">
				<ItemTemplate>
					<asp:HyperLink runat="server" id="HypName" NavigateUrl="../Credit/ViewCompanyCustomer.htm" Target="_blank">xxxxxxxxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>			
			<asp:boundfield DataField="valstring" SortExpression="valnumber" HeaderText="ADDRESS">
				<ControlStyle CssClass="tdganjil" />
				<ItemStyle HorizontalAlign="Left" />
			</asp:boundfield>
		</Columns>
	</asp:GridView>
	<asp:XmlDataSource runat="server" id="XmlDataSource1" DataFile="~/XML/Menu_Eloan_All_999.xml">
	</asp:XmlDataSource>
   <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>     
      <td width="30" align="center"><asp:ImageButton runat="server" id="ImgFirst" ImageUrl="../images/butkiri1.gif"></asp:ImageButton></td>
      <td width="30" align="center"><asp:ImageButton runat="server" id="ImgPrev" ImageUrl="../images/butkiri.gif"></asp:ImageButton></td>
      <td width="30" align="center"><asp:ImageButton runat="server" id="ImgNext" ImageUrl="../images/butkanan.gif"></asp:ImageButton></td>
      <td width="30" align="center"><asp:ImageButton runat="server" id="ImgLast" ImageUrl="../images/butkanan1.gif"></asp:ImageButton></td>
      <td width="130" align="center">Page 
        <asp:TextBox runat="server" id="txtPage" CssClass="InpType" Columns="3">1</asp:TextBox>&nbsp; 
        <asp:ImageButton runat="server" id="ImgGo" ImageUrl="../images/butgo.gif"></asp:ImageButton></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>  
</div>
</form>
</body>
</html>
