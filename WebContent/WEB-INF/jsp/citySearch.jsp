<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Registration Form</title>
</head>
<body>

	<!-- HEADER -->
	<jsp:include page="header.jsp"></jsp:include>
	<!-- BODY -->
	
	
	<div class="container">
	<!-- Search Area -->
	<div class="panel panel-info">
		<div class="panel-heading"><h3 class="panel-title">Search By City Id</h3></div>
		<div class="panel-body">
			<form:form modelAttribute="city" method="post" class="form-inline">
				<div class="form-group">
					<label for="cityId">City ID:</label>
					<form:input class="form-control" id="cityId" path="iD" />
				</div>
				<form:button type="submit" value="Search" name="Search" class="btn btn-success">SEARCH</form:button>
			</form:form>
		</div>		
	</div>

	<!-- City Display -->
	<c:if test="${not empty ct}">
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
	</c:if>
	</div>
	
	<!-- FOOTER -->
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>