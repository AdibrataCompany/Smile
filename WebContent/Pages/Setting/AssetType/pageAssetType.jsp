<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
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

		<s:form action="assettype.action" theme="simple">
			<center>
				<h2>Asset Type Master</h2>
				<s:hidden name="mode" id="mode" />
				<s:label name="message" id="message" />
				<br>
				<div class="table-responsive">
					<div class="col-lg-6">
						<div class="input-group">
							<span class="input-group-addon"> <s:select
									name="searchcriteria" class="btn btn-xs" headerKey=""
									headerValue="Search Criteria"
									list="#{'coaSchmCode':'COA Scheme Code','coaSchmDesc':'COA Scheme Description'}" />


							</span> <input type="text" class="form-control" placeholder="Pencarian"
								name="searchvalue"> <span class="input-group-btn">
								<button class="btn btn-default" type="submit" onclick="search()">
									<span class="glyphicon glyphicon-search"></span>
								</button>
							</span>
						</div>
						<!-- /input-group -->
					</div>
					<div class="col-lg-6" align="right">
						<%@include file="/Pages/EntryMaster.jsp"%>



						<button class="btn btn-sm btn-default" type="submit"
							onclick="assetattribute()">
							<span class="glyphicon glyphicon-barcode"></span><br>Attribute
						</button>
						<button class="btn btn-sm btn-default" type="submit"
							onclick="assetcategory()">
							<span class="glyphicon glyphicon-certificate"></span><br>Category
						</button>
						<button class="btn btn-sm btn-default" type="submit"
							onclick="assetdocument()">
							<span class="glyphicon glyphicon-cloud"></span><br>Document
						</button>
						<button class="btn btn-sm btn-default" type="submit"
							onclick="assetmaster()">
							<span class="glyphicon glyphicon-fullscreen"></span><br>Asset
							Master
						</button>
					</div>
				</div>
				<br>
				<div class="table-responsive">
					<table class="table table-bordered">
						<tr>
							<th style="text-align: center;">Code</th>
							<th style="text-align: center;">Description</th>

							<th style="text-align: center;" width="5%">Pilih</th>

						</tr>
						<s:iterator value="lstassettype">
							<tr id="row_${id}">
								<td>${assetTypeCode}</td>
								<td>${description}</td>

								<td colspan="2" style="text-align: center;"><input
									type="radio" name="id" value="${id}" /></td>
							</tr>
						</s:iterator>
					</table>
				</div>
				<%@include file="/Pages/Paging.jsp"%>

			</center>
		</s:form>
		<%@include file="/Pages/Footer.jsp"%>
	</div>

</body>

<script type="text/javascript">
	function assetattribute() {
		document.getElementById("mode").value = "assetattribute";
	}
	function assetcategory() {
		document.getElementById("mode").value = "assetcategory";
	}
	function assetdocument() {
		document.getElementById("mode").value = "assetdocument";
	}
	function assetmaster() {
		document.getElementById("mode").value = "assetmaster";
	}
</script>
</html>