<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../../Confins.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="../../Include/Insurance.css">
</head>

<body>
<form id="form1" runat="server">
<div align="center">
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopiabu"> 
      <td width="10" height="20">
		<img src="../../Images/AbuKiri.gif" width="10" height="21"></td>
      <td align="center" class="tdtopiabu">CLAIM PROCESS FORM</td>
      <td width="10">
		<img src="../../Images/AbuKanan.gif" width="10" height="21"></td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap">Agreement No</td>
      <td width="30%" class="tdganjil"><a href="../../Credit/ViewAgreement.htm" target="_blank">xxxxxxxx20xxxxxxxx</a></td>
      <td width="20%" class="tdgenap">Customer Name</td>
      <td width="30%" class="tdganjil"><a href="../../Credit/ViewPersonalCustomer.htm" target="_blank">xxxxxxxx30xxxxxxxx</a></td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Asset Description</td>
      <td class="tdganjil" colspan="3" style="width: 60%">xxxxxxxxxxxxxx50xxxxxxxxxxxxxx</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Serial No</td>
      <td width="30%" class="tdganjil">xxxxxxxx20xxxxxxxx</td>
      <td width="20%" class="tdgenap">Engine No</td>
      <td width="30%" class="tdganjil">xxxxxxxx20xxxxxxxx</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">License Plate</td>
      <td width="30%" class="tdganjil">xxxxx10xxxxx</td>
      <td width="20%" class="tdgenap">Color</td>
      <td width="30%" class="tdganjil">xxxxxxxx20xxxxxxxx</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Asset Year</td>
      <td width="30%" class="tdganjil">2000</td>
      <td width="20%" class="tdgenap">Policy No</td>
      <td width="30%" class="tdganjil">xxxxxxxx40xxxxxxxx</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Insurance Company</td>
      <td class="tdganjil" colspan="3" style="width: 60%">ACA Jakarta</td>
    </tr>
    <tr> 
      <td width="20%" class="tdgenap">Ins Co Phone No</td>
      <td width="30%" class="tdganjil">xx4xx - xxxxx10xxxxx</td>
      <td width="20%" class="tdgenap">Ins Co Fax</td>
      <td width="30%" class="tdganjil">xx4xx - xxxxx10xxxxx</td>
    </tr>
    <tr> 
      <td class="tdgenap">Premium Paid To Ins Co</td>
      <td class="tdganjil">999,999,999.99</td>
      <td class="tdgenap">Premium Paid By Cust</td>
      <td class="tdganjil">999,999,999.99</td>
    </tr>
    </table>
    
    <asp:GridView runat="server" id="grdClaimRequest" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="95%" >
    <Columns>
		<asp:boundfield DataField="valNo" HeaderText="YEAR NUM" SortExpression="valNo">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valdate" HeaderText="END DATE" SortExpression="valdate">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valamount" HeaderText="SUM INSURED" SortExpression="valamount">
			<ItemStyle HorizontalAlign="Right" />
		</asp:boundfield>
		<asp:boundfield DataField="valstring3" HeaderText="COVERAGE" SortExpression="valstring3">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valamount" HeaderText="TPL AMOUNT" SortExpression="valamount">
			<ItemStyle HorizontalAlign="Right" />
		</asp:boundfield>
		<asp:boundfield DataField="valYN" HeaderText="SRCC" SortExpression="valYN">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valYN" HeaderText="TS" SortExpression="valYN">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valYN" HeaderText="SRCCTS" SortExpression="valYN">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valYN" HeaderText="RSMD" SortExpression="valYN">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valYN" HeaderText="AOG" SortExpression="valYN">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valYN" HeaderText="EARTHQUAKE" SortExpression="valYN">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
		<asp:boundfield DataField="valYN" HeaderText="FLOOD" SortExpression="valYN">
			<ItemStyle HorizontalAlign="Center" />
		</asp:boundfield>
	</Columns>
			<HeaderStyle CssClass="tdjudulabu" />
			<AlternatingRowStyle CssClass="tdgenap" />
    </asp:GridView>
	<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../../DataType.xml">
	</asp:XmlDataSource>
  <br />
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td class="tdgenap" style="width: 20%">Claim Request Date</td>
      <td class="tdganjil" style="width: 80%">
		<asp:TextBox runat="server" id="txtClaimReqDate" CssClass="inptype" Width="100px">
		</asp:TextBox>&nbsp;
		<img src="../../Images/iconcalendar.gif"></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Claim Type</td>
      <td class="tdganjil" style="width: 80%">
		<asp:DropDownList runat="server" id="ddlClaimType" AutoPostBack="True">
			<asp:ListItem Value="ARK">Partial Loss</asp:ListItem>
			<asp:ListItem>TLO</asp:ListItem>
			<asp:ListItem>Fire</asp:ListItem>
			<asp:ListItem>TPL</asp:ListItem>
			<asp:ListItem>SRCC</asp:ListItem>
			<asp:ListItem>TS</asp:ListItem>
			<asp:ListItem>RSMD</asp:ListItem>
			<asp:ListItem>AOG</asp:ListItem>
			<asp:ListItem>Earthquake</asp:ListItem>
			<asp:ListItem>Flood</asp:ListItem>
		</asp:DropDownList>
		&nbsp;<br>
		<font color="red">harus dicheck berdasarkan coverage yang ada, kalau tidak ada SRCC, maka SRCC tidak muncul di list.</font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Cases</td>
      <td class="tdganjil" style="width: 80%">
		<asp:DropDownList runat="server" id="ddlCases">
			<asp:ListItem Value="CTL">Constructive Total Loss</asp:ListItem>
			<asp:ListItem Value="ATL">Actual Total Loss</asp:ListItem>
		</asp:DropDownList>
		</td>
    </tr>
    <tr>
      <td class="tdgenap" style="width: 20%">Event Date</td>
      <td class="tdganjil" style="width: 80%">
		<asp:TextBox runat="server" id="txtEventDate" CssClass="inptype" Width="100px">
		</asp:TextBox>&nbsp;
		<img src="../../Images/iconcalendar.gif"></td>
    	</tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Event Location</td>
      <td class="tdganjil" style="width: 80%">
		<asp:TextBox runat="server" id="txtEventLocation" CssClass="inptype" Width="400px"></asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Damage Part</td>
      <td class="tdganjil" style="width: 80%">
		<asp:TextBox runat="server" id="txaDamagePart" CssClass="inptype" TextMode="MultiLine" Width="400px" Height="40px">
		</asp:TextBox>
		</td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 20%">Reported By</td>
      <td class="tdganjil" style="width: 80%">
		<asp:TextBox runat="server" id="txtReportedBy" CssClass="inptype">
		</asp:TextBox>
&nbsp;as 
        <asp:TextBox runat="server" id="txtReportedAs" CssClass="inptype">
		</asp:TextBox>
		</td>
    </tr>
<% If ddlClaimType.SelectedValue = "ARK" Then %>       
  	<tr>
      <td class="tdgenap" style="width: 20%">Reimburse</td>
      <td class="tdganjil" style="width: 80%">
		<asp:CheckBox runat="server" id="chkReimburse" />
	  </td>
    	</tr> 	
<% End If %>  
<% If ddlClaimType.SelectedValue <> "TLO" Then %>        		
	    <tr>
      <td class="tdgenap" style="width: 20%">Claim Amount</td>
      <td class="tdganjil" style="width: 80%">
		<asp:TextBox runat="server" id="txtClaimAmount" CssClass="inptype">
		</asp:TextBox>
		</td>
    	</tr>
<% End If %>    	
		<tr>
      <td class="tdgenap" style="width: 20%">Workshop Name</td>
      <td class="tdganjil" style="width: 80%">
		<asp:TextBox runat="server" id="txtWorkshopName" CssClass="inptype" Width="250px">
		</asp:TextBox>
		</td>
    	</tr>
		<tr>
      <td class="tdgenap" style="width: 20%">Workshop Phone</td>
      <td class="tdganjil" style="width: 80%">
		<asp:TextBox runat="server" id="txtWorkshopAreaPhone" CssClass="inptype" Width="50px">
		</asp:TextBox>
		&nbsp;-
		<asp:TextBox runat="server" id="txtWorkshopPhoneNo" CssClass="inptype" Width="140px">
		</asp:TextBox>
		</td>
    	</tr>
		<tr>
      <td class="tdgenap" style="width: 20%">Workshop PIC</td>
      <td class="tdganjil" style="width: 80%">
		<asp:TextBox runat="server" id="txtWorkshopPic" CssClass="inptype" Width="250px">
		</asp:TextBox>
		</td>
    	</tr>
<% If ddlClaimType.SelectedValue <> "TLO" Then %>        		    	
		<tr>
      <td class="tdgenap" style="width: 20%">Claim To Ins Co Date</td>
      <td class="tdganjil" style="width: 80%">
		<asp:TextBox runat="server" id="txtClaimToInsCoDate" CssClass="inptype" Width="100px">
		</asp:TextBox>&nbsp;
		<img src="../../Images/iconcalendar.gif"></td>
    	</tr> 	
<% End If %>    	
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td height="30" align="right">&nbsp;  
		<asp:ImageButton runat="server" id="imbSave" ImageUrl="../../images/buttonSave.gif" PostBackUrl="ClaimRequest.aspx"/>
		<asp:ImageButton runat="server" id="imbCancel" ImageUrl="../../images/buttonCancel.gif" PostBackUrl="ClaimRequest.aspx"/>
		</td>
    </tr>
  </table>
</div>
</form>
</body>
</html>
