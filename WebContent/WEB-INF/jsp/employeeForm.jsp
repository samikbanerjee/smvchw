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
		<c:if test="${userAction == 'update'}"><h2>Update employee Details</h2></c:if>
		<c:if test="${userAction == 'add'}"><h2>Create a new employee</h2></c:if>
					
			<spring:url value="/employees" var="actionUrl"/>
			<form:form modelAttribute="empl" action="${actionUrl}" method="POST" class="form-horizontal">
			
				<div class="form-group">
					<label for="emplID" class="col-sm-2 control-label">Employee ID</label>
					<div class="col-sm-10">
							<label id="emplID" class="form-control">${empl.ID}</label>
							<form:hidden path="ID"/>				 
					</div>
				</div>
			
				<div class="form-group">
					<label for="emplNm" class="col-sm-2 control-label">Employee Name:</label>
					<div class="col-sm-10">
					<form:input path="employeeName" id="emplNm" class="form-control"/>
					</div>
				</div>
				
				<div class="form-group">
					<label for="emplDoj" class="col-sm-2 control-label">Date Of Joining:</label>
					<div class="col-sm-10">
					<form:input path="doj" id="emplDoj" class="form-control"/>
					</div>
				</div>
				
				<div class="form-group">
					<label for="emplRole"  class="col-sm-2 control-label">Role:</label>
					<div class="col-sm-10">
					<form:input path="role" id="emplRole" class="form-control"/>
					</div>
				</div>
				
				<div class="form-group">
					<label for="emplDesg" class="col-sm-2 control-label">Designation: </label>
					<div class="col-sm-10">
					<form:input path="designation" id="emplDesg" class="form-control"/>
					</div>
				</div>
				
				<div class="form-group">
					<label for="emplLoc" class="col-sm-2 control-label">Location: </label>
					<div class="col-sm-10">
					<form:input path="location" id="emplLoc" class="form-control"/>
					</div>
				</div>
				
				<div class="form-group">
					<label for="emplPrj" class="col-sm-2 control-label">Project: </label>
					<div class="col-sm-10">
					<form:input path="project" id="emplPrj" class="form-control"/>
					</div>
				</div>
				
				<div class="form-group">
					<label for="emplPragExp" class="col-sm-2 control-label">Experience in Pragiti (Yrs):</label>
					<div class="col-sm-10">
					<form:input path="pragitiExperience" id="emplPragExp" class="form-control"/>
					</div>
				</div>
				
				
				<div class="form-group">
					<label for="emplPrevExp" class="col-sm-2 control-label">Previous Experience (Yrs): </label>
					<div class="col-sm-10">
					<form:input path="previousExperience" id="emplPrevExp" class="form-control"/>
					</div>
				</div>
				
				<div class="form-group">
					<label for="emplAvailableDt" class="col-sm-2 control-label">Available Date:</label>
					<div class="col-sm-10">
					<form:input path="availableDate" id="emplAvailableDt" class="form-control"/>
					</div>
				</div>
				
				<div class="form-group">
					<label for="emplNewPrj" class="col-sm-2 control-label">Next Planned Project: </label>
					<div class="col-sm-10">
					<form:input path="newProject" id="emplNewPrj" class="form-control"/>
					</div>
				</div>
				
				<div class="form-group">
					<label for="emplNewPrjStartDt" class="col-sm-2 control-label">New Project Start Date: </label>
					<div class="col-sm-10">
					<form:input path="newProjectStartDate" id="emplNewPrjStartDt" class="form-control"/>
					</div>
				</div>
				
				<div class="form-group">
					<label for="emplVisaStatus" class="col-sm-2 control-label">Visa Status: </label>
					<div class="col-sm-10">
					<form:input path="visaStatus" id="emplVisaStatus" class="form-control"/>
					</div>
				</div>
			
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<c:if test="${userAction == 'update'}"> <button type="submit" class="btn-lg btn-primary pull-right">UPDATE</button> </c:if>
						<c:if test="${userAction == 'add'}"> <button type="submit" class="btn-lg btn-primary pull-right">ADD</button> </c:if>
						
					</div>
				</div>
			
			</form:form>
	</div>
	
	<!-- Footer -->	
	<jsp:include page="footer.jsp"></jsp:include>
	</body>
</html>