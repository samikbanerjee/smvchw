<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
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
	
		
		<div class="panel panel-info">
			<div class="panel-body">
				<form:form method="post" action="test">
					<div class="form-group">
						<label for="textInput">TEXT INPUT:</label>
						<input class="form-control" id="textInput" name="textInput" type="text"/>
					</div>
					<input type="submit" class="btn btn-success" value="SUBMIT"/>
				</form:form>
			</div>
		</div>
		
		<c:if test="${not empty val}">
			<div><h3>${val}</h3></div>
		</c:if>
		
		
	</div>
	<!-- Footer -->
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>