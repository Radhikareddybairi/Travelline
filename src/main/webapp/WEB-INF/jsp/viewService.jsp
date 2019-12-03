<%@ page language="java" import="java.util.*,com.virtusa.travelline.model.Service" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="passengerHeader.jsp" %>
<form action="seatSelectPage" method="post">

<table class="table table-responsive" border="1" bordercolor="dimgray">
     
         <tr>
        
            <th>ServiceNo</th>
            
             <th>Type</th>
             <th>Fare</th>
             <th>DepartureTime</th>
               <th>Action</th>
            
         </tr>
         
         
  <%List<Service> service=(ArrayList)request.getAttribute("services");
  
 for(int i=0; i<service.size();i++) { 
    
  //<c:forEach var="service" items="${service}">
   //<tr>
   //<td><input type="radio"></td>
 //<%
 //Service service=service;
        session.setAttribute("service1",service.get(i));
       out.print("<tr>");
        out.print("<td>"+service.get(i).getServiceNumber()+"</td>");
        out.print("<td>"+service.get(i).getType().getTypeName()+"</td>");
        out.print("<td>"+service.get(i).getFare()+"</td>");
        out.print("<td>"+service.get(i).getJourneyStartTime()+"</td>");
        out.print("<td><button>viewSeats</button></td>");
        out.print("</tr>");
       
           
 }
  %>
   

      
    
       
         
       
         
</table>
</form>
<%@include file="footer.jsp" %>


</body>
</html>