<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>SMIILE - Smart Lesing And Consumer Finance Leasing</title>

<link href="../../style/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="../../style/css/bootstrap-theme.min.css" rel="stylesheet"  type="text/css" />
<link href="../../style/css/jquery.smartmenus.bootstrap.css" rel="stylesheet" type="text/css" />
<!-- Bootstrap core JavaScript
    ================================================== -->
	<script type="text/javascript" language="javascript" src="../../style/js/bootstrap.min.js"></script>
<!-- /container -->
	<script type="text/javascript" language="javascript" src="../../style/js/jquery.min.js"></script>
	<script type="text/javascript" language="javascript" src="../../style/js/bootstrap.min.js"></script>
	<script type="text/javascript" language="javascript" src="../../style/js/jquery.min.js"></script>
	<script type="text/javascript" language="javascript" src="../../style/js/jquery.smartmenus.min.js"></script>
	<script type="text/javascript" language="javascript" src="../../style/js/jquery.smartmenus.bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script type="text/javascript">
	function save(){
		document.getElementById("mode").value="save";
	}
	function back(){
		document.getElementById("mode").value="back";
	}
</script>
</head>

<body>
<!-- Fixed navbar -->
	<nav class="navbar navbar-default navbar-fixed-top">

	<div class="container">
		<div class="navbar-header">
			<button class="btn btn-sm btn-primary" type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<!-- <a class="navbar-brand">DMS</a> -->
		</div>

		<div id="navbar" class="navbar-collapse collapse">

			<%@include file="../../Menu.jsp"%>
		</div>
		<!--/.nav-collapse -->
	</div>
	</nav>

	<div class="container">

		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="../../Header.jsp"%>

	<s:form action="bankAccount.action" theme="simple">
		<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
		<center>
			<table>
				<tr>
					<td>
						Office ID
					</td>
					<td>
						<s:textfield name="officeId"/>
					</td>
				</tr>
				<tr>
					<td>
						Bank Account Code
					</td>
					<td>
						<s:textfield name="bankAccountCode"/>
					</td>
				</tr>
				<tr>
					<td>
						Bank Account Name
					</td>
					<td>
						<s:textfield name="bankAccountName"/>
					</td>
				</tr>
				<tr>
					<td>
						Ending Balance
					</td>
					<td>
						<s:textfield name="endingBalance"/>
					</td>
				</tr>
				<tr>
					<td>
						COA Code
					</td>
					<td>
						<s:textfield name="coacode"/>
					</td>
				</tr>
				<tr>
					<td>
						Seq No.
					</td>
					<td>
						<s:textfield name="seqNo"/>
					</td>
				</tr>
				<tr>
					<td>
						Reset Flag
					</td>
					<td>
						<s:textfield name="resetFlag"/>
					</td>
				</tr>
				<tr>
					<td>
						Format Seq No.
					</td>
					<td>
						<s:textfield name="formatSeqNo"/>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<br>
						<button class="btn btn-sm btn-primary" type="submit" onclick="save()">Save</button>
						<button class="btn btn-sm btn-primary" type="submit" onclick="back()">Back</button>
					</td>
				</tr>
			</table>
		</center>
	</s:form>
</body>
</html>