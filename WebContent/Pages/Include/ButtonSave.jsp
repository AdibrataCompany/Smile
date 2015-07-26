<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table width="100%">
		<tr>
			<td>
				<button class="btn btn-sm btn-primary" type="submit" onclick="end()">Back</button>
			</td>
			<td align="right">
				<button class="btn btn-sm btn-primary" type="submit"
					onclick="save()">Save</button>
			</td>
		</tr>
	</table>
</body>
<script type="text/javascript">
	function save() {
		document.getElementById("mode").value = "save";
	}
	function end() {
		document.getElementById("mode").value = "end";
	}
</script>
</html>