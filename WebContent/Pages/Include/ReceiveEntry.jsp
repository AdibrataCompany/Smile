<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<button class="btn btn-sm btn-success" type="submit" onclick="paymentreceive()">
		<span class="glyphicon glyphicon-plus-sign"></span><br>Customer Payment
	</button>
	<button class="btn btn-sm btn-success" type="submit" onclick="suspendreceive()">
		<span class="glyphicon glyphicon-plus-sign"></span><br>Unknows Receive
	</button>
	
	<button class="btn btn-sm btn-success" type="submit" onclick="otherreceive()">
		<span class="glyphicon glyphicon-plus-sign"></span><br>Other Receive
	</button>
</body>

<script type="text/javascript">
	function paymentreceive() {
		document.getElementById("mode").value = "paymentreceive";

	}
	function suspendreceive() {

		document.getElementById("mode").value = "suspendreceive";

	}
	function otherreceive() {
		document.getElementById("mode").value = "otherreceive";
	}
</script>

</html>