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
		<%@include file="/Pages/Header.jsp"%>
		<s:form action="inscoyregsave.action" theme="simple">
			<h2>Insurance Company Master</h2>
			<s:hidden name="mode" id="mode" value="" />
			<s:label name="massage" id="massage" />
			<s:hidden name="id"/>
			<div class="table-responsive">
				<table width="30%">
					<tr>
						<td>
							<div align="left" class="form-group">
								<label>Code</label>
								<div align="left" class="form-inline">
									<s:textfield name="documentcode" style="width:95%"
										placeholder="Asset Document Code" class="form-control" />
								</div>
							</div>
							<div align="left" class="form-group">
								<label>Name </label>
								<div align="left" class="form-inline">
									<s:textfield name="documentname" style="width:95%"
										placeholder="Asset Document Name" class="form-control" />
								</div>
							</div>

							<div align="left" class="form-group">
								<label>Asset Type </label>
								<div align="left" class="form-inline">
									<s:select name="assettype" style="width:95%" headerKey=""
										headerValue="Select One" list="#{'Others':'Others'}"
										class="form-control" />
								</div>
							</div> <br>
							<table width="100%">
								<tr>
									<td><a href="assetdoc.action"><button
												class="btn btn-sm btn-default" type="button">BACK</button></a></td>
									<td align="right">
									<s:if test="mode=='edit'">
											<button class="btn btn-sm btn-primary" type="submit"
												onclick="save('saveedit')">SAVE</button>
										</s:if> <s:else>
											<button class="btn btn-sm btn-primary" type="submit"
												onclick="save('saveadd')">SAVE</button>
										</s:else></td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</div>
			<%@include file="/Pages/Paging.jsp"%>

		</s:form>
		<%@include file="/Pages/Footer.jsp"%>
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