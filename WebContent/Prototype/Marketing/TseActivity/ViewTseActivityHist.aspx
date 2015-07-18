<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Tele Sales Activity</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script></head><body><form id="frmTelesales" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">TELE SALES ACTIVITY HISTORY</td>
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
    <tr> 
      <td width="20%" class="tdgenap">Priority</td>
      <td width="30%" class="tdganjil" colspan="3">
      xxxxx10xxxxx</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Status</td>
      <td width="30%" class="tdganjil" colspan="3">
      xxxxx10xxxxx</td>
    </tr>
    <tr>
      <td width="20%" class="tdgenap">Product Offering ID</td>
      <td width="30%" class="tdganjil" colspan="3">
      xxxxx30xxxxx</td>
    </tr>
    <tr>
      <td width="20%" class="tdgenap">Is Valid</td>
      <td width="30%" class="tdganjil" colspan="3">
      Yes</td>
    </tr>
    </table>
    <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">TELE SALES ACTIVITIES HISTORY LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
    <div align="center">
    <asp:GridView runat="server" id="GrdListAgreement" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" AllowSorting="True" >
    <Columns>
		<asp:boundfield DataField="valdate" HeaderText="ACTIVITY DATE" SortExpression="valdate">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring20" HeaderText="ACTIVITY TYPE" SortExpression="valstring20">
		</asp:boundfield>
		<asp:boundfield DataField="valstring20" HeaderText="RESULT STATUS" SortExpression="valstring20">
		</asp:boundfield>
		<asp:boundfield DataField="valdate" HeaderText="DATE" SortExpression="valdate">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" HeaderText="DESCRIPTION" SortExpression="valstring50">
		</asp:boundfield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
      
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
    </div>

  
  <table width="95%" height="25" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr> 
      <td width="30" align="center"><img src="../../images/butkiri1.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkiri.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkanan.gif" width="20" height="20"></td>
      <td width="30" align="center"><img src="../../images/butkanan1.gif" width="20" height="20"></td>
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
		<asp:ImageButton id="imbTSEStartWork" imageurl="../../Images/ButtonClose.gif" runat="server" PostBackUrl="javascript:window.close();"></asp:ImageButton>
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>