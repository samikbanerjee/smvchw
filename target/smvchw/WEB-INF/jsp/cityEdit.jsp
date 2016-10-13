<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Search City</title>
</head>
<body>

	<!-- HEADER -->
	<jsp:include page="header.jsp"></jsp:include>
	<!-- BODY -->
	
	
	<div class="container">

	<!-- City Edit Section -->
	<form:form modelAttribute="city" action="editcity" method="post">
	<div class="panel panel-success">
		<div class="panel-heading">
			<div class="panel-title pull-left">City ID: ${city.iD}</div>
			<div class="clearfix"></div>
		</div>
		<div class="panel-body">
							<form:hidden path="iD"/>
							<div> <strong>Name: </strong> <form:input path="name"/></div>
							<div> <strong>Population: </strong> <form:input path="population"/></div>
							<div> <strong>Country (code): </strong> <form:input path="countryCode"/></div>
							<div> <strong>District: </strong> <form:input path="district"/></div>
							<form:button type="submit" value="Update" name="Update" class="btn btn-success">UPDATE</form:button>
		</div>
	</div>
	</form:form>
	<c:if test="${not empty message}">
	<h3>${message}</h3>
	</c:if>
	</div>
	
	<!-- FOOTER -->
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>