<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<button class="btn btn-sm btn-success" type="submit" onclick="add()">
		<span class="glyphicon glyphicon-plus-sign"></span><br>Add
	</button>
	<button class="btn btn-sm btn-warning" type="submit" onclick="edit()">
		<span class="glyphicon glyphicon-edit"></span><br>Edit
	</button>
	<button class="btn btn-sm btn-danger" type="submit" onclick="savedel()">
		<span class="glyphicon glyphicon-remove-sign"></span><br>Delete
	</button>
	<!-- <table width="95%">
		<tr>
			<td align="right"></td>
			<td align="right">
			
			</td>
			<td align="right"></td>
		</tr>
	</table> -->
</body>

<script type="text/javascript">
	function add() {
		document.getElementById("mode").value = "add";

	}
	function edit() {
		document.getElementById("mode").value = "edit";

	}
	function savedel() {
		document.getElementById("mode").value = "savedel";
	}
</script>

</html>