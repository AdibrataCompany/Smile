<HTML>
	<HEAD>
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
		<base target="_self">
	</HEAD>
	<body bgcolor="#F5F5F5" onload="fmin()" leftmargin="0">
		<form id="FrmMenu" runat="server">
		<div id="Minimum" style="DISPLAY:none">
			<table width="100%" border="0" cellspacing="0" cellpadding="0" bgcolor="#F5F5F5">
				<tr>
					<td align="right" width="170"></td>
					<td align="right" width="20"><a href="javascript:fmin();"> 
                    <asp:Image runat="server" id="BtnMinNavigasi" ImageUrl="images/butkiri.gif" Height="20px" Width="20px" alt="<< hide menu" />
                    </a></td>
				</tr>
			</table>
		</div>
		<div id="Maximum" style="DISPLAY:inline">
			<table width="1%" border="0" cellspacing="0" cellpadding="0" bgcolor="#F5F5F5" height="100%">
				<tr>
					<td height="1" align="middle"><a href="javascript:fmax();"> 
                    <asp:Image runat="server" id="BtnMaxNavigasi" ImageUrl="images/butkanan.gif" Height="20px" Width="20px" alt="show menu &gt;&gt;" />
					</a></td>
				</tr>
				<tr bgcolor="#F5F5F5">
					<td bgcolor="#F5F5F5">&nbsp;</td>
				</tr>
			</table>
		</div>
		<div id="MenuTree" style="DISPLAY:none">
			<iframe name="NavigasiFrame" border="0" scrolling="auto" frameborder="0" width="100%" height="100%" FRAMESPACING="1" TOPMARGIN="0" LEFTMARGIN="0" MARGINHEIGHT="0" MARGINWIDTH="0" src="menu_old.aspx">
		    <div></div>
	<body></body>
<html></HTML></IFRAME></DIV> 
		</form>
</BODY></HTML>