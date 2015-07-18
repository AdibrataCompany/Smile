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
</head>
<body>
<form runat="server" id="frmAssetDocumentBorrowDetail">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopimerahkiri">&nbsp;</td>
      <td align="center" class="tdtopimerah">ASSET DOCUMENT BORROW</td>
      <td width="10" class="tdtopimerahkanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap">Agreement No.</td>
      <td width="30%" class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../AccMaintenance/AgreementView.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td width="18%" class="tdgenap">Customer</td>
      <td width="32%" class="tdganjil"><p><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxxxxxxxxxxxxxx</a></p></td>
    </tr>
    <tr> 
      <td class="tdgenap">Asset Description</td>
      <td class="tdganjil">xxxxxxxxxxxxxxxxxxxxxx</td>
      <td class="tdgenap">Supplier</td>
      <td class="tdganjil"><div align="left">xxxxxxxxxxxxxxxxxxxxx</div></td>
    </tr>
       <tr> 
      <td width="20%" class="tdgenap">Funding Co. Name</td>
      <td width="30%" class="tdganjil">xxxxxxxxxxxxxxxxxxxxxx</td>
      <td class="tdgenap">Funding Pledge Status</td>
      <td class="tdganjil"><div align="left">xxxxxxxxxxxxxxxxxxxxx</div></td>
    </tr>

  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tdjudulmerah">
    <tr>
    <td width="100%" align="center"><div align="justify"> 
          <p class="tdjudulmerah">REGISTRATION</p>
      </div></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    
    <tr> 
      <td class="tdgenap" width="20%">Chassis No</td>
      <td class="tdganjil" width="30%"><input name="textfield32242" type="text" class="inptype" size="20"></td>
      <td class="tdgenap" width="20%">Engine No</td>
      <td class="tdganjil">xxxxxxxxxxxxxxxxxxxxxx</td>
    </tr>
    <tr> 
      <td class="tdgenap">License Plate</td>
      <td class="tdganjil">xxxxxxxxxxxx</td>
      <td class="tdgenap">Tax Date</td>
      <td class="tdganjil">dd/mm/yyyy</td>
    </tr>
    
     </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tdjudulmerah">
  
    <tr>
    <td width="100%" align="center"><div align="justify"> 
          <p class="tdjudulmerah">GUARANTEE TYPE</p>
      </div></td>
    </tr>
  </table>
     
   <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
   <tr>
      <td class="tdgenap" width="20%" >
           <asp:RadioButton runat="server" ID="RdbtnFund" Text="Fund" GroupName="Fund"></asp:RadioButton>
           <td colspan="2" valign="top" class="tdganjil">
     	    <asp:TextBox runat="server" id="TextBoxFund" CssClass="inptype" ></asp:TextBox>
      </td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%" style="height: 25px" >
           <asp:RadioButton runat="server" ID="RdbtnDocument" Text="Document" GroupName="Fund"></asp:RadioButton>
           <td colspan="2" valign="top" class="tdganjil" style="height: 25px">
     	    <asp:TextBox runat="server" id="TextBoxDocument" CssClass="inptype" ></asp:TextBox>
      </td>
    </tr>
	<tr> 
      <td class="tdgenap" width="20%" >
           <asp:RadioButton runat="server" ID="RdbtnNone" Text="None" GroupName="Fund"></asp:RadioButton>
           <td colspan="2" valign="top" class="tdganjil">
			
      </td>
    </tr>

    <tr> 
      <td valign="tdgenap" class="tdgenap">Notes</td>
      <td colspan="2" valign="top" class="tdganjil"><textarea name="textfield322432" cols="50" rows="2" class="inptype"></textarea></td>
    </tr>

     
  </table>
     	 
  
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%">&nbsp;</td>
      <td width="50%" align="right"> <p><a href="javascript:history.go(-2);"> </a><a href="javascript:history.go(-2);"> 
        </a> </p></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopimerahkiri">&nbsp;</td>
      <td align="center" class="tdtopimerah">DOCUMENT LIST</td>
      <td width="10" class="tdtopimerahkanan">&nbsp;</td>
    </tr>
  </table>
  <div align="center">
   <asp:GridView runat="server" id="GrdListAgreement"  AllowSorting="True" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:templatefield HeaderText="RECEIVE IN ADVANCE">
			<AlternatingItemTemplate>
				Yes
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				No
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="DOCUMENT NAME">
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				xxxxxxx50xxxxxxx
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="DOCUMENT NO">
			<AlternatingItemTemplate>
				xxxx20xxxx
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				xxxx20xxxx			</ItemTemplate>
		</asp:templatefield>
		
		<asp:templatefield HeaderText="1st RECEIVE DATE">
			<AlternatingItemTemplate>
				dd/mm/yyyy
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				-
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="STATUS">
			<AlternatingItemTemplate>
				OnHand
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				Waiting
			</ItemTemplate>
		</asp:templatefield>
		<asp:boundfield DataField="valdate" HeaderText="STATUS DATE">
		</asp:boundfield>
		<asp:templatefield HeaderText="BORROW">
			<AlternatingItemTemplate>
   				<asp:CheckBox runat="server" id="CheckBox1" />
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				
			</ItemTemplate>
		</asp:templatefield>
	</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
    	<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
		</asp:XmlDataSource>
    </div>
  
 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" align="left">
		&nbsp;</td>
	  <td width="50%" align="right">&nbsp;
	  <asp:ImageButton id="imbSaveExit" imageurl="../Images/ButtonNext.gif" runat="server" PostBackUrl="AssetDocumentBorrowDetailProcess.aspx"></asp:ImageButton>
		&nbsp;<asp:ImageButton id="imbCancel" imageurl="../Images/ButtonCancel.gif" runat="server" PostBackUrl="AssetDocumentBorrow.aspx"></asp:ImageButton>
      </td>
    </tr>
  </table>
  
</div>
</form>
</body>
</html>
