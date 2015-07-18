<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="shortcut icon" href="images/IconEdit.gif" type="image/x-icon" />

<title>.: PT. BFI Finance Indonesia, TBK</title>
<link href="Confins.css" rel="stylesheet" type="text/css" />
<script src="Include/JavaScript/Include/JavaScript/Elsa.js"></script>
<script type="text/javascript">
				
function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
//-->
			</script>

</head>

<body marginheight="0" marginwidth="0" topmargin="0" leftmargin="0">
<form id="frmLogin" method="post" runat="server">
<table border="0" cellpadding="0" cellspacing="0" width="100%">
<tr>
		<td align="center">
		
		<TABLE WIDTH=1024 BORDER=0 CELLPADDING=0 CELLSPACING=0>
			<TR>
				<TD COLSPAN=4 height="20">&nbsp;</TD>
			</TR>
			<TR>
				<TD>
					<IMG SRC="images/index_02.gif" WIDTH=241 HEIGHT=101 ALT=""></IMG></TD>
				<TD>
					<IMG SRC="images/Blank.gif" WIDTH=320 HEIGHT=101 ALT=""></IMG></TD>
				<TD COLSPAN=2>
					<IMG SRC="images/index_04.gif" WIDTH=463 HEIGHT=101 ALT=""></IMG></TD>
			</TR>
			<TR>
				<TD>
					<IMG SRC="images/index_05.gif" WIDTH=241 HEIGHT=111 ALT=""></IMG></TD>
				<TD>
					<IMG SRC="images/index_06.gif" WIDTH=320 HEIGHT=111 ALT=""></IMG></TD>
				<TD COLSPAN=2>
					<IMG SRC="images/Blank.gif" WIDTH=463 HEIGHT=111 ALT=""></IMG></TD>
			</TR>
			<TR>
				<TD valign="top">
					<IMG SRC="images/index_08.jpg" WIDTH=241 HEIGHT=196 ALT=""></IMG></TD>
				<TD valign="top">
					<IMG SRC="images/index_09.jpg" WIDTH=320 HEIGHT=196 ALT=""></IMG></TD>
				<TD background="images/background.gif" valign="top">
					<asp:panel id="pnlLoginInfo" runat="server">
					<table border="0" cellpadding="1" cellspacing="1" width="318">
						<tr>
							<td height="20" colspan="3">&nbsp;</td>
						</tr>
						<tr>
							<td height="20" colspan="3">&nbsp;</td>
						</tr>
						<tr>
							<td class="content" width="10">&nbsp;</td>
							<td class="content" align="left" style="width: 119px">Application</td>
							<td width="200" align="left"><select name="Select1">
							<option>Application Manager</option>
							<option>Confins</option>
							</select> </td>
						</tr>
						<tr>
							<td width="10">&nbsp;</td>
							<td class="content" align="left" style="width: 119px">Username
							</td>
							<td align="left">
							<asp:TextBox id="txtUsrNm" runat="server" font-names="Tahoma" font-size="XX-Small">
							</asp:TextBox>
							</td>
						</tr>
						<tr>
							<td width="10">&nbsp;</td>
							<td class="content" align="left" style="width: 119px">Password</td>
							<td align="left">
							<asp:TextBox id="txtPwd" runat="server" font-names="Tahoma" font-size="XX-Small" textmode="Password">
							</asp:TextBox>
							</td>
						</tr>
						<tr>
							<td colspan="2">&nbsp;</td>
							<td align="left"><a href="am_main.aspx">
							<img src="images/buttonlogin.jpg" /></a> </td>
						</tr>
						<tr>
							<td class="content"></td>
							<td colspan="2" class="content" width="300" align="left">
							<br />
							<br />
							&copy; Copyright 2008. Powered by
							<span class="style1">Ad</span><span class="style2">Ins</span>
							</td>
						</tr>
					</table>
                   	</asp:Panel>
                </TD>
			</TR>
		</TABLE>
	</td>
</tr>
</table> 
</form>
</body>
</html>

