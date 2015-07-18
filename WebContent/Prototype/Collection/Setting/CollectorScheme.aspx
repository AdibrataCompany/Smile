<%@ Page Language="vb" AutoEventWireup="false" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
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
<body >
<div align="center">	
	<form id="Form1"  runat="server">
		<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" align="center" border="0">

			    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">COLLECTION SCHEME</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
			<TABLE class="tablegrid" cellSpacing="1" cellPadding="2" width="95%" align="center" border="0">
				<TR class="tdganjil">
					<TD class="tdgenap" style="WIDTH: 20%">Collection Group
					</TD>
					<TD class="tdganjil">CG Jakarta</TD>
				</TR>
				<TR class="tdganjil">
					<TD class="tdgenap" style="WIDTH: 20%">
						<DIV align="left">Collector Id</DIV>
					</TD>
					<TD class="tdganjil" style="HEIGHT: 5px">xxxxx10xxxxx</TD>
				</TR>
				<TR>
					<TD class="tdgenap" style="WIDTH: 20%">
						<DIV align="left">Collector Name</DIV>
					</TD>
					<TD class="tdganjil" style="HEIGHT: 5px">xxxxx50xxxxx</TD>
				</TR>
				<TR>
					<TD class="tdgenap" style="WIDTH: 20%">
						<DIV align="left">Collector Type</DIV>
					</TD>
					<TD class="tdganjil" style="HEIGHT: 23px">xxxxx10xxxxx</TD>
				</TR>
				<TR>
					<TD class="tdgenap" style="WIDTH: 20%">Supervisor ID</TD>
					<TD class="tdganjil" style="HEIGHT: 22px">xxxxx10xxxxx</TD>
				</TR>
				<TR>
					<TD class="tdgenap" style="WIDTH: 20%">
						<DIV align="left">Active</DIV>
					</TD>
					<TD class="tdganjil" style="HEIGHT: 22px">Yes</TD>
				</TR>
				</table>
	<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopiungukiri">&nbsp;</td>
      <td align="center" class="tdtopiungu">COLLECTION SCHEME BUCKET LISTING</td>
      <td width="10" class="tdtopiungukanan">&nbsp;</td>
    </tr>
  </table>
   <div align="center">
    <asp:GridView runat="server" id="GrdListAgreement"  AllowSorting="True" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
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
		<asp:templatefield HeaderText="BUCKET ID">
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkApplicationid" NavigateUrl="../Credit/ViewApplication.htm" Target="_blank">xxxxxxxx10xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="BUCKET NAME">
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
      <td width="50%" align="right"><img src="../../Images/ButtonSave.gif" width="100" height="20" border="0"> 
        </a>&nbsp;</td>
    </tr>
  </table>

<br>
			<TABLE id="TableAddSave" style="HEIGHT: 19px" cellSpacing="0" cellPadding="0" width="95%"
				align="center" border="0">
				<TR>
					<td align="left"><asp:imagebutton id="imbBack" runat="server" CausesValidation="False" ImageUrl="../../Images/ButtonBack.gif" PostBackUrl="CollectorSetting.aspx"></asp:imagebutton>
					&nbsp;
					</td>
					<TD align="right">&nbsp;&nbsp; &nbsp;
						<asp:imagebutton id="imbNext" runat="server" ImageUrl="../../Images/ButtonNext.gif" PostBackUrl="CollectorSchemeNext.aspx"></asp:imagebutton>
					&nbsp;
						&nbsp;
						<A href="javascript:history.back();"></A>
					</TD>
				</TR>
			</TABLE>
		</form>
	</body>
</HTML>
