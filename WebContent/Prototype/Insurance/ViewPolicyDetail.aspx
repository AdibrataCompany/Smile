<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled 1</title>


<link rel="stylesheet" type="text/css" href="../Confins.css" />

</head>

<body>

<form id="form1" runat="server">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="tdtopikiri"> 
      <td width="10" class="tdtopiabukiri" ></td>
      <td align="center" class="tdtopiabu" style="height: 20px">ASSET TYPE - EDIT</td>
      <td width="10" class="tdtopiabukanan" style="height: 20px"></td>
    </tr>
  </table>

<asp:GridView  Width="95%" runat="server" id="GridView1" DataSourceID="XmlDataSource2" AutoGenerateColumns="False" CssClass="tablegrid">
		<Columns>
			<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="ASSET NO">
				<ItemStyle CssClass="tdgenap" />
				<HeaderStyle CssClass="tdjudulabu" />
			</asp:boundfield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="ASSET DESCRIPTION" ApplyFormatInEditMode="True">
				<ItemStyle CssClass="tdganjil" />
				<HeaderStyle CssClass="tdjudulabu" />
			</asp:boundfield>
			<asp:boundfield DataField="valamount" SortExpression="valamount" HeaderText="AMOUNT COVERAGE">
				<ItemStyle CssClass="tdgenap" HorizontalAlign="Right" />
				<HeaderStyle CssClass="tdjudulabu" />
			</asp:boundfield>
			<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="INSURANCE TYPE">
				<ItemStyle CssClass="tdganjil" />
				<HeaderStyle CssClass="tdjudulabu" />
			</asp:boundfield>
			<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="STATUS">
				<ItemStyle CssClass="tdgenap" />
				<HeaderStyle CssClass="tdjudulabu" />
			</asp:boundfield>
			<asp:templatefield HeaderText="COVERAGE">
				<ItemStyle CssClass="tdganjil" />
				<HeaderStyle CssClass="tdjudulabu" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="HyperLink1" NavigateUrl="PolicyDetailView.htm">Coverage
					</asp:HyperLink>
				</ItemTemplate>
			</asp:templatefield>
		</Columns>
	</asp:GridView>
	<asp:XmlDataSource runat="server" ID="XmlDataSource2" DataFile="../DataType.xml">
	</asp:XmlDataSource>
	<table width="95%" height="25" border="0" align="left" cellpadding="0" cellspacing="0">
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
</form>

  
  
</body>

</html>
