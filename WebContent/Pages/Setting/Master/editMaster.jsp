<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>SMILE - Smart Leasing And Consumer Finance System</title>

</head>

<body>

	<%@include file="/Pages/Menu.jsp"%>
	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Pages/Header.jsp"%>
		<s:form action="master_save.action" theme="simple">
			<center>
				<div class="col-md-4"></div>
				<div class="col-md-4">

					<h2>Master</h2>
					<input type="text" name="mode" id="mode"
						style="visibility: hidden;"></input>
					<s:hidden name="id" />
					<div align="left" class="form-group">
						<label>Master Type</label>
						<div align="left" class="form-inline">
							<s:textfield name="mastertypecode" style="width:95%"
								placeholder="Master Type Code" class="form-control" />
						</div>
					</div>

					<div align="left" class="form-group">
						<label>Master Code</label>
						<div align="left" class="form-inline">
							<s:textfield name="mastercode" style="width:95%"
								placeholder="Master Code" class="form-control" />
						</div>
					</div>

					<div align="left" class="form-group">
						<label>Master Value</label>
						<div align="left" class="form-inline">
							<s:textfield name="mastervalue" style="width:95%"
								placeholder="Master Value" class="form-control" />
						</div>
					</div>

					<br>
					<table width="100%">
						<tr>
							<td><a href="master.action"><button
										class="btn btn-sm btn-default" type="button">BACK</button></a></td>
							<td align="right"><s:if test="mode=='edit'">
									<button class="btn btn-sm btn-primary" type="submit"
										onclick="saveedit()">SAVE</button>
								</s:if> <s:else>
									<button class="btn btn-sm btn-primary" type="submit"
										onclick="saveadd()">SAVE</button>
								</s:else></td>
						</tr>
					</table>
				</div>
			</center>
		</s:form>
	</div>

</body>
<script type="text/javascript">
	function saveedit() {
		document.getElementById("mode").value = "saveedit";
	}
	function saveadd() {
		document.getElementById("mode").value = "saveadd";
	}
</script>
</html>