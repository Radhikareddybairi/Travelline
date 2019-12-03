<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Feedback Details</title>
</head>
<body>

    <div align="center">
       
        <h3>Feedback Details</h3>
        <table border="1" bordercolor="dimgray">
          
          
            <th width="120">PassengerName</th>
     
            <th width="120">MailId</th>
            <th width="120">Comment</th>
            
            
            <c:forEach var="feedback" items="${listFeedback}">
                <tr>
                    
                    <td>${feedback.passengerName}</td>
                    <td>${feedback.emailId}</td>
                    <td>${feedback.comments}</td>
                 
       
                </tr>
               
            </c:forEach>
        </table>
        <!-- <h1><a href="addFeedback">Give your valuable feedback</a></h1> -->
    </div>
    <%@include file="footer.jsp" %>
</body>
</html>
