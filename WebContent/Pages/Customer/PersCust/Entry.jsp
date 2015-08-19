<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>DMS-Dealer Management System</title>

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
				<h2>Personal Customer - Add</h2>
				<input type="text" name="mode" id="mode" style="visibility: hidden;" />
				<br>
				<s:label name="message" />
				<br>
				<s:textfield name="customerid" />
				<s:hidden name="personalcustomertype" />
				<table width="100%" border="1">
					<tr>
						<th colspan="4">PERSONAL DATA</th>
					</tr>
					<tr>
						<td width="20%">Full Name</td>
						<td width="30%"><s:textfield name="name" /></td>
						<td width="20%">Legal Name</td>
						<td width="30%"><s:label name="legalname"
								placeholder="Legal Name" /></td>
					</tr>
					<tr>
						<td>ID Type</td>
						<td><s:textfield name="idtype" /></td>
						<td>Education</td>
						<td><s:select name="education" headerKey=""
								headerValue="Select One"
								list="#{'SMA':'SMA','D3':'D3','S1':'S1'}" /></td>
					</tr>
					<tr>
						<td>ID Number</td>
						<td><s:textfield name="idnumber" /></td>
						<td>Profession</td>
						<td><s:select name="professionid" headerKey=""
								headerValue="Select One" list="#{'xxx':'xxx'}" /></td>
					</tr>
					<tr>
						<td>Expired Date</td>
						<td><s:textfield name="idexpdate" /></td>
						<td>Nationality</td>
						<td><s:select name="nationality"
								list="#{'WNI':'WNI','WNA':'WNA'}" />
					</tr>
					<tr>
						<td>Gender</td>
						<td><s:textfield name="gender" /></td>
						<td>WNA Country</td>
						<td><s:textfield name="wnacountry" placeholder="Country" /></td>
					</tr>
					<tr>
						<td>Birth Place/Date</td>
						<td><s:textfield name="birthplace" /> / <s:textfield
								name="birthdate" /></td>
						<td>Group</td>
						<td><s:textfield name="" placeholder="Group" /></td>
					</tr>
					<tr>
						<td>Mobile Phone</td>
						<td><s:textfield name="mobilephone"
								placeholder="Mobile Phone" /></td>
						<td>Home Status</td>
						<td><s:select name="homestatus" headerKey=""
								headerValue="Select One" list="#{'xxx':'xxx'}" /></td>
					</tr>
					<tr>
						<td>E-Mail</td>
						<td><s:textfield name="email" placeholder="E-mail" /></td>
						<td>Rent Finish Date</td>
						<td><s:textfield name="rentfinishdate"
								placeholder="Rent Finish Date" /></td>
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
						<td><s:textfield name="homeprice" placeholder="Home Price" /></td>
					</tr>
					<tr>
						<td>Dependent Number</td>
						<td><s:textfield name="numofdependence"
								placeholder="Dependent Number" /></td>
						<td>Stay Since</td>
						<td><s:select name="staysincemonth" headerKey=""
								headerValue="Select One"
								list="#{'1':'January','2':'February','3':'March','4':'April','5':'May','6':'June','7':'July','8':'August','9':'September','10':'October','11':'Novemver','12':'December'}" />
							- <s:textfield name="staysinceyear" placeholder="YEAR" /></td>
					</tr>
					<tr>
						<td>Personal NPWP</td>
						<td><s:textfield name="personalnpwp" /></td>
						<td>Number of Own Cars</td>
						<td><s:textfield name="numofassetowned"
								placeholder="Number of Own Car" /></td>
					</tr>
					<tr>
						<td>Mother Maiden Name</td>
						<td><s:textfield name="biologicalmothersname" /></td>
						<td>KK No.</td>
						<td><s:textfield name="nokk" placeholder="KK Number" /></td>
					</tr>
					<tr>
						<td>Costumer Group</td>
						<td><s:select name="customergroup" headerKey=""
								headerValue="Select One"
								list="#{'Group':'Group','Non Group':'Non-Group'}" /></td>
					</tr>
				</table>
				<br>
				<table width="100%" border="1">
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
						<td><s:textfield name="applycarloancompanyname"
								placeholder="Other Finance Company Name" /></td>
					</tr>
					<tr>
						<td>Notes</td>
						<td colspan="3"><s:textfield name="notes" placeholder="Notes" /></td>
					</tr>
				</table>
				<br>
				<table width="100%">
					<tr>
						<td><a href="customer.action"><button type="button">CANCEL</button></a></td>
						<td align="right"><button type="submit" onclick="save()">SAVE</button></td>
					</tr>
				</table>
			</center>
		</s:form>
	</div>
</body>
<script type="text/javascript">
	function save() {
		document.getElementById("mode").value = "save";
	}
</script>
</html>