<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="passengerHeader.jsp" %>
	<div align="center">
		<h1>Feedback Form</h1>
		<form:form action="saveFeedback" method="post" modelAttribute="feedback">
			<table border="1" bordercolor="dimgray">
				<form:hidden path="feedbackId" />
				
				<tr>
					<td>Passenger Name</td>

					<td><form:input path="passengerName" /></td>
				</tr>


				<tr>
					<td>MailId:</td>

					<td><form:input path="emailId" />
				</tr>
				<tr>
					<td>Comment:</td>
					<td><form:input path="comments" /></td>
				</tr>
				
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="submit"></td>
				</tr>
			</table>
		</form:form>
	</div>
	<%@include file="footer.jsp" %>
</body>
</html>
