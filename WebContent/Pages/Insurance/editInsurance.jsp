<%@page import="org.apache.struts2.components.Include"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SMILE - Smart Lesing And Consumer Finance Lesing</title>
</head>
<body>

	<%@include file="/Pages/Menu.jsp"%>
	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Pages/Header.jsp"%>
		<s:form action="inscoyregsave.action" theme="simple">
			<center>
				<div class="col-md-2"></div>
				<div class="col-md-8">
					<h2>Office</h2>
					<input type="text" name="mode" id="mode"
						style="visibility: hidden;"></input>
					<s:hidden name="id" />
					<br>
					<div align="left" class="form-group">
						<label>Name</label>
						<div align="left" class="form-inline">
							<s:textfield name="name" style="width:75%" class="form-control" />
						</div>
					</div>
					<%@include file="/Pages/Include/Address.jsp"%>
					<div align="left" class="form-group">
						<label>Handphone</label>
						<div align="left" class="form-inline">
							<s:textfield name="handphone" style="width:150px"
								class="form-control" />
						</div>
					</div>
					<div align="left" class="form-group">
						<label>Office Type</label>
						<div align="left" class="form-inline">
							<s:textfield name="type" style="width:100px" class="form-control" />

						</div>
					</div>
					<br>
					<table width="100%">
						<tr>
							<td><a href="inscoyreg.action"><button
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
	function Search() {
		document.getElementById("mode").value = "search";
	}
	function Save(param) {
		document.getElementById("mode").value = param;
	}
</script>
</html>