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
<s:form theme="simple">
	<center>
		<table width="100%" height="700px" border=0 style="text-align: center;" bgcolor="white" >
			<tr height="20%">
				<td>
					<s:label name="nama" />
				</td>
			</tr>
			<tr align="center">
				<td>
					<table style="text-align: center;"  border=0 width="100%">
						<tr>
							<td>
								<s:label name="alamat" />
							</td>
						</tr>
						<tr>
							<td>
								<s:label name="kota" />
							</td>
						</tr>
						<tr>
							<td>
								<table style="text-align: center;"  border=0 width="100%" bgcolor="white">
									<tr>
										<td>
											<img src="style/style/images/<s:property value="logo"/>" width="200px" height="100px"/>
										</td>
										<td align="center">
											<table border=0 width="60px" >
												<tr>
													<td width="20%">
														Username
													</td>
													<td>
														<input type="text"/>
													</td>
													<td width="20%">
														<button>Ganti Logo</button>
													</td>
												</tr>
												<tr>
													<td>
														Password
													</td>
													<td>
														<input type="text"/>
													</td>
													<td>
														<button>Ganti Password</button>
													</td>
												</tr>
												<tr>
													<td>
													</td>
													<td>
														<button>OK</button>
													</td>
													<td>
													</td>
												</tr>
											</table>
										</td>
										<td>
											<img src="style/style/images/<s:property value="logo"/>" width="200px" height="100px"/>
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr height="20%">
				<td>
					<table width="100%" border=0 bgcolor="white" height="140px">
						<tr>
							<td colspan="3">
								<img src="style/style/images/adiralogo.jpg"/>
							</td>
						</tr>
						<tr>
							<td width="20%">
								.
							</td>
							<td>
								Copyright @AdiraFinance
							</td>
							<td  width="20%">
								Dealer Sepeda Motor Bekas
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</center>
</s:form>
</body>
</html>