<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>
				<button class="btn btn-sm btn-primary" type="submit"
					onclick="first()">
					<span class="glyphicon glyphicon-fast-backward"></span>
				</button>
				<button class="btn btn-sm btn-primary" type="submit"
					onclick="prev()">
					<span class="glyphicon glyphicon-backward"></span>
				</button> <s:textfield style="text-align: center;" name="pageNumber" size="4" />
				<button class="btn btn-sm btn-primary" type="submit"
					onclick="next()">
					<span class="glyphicon glyphicon-forward"></span>
				</button>
				<button class="btn btn-sm btn-primary" type="submit"
					onclick="last()">
					<span class="glyphicon glyphicon-fast-forward"></span>
				</button>
			</td>
		</tr>
		<tr>
			<td align="center">
				<button class="btn btn-sm btn-primary" type="submit"
					onclick="search()">GO</button>
			</td>
		</tr>
	</table>
</body>
<script type="text/javascript">
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
</script>
</html>