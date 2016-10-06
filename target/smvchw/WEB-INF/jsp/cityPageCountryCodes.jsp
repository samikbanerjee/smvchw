<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>City Page</title>
</head>
<body>
	<!-- Header -->
	<jsp:include page="header.jsp"></jsp:include>
	
	<!-- Body -->

	<div class="container">
	<c:forEach items="${countryCodes}" var="countryCode">
		<div class="panel panel-success">
			<div class="panel-heading">
				<h3 class="panel-title"><a href="?countryCode=${countryCode}">${countryCode}</a></h3>
			</div>
			<div class="panel-body">
				<div> Panel Body </div>
			</div>
		</div>
		<br>
		</c:forEach>
	</div>
	
	<!-- Footer -->
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>