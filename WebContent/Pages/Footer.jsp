<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<table>
			<tr>
				<td align="center" width="100%">Copyright 2015 PT Adibrata
					Optima Solusi</td>
			</tr>
		</table>
	</center>
	<div class="body-block">
		<div class="image-loading">
			<img src="images/circle-loading-animation.gif" alt="loading images" />
		</div>
	</div>
</body>


<!-- <script type="text/javascript" language="javascript" src="<%=request.getContextPath()%>/Pages/style/js/angular.min.js"></script> -->

<link rel="stylesheet" href="<%=request.getContextPath()%>/Pages/style/css/bootstrap.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/Pages/style/css/alert.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/Pages/style/css/bootstrap.min.css"
	type="text/css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/Pages/style/css/bootstrap-theme.min.css" type="text/css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/Pages/style/css/jquery.smartmenus.bootstrap.css"
	type="text/css" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/Pages/style/css/datepicker.css">

<script type="text/javascript" language="javascript"
	src="<%=request.getContextPath()%>/Pages/style/js/jquery.smartmenus.min.js"></script>
<script type="text/javascript" language="javascript"
	src="<%=request.getContextPath()%>/Pages/style/js/jquery.min.js"></script>
<script type="text/javascript" language="javascript"
	src="<%=request.getContextPath()%>/Pages/style/js/bootstrap.min.js"></script>
<script type="text/javascript" language="javascript"
	src="<%=request.getContextPath()%>/Pages/style/js/jquery.smartmenus.bootstrap.min.js"></script>
<!-- <script type="text/javascript" language="javascript" src="<%=request.getContextPath()%>/Pages/style/js/ie10-viewport-bug-workaround.js"></script> -->
<script type="text/javascript" language="javascript"
	src="<%=request.getContextPath()%>/Pages/style/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" language="javascript"
	src="<%=request.getContextPath()%>/Pages/style/js/bootstrap-datepicker.js"></script>

<script type="text/javascript">
	function end() {

		document.getElementById("mode").value = "end";

	}
	function save(param) {

		document.getElementById("mode").value = param;
	}
	function search() {
		document.getElementById("mode").value = "search";
	}
	function first() {
		document.getElementById("mode").value = "first";
	}
	function prev() {
		document.getElementById("mode").value = "prev";
	}
	function next() {
		document.getElementById("mode").value = "next";
	}
	function last() {
		document.getElementById("mode").value = "last";
	}

	function lookup() {
		document.getElementById("mode").value = "lookup";
	}
	function savetrans() {
		alert("save");
		document.getElementById("mode").value = "save";
	}
	function adddetail() {
		document.getElementById("mode").value = "adddetail";
	}
	function deldetail() {
		document.getElementById("mode").value = "deldetail";
	}
</script>
<script type="text/javascript">
	// When the document is ready
	$(document).ready(function() {
		$('.date').datepicker({
			format : "dd/mm/yyyy"
		});
	});
</script>

<style>
/*body-block style*/
.body-block {
	position: fixed;
	top: 0px;
	left: 0px;
	width: 100%;
	height: 100%;
	background: rgba(0, 0, 0, 0.8);
	z-index: 9999;
	display: none; /*hide the block*/
}

.image-loading {
	margin: auto;
	text-align: center;
	margin-top: 20%;
}
</style>
</html>