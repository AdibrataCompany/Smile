<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Page Language="VB" %>
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled 1</title>
<link rel="stylesheet" type="text/css" href="Confins.css" />
<link rel="stylesheet" type="text/css" href="../Confins.css" />
</head>

<body>

<form id="form1" runat="server">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopiabukiri"></td>
      <td align="center" class="tdtopiabu">INSURANCE COMPANY PROFIT SHARING</td>
      <td width="10" class="tdtopiabukanan"></td>
    </tr>
  </table>
<table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdganjil"> 
      <td width="200" class="tdgenap">Insurance Co. ID</td>
      <td class="tdganjil">xxxx10xxxx</td>
    </tr>
    <tr class="tdgenap"> 
      <td>Insurance Co. Name</td>
      <td class="tdganjil">xxxx10xxxx</td>
    </tr>
     <tr class="tdgenap"> 
      <td>%Cost</td>
      <td class="tdganjil">
		<asp:TextBox runat="server" id="TextBox1" CssClass="inptype" Width="61px"></asp:TextBox>&nbsp;</td>
    </tr>

    </table>
<asp:GridView runat="server" id="GridView1" AutoGenerateColumns="False" DataSourceID="XmlDataSourceSharing" Width="95%">
	<Columns>
		<asp:templatefield HeaderText="%Cost">
			<ItemStyle CssClass="tdganjil" HorizontalAlign="Right" />
			<HeaderStyle CssClass="tdjudulabu" />
			<ItemTemplate>
				<asp:Label runat="server" Text='<%# Eval("valid") %>' id="Label1">
				</asp:Label>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="RATIO HASIL UND">
			<ItemStyle CssClass="tdgenap" HorizontalAlign="Right" />
			<HeaderStyle CssClass="tdjudulabu" />
			<ItemTemplate>
				<asp:ImageButton runat="server" id="ImageButton1" PostBackUrl="InsuranceCompanyProfitSharingUND.aspx" ImageUrl="../images/IconEdit.gif" />
			</ItemTemplate>
		</asp:templatefield>

		<asp:templatefield HeaderText="EDIT">
			<ItemStyle CssClass="tdgenap" HorizontalAlign="Right" />
			<HeaderStyle CssClass="tdjudulabu" />
			<ItemTemplate>
				<asp:ImageButton runat="server" id="ImageButton1" PostBackUrl="InsuranceCompanyProfitSharingEdit.aspx" ImageUrl="../images/IconEdit.gif" />
			</ItemTemplate>
		</asp:templatefield>
	</Columns>
	</asp:GridView>
	<asp:XmlDataSource runat="server" ID="XmlDataSourceSharing" DataFile="../DataType.xml">
	</asp:XmlDataSource>
	<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;<asp:ImageButton runat="server" id="ImageButton1" ImageUrl="../images/ButtonBack.gif" PostBackUrl="InsuranceCompanyProfitSharingSearch.aspx"></asp:ImageButton></td>
      <td width="50%" align="right"></td>
    </tr>
  </table>

</form>

</body>

</html>
