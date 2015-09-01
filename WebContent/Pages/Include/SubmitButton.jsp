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
			<td><button class="btn btn-sm btn-default" type="submit"
					onclick="end()" formnovalidate>BACK</button></td>
			<td align="right"><s:if test="mode=='edit'">
					<button class="btn btn-sm btn-primary" type="submit"
						onclick="save('saveedit')">SAVE</button>
				</s:if> <s:else>
					<button class="btn btn-sm btn-primary" type="submit"
						onclick="save('saveadd')">SAVE</button>
				</s:else></td>
		</tr>
	</table>
</body>
</html>