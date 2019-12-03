<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="adminHeader.jsp" %>
<div align="center">
        <h1 style color="blue">Station Information</h1>
         
		  <table border="1" bordercolor="dimgray" >
 
            <th width="120">StationId</th>
            <th width="120">StationName</th>
           
		<th width="60">Delete</th>
		  <c:forEach var="station" items="${station}">
                <tr>
                    <td>${station.stationId}</td>
                    <td>${station.stationName}</td>
                  
                      <td><a href="deleteStation?stationId=${station.stationId}" style="color: #cc0000">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
           <h3>
            <a href="newStation">Add Station</a>
        </h3>
        
       
    </div>
    <%@include file="footer.jsp" %>
</body>
</html>