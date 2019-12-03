<%@ page language="java" import="com.virtusa.travelline.model.Service" contentType="text/html; charset=ISO-8859-1"  isELIgnored="false"
	pageEncoding="ISO-8859-1"  %>
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
		<h1>Payment</h1>
		<form:form action="savePayment" method="post" modelAttribute="payment">
			<table border="1" bordercolor="dimgray">
				<form:hidden path="paymentId" />
				
				<tr>
					<td>Card Holder Name:</td>

					<td><form:input path="carddetails.holderName" /></td>
				</tr>
					<tr>
					<td>Card Number:</td>

					<td><form:input path="carddetails.cardNo" /></td>
				</tr>


				<tr>
					<td>CVV:</td>

					<td><form:input path="carddetails.cvv" />
				</tr>
				<%Service sevice =(Service)session.getAttribute("service1") ;
				int fare=sevice.getFare();
				int noofpassenger=(int)session.getAttribute("noOfPassengers");
				int totalfare=fare * noofpassenger;
		
				
				%>
				
				<tr>
					<td>Total Fare Amount:</td>
					<td><input type="text" value="<% out.println(totalfare); %>" name="totalFare"></td>
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
