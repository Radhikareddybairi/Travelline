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
		<h1> Ticket</h1>
		<form:form action="saveTicket" method="post" modelAttribute="ticket">
			<table border="1" bordercolor="dimgray">
				<form:hidden path="ticketId" />
				
				<tr>
					<td>PNR NO:</td>

					<td><form:input path="pnrNo" /></td>
				</tr>
					<tr>
					<td>Passenger Names:</td>

					<td><form:input path="passenger.passengerName" /></td>
				</tr>


				<tr>
					<td>JourneyDate:</td>

					<td><form:input path="journeyDate" />
				</tr>
				<tr>
					<td>NumberOfSeats:</td>
					<td><form:input path="numberOfSeats" /></td>
				</tr>
				<tr>
					<td>BookedDate:</td>
					<td><form:input path="bookedOn" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>
	<%@include file="footer.jsp" %>
</body>
</html>
