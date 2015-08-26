<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
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

		<s:form action="perscust.action" theme="simple">
			<center>
				<h2>Personal Customer - New</h2>
				<s:hidden name="mode" id="mode" />
				<s:hidden name="id" />
				<s:label name="message" id="message" />

				<s:hidden name="personalcustomertype" />
				<s:hidden name="customerid" />
				<s:hidden name="name" />
				<s:hidden name="birthplace" />
				<s:hidden name="birthdate" />
				<s:hidden name="idtype" />
				<s:hidden name="idnumber" />
				<s:hidden name="personalnpwp" />
				<s:hidden name="legalname" />
				<s:hidden name="biologicalmothersname" />
				<s:hidden name="gender" />
				<table width="100%" border="0" class="table-hover table-responsive">
					<tr>
						<th colspan="4">PERSONAL COMPANY DATA</th>
					</tr>
					<tr>
						<td width="20%">Full Name</td>
						<td width="30%"><s:label name="name" /></td>
						<td width="20%">Legal Name</td>
						<td width="30%"><s:label name="legalname"
								placeholder="Legal Name" /></td>
					</tr>
					<tr>
						<td>Birth Place/Date</td>
						<td><s:label name="birthplace" /> / <s:label
								name="birthdate" /></td>
						<td>Gender</td>
						<td><s:label name="gender" /></td>
					</tr>
					<tr>
						<td>Biological Mothers Name</td>
						<td colspan=3><s:label name="biologicalmothersname" /></td>
					</tr>

					<tr>
						<td>ID Type</td>
						<td><s:label name="idtype" /></td>
						<td>ID Number</td>
						<td><s:label name="idnumber" /></td>
					</tr>
					<tr>
						<td>Expired Date</td>
						<td>
							<div align="left" class="form-inline">
								<s:textfield style="width:100px" class="form-control"
									placeholder="Expired Date" name="idexpdate" id="idexpdate" />
							</div>
						</td>
						<td>Personal NPWP</td>
						<td><s:label name="personalnpwp" /></td>
					</tr>
					<tr>
						<td>Education</td>
						<td><s:select name="education" headerKey=""
								headerValue="Select One"
								list="#{'SMA':'SMA','D3':'D3','S1':'S1'}" /></td>
						<td>Profession</td>
						<td><s:select name="professionid" headerKey=""
								headerValue="Select One" list="#{'xxx':'xxx'}" /></td>
					</tr>
					<tr>
						<td>Mobile Phone</td>
						<td colspan=3><s:textfield style="width:150px"
								class="form-control" name="mobilephone"
								placeholder="Mobile Phone" /></td>
					</tr>

					<tr>
					<tr>
						<td>Home Status</td>
						<td colspan=3><s:select name="homestatus" headerKey=""
								headerValue="Select One" list="#{'xxx':'xxx'}" /></td>
					</tr>
					<tr>
						<td>E-Mail</td>
						<td><s:textfield style="width:250px" class="form-control"
								name="email" placeholder="E-mail" /></td>
						<td>Rent Finish Date</td>
						<td><s:textfield style="width:100px" class="form-control"
								name="rentfinishdate" id ="rentfinishdate" placeholder="Rent Finish Date" /></td>
					</tr>
					<tr>
						<td>Religion</td>
						<td><s:select name="religion" headerKey=""
								headerValue="Select One"
								list="#{'Protestan':'Protestan','Katolik':'Katolik','Islam':'Islam','Hindu':'Hindu','Budha':'Budha','Others':'Others'}" /></td>
						<td>Home Location</td>
						<td><s:select name="homelocation" headerKey=""
								headerValue="Select One" list="#{'xxx':'xxx'}" /></td>
					</tr>
					<tr>
						<td>Marital status</td>
						<td><s:select name="maritalstatus" headerKey=""
								headerValue="Select One"
								list="#{'Single':'Single','Married':'Married'}" /></td>
						<td>Home Price</td>
						<td><s:textfield style="width:100px" class="form-control"
								name="homeprice" placeholder="Home Price" /></td>
					</tr>
					<tr>
						<td>Dependent Number</td>
						<td><s:textfield style="width:95%" class="form-control"
								name="numofdependence" placeholder="Dependent Number" /></td>
						<td>Stay Since</td>
						<td>
							<div align="left" class="form-inline">
								<s:select name="staysincemonth" headerKey=""
									headerValue="Select One"
									list="#{'1':'January','2':'February','3':'March','4':'April','5':'May','6':'June','7':'July','8':'August','9':'September','10':'October','11':'Novemver','12':'December'}" />
								-
								<s:textfield style="width:95%" class="form-control"
									name="staysinceyear" placeholder="YEAR" />
							</div>
						</td>
					</tr>
					<tr>
						<td>Number of Own Cars</td>
						<td><s:textfield style="width:100px" class="form-control"
								name="numofassetowned" placeholder="Own Car" /></td>
					</tr>
					<tr>
						<td>KK No.</td>
						<td><s:textfield style="width:95%" class="form-control"
								name="nokk" placeholder="KK Number" /></td>
					</tr>
				</table>
				<%@include file="/Pages/Customer/PersCust/AddressData.jsp"%>
				<br>
				<table width="100%" border="0" class="table-hover table-responsive">
					<tr>
						<th colspan="4">OTHER DATA</th>
					</tr>
					<tr>
						<td width="20%">Reference</td>
						<td width="30%"><s:select name="reference" headerKey=""
								headerValue="Select One" list="#{'Other':'Other'}" /></td>
						<td width="20%">Did He/She Have Another Loan</td>
						<td width="30%"><s:radio name="isapplycarloanbefore"
								list="#{'1':'Yes','0':'No'}" /></td>
					</tr>
					<tr>
						<td>Active Customer?</td>
						<td><s:radio name="activecustomer"
								list="#{'Active':'Active','Hold':'Hold'}" /></td>
						<td>Other Finance Company Name</td>
						<td><s:textfield style="width:95%" class="form-control"
								name="applycarloancompanyname"
								placeholder="Other Finance Company Name" /></td>
					</tr>
					<tr>
						<td>Notes</td>
						<td colspan="3"><s:textfield style="width:95%"
								class="form-control" name="notes" placeholder="Notes" /></td>
					</tr>
				</table>
				<br>
				<table width="100%">
					<tr>
						<td><a href="customer.action"><button type="button">CANCEL</button></a></td>
						<td align="right"><button type="submit" onclick="savetrans()">SAVE</button></td>
					</tr>
				</table>
			</center>
		</s:form>
	</div>
	<%@include file="/Pages/Footer.jsp"%>
</body>
<script type="text/javascript">
	$(document).ready(function() {
		$('#idexpdate').datepicker({
			format : "dd/mm/yyyy"
		});
	});
	$(document).ready(function() {
		$('#rentfinishdate').datepicker({
			format : "dd/mm/yyyy"
		});
	});
	
	
</script>
</html>