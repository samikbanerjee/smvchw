<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
	<div align="center">
		<h2>Registration Form</h2>
		<form:form action="register" modelAttribute="personForm" method="post">
			<table>
			<tr><td>First Name:</td><td><form:input path="fName"/></td></tr>
			<tr><td>Last Name:</td><td><form:input path="lName"/></td></tr>
			<tr><td align="center"><input type="submit" value="Register"></td></tr>
			</table>
		</form:form>
	</div>
	<!-- FOOTER -->
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>