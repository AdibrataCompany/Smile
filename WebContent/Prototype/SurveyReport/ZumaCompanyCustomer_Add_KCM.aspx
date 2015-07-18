<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="iso-8859-1" %>
<html>
<head>
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
<body>
<form runat="Server" id="frmPersonalCustomerSurveyReportMobilCF">
<div align="center"> 
  <table width="95%" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td colspan="3"><font color="red"><i>*) required field</i></font></td>
    </tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">COMPANY CUSTOMER - ADD</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
  <tr> 
      <td colspan="6" class="tdjudulhijau">COMPANY DATA<font color="red">*)</font> 
      </td>
    </tr>

    <tr> 
      <td width="20%" class="tdgenap">Legal Name </td>
       <td colspan="5" class="tdganjil">
        <asp:HyperLink ID="hypCompanyCustomer" runat="server" Text="CompanyCustomer001" NavigateUrl="../LookUp/ViewCompanyCustomer.aspx"></asp:HyperLink></td>
    </tr>
    <tr>
      <td width="20%" class="tdgenap">NPWP Number</td>
      <td width="30%" class="tdganjil">111222333444555</td>
       <td class="tdgenap">Group</td>
    	<td class="tdganjil" >Non Group
		</td>
    </tr>
    <tr>
      <td width="20%" class="tdgenap">Company Type</td>
      <td class="tdganjil">Badan Usaha Milik Negara
        </td>
        <td width="20%" class="tdgenap">Industry Type</td>
      <td class="tdganjil">Pertanian</td>
    </tr>
   <table width="95%"  border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr> 
      <td colspan="4" class="tdjudulhijau">COMPANY ADDRESS <font color="red">*)</font> 
      </td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap" width="20%">Address</td>
      <td colspan="3" class="tdganjil"> 
	<asp:textbox id="txtgAddress" runat="server" cssclass="inptype" width="50%"></asp:textbox></td>
    </tr>
    <tr> 
      <td class="tdgenap">RT/RW</td>
      <td  colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtRT" runat="server" cssclass="inptype" width="15%"></asp:textbox>
        </font> / <font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtRW" runat="server" cssclass="inptype" width="15%"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Kelurahan</td>
      <td class="tdganjil" colspan="3"><asp:textbox id="txtKelurahan" runat="server" cssclass="inptype" width="100"></asp:textbox></td>
    </tr>
    <tr> 
      <td class="tdgenap">Kecamatan</td>
      <td class="tdganjil" colspan="3"><asp:textbox id="txtKecamatan" runat="server" cssclass="inptype" width="100"></asp:textbox></td>
    </tr>
    <tr> 
      <td class="tdgenap">City</td>
      <td class="tdganjil" colspan="3"><asp:textbox id="txtCity" runat="server" cssclass="inptype" width="100"></asp:textbox></td>
    </tr>
    <tr> 
      <td class="tdgenap">Zip Code</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
		<asp:textbox id="txtZipCode" Enabled="false" runat="server" cssclass="inptype" width="20%"></asp:textbox>
		<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucZipCode" runat="server" NavigateUrl="Lookup/ZipCodeLookup.htm" Target="_blank"></asp:Hyperlink>
		</font>
        </td> 
    </tr>
    <tr> 
      <td class="tdgenap">Phone 1</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
			<asp:textbox id="txtAreaPhone1" runat="server" cssclass="inptype" width="10%"></asp:textbox>
        - 
			<asp:textbox id="txtPhone1" runat="server" cssclass="inptype" width="20%"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="height: 24px">Phone 2</td>
      <td class="tdganjil" colspan="3" style="height: 24px"><font face="Tahoma, Verdana" size="2"> 
       	<asp:textbox id="txtAreaPhone2" runat="server" cssclass="inptype" width="10%"></asp:textbox>
        - 
			<asp:textbox id="txtPhone2" runat="server" cssclass="inptype" width="20%"></asp:textbox>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap">Fax</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
      	<asp:textbox id="txtAreaFax1" runat="server" cssclass="inptype" width="10%"></asp:textbox>
        - 
			<asp:textbox id="txtFax1" runat="server" cssclass="inptype" width="20%"></asp:textbox>
        </font></td>
    </tr>
     <tr> 
      <td class="tdgenap">Coverage Area</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
      	<asp:textbox id="txtCoverageArea" runat="server" cssclass="inptype" width="10%"></asp:textbox>
      
      	<asp:CustomValidator Display="Dynamic" id="cvCoverageArea" runat="server" ControlToValidate="txtCoverageArea" SetFocusOnError="true" Text="Please Fill With Number"></asp:CustomValidator>
        </font></td>
    </tr>
    <tr>
  <td width="20%" class="tdgenap">Product</td>
       <td colspan="3" class="tdganjil">
       <asp:dropdownlist id="ddlProduct" runat="server" width="100">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="DE Motor" Value="DEMTR"></asp:ListItem>
      <asp:ListItem Text="DE Mobil" Value="DEMBL"></asp:ListItem>
      <asp:ListItem Text="CF Mobil" Value="CFMBL"></asp:ListItem>
      <asp:ListItem Text="Leasing" Value="LSNG"></asp:ListItem>
      </asp:dropdownlist > 
		</td>

</tr>
</table>
<BR>
	<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
	 <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">MANAGEMENT &amp; SHAREHOLDERS COMPOSITION</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
     </tr>
    </TABLE>
	<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
		<TR align="center">
			<TD>
			<asp:GridView id="GrdListManagement" runat="server" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="100%">
			<Columns>
			<asp:boundfield DataField="valno" HeaderText="NO" SortExpression="valno">
					<ItemStyle HorizontalAlign="Center" width="3%" />
		    </asp:boundfield>
		    <asp:templatefield HeaderText="NAME">
			    <ItemTemplate>
				<asp:textbox id="txtName" runat="server" cssclass="inptype" width="75%"></asp:textbox>
				<font color="red">*)</font>
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center" Width="12%"/>
			</asp:templatefield>
 			<asp:templatefield HeaderText="ID NUMBER">
			    <ItemTemplate>
				<asp:textbox id="txtIDNumber" runat="server" cssclass="inptype" width="95%"></asp:textbox>
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center" width="15%"/>
			</asp:templatefield>
			<asp:templatefield HeaderText="POSITION">
			    <ItemTemplate>
				<asp:DropDownList id="ddlPosition" runat="server" cssclass="inptype" width="75%">
	  			  <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
			      <asp:ListItem Text="President Commisioner" Value="PC"></asp:ListItem>
			      <asp:ListItem Text="President Director" Value="PD"></asp:ListItem>
			      <asp:ListItem Text="Director" Value="D"></asp:ListItem>
			      <asp:ListItem Text="Manager" Value="M"></asp:ListItem>
				</asp:DropDownList >
				<font color="red">*)</font>
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center" Width="15%" />
			</asp:templatefield>
			<asp:templatefield HeaderText="ADDRESS">
			    <ItemTemplate>
				<asp:textbox id="txtAddress" runat="server" cssclass="inptype" width="85%"></asp:textbox>
				<font color="red">*)</font>
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center" />
			</asp:templatefield>
			<asp:templatefield HeaderText="PHONE">
			    <ItemTemplate>
				<asp:textbox id="txtPhone" runat="server" cssclass="inptype" width="75%"></asp:textbox>
				<font color="red">*)</font>
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center" width="10%"/>
			</asp:templatefield>
			<asp:templatefield HeaderText="SHARE(%)">
			    <ItemTemplate >
				<asp:textbox id="txtPhone" runat="server" cssclass="inptype" width="75%"></asp:textbox>
				<font color="red">*)</font>
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center" width="10%"/>
			</asp:templatefield>
			<asp:templatefield HeaderText="RELATION">
			    <ItemTemplate>
				<asp:DropDownList id="ddlRelation" runat="server" cssclass="inptype" width="75%">
	  			  <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
			      <asp:ListItem Text="Brother/Sister" Value="BS"></asp:ListItem>
			      <asp:ListItem Text="Children" Value="CH"></asp:ListItem>
			      <asp:ListItem Text="Parent" Value="PR"></asp:ListItem>
			      <asp:ListItem Text="Spouse" Value="SP"></asp:ListItem>
			      <asp:ListItem Text="Other" Value="OT"></asp:ListItem>
				</asp:DropDownList >
				<font color="red">*)</font>
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center" width="10%"/>
			</asp:templatefield>
			<asp:templatefield HeaderText="ACTION">
			<ItemTemplate>
				<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../images/IconDelete.gif" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" Width="5%" />
		</asp:templatefield>

			</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
  			</asp:GridView>
  			</TD>
		</TR>
	</TABLE>
	<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
		<TR>
			<TD align="left"><asp:imagebutton id="imbAddManagement" runat="server" ImageUrl="../../images/buttonadd.gif" CausesValidation="False"
					ALT="Add"></asp:imagebutton></TD>
		</TR>
	</TABLE>

	<BR>
	<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
	 <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">LEGAL DOCUMENT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
     </tr>
    </TABLE>
	<TABLE cellSpacing="0" cellPadding="0" width="95%" border="0">
		<TR align="center">
			<TD>
			<asp:GridView id="GrdLegalDoc" runat="server" AutoGenerateColumns="False" DataSourceID="XmlDataSource1" CellPadding="2" Width="100%">
			<Columns>
			<asp:boundfield DataField="valno" HeaderText="NO" SortExpression="valno">
					<ItemStyle HorizontalAlign="Center" Width="3%"/>
		    </asp:boundfield>
		   	<asp:templatefield HeaderText="DOCUMENT TYPE">
			    <ItemTemplate>
				<asp:DropDownList id="ddlDocType" runat="server" cssclass="inptype" width="75%">
	  			  <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
			      <asp:ListItem Text="AD/ART" Value="AD"></asp:ListItem>
			      <asp:ListItem Text="Akte" Value="AKT"></asp:ListItem>
			      <asp:ListItem Text="NPWP" Value="NPWP"></asp:ListItem>
			      <asp:ListItem Text="SIUP" Value="SIUP"></asp:ListItem>
				  <asp:ListItem Text="TDP" Value="TDP"></asp:ListItem>
				</asp:DropDownList >
				<font color="red">*)</font>
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center" Width="15%"/>
			</asp:templatefield>
			<asp:templatefield HeaderText="DOCUMENT NO">
			    <ItemTemplate>
				<asp:textbox id="txtDocNo" runat="server" cssclass="inptype" width="75%"></asp:textbox>
				<font color="red">*)</font>
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center" Width="22%"/>
			</asp:templatefield>
			<asp:templatefield HeaderText="DATE">
			    <ItemTemplate>
				<asp:textbox id="txtDate" runat="server" cssclass="inptype" width="55%"></asp:textbox>
				<asp:imagebutton id="imbCalendar" runat="server" ImageUrl="../../images/iconcalendar.gif" CausesValidation="False"></asp:imagebutton>
				<font color="red">*)</font>
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center" Width="15%"/>
			</asp:templatefield>
			<asp:templatefield HeaderText="EXPIRED DATE" >
			    <ItemTemplate>
				<asp:textbox id="txtExpDate" runat="server" cssclass="inptype" width="55%"></asp:textbox>
				<asp:imagebutton id="imbCalendar" runat="server" ImageUrl="../../images/iconcalendar.gif" CausesValidation="False"></asp:imagebutton>
				<font color="red">*)</font>
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center" Width="15%" />
			</asp:templatefield>
			<asp:templatefield HeaderText="NOTES">
			    <ItemTemplate>
				<asp:textbox id="txtNotes" runat="server" cssclass="inptype" width="95%"></asp:textbox>
				</ItemTemplate>
				<ItemStyle HorizontalAlign="Center" />
			</asp:templatefield>

			<asp:templatefield HeaderText="ACTION">
			<AlternatingItemTemplate>
				<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../images/IconDelete.gif" />
			</AlternatingItemTemplate>
			<ItemTemplate>
				<asp:ImageButton runat="server" id="BtnDelete" ImageUrl="../../images/IconDelete.gif" />
			</ItemTemplate>
			<ItemStyle HorizontalAlign="Center" Width="5%"/>
		</asp:templatefield>

			</Columns>
			<HeaderStyle CssClass="tdjudulhijau" />
			<AlternatingRowStyle CssClass="tdgenap" />
  			</asp:GridView>
  			</TD>
		</TR>
	</TABLE>
	<asp:XmlDataSource runat="server" ID="XmlDataSource1" DataFile="../DataType.xml">
		</asp:XmlDataSource>

   <table width="95%" border="0" cellspacing="0" cellpadding="0">
   	<TR>
			<TD align="left"><asp:imagebutton id="imbAddDocument" runat="server" ImageUrl="../../images/buttonadd.gif" CausesValidation="False"
					ALT="Add"></asp:imagebutton></TD>
		</TR>

    <tr> 
      <td width="50%" height="30">&nbsp;</td>
      <td width="50%" align="right"><asp:ImageButton id="imbSaveCompanyCustomerSurveyReport" imageurl="../../Images/ButtonSave.gif" postbackurl="SurveyReport_CF_ApplicationData.aspx" runat="server"></asp:ImageButton>
		<asp:ImageButton id="imbCancelCompanyCustomerSurveyReport" runat="Server" postbackurl="Customer.aspx" imageurl="../../Images/ButtonCancel.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>
 
  

  </div>
</form>
</body>
</html>
