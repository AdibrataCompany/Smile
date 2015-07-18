<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Untitled Document</title>
		<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
		<script src="Include/JavaScript/Elsa.js"></script>
	<script language="javascript">
function fmin1(){
	top.Mainframe.cols="0,*";
	top.ContentFrame.display();
}
function fshow(){
	document.all.maximize.src="images/close_bttn.gif";
}
function fhide(){
	document.all.maximize.src="images/maximize.gif";
}

function fmin(){
	top.Mainframe.cols="22px,*";
	Minimum.style.display="none";
	Maximum.style.display="inline";			
	MenuTree.style.display="none";
}
function fmax(){
	//alert('');
	top.Mainframe.cols="20%,*";
	Maximum.style.display="none";
	Minimum.style.display="inline";			
	MenuTree.style.display="inline";
}
		</script>
	</head>
<body bgcolor="#ffffff" LEFTMARGIN="0" TOPMARGIN="0" MARGINWIDTH="0" MARGINHEIGHT="0">
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td>
		<TABLE WIDTH=1024 BORDER=0 CELLPADDING=0 CELLSPACING=0>
			<TR>
				<TD ROWSPAN=2>
					<IMG SRC="images/home_01.jpg" WIDTH=76 HEIGHT=72 ALT=""></TD>
				<TD ROWSPAN=2>
					<IMG SRC="images/home_02.jpg" WIDTH=84 HEIGHT=72 ALT=""></TD>
				<TD ROWSPAN=2>
					<IMG SRC="images/home_03.jpg" WIDTH=72 HEIGHT=72 ALT=""></TD>
				<TD>
					<IMG SRC="images/home_04.jpg" WIDTH=164 HEIGHT=50 ALT=""></TD>
				<TD>
					<IMG SRC="images/home_05.jpg" WIDTH=238 HEIGHT=50 ALT=""></TD>
				<TD ROWSPAN=2 width="100%" >
					<table width="100%" height="72" border="0" cellpadding="0" cellspacing="0">
					<tr> 
					  <td align="center"><img src="Images/blank.gif" width="5" height="5"></td>
					</tr>
					 <tr>
						    <td align="center"><font size="1" face="Verdana, Arial, Helvetica, sans-serif"><%=Now()%>
								    <asp:Label runat="server" EnableViewState="False" ID="lblDate"></asp:Label><br/>
								    <strong>
									    Prototype, Jakarta
								    </strong>
							    </font>
						    </td>
					    </tr>
					<tr> 
					  <td align="center"><img src="Images/blank.gif" width="5" height="5"></td>
					</tr>
					<tr>
						    <td align="center" valign="bottom" > <a href="am_main.aspx" target="ContentFrame">
									    <img src="Images/ButtonHome.gif" width="70" height="17" border="0"></a> <a href="javascript:parent.frames.location.href='am_logout.aspx'" target="_top">
									    <img src="Images/ButtonLogout.gif" width="70" height="17" border="0">
						    </td>
				        </tr> 
				  </table></TD>
			</TR>
			<TR>
				<TD COLSPAN=2>
					<IMG SRC="images/home_07.jpg" WIDTH=402 HEIGHT=22 ALT=""></TD>
			</TR>
		</TABLE>
	</td>
</tr>
</table>
	

</body>
</html>
