<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
</head>
<body>
<form runat="server" id="frmpaymentoutcontractbond">

<div align="center">


<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopitoscakiri">&nbsp;</td>
      <td align="center" class="tdtopitosca">FUNDING CONTRACT LISTING</td>
      <td width="10" class="tdtopitoscakanan">&nbsp;</td>
    </tr>
  </table>

  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    
    <tr class="tdganjil"> 
      <td class="tdgenap">Funding Co. ID</td>
      <td class="tdganjil">BCA</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap">Bank</td>
      <td class="tdganjil">Bank Central Asia</td>
    </tr>
    <tr class="tdganjil"> 
      <td class="tdgenap">Funding Company Name</td>
      <td class="tdganjil"><a href="../FundingSourceView.htm">xxxxxxxxxxxxxxx</a></td>
    </tr>
    <tr class="tdganjil"> 
      <td width="150" class="tdgenap">Search By</td>
      <td class="tdganjil"><select name="select">
          <option selected>Not Specified</option>
          <option >Funding Contract No</option>
        </select> <input name="textfield33" type="text" class="inptype" size="15">&nbsp; 
      </td>
    </tr>
  </table>
   <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right">
		<img src="../../Images/ButtonSearch.gif" width="100" height="20" border="0"> 
        <img src="../../Images/ButtonReset.gif" width="100" height="20" border="0"> 
      </td>
    </tr>
  </table>

  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopitoscakiri">&nbsp;</td>
      <td align="center" class="tdtopitosca">FUNDING CONTRACT LISTING</td>
      <td width="10" class="tdtopitoscakanan">&nbsp;</td>
    </tr>
  </table>
<div align="center"> 
      <asp:GridView runat="server" id="GrdViewBranch" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%">
		<Columns>
			<asp:boundfield DataField="valstring20" HeaderText="FUNDING COY ID">
			</asp:boundfield>
			<asp:boundfield DataField="valDATE"  HeaderText="DATE">
			</asp:boundfield>
			<asp:boundfield DataField="valstring50" SortExpression="valstring50" HeaderText="SELECTION TIME">
			</asp:boundfield>

			

			<asp:templatefield HeaderText="BATCH">
				<ItemStyle HorizontalAlign="Center" />
				<ItemTemplate>
					<asp:HyperLink runat="server" id="BtnBATCH" ImageUrl="../../images/IconDrawdown.gif" NavigateUrl="paymentoutcontractbond.aspx" />
				</ItemTemplate>
			</asp:templatefield>

			
		</Columns>
		<HeaderStyle CssClass="tdjudultosca" />
		<AlternatingRowStyle CssClass="tdgenap" />
		</asp:GridView>
		<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
		</asp:XmlDataSource>
    
    </div>


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
  
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"> <a href="javascript:history.go(-1);">
		<img src="../../Images/ButtonBack.gif" width="100" height="20" border="0"></a> 
      </td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
