<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SMILE - Smart Lesing And Consumer Finance Leasing</title>
</head>
<body>

	<%@include file="/Pages/Menu.jsp"%>
	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Pages/Header.jsp"%>
		<s:form action="journalscheme_save.action" theme="css_xhtml">
			<center>
				<div class="col-md-4"></div>
				<div class="col-md-4">

					<h2>Journal Scheme</h2>
					<s:hidden name="mode" id="mode" />
					<s:hidden name="id" />
					<s:label name="message" id="message" />


					<table class="table table-striped table-hover">
						<tr>
							<td>COA Scheme Code</td>
							<td><s:textfield name="coaschmcode" /></td>
						</tr>
						<tr>
							<td>COA Scheme Description</td>
							<td><s:textfield name="coaschmdesc" /></td>
						</tr>
						<tr>
							<td>Active</td>
							<td><s:checkbox name="isactive" /></td>
						</tr>
					</table>
					<br>
					<table class="table table-bordered table table-striped table-hover">
						<tr>
							<th style="text-align: center;">Coa Name</th>
							<th style="text-align: center;">Description</th>
							<th style="text-align: center;">Coa Code</th>
						</tr>
						<s:iterator value="lstcoaschmdtl" id="lstcoaschmdtl" status="ctr">
							<tr id="row_${coamasterid}">
								<td>${coaname}<s:hidden name="lstcoaschmdtl[%{#ctr.index}].coaname"/>
								<s:hidden name="lstcoaschmdtl[%{#ctr.index}].coamasterid"/>
								</td>
								<td>${coadesc}<s:hidden name="lstcoaschmdtl[%{#ctr.index}].coadesc"/> </td>
								<td><s:textfield
										name="lstcoaschmdtl[%{#ctr.index}].coacode" id="coacode" /></td>
							</tr>
						</s:iterator>
						
					</table>
					<table width="100%">
						<tr>
							<td><button class="btn btn-sm btn-default" type="submit"
									onclick="end()">BACK</button></td>
							<td align="right">
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="save()">SAVE</button>
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
	function end() {
		document.getElementById("mode").value = "end";
	}
	function save() {
		document.getElementById("mode").value = "save";
	}
</script>
</html>