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

	
	<c:if test="${not empty city}">
		<div class="container">
		${city.iD} ; ${city.population}; ${city.name}; ${city.countryCode}; ${city.district}
		</div>
	</c:if>
	
	<div class="container">
	<c:forEach items="${cities}" var="ct">
		<div class="panel panel-success">
			<div class="panel-heading">
				<h3 class="panel-title">${ct.name}</h3>
			</div>
			<div class="panel-body">
				<div> <strong>Id: </strong> ${ct.iD} </div>
				<div> <strong>Population: </strong> ${ct.population} </div>
				<div> <strong>Country (code): </strong> ${ct.countryCode} </div>
				<div> <strong>District: </strong> ${ct.district} </div>
			</div>
		</div>
		<br>
		</c:forEach>
	</div>
	
	<!-- Footer -->
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>