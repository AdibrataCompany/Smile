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
<form runat="Server" id="frmEntryAssetData">
<div align="center"> 
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
	<tr>
	<td colspan="3"><font color="red"><i>*) required field</i></font></td>
	</tr>
  </table>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau"> ENTRY ASSET - 999 of 999</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
    <tr> 
      <td width="20%" class="tdgenap">Application ID</td>
      <td width="80%" class="tdganjil"><asp:HyperLink ID="hypApplicationID" text="Application00001" NavigateUrl="../../Credit/ViewApplication.htm" runat="server" Target="_blank"></asp:HyperLink>
      </td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Customer Name</td>
      <td class="tdganjil" width="80%"><a href="javascript:;" onClick="MM_openBrWindow('../../Credit/ViewPersonalCustomer.htm','Customer','scrollbars=yes,width=900,height=700')">xxxxxxxxxx50xxxxxxxxxxx</a></td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Currency</td>
      <td class="tdganjil" width="80%">IDR</td>
    </tr>
   
	 
  </table>
 
  
	 <table width="95%">
    <tr> 
      <td colspan="4" class="tdjudulhijau"> SUPPLIER </td>
    </tr>
	</table>

  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
   <tr>
      <td class="tdgenap" width="20%">Supplier Name</td>
      <td class="tdganjil" width="80%">
		<asp:TextBox ID="txtSupplierName" runat="server" CssClass="inptype" Width="176px" Height="16px"></asp:TextBox>
      <asp:HyperLink ID="hypSupplierName" runat="server" ImageUrl="../../Images/IconDetail.gif" NavigateUrl="../../Lookup/AssetLookup.htm" Target="_blank"></asp:HyperLink>
		</td>
    	</tr>
	<tr> 
      <td class="tdgenap" width="20%">Supplier Category</td>
      <td class="tdganjil" width="80%">Main Dealer / Showroom / Autorized Dealer / OtU</td>
    </tr>

  <tr> 
      <td class="tdgenap" width="20%">A/P to Account</td>
      <td class="tdganjil" width="80%">
      <asp:DropDownList ID="ddlSupplierAccount" runat="server" Width="180px" Height="17px">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="BCA - 1611283093" Value="BCA1"></asp:ListItem>
      </asp:DropDownList>
	</td>
    </tr>
  </table>
    <table width="95%">
    <tr> 
      <td colspan="4" class="tdjudulhijau"> OTU (OWNER TO USER) SUPPLIER ACCOUNT INFORMATION PRICE
      &nbsp;      <font color="red"><i> Diisi apabila Supplier Category = OtU</i></font></td>

    </tr>
	</table>

  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
   <tr>
      <td class="tdgenap" width="20%">Supplier Name</td>
      <td class="tdganjil" width="80%">
		<asp:TextBox ID="txtSupplierNameOtu" runat="server" CssClass="inptype" Width="183px"></asp:TextBox>
     
		</td>
    	</tr>

  <tr> 
      <td class="tdgenap" width="20%">Bank Name</td>
      <td class="tdganjil" width="80%">
      <asp:DropDownList ID="ddlSupplierOTUBankName" runat="server" Width="182px" Height="16px">
      <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
      <asp:ListItem Text="BCA" Value="BCA"></asp:ListItem>
      </asp:DropDownList></td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Bank Branch</td>
      <td class="tdganjil" width="80%"><asp:TextBox ID="txtSupplierOTUBankBranch" runat="server" CssClass="inptype"></asp:TextBox></td>
    </tr>
      <tr> 
      <td class="tdgenap" width="20%">Account Name</td>
      <td class="tdganjil" width="80%">
		<asp:TextBox ID="txtSupplierOTUAccountName" runat="server" CssClass="inptype"></asp:TextBox></td>    </tr>
	  <tr> 
      <td class="tdgenap" width="20%">Account No</td>
      <td class="tdganjil" width="80%">
		<asp:TextBox ID="txtSupplierOTUBAccountNo" runat="server" CssClass="inptype"></asp:TextBox></td>    </tr>
  </table>


  <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">

    <tr> 
      <td colspan="4" class="tdjudulhijau">ASSET DATA</td>
    </tr>
  </table>
    <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
     <tr>
      <td class="tdgenap" width="20%">Asset Type</td>
      <td class="tdganjil" width="80%" colspan="3">xxxx50xxxx</td>
    </tr>
    <tr>
      <td class="tdgenap" width="20%">Asset Description</td>
      <td class="tdganjil" width="30%" colspan="3"><asp:TextBox ID="txtAssetCode" runat="server" CssClass="inptype"></asp:TextBox>
          <asp:HyperLink ID="hypAssetCode" runat="server" ImageUrl="../../Images/IconDetail.gif" NavigateUrl="../../Lookup/AssetLookup.htm" Target="_blank"></asp:HyperLink>
	  <font color="red">*)</font>

	  </td>
	
    </tr>
    <tr>
      <td class="tdgenap" width="20%" style="height: 26px">OTR Price</td>
      <td class="tdganjil" width="30%" colspan="3" style="height: 26px"><asp:TextBox ID="txtOTR" runat="server" CssClass="inptype"></asp:TextBox>
      <font color="red">*)</font>
      </td>
    </tr>

    <tr> 
      <td class="tdgenap" width="20%">Chassis No [Serial No 1]</td>
      <td class="tdganjil" width="30%">
	     <asp:TextBox ID="txtSerial1" runat="server" CssClass="inptype"></asp:TextBox>    
	     <% if RdBtnListNewUsed.SelectedValue  = "Used" or  RdBtnListNewUsed.SelectedValue  = "U"   Then %>
	      <font color="red">*)</font>
	    	  <% End If %> 

      </td>
      <td class="tdgenap" width="20%">Used/New</td>
      <td class="tdganjil" width="30%">
      <asp:RadioButtonlist runat="server" id="RdBtnListNewUsed" RepeatDirection="Horizontal" AutoPostBack="true" Enabled="false">
			<asp:ListItem Text="New" Value="N"></asp:ListItem>
			<asp:ListItem Text="Used" Value="U"  Selected="True"></asp:ListItem>
			</asp:RadioButtonlist>

    </tr>
     
    <tr> 
      <td class="tdgenap" width="20%">Engine No [Serial No 2]</td>
      <td class="tdganjil" width="30%">
			<asp:TextBox ID="txtSerial2" runat="server" CssClass="inptype"></asp:TextBox>
  
	  <% if RdBtnListNewUsed.SelectedValue  = "Used" or  RdBtnListNewUsed.SelectedValue  = "U"   Then %>
	      <font color="red">*)</font>
	    	  <% End If %> 

	  </td>
      <td class="tdgenap" width="20%">Usage</td>
		<td class="tdganjil" width="30%">
		  <asp:DropDownList ID="ddlUsage" runat="server">
             <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
           	 <asp:ListItem Text="Non Commercial" ></asp:ListItem>
           	 <asp:ListItem Text="Commercial" ></asp:ListItem>
      	  </asp:DropDownList>
		<font color="red">*)</font>
		
    </tr>
    

    <tr> 
      <td class="tdgenap" width="20%">Manufacturing Year</td>
      <td class="tdganjil" width="30%"  colspan="3" >
      
      <input name="textfield325" type="text" class="inptype" value="0" size="15"> 
      </td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Color [Attribute 1]</td>
      <td class="tdganjil" width="30%" colspan="3" >
        <input name="textfield3232" type="text" class="inptype" size="15">
	  </td>
    </tr>
    <tr> 
      <td class="tdgenap"width="20%">License Plate [Attribute 2]</td>
      <td class="tdganjil" width="30%" colspan="3" >
        <input name="textfield32322" type="text" class="inptype" size="15">
      </td>
    </tr>
    <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">

      <tr> 
      <td colspan="4" class="tdjudulhijau"> ASSET INSURANCE</td>
    </tr>
    </table>

     <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">
     <tr> 
      <td class="tdgenap" width="20%">Insured By</td>
      <td class="tdganjil" width="80%"><asp:label id="lblInsuredBy" text="Company" runat="server" width="100"></asp:label></td>
    </tr>
    <tr> 
      <td class="tdgenap" width="20%">Insurance Co.</td>
      <td class="tdganjil" width="80%">		  
  		  <asp:DropDownList ID="ddlInsuranceCo" runat="server" Width="126px" Height="17px">
             <asp:ListItem Text="Select One" Value="0"></asp:ListItem>
           	 <asp:ListItem Text="Asuransi 1 " ></asp:ListItem>
           	 <asp:ListItem Text="Asuransi 2" ></asp:ListItem>
      	  </asp:DropDownList><font color="red">*)</font>

</td>
    </tr>

        <tr> 
      <td class="tdgenap" width="20%">Paid By</td>
      <td class="tdganjil" width="80%"><asp:label id="lblPaidBy" text="Customer" runat="server" width="100"></asp:label></td>
 
    </tr>
        <tr> 
      <td class="tdgenap" width="20%">Cover Period</td>
      <td class="tdganjil" width="80%"> <asp:label id="lblPeriod" text="Full Tenor" runat="server" width="100"></asp:label>
      </td>
 
    </tr>

  </table>
  
   <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">

      <tr> 
  		    <td colspan="4" class="tdjudulhijau">ASSET REGISTRATION</td>
  	  </tr>
    </table>
     
    <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">

    <tr> 
      <td class="tdgenap" style="width: 28%">Name</td>
      <td colspan="3" class="tdganjil"><input name="textfield3252" type="text" class="inptype" size="15">
      		<asp:Hyperlink  ImageUrl="../../Images/IconDetail.gif" ID="ucAssetRegistration" runat="server" NavigateUrl="../../Lookup/CustomerLookUp.htm" Target="_blank"></asp:Hyperlink>
      </td>
    </tr>
    <tr> 
      <td valign="top" class="tdgenap" style="width: 28%">Address</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <textarea name="textfield3232" cols="50" rows="5" class="inptype"></textarea>
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">RT/RW</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield323252" type="text" class="inptype" size="5">
        / 
        <input name="textfield3232522" type="text" class="inptype" size="5">
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Kelurahan</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32522" type="text" class="inptype" size="15">
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Kecamatan</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32523" type="text" class="inptype" size="15">
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">City</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32524" type="text" class="inptype" size="15">
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Zip Code</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield323262" type="text" class="inptype" size="15">
        <a href="javascript:;" onClick="MM_openBrWindow('../Lookup/ZipCodeLookup.htm','ZipCode','scrollbars=yes,width=900,height=500,left=0,top=0')"><img src="../../Images/IconDetail.gif" width="15" height="15" border="0" align="absmiddle"></a> 
        </font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Tax Date</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield3232622" type="text" class="inptype" size="15">
        <img src="../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"> 
        </font></td>
    </tr>
   
    

    <tr> 
      <td valign="top" class="tdgenap" style="width: 28%">Asset Notes</td>
      <td colspan="3" class="tdganjil"> <textarea name="textarea" cols="50" rows="5" class="inptype"></textarea> 
      </td>
    </tr>
    </table>
     <table width="95%" border="0" cellpadding="3" cellspacing="1" class="tablegrid">

    <tr> 
      <td colspan="4" class="tdjudulhijau" style="height: 20px">ASSET USAGE INFORMATION
      </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Name</td>
      <td class="tdganjil" colspan=3> 
		<input name="textfield3222" type="text" class="inptype" size="15" style="width: 172px">&nbsp; 
      </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Relationship with Customer</td>
      <td class="tdganjil" colspan=3>
		<select name="select4" style="width: 172px">
          <option selected>Select One</option>
        </select></td>
    </tr>
    <tr> 
      <td colspan="4" class="tdjudulhijau">ASSET LOCATION
      	</td>
    </tr>
    <tr>
      <td class="tdgenap" style="width: 28%">Copy Address From</td>
      <td class="tdganjil" colspan="3"><font face="Tahoma, Verdana" size="2"> 
        <select name="select9">
          <option selected>Legal Address</option>
          <option>Residence Address</option>
          <option>Company Address</option>
        </select>&nbsp; 
        <img src="../../Images/ButtonCopy.gif" border="0" align="absmiddle"></font></td>
    </tr>
    <tr>
      <td valign="top" class="tdgenap" style="width: 28%">Address</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <textarea name="textfield32326323" cols="50" rows="5" class="inptype"></textarea>
        </font></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 28%">RT/RW</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326324" type="text" class="inptype" size="5">
        / 
        <input name="textfield32326325" type="text" class="inptype" size="5">
        </font></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 28%">Kelurahan</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326326" type="text" class="inptype" size="15">
        </font></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 28%; height: 23px;">Kecamatan</td>
      <td colspan="3" class="tdganjil" style="height: 23px"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326327" type="text" class="inptype" size="15">
        </font></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 28%">City</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326328" type="text" class="inptype" size="15">
        </font></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 28%">Zip Code</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326329" type="text" class="inptype" size="15">
        <a href="javascript:;" onClick="MM_openBrWindow('../Lookup/ZipCodeLookup.htm','ZipCode','scrollbars=yes,width=900,height=500,left=0,top=0')"><img src="../../Images/IconDetail.gif" width="15" height="15" border="0" align="absmiddle"></a> 
        </font></td>
    </tr>
	<tr>
      <td class="tdgenap" style="width: 28%">Tax Date</td>
      <td colspan="3" class="tdganjil"><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326330" type="text" class="inptype" size="15">
        <img src="../../Images/iconcalendar.gif" width="20" height="20" align="absmiddle"> 
        </font></td>
    </tr>
	<tr>
      <td valign="top" class="tdgenap" style="width: 28%">Asset Notes</td>
      <td colspan="3" class="tdganjil"> 
		<textarea name="textarea0" cols="50" rows="5" class="inptype"></textarea> 
      </td>
    </tr>
    <tr> 
      <td colspan="4" class="tdjudulhijau">SUPPLIER EMPLOYEE <font color="red">*)</font></td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">General Manager</td>
      <td class="tdganjil"><select name="select">
          <option selected>Select one</option>
        </select> </td>

      <td class="tdgenap">Sales Person</td>
      <td class="tdganjil"><select name="select">
          <option selected>Select one</option>
        </select> </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Branch Manager</td>
      <td class="tdganjil"><select name="select">
          <option selected>Select one</option>
        </select> </td>
      <td class="tdgenap">Sales Supervisor</td>
      <td class="tdganjil"><select name="select">
          <option selected>Select one</option>
        </select> </td>
    </tr>
    <tr> 
      <td class="tdgenap" style="width: 28%">Administration Head</td>
      <td class="tdganjil"><select name="select">
          <option selected>Select one</option>
        </select> </td>
      <td class="tdgenap">Supplier Admin</td>
      <td class="tdganjil"><select name="select7">
          <option selected>Select one</option>
        </select> </td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr class="trtopikuning"> 
      <td width="10" height="20" class="tdtopihijaukiri">&nbsp;</td>
      <td align="center" class="tdtopihijau">ASSET DOCUMENT</td>
      <td width="10" class="tdtopihijaukanan">&nbsp;</td>
    </tr>
  </table>
  <table width="95%" border="0" cellpadding="2" cellspacing="1" class="tablegrid">
    <tr align="center"> 
      <td width="5%" class="tdjudulhijau">NO</td>
      <td width="20%" class="tdjudulhijau">DOCUMENT</td>
      <td width="20%" class="tdjudulhijau">NUMBER</td>
      <td width="5%" class="tdjudulhijau">CHECKED</td>
      <td width="20%" class="tdjudulhijau">NOTES</td>
    </tr>
    <tr class="tdganjil">
      <td align="center">99</td>
      <td>xxxxxxx20xxxxxxx</td>
      <td><font face="Tahoma, Verdana" size="2">
        <input name="textfield3232623" type="text" class="inptype" size="15">
        </font></td>
      <td align="center"> 
        <input type="checkbox" name="checkbox" value="checkbox">
        </td>
      <td><font face="Tahoma, Verdana" size="2">
        <input name="textfield3232632" type="text" class="inptype" size="30">
        </font></td>
    </tr>
    <tr class="tdgenap">
      <td align="center">99</td>
      <td>xxxxxxx20xxxxxxx</td>
      <td><font face="Tahoma, Verdana" size="2">
        <input name="textfield3232624" type="text" class="inptype" size="15">
        </font></td>
      <td align="center">
<input type="checkbox" name="checkbox2" value="checkbox">
      </td>
      <td><font face="Tahoma, Verdana" size="2"> 
        <input name="textfield32326322" type="text" class="inptype" size="30">
        </font></td>
    </tr>
  </table>
 <br>
<table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr> 
      <td width="70%" height="30" align="right"> <asp:CheckBox ID="chkContinue" runat="server" Text="Continue Entry for this application"></asp:CheckBox> &nbsp;</td>
      <td width="30%" align="right"><asp:ImageButton id="imbSaveSurveyReportDeMotor" imageurl="../../Images/ButtonSave.gif" runat="server" PostBackUrl="SurveyReportDEMotorFinancialStructure.aspx"></asp:ImageButton>
		<asp:ImageButton id="imbCancelSurveyReportDEMotor" postbackurl="SurveyReportDEMotorAssetDataList.aspx" imageurl="../../Images/ButtonCancel.gif" runat="server"></asp:ImageButton>
      </td>
    </tr>
  </table>

</div>
</form>
</body>
</html>
