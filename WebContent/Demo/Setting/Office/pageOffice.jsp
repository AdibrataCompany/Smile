<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>SMIILE - Smart Lesing And Consumer Finance Leasing</title>

<link href="../../style/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="../../style/css/bootstrap-theme.min.css" rel="stylesheet"  type="text/css" />
<link href="../../style/css/jquery.smartmenus.bootstrap.css" rel="stylesheet" type="text/css" />
<!-- Bootstrap core JavaScript
    ================================================== -->
	<script type="text/javascript" language="javascript" src="../../style/js/bootstrap.min.js"></script>
<!-- /container -->
	<script type="text/javascript" language="javascript" src="../../style/js/jquery.min.js"></script>
	<script type="text/javascript" language="javascript" src="../../style/js/bootstrap.min.js"></script>
	<script type="text/javascript" language="javascript" src="../../style/js/jquery.min.js"></script>
	<script type="text/javascript" language="javascript" src="../../style/js/jquery.smartmenus.min.js"></script>
	<script type="text/javascript" language="javascript" src="../../style/js/jquery.smartmenus.bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script type="text/javascript">
	function cari(){
		document.getElementById("mode").value="cari";
	}
	function edit(){
		document.getElementById("mode").value="edit";
	}
	function del(){
		document.getElementById("mode").value="del";
	}
	function add(){
		document.getElementById("mode").value="add";
	}
</script>
</head>

<body>
<!-- Fixed navbar -->
	<nav class="navbar navbar-default navbar-fixed-top">

	<div class="container">
		<div class="navbar-header">
			<button class="btn btn-sm btn-primary" type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<!-- <a class="navbar-brand">DMS</a> -->
		</div>

		<div id="navbar" class="navbar-collapse collapse">

			<%@include file="../../Menu.jsp"%>
		</div>
		<!--/.nav-collapse -->
	</div>
	</nav>

	<div class="container">

		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="../../Header.jsp"%>
	<s:form action="office.action" theme="simple">
		<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
		<center>
			<table>
				<tr>
					<td>
						Search By
					</td>
					<td>
						<select>
							<option value="">Parameter</option>
							<option value="officeCode">Office Code</option>
							<option value="name">Name</option>
							<option value="address">Address</option>
							<option value="rt">RT</option>
							<option value="rw">RW</option>
							<option value="kelurahan">Kelurahan</option>
							<option value="city">City</option>
							<option value="zipcode">Zip Code</option>
							<option value="type">Type</option>
							<option value="areaPhone1">Phone1 Area</option>
							<option value="phoneNo1">Phone1 No.</option>
							<option value="areaPhone2">Phone2 Area</option>
							<option value="phoneNo2">Phone2 No.</option>
							<option value="areaFax">Fax Area</option>
							<option value="faxNo">Fax No.</option>
							<option value="handphone">Handphone</option>
							<option value="fullAddress">Full Address</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>
						Search Criteria
					</td>
					<td>
						<input name="criteria"/>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<button class="btn btn-sm btn-primary" type="submit" onclick="cari()">Search</button>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<br>
						<table border="1">
							<tr>
								<th>Office Code</th>
								<th>Name</th>
								<th>Address</th>
								<th>RT</th>
								<th>RW</th>
								<th>Kelurahan</th>
								<th>City</th>
								<th>Zip Code</th>
								<th>Type.</th>
								<th>Phone1 Area</th>
								<th>Phone1 No.</th>
								<th>Phone2 Area</th>
								<th>Phone2 No.</th>
								<th>Fax Area</th>
								<th>Fax No.</th>
								<th>Handphone</th>
								<th>Full Address</th>
								<th><button class="btn btn-sm btn-primary" type="submit" onclick="edit()">Edit</button></th>
								<th><button class="btn btn-sm btn-primary" type="submit" onclick="del()">del</button></th>
							</tr>
						<s:iterator value="">
							<tr id="row_<s:property value="id"/>">
								<td>
									<s:property value="officeCode"/>
								</td>
								<td>
									<s:property value="name"/>
								</td>
								<td>
									<s:property value="address"/>
								</td>
								<td>
									<s:property value="rt"/>
								</td>
								<td>
									<s:property value="rw"/>
								</td>
								<td>
									<s:property value="kelurahan"/>
								</td>
								<td>
									<s:property value="city"/>
								</td>
								<td>
									<s:property value="zipcode"/>
								</td>
								<td>
									<s:property value="type"/>
								</td>
								<td>
									<s:property value="areaPhone1"/>
								</td>
								<td>
									<s:property value="phoneNo1"/>
								</td>
								<td>
									<s:property value="areaPhone2"/>
								</td>
								<td>
									<s:property value="phoneNo2"/>
								</td>
								<td>
									<s:property value="areaFax"/>
								</td>
								<td>
									<s:property value="faxNo"/>
								</td>
								<td>
									<s:property value="handphone"/>
								</td>
								<td>
									<s:property value="fullAddress"/>
								</td>
								<td>
									<input type="radio" id="<s:property value="id"/>" checked/>
								</td>
							</tr>
						</s:iterator>
						</table>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<button class="btn btn-sm btn-primary" type="submit" onclick="add()">Add</button>
					</td>
				</tr>
			</table>
		</center>
	</s:form>
	</div>
</body>
</html>