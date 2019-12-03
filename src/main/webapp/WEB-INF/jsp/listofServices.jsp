<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<%@include file="serviceProviderHeader.jsp" %>
 <div align="center">

        <table border="1" bordercolor="dimgray">
            
             <th>ServiceNo</th>
             <th>From</th>
             <th>To</th>
             <th>Fare</th>
             <th>Distance</th>
             <th>JourneyDuration</th>
             <th>JourneyStratTime</th>
           
             <th>BusType</th>
            
            
       
      
  <c:forEach var="service"  items="${service}">
   <tr>
  <%--  <td>${service.serviceId}</td> --%>
   
   <td>${service.serviceNumber}</td>
       <td>${service.srFrom}</td>
       <td>${service.srTo}
          <td>${service.fare}</td>
         <td>${service.distance}</td>
          <td>${service.journeyDuration}</td>
          <td>${service.journeyStartTime}</td>
          
         <td>${service.type.typeName}</td> 
            </tr>
         </c:forEach>
       
         
       
         
</table>
</div>
<a href="newService">add new service</a>



<%@include file="footer.jsp" %>

</body>
</html>