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
		<style type="text/css">
.style1 {
	text-align: left;
}
</style>
</HEAD>
	<body>
		<form id="form1" runat="server">
		<div class="style1">
			<table width="95%" border="0" cellspacing="0" cellpadding="0">
				<tr class="trtopikuning">
					<td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
					<td align="center" class="tdtopibiru">APPROVAL</td>
					<td width="10" class="tdtopibirukanan">&nbsp;</td>
				</tr>
			</table>
			<table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
				<tr>
					<td width="25%" class="tdgenap">Approval ID</td>
					<td width="25%" class="tdganjil">xxxxx20xxxxx</td>
					<td width="25%" class="tdgenap">Approval Type</td>
					<td width="25%" class="tdganjil">xxxxxxxxxxxx50xxxxxxxxxxxx</td>
				</tr>
				<tr>
					<td class="tdgenap">Petty Cash Advance No</td>
					
      <td class="tdganjil"><a href="javascript:;" onClick="MM_openBrWindow('AdvanceInquiryView.aspx','Advance','scrollbars=yes,width=900,height=700,top=1,left=1')">xxxxx20xxxxx</a></td>
					<td class="tdgenap">Amount to be approved</td>
					
      <td class="tdganjil">IDR 999,999,999,999.00</td>
				</tr>
				<tr>
					<td class="tdgenap">&nbsp;</td>
					<td class="tdganjil">&nbsp;</td>
					<td class="tdgenap">&nbsp;</td>
					<td class="tdganjil">&nbsp;</td>
				</tr>
				<tr>
					<td class="tdgenap">Approval</td>
					<td class="tdganjil"><font face="Tahoma, Verdana" size="2">
							<asp:DropDownList ID="ddlApproval" runat="server">
								<asp:ListItem>Select One</asp:ListItem>
								<asp:ListItem>Approve</asp:ListItem>
								<asp:ListItem>Decline</asp:ListItem>
							</asp:DropDownList>
						</font>
					</td>
					<td class="tdgenap">Security Code</td>
					<td class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
						<asp:Textbox id="txtSecurityCode" runat="server" CssClass="inptype" />
						</font>
					</td>
				</tr>
				<tr>
					<td class="tdgenap">Final Level At</td>
					<td class="tdganjil" colspan="3">
						<asp:DropDownList ID="ddlFinalLevelAt" runat="server">
							<asp:ListItem>Select One</asp:ListItem>
						</asp:DropDownList>					
					</td>
				</tr>
				<tr>
					<td class="tdgenap" style="height: 25px">Is Final</td>
					<td class="tdganjil" colspan="3" style="height: 25px">
						<asp:RadioButtonList runat="server" id="rdoIsFinal" RepeatDirection="Horizontal">
							<asp:ListItem Selected="True">Yes</asp:ListItem>
							<asp:ListItem>No</asp:ListItem>
						</asp:RadioButtonList>
					</td>
				</tr>
				<tr>
					<td class="tdgenap">Next User Approval</td>
					<td class="tdganjil" colspan="3">
						<asp:DropDownList ID="ddlNextUser" runat="server">
							<asp:ListItem>Select One</asp:ListItem>
						</asp:DropDownList>					
					</td>
				</tr>
				<tr>
					<td class="tdgenap">Alternate Next User Approval</td>
					<td class="tdganjil" colspan="3">
						<asp:DropDownList ID="ddlAlternateUser" runat="server">
							<asp:ListItem>Select One</asp:ListItem>
						</asp:DropDownList>					
					</td>
				</tr>
				<tr>
					<td colspan="4" valign="top" class="tdgenap">Approval Recommendation</td>
				</tr>
				<tr>
					<td colspan="4" valign="top" class="tdganjil">
						<asp:TextBox runat="server" id="txtApprovalRecomm" TextMode="MultiLine" Width="500px" Height="70px">
						</asp:TextBox>
					</td>
				</tr>
			</table>
			<table width="95%" border="0" cellspacing="0" cellpadding="0">
			<tr>			
	      		<td height="30" style="width: 25%"><a href="javascript:;" onClick="MM_openBrWindow('AdvanceRequestView.aspx','Advance','scrollbars=yes,width=900,height=700,top=1,left=1')">View Approval Detail</a></td>
	      		<td height="30" style="width: 25%"><br></td>
				<td width="50%" align="right">
				<asp:ImageButton runat="server" id="imbSave" ImageUrl="../../images/buttonSave.gif" PostBackUrl="AdvanceRequestApproval.aspx" />
				<asp:ImageButton runat="server" id="imbCancel" ImageUrl="../../images/buttonCancel.gif"  PostBackUrl="AdvanceRequestApproval.aspx" />
				</td>
			</tr>
			</table>
			<div class="style1">
				<br>
				</div>
			<br>
			<table width="95%" border="0" cellspacing="0" cellpadding="0">
				<tr class="trtopikuning">
					<td width="10" height="20" class="tdtopibirukiri">&nbsp;</td>
					<td align="center" class="tdtopibiru">APPROVAL HISTORY</td>
					<td width="10" class="tdtopibirukanan">&nbsp;</td>
				</tr>
			</table>
				<asp:GridView Width="95%" runat="server" id="grdApprovalHist" DataSourceID="XmlDataSource2" AutoGenerateColumns="False">
					<Columns>
						<asp:boundfield DataField="valNo" HeaderText="NO" SortExpression="valNo">
							<ItemStyle HorizontalAlign="Center" />
						</asp:boundfield>
						<asp:boundfield DataField="valstring20" HeaderText="NAME" SortExpression="valstring20">
						</asp:boundfield>
						<asp:boundfield DataField="valdate" HeaderText="DATE" SortExpression="valdate">
							<ItemStyle HorizontalAlign="Center" />						
						</asp:boundfield>
						<asp:boundfield DataField="valstring10" HeaderText="TYPE" SortExpression="valstring10">
						</asp:boundfield>
						<asp:boundfield DataField="valstring20" HeaderText="SECURITY CODE" SortExpression="valstring20">
						</asp:boundfield>
						<asp:boundfield DataField="valstring50" HeaderText="APPROVAL REC" SortExpression="valstring50">
						</asp:boundfield>
						</Columns>
					<HeaderStyle CssClass="tdjudulbiru" />
					<AlternatingRowStyle CssClass="tdgenap" />
				</asp:GridView>
				<asp:XmlDataSource runat="server" ID="XmlDataSource2" DataFile="../../DataType.xml">
				</asp:XmlDataSource>				
			<br>
		</div>
		</form>
	</body>
</HTML>
