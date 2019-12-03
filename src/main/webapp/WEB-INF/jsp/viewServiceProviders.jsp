<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<%@include file="adminHeader.jsp" %>
    <div align="center">
       
      
        <table border="1" bordercolor="dimgray" >
        
           <th>ServiceProviderId</th>
            <th>ServiceProviderName</th>
            <th>MailId</th>
            <th>username</th>
            <th>password</th>
            <th>accountStatus</th>
               
 
            <c:forEach var="ServiceProvider" items="${viewAllServiceProviders}">
                <tr>
                   <td>${ServiceProvider.serviceProviderId}</td>
                    <td>${ServiceProvider.serviceProviderName}</td>
                    <td>${ServiceProvider.mailId}</td>
                    <td>${ServiceProvider.username}</td>
                    <td>${ServiceProvider.username}</td>
                    <td>${ServiceProvider.accountStatus}</td>
                   
 
                </tr>
            </c:forEach>
        </table>
    </div>
    <%@include file="footer.jsp" %>
</body>
</html>