<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>ReAssign Databank Internal</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script>
</head><body><form id="frmReAssign" runat="server">
<div align="center">

 <table width="95%" border="0" cellspacing="0" cellpadding="0">

    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">DATABANK LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
    <div align="center">
     <asp:GridView runat="server" id="GrdListDatabank" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" AllowSorting="True" >
    <Columns>
		<asp:boundfield DataField="valstring3" SortExpression="valstring3" HeaderText="BRANCH ID">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:templatefield HeaderText="ASSIGNMENT ID">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="ViewTseActivityHist.aspx" Target="_blank">xxxxxxxx10xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="ViewTseActivityHist.aspx" Target="_blank">xxxxxxxx10xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="NAME">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="../../Credit/ViewPersonalCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="../../Credit/ViewCompanyCustomer.htm" Target="_blank">xxxxxxxx20xxxxxxxx
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="vphone" Visible="False" SortExpression="vphone" HeaderText="PHONE NO">
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" SortExpression="valstring10" HeaderText="PRIORITY">
		</asp:boundfield>
		<asp:boundfield DataField="valstring10" SortExpression="valstring10" HeaderText="TSE">
		</asp:boundfield>
		<asp:boundfield DataField="valdate" SortExpression="valdate" HeaderText="ASSIGN DATE">
		</asp:boundfield>
		<asp:boundfield DataField="valdate" SortExpression="valdate" HeaderText="END DATE">
		</asp:boundfield>
		<asp:boundfield DataField="valstring1" SortExpression="valstring1" HeaderText="STATUS">
		</asp:boundfield>
		<asp:templatefield HeaderText="ATTENTION TO SUPERVISOR">
			<AlternatingItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="ViewTseActivityHist.aspx" Target="_blank">Yes
				</asp:HyperLink>
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				<asp:HyperLink runat="server" id="lnkCustomer" NavigateUrl="ViewTseActivityHist.aspx" Target="_blank">Yes
				</asp:HyperLink>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="SUPERVISOR COMMENT">
			<ItemStyle HorizontalAlign="Left" />
			<ItemTemplate>
				<asp:TextBox runat="server" id="TextBox1" CssClass="INPTYPE"></asp:TextBox>
			</ItemTemplate>
		</asp:templatefield>
	</Columns>
		<HeaderStyle CssClass="tdjudulhijau" />
		<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>

   
      
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
    </div>

  
    <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      
      <td width="50%" align="right">
   
        &nbsp;</td>
    </tr>
  </table>

  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr class="tdtopihijau"> 
      <td colspan="2">FINAL CONFIRMATION</td>
    </tr>
    <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Is Final</td>
      <td width="80%" class="tdganjil" style="height: 25px">
		<asp:RadioButtonList runat="server" id="RBLProspectConfirm" RepeatDirection="Horizontal">
			<asp:ListItem Text="Yes"></asp:ListItem>
			<asp:ListItem Text="No" Selected="True"></asp:ListItem>
		</asp:RadioButtonList>
     </tr>



  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" align="left">
		&nbsp;</td>
	  <td width="50%" align="right">&nbsp;
	  <asp:ImageButton id="imbSaveExit" imageurl="../../Images/ButtonSave.gif" runat="server" PostBackUrl="TseSupervisorActivity.aspx"></asp:ImageButton>
		&nbsp;<asp:ImageButton id="imbCancel" imageurl="../../Images/ButtonCancel.gif" runat="server" PostBackUrl="TseSupervisorActivity.aspx"></asp:ImageButton>
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
