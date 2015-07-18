<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html xmlns:v="urn:schemas-microsoft-com:vml" xmlns:o="urn:schemas-microsoft-com:office:office">
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
<form runat="server" id="FormAssetDocumentReceiveDetail">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20" class="tdtopimerahkiri">&nbsp;</td>
      <td align="center" class="tdtopimerah">ASSET DOCUMENT RECEIVE</td>
      <td width="10" class="tdtopimerahkanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap">Agreement No.</td>
      <td class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('../AccMaintenance/AgreementView.htm','Agreement','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxx20xxxx</a></td>
      <td width="18%" class="tdgenap">Customer</td>
      <td width="32%" class="tdganjil"><p><a href="javascript:;" onClick="MM_openBrWindow('../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxxxxxxxxxxxxxxxxx</a></p></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Asset Description</td>
      <td width="30%" class="tdganjil">xxxxxxxxxxxxxxxxxxxxxx</td>
      <td class="tdgenap">Supplier</td>
      <td class="tdganjil"><div align="left">xxxxxxxxxxxxxxxxxxxxx</div></td>
    </tr>
       <tr> 
      <td width="20%" class="tdgenap">Funding Co. Name</td>
      <td width="30%" class="tdganjil">xxxxxxxxxxxxxxxxxxxxxx</td>
      <td class="tdgenap">Funding Pledge Status</td>
      <td class="tdganjil"><div align="left">xxxxxxxxxxxxxxxxxxxxx</div></td>
    </tr>
   
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
      <td class="tdganjil" width="30%">xxxxxxxxxxxx</td>
      <td class="tdgenap" width="20%"> Engine No</td>
      <td class="tdganjil" width="30%">xxxxxxxxxxxxxxxxxxxxxx</td>
    </tr>
    <tr> 
      <td class="tdgenap">License Plate</td>
      <td class="tdganjil">xxxxxxxxxxxx</td>
      <td class="tdgenap">Tax Date</td>
      <td class="tdganjil">dd/mm/yyyy</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Guarantee&nbsp;<span id="lblGuarantee">None</span></td>
      <td width="30%" class="tdganjil" colspan="3">xxxxxxxxxxxxxxxxxxxxxx</td>
    </tr>
    </table>
<table width="95%" border="0" cellpadding="3" cellspacing="1" class="tdjudulmerah">
     <tr>
      <td width="100%" align="center"><div align="justify">
          <p class="tdjudulmerah">RECEIVE</p>
        </div></td>
    </tr>
  </table>

  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
     <tr> 
      <td class="tdgenap">Receive Date</td>
      <td class="tdganjil"><input name="textfield322422" type="text" class="inptype" size="15"> 
        <img src="../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"></td>
      <td class="tdgenap">Receive From</td>
      <td class="tdganjil"><input name="textfield32243" type="text" class="inptype" size="25"></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Rack Location</td>
      <td width="30%" class="tdganjil"><select name="select">
          <option selected>Select One</option>
          <option>Rack 1</option>
          <option>Rack 2</option>
        </select></td>
      <td width="18%" class="tdgenap">Filling Location</td>
      <td width="32%" class="tdganjil"><select name="select2">
          <option selected>Select One</option>
          <option>Filling A</option>
          <option>Filling B</option>
        </select></td>
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
				<asp:TextBox runat="server" id="TextBox1"></asp:TextBox>
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="DOCUMENT DATE" InsertVisible="False">
			<AlternatingItemTemplate>
				dd/mm/yyyy
			</AlternatingItemTemplate>
			<ItemStyle Width="15%" HorizontalAlign="Center" />
			<ItemTemplate>
				<asp:TextBox runat="server" id="TextBox1"></asp:TextBox>
				<asp:ImageButton runat="server" id="ImageButton1" ImageUrl="../Images/iconcalendar.gif" />
			</ItemTemplate>
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
		<asp:templatefield HeaderText="BORROW DATE">
			<AlternatingItemTemplate>
				dd/mm/yyyy
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				-
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="BORROW NAME">
			<AlternatingItemTemplate>
				xxxx20xxxx
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				-
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="BORROW CATEGORY">
			<AlternatingItemTemplate>
				xxxx20xxxx
			</AlternatingItemTemplate>
			<ItemStyle HorizontalAlign="Center" />
			<ItemTemplate>
				-
			</ItemTemplate>
		</asp:templatefield>
		<asp:templatefield HeaderText="RECEIVE DATE FROM BORROWER">
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
	  <asp:ImageButton id="imbSaveExit" imageurl="../Images/ButtonSave.gif" runat="server" PostBackUrl="AssetDocumentReceiveDetail.aspx"></asp:ImageButton>
		&nbsp;<asp:ImageButton id="imbCancel" imageurl="../Images/ButtonCancel.gif" runat="server" PostBackUrl="AssetDocumentReceiveDetail.aspx"></asp:ImageButton>
      </td>
    </tr>
  </table>
  <p>&nbsp;</p>
</div>
</form>
</body>
</html>
