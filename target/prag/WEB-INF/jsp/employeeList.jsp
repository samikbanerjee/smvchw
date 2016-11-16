<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Employee</title>
</head>
	<body>
	<!-- Header -->
	<jsp:include page="header.jsp"></jsp:include>

	<!-- Body -->
	<div class="container">
		<c:forEach items="${employees}" var="employee">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title pull-left">${employee.employeeName}</div>
					<div class="panel-title pull-right">
					<spring:url value="/employees/${employee.ID}" var="emplUrl"/>
					<spring:url value="/employees/${employee.ID}/update" var="emplUpdUrl"/>
							  <a href="${emplUpdUrl}" title="Edit"><span class="glyphicon glyphicon-pencil"></span></a>
							  <a href="#" title="Delete"><span class="glyphicon glyphicon-remove"></span></a>
							  <a href="${emplUrl}" title="Details"><span class="glyphicon glyphicon-user"></span></a>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="panel-body">
					<div>Date of Joining : ${employee.doj}</div>
					<div>Designation: ${employee.designation}</div>
				</div>
			</div>
		</c:forEach>
	</div>
	
	<!-- Footer -->	
	<jsp:include page="footer.jsp"></jsp:include>
	</body>
</html>