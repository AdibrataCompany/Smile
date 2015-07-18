<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>COLLECTION</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="../../Confins.css">
</head>
<body>
<form id="FrmCollectorSchemeNext" runat="server">
<div align="center">
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">COLLECTOR SCHEME</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Collection Group</td>
      <td class="tdganjil"> CG Jakarta</td>
    </tr>
    <tr> 
      <td class="tdgenap"> 
        <div align="left">Collector Id</div>
      </td>
      <td class="tdganjil"> xxxxx10xxxxx</td>
    </tr>
    <tr> 
      <td valign="middle" class="tdgenap">Colector Name</td>
      <td class="tdganjil"> xxxxxxxx50xxxxxxxx</td>
    </tr>
    <tr> 
      <td valign="middle" class="tdgenap"> 
        <div align="left">Collector Type</div>
      </td>
      <td class="tdganjil"> xxxxx10xxxxx</td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap"> 
        <div align="left">Supervisor ID</div>
      </td>
      <td class="tdganjil"> xxxxx10xxxxx</td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap"> 
        Is Active</td>
      <td class="tdganjil"> 
		Yes</td>
    </tr>
  
  </table>
    <BR>
  	<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">COLLECTION SCHEME ZIP CODE LISTING</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="25%" class="tdgenap">Search By</td>
      <td class="tdganjil"><select name="select">
          <option selected>Kelurahan</option>
          <option>Kecamatan</option>
          <option>City</option>
          <option>Zip Code</option>
        </select>
        <input name="textfield" type="text" size="20" class="inptype">
        </td>
    </tr>
  </table>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><img src="../../Images/ButtonSearch.gif" width="100" height="20" border="0"> <img src="../../Images/ButtonReset.gif" width="100" height="20" border="0"> 
      </td>
    </tr>
  </table>
  <br>

   <div align="center">
    <asp:GridView runat="server" id="GrdListzIPCODE"  AllowSorting="True" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield>
			<HeaderTemplate>
				<asp:CheckBox runat="server" id="CheckBox1" />
			</HeaderTemplate>
			<ItemStyle Width="5%" HorizontalAlign="Center" />
			<ItemTemplate>
				<asp:CheckBox runat="server" id="CheckBox1" />
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="KELURAHAN">
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="KECAMATAN">
		</asp:boundfield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="CITY">
		</asp:boundfield>
		<asp:boundfield DataField="valstring6" SortExpression="valstring6" HeaderText="ZIP CODE">
		</asp:boundfield>
	</Columns>
			<HeaderStyle CssClass="tdjudulungu" />
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
		<asp:ImageButton runat="server" id="BtnSave" ImageUrl="../../images/ButtonSave.gif"  />&nbsp;
		&nbsp; 
      </td>
    </tr>
  </table>
  
  <br>
			<TABLE id="TableAddSave" style="HEIGHT: 19px" cellSpacing="0" cellPadding="0" width="95%"
				align="center" border="0">
				<TR>
					<td align="left"><asp:imagebutton id="imbBack" runat="server" CausesValidation="False" ImageUrl="../../Images/ButtonBack.gif" PostBackUrl="CollectorScheme.aspx"></asp:imagebutton>
					</td>
					<TD align="right">&nbsp;&nbsp; &nbsp;
						<asp:imagebutton id="imbNext" runat="server" ImageUrl="../../Images/ButtonClose.gif" PostBackUrl="CollectorSetting.aspx"></asp:imagebutton>
					&nbsp;
						&nbsp;
						<A href="javascript:history.back();"></A>
					</TD>
				</TR>
			</TABLE>

</div>
</form>
</body>
</html>
