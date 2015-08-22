<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="left" class="form-group">
		<label>Address</label>
		<s:textfield name="address"   class="form-control" placeholder="Address" />

	</div>
	<div align="left" class="form-inline">
		<label>RT/RW</label>
		<div align="left" class="form-inline">
				<s:textfield name="rt" style="width:50px"  class="form-control" placeholder="RT" />
			/	<s:textfield name="rw" style="width:50px"  class="form-control" placeholder="RW" />
		</div>
	</div>
	<div align="left" class="form-group">
		<label>Kelurahan</label> <s:textfield name="kelurahan" style="width:95%"  class="form-control" placeholder="Kelurahan" />
	</div>

	<div align="left" class="form-group">
		<label>Kecamatan</label>  <s:textfield name="kecamatan" style="width:95%"  class="form-control" placeholder="Kecamatan" /> 
	</div>

	<div align="left" class="form-group">
		<label>City</label>  <s:textfield name="city" style="width:95%"  class="form-control" placeholder="City" /> 
	</div>
	<div align="left" class="form-group">
		<label>Zip Code</label> <s:textfield name="zipcode" style="width:95%"  class="form-control" placeholder="Zip Code" />  
	</div>
	<div align="left" class="form-group">
		<label>Phone 1</label>
		<div align="left" class="form-inline">
			(<s:textfield name="areaphone1" style="width:60px"  class="form-control" placeholder="Area" /> ) - <s:textfield name="phoneno1" style="width:100px"  class="form-control" placeholder="Number" />  
		</div>
	</div>

	<div align="left" class="form-group">
		<label>Phone 2</label>
		<div align="left" class="form-inline">
			(<s:textfield name="areaphone2"  style="width:60px"  class="form-control" placeholder="Area" />) - <s:textfield name="phone2" style="width:100px"  class="form-control"  placeholder="Number" />
		</div>
	</div>

	<div align="left" class="form-group">
		<label>Fax</label>
		<div align="left" class="form-inline">
			(<s:textfield name="areafax" style="width:60px"  class="form-control" placeholder="Area" />) - <s:textfield name="faxno" style="width:100px"   class="form-control"  placeholder="Number" /> 
		</div>
	</div>


</body>
</html>