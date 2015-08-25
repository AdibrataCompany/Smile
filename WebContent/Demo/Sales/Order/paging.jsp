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

<title>SMIILE - Smart Lesing And Consumer Finance Leasing</title>
</head>

<body>
	<%@include file="/Demo/Menu.jsp"%>
	<div class="container">
	
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Demo/Header.jsp"%>
		<h1>Penjualan</h1>
		<table align="left" width="95%" align="center">
			<tr>
				<td width="25%"><select>
						<option value="">Search By</option>
						<option value="">Customer Name</option>
						<option value="">Customer Address</option>
				</select></td>
				<td><input name="" />
					<button class="btn btn-sm btn-primary" type="submit" onclick="search()"
						class="btn btn-sm btn-primary">Search</button></td>
			</tr>
		</table>
		<div class="table-container" align="center">
			<center>
				<table border="1" width="95%" align="left">
					<tr>
						<th>Customer Name</th>
						<th>Customer Address</th>
						<th>Phone Number</th>
						<th align="center"><a href="entry.jsp"
							class="btn btn-sm btn-primary">Select</a></th>
					</tr>

					<tr>
						<td>xxxx50xxxx</td>
						<td>xxxx1000xxxx</td>
						<td>(xxx)-xxxxxxxxx</td>
						<td align="center"><input type="radio" checked /></td>
					</tr>
					<tr>
						<td>xxxx50xxxx</td>
						<td>xxxx1000xxxx</td>
						<td>(xxx)-xxxxxxxxx</td>
						<td align="center"><input type="radio"/></td>
					</tr>
					<tr>
						<td>xxxx50xxxx</td>
						<td>xxxx1000xxxx</td>
						<td>(xxx)-xxxxxxxxx</td>
						<td align="center"><input type="radio"/></td>
					</tr>
				</table>
		</div>
		<!-- 	</div> -->
	</div>
	</center>
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
