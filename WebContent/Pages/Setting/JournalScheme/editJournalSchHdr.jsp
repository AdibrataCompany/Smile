<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>SMIILE - Smart Lesing And Consumer Finance Leasing</title>

</head>

<body>

	<%@include file="/Pages/Menu.jsp"%>
	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Pages/Header.jsp"%>
		<s:form action="journalscheme.action" theme="simple">
			<center>
				<div class="col-md-4"></div>
				<div class="col-md-4">

					<h2>Journal Scheme</h2>
					<s:hidden name="mode" id="mode" value="" />
					<s:hidden name="id" />
					<s:label name="message" id="message" />
					<s:hidden name="id" />
					<table class="table table-striped">
						<tr>
							<td>COA Scheme Code</td>
							<td><s:textfield name="coaSchmCode" /></td>
						</tr>
						<tr>
							<td>COA Scheme Description</td>
							<td><s:textfield name="coaSchmDesc" /></td>
						</tr>
						<tr>
							<td>Active</td>
							<td><s:textfield name="isActive" /></td>
						</tr>
					</table>
					<br>
					<table width="100%">
						<tr>
							<td>
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="end()">Kembali</button>
							</td>
							<td align="right">
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="saveedit()">Simpan</button>
							</td>
						</tr>
					</table>
				</div>
			</center>
		</s:form>
	</div>
	<%@include file="/Pages/Footer.jsp"%>
</body>
<script type="text/javascript">
	function saveedit() {
		document.getElementById("mode").value = "saveedit";
	}
	function end() {
		document.getElementById("mode").value = "end";
	}
</script>
</html>