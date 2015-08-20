<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>DMS-Dealer Management System</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Bootstrap CSS and bootstrap datepicker CSS used for styling the demo pages-->
<link rel="stylesheet" href="/Smile/Pages/style/css/datepicker.css">
<link rel="stylesheet" href="/Smile/Pages/style/css/bootstrap.css">
<link rel="stylesheet" href="/Smile/Pages/style/css/alert.css">
<script src="/Smile/Pages/style/js/jquery-1.9.1.min.js"></script>
<script src="/Smile/Pages/style/js/bootstrap-datepicker.js"></script>
</head>
<body>
	<td width="20%">Value Date</td>
	<td width="30%">
		<div class="input-append date">
			<s:textfield name="valuedate" class="span2" />
			<span class="add-on"><i class="icon-th"><img
					src="Pages/style/calendar.png" /></i></span>
		</div>

	</td>
</body>
<script type="text/javascript">
	// When the document is ready
	$(document).ready(function() {
		$('.date').datepicker({
			format : "dd/mm/yyyy"
		});
	});
</script>
</html>