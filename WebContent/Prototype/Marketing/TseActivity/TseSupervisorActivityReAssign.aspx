<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>UnAssign DataBank</title>
<link rel="stylesheet" type="text/css" href="../../Confins.css" />
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}
//-->
</script></head><body><form id="frmUnAssignDataBank" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
  <tr> 
      <td colspan="3"><font color="red"><i>Notes : yang muncul checkbox adalah yang statusnya Open saja 
      <br>
      </i></font></td>
    </tr>

    <tr class="trtopihijau"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">TSE SUPERVISOR ACTIVITY REASSIGN</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
   <tr> 
      <td width="25%" class="tdgenap">Branch</td>
      <td width="85%" class="tdganjil">

      <asp:DropDownList ID="ddlSearchBranch" runat="server" Width="145px" Height="18px">
      <asp:ListItem Text="All" Value="All"></asp:ListItem>
      <asp:ListItem Text="Bandung" Value="E"></asp:ListItem>
      <asp:ListItem Text="Jakarta" Value="I"></asp:ListItem>

      </asp:dropdownlist>
        
      </td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Tele Sales</td>
      <td width="80%" class="tdganjil" colspan="3">
		<asp:TextBox runat="server" id="TxtTSE" Width="141px" CssClass="inptype" TabIndex="1"></asp:TextBox>
		<font color="red">
		&nbsp;<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucTSE" runat="server" NavigateUrl="../../Lookup/EmployeeLookup.htm" Target="_blank"></asp:Hyperlink>
      </font> 
	
    </tr>

    <tr> 
      <td width="20%" class="tdgenap">Search By</td>
      <td width="80%" class="tdganjil">
      <asp:DropDownList runat="server" ID="ddlSearchCriteria"> 
      <asp:ListItem Text="Assignment ID" Value="TseActivity.AssignmentID"></asp:ListItem>
      <asp:ListItem Text="Name" Value="TseActivity.Name"></asp:ListItem>
      </asp:DropDownList>
      &nbsp;
      <asp:TextBox ID="txtSearchCustomer" runat="server" CssClass="inptype" width="200"></asp:textbox></td>
    </tr>
    <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Priority</td>
      <td width="80%" class="tdganjil" style="height: 25px">
		<asp:DropDownList runat="server" id="DDLPriority" Width="97px" Height="17px">
			<asp:ListItem>Select One</asp:ListItem>
			<asp:ListItem>All</asp:ListItem>
			<asp:ListItem>1.High</asp:ListItem>
			<asp:ListItem>2.Medium</asp:ListItem>
			<asp:ListItem>3.Low</asp:ListItem>
			<asp:ListItem>4.Very Low</asp:ListItem>
		</asp:DropDownList>
     </tr>
 <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Status</td>
      <td width="80%" class="tdganjil" style="height: 25px">Open
		&nbsp;</tr>
 <tr>
      <td width="20%" class="tdgenap" style="height: 25px">Attention To Supervisor</td>
      <td width="80%" class="tdganjil" style="height: 25px">
		<asp:DropDownList runat="server" id="DDLAttention" Width="97px" Height="17px">
			<asp:ListItem>All</asp:ListItem>
			<asp:ListItem>Yes</asp:ListItem>
			<asp:ListItem>No</asp:ListItem>
		</asp:DropDownList>
     </tr>

  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbSearchCriteria" imageurl="../../Images/ButtonSearch.gif" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbResetCriteria" imageurl="../../Images/ButtonReset.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <br />
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">DATA BANK LISTING</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
    <div align="center">
    <asp:GridView runat="server" id="GrdListAgreement" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" AllowSorting="True" >
    <Columns>
		<asp:templatefield>
			<HeaderTemplate>
				<asp:CheckBox runat="server" id="CheckBox1" />
			</HeaderTemplate>
			<ItemTemplate>
				<asp:CheckBox runat="server" id="CheckBox1" />
			</ItemTemplate>
		</asp:templatefield>
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
		<asp:boundfield DataField="valyesno" SortExpression="valyesno" HeaderText="ATTENTION TO SUPERVISOR">
			<ItemStyle HorizontalAlign="Center" />
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

      <td width="50%" height="30">
	
		</td>
      <td width="50%" align="right">
  		  <asp:ImageButton runat="server" ID="imbUnAssign" ImageUrl="../../images/ButtonNext.gif" PostBackUrl="TseSupervisorActivityReAssignProcess.aspx"></asp:ImageButton>
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>