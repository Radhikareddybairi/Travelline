<%@ page language="java" import="com.virtusa.travelline.model.Service"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<%@include file="passengerHeader.jsp" %>
<form:form action="savePassenger" modelAttribute="accountholder" method="post">

<table border="1">

<% int noofpassenger=(int)session.getAttribute("noOfPassengers");

%>

<tr>
<th>name</th>

<th>age</th>
<th>gender</th>
<th>idproof</th>

 </tr>
 <br>

      <%
                  for(int i = 0; i< noofpassenger;i++)
                  { %> 
            
		
			<tr>
			<td><form:input path="passenger[0].passengerName"></form:input></td>
			 <td><form:input path="passenger[0].passengerAge" /></td>
			<td><form:input path="passenger[0].passengerGender" /></td>
			<td><form:input path="passenger[0].proofIdNumber"/></td>
			</tr>
			<%} %>

            
            
         
</table>
<input type="submit" value="continue"/>

</form:form>
<%@include file="footer.jsp" %>
</body>
</html>