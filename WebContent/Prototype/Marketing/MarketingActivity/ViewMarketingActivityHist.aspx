<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Marketing Activity</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script></head><body><form id="frmMarketingAct" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">MARKETING ACTIVITY HISTORY</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr>
      <td width="20%" class="tdgenap">Customer Name</td>
      <td width="80%" class="tdganjil" colspan="3">
      <asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="../Credit/ViewCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx</asp:HyperLink>
		</td>
    </tr>
	<tr>
      <td width="20%" class="tdgenap">Address</td>
      <td width="80%" class="tdganjil" colspan="3">
      xxxxxxxx50xxxxxxxx</td>		
    </tr>
	<tr>
      <td width="20%" class="tdgenap">Kelurahan</td>
      <td width="80%" class="tdganjil" colspan="3">
      xxxxxxxx50xxxxxxxx</td>		
    </tr>
	<tr>
      <td width="20%" class="tdgenap">Kecamatan</td>
      <td width="80%" class="tdganjil" colspan="3">
      xxxxxxxx50xxxxxxxx</td>		
    </tr>
	<tr>
      <td width="20%" class="tdgenap">City</td>
      <td width="80%" class="tdganjil" colspan="3">
      xxxxxxxx30xxxxxxxx</td>		
    </tr>
	<tr>
      <td width="20%" class="tdgenap">Zip Code</td>
      <td width="80%" class="tdganjil" colspan="3">
      999999</td>		
    </tr>
	<tr>
      <td width="20%" class="tdgenap">Email</td>
      <td width="30%" class="tdganjil">
      xxxxxxxx30xxxxxxxx</td>
      <td width="20%" class="tdgenap">Birthday</td>
      <td width="30%" class="tdganjil">
      <asp:Label runat="server" Text="Label" id="lblBirthday0">dd-mmm</asp:Label>
		</td>
    </tr>
	<tr>
      <td width="20%" class="tdgenap">Phone No</td>
      <td width="30%" class="tdganjil">
      xx4xx - xxxxx10xxxxxx</td>
      <td width="20%" class="tdgenap">Profession</td>
      <td width="30%" class="tdganjil">
      xxxxxxxx20xxxxxxxx</td>
    </tr>
	<tr>
      <td width="20%" class="tdgenap">Mobile Phone No</td>
      <td width="30%" class="tdganjil">
      xx4xx - xxxxx10xxxxxx</td>
      <td width="20%" class="tdgenap">Religion</td>
      <td width="30%" class="tdganjil">
      xxxxx10xxxxx</td>
    </tr>
	<tr>
      <td width="20%" class="tdgenap">Source of Data</td>
      <td class="tdganjil" style="width: 40%">
      xxxxx10xxxxx</td>
      <td class="tdgenap" style="width: 25%">
      Source of Application</td>
      <td class="tdganjil">
      xxxxx10xxxxx</td>
      	</tr>
    </table>
    <br>
    <div align="left"><font face="Arial, Helvetica, sans-serif" color="red">Notes: listing order by Activity Date Time descending</font></div>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">MARKETING ACTIVITIES HISTORY LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
    <div align="center">
    <asp:GridView runat="server" id="GrdListAgreement" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" AllowSorting="True" >
    <Columns>
		<asp:templatefield HeaderText="ACTIVITY DATE TIME">
			<AlternatingItemTemplate>
				<asp:Label runat="server" Text="dd-mm-yyyy hh:mm" />
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Label runat="server" Text="dd-mm-yyyy hh:mm" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Left" />		
		</asp:templatefield>
		<asp:boundfield DataField="valstring20" HeaderText="ACTIVITY" SortExpression="valstring20">
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" HeaderText="NOTES" SortExpression="valstring50">
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" HeaderText="MARKETING ID" SortExpression="valstring10">
		</asp:boundfield>
		<asp:boundfield DataField="valstring6" HeaderText="STATUS" SortExpression="valstring6">
		</asp:boundfield>
		<asp:templatefield HeaderText="DETAIL">
			<AlternatingItemTemplate>
				<asp:Hyperlink runat="server" Text="Detail" NavigateUrl="ViewMarketingActivityHistDtl.aspx" Target="_self"/>
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:Hyperlink runat="server" Text="Detail" NavigateUrl="ViewMarketingActivityHistDtl.aspx" Target="_self"/>
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" />		
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
      
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
    </div>

  
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center">
		<img src="../../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center">
		<img src="../../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center">
		<img src="../../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center">
		<img src="../../images/butkanan1.gif" width="20" height="20"></td>
      <td width="130" align="center">Page 
        <input type="text" name="textfield222" class="inptype" size="3"> &nbsp; 
        <img src="../../images/butgo.gif" width="30" height="25" align="absmiddle"></td>
      <td align="right"><font color="#999999">Page x of y, Total x record(s)</font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<asp:ImageButton id="imbClose" imageurl="../../Images/ButtonClose.gif" runat="server" PostBackUrl="javascript:window.close();"></asp:ImageButton>
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>