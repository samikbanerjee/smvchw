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
		<img alt="Halloween" src="${imagesource}" width="1024" height="768"/>
	</div>
	

	<!-- Footer -->
	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>