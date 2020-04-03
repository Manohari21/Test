<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>
	<div align="center">
		<h1>Add Employee Profile</h1>
		<form:form action="saveEmployee" method="post" modelAttribute="employee">
			<table>
				<form:hidden path="empid" />
				
				<tr>
					<td>FirstName:</td>
					<td><form:input path="firstName" /></td>
				</tr>
				<tr>
					<td>LastName:</td>
					<td><form:input path="lastName" /></td>
				</tr>
				<tr>
					<td>Designation:</td>
					<td><form:input path="designation" /></td>
				</tr>
				<tr>
					<td>ProfessionalOverview:</td>
					<td><form:input path="professionalOverview" /></td>
				</tr>
				<tr>
					<td>PrimaryRoles:</td>
					<td><form:input path="primaryRoles" /></td>
				</tr>
				<tr>
					<td>PrimaryTechnologies:</td>
					<td><form:input path="primaryTechnologies" /></td>
				</tr>
				<tr>
					<td>OtherTechnologies:</td>
					<td><form:input path="otherTechnologies" /></td>
				</tr>
				<tr>
					<td>KeyIndustries:</td>
					<td><form:input path="keyIndustries" /></td>
				</tr>
				
				<tr>
					<td>Education:</td>
					<td><form:input path="education" /></td>
				</tr>
				
				<tr>
					<td>Publications:</td>
					<td><form:input path="publications" /></td>
				</tr>
				

				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>
