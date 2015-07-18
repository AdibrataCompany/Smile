<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head>
<body>
<form runat="server" id="FrmBucketEdit">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ADDITIONAL COLLATERAL - RELEASE&nbsp;REQUEST</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
   	<tr>
      <td width="25%" class="tdgenap" style="height: 24px">Name</td>
      <td width="78%" class="tdganjil" style="height: 24px"> 
        xxxxxxxx50xxxxxxxx</td>
    </tr>
	<tr>
	<td class="tdgenap" style="width: 20%">Release Date</td>
      <td colspan="3" class="tdganjil" width="30%">
        <asp:TextBox ID="txtRelease" runat="server" CssClass="inptype"></asp:textbox>
        <img src="../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"> 
        <font color="red">*)  </font>
        </td>
 	
    </tr>

  </table>
  <br>
  
  
   
    <div align="center"> 
      <asp:GridView runat="server" id="GrdViewBranch" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" AllowSorting="True">
		<Columns>
			<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="ASSET NO">
			</asp:boundfield>
			<asp:boundfield DataField="valstring10" HeaderText="ASSET TYPE">
				<ItemStyle HorizontalAlign="Center" />
			</asp:boundfield>
			<asp:templatefield HeaderText="ASSET DESCRIPTION">
				<AlternatingItemTemplate>
					<asp:HyperLink runat="server" id="lnkAgreementNo" NavigateUrl="MarketingEmployeeInternalView.aspx" Target="_blank">xxxxxxxx50xxxxxxxx
					</asp:HyperLink>
				</AlternatingItemTemplate>
				<ItemStyle HorizontalAlign="Left" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="lnkAgreementNo" NavigateUrl="MarketingEmployeeExternalView.aspx" Target="_blank">xxxxxxxx50xxxxxxxx
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
			<asp:boundfield DataField="valdate" HeaderText="REMINDER INSURANCE DATE">
				<ItemStyle HorizontalAlign="Left" />
			</asp:boundfield>
			<asp:boundfield DataField="valamount" SortExpression="valamount" HeaderText="MARKET VALUE">
				<ItemStyle HorizontalAlign="Right" />
			</asp:boundfield>
			<asp:boundfield DataField="vRate" SortExpression="vRate" HeaderText="RESALE VALUE (%)">
				<ItemStyle HorizontalAlign="Right" />
			</asp:boundfield>
		</Columns>
		<HeaderStyle CssClass="tdjudulhijau" />
		<AlternatingRowStyle CssClass="tdgenap" />
		</asp:GridView>

  
  
  
  
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
		<asp:XmlDataSource runat="server" id="XmlDataSource2">
		</asp:XmlDataSource>
  
  <br>
  
     <asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
	</asp:XmlDataSource>


 </div>
 <table width="95%" border="0" cellspacing="0" cellpadding="0">
				<tr class="trtopikuning">
					<td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
					<td class="tdtopihijau">RELEASE ADDITIONAL COLLATERAL 
					REQUEST APPROVAL </td>
					<td width="10" class="tdtopihijaukanan">&nbsp;</td>
				</tr>
			</table>
    <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr>
  	  <td class="tdgenap">Reason</td>
      <td class="tdganjil">
		<select name="select" style="width: 139px; height: 18px">
          <option selected>Select One</option>
          <option>ReleaseAdditionalApproval</option>
         
        </select></td>
	</tr>
   
 <tr>
      
      <td width="20%" class="tdgenap" >Approved By</td>
      <td width="30%" class="tdganjil" >
		<select name="select7" style="width: 139px">
          <option>Select One</option>
        </select></td>
    </tr>
    <tr>
      <td  class="tdgenap" >Alternate User</td>
      <td  class="tdganjil" >
		<select name="select5" style="width: 137px">
          <option>Select One</option>
        </select></td>
    </tr>
    <tr> 
      <td class="tdgenap" >Approval Recommendation</td>
      <td class="tdganjil" >
		<textarea name="textfield2" rows="5" style="width: 515px" ></textarea></td>
    </tr>
  </table>

  <br>
	<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<a href="AdditionalCollateralReleaseDoc.aspx"><img src="../../Images/ButtonRequest.gif" width="100" height="20" border="0"> 
        <img src="../../Images/ButtonCancel.gif" width="100" height="20" border="0"></a> 
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
