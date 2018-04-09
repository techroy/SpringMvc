<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>
	<center>
		<h2>
			<font color="red">Student Enrollment</font>
		</h2>
	</center>
	<hr color="blue">

	<form:form action="stdenroll.htm" method="post"
		commandName="studentcommand">

		<table>

			<tr>
				<td>Enter Name</td>
				<td><form:input type="text" path="name" /><font color="red"><form:errors path="name"/></font></td>
			</tr>

			<tr>
				<td>Enter Qualification</td>
				<td><form:select path="qualification" items="${qualifications}" /><font color="red"><form:errors path="qualification"/></font></td>
			</tr>


			<tr>
				<td>Enter Gender</td>
				<td><form:radiobutton path="gender" value="male" />Male<form:radiobutton
						path="gender" value="female" />Female<font color="red"><form:errors path="qualification"/></font></td>
			</tr>

			<tr>
				<td>Enter Address</td>
				<td><form:input type="text" path="address" /><font color="red"><form:errors path="address"/></font></td>
			</tr>

			<tr>
				<td>Enter CourseName</td>
				<td><form:input type="text" path="courseName" /><font color="red"><form:errors path="courseName"/></font></td>
			</tr>

			<tr>
				<td>Enter Duration</td>
				<td><form:input type="text" path="duration" /><font color="red"><form:errors path="duration"/></font></td>
			</tr>

			<tr>
				<td colspan="2"><input type="Submit" value="Enroll" /></td>
			</tr>

		</table>

	</form:form>


</body>
</html>
