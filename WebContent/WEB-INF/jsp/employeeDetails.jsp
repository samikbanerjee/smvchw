<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
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
		<c:if test="${not empty msg}">
			<div class="alert alert-warning alert-dismissible" role="alert">
			  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			  <strong>${msg}</strong> 
			</div>
		</c:if>
		<h2>Employee Details</h2>
			<br/>
			
				<div class="row">
					<label class="col-sm-2">Employee ID: </label>
					<div class="col-sm-10">${empl.ID}</div>
				</div>
				
				<div class="row">
					<label class="col-sm-2">Employee Name: </label>
					<div class="col-sm-10">${empl.employeeName}</div>
				</div>
				
				<div class="row">
					<label class="col-sm-2">Date Of Joining: </label>
					<div class="col-sm-10">${empl.doj}</div>
				</div>
				
				<div class="row">
					<label class="col-sm-2">Role: </label>
					<div class="col-sm-10">${empl.role}</div>
				</div>
				
				<div class="row">
					<label class="col-sm-2">Designation: </label>
					<div class="col-sm-10">${empl.designation}</div>
				</div>
				
				<div class="row">
					<label class="col-sm-2">Location: </label>
					<div class="col-sm-10">${empl.location}</div>
				</div>
				
				<div class="row">
					<label class="col-sm-2">Project: </label>
					<div class="col-sm-10">${empl.project}</div>
				</div>
				
				<div class="row">
					<label class="col-sm-2">Experience in Pragiti (Yrs): </label>
					<div class="col-sm-10">${empl.pragitiExperience}</div>
				</div>
					
				<div class="row">
					<label class="col-sm-2">Previous Experience (Yrs): </label>
					<div class="col-sm-10">${empl.previousExperience}</div>
				</div>
				
				<div class="row">
					<label class="col-sm-2">Available Date: </label>
					<div class="col-sm-10">${empl.availableDate}</div>
				</div>

				<div class="row">
					<label class="col-sm-2">Next Planned Project: </label>
					<div class="col-sm-10">${empl.newProject}</div>
				</div>


				<div class="row">
					<label class="col-sm-2">New Project Start Date: </label>
					<div class="col-sm-10">${empl.newProjectStartDate}</div>
				</div>

				<div class="row">
					<label class="col-sm-2">Visa Status: </label>
					<div class="col-sm-10">${empl.visaStatus}</div>
				</div>
				
				<br/>
				
				<div class="row">
				<spring:url value="/employees" var="actionUrl"/>
				<spring:url value="/employees/${empl.ID}/update" var="emplUpdUrl"></spring:url>
					<div class="col-sm-3"><a href="${emplUpdUrl}">Edit Employee Details</a></div>
					<div class="col-sm-3"><a href="${actionUrl}">Back To Employee List</a></div>
				</div>

	</div>
	
	<!-- Footer -->	
	<jsp:include page="footer.jsp"></jsp:include>
	</body>
</html>