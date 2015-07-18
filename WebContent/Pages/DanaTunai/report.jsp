<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="">

<title>DMS-Dealer Management System</title>
</head>

<body>
	<%@include file="/Demo/Menu.jsp"%>
	<div class="container">
	<center>
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Demo/Header.jsp"%>
		<h1>Laporan Dana Tunai</h1>
		<table width="50%" class="table table-striped table-bordered table-hover">
			<tr>
				<td width="30%" align="center">
					<select>
						<option value="">hh/bb/tttt
					</select>
				</td>
				<td align="center">
					To
				</td>
				<td width="30%" align="center">
					<select>
						<option value="">hh/bb/tttt
					</select>
				</td>
			</tr>
		</table>
		<br>
		<table width="50%">
			<tr>
				<td>
					<button class="btn btn-sm btn-primary" type="submit">Keluar</button>
				</td>
				<td align="right">
					<button class="btn btn-sm btn-primary" type="submit">Print</button>
				</td>
			</tr>
		</table>
	</center>
	</div>
	
	<!-- /container -->
</body>


<!-- Bootstrap core JavaScript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<!-- 	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script> -->
<script src="style/js/jquery.min.js"></script>
<script src="style/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="js/ie10-viewport-bug-workaround.js"></script>
</html>
