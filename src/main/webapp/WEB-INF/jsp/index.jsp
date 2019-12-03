<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Booked Ticket Details</title>
</head>
<body>
    <div align="center">
        <h1>Booked Ticket Information</h1>
        <form method="get" ,action="search">
        <input type="text" name="keyword">
        <input type="submit" value="search">
        </form>
        <h3>
            <a href="addTicket">Add Ticket</a>
        </h3>
        <table border="1">
 
            <th width="120">TicketId</th>
            <th width="120">PassengerName</th>
            <th width="120">PNR NO</th>
            <th width="120">JourneyDate</th>
            <th width="120">NummberOfSeats</th>
            <th width="120">BookedDate</th>
            <th width="60">Edit</th>
		<th width="60">Delete</th>
            
            <c:forEach var="ticket" items="${listTicket}">
                <tr>
                    <td>${ticket.ticketId}</td>
                    <td>${ticket.passengerName}</td>
                    <td>${ticket.pnrNo}</td>
                    <td>${ticket.journeyDate}</td>
                    <td>${ticket.numberOfSeats}</td>
                    <td>${ticket.bookedOn}</td>
                      <td><a href="editTicket?ticketId=${ticket.ticketId}">Edit</a></td>
                      <td><a href="deleteTicket?ticketId=${ticket.ticketId}">Delete</a></td>
                      
                   <!-- <td><a href="<c:url value='/editTicket/${ticket.ticketId}' />" >Edit</a></td>
			<td><a href="<c:url value='/deleteTicket/${ticket.ticketId}' />" >Delete</a></td>-->
 
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
