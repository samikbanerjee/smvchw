<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Person Page</title>
</head>
<body>
	<!-- Header -->
	<jsp:include page="header.jsp"></jsp:include>
	
	<!-- Body -->
	<div class="container" style="text-align: center">
	${city.iD}
	${city.population}
	${city.name}
	${city.countryCode}
	${city.district}
	</div>
	
	<!-- Footer -->
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>