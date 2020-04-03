<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Employee List</h1>
		<h3>
			<a href=" ">Back to Home page</a>
		</h3>
		<table border="1">

			<th>Id</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Designation</th>
			<th>ProfessionalOverview</th>
			<th>PrimaryRoles</th>
			<th>PrimaryTechnologies</th>
			<th>OtherTechnologies</th>
			<th>KeyIndustries</th>
			
			<th>Education</th>
			<th>Publications</th>
			

			<c:forEach var="employee" items="${listEmployee}">
				<tr>
					<td>${employee.id}</td>
					<td>${employee.firstName}</td>
					<td>${employee.lastName}</td>
					<td>${employee.designation}</td>
					<td>${employee.professionalOverview}</td>
					<td>${employee.primaryRoles}</td>
					<td>${employee.primaryTechnologies}</td>
					<td>${employee.otherTechnologies}</td>
					<td>${employee.keyIndustries}</td>
					
					<td>${employee.education}</td>
					
					<td>${employee.publications}</td>
					



				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>