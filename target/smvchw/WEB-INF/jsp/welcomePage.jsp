<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>

<head>
	<title>Welcome Page</title>
</head>

<body>
	<!-- Header -->
	<jsp:include page="header.jsp"></jsp:include>
	
	<!-- Body -->
	<div class="container" style="text-align: center">
		<ul class="list-group">
			<c:forEach items="${msgList}"  var="msg" >
				<li class="list-group-item">${msg}</li>
			</c:forEach>
		</ul>
	</div>
	
	<div class="container" style="text-align: center">
	${city}
	</div>
	<!-- Footer -->
	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>