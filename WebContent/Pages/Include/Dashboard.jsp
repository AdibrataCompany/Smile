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
		<s:form action="dashboard.action" theme="simple">
	
			<center>
				<table border=1 width="100%" height="200px">
					<tr>
						<td width="50%" height="50%"><iframe
								src="http://www.kompas.com"
								style="border: 0; top: 0; left: 0; right: 0; bottom: 0; width: 100%; height: 100%"></iframe></td>
						<td width="50%" height="200px"><iframe
								src="http://www.detik.com"
								style="border: 0; top: 0; left: 0; right: 0; bottom: 0; width: 100%; height: 100%"></iframe>
						</td>
					</tr>

				</table>

			</center>
		</s:form>
	</div>
	<%@include file="/Pages/Footer.jsp"%>
</body>

<script type="text/javascript">
	$(function() {

		//setup these vars only once since they are static
		var $myIFRAME = $(".iframe-class"), //unless this collection of elements changes over time, you only need to select them once
		ogWidth = 700, ogHeight = 600, ogRatio = ogWidth / ogHeight, windowWidth = 0, //store windowWidth here, this is just a different way to store this data
		resizeTimer = null;

		function setIFrameSize() {
			if (windowWidth < 480) {

				var parentDivWidth = $myIFRAME.parent().width(), //be aware this will still only get the height of the first element in this set of elements, you'll have to loop over them if you want to support more than one iframe on a page
				newHeight = (parentDivWidth / ogRatio);

				$myIFRAME.addClass("iframe-class-resize").css({
					height : newHeight,
					width : parentDivWidth
				});
			} else {
				$myIFRAME.removeClass("iframe-class-resize").css({
					width : '',
					height : ''
				});
			}
		}

		$(window).resize(function() {

			//only run this once per resize event, if a user drags the window to a different size, this will wait until they finish, then run the resize function
			//this way you don't blow up someone's browser with your resize function running hundreds of times a second
			clearTimeout(resizeTimer);
			resizeTimer = setTimeout(function() {
				//make sure to update windowWidth before calling resize function
				windowWidth = $(window).width();

				setIFrameSize();

			}, 75);

		}).trigger("click");//run this once initially, just a different way to initialize
	});
</script>

</html>